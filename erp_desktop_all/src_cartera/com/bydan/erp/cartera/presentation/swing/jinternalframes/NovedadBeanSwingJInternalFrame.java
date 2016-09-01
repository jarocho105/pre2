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


import java.sql.Time;


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

import com.bydan.erp.cartera.util.NovedadConstantesFunciones;
import com.bydan.erp.cartera.util.NovedadParameterReturnGeneral;
//import com.bydan.erp.cartera.util.NovedadParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.NovedadBean;
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
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class NovedadBeanSwingJInternalFrame extends NovedadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NovedadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Novedad> novedadValidator = new ClassValidator<Novedad>(Novedad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Novedad novedad;	
	public Novedad novedadAux;
	public Novedad novedadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Novedad novedadTotales;
	public Long idNovedadActual;
	public Long iIdNuevoNovedad=0L;
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

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
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
	
	public Boolean isPermisoTodoNovedad;
	public Boolean isPermisoNuevoNovedad;
	public Boolean isPermisoActualizarNovedad;
	public Boolean isPermisoActualizarOriginalNovedad;
	public Boolean isPermisoEliminarNovedad;
	public Boolean isPermisoGuardarCambiosNovedad;
	public Boolean isPermisoConsultaNovedad;
	public Boolean isPermisoBusquedaNovedad;
	public Boolean isPermisoReporteNovedad;
	public Boolean isPermisoPaginacionMedioNovedad;
	public Boolean isPermisoPaginacionAltoNovedad;
	public Boolean isPermisoPaginacionTodoNovedad;
	public Boolean isPermisoCopiarNovedad;
	public Boolean isPermisoVerFormNovedad;
	public Boolean isPermisoDuplicarNovedad;
	public Boolean isPermisoOrdenNovedad;
	
	
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
	
	public NovedadParameterReturnGeneral novedadReturnGeneral;
	public NovedadParameterReturnGeneral novedadParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNovedad=false;
	public Boolean esParaAccionDesdeFormularioNovedad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NovedadSessionBeanAdditional novedadSessionBeanAdditional=null;
	
	public NovedadSessionBeanAdditional getNovedadSessionBeanAdditional() {
		return this.novedadSessionBeanAdditional;
	}
	
	public void setNovedadSessionBeanAdditional(NovedadSessionBeanAdditional novedadSessionBeanAdditional) {
		try {
			this.novedadSessionBeanAdditional=novedadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NovedadBeanSwingJInternalFrameAdditional novedadBeanSwingJInternalFrameAdditional=null;
	//public class NovedadBeanSwingJInternalFrame
	
	public NovedadBeanSwingJInternalFrameAdditional getNovedadBeanSwingJInternalFrameAdditional() {
		return this.novedadBeanSwingJInternalFrameAdditional;
	}
	
	public void setNovedadBeanSwingJInternalFrameAdditional(NovedadBeanSwingJInternalFrameAdditional novedadBeanSwingJInternalFrameAdditional) {
		try {
			this.novedadBeanSwingJInternalFrameAdditional=novedadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NovedadLogic novedadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Novedad novedadBean;
	public NovedadConstantesFunciones novedadConstantesFunciones;
	//public NovedadParameterReturnGeneral novedadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	public ClienteLogic clienteLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<Novedad> novedads;	
	//public List<Novedad> novedadsEliminados;
	//public List<Novedad> novedadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNovedad=false;
	public Boolean isVisibilidadCeldaDuplicarNovedad=true;
	public Boolean isVisibilidadCeldaCopiarNovedad=true;
	public Boolean isVisibilidadCeldaVerFormNovedad=true;
	public Boolean isVisibilidadCeldaOrdenNovedad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNovedad=false;
	public Boolean isVisibilidadCeldaModificarNovedad=false;
	public Boolean isVisibilidadCeldaActualizarNovedad=false;
	public Boolean isVisibilidadCeldaEliminarNovedad=false;
	public Boolean isVisibilidadCeldaCancelarNovedad=false;
	public Boolean isVisibilidadCeldaGuardarNovedad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNovedad=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoNovedad() {
		return this.iIdNuevoNovedad;
	}

	public void setiIdNuevoNovedad(Long iIdNuevoNovedad) {
		this.iIdNuevoNovedad = iIdNuevoNovedad;
	}
	
	public Long getidNovedadActual() {
		return this.idNovedadActual;
	}

	public void setidNovedadActual(Long idNovedadActual) {
		this.idNovedadActual = idNovedadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Novedad getnovedad() {
		return this.novedad;
	}

	public void setnovedad(Novedad novedad) {
		this.novedad = novedad;
	}
	
	public Novedad getnovedadAux() {
		return this.novedadAux;
	}

	public void setnovedadAux(Novedad novedadAux) {
		this.novedadAux = novedadAux;
	}				
	
	public Novedad getnovedadAnterior() {
		return this.novedadAnterior;
	}

	public void setnovedadAnterior(Novedad novedadAnterior) {
		this.novedadAnterior = novedadAnterior;
	}	
	
	public Novedad getnovedadTotales() {
		return this.novedadTotales;
	}

	public void setnovedadTotales(Novedad novedadTotales) {
		this.novedadTotales = novedadTotales;
	}	
	
	public Novedad getnovedadBean() {
		return this.novedadBean;
	}

	public void setnovedadBean(Novedad novedadBean) {
		this.novedadBean = novedadBean;
	}	
	
	public NovedadParameterReturnGeneral getnovedadReturnGeneral() {
		return this.novedadReturnGeneral;
	}

	public void setnovedadReturnGeneral(NovedadParameterReturnGeneral novedadReturnGeneral) {
		this.novedadReturnGeneral = novedadReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
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

	public Long id_usuarioFK_IdUsuario=-1L;

	public Long getid_usuarioFK_IdUsuario() {
		return this.id_usuarioFK_IdUsuario;
	}

	public void setid_usuarioFK_IdUsuario(Long id_usuarioFK_IdUsuario) {
		this.id_usuarioFK_IdUsuario = id_usuarioFK_IdUsuario;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public NovedadLogic getNovedadLogic()	{		
		return novedadLogic;
	}

	public void setNovedadLogic(NovedadLogic novedadLogic) {
		this.novedadLogic = novedadLogic;
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
	
	public Boolean getIsEsNuevoNovedad() {
		return isEsNuevoNovedad;
	}

	public void setIsEsNuevoNovedad(Boolean isEsNuevoNovedad) {
		this.isEsNuevoNovedad = isEsNuevoNovedad;
	}

	public Boolean getEsParaAccionDesdeFormularioNovedad() {
		return esParaAccionDesdeFormularioNovedad;
	}
	
	public void setEsParaAccionDesdeFormularioNovedad(Boolean esParaAccionDesdeFormularioNovedad) {
		this.esParaAccionDesdeFormularioNovedad = esParaAccionDesdeFormularioNovedad;
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

			if(this.novedadSessionBean==null) {
				this.novedadSessionBean=new NovedadSessionBean();
			}

			if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(novedadSessionBean.getlidEmpresaActual());
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

			if(this.novedadSessionBean==null) {
				this.novedadSessionBean=new NovedadSessionBean();
			}

			if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(novedadSessionBean.getlidSucursalActual());
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

			if(this.novedadSessionBean==null) {
				this.novedadSessionBean=new NovedadSessionBean();
			}

			if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(novedadSessionBean.getlidUsuarioActual());
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

			if(this.novedadSessionBean==null) {
				this.novedadSessionBean=new NovedadSessionBean();
			}

			if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(novedadSessionBean.getlidClienteActual());
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

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.novedadSessionBean==null) {
				this.novedadSessionBean=new NovedadSessionBean();
			}

			if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(novedadSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

					if(this.novedad!=null) {
						this.novedad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormNovedad!=null) {
						this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaNovedad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormNovedad!=null) {
						if(this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaNovedadGenerico)throws Exception
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
				jComboBoxid_empresaNovedadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaNovedadGenerico!=null && jComboBoxid_empresaNovedadGenerico.getItemCount()>0) {
					jComboBoxid_empresaNovedadGenerico.setSelectedIndex(0);
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

					if(this.novedad!=null) {
						this.novedad.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormNovedad!=null) {
						this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalNovedad.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormNovedad!=null) {
						if(this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalNovedadGenerico)throws Exception
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
				jComboBoxid_sucursalNovedadGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalNovedadGenerico!=null && jComboBoxid_sucursalNovedadGenerico.getItemCount()>0) {
					jComboBoxid_sucursalNovedadGenerico.setSelectedIndex(0);
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

					if(this.novedad!=null) {
						this.novedad.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormNovedad!=null) {
						this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioNovedad.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormNovedad!=null) {
						if(this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioNovedadGenerico)throws Exception
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
				jComboBoxid_usuarioNovedadGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioNovedadGenerico!=null && jComboBoxid_usuarioNovedadGenerico.getItemCount()>0) {
					jComboBoxid_usuarioNovedadGenerico.setSelectedIndex(0);
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

					if(this.novedad!=null) {
						this.novedad.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormNovedad!=null) {
						this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteNovedad.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormNovedad!=null) {
						if(this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteNovedad!=null) {
						jComboBoxid_clienteFK_IdClienteNovedad.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteNovedad!=null) {
							//jComboBoxid_clienteFK_IdClienteNovedad.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteNovedad.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteNovedad.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteNovedadGenerico)throws Exception
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
				jComboBoxid_clienteNovedadGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteNovedadGenerico!=null && jComboBoxid_clienteNovedadGenerico.getItemCount()>0) {
					jComboBoxid_clienteNovedadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.novedad!=null) {
						this.novedad.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormNovedad!=null) {
						this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoNovedad.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormNovedad!=null) {
						if(this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.getItemCount()>0) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoNovedad!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoNovedad.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoNovedad!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoNovedad.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoNovedad.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoNovedad.setSelectedIndex(0);
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

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoNovedadGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoNovedadGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoNovedadGenerico!=null && jComboBoxid_empleadoNovedadGenerico.getItemCount()>0) {
					jComboBoxid_empleadoNovedadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Novedad novedad,JComboBox jComboBoxid_empresaNovedadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaNovedadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaNovedadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				novedad.setid_empresa(empresaAux.getId());
				novedad.setempresa_descripcion(NovedadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				novedad.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Novedad novedad,JComboBox jComboBoxid_sucursalNovedadGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalNovedadGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalNovedadGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				novedad.setid_sucursal(sucursalAux.getId());
				novedad.setsucursal_descripcion(NovedadConstantesFunciones.getSucursalDescripcion(sucursalAux));
				novedad.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(Novedad novedad,JComboBox jComboBoxid_usuarioNovedadGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioNovedadGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioNovedadGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				novedad.setid_usuario(usuarioAux.getId());
				novedad.setusuario_descripcion(NovedadConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				novedad.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(Novedad novedad,JComboBox jComboBoxid_clienteNovedadGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteNovedadGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteNovedadGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				novedad.setid_cliente(clienteAux.getId());
				novedad.setcliente_descripcion(NovedadConstantesFunciones.getClienteDescripcion(clienteAux));
				novedad.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(Novedad novedad,JComboBox jComboBoxid_empleadoNovedadGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoNovedadGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoNovedadGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				novedad.setid_empleado(empleadoAux.getId());
				novedad.setempleado_descripcion(NovedadConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				novedad.setEmpleado(empleadoAux);			}
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

					if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedad!=null) { 
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedad!=null) { 
					}

					if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
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

					if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedad!=null) { 
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedad!=null) { 
					}

					if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
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

					if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedad!=null) { 
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedad!=null) { 
					}

					if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
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

					if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedad!=null) { 
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedad!=null) { 
					}

					if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteNovedad.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteNovedad.addItem(cliente);
							}
						}

						if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNovedad!=null) { 
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNovedad!=null) { 
					}

					if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoNovedad.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoNovedad.addItem(empleado);
							}
						}

						if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormNovedad!=null) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedad!=null) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormNovedad!=null) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedad!=null) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormNovedad!=null) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedad!=null) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormNovedad!=null) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedad!=null) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteNovedad.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteNovedad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNovedad!=null) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormNovedad!=null) {
							this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoNovedad.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoNovedad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesNovedad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			NovedadConstantesFunciones.refrescarForeignKeysDescripcionesNovedad(this.novedadLogic.getNovedads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			NovedadConstantesFunciones.refrescarForeignKeysDescripcionesNovedad(this.novedads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//novedadLogic.setNovedads(this.novedads);
			novedadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public NovedadParameterReturnGeneral getNovedadParameterGeneral() {
		return this.novedadParameterGeneral;
	}
	
	public void setNovedadParameterGeneral(NovedadParameterReturnGeneral novedadParameterGeneral) {
		this.novedadParameterGeneral = novedadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNovedad() {
		return isPermisoTodoNovedad;
	}

	public void setIsPermisoTodoNovedad(Boolean isPermisoTodoNovedad) {
		this.isPermisoTodoNovedad = isPermisoTodoNovedad;
	}

	public Boolean getIsPermisoNuevoNovedad() {
		return isPermisoNuevoNovedad;
	}

	public void setIsPermisoNuevoNovedad(Boolean isPermisoNuevoNovedad) {
		this.isPermisoNuevoNovedad = isPermisoNuevoNovedad;
	}

	public Boolean getIsPermisoActualizarNovedad() {
		return isPermisoActualizarNovedad;
	}

	public void setIsPermisoActualizarNovedad(Boolean isPermisoActualizarNovedad) {
		this.isPermisoActualizarNovedad = isPermisoActualizarNovedad;
	}

	public Boolean getIsPermisoEliminarNovedad() {
		return isPermisoEliminarNovedad;
	}

	public void setIsPermisoEliminarNovedad(Boolean isPermisoEliminarNovedad) {
		this.isPermisoEliminarNovedad = isPermisoEliminarNovedad;
	}

	public Boolean getIsPermisoGuardarCambiosNovedad() {
		return isPermisoGuardarCambiosNovedad;
	}

	public void setIsPermisoGuardarCambiosNovedad(Boolean isPermisoGuardarCambiosNovedad) {
		this.isPermisoGuardarCambiosNovedad = isPermisoGuardarCambiosNovedad;
	}
	
	public Boolean getIsPermisoConsultaNovedad() {
		return isPermisoConsultaNovedad;
	}

	public void setIsPermisoConsultaNovedad(Boolean isPermisoConsultaNovedad) {
		this.isPermisoConsultaNovedad = isPermisoConsultaNovedad;
	}

	public Boolean getIsPermisoBusquedaNovedad() {
		return isPermisoBusquedaNovedad;
	}

	public void setIsPermisoBusquedaNovedad(Boolean isPermisoBusquedaNovedad) {
		this.isPermisoBusquedaNovedad = isPermisoBusquedaNovedad;
	}

	public Boolean getIsPermisoReporteNovedad() {
		return isPermisoReporteNovedad;
	}

	public void setIsPermisoReporteNovedad(Boolean isPermisoReporteNovedad) {
		this.isPermisoReporteNovedad = isPermisoReporteNovedad;
	}
	
	public Boolean getIsPermisoPaginacionMedioNovedad() {
		return isPermisoPaginacionMedioNovedad;
	}

	public void setIsPermisoPaginacionMedioNovedad(Boolean isPermisoPaginacionMedioNovedad) {
		this.isPermisoPaginacionMedioNovedad = isPermisoPaginacionMedioNovedad;
	}
	
	public Boolean getIsPermisoPaginacionTodoNovedad() {
		return isPermisoPaginacionTodoNovedad;
	}

	public void setIsPermisoPaginacionTodoNovedad(Boolean isPermisoPaginacionTodoNovedad) {
		this.isPermisoPaginacionTodoNovedad = isPermisoPaginacionTodoNovedad;
	}
	
	public Boolean getIsPermisoPaginacionAltoNovedad() {
		return isPermisoPaginacionAltoNovedad;
	}

	public void setIsPermisoPaginacionAltoNovedad(Boolean isPermisoPaginacionAltoNovedad) {
		this.isPermisoPaginacionAltoNovedad = isPermisoPaginacionAltoNovedad;
	}
	
	public Boolean getIsPermisoCopiarNovedad() {
		return isPermisoCopiarNovedad;
	}

	public void setIsPermisoCopiarNovedad(Boolean isPermisoCopiarNovedad) {
		this.isPermisoCopiarNovedad = isPermisoCopiarNovedad;
	}
	
	public Boolean getIsPermisoVerFormNovedad() {
		return isPermisoVerFormNovedad;
	}

	public void setIsPermisoVerFormNovedad(Boolean isPermisoVerFormNovedad) {
		this.isPermisoVerFormNovedad = isPermisoVerFormNovedad;
	}
	
	public Boolean getIsPermisoDuplicarNovedad() {
		return isPermisoDuplicarNovedad;
	}

	public void setIsPermisoDuplicarNovedad(Boolean isPermisoDuplicarNovedad) {
		this.isPermisoDuplicarNovedad = isPermisoDuplicarNovedad;
	}
	
	public Boolean getIsPermisoOrdenNovedad() {
		return isPermisoOrdenNovedad;
	}

	public void setIsPermisoOrdenNovedad(Boolean isPermisoOrdenNovedad) {
		this.isPermisoOrdenNovedad = isPermisoOrdenNovedad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNovedad() {
		return isVisibilidadCeldaNuevoNovedad;
	}

	public void setIsVisibilidadCeldaNuevoNovedad(Boolean isVisibilidadCeldaNuevoNovedad) {
		this.isVisibilidadCeldaNuevoNovedad = isVisibilidadCeldaNuevoNovedad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNovedad() {
		return isVisibilidadCeldaDuplicarNovedad;
	}

	public void setIsVisibilidadCeldaDuplicarNovedad(Boolean isVisibilidadCeldaDuplicarNovedad) {
		this.isVisibilidadCeldaDuplicarNovedad = isVisibilidadCeldaDuplicarNovedad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNovedad() {
		return isVisibilidadCeldaCopiarNovedad;
	}

	public void setIsVisibilidadCeldaCopiarNovedad(Boolean isVisibilidadCeldaCopiarNovedad) {
		this.isVisibilidadCeldaCopiarNovedad = isVisibilidadCeldaCopiarNovedad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNovedad() {
		return isVisibilidadCeldaVerFormNovedad;
	}

	public void setIsVisibilidadCeldaVerFormNovedad(Boolean isVisibilidadCeldaVerFormNovedad) {
		this.isVisibilidadCeldaVerFormNovedad = isVisibilidadCeldaVerFormNovedad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNovedad() {
		return isVisibilidadCeldaOrdenNovedad;
	}

	public void setIsVisibilidadCeldaOrdenNovedad(Boolean isVisibilidadCeldaOrdenNovedad) {
		this.isVisibilidadCeldaOrdenNovedad = isVisibilidadCeldaOrdenNovedad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNovedad() {
		return isVisibilidadCeldaNuevoRelacionesNovedad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNovedad(Boolean isVisibilidadCeldaNuevoRelacionesNovedad) {
		this.isVisibilidadCeldaNuevoRelacionesNovedad = isVisibilidadCeldaNuevoRelacionesNovedad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNovedad() {
		return isVisibilidadCeldaModificarNovedad;
	}

	public void setIsVisibilidadCeldaModificarNovedad(Boolean isVisibilidadCeldaModificarNovedad) {
		this.isVisibilidadCeldaModificarNovedad = isVisibilidadCeldaModificarNovedad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNovedad() {
		return isVisibilidadCeldaActualizarNovedad;
	}

	public void setIsVisibilidadCeldaActualizarNovedad(Boolean isVisibilidadCeldaActualizarNovedad) {
		this.isVisibilidadCeldaActualizarNovedad = isVisibilidadCeldaActualizarNovedad;
	}

	public Boolean getIsVisibilidadCeldaEliminarNovedad() {
		return isVisibilidadCeldaEliminarNovedad;
	}

	public void setIsVisibilidadCeldaEliminarNovedad(Boolean isVisibilidadCeldaEliminarNovedad) {
		this.isVisibilidadCeldaEliminarNovedad = isVisibilidadCeldaEliminarNovedad;
	}

	public Boolean getIsVisibilidadCeldaCancelarNovedad() {
		return isVisibilidadCeldaCancelarNovedad;
	}

	public void setIsVisibilidadCeldaCancelarNovedad(Boolean isVisibilidadCeldaCancelarNovedad) {
		this.isVisibilidadCeldaCancelarNovedad = isVisibilidadCeldaCancelarNovedad;
	}

	public Boolean getIsVisibilidadCeldaGuardarNovedad() {
		return isVisibilidadCeldaGuardarNovedad;
	}

	public void setIsVisibilidadCeldaGuardarNovedad(Boolean isVisibilidadCeldaGuardarNovedad) {
		this.isVisibilidadCeldaGuardarNovedad = isVisibilidadCeldaGuardarNovedad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNovedad() {
		return isVisibilidadCeldaGuardarCambiosNovedad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNovedad(Boolean isVisibilidadCeldaGuardarCambiosNovedad) {
		this.isVisibilidadCeldaGuardarCambiosNovedad = isVisibilidadCeldaGuardarCambiosNovedad;
	}
		
	public NovedadSessionBean getnovedadSessionBean() {
		return this.novedadSessionBean;
	}
	
	public void setnovedadSessionBean(NovedadSessionBean novedadSessionBean) {
		this.novedadSessionBean=novedadSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
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

	public Boolean getisVisibilidadFK_IdUsuario() {
		return this.isVisibilidadFK_IdUsuario;
	}

	public void setisVisibilidadFK_IdUsuario(Boolean isVisibilidadFK_IdUsuario) {
		this.isVisibilidadFK_IdUsuario=isVisibilidadFK_IdUsuario;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNovedad(Novedad novedad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(novedad,null);
				this.setActualParaGuardarSucursalForeignKey(novedad,null);
				this.setActualParaGuardarUsuarioForeignKey(novedad,null);
				this.setActualParaGuardarClienteForeignKey(novedad,null);
				this.setActualParaGuardarEmpleadoForeignKey(novedad,null);
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
	
	public void bugActualizarReferenciaActual(Novedad novedad,Novedad novedadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNovedad(novedad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		novedadAux.setId(novedad.getId());
		novedadAux.setVersionRow(novedad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessNovedad();
		
			int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(NovedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = novedadValidator.getInvalidValues(this.novedad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			novedadLogic.setDatosCliente(datosCliente);
			novedadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				novedadAux=new  Novedad();
				
				novedadAux.setIsNew(true);
				novedadAux.setIsChanged(true);
				
				novedadAux.setNovedadOriginal(this.novedad);
				
				novedadAux.setId(this.novedad.getId());	
				novedadAux.setVersionRow(this.novedad.getVersionRow());	
				novedadAux.setid_empresa(this.novedad.getid_empresa());	
				novedadAux.setid_sucursal(this.novedad.getid_sucursal());	
				novedadAux.setid_usuario(this.novedad.getid_usuario());	
				novedadAux.setid_cliente(this.novedad.getid_cliente());	
				novedadAux.setdescripcion(this.novedad.getdescripcion());	
				novedadAux.setaccion_tomada(this.novedad.getaccion_tomada());	
				novedadAux.setfeha_atencion(this.novedad.getfeha_atencion());	
				novedadAux.sethora_atencion(this.novedad.gethora_atencion());	
				novedadAux.setid_empleado(this.novedad.getid_empleado());	
				novedadAux.setemail(this.novedad.getemail());	
				novedadAux.setesta_activo(this.novedad.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.novedadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.novedadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(novedadAux,novedadLogic.getNovedads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadAux,novedads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.novedadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadLogic.saveNovedads();//WithConnection
						//novedadLogic.getSetVersionRowNovedads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.novedad,novedadAux);
					
					this.refrescarForeignKeysDescripcionesNovedad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadLogic.saveNovedadRelaciones(novedadAux);//WithConnection
								//novedadLogic.getSetVersionRowNovedads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.novedad,novedadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.novedadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.novedadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(novedadAux,novedadLogic.getNovedads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(novedadAux,novedads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.novedad,novedadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				novedadAux=new  Novedad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.novedadSessionBean.getEsGuardarRelacionado() 
					|| (this.novedadSessionBean.getEsGuardarRelacionado() && this.novedad.getId()>=0)) {
						
					novedadAux.setIsNew(false);
				}
				
				novedadAux.setIsDeleted(false);
			
				novedadAux.setId(this.novedad.getId());	
				novedadAux.setVersionRow(this.novedad.getVersionRow());	
				novedadAux.setid_empresa(this.novedad.getid_empresa());	
				novedadAux.setid_sucursal(this.novedad.getid_sucursal());	
				novedadAux.setid_usuario(this.novedad.getid_usuario());	
				novedadAux.setid_cliente(this.novedad.getid_cliente());	
				novedadAux.setdescripcion(this.novedad.getdescripcion());	
				novedadAux.setaccion_tomada(this.novedad.getaccion_tomada());	
				novedadAux.setfeha_atencion(this.novedad.getfeha_atencion());	
				novedadAux.sethora_atencion(this.novedad.gethora_atencion());	
				novedadAux.setid_empleado(this.novedad.getid_empleado());	
				novedadAux.setemail(this.novedad.getemail());	
				novedadAux.setesta_activo(this.novedad.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(novedadAux,novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadAux,novedads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.novedadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadLogic.saveNovedads();//WithConnection
						//novedadLogic.getSetVersionRowNovedads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.novedad,novedadAux);
					
					this.refrescarForeignKeysDescripcionesNovedad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadLogic.saveNovedadRelaciones(novedadAux);//WithConnection
								//novedadLogic.getSetVersionRowNovedads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.novedad,novedadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.novedadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.novedadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(novedadAux,novedadLogic.getNovedads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(novedadAux,novedads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.novedad,novedadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				novedadAux=new  Novedad();
				
				novedadAux.setIsNew(false);
				novedadAux.setIsChanged(false);
				
				novedadAux.setIsDeleted(true);
				
				novedadAux.setId(this.novedad.getId());	
				novedadAux.setVersionRow(this.novedad.getVersionRow());	
				novedadAux.setid_empresa(this.novedad.getid_empresa());	
				novedadAux.setid_sucursal(this.novedad.getid_sucursal());	
				novedadAux.setid_usuario(this.novedad.getid_usuario());	
				novedadAux.setid_cliente(this.novedad.getid_cliente());	
				novedadAux.setdescripcion(this.novedad.getdescripcion());	
				novedadAux.setaccion_tomada(this.novedad.getaccion_tomada());	
				novedadAux.setfeha_atencion(this.novedad.getfeha_atencion());	
				novedadAux.sethora_atencion(this.novedad.gethora_atencion());	
				novedadAux.setid_empleado(this.novedad.getid_empleado());	
				novedadAux.setemail(this.novedad.getemail());	
				novedadAux.setesta_activo(this.novedad.getesta_activo());	
				
				if(this.novedadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.novedadAux.getId()>=0) {	
						this.novedadsEliminados.add(novedadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(novedadAux,novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadAux,novedads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.novedadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.novedadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadLogic.saveNovedads();//WithConnection
						//novedadLogic.getSetVersionRowNovedads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.novedadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								novedadLogic.saveNovedadRelaciones(novedadAux);//WithConnection
								//novedadLogic.getSetVersionRowNovedads();//WithConnection
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
							if(this.novedadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.novedadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(novedadAux,novedadLogic.getNovedads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(novedadAux,novedads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNovedads().addAll(this.novedadsEliminados);
					
					novedadLogic.saveNovedads();//WithConnection
					//novedadLogic.getSetVersionRowNovedads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesNovedad();
				
				this.novedadsEliminados= new ArrayList<Novedad>();		
			}
			
			if(this.novedadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Novedad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Novedad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.novedad=novedadAux;
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
      		//this.finishProcessNovedad();
      	}
		
	}	
	
	public void actualizarRelaciones(Novedad novedadLocal) throws Exception {
		
		if(this.novedadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Novedad novedadLocal) throws Exception {	
		if(this.novedadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				novedadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				novedadLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				novedadLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				novedadLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				novedadLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarNovedadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = novedadValidator.getInvalidValues(this.novedad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Novedad novedad,List<Novedad> novedads) throws Exception {
		try	{		
			NovedadConstantesFunciones.actualizarLista(novedad,novedads,this.novedadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Novedad novedad,List<Novedad> novedads) throws Exception {
		try	{			
			NovedadConstantesFunciones.actualizarSelectedLista(novedad,novedads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Novedad> novedadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				novedadsLocal=this.novedadLogic.getNovedads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				novedadsLocal=this.novedads;
			}
			//ARCHITECTURE
		
			for(Novedad novedadLocal:novedadsLocal) {
				if(this.permiteMantenimiento(novedadLocal) && novedadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NovedadConstantesFunciones.getNovedadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NovedadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelid_empresaNovedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelid_sucursalNovedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelid_usuarioNovedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelid_clienteNovedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabeldescripcionNovedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadConstantesFunciones.ACCIONTOMADA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelaccion_tomadaNovedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadConstantesFunciones.FEHAATENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelfeha_atencionNovedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadConstantesFunciones.HORAATENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelhora_atencionNovedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelid_empleadoNovedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelemailNovedad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NovedadConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelesta_activoNovedad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNovedad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedad.jLabelid_empresaNovedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedad.jLabelid_sucursalNovedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedad.jLabelid_usuarioNovedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedad.jLabelid_clienteNovedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedad.jLabeldescripcionNovedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedad.jLabelaccion_tomadaNovedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedad.jLabelfeha_atencionNovedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedad.jLabelhora_atencionNovedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedad.jLabelid_empleadoNovedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedad.jLabelemailNovedad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNovedad.jLabelesta_activoNovedad,"");
		
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
		this.iIdNuevoNovedad--;	
		
		
		this.novedadAux=new Novedad();
		
		this.novedadAux.setId(this.iIdNuevoNovedad);
		this.novedadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.novedadLogic.getNovedads().add(this.novedadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.novedads.add(this.novedadAux);
		}
		//ARCHITECTURE
		
		this.novedad=this.novedadAux;
		
		if(NovedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNovedad(this.novedad);
			this.setVariablesObjetoActualToFormularioForeignKeyNovedad(this.novedad);
		}
				
		//this.setDefaultControlesNovedad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNovedad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNovedad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNovedad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNovedad(this.novedadBean,this.novedad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(NovedadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.novedadSessionBean.getConGuardarRelaciones()) {
			classes=NovedadConstantesFunciones.getClassesRelationshipsOfNovedad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.novedadReturnGeneral=novedadLogic.procesarEventosNovedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedadLogic.getNovedads(),this.novedad,this.novedadParameterGeneral,this.isEsNuevoNovedad,classes);//this.novedadLogic.getNovedad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNovedad(this.novedadReturnGeneral,this.novedadBean,false);
		
		if(this.novedadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNovedad(this.novedadReturnGeneral.getNovedad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNovedad(this.novedadReturnGeneral.getNovedad());
		}
		
		if(this.novedadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNovedad(this.novedadReturnGeneral.getNovedad(),classes);//this.novedadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNovedad(this.novedad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNovedad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNovedad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NovedadBeanSwingJInternalFrameAdditional.RecargarFormNovedad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNovedad(false);
						
			if(novedadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(NovedadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedad();
			}
			
			this.actualizarVisualTableDatosNovedad();
			
			this.jTableDatosNovedad.setRowSelectionInterval(this.getIndiceNuevoNovedad(), this.getIndiceNuevoNovedad());
			
			this.seleccionarFilaTablaNovedadActual();
						
			this.actualizarEstadoCeldasBotonesNovedad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNovedad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNovedad.jTextAreadescripcionNovedad.setEnabled(isHabilitar && this.novedadConstantesFunciones.activardescripcionNovedad);
		this.jInternalFrameDetalleFormNovedad.jTextAreaaccion_tomadaNovedad.setEnabled(isHabilitar && this.novedadConstantesFunciones.activaraccion_tomadaNovedad);
		this.jInternalFrameDetalleFormNovedad.jDateChooserfeha_atencionNovedad.setEnabled(isHabilitar && this.novedadConstantesFunciones.activarfeha_atencionNovedad);
		this.jInternalFrameDetalleFormNovedad.jSpinnerhora_atencionNovedad.setEnabled(isHabilitar && this.novedadConstantesFunciones.activarhora_atencionNovedad);
		this.jInternalFrameDetalleFormNovedad.jTextFieldemailNovedad.setEnabled(isHabilitar && this.novedadConstantesFunciones.activaremailNovedad);
		this.jInternalFrameDetalleFormNovedad.jCheckBoxesta_activoNovedad.setEnabled(isHabilitar && this.novedadConstantesFunciones.activaresta_activoNovedad);	
		//
		this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.setEnabled(isHabilitar && this.novedadConstantesFunciones.activarid_empresaNovedad);//
		this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.setEnabled(isHabilitar && this.novedadConstantesFunciones.activarid_sucursalNovedad);//
		this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.setEnabled(isHabilitar && this.novedadConstantesFunciones.activarid_usuarioNovedad);
		this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.setEnabled(isHabilitar && this.novedadConstantesFunciones.activarid_clienteNovedad);
		this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.setEnabled(isHabilitar && this.novedadConstantesFunciones.activarid_empleadoNovedad);
	};
	
	public void setDefaultControlesNovedad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNovedad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.novedadSessionBean.setConGuardarRelaciones(true);			
			this.novedadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNovedad.jTabbedPaneRelacionesNovedad.setVisible(true);
			
					
		} else {
			//this.novedadSessionBean.setConGuardarRelaciones(false);			
			this.novedadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNovedad.jTabbedPaneRelacionesNovedad.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoNovedad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Novedad novedadAux:this.novedadLogic.getNovedads()) {
				if(novedadAux.getId().equals(this.iIdNuevoNovedad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Novedad novedadAux:this.novedads) {
				if(novedadAux.getId().equals(this.iIdNuevoNovedad)) {
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
	
	public int getIndiceActualNovedad(Novedad novedad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Novedad novedadAux:this.novedadLogic.getNovedads()) {
				if(novedadAux.getId().equals(novedad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Novedad novedadAux:this.novedads) {
				if(novedadAux.getId().equals(novedad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNovedad(Novedad novedadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Novedad novedadAux:this.novedadLogic.getNovedads()) {
				if(novedadAux.getNovedadOriginal().getId().equals(novedadOriginal.getId())) {
					existe=true;
					novedadOriginal.setId(novedadAux.getId());
					novedadOriginal.setVersionRow(novedadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Novedad novedadAux:this.novedads) {
				if(novedadAux.getNovedadOriginal().getId().equals(novedadOriginal.getId())) {
					existe=true;
					novedadOriginal.setId(novedadAux.getId());
					novedadOriginal.setVersionRow(novedadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNovedad(Boolean esParaCancelar) throws Exception {
		novedadsAux=new ArrayList<Novedad>();
		novedadAux=new Novedad();
		
		if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Novedad novedadAux:this.novedadLogic.getNovedads()) {
					if(novedadAux.getId()<0) {
						novedadsAux.add(novedadAux);
					}		
				}
				this.iIdNuevoNovedad=0L;
				this.novedadLogic.getNovedads().removeAll(novedadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Novedad novedadAux:this.novedads) {
					if(novedadAux.getId()<0) {
						novedadsAux.add(novedadAux);
					}		
				}
				this.iIdNuevoNovedad=0L;
				this.novedads.removeAll(novedadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNovedad 
					&& this.novedadLogic.getNovedads().size()>0
					) {
					novedadAux=this.novedadLogic.getNovedads().get(this.novedadLogic.getNovedads().size() - 1);
				
					if(novedadAux.getId()<0) {
						this.novedadLogic.getNovedads().remove(novedadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNovedad && this.novedads.size()>0) {
					novedadAux=this.novedads.get(this.novedads.size() - 1);
				
					if(novedadAux.getId()<0) {
						this.novedads.remove(novedadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNovedad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(novedad.getId()<0) {
				this.novedadLogic.getNovedads().remove(this.novedad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(novedad.getId()<0) {
				this.novedads.remove(this.novedad);
			}
		}			
	}
	
	public void setEstadosInicialesNovedad(List<Novedad> novedadsAux) throws Exception {
		NovedadConstantesFunciones.setEstadosInicialesNovedad(novedadsAux);
	}
	
	public void setEstadosInicialesNovedad(Novedad novedadAux) throws Exception {
		NovedadConstantesFunciones.setEstadosInicialesNovedad(novedadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNovedadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNovedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNovedadActual()) {
				if(!this.isEsNuevoNovedad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNovedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNovedad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNovedadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Novedad ?", "MANTENIMIENTO DE Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNovedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Novedad novedad) throws Exception {
		NovedadConstantesFunciones.seleccionarAsignar(this.novedad,novedad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNovedad=this.isPermisoActualizarOriginalNovedad;
			
			
			this.seleccionarAsignar(novedad);
			
			

			idClienteActual=novedad.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NovedadConstantesFunciones.quitarEspaciosNovedad(this.novedad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesNovedad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.novedadSessionBean.setsFuncionBusquedaRapida(this.novedadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoNovedad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNovedad(esParaCancelar);				
				this.cancelarNuevoNovedad(esParaCancelar);								
			}
			
			this.novedad=new Novedad();
			
			this.inicializarNovedad();
			
			this.actualizarEstadoCeldasBotonesNovedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNovedad() throws Exception {
		try {
			NovedadConstantesFunciones.inicializarNovedad(this.novedad);
			
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
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.novedadLogic.getNovedads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNovedads(String sAccionBusqueda,List<Novedad> novedadsParaReportes) throws Exception {
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
					sPathReporteFinal="Novedad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NovedadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NovedadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Novedad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Novedades");		
		parameters.put("busquedapor", NovedadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNovedad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NovedadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NovedadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNovedad=new JRBeanArrayDataSource(NovedadJInternalFrame.TraerNovedadBeans(novedadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNovedad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NovedadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NovedadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NovedadBean.TraerNovedadBeans(novedadsParaReportes).toArray()));
							
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
				this.generarExcelReporteNovedads(sAccionBusqueda,sTipoArchivoReporte,novedadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNovedads(sAccionBusqueda,sTipoArchivoReporte,novedadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNovedadActionPerformed(null);
					//this.generarExcelReporteNovedads(sAccionBusqueda,sTipoArchivoReporte,novedadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNovedads(sAccionBusqueda,sTipoArchivoReporte,novedadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNovedads(sAccionBusqueda,sTipoArchivoReporte,novedadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNovedads(sAccionBusqueda,sTipoArchivoReporte,novedadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNovedads(String sAccionBusqueda,String sTipoArchivoReporte,List<Novedad> novedadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Novedads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNovedad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Novedad novedad : novedadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NovedadConstantesFunciones.generarExcelReporteDataNovedad("NORMAL",row,workbook,novedad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNovedad(String sTipo,Row row,Workbook workbook) {
		
		NovedadConstantesFunciones.generarExcelReporteHeaderNovedad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNovedads(String sAccionBusqueda,String sTipoArchivoReporte,List<Novedad> novedadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Novedads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Novedad novedad : novedadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NovedadConstantesFunciones.getNovedadDescripcion(novedad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedad.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedad.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedad.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedad.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadConstantesFunciones.LABEL_ACCIONTOMADA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadConstantesFunciones.LABEL_ACCIONTOMADA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedad.getaccion_tomada());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadConstantesFunciones.LABEL_FEHAATENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadConstantesFunciones.LABEL_FEHAATENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedad.getfeha_atencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadConstantesFunciones.LABEL_HORAATENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadConstantesFunciones.LABEL_HORAATENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedad.gethora_atencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedad.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(novedad.getemail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NovedadConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NovedadConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(novedad.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNovedads(String sAccionBusqueda,String sTipoArchivoReporte,List<Novedad> novedadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Novedad> novedadsRespaldo=null;
		
		classes=NovedadConstantesFunciones.getClassesRelationshipsOfNovedad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.novedadLogic.setDatosCliente(this.datosCliente);
		this.novedadLogic.setDatosDeep(this.datosDeep);
		this.novedadLogic.setIsConDeep(true);
		
		novedadsRespaldo=this.novedadLogic.getNovedads();
		
		this.novedadLogic.setNovedads(novedadsParaReportes);	
		this.novedadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		novedadsParaReportes=this.novedadLogic.getNovedads();
		this.novedadLogic.setNovedads(novedadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Novedads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNovedad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Novedad novedad : novedadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNovedad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NovedadConstantesFunciones.generarExcelReporteDataNovedad("NORMAL",row,workbook,novedad,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(NovedadConstantesFunciones.getNovedadDescripcion(novedad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNovedad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNovedad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNovedad() throws Exception {		
		this.startProcessNovedad(true);
	}
	
	public void startProcessNovedad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasNovedad ,this.jPanelParametrosReportesNovedad, this.jScrollPanelDatosNovedad,this.jPanelPaginacionNovedad, this.jScrollPanelDatosEdicionNovedad, this.jPanelAccionesNovedad,this.jPanelAccionesFormularioNovedad,this.jmenuBarNovedad,this.jmenuBarDetalleNovedad,this.jTtoolBarNovedad,this.jTtoolBarDetalleNovedad);		
		
		final JTabbedPane jTabbedPaneBusquedasNovedad=this.jTabbedPaneBusquedasNovedad; 
		
		final JPanel jPanelParametrosReportesNovedad=this.jPanelParametrosReportesNovedad;
		//final JScrollPane jScrollPanelDatosNovedad=this.jScrollPanelDatosNovedad;
		final JTable jTableDatosNovedad=this.jTableDatosNovedad;		
		final JPanel jPanelPaginacionNovedad=this.jPanelPaginacionNovedad;
		//final JScrollPane jScrollPanelDatosEdicionNovedad=this.jScrollPanelDatosEdicionNovedad;
		final JPanel jPanelAccionesNovedad=this.jPanelAccionesNovedad;
		
		JPanel jPanelCamposAuxiliarNovedad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNovedad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNovedad!=null) {
			jPanelCamposAuxiliarNovedad=this.jInternalFrameDetalleFormNovedad.jPanelCamposNovedad;
			jPanelAccionesFormularioAuxiliarNovedad=this.jInternalFrameDetalleFormNovedad.jPanelAccionesFormularioNovedad;
		}
		
		final JPanel jPanelCamposNovedad=jPanelCamposAuxiliarNovedad;
		final JPanel jPanelAccionesFormularioNovedad=jPanelAccionesFormularioAuxiliarNovedad;
		
		
		final JMenuBar jmenuBarNovedad=this.jmenuBarNovedad;
		final JToolBar jTtoolBarNovedad=this.jTtoolBarNovedad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNovedad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNovedad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) {
			jmenuBarDetalleAuxiliarNovedad=this.jInternalFrameDetalleFormNovedad.jmenuBarDetalleNovedad;
			jTtoolBarDetalleAuxiliarNovedad=this.jInternalFrameDetalleFormNovedad.jTtoolBarDetalleNovedad;
		}
		
		final JMenuBar jmenuBarDetalleNovedad=jmenuBarDetalleAuxiliarNovedad;
		final JToolBar jTtoolBarDetalleNovedad=jTtoolBarDetalleAuxiliarNovedad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNovedad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNovedad;
			processRunnable.jTableDatos=jTableDatosNovedad;
			processRunnable.jPanelCampos=jPanelCamposNovedad;
			processRunnable.jPanelPaginacion=jPanelPaginacionNovedad;
			processRunnable.jPanelAcciones=jPanelAccionesNovedad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNovedad;
			
			
			processRunnable.jmenuBar=jmenuBarNovedad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNovedad;
			processRunnable.jTtoolBar=jTtoolBarNovedad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNovedad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNovedad ,jPanelParametrosReportesNovedad,jTableDatosNovedad, /*jScrollPanelDatosNovedad,*/jPanelCamposNovedad,jPanelPaginacionNovedad, /*jScrollPanelDatosEdicionNovedad,*/ jPanelAccionesNovedad,jPanelAccionesFormularioNovedad,jmenuBarNovedad,jmenuBarDetalleNovedad,jTtoolBarNovedad,jTtoolBarDetalleNovedad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNovedad ,jPanelParametrosReportesNovedad, jScrollPanelDatosNovedad,jPanelPaginacionNovedad, jScrollPanelDatosEdicionNovedad, jPanelAccionesNovedad,jPanelAccionesFormularioNovedad,jmenuBarNovedad,jmenuBarDetalleNovedad,jTtoolBarNovedad,jTtoolBarDetalleNovedad);
						
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
	
	public void finishProcessNovedad() {// throws Exception 
		this.finishProcessNovedad(true);
	}
	
	public void finishProcessNovedad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasNovedad ,this.jPanelParametrosReportesNovedad, this.jScrollPanelDatosNovedad,this.jPanelPaginacionNovedad, this.jScrollPanelDatosEdicionNovedad, this.jPanelAccionesNovedad,this.jPanelAccionesFormularioNovedad,this.jmenuBarNovedad,this.jmenuBarDetalleNovedad,this.jTtoolBarNovedad,this.jTtoolBarDetalleNovedad);		
		
		final JTabbedPane jTabbedPaneBusquedasNovedad=this.jTabbedPaneBusquedasNovedad; 
		
		final JPanel jPanelParametrosReportesNovedad=this.jPanelParametrosReportesNovedad;
		//final JScrollPane jScrollPanelDatosNovedad=this.jScrollPanelDatosNovedad;
		final JTable jTableDatosNovedad=this.jTableDatosNovedad;		
		final JPanel jPanelPaginacionNovedad=this.jPanelPaginacionNovedad;
		//final JScrollPane jScrollPanelDatosEdicionNovedad=this.jScrollPanelDatosEdicionNovedad;
		final JPanel jPanelAccionesNovedad=this.jPanelAccionesNovedad;
		
		JPanel jPanelCamposAuxiliarNovedad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNovedad=new JPanel();
		
		if(this.jInternalFrameDetalleFormNovedad!=null) {
			jPanelCamposAuxiliarNovedad=this.jInternalFrameDetalleFormNovedad.jPanelCamposNovedad;
			jPanelAccionesFormularioAuxiliarNovedad=this.jInternalFrameDetalleFormNovedad.jPanelAccionesFormularioNovedad;
		}
		
		final JPanel jPanelCamposNovedad=jPanelCamposAuxiliarNovedad;
		final JPanel jPanelAccionesFormularioNovedad=jPanelAccionesFormularioAuxiliarNovedad;
		
		
		final JMenuBar jmenuBarNovedad=this.jmenuBarNovedad;		
		final JToolBar jTtoolBarNovedad=this.jTtoolBarNovedad;
				
		JMenuBar jmenuBarDetalleAuxiliarNovedad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNovedad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNovedad!=null) {
			jmenuBarDetalleAuxiliarNovedad=this.jInternalFrameDetalleFormNovedad.jmenuBarDetalleNovedad;
			jTtoolBarDetalleAuxiliarNovedad=this.jInternalFrameDetalleFormNovedad.jTtoolBarDetalleNovedad;		
		}
		
		final JMenuBar jmenuBarDetalleNovedad=jmenuBarDetalleAuxiliarNovedad;
		final JToolBar jTtoolBarDetalleNovedad=jTtoolBarDetalleAuxiliarNovedad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNovedad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNovedad;
			processRunnable.jTableDatos=jTableDatosNovedad;
			processRunnable.jPanelCampos=jPanelCamposNovedad;
			processRunnable.jPanelPaginacion=jPanelPaginacionNovedad;
			processRunnable.jPanelAcciones=jPanelAccionesNovedad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNovedad;
			
			
			processRunnable.jmenuBar=jmenuBarNovedad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNovedad;
			processRunnable.jTtoolBar=jTtoolBarNovedad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNovedad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNovedad ,jPanelParametrosReportesNovedad, jTableDatosNovedad,/*jScrollPanelDatosNovedad,*/jPanelCamposNovedad,jPanelPaginacionNovedad, /*jScrollPanelDatosEdicionNovedad,*/ jPanelAccionesNovedad,jPanelAccionesFormularioNovedad,jmenuBarNovedad,jmenuBarDetalleNovedad,jTtoolBarNovedad,jTtoolBarDetalleNovedad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNovedad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNovedad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNovedad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNovedad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNovedad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNovedad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNovedad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNovedad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNovedad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.novedadConstantesFunciones.getsFinalQueryNovedad();
		String  finalQueryPaginacionTodos=this.novedadConstantesFunciones.getsFinalQueryNovedad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NovedadConstantesFunciones.getArrayColumnasGlobalesNoNovedad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NovedadConstantesFunciones.getArrayColumnasGlobalesNovedad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NovedadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.novedadsEliminados= new ArrayList<Novedad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNovedad();
		
				///*NovedadSessionBean*/this.novedadSessionBean=new NovedadSessionBean();
			
			if(this.novedadSessionBean==null) {
				this.novedadSessionBean=new NovedadSessionBean();
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
					this.iNumeroPaginacion=NovedadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NovedadConstantesFunciones.getClassesForeignKeysOfNovedad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/novedad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			novedadsAux= new ArrayList<Novedad>();
			
				
			novedadLogic.setDatosCliente(this.datosCliente);
			novedadLogic.setDatosDeep(this.datosDeep);
			novedadLogic.setIsConDeep(true);
			
			
			novedadLogic.getNovedadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					novedadLogic.getTodosNovedads(finalQueryGlobal,pagination);
					
					//novedadLogic.getTodosNovedadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(novedadLogic.getNovedads()==null|| novedadLogic.getNovedads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadsAux= new ArrayList<Novedad>();
							novedadsAux.addAll(novedadLogic.getNovedads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadsAux= new ArrayList<Novedad>();
							novedadsAux.addAll(novedads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadLogic.getTodosNovedads(finalQueryGlobal+"",this.pagination);												
							
							//novedadLogic.getTodosNovedadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteNovedads("Todos",novedadLogic.getNovedads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							novedadLogic.setNovedads(new ArrayList<Novedad>());					
							novedadLogic.getNovedads().addAll(novedadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedads=new ArrayList<Novedad>();
							novedads.addAll(novedadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idNovedad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idNovedad=this.idActual;
				
				} else if(this.idNovedadActual!=null && this.idNovedadActual!=0L) {
					idNovedad=idNovedadActual;
				}
				
					
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndicePorId(idNovedad);
				
				this.novedads=new ArrayList<Novedad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					novedadLogic.getEntity(idNovedad);
					
					//novedadLogic.getEntityWithConnection(idNovedad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadLogic.setNovedads(new ArrayList<Novedad>());
					novedadLogic.getNovedads().add(novedadLogic.getNovedad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedads=new ArrayList<Novedad>();
					this.novedads.add(novedad);
				}
				
				if(novedadLogic.getNovedad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadLogic.getNovedadsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadLogic.getNovedads()==null||novedadLogic.getNovedads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedads==null|| novedads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadsAux=new ArrayList<Novedad>();
						novedadsAux.addAll(novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadsAux=new ArrayList<Novedad>();
							novedadsAux.addAll(novedads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadLogic.getNovedadsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedads("FK_IdCliente",novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedads("FK_IdCliente",novedads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadLogic.setNovedads(new ArrayList<Novedad>());
						novedadLogic.getNovedads().addAll(novedadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedads=new ArrayList<Novedad>();
							novedads.addAll(novedadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadLogic.getNovedadsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadLogic.getNovedads()==null||novedadLogic.getNovedads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedads==null|| novedads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadsAux=new ArrayList<Novedad>();
						novedadsAux.addAll(novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadsAux=new ArrayList<Novedad>();
							novedadsAux.addAll(novedads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadLogic.getNovedadsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedads("FK_IdEmpleado",novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedads("FK_IdEmpleado",novedads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadLogic.setNovedads(new ArrayList<Novedad>());
						novedadLogic.getNovedads().addAll(novedadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedads=new ArrayList<Novedad>();
							novedads.addAll(novedadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadLogic.getNovedadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadLogic.getNovedads()==null||novedadLogic.getNovedads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedads==null|| novedads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadsAux=new ArrayList<Novedad>();
						novedadsAux.addAll(novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadsAux=new ArrayList<Novedad>();
							novedadsAux.addAll(novedads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadLogic.getNovedadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedads("FK_IdEmpresa",novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedads("FK_IdEmpresa",novedads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadLogic.setNovedads(new ArrayList<Novedad>());
						novedadLogic.getNovedads().addAll(novedadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedads=new ArrayList<Novedad>();
							novedads.addAll(novedadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadLogic.getNovedadsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadLogic.getNovedads()==null||novedadLogic.getNovedads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedads==null|| novedads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadsAux=new ArrayList<Novedad>();
						novedadsAux.addAll(novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadsAux=new ArrayList<Novedad>();
							novedadsAux.addAll(novedads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadLogic.getNovedadsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedads("FK_IdSucursal",novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedads("FK_IdSucursal",novedads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadLogic.setNovedads(new ArrayList<Novedad>());
						novedadLogic.getNovedads().addAll(novedadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedads=new ArrayList<Novedad>();
							novedads.addAll(novedadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					novedadLogic.getNovedadsFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=novedadLogic.getNovedads()==null||novedadLogic.getNovedads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=novedads==null|| novedads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadsAux=new ArrayList<Novedad>();
						novedadsAux.addAll(novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadsAux=new ArrayList<Novedad>();
							novedadsAux.addAll(novedads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							novedadLogic.getNovedadsFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NovedadConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNovedads("FK_IdUsuario",novedadLogic.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNovedads("FK_IdUsuario",novedads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadLogic.setNovedads(new ArrayList<Novedad>());
						novedadLogic.getNovedads().addAll(novedadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedads=new ArrayList<Novedad>();
							novedads.addAll(novedadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNovedad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNovedad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=novedadLogic.getNovedads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=novedadLogic.getNovedads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=novedads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Novedad novedad) {
		Boolean permite=true;
		
		if(this.novedad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NovedadConstantesFunciones.getOrderByListaNovedad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NovedadConstantesFunciones.getOrderByListaNovedad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Novedad novedad:novedadLogic.getNovedads()) {
				if(novedad.getsType().equals(Constantes2.S_TOTALES)) {
					novedadTotales=novedad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Novedad novedad:this.novedads) {
				if(novedad.getsType().equals(Constantes2.S_TOTALES)) {
					novedadTotales=novedad;
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
			this.novedadAux=new Novedad();
			this.novedadAux.setsType(Constantes2.S_TOTALES);
			this.novedadAux.setIsNew(false);
			this.novedadAux.setIsChanged(false);
			this.novedadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				NovedadConstantesFunciones.TotalizarValoresFilaNovedad(this.novedadLogic.getNovedads(),this.novedadAux);
				
				this.novedadLogic.getNovedads().add(this.novedadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NovedadConstantesFunciones.TotalizarValoresFilaNovedad(this.novedads,this.novedadAux);
				
				this.novedads.add(this.novedadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		novedadTotales=new Novedad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.novedadLogic.getNovedads().remove(novedadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.novedads.remove(novedadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		novedadTotales=new Novedad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Novedad novedad:novedadLogic.getNovedads()) {
				if(novedad.getsType().equals(Constantes2.S_TOTALES)) {
					novedadTotales=novedad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NovedadConstantesFunciones.TotalizarValoresFilaNovedad(this.novedadLogic.getNovedads(),novedadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Novedad novedad:this.novedads) {
				if(novedad.getsType().equals(Constantes2.S_TOTALES)) {
					novedadTotales=novedad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NovedadConstantesFunciones.TotalizarValoresFilaNovedad(this.novedads,novedadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getNovedadsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNovedadsFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getNovedadsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadLogic.getNovedadsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadLogic.getNovedadsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadLogic.getNovedadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadLogic.getNovedadsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNovedadsFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadLogic.getNovedadsFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosNovedad() {
		this.isPermisoTodoNovedad=false;
		this.isPermisoNuevoNovedad=false;
		this.isPermisoActualizarNovedad=false;
		this.isPermisoActualizarOriginalNovedad=false;
		this.isPermisoEliminarNovedad=false;
		this.isPermisoGuardarCambiosNovedad=false;
		this.isPermisoConsultaNovedad=false;
		this.isPermisoBusquedaNovedad=false;
		this.isPermisoReporteNovedad=false;		
		this.isPermisoOrdenNovedad=false;		
		this.isPermisoPaginacionMedioNovedad=false;		
		this.isPermisoPaginacionAltoNovedad=false;
		this.isPermisoPaginacionTodoNovedad=false;
		this.isPermisoCopiarNovedad=false;		
		this.isPermisoVerFormNovedad=false;		
		this.isPermisoDuplicarNovedad=false;		
		this.isPermisoOrdenNovedad=false;		
	}
	
	public void setPermisosUsuarioNovedad(Boolean isPermiso) {
		this.isPermisoTodoNovedad=isPermiso;
		this.isPermisoNuevoNovedad=isPermiso;
		this.isPermisoActualizarNovedad=isPermiso;
		this.isPermisoActualizarOriginalNovedad=isPermiso;
		this.isPermisoEliminarNovedad=isPermiso;
		this.isPermisoGuardarCambiosNovedad=isPermiso;
		this.isPermisoConsultaNovedad=isPermiso;
		this.isPermisoBusquedaNovedad=isPermiso;
		this.isPermisoReporteNovedad=isPermiso;
		this.isPermisoOrdenNovedad=isPermiso;		
		this.isPermisoPaginacionMedioNovedad=isPermiso;		
		this.isPermisoPaginacionAltoNovedad=isPermiso;		
		this.isPermisoPaginacionTodoNovedad=isPermiso;		
		this.isPermisoCopiarNovedad=isPermiso;		
		this.isPermisoVerFormNovedad=isPermiso;		
		this.isPermisoDuplicarNovedad=isPermiso;
		this.isPermisoOrdenNovedad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNovedad(Boolean isPermiso) {
		//this.isPermisoTodoNovedad=isPermiso;
		this.isPermisoNuevoNovedad=isPermiso;
		this.isPermisoActualizarNovedad=isPermiso;
		this.isPermisoActualizarOriginalNovedad=isPermiso;
		this.isPermisoEliminarNovedad=isPermiso;
		this.isPermisoGuardarCambiosNovedad=isPermiso;
		//this.isPermisoConsultaNovedad=isPermiso;
		//this.isPermisoBusquedaNovedad=isPermiso;
		//this.isPermisoReporteNovedad=isPermiso;
		//this.isPermisoOrdenNovedad=isPermiso;		
		//this.isPermisoPaginacionMedioNovedad=isPermiso;		
		//this.isPermisoPaginacionAltoNovedad=isPermiso;		
		//this.isPermisoPaginacionTodoNovedad=isPermiso;		
		//this.isPermisoCopiarNovedad=isPermiso;		
		//this.isPermisoDuplicarNovedad=isPermiso;
		//this.isPermisoOrdenNovedad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNovedadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(NovedadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebNovedad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNovedadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioNovedadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNovedadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNovedadClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioNovedad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NovedadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.novedadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NovedadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNovedad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNovedad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNovedad=this.isPermisoActualizarNovedad;
			this.isPermisoEliminarNovedad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNovedad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNovedad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNovedad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNovedad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNovedad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNovedad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNovedad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNovedad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNovedad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNovedad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNovedad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNovedad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNovedad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.novedadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNovedad.setToolTipText(this.jTableDatosNovedad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNovedad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNovedad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NovedadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NovedadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNovedad() throws Exception {
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
	public void inicializarCombosForeignKeyNovedadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNovedadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NovedadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyNovedadListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyNovedadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			NovedadParameterReturnGeneral novedadReturnGeneral=new NovedadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.novedadConstantesFunciones.cargarid_empresaNovedad)
					 || (this.esRecargarFks && this.novedadConstantesFunciones.cargarid_empresaNovedad)) {

					if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+novedadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.novedadConstantesFunciones.cargarid_sucursalNovedad)
					 || (this.esRecargarFks && this.novedadConstantesFunciones.cargarid_sucursalNovedad)) {

					if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+novedadSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.novedadConstantesFunciones.cargarid_usuarioNovedad)
					 || (this.esRecargarFks && this.novedadConstantesFunciones.cargarid_usuarioNovedad)) {

					if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+novedadSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.novedadConstantesFunciones.cargarid_clienteNovedad)
					 || (this.esRecargarFks && this.novedadConstantesFunciones.cargarid_clienteNovedad)) {

					if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+novedadSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.novedadConstantesFunciones.cargarid_empleadoNovedad)
					 || (this.esRecargarFks && this.novedadConstantesFunciones.cargarid_empleadoNovedad)) {

					if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+novedadSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				novedadReturnGeneral=novedadLogic.cargarCombosLoteForeignKeyNovedad(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario,finalQueryGlobalCliente,finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=novedadReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=novedadReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=novedadReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=novedadReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=novedadReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyNovedad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.novedadSessionBean==null) {
				this.novedadSessionBean=new NovedadSessionBean();
			}

			if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyUsuario()throws Exception {
		try {

			if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.novedadSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyNovedad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNovedad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNovedad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.novedad.setfeha_atencion(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNovedad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNovedad(Novedad novedad)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(novedad.getid_cliente(),false,"Formulario");
			this.setActualEmpleadoForeignKey(novedad.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNovedad(Novedad novedad,String sTipoEvento)throws Exception {	
		try {
			
			

				if(novedad.getCliente()!=null && !sTipoEvento.equals("id_clienteNovedad")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(novedad.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNovedad()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.novedadConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.novedadConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNovedad()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNovedad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNovedad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNovedad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNovedad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNovedad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNovedad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad!=null && this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad!=null && this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad!=null && this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad!=null && this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad!=null && this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.getItemCount()>0) {
				this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public NovedadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NovedadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NovedadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.novedadSessionBean=new NovedadSessionBean(); 
		this.novedadConstantesFunciones=new NovedadConstantesFunciones(); 
		this.novedadBean=new Novedad();//(this.novedadConstantesFunciones); 		
		this.novedadReturnGeneral=new NovedadParameterReturnGeneral(); 
		
		this.novedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NovedadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NovedadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NovedadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNovedad(true);
			
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
			
			this.novedadConstantesFunciones=new NovedadConstantesFunciones(); 
			this.novedadBean=new Novedad();//this.novedadConstantesFunciones); 			
			this.novedadReturnGeneral=new NovedadParameterReturnGeneral(); 
		
			NovedadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Novedad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.novedad=new Novedad();
			this.novedads = new ArrayList<Novedad>();
			this.novedadsAux = new ArrayList<Novedad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic=new NovedadLogic();
				this.novedadLogic.getNewConnexionToDeep("");
			}
			
			//this.novedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.novedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNovedad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNovedad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNovedad);	
					}
					
					if(this.jInternalFrameImportacionNovedad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNovedad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNovedad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNovedad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNovedad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNovedad);
				this.jInternalFrameDetalleFormNovedad.setVisible(false);
				this.jInternalFrameDetalleFormNovedad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNovedad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNovedad);
					this.jInternalFrameReporteDinamicoNovedad.setVisible(false);
					this.jInternalFrameReporteDinamicoNovedad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNovedad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNovedad);
					this.jInternalFrameImportacionNovedad.setVisible(false);
					this.jInternalFrameImportacionNovedad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNovedad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNovedad);
					this.jInternalFrameOrderByNovedad.setVisible(false);
					this.jInternalFrameOrderByNovedad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNovedadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NovedadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.novedadReturnGeneral=new NovedadParameterReturnGeneral();
			
			this.novedadParameterGeneral=new NovedadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.novedadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NovedadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.novedadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NovedadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.novedadSessionBean.getEsGuardarRelacionado(),this.novedadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NovedadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.novedadSessionBean.getEsGuardarRelacionado(),this.novedadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNovedad=false;
			this.isVisibilidadCeldaDuplicarNovedad=true;
			this.isVisibilidadCeldaCopiarNovedad=true;
			this.isVisibilidadCeldaVerFormNovedad=true;
			this.isVisibilidadCeldaOrdenNovedad=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedad=false;
			this.isVisibilidadCeldaModificarNovedad=false;
			this.isVisibilidadCeldaActualizarNovedad=false;
			this.isVisibilidadCeldaEliminarNovedad=false;
			this.isVisibilidadCeldaCancelarNovedad=false;
			this.isVisibilidadCeldaGuardarNovedad=false;
			this.isVisibilidadCeldaGuardarCambiosNovedad=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNovedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNovedad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNovedad(false);
			
			this.setPermisosUsuarioNovedad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadSessionBean.getEsGuardarRelacionado() 
				|| (this.novedadSessionBean.getEsGuardarRelacionado() && this.novedadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNovedadClasesRelacionadas();
			}
			
			if(this.novedadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNovedadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NovedadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNovedad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNovedad();
			}
			
			if(!this.isPermisoBusquedaNovedad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasNovedad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioNovedad,this.isPermisoPaginacionMedioNovedad,this.isPermisoPaginacionTodoNovedad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NovedadConstantesFunciones.getTiposSeleccionarNovedad());
				
				this.tiposColumnasSelect=NovedadConstantesFunciones.getTiposSeleccionarNovedad(true);
				
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
			//if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNovedad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioNovedad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioNovedad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedad() ;
			
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
			this.usuarioLogic=new UsuarioLogic();
			this.clienteLogic=new ClienteLogic();
			this.empleadoLogic=new EmpleadoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				novedadImplementable= (NovedadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NovedadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				novedadImplementableHome= (NovedadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NovedadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.novedads= new ArrayList<Novedad>();
			this.novedadsEliminados= new ArrayList<Novedad>();
						
			this.isEsNuevoNovedad=false;
			this.esParaAccionDesdeFormularioNovedad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNovedad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNovedad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NovedadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NovedadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNovedad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNovedad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNovedad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNovedad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNovedad();
			}
			
			NovedadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasNovedad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasNovedad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasNovedad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNovedad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Novedad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNovedad() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesNovedad")) {
				iIndex=this.jInternalFrameDetalleFormNovedad.jTabbedPaneRelacionesNovedad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNovedad.jTabbedPaneRelacionesNovedad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNovedad.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNovedad();	
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
	
	public void cargarCombosForeignKeyNovedad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNovedad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNovedad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNovedadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNovedad();
		
		this.cargarCombosFrameForeignKeyNovedad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNovedad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNovedad();
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

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoNovedadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.novedadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
			
			if(jTableDatosNovedad.getRowCount()>=1) {
				jTableDatosNovedad.removeRowSelectionInterval(0, jTableDatosNovedad.getRowCount()-1);						
			}
			
			this.isEsNuevoNovedad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNovedad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNovedad(true);			
			//this.novedad=new Novedad();
			//this.novedad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedad() ;
			
			if(NovedadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.novedad);	
			this.actualizarInformacion("INFO_PADRE",false,this.novedad);				
			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
			if(this.novedadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Novedad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNovedadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNovedad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNovedad.getSelectedRows().length;			
			}
			
			novedadsSeleccionados=this.getNovedadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNovedad--;			
				//Novedad novedadAux= new Novedad();			
				//novedadAux.setId(this.iIdNuevoNovedad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Novedad novedadOrigen=new Novedad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Novedad novedadOrigen : novedadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							novedadOrigen =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							novedadOrigen =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNovedad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.novedad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNovedad(novedadOrigen,this.novedad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.novedadLogic.getNovedads().add(this.novedadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.novedads.add(this.novedadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNovedad(false);
				
				this.jTableDatosNovedad.setRowSelectionInterval(this.getIndiceNuevoNovedad(), this.getIndiceNuevoNovedad());
				
				int iLastRow =  this.jTableDatosNovedad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNovedad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNovedad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNovedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();									
		
			Novedad novedadOrigen=new Novedad();
			Novedad novedadDestino=new Novedad();
				
			novedadsSeleccionados=this.getNovedadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNovedad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || novedadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNovedad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadOrigen =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						novedadOrigen =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						novedadDestino =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						novedadDestino =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				novedadOrigen =novedadsSeleccionados.get(0);
				novedadDestino =novedadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNovedad(novedadOrigen,novedadDestino,true,false);
				
				novedadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(novedadDestino,novedadLogic.getNovedads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(novedadDestino,novedads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNovedad(false);
				
				//this.jTableDatosNovedad.setRowSelectionInterval(this.getIndiceNuevoNovedad(), this.getIndiceNuevoNovedad());
				
				int iLastRow =  this.jTableDatosNovedad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNovedad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNovedad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNovedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNovedad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNovedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNovedad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasNovedad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesNovedad.setVisible(!isVisible);
			this.jPanelPaginacionNovedad.setVisible(!isVisible);
			this.jPanelAccionesNovedad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNovedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNovedad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNovedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNovedad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNovedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNovedad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNovedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNovedad();
			
			this.abrirFrameOrderByNovedad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNovedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNovedad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNovedad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNovedad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNovedad.isMaximum()) {
					this.jInternalFrameDetalleFormNovedad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNovedad.setSize(this.jInternalFrameDetalleFormNovedad.iWidthFormulario,this.jInternalFrameDetalleFormNovedad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNovedad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNovedad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNovedad.isMaximum()) {
						this.jInternalFrameDetalleFormNovedad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNovedad.jContentPaneDetalleNovedad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNovedad.jTabbedPaneRelacionesNovedad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNovedad.jContentPaneDetalleNovedad.getWidth(),NovedadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNovedad.jTabbedPaneRelacionesNovedad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNovedad.jContentPaneDetalleNovedad.getWidth(),NovedadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNovedad.jTabbedPaneRelacionesNovedad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNovedad.jContentPaneDetalleNovedad.getWidth(),NovedadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNovedad.setVisible(true);
	        this.jInternalFrameDetalleFormNovedad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNovedad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNovedad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNovedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedad,false,this);
				} else {
					this.jInternalFrameOrderByNovedad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNovedad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNovedad);
				this.jInternalFrameOrderByNovedad.setVisible(false);
				this.jInternalFrameOrderByNovedad.setSelected(false);
				
				this.jInternalFrameOrderByNovedad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNovedad"));
				
				this.inicializarActualizarBindingTablaOrderByNovedad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNovedad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNovedad==null) {
				
				this.jInternalFrameImportacionNovedad=new ImportacionJInternalFrame(NovedadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNovedad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNovedad);
				this.jInternalFrameImportacionNovedad.setVisible(false);
				this.jInternalFrameImportacionNovedad.setSelected(false);


				this.jInternalFrameImportacionNovedad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNovedad"));
				this.jInternalFrameImportacionNovedad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNovedad"));
				this.jInternalFrameImportacionNovedad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNovedad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNovedad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNovedad==null) {
				this.jInternalFrameReporteDinamicoNovedad=new ReporteDinamicoJInternalFrame(NovedadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNovedad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNovedad);
				this.jInternalFrameReporteDinamicoNovedad.setVisible(false);
				this.jInternalFrameReporteDinamicoNovedad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNovedad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedad"));
				this.jInternalFrameReporteDinamicoNovedad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedad"));
				this.jInternalFrameReporteDinamicoNovedad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleNovedad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNovedad);
			
	       	this.jInternalFrameDetalleFormNovedad.setVisible(false);
	        this.jInternalFrameDetalleFormNovedad.setSelected(false);
			
			//this.jInternalFrameDetalleFormNovedad.dispose();
			//this.jInternalFrameDetalleFormNovedad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNovedad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNovedad.setVisible(true);
	        this.jInternalFrameReporteDinamicoNovedad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNovedad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNovedad.setVisible(true);
	        this.jInternalFrameImportacionNovedad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNovedad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNovedad.setVisible(true);
	        this.jInternalFrameOrderByNovedad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNovedad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNovedad.setVisible(false);
	        this.jInternalFrameOrderByNovedad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNovedad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNovedad.setVisible(false);
	        this.jInternalFrameReporteDinamicoNovedad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNovedad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNovedad.setVisible(false);
	        this.jInternalFrameImportacionNovedad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNovedadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNovedad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNovedad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNovedad(true);
			//this.isEsNuevoNovedad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNovedad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedad(false) ;
			
			if(novedadSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(NovedadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNovedadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNovedad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNovedad(true);
			//this.isEsNuevoNovedad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.novedad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNovedad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNovedad(false) ;
			
			if(NovedadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNovedad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.novedadConstantesFunciones.cargarid_clienteNovedad) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingNovedad(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNovedad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNovedad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarNovedadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNovedad(false);
			
			//if(!this.isEsNuevoNovedad) {								
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NovedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				
			}
			
			if(this.permiteMantenimiento(this.novedad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.novedadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNovedad=true;
					this.inicializarActualizarBindingTablaNovedad(false);
					this.isEsNuevoNovedad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNovedad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNovedad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNovedad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedad(false);
				
				this.habilitarDeshabilitarControlesNovedad(false);
			
												
				
				if(NovedadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNovedad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNovedadActionPerformed(evt,novedadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNovedad(this.novedad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNovedad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,novedadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.novedad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Novedad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Novedad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNovedadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				this.novedad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				this.novedad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.novedad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.novedadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NovedadModel) this.jTableDatosNovedad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNovedad=true;
				this.inicializarActualizarBindingTablaNovedad(false);
				this.isEsNuevoNovedad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNovedad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedad(false);
				
				this.habilitarDeshabilitarControlesNovedad(false);
				
				
				
				if(NovedadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNovedad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNovedadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNovedad.getRowCount()>=1) {
				jTableDatosNovedad.removeRowSelectionInterval(0, jTableDatosNovedad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNovedad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNovedad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNovedad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNovedad(false) ;
			
			this.isEsNuevoNovedad=false;
			
			if(NovedadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNovedad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNovedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNovedad(false);
				
				//SI ES MANUAL
				if(NovedadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNovedad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNovedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNovedad--;			
			//Novedad novedadAux= new Novedad();			
			//novedadAux.setId(this.iIdNuevoNovedad);
			
			if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNovedad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
			
			this.novedad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.novedadLogic.getNovedads().add(this.novedadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.novedads.add(this.novedadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNovedad(false);
			
			this.jTableDatosNovedad.setRowSelectionInterval(this.getIndiceNuevoNovedad(), this.getIndiceNuevoNovedad());
			
			int iLastRow =  this.jTableDatosNovedad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNovedad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNovedad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNovedad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNovedadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNovedad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedad(false);
			
			//SI ES MANUAL
			if(NovedadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedad();
			}
			
			//this.abrirFrameTreeNovedad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNovedadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE NovedadES ?", "MANTENIMIENTO DE Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionNovedad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralNovedad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.novedadReturnGeneral=novedadLogic.procesarImportacionNovedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.novedadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarNovedadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNovedadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNovedad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNovedad.setFileImportacion(this.jInternalFrameImportacionNovedad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNovedad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNovedad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNovedad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNovedad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNovedadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();		

		novedadsSeleccionados=this.getNovedadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NovedadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NovedadBaseDesign.jrxml";
			
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
			
			this.generarReporteNovedads("Todos",novedadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNovedad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NovedadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadConstantesFunciones.LABEL_ACCIONTOMADA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cionTomada_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cionTomada_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cionTomada_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cionTomada_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadConstantesFunciones.LABEL_FEHAATENCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_haAtencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_haAtencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_haAtencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_haAtencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadConstantesFunciones.LABEL_HORAATENCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raAtencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raAtencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raAtencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raAtencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NovedadConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoNovedad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNovedad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNovedad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NovedadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case NovedadConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case NovedadConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case NovedadConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case NovedadConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case NovedadConstantesFunciones.LABEL_ACCIONTOMADA:
					sNombreCampoCategoria="accion_tomada";
					break;

				case NovedadConstantesFunciones.LABEL_FEHAATENCION:
					sNombreCampoCategoria="feha_atencion";
					break;

				case NovedadConstantesFunciones.LABEL_HORAATENCION:
					sNombreCampoCategoria="hora_atencion";
					break;

				case NovedadConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case NovedadConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="email";
					break;

				case NovedadConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNovedad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NovedadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case NovedadConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case NovedadConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case NovedadConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case NovedadConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case NovedadConstantesFunciones.LABEL_ACCIONTOMADA:
					sNombreCampoCategoriaValor="accion_tomada";
					break;

				case NovedadConstantesFunciones.LABEL_FEHAATENCION:
					sNombreCampoCategoriaValor="feha_atencion";
					break;

				case NovedadConstantesFunciones.LABEL_HORAATENCION:
					sNombreCampoCategoriaValor="hora_atencion";
					break;

				case NovedadConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case NovedadConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="email";
					break;

				case NovedadConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNovedad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NovedadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case NovedadConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case NovedadConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case NovedadConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case NovedadConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case NovedadConstantesFunciones.LABEL_ACCIONTOMADA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Accion Tomada",sNombreCampoCategoria,sNombreCampoCategoriaValor,"accion_tomada");
					break;

				case NovedadConstantesFunciones.LABEL_FEHAATENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Feha Atencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"feha_atencion");
					break;

				case NovedadConstantesFunciones.LABEL_HORAATENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Atencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_atencion");
					break;

				case NovedadConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Responsable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case NovedadConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Email",sNombreCampoCategoria,sNombreCampoCategoriaValor,"email");
					break;

				case NovedadConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoNovedadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();		
		
		novedadsSeleccionados=this.getNovedadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Novedads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNovedad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNovedad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NovedadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Novedad novedad:novedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Novedad novedad:novedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedad.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(Novedad novedad:novedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedad.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(Novedad novedad:novedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedad.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Novedad novedad:novedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedad.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadConstantesFunciones.LABEL_ACCIONTOMADA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadConstantesFunciones.LABEL_ACCIONTOMADA);
					iRow++;

					for(Novedad novedad:novedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedad.getaccion_tomada());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadConstantesFunciones.LABEL_FEHAATENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadConstantesFunciones.LABEL_FEHAATENCION);
					iRow++;

					for(Novedad novedad:novedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedad.getfeha_atencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadConstantesFunciones.LABEL_HORAATENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadConstantesFunciones.LABEL_HORAATENCION);
					iRow++;

					for(Novedad novedad:novedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedad.gethora_atencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(Novedad novedad:novedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedad.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(Novedad novedad:novedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedad.getemail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NovedadConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NovedadConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(Novedad novedad:novedadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(novedad.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelNovedad(row);				
			//	iRow++;
			//}				
			
			//for(Novedad novedadAux:novedadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNovedad(novedadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad",JOptionPane.INFORMATION_MESSAGE);
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
				this.novedadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedad(false);
			
			//SI ES MANUAL
			if(NovedadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNovedad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNovedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedad(false);
			
			//SI ES MANUAL
			if(NovedadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNovedad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNovedadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNovedad(false);
			
			//SI ES MANUAL
			if(NovedadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNovedad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNovedad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNovedad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNovedad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNovedad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNovedad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNovedad.setMinimumSize(dimensionMinimum);
		this.jTableDatosNovedad.setMaximumSize(dimensionMaximum);
		this.jTableDatosNovedad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNovedad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNovedad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNovedad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNovedad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNovedad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNovedad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNovedad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NovedadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NovedadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNovedad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNovedad();
		
		this.inicializarActualizarBindingBotonesManualNovedad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNovedad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNovedad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNovedad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNovedad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNovedad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNovedad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNovedad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNovedad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNovedad.jCheckBoxPostAccionNuevoNovedad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNovedad.jCheckBoxPostAccionSinCerrarNovedad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNovedad.jCheckBoxPostAccionSinMensajeNovedad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNovedad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNovedad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNovedad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNovedad!=null) {
				this.jInternalFrameDetalleFormNovedad.jCheckBoxPostAccionNuevoNovedad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNovedad.jCheckBoxPostAccionSinCerrarNovedad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNovedad.jCheckBoxPostAccionSinMensajeNovedad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNovedad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNovedad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNovedad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNovedad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNovedad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNovedad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNovedad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNovedad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNovedad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNovedad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNovedad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNovedad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNovedad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNovedad(Boolean esInicializar) throws Exception {
		try	{	
			if(NovedadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNovedad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNovedad() throws Exception {
		try	{
			if(NovedadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNovedad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNovedad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNovedad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNovedad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNovedad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNovedad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNovedad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNovedad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNovedad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNovedad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNovedad.addItem(reporte);
			}
			
			
			if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNovedad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNovedad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNovedad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNovedad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNovedad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNovedad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNovedad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNovedad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNovedad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNovedad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNovedad!=null) {
				this.jInternalFrameReporteDinamicoNovedad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNovedad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNovedad!=null) {
				this.jInternalFrameReporteDinamicoNovedad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNovedad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNovedad!=null) {
				
				if(this.jInternalFrameReporteDinamicoNovedad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNovedad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNovedad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNovedad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNovedad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNovedad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNovedad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteNovedad.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteNovedad.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoNovedad.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoNovedad.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNovedad(Boolean esInicializar) throws Exception {				
		if(NovedadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNovedad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNovedad() throws Exception {
		this.inicializarActualizarBindingTablaNovedad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNovedad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNovedadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNovedad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=novedadLogic.getNovedads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=novedads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NovedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNovedad.setModel(new NovedadModel(this.novedadLogic.getNovedads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNovedad.setModel(new NovedadModel(this.novedads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNovedad!=null && this.jInternalFrameOrderByNovedad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNovedad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NovedadConstantesFunciones.SCLASSWEBTITULO,novedadConstantesFunciones.resaltarSeleccionarNovedad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NovedadConstantesFunciones.SCLASSWEBTITULO,novedadConstantesFunciones.resaltarSeleccionarNovedad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_ID));

		if(this.novedadConstantesFunciones.mostraridNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.novedadConstantesFunciones.resaltaridNovedad,this.novedadConstantesFunciones.activaridNovedad,this,true,"idNovedad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadConstantesFunciones.resaltaridNovedad,this.novedadConstantesFunciones.activaridNovedad,this,true,"idNovedad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.novedadConstantesFunciones.mostrarid_empresaNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.novedadConstantesFunciones.resaltarid_empresaNovedad,this,this.novedadConstantesFunciones.activarid_empresaNovedad));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.novedadConstantesFunciones.resaltarid_empresaNovedad,this,this.novedadConstantesFunciones.activarid_empresaNovedad,false,"id_empresaNovedad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.novedadConstantesFunciones.mostrarid_sucursalNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.novedadConstantesFunciones.resaltarid_sucursalNovedad,this,this.novedadConstantesFunciones.activarid_sucursalNovedad));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.novedadConstantesFunciones.resaltarid_sucursalNovedad,this,this.novedadConstantesFunciones.activarid_sucursalNovedad,false,"id_sucursalNovedad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_IDUSUARIO));

		if(this.novedadConstantesFunciones.mostrarid_usuarioNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.novedadConstantesFunciones.resaltarid_usuarioNovedad,this,this.novedadConstantesFunciones.activarid_usuarioNovedad));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.novedadConstantesFunciones.resaltarid_usuarioNovedad,this,this.novedadConstantesFunciones.activarid_usuarioNovedad,false,"id_usuarioNovedad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_IDCLIENTE));

		if(this.novedadConstantesFunciones.mostrarid_clienteNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.novedadConstantesFunciones.resaltarid_clienteNovedad,this,this.novedadConstantesFunciones.activarid_clienteNovedad));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.novedadConstantesFunciones.resaltarid_clienteNovedad,this,this.novedadConstantesFunciones.activarid_clienteNovedad,true,"id_clienteNovedad","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_DESCRIPCION));

		if(this.novedadConstantesFunciones.mostrardescripcionNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.novedadConstantesFunciones.resaltardescripcionNovedad,this.novedadConstantesFunciones.activardescripcionNovedad,this,true,"descripcionNovedad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadConstantesFunciones.resaltardescripcionNovedad,this.novedadConstantesFunciones.activardescripcionNovedad,this,true,"descripcionNovedad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_ACCIONTOMADA));

		if(this.novedadConstantesFunciones.mostraraccion_tomadaNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_ACCIONTOMADA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.novedadConstantesFunciones.resaltaraccion_tomadaNovedad,this.novedadConstantesFunciones.activaraccion_tomadaNovedad,this,true,"accion_tomadaNovedad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadConstantesFunciones.resaltaraccion_tomadaNovedad,this.novedadConstantesFunciones.activaraccion_tomadaNovedad,this,true,"accion_tomadaNovedad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_FEHAATENCION));

		if(this.novedadConstantesFunciones.mostrarfeha_atencionNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_FEHAATENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.novedadConstantesFunciones.resaltarfeha_atencionNovedad,this.novedadConstantesFunciones.activarfeha_atencionNovedad,this,true,"feha_atencionNovedad","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.novedadConstantesFunciones.resaltarfeha_atencionNovedad,this.novedadConstantesFunciones.activarfeha_atencionNovedad,this,true,"feha_atencionNovedad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_HORAATENCION));

		if(this.novedadConstantesFunciones.mostrarhora_atencionNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_HORAATENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.novedadConstantesFunciones.resaltarhora_atencionNovedad,this.novedadConstantesFunciones.activarhora_atencionNovedad,this,true,"hora_atencionNovedad","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.novedadConstantesFunciones.resaltarhora_atencionNovedad,this.novedadConstantesFunciones.activarhora_atencionNovedad,this,true,"hora_atencionNovedad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.novedadConstantesFunciones.mostrarid_empleadoNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.novedadConstantesFunciones.resaltarid_empleadoNovedad,this,this.novedadConstantesFunciones.activarid_empleadoNovedad));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.novedadConstantesFunciones.resaltarid_empleadoNovedad,this,this.novedadConstantesFunciones.activarid_empleadoNovedad,true,"id_empleadoNovedad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_EMAIL));

		if(this.novedadConstantesFunciones.mostraremailNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.novedadConstantesFunciones.resaltaremailNovedad,this.novedadConstantesFunciones.activaremailNovedad,this,true,"emailNovedad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.novedadConstantesFunciones.resaltaremailNovedad,this.novedadConstantesFunciones.activaremailNovedad,this,true,"emailNovedad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNovedad,NovedadConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.novedadConstantesFunciones.mostraresta_activoNovedad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NovedadConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.novedadConstantesFunciones.resaltaresta_activoNovedad,this.novedadConstantesFunciones.activaresta_activoNovedad));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.novedadConstantesFunciones.resaltaresta_activoNovedad,this.novedadConstantesFunciones.activaresta_activoNovedad,this,true,"esta_activoNovedad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NovedadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.novedadSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.novedadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.novedadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNovedad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.novedadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.novedadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNovedad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNovedad && this.isPermisoGuardarCambiosNovedad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.novedadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.novedadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNovedad.addColumn(tableColumn);
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
			
			this.jTableDatosNovedad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNovedad && this.isPermisoGuardarCambiosNovedad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNovedad && this.isPermisoGuardarCambiosNovedad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNovedad.moveColumn(this.jTableDatosNovedad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNovedad.moveColumn(this.jTableDatosNovedad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNovedad.moveColumn(this.jTableDatosNovedad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNovedad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNovedad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNovedad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NovedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNovedad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNovedad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NovedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NovedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNovedad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNovedad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNovedad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=novedadLogic.getNovedads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=novedads.size()-1;
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
		//this.jTableDatosNovedad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNovedad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNovedad();
			
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
				
				//this.isEsNuevoNovedad=false;
					
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
				if(this.novedadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNovedad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNovedad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNovedad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.novedad.getsType().equals("DUPLICADO")
				   || this.novedad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNovedad=true;
				
				} else {
					this.isEsNuevoNovedad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.novedadSessionBean.getEsGuardarRelacionado()) {
					if(this.novedad.getId()>=0 && !this.novedad.getIsNew()) {						
						this.isEsNuevoNovedad=false;
						
					} else {
						this.isEsNuevoNovedad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNovedad(esRelaciones);						
				
				this.seleccionarNovedad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.novedad.getId()<0) {
					this.isEsNuevoNovedad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNovedad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNovedad(evt,rowIndex);
				}	
				
				if(this.novedadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Novedad: " + this.dDif); 
					}
				}								
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNovedad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.novedad)) {
					if(this.novedad.getId()>0) {
						this.novedad.setIsDeleted(true);
						
						this.novedadsEliminados.add(this.novedad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.novedadLogic.getNovedads().remove(this.novedad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.novedads.remove(this.novedad);				
					}
					
					
					((NovedadModel) this.jTableDatosNovedad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNovedad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNovedad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNovedad) {
			
			if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNovedad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNovedad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NovedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNovedad(this.novedad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.novedadConstantesFunciones.cargarid_empresaNovedad || this.novedadConstantesFunciones.event_dependid_empresaNovedad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.novedad.getid_empresa());
									//this.inicializarActualizarBindingNovedad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(novedad.getEmpresa()!=null) {
							this.empresasForeignKey.add(novedad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.novedad.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.novedadConstantesFunciones.cargarid_sucursalNovedad || this.novedadConstantesFunciones.event_dependid_sucursalNovedad) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.novedad.getid_sucursal());
									//this.inicializarActualizarBindingNovedad(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(novedad.getSucursal()!=null) {
							this.sucursalsForeignKey.add(novedad.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.novedad.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.novedadConstantesFunciones.cargarid_usuarioNovedad || this.novedadConstantesFunciones.event_dependid_usuarioNovedad) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.novedad.getid_usuario());
									//this.inicializarActualizarBindingNovedad(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(novedad.getUsuario()!=null) {
							this.usuariosForeignKey.add(novedad.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.novedad.getid_usuario(),false,"Formulario");

					//Cliente
					if(!this.novedadConstantesFunciones.cargarid_clienteNovedad || this.novedadConstantesFunciones.event_dependid_clienteNovedad) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.novedad.getid_cliente());
									//this.inicializarActualizarBindingNovedad(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(novedad.getCliente()!=null) {
							this.clientesForeignKey.add(novedad.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.novedad.getid_cliente(),false,"Formulario");

					//Empleado
					if(!this.novedadConstantesFunciones.cargarid_empleadoNovedad || this.novedadConstantesFunciones.event_dependid_empleadoNovedad) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.novedad.getid_empleado());
									//this.inicializarActualizarBindingNovedad(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(novedad.getEmpleado()!=null) {
							this.empleadosForeignKey.add(novedad.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.novedad.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNovedad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNovedad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNovedad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNovedad(Novedad novedad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNovedad(novedad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNovedad(Novedad novedad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNovedad(novedad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNovedad(novedad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNovedad(novedad);
	}
	
	public void setVariablesObjetoActualToFormularioNovedad(Novedad novedad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNovedad.jLabelidNovedad.setText(novedad.getId().toString());
			this.jInternalFrameDetalleFormNovedad.jTextAreadescripcionNovedad.setText(novedad.getdescripcion());
			this.jInternalFrameDetalleFormNovedad.jTextAreaaccion_tomadaNovedad.setText(novedad.getaccion_tomada());
			this.jInternalFrameDetalleFormNovedad.jDateChooserfeha_atencionNovedad.setDate(novedad.getfeha_atencion());
			this.jInternalFrameDetalleFormNovedad.jSpinnerhora_atencionNovedad.setValue(novedad.gethora_atencion());
			this.jInternalFrameDetalleFormNovedad.jTextFieldemailNovedad.setText(novedad.getemail());
			this.jInternalFrameDetalleFormNovedad.jCheckBoxesta_activoNovedad.setSelected(novedad.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Novedad novedadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,novedadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Novedad novedadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				novedadLocal=this.novedad;
			} else {
				novedadLocal=this.novedadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(novedadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNovedad(novedadLocal,true);
					
					if(novedadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(novedadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.novedadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(novedadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNovedad(Novedad novedad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNovedad(novedad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNovedad(novedad);
	}
	
	public void setVariablesFormularioToObjetoActualNovedad(Novedad novedad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNovedad(novedad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNovedad(Novedad novedad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNovedad.jLabelidNovedad.getText()==null || this.jInternalFrameDetalleFormNovedad.jLabelidNovedad.getText()=="" || this.jInternalFrameDetalleFormNovedad.jLabelidNovedad.getText()=="Id") {
				this.jInternalFrameDetalleFormNovedad.jLabelidNovedad.setText("0");
			}

			if(conColumnasBase) {novedad.setId(Long.parseLong(this.jInternalFrameDetalleFormNovedad.jLabelidNovedad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelIdNovedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedad.setdescripcion(this.jInternalFrameDetalleFormNovedad.jTextAreadescripcionNovedad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabeldescripcionNovedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedad.setaccion_tomada(this.jInternalFrameDetalleFormNovedad.jTextAreaaccion_tomadaNovedad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadConstantesFunciones.LABEL_ACCIONTOMADA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelaccion_tomadaNovedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedad.setfeha_atencion(this.jInternalFrameDetalleFormNovedad.jDateChooserfeha_atencionNovedad.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadConstantesFunciones.LABEL_FEHAATENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelfeha_atencionNovedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedad.sethora_atencion(new Time(((Date)this.jInternalFrameDetalleFormNovedad.jSpinnerhora_atencionNovedad.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadConstantesFunciones.LABEL_HORAATENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelhora_atencionNovedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedad.setemail(this.jInternalFrameDetalleFormNovedad.jTextFieldemailNovedad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelemailNovedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			novedad.setesta_activo(this.jInternalFrameDetalleFormNovedad.jCheckBoxesta_activoNovedad.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NovedadConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNovedad.jLabelesta_activoNovedad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNovedad(Novedad novedadBean,Novedad novedad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && novedadBean.getid_cliente()!=null && !novedadBean.getid_cliente().equals(-1L))) {novedad.setid_cliente(novedadBean.getid_cliente());}
			if(conDefault || (!conDefault && novedadBean.getid_empleado()!=null && !novedadBean.getid_empleado().equals(-1L))) {novedad.setid_empleado(novedadBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNovedad(Novedad novedadOrigen,Novedad novedad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && novedadOrigen.getId()!=null && !novedadOrigen.getId().equals(0L))) {novedad.setId(novedadOrigen.getId());}}
			if(conDefault || (!conDefault && novedadOrigen.getid_cliente()!=null && !novedadOrigen.getid_cliente().equals(-1L))) {novedad.setid_cliente(novedadOrigen.getid_cliente());}
			if(conDefault || (!conDefault && novedadOrigen.getdescripcion()!=null && !novedadOrigen.getdescripcion().equals(""))) {novedad.setdescripcion(novedadOrigen.getdescripcion());}
			if(conDefault || (!conDefault && novedadOrigen.getaccion_tomada()!=null && !novedadOrigen.getaccion_tomada().equals(""))) {novedad.setaccion_tomada(novedadOrigen.getaccion_tomada());}
			if(conDefault || (!conDefault && novedadOrigen.getfeha_atencion()!=null && !novedadOrigen.getfeha_atencion().equals(new Date()))) {novedad.setfeha_atencion(novedadOrigen.getfeha_atencion());}
			if(conDefault || (!conDefault && novedadOrigen.gethora_atencion()!=null && !novedadOrigen.gethora_atencion().equals(new Time((new Date()).getTime())))) {novedad.sethora_atencion(novedadOrigen.gethora_atencion());}
			if(conDefault || (!conDefault && novedadOrigen.getid_empleado()!=null && !novedadOrigen.getid_empleado().equals(-1L))) {novedad.setid_empleado(novedadOrigen.getid_empleado());}
			if(conDefault || (!conDefault && novedadOrigen.getemail()!=null && !novedadOrigen.getemail().equals(""))) {novedad.setemail(novedadOrigen.getemail());}
			if(conDefault || (!conDefault && novedadOrigen.getesta_activo()!=null && !novedadOrigen.getesta_activo().equals(false))) {novedad.setesta_activo(novedadOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNovedad(Novedad novedad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNovedad.jLabelidNovedad.setText(novedad.getId().toString());
			this.jInternalFrameDetalleFormNovedad.jTextAreadescripcionNovedad.setText(novedad.getdescripcion());
			this.jInternalFrameDetalleFormNovedad.jTextAreaaccion_tomadaNovedad.setText(novedad.getaccion_tomada());
			this.jInternalFrameDetalleFormNovedad.jDateChooserfeha_atencionNovedad.setDate(novedad.getfeha_atencion());
			this.jInternalFrameDetalleFormNovedad.jSpinnerhora_atencionNovedad.setValue(novedad.gethora_atencion());
			this.jInternalFrameDetalleFormNovedad.jTextFieldemailNovedad.setText(novedad.getemail());
			this.jInternalFrameDetalleFormNovedad.jCheckBoxesta_activoNovedad.setSelected(novedad.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNovedad(NovedadBean novedadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNovedad.jLabelidNovedad.setText(novedadBean.getId().toString());
			this.jInternalFrameDetalleFormNovedad.jTextAreadescripcionNovedad.setText(novedadBean.getdescripcion());
			this.jInternalFrameDetalleFormNovedad.jTextAreaaccion_tomadaNovedad.setText(novedadBean.getaccion_tomada());
			this.jInternalFrameDetalleFormNovedad.jDateChooserfeha_atencionNovedad.setDate(novedadBean.getfeha_atencion());
			this.jInternalFrameDetalleFormNovedad.jSpinnerhora_atencionNovedad.setValue(novedadBean.gethora_atencion());
			this.jInternalFrameDetalleFormNovedad.jTextFieldemailNovedad.setText(novedadBean.getemail());
			this.jInternalFrameDetalleFormNovedad.jCheckBoxesta_activoNovedad.setSelected(novedadBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNovedad(NovedadParameterReturnGeneral novedadReturnGeneral,NovedadBean novedadBean,Boolean conDefault) throws Exception { 
		try {
			Novedad novedadLocal=new Novedad();
			
			novedadLocal=novedadReturnGeneral.getNovedad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && novedadLocal.getId()!=null && !novedadLocal.getId().equals(0L))) {novedadBean.setId(novedadLocal.getId());}}
			if(conDefault || (!conDefault && novedadLocal.getid_cliente()!=null && !novedadLocal.getid_cliente().equals(-1L))) {novedadBean.setid_cliente(novedadLocal.getid_cliente());}
			if(conDefault || (!conDefault && novedadLocal.getdescripcion()!=null && !novedadLocal.getdescripcion().equals(""))) {novedadBean.setdescripcion(novedadLocal.getdescripcion());}
			if(conDefault || (!conDefault && novedadLocal.getaccion_tomada()!=null && !novedadLocal.getaccion_tomada().equals(""))) {novedadBean.setaccion_tomada(novedadLocal.getaccion_tomada());}
			if(conDefault || (!conDefault && novedadLocal.getfeha_atencion()!=null && !novedadLocal.getfeha_atencion().equals(new Date()))) {novedadBean.setfeha_atencion(novedadLocal.getfeha_atencion());}
			if(conDefault || (!conDefault && novedadLocal.gethora_atencion()!=null && !novedadLocal.gethora_atencion().equals(new Time((new Date()).getTime())))) {novedadBean.sethora_atencion(novedadLocal.gethora_atencion());}
			if(conDefault || (!conDefault && novedadLocal.getid_empleado()!=null && !novedadLocal.getid_empleado().equals(-1L))) {novedadBean.setid_empleado(novedadLocal.getid_empleado());}
			if(conDefault || (!conDefault && novedadLocal.getemail()!=null && !novedadLocal.getemail().equals(""))) {novedadBean.setemail(novedadLocal.getemail());}
			if(conDefault || (!conDefault && novedadLocal.getesta_activo()!=null && !novedadLocal.getesta_activo().equals(false))) {novedadBean.setesta_activo(novedadLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNovedadGenerico(Long idNovedadSeleccionado,JComboBox jComboBoxNovedad,List<Novedad> novedadsLocal)throws Exception {
		try {
			Novedad  novedadTemp=null;

			for(Novedad novedadAux:novedadsLocal) {
				if(novedadAux.getId()!=null && novedadAux.getId().equals(idNovedadSeleccionado)) {
					novedadTemp=novedadAux;
					break;
				}
			}

			jComboBoxNovedad.setSelectedItem(novedadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNovedadGenerico(JComboBox jComboBoxNovedad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNovedad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNovedad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNovedad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNovedad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNovedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNovedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedad=(Novedad) novedadLogic.getNovedads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			novedad =(Novedad) novedads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!novedad.getIsNew() && !novedad.getIsChanged() && !novedad.getIsDeleted()) {
				sDescripcion=novedad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=novedad.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!novedad.getIsNew() && !novedad.getIsChanged() && !novedad.getIsDeleted()) {
				sDescripcion=novedad.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=novedad.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!novedad.getIsNew() && !novedad.getIsChanged() && !novedad.getIsDeleted()) {
				sDescripcion=novedad.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=novedad.getusuario_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!novedad.getIsNew() && !novedad.getIsChanged() && !novedad.getIsDeleted()) {
				sDescripcion=novedad.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=novedad.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!novedad.getIsNew() && !novedad.getIsChanged() && !novedad.getIsDeleted()) {
				sDescripcion=novedad.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=novedad.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Novedad novedadRow=new Novedad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedadRow=(Novedad) novedadLogic.getNovedads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			novedadRow=(Novedad) novedads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNovedad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNovedad.setVisible((this.isVisibilidadCeldaNuevoNovedad && this.isPermisoNuevoNovedad));			
			this.jButtonDuplicarNovedad.setVisible((this.isVisibilidadCeldaDuplicarNovedad && this.isPermisoDuplicarNovedad));			
			this.jButtonCopiarNovedad.setVisible((this.isVisibilidadCeldaCopiarNovedad && this.isPermisoCopiarNovedad));
			this.jButtonVerFormNovedad.setVisible((this.isVisibilidadCeldaVerFormNovedad && this.isPermisoVerFormNovedad));
			
			this.jButtonAbrirOrderByNovedad.setVisible((this.isVisibilidadCeldaOrdenNovedad && this.isPermisoOrdenNovedad));			
			
			this.jButtonNuevoRelacionesNovedad.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedad && this.isPermisoNuevoNovedad));			
			this.jButtonNuevoGuardarCambiosNovedad.setVisible((this.isVisibilidadCeldaNuevoNovedad && this.isPermisoNuevoNovedad && this.isPermisoGuardarCambiosNovedad));
			
			if(this.jInternalFrameDetalleFormNovedad!=null) {
			this.jInternalFrameDetalleFormNovedad.jButtonModificarNovedad.setVisible((this.isVisibilidadCeldaModificarNovedad && this.isPermisoActualizarNovedad));	
			this.jInternalFrameDetalleFormNovedad.jButtonActualizarNovedad.setVisible((this.isVisibilidadCeldaActualizarNovedad && this.isPermisoActualizarNovedad));	
			this.jInternalFrameDetalleFormNovedad.jButtonEliminarNovedad.setVisible((this.isVisibilidadCeldaEliminarNovedad && this.isPermisoEliminarNovedad));
			this.jInternalFrameDetalleFormNovedad.jButtonCancelarNovedad.setVisible(this.isVisibilidadCeldaCancelarNovedad);							
			this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosNovedad.setVisible((this.isVisibilidadCeldaGuardarNovedad && this.isPermisoGuardarCambiosNovedad));			
			
			}
						
			this.jButtonGuardarCambiosTablaNovedad.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedad && this.isPermisoGuardarCambiosNovedad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNovedad.setVisible((this.isVisibilidadCeldaNuevoNovedad && this.isPermisoNuevoNovedad));						
			this.jButtonDuplicarToolBarNovedad.setVisible((this.isVisibilidadCeldaDuplicarNovedad && this.isPermisoDuplicarNovedad));						
			this.jButtonCopiarToolBarNovedad.setVisible((this.isVisibilidadCeldaCopiarNovedad && this.isPermisoCopiarNovedad));			
			this.jButtonVerFormToolBarNovedad.setVisible((this.isVisibilidadCeldaVerFormNovedad && this.isPermisoVerFormNovedad));			
			this.jButtonAbrirOrderByToolBarNovedad.setVisible((this.isVisibilidadCeldaOrdenNovedad && this.isPermisoOrdenNovedad));
			this.jButtonNuevoRelacionesToolBarNovedad.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedad && this.isPermisoNuevoNovedad));			
			this.jButtonNuevoGuardarCambiosToolBarNovedad.setVisible((this.isVisibilidadCeldaNuevoNovedad && this.isPermisoNuevoNovedad && this.isPermisoGuardarCambiosNovedad));			
			
			if(this.jInternalFrameDetalleFormNovedad!=null) {
			this.jInternalFrameDetalleFormNovedad.jButtonModificarToolBarNovedad.setVisible((this.isVisibilidadCeldaModificarNovedad && this.isPermisoActualizarNovedad));	
			this.jInternalFrameDetalleFormNovedad.jButtonActualizarToolBarNovedad.setVisible((this.isVisibilidadCeldaActualizarNovedad  && this.isPermisoActualizarNovedad));	
			this.jInternalFrameDetalleFormNovedad.jButtonEliminarToolBarNovedad.setVisible((this.isVisibilidadCeldaEliminarNovedad && this.isPermisoEliminarNovedad));
			this.jInternalFrameDetalleFormNovedad.jButtonCancelarToolBarNovedad.setVisible(this.isVisibilidadCeldaCancelarNovedad);				
			this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosToolBarNovedad.setVisible((this.isVisibilidadCeldaGuardarNovedad && this.isPermisoGuardarCambiosNovedad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNovedad.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedad && this.isPermisoGuardarCambiosNovedad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNovedad.setVisible((this.isVisibilidadCeldaNuevoNovedad && this.isPermisoNuevoNovedad));			
			this.jMenuItemDuplicarNovedad.setVisible((this.isVisibilidadCeldaDuplicarNovedad && this.isPermisoDuplicarNovedad));			
			this.jMenuItemCopiarNovedad.setVisible((this.isVisibilidadCeldaCopiarNovedad && this.isPermisoCopiarNovedad));			
			this.jMenuItemVerFormNovedad.setVisible((this.isVisibilidadCeldaVerFormNovedad && this.isPermisoVerFormNovedad));			
			this.jMenuItemAbrirOrderByNovedad.setVisible((this.isVisibilidadCeldaOrdenNovedad && this.isPermisoOrdenNovedad));			
			//this.jMenuItemMostrarOcultarNovedad.setVisible((this.isVisibilidadCeldaOrdenNovedad && this.isPermisoOrdenNovedad));
			this.jMenuItemDetalleAbrirOrderByNovedad.setVisible((this.isVisibilidadCeldaOrdenNovedad && this.isPermisoOrdenNovedad));			
			//this.jMenuItemDetalleMostrarOcultarNovedad.setVisible((this.isVisibilidadCeldaOrdenNovedad && this.isPermisoOrdenNovedad));			
			this.jMenuItemNuevoRelacionesNovedad.setVisible((this.isVisibilidadCeldaNuevoRelacionesNovedad && this.isPermisoNuevoNovedad));			
			this.jMenuItemNuevoGuardarCambiosNovedad.setVisible((this.isVisibilidadCeldaNuevoNovedad && this.isPermisoNuevoNovedad && this.isPermisoGuardarCambiosNovedad));									
			
			if(this.jInternalFrameDetalleFormNovedad!=null) {
			this.jInternalFrameDetalleFormNovedad.jMenuItemModificarNovedad.setVisible((this.isVisibilidadCeldaModificarNovedad && this.isPermisoActualizarNovedad));	
			this.jInternalFrameDetalleFormNovedad.jMenuItemActualizarNovedad.setVisible((this.isVisibilidadCeldaActualizarNovedad && this.isPermisoActualizarNovedad));	
			this.jInternalFrameDetalleFormNovedad.jMenuItemEliminarNovedad.setVisible((this.isVisibilidadCeldaEliminarNovedad && this.isPermisoEliminarNovedad));
			this.jInternalFrameDetalleFormNovedad.jMenuItemCancelarNovedad.setVisible(this.isVisibilidadCeldaCancelarNovedad);				
			}
			
			this.jMenuItemGuardarCambiosNovedad.setVisible((this.isVisibilidadCeldaGuardarNovedad && this.isPermisoGuardarCambiosNovedad));						
			this.jMenuItemGuardarCambiosTablaNovedad.setVisible((this.isVisibilidadCeldaGuardarCambiosNovedad && this.isPermisoGuardarCambiosNovedad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNovedad=this.jButtonNuevoNovedad.isVisible();
			this.isVisibilidadCeldaDuplicarNovedad=this.jButtonDuplicarNovedad.isVisible();
			this.isVisibilidadCeldaCopiarNovedad=this.jButtonCopiarNovedad.isVisible();
			this.isVisibilidadCeldaVerFormNovedad=this.jButtonVerFormNovedad.isVisible();
			
			this.isVisibilidadCeldaOrdenNovedad=this.jButtonAbrirOrderByNovedad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNovedad=this.jButtonNuevoRelacionesNovedad.isVisible();
			this.isVisibilidadCeldaModificarNovedad=this.jButtonModificarNovedad.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedad!=null) {
			this.isVisibilidadCeldaActualizarNovedad=this.jInternalFrameDetalleFormNovedad.jButtonActualizarNovedad.isVisible();
			this.isVisibilidadCeldaEliminarNovedad=this.jInternalFrameDetalleFormNovedad.jButtonEliminarNovedad.isVisible();
			this.isVisibilidadCeldaCancelarNovedad=this.jInternalFrameDetalleFormNovedad.jButtonCancelarNovedad.isVisible();
			this.isVisibilidadCeldaGuardarNovedad=this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosNovedad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNovedad=this.jButtonGuardarCambiosTablaNovedad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNovedad=this.jButtonNuevoToolBarNovedad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNovedad=this.jButtonNuevoRelacionesToolBarNovedad.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedad!=null) {
			this.isVisibilidadCeldaModificarNovedad=this.jInternalFrameDetalleFormNovedad.jButtonModificarToolBarNovedad.isVisible();
			this.isVisibilidadCeldaActualizarNovedad=this.jInternalFrameDetalleFormNovedad.jButtonActualizarToolBarNovedad.isVisible();
			this.isVisibilidadCeldaEliminarNovedad=this.jInternalFrameDetalleFormNovedad.jButtonEliminarToolBarNovedad.isVisible();
			this.isVisibilidadCeldaCancelarNovedad=this.jInternalFrameDetalleFormNovedad.jButtonCancelarToolBarNovedad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNovedad=this.jButtonGuardarCambiosToolBarNovedad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNovedad=this.jButtonGuardarCambiosTablaToolBarNovedad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNovedad=this.jMenuItemNuevoNovedad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNovedad=this.jMenuItemNuevoRelacionesNovedad.isVisible();
			
			if(this.jInternalFrameDetalleFormNovedad!=null) {
			this.isVisibilidadCeldaModificarNovedad=this.jInternalFrameDetalleFormNovedad.jMenuItemModificarNovedad.isVisible();
			this.isVisibilidadCeldaActualizarNovedad=this.jInternalFrameDetalleFormNovedad.jMenuItemActualizarNovedad.isVisible();
			this.isVisibilidadCeldaEliminarNovedad=this.jInternalFrameDetalleFormNovedad.jMenuItemEliminarNovedad.isVisible();
			this.isVisibilidadCeldaCancelarNovedad=this.jInternalFrameDetalleFormNovedad.jMenuItemCancelarNovedad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNovedad=this.jMenuItemGuardarCambiosNovedad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNovedad=this.jMenuItemGuardarCambiosTablaNovedad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNovedad(Boolean esInicializar) {
		if(NovedadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.novedadSessionBean.getConGuardarRelaciones()) {
				//if(this.novedadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNovedad();
			}
			
			this.inicializarActualizarBindingBotonesManualNovedad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNovedad() {
		this.jButtonNuevoNovedad.setVisible(this.isPermisoNuevoNovedad);			
		this.jButtonDuplicarNovedad.setVisible(this.isPermisoDuplicarNovedad);			
		this.jButtonCopiarNovedad.setVisible(this.isPermisoCopiarNovedad);			
		this.jButtonVerFormNovedad.setVisible(this.isPermisoVerFormNovedad);			
		
		this.jButtonAbrirOrderByNovedad.setVisible(this.isPermisoOrdenNovedad);					
		
		this.jButtonNuevoRelacionesNovedad.setVisible(this.isPermisoNuevoNovedad);			
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jButtonModificarNovedad.setVisible(this.isPermisoActualizarNovedad);	
			this.jInternalFrameDetalleFormNovedad.jButtonActualizarNovedad.setVisible(this.isPermisoActualizarNovedad);	
			this.jInternalFrameDetalleFormNovedad.jButtonEliminarNovedad.setVisible(this.isPermisoEliminarNovedad);
			this.jInternalFrameDetalleFormNovedad.jButtonCancelarNovedad.setVisible(this.isVisibilidadCeldaCancelarNovedad);						
			this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosNovedad.setVisible(this.isPermisoGuardarCambiosNovedad);							
		}
		
		this.jButtonGuardarCambiosTablaNovedad.setVisible(this.isPermisoActualizarNovedad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNovedad() {
		this.jInternalFrameDetalleFormNovedad.jButtonModificarNovedad.setVisible(this.isPermisoActualizarNovedad);	
		this.jInternalFrameDetalleFormNovedad.jButtonActualizarNovedad.setVisible(this.isPermisoActualizarNovedad);	
		this.jInternalFrameDetalleFormNovedad.jButtonEliminarNovedad.setVisible(this.isPermisoEliminarNovedad);
		this.jInternalFrameDetalleFormNovedad.jButtonCancelarNovedad.setVisible(this.isVisibilidadCeldaCancelarNovedad);							
		this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosNovedad.setVisible((this.isVisibilidadCeldaGuardarNovedad && this.isPermisoGuardarCambiosNovedad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNovedad() {
		if(NovedadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNovedad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNovedad() {
	}
	
	public void jTableDatosNovedadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNovedad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.novedad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaNovedadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebNovedad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.novedadLogic.getConnexion());

				if(this.novedad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.novedad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedad=(TitledBorder)this.jScrollPanelDatosNovedad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderNovedad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.novedad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalNovedadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebNovedad(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.novedadLogic.getConnexion());

				if(this.novedad.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.novedad.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedad=(TitledBorder)this.jScrollPanelDatosNovedad.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderNovedad.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.novedad.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioNovedadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebNovedad(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.novedadLogic.getConnexion());

				if(this.novedad.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.novedad.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedad=(TitledBorder)this.jScrollPanelDatosNovedad.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderNovedad.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.novedad.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteNovedadActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderNovedad=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosNovedad.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderNovedad=(TitledBorder)this.jScrollPanelDatosNovedad.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderNovedad.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteNovedadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebNovedad(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.novedadLogic.getConnexion());

				if(this.novedad.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.novedad.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedad=(TitledBorder)this.jScrollPanelDatosNovedad.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderNovedad.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.novedad.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.novedad.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonaccion_tomadaNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.getaccion_tomada()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where accion_tomada like '%"+this.novedad.getaccion_tomada()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfeha_atencionNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.getfeha_atencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where feha_atencion = '"+Funciones2.getStringPostgresDate(this.novedad.getfeha_atencion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_atencionNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.gethora_atencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_atencion = "+this.novedad.gethora_atencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoNovedadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebNovedad(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNovedad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNovedad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.novedadLogic.getConnexion());

				if(this.novedad.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.novedad.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNovedad=(TitledBorder)this.jScrollPanelDatosNovedad.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderNovedad.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.novedad.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonemailNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.getemail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where email like '%"+this.novedad.getemail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoNovedadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNovedad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNovedad(this.getnovedad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.novedad==null) {
						this.novedad = new Novedad();
					}

					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);
				}

				if(this.novedad.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.novedad.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNovedad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteNovedadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedad(false,false);

			this.getNovedadsFK_IdCliente();

			this.inicializarActualizarBindingNovedad(false);

			//if(NovedadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoNovedadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedad(false,false);

			this.getNovedadsFK_IdEmpleado();

			this.inicializarActualizarBindingNovedad(false);

			//if(NovedadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaNovedadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedad(false,false);

			this.getNovedadsFK_IdEmpresa();

			this.inicializarActualizarBindingNovedad(false);

			//if(NovedadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalNovedadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedad(false,false);

			this.getNovedadsFK_IdSucursal();

			this.inicializarActualizarBindingNovedad(false);

			//if(NovedadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioNovedadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNovedad(false,false);

			this.getNovedadsFK_IdUsuario();

			this.inicializarActualizarBindingNovedad(false);

			//if(NovedadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNovedad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.novedadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameNovedad() {
		if(this.jInternalFrameDetalleFormNovedad!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormNovedad!=null) {
			this.jInternalFrameDetalleFormNovedad.setVisible(false);	    			
			this.jInternalFrameDetalleFormNovedad.dispose();
			this.jInternalFrameDetalleFormNovedad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNovedad!=null) {
			this.jInternalFrameReporteDinamicoNovedad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNovedad.dispose();
			this.jInternalFrameReporteDinamicoNovedad=null;
		}
		
		if(this.jInternalFrameImportacionNovedad!=null) {
			this.jInternalFrameImportacionNovedad.setVisible(false);	    			
			this.jInternalFrameImportacionNovedad.dispose();
			this.jInternalFrameImportacionNovedad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNovedad();
			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
			
			if(sTipo.equals("NuevoNovedad")) {
				jButtonNuevoNovedadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNovedad")) {
				jButtonDuplicarNovedadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNovedad")) {
				jButtonCopiarNovedadActionPerformed(evt);
			} else if(sTipo.equals("VerFormNovedad")) {
				jButtonVerFormNovedadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNovedad")) {
				jButtonNuevoNovedadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNovedad")) {
				jButtonDuplicarNovedadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNovedad")) {
				jButtonNuevoNovedadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNovedad")) {
				jButtonDuplicarNovedadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNovedad")) {
				jButtonNuevoNovedadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNovedad")) {
				jButtonNuevoNovedadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNovedad")) {
				jButtonNuevoNovedadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNovedad")) {
				jButtonModificarNovedadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNovedad")) {
				jButtonModificarNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNovedad")) {
				jButtonModificarNovedadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNovedad")) {
				jButtonActualizarNovedadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNovedad")) {
				jButtonActualizarNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNovedad")) {
				jButtonActualizarNovedadActionPerformed(evt);
			} else if(sTipo.equals("EliminarNovedad")) {
				jButtonEliminarNovedadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNovedad")) {
				jButtonEliminarNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNovedad")) {
				jButtonEliminarNovedadActionPerformed(evt);
			} else if(sTipo.equals("CancelarNovedad")) {
				jButtonCancelarNovedadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNovedad")) {
				jButtonCancelarNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNovedad")) {
				jButtonCancelarNovedadActionPerformed(evt);
			} else if(sTipo.equals("CerrarNovedad")) {
				jButtonCerrarNovedadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNovedad")) {
				jButtonCerrarNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNovedad")) {
				jButtonCerrarNovedadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNovedad")) {
				jButtonMostrarOcultarNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNovedad")) {
				jButtonCancelarNovedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNovedad")) {
				jButtonGuardarCambiosNovedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNovedad")) {
				jButtonGuardarCambiosNovedadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNovedad")) {
				jButtonCopiarNovedadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNovedad")) {
				jButtonVerFormNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNovedad")) {
				jButtonGuardarCambiosNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNovedad")) {
				jButtonCopiarNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNovedad")) {
				jButtonVerFormNovedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNovedad")) {
				jButtonGuardarCambiosNovedadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNovedad")) {
				jButtonGuardarCambiosNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNovedad")) {
				jButtonGuardarCambiosNovedadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNovedad")) {
				jButtonRecargarInformacionNovedadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNovedad")) {
				jButtonRecargarInformacionNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNovedad")) {
				jButtonRecargarInformacionNovedadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNovedad")) {
				jButtonAnterioresNovedadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNovedad")) {
				jButtonAnterioresNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNovedad")) {
				jButtonAnterioresNovedadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNovedad")) {
				jButtonSiguientesNovedadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNovedad")) {
				jButtonSiguientesNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNovedad")) {
				jButtonSiguientesNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNovedad") || sTipo.equals("MenuItemDetalleAbrirOrderByNovedad")) {
				jButtonAbrirOrderByNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNovedad") || sTipo.equals("MenuItemDetalleMostrarOcultarNovedad")) {
				jButtonMostrarOcultarNovedadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNovedad")) {
				jButtonNuevoGuardarCambiosNovedadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNovedad")) {
				jButtonNuevoGuardarCambiosNovedadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNovedad")) {
				jButtonNuevoGuardarCambiosNovedadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNovedad")) {
				jButtonCerrarReporteDinamicoNovedadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNovedad")) {
				jButtonGenerarReporteDinamicoNovedadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNovedad")) {
				
				jButtonGenerarExcelReporteDinamicoNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNovedad")) {
				jButtonCerrarImportacionNovedadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNovedad")) {
				
				jButtonGenerarImportacionNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNovedad")) {
				
				jButtonAbrirImportacionNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNovedad")) {
				jComboBoxTiposAccionesNovedadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNovedad")) {
				jComboBoxTiposRelacionesNovedadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNovedad")) {
				jComboBoxTiposAccionesNovedadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNovedad")) {
				
				jComboBoxTiposSeleccionarNovedadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNovedad")) {
				jTextFieldValorCampoGeneralNovedadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNovedad")) {
				jButtonAbrirOrderByNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNovedad")) {
				jButtonAbrirOrderByNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNovedad")) {
				jButtonCerrarOrderByNovedadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNovedadBusqueda")) {
				this.jButtonidNovedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNovedadUpdate")) {
				this.jButtonid_empresaNovedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNovedadBusqueda")) {
				this.jButtonid_empresaNovedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalNovedadUpdate")) {
				this.jButtonid_sucursalNovedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalNovedadBusqueda")) {
				this.jButtonid_sucursalNovedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioNovedadUpdate")) {
				this.jButtonid_usuarioNovedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioNovedadBusqueda")) {
				this.jButtonid_usuarioNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteNovedad")) {
				this.jButtonid_clienteNovedadActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteNovedadUpdate")) {
				this.jButtonid_clienteNovedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteNovedadBusqueda")) {
				this.jButtonid_clienteNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionNovedadBusqueda")) {
				this.jButtondescripcionNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("accion_tomadaNovedadBusqueda")) {
				this.jButtonaccion_tomadaNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("feha_atencionNovedadBusqueda")) {
				this.jButtonfeha_atencionNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_atencionNovedadBusqueda")) {
				this.jButtonhora_atencionNovedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoNovedadUpdate")) {
				this.jButtonid_empleadoNovedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoNovedadBusqueda")) {
				this.jButtonid_empleadoNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailNovedadBusqueda")) {
				this.jButtonemailNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoNovedadBusqueda")) {
				this.jButtonesta_activoNovedadBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteNovedad")) {
				this.jButtonid_clienteNovedadActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteNovedad")) {
				this.jButtonFK_IdClienteNovedadActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoNovedad")) {
				this.jButtonFK_IdEmpleadoNovedadActionPerformed(evt);
			}
			
			;
			
			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNovedad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				


				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Novedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Novedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Novedad novedadLocal=null;
			
			if(!this.getEsControlTabla()) {
				novedadLocal=this.novedad;
			} else {
				novedadLocal=this.novedadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
							
				
				


				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Novedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Novedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadAnterior =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadAnterior =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
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
			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
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
			
			


			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
								
						
				


				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Novedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Novedad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
								
				
				


				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Novedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Novedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadAnterior =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadAnterior =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadAnterior =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadAnterior =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
							
				
				


				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Novedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Novedad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadAnterior =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.novedadAnterior =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
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
			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
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
			
			


			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
								
				
				


				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Novedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Novedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadAnterior =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadAnterior =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNovedad")) {
					jCheckBoxSeleccionarTodosNovedadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNovedad")) {
					jCheckBoxSeleccionadosNovedadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNovedad")) {
					
				}
				
				


				
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Novedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Novedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
												
				
				


				
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Novedad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Novedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.novedadAnterior =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.novedadAnterior =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
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
			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
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
			
			


			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNovedadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Novedad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Novedad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.novedad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.novedad);
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
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
				
				


				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Novedad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Novedad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNovedadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.novedadAnterior =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.novedadAnterior =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNovedad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNovedadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNovedad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.novedad =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.novedad =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.novedad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNovedad")) {
				
				}
				
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNovedad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNovedad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNovedad")) {
			
			}
			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNovedad();
			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
			if(sTipo.equals("NuevoNovedad")) {
				jButtonNuevoNovedadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNovedad")) {
				jButtonDuplicarNovedadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNovedad")) {
				jButtonCopiarNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNovedad")) {
				jButtonVerFormNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNovedad")) {
				jButtonNuevoNovedadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNovedad")) {
				jButtonModificarNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNovedad")) {
				jButtonActualizarNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNovedad")) {
				jButtonEliminarNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNovedad")) {
				jButtonGuardarCambiosNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNovedad")) {
				jButtonCancelarNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNovedad")) {
				jButtonCerrarNovedadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNovedad")) {
				jButtonGuardarCambiosNovedadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNovedad")) {
				jButtonNuevoGuardarCambiosNovedadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNovedad")) {
				jButtonAbrirOrderByNovedadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNovedad")) {
				jButtonRecargarInformacionNovedadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNovedad")) {
				jButtonAnterioresNovedadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNovedad")) {
				jButtonSiguientesNovedadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNovedadBusqueda")) {
				this.jButtonidNovedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNovedadUpdate")) {
				this.jButtonid_empresaNovedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNovedadBusqueda")) {
				this.jButtonid_empresaNovedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalNovedadUpdate")) {
				this.jButtonid_sucursalNovedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalNovedadBusqueda")) {
				this.jButtonid_sucursalNovedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioNovedadUpdate")) {
				this.jButtonid_usuarioNovedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioNovedadBusqueda")) {
				this.jButtonid_usuarioNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteNovedad")) {
				this.jButtonid_clienteNovedadActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteNovedadUpdate")) {
				this.jButtonid_clienteNovedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteNovedadBusqueda")) {
				this.jButtonid_clienteNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionNovedadBusqueda")) {
				this.jButtondescripcionNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("accion_tomadaNovedadBusqueda")) {
				this.jButtonaccion_tomadaNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("feha_atencionNovedadBusqueda")) {
				this.jButtonfeha_atencionNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_atencionNovedadBusqueda")) {
				this.jButtonhora_atencionNovedadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoNovedadUpdate")) {
				this.jButtonid_empleadoNovedadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoNovedadBusqueda")) {
				this.jButtonid_empleadoNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailNovedadBusqueda")) {
				this.jButtonemailNovedadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoNovedadBusqueda")) {
				this.jButtonesta_activoNovedadBusquedaActionPerformed(evt);
			}
			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNovedad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNovedad")) {
				closingInternalFrameNovedad();
				
			} else if(sTipo.equals("jButtonCancelarNovedad")) {
				JInternalFrameBase jInternalFrameDetalleFormNovedad = (JInternalFrameBase)evt.getSource();
	            	
	            NovedadBeanSwingJInternalFrame jInternalFrameParent=(NovedadBeanSwingJInternalFrame)jInternalFrameDetalleFormNovedad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNovedadActionPerformed(null);
			}
			
			NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.novedad,new Object(),this.novedadParameterGeneral,this.novedadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNovedad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNovedad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNovedad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.novedad)) {
			if(!esControlTabla) {
				if(NovedadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);			
				}
				
				if(this.novedadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNovedad(this.novedad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.novedadReturnGeneral=novedadLogic.procesarEventosNovedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadLogic.getNovedads(),this.novedad,this.novedadParameterGeneral,this.isEsNuevoNovedad,classes);//this.novedadLogic.getNovedad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNovedad(this.novedadReturnGeneral,this.novedadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.novedadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNovedad(classes,this.novedadReturnGeneral,this.novedadBean,false);
					}
						
					if(this.novedadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNovedad(this.novedadReturnGeneral.getNovedad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNovedad(this.novedadReturnGeneral.getNovedad());	
					}
						
					if(this.novedadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNovedad(this.novedadReturnGeneral.getNovedad(),classes);//this.novedadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNovedad(this.novedad,classes);//this.novedadBean);									
				}
			
				if(NovedadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNovedad(this.novedad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNovedad(this.novedad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.novedadAnterior!=null) {
						this.novedad=this.novedadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.novedadReturnGeneral=novedadLogic.procesarEventosNovedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedadLogic.getNovedads(),this.novedad,this.novedadParameterGeneral,this.isEsNuevoNovedad,classes);//this.novedadLogic.getNovedad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.novedadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.novedadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.novedadReturnGeneral.getNovedad(),novedadLogic.getNovedads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.novedadReturnGeneral.getNovedad(),this.novedads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNovedad.repaint();
				
				//((AbstractTableModel) this.jTableDatosNovedad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNovedad();
			}
		}
	}
	
	public void actualizarVisualTableDatosNovedad() throws Exception {
		
		NovedadModel novedadModel=(NovedadModel)this.jTableDatosNovedad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			novedadModel.novedads=this.novedadLogic.getNovedads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			novedadModel.novedads=this.novedads;
		}
		
		
		((NovedadModel) this.jTableDatosNovedad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNovedad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnovedadAnterior(),this.novedadLogic.getNovedads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnovedadAnterior(),this.novedads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNovedad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNovedad(Novedad novedad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
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
										
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedad,new Object(),generalEntityParameterGeneral,this.novedadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.novedadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NovedadConstantesFunciones.getClassesRelationshipsOfNovedad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NovedadConstantesFunciones.getClassesRelationshipsFromStringsOfNovedad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNovedad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NovedadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.novedad,new Object(),generalEntityParameterGeneral,this.novedadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNovedad(NovedadBean novedadBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNovedad(ArrayList<Classe> classes,NovedadReturnGeneral novedadReturnGeneral,NovedadBean novedadBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNovedad(Novedad novedad,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.novedad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNovedad = new NovedadDetalleFormJInternalFrame(jDesktopPane,this.novedadSessionBean.getConGuardarRelaciones(),this.novedadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNovedad);
		this.jInternalFrameDetalleFormNovedad.setVisible(false);
		this.jInternalFrameDetalleFormNovedad.setSelected(false);						
		
		this.jInternalFrameDetalleFormNovedad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNovedad.novedadLogic=this.novedadLogic;
		
		this.cargarCombosFrameForeignKeyNovedad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNovedad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNovedad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNovedad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNovedad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNovedad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNovedad"));
		
		this.jInternalFrameDetalleFormNovedad.jButtonModificarNovedad.addActionListener(new ButtonActionListener(this,"ModificarNovedad"));

		
		this.jInternalFrameDetalleFormNovedad.jButtonModificarToolBarNovedad.addActionListener(new ButtonActionListener(this,"ModificarToolBarNovedad"));
					
		this.jInternalFrameDetalleFormNovedad.jMenuItemModificarNovedad.addActionListener(new ButtonActionListener(this,"MenuItemModificarNovedad"));		
		
		
		
		this.jInternalFrameDetalleFormNovedad.jButtonActualizarNovedad.addActionListener (new ButtonActionListener(this,"ActualizarNovedad"));
		
		
		this.jInternalFrameDetalleFormNovedad.jButtonActualizarToolBarNovedad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNovedad"));
						
		this.jInternalFrameDetalleFormNovedad.jMenuItemActualizarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNovedad"));		
		
		
		
		this.jInternalFrameDetalleFormNovedad.jButtonEliminarNovedad.addActionListener (new ButtonActionListener(this,"EliminarNovedad"));
		
		
		this.jInternalFrameDetalleFormNovedad.jButtonEliminarToolBarNovedad.addActionListener (new ButtonActionListener(this,"EliminarToolBarNovedad"));
								
		this.jInternalFrameDetalleFormNovedad.jMenuItemEliminarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNovedad"));		
		
		
		
		this.jInternalFrameDetalleFormNovedad.jButtonCancelarNovedad.addActionListener (new ButtonActionListener(this,"CancelarNovedad"));
		
		
		this.jInternalFrameDetalleFormNovedad.jButtonCancelarToolBarNovedad.addActionListener (new ButtonActionListener(this,"CancelarToolBarNovedad"));
					
		this.jInternalFrameDetalleFormNovedad.jMenuItemCancelarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNovedad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNovedad.jMenuItemDetalleCerrarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNovedad"));		
		
		
		
		this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosToolBarNovedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedad"));
		
		
		
		this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosToolBarNovedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedad"));
		
		
		
		this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNovedad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonidNovedadBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_empresaNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_empresaNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_sucursalNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_sucursalNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_usuarioNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_usuarioNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioNovedadBusqueda"));
		//jButtonid_clienteNovedad.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteNovedadActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormNovedad.jButtonid_clienteNovedad.addActionListener(new ButtonActionListener(this,"id_clienteNovedad"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_clienteNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_clienteNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_clienteNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtondescripcionNovedadBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonaccion_tomadaNovedadBusqueda.addActionListener(new ButtonActionListener(this,"accion_tomadaNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonfeha_atencionNovedadBusqueda.addActionListener(new ButtonActionListener(this,"feha_atencionNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonhora_atencionNovedadBusqueda.addActionListener(new ButtonActionListener(this,"hora_atencionNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_empleadoNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_empleadoNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonemailNovedadBusqueda.addActionListener(new ButtonActionListener(this,"emailNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonesta_activoNovedadBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoNovedadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNovedad.jTabbedPaneRelacionesNovedad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNovedad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNovedad"));
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNovedad"));
		}
		
		this.jTableDatosNovedad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNovedad"));
		
		this.jTableDatosNovedad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNovedad"));
		
		this.jButtonNuevoNovedad.addActionListener(new ButtonActionListener(this,"NuevoNovedad"));
		
		this.jButtonDuplicarNovedad.addActionListener(new ButtonActionListener(this,"DuplicarNovedad"));
		
		this.jButtonCopiarNovedad.addActionListener(new ButtonActionListener(this,"CopiarNovedad"));
		
		this.jButtonVerFormNovedad.addActionListener(new ButtonActionListener(this,"VerFormNovedad"));
		
		
		this.jButtonNuevoToolBarNovedad.addActionListener(new ButtonActionListener(this,"NuevoToolBarNovedad"));
			
		this.jButtonDuplicarToolBarNovedad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNovedad"));
			
		this.jMenuItemNuevoNovedad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNovedad"));
			
		this.jMenuItemDuplicarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNovedad"));		
		
		
		this.jButtonNuevoRelacionesNovedad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNovedad"));
		
		
		this.jButtonNuevoRelacionesToolBarNovedad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNovedad"));
			
		this.jMenuItemNuevoRelacionesNovedad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNovedad"));		
		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jButtonModificarNovedad.addActionListener(new ButtonActionListener(this,"ModificarNovedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jButtonModificarToolBarNovedad.addActionListener(new ButtonActionListener(this,"ModificarToolBarNovedad"));
			
			this.jInternalFrameDetalleFormNovedad.jMenuItemModificarNovedad.addActionListener(new ButtonActionListener(this,"MenuItemModificarNovedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNovedad.jButtonActualizarNovedad.addActionListener (new ButtonActionListener(this,"ActualizarNovedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jButtonActualizarToolBarNovedad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNovedad"));
				
			this.jInternalFrameDetalleFormNovedad.jMenuItemActualizarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNovedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jButtonEliminarNovedad.addActionListener (new ButtonActionListener(this,"EliminarNovedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jButtonEliminarToolBarNovedad.addActionListener (new ButtonActionListener(this,"EliminarToolBarNovedad"));
						
			this.jInternalFrameDetalleFormNovedad.jMenuItemEliminarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNovedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jButtonCancelarNovedad.addActionListener (new ButtonActionListener(this,"CancelarNovedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jButtonCancelarToolBarNovedad.addActionListener (new ButtonActionListener(this,"CancelarToolBarNovedad"));
			
			this.jInternalFrameDetalleFormNovedad.jMenuItemCancelarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNovedad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNovedad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNovedad"));		
		
		
		this.jButtonCerrarNovedad.addActionListener (new ButtonActionListener(this,"CerrarNovedad"));
		
		
		this.jButtonCerrarToolBarNovedad.addActionListener (new ButtonActionListener(this,"CerrarToolBarNovedad"));
			
		this.jMenuItemCerrarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNovedad"));
			
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jMenuItemDetalleCerrarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNovedad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosNovedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosNovedad"));
		}
		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosToolBarNovedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNovedad"));
		}
		
		this.jButtonCopiarToolBarNovedad.addActionListener (new ButtonActionListener(this,"CopiarToolBarNovedad"));
			
		this.jButtonVerFormToolBarNovedad.addActionListener (new ButtonActionListener(this,"VerFormToolBarNovedad"));
		
		this.jMenuItemGuardarCambiosNovedad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNovedad"));
			
		this.jMenuItemCopiarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNovedad"));		
		
		this.jMenuItemVerFormNovedad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNovedad"));		
		
		
		this.jButtonGuardarCambiosTablaNovedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNovedad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNovedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNovedad"));
			
		this.jMenuItemGuardarCambiosTablaNovedad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNovedad"));		
		
		
		
		this.jButtonRecargarInformacionNovedad.addActionListener (new ButtonActionListener(this,"RecargarInformacionNovedad"));
					
		this.jButtonRecargarInformacionToolBarNovedad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNovedad"));
		
		this.jMenuItemRecargarInformacionNovedad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNovedad"));		
		
		
		
		this.jButtonAnterioresNovedad.addActionListener (new ButtonActionListener(this,"AnterioresNovedad"));
		
		
		this.jButtonAnterioresToolBarNovedad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNovedad"));
		
		this.jMenuItemAnterioresNovedad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNovedad"));		
		
		
		this.jButtonSiguientesNovedad.addActionListener (new ButtonActionListener(this,"SiguientesNovedad"));
		
		
		this.jButtonSiguientesToolBarNovedad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNovedad"));
			
		this.jMenuItemSiguientesNovedad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNovedad"));
			
		this.jMenuItemAbrirOrderByNovedad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNovedad"));
			
		this.jMenuItemMostrarOcultarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNovedad"));
			
		this.jMenuItemDetalleAbrirOrderByNovedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNovedad"));
			
		this.jMenuItemDetalleMostarOcultarNovedad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNovedad"));		
		
		
		this.jButtonNuevoGuardarCambiosNovedad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNovedad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNovedad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNovedad"));
			
		this.jMenuItemNuevoGuardarCambiosNovedad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNovedad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNovedad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNovedad"));

		this.jCheckBoxSeleccionadosNovedad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNovedad"));
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNovedad"));
		}
		
		
		this.jComboBoxTiposRelacionesNovedad.addActionListener (new ButtonActionListener(this,"TiposRelacionesNovedad"));
			
		this.jComboBoxTiposAccionesNovedad.addActionListener (new ButtonActionListener(this,"TiposAccionesNovedad"));
					
		this.jComboBoxTiposSeleccionarNovedad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNovedad"));
			
		this.jTextFieldValorCampoGeneralNovedad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNovedad"));		
		
		
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonidNovedadBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_empresaNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_empresaNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_sucursalNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_sucursalNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_usuarioNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_usuarioNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioNovedadBusqueda"));
		//jButtonid_clienteNovedad.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteNovedadActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormNovedad.jButtonid_clienteNovedad.addActionListener(new ButtonActionListener(this,"id_clienteNovedad"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_clienteNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_clienteNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_clienteNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtondescripcionNovedadBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonaccion_tomadaNovedadBusqueda.addActionListener(new ButtonActionListener(this,"accion_tomadaNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonfeha_atencionNovedadBusqueda.addActionListener(new ButtonActionListener(this,"feha_atencionNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonhora_atencionNovedadBusqueda.addActionListener(new ButtonActionListener(this,"hora_atencionNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_empleadoNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_empleadoNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonemailNovedadBusqueda.addActionListener(new ButtonActionListener(this,"emailNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonesta_activoNovedadBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoNovedadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteNovedad.addActionListener(new ButtonActionListener(this,"FK_IdClienteNovedad"));

			this.jButtonBuscarFK_IdClienteid_clienteNovedad.addActionListener(new ButtonActionListener(this,"id_clienteNovedad"));

			this.jButtonFK_IdEmpleadoNovedad.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoNovedad"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNovedad!=null) {
				this.jInternalFrameReporteDinamicoNovedad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedad"));
				this.jInternalFrameReporteDinamicoNovedad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedad"));
				this.jInternalFrameReporteDinamicoNovedad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedad"));
			}
			
			//this.jButtonCerrarReporteDinamicoNovedad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNovedad"));				
			//this.jButtonGenerarReporteDinamicoNovedad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNovedad"));
			//this.jButtonGenerarExcelReporteDinamicoNovedad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNovedad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNovedad!=null) {
				this.jInternalFrameImportacionNovedad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNovedad"));
				this.jInternalFrameImportacionNovedad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNovedad"));
				this.jInternalFrameImportacionNovedad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNovedad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNovedad.addActionListener (new ButtonActionListener(this,"AbrirOrderByNovedad"));
			
			this.jButtonAbrirOrderByToolBarNovedad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNovedad"));			
			
			if(this.jInternalFrameOrderByNovedad!=null) {
				this.jInternalFrameOrderByNovedad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNovedad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNovedad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNovedad.jTabbedPaneRelacionesNovedad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNovedad"));
		
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
            		closingInternalFrameNovedad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNovedad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNovedad = (JInternalFrameBase)event.getSource();
	            	
	            NovedadBeanSwingJInternalFrame jInternalFrameParent=(NovedadBeanSwingJInternalFrame)jInternalFrameDetalleFormNovedad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNovedadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNovedad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNovedadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNovedad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNovedad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNovedad";
		inputMap = this.jButtonNuevoNovedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNovedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNovedadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNovedadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNovedad";
		inputMap = this.jButtonNuevoRelacionesNovedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNovedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNovedadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNovedad";
		inputMap = this.jButtonModificarNovedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNovedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNovedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNovedad";
		inputMap = this.jButtonActualizarNovedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNovedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNovedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNovedad";
		inputMap = this.jButtonEliminarNovedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNovedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNovedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNovedad";
		inputMap = this.jButtonCancelarNovedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNovedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNovedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNovedad";
		inputMap = this.jButtonCerrarNovedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNovedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNovedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNovedad";
		inputMap = this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosNovedad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNovedad.jButtonGuardarCambiosNovedad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNovedadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNovedad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNovedadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNovedad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNovedadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNovedad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNovedadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNovedad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNovedadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonidNovedadBusqueda.addActionListener(new ButtonActionListener(this,"idNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_empresaNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_empresaNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_sucursalNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_sucursalNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_usuarioNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_usuarioNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioNovedadBusqueda"));
		//jButtonid_clienteNovedad.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteNovedadActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormNovedad.jButtonid_clienteNovedad.addActionListener(new ButtonActionListener(this,"id_clienteNovedad"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_clienteNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_clienteNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_clienteNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtondescripcionNovedadBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonaccion_tomadaNovedadBusqueda.addActionListener(new ButtonActionListener(this,"accion_tomadaNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonfeha_atencionNovedadBusqueda.addActionListener(new ButtonActionListener(this,"feha_atencionNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonhora_atencionNovedadBusqueda.addActionListener(new ButtonActionListener(this,"hora_atencionNovedadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNovedad.jButtonid_empleadoNovedadUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonid_empleadoNovedadBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonemailNovedadBusqueda.addActionListener(new ButtonActionListener(this,"emailNovedadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNovedad.jButtonesta_activoNovedadBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoNovedadBusqueda"));
		
		
		this.jButtonFK_IdClienteNovedad.addActionListener(new ButtonActionListener(this,"FK_IdClienteNovedad"));

		this.jButtonBuscarFK_IdClienteid_clienteNovedad.addActionListener(new ButtonActionListener(this,"id_clienteNovedad"));

		this.jButtonFK_IdEmpleadoNovedad.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoNovedad"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNovedad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNovedadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNovedadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNovedad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNovedad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Novedad novedadAux:this.novedadLogic.getNovedads()) {
					novedadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Novedad novedadAux:novedads) {
					novedadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNovedadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNovedad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Novedad novedadAux:this.novedadLogic.getNovedads()) {
						novedadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Novedad novedadAux:novedads) {
						novedadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Novedad novedadAux:this.novedadLogic.getNovedads()) {
					
						if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							novedadAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Novedad novedadAux:novedads) {
						
						if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							novedadAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNovedad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNovedad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNovedad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNovedad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNovedadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNovedad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNovedad.getSelectedRows();
			
			Novedad novedadLocal=new Novedad();
			
			//this.seleccionarTodosNovedad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					novedadLocal =(Novedad) this.novedadLogic.getNovedads().toArray()[this.jTableDatosNovedad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					novedadLocal =(Novedad) this.novedads.toArray()[this.jTableDatosNovedad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				novedadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Novedad novedadAux:this.novedadLogic.getNovedads()) {
						novedadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Novedad novedadAux:novedads) {
						novedadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNovedad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNovedad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNovedad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNovedad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNovedadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNovedadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNovedadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNovedad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNovedad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Novedad novedadAux:this.novedadLogic.getNovedads()) {
				
						if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							novedadAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_ACCIONTOMADA)) {
							existe=true;
							novedadAux.setaccion_tomada(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_FEHAATENCION)) {
							existe=true;
							novedadAux.setfeha_atencion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_HORAATENCION)) {
							existe=true;
							novedadAux.sethora_atencion(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							novedadAux.setemail(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Novedad novedadAux:novedads) {
					
						if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							novedadAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_ACCIONTOMADA)) {
							existe=true;
							novedadAux.setaccion_tomada(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_FEHAATENCION)) {
							existe=true;
							novedadAux.setfeha_atencion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_HORAATENCION)) {
							existe=true;
							novedadAux.sethora_atencion(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							novedadAux.setemail(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNovedad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNovedadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNovedad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNovedad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNovedad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNovedad) {				
					conSplash=true;//false;										
					
					//this.startProcessNovedad(conSplash);
				
					this.generarReporteNovedadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNovedadsSeleccionados();
				//this.jComboBoxTiposAccionesNovedad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNovedadsSeleccionados(false);
				//this.jComboBoxTiposAccionesNovedad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNovedadsSeleccionados(true);
				//this.jComboBoxTiposAccionesNovedad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNovedad();
				
				this.exportarNovedadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNovedads();
				//this.importarNovedads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNovedad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNovedadsSeleccionados();
				//this.jComboBoxTiposAccionesNovedad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNovedad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNovedad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNovedad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Novedad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNovedad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.setSelectedIndex(0);					
				}	
			} 			
			else if(NovedadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNovedad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNovedad(conSplash);
					
						//this.actualizarParametrosGeneralNovedad();
						
						this.generarReporteProcesoAccionNovedadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNovedad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NovedadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO NovedadES SELECCIONADOS?", "MANTENIMIENTO DE Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNovedad();
				
						this.actualizarParametrosGeneralNovedad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.novedadReturnGeneral=novedadLogic.procesarAccionNovedadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.novedadLogic.getNovedads(),this.novedadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNovedadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNovedad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNovedad();
					
					NovedadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNovedadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNovedad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNovedad.jComboBoxTiposAccionesFormularioNovedad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNovedad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNovedadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNovedad();
			
			if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();		
			Novedad novedad=new Novedad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNovedad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNovedad.getSelectedItem();
			
			
			
			
			novedadsSeleccionados=this.getNovedadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(novedadsSeleccionados.size()==1) {
				for(Novedad novedadAux:novedadsSeleccionados) {
					novedad=novedadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNovedad();
			
      		//this.finishProcessNovedad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNovedadReturnGeneral() throws Exception {
		if(this.novedadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.novedadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.novedadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.novedadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.novedadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.novedadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNovedad(false);
		}
		
		if(this.novedadReturnGeneral.getConRetornoLista() || this.novedadReturnGeneral.getConRetornoObjeto()) {
			if(this.novedadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.novedadLogic.setNovedads(this.novedadReturnGeneral.getNovedads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.novedadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.novedadLogic.setNovedad(this.novedadReturnGeneral.getNovedad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingNovedad(false);
		}
	}
	
	public void actualizarParametrosGeneralNovedad() throws Exception {
		
		
	}
	
	public ArrayList<Novedad> getNovedadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNovedad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Novedad novedadAux:novedadLogic.getNovedads()) {
					if(novedadAux.getIsSelected()) {
						novedadsSeleccionados.add(novedadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Novedad novedadAux:this.novedads) {
					if(novedadAux.getIsSelected()) {
						novedadsSeleccionados.add(novedadAux);				
					}
				}
			}
			
			if(novedadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						novedadsSeleccionados.addAll(this.novedadLogic.getNovedads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						novedadsSeleccionados.addAll(this.novedads);				
					}
				}
			}
		} else {
			novedadsSeleccionados.add(this.novedad);
		}
		
		return novedadsSeleccionados;
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
	
	public void generarReporteNovedadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNovedadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNovedadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNovedadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNovedadsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Novedad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNovedadsSeleccionados() throws Exception {
		ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();		
		
		novedadsSeleccionados=this.getNovedadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNovedads("Todos",novedadsSeleccionados);
		
	}	
	
	public void generarReporteNormalNovedadsSeleccionados() throws Exception {
		ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();		
		
		novedadsSeleccionados=this.getNovedadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNovedads("Todos",novedadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNovedadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();
		
		novedadsSeleccionados=this.getNovedadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNovedads("Todos",novedadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNovedadsSeleccionados() throws Exception {
		ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNovedad();
		
		
		novedadsSeleccionados=this.getNovedadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNovedad();
		
		
		//this.generarReporteNovedads("Todos",novedadsSeleccionados ,novedadImplementable,novedadImplementableHome);
	}
	
	public void mostrarImportacionNovedads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNovedad();
		
		this.abrirFrameImportacionNovedad();		
		
			
		//this.generarReporteNovedads("Todos",novedadsSeleccionados ,novedadImplementable,novedadImplementableHome);
	}
	
	public void importarNovedads() throws Exception {		
	
	}
	
	public void exportarNovedadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNovedadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNovedadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNovedadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Novedad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNovedadsSeleccionados() throws Exception {
		ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();		
		
		novedadsSeleccionados=this.getNovedadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNovedad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Novedad novedadAux:novedadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNovedad(novedadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//novedadAux.setsDetalleGeneralEntityReporte(novedadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNovedad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_ACCIONTOMADA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_FEHAATENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_HORAATENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NovedadConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNovedad(Novedad novedad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=novedad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.getaccion_tomada();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.getfeha_atencion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.gethora_atencion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.getemail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=novedad.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNovedadsSeleccionados() throws Exception {
		ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();		
		
		novedadsSeleccionados=this.getNovedadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Novedads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNovedad(row);				
				iRow++;
			}				
			
			for(Novedad novedadAux:novedadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNovedad(novedadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNovedadsSeleccionados() throws Exception {
		ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();		
		
		novedadsSeleccionados=this.getNovedadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"novedad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("novedads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("novedad");
			//elementRoot.appendChild(element);
		
			for(Novedad novedadAux:novedadsSeleccionados) {
				element = document.createElement("novedad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNovedad(novedadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.novedadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNovedad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_ACCIONTOMADA);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_FEHAATENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_HORAATENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(NovedadConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNovedad(Novedad novedad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.getaccion_tomada());
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.getfeha_atencion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.gethora_atencion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.getemail());
		cell = row.createCell(iColumn++);cell.setCellValue(novedad.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlNovedad(Novedad novedad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NovedadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(novedad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NovedadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(novedad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(NovedadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(novedad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(NovedadConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(novedad.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(NovedadConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(novedad.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementcliente_descripcion = document.createElement(NovedadConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(novedad.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementdescripcion = document.createElement(NovedadConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(novedad.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementaccion_tomada = document.createElement(NovedadConstantesFunciones.ACCIONTOMADA);
		elementaccion_tomada.appendChild(document.createTextNode(novedad.getaccion_tomada().trim()));
		element.appendChild(elementaccion_tomada);

		Element elementfeha_atencion = document.createElement(NovedadConstantesFunciones.FEHAATENCION);
		elementfeha_atencion.appendChild(document.createTextNode(novedad.getfeha_atencion().toString().trim()));
		element.appendChild(elementfeha_atencion);

		Element elementhora_atencion = document.createElement(NovedadConstantesFunciones.HORAATENCION);
		elementhora_atencion.appendChild(document.createTextNode(novedad.gethora_atencion().toString().trim()));
		element.appendChild(elementhora_atencion);

		Element elementempleado_descripcion = document.createElement(NovedadConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(novedad.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementemail = document.createElement(NovedadConstantesFunciones.EMAIL);
		elementemail.appendChild(document.createTextNode(novedad.getemail().trim()));
		element.appendChild(elementemail);

		Element elementesta_activo = document.createElement(NovedadConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(novedad.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoNovedadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Novedad> novedadsSeleccionados=new ArrayList<Novedad>();
		
		novedadsSeleccionados=this.getNovedadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNovedad(novedadsSeleccionados);
		
		this.generarReporteNovedads("Todos",novedadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNovedad(ArrayList<Novedad> novedadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Novedad novedadAux:novedadsSeleccionados) {
				novedadAux.setsDetalleGeneralEntityReporte(novedadAux.toString());
			
				if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					novedadAux.setsDescripcionGeneralEntityReporte1(novedadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					novedadAux.setsDescripcionGeneralEntityReporte1(novedadAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					novedadAux.setsDescripcionGeneralEntityReporte1(novedadAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					novedadAux.setsDescripcionGeneralEntityReporte1(novedadAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					novedadAux.setsDescripcionGeneralEntityReporte1(novedadAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_ACCIONTOMADA)) {
					existe=true;
					novedadAux.setsDescripcionGeneralEntityReporte1(novedadAux.getaccion_tomada());
				}
				 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_FEHAATENCION)) {
					existe=true;
					novedadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(novedadAux.getfeha_atencion()));
				}
				 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_HORAATENCION)) {
					existe=true;
					novedadAux.setsDescripcionGeneralEntityReporte1(novedadAux.gethora_atencion().toString());
				}
				 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					novedadAux.setsDescripcionGeneralEntityReporte1(novedadAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					novedadAux.setsDescripcionGeneralEntityReporte1(novedadAux.getemail());
				}
				 else if(sTipoSeleccionar.equals(NovedadConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					novedadAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(novedadAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NovedadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNovedad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNovedad=true;
				this.isVisibilidadCeldaNuevoRelacionesNovedad=true;
				this.isVisibilidadCeldaGuardarCambiosNovedad=true;
			}
			
			this.isVisibilidadCeldaModificarNovedad=false;
			this.isVisibilidadCeldaActualizarNovedad=false;
			this.isVisibilidadCeldaEliminarNovedad=false;
			this.isVisibilidadCeldaCancelarNovedad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedad=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNovedad=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedad=false;
			this.isVisibilidadCeldaGuardarCambiosNovedad=false;
			this.isVisibilidadCeldaModificarNovedad=false;
			this.isVisibilidadCeldaActualizarNovedad=true;
			this.isVisibilidadCeldaEliminarNovedad=false;
			this.isVisibilidadCeldaCancelarNovedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedad=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNovedad=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedad=false;
			this.isVisibilidadCeldaGuardarCambiosNovedad=false;
			this.isVisibilidadCeldaModificarNovedad=false;
			this.isVisibilidadCeldaActualizarNovedad=true;
			this.isVisibilidadCeldaEliminarNovedad=true;
			this.isVisibilidadCeldaCancelarNovedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedad=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNovedad=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedad=false;
			this.isVisibilidadCeldaGuardarCambiosNovedad=false;
			this.isVisibilidadCeldaModificarNovedad=false;
			this.isVisibilidadCeldaActualizarNovedad=true;
			this.isVisibilidadCeldaEliminarNovedad=false;
			this.isVisibilidadCeldaCancelarNovedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedad=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNovedad=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedad=true;
			this.isVisibilidadCeldaGuardarCambiosNovedad=true;
			this.isVisibilidadCeldaModificarNovedad=false;
			this.isVisibilidadCeldaActualizarNovedad=false;
			this.isVisibilidadCeldaEliminarNovedad=false;
			this.isVisibilidadCeldaCancelarNovedad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedad=true;
				} else {
					this.isVisibilidadCeldaGuardarNovedad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNovedad=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedad=false;
			this.isVisibilidadCeldaGuardarCambiosNovedad=false;
			this.isVisibilidadCeldaActualizarNovedad=false;
			this.isVisibilidadCeldaEliminarNovedad=false;
			this.isVisibilidadCeldaCancelarNovedad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedad=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNovedad=false;
			this.isVisibilidadCeldaNuevoRelacionesNovedad=false;
			this.isVisibilidadCeldaGuardarCambiosNovedad=false;
			this.isVisibilidadCeldaModificarNovedad=true;
			this.isVisibilidadCeldaActualizarNovedad=false;
			this.isVisibilidadCeldaEliminarNovedad=false;
			this.isVisibilidadCeldaCancelarNovedad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNovedad=false;
				} else {
					this.isVisibilidadCeldaGuardarNovedad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NovedadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNovedad=true;
			this.isVisibilidadCeldaNuevoRelacionesNovedad=true;
			this.isVisibilidadCeldaGuardarCambiosNovedad=true;
		} else {
			this.actualizarEstadoPanelsNovedad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNovedad=false;
			//this.isVisibilidadCeldaVerFormNovedad=false;
			this.isVisibilidadCeldaDuplicarNovedad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!novedadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNovedad=false;
		} else {
			this.isVisibilidadCeldaNuevoNovedad=false;
			this.isVisibilidadCeldaGuardarCambiosNovedad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(novedadSessionBean.getEsGuardarRelacionado()) {
			if(!novedadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNovedad=false;												
			}
			
			this.jButtonCerrarNovedad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNovedad=false;
		}
		
		if(!this.permiteMantenimiento(this.novedad)) {
			this.isVisibilidadCeldaActualizarNovedad=false;
			this.isVisibilidadCeldaEliminarNovedad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNovedad() {
	}
	
	public void actualizarEstadoPanelsNovedad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNovedad!=null) {
				this.jScrollPanelDatosEdicionNovedad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedad!=null) {
				this.jTabbedPaneBusquedasNovedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedad!=null) {
				this.jScrollPanelDatosNovedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedad!=null) {
				this.jPanelPaginacionNovedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedad!=null) {
				this.jPanelParametrosReportesNovedad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNovedad!=null) {
				this.jScrollPanelDatosEdicionNovedad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedad!=null) {
				this.jTabbedPaneBusquedasNovedad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosNovedad!=null) {
				this.jScrollPanelDatosNovedad.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedad!=null) {
				this.jPanelPaginacionNovedad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedad!=null) {
				this.jPanelParametrosReportesNovedad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNovedad!=null) {
				this.jScrollPanelDatosEdicionNovedad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedad!=null) {
				this.jTabbedPaneBusquedasNovedad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNovedad!=null) {
				this.jScrollPanelDatosNovedad.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedad!=null) {
				this.jPanelPaginacionNovedad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedad!=null) {
				this.jPanelParametrosReportesNovedad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNovedad!=null) {
				this.jScrollPanelDatosEdicionNovedad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedad!=null) {
				this.jTabbedPaneBusquedasNovedad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNovedad!=null) {
				this.jScrollPanelDatosNovedad.setVisible(false);
			}
			
			if(this.jPanelPaginacionNovedad!=null) {
				this.jPanelPaginacionNovedad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNovedad!=null) {
				this.jPanelParametrosReportesNovedad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNovedad!=null) {
				this.jScrollPanelDatosEdicionNovedad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedad!=null) {
				this.jTabbedPaneBusquedasNovedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedad!=null) {
				this.jScrollPanelDatosNovedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedad!=null) {
				this.jPanelPaginacionNovedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedad!=null) {
				this.jPanelParametrosReportesNovedad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNovedad!=null) {
				this.jScrollPanelDatosEdicionNovedad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedad!=null) {
				this.jTabbedPaneBusquedasNovedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedad!=null) {
				this.jScrollPanelDatosNovedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedad!=null) {
				this.jPanelPaginacionNovedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedad!=null) {
				this.jPanelParametrosReportesNovedad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNovedad!=null) {
				this.jScrollPanelDatosEdicionNovedad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedad!=null) {
				this.jTabbedPaneBusquedasNovedad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNovedad!=null) {
				this.jScrollPanelDatosNovedad.setVisible(true);
			}
			
			if(this.jPanelPaginacionNovedad!=null) {
				this.jPanelPaginacionNovedad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNovedad!=null) {
				this.jPanelParametrosReportesNovedad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.novedadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasNovedad!=null) {
					this.jTabbedPaneBusquedasNovedad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesNovedad!=null) {
				this.jPanelParametrosReportesNovedad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.novedadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNovedad!=null) {
				this.jTabbedPaneBusquedasNovedad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesNovedad!=null) {
				this.jPanelParametrosReportesNovedad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasNovedad.remove(jPanelFK_IdClienteNovedad);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasNovedad.remove(jPanelFK_IdEmpleadoNovedad);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasNovedad.remove(jPanelFK_IdClienteNovedad);}

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasNovedad.remove(jPanelFK_IdEmpleadoNovedad);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdCliente=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasNovedad.remove(jPanelFK_IdClienteNovedad);}

			this.isVisibilidadFK_IdEmpleado=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasNovedad.remove(jPanelFK_IdEmpleadoNovedad);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasNovedad.remove(jPanelFK_IdClienteNovedad);}

			this.isVisibilidadFK_IdEmpleado=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasNovedad.remove(jPanelFK_IdEmpleadoNovedad);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdCliente=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasNovedad.remove(jPanelFK_IdClienteNovedad);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasNovedad.remove(jPanelFK_IdEmpleadoNovedad);}
		}
		
	}
	
	
	
	

	public String registrarSesionNovedadParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(novedadSessionBean==null) {
				novedadSessionBean=new NovedadSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(novedadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.novedadFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(NovedadConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionNovedad(true);
			//clienteSessionBean.setlidNovedadActual(this.idNovedadActual);

			novedadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNovedad(true);
			novedadSessionBean.setlIdNovedadActualForeignKey(this.idNovedadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//NovedadSessionBean novedadSessionBean=new NovedadSessionBean();
		
		if(this.novedadSessionBean==null) {
			this.novedadSessionBean=new NovedadSessionBean();
		}
		
		this.novedadSessionBean.setsUltimaBusquedaNovedad(this.getsAccionBusqueda());
		this.novedadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.novedadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			novedadSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			novedadSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			novedadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			novedadSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			novedadSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//NovedadSessionBean novedadSessionBean=new NovedadSessionBean();
		
		if(this.novedadSessionBean==null) {
			this.novedadSessionBean=new NovedadSessionBean();
		}
		
		if(this.novedadSessionBean.getsUltimaBusquedaNovedad()!=null&&!this.novedadSessionBean.getsUltimaBusquedaNovedad().equals("")) {
			this.setsAccionBusqueda(novedadSessionBean.getsUltimaBusquedaNovedad());
			this.setiNumeroPaginacion(novedadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(novedadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(novedadSessionBean.getid_cliente());
				novedadSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(novedadSessionBean.getid_empleado());
				novedadSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(novedadSessionBean.getid_empresa());
				novedadSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(novedadSessionBean.getid_sucursal());
				novedadSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(novedadSessionBean.getid_usuario());
				novedadSessionBean.setid_usuario(-1L);
			}
		}
		
		this.novedadSessionBean.setsUltimaBusquedaNovedad("");
		this.novedadSessionBean.setiNumeroPaginacion(NovedadConstantesFunciones.INUMEROPAGINACION);
		this.novedadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNovedad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNovedad() {
		this.updateBorderResaltarBusquedasFormularioNovedad();
		this.updateVisibilidadBusquedasFormularioNovedad();
		this.updateHabilitarBusquedasFormularioNovedad();
	}
	
	public void updateBorderResaltarBusquedasFormularioNovedad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasNovedad.getComponents().length>0) {
	

		if(this.novedadConstantesFunciones.resaltarFK_IdClienteNovedad!=null) {
			index= this.jTabbedPaneBusquedasNovedad.indexOfComponent(this.jPanelFK_IdClienteNovedad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedad.getComponent(index);
				jPanel.setBorder(this.novedadConstantesFunciones.resaltarFK_IdClienteNovedad);
			}
		}

		if(this.novedadConstantesFunciones.resaltarFK_IdEmpleadoNovedad!=null) {
			index= this.jTabbedPaneBusquedasNovedad.indexOfComponent(this.jPanelFK_IdEmpleadoNovedad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedad.getComponent(index);
				jPanel.setBorder(this.novedadConstantesFunciones.resaltarFK_IdEmpleadoNovedad);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioNovedad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasNovedad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNovedad.indexOfComponent(this.jPanelFK_IdClienteNovedad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNovedad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.novedadConstantesFunciones.mostrarFK_IdClienteNovedad);
			if(!this.novedadConstantesFunciones.mostrarFK_IdClienteNovedad && index>-1) {
				this.jTabbedPaneBusquedasNovedad.remove(index);
			}

			index= this.jTabbedPaneBusquedasNovedad.indexOfComponent(this.jPanelFK_IdEmpleadoNovedad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNovedad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.novedadConstantesFunciones.mostrarFK_IdEmpleadoNovedad);
			if(!this.novedadConstantesFunciones.mostrarFK_IdEmpleadoNovedad && index>-1) {
				this.jTabbedPaneBusquedasNovedad.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioNovedad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasNovedad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNovedad.indexOfComponent(this.jPanelFK_IdClienteNovedad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNovedad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.novedadConstantesFunciones.activarFK_IdClienteNovedad);
				this.jTabbedPaneBusquedasNovedad.setEnabledAt(index,this.novedadConstantesFunciones.activarFK_IdClienteNovedad);
			}

			index= this.jTabbedPaneBusquedasNovedad.indexOfComponent(this.jPanelFK_IdEmpleadoNovedad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNovedad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.novedadConstantesFunciones.activarFK_IdEmpleadoNovedad);
				this.jTabbedPaneBusquedasNovedad.setEnabledAt(index,this.novedadConstantesFunciones.activarFK_IdEmpleadoNovedad);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaNovedad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasNovedad.indexOfComponent(this.jPanelFK_IdClienteNovedad);

			this.jTabbedPaneBusquedasNovedad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedad.getComponent(index);

			this.novedadConstantesFunciones.setResaltarFK_IdClienteNovedad(resaltar);

			jPanel.setBorder(this.novedadConstantesFunciones.resaltarFK_IdClienteNovedad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasNovedad.indexOfComponent(this.jPanelFK_IdEmpleadoNovedad);

			this.jTabbedPaneBusquedasNovedad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNovedad.getComponent(index);

			this.novedadConstantesFunciones.setResaltarFK_IdEmpleadoNovedad(resaltar);

			jPanel.setBorder(this.novedadConstantesFunciones.resaltarFK_IdEmpleadoNovedad);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarNovedad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioNovedad() throws Exception {

		if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNovedad();
		this.updateVisibilidadResaltarControlesFormularioNovedad();
		this.updateHabilitarResaltarControlesFormularioNovedad();
		
	}
	
	public void updateBorderResaltarControlesFormularioNovedad() throws Exception {
		if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.novedadConstantesFunciones.resaltaridNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jLabelidNovedad.setBorder(this.novedadConstantesFunciones.resaltaridNovedad);}
		if(this.novedadConstantesFunciones.resaltarid_empresaNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.setBorder(this.novedadConstantesFunciones.resaltarid_empresaNovedad);}
		if(this.novedadConstantesFunciones.resaltarid_sucursalNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.setBorder(this.novedadConstantesFunciones.resaltarid_sucursalNovedad);}
		if(this.novedadConstantesFunciones.resaltarid_usuarioNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.setBorder(this.novedadConstantesFunciones.resaltarid_usuarioNovedad);}
		if(this.novedadConstantesFunciones.resaltarid_clienteNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.setBorder(this.novedadConstantesFunciones.resaltarid_clienteNovedad);}
		if(this.novedadConstantesFunciones.resaltardescripcionNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jTextAreadescripcionNovedad.setBorder(this.novedadConstantesFunciones.resaltardescripcionNovedad);}
		if(this.novedadConstantesFunciones.resaltaraccion_tomadaNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jTextAreaaccion_tomadaNovedad.setBorder(this.novedadConstantesFunciones.resaltaraccion_tomadaNovedad);}
		if(this.novedadConstantesFunciones.resaltarfeha_atencionNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jDateChooserfeha_atencionNovedad.setBorder(this.novedadConstantesFunciones.resaltarfeha_atencionNovedad);}
		if(this.novedadConstantesFunciones.resaltarhora_atencionNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jSpinnerhora_atencionNovedad.setBorder(this.novedadConstantesFunciones.resaltarhora_atencionNovedad);}
		if(this.novedadConstantesFunciones.resaltarid_empleadoNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.setBorder(this.novedadConstantesFunciones.resaltarid_empleadoNovedad);}
		if(this.novedadConstantesFunciones.resaltaremailNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jTextFieldemailNovedad.setBorder(this.novedadConstantesFunciones.resaltaremailNovedad);}
		if(this.novedadConstantesFunciones.resaltaresta_activoNovedad!=null && this.jInternalFrameDetalleFormNovedad!=null) {this.jInternalFrameDetalleFormNovedad.jCheckBoxesta_activoNovedad.setBorderPainted(true);this.jInternalFrameDetalleFormNovedad.jCheckBoxesta_activoNovedad.setBorder(this.novedadConstantesFunciones.resaltaresta_activoNovedad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNovedad() throws Exception {		
		if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNovedad!=null) {
	
		//this.jInternalFrameDetalleFormNovedad.jLabelidNovedad.setVisible(this.novedadConstantesFunciones.mostraridNovedad);
		this.jInternalFrameDetalleFormNovedad.jPanelidNovedad.setVisible(this.novedadConstantesFunciones.mostraridNovedad);
		//this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.setVisible(this.novedadConstantesFunciones.mostrarid_empresaNovedad);
		this.jInternalFrameDetalleFormNovedad.jPanelid_empresaNovedad.setVisible(this.novedadConstantesFunciones.mostrarid_empresaNovedad);
		//this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.setVisible(this.novedadConstantesFunciones.mostrarid_sucursalNovedad);
		this.jInternalFrameDetalleFormNovedad.jPanelid_sucursalNovedad.setVisible(this.novedadConstantesFunciones.mostrarid_sucursalNovedad);
		//this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.setVisible(this.novedadConstantesFunciones.mostrarid_usuarioNovedad);
		this.jInternalFrameDetalleFormNovedad.jPanelid_usuarioNovedad.setVisible(this.novedadConstantesFunciones.mostrarid_usuarioNovedad);
		//this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.setVisible(this.novedadConstantesFunciones.mostrarid_clienteNovedad);
		this.jInternalFrameDetalleFormNovedad.jPanelid_clienteNovedad.setVisible(this.novedadConstantesFunciones.mostrarid_clienteNovedad);
			this.jInternalFrameDetalleFormNovedad.jButtonid_clienteNovedad.setVisible(this.novedadConstantesFunciones.mostrarid_clienteNovedad);
		//this.jInternalFrameDetalleFormNovedad.jTextAreadescripcionNovedad.setVisible(this.novedadConstantesFunciones.mostrardescripcionNovedad);
		this.jInternalFrameDetalleFormNovedad.jPaneldescripcionNovedad.setVisible(this.novedadConstantesFunciones.mostrardescripcionNovedad);
		//this.jInternalFrameDetalleFormNovedad.jTextAreaaccion_tomadaNovedad.setVisible(this.novedadConstantesFunciones.mostraraccion_tomadaNovedad);
		this.jInternalFrameDetalleFormNovedad.jPanelaccion_tomadaNovedad.setVisible(this.novedadConstantesFunciones.mostraraccion_tomadaNovedad);
		//this.jInternalFrameDetalleFormNovedad.jDateChooserfeha_atencionNovedad.setVisible(this.novedadConstantesFunciones.mostrarfeha_atencionNovedad);
		this.jInternalFrameDetalleFormNovedad.jPanelfeha_atencionNovedad.setVisible(this.novedadConstantesFunciones.mostrarfeha_atencionNovedad);
		//this.jInternalFrameDetalleFormNovedad.jSpinnerhora_atencionNovedad.setVisible(this.novedadConstantesFunciones.mostrarhora_atencionNovedad);
		this.jInternalFrameDetalleFormNovedad.jPanelhora_atencionNovedad.setVisible(this.novedadConstantesFunciones.mostrarhora_atencionNovedad);
		//this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.setVisible(this.novedadConstantesFunciones.mostrarid_empleadoNovedad);
		this.jInternalFrameDetalleFormNovedad.jPanelid_empleadoNovedad.setVisible(this.novedadConstantesFunciones.mostrarid_empleadoNovedad);
		//this.jInternalFrameDetalleFormNovedad.jTextFieldemailNovedad.setVisible(this.novedadConstantesFunciones.mostraremailNovedad);
		this.jInternalFrameDetalleFormNovedad.jPanelemailNovedad.setVisible(this.novedadConstantesFunciones.mostraremailNovedad);
		//this.jInternalFrameDetalleFormNovedad.jCheckBoxesta_activoNovedad.setVisible(this.novedadConstantesFunciones.mostraresta_activoNovedad);
		this.jInternalFrameDetalleFormNovedad.jPanelesta_activoNovedad.setVisible(this.novedadConstantesFunciones.mostraresta_activoNovedad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNovedad() throws Exception {
		if(this.jInternalFrameDetalleFormNovedad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNovedad!=null) {
	
		this.jInternalFrameDetalleFormNovedad.jLabelidNovedad.setEnabled(this.novedadConstantesFunciones.activaridNovedad);
		this.jInternalFrameDetalleFormNovedad.jComboBoxid_empresaNovedad.setEnabled(this.novedadConstantesFunciones.activarid_empresaNovedad);
		this.jInternalFrameDetalleFormNovedad.jComboBoxid_sucursalNovedad.setEnabled(this.novedadConstantesFunciones.activarid_sucursalNovedad);
		this.jInternalFrameDetalleFormNovedad.jComboBoxid_usuarioNovedad.setEnabled(this.novedadConstantesFunciones.activarid_usuarioNovedad);
		this.jInternalFrameDetalleFormNovedad.jComboBoxid_clienteNovedad.setEnabled(this.novedadConstantesFunciones.activarid_clienteNovedad);
			this.jInternalFrameDetalleFormNovedad.jButtonid_clienteNovedad.setEnabled(this.novedadConstantesFunciones.activarid_clienteNovedad);
		this.jInternalFrameDetalleFormNovedad.jTextAreadescripcionNovedad.setEnabled(this.novedadConstantesFunciones.activardescripcionNovedad);
		this.jInternalFrameDetalleFormNovedad.jTextAreaaccion_tomadaNovedad.setEnabled(this.novedadConstantesFunciones.activaraccion_tomadaNovedad);
		this.jInternalFrameDetalleFormNovedad.jDateChooserfeha_atencionNovedad.setEnabled(this.novedadConstantesFunciones.activarfeha_atencionNovedad);
		this.jInternalFrameDetalleFormNovedad.jSpinnerhora_atencionNovedad.setEnabled(this.novedadConstantesFunciones.activarhora_atencionNovedad);
		this.jInternalFrameDetalleFormNovedad.jComboBoxid_empleadoNovedad.setEnabled(this.novedadConstantesFunciones.activarid_empleadoNovedad);
		this.jInternalFrameDetalleFormNovedad.jTextFieldemailNovedad.setEnabled(this.novedadConstantesFunciones.activaremailNovedad);
		this.jInternalFrameDetalleFormNovedad.jCheckBoxesta_activoNovedad.setEnabled(this.novedadConstantesFunciones.activaresta_activoNovedad);
		}
	}
	
		
}