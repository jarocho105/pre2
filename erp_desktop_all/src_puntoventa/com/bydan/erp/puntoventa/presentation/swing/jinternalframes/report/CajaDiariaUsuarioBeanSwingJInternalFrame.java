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

//import com.bydan.erp.puntoventa.util.CajaDiariaUsuarioConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.CajaDiariaUsuarioParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.CajaDiariaUsuarioParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.CajaDiariaUsuarioBean;
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
import com.bydan.erp.cartera.business.logic.*;
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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CajaDiariaUsuarioBeanSwingJInternalFrame extends CajaDiariaUsuarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CajaDiariaUsuarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CajaDiariaUsuario> cajadiariausuarioValidator = new ClassValidator<CajaDiariaUsuario>(CajaDiariaUsuario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CajaDiariaUsuario cajadiariausuario;	
	public CajaDiariaUsuario cajadiariausuarioAux;
	public CajaDiariaUsuario cajadiariausuarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CajaDiariaUsuario cajadiariausuarioTotales;
	public Long idCajaDiariaUsuarioActual;
	public Long iIdNuevoCajaDiariaUsuario=0L;
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
	
	public Boolean isPermisoTodoCajaDiariaUsuario;
	public Boolean isPermisoNuevoCajaDiariaUsuario;
	public Boolean isPermisoActualizarCajaDiariaUsuario;
	public Boolean isPermisoActualizarOriginalCajaDiariaUsuario;
	public Boolean isPermisoEliminarCajaDiariaUsuario;
	public Boolean isPermisoGuardarCambiosCajaDiariaUsuario;
	public Boolean isPermisoConsultaCajaDiariaUsuario;
	public Boolean isPermisoBusquedaCajaDiariaUsuario;
	public Boolean isPermisoReporteCajaDiariaUsuario;
	public Boolean isPermisoPaginacionMedioCajaDiariaUsuario;
	public Boolean isPermisoPaginacionAltoCajaDiariaUsuario;
	public Boolean isPermisoPaginacionTodoCajaDiariaUsuario;
	public Boolean isPermisoCopiarCajaDiariaUsuario;
	public Boolean isPermisoVerFormCajaDiariaUsuario;
	public Boolean isPermisoDuplicarCajaDiariaUsuario;
	public Boolean isPermisoOrdenCajaDiariaUsuario;
	
	
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
	
	public CajaDiariaUsuarioParameterReturnGeneral cajadiariausuarioReturnGeneral;
	public CajaDiariaUsuarioParameterReturnGeneral cajadiariausuarioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCajaDiariaUsuario=false;
	public Boolean esParaAccionDesdeFormularioCajaDiariaUsuario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CajaDiariaUsuarioSessionBeanAdditional cajadiariausuarioSessionBeanAdditional=null;
	
	public CajaDiariaUsuarioSessionBeanAdditional getCajaDiariaUsuarioSessionBeanAdditional() {
		return this.cajadiariausuarioSessionBeanAdditional;
	}
	
	public void setCajaDiariaUsuarioSessionBeanAdditional(CajaDiariaUsuarioSessionBeanAdditional cajadiariausuarioSessionBeanAdditional) {
		try {
			this.cajadiariausuarioSessionBeanAdditional=cajadiariausuarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CajaDiariaUsuarioBeanSwingJInternalFrameAdditional cajadiariausuarioBeanSwingJInternalFrameAdditional=null;
	//public class CajaDiariaUsuarioBeanSwingJInternalFrame
	
	public CajaDiariaUsuarioBeanSwingJInternalFrameAdditional getCajaDiariaUsuarioBeanSwingJInternalFrameAdditional() {
		return this.cajadiariausuarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setCajaDiariaUsuarioBeanSwingJInternalFrameAdditional(CajaDiariaUsuarioBeanSwingJInternalFrameAdditional cajadiariausuarioBeanSwingJInternalFrameAdditional) {
		try {
			this.cajadiariausuarioBeanSwingJInternalFrameAdditional=cajadiariausuarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CajaDiariaUsuarioLogic cajadiariausuarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CajaDiariaUsuario cajadiariausuarioBean;
	public CajaDiariaUsuarioConstantesFunciones cajadiariausuarioConstantesFunciones;
	//public CajaDiariaUsuarioParameterReturnGeneral cajadiariausuarioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public CajaLogic cajaLogic;
	public UsuarioLogic usuarioLogic;
	
	//PARAMETROS
	
	
	//public List<CajaDiariaUsuario> cajadiariausuarios;	
	//public List<CajaDiariaUsuario> cajadiariausuariosEliminados;
	//public List<CajaDiariaUsuario> cajadiariausuariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCajaDiariaUsuario=false;
	public Boolean isVisibilidadCeldaDuplicarCajaDiariaUsuario=true;
	public Boolean isVisibilidadCeldaCopiarCajaDiariaUsuario=true;
	public Boolean isVisibilidadCeldaVerFormCajaDiariaUsuario=true;
	public Boolean isVisibilidadCeldaOrdenCajaDiariaUsuario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=false;
	public Boolean isVisibilidadCeldaModificarCajaDiariaUsuario=false;
	public Boolean isVisibilidadCeldaActualizarCajaDiariaUsuario=false;
	public Boolean isVisibilidadCeldaEliminarCajaDiariaUsuario=false;
	public Boolean isVisibilidadCeldaCancelarCajaDiariaUsuario=false;
	public Boolean isVisibilidadCeldaGuardarCajaDiariaUsuario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=false;	
	
	
	public Boolean isVisibilidadBusquedaCajaDiariaUsuario=false;
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoCajaDiariaUsuario() {
		return this.iIdNuevoCajaDiariaUsuario;
	}

	public void setiIdNuevoCajaDiariaUsuario(Long iIdNuevoCajaDiariaUsuario) {
		this.iIdNuevoCajaDiariaUsuario = iIdNuevoCajaDiariaUsuario;
	}
	
	public Long getidCajaDiariaUsuarioActual() {
		return this.idCajaDiariaUsuarioActual;
	}

	public void setidCajaDiariaUsuarioActual(Long idCajaDiariaUsuarioActual) {
		this.idCajaDiariaUsuarioActual = idCajaDiariaUsuarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CajaDiariaUsuario getcajadiariausuario() {
		return this.cajadiariausuario;
	}

	public void setcajadiariausuario(CajaDiariaUsuario cajadiariausuario) {
		this.cajadiariausuario = cajadiariausuario;
	}
	
	public CajaDiariaUsuario getcajadiariausuarioAux() {
		return this.cajadiariausuarioAux;
	}

	public void setcajadiariausuarioAux(CajaDiariaUsuario cajadiariausuarioAux) {
		this.cajadiariausuarioAux = cajadiariausuarioAux;
	}				
	
	public CajaDiariaUsuario getcajadiariausuarioAnterior() {
		return this.cajadiariausuarioAnterior;
	}

	public void setcajadiariausuarioAnterior(CajaDiariaUsuario cajadiariausuarioAnterior) {
		this.cajadiariausuarioAnterior = cajadiariausuarioAnterior;
	}	
	
	public CajaDiariaUsuario getcajadiariausuarioTotales() {
		return this.cajadiariausuarioTotales;
	}

	public void setcajadiariausuarioTotales(CajaDiariaUsuario cajadiariausuarioTotales) {
		this.cajadiariausuarioTotales = cajadiariausuarioTotales;
	}	
	
	public CajaDiariaUsuario getcajadiariausuarioBean() {
		return this.cajadiariausuarioBean;
	}

	public void setcajadiariausuarioBean(CajaDiariaUsuario cajadiariausuarioBean) {
		this.cajadiariausuarioBean = cajadiariausuarioBean;
	}	
	
	public CajaDiariaUsuarioParameterReturnGeneral getcajadiariausuarioReturnGeneral() {
		return this.cajadiariausuarioReturnGeneral;
	}

	public void setcajadiariausuarioReturnGeneral(CajaDiariaUsuarioParameterReturnGeneral cajadiariausuarioReturnGeneral) {
		this.cajadiariausuarioReturnGeneral = cajadiariausuarioReturnGeneral;
	}	
	
	
	public Long id_usuarioBusquedaCajaDiariaUsuario=-1L;

	public Long getid_usuarioBusquedaCajaDiariaUsuario() {
		return this.id_usuarioBusquedaCajaDiariaUsuario;
	}

	public void setid_usuarioBusquedaCajaDiariaUsuario(Long id_usuarioBusquedaCajaDiariaUsuario) {
		this.id_usuarioBusquedaCajaDiariaUsuario = id_usuarioBusquedaCajaDiariaUsuario;
	}

;
	public Date fecha_inicioBusquedaCajaDiariaUsuario=new Date();

	public Date getfecha_inicioBusquedaCajaDiariaUsuario() {
		return this.fecha_inicioBusquedaCajaDiariaUsuario;
	}

	public void setfecha_inicioBusquedaCajaDiariaUsuario(Date fecha_inicioBusquedaCajaDiariaUsuario) {
		this.fecha_inicioBusquedaCajaDiariaUsuario = fecha_inicioBusquedaCajaDiariaUsuario;
	}

;
	public Date fecha_finBusquedaCajaDiariaUsuario=new Date();

	public Date getfecha_finBusquedaCajaDiariaUsuario() {
		return this.fecha_finBusquedaCajaDiariaUsuario;
	}

	public void setfecha_finBusquedaCajaDiariaUsuario(Date fecha_finBusquedaCajaDiariaUsuario) {
		this.fecha_finBusquedaCajaDiariaUsuario = fecha_finBusquedaCajaDiariaUsuario;
	}

	public Long id_cajaFK_IdCaja=-1L;

	public Long getid_cajaFK_IdCaja() {
		return this.id_cajaFK_IdCaja;
	}

	public void setid_cajaFK_IdCaja(Long id_cajaFK_IdCaja) {
		this.id_cajaFK_IdCaja = id_cajaFK_IdCaja;
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
	
	
	public CajaDiariaUsuarioLogic getCajaDiariaUsuarioLogic()	{		
		return cajadiariausuarioLogic;
	}

	public void setCajaDiariaUsuarioLogic(CajaDiariaUsuarioLogic cajadiariausuarioLogic) {
		this.cajadiariausuarioLogic = cajadiariausuarioLogic;
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
	
	public Boolean getIsEsNuevoCajaDiariaUsuario() {
		return isEsNuevoCajaDiariaUsuario;
	}

	public void setIsEsNuevoCajaDiariaUsuario(Boolean isEsNuevoCajaDiariaUsuario) {
		this.isEsNuevoCajaDiariaUsuario = isEsNuevoCajaDiariaUsuario;
	}

	public Boolean getEsParaAccionDesdeFormularioCajaDiariaUsuario() {
		return esParaAccionDesdeFormularioCajaDiariaUsuario;
	}
	
	public void setEsParaAccionDesdeFormularioCajaDiariaUsuario(Boolean esParaAccionDesdeFormularioCajaDiariaUsuario) {
		this.esParaAccionDesdeFormularioCajaDiariaUsuario = esParaAccionDesdeFormularioCajaDiariaUsuario;
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

			if(this.cajadiariausuarioSessionBean==null) {
				this.cajadiariausuarioSessionBean=new CajaDiariaUsuarioSessionBean();
			}

			if(!this.cajadiariausuarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cajadiariausuarioSessionBean.getlidEmpresaActual());
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

			if(this.cajadiariausuarioSessionBean==null) {
				this.cajadiariausuarioSessionBean=new CajaDiariaUsuarioSessionBean();
			}

			if(!this.cajadiariausuarioSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(cajadiariausuarioSessionBean.getlidClienteActual());
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

			if(this.cajadiariausuarioSessionBean==null) {
				this.cajadiariausuarioSessionBean=new CajaDiariaUsuarioSessionBean();
			}

			if(!this.cajadiariausuarioSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
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
					cajaLogic.getEntityWithConnection(cajadiariausuarioSessionBean.getlidCajaActual());
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

			if(this.cajadiariausuarioSessionBean==null) {
				this.cajadiariausuarioSessionBean=new CajaDiariaUsuarioSessionBean();
			}

			if(!this.cajadiariausuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(cajadiariausuarioSessionBean.getlidUsuarioActual());
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

					if(this.cajadiariausuario!=null) {
						this.cajadiariausuario.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
						this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCajaDiariaUsuario.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCajaDiariaUsuarioGenerico)throws Exception
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
				jComboBoxid_empresaCajaDiariaUsuarioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCajaDiariaUsuarioGenerico!=null && jComboBoxid_empresaCajaDiariaUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_empresaCajaDiariaUsuarioGenerico.setSelectedIndex(0);
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

					if(this.cajadiariausuario!=null) {
						this.cajadiariausuario.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
						this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteCajaDiariaUsuario.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteCajaDiariaUsuarioGenerico)throws Exception
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
				jComboBoxid_clienteCajaDiariaUsuarioGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteCajaDiariaUsuarioGenerico!=null && jComboBoxid_clienteCajaDiariaUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_clienteCajaDiariaUsuarioGenerico.setSelectedIndex(0);
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

					if(this.cajadiariausuario!=null) {
						this.cajadiariausuario.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
						this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaCajaDiariaUsuario.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.setSelectedIndex(0);
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
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaCajaDiariaUsuarioGenerico)throws Exception
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
				jComboBoxid_cajaCajaDiariaUsuarioGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaCajaDiariaUsuarioGenerico!=null && jComboBoxid_cajaCajaDiariaUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_cajaCajaDiariaUsuarioGenerico.setSelectedIndex(0);
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

					if(this.cajadiariausuario!=null) {
						this.cajadiariausuario.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
						this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioCajaDiariaUsuario.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCajaDiariaUsuario") || sFormularioTipoBusqueda.equals("Todos")){
					if(usuarioTemp!=null && jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario!=null) {
						jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setSelectedItem(usuarioTemp);
					} else {
						if(jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario!=null) {
							//jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setSelectedItem(usuarioTemp);
							if(jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.getItemCount()>0) {
								jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioCajaDiariaUsuarioGenerico)throws Exception
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
				jComboBoxid_usuarioCajaDiariaUsuarioGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioCajaDiariaUsuarioGenerico!=null && jComboBoxid_usuarioCajaDiariaUsuarioGenerico.getItemCount()>0) {
					jComboBoxid_usuarioCajaDiariaUsuarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CajaDiariaUsuario cajadiariausuario,JComboBox jComboBoxid_empresaCajaDiariaUsuarioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCajaDiariaUsuarioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCajaDiariaUsuarioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cajadiariausuario.setid_empresa(empresaAux.getId());
				cajadiariausuario.setempresa_descripcion(CajaDiariaUsuarioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cajadiariausuario.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(CajaDiariaUsuario cajadiariausuario,JComboBox jComboBoxid_clienteCajaDiariaUsuarioGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteCajaDiariaUsuarioGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteCajaDiariaUsuarioGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				cajadiariausuario.setid_cliente(clienteAux.getId());
				cajadiariausuario.setcliente_descripcion(CajaDiariaUsuarioConstantesFunciones.getClienteDescripcion(clienteAux));
				cajadiariausuario.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(CajaDiariaUsuario cajadiariausuario,JComboBox jComboBoxid_cajaCajaDiariaUsuarioGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaCajaDiariaUsuarioGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaCajaDiariaUsuarioGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				cajadiariausuario.setid_caja(cajaAux.getId());
				cajadiariausuario.setcaja_descripcion(CajaDiariaUsuarioConstantesFunciones.getCajaDescripcion(cajaAux));
				cajadiariausuario.setCaja(cajaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(CajaDiariaUsuario cajadiariausuario,JComboBox jComboBoxid_usuarioCajaDiariaUsuarioGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioCajaDiariaUsuarioGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioCajaDiariaUsuarioGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				cajadiariausuario.setid_usuario(usuarioAux.getId());
				cajadiariausuario.setusuario_descripcion(CajaDiariaUsuarioConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				cajadiariausuario.setUsuario(usuarioAux);			}
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

					if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { 
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { 
					}

					if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { 
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { 
					}

					if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { 
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { 
					}

					if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { 
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { 
					}

					if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCajaDiariaUsuario") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.addItem(usuario);
							}
						}

						if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameUsuarioForeignKey(Usuario usuario,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setSelectedItem(usuario);
						} else {
							this.jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCajaDiariaUsuario() throws Exception {
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
		
	public CajaDiariaUsuarioParameterReturnGeneral getCajaDiariaUsuarioParameterGeneral() {
		return this.cajadiariausuarioParameterGeneral;
	}
	
	public void setCajaDiariaUsuarioParameterGeneral(CajaDiariaUsuarioParameterReturnGeneral cajadiariausuarioParameterGeneral) {
		this.cajadiariausuarioParameterGeneral = cajadiariausuarioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCajaDiariaUsuario() {
		return isPermisoTodoCajaDiariaUsuario;
	}

	public void setIsPermisoTodoCajaDiariaUsuario(Boolean isPermisoTodoCajaDiariaUsuario) {
		this.isPermisoTodoCajaDiariaUsuario = isPermisoTodoCajaDiariaUsuario;
	}

	public Boolean getIsPermisoNuevoCajaDiariaUsuario() {
		return isPermisoNuevoCajaDiariaUsuario;
	}

	public void setIsPermisoNuevoCajaDiariaUsuario(Boolean isPermisoNuevoCajaDiariaUsuario) {
		this.isPermisoNuevoCajaDiariaUsuario = isPermisoNuevoCajaDiariaUsuario;
	}

	public Boolean getIsPermisoActualizarCajaDiariaUsuario() {
		return isPermisoActualizarCajaDiariaUsuario;
	}

	public void setIsPermisoActualizarCajaDiariaUsuario(Boolean isPermisoActualizarCajaDiariaUsuario) {
		this.isPermisoActualizarCajaDiariaUsuario = isPermisoActualizarCajaDiariaUsuario;
	}

	public Boolean getIsPermisoEliminarCajaDiariaUsuario() {
		return isPermisoEliminarCajaDiariaUsuario;
	}

	public void setIsPermisoEliminarCajaDiariaUsuario(Boolean isPermisoEliminarCajaDiariaUsuario) {
		this.isPermisoEliminarCajaDiariaUsuario = isPermisoEliminarCajaDiariaUsuario;
	}

	public Boolean getIsPermisoGuardarCambiosCajaDiariaUsuario() {
		return isPermisoGuardarCambiosCajaDiariaUsuario;
	}

	public void setIsPermisoGuardarCambiosCajaDiariaUsuario(Boolean isPermisoGuardarCambiosCajaDiariaUsuario) {
		this.isPermisoGuardarCambiosCajaDiariaUsuario = isPermisoGuardarCambiosCajaDiariaUsuario;
	}
	
	public Boolean getIsPermisoConsultaCajaDiariaUsuario() {
		return isPermisoConsultaCajaDiariaUsuario;
	}

	public void setIsPermisoConsultaCajaDiariaUsuario(Boolean isPermisoConsultaCajaDiariaUsuario) {
		this.isPermisoConsultaCajaDiariaUsuario = isPermisoConsultaCajaDiariaUsuario;
	}

	public Boolean getIsPermisoBusquedaCajaDiariaUsuario() {
		return isPermisoBusquedaCajaDiariaUsuario;
	}

	public void setIsPermisoBusquedaCajaDiariaUsuario(Boolean isPermisoBusquedaCajaDiariaUsuario) {
		this.isPermisoBusquedaCajaDiariaUsuario = isPermisoBusquedaCajaDiariaUsuario;
	}

	public Boolean getIsPermisoReporteCajaDiariaUsuario() {
		return isPermisoReporteCajaDiariaUsuario;
	}

	public void setIsPermisoReporteCajaDiariaUsuario(Boolean isPermisoReporteCajaDiariaUsuario) {
		this.isPermisoReporteCajaDiariaUsuario = isPermisoReporteCajaDiariaUsuario;
	}
	
	public Boolean getIsPermisoPaginacionMedioCajaDiariaUsuario() {
		return isPermisoPaginacionMedioCajaDiariaUsuario;
	}

	public void setIsPermisoPaginacionMedioCajaDiariaUsuario(Boolean isPermisoPaginacionMedioCajaDiariaUsuario) {
		this.isPermisoPaginacionMedioCajaDiariaUsuario = isPermisoPaginacionMedioCajaDiariaUsuario;
	}
	
	public Boolean getIsPermisoPaginacionTodoCajaDiariaUsuario() {
		return isPermisoPaginacionTodoCajaDiariaUsuario;
	}

	public void setIsPermisoPaginacionTodoCajaDiariaUsuario(Boolean isPermisoPaginacionTodoCajaDiariaUsuario) {
		this.isPermisoPaginacionTodoCajaDiariaUsuario = isPermisoPaginacionTodoCajaDiariaUsuario;
	}
	
	public Boolean getIsPermisoPaginacionAltoCajaDiariaUsuario() {
		return isPermisoPaginacionAltoCajaDiariaUsuario;
	}

	public void setIsPermisoPaginacionAltoCajaDiariaUsuario(Boolean isPermisoPaginacionAltoCajaDiariaUsuario) {
		this.isPermisoPaginacionAltoCajaDiariaUsuario = isPermisoPaginacionAltoCajaDiariaUsuario;
	}
	
	public Boolean getIsPermisoCopiarCajaDiariaUsuario() {
		return isPermisoCopiarCajaDiariaUsuario;
	}

	public void setIsPermisoCopiarCajaDiariaUsuario(Boolean isPermisoCopiarCajaDiariaUsuario) {
		this.isPermisoCopiarCajaDiariaUsuario = isPermisoCopiarCajaDiariaUsuario;
	}
	
	public Boolean getIsPermisoVerFormCajaDiariaUsuario() {
		return isPermisoVerFormCajaDiariaUsuario;
	}

	public void setIsPermisoVerFormCajaDiariaUsuario(Boolean isPermisoVerFormCajaDiariaUsuario) {
		this.isPermisoVerFormCajaDiariaUsuario = isPermisoVerFormCajaDiariaUsuario;
	}
	
	public Boolean getIsPermisoDuplicarCajaDiariaUsuario() {
		return isPermisoDuplicarCajaDiariaUsuario;
	}

	public void setIsPermisoDuplicarCajaDiariaUsuario(Boolean isPermisoDuplicarCajaDiariaUsuario) {
		this.isPermisoDuplicarCajaDiariaUsuario = isPermisoDuplicarCajaDiariaUsuario;
	}
	
	public Boolean getIsPermisoOrdenCajaDiariaUsuario() {
		return isPermisoOrdenCajaDiariaUsuario;
	}

	public void setIsPermisoOrdenCajaDiariaUsuario(Boolean isPermisoOrdenCajaDiariaUsuario) {
		this.isPermisoOrdenCajaDiariaUsuario = isPermisoOrdenCajaDiariaUsuario;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCajaDiariaUsuario() {
		return isVisibilidadCeldaNuevoCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaNuevoCajaDiariaUsuario(Boolean isVisibilidadCeldaNuevoCajaDiariaUsuario) {
		this.isVisibilidadCeldaNuevoCajaDiariaUsuario = isVisibilidadCeldaNuevoCajaDiariaUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCajaDiariaUsuario() {
		return isVisibilidadCeldaDuplicarCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaDuplicarCajaDiariaUsuario(Boolean isVisibilidadCeldaDuplicarCajaDiariaUsuario) {
		this.isVisibilidadCeldaDuplicarCajaDiariaUsuario = isVisibilidadCeldaDuplicarCajaDiariaUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCajaDiariaUsuario() {
		return isVisibilidadCeldaCopiarCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaCopiarCajaDiariaUsuario(Boolean isVisibilidadCeldaCopiarCajaDiariaUsuario) {
		this.isVisibilidadCeldaCopiarCajaDiariaUsuario = isVisibilidadCeldaCopiarCajaDiariaUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCajaDiariaUsuario() {
		return isVisibilidadCeldaVerFormCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaVerFormCajaDiariaUsuario(Boolean isVisibilidadCeldaVerFormCajaDiariaUsuario) {
		this.isVisibilidadCeldaVerFormCajaDiariaUsuario = isVisibilidadCeldaVerFormCajaDiariaUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCajaDiariaUsuario() {
		return isVisibilidadCeldaOrdenCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaOrdenCajaDiariaUsuario(Boolean isVisibilidadCeldaOrdenCajaDiariaUsuario) {
		this.isVisibilidadCeldaOrdenCajaDiariaUsuario = isVisibilidadCeldaOrdenCajaDiariaUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario() {
		return isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario(Boolean isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario) {
		this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario = isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCajaDiariaUsuario() {
		return isVisibilidadCeldaModificarCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaModificarCajaDiariaUsuario(Boolean isVisibilidadCeldaModificarCajaDiariaUsuario) {
		this.isVisibilidadCeldaModificarCajaDiariaUsuario = isVisibilidadCeldaModificarCajaDiariaUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCajaDiariaUsuario() {
		return isVisibilidadCeldaActualizarCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaActualizarCajaDiariaUsuario(Boolean isVisibilidadCeldaActualizarCajaDiariaUsuario) {
		this.isVisibilidadCeldaActualizarCajaDiariaUsuario = isVisibilidadCeldaActualizarCajaDiariaUsuario;
	}

	public Boolean getIsVisibilidadCeldaEliminarCajaDiariaUsuario() {
		return isVisibilidadCeldaEliminarCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaEliminarCajaDiariaUsuario(Boolean isVisibilidadCeldaEliminarCajaDiariaUsuario) {
		this.isVisibilidadCeldaEliminarCajaDiariaUsuario = isVisibilidadCeldaEliminarCajaDiariaUsuario;
	}

	public Boolean getIsVisibilidadCeldaCancelarCajaDiariaUsuario() {
		return isVisibilidadCeldaCancelarCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaCancelarCajaDiariaUsuario(Boolean isVisibilidadCeldaCancelarCajaDiariaUsuario) {
		this.isVisibilidadCeldaCancelarCajaDiariaUsuario = isVisibilidadCeldaCancelarCajaDiariaUsuario;
	}

	public Boolean getIsVisibilidadCeldaGuardarCajaDiariaUsuario() {
		return isVisibilidadCeldaGuardarCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaGuardarCajaDiariaUsuario(Boolean isVisibilidadCeldaGuardarCajaDiariaUsuario) {
		this.isVisibilidadCeldaGuardarCajaDiariaUsuario = isVisibilidadCeldaGuardarCajaDiariaUsuario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCajaDiariaUsuario() {
		return isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCajaDiariaUsuario(Boolean isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario) {
		this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario = isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario;
	}
		
	public CajaDiariaUsuarioSessionBean getcajadiariausuarioSessionBean() {
		return this.cajadiariausuarioSessionBean;
	}
	
	public void setcajadiariausuarioSessionBean(CajaDiariaUsuarioSessionBean cajadiariausuarioSessionBean) {
		this.cajadiariausuarioSessionBean=cajadiariausuarioSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCajaDiariaUsuario() {
		return this.isVisibilidadBusquedaCajaDiariaUsuario;
	}

	public void setisVisibilidadBusquedaCajaDiariaUsuario(Boolean isVisibilidadBusquedaCajaDiariaUsuario) {
		this.isVisibilidadBusquedaCajaDiariaUsuario=isVisibilidadBusquedaCajaDiariaUsuario;
	}

	public Boolean getisVisibilidadFK_IdCaja() {
		return this.isVisibilidadFK_IdCaja;
	}

	public void setisVisibilidadFK_IdCaja(Boolean isVisibilidadFK_IdCaja) {
		this.isVisibilidadFK_IdCaja=isVisibilidadFK_IdCaja;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cajadiariausuario,null);
				this.setActualParaGuardarClienteForeignKey(cajadiariausuario,null);
				this.setActualParaGuardarCajaForeignKey(cajadiariausuario,null);
				this.setActualParaGuardarUsuarioForeignKey(cajadiariausuario,null);
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
	
	public void bugActualizarReferenciaActual(CajaDiariaUsuario cajadiariausuario,CajaDiariaUsuario cajadiariausuarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCajaDiariaUsuario(cajadiariausuario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cajadiariausuarioAux.setId(cajadiariausuario.getId());
		cajadiariausuarioAux.setVersionRow(cajadiariausuario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CajaDiariaUsuario cajadiariausuarioLocal) throws Exception {
		
		if(this.cajadiariausuarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CajaDiariaUsuario cajadiariausuarioLocal) throws Exception {	
		if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cajadiariausuarioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				cajadiariausuarioLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				cajadiariausuarioLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				cajadiariausuarioLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCajaDiariaUsuarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cajadiariausuarioValidator.getInvalidValues(this.cajadiariausuario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CajaDiariaUsuario cajadiariausuario,List<CajaDiariaUsuario> cajadiariausuarios) throws Exception {
	}		
	
	public void actualizarSelectedLista(CajaDiariaUsuario cajadiariausuario,List<CajaDiariaUsuario> cajadiariausuarios) throws Exception {
		try	{			
			CajaDiariaUsuarioConstantesFunciones.actualizarSelectedLista(cajadiariausuario,cajadiariausuarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CajaDiariaUsuario> cajadiariausuariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cajadiariausuariosLocal=this.cajadiariausuarioLogic.getCajaDiariaUsuarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cajadiariausuariosLocal=this.cajadiariausuarios;
			}
			//ARCHITECTURE
		
			for(CajaDiariaUsuario cajadiariausuarioLocal:cajadiariausuariosLocal) {
				if(this.permiteMantenimiento(cajadiariausuarioLocal) && cajadiariausuarioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CajaDiariaUsuarioConstantesFunciones.getCajaDiariaUsuarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelid_clienteCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelid_cajaCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelid_usuarioCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.NOMBRECAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelnombre_cajaCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.NOMBREUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelnombre_usuarioCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelsecuencialCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.CODIGOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelcodigo_clienteCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelnombre_clienteCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelsubtotalCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelivaCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabeldescuentoCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.FINANCIAMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelfinanciamientoCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.FLETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelfleteCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabeliceCajaDiariaUsuario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaDiariaUsuarioConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabeltotalCajaDiariaUsuario,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelid_clienteCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelid_cajaCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelid_usuarioCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelnombre_cajaCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelnombre_usuarioCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelsecuencialCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelcodigo_clienteCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelnombre_clienteCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelsubtotalCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelivaCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabeldescuentoCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelfinanciamientoCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelfleteCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabeliceCajaDiariaUsuario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabeltotalCajaDiariaUsuario,"");
		
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
		this.iIdNuevoCajaDiariaUsuario--;	
		
		
		this.cajadiariausuarioAux=new CajaDiariaUsuario();
		
		this.cajadiariausuarioAux.setId(this.iIdNuevoCajaDiariaUsuario);
		this.cajadiariausuarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajadiariausuarioLogic.getCajaDiariaUsuarios().add(this.cajadiariausuarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cajadiariausuarios.add(this.cajadiariausuarioAux);
		}
		//ARCHITECTURE
		
		this.cajadiariausuario=this.cajadiariausuarioAux;
		
		if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCajaDiariaUsuario(this.cajadiariausuario);
			this.setVariablesObjetoActualToFormularioForeignKeyCajaDiariaUsuario(this.cajadiariausuario);
		}
				
		//this.setDefaultControlesCajaDiariaUsuario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCajaDiariaUsuario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCajaDiariaUsuario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaDiariaUsuario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaDiariaUsuario(this.cajadiariausuarioBean,this.cajadiariausuario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCajaDiariaUsuario(this.cajadiariausuarioReturnGeneral,this.cajadiariausuarioBean,false);
		
		if(this.cajadiariausuarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCajaDiariaUsuario(this.cajadiariausuarioReturnGeneral.getCajaDiariaUsuario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCajaDiariaUsuario(this.cajadiariausuarioReturnGeneral.getCajaDiariaUsuario());
		}
		
		if(this.cajadiariausuarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCajaDiariaUsuario(this.cajadiariausuarioReturnGeneral.getCajaDiariaUsuario(),classes);//this.cajadiariausuarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCajaDiariaUsuario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCajaDiariaUsuario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.RecargarFormCajaDiariaUsuario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCajaDiariaUsuario(false);
						
			if(cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaDiariaUsuario();
			}
			
			this.actualizarVisualTableDatosCajaDiariaUsuario();
			
			this.jTableDatosCajaDiariaUsuario.setRowSelectionInterval(this.getIndiceNuevoCajaDiariaUsuario(), this.getIndiceNuevoCajaDiariaUsuario());
			
			this.seleccionarFilaTablaCajaDiariaUsuarioActual();
						
			this.actualizarEstadoCeldasBotonesCajaDiariaUsuario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCajaDiariaUsuario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jDateChooserfecha_inicioCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarfecha_inicioCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jDateChooserfecha_finCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarfecha_finCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_cajaCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarnombre_cajaCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldnombre_usuarioCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarnombre_usuarioCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsecuencialCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarsecuencialCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldcodigo_clienteCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarcodigo_clienteCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_clienteCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarnombre_clienteCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsubtotalCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarsubtotalCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldivaCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarivaCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFielddescuentoCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activardescuentoCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfinanciamientoCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarfinanciamientoCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfleteCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarfleteCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldiceCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activariceCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldtotalCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activartotalCajaDiariaUsuario);	
		//
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarid_empresaCajaDiariaUsuario);//
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarid_clienteCajaDiariaUsuario);//
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarid_cajaCajaDiariaUsuario);//
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.setEnabled(isHabilitar && this.cajadiariausuarioConstantesFunciones.activarid_usuarioCajaDiariaUsuario);
	};
	
	public void setDefaultControlesCajaDiariaUsuario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCajaDiariaUsuario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cajadiariausuarioSessionBean.setConGuardarRelaciones(true);			
			this.cajadiariausuarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTabbedPaneRelacionesCajaDiariaUsuario.setVisible(true);
			
					
		} else {
			//this.cajadiariausuarioSessionBean.setConGuardarRelaciones(false);			
			this.cajadiariausuarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTabbedPaneRelacionesCajaDiariaUsuario.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCajaDiariaUsuario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
				if(cajadiariausuarioAux.getId().equals(this.iIdNuevoCajaDiariaUsuario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarios) {
				if(cajadiariausuarioAux.getId().equals(this.iIdNuevoCajaDiariaUsuario)) {
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
	
	public int getIndiceActualCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
				if(cajadiariausuarioAux.getId().equals(cajadiariausuario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarios) {
				if(cajadiariausuarioAux.getId().equals(cajadiariausuario.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
				if(cajadiariausuarioAux.getCajaDiariaUsuarioOriginal().getId().equals(cajadiariausuarioOriginal.getId())) {
					existe=true;
					cajadiariausuarioOriginal.setId(cajadiariausuarioAux.getId());
					cajadiariausuarioOriginal.setVersionRow(cajadiariausuarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarios) {
				if(cajadiariausuarioAux.getCajaDiariaUsuarioOriginal().getId().equals(cajadiariausuarioOriginal.getId())) {
					existe=true;
					cajadiariausuarioOriginal.setId(cajadiariausuarioAux.getId());
					cajadiariausuarioOriginal.setVersionRow(cajadiariausuarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCajaDiariaUsuario(Boolean esParaCancelar) throws Exception {
		cajadiariausuariosAux=new ArrayList<CajaDiariaUsuario>();
		cajadiariausuarioAux=new CajaDiariaUsuario();
		
		if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
					if(cajadiariausuarioAux.getId()<0) {
						cajadiariausuariosAux.add(cajadiariausuarioAux);
					}		
				}
				this.iIdNuevoCajaDiariaUsuario=0L;
				this.cajadiariausuarioLogic.getCajaDiariaUsuarios().removeAll(cajadiariausuariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarios) {
					if(cajadiariausuarioAux.getId()<0) {
						cajadiariausuariosAux.add(cajadiariausuarioAux);
					}		
				}
				this.iIdNuevoCajaDiariaUsuario=0L;
				this.cajadiariausuarios.removeAll(cajadiariausuariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCajaDiariaUsuario 
					&& this.cajadiariausuarioLogic.getCajaDiariaUsuarios().size()>0
					) {
					cajadiariausuarioAux=this.cajadiariausuarioLogic.getCajaDiariaUsuarios().get(this.cajadiariausuarioLogic.getCajaDiariaUsuarios().size() - 1);
				
					if(cajadiariausuarioAux.getId()<0) {
						this.cajadiariausuarioLogic.getCajaDiariaUsuarios().remove(cajadiariausuarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCajaDiariaUsuario && this.cajadiariausuarios.size()>0) {
					cajadiariausuarioAux=this.cajadiariausuarios.get(this.cajadiariausuarios.size() - 1);
				
					if(cajadiariausuarioAux.getId()<0) {
						this.cajadiariausuarios.remove(cajadiariausuarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCajaDiariaUsuario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cajadiariausuario.getId()<0) {
				this.cajadiariausuarioLogic.getCajaDiariaUsuarios().remove(this.cajadiariausuario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cajadiariausuario.getId()<0) {
				this.cajadiariausuarios.remove(this.cajadiariausuario);
			}
		}			
	}
	
	public void setEstadosInicialesCajaDiariaUsuario(List<CajaDiariaUsuario> cajadiariausuariosAux) throws Exception {
		CajaDiariaUsuarioConstantesFunciones.setEstadosInicialesCajaDiariaUsuario(cajadiariausuariosAux);
	}
	
	public void setEstadosInicialesCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuarioAux) throws Exception {
		CajaDiariaUsuarioConstantesFunciones.setEstadosInicialesCajaDiariaUsuario(cajadiariausuarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCajaDiariaUsuarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCajaDiariaUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCajaDiariaUsuarioActual()) {
				if(!this.isEsNuevoCajaDiariaUsuario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCajaDiariaUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCajaDiariaUsuario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCajaDiariaUsuarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Caja Diaria Usuario ?", "MANTENIMIENTO DE Caja Diaria Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCajaDiariaUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CajaDiariaUsuario cajadiariausuario) throws Exception {
		CajaDiariaUsuarioConstantesFunciones.seleccionarAsignar(this.cajadiariausuario,cajadiariausuario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCajaDiariaUsuario=this.isPermisoActualizarOriginalCajaDiariaUsuario;
			
			
			this.seleccionarAsignar(cajadiariausuario);
			
			

			idClienteActual=cajadiariausuario.getid_cliente();
			this.seleccionarClienteActual();
			
			
			
			this.actualizarEstadoCeldasBotonesCajaDiariaUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cajadiariausuarioSessionBean.setsFuncionBusquedaRapida(this.cajadiariausuarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoCajaDiariaUsuario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCajaDiariaUsuario(esParaCancelar);				
				this.cancelarNuevoCajaDiariaUsuario(esParaCancelar);								
			}
			
			this.cajadiariausuario=new CajaDiariaUsuario();
			
			this.inicializarCajaDiariaUsuario();
			
			this.actualizarEstadoCeldasBotonesCajaDiariaUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCajaDiariaUsuario() throws Exception {
		try {
			CajaDiariaUsuarioConstantesFunciones.inicializarCajaDiariaUsuario(this.cajadiariausuario);
			
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
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cajadiariausuarioLogic.getCajaDiariaUsuarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCajaDiariaUsuarios(String sAccionBusqueda,List<CajaDiariaUsuario> cajadiariausuariosParaReportes) throws Exception {
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
					sPathReporteFinal="CajaDiariaUsuario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CajaDiariaUsuarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CajaDiariaUsuarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CajaDiariaUsuario"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Caja Diaria Usuarios");		
		parameters.put("busquedapor", CajaDiariaUsuarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCajaDiariaUsuario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CajaDiariaUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CajaDiariaUsuarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCajaDiariaUsuario=new JRBeanArrayDataSource(CajaDiariaUsuarioJInternalFrame.TraerCajaDiariaUsuarioBeans(cajadiariausuariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCajaDiariaUsuario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CajaDiariaUsuarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CajaDiariaUsuarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CajaDiariaUsuarioBean.TraerCajaDiariaUsuarioBeans(cajadiariausuariosParaReportes).toArray()));
							
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
				this.generarExcelReporteCajaDiariaUsuarios(sAccionBusqueda,sTipoArchivoReporte,cajadiariausuariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCajaDiariaUsuarios(sAccionBusqueda,sTipoArchivoReporte,cajadiariausuariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCajaDiariaUsuarioActionPerformed(null);
					//this.generarExcelReporteCajaDiariaUsuarios(sAccionBusqueda,sTipoArchivoReporte,cajadiariausuariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCajaDiariaUsuarios(sAccionBusqueda,sTipoArchivoReporte,cajadiariausuariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCajaDiariaUsuarios(sAccionBusqueda,sTipoArchivoReporte,cajadiariausuariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCajaDiariaUsuarios(sAccionBusqueda,sTipoArchivoReporte,cajadiariausuariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCajaDiariaUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaDiariaUsuario> cajadiariausuariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariausuario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaDiariaUsuarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaDiariaUsuario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CajaDiariaUsuario cajadiariausuario : cajadiariausuariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CajaDiariaUsuarioConstantesFunciones.generarExcelReporteDataCajaDiariaUsuario("NORMAL",row,workbook,cajadiariausuario,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCajaDiariaUsuario(String sTipo,Row row,Workbook workbook) {
		
		CajaDiariaUsuarioConstantesFunciones.generarExcelReporteHeaderCajaDiariaUsuario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCajaDiariaUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaDiariaUsuario> cajadiariausuariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariausuario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaDiariaUsuarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CajaDiariaUsuario cajadiariausuario : cajadiariausuariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.getCajaDiariaUsuarioDescripcion(cajadiariausuario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getnombre_caja());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getnombre_usuario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getcodigo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getsubtotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getfinanciamiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getflete());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.getice());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajadiariausuario.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCajaDiariaUsuarios(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaDiariaUsuario> cajadiariausuariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CajaDiariaUsuario> cajadiariausuariosRespaldo=null;
		
		classes=CajaDiariaUsuarioConstantesFunciones.getClassesRelationshipsOfCajaDiariaUsuario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cajadiariausuarioLogic.setDatosCliente(this.datosCliente);
		this.cajadiariausuarioLogic.setDatosDeep(this.datosDeep);
		this.cajadiariausuarioLogic.setIsConDeep(true);
		
		cajadiariausuariosRespaldo=this.cajadiariausuarioLogic.getCajaDiariaUsuarios();
		
		this.cajadiariausuarioLogic.setCajaDiariaUsuarios(cajadiariausuariosParaReportes);	
		this.cajadiariausuarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cajadiariausuariosParaReportes=this.cajadiariausuarioLogic.getCajaDiariaUsuarios();
		this.cajadiariausuarioLogic.setCajaDiariaUsuarios(cajadiariausuariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariausuario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaDiariaUsuarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaDiariaUsuario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CajaDiariaUsuario cajadiariausuario : cajadiariausuariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCajaDiariaUsuario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CajaDiariaUsuarioConstantesFunciones.generarExcelReporteDataCajaDiariaUsuario("NORMAL",row,workbook,cajadiariausuario,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.getCajaDiariaUsuarioDescripcion(cajadiariausuario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Usuario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCajaDiariaUsuario() throws Exception {		
		this.startProcessCajaDiariaUsuario(true);
	}
	
	public void startProcessCajaDiariaUsuario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCajaDiariaUsuario ,this.jPanelParametrosReportesCajaDiariaUsuario, this.jScrollPanelDatosCajaDiariaUsuario,this.jPanelPaginacionCajaDiariaUsuario, this.jScrollPanelDatosEdicionCajaDiariaUsuario, this.jPanelAccionesCajaDiariaUsuario,this.jPanelAccionesFormularioCajaDiariaUsuario,this.jmenuBarCajaDiariaUsuario,this.jmenuBarDetalleCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,this.jTtoolBarDetalleCajaDiariaUsuario);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaDiariaUsuario=this.jTabbedPaneBusquedasCajaDiariaUsuario; 
		
		final JPanel jPanelParametrosReportesCajaDiariaUsuario=this.jPanelParametrosReportesCajaDiariaUsuario;
		//final JScrollPane jScrollPanelDatosCajaDiariaUsuario=this.jScrollPanelDatosCajaDiariaUsuario;
		final JTable jTableDatosCajaDiariaUsuario=this.jTableDatosCajaDiariaUsuario;		
		final JPanel jPanelPaginacionCajaDiariaUsuario=this.jPanelPaginacionCajaDiariaUsuario;
		//final JScrollPane jScrollPanelDatosEdicionCajaDiariaUsuario=this.jScrollPanelDatosEdicionCajaDiariaUsuario;
		final JPanel jPanelAccionesCajaDiariaUsuario=this.jPanelAccionesCajaDiariaUsuario;
		
		JPanel jPanelCamposAuxiliarCajaDiariaUsuario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCajaDiariaUsuario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			jPanelCamposAuxiliarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelCamposCajaDiariaUsuario;
			jPanelAccionesFormularioAuxiliarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelAccionesFormularioCajaDiariaUsuario;
		}
		
		final JPanel jPanelCamposCajaDiariaUsuario=jPanelCamposAuxiliarCajaDiariaUsuario;
		final JPanel jPanelAccionesFormularioCajaDiariaUsuario=jPanelAccionesFormularioAuxiliarCajaDiariaUsuario;
		
		
		final JMenuBar jmenuBarCajaDiariaUsuario=this.jmenuBarCajaDiariaUsuario;
		final JToolBar jTtoolBarCajaDiariaUsuario=this.jTtoolBarCajaDiariaUsuario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCajaDiariaUsuario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaDiariaUsuario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			jmenuBarDetalleAuxiliarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jmenuBarDetalleCajaDiariaUsuario;
			jTtoolBarDetalleAuxiliarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jTtoolBarDetalleCajaDiariaUsuario;
		}
		
		final JMenuBar jmenuBarDetalleCajaDiariaUsuario=jmenuBarDetalleAuxiliarCajaDiariaUsuario;
		final JToolBar jTtoolBarDetalleCajaDiariaUsuario=jTtoolBarDetalleAuxiliarCajaDiariaUsuario;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaDiariaUsuario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaDiariaUsuario;
			processRunnable.jTableDatos=jTableDatosCajaDiariaUsuario;
			processRunnable.jPanelCampos=jPanelCamposCajaDiariaUsuario;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaDiariaUsuario;
			processRunnable.jPanelAcciones=jPanelAccionesCajaDiariaUsuario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaDiariaUsuario;
			
			
			processRunnable.jmenuBar=jmenuBarCajaDiariaUsuario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaDiariaUsuario;
			processRunnable.jTtoolBar=jTtoolBarCajaDiariaUsuario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaDiariaUsuario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaDiariaUsuario ,jPanelParametrosReportesCajaDiariaUsuario,jTableDatosCajaDiariaUsuario, /*jScrollPanelDatosCajaDiariaUsuario,*/jPanelCamposCajaDiariaUsuario,jPanelPaginacionCajaDiariaUsuario, /*jScrollPanelDatosEdicionCajaDiariaUsuario,*/ jPanelAccionesCajaDiariaUsuario,jPanelAccionesFormularioCajaDiariaUsuario,jmenuBarCajaDiariaUsuario,jmenuBarDetalleCajaDiariaUsuario,jTtoolBarCajaDiariaUsuario,jTtoolBarDetalleCajaDiariaUsuario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaDiariaUsuario ,jPanelParametrosReportesCajaDiariaUsuario, jScrollPanelDatosCajaDiariaUsuario,jPanelPaginacionCajaDiariaUsuario, jScrollPanelDatosEdicionCajaDiariaUsuario, jPanelAccionesCajaDiariaUsuario,jPanelAccionesFormularioCajaDiariaUsuario,jmenuBarCajaDiariaUsuario,jmenuBarDetalleCajaDiariaUsuario,jTtoolBarCajaDiariaUsuario,jTtoolBarDetalleCajaDiariaUsuario);
						
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
	
	public void finishProcessCajaDiariaUsuario() {// throws Exception 
		this.finishProcessCajaDiariaUsuario(true);
	}
	
	public void finishProcessCajaDiariaUsuario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCajaDiariaUsuario ,this.jPanelParametrosReportesCajaDiariaUsuario, this.jScrollPanelDatosCajaDiariaUsuario,this.jPanelPaginacionCajaDiariaUsuario, this.jScrollPanelDatosEdicionCajaDiariaUsuario, this.jPanelAccionesCajaDiariaUsuario,this.jPanelAccionesFormularioCajaDiariaUsuario,this.jmenuBarCajaDiariaUsuario,this.jmenuBarDetalleCajaDiariaUsuario,this.jTtoolBarCajaDiariaUsuario,this.jTtoolBarDetalleCajaDiariaUsuario);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaDiariaUsuario=this.jTabbedPaneBusquedasCajaDiariaUsuario; 
		
		final JPanel jPanelParametrosReportesCajaDiariaUsuario=this.jPanelParametrosReportesCajaDiariaUsuario;
		//final JScrollPane jScrollPanelDatosCajaDiariaUsuario=this.jScrollPanelDatosCajaDiariaUsuario;
		final JTable jTableDatosCajaDiariaUsuario=this.jTableDatosCajaDiariaUsuario;		
		final JPanel jPanelPaginacionCajaDiariaUsuario=this.jPanelPaginacionCajaDiariaUsuario;
		//final JScrollPane jScrollPanelDatosEdicionCajaDiariaUsuario=this.jScrollPanelDatosEdicionCajaDiariaUsuario;
		final JPanel jPanelAccionesCajaDiariaUsuario=this.jPanelAccionesCajaDiariaUsuario;
		
		JPanel jPanelCamposAuxiliarCajaDiariaUsuario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCajaDiariaUsuario=new JPanel();
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			jPanelCamposAuxiliarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelCamposCajaDiariaUsuario;
			jPanelAccionesFormularioAuxiliarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelAccionesFormularioCajaDiariaUsuario;
		}
		
		final JPanel jPanelCamposCajaDiariaUsuario=jPanelCamposAuxiliarCajaDiariaUsuario;
		final JPanel jPanelAccionesFormularioCajaDiariaUsuario=jPanelAccionesFormularioAuxiliarCajaDiariaUsuario;
		
		
		final JMenuBar jmenuBarCajaDiariaUsuario=this.jmenuBarCajaDiariaUsuario;		
		final JToolBar jTtoolBarCajaDiariaUsuario=this.jTtoolBarCajaDiariaUsuario;
				
		JMenuBar jmenuBarDetalleAuxiliarCajaDiariaUsuario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaDiariaUsuario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			jmenuBarDetalleAuxiliarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jmenuBarDetalleCajaDiariaUsuario;
			jTtoolBarDetalleAuxiliarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jTtoolBarDetalleCajaDiariaUsuario;		
		}
		
		final JMenuBar jmenuBarDetalleCajaDiariaUsuario=jmenuBarDetalleAuxiliarCajaDiariaUsuario;
		final JToolBar jTtoolBarDetalleCajaDiariaUsuario=jTtoolBarDetalleAuxiliarCajaDiariaUsuario;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaDiariaUsuario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaDiariaUsuario;
			processRunnable.jTableDatos=jTableDatosCajaDiariaUsuario;
			processRunnable.jPanelCampos=jPanelCamposCajaDiariaUsuario;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaDiariaUsuario;
			processRunnable.jPanelAcciones=jPanelAccionesCajaDiariaUsuario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaDiariaUsuario;
			
			
			processRunnable.jmenuBar=jmenuBarCajaDiariaUsuario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaDiariaUsuario;
			processRunnable.jTtoolBar=jTtoolBarCajaDiariaUsuario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaDiariaUsuario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCajaDiariaUsuario ,jPanelParametrosReportesCajaDiariaUsuario, jTableDatosCajaDiariaUsuario,/*jScrollPanelDatosCajaDiariaUsuario,*/jPanelCamposCajaDiariaUsuario,jPanelPaginacionCajaDiariaUsuario, /*jScrollPanelDatosEdicionCajaDiariaUsuario,*/ jPanelAccionesCajaDiariaUsuario,jPanelAccionesFormularioCajaDiariaUsuario,jmenuBarCajaDiariaUsuario,jmenuBarDetalleCajaDiariaUsuario,jTtoolBarCajaDiariaUsuario,jTtoolBarDetalleCajaDiariaUsuario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCajaDiariaUsuario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCajaDiariaUsuario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCajaDiariaUsuario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCajaDiariaUsuario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCajaDiariaUsuario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCajaDiariaUsuario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCajaDiariaUsuario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCajaDiariaUsuario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCajaDiariaUsuario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cajadiariausuarioConstantesFunciones.getsFinalQueryCajaDiariaUsuario();
		String  finalQueryPaginacionTodos=this.cajadiariausuarioConstantesFunciones.getsFinalQueryCajaDiariaUsuario();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CajaDiariaUsuarioConstantesFunciones.getArrayColumnasGlobalesNoCajaDiariaUsuario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CajaDiariaUsuarioConstantesFunciones.getArrayColumnasGlobalesCajaDiariaUsuario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CajaDiariaUsuarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cajadiariausuariosEliminados= new ArrayList<CajaDiariaUsuario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCajaDiariaUsuario();
		
				///*CajaDiariaUsuarioSessionBean*/this.cajadiariausuarioSessionBean=new CajaDiariaUsuarioSessionBean();
			
			if(this.cajadiariausuarioSessionBean==null) {
				this.cajadiariausuarioSessionBean=new CajaDiariaUsuarioSessionBean();
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
					this.iNumeroPaginacion=CajaDiariaUsuarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CajaDiariaUsuarioConstantesFunciones.getClassesForeignKeysOfCajaDiariaUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cajadiariausuario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cajadiariausuariosAux= new ArrayList<CajaDiariaUsuario>();
			
				
			cajadiariausuarioLogic.setDatosCliente(this.datosCliente);
			cajadiariausuarioLogic.setDatosDeep(this.datosDeep);
			cajadiariausuarioLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCajaDiariaUsuario")) {
				this.sDetalleReporte=CajaDiariaUsuarioConstantesFunciones.getDetalleIndiceBusquedaCajaDiariaUsuario(id_usuarioBusquedaCajaDiariaUsuario,fecha_inicioBusquedaCajaDiariaUsuario,fecha_finBusquedaCajaDiariaUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajadiariausuarioLogic.getCajaDiariaUsuariosBusquedaCajaDiariaUsuario(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_usuarioBusquedaCajaDiariaUsuario,fecha_inicioBusquedaCajaDiariaUsuario,fecha_finBusquedaCajaDiariaUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaDiariaUsuarioConstantesFunciones.getDetalleIndiceBusquedaCajaDiariaUsuario(id_usuarioBusquedaCajaDiariaUsuario,fecha_inicioBusquedaCajaDiariaUsuario,fecha_finBusquedaCajaDiariaUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaDiariaUsuarioConstantesFunciones.getDetalleIndiceBusquedaCajaDiariaUsuario(id_usuarioBusquedaCajaDiariaUsuario,fecha_inicioBusquedaCajaDiariaUsuario,fecha_finBusquedaCajaDiariaUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajadiariausuarioLogic.getCajaDiariaUsuarios()==null||cajadiariausuarioLogic.getCajaDiariaUsuarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajadiariausuarios==null|| cajadiariausuarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajadiariausuariosAux=new ArrayList<CajaDiariaUsuario>();
						cajadiariausuariosAux.addAll(cajadiariausuarioLogic.getCajaDiariaUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajadiariausuariosAux=new ArrayList<CajaDiariaUsuario>();
							cajadiariausuariosAux.addAll(cajadiariausuarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajadiariausuarioLogic.getCajaDiariaUsuariosBusquedaCajaDiariaUsuario(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_usuarioBusquedaCajaDiariaUsuario,fecha_inicioBusquedaCajaDiariaUsuario,fecha_finBusquedaCajaDiariaUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaDiariaUsuarioConstantesFunciones.getDetalleIndiceBusquedaCajaDiariaUsuario(id_usuarioBusquedaCajaDiariaUsuario,fecha_inicioBusquedaCajaDiariaUsuario,fecha_finBusquedaCajaDiariaUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaDiariaUsuarioConstantesFunciones.getDetalleIndiceBusquedaCajaDiariaUsuario(id_usuarioBusquedaCajaDiariaUsuario,fecha_inicioBusquedaCajaDiariaUsuario,fecha_finBusquedaCajaDiariaUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaDiariaUsuarios("BusquedaCajaDiariaUsuario",cajadiariausuarioLogic.getCajaDiariaUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaDiariaUsuarios("BusquedaCajaDiariaUsuario",cajadiariausuarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajadiariausuarioLogic.setCajaDiariaUsuarios(new ArrayList<CajaDiariaUsuario>());
						cajadiariausuarioLogic.getCajaDiariaUsuarios().addAll(cajadiariausuariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajadiariausuarios=new ArrayList<CajaDiariaUsuario>();
							cajadiariausuarios.addAll(cajadiariausuariosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCajaDiariaUsuario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCajaDiariaUsuario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajadiariausuarioLogic.getCajaDiariaUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajadiariausuarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajadiariausuarioLogic.getCajaDiariaUsuarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajadiariausuarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CajaDiariaUsuario cajadiariausuario) {
		Boolean permite=true;
		
		if(this.cajadiariausuario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CajaDiariaUsuarioConstantesFunciones.getOrderByListaCajaDiariaUsuario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CajaDiariaUsuarioConstantesFunciones.getOrderByListaCajaDiariaUsuario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaDiariaUsuario cajadiariausuario:cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
				if(cajadiariausuario.getsType().equals(Constantes2.S_TOTALES)) {
					cajadiariausuarioTotales=cajadiariausuario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaDiariaUsuario cajadiariausuario:this.cajadiariausuarios) {
				if(cajadiariausuario.getsType().equals(Constantes2.S_TOTALES)) {
					cajadiariausuarioTotales=cajadiariausuario;
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
			this.cajadiariausuarioAux=new CajaDiariaUsuario();
			this.cajadiariausuarioAux.setsType(Constantes2.S_TOTALES);
			this.cajadiariausuarioAux.setIsNew(false);
			this.cajadiariausuarioAux.setIsChanged(false);
			this.cajadiariausuarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CajaDiariaUsuarioConstantesFunciones.TotalizarValoresFilaCajaDiariaUsuario(this.cajadiariausuarioLogic.getCajaDiariaUsuarios(),this.cajadiariausuarioAux);
				
				//this.cajadiariausuarioLogic.getCajaDiariaUsuarios().add(this.cajadiariausuarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CajaDiariaUsuarioConstantesFunciones.TotalizarValoresFilaCajaDiariaUsuario(this.cajadiariausuarios,this.cajadiariausuarioAux);
				
				this.cajadiariausuarios.add(this.cajadiariausuarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cajadiariausuarioTotales=new CajaDiariaUsuario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajadiariausuarioLogic.getCajaDiariaUsuarios().remove(cajadiariausuarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajadiariausuarios.remove(cajadiariausuarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cajadiariausuarioTotales=new CajaDiariaUsuario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaDiariaUsuario cajadiariausuario:cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
				if(cajadiariausuario.getsType().equals(Constantes2.S_TOTALES)) {
					cajadiariausuarioTotales=cajadiariausuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaDiariaUsuarioConstantesFunciones.TotalizarValoresFilaCajaDiariaUsuario(this.cajadiariausuarioLogic.getCajaDiariaUsuarios(),cajadiariausuarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaDiariaUsuario cajadiariausuario:this.cajadiariausuarios) {
				if(cajadiariausuario.getsType().equals(Constantes2.S_TOTALES)) {
					cajadiariausuarioTotales=cajadiariausuario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaDiariaUsuarioConstantesFunciones.TotalizarValoresFilaCajaDiariaUsuario(this.cajadiariausuarios,cajadiariausuarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCajaDiariaUsuariosBusquedaCajaDiariaUsuario()throws Exception {
		try {
			sAccionBusqueda="BusquedaCajaDiariaUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaDiariaUsuariosFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaDiariaUsuariosFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaDiariaUsuariosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaDiariaUsuariosFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCajaDiariaUsuariosBusquedaCajaDiariaUsuario(String sFinalQuery,Long id_usuario,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajadiariausuarioLogic.getCajaDiariaUsuariosBusquedaCajaDiariaUsuario(sFinalQuery,this.pagination,id_usuario,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaDiariaUsuariosFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajadiariausuarioLogic.getCajaDiariaUsuariosFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaDiariaUsuariosFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajadiariausuarioLogic.getCajaDiariaUsuariosFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaDiariaUsuariosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajadiariausuarioLogic.getCajaDiariaUsuariosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaDiariaUsuariosFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajadiariausuarioLogic.getCajaDiariaUsuariosFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosCajaDiariaUsuario() {
		this.isPermisoTodoCajaDiariaUsuario=false;
		this.isPermisoNuevoCajaDiariaUsuario=false;
		this.isPermisoActualizarCajaDiariaUsuario=false;
		this.isPermisoActualizarOriginalCajaDiariaUsuario=false;
		this.isPermisoEliminarCajaDiariaUsuario=false;
		this.isPermisoGuardarCambiosCajaDiariaUsuario=false;
		this.isPermisoConsultaCajaDiariaUsuario=true;
		this.isPermisoBusquedaCajaDiariaUsuario=true;
		this.isPermisoReporteCajaDiariaUsuario=true;
		this.isPermisoOrdenCajaDiariaUsuario=false;		
		this.isPermisoPaginacionMedioCajaDiariaUsuario=false;		
		this.isPermisoPaginacionAltoCajaDiariaUsuario=false;		
		this.isPermisoPaginacionTodoCajaDiariaUsuario=false;		
		this.isPermisoCopiarCajaDiariaUsuario=false;		
		this.isPermisoVerFormCajaDiariaUsuario=false;		
		this.isPermisoDuplicarCajaDiariaUsuario=false;
		this.isPermisoOrdenCajaDiariaUsuario=false;
	}
	
	public void setPermisosUsuarioCajaDiariaUsuario(Boolean isPermiso) {
		this.isPermisoTodoCajaDiariaUsuario=isPermiso;
		this.isPermisoNuevoCajaDiariaUsuario=isPermiso;
		this.isPermisoActualizarCajaDiariaUsuario=isPermiso;
		this.isPermisoActualizarOriginalCajaDiariaUsuario=isPermiso;
		this.isPermisoEliminarCajaDiariaUsuario=isPermiso;
		this.isPermisoGuardarCambiosCajaDiariaUsuario=isPermiso;
		this.isPermisoConsultaCajaDiariaUsuario=isPermiso;
		this.isPermisoBusquedaCajaDiariaUsuario=isPermiso;
		this.isPermisoReporteCajaDiariaUsuario=isPermiso;
		this.isPermisoOrdenCajaDiariaUsuario=isPermiso;		
		this.isPermisoPaginacionMedioCajaDiariaUsuario=isPermiso;		
		this.isPermisoPaginacionAltoCajaDiariaUsuario=isPermiso;		
		this.isPermisoPaginacionTodoCajaDiariaUsuario=isPermiso;		
		this.isPermisoCopiarCajaDiariaUsuario=isPermiso;		
		this.isPermisoVerFormCajaDiariaUsuario=isPermiso;		
		this.isPermisoDuplicarCajaDiariaUsuario=isPermiso;
		this.isPermisoOrdenCajaDiariaUsuario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCajaDiariaUsuario(Boolean isPermiso) {
		//this.isPermisoTodoCajaDiariaUsuario=isPermiso;
		this.isPermisoNuevoCajaDiariaUsuario=isPermiso;
		this.isPermisoActualizarCajaDiariaUsuario=isPermiso;
		this.isPermisoActualizarOriginalCajaDiariaUsuario=isPermiso;
		this.isPermisoEliminarCajaDiariaUsuario=isPermiso;
		this.isPermisoGuardarCambiosCajaDiariaUsuario=isPermiso;
		//this.isPermisoConsultaCajaDiariaUsuario=isPermiso;
		//this.isPermisoBusquedaCajaDiariaUsuario=isPermiso;
		//this.isPermisoReporteCajaDiariaUsuario=isPermiso;
		//this.isPermisoOrdenCajaDiariaUsuario=isPermiso;		
		//this.isPermisoPaginacionMedioCajaDiariaUsuario=isPermiso;		
		//this.isPermisoPaginacionAltoCajaDiariaUsuario=isPermiso;		
		//this.isPermisoPaginacionTodoCajaDiariaUsuario=isPermiso;		
		//this.isPermisoCopiarCajaDiariaUsuario=isPermiso;		
		//this.isPermisoDuplicarCajaDiariaUsuario=isPermiso;
		//this.isPermisoOrdenCajaDiariaUsuario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCajaDiariaUsuarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CajaDiariaUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCajaDiariaUsuario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCajaDiariaUsuarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCajaDiariaUsuarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCajaDiariaUsuarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCajaDiariaUsuarioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCajaDiariaUsuario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CajaDiariaUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CajaDiariaUsuarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCajaDiariaUsuario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCajaDiariaUsuario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCajaDiariaUsuario=this.isPermisoActualizarCajaDiariaUsuario;
			this.isPermisoEliminarCajaDiariaUsuario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCajaDiariaUsuario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCajaDiariaUsuario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCajaDiariaUsuario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCajaDiariaUsuario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCajaDiariaUsuario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaDiariaUsuario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCajaDiariaUsuario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCajaDiariaUsuario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCajaDiariaUsuario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCajaDiariaUsuario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCajaDiariaUsuario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCajaDiariaUsuario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaDiariaUsuario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCajaDiariaUsuario.setToolTipText(this.jTableDatosCajaDiariaUsuario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCajaDiariaUsuario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCajaDiariaUsuario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CajaDiariaUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CajaDiariaUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCajaDiariaUsuario() throws Exception {
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
	public void inicializarCombosForeignKeyCajaDiariaUsuarioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCajaDiariaUsuarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CajaDiariaUsuarioJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCajaDiariaUsuario()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyCaja();
			this.addItemDefectoCombosForeignKeyUsuario();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cajadiariausuarioSessionBean==null) {
				this.cajadiariausuarioSessionBean=new CajaDiariaUsuarioSessionBean();
			}

			if(!this.cajadiariausuarioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cajadiariausuarioSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.cajadiariausuarioSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
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

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.cajadiariausuarioSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
	
	public void initActionsCombosTodosForeignKeyCajaDiariaUsuario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCajaDiariaUsuario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCajaDiariaUsuario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaDiariaUsuario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(cajadiariausuario.getid_cliente(),false,"Formulario");
			this.setActualCajaForeignKey(cajadiariausuario.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cajadiariausuario.getCliente()!=null && !sTipoEvento.equals("id_clienteCajaDiariaUsuario")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(cajadiariausuario.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCajaDiariaUsuario()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.cajadiariausuarioConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualCajaForeignKey(this.cajadiariausuarioConstantesFunciones.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCajaDiariaUsuario()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCajaDiariaUsuario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCajaDiariaUsuario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCajaDiariaUsuario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCajaDiariaUsuario()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCajaDiariaUsuario(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCajaDiariaUsuario()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public CajaDiariaUsuarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CajaDiariaUsuarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CajaDiariaUsuarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cajadiariausuarioSessionBean=new CajaDiariaUsuarioSessionBean(); 
		this.cajadiariausuarioConstantesFunciones=new CajaDiariaUsuarioConstantesFunciones(); 
		this.cajadiariausuarioBean=new CajaDiariaUsuario();//(this.cajadiariausuarioConstantesFunciones); 		
		this.cajadiariausuarioReturnGeneral=new CajaDiariaUsuarioParameterReturnGeneral(); 
		
		this.cajadiariausuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajadiariausuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CajaDiariaUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CajaDiariaUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CajaDiariaUsuarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCajaDiariaUsuario(true);
			
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
			
			this.cajadiariausuarioConstantesFunciones=new CajaDiariaUsuarioConstantesFunciones(); 
			this.cajadiariausuarioBean=new CajaDiariaUsuario();//this.cajadiariausuarioConstantesFunciones); 			
			this.cajadiariausuarioReturnGeneral=new CajaDiariaUsuarioParameterReturnGeneral(); 
		
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Diaria Usuario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cajadiariausuario=new CajaDiariaUsuario();
			this.cajadiariausuarios = new ArrayList<CajaDiariaUsuario>();
			this.cajadiariausuariosAux = new ArrayList<CajaDiariaUsuario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic=new CajaDiariaUsuarioLogic();
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.cajadiariausuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cajadiariausuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCajaDiariaUsuario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaDiariaUsuario);	
					}
					
					if(this.jInternalFrameImportacionCajaDiariaUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaDiariaUsuario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCajaDiariaUsuario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCajaDiariaUsuario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaDiariaUsuario);
				this.jInternalFrameDetalleFormCajaDiariaUsuario.setVisible(false);
				this.jInternalFrameDetalleFormCajaDiariaUsuario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaDiariaUsuario);
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setVisible(false);
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCajaDiariaUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCajaDiariaUsuario);
					this.jInternalFrameImportacionCajaDiariaUsuario.setVisible(false);
					this.jInternalFrameImportacionCajaDiariaUsuario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCajaDiariaUsuario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCajaDiariaUsuario);
					this.jInternalFrameOrderByCajaDiariaUsuario.setVisible(false);
					this.jInternalFrameOrderByCajaDiariaUsuario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCajaDiariaUsuarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CajaDiariaUsuarioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cajadiariausuarioReturnGeneral=new CajaDiariaUsuarioParameterReturnGeneral();
			
			this.cajadiariausuarioParameterGeneral=new CajaDiariaUsuarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cajadiariausuarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CajaDiariaUsuarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaDiariaUsuarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajadiariausuarioSessionBean.getEsGuardarRelacionado(),this.cajadiariausuarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaDiariaUsuarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajadiariausuarioSessionBean.getEsGuardarRelacionado(),this.cajadiariausuarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=false;
			this.isVisibilidadCeldaDuplicarCajaDiariaUsuario=true;
			this.isVisibilidadCeldaCopiarCajaDiariaUsuario=true;
			this.isVisibilidadCeldaVerFormCajaDiariaUsuario=true;
			this.isVisibilidadCeldaOrdenCajaDiariaUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=false;
			this.isVisibilidadCeldaModificarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaCancelarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=false;
			
			
			this.isVisibilidadBusquedaCajaDiariaUsuario=true;
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCajaDiariaUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCajaDiariaUsuario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCajaDiariaUsuario(false);
			
			this.setPermisosUsuarioCajaDiariaUsuario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() 
				|| (this.cajadiariausuarioSessionBean.getEsGuardarRelacionado() && this.cajadiariausuarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCajaDiariaUsuarioClasesRelacionadas();
			}
			
			if(this.cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCajaDiariaUsuarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCajaDiariaUsuario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCajaDiariaUsuario();
			}
			
			if(!this.isPermisoBusquedaCajaDiariaUsuario) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCajaDiariaUsuario.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CajaDiariaUsuarioConstantesFunciones.getTiposSeleccionarCajaDiariaUsuario());
				
				this.tiposColumnasSelect=CajaDiariaUsuarioConstantesFunciones.getTiposSeleccionarCajaDiariaUsuario(true);
				
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
			//if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCajaDiariaUsuario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCajaDiariaUsuario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCajaDiariaUsuario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaDiariaUsuario() ;
			
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
			this.cajaLogic=new CajaLogic();
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
				cajadiariausuarioImplementable= (CajaDiariaUsuarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaDiariaUsuarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cajadiariausuarioImplementableHome= (CajaDiariaUsuarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaDiariaUsuarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cajadiariausuarios= new ArrayList<CajaDiariaUsuario>();
			this.cajadiariausuariosEliminados= new ArrayList<CajaDiariaUsuario>();
						
			this.isEsNuevoCajaDiariaUsuario=false;
			this.esParaAccionDesdeFormularioCajaDiariaUsuario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCajaDiariaUsuario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCajaDiariaUsuario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CajaDiariaUsuarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCajaDiariaUsuario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCajaDiariaUsuario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCajaDiariaUsuario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCajaDiariaUsuario();
			}
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCajaDiariaUsuario.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCajaDiariaUsuario.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCajaDiariaUsuario.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCajaDiariaUsuario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CajaDiariaUsuario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCajaDiariaUsuario() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCajaDiariaUsuario")) {
				iIndex=this.jInternalFrameDetalleFormCajaDiariaUsuario.jTabbedPaneRelacionesCajaDiariaUsuario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCajaDiariaUsuario.jTabbedPaneRelacionesCajaDiariaUsuario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCajaDiariaUsuario();	
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
	
	public void cargarCombosForeignKeyCajaDiariaUsuario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCajaDiariaUsuario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCajaDiariaUsuario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCajaDiariaUsuarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCajaDiariaUsuario();
		
		this.cargarCombosFrameForeignKeyCajaDiariaUsuario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCajaDiariaUsuario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCajaDiariaUsuario();
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
	
	public void jButtonNuevoCajaDiariaUsuarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
			
			if(jTableDatosCajaDiariaUsuario.getRowCount()>=1) {
				jTableDatosCajaDiariaUsuario.removeRowSelectionInterval(0, jTableDatosCajaDiariaUsuario.getRowCount()-1);						
			}
			
			this.isEsNuevoCajaDiariaUsuario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCajaDiariaUsuario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCajaDiariaUsuario(true);			
			//this.cajadiariausuario=new CajaDiariaUsuario();
			//this.cajadiariausuario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaDiariaUsuario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaDiariaUsuario() ;
			
			if(CajaDiariaUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaDiariaUsuario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cajadiariausuario);	
			this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);				
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
			if(this.cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CajaDiariaUsuario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCajaDiariaUsuarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCajaDiariaUsuario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCajaDiariaUsuario.getSelectedRows().length;			
			}
			
			cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCajaDiariaUsuario--;			
				//CajaDiariaUsuario cajadiariausuarioAux= new CajaDiariaUsuario();			
				//cajadiariausuarioAux.setId(this.iIdNuevoCajaDiariaUsuario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CajaDiariaUsuario cajadiariausuarioOrigen=new CajaDiariaUsuario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CajaDiariaUsuario cajadiariausuarioOrigen : cajadiariausuariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cajadiariausuarioOrigen =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajadiariausuarioOrigen =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCajaDiariaUsuario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cajadiariausuario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCajaDiariaUsuario(cajadiariausuarioOrigen,this.cajadiariausuario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajadiariausuarioLogic.getCajaDiariaUsuarios().add(this.cajadiariausuarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajadiariausuarios.add(this.cajadiariausuarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
				
				this.jTableDatosCajaDiariaUsuario.setRowSelectionInterval(this.getIndiceNuevoCajaDiariaUsuario(), this.getIndiceNuevoCajaDiariaUsuario());
				
				int iLastRow =  this.jTableDatosCajaDiariaUsuario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaDiariaUsuario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaDiariaUsuario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();									
		
			CajaDiariaUsuario cajadiariausuarioOrigen=new CajaDiariaUsuario();
			CajaDiariaUsuario cajadiariausuarioDestino=new CajaDiariaUsuario();
				
			cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCajaDiariaUsuario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cajadiariausuariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCajaDiariaUsuario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajadiariausuarioOrigen =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajadiariausuarioOrigen =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajadiariausuarioDestino =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajadiariausuarioDestino =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cajadiariausuarioOrigen =cajadiariausuariosSeleccionados.get(0);
				cajadiariausuarioDestino =cajadiariausuariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCajaDiariaUsuario(cajadiariausuarioOrigen,cajadiariausuarioDestino,true,false);
				
				cajadiariausuarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajadiariausuarioDestino,cajadiariausuarioLogic.getCajaDiariaUsuarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajadiariausuarioDestino,cajadiariausuarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
				
				//this.jTableDatosCajaDiariaUsuario.setRowSelectionInterval(this.getIndiceNuevoCajaDiariaUsuario(), this.getIndiceNuevoCajaDiariaUsuario());
				
				int iLastRow =  this.jTableDatosCajaDiariaUsuario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaDiariaUsuario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaDiariaUsuario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCajaDiariaUsuario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCajaDiariaUsuario.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCajaDiariaUsuario.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCajaDiariaUsuario.setVisible(!isVisible);
			this.jPanelPaginacionCajaDiariaUsuario.setVisible(!isVisible);
			this.jPanelAccionesCajaDiariaUsuario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCajaDiariaUsuario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCajaDiariaUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCajaDiariaUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCajaDiariaUsuario();
			
			this.abrirFrameOrderByCajaDiariaUsuario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCajaDiariaUsuario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCajaDiariaUsuario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaDiariaUsuario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCajaDiariaUsuario.isMaximum()) {
					this.jInternalFrameDetalleFormCajaDiariaUsuario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCajaDiariaUsuario.setSize(this.jInternalFrameDetalleFormCajaDiariaUsuario.iWidthFormulario,this.jInternalFrameDetalleFormCajaDiariaUsuario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCajaDiariaUsuario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCajaDiariaUsuario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCajaDiariaUsuario.isMaximum()) {
						this.jInternalFrameDetalleFormCajaDiariaUsuario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCajaDiariaUsuario.jContentPaneDetalleCajaDiariaUsuario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCajaDiariaUsuario.jTabbedPaneRelacionesCajaDiariaUsuario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCajaDiariaUsuario.jContentPaneDetalleCajaDiariaUsuario.getWidth(),CajaDiariaUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaDiariaUsuario.jTabbedPaneRelacionesCajaDiariaUsuario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCajaDiariaUsuario.jContentPaneDetalleCajaDiariaUsuario.getWidth(),CajaDiariaUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaDiariaUsuario.jTabbedPaneRelacionesCajaDiariaUsuario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCajaDiariaUsuario.jContentPaneDetalleCajaDiariaUsuario.getWidth(),CajaDiariaUsuarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCajaDiariaUsuario.setVisible(true);
	        this.jInternalFrameDetalleFormCajaDiariaUsuario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCajaDiariaUsuario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCajaDiariaUsuario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCajaDiariaUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaDiariaUsuario,false,this);
				} else {
					this.jInternalFrameOrderByCajaDiariaUsuario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaDiariaUsuario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCajaDiariaUsuario);
				this.jInternalFrameOrderByCajaDiariaUsuario.setVisible(false);
				this.jInternalFrameOrderByCajaDiariaUsuario.setSelected(false);
				
				this.jInternalFrameOrderByCajaDiariaUsuario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaDiariaUsuario"));
				
				this.inicializarActualizarBindingTablaOrderByCajaDiariaUsuario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCajaDiariaUsuario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCajaDiariaUsuario==null) {
				
				this.jInternalFrameImportacionCajaDiariaUsuario=new ImportacionJInternalFrame(CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaDiariaUsuario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCajaDiariaUsuario);
				this.jInternalFrameImportacionCajaDiariaUsuario.setVisible(false);
				this.jInternalFrameImportacionCajaDiariaUsuario.setSelected(false);


				this.jInternalFrameImportacionCajaDiariaUsuario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaDiariaUsuario"));
				this.jInternalFrameImportacionCajaDiariaUsuario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaDiariaUsuario"));
				this.jInternalFrameImportacionCajaDiariaUsuario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaDiariaUsuario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCajaDiariaUsuario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario==null) {
				this.jInternalFrameReporteDinamicoCajaDiariaUsuario=new ReporteDinamicoJInternalFrame(CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaDiariaUsuario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaDiariaUsuario);
				this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setVisible(false);
				this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaDiariaUsuario"));
				this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaDiariaUsuario"));
				this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaDiariaUsuario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaDiariaUsuario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCajaDiariaUsuario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaDiariaUsuario);
			
	       	this.jInternalFrameDetalleFormCajaDiariaUsuario.setVisible(false);
	        this.jInternalFrameDetalleFormCajaDiariaUsuario.setSelected(false);
			
			//this.jInternalFrameDetalleFormCajaDiariaUsuario.dispose();
			//this.jInternalFrameDetalleFormCajaDiariaUsuario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCajaDiariaUsuario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setVisible(true);
	        this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCajaDiariaUsuario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCajaDiariaUsuario.setVisible(true);
	        this.jInternalFrameImportacionCajaDiariaUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCajaDiariaUsuario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCajaDiariaUsuario.setVisible(true);
	        this.jInternalFrameOrderByCajaDiariaUsuario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCajaDiariaUsuario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCajaDiariaUsuario.setVisible(false);
	        this.jInternalFrameOrderByCajaDiariaUsuario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCajaDiariaUsuario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setVisible(false);
	        this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCajaDiariaUsuario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCajaDiariaUsuario.setVisible(false);
	        this.jInternalFrameImportacionCajaDiariaUsuario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCajaDiariaUsuario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCajaDiariaUsuario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCajaDiariaUsuario(true);
			//this.isEsNuevoCajaDiariaUsuario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCajaDiariaUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaDiariaUsuario(false) ;
			
			if(cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CajaDiariaUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaDiariaUsuario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaDiariaUsuario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCajaDiariaUsuarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCajaDiariaUsuario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCajaDiariaUsuario(true);
			//this.isEsNuevoCajaDiariaUsuario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cajadiariausuario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCajaDiariaUsuario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCajaDiariaUsuario(false) ;
			
			if(CajaDiariaUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaDiariaUsuario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaDiariaUsuario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.cajadiariausuarioConstantesFunciones.cargarid_clienteCajaDiariaUsuario) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaDiariaUsuario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaDiariaUsuario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCajaDiariaUsuario(false);
			
			//if(!this.isEsNuevoCajaDiariaUsuario) {								
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				
			}
			
			if(this.permiteMantenimiento(this.cajadiariausuario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCajaDiariaUsuario=true;
					this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
					this.isEsNuevoCajaDiariaUsuario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCajaDiariaUsuario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCajaDiariaUsuario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaDiariaUsuario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaDiariaUsuario(false);
				
				this.habilitarDeshabilitarControlesCajaDiariaUsuario(false);
			
												
				
				if(CajaDiariaUsuarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCajaDiariaUsuario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,cajadiariausuarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCajaDiariaUsuario(this.cajadiariausuario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCajaDiariaUsuario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cajadiariausuarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cajadiariausuario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CajaDiariaUsuario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaUsuario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				this.cajadiariausuario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				this.cajadiariausuario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cajadiariausuario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CajaDiariaUsuarioModel) this.jTableDatosCajaDiariaUsuario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCajaDiariaUsuario=true;
				this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
				this.isEsNuevoCajaDiariaUsuario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaDiariaUsuario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaDiariaUsuario(false);
				
				this.habilitarDeshabilitarControlesCajaDiariaUsuario(false);
				
				
				
				if(CajaDiariaUsuarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCajaDiariaUsuario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCajaDiariaUsuario.getRowCount()>=1) {
				jTableDatosCajaDiariaUsuario.removeRowSelectionInterval(0, jTableDatosCajaDiariaUsuario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCajaDiariaUsuario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaDiariaUsuario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaDiariaUsuario(false) ;
			
			this.isEsNuevoCajaDiariaUsuario=false;
			
			if(CajaDiariaUsuarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCajaDiariaUsuario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCajaDiariaUsuario(false);
				
				//SI ES MANUAL
				if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCajaDiariaUsuario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCajaDiariaUsuario--;			
			//CajaDiariaUsuario cajadiariausuarioAux= new CajaDiariaUsuario();			
			//cajadiariausuarioAux.setId(this.iIdNuevoCajaDiariaUsuario);
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCajaDiariaUsuario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
			
			this.cajadiariausuario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cajadiariausuarioLogic.getCajaDiariaUsuarios().add(this.cajadiariausuarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cajadiariausuarios.add(this.cajadiariausuarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
			
			this.jTableDatosCajaDiariaUsuario.setRowSelectionInterval(this.getIndiceNuevoCajaDiariaUsuario(), this.getIndiceNuevoCajaDiariaUsuario());
			
			int iLastRow =  this.jTableDatosCajaDiariaUsuario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCajaDiariaUsuario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCajaDiariaUsuario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaDiariaUsuario(false);
			
			//SI ES MANUAL
			if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaDiariaUsuario();
			}
			
			//this.abrirFrameTreeCajaDiariaUsuario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCajaDiariaUsuario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCajaDiariaUsuario.setFileImportacion(this.jInternalFrameImportacionCajaDiariaUsuario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCajaDiariaUsuario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCajaDiariaUsuario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCajaDiariaUsuario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCajaDiariaUsuario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();		

		cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CajaDiariaUsuarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CajaDiariaUsuarioBaseDesign.jrxml";
			
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
			
			this.generarReporteCajaDiariaUsuarios("Todos",cajadiariausuariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUsuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUsuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUsuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUsuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_btotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_btotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_btotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_btotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nanciamiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nanciamiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nanciamiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nanciamiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL:
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
		
		if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoria="nombre_caja";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO:
					sNombreCampoCategoria="nombre_usuario";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoria="codigo_cliente";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="subtotal";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoria="financiamiento";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoria="flete";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoriaValor="nombre_caja";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO:
					sNombreCampoCategoriaValor="nombre_usuario";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoriaValor="codigo_cliente";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="subtotal";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoriaValor="financiamiento";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoriaValor="flete";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_caja");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_usuario");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cliente");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Subtotal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"subtotal");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Financiamiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"financiamiento");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Flete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"flete");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL:
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
	
	public void jButtonGenerarExcelReporteDinamicoCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();		
		
		cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariausuario";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CajaDiariaUsuarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getnombre_caja());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getnombre_usuario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getcodigo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getsubtotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IVA);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getfinanciamiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getflete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_ICE);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.getice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(CajaDiariaUsuario cajadiariausuario:cajadiariausuariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajadiariausuario.gettotal());
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
			//	this.getFilaCabeceraExportarExcelCajaDiariaUsuario(row);				
			//	iRow++;
			//}				
			
			//for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCajaDiariaUsuario(cajadiariausuarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Usuario",JOptionPane.INFORMATION_MESSAGE);
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
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaDiariaUsuario(false);
			
			//SI ES MANUAL
			if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaDiariaUsuario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaDiariaUsuario(false);
			
			//SI ES MANUAL
			if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaDiariaUsuario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaDiariaUsuario(false);
			
			//SI ES MANUAL
			if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaDiariaUsuario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCajaDiariaUsuario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCajaDiariaUsuario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCajaDiariaUsuario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCajaDiariaUsuario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCajaDiariaUsuario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCajaDiariaUsuario.setMinimumSize(dimensionMinimum);
		this.jTableDatosCajaDiariaUsuario.setMaximumSize(dimensionMaximum);
		this.jTableDatosCajaDiariaUsuario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCajaDiariaUsuario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCajaDiariaUsuario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCajaDiariaUsuario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCajaDiariaUsuario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCajaDiariaUsuario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCajaDiariaUsuario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaDiariaUsuario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCajaDiariaUsuario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCajaDiariaUsuario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCajaDiariaUsuario();
		
		this.inicializarActualizarBindingBotonesManualCajaDiariaUsuario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCajaDiariaUsuario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaDiariaUsuario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCajaDiariaUsuario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCajaDiariaUsuario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCajaDiariaUsuario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCajaDiariaUsuario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCajaDiariaUsuario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCajaDiariaUsuario.jCheckBoxPostAccionNuevoCajaDiariaUsuario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCajaDiariaUsuario.jCheckBoxPostAccionSinCerrarCajaDiariaUsuario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCajaDiariaUsuario.jCheckBoxPostAccionSinMensajeCajaDiariaUsuario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCajaDiariaUsuario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCajaDiariaUsuario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCajaDiariaUsuario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
				this.jInternalFrameDetalleFormCajaDiariaUsuario.jCheckBoxPostAccionNuevoCajaDiariaUsuario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCajaDiariaUsuario.jCheckBoxPostAccionSinCerrarCajaDiariaUsuario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCajaDiariaUsuario.jCheckBoxPostAccionSinMensajeCajaDiariaUsuario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCajaDiariaUsuario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCajaDiariaUsuario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCajaDiariaUsuario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCajaDiariaUsuario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCajaDiariaUsuario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCajaDiariaUsuario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCajaDiariaUsuario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCajaDiariaUsuario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCajaDiariaUsuario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCajaDiariaUsuario(Boolean esInicializar) throws Exception {
		try	{	
			if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCajaDiariaUsuario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCajaDiariaUsuario() throws Exception {
		try	{
			if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaDiariaUsuario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaDiariaUsuario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaDiariaUsuario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCajaDiariaUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCajaDiariaUsuario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCajaDiariaUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCajaDiariaUsuario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCajaDiariaUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCajaDiariaUsuario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCajaDiariaUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCajaDiariaUsuario.addItem(reporte);
			}
			
			
			if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCajaDiariaUsuario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCajaDiariaUsuario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCajaDiariaUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCajaDiariaUsuario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCajaDiariaUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCajaDiariaUsuario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCajaDiariaUsuario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCajaDiariaUsuario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCajaDiariaUsuario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaDiariaUsuario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaDiariaUsuario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario!=null) {
				this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario!=null) {
				this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario!=null) {
				
				if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CajaDiariaUsuarioConstantesFunciones.getTiposSeleccionarCajaDiariaUsuario(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CajaDiariaUsuarioConstantesFunciones.getTiposSeleccionarCajaDiariaUsuario(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CajaDiariaUsuarioConstantesFunciones.getTiposSeleccionarCajaDiariaUsuario(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCajaDiariaUsuario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.getSelectedItem()!=null){this.id_usuarioBusquedaCajaDiariaUsuario=((Usuario)this.jComboBoxid_usuarioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.getSelectedItem()).getId();}
		this.fecha_inicioBusquedaCajaDiariaUsuario=new Date(this.jDateChooserfecha_inicioBusquedaCajaDiariaUsuarioCajaDiariaUsuario.getDate().getTime());
		this.fecha_finBusquedaCajaDiariaUsuario=new Date(this.jDateChooserfecha_finBusquedaCajaDiariaUsuarioCajaDiariaUsuario.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCajaDiariaUsuario(Boolean esInicializar) throws Exception {				
		if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCajaDiariaUsuario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCajaDiariaUsuario() throws Exception {
		this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCajaDiariaUsuario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCajaDiariaUsuarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCajaDiariaUsuario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cajadiariausuarioLogic.getCajaDiariaUsuarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cajadiariausuarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCajaDiariaUsuario.setModel(new CajaDiariaUsuarioModel(this.cajadiariausuarioLogic.getCajaDiariaUsuarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCajaDiariaUsuario.setModel(new CajaDiariaUsuarioModel(this.cajadiariausuarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCajaDiariaUsuario!=null && this.jInternalFrameOrderByCajaDiariaUsuario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCajaDiariaUsuario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO,cajadiariausuarioConstantesFunciones.resaltarSeleccionarCajaDiariaUsuario,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CajaDiariaUsuarioConstantesFunciones.SCLASSWEBTITULO,cajadiariausuarioConstantesFunciones.resaltarSeleccionarCajaDiariaUsuario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_ID));

		if(this.cajadiariausuarioConstantesFunciones.mostraridCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariausuarioConstantesFunciones.resaltaridCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activaridCajaDiariaUsuario,iSizeTabla,this,true,"idCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltaridCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activaridCajaDiariaUsuario,this,true,"idCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA));

		if(this.cajadiariausuarioConstantesFunciones.mostrarnombre_cajaCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajadiariausuarioConstantesFunciones.resaltarnombre_cajaCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarnombre_cajaCajaDiariaUsuario,iSizeTabla,this,true,"nombre_cajaCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltarnombre_cajaCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarnombre_cajaCajaDiariaUsuario,this,true,"nombre_cajaCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO));

		if(this.cajadiariausuarioConstantesFunciones.mostrarnombre_usuarioCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajadiariausuarioConstantesFunciones.resaltarnombre_usuarioCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarnombre_usuarioCajaDiariaUsuario,iSizeTabla,this,true,"nombre_usuarioCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltarnombre_usuarioCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarnombre_usuarioCajaDiariaUsuario,this,true,"nombre_usuarioCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL));

		if(this.cajadiariausuarioConstantesFunciones.mostrarsecuencialCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajadiariausuarioConstantesFunciones.resaltarsecuencialCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarsecuencialCajaDiariaUsuario,iSizeTabla,this,true,"secuencialCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltarsecuencialCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarsecuencialCajaDiariaUsuario,this,true,"secuencialCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE));

		if(this.cajadiariausuarioConstantesFunciones.mostrarcodigo_clienteCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajadiariausuarioConstantesFunciones.resaltarcodigo_clienteCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarcodigo_clienteCajaDiariaUsuario,iSizeTabla,this,true,"codigo_clienteCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltarcodigo_clienteCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarcodigo_clienteCajaDiariaUsuario,this,true,"codigo_clienteCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.cajadiariausuarioConstantesFunciones.mostrarnombre_clienteCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajadiariausuarioConstantesFunciones.resaltarnombre_clienteCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarnombre_clienteCajaDiariaUsuario,iSizeTabla,this,true,"nombre_clienteCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltarnombre_clienteCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarnombre_clienteCajaDiariaUsuario,this,true,"nombre_clienteCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL));

		if(this.cajadiariausuarioConstantesFunciones.mostrarsubtotalCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariausuarioConstantesFunciones.resaltarsubtotalCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarsubtotalCajaDiariaUsuario,iSizeTabla,this,true,"subtotalCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltarsubtotalCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarsubtotalCajaDiariaUsuario,this,true,"subtotalCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_IVA));

		if(this.cajadiariausuarioConstantesFunciones.mostrarivaCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariausuarioConstantesFunciones.resaltarivaCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarivaCajaDiariaUsuario,iSizeTabla,this,true,"ivaCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltarivaCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarivaCajaDiariaUsuario,this,true,"ivaCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO));

		if(this.cajadiariausuarioConstantesFunciones.mostrardescuentoCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariausuarioConstantesFunciones.resaltardescuentoCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activardescuentoCajaDiariaUsuario,iSizeTabla,this,true,"descuentoCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltardescuentoCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activardescuentoCajaDiariaUsuario,this,true,"descuentoCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO));

		if(this.cajadiariausuarioConstantesFunciones.mostrarfinanciamientoCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariausuarioConstantesFunciones.resaltarfinanciamientoCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarfinanciamientoCajaDiariaUsuario,iSizeTabla,this,true,"financiamientoCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltarfinanciamientoCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarfinanciamientoCajaDiariaUsuario,this,true,"financiamientoCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE));

		if(this.cajadiariausuarioConstantesFunciones.mostrarfleteCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariausuarioConstantesFunciones.resaltarfleteCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarfleteCajaDiariaUsuario,iSizeTabla,this,true,"fleteCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltarfleteCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activarfleteCajaDiariaUsuario,this,true,"fleteCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_ICE));

		if(this.cajadiariausuarioConstantesFunciones.mostrariceCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariausuarioConstantesFunciones.resaltariceCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activariceCajaDiariaUsuario,iSizeTabla,this,true,"iceCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltariceCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activariceCajaDiariaUsuario,this,true,"iceCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL));

		if(this.cajadiariausuarioConstantesFunciones.mostrartotalCajaDiariaUsuario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajadiariausuarioConstantesFunciones.resaltartotalCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activartotalCajaDiariaUsuario,iSizeTabla,this,true,"totalCajaDiariaUsuario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajadiariausuarioConstantesFunciones.resaltartotalCajaDiariaUsuario,this.cajadiariausuarioConstantesFunciones.activartotalCajaDiariaUsuario,this,true,"totalCajaDiariaUsuario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaDiariaUsuarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajadiariausuarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajadiariausuarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaDiariaUsuario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajadiariausuarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajadiariausuarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaDiariaUsuario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cajadiariausuarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cajadiariausuarioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCajaDiariaUsuario.addColumn(tableColumn);
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
			
			this.jTableDatosCajaDiariaUsuario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCajaDiariaUsuario.moveColumn(this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCajaDiariaUsuario.moveColumn(this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCajaDiariaUsuario.moveColumn(this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCajaDiariaUsuario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCajaDiariaUsuario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCajaDiariaUsuario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCajaDiariaUsuario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCajaDiariaUsuario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCajaDiariaUsuario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cajadiariausuarioLogic.getCajaDiariaUsuarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cajadiariausuarios.size()-1;
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
		//this.jTableDatosCajaDiariaUsuario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCajaDiariaUsuario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCajaDiariaUsuario();
			
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
				
				//this.isEsNuevoCajaDiariaUsuario=false;
					
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
				if(this.cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaDiariaUsuario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaDiariaUsuario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cajadiariausuario.getsType().equals("DUPLICADO")
				   || this.cajadiariausuario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCajaDiariaUsuario=true;
				
				} else {
					this.isEsNuevoCajaDiariaUsuario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
					if(this.cajadiariausuario.getId()>=0 && !this.cajadiariausuario.getIsNew()) {						
						this.isEsNuevoCajaDiariaUsuario=false;
						
					} else {
						this.isEsNuevoCajaDiariaUsuario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCajaDiariaUsuario(esRelaciones);						
				
				this.seleccionarCajaDiariaUsuario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cajadiariausuario.getId()<0) {
					this.isEsNuevoCajaDiariaUsuario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCajaDiariaUsuario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCajaDiariaUsuario(evt,rowIndex);
				}	
				
				if(this.cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CajaDiariaUsuario: " + this.dDif); 
					}
				}								
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCajaDiariaUsuario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cajadiariausuario)) {
					if(this.cajadiariausuario.getId()>0) {
						this.cajadiariausuario.setIsDeleted(true);
						
						this.cajadiariausuariosEliminados.add(this.cajadiariausuario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajadiariausuarioLogic.getCajaDiariaUsuarios().remove(this.cajadiariausuario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajadiariausuarios.remove(this.cajadiariausuario);				
					}
					
					
					((CajaDiariaUsuarioModel) this.jTableDatosCajaDiariaUsuario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCajaDiariaUsuario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCajaDiariaUsuario) {
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaDiariaUsuario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaDiariaUsuario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCajaDiariaUsuario(this.cajadiariausuario);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.cajadiariausuarioConstantesFunciones.cargarid_clienteCajaDiariaUsuario || this.cajadiariausuarioConstantesFunciones.event_dependid_clienteCajaDiariaUsuario) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.cajadiariausuario.getid_cliente());
									//this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(cajadiariausuario.getCliente()!=null) {
							this.clientesForeignKey.add(cajadiariausuario.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.cajadiariausuario.getid_cliente(),false,"Formulario");

					//Caja
					if(!this.cajadiariausuarioConstantesFunciones.cargarid_cajaCajaDiariaUsuario || this.cajadiariausuarioConstantesFunciones.event_dependid_cajaCajaDiariaUsuario) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.cajadiariausuario.getid_caja());
									//this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(cajadiariausuario.getCaja()!=null) {
							this.cajasForeignKey.add(cajadiariausuario.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.cajadiariausuario.getid_caja(),false,"Formulario");

					//Usuario
					if(!this.cajadiariausuarioConstantesFunciones.cargarid_usuarioCajaDiariaUsuario || this.cajadiariausuarioConstantesFunciones.event_dependid_usuarioCajaDiariaUsuario) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.cajadiariausuario.getid_usuario());
									//this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(cajadiariausuario.getUsuario()!=null) {
							this.usuariosForeignKey.add(cajadiariausuario.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.cajadiariausuario.getid_usuario(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCajaDiariaUsuario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCajaDiariaUsuario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaDiariaUsuario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCajaDiariaUsuario(cajadiariausuario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCajaDiariaUsuario(cajadiariausuario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCajaDiariaUsuario(cajadiariausuario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCajaDiariaUsuario(cajadiariausuario);
	}
	
	public void setVariablesObjetoActualToFormularioCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelidCajaDiariaUsuario.setText(cajadiariausuario.getId().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_cajaCajaDiariaUsuario.setText(cajadiariausuario.getnombre_caja());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldnombre_usuarioCajaDiariaUsuario.setText(cajadiariausuario.getnombre_usuario());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsecuencialCajaDiariaUsuario.setText(cajadiariausuario.getsecuencial());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldcodigo_clienteCajaDiariaUsuario.setText(cajadiariausuario.getcodigo_cliente());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_clienteCajaDiariaUsuario.setText(cajadiariausuario.getnombre_cliente());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsubtotalCajaDiariaUsuario.setText(cajadiariausuario.getsubtotal().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldivaCajaDiariaUsuario.setText(cajadiariausuario.getiva().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFielddescuentoCajaDiariaUsuario.setText(cajadiariausuario.getdescuento().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfinanciamientoCajaDiariaUsuario.setText(cajadiariausuario.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfleteCajaDiariaUsuario.setText(cajadiariausuario.getflete().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldiceCajaDiariaUsuario.setText(cajadiariausuario.getice().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldtotalCajaDiariaUsuario.setText(cajadiariausuario.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CajaDiariaUsuario cajadiariausuarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cajadiariausuarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CajaDiariaUsuario cajadiariausuarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cajadiariausuarioLocal=this.cajadiariausuario;
			} else {
				cajadiariausuarioLocal=this.cajadiariausuarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cajadiariausuarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCajaDiariaUsuario(cajadiariausuarioLocal,true);
					
					if(cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cajadiariausuarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cajadiariausuarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(cajadiariausuario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(cajadiariausuario);
	}
	
	public void setVariablesFormularioToObjetoActualCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(cajadiariausuario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelidCajaDiariaUsuario.getText()==null || this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelidCajaDiariaUsuario.getText()=="" || this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelidCajaDiariaUsuario.getText()=="Id") {
				this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelidCajaDiariaUsuario.setText("0");
			}

			if(conColumnasBase) {cajadiariausuario.setId(Long.parseLong(this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelidCajaDiariaUsuario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelIdCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.setnombre_caja(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_cajaCajaDiariaUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelnombre_cajaCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.setnombre_usuario(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldnombre_usuarioCajaDiariaUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelnombre_usuarioCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.setsecuencial(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsecuencialCajaDiariaUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelsecuencialCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.setcodigo_cliente(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldcodigo_clienteCajaDiariaUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelcodigo_clienteCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.setnombre_cliente(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_clienteCajaDiariaUsuario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelnombre_clienteCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.setsubtotal(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsubtotalCajaDiariaUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelsubtotalCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.setiva(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldivaCajaDiariaUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelivaCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFielddescuentoCajaDiariaUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabeldescuentoCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.setfinanciamiento(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfinanciamientoCajaDiariaUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelfinanciamientoCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.setflete(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfleteCajaDiariaUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelfleteCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.setice(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldiceCajaDiariaUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabeliceCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajadiariausuario.settotal(Double.parseDouble(this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldtotalCajaDiariaUsuario.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabeltotalCajaDiariaUsuario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuarioBean,CajaDiariaUsuario cajadiariausuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuarioOrigen,CajaDiariaUsuario cajadiariausuario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajadiariausuarioOrigen.getId()!=null && !cajadiariausuarioOrigen.getId().equals(0L))) {cajadiariausuario.setId(cajadiariausuarioOrigen.getId());}}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getid_cliente()!=null && !cajadiariausuarioOrigen.getid_cliente().equals(-1L))) {cajadiariausuario.setid_cliente(cajadiariausuarioOrigen.getid_cliente());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getid_caja()!=null && !cajadiariausuarioOrigen.getid_caja().equals(-1L))) {cajadiariausuario.setid_caja(cajadiariausuarioOrigen.getid_caja());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getfecha_inicio()!=null && !cajadiariausuarioOrigen.getfecha_inicio().equals(new Date()))) {cajadiariausuario.setfecha_inicio(cajadiariausuarioOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getfecha_fin()!=null && !cajadiariausuarioOrigen.getfecha_fin().equals(new Date()))) {cajadiariausuario.setfecha_fin(cajadiariausuarioOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getnombre_caja()!=null && !cajadiariausuarioOrigen.getnombre_caja().equals(""))) {cajadiariausuario.setnombre_caja(cajadiariausuarioOrigen.getnombre_caja());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getnombre_usuario()!=null && !cajadiariausuarioOrigen.getnombre_usuario().equals(""))) {cajadiariausuario.setnombre_usuario(cajadiariausuarioOrigen.getnombre_usuario());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getsecuencial()!=null && !cajadiariausuarioOrigen.getsecuencial().equals(""))) {cajadiariausuario.setsecuencial(cajadiariausuarioOrigen.getsecuencial());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getcodigo_cliente()!=null && !cajadiariausuarioOrigen.getcodigo_cliente().equals(""))) {cajadiariausuario.setcodigo_cliente(cajadiariausuarioOrigen.getcodigo_cliente());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getnombre_cliente()!=null && !cajadiariausuarioOrigen.getnombre_cliente().equals(""))) {cajadiariausuario.setnombre_cliente(cajadiariausuarioOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getsubtotal()!=null && !cajadiariausuarioOrigen.getsubtotal().equals(0.0))) {cajadiariausuario.setsubtotal(cajadiariausuarioOrigen.getsubtotal());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getiva()!=null && !cajadiariausuarioOrigen.getiva().equals(0.0))) {cajadiariausuario.setiva(cajadiariausuarioOrigen.getiva());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getdescuento()!=null && !cajadiariausuarioOrigen.getdescuento().equals(0.0))) {cajadiariausuario.setdescuento(cajadiariausuarioOrigen.getdescuento());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getfinanciamiento()!=null && !cajadiariausuarioOrigen.getfinanciamiento().equals(0.0))) {cajadiariausuario.setfinanciamiento(cajadiariausuarioOrigen.getfinanciamiento());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getflete()!=null && !cajadiariausuarioOrigen.getflete().equals(0.0))) {cajadiariausuario.setflete(cajadiariausuarioOrigen.getflete());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.getice()!=null && !cajadiariausuarioOrigen.getice().equals(0.0))) {cajadiariausuario.setice(cajadiariausuarioOrigen.getice());}
			if(conDefault || (!conDefault && cajadiariausuarioOrigen.gettotal()!=null && !cajadiariausuarioOrigen.gettotal().equals(0.0))) {cajadiariausuario.settotal(cajadiariausuarioOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelidCajaDiariaUsuario.setText(cajadiariausuario.getId().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_cajaCajaDiariaUsuario.setText(cajadiariausuario.getnombre_caja());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldnombre_usuarioCajaDiariaUsuario.setText(cajadiariausuario.getnombre_usuario());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsecuencialCajaDiariaUsuario.setText(cajadiariausuario.getsecuencial());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldcodigo_clienteCajaDiariaUsuario.setText(cajadiariausuario.getcodigo_cliente());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_clienteCajaDiariaUsuario.setText(cajadiariausuario.getnombre_cliente());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsubtotalCajaDiariaUsuario.setText(cajadiariausuario.getsubtotal().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldivaCajaDiariaUsuario.setText(cajadiariausuario.getiva().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFielddescuentoCajaDiariaUsuario.setText(cajadiariausuario.getdescuento().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfinanciamientoCajaDiariaUsuario.setText(cajadiariausuario.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfleteCajaDiariaUsuario.setText(cajadiariausuario.getflete().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldiceCajaDiariaUsuario.setText(cajadiariausuario.getice().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldtotalCajaDiariaUsuario.setText(cajadiariausuario.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaDiariaUsuario(CajaDiariaUsuarioBean cajadiariausuarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelidCajaDiariaUsuario.setText(cajadiariausuarioBean.getId().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_cajaCajaDiariaUsuario.setText(cajadiariausuarioBean.getnombre_caja());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldnombre_usuarioCajaDiariaUsuario.setText(cajadiariausuarioBean.getnombre_usuario());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsecuencialCajaDiariaUsuario.setText(cajadiariausuarioBean.getsecuencial());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldcodigo_clienteCajaDiariaUsuario.setText(cajadiariausuarioBean.getcodigo_cliente());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_clienteCajaDiariaUsuario.setText(cajadiariausuarioBean.getnombre_cliente());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsubtotalCajaDiariaUsuario.setText(cajadiariausuarioBean.getsubtotal().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldivaCajaDiariaUsuario.setText(cajadiariausuarioBean.getiva().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFielddescuentoCajaDiariaUsuario.setText(cajadiariausuarioBean.getdescuento().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfinanciamientoCajaDiariaUsuario.setText(cajadiariausuarioBean.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfleteCajaDiariaUsuario.setText(cajadiariausuarioBean.getflete().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldiceCajaDiariaUsuario.setText(cajadiariausuarioBean.getice().toString());
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldtotalCajaDiariaUsuario.setText(cajadiariausuarioBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCajaDiariaUsuario(CajaDiariaUsuarioParameterReturnGeneral cajadiariausuarioReturnGeneral,CajaDiariaUsuarioBean cajadiariausuarioBean,Boolean conDefault) throws Exception { 
		try {
			CajaDiariaUsuario cajadiariausuarioLocal=new CajaDiariaUsuario();
			
			cajadiariausuarioLocal=cajadiariausuarioReturnGeneral.getCajaDiariaUsuario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajadiariausuarioLocal.getId()!=null && !cajadiariausuarioLocal.getId().equals(0L))) {cajadiariausuarioBean.setId(cajadiariausuarioLocal.getId());}}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.getnombre_caja()!=null && !cajadiariausuarioLocal.getnombre_caja().equals(""))) {cajadiariausuarioBean.setnombre_caja(cajadiariausuarioLocal.getnombre_caja());}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.getnombre_usuario()!=null && !cajadiariausuarioLocal.getnombre_usuario().equals(""))) {cajadiariausuarioBean.setnombre_usuario(cajadiariausuarioLocal.getnombre_usuario());}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.getsecuencial()!=null && !cajadiariausuarioLocal.getsecuencial().equals(""))) {cajadiariausuarioBean.setsecuencial(cajadiariausuarioLocal.getsecuencial());}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.getcodigo_cliente()!=null && !cajadiariausuarioLocal.getcodigo_cliente().equals(""))) {cajadiariausuarioBean.setcodigo_cliente(cajadiariausuarioLocal.getcodigo_cliente());}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.getnombre_cliente()!=null && !cajadiariausuarioLocal.getnombre_cliente().equals(""))) {cajadiariausuarioBean.setnombre_cliente(cajadiariausuarioLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.getsubtotal()!=null && !cajadiariausuarioLocal.getsubtotal().equals(0.0))) {cajadiariausuarioBean.setsubtotal(cajadiariausuarioLocal.getsubtotal());}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.getiva()!=null && !cajadiariausuarioLocal.getiva().equals(0.0))) {cajadiariausuarioBean.setiva(cajadiariausuarioLocal.getiva());}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.getdescuento()!=null && !cajadiariausuarioLocal.getdescuento().equals(0.0))) {cajadiariausuarioBean.setdescuento(cajadiariausuarioLocal.getdescuento());}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.getfinanciamiento()!=null && !cajadiariausuarioLocal.getfinanciamiento().equals(0.0))) {cajadiariausuarioBean.setfinanciamiento(cajadiariausuarioLocal.getfinanciamiento());}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.getflete()!=null && !cajadiariausuarioLocal.getflete().equals(0.0))) {cajadiariausuarioBean.setflete(cajadiariausuarioLocal.getflete());}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.getice()!=null && !cajadiariausuarioLocal.getice().equals(0.0))) {cajadiariausuarioBean.setice(cajadiariausuarioLocal.getice());}
			if(conDefault || (!conDefault && cajadiariausuarioLocal.gettotal()!=null && !cajadiariausuarioLocal.gettotal().equals(0.0))) {cajadiariausuarioBean.settotal(cajadiariausuarioLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCajaDiariaUsuarioGenerico(Long idCajaDiariaUsuarioSeleccionado,JComboBox jComboBoxCajaDiariaUsuario,List<CajaDiariaUsuario> cajadiariausuariosLocal)throws Exception {
		try {
			CajaDiariaUsuario  cajadiariausuarioTemp=null;

			for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuariosLocal) {
				if(cajadiariausuarioAux.getId()!=null && cajadiariausuarioAux.getId().equals(idCajaDiariaUsuarioSeleccionado)) {
					cajadiariausuarioTemp=cajadiariausuarioAux;
					break;
				}
			}

			jComboBoxCajaDiariaUsuario.setSelectedItem(cajadiariausuarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCajaDiariaUsuarioGenerico(JComboBox jComboBoxCajaDiariaUsuario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaDiariaUsuario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCajaDiariaUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaDiariaUsuario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCajaDiariaUsuario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCajaDiariaUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCajaDiariaUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajadiariausuario=(CajaDiariaUsuario) cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajadiariausuario =(CajaDiariaUsuario) cajadiariausuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cajadiariausuario.getIsNew() && !cajadiariausuario.getIsChanged() && !cajadiariausuario.getIsDeleted()) {
				sDescripcion=cajadiariausuario.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cajadiariausuario.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!cajadiariausuario.getIsNew() && !cajadiariausuario.getIsChanged() && !cajadiariausuario.getIsDeleted()) {
				sDescripcion=cajadiariausuario.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=cajadiariausuario.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!cajadiariausuario.getIsNew() && !cajadiariausuario.getIsChanged() && !cajadiariausuario.getIsDeleted()) {
				sDescripcion=cajadiariausuario.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=cajadiariausuario.getcaja_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!cajadiariausuario.getIsNew() && !cajadiariausuario.getIsChanged() && !cajadiariausuario.getIsDeleted()) {
				sDescripcion=cajadiariausuario.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=cajadiariausuario.getusuario_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CajaDiariaUsuario cajadiariausuarioRow=new CajaDiariaUsuario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajadiariausuarioRow=(CajaDiariaUsuario) cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajadiariausuarioRow=(CajaDiariaUsuario) cajadiariausuarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCajaDiariaUsuario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaUsuario && this.isPermisoNuevoCajaDiariaUsuario));			
			this.jButtonDuplicarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaDuplicarCajaDiariaUsuario && this.isPermisoDuplicarCajaDiariaUsuario));			
			this.jButtonCopiarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaCopiarCajaDiariaUsuario && this.isPermisoCopiarCajaDiariaUsuario));
			this.jButtonVerFormCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaVerFormCajaDiariaUsuario && this.isPermisoVerFormCajaDiariaUsuario));
			
			this.jButtonAbrirOrderByCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaUsuario && this.isPermisoOrdenCajaDiariaUsuario));			
			
			this.jButtonNuevoRelacionesCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario && this.isPermisoNuevoCajaDiariaUsuario));			
			this.jButtonNuevoGuardarCambiosCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaUsuario && this.isPermisoNuevoCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario));
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonModificarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaModificarCajaDiariaUsuario && this.isPermisoActualizarCajaDiariaUsuario));	
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonActualizarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaActualizarCajaDiariaUsuario && this.isPermisoActualizarCajaDiariaUsuario));	
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonEliminarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaEliminarCajaDiariaUsuario && this.isPermisoEliminarCajaDiariaUsuario));
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonCancelarCajaDiariaUsuario.setVisible(this.isVisibilidadCeldaCancelarCajaDiariaUsuario);							
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaGuardarCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario));			
			
			}
						
			this.jButtonGuardarCambiosTablaCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaUsuario && this.isPermisoNuevoCajaDiariaUsuario));						
			this.jButtonDuplicarToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaDuplicarCajaDiariaUsuario && this.isPermisoDuplicarCajaDiariaUsuario));						
			this.jButtonCopiarToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaCopiarCajaDiariaUsuario && this.isPermisoCopiarCajaDiariaUsuario));			
			this.jButtonVerFormToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaVerFormCajaDiariaUsuario && this.isPermisoVerFormCajaDiariaUsuario));			
			this.jButtonAbrirOrderByToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaUsuario && this.isPermisoOrdenCajaDiariaUsuario));
			this.jButtonNuevoRelacionesToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario && this.isPermisoNuevoCajaDiariaUsuario));			
			this.jButtonNuevoGuardarCambiosToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaUsuario && this.isPermisoNuevoCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario));			
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonModificarToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaModificarCajaDiariaUsuario && this.isPermisoActualizarCajaDiariaUsuario));	
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonActualizarToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaActualizarCajaDiariaUsuario  && this.isPermisoActualizarCajaDiariaUsuario));	
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonEliminarToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaEliminarCajaDiariaUsuario && this.isPermisoEliminarCajaDiariaUsuario));
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonCancelarToolBarCajaDiariaUsuario.setVisible(this.isVisibilidadCeldaCancelarCajaDiariaUsuario);				
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaGuardarCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaUsuario && this.isPermisoNuevoCajaDiariaUsuario));			
			this.jMenuItemDuplicarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaDuplicarCajaDiariaUsuario && this.isPermisoDuplicarCajaDiariaUsuario));			
			this.jMenuItemCopiarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaCopiarCajaDiariaUsuario && this.isPermisoCopiarCajaDiariaUsuario));			
			this.jMenuItemVerFormCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaVerFormCajaDiariaUsuario && this.isPermisoVerFormCajaDiariaUsuario));			
			this.jMenuItemAbrirOrderByCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaUsuario && this.isPermisoOrdenCajaDiariaUsuario));			
			//this.jMenuItemMostrarOcultarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaUsuario && this.isPermisoOrdenCajaDiariaUsuario));
			this.jMenuItemDetalleAbrirOrderByCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaUsuario && this.isPermisoOrdenCajaDiariaUsuario));			
			//this.jMenuItemDetalleMostrarOcultarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaOrdenCajaDiariaUsuario && this.isPermisoOrdenCajaDiariaUsuario));			
			this.jMenuItemNuevoRelacionesCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario && this.isPermisoNuevoCajaDiariaUsuario));			
			this.jMenuItemNuevoGuardarCambiosCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaNuevoCajaDiariaUsuario && this.isPermisoNuevoCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario));									
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemModificarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaModificarCajaDiariaUsuario && this.isPermisoActualizarCajaDiariaUsuario));	
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemActualizarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaActualizarCajaDiariaUsuario && this.isPermisoActualizarCajaDiariaUsuario));	
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemEliminarCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaEliminarCajaDiariaUsuario && this.isPermisoEliminarCajaDiariaUsuario));
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemCancelarCajaDiariaUsuario.setVisible(this.isVisibilidadCeldaCancelarCajaDiariaUsuario);				
			}
			
			this.jMenuItemGuardarCambiosCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaGuardarCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario));						
			this.jMenuItemGuardarCambiosTablaCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=this.jButtonNuevoCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaDuplicarCajaDiariaUsuario=this.jButtonDuplicarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaCopiarCajaDiariaUsuario=this.jButtonCopiarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaVerFormCajaDiariaUsuario=this.jButtonVerFormCajaDiariaUsuario.isVisible();
			
			this.isVisibilidadCeldaOrdenCajaDiariaUsuario=this.jButtonAbrirOrderByCajaDiariaUsuario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=this.jButtonNuevoRelacionesCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaModificarCajaDiariaUsuario=this.jButtonModificarCajaDiariaUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonActualizarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonEliminarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaCancelarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonCancelarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaGuardarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosCajaDiariaUsuario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=this.jButtonGuardarCambiosTablaCajaDiariaUsuario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=this.jButtonNuevoToolBarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=this.jButtonNuevoRelacionesToolBarCajaDiariaUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			this.isVisibilidadCeldaModificarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonModificarToolBarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonActualizarToolBarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonEliminarToolBarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaCancelarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonCancelarToolBarCajaDiariaUsuario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaDiariaUsuario=this.jButtonGuardarCambiosToolBarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=this.jButtonGuardarCambiosTablaToolBarCajaDiariaUsuario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=this.jMenuItemNuevoCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=this.jMenuItemNuevoRelacionesCajaDiariaUsuario.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			this.isVisibilidadCeldaModificarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemModificarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemActualizarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemEliminarCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaCancelarCajaDiariaUsuario=this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemCancelarCajaDiariaUsuario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaDiariaUsuario=this.jMenuItemGuardarCambiosCajaDiariaUsuario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=this.jMenuItemGuardarCambiosTablaCajaDiariaUsuario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCajaDiariaUsuario(Boolean esInicializar) {
		if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
				//if(this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCajaDiariaUsuario();
			}
			
			this.inicializarActualizarBindingBotonesManualCajaDiariaUsuario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCajaDiariaUsuario() {
		this.jButtonNuevoCajaDiariaUsuario.setVisible(this.isPermisoNuevoCajaDiariaUsuario);			
		this.jButtonDuplicarCajaDiariaUsuario.setVisible(this.isPermisoDuplicarCajaDiariaUsuario);			
		this.jButtonCopiarCajaDiariaUsuario.setVisible(this.isPermisoCopiarCajaDiariaUsuario);			
		this.jButtonVerFormCajaDiariaUsuario.setVisible(this.isPermisoVerFormCajaDiariaUsuario);			
		
		this.jButtonAbrirOrderByCajaDiariaUsuario.setVisible(this.isPermisoOrdenCajaDiariaUsuario);					
		
		this.jButtonNuevoRelacionesCajaDiariaUsuario.setVisible(this.isPermisoNuevoCajaDiariaUsuario);			
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonModificarCajaDiariaUsuario.setVisible(this.isPermisoActualizarCajaDiariaUsuario);	
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonActualizarCajaDiariaUsuario.setVisible(this.isPermisoActualizarCajaDiariaUsuario);	
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonEliminarCajaDiariaUsuario.setVisible(this.isPermisoEliminarCajaDiariaUsuario);
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonCancelarCajaDiariaUsuario.setVisible(this.isVisibilidadCeldaCancelarCajaDiariaUsuario);						
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosCajaDiariaUsuario.setVisible(this.isPermisoGuardarCambiosCajaDiariaUsuario);							
		}
		
		this.jButtonGuardarCambiosTablaCajaDiariaUsuario.setVisible(this.isPermisoActualizarCajaDiariaUsuario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaDiariaUsuario() {
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonModificarCajaDiariaUsuario.setVisible(this.isPermisoActualizarCajaDiariaUsuario);	
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonActualizarCajaDiariaUsuario.setVisible(this.isPermisoActualizarCajaDiariaUsuario);	
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonEliminarCajaDiariaUsuario.setVisible(this.isPermisoEliminarCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonCancelarCajaDiariaUsuario.setVisible(this.isVisibilidadCeldaCancelarCajaDiariaUsuario);							
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosCajaDiariaUsuario.setVisible((this.isVisibilidadCeldaGuardarCajaDiariaUsuario && this.isPermisoGuardarCambiosCajaDiariaUsuario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCajaDiariaUsuario() {
		if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCajaDiariaUsuario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCajaDiariaUsuario() {
	}
	
	public void jTableDatosCajaDiariaUsuarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCajaDiariaUsuario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cajadiariausuario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCajaDiariaUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCajaDiariaUsuario(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaDiariaUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaDiariaUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cajadiariausuarioLogic.getConnexion());

				if(this.cajadiariausuario.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cajadiariausuario.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaDiariaUsuario=(TitledBorder)this.jScrollPanelDatosCajaDiariaUsuario.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCajaDiariaUsuario.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cajadiariausuario.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteCajaDiariaUsuarioActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderCajaDiariaUsuario=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosCajaDiariaUsuario.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCajaDiariaUsuario=(TitledBorder)this.jScrollPanelDatosCajaDiariaUsuario.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCajaDiariaUsuario.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteCajaDiariaUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebCajaDiariaUsuario(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaDiariaUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaDiariaUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.cajadiariausuarioLogic.getConnexion());

				if(this.cajadiariausuario.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.cajadiariausuario.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaDiariaUsuario=(TitledBorder)this.jScrollPanelDatosCajaDiariaUsuario.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCajaDiariaUsuario.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.cajadiariausuario.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaCajaDiariaUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebCajaDiariaUsuario(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaDiariaUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaDiariaUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.cajadiariausuarioLogic.getConnexion());

				if(this.cajadiariausuario.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.cajadiariausuario.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaDiariaUsuario=(TitledBorder)this.jScrollPanelDatosCajaDiariaUsuario.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderCajaDiariaUsuario.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.cajadiariausuario.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioCajaDiariaUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebCajaDiariaUsuario(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaDiariaUsuario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaDiariaUsuario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.cajadiariausuarioLogic.getConnexion());

				if(this.cajadiariausuario.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.cajadiariausuario.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaDiariaUsuario=(TitledBorder)this.jScrollPanelDatosCajaDiariaUsuario.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderCajaDiariaUsuario.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.cajadiariausuario.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.cajadiariausuario.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.cajadiariausuario.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cajaCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getnombre_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_caja like '%"+this.cajadiariausuario.getnombre_caja()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_usuarioCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getnombre_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_usuario like '%"+this.cajadiariausuario.getnombre_usuario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.cajadiariausuario.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_clienteCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getcodigo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cliente like '%"+this.cajadiariausuario.getcodigo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.cajadiariausuario.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsubtotalCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getsubtotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where subtotal = "+this.cajadiariausuario.getsubtotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.cajadiariausuario.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.cajadiariausuario.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfinanciamientoCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getfinanciamiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where financiamiento = "+this.cajadiariausuario.getfinanciamiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfleteCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getflete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where flete = "+this.cajadiariausuario.getflete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.cajadiariausuario.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalCajaDiariaUsuarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.getcajadiariausuario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajadiariausuario==null) {
						this.cajadiariausuario = new CajaDiariaUsuario();
					}

					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);
				}

				if(this.cajadiariausuario.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.cajadiariausuario.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaDiariaUsuario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCajaDiariaUsuarioCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaDiariaUsuario(false,false);

			this.getCajaDiariaUsuariosBusquedaCajaDiariaUsuario();

			this.inicializarActualizarBindingCajaDiariaUsuario(false);

			//if(CajaDiariaUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCajaCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaDiariaUsuario(false,false);

			this.getCajaDiariaUsuariosFK_IdCaja();

			this.inicializarActualizarBindingCajaDiariaUsuario(false);

			//if(CajaDiariaUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaDiariaUsuario(false,false);

			this.getCajaDiariaUsuariosFK_IdCliente();

			this.inicializarActualizarBindingCajaDiariaUsuario(false);

			//if(CajaDiariaUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaDiariaUsuario(false,false);

			this.getCajaDiariaUsuariosFK_IdEmpresa();

			this.inicializarActualizarBindingCajaDiariaUsuario(false);

			//if(CajaDiariaUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioCajaDiariaUsuarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaDiariaUsuario(false,false);

			this.getCajaDiariaUsuariosFK_IdUsuario();

			this.inicializarActualizarBindingCajaDiariaUsuario(false);

			//if(CajaDiariaUsuarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajadiariausuarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCajaDiariaUsuario() {
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.setVisible(false);	    			
			this.jInternalFrameDetalleFormCajaDiariaUsuario.dispose();
			this.jInternalFrameDetalleFormCajaDiariaUsuario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario!=null) {
			this.jInternalFrameReporteDinamicoCajaDiariaUsuario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCajaDiariaUsuario.dispose();
			this.jInternalFrameReporteDinamicoCajaDiariaUsuario=null;
		}
		
		if(this.jInternalFrameImportacionCajaDiariaUsuario!=null) {
			this.jInternalFrameImportacionCajaDiariaUsuario.setVisible(false);	    			
			this.jInternalFrameImportacionCajaDiariaUsuario.dispose();
			this.jInternalFrameImportacionCajaDiariaUsuario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCajaDiariaUsuario();
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoCajaDiariaUsuario")) {
				jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCajaDiariaUsuario")) {
				jButtonDuplicarCajaDiariaUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCajaDiariaUsuario")) {
				jButtonCopiarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormCajaDiariaUsuario")) {
				jButtonVerFormCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCajaDiariaUsuario")) {
				jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCajaDiariaUsuario")) {
				jButtonDuplicarCajaDiariaUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCajaDiariaUsuario")) {
				jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCajaDiariaUsuario")) {
				jButtonDuplicarCajaDiariaUsuarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCajaDiariaUsuario")) {
				jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCajaDiariaUsuario")) {
				jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCajaDiariaUsuario")) {
				jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCajaDiariaUsuario")) {
				jButtonModificarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCajaDiariaUsuario")) {
				jButtonModificarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCajaDiariaUsuario")) {
				jButtonModificarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCajaDiariaUsuario")) {
				jButtonActualizarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCajaDiariaUsuario")) {
				jButtonActualizarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCajaDiariaUsuario")) {
				jButtonActualizarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarCajaDiariaUsuario")) {
				jButtonEliminarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCajaDiariaUsuario")) {
				jButtonEliminarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCajaDiariaUsuario")) {
				jButtonEliminarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarCajaDiariaUsuario")) {
				jButtonCancelarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCajaDiariaUsuario")) {
				jButtonCancelarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCajaDiariaUsuario")) {
				jButtonCancelarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarCajaDiariaUsuario")) {
				jButtonCerrarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCajaDiariaUsuario")) {
				jButtonCerrarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCajaDiariaUsuario")) {
				jButtonCerrarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCajaDiariaUsuario")) {
				jButtonMostrarOcultarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCajaDiariaUsuario")) {
				jButtonCancelarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCajaDiariaUsuario")) {
				jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCajaDiariaUsuario")) {
				jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCajaDiariaUsuario")) {
				jButtonCopiarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCajaDiariaUsuario")) {
				jButtonVerFormCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCajaDiariaUsuario")) {
				jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCajaDiariaUsuario")) {
				jButtonCopiarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCajaDiariaUsuario")) {
				jButtonVerFormCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCajaDiariaUsuario")) {
				jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCajaDiariaUsuario")) {
				jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCajaDiariaUsuario")) {
				jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCajaDiariaUsuario")) {
				jButtonRecargarInformacionCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCajaDiariaUsuario")) {
				jButtonRecargarInformacionCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCajaDiariaUsuario")) {
				jButtonRecargarInformacionCajaDiariaUsuarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCajaDiariaUsuario")) {
				jButtonAnterioresCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCajaDiariaUsuario")) {
				jButtonAnterioresCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCajaDiariaUsuario")) {
				jButtonAnterioresCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCajaDiariaUsuario")) {
				jButtonSiguientesCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCajaDiariaUsuario")) {
				jButtonSiguientesCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCajaDiariaUsuario")) {
				jButtonSiguientesCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCajaDiariaUsuario") || sTipo.equals("MenuItemDetalleAbrirOrderByCajaDiariaUsuario")) {
				jButtonAbrirOrderByCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCajaDiariaUsuario") || sTipo.equals("MenuItemDetalleMostrarOcultarCajaDiariaUsuario")) {
				jButtonMostrarOcultarCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCajaDiariaUsuario")) {
				jButtonNuevoGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCajaDiariaUsuario")) {
				jButtonNuevoGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCajaDiariaUsuario")) {
				jButtonNuevoGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCajaDiariaUsuario")) {
				jButtonCerrarReporteDinamicoCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCajaDiariaUsuario")) {
				jButtonGenerarReporteDinamicoCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCajaDiariaUsuario")) {
				
				jButtonGenerarExcelReporteDinamicoCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCajaDiariaUsuario")) {
				jButtonCerrarImportacionCajaDiariaUsuarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCajaDiariaUsuario")) {
				
				jButtonGenerarImportacionCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCajaDiariaUsuario")) {
				
				jButtonAbrirImportacionCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCajaDiariaUsuario")) {
				jComboBoxTiposAccionesCajaDiariaUsuarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCajaDiariaUsuario")) {
				jComboBoxTiposRelacionesCajaDiariaUsuarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCajaDiariaUsuario")) {
				jComboBoxTiposAccionesCajaDiariaUsuarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCajaDiariaUsuario")) {
				
				jComboBoxTiposSeleccionarCajaDiariaUsuarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCajaDiariaUsuario")) {
				jTextFieldValorCampoGeneralCajaDiariaUsuarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCajaDiariaUsuario")) {
				jButtonAbrirOrderByCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCajaDiariaUsuario")) {
				jButtonAbrirOrderByCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCajaDiariaUsuario")) {
				jButtonCerrarOrderByCajaDiariaUsuarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaDiariaUsuarioBusqueda")) {
				this.jButtonidCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaDiariaUsuarioUpdate")) {
				this.jButtonid_empresaCajaDiariaUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaDiariaUsuarioBusqueda")) {
				this.jButtonid_empresaCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaUsuario")) {
				this.jButtonid_clienteCajaDiariaUsuarioActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaUsuarioUpdate")) {
				this.jButtonid_clienteCajaDiariaUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaUsuarioBusqueda")) {
				this.jButtonid_clienteCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajaDiariaUsuarioUpdate")) {
				this.jButtonid_cajaCajaDiariaUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajaDiariaUsuarioBusqueda")) {
				this.jButtonid_cajaCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioCajaDiariaUsuarioUpdate")) {
				this.jButtonid_usuarioCajaDiariaUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioCajaDiariaUsuarioBusqueda")) {
				this.jButtonid_usuarioCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioCajaDiariaUsuarioBusqueda")) {
				this.jButtonfecha_inicioCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finCajaDiariaUsuarioBusqueda")) {
				this.jButtonfecha_finCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaCajaDiariaUsuarioBusqueda")) {
				this.jButtonnombre_cajaCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_usuarioCajaDiariaUsuarioBusqueda")) {
				this.jButtonnombre_usuarioCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialCajaDiariaUsuarioBusqueda")) {
				this.jButtonsecuencialCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteCajaDiariaUsuarioBusqueda")) {
				this.jButtoncodigo_clienteCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteCajaDiariaUsuarioBusqueda")) {
				this.jButtonnombre_clienteCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalCajaDiariaUsuarioBusqueda")) {
				this.jButtonsubtotalCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaCajaDiariaUsuarioBusqueda")) {
				this.jButtonivaCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoCajaDiariaUsuarioBusqueda")) {
				this.jButtondescuentoCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoCajaDiariaUsuarioBusqueda")) {
				this.jButtonfinanciamientoCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteCajaDiariaUsuarioBusqueda")) {
				this.jButtonfleteCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceCajaDiariaUsuarioBusqueda")) {
				this.jButtoniceCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalCajaDiariaUsuarioBusqueda")) {
				this.jButtontotalCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCajaDiariaUsuarioCajaDiariaUsuario")) {
				this.jButtonBusquedaCajaDiariaUsuarioCajaDiariaUsuarioActionPerformed(evt);
			}
			
			;
			
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCajaDiariaUsuario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaUsuarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				


				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CajaDiariaUsuario cajadiariausuarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				cajadiariausuarioLocal=this.cajadiariausuario;
			} else {
				cajadiariausuarioLocal=this.cajadiariausuarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
							
				
				


				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
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
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
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
			
			


			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaUsuarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
								
						
				


				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaUsuario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
								
				
				


				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaUsuarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
							
				
				


				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaUsuario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaUsuarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
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
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
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
			
			


			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaUsuarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
								
				
				


				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaUsuarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaUsuarioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCajaDiariaUsuario")) {
					jCheckBoxSeleccionarTodosCajaDiariaUsuarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCajaDiariaUsuario")) {
					jCheckBoxSeleccionadosCajaDiariaUsuarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCajaDiariaUsuario")) {
					
				}
				
				


				
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
												
				
				


				
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaUsuario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaUsuarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaUsuarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
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
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
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
			
			


			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaDiariaUsuarioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaUsuario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaUsuario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajadiariausuario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajadiariausuario);
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
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
				
				


				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaDiariaUsuario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaDiariaUsuario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaDiariaUsuarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajadiariausuarioAnterior =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCajaDiariaUsuario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCajaDiariaUsuarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCajaDiariaUsuario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cajadiariausuario =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cajadiariausuario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCajaDiariaUsuario")) {
				
				}
				
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCajaDiariaUsuario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCajaDiariaUsuario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCajaDiariaUsuario")) {
			
			}
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCajaDiariaUsuario();
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
			if(sTipo.equals("NuevoCajaDiariaUsuario")) {
				jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCajaDiariaUsuario")) {
				jButtonDuplicarCajaDiariaUsuarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCajaDiariaUsuario")) {
				jButtonCopiarCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCajaDiariaUsuario")) {
				jButtonVerFormCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCajaDiariaUsuario")) {
				jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCajaDiariaUsuario")) {
				jButtonModificarCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCajaDiariaUsuario")) {
				jButtonActualizarCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCajaDiariaUsuario")) {
				jButtonEliminarCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCajaDiariaUsuario")) {
				jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCajaDiariaUsuario")) {
				jButtonCancelarCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCajaDiariaUsuario")) {
				jButtonCerrarCajaDiariaUsuarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCajaDiariaUsuario")) {
				jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCajaDiariaUsuario")) {
				jButtonNuevoGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCajaDiariaUsuario")) {
				jButtonAbrirOrderByCajaDiariaUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCajaDiariaUsuario")) {
				jButtonRecargarInformacionCajaDiariaUsuarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCajaDiariaUsuario")) {
				jButtonAnterioresCajaDiariaUsuarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCajaDiariaUsuario")) {
				jButtonSiguientesCajaDiariaUsuarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaDiariaUsuarioBusqueda")) {
				this.jButtonidCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaDiariaUsuarioUpdate")) {
				this.jButtonid_empresaCajaDiariaUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaDiariaUsuarioBusqueda")) {
				this.jButtonid_empresaCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaUsuario")) {
				this.jButtonid_clienteCajaDiariaUsuarioActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaUsuarioUpdate")) {
				this.jButtonid_clienteCajaDiariaUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCajaDiariaUsuarioBusqueda")) {
				this.jButtonid_clienteCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajaDiariaUsuarioUpdate")) {
				this.jButtonid_cajaCajaDiariaUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajaDiariaUsuarioBusqueda")) {
				this.jButtonid_cajaCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioCajaDiariaUsuarioUpdate")) {
				this.jButtonid_usuarioCajaDiariaUsuarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioCajaDiariaUsuarioBusqueda")) {
				this.jButtonid_usuarioCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioCajaDiariaUsuarioBusqueda")) {
				this.jButtonfecha_inicioCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finCajaDiariaUsuarioBusqueda")) {
				this.jButtonfecha_finCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaCajaDiariaUsuarioBusqueda")) {
				this.jButtonnombre_cajaCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_usuarioCajaDiariaUsuarioBusqueda")) {
				this.jButtonnombre_usuarioCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialCajaDiariaUsuarioBusqueda")) {
				this.jButtonsecuencialCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteCajaDiariaUsuarioBusqueda")) {
				this.jButtoncodigo_clienteCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteCajaDiariaUsuarioBusqueda")) {
				this.jButtonnombre_clienteCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalCajaDiariaUsuarioBusqueda")) {
				this.jButtonsubtotalCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaCajaDiariaUsuarioBusqueda")) {
				this.jButtonivaCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoCajaDiariaUsuarioBusqueda")) {
				this.jButtondescuentoCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoCajaDiariaUsuarioBusqueda")) {
				this.jButtonfinanciamientoCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteCajaDiariaUsuarioBusqueda")) {
				this.jButtonfleteCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceCajaDiariaUsuarioBusqueda")) {
				this.jButtoniceCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalCajaDiariaUsuarioBusqueda")) {
				this.jButtontotalCajaDiariaUsuarioBusquedaActionPerformed(evt);
			}
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCajaDiariaUsuario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCajaDiariaUsuario")) {
				closingInternalFrameCajaDiariaUsuario();
				
			} else if(sTipo.equals("jButtonCancelarCajaDiariaUsuario")) {
				JInternalFrameBase jInternalFrameDetalleFormCajaDiariaUsuario = (JInternalFrameBase)evt.getSource();
	            	
	            CajaDiariaUsuarioBeanSwingJInternalFrame jInternalFrameParent=(CajaDiariaUsuarioBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaDiariaUsuario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCajaDiariaUsuarioActionPerformed(null);
			}
			
			CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajadiariausuario,new Object(),this.cajadiariausuarioParameterGeneral,this.cajadiariausuarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCajaDiariaUsuario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCajaDiariaUsuario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCajaDiariaUsuario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cajadiariausuario)) {
			if(!esControlTabla) {
				if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);			
				}
				
				if(this.cajadiariausuarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCajaDiariaUsuario(this.cajadiariausuarioReturnGeneral,this.cajadiariausuarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cajadiariausuarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCajaDiariaUsuario(classes,this.cajadiariausuarioReturnGeneral,this.cajadiariausuarioBean,false);
					}
						
					if(this.cajadiariausuarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCajaDiariaUsuario(this.cajadiariausuarioReturnGeneral.getCajaDiariaUsuario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCajaDiariaUsuario(this.cajadiariausuarioReturnGeneral.getCajaDiariaUsuario());	
					}
						
					if(this.cajadiariausuarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCajaDiariaUsuario(this.cajadiariausuarioReturnGeneral.getCajaDiariaUsuario(),classes);//this.cajadiariausuarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCajaDiariaUsuario(this.cajadiariausuario,classes);//this.cajadiariausuarioBean);									
				}
			
				if(CajaDiariaUsuarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCajaDiariaUsuario(this.cajadiariausuario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaDiariaUsuario(this.cajadiariausuario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cajadiariausuarioAnterior!=null) {
						this.cajadiariausuario=this.cajadiariausuarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajadiariausuarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajadiariausuarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cajadiariausuarioReturnGeneral.getCajaDiariaUsuario(),cajadiariausuarioLogic.getCajaDiariaUsuarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cajadiariausuarioReturnGeneral.getCajaDiariaUsuario(),this.cajadiariausuarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCajaDiariaUsuario.repaint();
				
				//((AbstractTableModel) this.jTableDatosCajaDiariaUsuario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCajaDiariaUsuario();
			}
		}
	}
	
	public void actualizarVisualTableDatosCajaDiariaUsuario() throws Exception {
		
		CajaDiariaUsuarioModel cajadiariausuarioModel=(CajaDiariaUsuarioModel)this.jTableDatosCajaDiariaUsuario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajadiariausuarioModel.cajadiariausuarios=this.cajadiariausuarioLogic.getCajaDiariaUsuarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cajadiariausuarioModel.cajadiariausuarios=this.cajadiariausuarios;
		}
		
		
		((CajaDiariaUsuarioModel) this.jTableDatosCajaDiariaUsuario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCajaDiariaUsuario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcajadiariausuarioAnterior(),this.cajadiariausuarioLogic.getCajaDiariaUsuarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcajadiariausuarioAnterior(),this.cajadiariausuarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCajaDiariaUsuario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
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
										
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajadiariausuario,new Object(),generalEntityParameterGeneral,this.cajadiariausuarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CajaDiariaUsuarioConstantesFunciones.getClassesRelationshipsOfCajaDiariaUsuario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CajaDiariaUsuarioConstantesFunciones.getClassesRelationshipsFromStringsOfCajaDiariaUsuario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCajaDiariaUsuario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajadiariausuario,new Object(),generalEntityParameterGeneral,this.cajadiariausuarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCajaDiariaUsuario(CajaDiariaUsuarioBean cajadiariausuarioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCajaDiariaUsuario(ArrayList<Classe> classes,CajaDiariaUsuarioReturnGeneral cajadiariausuarioReturnGeneral,CajaDiariaUsuarioBean cajadiariausuarioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cajadiariausuario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario = new CajaDiariaUsuarioDetalleFormJInternalFrame(jDesktopPane,this.cajadiariausuarioSessionBean.getConGuardarRelaciones(),this.cajadiariausuarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.setVisible(false);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.setSelected(false);						
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.cajadiariausuarioLogic=this.cajadiariausuarioLogic;
		
		this.cargarCombosFrameForeignKeyCajaDiariaUsuario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaDiariaUsuario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaDiariaUsuario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCajaDiariaUsuario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCajaDiariaUsuario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaDiariaUsuario"));
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonModificarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"ModificarCajaDiariaUsuario"));

		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonModificarToolBarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaDiariaUsuario"));
					
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemModificarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaDiariaUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonActualizarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"ActualizarCajaDiariaUsuario"));
		
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonActualizarToolBarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaDiariaUsuario"));
						
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemActualizarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaDiariaUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonEliminarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"EliminarCajaDiariaUsuario"));
		
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonEliminarToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaDiariaUsuario"));
								
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemEliminarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaDiariaUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonCancelarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"CancelarCajaDiariaUsuario"));
		
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonCancelarToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaDiariaUsuario"));
					
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemCancelarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaDiariaUsuario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemDetalleCerrarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaDiariaUsuario"));		
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaDiariaUsuario"));
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaDiariaUsuario"));
		
		
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaDiariaUsuario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonidCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idCajaDiariaUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_empresaCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_empresaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaUsuarioBusqueda"));
		//jButtonid_clienteCajaDiariaUsuario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaDiariaUsuarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_clienteCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaUsuario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_clienteCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_clienteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_cajaCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_cajaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_usuarioCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_usuarioCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfecha_inicioCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfecha_finCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonnombre_cajaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_usuarioCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonsecuencialCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonnombre_clienteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonsubtotalCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"subtotalCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonivaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"ivaCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtondescuentoCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"descuentoCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfinanciamientoCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfleteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fleteCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtoniceCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"iceCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtontotalCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"totalCajaDiariaUsuarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTabbedPaneRelacionesCajaDiariaUsuario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaDiariaUsuario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCajaDiariaUsuario"));
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaDiariaUsuario"));
		}
		
		this.jTableDatosCajaDiariaUsuario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCajaDiariaUsuario"));
		
		this.jTableDatosCajaDiariaUsuario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCajaDiariaUsuario"));
		
		this.jButtonNuevoCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"NuevoCajaDiariaUsuario"));
		
		this.jButtonDuplicarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"DuplicarCajaDiariaUsuario"));
		
		this.jButtonCopiarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"CopiarCajaDiariaUsuario"));
		
		this.jButtonVerFormCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"VerFormCajaDiariaUsuario"));
		
		
		this.jButtonNuevoToolBarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"NuevoToolBarCajaDiariaUsuario"));
			
		this.jButtonDuplicarToolBarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCajaDiariaUsuario"));
			
		this.jMenuItemNuevoCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCajaDiariaUsuario"));
			
		this.jMenuItemDuplicarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCajaDiariaUsuario"));		
		
		
		this.jButtonNuevoRelacionesCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCajaDiariaUsuario"));
		
		
		this.jButtonNuevoRelacionesToolBarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCajaDiariaUsuario"));
			
		this.jMenuItemNuevoRelacionesCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCajaDiariaUsuario"));		
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonModificarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"ModificarCajaDiariaUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonModificarToolBarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaDiariaUsuario"));
			
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemModificarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaDiariaUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonActualizarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"ActualizarCajaDiariaUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonActualizarToolBarCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaDiariaUsuario"));
				
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemActualizarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaDiariaUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonEliminarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"EliminarCajaDiariaUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonEliminarToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaDiariaUsuario"));
						
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemEliminarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaDiariaUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonCancelarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"CancelarCajaDiariaUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonCancelarToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaDiariaUsuario"));
			
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemCancelarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaDiariaUsuario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCajaDiariaUsuario"));		
		
		
		this.jButtonCerrarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"CerrarCajaDiariaUsuario"));
		
		
		this.jButtonCerrarToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"CerrarToolBarCajaDiariaUsuario"));
			
		this.jMenuItemCerrarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCajaDiariaUsuario"));
			
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jMenuItemDetalleCerrarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaDiariaUsuario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosCajaDiariaUsuario"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaDiariaUsuario"));
		}
		
		this.jButtonCopiarToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"CopiarToolBarCajaDiariaUsuario"));
			
		this.jButtonVerFormToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"VerFormToolBarCajaDiariaUsuario"));
		
		this.jMenuItemGuardarCambiosCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCajaDiariaUsuario"));
			
		this.jMenuItemCopiarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCajaDiariaUsuario"));		
		
		this.jMenuItemVerFormCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCajaDiariaUsuario"));		
		
		
		this.jButtonGuardarCambiosTablaCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaDiariaUsuario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCajaDiariaUsuario"));
			
		this.jMenuItemGuardarCambiosTablaCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaDiariaUsuario"));		
		
		
		
		this.jButtonRecargarInformacionCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"RecargarInformacionCajaDiariaUsuario"));
					
		this.jButtonRecargarInformacionToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCajaDiariaUsuario"));
		
		this.jMenuItemRecargarInformacionCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCajaDiariaUsuario"));		
		
		
		
		this.jButtonAnterioresCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"AnterioresCajaDiariaUsuario"));
		
		
		this.jButtonAnterioresToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCajaDiariaUsuario"));
		
		this.jMenuItemAnterioresCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCajaDiariaUsuario"));		
		
		
		this.jButtonSiguientesCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"SiguientesCajaDiariaUsuario"));
		
		
		this.jButtonSiguientesToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCajaDiariaUsuario"));
			
		this.jMenuItemSiguientesCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCajaDiariaUsuario"));
			
		this.jMenuItemAbrirOrderByCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCajaDiariaUsuario"));
			
		this.jMenuItemMostrarOcultarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCajaDiariaUsuario"));
			
		this.jMenuItemDetalleAbrirOrderByCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCajaDiariaUsuario"));
			
		this.jMenuItemDetalleMostarOcultarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCajaDiariaUsuario"));		
		
		
		this.jButtonNuevoGuardarCambiosCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCajaDiariaUsuario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCajaDiariaUsuario"));
			
		this.jMenuItemNuevoGuardarCambiosCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCajaDiariaUsuario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCajaDiariaUsuario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCajaDiariaUsuario"));

		this.jCheckBoxSeleccionadosCajaDiariaUsuario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCajaDiariaUsuario"));
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaDiariaUsuario"));
		}
		
		
		this.jComboBoxTiposRelacionesCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"TiposRelacionesCajaDiariaUsuario"));
			
		this.jComboBoxTiposAccionesCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"TiposAccionesCajaDiariaUsuario"));
					
		this.jComboBoxTiposSeleccionarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCajaDiariaUsuario"));
			
		this.jTextFieldValorCampoGeneralCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCajaDiariaUsuario"));		
		
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonidCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idCajaDiariaUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_empresaCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_empresaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaUsuarioBusqueda"));
		//jButtonid_clienteCajaDiariaUsuario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaDiariaUsuarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_clienteCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaUsuario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_clienteCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_clienteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_cajaCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_cajaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_usuarioCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_usuarioCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfecha_inicioCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfecha_finCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonnombre_cajaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_usuarioCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonsecuencialCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonnombre_clienteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonsubtotalCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"subtotalCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonivaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"ivaCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtondescuentoCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"descuentoCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfinanciamientoCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfleteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fleteCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtoniceCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"iceCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtontotalCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"totalCajaDiariaUsuarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCajaDiariaUsuarioCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"BusquedaCajaDiariaUsuarioCajaDiariaUsuario"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCajaDiariaUsuario!=null) {
				this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaDiariaUsuario"));
				this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaDiariaUsuario"));
				this.jInternalFrameReporteDinamicoCajaDiariaUsuario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaDiariaUsuario"));
			}
			
			//this.jButtonCerrarReporteDinamicoCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaDiariaUsuario"));				
			//this.jButtonGenerarReporteDinamicoCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaDiariaUsuario"));
			//this.jButtonGenerarExcelReporteDinamicoCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaDiariaUsuario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCajaDiariaUsuario!=null) {
				this.jInternalFrameImportacionCajaDiariaUsuario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaDiariaUsuario"));
				this.jInternalFrameImportacionCajaDiariaUsuario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaDiariaUsuario"));
				this.jInternalFrameImportacionCajaDiariaUsuario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaDiariaUsuario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"AbrirOrderByCajaDiariaUsuario"));
			
			this.jButtonAbrirOrderByToolBarCajaDiariaUsuario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCajaDiariaUsuario"));			
			
			if(this.jInternalFrameOrderByCajaDiariaUsuario!=null) {
				this.jInternalFrameOrderByCajaDiariaUsuario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaDiariaUsuario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jTabbedPaneRelacionesCajaDiariaUsuario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaDiariaUsuario"));
		
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
            		closingInternalFrameCajaDiariaUsuario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCajaDiariaUsuario = (JInternalFrameBase)event.getSource();
	            	
	            CajaDiariaUsuarioBeanSwingJInternalFrame jInternalFrameParent=(CajaDiariaUsuarioBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaDiariaUsuario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCajaDiariaUsuarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCajaDiariaUsuario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCajaDiariaUsuarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCajaDiariaUsuario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCajaDiariaUsuario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCajaDiariaUsuario";
		inputMap = this.jButtonNuevoCajaDiariaUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCajaDiariaUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCajaDiariaUsuario";
		inputMap = this.jButtonNuevoRelacionesCajaDiariaUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCajaDiariaUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaDiariaUsuarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCajaDiariaUsuario";
		inputMap = this.jButtonModificarCajaDiariaUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCajaDiariaUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCajaDiariaUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCajaDiariaUsuario";
		inputMap = this.jButtonActualizarCajaDiariaUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCajaDiariaUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCajaDiariaUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCajaDiariaUsuario";
		inputMap = this.jButtonEliminarCajaDiariaUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCajaDiariaUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCajaDiariaUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCajaDiariaUsuario";
		inputMap = this.jButtonCancelarCajaDiariaUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCajaDiariaUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCajaDiariaUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCajaDiariaUsuario";
		inputMap = this.jButtonCerrarCajaDiariaUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCajaDiariaUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCajaDiariaUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCajaDiariaUsuario";
		inputMap = this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosCajaDiariaUsuario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonGuardarCambiosCajaDiariaUsuario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCajaDiariaUsuario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCajaDiariaUsuarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCajaDiariaUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCajaDiariaUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCajaDiariaUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCajaDiariaUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCajaDiariaUsuario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCajaDiariaUsuarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonidCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"idCajaDiariaUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_empresaCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_empresaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaDiariaUsuarioBusqueda"));
		//jButtonid_clienteCajaDiariaUsuario.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaDiariaUsuarioActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_clienteCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaUsuario"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_clienteCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_clienteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaDiariaUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_cajaCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_cajaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaDiariaUsuarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_usuarioCajaDiariaUsuarioUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioCajaDiariaUsuarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_usuarioCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfecha_inicioCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfecha_finCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonnombre_cajaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonnombre_usuarioCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_usuarioCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonsecuencialCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"secuencialCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtoncodigo_clienteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonnombre_clienteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonsubtotalCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"subtotalCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonivaCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"ivaCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtondescuentoCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"descuentoCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfinanciamientoCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonfleteCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"fleteCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtoniceCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"iceCajaDiariaUsuarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtontotalCajaDiariaUsuarioBusqueda.addActionListener(new ButtonActionListener(this,"totalCajaDiariaUsuarioBusqueda"));
		
		
		this.jButtonBusquedaCajaDiariaUsuarioCajaDiariaUsuario.addActionListener(new ButtonActionListener(this,"BusquedaCajaDiariaUsuarioCajaDiariaUsuario"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCajaDiariaUsuario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCajaDiariaUsuarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCajaDiariaUsuarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCajaDiariaUsuario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCajaDiariaUsuario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
					cajadiariausuarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuarios) {
					cajadiariausuarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCajaDiariaUsuarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
						cajadiariausuarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuarios) {
						cajadiariausuarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaDiariaUsuario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaDiariaUsuario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCajaDiariaUsuarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCajaDiariaUsuario.getSelectedRows();
			
			CajaDiariaUsuario cajadiariausuarioLocal=new CajaDiariaUsuario();
			
			//this.seleccionarTodosCajaDiariaUsuario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajadiariausuarioLocal =(CajaDiariaUsuario) this.cajadiariausuarioLogic.getCajaDiariaUsuarios().toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cajadiariausuarioLocal =(CajaDiariaUsuario) this.cajadiariausuarios.toArray()[this.jTableDatosCajaDiariaUsuario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cajadiariausuarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
						cajadiariausuarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuarios) {
						cajadiariausuarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaDiariaUsuario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaDiariaUsuario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaDiariaUsuario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCajaDiariaUsuarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCajaDiariaUsuarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCajaDiariaUsuarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCajaDiariaUsuario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
				
						if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							cajadiariausuarioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							cajadiariausuarioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							cajadiariausuarioAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO)) {
							existe=true;
							cajadiariausuarioAux.setnombre_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							cajadiariausuarioAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							cajadiariausuarioAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							cajadiariausuarioAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							cajadiariausuarioAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_IVA)) {
							existe=true;
							cajadiariausuarioAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							cajadiariausuarioAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							cajadiariausuarioAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							cajadiariausuarioAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_ICE)) {
							existe=true;
							cajadiariausuarioAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							cajadiariausuarioAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuarios) {
					
						if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							cajadiariausuarioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							cajadiariausuarioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							cajadiariausuarioAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO)) {
							existe=true;
							cajadiariausuarioAux.setnombre_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							cajadiariausuarioAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							cajadiariausuarioAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							cajadiariausuarioAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							cajadiariausuarioAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_IVA)) {
							existe=true;
							cajadiariausuarioAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							cajadiariausuarioAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							cajadiariausuarioAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							cajadiariausuarioAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_ICE)) {
							existe=true;
							cajadiariausuarioAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							cajadiariausuarioAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCajaDiariaUsuarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCajaDiariaUsuario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCajaDiariaUsuario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCajaDiariaUsuario) {				
					conSplash=true;//false;										
					
					//this.startProcessCajaDiariaUsuario(conSplash);
				
					this.generarReporteCajaDiariaUsuariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaDiariaUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCajaDiariaUsuariosSeleccionados();
				//this.jComboBoxTiposAccionesCajaDiariaUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaDiariaUsuariosSeleccionados(false);
				//this.jComboBoxTiposAccionesCajaDiariaUsuario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaDiariaUsuariosSeleccionados(true);
				//this.jComboBoxTiposAccionesCajaDiariaUsuario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaDiariaUsuario();
				
				this.exportarCajaDiariaUsuariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaDiariaUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCajaDiariaUsuarios();
				//this.importarCajaDiariaUsuarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaDiariaUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaDiariaUsuario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCajaDiariaUsuariosSeleccionados();
				//this.jComboBoxTiposAccionesCajaDiariaUsuario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Caja Diaria Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCajaDiariaUsuario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCajaDiariaUsuario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCajaDiariaUsuario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Caja Diaria Usuario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaDiariaUsuario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setSelectedIndex(0);					
				}	
			} 			
			else if(CajaDiariaUsuarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCajaDiariaUsuario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCajaDiariaUsuario(conSplash);
					
						//this.actualizarParametrosGeneralCajaDiariaUsuario();
						
						this.generarReporteProcesoAccionCajaDiariaUsuariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCajaDiariaUsuario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Caja Diaria UsuarioS SELECCIONADOS?", "MANTENIMIENTO DE Caja Diaria Usuario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCajaDiariaUsuario();
				
						this.actualizarParametrosGeneralCajaDiariaUsuario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cajadiariausuarioReturnGeneral=cajadiariausuarioLogic.procesarAccionCajaDiariaUsuariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cajadiariausuarioLogic.getCajaDiariaUsuarios(),this.cajadiariausuarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCajaDiariaUsuarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaDiariaUsuario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCajaDiariaUsuario();
					
					CajaDiariaUsuarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCajaDiariaUsuarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaDiariaUsuario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxTiposAccionesFormularioCajaDiariaUsuario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCajaDiariaUsuario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCajaDiariaUsuarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCajaDiariaUsuario();
			
			if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();		
			CajaDiariaUsuario cajadiariausuario=new CajaDiariaUsuario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCajaDiariaUsuario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCajaDiariaUsuario.getSelectedItem();
			
			
			
			
			cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(cajadiariausuariosSeleccionados.size()==1) {
				for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuariosSeleccionados) {
					cajadiariausuario=cajadiariausuarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCajaDiariaUsuario();
			
      		//this.finishProcessCajaDiariaUsuario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCajaDiariaUsuarioReturnGeneral() throws Exception {
		if(this.cajadiariausuarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cajadiariausuarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cajadiariausuarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cajadiariausuarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cajadiariausuarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cajadiariausuarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCajaDiariaUsuario(false);
		}
		
		if(this.cajadiariausuarioReturnGeneral.getConRetornoLista() || this.cajadiariausuarioReturnGeneral.getConRetornoObjeto()) {
			if(this.cajadiariausuarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajadiariausuarioLogic.setCajaDiariaUsuarios(this.cajadiariausuarioReturnGeneral.getCajaDiariaUsuarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCajaDiariaUsuario(false);
		}
	}
	
	public void actualizarParametrosGeneralCajaDiariaUsuario() throws Exception {
		
		
	}
	
	public ArrayList<CajaDiariaUsuario> getCajaDiariaUsuariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCajaDiariaUsuario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuarioLogic.getCajaDiariaUsuarios()) {
					if(cajadiariausuarioAux.getIsSelected()) {
						cajadiariausuariosSeleccionados.add(cajadiariausuarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaDiariaUsuario cajadiariausuarioAux:this.cajadiariausuarios) {
					if(cajadiariausuarioAux.getIsSelected()) {
						cajadiariausuariosSeleccionados.add(cajadiariausuarioAux);				
					}
				}
			}
			
			if(cajadiariausuariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cajadiariausuariosSeleccionados.addAll(this.cajadiariausuarioLogic.getCajaDiariaUsuarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cajadiariausuariosSeleccionados.addAll(this.cajadiariausuarios);				
					}
				}
			}
		} else {
			cajadiariausuariosSeleccionados.add(this.cajadiariausuario);
		}
		
		return cajadiariausuariosSeleccionados;
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
	
	public void generarReporteCajaDiariaUsuariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCajaDiariaUsuariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCajaDiariaUsuariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaDiariaUsuariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaDiariaUsuariosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Caja Diaria Usuario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCajaDiariaUsuariosSeleccionados() throws Exception {
		ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();		
		
		cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCajaDiariaUsuarios("Todos",cajadiariausuariosSeleccionados);
		
	}	
	
	public void generarReporteNormalCajaDiariaUsuariosSeleccionados() throws Exception {
		ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();		
		
		cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCajaDiariaUsuarios("Todos",cajadiariausuariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCajaDiariaUsuariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();
		
		cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCajaDiariaUsuarios("Todos",cajadiariausuariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCajaDiariaUsuariosSeleccionados() throws Exception {
		ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCajaDiariaUsuario();
		
		
		cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCajaDiariaUsuario();
		
		
		//this.generarReporteCajaDiariaUsuarios("Todos",cajadiariausuariosSeleccionados ,cajadiariausuarioImplementable,cajadiariausuarioImplementableHome);
	}
	
	public void mostrarImportacionCajaDiariaUsuarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCajaDiariaUsuario();
		
		this.abrirFrameImportacionCajaDiariaUsuario();		
		
			
		//this.generarReporteCajaDiariaUsuarios("Todos",cajadiariausuariosSeleccionados ,cajadiariausuarioImplementable,cajadiariausuarioImplementableHome);
	}
	
	public void importarCajaDiariaUsuarios() throws Exception {		
	
	}
	
	public void exportarCajaDiariaUsuariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCajaDiariaUsuariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCajaDiariaUsuariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCajaDiariaUsuariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Caja Diaria Usuario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCajaDiariaUsuariosSeleccionados() throws Exception {
		ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();		
		
		cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariausuario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCajaDiariaUsuario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCajaDiariaUsuario(cajadiariausuarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cajadiariausuarioAux.setsDetalleGeneralEntityReporte(cajadiariausuarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCajaDiariaUsuario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_ICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cajadiariausuario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getnombre_caja();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getnombre_usuario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getcodigo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getsubtotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getfinanciamiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getflete().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.getice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajadiariausuario.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCajaDiariaUsuariosSeleccionados() throws Exception {
		ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();		
		
		cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariausuario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CajaDiariaUsuarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCajaDiariaUsuario(row);				
				iRow++;
			}				
			
			for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCajaDiariaUsuario(cajadiariausuarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCajaDiariaUsuariosSeleccionados() throws Exception {
		ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();		
		
		cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajadiariausuario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cajadiariausuarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cajadiariausuario");
			//elementRoot.appendChild(element);
		
			for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuariosSeleccionados) {
				element = document.createElement("cajadiariausuario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCajaDiariaUsuario(cajadiariausuarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Diaria Usuario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCajaDiariaUsuario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FINANCIAMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_FLETE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_ICE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaDiariaUsuarioConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getnombre_caja());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getnombre_usuario());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getcodigo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getsubtotal());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getfinanciamiento());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getflete());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.getice());
		cell = row.createCell(iColumn++);cell.setCellValue(cajadiariausuario.gettotal());				
	}
	
	public void setFilaDatosExportarXmlCajaDiariaUsuario(CajaDiariaUsuario cajadiariausuario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CajaDiariaUsuarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cajadiariausuario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CajaDiariaUsuarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cajadiariausuario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CajaDiariaUsuarioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cajadiariausuario.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(CajaDiariaUsuarioConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(cajadiariausuario.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementcaja_descripcion = document.createElement(CajaDiariaUsuarioConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(cajadiariausuario.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementusuario_descripcion = document.createElement(CajaDiariaUsuarioConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(cajadiariausuario.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementfecha_inicio = document.createElement(CajaDiariaUsuarioConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(cajadiariausuario.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(CajaDiariaUsuarioConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(cajadiariausuario.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementnombre_caja = document.createElement(CajaDiariaUsuarioConstantesFunciones.NOMBRECAJA);
		elementnombre_caja.appendChild(document.createTextNode(cajadiariausuario.getnombre_caja().trim()));
		element.appendChild(elementnombre_caja);

		Element elementnombre_usuario = document.createElement(CajaDiariaUsuarioConstantesFunciones.NOMBREUSUARIO);
		elementnombre_usuario.appendChild(document.createTextNode(cajadiariausuario.getnombre_usuario().trim()));
		element.appendChild(elementnombre_usuario);

		Element elementsecuencial = document.createElement(CajaDiariaUsuarioConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(cajadiariausuario.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementcodigo_cliente = document.createElement(CajaDiariaUsuarioConstantesFunciones.CODIGOCLIENTE);
		elementcodigo_cliente.appendChild(document.createTextNode(cajadiariausuario.getcodigo_cliente().trim()));
		element.appendChild(elementcodigo_cliente);

		Element elementnombre_cliente = document.createElement(CajaDiariaUsuarioConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(cajadiariausuario.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementsubtotal = document.createElement(CajaDiariaUsuarioConstantesFunciones.SUBTOTAL);
		elementsubtotal.appendChild(document.createTextNode(cajadiariausuario.getsubtotal().toString().trim()));
		element.appendChild(elementsubtotal);

		Element elementiva = document.createElement(CajaDiariaUsuarioConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(cajadiariausuario.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementdescuento = document.createElement(CajaDiariaUsuarioConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(cajadiariausuario.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementfinanciamiento = document.createElement(CajaDiariaUsuarioConstantesFunciones.FINANCIAMIENTO);
		elementfinanciamiento.appendChild(document.createTextNode(cajadiariausuario.getfinanciamiento().toString().trim()));
		element.appendChild(elementfinanciamiento);

		Element elementflete = document.createElement(CajaDiariaUsuarioConstantesFunciones.FLETE);
		elementflete.appendChild(document.createTextNode(cajadiariausuario.getflete().toString().trim()));
		element.appendChild(elementflete);

		Element elementice = document.createElement(CajaDiariaUsuarioConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(cajadiariausuario.getice().toString().trim()));
		element.appendChild(elementice);

		Element elementtotal = document.createElement(CajaDiariaUsuarioConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(cajadiariausuario.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoCajaDiariaUsuariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados=new ArrayList<CajaDiariaUsuario>();
		
		cajadiariausuariosSeleccionados=this.getCajaDiariaUsuariosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCajaDiariaUsuario(cajadiariausuariosSeleccionados);
		
		this.generarReporteCajaDiariaUsuarios("Todos",cajadiariausuariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCajaDiariaUsuario(ArrayList<CajaDiariaUsuario> cajadiariausuariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CajaDiariaUsuario cajadiariausuarioAux:cajadiariausuariosSeleccionados) {
				cajadiariausuarioAux.setsDetalleGeneralEntityReporte(cajadiariausuarioAux.toString());
			
				if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cajadiariausuarioAux.setsDescripcionGeneralEntityReporte1(cajadiariausuarioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					cajadiariausuarioAux.setsDescripcionGeneralEntityReporte1(cajadiariausuarioAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					cajadiariausuarioAux.setsDescripcionGeneralEntityReporte1(cajadiariausuarioAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					cajadiariausuarioAux.setsDescripcionGeneralEntityReporte1(cajadiariausuarioAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					cajadiariausuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cajadiariausuarioAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					cajadiariausuarioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cajadiariausuarioAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECAJA)) {
					existe=true;
					cajadiariausuarioAux.setsDescripcionGeneralEntityReporte1(cajadiariausuarioAux.getnombre_caja());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBREUSUARIO)) {
					existe=true;
					cajadiariausuarioAux.setsDescripcionGeneralEntityReporte1(cajadiariausuarioAux.getnombre_usuario());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					cajadiariausuarioAux.setsDescripcionGeneralEntityReporte1(cajadiariausuarioAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_CODIGOCLIENTE)) {
					existe=true;
					cajadiariausuarioAux.setsDescripcionGeneralEntityReporte1(cajadiariausuarioAux.getcodigo_cliente());
				}
				 else if(sTipoSeleccionar.equals(CajaDiariaUsuarioConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					cajadiariausuarioAux.setsDescripcionGeneralEntityReporte1(cajadiariausuarioAux.getnombre_cliente());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaDiariaUsuarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCajaDiariaUsuario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCajaDiariaUsuario=true;
				this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=true;
				this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=true;
			}
			
			this.isVisibilidadCeldaModificarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaCancelarCajaDiariaUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=false;
			this.isVisibilidadCeldaModificarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=true;
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaCancelarCajaDiariaUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=false;
			this.isVisibilidadCeldaModificarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=true;
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=true;
			this.isVisibilidadCeldaCancelarCajaDiariaUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=false;
			this.isVisibilidadCeldaModificarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=true;
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaCancelarCajaDiariaUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=true;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=true;
			this.isVisibilidadCeldaModificarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaCancelarCajaDiariaUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=false;
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaCancelarCajaDiariaUsuario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=false;
			this.isVisibilidadCeldaModificarCajaDiariaUsuario=true;
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaCancelarCajaDiariaUsuario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CajaDiariaUsuarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=true;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=true;
		} else {
			this.actualizarEstadoPanelsCajaDiariaUsuario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCajaDiariaUsuario=false;
			//this.isVisibilidadCeldaVerFormCajaDiariaUsuario=false;
			this.isVisibilidadCeldaDuplicarCajaDiariaUsuario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cajadiariausuarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=false;
		} else {
			this.isVisibilidadCeldaNuevoCajaDiariaUsuario=false;
			this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
			if(!cajadiariausuarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=false;												
			}
			
			this.jButtonCerrarCajaDiariaUsuario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=false;
		}
		
		if(!this.permiteMantenimiento(this.cajadiariausuario)) {
			this.isVisibilidadCeldaActualizarCajaDiariaUsuario=false;
			this.isVisibilidadCeldaEliminarCajaDiariaUsuario=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCajaDiariaUsuario=false;
		this.isVisibilidadCeldaNuevoRelacionesCajaDiariaUsuario=false;
		this.isVisibilidadCeldaGuardarCambiosCajaDiariaUsuario=false;
		//this.isVisibilidadCeldaModificarCajaDiariaUsuario=true;
		this.isVisibilidadCeldaActualizarCajaDiariaUsuario=false;
		this.isVisibilidadCeldaEliminarCajaDiariaUsuario=false;
		//this.isVisibilidadCeldaCancelarCajaDiariaUsuario=true;			
		this.isVisibilidadCeldaGuardarCajaDiariaUsuario=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCajaDiariaUsuario() {
	}
	
	public void actualizarEstadoPanelsCajaDiariaUsuario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaUsuario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaUsuario!=null) {
				this.jTabbedPaneBusquedasCajaDiariaUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosCajaDiariaUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaDiariaUsuario!=null) {
				this.jPanelPaginacionCajaDiariaUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaUsuario!=null) {
				this.jPanelParametrosReportesCajaDiariaUsuario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaUsuario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaUsuario!=null) {
				this.jTabbedPaneBusquedasCajaDiariaUsuario.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosCajaDiariaUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaDiariaUsuario!=null) {
				this.jPanelPaginacionCajaDiariaUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaUsuario!=null) {
				this.jPanelParametrosReportesCajaDiariaUsuario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaUsuario.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaUsuario!=null) {
				this.jTabbedPaneBusquedasCajaDiariaUsuario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosCajaDiariaUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaDiariaUsuario!=null) {
				this.jPanelPaginacionCajaDiariaUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaUsuario!=null) {
				this.jPanelParametrosReportesCajaDiariaUsuario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaUsuario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaUsuario!=null) {
				this.jTabbedPaneBusquedasCajaDiariaUsuario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosCajaDiariaUsuario.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaDiariaUsuario!=null) {
				this.jPanelPaginacionCajaDiariaUsuario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaUsuario!=null) {
				this.jPanelParametrosReportesCajaDiariaUsuario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaUsuario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaUsuario!=null) {
				this.jTabbedPaneBusquedasCajaDiariaUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosCajaDiariaUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaDiariaUsuario!=null) {
				this.jPanelPaginacionCajaDiariaUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaUsuario!=null) {
				this.jPanelParametrosReportesCajaDiariaUsuario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaUsuario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaUsuario!=null) {
				this.jTabbedPaneBusquedasCajaDiariaUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosCajaDiariaUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaDiariaUsuario!=null) {
				this.jPanelPaginacionCajaDiariaUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaUsuario!=null) {
				this.jPanelParametrosReportesCajaDiariaUsuario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosEdicionCajaDiariaUsuario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaUsuario!=null) {
				this.jTabbedPaneBusquedasCajaDiariaUsuario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaDiariaUsuario!=null) {
				this.jScrollPanelDatosCajaDiariaUsuario.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaDiariaUsuario!=null) {
				this.jPanelPaginacionCajaDiariaUsuario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaDiariaUsuario!=null) {
				this.jPanelParametrosReportesCajaDiariaUsuario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCajaDiariaUsuario!=null) {
					this.jTabbedPaneBusquedasCajaDiariaUsuario.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCajaDiariaUsuario!=null) {
				this.jPanelParametrosReportesCajaDiariaUsuario.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cajadiariausuarioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaDiariaUsuario!=null) {
				this.jTabbedPaneBusquedasCajaDiariaUsuario.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCajaDiariaUsuario!=null) {
				this.jPanelParametrosReportesCajaDiariaUsuario.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCajaDiariaUsuario=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCajaDiariaUsuario) {this.jTabbedPaneBusquedasCajaDiariaUsuario.remove(jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaCajaDiariaUsuario=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaCajaDiariaUsuario) {this.jTabbedPaneBusquedasCajaDiariaUsuario.remove(jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadBusquedaCajaDiariaUsuario=isParaCajaNegation;
			if(!this.isVisibilidadBusquedaCajaDiariaUsuario) {this.jTabbedPaneBusquedasCajaDiariaUsuario.remove(jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadBusquedaCajaDiariaUsuario=isParaUsuario;
			if(!this.isVisibilidadBusquedaCajaDiariaUsuario) {this.jTabbedPaneBusquedasCajaDiariaUsuario.remove(jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario);}
		}
		
	}
	
	
	
	

	public String registrarSesionCajaDiariaUsuarioParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(cajadiariausuarioSessionBean==null) {
				cajadiariausuarioSessionBean=new CajaDiariaUsuarioSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(cajadiariausuarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.cajadiariausuarioFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(CajaDiariaUsuarioConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionCajaDiariaUsuario(true);
			//clienteSessionBean.setlidCajaDiariaUsuarioActual(this.idCajaDiariaUsuarioActual);

			cajadiariausuarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCajaDiariaUsuario(true);
			cajadiariausuarioSessionBean.setlIdCajaDiariaUsuarioActualForeignKey(this.idCajaDiariaUsuarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCajaDiariaUsuario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCajaDiariaUsuario() {
		this.updateBorderResaltarBusquedasFormularioCajaDiariaUsuario();
		this.updateVisibilidadBusquedasFormularioCajaDiariaUsuario();
		this.updateHabilitarBusquedasFormularioCajaDiariaUsuario();
	}
	
	public void updateBorderResaltarBusquedasFormularioCajaDiariaUsuario() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCajaDiariaUsuario.getComponents().length>0) {
	

		if(this.cajadiariausuarioConstantesFunciones.resaltarBusquedaCajaDiariaUsuarioCajaDiariaUsuario!=null) {
			index= this.jTabbedPaneBusquedasCajaDiariaUsuario.indexOfComponent(this.jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaDiariaUsuario.getComponent(index);
				jPanel.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarBusquedaCajaDiariaUsuarioCajaDiariaUsuario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCajaDiariaUsuario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCajaDiariaUsuario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaDiariaUsuario.indexOfComponent(this.jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaDiariaUsuario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarBusquedaCajaDiariaUsuarioCajaDiariaUsuario);
			if(!this.cajadiariausuarioConstantesFunciones.mostrarBusquedaCajaDiariaUsuarioCajaDiariaUsuario && index>-1) {
				this.jTabbedPaneBusquedasCajaDiariaUsuario.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCajaDiariaUsuario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCajaDiariaUsuario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaDiariaUsuario.indexOfComponent(this.jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaDiariaUsuario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajadiariausuarioConstantesFunciones.activarBusquedaCajaDiariaUsuarioCajaDiariaUsuario);
				this.jTabbedPaneBusquedasCajaDiariaUsuario.setEnabledAt(index,this.cajadiariausuarioConstantesFunciones.activarBusquedaCajaDiariaUsuarioCajaDiariaUsuario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCajaDiariaUsuario(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCajaDiariaUsuario")) {
			index= this.jTabbedPaneBusquedasCajaDiariaUsuario.indexOfComponent(this.jPanelBusquedaCajaDiariaUsuarioCajaDiariaUsuario);

			this.jTabbedPaneBusquedasCajaDiariaUsuario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaDiariaUsuario.getComponent(index);

			this.cajadiariausuarioConstantesFunciones.setResaltarBusquedaCajaDiariaUsuarioCajaDiariaUsuario(resaltar);

			jPanel.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarBusquedaCajaDiariaUsuarioCajaDiariaUsuario);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCajaDiariaUsuario.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCajaDiariaUsuario() throws Exception {

		if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCajaDiariaUsuario();
		this.updateVisibilidadResaltarControlesFormularioCajaDiariaUsuario();
		this.updateHabilitarResaltarControlesFormularioCajaDiariaUsuario();
		
	}
	
	public void updateBorderResaltarControlesFormularioCajaDiariaUsuario() throws Exception {
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cajadiariausuarioConstantesFunciones.resaltaridCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelidCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltaridCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarid_empresaCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarid_empresaCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarid_clienteCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarid_clienteCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarid_cajaCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarid_cajaCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarid_usuarioCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarid_usuarioCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarfecha_inicioCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jDateChooserfecha_inicioCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarfecha_inicioCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarfecha_finCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jDateChooserfecha_finCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarfecha_finCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarnombre_cajaCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_cajaCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarnombre_cajaCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarnombre_usuarioCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldnombre_usuarioCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarnombre_usuarioCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarsecuencialCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsecuencialCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarsecuencialCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarcodigo_clienteCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldcodigo_clienteCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarcodigo_clienteCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarnombre_clienteCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_clienteCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarnombre_clienteCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarsubtotalCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsubtotalCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarsubtotalCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarivaCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldivaCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarivaCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltardescuentoCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFielddescuentoCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltardescuentoCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarfinanciamientoCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfinanciamientoCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarfinanciamientoCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltarfleteCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfleteCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltarfleteCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltariceCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldiceCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltariceCajaDiariaUsuario);}
		if(this.cajadiariausuarioConstantesFunciones.resaltartotalCajaDiariaUsuario!=null && this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldtotalCajaDiariaUsuario.setBorder(this.cajadiariausuarioConstantesFunciones.resaltartotalCajaDiariaUsuario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCajaDiariaUsuario() throws Exception {		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
	
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelidCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostraridCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelidCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostraridCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarid_empresaCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelid_empresaCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarid_empresaCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarid_clienteCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelid_clienteCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarid_clienteCajaDiariaUsuario);
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_clienteCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarid_clienteCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarid_cajaCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelid_cajaCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarid_cajaCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarid_usuarioCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelid_usuarioCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarid_usuarioCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jDateChooserfecha_inicioCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarfecha_inicioCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelfecha_inicioCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarfecha_inicioCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jDateChooserfecha_finCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarfecha_finCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelfecha_finCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarfecha_finCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_cajaCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarnombre_cajaCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelnombre_cajaCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarnombre_cajaCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldnombre_usuarioCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarnombre_usuarioCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelnombre_usuarioCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarnombre_usuarioCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsecuencialCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarsecuencialCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelsecuencialCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarsecuencialCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldcodigo_clienteCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarcodigo_clienteCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelcodigo_clienteCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarcodigo_clienteCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_clienteCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarnombre_clienteCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelnombre_clienteCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarnombre_clienteCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsubtotalCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarsubtotalCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelsubtotalCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarsubtotalCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldivaCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarivaCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelivaCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarivaCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFielddescuentoCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrardescuentoCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPaneldescuentoCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrardescuentoCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfinanciamientoCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarfinanciamientoCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelfinanciamientoCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarfinanciamientoCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfleteCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarfleteCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPanelfleteCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrarfleteCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldiceCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrariceCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPaneliceCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrariceCajaDiariaUsuario);
		//this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldtotalCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrartotalCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jPaneltotalCajaDiariaUsuario.setVisible(this.cajadiariausuarioConstantesFunciones.mostrartotalCajaDiariaUsuario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCajaDiariaUsuario() throws Exception {
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaDiariaUsuario!=null) {
	
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jLabelidCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activaridCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_empresaCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarid_empresaCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_clienteCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarid_clienteCajaDiariaUsuario);
			this.jInternalFrameDetalleFormCajaDiariaUsuario.jButtonid_clienteCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarid_clienteCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_cajaCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarid_cajaCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jComboBoxid_usuarioCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarid_usuarioCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jDateChooserfecha_inicioCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarfecha_inicioCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jDateChooserfecha_finCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarfecha_finCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_cajaCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarnombre_cajaCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldnombre_usuarioCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarnombre_usuarioCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsecuencialCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarsecuencialCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldcodigo_clienteCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarcodigo_clienteCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextAreanombre_clienteCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarnombre_clienteCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldsubtotalCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarsubtotalCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldivaCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarivaCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFielddescuentoCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activardescuentoCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfinanciamientoCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarfinanciamientoCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldfleteCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activarfleteCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldiceCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activariceCajaDiariaUsuario);
		this.jInternalFrameDetalleFormCajaDiariaUsuario.jTextFieldtotalCajaDiariaUsuario.setEnabled(this.cajadiariausuarioConstantesFunciones.activartotalCajaDiariaUsuario);
		}
	}
	
		
}