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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.ResponsableFondoConstantesFunciones;
import com.bydan.erp.contabilidad.util.ResponsableFondoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.ResponsableFondoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.ResponsableFondoBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ResponsableFondoBeanSwingJInternalFrame extends ResponsableFondoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ResponsableFondoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ResponsableFondo> responsablefondoValidator = new ClassValidator<ResponsableFondo>(ResponsableFondo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ResponsableFondo responsablefondo;	
	public ResponsableFondo responsablefondoAux;
	public ResponsableFondo responsablefondoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ResponsableFondo responsablefondoTotales;
	public Long idResponsableFondoActual;
	public Long iIdNuevoResponsableFondo=0L;
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
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
	}
	
	

	public Boolean isTienePermisosFacturaProveedor=false;

	public Boolean getIsTienePermisosFacturaProveedor() {
		return isTienePermisosFacturaProveedor;
	}

	public void setIsTienePermisosFacturaProveedor(Boolean isTienePermisosFacturaProveedor) {
		this.isTienePermisosFacturaProveedor= isTienePermisosFacturaProveedor;
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
	
	public Boolean isPermisoTodoResponsableFondo;
	public Boolean isPermisoNuevoResponsableFondo;
	public Boolean isPermisoActualizarResponsableFondo;
	public Boolean isPermisoActualizarOriginalResponsableFondo;
	public Boolean isPermisoEliminarResponsableFondo;
	public Boolean isPermisoGuardarCambiosResponsableFondo;
	public Boolean isPermisoConsultaResponsableFondo;
	public Boolean isPermisoBusquedaResponsableFondo;
	public Boolean isPermisoReporteResponsableFondo;
	public Boolean isPermisoPaginacionMedioResponsableFondo;
	public Boolean isPermisoPaginacionAltoResponsableFondo;
	public Boolean isPermisoPaginacionTodoResponsableFondo;
	public Boolean isPermisoCopiarResponsableFondo;
	public Boolean isPermisoVerFormResponsableFondo;
	public Boolean isPermisoDuplicarResponsableFondo;
	public Boolean isPermisoOrdenResponsableFondo;
	
	
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
	
	public ResponsableFondoParameterReturnGeneral responsablefondoReturnGeneral;
	public ResponsableFondoParameterReturnGeneral responsablefondoParameterGeneral;
	
	

	public FacturaProveedorLogic facturaproveedorLogic=null;

	public FacturaProveedorLogic getFacturaProveedorLogic() {
		return facturaproveedorLogic;
	}

	public void setFacturaProveedorLogic(FacturaProveedorLogic facturaproveedorLogic) {
		this.facturaproveedorLogic = facturaproveedorLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoResponsableFondo=false;
	public Boolean esParaAccionDesdeFormularioResponsableFondo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ResponsableFondoSessionBeanAdditional responsablefondoSessionBeanAdditional=null;
	
	public ResponsableFondoSessionBeanAdditional getResponsableFondoSessionBeanAdditional() {
		return this.responsablefondoSessionBeanAdditional;
	}
	
	public void setResponsableFondoSessionBeanAdditional(ResponsableFondoSessionBeanAdditional responsablefondoSessionBeanAdditional) {
		try {
			this.responsablefondoSessionBeanAdditional=responsablefondoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ResponsableFondoBeanSwingJInternalFrameAdditional responsablefondoBeanSwingJInternalFrameAdditional=null;
	//public class ResponsableFondoBeanSwingJInternalFrame
	
	public ResponsableFondoBeanSwingJInternalFrameAdditional getResponsableFondoBeanSwingJInternalFrameAdditional() {
		return this.responsablefondoBeanSwingJInternalFrameAdditional;
	}
	
	public void setResponsableFondoBeanSwingJInternalFrameAdditional(ResponsableFondoBeanSwingJInternalFrameAdditional responsablefondoBeanSwingJInternalFrameAdditional) {
		try {
			this.responsablefondoBeanSwingJInternalFrameAdditional=responsablefondoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ResponsableFondoLogic responsablefondoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ResponsableFondo responsablefondoBean;
	public ResponsableFondoConstantesFunciones responsablefondoConstantesFunciones;
	//public ResponsableFondoParameterReturnGeneral responsablefondoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<ResponsableFondo> responsablefondos;	
	//public List<ResponsableFondo> responsablefondosEliminados;
	//public List<ResponsableFondo> responsablefondosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoResponsableFondo=false;
	public Boolean isVisibilidadCeldaDuplicarResponsableFondo=true;
	public Boolean isVisibilidadCeldaCopiarResponsableFondo=true;
	public Boolean isVisibilidadCeldaVerFormResponsableFondo=true;
	public Boolean isVisibilidadCeldaOrdenResponsableFondo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesResponsableFondo=false;
	public Boolean isVisibilidadCeldaModificarResponsableFondo=false;
	public Boolean isVisibilidadCeldaActualizarResponsableFondo=false;
	public Boolean isVisibilidadCeldaEliminarResponsableFondo=false;
	public Boolean isVisibilidadCeldaCancelarResponsableFondo=false;
	public Boolean isVisibilidadCeldaGuardarResponsableFondo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosResponsableFondo=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoResponsableFondo() {
		return this.iIdNuevoResponsableFondo;
	}

	public void setiIdNuevoResponsableFondo(Long iIdNuevoResponsableFondo) {
		this.iIdNuevoResponsableFondo = iIdNuevoResponsableFondo;
	}
	
	public Long getidResponsableFondoActual() {
		return this.idResponsableFondoActual;
	}

	public void setidResponsableFondoActual(Long idResponsableFondoActual) {
		this.idResponsableFondoActual = idResponsableFondoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ResponsableFondo getresponsablefondo() {
		return this.responsablefondo;
	}

	public void setresponsablefondo(ResponsableFondo responsablefondo) {
		this.responsablefondo = responsablefondo;
	}
	
	public ResponsableFondo getresponsablefondoAux() {
		return this.responsablefondoAux;
	}

	public void setresponsablefondoAux(ResponsableFondo responsablefondoAux) {
		this.responsablefondoAux = responsablefondoAux;
	}				
	
	public ResponsableFondo getresponsablefondoAnterior() {
		return this.responsablefondoAnterior;
	}

	public void setresponsablefondoAnterior(ResponsableFondo responsablefondoAnterior) {
		this.responsablefondoAnterior = responsablefondoAnterior;
	}	
	
	public ResponsableFondo getresponsablefondoTotales() {
		return this.responsablefondoTotales;
	}

	public void setresponsablefondoTotales(ResponsableFondo responsablefondoTotales) {
		this.responsablefondoTotales = responsablefondoTotales;
	}	
	
	public ResponsableFondo getresponsablefondoBean() {
		return this.responsablefondoBean;
	}

	public void setresponsablefondoBean(ResponsableFondo responsablefondoBean) {
		this.responsablefondoBean = responsablefondoBean;
	}	
	
	public ResponsableFondoParameterReturnGeneral getresponsablefondoReturnGeneral() {
		return this.responsablefondoReturnGeneral;
	}

	public void setresponsablefondoReturnGeneral(ResponsableFondoParameterReturnGeneral responsablefondoReturnGeneral) {
		this.responsablefondoReturnGeneral = responsablefondoReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ResponsableFondoLogic getResponsableFondoLogic()	{		
		return responsablefondoLogic;
	}

	public void setResponsableFondoLogic(ResponsableFondoLogic responsablefondoLogic) {
		this.responsablefondoLogic = responsablefondoLogic;
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
	
	public Boolean getIsEsNuevoResponsableFondo() {
		return isEsNuevoResponsableFondo;
	}

	public void setIsEsNuevoResponsableFondo(Boolean isEsNuevoResponsableFondo) {
		this.isEsNuevoResponsableFondo = isEsNuevoResponsableFondo;
	}

	public Boolean getEsParaAccionDesdeFormularioResponsableFondo() {
		return esParaAccionDesdeFormularioResponsableFondo;
	}
	
	public void setEsParaAccionDesdeFormularioResponsableFondo(Boolean esParaAccionDesdeFormularioResponsableFondo) {
		this.esParaAccionDesdeFormularioResponsableFondo = esParaAccionDesdeFormularioResponsableFondo;
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

			if(this.responsablefondoSessionBean==null) {
				this.responsablefondoSessionBean=new ResponsableFondoSessionBean();
			}

			if(!this.responsablefondoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(responsablefondoSessionBean.getlidEmpresaActual());
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

			if(this.responsablefondoSessionBean==null) {
				this.responsablefondoSessionBean=new ResponsableFondoSessionBean();
			}

			if(!this.responsablefondoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(responsablefondoSessionBean.getlidSucursalActual());
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

			if(this.responsablefondoSessionBean==null) {
				this.responsablefondoSessionBean=new ResponsableFondoSessionBean();
			}

			if(!this.responsablefondoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(responsablefondoSessionBean.getlidEmpleadoActual());
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

					if(this.responsablefondo!=null) {
						this.responsablefondo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
						this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaResponsableFondo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
						if(this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaResponsableFondoGenerico)throws Exception
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
				jComboBoxid_empresaResponsableFondoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaResponsableFondoGenerico!=null && jComboBoxid_empresaResponsableFondoGenerico.getItemCount()>0) {
					jComboBoxid_empresaResponsableFondoGenerico.setSelectedIndex(0);
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

					if(this.responsablefondo!=null) {
						this.responsablefondo.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
						this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalResponsableFondo.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
						if(this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalResponsableFondoGenerico)throws Exception
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
				jComboBoxid_sucursalResponsableFondoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalResponsableFondoGenerico!=null && jComboBoxid_sucursalResponsableFondoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalResponsableFondoGenerico.setSelectedIndex(0);
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

					if(this.responsablefondo!=null) {
						this.responsablefondo.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
						this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoResponsableFondo.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
						if(this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoResponsableFondoGenerico)throws Exception
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
				jComboBoxid_empleadoResponsableFondoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoResponsableFondoGenerico!=null && jComboBoxid_empleadoResponsableFondoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoResponsableFondoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ResponsableFondo responsablefondo,JComboBox jComboBoxid_empresaResponsableFondoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaResponsableFondoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaResponsableFondoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				responsablefondo.setid_empresa(empresaAux.getId());
				responsablefondo.setempresa_descripcion(ResponsableFondoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				responsablefondo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ResponsableFondo responsablefondo,JComboBox jComboBoxid_sucursalResponsableFondoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalResponsableFondoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalResponsableFondoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				responsablefondo.setid_sucursal(sucursalAux.getId());
				responsablefondo.setsucursal_descripcion(ResponsableFondoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				responsablefondo.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(ResponsableFondo responsablefondo,JComboBox jComboBoxid_empleadoResponsableFondoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoResponsableFondoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoResponsableFondoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				responsablefondo.setid_empleado(empleadoAux.getId());
				responsablefondo.setempleado_descripcion(ResponsableFondoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				responsablefondo.setEmpleado(empleadoAux);			}
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

					if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsableFondo!=null) { 
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsableFondo!=null) { 
					}

					if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsableFondo!=null) { 
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsableFondo!=null) { 
					}

					if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsableFondo!=null) { 
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsableFondo!=null) { 
					}

					if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.addItem(empleado);
							}
						}

						if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesResponsableFondo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ResponsableFondoConstantesFunciones.refrescarForeignKeysDescripcionesResponsableFondo(this.responsablefondoLogic.getResponsableFondos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ResponsableFondoConstantesFunciones.refrescarForeignKeysDescripcionesResponsableFondo(this.responsablefondos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//responsablefondoLogic.setResponsableFondos(this.responsablefondos);
			responsablefondoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ResponsableFondoParameterReturnGeneral getResponsableFondoParameterGeneral() {
		return this.responsablefondoParameterGeneral;
	}
	
	public void setResponsableFondoParameterGeneral(ResponsableFondoParameterReturnGeneral responsablefondoParameterGeneral) {
		this.responsablefondoParameterGeneral = responsablefondoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoResponsableFondo() {
		return isPermisoTodoResponsableFondo;
	}

	public void setIsPermisoTodoResponsableFondo(Boolean isPermisoTodoResponsableFondo) {
		this.isPermisoTodoResponsableFondo = isPermisoTodoResponsableFondo;
	}

	public Boolean getIsPermisoNuevoResponsableFondo() {
		return isPermisoNuevoResponsableFondo;
	}

	public void setIsPermisoNuevoResponsableFondo(Boolean isPermisoNuevoResponsableFondo) {
		this.isPermisoNuevoResponsableFondo = isPermisoNuevoResponsableFondo;
	}

	public Boolean getIsPermisoActualizarResponsableFondo() {
		return isPermisoActualizarResponsableFondo;
	}

	public void setIsPermisoActualizarResponsableFondo(Boolean isPermisoActualizarResponsableFondo) {
		this.isPermisoActualizarResponsableFondo = isPermisoActualizarResponsableFondo;
	}

	public Boolean getIsPermisoEliminarResponsableFondo() {
		return isPermisoEliminarResponsableFondo;
	}

	public void setIsPermisoEliminarResponsableFondo(Boolean isPermisoEliminarResponsableFondo) {
		this.isPermisoEliminarResponsableFondo = isPermisoEliminarResponsableFondo;
	}

	public Boolean getIsPermisoGuardarCambiosResponsableFondo() {
		return isPermisoGuardarCambiosResponsableFondo;
	}

	public void setIsPermisoGuardarCambiosResponsableFondo(Boolean isPermisoGuardarCambiosResponsableFondo) {
		this.isPermisoGuardarCambiosResponsableFondo = isPermisoGuardarCambiosResponsableFondo;
	}
	
	public Boolean getIsPermisoConsultaResponsableFondo() {
		return isPermisoConsultaResponsableFondo;
	}

	public void setIsPermisoConsultaResponsableFondo(Boolean isPermisoConsultaResponsableFondo) {
		this.isPermisoConsultaResponsableFondo = isPermisoConsultaResponsableFondo;
	}

	public Boolean getIsPermisoBusquedaResponsableFondo() {
		return isPermisoBusquedaResponsableFondo;
	}

	public void setIsPermisoBusquedaResponsableFondo(Boolean isPermisoBusquedaResponsableFondo) {
		this.isPermisoBusquedaResponsableFondo = isPermisoBusquedaResponsableFondo;
	}

	public Boolean getIsPermisoReporteResponsableFondo() {
		return isPermisoReporteResponsableFondo;
	}

	public void setIsPermisoReporteResponsableFondo(Boolean isPermisoReporteResponsableFondo) {
		this.isPermisoReporteResponsableFondo = isPermisoReporteResponsableFondo;
	}
	
	public Boolean getIsPermisoPaginacionMedioResponsableFondo() {
		return isPermisoPaginacionMedioResponsableFondo;
	}

	public void setIsPermisoPaginacionMedioResponsableFondo(Boolean isPermisoPaginacionMedioResponsableFondo) {
		this.isPermisoPaginacionMedioResponsableFondo = isPermisoPaginacionMedioResponsableFondo;
	}
	
	public Boolean getIsPermisoPaginacionTodoResponsableFondo() {
		return isPermisoPaginacionTodoResponsableFondo;
	}

	public void setIsPermisoPaginacionTodoResponsableFondo(Boolean isPermisoPaginacionTodoResponsableFondo) {
		this.isPermisoPaginacionTodoResponsableFondo = isPermisoPaginacionTodoResponsableFondo;
	}
	
	public Boolean getIsPermisoPaginacionAltoResponsableFondo() {
		return isPermisoPaginacionAltoResponsableFondo;
	}

	public void setIsPermisoPaginacionAltoResponsableFondo(Boolean isPermisoPaginacionAltoResponsableFondo) {
		this.isPermisoPaginacionAltoResponsableFondo = isPermisoPaginacionAltoResponsableFondo;
	}
	
	public Boolean getIsPermisoCopiarResponsableFondo() {
		return isPermisoCopiarResponsableFondo;
	}

	public void setIsPermisoCopiarResponsableFondo(Boolean isPermisoCopiarResponsableFondo) {
		this.isPermisoCopiarResponsableFondo = isPermisoCopiarResponsableFondo;
	}
	
	public Boolean getIsPermisoVerFormResponsableFondo() {
		return isPermisoVerFormResponsableFondo;
	}

	public void setIsPermisoVerFormResponsableFondo(Boolean isPermisoVerFormResponsableFondo) {
		this.isPermisoVerFormResponsableFondo = isPermisoVerFormResponsableFondo;
	}
	
	public Boolean getIsPermisoDuplicarResponsableFondo() {
		return isPermisoDuplicarResponsableFondo;
	}

	public void setIsPermisoDuplicarResponsableFondo(Boolean isPermisoDuplicarResponsableFondo) {
		this.isPermisoDuplicarResponsableFondo = isPermisoDuplicarResponsableFondo;
	}
	
	public Boolean getIsPermisoOrdenResponsableFondo() {
		return isPermisoOrdenResponsableFondo;
	}

	public void setIsPermisoOrdenResponsableFondo(Boolean isPermisoOrdenResponsableFondo) {
		this.isPermisoOrdenResponsableFondo = isPermisoOrdenResponsableFondo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoResponsableFondo() {
		return isVisibilidadCeldaNuevoResponsableFondo;
	}

	public void setIsVisibilidadCeldaNuevoResponsableFondo(Boolean isVisibilidadCeldaNuevoResponsableFondo) {
		this.isVisibilidadCeldaNuevoResponsableFondo = isVisibilidadCeldaNuevoResponsableFondo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarResponsableFondo() {
		return isVisibilidadCeldaDuplicarResponsableFondo;
	}

	public void setIsVisibilidadCeldaDuplicarResponsableFondo(Boolean isVisibilidadCeldaDuplicarResponsableFondo) {
		this.isVisibilidadCeldaDuplicarResponsableFondo = isVisibilidadCeldaDuplicarResponsableFondo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarResponsableFondo() {
		return isVisibilidadCeldaCopiarResponsableFondo;
	}

	public void setIsVisibilidadCeldaCopiarResponsableFondo(Boolean isVisibilidadCeldaCopiarResponsableFondo) {
		this.isVisibilidadCeldaCopiarResponsableFondo = isVisibilidadCeldaCopiarResponsableFondo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormResponsableFondo() {
		return isVisibilidadCeldaVerFormResponsableFondo;
	}

	public void setIsVisibilidadCeldaVerFormResponsableFondo(Boolean isVisibilidadCeldaVerFormResponsableFondo) {
		this.isVisibilidadCeldaVerFormResponsableFondo = isVisibilidadCeldaVerFormResponsableFondo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenResponsableFondo() {
		return isVisibilidadCeldaOrdenResponsableFondo;
	}

	public void setIsVisibilidadCeldaOrdenResponsableFondo(Boolean isVisibilidadCeldaOrdenResponsableFondo) {
		this.isVisibilidadCeldaOrdenResponsableFondo = isVisibilidadCeldaOrdenResponsableFondo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesResponsableFondo() {
		return isVisibilidadCeldaNuevoRelacionesResponsableFondo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesResponsableFondo(Boolean isVisibilidadCeldaNuevoRelacionesResponsableFondo) {
		this.isVisibilidadCeldaNuevoRelacionesResponsableFondo = isVisibilidadCeldaNuevoRelacionesResponsableFondo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarResponsableFondo() {
		return isVisibilidadCeldaModificarResponsableFondo;
	}

	public void setIsVisibilidadCeldaModificarResponsableFondo(Boolean isVisibilidadCeldaModificarResponsableFondo) {
		this.isVisibilidadCeldaModificarResponsableFondo = isVisibilidadCeldaModificarResponsableFondo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarResponsableFondo() {
		return isVisibilidadCeldaActualizarResponsableFondo;
	}

	public void setIsVisibilidadCeldaActualizarResponsableFondo(Boolean isVisibilidadCeldaActualizarResponsableFondo) {
		this.isVisibilidadCeldaActualizarResponsableFondo = isVisibilidadCeldaActualizarResponsableFondo;
	}

	public Boolean getIsVisibilidadCeldaEliminarResponsableFondo() {
		return isVisibilidadCeldaEliminarResponsableFondo;
	}

	public void setIsVisibilidadCeldaEliminarResponsableFondo(Boolean isVisibilidadCeldaEliminarResponsableFondo) {
		this.isVisibilidadCeldaEliminarResponsableFondo = isVisibilidadCeldaEliminarResponsableFondo;
	}

	public Boolean getIsVisibilidadCeldaCancelarResponsableFondo() {
		return isVisibilidadCeldaCancelarResponsableFondo;
	}

	public void setIsVisibilidadCeldaCancelarResponsableFondo(Boolean isVisibilidadCeldaCancelarResponsableFondo) {
		this.isVisibilidadCeldaCancelarResponsableFondo = isVisibilidadCeldaCancelarResponsableFondo;
	}

	public Boolean getIsVisibilidadCeldaGuardarResponsableFondo() {
		return isVisibilidadCeldaGuardarResponsableFondo;
	}

	public void setIsVisibilidadCeldaGuardarResponsableFondo(Boolean isVisibilidadCeldaGuardarResponsableFondo) {
		this.isVisibilidadCeldaGuardarResponsableFondo = isVisibilidadCeldaGuardarResponsableFondo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosResponsableFondo() {
		return isVisibilidadCeldaGuardarCambiosResponsableFondo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosResponsableFondo(Boolean isVisibilidadCeldaGuardarCambiosResponsableFondo) {
		this.isVisibilidadCeldaGuardarCambiosResponsableFondo = isVisibilidadCeldaGuardarCambiosResponsableFondo;
	}
		
	public ResponsableFondoSessionBean getresponsablefondoSessionBean() {
		return this.responsablefondoSessionBean;
	}
	
	public void setresponsablefondoSessionBean(ResponsableFondoSessionBean responsablefondoSessionBean) {
		this.responsablefondoSessionBean=responsablefondoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(ResponsableFondo responsablefondo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(responsablefondo,null);
				this.setActualParaGuardarSucursalForeignKey(responsablefondo,null);
				this.setActualParaGuardarEmpleadoForeignKey(responsablefondo,null);
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
	
	public void bugActualizarReferenciaActual(ResponsableFondo responsablefondo,ResponsableFondo responsablefondoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalResponsableFondo(responsablefondo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		responsablefondoAux.setId(responsablefondo.getId());
		responsablefondoAux.setVersionRow(responsablefondo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessResponsableFondo();
		
			int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = responsablefondoValidator.getInvalidValues(this.responsablefondo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			responsablefondoLogic.setDatosCliente(datosCliente);
			responsablefondoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				responsablefondoAux=new  ResponsableFondo();
				
				responsablefondoAux.setIsNew(true);
				responsablefondoAux.setIsChanged(true);
				
				responsablefondoAux.setResponsableFondoOriginal(this.responsablefondo);
				
				responsablefondoAux.setId(this.responsablefondo.getId());	
				responsablefondoAux.setVersionRow(this.responsablefondo.getVersionRow());	
				responsablefondoAux.setid_empresa(this.responsablefondo.getid_empresa());	
				responsablefondoAux.setid_sucursal(this.responsablefondo.getid_sucursal());	
				responsablefondoAux.setid_empleado(this.responsablefondo.getid_empleado());	
				responsablefondoAux.setsecuencial(this.responsablefondo.getsecuencial());	
				responsablefondoAux.setvalor_caja(this.responsablefondo.getvalor_caja());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.responsablefondoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.responsablefondoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(responsablefondoAux,responsablefondoLogic.getResponsableFondos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsablefondoAux,responsablefondos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.responsablefondoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.responsablefondoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablefondoLogic.saveResponsableFondos();//WithConnection
						//responsablefondoLogic.getSetVersionRowResponsableFondos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.responsablefondo,responsablefondoAux);
					
					this.refrescarForeignKeysDescripcionesResponsableFondo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.responsablefondoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.getFacturaProveedors().addAll(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedors.addAll(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								responsablefondoLogic.saveResponsableFondoRelaciones(responsablefondoAux,this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.getFacturaProveedors());//WithConnection
								//responsablefondoLogic.getSetVersionRowResponsableFondos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.responsablefondo,responsablefondoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.setFacturaProveedors(new ArrayList<FacturaProveedor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedors= new ArrayList<FacturaProveedor>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							responsablefondoAux.setFacturaProveedors(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.getFacturaProveedors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.responsablefondoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.responsablefondoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(responsablefondoAux,responsablefondoLogic.getResponsableFondos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(responsablefondoAux,responsablefondos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.responsablefondo,responsablefondoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				responsablefondoAux=new  ResponsableFondo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.responsablefondoSessionBean.getEsGuardarRelacionado() 
					|| (this.responsablefondoSessionBean.getEsGuardarRelacionado() && this.responsablefondo.getId()>=0)) {
						
					responsablefondoAux.setIsNew(false);
				}
				
				responsablefondoAux.setIsDeleted(false);
			
				responsablefondoAux.setId(this.responsablefondo.getId());	
				responsablefondoAux.setVersionRow(this.responsablefondo.getVersionRow());	
				responsablefondoAux.setid_empresa(this.responsablefondo.getid_empresa());	
				responsablefondoAux.setid_sucursal(this.responsablefondo.getid_sucursal());	
				responsablefondoAux.setid_empleado(this.responsablefondo.getid_empleado());	
				responsablefondoAux.setsecuencial(this.responsablefondo.getsecuencial());	
				responsablefondoAux.setvalor_caja(this.responsablefondo.getvalor_caja());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(responsablefondoAux,responsablefondoLogic.getResponsableFondos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsablefondoAux,responsablefondos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.responsablefondoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.responsablefondoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablefondoLogic.saveResponsableFondos();//WithConnection
						//responsablefondoLogic.getSetVersionRowResponsableFondos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.responsablefondo,responsablefondoAux);
					
					this.refrescarForeignKeysDescripcionesResponsableFondo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.responsablefondoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.getFacturaProveedors().addAll(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedors.addAll(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								responsablefondoLogic.saveResponsableFondoRelaciones(responsablefondoAux,this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.getFacturaProveedors());//WithConnection
								//responsablefondoLogic.getSetVersionRowResponsableFondos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.responsablefondo,responsablefondoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.setFacturaProveedors(new ArrayList<FacturaProveedor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedors= new ArrayList<FacturaProveedor>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							responsablefondoAux.setFacturaProveedors(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.getFacturaProveedors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.responsablefondoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.responsablefondoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(responsablefondoAux,responsablefondoLogic.getResponsableFondos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(responsablefondoAux,responsablefondos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.responsablefondo,responsablefondoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				responsablefondoAux=new  ResponsableFondo();
				
				responsablefondoAux.setIsNew(false);
				responsablefondoAux.setIsChanged(false);
				
				responsablefondoAux.setIsDeleted(true);
				
				responsablefondoAux.setId(this.responsablefondo.getId());	
				responsablefondoAux.setVersionRow(this.responsablefondo.getVersionRow());	
				responsablefondoAux.setid_empresa(this.responsablefondo.getid_empresa());	
				responsablefondoAux.setid_sucursal(this.responsablefondo.getid_sucursal());	
				responsablefondoAux.setid_empleado(this.responsablefondo.getid_empleado());	
				responsablefondoAux.setsecuencial(this.responsablefondo.getsecuencial());	
				responsablefondoAux.setvalor_caja(this.responsablefondo.getvalor_caja());	
				
				if(this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.responsablefondoAux.getId()>=0) {	
						this.responsablefondosEliminados.add(responsablefondoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(responsablefondoAux,responsablefondoLogic.getResponsableFondos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsablefondoAux,responsablefondos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.responsablefondoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.responsablefondoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablefondoLogic.saveResponsableFondos();//WithConnection
						//responsablefondoLogic.getSetVersionRowResponsableFondos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.responsablefondoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.getFacturaProveedors().addAll(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedors.addAll(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jInternalFrameDetalleFormFacturaProveedor.detallefacturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								responsablefondoLogic.saveResponsableFondoRelaciones(responsablefondoAux,this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.getFacturaProveedors());//WithConnection
								//responsablefondoLogic.getSetVersionRowResponsableFondos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.setFacturaProveedors(new ArrayList<FacturaProveedor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedors= new ArrayList<FacturaProveedor>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.quitarFilaTotales();}
							responsablefondoAux.setFacturaProveedors(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.getFacturaProveedors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.responsablefondoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.responsablefondoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(responsablefondoAux,responsablefondoLogic.getResponsableFondos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(responsablefondoAux,responsablefondos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.getResponsableFondos().addAll(this.responsablefondosEliminados);
					
					responsablefondoLogic.saveResponsableFondos();//WithConnection
					//responsablefondoLogic.getSetVersionRowResponsableFondos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesResponsableFondo();
				
				this.responsablefondosEliminados= new ArrayList<ResponsableFondo>();		
			}
			
			if(this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Responsable Fondo Rotativo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Responsable Fondo Rotativo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.responsablefondo=responsablefondoAux;
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
      		//this.finishProcessResponsableFondo();
      	}
		
	}	
	
	public void actualizarRelaciones(ResponsableFondo responsablefondoLocal) throws Exception {
		
		if(this.responsablefondoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				responsablefondoLocal.setFacturaProveedors(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.getFacturaProveedors());
			
			} else {
			
				responsablefondoLocal.setFacturaProveedors(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ResponsableFondo responsablefondoLocal) throws Exception {	
		if(this.responsablefondoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				responsablefondoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				responsablefondoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				responsablefondoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarResponsableFondoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = responsablefondoValidator.getInvalidValues(this.responsablefondo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ResponsableFondo responsablefondo,List<ResponsableFondo> responsablefondos) throws Exception {
		try	{		
			ResponsableFondoConstantesFunciones.actualizarLista(responsablefondo,responsablefondos,this.responsablefondoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ResponsableFondo responsablefondo,List<ResponsableFondo> responsablefondos) throws Exception {
		try	{			
			ResponsableFondoConstantesFunciones.actualizarSelectedLista(responsablefondo,responsablefondos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ResponsableFondo> responsablefondosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				responsablefondosLocal=this.responsablefondoLogic.getResponsableFondos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				responsablefondosLocal=this.responsablefondos;
			}
			//ARCHITECTURE
		
			for(ResponsableFondo responsablefondoLocal:responsablefondosLocal) {
				if(this.permiteMantenimiento(responsablefondoLocal) && responsablefondoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ResponsableFondoConstantesFunciones.getResponsableFondoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ResponsableFondoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableFondo.jLabelid_empresaResponsableFondo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableFondoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableFondo.jLabelid_sucursalResponsableFondo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableFondoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableFondo.jLabelid_empleadoResponsableFondo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableFondoConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableFondo.jLabelsecuencialResponsableFondo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsableFondoConstantesFunciones.VALORCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableFondo.jLabelvalor_cajaResponsableFondo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableFondo.jLabelid_empresaResponsableFondo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableFondo.jLabelid_sucursalResponsableFondo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableFondo.jLabelid_empleadoResponsableFondo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableFondo.jLabelsecuencialResponsableFondo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsableFondo.jLabelvalor_cajaResponsableFondo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FacturaProveedor")) {
			if(this.responsablefondo==null) {
				this.responsablefondo= new ResponsableFondo();
			}

			if(this.responsablefondoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoResponsableFondo
				this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);

				this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.getfacturaproveedor().setResponsableFondo(this.responsablefondo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoResponsableFondo--;	
		
		
		this.responsablefondoAux=new ResponsableFondo();
		
		this.responsablefondoAux.setId(this.iIdNuevoResponsableFondo);
		this.responsablefondoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.responsablefondoLogic.getResponsableFondos().add(this.responsablefondoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.responsablefondos.add(this.responsablefondoAux);
		}
		//ARCHITECTURE
		
		this.responsablefondo=this.responsablefondoAux;
		
		if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioResponsableFondo(this.responsablefondo);
			this.setVariablesObjetoActualToFormularioForeignKeyResponsableFondo(this.responsablefondo);
		}
				
		//this.setDefaultControlesResponsableFondo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyResponsableFondo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyResponsableFondo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyResponsableFondo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResponsableFondo(this.responsablefondoBean,this.responsablefondo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ResponsableFondoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.responsablefondoSessionBean.getConGuardarRelaciones()) {
			classes=ResponsableFondoConstantesFunciones.getClassesRelationshipsOfResponsableFondo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.responsablefondoReturnGeneral=responsablefondoLogic.procesarEventosResponsableFondosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.responsablefondoLogic.getResponsableFondos(),this.responsablefondo,this.responsablefondoParameterGeneral,this.isEsNuevoResponsableFondo,classes);//this.responsablefondoLogic.getResponsableFondo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanResponsableFondo(this.responsablefondoReturnGeneral,this.responsablefondoBean,false);
		
		if(this.responsablefondoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyResponsableFondo(this.responsablefondoReturnGeneral.getResponsableFondo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioResponsableFondo(this.responsablefondoReturnGeneral.getResponsableFondo());
		}
		
		if(this.responsablefondoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioResponsableFondo(this.responsablefondoReturnGeneral.getResponsableFondo(),classes);//this.responsablefondoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyResponsableFondo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyResponsableFondo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.RecargarFormResponsableFondo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingResponsableFondo(false);
						
			if(responsablefondoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorSessionBean.getEsGuardarRelacionado() && FacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaProveedorActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsableFondo();
			}
			
			this.actualizarVisualTableDatosResponsableFondo();
			
			this.jTableDatosResponsableFondo.setRowSelectionInterval(this.getIndiceNuevoResponsableFondo(), this.getIndiceNuevoResponsableFondo());
			
			this.seleccionarFilaTablaResponsableFondoActual();
						
			this.actualizarEstadoCeldasBotonesResponsableFondo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesResponsableFondo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormResponsableFondo.jTextFieldsecuencialResponsableFondo.setEnabled(isHabilitar && this.responsablefondoConstantesFunciones.activarsecuencialResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jTextFieldvalor_cajaResponsableFondo.setEnabled(isHabilitar && this.responsablefondoConstantesFunciones.activarvalor_cajaResponsableFondo);	
		//
		this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.setEnabled(isHabilitar && this.responsablefondoConstantesFunciones.activarid_empresaResponsableFondo);//
		this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.setEnabled(isHabilitar && this.responsablefondoConstantesFunciones.activarid_sucursalResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.setEnabled(isHabilitar && this.responsablefondoConstantesFunciones.activarid_empleadoResponsableFondo);
	};
	
	public void setDefaultControlesResponsableFondo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoResponsableFondo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.responsablefondoSessionBean.setConGuardarRelaciones(true);			
			this.responsablefondoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormResponsableFondo.jTabbedPaneRelacionesResponsableFondo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.responsablefondoSessionBean.setConGuardarRelaciones(false);			
			this.responsablefondoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormResponsableFondo.jTabbedPaneRelacionesResponsableFondo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoResponsableFondo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResponsableFondo responsablefondoAux:this.responsablefondoLogic.getResponsableFondos()) {
				if(responsablefondoAux.getId().equals(this.iIdNuevoResponsableFondo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResponsableFondo responsablefondoAux:this.responsablefondos) {
				if(responsablefondoAux.getId().equals(this.iIdNuevoResponsableFondo)) {
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
	
	public int getIndiceActualResponsableFondo(ResponsableFondo responsablefondo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResponsableFondo responsablefondoAux:this.responsablefondoLogic.getResponsableFondos()) {
				if(responsablefondoAux.getId().equals(responsablefondo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResponsableFondo responsablefondoAux:this.responsablefondos) {
				if(responsablefondoAux.getId().equals(responsablefondo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalResponsableFondo(ResponsableFondo responsablefondoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResponsableFondo responsablefondoAux:this.responsablefondoLogic.getResponsableFondos()) {
				if(responsablefondoAux.getResponsableFondoOriginal().getId().equals(responsablefondoOriginal.getId())) {
					existe=true;
					responsablefondoOriginal.setId(responsablefondoAux.getId());
					responsablefondoOriginal.setVersionRow(responsablefondoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResponsableFondo responsablefondoAux:this.responsablefondos) {
				if(responsablefondoAux.getResponsableFondoOriginal().getId().equals(responsablefondoOriginal.getId())) {
					existe=true;
					responsablefondoOriginal.setId(responsablefondoAux.getId());
					responsablefondoOriginal.setVersionRow(responsablefondoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosResponsableFondo(Boolean esParaCancelar) throws Exception {
		responsablefondosAux=new ArrayList<ResponsableFondo>();
		responsablefondoAux=new ResponsableFondo();
		
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ResponsableFondo responsablefondoAux:this.responsablefondoLogic.getResponsableFondos()) {
					if(responsablefondoAux.getId()<0) {
						responsablefondosAux.add(responsablefondoAux);
					}		
				}
				this.iIdNuevoResponsableFondo=0L;
				this.responsablefondoLogic.getResponsableFondos().removeAll(responsablefondosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResponsableFondo responsablefondoAux:this.responsablefondos) {
					if(responsablefondoAux.getId()<0) {
						responsablefondosAux.add(responsablefondoAux);
					}		
				}
				this.iIdNuevoResponsableFondo=0L;
				this.responsablefondos.removeAll(responsablefondosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoResponsableFondo 
					&& this.responsablefondoLogic.getResponsableFondos().size()>0
					) {
					responsablefondoAux=this.responsablefondoLogic.getResponsableFondos().get(this.responsablefondoLogic.getResponsableFondos().size() - 1);
				
					if(responsablefondoAux.getId()<0) {
						this.responsablefondoLogic.getResponsableFondos().remove(responsablefondoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoResponsableFondo && this.responsablefondos.size()>0) {
					responsablefondoAux=this.responsablefondos.get(this.responsablefondos.size() - 1);
				
					if(responsablefondoAux.getId()<0) {
						this.responsablefondos.remove(responsablefondoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoResponsableFondo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(responsablefondo.getId()<0) {
				this.responsablefondoLogic.getResponsableFondos().remove(this.responsablefondo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(responsablefondo.getId()<0) {
				this.responsablefondos.remove(this.responsablefondo);
			}
		}			
	}
	
	public void setEstadosInicialesResponsableFondo(List<ResponsableFondo> responsablefondosAux) throws Exception {
		ResponsableFondoConstantesFunciones.setEstadosInicialesResponsableFondo(responsablefondosAux);
	}
	
	public void setEstadosInicialesResponsableFondo(ResponsableFondo responsablefondoAux) throws Exception {
		ResponsableFondoConstantesFunciones.setEstadosInicialesResponsableFondo(responsablefondoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarResponsableFondoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesResponsableFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarResponsableFondoActual()) {
				if(!this.isEsNuevoResponsableFondo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesResponsableFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoResponsableFondo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarResponsableFondoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Responsable Fondo Rotativo ?", "MANTENIMIENTO DE Responsable Fondo Rotativo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesResponsableFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ResponsableFondo responsablefondo) throws Exception {
		ResponsableFondoConstantesFunciones.seleccionarAsignar(this.responsablefondo,responsablefondo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarResponsableFondo=this.isPermisoActualizarOriginalResponsableFondo;
			
			
			this.seleccionarAsignar(responsablefondo);
			
			

			idEmpleadoActual=responsablefondo.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ResponsableFondoConstantesFunciones.quitarEspaciosResponsableFondo(this.responsablefondo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesResponsableFondo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.responsablefondoSessionBean.setsFuncionBusquedaRapida(this.responsablefondoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarEmpleadoActual() throws Exception {
		try	{
			Empleado empleadoAux=new Empleado();

			if(this.idEmpleadoActual != null && this.idEmpleadoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(this.idEmpleadoActual);
					empleadoAux= empleadoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosForeignKey=new ArrayList<Empleado>();
				empleadosForeignKey.add(empleadoAux);
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
			if(this.isEsNuevoResponsableFondo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosResponsableFondo(esParaCancelar);				
				this.cancelarNuevoResponsableFondo(esParaCancelar);								
			}
			
			this.responsablefondo=new ResponsableFondo();
			
			this.inicializarResponsableFondo();
			
			this.actualizarEstadoCeldasBotonesResponsableFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarResponsableFondo() throws Exception {
		try {
			ResponsableFondoConstantesFunciones.inicializarResponsableFondo(this.responsablefondo);
			
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
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.responsablefondoLogic.getResponsableFondos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteResponsableFondos(String sAccionBusqueda,List<ResponsableFondo> responsablefondosParaReportes) throws Exception {
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
					sPathReporteFinal="ResponsableFondo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ResponsableFondoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ResponsableFondoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ResponsableFondo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Responsable Fondo Rotativos");		
		parameters.put("busquedapor", ResponsableFondoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FacturaProveedor.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ResponsableFondoLogic responsablefondoLogicAuxiliar=new ResponsableFondoLogic();
					responsablefondoLogicAuxiliar.setDatosCliente(responsablefondoLogic.getDatosCliente());				
					responsablefondoLogicAuxiliar.setResponsableFondos(responsablefondosParaReportes);
					
					responsablefondoLogicAuxiliar.cargarRelacionesLoteForeignKeyResponsableFondoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					responsablefondosParaReportes=responsablefondoLogicAuxiliar.getResponsableFondos();
					
					//responsablefondoLogic.getNewConnexionToDeep();
					
					//for (ResponsableFondo responsablefondo:responsablefondosParaReportes) {
					//	responsablefondoLogic.deepLoad(responsablefondo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//responsablefondoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//responsablefondoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFacturaProveedor = AuxiliarReportes.class.getResourceAsStream("FacturaProveedorDetalleRelacionesDesign.jasper");
			parameters.put("subreport_facturaproveedor", reportFileFacturaProveedor);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceResponsableFondo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ResponsableFondoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ResponsableFondoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceResponsableFondo=new JRBeanArrayDataSource(ResponsableFondoJInternalFrame.TraerResponsableFondoBeans(responsablefondosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceResponsableFondo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ResponsableFondoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ResponsableFondoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ResponsableFondoBean.TraerResponsableFondoBeans(responsablefondosParaReportes).toArray()));
							
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
				this.generarExcelReporteResponsableFondos(sAccionBusqueda,sTipoArchivoReporte,responsablefondosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalResponsableFondos(sAccionBusqueda,sTipoArchivoReporte,responsablefondosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoResponsableFondoActionPerformed(null);
					//this.generarExcelReporteResponsableFondos(sAccionBusqueda,sTipoArchivoReporte,responsablefondosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalResponsableFondos(sAccionBusqueda,sTipoArchivoReporte,responsablefondosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesResponsableFondos(sAccionBusqueda,sTipoArchivoReporte,responsablefondosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesResponsableFondos(sAccionBusqueda,sTipoArchivoReporte,responsablefondosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteResponsableFondos(String sAccionBusqueda,String sTipoArchivoReporte,List<ResponsableFondo> responsablefondosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsablefondo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResponsableFondos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResponsableFondo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ResponsableFondo responsablefondo : responsablefondosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ResponsableFondoConstantesFunciones.generarExcelReporteDataResponsableFondo("NORMAL",row,workbook,responsablefondo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Fondo Rotativo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderResponsableFondo(String sTipo,Row row,Workbook workbook) {
		
		ResponsableFondoConstantesFunciones.generarExcelReporteHeaderResponsableFondo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalResponsableFondos(String sAccionBusqueda,String sTipoArchivoReporte,List<ResponsableFondo> responsablefondosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsablefondo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResponsableFondos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ResponsableFondo responsablefondo : responsablefondosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ResponsableFondoConstantesFunciones.getResponsableFondoDescripcion(responsablefondo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsablefondo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsablefondo.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsablefondo.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsablefondo.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsableFondoConstantesFunciones.LABEL_VALORCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_VALORCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsablefondo.getvalor_caja());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Fondo Rotativo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesResponsableFondos(String sAccionBusqueda,String sTipoArchivoReporte,List<ResponsableFondo> responsablefondosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ResponsableFondo> responsablefondosRespaldo=null;
		
		classes=ResponsableFondoConstantesFunciones.getClassesRelationshipsOfResponsableFondo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.responsablefondoLogic.setDatosCliente(this.datosCliente);
		this.responsablefondoLogic.setDatosDeep(this.datosDeep);
		this.responsablefondoLogic.setIsConDeep(true);
		
		responsablefondosRespaldo=this.responsablefondoLogic.getResponsableFondos();
		
		this.responsablefondoLogic.setResponsableFondos(responsablefondosParaReportes);	
		this.responsablefondoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		responsablefondosParaReportes=this.responsablefondoLogic.getResponsableFondos();
		this.responsablefondoLogic.setResponsableFondos(responsablefondosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsablefondo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ResponsableFondos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResponsableFondo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ResponsableFondo responsablefondo : responsablefondosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderResponsableFondo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ResponsableFondoConstantesFunciones.generarExcelReporteDataResponsableFondo("NORMAL",row,workbook,responsablefondo,cellStyleDataAux);
		
			
			


				//FacturaProveedor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaProveedorConstantesFunciones.SCLASSWEBTITULO))) {

				if(responsablefondo.getFacturaProveedors()!=null && responsablefondo.getFacturaProveedors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaProveedorConstantesFunciones.generarExcelReporteHeaderFacturaProveedor("RELACIONADO",row,workbook);
				}

				if(responsablefondo.getFacturaProveedors()!=null) {
					i2=0;
					for(FacturaProveedor facturaproveedor : responsablefondo.getFacturaProveedors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FacturaProveedorConstantesFunciones.generarExcelReporteDataFacturaProveedor("RELACIONADO",row,workbook,facturaproveedor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ResponsableFondoConstantesFunciones.getResponsableFondoDescripcion(responsablefondo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Fondo Rotativo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoResponsableFondo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessResponsableFondo() throws Exception {		
		this.startProcessResponsableFondo(true);
	}
	
	public void startProcessResponsableFondo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasResponsableFondo ,this.jPanelParametrosReportesResponsableFondo, this.jScrollPanelDatosResponsableFondo,this.jPanelPaginacionResponsableFondo, this.jScrollPanelDatosEdicionResponsableFondo, this.jPanelAccionesResponsableFondo,this.jPanelAccionesFormularioResponsableFondo,this.jmenuBarResponsableFondo,this.jmenuBarDetalleResponsableFondo,this.jTtoolBarResponsableFondo,this.jTtoolBarDetalleResponsableFondo);		
		
		final JTabbedPane jTabbedPaneBusquedasResponsableFondo=this.jTabbedPaneBusquedasResponsableFondo; 
		
		final JPanel jPanelParametrosReportesResponsableFondo=this.jPanelParametrosReportesResponsableFondo;
		//final JScrollPane jScrollPanelDatosResponsableFondo=this.jScrollPanelDatosResponsableFondo;
		final JTable jTableDatosResponsableFondo=this.jTableDatosResponsableFondo;		
		final JPanel jPanelPaginacionResponsableFondo=this.jPanelPaginacionResponsableFondo;
		//final JScrollPane jScrollPanelDatosEdicionResponsableFondo=this.jScrollPanelDatosEdicionResponsableFondo;
		final JPanel jPanelAccionesResponsableFondo=this.jPanelAccionesResponsableFondo;
		
		JPanel jPanelCamposAuxiliarResponsableFondo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarResponsableFondo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			jPanelCamposAuxiliarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jPanelCamposResponsableFondo;
			jPanelAccionesFormularioAuxiliarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jPanelAccionesFormularioResponsableFondo;
		}
		
		final JPanel jPanelCamposResponsableFondo=jPanelCamposAuxiliarResponsableFondo;
		final JPanel jPanelAccionesFormularioResponsableFondo=jPanelAccionesFormularioAuxiliarResponsableFondo;
		
		
		final JMenuBar jmenuBarResponsableFondo=this.jmenuBarResponsableFondo;
		final JToolBar jTtoolBarResponsableFondo=this.jTtoolBarResponsableFondo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarResponsableFondo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResponsableFondo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			jmenuBarDetalleAuxiliarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jmenuBarDetalleResponsableFondo;
			jTtoolBarDetalleAuxiliarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jTtoolBarDetalleResponsableFondo;
		}
		
		final JMenuBar jmenuBarDetalleResponsableFondo=jmenuBarDetalleAuxiliarResponsableFondo;
		final JToolBar jTtoolBarDetalleResponsableFondo=jTtoolBarDetalleAuxiliarResponsableFondo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResponsableFondo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResponsableFondo;
			processRunnable.jTableDatos=jTableDatosResponsableFondo;
			processRunnable.jPanelCampos=jPanelCamposResponsableFondo;
			processRunnable.jPanelPaginacion=jPanelPaginacionResponsableFondo;
			processRunnable.jPanelAcciones=jPanelAccionesResponsableFondo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResponsableFondo;
			
			
			processRunnable.jmenuBar=jmenuBarResponsableFondo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResponsableFondo;
			processRunnable.jTtoolBar=jTtoolBarResponsableFondo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResponsableFondo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResponsableFondo ,jPanelParametrosReportesResponsableFondo,jTableDatosResponsableFondo, /*jScrollPanelDatosResponsableFondo,*/jPanelCamposResponsableFondo,jPanelPaginacionResponsableFondo, /*jScrollPanelDatosEdicionResponsableFondo,*/ jPanelAccionesResponsableFondo,jPanelAccionesFormularioResponsableFondo,jmenuBarResponsableFondo,jmenuBarDetalleResponsableFondo,jTtoolBarResponsableFondo,jTtoolBarDetalleResponsableFondo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResponsableFondo ,jPanelParametrosReportesResponsableFondo, jScrollPanelDatosResponsableFondo,jPanelPaginacionResponsableFondo, jScrollPanelDatosEdicionResponsableFondo, jPanelAccionesResponsableFondo,jPanelAccionesFormularioResponsableFondo,jmenuBarResponsableFondo,jmenuBarDetalleResponsableFondo,jTtoolBarResponsableFondo,jTtoolBarDetalleResponsableFondo);
						
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
	
	public void finishProcessResponsableFondo() {// throws Exception 
		this.finishProcessResponsableFondo(true);
	}
	
	public void finishProcessResponsableFondo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasResponsableFondo ,this.jPanelParametrosReportesResponsableFondo, this.jScrollPanelDatosResponsableFondo,this.jPanelPaginacionResponsableFondo, this.jScrollPanelDatosEdicionResponsableFondo, this.jPanelAccionesResponsableFondo,this.jPanelAccionesFormularioResponsableFondo,this.jmenuBarResponsableFondo,this.jmenuBarDetalleResponsableFondo,this.jTtoolBarResponsableFondo,this.jTtoolBarDetalleResponsableFondo);		
		
		final JTabbedPane jTabbedPaneBusquedasResponsableFondo=this.jTabbedPaneBusquedasResponsableFondo; 
		
		final JPanel jPanelParametrosReportesResponsableFondo=this.jPanelParametrosReportesResponsableFondo;
		//final JScrollPane jScrollPanelDatosResponsableFondo=this.jScrollPanelDatosResponsableFondo;
		final JTable jTableDatosResponsableFondo=this.jTableDatosResponsableFondo;		
		final JPanel jPanelPaginacionResponsableFondo=this.jPanelPaginacionResponsableFondo;
		//final JScrollPane jScrollPanelDatosEdicionResponsableFondo=this.jScrollPanelDatosEdicionResponsableFondo;
		final JPanel jPanelAccionesResponsableFondo=this.jPanelAccionesResponsableFondo;
		
		JPanel jPanelCamposAuxiliarResponsableFondo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarResponsableFondo=new JPanel();
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			jPanelCamposAuxiliarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jPanelCamposResponsableFondo;
			jPanelAccionesFormularioAuxiliarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jPanelAccionesFormularioResponsableFondo;
		}
		
		final JPanel jPanelCamposResponsableFondo=jPanelCamposAuxiliarResponsableFondo;
		final JPanel jPanelAccionesFormularioResponsableFondo=jPanelAccionesFormularioAuxiliarResponsableFondo;
		
		
		final JMenuBar jmenuBarResponsableFondo=this.jmenuBarResponsableFondo;		
		final JToolBar jTtoolBarResponsableFondo=this.jTtoolBarResponsableFondo;
				
		JMenuBar jmenuBarDetalleAuxiliarResponsableFondo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResponsableFondo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			jmenuBarDetalleAuxiliarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jmenuBarDetalleResponsableFondo;
			jTtoolBarDetalleAuxiliarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jTtoolBarDetalleResponsableFondo;		
		}
		
		final JMenuBar jmenuBarDetalleResponsableFondo=jmenuBarDetalleAuxiliarResponsableFondo;
		final JToolBar jTtoolBarDetalleResponsableFondo=jTtoolBarDetalleAuxiliarResponsableFondo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResponsableFondo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResponsableFondo;
			processRunnable.jTableDatos=jTableDatosResponsableFondo;
			processRunnable.jPanelCampos=jPanelCamposResponsableFondo;
			processRunnable.jPanelPaginacion=jPanelPaginacionResponsableFondo;
			processRunnable.jPanelAcciones=jPanelAccionesResponsableFondo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResponsableFondo;
			
			
			processRunnable.jmenuBar=jmenuBarResponsableFondo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResponsableFondo;
			processRunnable.jTtoolBar=jTtoolBarResponsableFondo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResponsableFondo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasResponsableFondo ,jPanelParametrosReportesResponsableFondo, jTableDatosResponsableFondo,/*jScrollPanelDatosResponsableFondo,*/jPanelCamposResponsableFondo,jPanelPaginacionResponsableFondo, /*jScrollPanelDatosEdicionResponsableFondo,*/ jPanelAccionesResponsableFondo,jPanelAccionesFormularioResponsableFondo,jmenuBarResponsableFondo,jmenuBarDetalleResponsableFondo,jTtoolBarResponsableFondo,jTtoolBarDetalleResponsableFondo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesResponsableFondo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarResponsableFondo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuResponsableFondo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarResponsableFondo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarResponsableFondo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleResponsableFondo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuResponsableFondo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarResponsableFondo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleResponsableFondo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.responsablefondoConstantesFunciones.getsFinalQueryResponsableFondo();
		String  finalQueryPaginacionTodos=this.responsablefondoConstantesFunciones.getsFinalQueryResponsableFondo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ResponsableFondoConstantesFunciones.getArrayColumnasGlobalesNoResponsableFondo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ResponsableFondoConstantesFunciones.getArrayColumnasGlobalesResponsableFondo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ResponsableFondoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.responsablefondosEliminados= new ArrayList<ResponsableFondo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessResponsableFondo();
		
				///*ResponsableFondoSessionBean*/this.responsablefondoSessionBean=new ResponsableFondoSessionBean();
			
			if(this.responsablefondoSessionBean==null) {
				this.responsablefondoSessionBean=new ResponsableFondoSessionBean();
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
					this.iNumeroPaginacion=ResponsableFondoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ResponsableFondoConstantesFunciones.getClassesForeignKeysOfResponsableFondo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/responsablefondo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			responsablefondosAux= new ArrayList<ResponsableFondo>();
			
				
			responsablefondoLogic.setDatosCliente(this.datosCliente);
			responsablefondoLogic.setDatosDeep(this.datosDeep);
			responsablefondoLogic.setIsConDeep(true);
			
			
			responsablefondoLogic.getResponsableFondoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					responsablefondoLogic.getTodosResponsableFondos(finalQueryGlobal,pagination);
					
					//responsablefondoLogic.getTodosResponsableFondosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(responsablefondoLogic.getResponsableFondos()==null|| responsablefondoLogic.getResponsableFondos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							responsablefondosAux= new ArrayList<ResponsableFondo>();
							responsablefondosAux.addAll(responsablefondoLogic.getResponsableFondos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablefondosAux= new ArrayList<ResponsableFondo>();
							responsablefondosAux.addAll(responsablefondos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							responsablefondoLogic.getTodosResponsableFondos(finalQueryGlobal+"",this.pagination);												
							
							//responsablefondoLogic.getTodosResponsableFondosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteResponsableFondos("Todos",responsablefondoLogic.getResponsableFondos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							responsablefondoLogic.setResponsableFondos(new ArrayList<ResponsableFondo>());					
							responsablefondoLogic.getResponsableFondos().addAll(responsablefondosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablefondos=new ArrayList<ResponsableFondo>();
							responsablefondos.addAll(responsablefondosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idResponsableFondo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idResponsableFondo=this.idActual;
				
				} else if(this.idResponsableFondoActual!=null && this.idResponsableFondoActual!=0L) {
					idResponsableFondo=idResponsableFondoActual;
				}
				
					
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndicePorId(idResponsableFondo);
				
				this.responsablefondos=new ArrayList<ResponsableFondo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					responsablefondoLogic.getEntity(idResponsableFondo);
					
					//responsablefondoLogic.getEntityWithConnection(idResponsableFondo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsablefondoLogic.setResponsableFondos(new ArrayList<ResponsableFondo>());
					responsablefondoLogic.getResponsableFondos().add(responsablefondoLogic.getResponsableFondo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsablefondos=new ArrayList<ResponsableFondo>();
					this.responsablefondos.add(responsablefondo);
				}
				
				if(responsablefondoLogic.getResponsableFondo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsablefondoLogic.getResponsableFondosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsablefondoLogic.getResponsableFondos()==null||responsablefondoLogic.getResponsableFondos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsablefondos==null|| responsablefondos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablefondosAux=new ArrayList<ResponsableFondo>();
						responsablefondosAux.addAll(responsablefondoLogic.getResponsableFondos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablefondosAux=new ArrayList<ResponsableFondo>();
							responsablefondosAux.addAll(responsablefondos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsablefondoLogic.getResponsableFondosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsableFondos("FK_IdEmpleado",responsablefondoLogic.getResponsableFondos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsableFondos("FK_IdEmpleado",responsablefondos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablefondoLogic.setResponsableFondos(new ArrayList<ResponsableFondo>());
						responsablefondoLogic.getResponsableFondos().addAll(responsablefondosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablefondos=new ArrayList<ResponsableFondo>();
							responsablefondos.addAll(responsablefondosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsablefondoLogic.getResponsableFondosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsablefondoLogic.getResponsableFondos()==null||responsablefondoLogic.getResponsableFondos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsablefondos==null|| responsablefondos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablefondosAux=new ArrayList<ResponsableFondo>();
						responsablefondosAux.addAll(responsablefondoLogic.getResponsableFondos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablefondosAux=new ArrayList<ResponsableFondo>();
							responsablefondosAux.addAll(responsablefondos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsablefondoLogic.getResponsableFondosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsableFondos("FK_IdEmpresa",responsablefondoLogic.getResponsableFondos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsableFondos("FK_IdEmpresa",responsablefondos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablefondoLogic.setResponsableFondos(new ArrayList<ResponsableFondo>());
						responsablefondoLogic.getResponsableFondos().addAll(responsablefondosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablefondos=new ArrayList<ResponsableFondo>();
							responsablefondos.addAll(responsablefondosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsablefondoLogic.getResponsableFondosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsablefondoLogic.getResponsableFondos()==null||responsablefondoLogic.getResponsableFondos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsablefondos==null|| responsablefondos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablefondosAux=new ArrayList<ResponsableFondo>();
						responsablefondosAux.addAll(responsablefondoLogic.getResponsableFondos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablefondosAux=new ArrayList<ResponsableFondo>();
							responsablefondosAux.addAll(responsablefondos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsablefondoLogic.getResponsableFondosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsableFondoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsableFondos("FK_IdSucursal",responsablefondoLogic.getResponsableFondos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsableFondos("FK_IdSucursal",responsablefondos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablefondoLogic.setResponsableFondos(new ArrayList<ResponsableFondo>());
						responsablefondoLogic.getResponsableFondos().addAll(responsablefondosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablefondos=new ArrayList<ResponsableFondo>();
							responsablefondos.addAll(responsablefondosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesResponsableFondo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessResponsableFondo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=responsablefondoLogic.getResponsableFondos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsablefondos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=responsablefondoLogic.getResponsableFondos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsablefondos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ResponsableFondo responsablefondo) {
		Boolean permite=true;
		
		if(this.responsablefondo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ResponsableFondoConstantesFunciones.getOrderByListaResponsableFondo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ResponsableFondoConstantesFunciones.getOrderByListaResponsableFondo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResponsableFondo responsablefondo:responsablefondoLogic.getResponsableFondos()) {
				if(responsablefondo.getsType().equals(Constantes2.S_TOTALES)) {
					responsablefondoTotales=responsablefondo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResponsableFondo responsablefondo:this.responsablefondos) {
				if(responsablefondo.getsType().equals(Constantes2.S_TOTALES)) {
					responsablefondoTotales=responsablefondo;
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
			this.responsablefondoAux=new ResponsableFondo();
			this.responsablefondoAux.setsType(Constantes2.S_TOTALES);
			this.responsablefondoAux.setIsNew(false);
			this.responsablefondoAux.setIsChanged(false);
			this.responsablefondoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ResponsableFondoConstantesFunciones.TotalizarValoresFilaResponsableFondo(this.responsablefondoLogic.getResponsableFondos(),this.responsablefondoAux);
				
				this.responsablefondoLogic.getResponsableFondos().add(this.responsablefondoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ResponsableFondoConstantesFunciones.TotalizarValoresFilaResponsableFondo(this.responsablefondos,this.responsablefondoAux);
				
				this.responsablefondos.add(this.responsablefondoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		responsablefondoTotales=new ResponsableFondo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.responsablefondoLogic.getResponsableFondos().remove(responsablefondoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.responsablefondos.remove(responsablefondoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		responsablefondoTotales=new ResponsableFondo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ResponsableFondo responsablefondo:responsablefondoLogic.getResponsableFondos()) {
				if(responsablefondo.getsType().equals(Constantes2.S_TOTALES)) {
					responsablefondoTotales=responsablefondo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResponsableFondoConstantesFunciones.TotalizarValoresFilaResponsableFondo(this.responsablefondoLogic.getResponsableFondos(),responsablefondoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ResponsableFondo responsablefondo:this.responsablefondos) {
				if(responsablefondo.getsType().equals(Constantes2.S_TOTALES)) {
					responsablefondoTotales=responsablefondo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResponsableFondoConstantesFunciones.TotalizarValoresFilaResponsableFondo(this.responsablefondos,responsablefondoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getResponsableFondosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsableFondosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsableFondosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsableFondoPorEmpresaPorSucursalPorEmpleado()throws Exception {
		try {
			sAccionBusqueda="PorEmpresaPorSucursalPorEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getResponsableFondosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsablefondoLogic.getResponsableFondosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsableFondosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsablefondoLogic.getResponsableFondosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsableFondosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsablefondoLogic.getResponsableFondosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsableFondoPorEmpresaPorSucursalPorEmpleado(Long id_empresa,Long id_sucursal,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsablefondoLogic.getResponsableFondoPorEmpresaPorSucursalPorEmpleado(id_empresa,id_sucursal,id_empleado);
				
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
	
	public void inicializarPermisosResponsableFondo() {
		this.isPermisoTodoResponsableFondo=false;
		this.isPermisoNuevoResponsableFondo=false;
		this.isPermisoActualizarResponsableFondo=false;
		this.isPermisoActualizarOriginalResponsableFondo=false;
		this.isPermisoEliminarResponsableFondo=false;
		this.isPermisoGuardarCambiosResponsableFondo=false;
		this.isPermisoConsultaResponsableFondo=false;
		this.isPermisoBusquedaResponsableFondo=false;
		this.isPermisoReporteResponsableFondo=false;		
		this.isPermisoOrdenResponsableFondo=false;		
		this.isPermisoPaginacionMedioResponsableFondo=false;		
		this.isPermisoPaginacionAltoResponsableFondo=false;
		this.isPermisoPaginacionTodoResponsableFondo=false;
		this.isPermisoCopiarResponsableFondo=false;		
		this.isPermisoVerFormResponsableFondo=false;		
		this.isPermisoDuplicarResponsableFondo=false;		
		this.isPermisoOrdenResponsableFondo=false;		
	}
	
	public void setPermisosUsuarioResponsableFondo(Boolean isPermiso) {
		this.isPermisoTodoResponsableFondo=isPermiso;
		this.isPermisoNuevoResponsableFondo=isPermiso;
		this.isPermisoActualizarResponsableFondo=isPermiso;
		this.isPermisoActualizarOriginalResponsableFondo=isPermiso;
		this.isPermisoEliminarResponsableFondo=isPermiso;
		this.isPermisoGuardarCambiosResponsableFondo=isPermiso;
		this.isPermisoConsultaResponsableFondo=isPermiso;
		this.isPermisoBusquedaResponsableFondo=isPermiso;
		this.isPermisoReporteResponsableFondo=isPermiso;
		this.isPermisoOrdenResponsableFondo=isPermiso;		
		this.isPermisoPaginacionMedioResponsableFondo=isPermiso;		
		this.isPermisoPaginacionAltoResponsableFondo=isPermiso;		
		this.isPermisoPaginacionTodoResponsableFondo=isPermiso;		
		this.isPermisoCopiarResponsableFondo=isPermiso;		
		this.isPermisoVerFormResponsableFondo=isPermiso;		
		this.isPermisoDuplicarResponsableFondo=isPermiso;
		this.isPermisoOrdenResponsableFondo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioResponsableFondo(Boolean isPermiso) {
		//this.isPermisoTodoResponsableFondo=isPermiso;
		this.isPermisoNuevoResponsableFondo=isPermiso;
		this.isPermisoActualizarResponsableFondo=isPermiso;
		this.isPermisoActualizarOriginalResponsableFondo=isPermiso;
		this.isPermisoEliminarResponsableFondo=isPermiso;
		this.isPermisoGuardarCambiosResponsableFondo=isPermiso;
		//this.isPermisoConsultaResponsableFondo=isPermiso;
		//this.isPermisoBusquedaResponsableFondo=isPermiso;
		//this.isPermisoReporteResponsableFondo=isPermiso;
		//this.isPermisoOrdenResponsableFondo=isPermiso;		
		//this.isPermisoPaginacionMedioResponsableFondo=isPermiso;		
		//this.isPermisoPaginacionAltoResponsableFondo=isPermiso;		
		//this.isPermisoPaginacionTodoResponsableFondo=isPermiso;		
		//this.isPermisoCopiarResponsableFondo=isPermiso;		
		//this.isPermisoDuplicarResponsableFondo=isPermiso;
		//this.isPermisoOrdenResponsableFondo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioResponsableFondoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FacturaProveedorConstantesFunciones.SNOMBREOPCION);
		
		if(ResponsableFondoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFacturaProveedor=false;
		this.isTienePermisosFacturaProveedor=this.verificarGetPermisosUsuarioOpcionResponsableFondoClaseRelacionada(this.opcionsRelacionadas,FacturaProveedorConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebResponsableFondo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioResponsableFondoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFacturaProveedor=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioResponsableFondoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionResponsableFondoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioResponsableFondoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFacturaProveedor && this.jInternalFrameDetalleFormResponsableFondo!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsableFondo.jTabbedPaneRelacionesResponsableFondo.remove(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioResponsableFondo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ResponsableFondoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ResponsableFondoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoResponsableFondo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarResponsableFondo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalResponsableFondo=this.isPermisoActualizarResponsableFondo;
			this.isPermisoEliminarResponsableFondo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosResponsableFondo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaResponsableFondo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaResponsableFondo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoResponsableFondo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteResponsableFondo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResponsableFondo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioResponsableFondo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoResponsableFondo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoResponsableFondo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarResponsableFondo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormResponsableFondo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarResponsableFondo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResponsableFondo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosResponsableFondo.setToolTipText(this.jTableDatosResponsableFondo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioResponsableFondo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioResponsableFondo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ResponsableFondoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ResponsableFondoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioResponsableFondo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFacturaProveedor && this.responsablefondoConstantesFunciones.mostrarFacturaProveedorResponsableFondo && !ResponsableFondoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura Proveedor");
			reporte.setsDescripcion("Factura Proveedor");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyResponsableFondoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyResponsableFondoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ResponsableFondoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyResponsableFondoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyResponsableFondoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ResponsableFondoParameterReturnGeneral responsablefondoReturnGeneral=new ResponsableFondoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.responsablefondoConstantesFunciones.cargarid_empresaResponsableFondo)
					 || (this.esRecargarFks && this.responsablefondoConstantesFunciones.cargarid_empresaResponsableFondo)) {

					if(!this.responsablefondoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+responsablefondoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.responsablefondoConstantesFunciones.cargarid_sucursalResponsableFondo)
					 || (this.esRecargarFks && this.responsablefondoConstantesFunciones.cargarid_sucursalResponsableFondo)) {

					if(!this.responsablefondoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+responsablefondoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.responsablefondoConstantesFunciones.cargarid_empleadoResponsableFondo)
					 || (this.esRecargarFks && this.responsablefondoConstantesFunciones.cargarid_empleadoResponsableFondo)) {

					if(!this.responsablefondoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+responsablefondoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				responsablefondoReturnGeneral=responsablefondoLogic.cargarCombosLoteForeignKeyResponsableFondo(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=responsablefondoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=responsablefondoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=responsablefondoReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyResponsableFondo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.responsablefondoSessionBean==null) {
				this.responsablefondoSessionBean=new ResponsableFondoSessionBean();
			}

			if(!this.responsablefondoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.responsablefondoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.responsablefondoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyResponsableFondo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyResponsableFondo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyResponsableFondo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyResponsableFondo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyResponsableFondo(ResponsableFondo responsablefondo)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(responsablefondo.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyResponsableFondo(ResponsableFondo responsablefondo,String sTipoEvento)throws Exception {	
		try {
			
			

				if(responsablefondo.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoResponsableFondo")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(responsablefondo.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyResponsableFondo()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.responsablefondoConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyResponsableFondo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyResponsableFondo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyResponsableFondo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroResponsableFondo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyResponsableFondo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyResponsableFondo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyResponsableFondo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo!=null && this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo!=null && this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo!=null && this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ResponsableFondoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ResponsableFondoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ResponsableFondoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.responsablefondoSessionBean=new ResponsableFondoSessionBean(); 
		this.responsablefondoConstantesFunciones=new ResponsableFondoConstantesFunciones(); 
		this.responsablefondoBean=new ResponsableFondo();//(this.responsablefondoConstantesFunciones); 		
		this.responsablefondoReturnGeneral=new ResponsableFondoParameterReturnGeneral(); 
		
		this.responsablefondoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsablefondoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ResponsableFondoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ResponsableFondoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ResponsableFondoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessResponsableFondo(true);
			
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
			
			this.responsablefondoConstantesFunciones=new ResponsableFondoConstantesFunciones(); 
			this.responsablefondoBean=new ResponsableFondo();//this.responsablefondoConstantesFunciones); 			
			this.responsablefondoReturnGeneral=new ResponsableFondoParameterReturnGeneral(); 
		
			ResponsableFondoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Responsable Fondo Rotativo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.responsablefondo=new ResponsableFondo();
			this.responsablefondos = new ArrayList<ResponsableFondo>();
			this.responsablefondosAux = new ArrayList<ResponsableFondo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic=new ResponsableFondoLogic();
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}
			
			//this.responsablefondoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.responsablefondoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormResponsableFondo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoResponsableFondo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResponsableFondo);	
					}
					
					if(this.jInternalFrameImportacionResponsableFondo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResponsableFondo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByResponsableFondo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByResponsableFondo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormResponsableFondo);
				this.jInternalFrameDetalleFormResponsableFondo.setVisible(false);
				this.jInternalFrameDetalleFormResponsableFondo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoResponsableFondo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResponsableFondo);
					this.jInternalFrameReporteDinamicoResponsableFondo.setVisible(false);
					this.jInternalFrameReporteDinamicoResponsableFondo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionResponsableFondo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionResponsableFondo);
					this.jInternalFrameImportacionResponsableFondo.setVisible(false);
					this.jInternalFrameImportacionResponsableFondo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByResponsableFondo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByResponsableFondo);
					this.jInternalFrameOrderByResponsableFondo.setVisible(false);
					this.jInternalFrameOrderByResponsableFondo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idResponsableFondoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ResponsableFondoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.responsablefondoReturnGeneral=new ResponsableFondoParameterReturnGeneral();
			
			this.responsablefondoParameterGeneral=new ResponsableFondoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.responsablefondoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ResponsableFondoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FacturaProveedorConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResponsableFondoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.responsablefondoSessionBean.getEsGuardarRelacionado(),this.responsablefondoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResponsableFondoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.responsablefondoSessionBean.getEsGuardarRelacionado(),this.responsablefondoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoResponsableFondo=false;
			this.isVisibilidadCeldaDuplicarResponsableFondo=true;
			this.isVisibilidadCeldaCopiarResponsableFondo=true;
			this.isVisibilidadCeldaVerFormResponsableFondo=true;
			this.isVisibilidadCeldaOrdenResponsableFondo=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=false;
			this.isVisibilidadCeldaModificarResponsableFondo=false;
			this.isVisibilidadCeldaActualizarResponsableFondo=false;
			this.isVisibilidadCeldaEliminarResponsableFondo=false;
			this.isVisibilidadCeldaCancelarResponsableFondo=false;
			this.isVisibilidadCeldaGuardarResponsableFondo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesResponsableFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosResponsableFondo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioResponsableFondo(false);
			
			this.setPermisosUsuarioResponsableFondo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsablefondoSessionBean.getEsGuardarRelacionado() 
				|| (this.responsablefondoSessionBean.getEsGuardarRelacionado() && this.responsablefondoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioResponsableFondoClasesRelacionadas();
			}
			
			if(this.responsablefondoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioResponsableFondoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosResponsableFondo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualResponsableFondo();
			}
			
			if(!this.isPermisoBusquedaResponsableFondo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasResponsableFondo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioResponsableFondo,this.isPermisoPaginacionMedioResponsableFondo,this.isPermisoPaginacionTodoResponsableFondo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ResponsableFondoConstantesFunciones.getTiposSeleccionarResponsableFondo());
				
				this.tiposColumnasSelect=ResponsableFondoConstantesFunciones.getTiposSeleccionarResponsableFondo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectResponsableFondo();				
				//this.tiposRelacionesSelect=ResponsableFondoConstantesFunciones.getTiposRelacionesResponsableFondo(true);
				
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
			//if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioResponsableFondo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioResponsableFondo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioResponsableFondo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsableFondo() ;
			
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
			
			
			this.facturaproveedorLogic=new FacturaProveedorLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
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
				responsablefondoImplementable= (ResponsableFondoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResponsableFondoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				responsablefondoImplementableHome= (ResponsableFondoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResponsableFondoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.responsablefondos= new ArrayList<ResponsableFondo>();
			this.responsablefondosEliminados= new ArrayList<ResponsableFondo>();
						
			this.isEsNuevoResponsableFondo=false;
			this.esParaAccionDesdeFormularioResponsableFondo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyResponsableFondo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroResponsableFondo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ResponsableFondoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ResponsableFondoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesResponsableFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingResponsableFondo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormResponsableFondo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioResponsableFondo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioResponsableFondo();
			}
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasResponsableFondo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasResponsableFondo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasResponsableFondo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessResponsableFondo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ResponsableFondo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectResponsableFondo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesResponsableFondo")) {
				iIndex=this.jInternalFrameDetalleFormResponsableFondo.jTabbedPaneRelacionesResponsableFondo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormResponsableFondo.jTabbedPaneRelacionesResponsableFondo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();	
				
				

				if(sTitle.equals("Factura Proveedors")) {
					if(!FacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessResponsableFondo();

						this.cargarParteTabPanelRelacionadaFacturaProveedor(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessResponsableFondo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFacturaProveedor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormResponsableFondo.cargarSessionConBeanSwingJInternalFrameFacturaProveedor(false,true,iIndex);
		this.jButtonFacturaProveedorActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFacturaProveedor();

		//this.jTabbedPaneRelacionesResponsableFondo.updateUI();
		//this.jTabbedPaneRelacionesResponsableFondo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesResponsableFondo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FacturaProveedor")) {
				int row=this.jTableDatosResponsableFondo.getSelectedRow();
				jButtonFacturaProveedorActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Factura Proveedor")) {

					if(this.isTienePermisosFacturaProveedor && this.responsablefondoConstantesFunciones.mostrarFacturaProveedorResponsableFondo && !ResponsableFondoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Factura Proveedors"+"("+FacturaProveedorConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Factura Proveedors");

						if(responsablefondoConstantesFunciones.resaltarFacturaProveedorResponsableFondo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(responsablefondoConstantesFunciones.resaltarFacturaProveedorResponsableFondo);
						}

						jmenuItem.setEnabled(this.responsablefondoConstantesFunciones.activarFacturaProveedorResponsableFondo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FacturaProveedor"));

						

						this.jInternalFrameDetalleFormResponsableFondo.jmenuDetalleResponsableFondo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyResponsableFondo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyResponsableFondo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyResponsableFondo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyResponsableFondoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyResponsableFondo();
		
		this.cargarCombosFrameForeignKeyResponsableFondo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyResponsableFondo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyResponsableFondo();
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
	
	public void jButtonNuevoResponsableFondoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.responsablefondoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
			
			if(jTableDatosResponsableFondo.getRowCount()>=1) {
				jTableDatosResponsableFondo.removeRowSelectionInterval(0, jTableDatosResponsableFondo.getRowCount()-1);						
			}
			
			this.isEsNuevoResponsableFondo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoResponsableFondo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesResponsableFondo(true);			
			//this.responsablefondo=new ResponsableFondo();
			//this.responsablefondo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsableFondo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsableFondo() ;
			
			if(ResponsableFondoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsableFondo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.responsablefondo);	
			this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);				
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
			if(this.responsablefondoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ResponsableFondo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarResponsableFondoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosResponsableFondo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosResponsableFondo.getSelectedRows().length;			
			}
			
			responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoResponsableFondo--;			
				//ResponsableFondo responsablefondoAux= new ResponsableFondo();			
				//responsablefondoAux.setId(this.iIdNuevoResponsableFondo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ResponsableFondo responsablefondoOrigen=new ResponsableFondo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ResponsableFondo responsablefondoOrigen : responsablefondosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							responsablefondoOrigen =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablefondoOrigen =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaResponsableFondo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.responsablefondo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosResponsableFondo(responsablefondoOrigen,this.responsablefondo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.responsablefondoLogic.getResponsableFondos().add(this.responsablefondoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.responsablefondos.add(this.responsablefondoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaResponsableFondo(false);
				
				this.jTableDatosResponsableFondo.setRowSelectionInterval(this.getIndiceNuevoResponsableFondo(), this.getIndiceNuevoResponsableFondo());
				
				int iLastRow =  this.jTableDatosResponsableFondo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResponsableFondo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResponsableFondo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsableFondo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarResponsableFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();									
		
			ResponsableFondo responsablefondoOrigen=new ResponsableFondo();
			ResponsableFondo responsablefondoDestino=new ResponsableFondo();
				
			responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosResponsableFondo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || responsablefondosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosResponsableFondo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablefondoOrigen =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						responsablefondoOrigen =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablefondoDestino =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						responsablefondoDestino =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				responsablefondoOrigen =responsablefondosSeleccionados.get(0);
				responsablefondoDestino =responsablefondosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosResponsableFondo(responsablefondoOrigen,responsablefondoDestino,true,false);
				
				responsablefondoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(responsablefondoDestino,responsablefondoLogic.getResponsableFondos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsablefondoDestino,responsablefondos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaResponsableFondo(false);
				
				//this.jTableDatosResponsableFondo.setRowSelectionInterval(this.getIndiceNuevoResponsableFondo(), this.getIndiceNuevoResponsableFondo());
				
				int iLastRow =  this.jTableDatosResponsableFondo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResponsableFondo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResponsableFondo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsableFondo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormResponsableFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormResponsableFondo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarResponsableFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesResponsableFondo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasResponsableFondo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesResponsableFondo.setVisible(!isVisible);
			this.jPanelPaginacionResponsableFondo.setVisible(!isVisible);
			this.jPanelAccionesResponsableFondo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarResponsableFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameResponsableFondo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoResponsableFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoResponsableFondo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionResponsableFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionResponsableFondo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByResponsableFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByResponsableFondo();
			
			this.abrirFrameOrderByResponsableFondo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByResponsableFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByResponsableFondo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleResponsableFondo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormResponsableFondo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormResponsableFondo.isMaximum()) {
					this.jInternalFrameDetalleFormResponsableFondo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormResponsableFondo.setSize(this.jInternalFrameDetalleFormResponsableFondo.iWidthFormulario,this.jInternalFrameDetalleFormResponsableFondo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormResponsableFondo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormResponsableFondo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormResponsableFondo.isMaximum()) {
						this.jInternalFrameDetalleFormResponsableFondo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormResponsableFondo.jContentPaneDetalleResponsableFondo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormResponsableFondo.jTabbedPaneRelacionesResponsableFondo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormResponsableFondo.jContentPaneDetalleResponsableFondo.getWidth(),ResponsableFondoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResponsableFondo.jTabbedPaneRelacionesResponsableFondo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormResponsableFondo.jContentPaneDetalleResponsableFondo.getWidth(),ResponsableFondoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResponsableFondo.jTabbedPaneRelacionesResponsableFondo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormResponsableFondo.jContentPaneDetalleResponsableFondo.getWidth(),ResponsableFondoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFacturaProveedor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormResponsableFondo.setVisible(true);
	        this.jInternalFrameDetalleFormResponsableFondo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByResponsableFondo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByResponsableFondo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByResponsableFondo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsableFondo,false,this);
				} else {
					this.jInternalFrameOrderByResponsableFondo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsableFondo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByResponsableFondo);
				this.jInternalFrameOrderByResponsableFondo.setVisible(false);
				this.jInternalFrameOrderByResponsableFondo.setSelected(false);
				
				this.jInternalFrameOrderByResponsableFondo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResponsableFondo"));
				
				this.inicializarActualizarBindingTablaOrderByResponsableFondo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionResponsableFondo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionResponsableFondo==null) {
				
				this.jInternalFrameImportacionResponsableFondo=new ImportacionJInternalFrame(ResponsableFondoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResponsableFondo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionResponsableFondo);
				this.jInternalFrameImportacionResponsableFondo.setVisible(false);
				this.jInternalFrameImportacionResponsableFondo.setSelected(false);


				this.jInternalFrameImportacionResponsableFondo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResponsableFondo"));
				this.jInternalFrameImportacionResponsableFondo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResponsableFondo"));
				this.jInternalFrameImportacionResponsableFondo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResponsableFondo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoResponsableFondo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoResponsableFondo==null) {
				this.jInternalFrameReporteDinamicoResponsableFondo=new ReporteDinamicoJInternalFrame(ResponsableFondoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResponsableFondo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResponsableFondo);
				this.jInternalFrameReporteDinamicoResponsableFondo.setVisible(false);
				this.jInternalFrameReporteDinamicoResponsableFondo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoResponsableFondo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsableFondo"));
				this.jInternalFrameReporteDinamicoResponsableFondo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsableFondo"));
				this.jInternalFrameReporteDinamicoResponsableFondo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsableFondo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsableFondo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFacturaProveedor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormResponsableFondo.jContentPaneDetalleResponsableFondo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleResponsableFondo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormResponsableFondo);
			
	       	this.jInternalFrameDetalleFormResponsableFondo.setVisible(false);
	        this.jInternalFrameDetalleFormResponsableFondo.setSelected(false);
			
			//this.jInternalFrameDetalleFormResponsableFondo.dispose();
			//this.jInternalFrameDetalleFormResponsableFondo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoResponsableFondo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoResponsableFondo.setVisible(true);
	        this.jInternalFrameReporteDinamicoResponsableFondo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionResponsableFondo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionResponsableFondo.setVisible(true);
	        this.jInternalFrameImportacionResponsableFondo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByResponsableFondo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByResponsableFondo.setVisible(true);
	        this.jInternalFrameOrderByResponsableFondo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByResponsableFondo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByResponsableFondo.setVisible(false);
	        this.jInternalFrameOrderByResponsableFondo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoResponsableFondo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoResponsableFondo.setVisible(false);
	        this.jInternalFrameReporteDinamicoResponsableFondo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionResponsableFondo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionResponsableFondo.setVisible(false);
	        this.jInternalFrameImportacionResponsableFondo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarResponsableFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarResponsableFondo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarResponsableFondo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesResponsableFondo(true);
			//this.isEsNuevoResponsableFondo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesResponsableFondo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsableFondo(false) ;
			
			if(responsablefondoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorSessionBean.getEsGuardarRelacionado() && FacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaProveedorActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ResponsableFondoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsableFondo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsableFondo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaResponsableFondoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarResponsableFondo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesResponsableFondo(true);
			//this.isEsNuevoResponsableFondo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.responsablefondo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesResponsableFondo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesResponsableFondo(false) ;
			
			if(ResponsableFondoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsableFondo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsableFondo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.responsablefondoConstantesFunciones.cargarid_empleadoResponsableFondo) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingResponsableFondo(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosResponsableFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableFondo,ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosResponsableFondo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarResponsableFondoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesResponsableFondo(false);
			
			//if(!this.isEsNuevoResponsableFondo) {								
				int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
				
			}
			
			if(this.permiteMantenimiento(this.responsablefondo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoResponsableFondo=true;
					this.inicializarActualizarBindingTablaResponsableFondo(false);
					this.isEsNuevoResponsableFondo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoResponsableFondo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoResponsableFondo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResponsableFondo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsableFondo(false);
				
				this.habilitarDeshabilitarControlesResponsableFondo(false);
			
												
				
				if(ResponsableFondoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleResponsableFondo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoResponsableFondoActionPerformed(evt,responsablefondoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualResponsableFondo(this.responsablefondo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosResponsableFondo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,responsablefondoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.responsablefondo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ResponsableFondo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableFondo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarResponsableFondoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				this.responsablefondo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				this.responsablefondo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.responsablefondo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ResponsableFondoModel) this.jTableDatosResponsableFondo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoResponsableFondo=true;
				this.inicializarActualizarBindingTablaResponsableFondo(false);
				this.isEsNuevoResponsableFondo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResponsableFondo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsableFondo(false);
				
				this.habilitarDeshabilitarControlesResponsableFondo(false);
				
				
				
				if(ResponsableFondoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleResponsableFondo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarResponsableFondoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosResponsableFondo.getRowCount()>=1) {
				jTableDatosResponsableFondo.removeRowSelectionInterval(0, jTableDatosResponsableFondo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesResponsableFondo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaResponsableFondo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsableFondo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsableFondo(false) ;
			
			this.isEsNuevoResponsableFondo=false;
			
			if(ResponsableFondoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleResponsableFondo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosResponsableFondoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingResponsableFondo(false);
				
				//SI ES MANUAL
				if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualResponsableFondo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosResponsableFondoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoResponsableFondo--;			
			//ResponsableFondo responsablefondoAux= new ResponsableFondo();			
			//responsablefondoAux.setId(this.iIdNuevoResponsableFondo);
			
			if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaResponsableFondo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
			
			this.responsablefondo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.responsablefondoLogic.getResponsableFondos().add(this.responsablefondoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.responsablefondos.add(this.responsablefondoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaResponsableFondo(false);
			
			this.jTableDatosResponsableFondo.setRowSelectionInterval(this.getIndiceNuevoResponsableFondo(), this.getIndiceNuevoResponsableFondo());
			
			int iLastRow =  this.jTableDatosResponsableFondo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosResponsableFondo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosResponsableFondo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaResponsableFondo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionResponsableFondoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingResponsableFondo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsableFondo(false);
			
			//SI ES MANUAL
			if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsableFondo();
			}
			
			//this.abrirFrameTreeResponsableFondo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionResponsableFondoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Responsable Fondo RotativoS ?", "MANTENIMIENTO DE Responsable Fondo Rotativo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionResponsableFondo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralResponsableFondo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.responsablefondoReturnGeneral=responsablefondoLogic.procesarImportacionResponsableFondosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.responsablefondoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarResponsableFondoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionResponsableFondoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionResponsableFondo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionResponsableFondo.setFileImportacion(this.jInternalFrameImportacionResponsableFondo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionResponsableFondo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionResponsableFondo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionResponsableFondo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionResponsableFondo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoResponsableFondoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();		

		responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ResponsableFondoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ResponsableFondoBaseDesign.jrxml";
			
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
			
			this.generarReporteResponsableFondos("Todos",responsablefondosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Fondo Rotativo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsableFondoConstantesFunciones.LABEL_VALORCAJA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCaja_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoResponsableFondo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case ResponsableFondoConstantesFunciones.LABEL_VALORCAJA:
					sNombreCampoCategoria="valor_caja";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case ResponsableFondoConstantesFunciones.LABEL_VALORCAJA:
					sNombreCampoCategoriaValor="valor_caja";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case ResponsableFondoConstantesFunciones.LABEL_VALORCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_caja");
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
	
	public void jButtonGenerarExcelReporteDinamicoResponsableFondoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();		
		
		responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsablefondo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ResponsableFondos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ResponsableFondo responsablefondo:responsablefondosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsablefondo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ResponsableFondo responsablefondo:responsablefondosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsablefondo.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(ResponsableFondo responsablefondo:responsablefondosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsablefondo.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(ResponsableFondo responsablefondo:responsablefondosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsablefondo.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsableFondoConstantesFunciones.LABEL_VALORCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_VALORCAJA);
					iRow++;

					for(ResponsableFondo responsablefondo:responsablefondosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsablefondo.getvalor_caja());
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
			//	this.getFilaCabeceraExportarExcelResponsableFondo(row);				
			//	iRow++;
			//}				
			
			//for(ResponsableFondo responsablefondoAux:responsablefondosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelResponsableFondo(responsablefondoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Fondo Rotativo",JOptionPane.INFORMATION_MESSAGE);
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
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsableFondo(false);
			
			//SI ES MANUAL
			if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsableFondo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresResponsableFondoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsableFondo(false);
			
			//SI ES MANUAL
			if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResponsableFondo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesResponsableFondoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsableFondo(false);
			
			//SI ES MANUAL
			if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResponsableFondo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaResponsableFondo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosResponsableFondo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosResponsableFondo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosResponsableFondo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosResponsableFondo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosResponsableFondo.setMinimumSize(dimensionMinimum);
		this.jTableDatosResponsableFondo.setMaximumSize(dimensionMaximum);
		this.jTableDatosResponsableFondo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingResponsableFondo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingResponsableFondo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingResponsableFondo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaResponsableFondo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesResponsableFondo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasResponsableFondo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsableFondo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesResponsableFondo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ResponsableFondoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualResponsableFondo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaResponsableFondo();
		
		this.inicializarActualizarBindingBotonesManualResponsableFondo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualResponsableFondo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsableFondo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualResponsableFondo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualResponsableFondo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosResponsableFondo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosResponsableFondo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteResponsableFondo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormResponsableFondo.jCheckBoxPostAccionNuevoResponsableFondo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormResponsableFondo.jCheckBoxPostAccionSinCerrarResponsableFondo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormResponsableFondo.jCheckBoxPostAccionSinMensajeResponsableFondo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosResponsableFondo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosResponsableFondo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteResponsableFondo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
				this.jInternalFrameDetalleFormResponsableFondo.jCheckBoxPostAccionNuevoResponsableFondo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormResponsableFondo.jCheckBoxPostAccionSinCerrarResponsableFondo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormResponsableFondo.jCheckBoxPostAccionSinMensajeResponsableFondo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionResponsableFondo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionResponsableFondo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesResponsableFondo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoResponsableFondo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesResponsableFondo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesResponsableFondo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarResponsableFondo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesResponsableFondo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoResponsableFondo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesResponsableFondo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralResponsableFondo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesResponsableFondo(Boolean esInicializar) throws Exception {
		try	{	
			if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualResponsableFondo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesResponsableFondo() throws Exception {
		try	{
			if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualResponsableFondo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResponsableFondo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualResponsableFondo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesResponsableFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesResponsableFondo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesResponsableFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesResponsableFondo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesResponsableFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesResponsableFondo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionResponsableFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionResponsableFondo.addItem(reporte);
			}
			
			
			if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionResponsableFondo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionResponsableFondo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesResponsableFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesResponsableFondo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesResponsableFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesResponsableFondo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarResponsableFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarResponsableFondo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarResponsableFondo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsableFondo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsableFondo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResponsableFondo!=null) {
				this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResponsableFondo!=null) {
				this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoResponsableFondo!=null) {
				
				if(this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoResponsableFondo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResponsableFondo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResponsableFondo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ResponsableFondoConstantesFunciones.getTiposSeleccionarResponsableFondo(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ResponsableFondoConstantesFunciones.getTiposSeleccionarResponsableFondo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ResponsableFondoConstantesFunciones.getTiposSeleccionarResponsableFondo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResponsableFondo.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoResponsableFondo.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualResponsableFondo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoResponsableFondo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasResponsableFondo(Boolean esInicializar) throws Exception {				
		if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualResponsableFondo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaResponsableFondo() throws Exception {
		this.inicializarActualizarBindingTablaResponsableFondo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByResponsableFondo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ResponsableFondoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ResponsableFondoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosResponsableFondoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableFondoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ResponsableFondoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ResponsableFondoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaResponsableFondo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=responsablefondoLogic.getResponsableFondos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=responsablefondos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosResponsableFondo.setModel(new ResponsableFondoModel(this.responsablefondoLogic.getResponsableFondos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosResponsableFondo.setModel(new ResponsableFondoModel(this.responsablefondos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByResponsableFondo!=null && this.jInternalFrameOrderByResponsableFondo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByResponsableFondo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosResponsableFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableFondo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ResponsableFondoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO,responsablefondoConstantesFunciones.resaltarSeleccionarResponsableFondo,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO,responsablefondoConstantesFunciones.resaltarSeleccionarResponsableFondo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosResponsableFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableFondo,ResponsableFondoConstantesFunciones.LABEL_ID));

		if(this.responsablefondoConstantesFunciones.mostraridResponsableFondo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableFondoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.responsablefondoConstantesFunciones.resaltaridResponsableFondo,this.responsablefondoConstantesFunciones.activaridResponsableFondo,iSizeTabla,this,true,"idResponsableFondo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablefondoConstantesFunciones.resaltaridResponsableFondo,this.responsablefondoConstantesFunciones.activaridResponsableFondo,this,true,"idResponsableFondo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableFondo,ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.responsablefondoConstantesFunciones.mostrarid_empresaResponsableFondo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.responsablefondoConstantesFunciones.resaltarid_empresaResponsableFondo,this,this.responsablefondoConstantesFunciones.activarid_empresaResponsableFondo,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.responsablefondoConstantesFunciones.resaltarid_empresaResponsableFondo,this,this.responsablefondoConstantesFunciones.activarid_empresaResponsableFondo,false,"id_empresaResponsableFondo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsableFondoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableFondo,ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.responsablefondoConstantesFunciones.mostrarid_sucursalResponsableFondo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.responsablefondoConstantesFunciones.resaltarid_sucursalResponsableFondo,this,this.responsablefondoConstantesFunciones.activarid_sucursalResponsableFondo,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.responsablefondoConstantesFunciones.resaltarid_sucursalResponsableFondo,this,this.responsablefondoConstantesFunciones.activarid_sucursalResponsableFondo,false,"id_sucursalResponsableFondo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsableFondoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableFondo,ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.responsablefondoConstantesFunciones.mostrarid_empleadoResponsableFondo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.responsablefondoConstantesFunciones.resaltarid_empleadoResponsableFondo,this,this.responsablefondoConstantesFunciones.activarid_empleadoResponsableFondo,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.responsablefondoConstantesFunciones.resaltarid_empleadoResponsableFondo,this,this.responsablefondoConstantesFunciones.activarid_empleadoResponsableFondo,true,"id_empleadoResponsableFondo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ResponsableFondoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableFondo,ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL));

		if(this.responsablefondoConstantesFunciones.mostrarsecuencialResponsableFondo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.responsablefondoConstantesFunciones.resaltarsecuencialResponsableFondo,this.responsablefondoConstantesFunciones.activarsecuencialResponsableFondo,iSizeTabla,this,true,"secuencialResponsableFondo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablefondoConstantesFunciones.resaltarsecuencialResponsableFondo,this.responsablefondoConstantesFunciones.activarsecuencialResponsableFondo,this,true,"secuencialResponsableFondo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ResponsableFondoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsableFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsableFondo,ResponsableFondoConstantesFunciones.LABEL_VALORCAJA));

		if(this.responsablefondoConstantesFunciones.mostrarvalor_cajaResponsableFondo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsableFondoConstantesFunciones.LABEL_VALORCAJA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.responsablefondoConstantesFunciones.resaltarvalor_cajaResponsableFondo,this.responsablefondoConstantesFunciones.activarvalor_cajaResponsableFondo,iSizeTabla,this,true,"valor_cajaResponsableFondo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablefondoConstantesFunciones.resaltarvalor_cajaResponsableFondo,this.responsablefondoConstantesFunciones.activarvalor_cajaResponsableFondo,this,true,"valor_cajaResponsableFondo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ResponsableFondoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFacturaProveedor && this.responsablefondoConstantesFunciones.mostrarFacturaProveedorResponsableFondo && !ResponsableFondoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Factura Proveedors");
				tableColumn.setHeaderValue("Factura Proveedors");
				tableColumn.setCellRenderer(new FacturaProveedorTableCell(responsablefondoConstantesFunciones.resaltarFacturaProveedorResponsableFondo,this,this.responsablefondoConstantesFunciones.activarFacturaProveedorResponsableFondo));
				tableColumn.setCellEditor(new FacturaProveedorTableCell(responsablefondoConstantesFunciones.resaltarFacturaProveedorResponsableFondo,this,this.responsablefondoConstantesFunciones.activarFacturaProveedorResponsableFondo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosResponsableFondo.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.responsablefondoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.responsablefondoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResponsableFondo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.responsablefondoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.responsablefondoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResponsableFondo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.responsablefondoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.responsablefondoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosResponsableFondo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.responsablefondoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosResponsableFondo.addColumn(tableColumn);
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
			
			this.jTableDatosResponsableFondo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.responsablefondoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosResponsableFondo.moveColumn(this.jTableDatosResponsableFondo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosResponsableFondo.moveColumn(this.jTableDatosResponsableFondo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.responsablefondoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosResponsableFondo.moveColumn(this.jTableDatosResponsableFondo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosResponsableFondo.moveColumn(this.jTableDatosResponsableFondo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosResponsableFondo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosResponsableFondo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosResponsableFondo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosResponsableFondo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosResponsableFondo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ResponsableFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosResponsableFondo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosResponsableFondo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosResponsableFondo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=responsablefondoLogic.getResponsableFondos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=responsablefondos.size()-1;
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
		//this.jTableDatosResponsableFondo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosResponsableFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosResponsableFondo();
			
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
				
				//this.isEsNuevoResponsableFondo=false;
					
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
				if(this.responsablefondoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormResponsableFondo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResponsableFondo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResponsableFondo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.responsablefondo.getsType().equals("DUPLICADO")
				   || this.responsablefondo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoResponsableFondo=true;
				
				} else {
					this.isEsNuevoResponsableFondo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
					if(this.responsablefondo.getId()>=0 && !this.responsablefondo.getIsNew()) {						
						this.isEsNuevoResponsableFondo=false;
						
					} else {
						this.isEsNuevoResponsableFondo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoResponsableFondo(esRelaciones);						
				
				this.seleccionarResponsableFondo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.responsablefondo.getId()<0) {
					this.isEsNuevoResponsableFondo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarResponsableFondo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarResponsableFondo(evt,rowIndex);
				}	
				
				if(this.responsablefondoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ResponsableFondo: " + this.dDif); 
					}
				}								
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarResponsableFondo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.responsablefondo)) {
					if(this.responsablefondo.getId()>0) {
						this.responsablefondo.setIsDeleted(true);
						
						this.responsablefondosEliminados.add(this.responsablefondo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.responsablefondoLogic.getResponsableFondos().remove(this.responsablefondo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.responsablefondos.remove(this.responsablefondo);				
					}
					
					
					((ResponsableFondoModel) this.jTableDatosResponsableFondo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsableFondo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarResponsableFondo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoResponsableFondo) {
			
			if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResponsableFondo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResponsableFondo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioResponsableFondo(this.responsablefondo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.responsablefondoConstantesFunciones.cargarid_empresaResponsableFondo || this.responsablefondoConstantesFunciones.event_dependid_empresaResponsableFondo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.responsablefondo.getid_empresa());
									//this.inicializarActualizarBindingResponsableFondo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(responsablefondo.getEmpresa()!=null) {
							this.empresasForeignKey.add(responsablefondo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.responsablefondo.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.responsablefondoConstantesFunciones.cargarid_sucursalResponsableFondo || this.responsablefondoConstantesFunciones.event_dependid_sucursalResponsableFondo) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.responsablefondo.getid_sucursal());
									//this.inicializarActualizarBindingResponsableFondo(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(responsablefondo.getSucursal()!=null) {
							this.sucursalsForeignKey.add(responsablefondo.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.responsablefondo.getid_sucursal(),false,"Formulario");

					//Empleado
					if(!this.responsablefondoConstantesFunciones.cargarid_empleadoResponsableFondo || this.responsablefondoConstantesFunciones.event_dependid_empleadoResponsableFondo) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.responsablefondo.getid_empleado());
									//this.inicializarActualizarBindingResponsableFondo(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(responsablefondo.getEmpleado()!=null) {
							this.empleadosForeignKey.add(responsablefondo.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.responsablefondo.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesResponsableFondo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesResponsableFondo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsableFondo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoResponsableFondo(ResponsableFondo responsablefondo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoResponsableFondo(responsablefondo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoResponsableFondo(ResponsableFondo responsablefondo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioResponsableFondo(responsablefondo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyResponsableFondo(responsablefondo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyResponsableFondo(responsablefondo);
	}
	
	public void setVariablesObjetoActualToFormularioResponsableFondo(ResponsableFondo responsablefondo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormResponsableFondo.jLabelidResponsableFondo.setText(responsablefondo.getId().toString());
			this.jInternalFrameDetalleFormResponsableFondo.jTextFieldsecuencialResponsableFondo.setText(responsablefondo.getsecuencial().toString());
			this.jInternalFrameDetalleFormResponsableFondo.jTextFieldvalor_cajaResponsableFondo.setText(responsablefondo.getvalor_caja().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ResponsableFondo responsablefondoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,responsablefondoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ResponsableFondo responsablefondoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				responsablefondoLocal=this.responsablefondo;
			} else {
				responsablefondoLocal=this.responsablefondoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(responsablefondoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoResponsableFondo(responsablefondoLocal,true);
					
					if(responsablefondoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(responsablefondoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(responsablefondoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoResponsableFondo(ResponsableFondo responsablefondo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResponsableFondo(responsablefondo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(responsablefondo);
	}
	
	public void setVariablesFormularioToObjetoActualResponsableFondo(ResponsableFondo responsablefondo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResponsableFondo(responsablefondo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualResponsableFondo(ResponsableFondo responsablefondo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormResponsableFondo.jLabelidResponsableFondo.getText()==null || this.jInternalFrameDetalleFormResponsableFondo.jLabelidResponsableFondo.getText()=="" || this.jInternalFrameDetalleFormResponsableFondo.jLabelidResponsableFondo.getText()=="Id") {
				this.jInternalFrameDetalleFormResponsableFondo.jLabelidResponsableFondo.setText("0");
			}

			if(conColumnasBase) {responsablefondo.setId(Long.parseLong(this.jInternalFrameDetalleFormResponsableFondo.jLabelidResponsableFondo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableFondoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableFondo.jLabelIdResponsableFondo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsablefondo.setsecuencial(Long.parseLong(this.jInternalFrameDetalleFormResponsableFondo.jTextFieldsecuencialResponsableFondo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableFondo.jLabelsecuencialResponsableFondo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsablefondo.setvalor_caja(Double.parseDouble(this.jInternalFrameDetalleFormResponsableFondo.jTextFieldvalor_cajaResponsableFondo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsableFondoConstantesFunciones.LABEL_VALORCAJA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsableFondo.jLabelvalor_cajaResponsableFondo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResponsableFondo(ResponsableFondo responsablefondoBean,ResponsableFondo responsablefondo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && responsablefondoBean.getid_empleado()!=null && !responsablefondoBean.getid_empleado().equals(-1L))) {responsablefondo.setid_empleado(responsablefondoBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosResponsableFondo(ResponsableFondo responsablefondoOrigen,ResponsableFondo responsablefondo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && responsablefondoOrigen.getId()!=null && !responsablefondoOrigen.getId().equals(0L))) {responsablefondo.setId(responsablefondoOrigen.getId());}}
			if(conDefault || (!conDefault && responsablefondoOrigen.getid_empleado()!=null && !responsablefondoOrigen.getid_empleado().equals(-1L))) {responsablefondo.setid_empleado(responsablefondoOrigen.getid_empleado());}
			if(conDefault || (!conDefault && responsablefondoOrigen.getsecuencial()!=null && !responsablefondoOrigen.getsecuencial().equals(0L))) {responsablefondo.setsecuencial(responsablefondoOrigen.getsecuencial());}
			if(conDefault || (!conDefault && responsablefondoOrigen.getvalor_caja()!=null && !responsablefondoOrigen.getvalor_caja().equals(0.0))) {responsablefondo.setvalor_caja(responsablefondoOrigen.getvalor_caja());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResponsableFondo(ResponsableFondo responsablefondo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResponsableFondo.jLabelidResponsableFondo.setText(responsablefondo.getId().toString());
			this.jInternalFrameDetalleFormResponsableFondo.jTextFieldsecuencialResponsableFondo.setText(responsablefondo.getsecuencial().toString());
			this.jInternalFrameDetalleFormResponsableFondo.jTextFieldvalor_cajaResponsableFondo.setText(responsablefondo.getvalor_caja().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResponsableFondo(ResponsableFondoBean responsablefondoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResponsableFondo.jLabelidResponsableFondo.setText(responsablefondoBean.getId().toString());
			this.jInternalFrameDetalleFormResponsableFondo.jTextFieldsecuencialResponsableFondo.setText(responsablefondoBean.getsecuencial().toString());
			this.jInternalFrameDetalleFormResponsableFondo.jTextFieldvalor_cajaResponsableFondo.setText(responsablefondoBean.getvalor_caja().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanResponsableFondo(ResponsableFondoParameterReturnGeneral responsablefondoReturnGeneral,ResponsableFondoBean responsablefondoBean,Boolean conDefault) throws Exception { 
		try {
			ResponsableFondo responsablefondoLocal=new ResponsableFondo();
			
			responsablefondoLocal=responsablefondoReturnGeneral.getResponsableFondo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && responsablefondoLocal.getId()!=null && !responsablefondoLocal.getId().equals(0L))) {responsablefondoBean.setId(responsablefondoLocal.getId());}}
			if(conDefault || (!conDefault && responsablefondoLocal.getid_empleado()!=null && !responsablefondoLocal.getid_empleado().equals(-1L))) {responsablefondoBean.setid_empleado(responsablefondoLocal.getid_empleado());}
			if(conDefault || (!conDefault && responsablefondoLocal.getsecuencial()!=null && !responsablefondoLocal.getsecuencial().equals(0L))) {responsablefondoBean.setsecuencial(responsablefondoLocal.getsecuencial());}
			if(conDefault || (!conDefault && responsablefondoLocal.getvalor_caja()!=null && !responsablefondoLocal.getvalor_caja().equals(0.0))) {responsablefondoBean.setvalor_caja(responsablefondoLocal.getvalor_caja());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxResponsableFondoGenerico(Long idResponsableFondoSeleccionado,JComboBox jComboBoxResponsableFondo,List<ResponsableFondo> responsablefondosLocal)throws Exception {
		try {
			ResponsableFondo  responsablefondoTemp=null;

			for(ResponsableFondo responsablefondoAux:responsablefondosLocal) {
				if(responsablefondoAux.getId()!=null && responsablefondoAux.getId().equals(idResponsableFondoSeleccionado)) {
					responsablefondoTemp=responsablefondoAux;
					break;
				}
			}

			jComboBoxResponsableFondo.setSelectedItem(responsablefondoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxResponsableFondoGenerico(JComboBox jComboBoxResponsableFondo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResponsableFondo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxResponsableFondo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResponsableFondo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxResponsableFondo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("FacturaProveedor")) {
			jButtonFacturaProveedorActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsablefondo=(ResponsableFondo) responsablefondoLogic.getResponsableFondos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			responsablefondo =(ResponsableFondo) responsablefondos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!responsablefondo.getIsNew() && !responsablefondo.getIsChanged() && !responsablefondo.getIsDeleted()) {
				sDescripcion=responsablefondo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=responsablefondo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!responsablefondo.getIsNew() && !responsablefondo.getIsChanged() && !responsablefondo.getIsDeleted()) {
				sDescripcion=responsablefondo.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=responsablefondo.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!responsablefondo.getIsNew() && !responsablefondo.getIsChanged() && !responsablefondo.getIsDeleted()) {
				sDescripcion=responsablefondo.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=responsablefondo.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ResponsableFondo responsablefondoRow=new ResponsableFondo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsablefondoRow=(ResponsableFondo) responsablefondoLogic.getResponsableFondos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			responsablefondoRow=(ResponsableFondo) responsablefondos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFacturaProveedorActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ResponsableFondo responsablefondo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormResponsableFondo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsablefondo = (ResponsableFondo)this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.responsablefondo = (ResponsableFondo)this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(responsablefondo!=null) {
						this.responsablefondo = responsablefondo;
					} else {
						this.responsablefondo = new ResponsableFondo();
					}
				}

				if(this.isTienePermisosFacturaProveedor && this.permiteMantenimiento(this.responsablefondo)) {
					FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFramePopup=new FacturaProveedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturaproveedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFramePopup;
					} else {
						facturaproveedorBeanSwingJInternalFrame=this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame;
					}

					List<ResponsableFondo> responsablefondos=new ArrayList<ResponsableFondo>();
					responsablefondos.add(this.responsablefondo);
					if(!esRelacionado) {
						//facturaproveedorBeanSwingJInternalFrame.facturaproveedorSessionBean.setConGuardarRelaciones(false);
						//facturaproveedorBeanSwingJInternalFrame.facturaproveedorSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturaproveedorBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormResponsableFondo.cargarFacturaProveedorBeanSwingJInternalFrame(responsablefondos,this.responsablefondo,facturaproveedorBeanSwingJInternalFrame,/*conInicializar,*/facturaproveedorBeanSwingJInternalFrame.facturaproveedorSessionBean.getConGuardarRelaciones(),facturaproveedorBeanSwingJInternalFrame.facturaproveedorSessionBean.getEsGuardarRelacionado());
					facturaproveedorBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturaproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaProveedor("no_relacionado");

						facturaproveedorBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaProveedorConstantesFunciones.ITAMANIOFILATABLA + (FacturaProveedorConstantesFunciones.ITAMANIOFILATABLA/2));

						facturaproveedorBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderResponsableFondo=(TitledBorder)this.jScrollPanelDatosResponsableFondo.getBorder();
						TitledBorder titledBorderFacturaProveedor=(TitledBorder)facturaproveedorBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedor.getBorder();

						titledBorderFacturaProveedor.setTitle(titledBorderResponsableFondo.getTitle() + " -> Factura Proveedor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturaproveedorBeanSwingJInternalFrame);
						}

						facturaproveedorBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturaproveedorBeanSwingJInternalFrame);

						facturaproveedorBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.responsablefondoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura Proveedor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualResponsableFondo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoResponsableFondo.setVisible((this.isVisibilidadCeldaNuevoResponsableFondo && this.isPermisoNuevoResponsableFondo));			
			this.jButtonDuplicarResponsableFondo.setVisible((this.isVisibilidadCeldaDuplicarResponsableFondo && this.isPermisoDuplicarResponsableFondo));			
			this.jButtonCopiarResponsableFondo.setVisible((this.isVisibilidadCeldaCopiarResponsableFondo && this.isPermisoCopiarResponsableFondo));
			this.jButtonVerFormResponsableFondo.setVisible((this.isVisibilidadCeldaVerFormResponsableFondo && this.isPermisoVerFormResponsableFondo));
			
			this.jButtonAbrirOrderByResponsableFondo.setVisible((this.isVisibilidadCeldaOrdenResponsableFondo && this.isPermisoOrdenResponsableFondo));			
			
			this.jButtonNuevoRelacionesResponsableFondo.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsableFondo && this.isPermisoNuevoResponsableFondo));			
			this.jButtonNuevoGuardarCambiosResponsableFondo.setVisible((this.isVisibilidadCeldaNuevoResponsableFondo && this.isPermisoNuevoResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo));
			
			if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonModificarResponsableFondo.setVisible((this.isVisibilidadCeldaModificarResponsableFondo && this.isPermisoActualizarResponsableFondo));	
			this.jInternalFrameDetalleFormResponsableFondo.jButtonActualizarResponsableFondo.setVisible((this.isVisibilidadCeldaActualizarResponsableFondo && this.isPermisoActualizarResponsableFondo));	
			this.jInternalFrameDetalleFormResponsableFondo.jButtonEliminarResponsableFondo.setVisible((this.isVisibilidadCeldaEliminarResponsableFondo && this.isPermisoEliminarResponsableFondo));
			this.jInternalFrameDetalleFormResponsableFondo.jButtonCancelarResponsableFondo.setVisible(this.isVisibilidadCeldaCancelarResponsableFondo);							
			this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosResponsableFondo.setVisible((this.isVisibilidadCeldaGuardarResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo));			
			
			}
						
			this.jButtonGuardarCambiosTablaResponsableFondo.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaNuevoResponsableFondo && this.isPermisoNuevoResponsableFondo));						
			this.jButtonDuplicarToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaDuplicarResponsableFondo && this.isPermisoDuplicarResponsableFondo));						
			this.jButtonCopiarToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaCopiarResponsableFondo && this.isPermisoCopiarResponsableFondo));			
			this.jButtonVerFormToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaVerFormResponsableFondo && this.isPermisoVerFormResponsableFondo));			
			this.jButtonAbrirOrderByToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaOrdenResponsableFondo && this.isPermisoOrdenResponsableFondo));
			this.jButtonNuevoRelacionesToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsableFondo && this.isPermisoNuevoResponsableFondo));			
			this.jButtonNuevoGuardarCambiosToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaNuevoResponsableFondo && this.isPermisoNuevoResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo));			
			
			if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonModificarToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaModificarResponsableFondo && this.isPermisoActualizarResponsableFondo));	
			this.jInternalFrameDetalleFormResponsableFondo.jButtonActualizarToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaActualizarResponsableFondo  && this.isPermisoActualizarResponsableFondo));	
			this.jInternalFrameDetalleFormResponsableFondo.jButtonEliminarToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaEliminarResponsableFondo && this.isPermisoEliminarResponsableFondo));
			this.jInternalFrameDetalleFormResponsableFondo.jButtonCancelarToolBarResponsableFondo.setVisible(this.isVisibilidadCeldaCancelarResponsableFondo);				
			this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaGuardarResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarResponsableFondo.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoResponsableFondo.setVisible((this.isVisibilidadCeldaNuevoResponsableFondo && this.isPermisoNuevoResponsableFondo));			
			this.jMenuItemDuplicarResponsableFondo.setVisible((this.isVisibilidadCeldaDuplicarResponsableFondo && this.isPermisoDuplicarResponsableFondo));			
			this.jMenuItemCopiarResponsableFondo.setVisible((this.isVisibilidadCeldaCopiarResponsableFondo && this.isPermisoCopiarResponsableFondo));			
			this.jMenuItemVerFormResponsableFondo.setVisible((this.isVisibilidadCeldaVerFormResponsableFondo && this.isPermisoVerFormResponsableFondo));			
			this.jMenuItemAbrirOrderByResponsableFondo.setVisible((this.isVisibilidadCeldaOrdenResponsableFondo && this.isPermisoOrdenResponsableFondo));			
			//this.jMenuItemMostrarOcultarResponsableFondo.setVisible((this.isVisibilidadCeldaOrdenResponsableFondo && this.isPermisoOrdenResponsableFondo));
			this.jMenuItemDetalleAbrirOrderByResponsableFondo.setVisible((this.isVisibilidadCeldaOrdenResponsableFondo && this.isPermisoOrdenResponsableFondo));			
			//this.jMenuItemDetalleMostrarOcultarResponsableFondo.setVisible((this.isVisibilidadCeldaOrdenResponsableFondo && this.isPermisoOrdenResponsableFondo));			
			this.jMenuItemNuevoRelacionesResponsableFondo.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsableFondo && this.isPermisoNuevoResponsableFondo));			
			this.jMenuItemNuevoGuardarCambiosResponsableFondo.setVisible((this.isVisibilidadCeldaNuevoResponsableFondo && this.isPermisoNuevoResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo));									
			
			if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			this.jInternalFrameDetalleFormResponsableFondo.jMenuItemModificarResponsableFondo.setVisible((this.isVisibilidadCeldaModificarResponsableFondo && this.isPermisoActualizarResponsableFondo));	
			this.jInternalFrameDetalleFormResponsableFondo.jMenuItemActualizarResponsableFondo.setVisible((this.isVisibilidadCeldaActualizarResponsableFondo && this.isPermisoActualizarResponsableFondo));	
			this.jInternalFrameDetalleFormResponsableFondo.jMenuItemEliminarResponsableFondo.setVisible((this.isVisibilidadCeldaEliminarResponsableFondo && this.isPermisoEliminarResponsableFondo));
			this.jInternalFrameDetalleFormResponsableFondo.jMenuItemCancelarResponsableFondo.setVisible(this.isVisibilidadCeldaCancelarResponsableFondo);				
			}
			
			this.jMenuItemGuardarCambiosResponsableFondo.setVisible((this.isVisibilidadCeldaGuardarResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo));						
			this.jMenuItemGuardarCambiosTablaResponsableFondo.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoResponsableFondo=this.jButtonNuevoResponsableFondo.isVisible();
			this.isVisibilidadCeldaDuplicarResponsableFondo=this.jButtonDuplicarResponsableFondo.isVisible();
			this.isVisibilidadCeldaCopiarResponsableFondo=this.jButtonCopiarResponsableFondo.isVisible();
			this.isVisibilidadCeldaVerFormResponsableFondo=this.jButtonVerFormResponsableFondo.isVisible();
			
			this.isVisibilidadCeldaOrdenResponsableFondo=this.jButtonAbrirOrderByResponsableFondo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=this.jButtonNuevoRelacionesResponsableFondo.isVisible();
			this.isVisibilidadCeldaModificarResponsableFondo=this.jButtonModificarResponsableFondo.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			this.isVisibilidadCeldaActualizarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jButtonActualizarResponsableFondo.isVisible();
			this.isVisibilidadCeldaEliminarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jButtonEliminarResponsableFondo.isVisible();
			this.isVisibilidadCeldaCancelarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jButtonCancelarResponsableFondo.isVisible();
			this.isVisibilidadCeldaGuardarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosResponsableFondo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=this.jButtonGuardarCambiosTablaResponsableFondo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoResponsableFondo=this.jButtonNuevoToolBarResponsableFondo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=this.jButtonNuevoRelacionesToolBarResponsableFondo.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			this.isVisibilidadCeldaModificarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jButtonModificarToolBarResponsableFondo.isVisible();
			this.isVisibilidadCeldaActualizarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jButtonActualizarToolBarResponsableFondo.isVisible();
			this.isVisibilidadCeldaEliminarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jButtonEliminarToolBarResponsableFondo.isVisible();
			this.isVisibilidadCeldaCancelarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jButtonCancelarToolBarResponsableFondo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResponsableFondo=this.jButtonGuardarCambiosToolBarResponsableFondo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=this.jButtonGuardarCambiosTablaToolBarResponsableFondo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoResponsableFondo=this.jMenuItemNuevoResponsableFondo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=this.jMenuItemNuevoRelacionesResponsableFondo.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			this.isVisibilidadCeldaModificarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jMenuItemModificarResponsableFondo.isVisible();
			this.isVisibilidadCeldaActualizarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jMenuItemActualizarResponsableFondo.isVisible();
			this.isVisibilidadCeldaEliminarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jMenuItemEliminarResponsableFondo.isVisible();
			this.isVisibilidadCeldaCancelarResponsableFondo=this.jInternalFrameDetalleFormResponsableFondo.jMenuItemCancelarResponsableFondo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResponsableFondo=this.jMenuItemGuardarCambiosResponsableFondo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=this.jMenuItemGuardarCambiosTablaResponsableFondo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesResponsableFondo(Boolean esInicializar) {
		if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.responsablefondoSessionBean.getConGuardarRelaciones()) {
				//if(this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesResponsableFondo();
			}
			
			this.inicializarActualizarBindingBotonesManualResponsableFondo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualResponsableFondo() {
		this.jButtonNuevoResponsableFondo.setVisible(this.isPermisoNuevoResponsableFondo);			
		this.jButtonDuplicarResponsableFondo.setVisible(this.isPermisoDuplicarResponsableFondo);			
		this.jButtonCopiarResponsableFondo.setVisible(this.isPermisoCopiarResponsableFondo);			
		this.jButtonVerFormResponsableFondo.setVisible(this.isPermisoVerFormResponsableFondo);			
		
		this.jButtonAbrirOrderByResponsableFondo.setVisible(this.isPermisoOrdenResponsableFondo);					
		
		this.jButtonNuevoRelacionesResponsableFondo.setVisible(this.isPermisoNuevoResponsableFondo);			
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonModificarResponsableFondo.setVisible(this.isPermisoActualizarResponsableFondo);	
			this.jInternalFrameDetalleFormResponsableFondo.jButtonActualizarResponsableFondo.setVisible(this.isPermisoActualizarResponsableFondo);	
			this.jInternalFrameDetalleFormResponsableFondo.jButtonEliminarResponsableFondo.setVisible(this.isPermisoEliminarResponsableFondo);
			this.jInternalFrameDetalleFormResponsableFondo.jButtonCancelarResponsableFondo.setVisible(this.isVisibilidadCeldaCancelarResponsableFondo);						
			this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosResponsableFondo.setVisible(this.isPermisoGuardarCambiosResponsableFondo);							
		}
		
		this.jButtonGuardarCambiosTablaResponsableFondo.setVisible(this.isPermisoActualizarResponsableFondo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleResponsableFondo() {
		this.jInternalFrameDetalleFormResponsableFondo.jButtonModificarResponsableFondo.setVisible(this.isPermisoActualizarResponsableFondo);	
		this.jInternalFrameDetalleFormResponsableFondo.jButtonActualizarResponsableFondo.setVisible(this.isPermisoActualizarResponsableFondo);	
		this.jInternalFrameDetalleFormResponsableFondo.jButtonEliminarResponsableFondo.setVisible(this.isPermisoEliminarResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jButtonCancelarResponsableFondo.setVisible(this.isVisibilidadCeldaCancelarResponsableFondo);							
		this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosResponsableFondo.setVisible((this.isVisibilidadCeldaGuardarResponsableFondo && this.isPermisoGuardarCambiosResponsableFondo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosResponsableFondo() {
		if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualResponsableFondo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesResponsableFondo() {
	}
	
	public void jTableDatosResponsableFondoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarResponsableFondo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidResponsableFondoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableFondo(this.getresponsablefondo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsablefondo==null) {
						this.responsablefondo = new ResponsableFondo();
					}

					this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
				}

				if(this.responsablefondo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.responsablefondo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableFondo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaResponsableFondoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebResponsableFondo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsableFondo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsableFondo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsableFondo(this.getresponsablefondo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.responsablefondoLogic.getConnexion());

				if(this.responsablefondo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.responsablefondo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsableFondo=(TitledBorder)this.jScrollPanelDatosResponsableFondo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderResponsableFondo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaResponsableFondoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableFondo(this.getresponsablefondo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsablefondo==null) {
						this.responsablefondo = new ResponsableFondo();
					}

					this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
				}

				if(this.responsablefondo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.responsablefondo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableFondo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalResponsableFondoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebResponsableFondo(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsableFondo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsableFondo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsableFondo(this.getresponsablefondo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.responsablefondoLogic.getConnexion());

				if(this.responsablefondo.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.responsablefondo.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsableFondo=(TitledBorder)this.jScrollPanelDatosResponsableFondo.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderResponsableFondo.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalResponsableFondoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableFondo(this.getresponsablefondo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsablefondo==null) {
						this.responsablefondo = new ResponsableFondo();
					}

					this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
				}

				if(this.responsablefondo.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.responsablefondo.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableFondo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoResponsableFondoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="Empleado";

			if(!this.sFinalQueryGeneral_empleado.equals("")) {
				this.empleadoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleado);
				this.empleadoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadoBeanSwingJInternalFrame.procesarBusqueda(this.empleadoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleado.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderResponsableFondo=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosResponsableFondo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderResponsableFondo=(TitledBorder)this.jScrollPanelDatosResponsableFondo.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderResponsableFondo.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoResponsableFondoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebResponsableFondo(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsableFondo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsableFondo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsableFondo(this.getresponsablefondo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.responsablefondoLogic.getConnexion());

				if(this.responsablefondo.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.responsablefondo.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsableFondo=(TitledBorder)this.jScrollPanelDatosResponsableFondo.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderResponsableFondo.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoResponsableFondoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableFondo(this.getresponsablefondo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsablefondo==null) {
						this.responsablefondo = new ResponsableFondo();
					}

					this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
				}

				if(this.responsablefondo.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.responsablefondo.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableFondo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialResponsableFondoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableFondo(this.getresponsablefondo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsablefondo==null) {
						this.responsablefondo = new ResponsableFondo();
					}

					this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
				}

				if(this.responsablefondo.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial = "+this.responsablefondo.getsecuencial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableFondo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_cajaResponsableFondoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsableFondo(this.getresponsablefondo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsablefondo==null) {
						this.responsablefondo = new ResponsableFondo();
					}

					this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);
				}

				if(this.responsablefondo.getvalor_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_caja = "+this.responsablefondo.getvalor_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsableFondo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoResponsableFondoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsableFondo(false,false);

			this.getResponsableFondosFK_IdEmpleado();

			this.inicializarActualizarBindingResponsableFondo(false);

			//if(ResponsableFondoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsableFondo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaResponsableFondoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsableFondo(false,false);

			this.getResponsableFondosFK_IdEmpresa();

			this.inicializarActualizarBindingResponsableFondo(false);

			//if(ResponsableFondoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsableFondo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalResponsableFondoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsableFondo(false,false);

			this.getResponsableFondosFK_IdSucursal();

			this.inicializarActualizarBindingResponsableFondo(false);

			//if(ResponsableFondoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsableFondo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablefondoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameResponsableFondo() {
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
		

		if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
			this.jInternalFrameDetalleFormResponsableFondo.setVisible(false);	    			
			this.jInternalFrameDetalleFormResponsableFondo.dispose();
			this.jInternalFrameDetalleFormResponsableFondo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoResponsableFondo!=null) {
			this.jInternalFrameReporteDinamicoResponsableFondo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoResponsableFondo.dispose();
			this.jInternalFrameReporteDinamicoResponsableFondo=null;
		}
		
		if(this.jInternalFrameImportacionResponsableFondo!=null) {
			this.jInternalFrameImportacionResponsableFondo.setVisible(false);	    			
			this.jInternalFrameImportacionResponsableFondo.dispose();
			this.jInternalFrameImportacionResponsableFondo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessResponsableFondo();
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
			
			if(sTipo.equals("NuevoResponsableFondo")) {
				jButtonNuevoResponsableFondoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarResponsableFondo")) {
				jButtonDuplicarResponsableFondoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarResponsableFondo")) {
				jButtonCopiarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("VerFormResponsableFondo")) {
				jButtonVerFormResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarResponsableFondo")) {
				jButtonNuevoResponsableFondoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarResponsableFondo")) {
				jButtonDuplicarResponsableFondoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoResponsableFondo")) {
				jButtonNuevoResponsableFondoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarResponsableFondo")) {
				jButtonDuplicarResponsableFondoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesResponsableFondo")) {
				jButtonNuevoResponsableFondoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarResponsableFondo")) {
				jButtonNuevoResponsableFondoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesResponsableFondo")) {
				jButtonNuevoResponsableFondoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarResponsableFondo")) {
				jButtonModificarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarResponsableFondo")) {
				jButtonModificarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarResponsableFondo")) {
				jButtonModificarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarResponsableFondo")) {
				jButtonActualizarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarResponsableFondo")) {
				jButtonActualizarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarResponsableFondo")) {
				jButtonActualizarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("EliminarResponsableFondo")) {
				jButtonEliminarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarResponsableFondo")) {
				jButtonEliminarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarResponsableFondo")) {
				jButtonEliminarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("CancelarResponsableFondo")) {
				jButtonCancelarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarResponsableFondo")) {
				jButtonCancelarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarResponsableFondo")) {
				jButtonCancelarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("CerrarResponsableFondo")) {
				jButtonCerrarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarResponsableFondo")) {
				jButtonCerrarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarResponsableFondo")) {
				jButtonCerrarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarResponsableFondo")) {
				jButtonMostrarOcultarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarResponsableFondo")) {
				jButtonCancelarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosResponsableFondo")) {
				jButtonGuardarCambiosResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarResponsableFondo")) {
				jButtonGuardarCambiosResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarResponsableFondo")) {
				jButtonCopiarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarResponsableFondo")) {
				jButtonVerFormResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosResponsableFondo")) {
				jButtonGuardarCambiosResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarResponsableFondo")) {
				jButtonCopiarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormResponsableFondo")) {
				jButtonVerFormResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaResponsableFondo")) {
				jButtonGuardarCambiosResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarResponsableFondo")) {
				jButtonGuardarCambiosResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaResponsableFondo")) {
				jButtonGuardarCambiosResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionResponsableFondo")) {
				jButtonRecargarInformacionResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarResponsableFondo")) {
				jButtonRecargarInformacionResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionResponsableFondo")) {
				jButtonRecargarInformacionResponsableFondoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresResponsableFondo")) {
				jButtonAnterioresResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarResponsableFondo")) {
				jButtonAnterioresResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreResponsableFondo")) {
				jButtonAnterioresResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesResponsableFondo")) {
				jButtonSiguientesResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarResponsableFondo")) {
				jButtonSiguientesResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesResponsableFondo")) {
				jButtonSiguientesResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByResponsableFondo") || sTipo.equals("MenuItemDetalleAbrirOrderByResponsableFondo")) {
				jButtonAbrirOrderByResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarResponsableFondo") || sTipo.equals("MenuItemDetalleMostrarOcultarResponsableFondo")) {
				jButtonMostrarOcultarResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosResponsableFondo")) {
				jButtonNuevoGuardarCambiosResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarResponsableFondo")) {
				jButtonNuevoGuardarCambiosResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosResponsableFondo")) {
				jButtonNuevoGuardarCambiosResponsableFondoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoResponsableFondo")) {
				jButtonCerrarReporteDinamicoResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoResponsableFondo")) {
				jButtonGenerarReporteDinamicoResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoResponsableFondo")) {
				
				jButtonGenerarExcelReporteDinamicoResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionResponsableFondo")) {
				jButtonCerrarImportacionResponsableFondoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionResponsableFondo")) {
				
				jButtonGenerarImportacionResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionResponsableFondo")) {
				
				jButtonAbrirImportacionResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesResponsableFondo")) {
				jComboBoxTiposAccionesResponsableFondoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesResponsableFondo")) {
				jComboBoxTiposRelacionesResponsableFondoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioResponsableFondo")) {
				jComboBoxTiposAccionesResponsableFondoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarResponsableFondo")) {
				
				jComboBoxTiposSeleccionarResponsableFondoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralResponsableFondo")) {
				jTextFieldValorCampoGeneralResponsableFondoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByResponsableFondo")) {
				jButtonAbrirOrderByResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarResponsableFondo")) {
				jButtonAbrirOrderByResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByResponsableFondo")) {
				jButtonCerrarOrderByResponsableFondoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResponsableFondoBusqueda")) {
				this.jButtonidResponsableFondoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaResponsableFondoUpdate")) {
				this.jButtonid_empresaResponsableFondoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaResponsableFondoBusqueda")) {
				this.jButtonid_empresaResponsableFondoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalResponsableFondoUpdate")) {
				this.jButtonid_sucursalResponsableFondoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalResponsableFondoBusqueda")) {
				this.jButtonid_sucursalResponsableFondoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoResponsableFondo")) {
				this.jButtonid_empleadoResponsableFondoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoResponsableFondoUpdate")) {
				this.jButtonid_empleadoResponsableFondoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoResponsableFondoBusqueda")) {
				this.jButtonid_empleadoResponsableFondoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialResponsableFondoBusqueda")) {
				this.jButtonsecuencialResponsableFondoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_cajaResponsableFondoBusqueda")) {
				this.jButtonvalor_cajaResponsableFondoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoResponsableFondo")) {
				this.jButtonid_empleadoResponsableFondoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoResponsableFondo")) {
				this.jButtonFK_IdEmpleadoResponsableFondoActionPerformed(evt);
			}
			
			;
			
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessResponsableFondo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableFondoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				


				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ResponsableFondo responsablefondoLocal=null;
			
			if(!this.getEsControlTabla()) {
				responsablefondoLocal=this.responsablefondo;
			} else {
				responsablefondoLocal=this.responsablefondoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
							
				
				


				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableFondoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
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
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
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
			
			


			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableFondoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
								
						
				


				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableFondo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
								
				
				


				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableFondoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableFondoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableFondoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
							
				
				


				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableFondo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableFondoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
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
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
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
			
			


			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableFondoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
								
				
				


				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableFondoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableFondoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableFondoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosResponsableFondo")) {
					jCheckBoxSeleccionarTodosResponsableFondoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosResponsableFondo")) {
					jCheckBoxSeleccionadosResponsableFondoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarResponsableFondo")) {
					
				}
				
				


				
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
												
				
				


				
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableFondoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableFondoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
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
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
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
			
			


			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsableFondoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableFondo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableFondo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsablefondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsablefondo);
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
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
				
				


				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ResponsableFondo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ResponsableFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsableFondoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablefondoAnterior =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarResponsableFondo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosResponsableFondoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosResponsableFondo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.responsablefondo =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.responsablefondo =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.responsablefondo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarResponsableFondo")) {
				
				}
				
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarResponsableFondo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosResponsableFondo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarResponsableFondo")) {
			
			}
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessResponsableFondo();
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
			if(sTipo.equals("NuevoResponsableFondo")) {
				jButtonNuevoResponsableFondoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarResponsableFondo")) {
				jButtonDuplicarResponsableFondoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarResponsableFondo")) {
				jButtonCopiarResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormResponsableFondo")) {
				jButtonVerFormResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesResponsableFondo")) {
				jButtonNuevoResponsableFondoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarResponsableFondo")) {
				jButtonModificarResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarResponsableFondo")) {
				jButtonActualizarResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarResponsableFondo")) {
				jButtonEliminarResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaResponsableFondo")) {
				jButtonGuardarCambiosResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarResponsableFondo")) {
				jButtonCancelarResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarResponsableFondo")) {
				jButtonCerrarResponsableFondoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosResponsableFondo")) {
				jButtonGuardarCambiosResponsableFondoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosResponsableFondo")) {
				jButtonNuevoGuardarCambiosResponsableFondoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByResponsableFondo")) {
				jButtonAbrirOrderByResponsableFondoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionResponsableFondo")) {
				jButtonRecargarInformacionResponsableFondoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresResponsableFondo")) {
				jButtonAnterioresResponsableFondoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesResponsableFondo")) {
				jButtonSiguientesResponsableFondoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResponsableFondoBusqueda")) {
				this.jButtonidResponsableFondoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaResponsableFondoUpdate")) {
				this.jButtonid_empresaResponsableFondoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaResponsableFondoBusqueda")) {
				this.jButtonid_empresaResponsableFondoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalResponsableFondoUpdate")) {
				this.jButtonid_sucursalResponsableFondoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalResponsableFondoBusqueda")) {
				this.jButtonid_sucursalResponsableFondoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoResponsableFondo")) {
				this.jButtonid_empleadoResponsableFondoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoResponsableFondoUpdate")) {
				this.jButtonid_empleadoResponsableFondoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoResponsableFondoBusqueda")) {
				this.jButtonid_empleadoResponsableFondoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialResponsableFondoBusqueda")) {
				this.jButtonsecuencialResponsableFondoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_cajaResponsableFondoBusqueda")) {
				this.jButtonvalor_cajaResponsableFondoBusquedaActionPerformed(evt);
			}
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessResponsableFondo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameResponsableFondo")) {
				closingInternalFrameResponsableFondo();
				
			} else if(sTipo.equals("jButtonCancelarResponsableFondo")) {
				JInternalFrameBase jInternalFrameDetalleFormResponsableFondo = (JInternalFrameBase)evt.getSource();
	            	
	            ResponsableFondoBeanSwingJInternalFrame jInternalFrameParent=(ResponsableFondoBeanSwingJInternalFrame)jInternalFrameDetalleFormResponsableFondo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarResponsableFondoActionPerformed(null);
			}
			
			ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.responsablefondo,new Object(),this.responsablefondoParameterGeneral,this.responsablefondoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormResponsableFondo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormResponsableFondo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormResponsableFondo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.responsablefondo)) {
			if(!esControlTabla) {
				if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);			
				}
				
				if(this.responsablefondoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualResponsableFondo(this.responsablefondo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.responsablefondoReturnGeneral=responsablefondoLogic.procesarEventosResponsableFondosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsablefondoLogic.getResponsableFondos(),this.responsablefondo,this.responsablefondoParameterGeneral,this.isEsNuevoResponsableFondo,classes);//this.responsablefondoLogic.getResponsableFondo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanResponsableFondo(this.responsablefondoReturnGeneral,this.responsablefondoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.responsablefondoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanResponsableFondo(classes,this.responsablefondoReturnGeneral,this.responsablefondoBean,false);
					}
						
					if(this.responsablefondoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyResponsableFondo(this.responsablefondoReturnGeneral.getResponsableFondo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioResponsableFondo(this.responsablefondoReturnGeneral.getResponsableFondo());	
					}
						
					if(this.responsablefondoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioResponsableFondo(this.responsablefondoReturnGeneral.getResponsableFondo(),classes);//this.responsablefondoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioResponsableFondo(this.responsablefondo,classes);//this.responsablefondoBean);									
				}
			
				if(ResponsableFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualResponsableFondo(this.responsablefondo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsableFondo(this.responsablefondo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.responsablefondoAnterior!=null) {
						this.responsablefondo=this.responsablefondoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.responsablefondoReturnGeneral=responsablefondoLogic.procesarEventosResponsableFondosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsablefondoLogic.getResponsableFondos(),this.responsablefondo,this.responsablefondoParameterGeneral,this.isEsNuevoResponsableFondo,classes);//this.responsablefondoLogic.getResponsableFondo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.responsablefondoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.responsablefondoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.responsablefondoReturnGeneral.getResponsableFondo(),responsablefondoLogic.getResponsableFondos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.responsablefondoReturnGeneral.getResponsableFondo(),this.responsablefondos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosResponsableFondo.repaint();
				
				//((AbstractTableModel) this.jTableDatosResponsableFondo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosResponsableFondo();
			}
		}
	}
	
	public void actualizarVisualTableDatosResponsableFondo() throws Exception {
		
		ResponsableFondoModel responsablefondoModel=(ResponsableFondoModel)this.jTableDatosResponsableFondo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsablefondoModel.responsablefondos=this.responsablefondoLogic.getResponsableFondos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			responsablefondoModel.responsablefondos=this.responsablefondos;
		}
		
		
		((ResponsableFondoModel) this.jTableDatosResponsableFondo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaResponsableFondo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getresponsablefondoAnterior(),this.responsablefondoLogic.getResponsableFondos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getresponsablefondoAnterior(),this.responsablefondos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosResponsableFondo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioResponsableFondo(ResponsableFondo responsablefondo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaProveedor.class)) {
					this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.setFacturaProveedors(responsablefondo.getFacturaProveedors());
					this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaProveedor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
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
										
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsablefondo,new Object(),generalEntityParameterGeneral,this.responsablefondoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.responsablefondoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ResponsableFondoConstantesFunciones.getClassesRelationshipsOfResponsableFondo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ResponsableFondoConstantesFunciones.getClassesRelationshipsFromStringsOfResponsableFondo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormResponsableFondo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ResponsableFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsablefondo,new Object(),generalEntityParameterGeneral,this.responsablefondoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioResponsableFondo(ResponsableFondoBean responsablefondoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaProveedor.class)) {
					this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.setFacturaProveedors(responsablefondo.getFacturaProveedors());
					this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaProveedor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanResponsableFondo(ArrayList<Classe> classes,ResponsableFondoReturnGeneral responsablefondoReturnGeneral,ResponsableFondoBean responsablefondoBean,Boolean conDefault) throws Exception {
		
			this.responsablefondoBean.setFacturaProveedors(responsablefondoReturnGeneral.getResponsableFondo().getFacturaProveedors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualResponsableFondo(ResponsableFondo responsablefondo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaProveedor.class)) {
					responsablefondo.setFacturaProveedors(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorBeanSwingJInternalFrame.facturaproveedorLogic.getFacturaProveedors());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.responsablefondo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormResponsableFondo = new ResponsableFondoDetalleFormJInternalFrame(jDesktopPane,this.responsablefondoSessionBean.getConGuardarRelaciones(),this.responsablefondoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.setVisible(false);
		this.jInternalFrameDetalleFormResponsableFondo.setSelected(false);						
		
		this.jInternalFrameDetalleFormResponsableFondo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormResponsableFondo.responsablefondoLogic=this.responsablefondoLogic;
		
		this.cargarCombosFrameForeignKeyResponsableFondo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleResponsableFondo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResponsableFondo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyResponsableFondo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyResponsableFondo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormResponsableFondo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResponsableFondo"));
		
		this.jInternalFrameDetalleFormResponsableFondo.jButtonModificarResponsableFondo.addActionListener(new ButtonActionListener(this,"ModificarResponsableFondo"));

		
		this.jInternalFrameDetalleFormResponsableFondo.jButtonModificarToolBarResponsableFondo.addActionListener(new ButtonActionListener(this,"ModificarToolBarResponsableFondo"));
					
		this.jInternalFrameDetalleFormResponsableFondo.jMenuItemModificarResponsableFondo.addActionListener(new ButtonActionListener(this,"MenuItemModificarResponsableFondo"));		
		
		
		
		this.jInternalFrameDetalleFormResponsableFondo.jButtonActualizarResponsableFondo.addActionListener (new ButtonActionListener(this,"ActualizarResponsableFondo"));
		
		
		this.jInternalFrameDetalleFormResponsableFondo.jButtonActualizarToolBarResponsableFondo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResponsableFondo"));
						
		this.jInternalFrameDetalleFormResponsableFondo.jMenuItemActualizarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResponsableFondo"));		
		
		
		
		this.jInternalFrameDetalleFormResponsableFondo.jButtonEliminarResponsableFondo.addActionListener (new ButtonActionListener(this,"EliminarResponsableFondo"));
		
		
		this.jInternalFrameDetalleFormResponsableFondo.jButtonEliminarToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"EliminarToolBarResponsableFondo"));
								
		this.jInternalFrameDetalleFormResponsableFondo.jMenuItemEliminarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResponsableFondo"));		
		
		
		
		this.jInternalFrameDetalleFormResponsableFondo.jButtonCancelarResponsableFondo.addActionListener (new ButtonActionListener(this,"CancelarResponsableFondo"));
		
		
		this.jInternalFrameDetalleFormResponsableFondo.jButtonCancelarToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"CancelarToolBarResponsableFondo"));
					
		this.jInternalFrameDetalleFormResponsableFondo.jMenuItemCancelarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResponsableFondo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormResponsableFondo.jMenuItemDetalleCerrarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResponsableFondo"));		
		
		
		
		this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsableFondo"));
		
		
		
		this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsableFondo"));
		
		
		
		this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResponsableFondo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonidResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"idResponsableFondoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empresaResponsableFondoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsableFondoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empresaResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsableFondoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_sucursalResponsableFondoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableFondoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_sucursalResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableFondoBusqueda"));
		//jButtonid_empleadoResponsableFondo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoResponsableFondoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empleadoResponsableFondo.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableFondo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empleadoResponsableFondoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableFondoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empleadoResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonsecuencialResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialResponsableFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonvalor_cajaResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"valor_cajaResponsableFondoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormResponsableFondo.jTabbedPaneRelacionesResponsableFondo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResponsableFondo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameResponsableFondo"));
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResponsableFondo"));
		}
		
		this.jTableDatosResponsableFondo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarResponsableFondo"));
		
		this.jTableDatosResponsableFondo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarResponsableFondo"));
		
		this.jButtonNuevoResponsableFondo.addActionListener(new ButtonActionListener(this,"NuevoResponsableFondo"));
		
		this.jButtonDuplicarResponsableFondo.addActionListener(new ButtonActionListener(this,"DuplicarResponsableFondo"));
		
		this.jButtonCopiarResponsableFondo.addActionListener(new ButtonActionListener(this,"CopiarResponsableFondo"));
		
		this.jButtonVerFormResponsableFondo.addActionListener(new ButtonActionListener(this,"VerFormResponsableFondo"));
		
		
		this.jButtonNuevoToolBarResponsableFondo.addActionListener(new ButtonActionListener(this,"NuevoToolBarResponsableFondo"));
			
		this.jButtonDuplicarToolBarResponsableFondo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarResponsableFondo"));
			
		this.jMenuItemNuevoResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoResponsableFondo"));
			
		this.jMenuItemDuplicarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarResponsableFondo"));		
		
		
		this.jButtonNuevoRelacionesResponsableFondo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesResponsableFondo"));
		
		
		this.jButtonNuevoRelacionesToolBarResponsableFondo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarResponsableFondo"));
			
		this.jMenuItemNuevoRelacionesResponsableFondo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesResponsableFondo"));		
		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonModificarResponsableFondo.addActionListener(new ButtonActionListener(this,"ModificarResponsableFondo"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonModificarToolBarResponsableFondo.addActionListener(new ButtonActionListener(this,"ModificarToolBarResponsableFondo"));
			
			this.jInternalFrameDetalleFormResponsableFondo.jMenuItemModificarResponsableFondo.addActionListener(new ButtonActionListener(this,"MenuItemModificarResponsableFondo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormResponsableFondo.jButtonActualizarResponsableFondo.addActionListener (new ButtonActionListener(this,"ActualizarResponsableFondo"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonActualizarToolBarResponsableFondo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResponsableFondo"));
				
			this.jInternalFrameDetalleFormResponsableFondo.jMenuItemActualizarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResponsableFondo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonEliminarResponsableFondo.addActionListener (new ButtonActionListener(this,"EliminarResponsableFondo"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonEliminarToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"EliminarToolBarResponsableFondo"));
						
			this.jInternalFrameDetalleFormResponsableFondo.jMenuItemEliminarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResponsableFondo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonCancelarResponsableFondo.addActionListener (new ButtonActionListener(this,"CancelarResponsableFondo"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonCancelarToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"CancelarToolBarResponsableFondo"));
			
			this.jInternalFrameDetalleFormResponsableFondo.jMenuItemCancelarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResponsableFondo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarResponsableFondo"));		
		
		
		this.jButtonCerrarResponsableFondo.addActionListener (new ButtonActionListener(this,"CerrarResponsableFondo"));
		
		
		this.jButtonCerrarToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"CerrarToolBarResponsableFondo"));
			
		this.jMenuItemCerrarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarResponsableFondo"));
			
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jMenuItemDetalleCerrarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResponsableFondo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosResponsableFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosResponsableFondo"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsableFondo"));
		}
		
		this.jButtonCopiarToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"CopiarToolBarResponsableFondo"));
			
		this.jButtonVerFormToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"VerFormToolBarResponsableFondo"));
		
		this.jMenuItemGuardarCambiosResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosResponsableFondo"));
			
		this.jMenuItemCopiarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarResponsableFondo"));		
		
		this.jMenuItemVerFormResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormResponsableFondo"));		
		
		
		this.jButtonGuardarCambiosTablaResponsableFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResponsableFondo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarResponsableFondo"));
			
		this.jMenuItemGuardarCambiosTablaResponsableFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResponsableFondo"));		
		
		
		
		this.jButtonRecargarInformacionResponsableFondo.addActionListener (new ButtonActionListener(this,"RecargarInformacionResponsableFondo"));
					
		this.jButtonRecargarInformacionToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarResponsableFondo"));
		
		this.jMenuItemRecargarInformacionResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionResponsableFondo"));		
		
		
		
		this.jButtonAnterioresResponsableFondo.addActionListener (new ButtonActionListener(this,"AnterioresResponsableFondo"));
		
		
		this.jButtonAnterioresToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarResponsableFondo"));
		
		this.jMenuItemAnterioresResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresResponsableFondo"));		
		
		
		this.jButtonSiguientesResponsableFondo.addActionListener (new ButtonActionListener(this,"SiguientesResponsableFondo"));
		
		
		this.jButtonSiguientesToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarResponsableFondo"));
			
		this.jMenuItemSiguientesResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesResponsableFondo"));
			
		this.jMenuItemAbrirOrderByResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByResponsableFondo"));
			
		this.jMenuItemMostrarOcultarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarResponsableFondo"));
			
		this.jMenuItemDetalleAbrirOrderByResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByResponsableFondo"));
			
		this.jMenuItemDetalleMostarOcultarResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarResponsableFondo"));		
		
		
		this.jButtonNuevoGuardarCambiosResponsableFondo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosResponsableFondo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarResponsableFondo"));
			
		this.jMenuItemNuevoGuardarCambiosResponsableFondo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosResponsableFondo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosResponsableFondo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosResponsableFondo"));

		this.jCheckBoxSeleccionadosResponsableFondo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosResponsableFondo"));
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResponsableFondo"));
		}
		
		
		this.jComboBoxTiposRelacionesResponsableFondo.addActionListener (new ButtonActionListener(this,"TiposRelacionesResponsableFondo"));
			
		this.jComboBoxTiposAccionesResponsableFondo.addActionListener (new ButtonActionListener(this,"TiposAccionesResponsableFondo"));
					
		this.jComboBoxTiposSeleccionarResponsableFondo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarResponsableFondo"));
			
		this.jTextFieldValorCampoGeneralResponsableFondo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralResponsableFondo"));		
		
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonidResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"idResponsableFondoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empresaResponsableFondoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsableFondoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empresaResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsableFondoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_sucursalResponsableFondoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableFondoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_sucursalResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableFondoBusqueda"));
		//jButtonid_empleadoResponsableFondo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoResponsableFondoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empleadoResponsableFondo.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableFondo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empleadoResponsableFondoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableFondoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empleadoResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonsecuencialResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialResponsableFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonvalor_cajaResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"valor_cajaResponsableFondoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoResponsableFondo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoResponsableFondo"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableFondo.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableFondo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoResponsableFondo!=null) {
				this.jInternalFrameReporteDinamicoResponsableFondo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsableFondo"));
				this.jInternalFrameReporteDinamicoResponsableFondo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsableFondo"));
				this.jInternalFrameReporteDinamicoResponsableFondo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsableFondo"));
			}
			
			//this.jButtonCerrarReporteDinamicoResponsableFondo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsableFondo"));				
			//this.jButtonGenerarReporteDinamicoResponsableFondo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsableFondo"));
			//this.jButtonGenerarExcelReporteDinamicoResponsableFondo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsableFondo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionResponsableFondo!=null) {
				this.jInternalFrameImportacionResponsableFondo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResponsableFondo"));
				this.jInternalFrameImportacionResponsableFondo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResponsableFondo"));
				this.jInternalFrameImportacionResponsableFondo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResponsableFondo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByResponsableFondo.addActionListener (new ButtonActionListener(this,"AbrirOrderByResponsableFondo"));
			
			this.jButtonAbrirOrderByToolBarResponsableFondo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarResponsableFondo"));			
			
			if(this.jInternalFrameOrderByResponsableFondo!=null) {
				this.jInternalFrameOrderByResponsableFondo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResponsableFondo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsableFondo.jTabbedPaneRelacionesResponsableFondo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResponsableFondo"));
		
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
            		closingInternalFrameResponsableFondo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormResponsableFondo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormResponsableFondo = (JInternalFrameBase)event.getSource();
	            	
	            ResponsableFondoBeanSwingJInternalFrame jInternalFrameParent=(ResponsableFondoBeanSwingJInternalFrame)jInternalFrameDetalleFormResponsableFondo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarResponsableFondoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosResponsableFondo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosResponsableFondoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosResponsableFondo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosResponsableFondo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableFondoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableFondoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableFondoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoResponsableFondo";
		inputMap = this.jButtonNuevoResponsableFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoResponsableFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResponsableFondoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableFondoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableFondoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsableFondoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesResponsableFondo";
		inputMap = this.jButtonNuevoRelacionesResponsableFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesResponsableFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResponsableFondoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarResponsableFondo";
		inputMap = this.jButtonModificarResponsableFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarResponsableFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarResponsableFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarResponsableFondo";
		inputMap = this.jButtonActualizarResponsableFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarResponsableFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarResponsableFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarResponsableFondo";
		inputMap = this.jButtonEliminarResponsableFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarResponsableFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarResponsableFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarResponsableFondo";
		inputMap = this.jButtonCancelarResponsableFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarResponsableFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarResponsableFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarResponsableFondo";
		inputMap = this.jButtonCerrarResponsableFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarResponsableFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarResponsableFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosResponsableFondo";
		inputMap = this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosResponsableFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormResponsableFondo.jButtonGuardarCambiosResponsableFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosResponsableFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosResponsableFondo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosResponsableFondoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesResponsableFondo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesResponsableFondoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarResponsableFondo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarResponsableFondoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralResponsableFondo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralResponsableFondoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonidResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"idResponsableFondoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empresaResponsableFondoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsableFondoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empresaResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsableFondoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_sucursalResponsableFondoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableFondoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_sucursalResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalResponsableFondoBusqueda"));
		//jButtonid_empleadoResponsableFondo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoResponsableFondoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empleadoResponsableFondo.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableFondo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empleadoResponsableFondoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableFondoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empleadoResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonsecuencialResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialResponsableFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsableFondo.jButtonvalor_cajaResponsableFondoBusqueda.addActionListener(new ButtonActionListener(this,"valor_cajaResponsableFondoBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoResponsableFondo.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoResponsableFondo"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoResponsableFondo.addActionListener(new ButtonActionListener(this,"id_empleadoResponsableFondo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionResponsableFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionResponsableFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarResponsableFondoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarResponsableFondo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosResponsableFondo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ResponsableFondo responsablefondoAux:this.responsablefondoLogic.getResponsableFondos()) {
					responsablefondoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResponsableFondo responsablefondoAux:responsablefondos) {
					responsablefondoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosResponsableFondoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResponsableFondo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ResponsableFondo responsablefondoAux:this.responsablefondoLogic.getResponsableFondos()) {
						responsablefondoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResponsableFondo responsablefondoAux:responsablefondos) {
						responsablefondoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ResponsableFondo responsablefondoAux:this.responsablefondoLogic.getResponsableFondos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResponsableFondo responsablefondoAux:responsablefondos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaResponsableFondo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResponsableFondo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResponsableFondo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResponsableFondo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosResponsableFondoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResponsableFondo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosResponsableFondo.getSelectedRows();
			
			ResponsableFondo responsablefondoLocal=new ResponsableFondo();
			
			//this.seleccionarTodosResponsableFondo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsablefondoLocal =(ResponsableFondo) this.responsablefondoLogic.getResponsableFondos().toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					responsablefondoLocal =(ResponsableFondo) this.responsablefondos.toArray()[this.jTableDatosResponsableFondo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				responsablefondoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ResponsableFondo responsablefondoAux:this.responsablefondoLogic.getResponsableFondos()) {
						responsablefondoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ResponsableFondo responsablefondoAux:responsablefondos) {
						responsablefondoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaResponsableFondo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResponsableFondo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResponsableFondo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResponsableFondo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualResponsableFondoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarResponsableFondoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralResponsableFondoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingResponsableFondo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralResponsableFondo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ResponsableFondo responsablefondoAux:this.responsablefondoLogic.getResponsableFondos()) {
				
						if(sTipoSeleccionar.equals(ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							responsablefondoAux.setsecuencial(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResponsableFondoConstantesFunciones.LABEL_VALORCAJA)) {
							existe=true;
							responsablefondoAux.setvalor_caja(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResponsableFondo responsablefondoAux:responsablefondos) {
					
						if(sTipoSeleccionar.equals(ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							responsablefondoAux.setsecuencial(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResponsableFondoConstantesFunciones.LABEL_VALORCAJA)) {
							existe=true;
							responsablefondoAux.setvalor_caja(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaResponsableFondo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesResponsableFondoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingResponsableFondo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioResponsableFondo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesResponsableFondo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteResponsableFondo) {				
					conSplash=true;//false;										
					
					//this.startProcessResponsableFondo(conSplash);
				
					this.generarReporteResponsableFondosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsableFondo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoResponsableFondosSeleccionados();
				//this.jComboBoxTiposAccionesResponsableFondo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResponsableFondosSeleccionados(false);
				//this.jComboBoxTiposAccionesResponsableFondo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResponsableFondosSeleccionados(true);
				//this.jComboBoxTiposAccionesResponsableFondo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResponsableFondo();
				
				this.exportarResponsableFondosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsableFondo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionResponsableFondos();
				//this.importarResponsableFondos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsableFondo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResponsableFondo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelResponsableFondosSeleccionados();
				//this.jComboBoxTiposAccionesResponsableFondo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Responsable Fondo Rotativo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessResponsableFondo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoResponsableFondo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyResponsableFondo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Responsable Fondo Rotativo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsableFondo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.setSelectedIndex(0);					
				}	
			} 			
			else if(ResponsableFondoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteResponsableFondo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessResponsableFondo(conSplash);
					
						//this.actualizarParametrosGeneralResponsableFondo();
						
						this.generarReporteProcesoAccionResponsableFondosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesResponsableFondo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ResponsableFondoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Responsable Fondo RotativoS SELECCIONADOS?", "MANTENIMIENTO DE Responsable Fondo Rotativo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessResponsableFondo();
				
						this.actualizarParametrosGeneralResponsableFondo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.responsablefondoReturnGeneral=responsablefondoLogic.procesarAccionResponsableFondosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.responsablefondoLogic.getResponsableFondos(),this.responsablefondoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarResponsableFondoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResponsableFondo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralResponsableFondo();
					
					ResponsableFondoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarResponsableFondoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResponsableFondo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResponsableFondo.jComboBoxTiposAccionesFormularioResponsableFondo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessResponsableFondo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesResponsableFondoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessResponsableFondo();
			
			if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();		
			ResponsableFondo responsablefondo=new ResponsableFondo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingResponsableFondo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesResponsableFondo.getSelectedItem();
			
			
			
			
			responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(true);
			//this.sTipoAccion;
			
			if(responsablefondosSeleccionados.size()==1) {
				for(ResponsableFondo responsablefondoAux:responsablefondosSeleccionados) {
					responsablefondo=responsablefondoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Factura Proveedor")) {
					jButtonFacturaProveedorActionPerformed(null,rowIndex,true,false,responsablefondo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessResponsableFondo();
			
      		//this.finishProcessResponsableFondo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarResponsableFondoReturnGeneral() throws Exception {
		if(this.responsablefondoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.responsablefondoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.responsablefondoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.responsablefondoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.responsablefondoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.responsablefondoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingResponsableFondo(false);
		}
		
		if(this.responsablefondoReturnGeneral.getConRetornoLista() || this.responsablefondoReturnGeneral.getConRetornoObjeto()) {
			if(this.responsablefondoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.responsablefondoLogic.setResponsableFondos(this.responsablefondoReturnGeneral.getResponsableFondos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.responsablefondoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.responsablefondoLogic.setResponsableFondo(this.responsablefondoReturnGeneral.getResponsableFondo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingResponsableFondo(false);
		}
	}
	
	public void actualizarParametrosGeneralResponsableFondo() throws Exception {
		
		
	}
	
	public ArrayList<ResponsableFondo> getResponsableFondosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioResponsableFondo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ResponsableFondo responsablefondoAux:responsablefondoLogic.getResponsableFondos()) {
					if(responsablefondoAux.getIsSelected()) {
						responsablefondosSeleccionados.add(responsablefondoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ResponsableFondo responsablefondoAux:this.responsablefondos) {
					if(responsablefondoAux.getIsSelected()) {
						responsablefondosSeleccionados.add(responsablefondoAux);				
					}
				}
			}
			
			if(responsablefondosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						responsablefondosSeleccionados.addAll(this.responsablefondoLogic.getResponsableFondos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						responsablefondosSeleccionados.addAll(this.responsablefondos);				
					}
				}
			}
		} else {
			responsablefondosSeleccionados.add(this.responsablefondo);
		}
		
		return responsablefondosSeleccionados;
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
	
	public void generarReporteResponsableFondosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalResponsableFondosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoResponsableFondosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResponsableFondosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResponsableFondosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesResponsableFondosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Responsable Fondo Rotativo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesResponsableFondosSeleccionados() throws Exception {
		ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();		
		
		responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteResponsableFondos("Todos",responsablefondosSeleccionados);
		
	}	
	
	public void generarReporteNormalResponsableFondosSeleccionados() throws Exception {
		ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();		
		
		responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteResponsableFondos("Todos",responsablefondosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionResponsableFondosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();
		
		responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteResponsableFondos("Todos",responsablefondosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoResponsableFondosSeleccionados() throws Exception {
		ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoResponsableFondo();
		
		
		responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoResponsableFondo();
		
		
		//this.generarReporteResponsableFondos("Todos",responsablefondosSeleccionados ,responsablefondoImplementable,responsablefondoImplementableHome);
	}
	
	public void mostrarImportacionResponsableFondos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionResponsableFondo();
		
		this.abrirFrameImportacionResponsableFondo();		
		
			
		//this.generarReporteResponsableFondos("Todos",responsablefondosSeleccionados ,responsablefondoImplementable,responsablefondoImplementableHome);
	}
	
	public void importarResponsableFondos() throws Exception {		
	
	}
	
	public void exportarResponsableFondosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelResponsableFondosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoResponsableFondosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlResponsableFondosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Responsable Fondo Rotativo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoResponsableFondosSeleccionados() throws Exception {
		ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();		
		
		responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsablefondo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarResponsableFondo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ResponsableFondo responsablefondoAux:responsablefondosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarResponsableFondo(responsablefondoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//responsablefondoAux.setsDetalleGeneralEntityReporte(responsablefondoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Fondo Rotativo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarResponsableFondo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ResponsableFondoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableFondoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsableFondoConstantesFunciones.LABEL_VALORCAJA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarResponsableFondo(ResponsableFondo responsablefondo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=responsablefondo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=responsablefondo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsablefondo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsablefondo.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsablefondo.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsablefondo.getsecuencial().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsablefondo.getvalor_caja().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelResponsableFondosSeleccionados() throws Exception {
		ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();		
		
		responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsablefondo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ResponsableFondos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelResponsableFondo(row);				
				iRow++;
			}				
			
			for(ResponsableFondo responsablefondoAux:responsablefondosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelResponsableFondo(responsablefondoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Fondo Rotativo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlResponsableFondosSeleccionados() throws Exception {
		ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();		
		
		responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsablefondo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("responsablefondos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("responsablefondo");
			//elementRoot.appendChild(element);
		
			for(ResponsableFondo responsablefondoAux:responsablefondosSeleccionados) {
				element = document.createElement("responsablefondo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlResponsableFondo(responsablefondoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsable Fondo Rotativo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelResponsableFondo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsableFondoConstantesFunciones.LABEL_VALORCAJA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelResponsableFondo(ResponsableFondo responsablefondo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(responsablefondo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(responsablefondo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsablefondo.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsablefondo.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsablefondo.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(responsablefondo.getvalor_caja());				
	}
	
	public void setFilaDatosExportarXmlResponsableFondo(ResponsableFondo responsablefondo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ResponsableFondoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(responsablefondo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ResponsableFondoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(responsablefondo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ResponsableFondoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(responsablefondo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ResponsableFondoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(responsablefondo.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementempleado_descripcion = document.createElement(ResponsableFondoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(responsablefondo.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementsecuencial = document.createElement(ResponsableFondoConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(responsablefondo.getsecuencial().toString().trim()));
		element.appendChild(elementsecuencial);

		Element elementvalor_caja = document.createElement(ResponsableFondoConstantesFunciones.VALORCAJA);
		elementvalor_caja.appendChild(document.createTextNode(responsablefondo.getvalor_caja().toString().trim()));
		element.appendChild(elementvalor_caja);
	}
	
	public void generarReporteGroupGenericoResponsableFondosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ResponsableFondo> responsablefondosSeleccionados=new ArrayList<ResponsableFondo>();
		
		responsablefondosSeleccionados=this.getResponsableFondosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoResponsableFondo(responsablefondosSeleccionados);
		
		this.generarReporteResponsableFondos("Todos",responsablefondosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoResponsableFondo(ArrayList<ResponsableFondo> responsablefondosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ResponsableFondo responsablefondoAux:responsablefondosSeleccionados) {
				responsablefondoAux.setsDetalleGeneralEntityReporte(responsablefondoAux.toString());
			
				if(sTipoSeleccionar.equals(ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					responsablefondoAux.setsDescripcionGeneralEntityReporte1(responsablefondoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					responsablefondoAux.setsDescripcionGeneralEntityReporte1(responsablefondoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					responsablefondoAux.setsDescripcionGeneralEntityReporte1(responsablefondoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					responsablefondoAux.setsDescripcionGeneralEntityReporte1(responsablefondoAux.getsecuencial().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsableFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesResponsableFondo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoResponsableFondo=true;
				this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=true;
				this.isVisibilidadCeldaGuardarCambiosResponsableFondo=true;
			}
			
			this.isVisibilidadCeldaModificarResponsableFondo=false;
			this.isVisibilidadCeldaActualizarResponsableFondo=false;
			this.isVisibilidadCeldaEliminarResponsableFondo=false;
			this.isVisibilidadCeldaCancelarResponsableFondo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableFondo=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsableFondo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoResponsableFondo=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=false;
			this.isVisibilidadCeldaModificarResponsableFondo=false;
			this.isVisibilidadCeldaActualizarResponsableFondo=true;
			this.isVisibilidadCeldaEliminarResponsableFondo=false;
			this.isVisibilidadCeldaCancelarResponsableFondo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableFondo=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsableFondo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoResponsableFondo=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=false;
			this.isVisibilidadCeldaModificarResponsableFondo=false;
			this.isVisibilidadCeldaActualizarResponsableFondo=true;
			this.isVisibilidadCeldaEliminarResponsableFondo=true;
			this.isVisibilidadCeldaCancelarResponsableFondo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableFondo=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsableFondo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoResponsableFondo=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=false;
			this.isVisibilidadCeldaModificarResponsableFondo=false;
			this.isVisibilidadCeldaActualizarResponsableFondo=true;
			this.isVisibilidadCeldaEliminarResponsableFondo=false;
			this.isVisibilidadCeldaCancelarResponsableFondo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableFondo=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsableFondo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoResponsableFondo=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=true;
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=true;
			this.isVisibilidadCeldaModificarResponsableFondo=false;
			this.isVisibilidadCeldaActualizarResponsableFondo=false;
			this.isVisibilidadCeldaEliminarResponsableFondo=false;
			this.isVisibilidadCeldaCancelarResponsableFondo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableFondo=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsableFondo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoResponsableFondo=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=false;
			this.isVisibilidadCeldaActualizarResponsableFondo=false;
			this.isVisibilidadCeldaEliminarResponsableFondo=false;
			this.isVisibilidadCeldaCancelarResponsableFondo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableFondo=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsableFondo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoResponsableFondo=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=false;
			this.isVisibilidadCeldaModificarResponsableFondo=true;
			this.isVisibilidadCeldaActualizarResponsableFondo=false;
			this.isVisibilidadCeldaEliminarResponsableFondo=false;
			this.isVisibilidadCeldaCancelarResponsableFondo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsableFondo=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsableFondo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ResponsableFondoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoResponsableFondo=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=true;
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=true;
		} else {
			this.actualizarEstadoPanelsResponsableFondo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarResponsableFondo=false;
			//this.isVisibilidadCeldaVerFormResponsableFondo=false;
			this.isVisibilidadCeldaDuplicarResponsableFondo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!responsablefondoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=false;
		} else {
			this.isVisibilidadCeldaNuevoResponsableFondo=false;
			this.isVisibilidadCeldaGuardarCambiosResponsableFondo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(responsablefondoSessionBean.getEsGuardarRelacionado()) {
			if(!responsablefondoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=false;												
			}
			
			this.jButtonCerrarResponsableFondo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesResponsableFondo=false;
		}
		
		if(!this.permiteMantenimiento(this.responsablefondo)) {
			this.isVisibilidadCeldaActualizarResponsableFondo=false;
			this.isVisibilidadCeldaEliminarResponsableFondo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesResponsableFondo() {
		this.isVisibilidadCeldaNuevoResponsableFondo=false;
		this.isVisibilidadCeldaGuardarCambiosResponsableFondo=false;
	}
	
	public void actualizarEstadoPanelsResponsableFondo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionResponsableFondo!=null) {
				this.jScrollPanelDatosEdicionResponsableFondo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableFondo!=null) {
				this.jTabbedPaneBusquedasResponsableFondo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsableFondo!=null) {
				this.jScrollPanelDatosResponsableFondo.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsableFondo!=null) {
				this.jPanelPaginacionResponsableFondo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsableFondo!=null) {
				this.jPanelParametrosReportesResponsableFondo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionResponsableFondo!=null) {
				this.jScrollPanelDatosEdicionResponsableFondo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableFondo!=null) {
				this.jTabbedPaneBusquedasResponsableFondo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosResponsableFondo!=null) {
				this.jScrollPanelDatosResponsableFondo.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsableFondo!=null) {
				this.jPanelPaginacionResponsableFondo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsableFondo!=null) {
				this.jPanelParametrosReportesResponsableFondo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionResponsableFondo!=null) {
				this.jScrollPanelDatosEdicionResponsableFondo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableFondo!=null) {
				this.jTabbedPaneBusquedasResponsableFondo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResponsableFondo!=null) {
				this.jScrollPanelDatosResponsableFondo.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsableFondo!=null) {
				this.jPanelPaginacionResponsableFondo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsableFondo!=null) {
				this.jPanelParametrosReportesResponsableFondo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionResponsableFondo!=null) {
				this.jScrollPanelDatosEdicionResponsableFondo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableFondo!=null) {
				this.jTabbedPaneBusquedasResponsableFondo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResponsableFondo!=null) {
				this.jScrollPanelDatosResponsableFondo.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsableFondo!=null) {
				this.jPanelPaginacionResponsableFondo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsableFondo!=null) {
				this.jPanelParametrosReportesResponsableFondo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionResponsableFondo!=null) {
				this.jScrollPanelDatosEdicionResponsableFondo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableFondo!=null) {
				this.jTabbedPaneBusquedasResponsableFondo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsableFondo!=null) {
				this.jScrollPanelDatosResponsableFondo.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsableFondo!=null) {
				this.jPanelPaginacionResponsableFondo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsableFondo!=null) {
				this.jPanelParametrosReportesResponsableFondo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionResponsableFondo!=null) {
				this.jScrollPanelDatosEdicionResponsableFondo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableFondo!=null) {
				this.jTabbedPaneBusquedasResponsableFondo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsableFondo!=null) {
				this.jScrollPanelDatosResponsableFondo.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsableFondo!=null) {
				this.jPanelPaginacionResponsableFondo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsableFondo!=null) {
				this.jPanelParametrosReportesResponsableFondo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionResponsableFondo!=null) {
				this.jScrollPanelDatosEdicionResponsableFondo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableFondo!=null) {
				this.jTabbedPaneBusquedasResponsableFondo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsableFondo!=null) {
				this.jScrollPanelDatosResponsableFondo.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsableFondo!=null) {
				this.jPanelPaginacionResponsableFondo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsableFondo!=null) {
				this.jPanelParametrosReportesResponsableFondo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasResponsableFondo!=null) {
					this.jTabbedPaneBusquedasResponsableFondo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesResponsableFondo!=null) {
				this.jPanelParametrosReportesResponsableFondo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsableFondo!=null) {
				this.jTabbedPaneBusquedasResponsableFondo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesResponsableFondo!=null) {
				this.jPanelParametrosReportesResponsableFondo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasResponsableFondo.remove(jPanelFK_IdEmpleadoResponsableFondo);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEmpleado=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasResponsableFondo.remove(jPanelFK_IdEmpleadoResponsableFondo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasResponsableFondo.remove(jPanelFK_IdEmpleadoResponsableFondo);}
		}
		
	}
	
	

	public String registrarSesionResponsableFondoParaFacturaProveedors() throws Exception {
		Boolean isPaginaPopupFacturaProveedor=false;

		try {

			if(this.responsablefondoSessionBean==null) {
				this.responsablefondoSessionBean=new ResponsableFondoSessionBean();
			}

			if(this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorSessionBean==null) {
				this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorSessionBean=new FacturaProveedorSessionBean();
			}

			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorSessionBean.setsPathNavegacionActual(responsablefondoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFacturaProveedor=this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFacturaProveedor(true);
			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaProveedor(ResponsableFondoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorSessionBean.setisBusquedaDesdeForeignKeySesionResponsableFondo(true);
			this.jInternalFrameDetalleFormResponsableFondo.facturaproveedorSessionBean.setlidResponsableFondoActual(this.idResponsableFondoActual);

			responsablefondoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyResponsableFondo(true);
			responsablefondoSessionBean.setlIdResponsableFondoActualForeignKey(this.idResponsableFondoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionResponsableFondoParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(responsablefondoSessionBean==null) {
				responsablefondoSessionBean=new ResponsableFondoSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(responsablefondoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.responsablefondoFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(ResponsableFondoConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionResponsableFondo(true);
			//empleadoSessionBean.setlidResponsableFondoActual(this.idResponsableFondoActual);

			responsablefondoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyResponsableFondo(true);
			responsablefondoSessionBean.setlIdResponsableFondoActualForeignKey(this.idResponsableFondoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ResponsableFondoSessionBean responsablefondoSessionBean=new ResponsableFondoSessionBean();
		
		if(this.responsablefondoSessionBean==null) {
			this.responsablefondoSessionBean=new ResponsableFondoSessionBean();
		}
		
		this.responsablefondoSessionBean.setsUltimaBusquedaResponsableFondo(this.getsAccionBusqueda());
		this.responsablefondoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.responsablefondoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			responsablefondoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			responsablefondoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			responsablefondoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ResponsableFondoSessionBean responsablefondoSessionBean=new ResponsableFondoSessionBean();
		
		if(this.responsablefondoSessionBean==null) {
			this.responsablefondoSessionBean=new ResponsableFondoSessionBean();
		}
		
		if(this.responsablefondoSessionBean.getsUltimaBusquedaResponsableFondo()!=null&&!this.responsablefondoSessionBean.getsUltimaBusquedaResponsableFondo().equals("")) {
			this.setsAccionBusqueda(responsablefondoSessionBean.getsUltimaBusquedaResponsableFondo());
			this.setiNumeroPaginacion(responsablefondoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(responsablefondoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(responsablefondoSessionBean.getid_empleado());
				responsablefondoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(responsablefondoSessionBean.getid_empresa());
				responsablefondoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(responsablefondoSessionBean.getid_sucursal());
				responsablefondoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.responsablefondoSessionBean.setsUltimaBusquedaResponsableFondo("");
		this.responsablefondoSessionBean.setiNumeroPaginacion(ResponsableFondoConstantesFunciones.INUMEROPAGINACION);
		this.responsablefondoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaResponsableFondo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioResponsableFondo() {
		this.updateBorderResaltarBusquedasFormularioResponsableFondo();
		this.updateVisibilidadBusquedasFormularioResponsableFondo();
		this.updateHabilitarBusquedasFormularioResponsableFondo();
	}
	
	public void updateBorderResaltarBusquedasFormularioResponsableFondo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasResponsableFondo.getComponents().length>0) {
	

		if(this.responsablefondoConstantesFunciones.resaltarFK_IdEmpleadoResponsableFondo!=null) {
			index= this.jTabbedPaneBusquedasResponsableFondo.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableFondo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableFondo.getComponent(index);
				jPanel.setBorder(this.responsablefondoConstantesFunciones.resaltarFK_IdEmpleadoResponsableFondo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioResponsableFondo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasResponsableFondo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasResponsableFondo.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableFondo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableFondo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.responsablefondoConstantesFunciones.mostrarFK_IdEmpleadoResponsableFondo);
			if(!this.responsablefondoConstantesFunciones.mostrarFK_IdEmpleadoResponsableFondo && index>-1) {
				this.jTabbedPaneBusquedasResponsableFondo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioResponsableFondo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasResponsableFondo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasResponsableFondo.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableFondo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableFondo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.responsablefondoConstantesFunciones.activarFK_IdEmpleadoResponsableFondo);
				this.jTabbedPaneBusquedasResponsableFondo.setEnabledAt(index,this.responsablefondoConstantesFunciones.activarFK_IdEmpleadoResponsableFondo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaResponsableFondo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasResponsableFondo.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableFondo);

			this.jTabbedPaneBusquedasResponsableFondo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsableFondo.getComponent(index);

			this.responsablefondoConstantesFunciones.setResaltarFK_IdEmpleadoResponsableFondo(resaltar);

			jPanel.setBorder(this.responsablefondoConstantesFunciones.resaltarFK_IdEmpleadoResponsableFondo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarResponsableFondo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioResponsableFondo() throws Exception {

		if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioResponsableFondo();
		this.updateVisibilidadResaltarControlesFormularioResponsableFondo();
		this.updateHabilitarResaltarControlesFormularioResponsableFondo();
		
	}
	
	public void updateBorderResaltarControlesFormularioResponsableFondo() throws Exception {
		if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.responsablefondoConstantesFunciones.resaltaridResponsableFondo!=null && this.jInternalFrameDetalleFormResponsableFondo!=null) {this.jInternalFrameDetalleFormResponsableFondo.jLabelidResponsableFondo.setBorder(this.responsablefondoConstantesFunciones.resaltaridResponsableFondo);}
		if(this.responsablefondoConstantesFunciones.resaltarid_empresaResponsableFondo!=null && this.jInternalFrameDetalleFormResponsableFondo!=null) {this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.setBorder(this.responsablefondoConstantesFunciones.resaltarid_empresaResponsableFondo);}
		if(this.responsablefondoConstantesFunciones.resaltarid_sucursalResponsableFondo!=null && this.jInternalFrameDetalleFormResponsableFondo!=null) {this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.setBorder(this.responsablefondoConstantesFunciones.resaltarid_sucursalResponsableFondo);}
		if(this.responsablefondoConstantesFunciones.resaltarid_empleadoResponsableFondo!=null && this.jInternalFrameDetalleFormResponsableFondo!=null) {this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.setBorder(this.responsablefondoConstantesFunciones.resaltarid_empleadoResponsableFondo);}
		if(this.responsablefondoConstantesFunciones.resaltarsecuencialResponsableFondo!=null && this.jInternalFrameDetalleFormResponsableFondo!=null) {this.jInternalFrameDetalleFormResponsableFondo.jTextFieldsecuencialResponsableFondo.setBorder(this.responsablefondoConstantesFunciones.resaltarsecuencialResponsableFondo);}
		if(this.responsablefondoConstantesFunciones.resaltarvalor_cajaResponsableFondo!=null && this.jInternalFrameDetalleFormResponsableFondo!=null) {this.jInternalFrameDetalleFormResponsableFondo.jTextFieldvalor_cajaResponsableFondo.setBorder(this.responsablefondoConstantesFunciones.resaltarvalor_cajaResponsableFondo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioResponsableFondo() throws Exception {		
		if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
	
		//this.jInternalFrameDetalleFormResponsableFondo.jLabelidResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostraridResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jPanelidResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostraridResponsableFondo);
		//this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostrarid_empresaResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jPanelid_empresaResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostrarid_empresaResponsableFondo);
		//this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostrarid_sucursalResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jPanelid_sucursalResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostrarid_sucursalResponsableFondo);
		//this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostrarid_empleadoResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jPanelid_empleadoResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostrarid_empleadoResponsableFondo);
			this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empleadoResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostrarid_empleadoResponsableFondo);
		//this.jInternalFrameDetalleFormResponsableFondo.jTextFieldsecuencialResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostrarsecuencialResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jPanelsecuencialResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostrarsecuencialResponsableFondo);
		//this.jInternalFrameDetalleFormResponsableFondo.jTextFieldvalor_cajaResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostrarvalor_cajaResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jPanelvalor_cajaResponsableFondo.setVisible(this.responsablefondoConstantesFunciones.mostrarvalor_cajaResponsableFondo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioResponsableFondo() throws Exception {
		if(this.jInternalFrameDetalleFormResponsableFondo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResponsableFondo!=null) {
	
		this.jInternalFrameDetalleFormResponsableFondo.jLabelidResponsableFondo.setEnabled(this.responsablefondoConstantesFunciones.activaridResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empresaResponsableFondo.setEnabled(this.responsablefondoConstantesFunciones.activarid_empresaResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_sucursalResponsableFondo.setEnabled(this.responsablefondoConstantesFunciones.activarid_sucursalResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jComboBoxid_empleadoResponsableFondo.setEnabled(this.responsablefondoConstantesFunciones.activarid_empleadoResponsableFondo);
			this.jInternalFrameDetalleFormResponsableFondo.jButtonid_empleadoResponsableFondo.setEnabled(this.responsablefondoConstantesFunciones.activarid_empleadoResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jTextFieldsecuencialResponsableFondo.setEnabled(this.responsablefondoConstantesFunciones.activarsecuencialResponsableFondo);
		this.jInternalFrameDetalleFormResponsableFondo.jTextFieldvalor_cajaResponsableFondo.setEnabled(this.responsablefondoConstantesFunciones.activarvalor_cajaResponsableFondo);
		}
	}
	
		
}