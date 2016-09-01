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

import com.bydan.erp.cartera.util.AreaCrConstantesFunciones;
import com.bydan.erp.cartera.util.AreaCrParameterReturnGeneral;
//import com.bydan.erp.cartera.util.AreaCrParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.AreaCrBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class AreaCrBeanSwingJInternalFrame extends AreaCrJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AreaCrBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AreaCr> areacrValidator = new ClassValidator<AreaCr>(AreaCr.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AreaCr areacr;	
	public AreaCr areacrAux;
	public AreaCr areacrAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AreaCr areacrTotales;
	public Long idAreaCrActual;
	public Long iIdNuevoAreaCr=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
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
	
	public Boolean isPermisoTodoAreaCr;
	public Boolean isPermisoNuevoAreaCr;
	public Boolean isPermisoActualizarAreaCr;
	public Boolean isPermisoActualizarOriginalAreaCr;
	public Boolean isPermisoEliminarAreaCr;
	public Boolean isPermisoGuardarCambiosAreaCr;
	public Boolean isPermisoConsultaAreaCr;
	public Boolean isPermisoBusquedaAreaCr;
	public Boolean isPermisoReporteAreaCr;
	public Boolean isPermisoPaginacionMedioAreaCr;
	public Boolean isPermisoPaginacionAltoAreaCr;
	public Boolean isPermisoPaginacionTodoAreaCr;
	public Boolean isPermisoCopiarAreaCr;
	public Boolean isPermisoVerFormAreaCr;
	public Boolean isPermisoDuplicarAreaCr;
	public Boolean isPermisoOrdenAreaCr;
	
	
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
	
	public AreaCrParameterReturnGeneral areacrReturnGeneral;
	public AreaCrParameterReturnGeneral areacrParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAreaCr=false;
	public Boolean esParaAccionDesdeFormularioAreaCr=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AreaCrSessionBeanAdditional areacrSessionBeanAdditional=null;
	
	public AreaCrSessionBeanAdditional getAreaCrSessionBeanAdditional() {
		return this.areacrSessionBeanAdditional;
	}
	
	public void setAreaCrSessionBeanAdditional(AreaCrSessionBeanAdditional areacrSessionBeanAdditional) {
		try {
			this.areacrSessionBeanAdditional=areacrSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AreaCrBeanSwingJInternalFrameAdditional areacrBeanSwingJInternalFrameAdditional=null;
	//public class AreaCrBeanSwingJInternalFrame
	
	public AreaCrBeanSwingJInternalFrameAdditional getAreaCrBeanSwingJInternalFrameAdditional() {
		return this.areacrBeanSwingJInternalFrameAdditional;
	}
	
	public void setAreaCrBeanSwingJInternalFrameAdditional(AreaCrBeanSwingJInternalFrameAdditional areacrBeanSwingJInternalFrameAdditional) {
		try {
			this.areacrBeanSwingJInternalFrameAdditional=areacrBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AreaCrLogic areacrLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AreaCr areacrBean;
	public AreaCrConstantesFunciones areacrConstantesFunciones;
	//public AreaCrParameterReturnGeneral areacrReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<AreaCr> areacrs;	
	//public List<AreaCr> areacrsEliminados;
	//public List<AreaCr> areacrsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAreaCr=false;
	public Boolean isVisibilidadCeldaDuplicarAreaCr=true;
	public Boolean isVisibilidadCeldaCopiarAreaCr=true;
	public Boolean isVisibilidadCeldaVerFormAreaCr=true;
	public Boolean isVisibilidadCeldaOrdenAreaCr=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAreaCr=false;
	public Boolean isVisibilidadCeldaModificarAreaCr=false;
	public Boolean isVisibilidadCeldaActualizarAreaCr=false;
	public Boolean isVisibilidadCeldaEliminarAreaCr=false;
	public Boolean isVisibilidadCeldaCancelarAreaCr=false;
	public Boolean isVisibilidadCeldaGuardarAreaCr=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAreaCr=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoAreaCr() {
		return this.iIdNuevoAreaCr;
	}

	public void setiIdNuevoAreaCr(Long iIdNuevoAreaCr) {
		this.iIdNuevoAreaCr = iIdNuevoAreaCr;
	}
	
	public Long getidAreaCrActual() {
		return this.idAreaCrActual;
	}

	public void setidAreaCrActual(Long idAreaCrActual) {
		this.idAreaCrActual = idAreaCrActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AreaCr getareacr() {
		return this.areacr;
	}

	public void setareacr(AreaCr areacr) {
		this.areacr = areacr;
	}
	
	public AreaCr getareacrAux() {
		return this.areacrAux;
	}

	public void setareacrAux(AreaCr areacrAux) {
		this.areacrAux = areacrAux;
	}				
	
	public AreaCr getareacrAnterior() {
		return this.areacrAnterior;
	}

	public void setareacrAnterior(AreaCr areacrAnterior) {
		this.areacrAnterior = areacrAnterior;
	}	
	
	public AreaCr getareacrTotales() {
		return this.areacrTotales;
	}

	public void setareacrTotales(AreaCr areacrTotales) {
		this.areacrTotales = areacrTotales;
	}	
	
	public AreaCr getareacrBean() {
		return this.areacrBean;
	}

	public void setareacrBean(AreaCr areacrBean) {
		this.areacrBean = areacrBean;
	}	
	
	public AreaCrParameterReturnGeneral getareacrReturnGeneral() {
		return this.areacrReturnGeneral;
	}

	public void setareacrReturnGeneral(AreaCrParameterReturnGeneral areacrReturnGeneral) {
		this.areacrReturnGeneral = areacrReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
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
	
	
	public AreaCrLogic getAreaCrLogic()	{		
		return areacrLogic;
	}

	public void setAreaCrLogic(AreaCrLogic areacrLogic) {
		this.areacrLogic = areacrLogic;
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
	
	public Boolean getIsEsNuevoAreaCr() {
		return isEsNuevoAreaCr;
	}

	public void setIsEsNuevoAreaCr(Boolean isEsNuevoAreaCr) {
		this.isEsNuevoAreaCr = isEsNuevoAreaCr;
	}

	public Boolean getEsParaAccionDesdeFormularioAreaCr() {
		return esParaAccionDesdeFormularioAreaCr;
	}
	
	public void setEsParaAccionDesdeFormularioAreaCr(Boolean esParaAccionDesdeFormularioAreaCr) {
		this.esParaAccionDesdeFormularioAreaCr = esParaAccionDesdeFormularioAreaCr;
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

			if(this.areacrSessionBean==null) {
				this.areacrSessionBean=new AreaCrSessionBean();
			}

			if(!this.areacrSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(areacrSessionBean.getlidEmpresaActual());
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

			if(this.areacrSessionBean==null) {
				this.areacrSessionBean=new AreaCrSessionBean();
			}

			if(!this.areacrSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(areacrSessionBean.getlidSucursalActual());
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

					if(this.areacr!=null) {
						this.areacr.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAreaCr!=null) {
						this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAreaCr.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAreaCr!=null) {
						if(this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.getItemCount()>0) {
							this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAreaCrGenerico)throws Exception
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
				jComboBoxid_empresaAreaCrGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAreaCrGenerico!=null && jComboBoxid_empresaAreaCrGenerico.getItemCount()>0) {
					jComboBoxid_empresaAreaCrGenerico.setSelectedIndex(0);
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

					if(this.areacr!=null) {
						this.areacr.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormAreaCr!=null) {
						this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalAreaCr.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormAreaCr!=null) {
						if(this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.getItemCount()>0) {
							this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalAreaCrGenerico)throws Exception
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
				jComboBoxid_sucursalAreaCrGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalAreaCrGenerico!=null && jComboBoxid_sucursalAreaCrGenerico.getItemCount()>0) {
					jComboBoxid_sucursalAreaCrGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(AreaCr areacr,JComboBox jComboBoxid_empresaAreaCrGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAreaCrGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAreaCrGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				areacr.setid_empresa(empresaAux.getId());
				areacr.setempresa_descripcion(AreaCrConstantesFunciones.getEmpresaDescripcion(empresaAux));
				areacr.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(AreaCr areacr,JComboBox jComboBoxid_sucursalAreaCrGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalAreaCrGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalAreaCrGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				areacr.setid_sucursal(sucursalAux.getId());
				areacr.setsucursal_descripcion(AreaCrConstantesFunciones.getSucursalDescripcion(sucursalAux));
				areacr.setSucursal(sucursalAux);			}
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

					if(!AreaCrJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAreaCr!=null) { 
							this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAreaCr!=null) { 
					}

					if(!AreaCrJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AreaCrJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAreaCr!=null) { 
							this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAreaCr!=null) { 
					}

					if(!AreaCrJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAreaCr!=null) {
							this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAreaCr!=null) {
							this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAreaCr!=null) {
							this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormAreaCr!=null) {
							this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesAreaCr() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AreaCrConstantesFunciones.refrescarForeignKeysDescripcionesAreaCr(this.areacrLogic.getAreaCrs());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AreaCrConstantesFunciones.refrescarForeignKeysDescripcionesAreaCr(this.areacrs);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//areacrLogic.setAreaCrs(this.areacrs);
			areacrLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AreaCrParameterReturnGeneral getAreaCrParameterGeneral() {
		return this.areacrParameterGeneral;
	}
	
	public void setAreaCrParameterGeneral(AreaCrParameterReturnGeneral areacrParameterGeneral) {
		this.areacrParameterGeneral = areacrParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAreaCr() {
		return isPermisoTodoAreaCr;
	}

	public void setIsPermisoTodoAreaCr(Boolean isPermisoTodoAreaCr) {
		this.isPermisoTodoAreaCr = isPermisoTodoAreaCr;
	}

	public Boolean getIsPermisoNuevoAreaCr() {
		return isPermisoNuevoAreaCr;
	}

	public void setIsPermisoNuevoAreaCr(Boolean isPermisoNuevoAreaCr) {
		this.isPermisoNuevoAreaCr = isPermisoNuevoAreaCr;
	}

	public Boolean getIsPermisoActualizarAreaCr() {
		return isPermisoActualizarAreaCr;
	}

	public void setIsPermisoActualizarAreaCr(Boolean isPermisoActualizarAreaCr) {
		this.isPermisoActualizarAreaCr = isPermisoActualizarAreaCr;
	}

	public Boolean getIsPermisoEliminarAreaCr() {
		return isPermisoEliminarAreaCr;
	}

	public void setIsPermisoEliminarAreaCr(Boolean isPermisoEliminarAreaCr) {
		this.isPermisoEliminarAreaCr = isPermisoEliminarAreaCr;
	}

	public Boolean getIsPermisoGuardarCambiosAreaCr() {
		return isPermisoGuardarCambiosAreaCr;
	}

	public void setIsPermisoGuardarCambiosAreaCr(Boolean isPermisoGuardarCambiosAreaCr) {
		this.isPermisoGuardarCambiosAreaCr = isPermisoGuardarCambiosAreaCr;
	}
	
	public Boolean getIsPermisoConsultaAreaCr() {
		return isPermisoConsultaAreaCr;
	}

	public void setIsPermisoConsultaAreaCr(Boolean isPermisoConsultaAreaCr) {
		this.isPermisoConsultaAreaCr = isPermisoConsultaAreaCr;
	}

	public Boolean getIsPermisoBusquedaAreaCr() {
		return isPermisoBusquedaAreaCr;
	}

	public void setIsPermisoBusquedaAreaCr(Boolean isPermisoBusquedaAreaCr) {
		this.isPermisoBusquedaAreaCr = isPermisoBusquedaAreaCr;
	}

	public Boolean getIsPermisoReporteAreaCr() {
		return isPermisoReporteAreaCr;
	}

	public void setIsPermisoReporteAreaCr(Boolean isPermisoReporteAreaCr) {
		this.isPermisoReporteAreaCr = isPermisoReporteAreaCr;
	}
	
	public Boolean getIsPermisoPaginacionMedioAreaCr() {
		return isPermisoPaginacionMedioAreaCr;
	}

	public void setIsPermisoPaginacionMedioAreaCr(Boolean isPermisoPaginacionMedioAreaCr) {
		this.isPermisoPaginacionMedioAreaCr = isPermisoPaginacionMedioAreaCr;
	}
	
	public Boolean getIsPermisoPaginacionTodoAreaCr() {
		return isPermisoPaginacionTodoAreaCr;
	}

	public void setIsPermisoPaginacionTodoAreaCr(Boolean isPermisoPaginacionTodoAreaCr) {
		this.isPermisoPaginacionTodoAreaCr = isPermisoPaginacionTodoAreaCr;
	}
	
	public Boolean getIsPermisoPaginacionAltoAreaCr() {
		return isPermisoPaginacionAltoAreaCr;
	}

	public void setIsPermisoPaginacionAltoAreaCr(Boolean isPermisoPaginacionAltoAreaCr) {
		this.isPermisoPaginacionAltoAreaCr = isPermisoPaginacionAltoAreaCr;
	}
	
	public Boolean getIsPermisoCopiarAreaCr() {
		return isPermisoCopiarAreaCr;
	}

	public void setIsPermisoCopiarAreaCr(Boolean isPermisoCopiarAreaCr) {
		this.isPermisoCopiarAreaCr = isPermisoCopiarAreaCr;
	}
	
	public Boolean getIsPermisoVerFormAreaCr() {
		return isPermisoVerFormAreaCr;
	}

	public void setIsPermisoVerFormAreaCr(Boolean isPermisoVerFormAreaCr) {
		this.isPermisoVerFormAreaCr = isPermisoVerFormAreaCr;
	}
	
	public Boolean getIsPermisoDuplicarAreaCr() {
		return isPermisoDuplicarAreaCr;
	}

	public void setIsPermisoDuplicarAreaCr(Boolean isPermisoDuplicarAreaCr) {
		this.isPermisoDuplicarAreaCr = isPermisoDuplicarAreaCr;
	}
	
	public Boolean getIsPermisoOrdenAreaCr() {
		return isPermisoOrdenAreaCr;
	}

	public void setIsPermisoOrdenAreaCr(Boolean isPermisoOrdenAreaCr) {
		this.isPermisoOrdenAreaCr = isPermisoOrdenAreaCr;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAreaCr() {
		return isVisibilidadCeldaNuevoAreaCr;
	}

	public void setIsVisibilidadCeldaNuevoAreaCr(Boolean isVisibilidadCeldaNuevoAreaCr) {
		this.isVisibilidadCeldaNuevoAreaCr = isVisibilidadCeldaNuevoAreaCr;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAreaCr() {
		return isVisibilidadCeldaDuplicarAreaCr;
	}

	public void setIsVisibilidadCeldaDuplicarAreaCr(Boolean isVisibilidadCeldaDuplicarAreaCr) {
		this.isVisibilidadCeldaDuplicarAreaCr = isVisibilidadCeldaDuplicarAreaCr;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAreaCr() {
		return isVisibilidadCeldaCopiarAreaCr;
	}

	public void setIsVisibilidadCeldaCopiarAreaCr(Boolean isVisibilidadCeldaCopiarAreaCr) {
		this.isVisibilidadCeldaCopiarAreaCr = isVisibilidadCeldaCopiarAreaCr;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAreaCr() {
		return isVisibilidadCeldaVerFormAreaCr;
	}

	public void setIsVisibilidadCeldaVerFormAreaCr(Boolean isVisibilidadCeldaVerFormAreaCr) {
		this.isVisibilidadCeldaVerFormAreaCr = isVisibilidadCeldaVerFormAreaCr;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAreaCr() {
		return isVisibilidadCeldaOrdenAreaCr;
	}

	public void setIsVisibilidadCeldaOrdenAreaCr(Boolean isVisibilidadCeldaOrdenAreaCr) {
		this.isVisibilidadCeldaOrdenAreaCr = isVisibilidadCeldaOrdenAreaCr;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAreaCr() {
		return isVisibilidadCeldaNuevoRelacionesAreaCr;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAreaCr(Boolean isVisibilidadCeldaNuevoRelacionesAreaCr) {
		this.isVisibilidadCeldaNuevoRelacionesAreaCr = isVisibilidadCeldaNuevoRelacionesAreaCr;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAreaCr() {
		return isVisibilidadCeldaModificarAreaCr;
	}

	public void setIsVisibilidadCeldaModificarAreaCr(Boolean isVisibilidadCeldaModificarAreaCr) {
		this.isVisibilidadCeldaModificarAreaCr = isVisibilidadCeldaModificarAreaCr;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAreaCr() {
		return isVisibilidadCeldaActualizarAreaCr;
	}

	public void setIsVisibilidadCeldaActualizarAreaCr(Boolean isVisibilidadCeldaActualizarAreaCr) {
		this.isVisibilidadCeldaActualizarAreaCr = isVisibilidadCeldaActualizarAreaCr;
	}

	public Boolean getIsVisibilidadCeldaEliminarAreaCr() {
		return isVisibilidadCeldaEliminarAreaCr;
	}

	public void setIsVisibilidadCeldaEliminarAreaCr(Boolean isVisibilidadCeldaEliminarAreaCr) {
		this.isVisibilidadCeldaEliminarAreaCr = isVisibilidadCeldaEliminarAreaCr;
	}

	public Boolean getIsVisibilidadCeldaCancelarAreaCr() {
		return isVisibilidadCeldaCancelarAreaCr;
	}

	public void setIsVisibilidadCeldaCancelarAreaCr(Boolean isVisibilidadCeldaCancelarAreaCr) {
		this.isVisibilidadCeldaCancelarAreaCr = isVisibilidadCeldaCancelarAreaCr;
	}

	public Boolean getIsVisibilidadCeldaGuardarAreaCr() {
		return isVisibilidadCeldaGuardarAreaCr;
	}

	public void setIsVisibilidadCeldaGuardarAreaCr(Boolean isVisibilidadCeldaGuardarAreaCr) {
		this.isVisibilidadCeldaGuardarAreaCr = isVisibilidadCeldaGuardarAreaCr;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAreaCr() {
		return isVisibilidadCeldaGuardarCambiosAreaCr;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAreaCr(Boolean isVisibilidadCeldaGuardarCambiosAreaCr) {
		this.isVisibilidadCeldaGuardarCambiosAreaCr = isVisibilidadCeldaGuardarCambiosAreaCr;
	}
		
	public AreaCrSessionBean getareacrSessionBean() {
		return this.areacrSessionBean;
	}
	
	public void setareacrSessionBean(AreaCrSessionBean areacrSessionBean) {
		this.areacrSessionBean=areacrSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAreaCr(AreaCr areacr)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(areacr,null);
				this.setActualParaGuardarSucursalForeignKey(areacr,null);
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
	
	public void bugActualizarReferenciaActual(AreaCr areacr,AreaCr areacrAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAreaCr(areacr);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		areacrAux.setId(areacr.getId());
		areacrAux.setVersionRow(areacr.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAreaCr();
		
			int intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AreaCrJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAreaCr(this.areacr,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = areacrValidator.getInvalidValues(this.areacr);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			areacrLogic.setDatosCliente(datosCliente);
			areacrLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				areacrAux=new  AreaCr();
				
				areacrAux.setIsNew(true);
				areacrAux.setIsChanged(true);
				
				areacrAux.setAreaCrOriginal(this.areacr);
				
				areacrAux.setId(this.areacr.getId());	
				areacrAux.setVersionRow(this.areacr.getVersionRow());	
				areacrAux.setid_empresa(this.areacr.getid_empresa());	
				areacrAux.setid_sucursal(this.areacr.getid_sucursal());	
				areacrAux.setcodigo(this.areacr.getcodigo());	
				areacrAux.setnombre(this.areacr.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.areacrSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.areacrSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(areacrAux,areacrLogic.getAreaCrs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(areacrAux,areacrs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.areacrSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.areacrSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrLogic.saveAreaCrs();//WithConnection
						//areacrLogic.getSetVersionRowAreaCrs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.areacr,areacrAux);
					
					this.refrescarForeignKeysDescripcionesAreaCr();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.areacrSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								areacrLogic.saveAreaCrRelaciones(areacrAux,this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());//WithConnection
								//areacrLogic.getSetVersionRowAreaCrs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.areacr,areacrAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							areacrAux.setClientes(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.areacrSessionBean.getEstaModoGuardarRelaciones() 
									|| this.areacrSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(areacrAux,areacrLogic.getAreaCrs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(areacrAux,areacrs);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.areacr,areacrAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				areacrAux=new  AreaCr();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.areacrSessionBean.getEsGuardarRelacionado() 
					|| (this.areacrSessionBean.getEsGuardarRelacionado() && this.areacr.getId()>=0)) {
						
					areacrAux.setIsNew(false);
				}
				
				areacrAux.setIsDeleted(false);
			
				areacrAux.setId(this.areacr.getId());	
				areacrAux.setVersionRow(this.areacr.getVersionRow());	
				areacrAux.setid_empresa(this.areacr.getid_empresa());	
				areacrAux.setid_sucursal(this.areacr.getid_sucursal());	
				areacrAux.setcodigo(this.areacr.getcodigo());	
				areacrAux.setnombre(this.areacr.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(areacrAux,areacrLogic.getAreaCrs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(areacrAux,areacrs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.areacrSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.areacrSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrLogic.saveAreaCrs();//WithConnection
						//areacrLogic.getSetVersionRowAreaCrs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.areacr,areacrAux);
					
					this.refrescarForeignKeysDescripcionesAreaCr();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.areacrSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								areacrLogic.saveAreaCrRelaciones(areacrAux,this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());//WithConnection
								//areacrLogic.getSetVersionRowAreaCrs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.areacr,areacrAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							areacrAux.setClientes(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.areacrSessionBean.getEstaModoGuardarRelaciones() 
									|| this.areacrSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(areacrAux,areacrLogic.getAreaCrs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(areacrAux,areacrs);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.areacr,areacrAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				areacrAux=new  AreaCr();
				
				areacrAux.setIsNew(false);
				areacrAux.setIsChanged(false);
				
				areacrAux.setIsDeleted(true);
				
				areacrAux.setId(this.areacr.getId());	
				areacrAux.setVersionRow(this.areacr.getVersionRow());	
				areacrAux.setid_empresa(this.areacr.getid_empresa());	
				areacrAux.setid_sucursal(this.areacr.getid_sucursal());	
				areacrAux.setcodigo(this.areacr.getcodigo());	
				areacrAux.setnombre(this.areacr.getnombre());	
				
				if(this.areacrSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.areacrAux.getId()>=0) {	
						this.areacrsEliminados.add(areacrAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(areacrAux,areacrLogic.getAreaCrs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(areacrAux,areacrs);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.areacrSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.areacrSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrLogic.saveAreaCrs();//WithConnection
						//areacrLogic.getSetVersionRowAreaCrs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.areacrSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								areacrLogic.saveAreaCrRelaciones(areacrAux,this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());//WithConnection
								//areacrLogic.getSetVersionRowAreaCrs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							areacrAux.setClientes(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.areacrSessionBean.getEstaModoGuardarRelaciones() 
								|| this.areacrSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(areacrAux,areacrLogic.getAreaCrs());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(areacrAux,areacrs);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.getAreaCrs().addAll(this.areacrsEliminados);
					
					areacrLogic.saveAreaCrs();//WithConnection
					//areacrLogic.getSetVersionRowAreaCrs();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAreaCr();
				
				this.areacrsEliminados= new ArrayList<AreaCr>();		
			}
			
			if(this.areacrSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areacrSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Area GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.areacr=areacrAux;
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
      		//this.finishProcessAreaCr();
      	}
		
	}	
	
	public void actualizarRelaciones(AreaCr areacrLocal) throws Exception {
		
		if(this.areacrSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				areacrLocal.setClientes(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
			
			} else {
			
				areacrLocal.setClientes(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AreaCr areacrLocal) throws Exception {	
		if(this.areacrSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				areacrLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				areacrLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAreaCrActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = areacrValidator.getInvalidValues(this.areacr);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AreaCr areacr,List<AreaCr> areacrs) throws Exception {
		try	{		
			AreaCrConstantesFunciones.actualizarLista(areacr,areacrs,this.areacrSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(AreaCr areacr,List<AreaCr> areacrs) throws Exception {
		try	{			
			AreaCrConstantesFunciones.actualizarSelectedLista(areacr,areacrs);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AreaCr> areacrsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				areacrsLocal=this.areacrLogic.getAreaCrs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				areacrsLocal=this.areacrs;
			}
			//ARCHITECTURE
		
			for(AreaCr areacrLocal:areacrsLocal) {
				if(this.permiteMantenimiento(areacrLocal) && areacrLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AreaCrConstantesFunciones.getAreaCrLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AreaCrConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAreaCr.jLabelid_empresaAreaCr,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AreaCrConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAreaCr.jLabelid_sucursalAreaCr,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AreaCrConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAreaCr.jLabelcodigoAreaCr,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AreaCrConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAreaCr.jLabelnombreAreaCr,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAreaCr.jLabelid_empresaAreaCr,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAreaCr.jLabelid_sucursalAreaCr,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAreaCr.jLabelcodigoAreaCr,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAreaCr.jLabelnombreAreaCr,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.areacr==null) {
				this.areacr= new AreaCr();
			}

			if(this.areacrSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoAreaCr
				this.setVariablesFormularioToObjetoActualAreaCr(this.areacr,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);

				this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.getcliente().setAreaCr(this.areacr);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoAreaCr--;	
		
		
		this.areacrAux=new AreaCr();
		
		this.areacrAux.setId(this.iIdNuevoAreaCr);
		this.areacrAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.areacrLogic.getAreaCrs().add(this.areacrAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.areacrs.add(this.areacrAux);
		}
		//ARCHITECTURE
		
		this.areacr=this.areacrAux;
		
		if(AreaCrJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAreaCr(this.areacr);
			this.setVariablesObjetoActualToFormularioForeignKeyAreaCr(this.areacr);
		}
				
		//this.setDefaultControlesAreaCr();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAreaCr();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAreaCr();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAreaCr();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAreaCr(this.areacrBean,this.areacr,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AreaCrConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.areacrSessionBean.getConGuardarRelaciones()) {
			classes=AreaCrConstantesFunciones.getClassesRelationshipsOfAreaCr(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.areacrReturnGeneral=areacrLogic.procesarEventosAreaCrsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.areacrLogic.getAreaCrs(),this.areacr,this.areacrParameterGeneral,this.isEsNuevoAreaCr,classes);//this.areacrLogic.getAreaCr()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAreaCr(this.areacrReturnGeneral,this.areacrBean,false);
		
		if(this.areacrReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAreaCr(this.areacrReturnGeneral.getAreaCr());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAreaCr(this.areacrReturnGeneral.getAreaCr());
		}
		
		if(this.areacrReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAreaCr(this.areacrReturnGeneral.getAreaCr(),classes);//this.areacrBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAreaCr(this.areacr,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAreaCr();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAreaCr();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AreaCrBeanSwingJInternalFrameAdditional.RecargarFormAreaCr(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAreaCr(false);
						
			if(areacrSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(AreaCrJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAreaCr();
			}
			
			this.actualizarVisualTableDatosAreaCr();
			
			this.jTableDatosAreaCr.setRowSelectionInterval(this.getIndiceNuevoAreaCr(), this.getIndiceNuevoAreaCr());
			
			this.seleccionarFilaTablaAreaCrActual();
						
			this.actualizarEstadoCeldasBotonesAreaCr("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAreaCr(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAreaCr.jTextFieldcodigoAreaCr.setEnabled(isHabilitar && this.areacrConstantesFunciones.activarcodigoAreaCr);
		this.jInternalFrameDetalleFormAreaCr.jTextAreanombreAreaCr.setEnabled(isHabilitar && this.areacrConstantesFunciones.activarnombreAreaCr);	
		//
		this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.setEnabled(isHabilitar && this.areacrConstantesFunciones.activarid_empresaAreaCr);//
		this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.setEnabled(isHabilitar && this.areacrConstantesFunciones.activarid_sucursalAreaCr);
	};
	
	public void setDefaultControlesAreaCr() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAreaCr(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.areacrSessionBean.setConGuardarRelaciones(true);			
			this.areacrSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAreaCr.jTabbedPaneRelacionesAreaCr.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.areacrSessionBean.setConGuardarRelaciones(false);			
			this.areacrSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAreaCr.jTabbedPaneRelacionesAreaCr.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoAreaCr() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AreaCr areacrAux:this.areacrLogic.getAreaCrs()) {
				if(areacrAux.getId().equals(this.iIdNuevoAreaCr)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AreaCr areacrAux:this.areacrs) {
				if(areacrAux.getId().equals(this.iIdNuevoAreaCr)) {
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
	
	public int getIndiceActualAreaCr(AreaCr areacr,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AreaCr areacrAux:this.areacrLogic.getAreaCrs()) {
				if(areacrAux.getId().equals(areacr.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AreaCr areacrAux:this.areacrs) {
				if(areacrAux.getId().equals(areacr.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAreaCr(AreaCr areacrOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AreaCr areacrAux:this.areacrLogic.getAreaCrs()) {
				if(areacrAux.getAreaCrOriginal().getId().equals(areacrOriginal.getId())) {
					existe=true;
					areacrOriginal.setId(areacrAux.getId());
					areacrOriginal.setVersionRow(areacrAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AreaCr areacrAux:this.areacrs) {
				if(areacrAux.getAreaCrOriginal().getId().equals(areacrOriginal.getId())) {
					existe=true;
					areacrOriginal.setId(areacrAux.getId());
					areacrOriginal.setVersionRow(areacrAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAreaCr(Boolean esParaCancelar) throws Exception {
		areacrsAux=new ArrayList<AreaCr>();
		areacrAux=new AreaCr();
		
		if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AreaCr areacrAux:this.areacrLogic.getAreaCrs()) {
					if(areacrAux.getId()<0) {
						areacrsAux.add(areacrAux);
					}		
				}
				this.iIdNuevoAreaCr=0L;
				this.areacrLogic.getAreaCrs().removeAll(areacrsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AreaCr areacrAux:this.areacrs) {
					if(areacrAux.getId()<0) {
						areacrsAux.add(areacrAux);
					}		
				}
				this.iIdNuevoAreaCr=0L;
				this.areacrs.removeAll(areacrsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAreaCr 
					&& this.areacrLogic.getAreaCrs().size()>0
					) {
					areacrAux=this.areacrLogic.getAreaCrs().get(this.areacrLogic.getAreaCrs().size() - 1);
				
					if(areacrAux.getId()<0) {
						this.areacrLogic.getAreaCrs().remove(areacrAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAreaCr && this.areacrs.size()>0) {
					areacrAux=this.areacrs.get(this.areacrs.size() - 1);
				
					if(areacrAux.getId()<0) {
						this.areacrs.remove(areacrAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAreaCr(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(areacr.getId()<0) {
				this.areacrLogic.getAreaCrs().remove(this.areacr);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(areacr.getId()<0) {
				this.areacrs.remove(this.areacr);
			}
		}			
	}
	
	public void setEstadosInicialesAreaCr(List<AreaCr> areacrsAux) throws Exception {
		AreaCrConstantesFunciones.setEstadosInicialesAreaCr(areacrsAux);
	}
	
	public void setEstadosInicialesAreaCr(AreaCr areacrAux) throws Exception {
		AreaCrConstantesFunciones.setEstadosInicialesAreaCr(areacrAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAreaCrActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAreaCr("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAreaCrActual()) {
				if(!this.isEsNuevoAreaCr) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAreaCr("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAreaCr=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAreaCrActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Area ?", "MANTENIMIENTO DE Area", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAreaCr("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AreaCr areacr) throws Exception {
		AreaCrConstantesFunciones.seleccionarAsignar(this.areacr,areacr);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAreaCr=this.isPermisoActualizarOriginalAreaCr;
			
			
			this.seleccionarAsignar(areacr);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AreaCrConstantesFunciones.quitarEspaciosAreaCr(this.areacr,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAreaCr("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.areacrSessionBean.setsFuncionBusquedaRapida(this.areacrSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAreaCr) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAreaCr(esParaCancelar);				
				this.cancelarNuevoAreaCr(esParaCancelar);								
			}
			
			this.areacr=new AreaCr();
			
			this.inicializarAreaCr();
			
			this.actualizarEstadoCeldasBotonesAreaCr("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAreaCr() throws Exception {
		try {
			AreaCrConstantesFunciones.inicializarAreaCr(this.areacr);
			
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
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.areacrLogic.getAreaCrs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAreaCrs(String sAccionBusqueda,List<AreaCr> areacrsParaReportes) throws Exception {
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
					sPathReporteFinal="AreaCr"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AreaCrMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AreaCrMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AreaCr"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Areas");		
		parameters.put("busquedapor", AreaCrConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					AreaCrLogic areacrLogicAuxiliar=new AreaCrLogic();
					areacrLogicAuxiliar.setDatosCliente(areacrLogic.getDatosCliente());				
					areacrLogicAuxiliar.setAreaCrs(areacrsParaReportes);
					
					areacrLogicAuxiliar.cargarRelacionesLoteForeignKeyAreaCrWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					areacrsParaReportes=areacrLogicAuxiliar.getAreaCrs();
					
					//areacrLogic.getNewConnexionToDeep();
					
					//for (AreaCr areacr:areacrsParaReportes) {
					//	areacrLogic.deepLoad(areacr, false, DeepLoadType.INCLUDE, classes);
					//}						
					//areacrLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//areacrLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAreaCr=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AreaCrConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AreaCrConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAreaCr=new JRBeanArrayDataSource(AreaCrJInternalFrame.TraerAreaCrBeans(areacrsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAreaCr);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AreaCrConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AreaCrConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AreaCrBean.TraerAreaCrBeans(areacrsParaReportes).toArray()));
							
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
				this.generarExcelReporteAreaCrs(sAccionBusqueda,sTipoArchivoReporte,areacrsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAreaCrs(sAccionBusqueda,sTipoArchivoReporte,areacrsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAreaCrActionPerformed(null);
					//this.generarExcelReporteAreaCrs(sAccionBusqueda,sTipoArchivoReporte,areacrsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAreaCrs(sAccionBusqueda,sTipoArchivoReporte,areacrsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAreaCrs(sAccionBusqueda,sTipoArchivoReporte,areacrsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAreaCrs(sAccionBusqueda,sTipoArchivoReporte,areacrsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAreaCrs(String sAccionBusqueda,String sTipoArchivoReporte,List<AreaCr> areacrsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"areacr";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AreaCrs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAreaCr("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AreaCr areacr : areacrsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AreaCrConstantesFunciones.generarExcelReporteDataAreaCr("NORMAL",row,workbook,areacr,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areacrSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAreaCr(String sTipo,Row row,Workbook workbook) {
		
		AreaCrConstantesFunciones.generarExcelReporteHeaderAreaCr(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAreaCrs(String sAccionBusqueda,String sTipoArchivoReporte,List<AreaCr> areacrsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"areacr_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AreaCrs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AreaCr areacr : areacrsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AreaCrConstantesFunciones.getAreaCrDescripcion(areacr));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AreaCrConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AreaCrConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(areacr.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AreaCrConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AreaCrConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(areacr.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AreaCrConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AreaCrConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(areacr.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AreaCrConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AreaCrConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(areacr.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areacrSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAreaCrs(String sAccionBusqueda,String sTipoArchivoReporte,List<AreaCr> areacrsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AreaCr> areacrsRespaldo=null;
		
		classes=AreaCrConstantesFunciones.getClassesRelationshipsOfAreaCr(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.areacrLogic.setDatosCliente(this.datosCliente);
		this.areacrLogic.setDatosDeep(this.datosDeep);
		this.areacrLogic.setIsConDeep(true);
		
		areacrsRespaldo=this.areacrLogic.getAreaCrs();
		
		this.areacrLogic.setAreaCrs(areacrsParaReportes);	
		this.areacrLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		areacrsParaReportes=this.areacrLogic.getAreaCrs();
		this.areacrLogic.setAreaCrs(areacrsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"areacr_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AreaCrs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAreaCr("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AreaCr areacr : areacrsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAreaCr("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AreaCrConstantesFunciones.generarExcelReporteDataAreaCr("NORMAL",row,workbook,areacr,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(areacr.getClientes()!=null && areacr.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(areacr.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : areacr.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
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
		cell.setCellValue(AreaCrConstantesFunciones.getAreaCrDescripcion(areacr));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areacrSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAreaCr.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAreaCr.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAreaCr() throws Exception {		
		this.startProcessAreaCr(true);
	}
	
	public void startProcessAreaCr(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAreaCr ,this.jPanelParametrosReportesAreaCr, this.jScrollPanelDatosAreaCr,this.jPanelPaginacionAreaCr, this.jScrollPanelDatosEdicionAreaCr, this.jPanelAccionesAreaCr,this.jPanelAccionesFormularioAreaCr,this.jmenuBarAreaCr,this.jmenuBarDetalleAreaCr,this.jTtoolBarAreaCr,this.jTtoolBarDetalleAreaCr);		
		
		final JTabbedPane jTabbedPaneBusquedasAreaCr=this.jTabbedPaneBusquedasAreaCr; 
		
		final JPanel jPanelParametrosReportesAreaCr=this.jPanelParametrosReportesAreaCr;
		//final JScrollPane jScrollPanelDatosAreaCr=this.jScrollPanelDatosAreaCr;
		final JTable jTableDatosAreaCr=this.jTableDatosAreaCr;		
		final JPanel jPanelPaginacionAreaCr=this.jPanelPaginacionAreaCr;
		//final JScrollPane jScrollPanelDatosEdicionAreaCr=this.jScrollPanelDatosEdicionAreaCr;
		final JPanel jPanelAccionesAreaCr=this.jPanelAccionesAreaCr;
		
		JPanel jPanelCamposAuxiliarAreaCr=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAreaCr=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) {
			jPanelCamposAuxiliarAreaCr=this.jInternalFrameDetalleFormAreaCr.jPanelCamposAreaCr;
			jPanelAccionesFormularioAuxiliarAreaCr=this.jInternalFrameDetalleFormAreaCr.jPanelAccionesFormularioAreaCr;
		}
		
		final JPanel jPanelCamposAreaCr=jPanelCamposAuxiliarAreaCr;
		final JPanel jPanelAccionesFormularioAreaCr=jPanelAccionesFormularioAuxiliarAreaCr;
		
		
		final JMenuBar jmenuBarAreaCr=this.jmenuBarAreaCr;
		final JToolBar jTtoolBarAreaCr=this.jTtoolBarAreaCr;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAreaCr=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAreaCr=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) {
			jmenuBarDetalleAuxiliarAreaCr=this.jInternalFrameDetalleFormAreaCr.jmenuBarDetalleAreaCr;
			jTtoolBarDetalleAuxiliarAreaCr=this.jInternalFrameDetalleFormAreaCr.jTtoolBarDetalleAreaCr;
		}
		
		final JMenuBar jmenuBarDetalleAreaCr=jmenuBarDetalleAuxiliarAreaCr;
		final JToolBar jTtoolBarDetalleAreaCr=jTtoolBarDetalleAuxiliarAreaCr;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAreaCr;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAreaCr;
			processRunnable.jTableDatos=jTableDatosAreaCr;
			processRunnable.jPanelCampos=jPanelCamposAreaCr;
			processRunnable.jPanelPaginacion=jPanelPaginacionAreaCr;
			processRunnable.jPanelAcciones=jPanelAccionesAreaCr;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAreaCr;
			
			
			processRunnable.jmenuBar=jmenuBarAreaCr;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAreaCr;
			processRunnable.jTtoolBar=jTtoolBarAreaCr;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAreaCr;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAreaCr ,jPanelParametrosReportesAreaCr,jTableDatosAreaCr, /*jScrollPanelDatosAreaCr,*/jPanelCamposAreaCr,jPanelPaginacionAreaCr, /*jScrollPanelDatosEdicionAreaCr,*/ jPanelAccionesAreaCr,jPanelAccionesFormularioAreaCr,jmenuBarAreaCr,jmenuBarDetalleAreaCr,jTtoolBarAreaCr,jTtoolBarDetalleAreaCr);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAreaCr ,jPanelParametrosReportesAreaCr, jScrollPanelDatosAreaCr,jPanelPaginacionAreaCr, jScrollPanelDatosEdicionAreaCr, jPanelAccionesAreaCr,jPanelAccionesFormularioAreaCr,jmenuBarAreaCr,jmenuBarDetalleAreaCr,jTtoolBarAreaCr,jTtoolBarDetalleAreaCr);
						
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
	
	public void finishProcessAreaCr() {// throws Exception 
		this.finishProcessAreaCr(true);
	}
	
	public void finishProcessAreaCr(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAreaCr ,this.jPanelParametrosReportesAreaCr, this.jScrollPanelDatosAreaCr,this.jPanelPaginacionAreaCr, this.jScrollPanelDatosEdicionAreaCr, this.jPanelAccionesAreaCr,this.jPanelAccionesFormularioAreaCr,this.jmenuBarAreaCr,this.jmenuBarDetalleAreaCr,this.jTtoolBarAreaCr,this.jTtoolBarDetalleAreaCr);		
		
		final JTabbedPane jTabbedPaneBusquedasAreaCr=this.jTabbedPaneBusquedasAreaCr; 
		
		final JPanel jPanelParametrosReportesAreaCr=this.jPanelParametrosReportesAreaCr;
		//final JScrollPane jScrollPanelDatosAreaCr=this.jScrollPanelDatosAreaCr;
		final JTable jTableDatosAreaCr=this.jTableDatosAreaCr;		
		final JPanel jPanelPaginacionAreaCr=this.jPanelPaginacionAreaCr;
		//final JScrollPane jScrollPanelDatosEdicionAreaCr=this.jScrollPanelDatosEdicionAreaCr;
		final JPanel jPanelAccionesAreaCr=this.jPanelAccionesAreaCr;
		
		JPanel jPanelCamposAuxiliarAreaCr=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAreaCr=new JPanel();
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) {
			jPanelCamposAuxiliarAreaCr=this.jInternalFrameDetalleFormAreaCr.jPanelCamposAreaCr;
			jPanelAccionesFormularioAuxiliarAreaCr=this.jInternalFrameDetalleFormAreaCr.jPanelAccionesFormularioAreaCr;
		}
		
		final JPanel jPanelCamposAreaCr=jPanelCamposAuxiliarAreaCr;
		final JPanel jPanelAccionesFormularioAreaCr=jPanelAccionesFormularioAuxiliarAreaCr;
		
		
		final JMenuBar jmenuBarAreaCr=this.jmenuBarAreaCr;		
		final JToolBar jTtoolBarAreaCr=this.jTtoolBarAreaCr;
				
		JMenuBar jmenuBarDetalleAuxiliarAreaCr=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAreaCr=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) {
			jmenuBarDetalleAuxiliarAreaCr=this.jInternalFrameDetalleFormAreaCr.jmenuBarDetalleAreaCr;
			jTtoolBarDetalleAuxiliarAreaCr=this.jInternalFrameDetalleFormAreaCr.jTtoolBarDetalleAreaCr;		
		}
		
		final JMenuBar jmenuBarDetalleAreaCr=jmenuBarDetalleAuxiliarAreaCr;
		final JToolBar jTtoolBarDetalleAreaCr=jTtoolBarDetalleAuxiliarAreaCr;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAreaCr;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAreaCr;
			processRunnable.jTableDatos=jTableDatosAreaCr;
			processRunnable.jPanelCampos=jPanelCamposAreaCr;
			processRunnable.jPanelPaginacion=jPanelPaginacionAreaCr;
			processRunnable.jPanelAcciones=jPanelAccionesAreaCr;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAreaCr;
			
			
			processRunnable.jmenuBar=jmenuBarAreaCr;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAreaCr;
			processRunnable.jTtoolBar=jTtoolBarAreaCr;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAreaCr;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAreaCr ,jPanelParametrosReportesAreaCr, jTableDatosAreaCr,/*jScrollPanelDatosAreaCr,*/jPanelCamposAreaCr,jPanelPaginacionAreaCr, /*jScrollPanelDatosEdicionAreaCr,*/ jPanelAccionesAreaCr,jPanelAccionesFormularioAreaCr,jmenuBarAreaCr,jmenuBarDetalleAreaCr,jTtoolBarAreaCr,jTtoolBarDetalleAreaCr));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAreaCr(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAreaCr(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAreaCr(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAreaCr(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAreaCr,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAreaCr,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAreaCr(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAreaCr,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAreaCr,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.areacrConstantesFunciones.getsFinalQueryAreaCr();
		String  finalQueryPaginacionTodos=this.areacrConstantesFunciones.getsFinalQueryAreaCr();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AreaCrConstantesFunciones.getArrayColumnasGlobalesNoAreaCr(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AreaCrConstantesFunciones.getArrayColumnasGlobalesAreaCr(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AreaCrConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.areacrsEliminados= new ArrayList<AreaCr>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAreaCr();
		
				///*AreaCrSessionBean*/this.areacrSessionBean=new AreaCrSessionBean();
			
			if(this.areacrSessionBean==null) {
				this.areacrSessionBean=new AreaCrSessionBean();
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
					this.iNumeroPaginacion=AreaCrConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AreaCrConstantesFunciones.getClassesForeignKeysOfAreaCr(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/areacr."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			areacrsAux= new ArrayList<AreaCr>();
			
				
			areacrLogic.setDatosCliente(this.datosCliente);
			areacrLogic.setDatosDeep(this.datosDeep);
			areacrLogic.setIsConDeep(true);
			
			
			areacrLogic.getAreaCrDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					areacrLogic.getTodosAreaCrs(finalQueryGlobal,pagination);
					
					//areacrLogic.getTodosAreaCrsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(areacrLogic.getAreaCrs()==null|| areacrLogic.getAreaCrs().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							areacrsAux= new ArrayList<AreaCr>();
							areacrsAux.addAll(areacrLogic.getAreaCrs());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areacrsAux= new ArrayList<AreaCr>();
							areacrsAux.addAll(areacrs);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							areacrLogic.getTodosAreaCrs(finalQueryGlobal+"",this.pagination);												
							
							//areacrLogic.getTodosAreaCrsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAreaCrs("Todos",areacrLogic.getAreaCrs() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							areacrLogic.setAreaCrs(new ArrayList<AreaCr>());					
							areacrLogic.getAreaCrs().addAll(areacrsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areacrs=new ArrayList<AreaCr>();
							areacrs.addAll(areacrsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAreaCr=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAreaCr=this.idActual;
				
				} else if(this.idAreaCrActual!=null && this.idAreaCrActual!=0L) {
					idAreaCr=idAreaCrActual;
				}
				
					
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndicePorId(idAreaCr);
				
				this.areacrs=new ArrayList<AreaCr>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					areacrLogic.getEntity(idAreaCr);
					
					//areacrLogic.getEntityWithConnection(idAreaCr);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					areacrLogic.setAreaCrs(new ArrayList<AreaCr>());
					areacrLogic.getAreaCrs().add(areacrLogic.getAreaCr());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.areacrs=new ArrayList<AreaCr>();
					this.areacrs.add(areacr);
				}
				
				if(areacrLogic.getAreaCr()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					areacrLogic.getAreaCrsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=areacrLogic.getAreaCrs()==null||areacrLogic.getAreaCrs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=areacrs==null|| areacrs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrsAux=new ArrayList<AreaCr>();
						areacrsAux.addAll(areacrLogic.getAreaCrs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areacrsAux=new ArrayList<AreaCr>();
							areacrsAux.addAll(areacrs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							areacrLogic.getAreaCrsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAreaCrs("BusquedaPorCodigo",areacrLogic.getAreaCrs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAreaCrs("BusquedaPorCodigo",areacrs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrLogic.setAreaCrs(new ArrayList<AreaCr>());
						areacrLogic.getAreaCrs().addAll(areacrsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areacrs=new ArrayList<AreaCr>();
							areacrs.addAll(areacrsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					areacrLogic.getAreaCrsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=areacrLogic.getAreaCrs()==null||areacrLogic.getAreaCrs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=areacrs==null|| areacrs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrsAux=new ArrayList<AreaCr>();
						areacrsAux.addAll(areacrLogic.getAreaCrs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areacrsAux=new ArrayList<AreaCr>();
							areacrsAux.addAll(areacrs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							areacrLogic.getAreaCrsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAreaCrs("BusquedaPorNombre",areacrLogic.getAreaCrs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAreaCrs("BusquedaPorNombre",areacrs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrLogic.setAreaCrs(new ArrayList<AreaCr>());
						areacrLogic.getAreaCrs().addAll(areacrsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areacrs=new ArrayList<AreaCr>();
							areacrs.addAll(areacrsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					areacrLogic.getAreaCrsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=areacrLogic.getAreaCrs()==null||areacrLogic.getAreaCrs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=areacrs==null|| areacrs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrsAux=new ArrayList<AreaCr>();
						areacrsAux.addAll(areacrLogic.getAreaCrs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areacrsAux=new ArrayList<AreaCr>();
							areacrsAux.addAll(areacrs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							areacrLogic.getAreaCrsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAreaCrs("FK_IdEmpresa",areacrLogic.getAreaCrs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAreaCrs("FK_IdEmpresa",areacrs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrLogic.setAreaCrs(new ArrayList<AreaCr>());
						areacrLogic.getAreaCrs().addAll(areacrsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areacrs=new ArrayList<AreaCr>();
							areacrs.addAll(areacrsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					areacrLogic.getAreaCrsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=areacrLogic.getAreaCrs()==null||areacrLogic.getAreaCrs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=areacrs==null|| areacrs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrsAux=new ArrayList<AreaCr>();
						areacrsAux.addAll(areacrLogic.getAreaCrs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areacrsAux=new ArrayList<AreaCr>();
							areacrsAux.addAll(areacrs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							areacrLogic.getAreaCrsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AreaCrConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAreaCrs("FK_IdSucursal",areacrLogic.getAreaCrs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAreaCrs("FK_IdSucursal",areacrs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrLogic.setAreaCrs(new ArrayList<AreaCr>());
						areacrLogic.getAreaCrs().addAll(areacrsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areacrs=new ArrayList<AreaCr>();
							areacrs.addAll(areacrsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAreaCr();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAreaCr();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=areacrLogic.getAreaCrs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=areacrs.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=areacrLogic.getAreaCrs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=areacrs.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AreaCr areacr) {
		Boolean permite=true;
		
		if(this.areacr.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AreaCrConstantesFunciones.getOrderByListaAreaCr();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AreaCrConstantesFunciones.getOrderByListaAreaCr();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AreaCr areacr:areacrLogic.getAreaCrs()) {
				if(areacr.getsType().equals(Constantes2.S_TOTALES)) {
					areacrTotales=areacr;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AreaCr areacr:this.areacrs) {
				if(areacr.getsType().equals(Constantes2.S_TOTALES)) {
					areacrTotales=areacr;
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
			this.areacrAux=new AreaCr();
			this.areacrAux.setsType(Constantes2.S_TOTALES);
			this.areacrAux.setIsNew(false);
			this.areacrAux.setIsChanged(false);
			this.areacrAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AreaCrConstantesFunciones.TotalizarValoresFilaAreaCr(this.areacrLogic.getAreaCrs(),this.areacrAux);
				
				this.areacrLogic.getAreaCrs().add(this.areacrAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AreaCrConstantesFunciones.TotalizarValoresFilaAreaCr(this.areacrs,this.areacrAux);
				
				this.areacrs.add(this.areacrAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		areacrTotales=new AreaCr();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.areacrLogic.getAreaCrs().remove(areacrTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.areacrs.remove(areacrTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		areacrTotales=new AreaCr();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AreaCr areacr:areacrLogic.getAreaCrs()) {
				if(areacr.getsType().equals(Constantes2.S_TOTALES)) {
					areacrTotales=areacr;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AreaCrConstantesFunciones.TotalizarValoresFilaAreaCr(this.areacrLogic.getAreaCrs(),areacrTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AreaCr areacr:this.areacrs) {
				if(areacr.getsType().equals(Constantes2.S_TOTALES)) {
					areacrTotales=areacr;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AreaCrConstantesFunciones.TotalizarValoresFilaAreaCr(this.areacrs,areacrTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAreaCrsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAreaCrsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAreaCrsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAreaCrsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAreaCrsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					areacrLogic.getAreaCrsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAreaCrsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					areacrLogic.getAreaCrsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAreaCrsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					areacrLogic.getAreaCrsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAreaCrsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					areacrLogic.getAreaCrsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosAreaCr() {
		this.isPermisoTodoAreaCr=false;
		this.isPermisoNuevoAreaCr=false;
		this.isPermisoActualizarAreaCr=false;
		this.isPermisoActualizarOriginalAreaCr=false;
		this.isPermisoEliminarAreaCr=false;
		this.isPermisoGuardarCambiosAreaCr=false;
		this.isPermisoConsultaAreaCr=false;
		this.isPermisoBusquedaAreaCr=false;
		this.isPermisoReporteAreaCr=false;		
		this.isPermisoOrdenAreaCr=false;		
		this.isPermisoPaginacionMedioAreaCr=false;		
		this.isPermisoPaginacionAltoAreaCr=false;
		this.isPermisoPaginacionTodoAreaCr=false;
		this.isPermisoCopiarAreaCr=false;		
		this.isPermisoVerFormAreaCr=false;		
		this.isPermisoDuplicarAreaCr=false;		
		this.isPermisoOrdenAreaCr=false;		
	}
	
	public void setPermisosUsuarioAreaCr(Boolean isPermiso) {
		this.isPermisoTodoAreaCr=isPermiso;
		this.isPermisoNuevoAreaCr=isPermiso;
		this.isPermisoActualizarAreaCr=isPermiso;
		this.isPermisoActualizarOriginalAreaCr=isPermiso;
		this.isPermisoEliminarAreaCr=isPermiso;
		this.isPermisoGuardarCambiosAreaCr=isPermiso;
		this.isPermisoConsultaAreaCr=isPermiso;
		this.isPermisoBusquedaAreaCr=isPermiso;
		this.isPermisoReporteAreaCr=isPermiso;
		this.isPermisoOrdenAreaCr=isPermiso;		
		this.isPermisoPaginacionMedioAreaCr=isPermiso;		
		this.isPermisoPaginacionAltoAreaCr=isPermiso;		
		this.isPermisoPaginacionTodoAreaCr=isPermiso;		
		this.isPermisoCopiarAreaCr=isPermiso;		
		this.isPermisoVerFormAreaCr=isPermiso;		
		this.isPermisoDuplicarAreaCr=isPermiso;
		this.isPermisoOrdenAreaCr=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAreaCr(Boolean isPermiso) {
		//this.isPermisoTodoAreaCr=isPermiso;
		this.isPermisoNuevoAreaCr=isPermiso;
		this.isPermisoActualizarAreaCr=isPermiso;
		this.isPermisoActualizarOriginalAreaCr=isPermiso;
		this.isPermisoEliminarAreaCr=isPermiso;
		this.isPermisoGuardarCambiosAreaCr=isPermiso;
		//this.isPermisoConsultaAreaCr=isPermiso;
		//this.isPermisoBusquedaAreaCr=isPermiso;
		//this.isPermisoReporteAreaCr=isPermiso;
		//this.isPermisoOrdenAreaCr=isPermiso;		
		//this.isPermisoPaginacionMedioAreaCr=isPermiso;		
		//this.isPermisoPaginacionAltoAreaCr=isPermiso;		
		//this.isPermisoPaginacionTodoAreaCr=isPermiso;		
		//this.isPermisoCopiarAreaCr=isPermiso;		
		//this.isPermisoDuplicarAreaCr=isPermiso;
		//this.isPermisoOrdenAreaCr=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAreaCrClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		
		if(AreaCrJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionAreaCrClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebAreaCr(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAreaCrClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioAreaCrClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAreaCrClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAreaCrClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormAreaCr!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormAreaCr.jTabbedPaneRelacionesAreaCr.remove(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioAreaCr() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AreaCrJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.areacrSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AreaCrConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAreaCr=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAreaCr=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAreaCr=this.isPermisoActualizarAreaCr;
			this.isPermisoEliminarAreaCr=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAreaCr=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAreaCr=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAreaCr=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAreaCr=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAreaCr=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAreaCr=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAreaCr=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAreaCr=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAreaCr=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAreaCr=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAreaCr=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAreaCr=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAreaCr=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.areacrSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAreaCr.setToolTipText(this.jTableDatosAreaCr.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAreaCr(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAreaCr(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AreaCrJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AreaCrJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAreaCr() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.areacrConstantesFunciones.mostrarClienteAreaCr && !AreaCrConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
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
	public void inicializarCombosForeignKeyAreaCrListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAreaCrListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AreaCrJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAreaCrListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyAreaCrListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AreaCrParameterReturnGeneral areacrReturnGeneral=new AreaCrParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.areacrConstantesFunciones.cargarid_empresaAreaCr)
					 || (this.esRecargarFks && this.areacrConstantesFunciones.cargarid_empresaAreaCr)) {

					if(!this.areacrSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+areacrSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.areacrConstantesFunciones.cargarid_sucursalAreaCr)
					 || (this.esRecargarFks && this.areacrConstantesFunciones.cargarid_sucursalAreaCr)) {

					if(!this.areacrSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+areacrSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				areacrReturnGeneral=areacrLogic.cargarCombosLoteForeignKeyAreaCr(finalQueryGlobalEmpresa,finalQueryGlobalSucursal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=areacrReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=areacrReturnGeneral.getsucursalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAreaCr()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.areacrSessionBean==null) {
				this.areacrSessionBean=new AreaCrSessionBean();
			}

			if(!this.areacrSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.areacrSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyAreaCr()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAreaCr(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAreaCr()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAreaCr();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAreaCr(AreaCr areacr)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAreaCr(AreaCr areacr,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAreaCr()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAreaCr()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAreaCr()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAreaCr()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAreaCr()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAreaCr()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAreaCr(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAreaCr()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr!=null && this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.getItemCount()>0) {
				this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr!=null && this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.getItemCount()>0) {
				this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public AreaCrBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AreaCrBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AreaCrBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.areacrSessionBean=new AreaCrSessionBean(); 
		this.areacrConstantesFunciones=new AreaCrConstantesFunciones(); 
		this.areacrBean=new AreaCr();//(this.areacrConstantesFunciones); 		
		this.areacrReturnGeneral=new AreaCrParameterReturnGeneral(); 
		
		this.areacrSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.areacrSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AreaCrBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AreaCrBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AreaCrBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAreaCr(true);
			
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
			
			this.areacrConstantesFunciones=new AreaCrConstantesFunciones(); 
			this.areacrBean=new AreaCr();//this.areacrConstantesFunciones); 			
			this.areacrReturnGeneral=new AreaCrParameterReturnGeneral(); 
		
			AreaCrBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Area Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.areacr=new AreaCr();
			this.areacrs = new ArrayList<AreaCr>();
			this.areacrsAux = new ArrayList<AreaCr>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic=new AreaCrLogic();
				this.areacrLogic.getNewConnexionToDeep("");
			}
			
			//this.areacrSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.areacrSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAreaCr);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAreaCr!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAreaCr);	
					}
					
					if(this.jInternalFrameImportacionAreaCr!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAreaCr);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAreaCr!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAreaCr);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAreaCr!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAreaCr);
				this.jInternalFrameDetalleFormAreaCr.setVisible(false);
				this.jInternalFrameDetalleFormAreaCr.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAreaCr!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAreaCr);
					this.jInternalFrameReporteDinamicoAreaCr.setVisible(false);
					this.jInternalFrameReporteDinamicoAreaCr.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAreaCr!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAreaCr);
					this.jInternalFrameImportacionAreaCr.setVisible(false);
					this.jInternalFrameImportacionAreaCr.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAreaCr!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAreaCr);
					this.jInternalFrameOrderByAreaCr.setVisible(false);
					this.jInternalFrameOrderByAreaCr.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAreaCrActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AreaCrConstantesFunciones.INUMEROPAGINACION;
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
			
			this.areacrReturnGeneral=new AreaCrParameterReturnGeneral();
			
			this.areacrParameterGeneral=new AreaCrParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.areacrLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AreaCrJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.areacrSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AreaCrConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.areacrSessionBean.getEsGuardarRelacionado(),this.areacrSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AreaCrConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.areacrSessionBean.getEsGuardarRelacionado(),this.areacrSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAreaCr=false;
			this.isVisibilidadCeldaDuplicarAreaCr=true;
			this.isVisibilidadCeldaCopiarAreaCr=true;
			this.isVisibilidadCeldaVerFormAreaCr=true;
			this.isVisibilidadCeldaOrdenAreaCr=true;
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=false;
			this.isVisibilidadCeldaModificarAreaCr=false;
			this.isVisibilidadCeldaActualizarAreaCr=false;
			this.isVisibilidadCeldaEliminarAreaCr=false;
			this.isVisibilidadCeldaCancelarAreaCr=false;
			this.isVisibilidadCeldaGuardarAreaCr=false;
			this.isVisibilidadCeldaGuardarCambiosAreaCr=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAreaCr("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAreaCr();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAreaCr(false);
			
			this.setPermisosUsuarioAreaCr();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.areacrSessionBean.getEsGuardarRelacionado() 
				|| (this.areacrSessionBean.getEsGuardarRelacionado() && this.areacrSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAreaCrClasesRelacionadas();
			}
			
			if(this.areacrSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAreaCrClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AreaCrJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAreaCr();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAreaCr();
			}
			
			if(!this.isPermisoBusquedaAreaCr) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAreaCr.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.areacrSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAreaCr,this.isPermisoPaginacionMedioAreaCr,this.isPermisoPaginacionTodoAreaCr);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AreaCrConstantesFunciones.getTiposSeleccionarAreaCr());
				
				this.tiposColumnasSelect=AreaCrConstantesFunciones.getTiposSeleccionarAreaCr(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectAreaCr();				
				//this.tiposRelacionesSelect=AreaCrConstantesFunciones.getTiposRelacionesAreaCr(true);
				
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
			//if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAreaCr();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioAreaCr(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioAreaCr(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAreaCr() ;
			
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
			
			
			this.clienteLogic=new ClienteLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				areacrImplementable= (AreaCrImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AreaCrConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				areacrImplementableHome= (AreaCrImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AreaCrConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.areacrs= new ArrayList<AreaCr>();
			this.areacrsEliminados= new ArrayList<AreaCr>();
						
			this.isEsNuevoAreaCr=false;
			this.esParaAccionDesdeFormularioAreaCr=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAreaCr(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAreaCr();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AreaCrBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AreaCrConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAreaCr("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAreaCr(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAreaCr!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAreaCr();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAreaCr();
			}
			
			AreaCrBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAreaCr.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAreaCr.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAreaCr.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAreaCr(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AreaCr: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAreaCr() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAreaCr")) {
				iIndex=this.jInternalFrameDetalleFormAreaCr.jTabbedPaneRelacionesAreaCr.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAreaCr.jTabbedPaneRelacionesAreaCr.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessAreaCr();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAreaCr();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormAreaCr.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesAreaCr.updateUI();
		//this.jTabbedPaneRelacionesAreaCr.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesAreaCr.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosAreaCr.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.areacrConstantesFunciones.mostrarClienteAreaCr && !AreaCrConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(areacrConstantesFunciones.resaltarClienteAreaCr!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(areacrConstantesFunciones.resaltarClienteAreaCr);
						}

						jmenuItem.setEnabled(this.areacrConstantesFunciones.activarClienteAreaCr);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormAreaCr.jmenuDetalleAreaCr.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyAreaCr(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAreaCr(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAreaCr(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAreaCrListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAreaCr();
		
		this.cargarCombosFrameForeignKeyAreaCr();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAreaCr();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAreaCr();
		}
	}
	
	
	
	public void jButtonNuevoAreaCrActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.areacrSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
			
			if(jTableDatosAreaCr.getRowCount()>=1) {
				jTableDatosAreaCr.removeRowSelectionInterval(0, jTableDatosAreaCr.getRowCount()-1);						
			}
			
			this.isEsNuevoAreaCr=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAreaCr(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAreaCr(true);			
			//this.areacr=new AreaCr();
			//this.areacr.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAreaCr(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAreaCr() ;
			
			if(AreaCrJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAreaCr(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.areacr);	
			this.actualizarInformacion("INFO_PADRE",false,this.areacr);				
			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
			if(this.areacrSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AreaCr: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAreaCrActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAreaCr.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAreaCr.getSelectedRows().length;			
			}
			
			areacrsSeleccionados=this.getAreaCrsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAreaCr--;			
				//AreaCr areacrAux= new AreaCr();			
				//areacrAux.setId(this.iIdNuevoAreaCr);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AreaCr areacrOrigen=new AreaCr();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AreaCr areacrOrigen : areacrsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							areacrOrigen =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							areacrOrigen =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAreaCr();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.areacr.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAreaCr(areacrOrigen,this.areacr,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.areacrLogic.getAreaCrs().add(this.areacrAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.areacrs.add(this.areacrAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAreaCr(false);
				
				this.jTableDatosAreaCr.setRowSelectionInterval(this.getIndiceNuevoAreaCr(), this.getIndiceNuevoAreaCr());
				
				int iLastRow =  this.jTableDatosAreaCr.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAreaCr.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAreaCr.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAreaCr(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAreaCrActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();									
		
			AreaCr areacrOrigen=new AreaCr();
			AreaCr areacrDestino=new AreaCr();
				
			areacrsSeleccionados=this.getAreaCrsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAreaCr.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || areacrsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAreaCr.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrOrigen =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						areacrOrigen =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						areacrDestino =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						areacrDestino =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				areacrOrigen =areacrsSeleccionados.get(0);
				areacrDestino =areacrsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAreaCr(areacrOrigen,areacrDestino,true,false);
				
				areacrDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(areacrDestino,areacrLogic.getAreaCrs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(areacrDestino,areacrs);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAreaCr(false);
				
				//this.jTableDatosAreaCr.setRowSelectionInterval(this.getIndiceNuevoAreaCr(), this.getIndiceNuevoAreaCr());
				
				int iLastRow =  this.jTableDatosAreaCr.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAreaCr.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAreaCr.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAreaCr(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAreaCrActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAreaCr.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAreaCrActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAreaCr.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAreaCr.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAreaCr.setVisible(!isVisible);
			this.jPanelPaginacionAreaCr.setVisible(!isVisible);
			this.jPanelAccionesAreaCr.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAreaCrActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAreaCr();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAreaCrActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAreaCr();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAreaCrActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAreaCr();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAreaCrActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAreaCr();
			
			this.abrirFrameOrderByAreaCr();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAreaCrActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAreaCr();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAreaCr(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAreaCr);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAreaCr.isMaximum()) {
					this.jInternalFrameDetalleFormAreaCr.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAreaCr.setSize(this.jInternalFrameDetalleFormAreaCr.iWidthFormulario,this.jInternalFrameDetalleFormAreaCr.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAreaCr.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAreaCr.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAreaCr.isMaximum()) {
						this.jInternalFrameDetalleFormAreaCr.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAreaCr.jContentPaneDetalleAreaCr.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAreaCr.jTabbedPaneRelacionesAreaCr.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAreaCr.jContentPaneDetalleAreaCr.getWidth(),AreaCrConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAreaCr.jTabbedPaneRelacionesAreaCr.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAreaCr.jContentPaneDetalleAreaCr.getWidth(),AreaCrConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAreaCr.jTabbedPaneRelacionesAreaCr.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAreaCr.jContentPaneDetalleAreaCr.getWidth(),AreaCrConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAreaCr.setVisible(true);
	        this.jInternalFrameDetalleFormAreaCr.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAreaCr() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAreaCr==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAreaCr=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAreaCr,false,this);
				} else {
					this.jInternalFrameOrderByAreaCr=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAreaCr,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAreaCr);
				this.jInternalFrameOrderByAreaCr.setVisible(false);
				this.jInternalFrameOrderByAreaCr.setSelected(false);
				
				this.jInternalFrameOrderByAreaCr.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAreaCr"));
				
				this.inicializarActualizarBindingTablaOrderByAreaCr();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAreaCr() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAreaCr==null) {
				
				this.jInternalFrameImportacionAreaCr=new ImportacionJInternalFrame(AreaCrConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAreaCr);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAreaCr);
				this.jInternalFrameImportacionAreaCr.setVisible(false);
				this.jInternalFrameImportacionAreaCr.setSelected(false);


				this.jInternalFrameImportacionAreaCr.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAreaCr"));
				this.jInternalFrameImportacionAreaCr.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAreaCr"));
				this.jInternalFrameImportacionAreaCr.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAreaCr"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAreaCr() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAreaCr==null) {
				this.jInternalFrameReporteDinamicoAreaCr=new ReporteDinamicoJInternalFrame(AreaCrConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAreaCr);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAreaCr);
				this.jInternalFrameReporteDinamicoAreaCr.setVisible(false);
				this.jInternalFrameReporteDinamicoAreaCr.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAreaCr.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAreaCr"));
				this.jInternalFrameReporteDinamicoAreaCr.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAreaCr"));
				this.jInternalFrameReporteDinamicoAreaCr.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAreaCr"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAreaCr();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormAreaCr.jContentPaneDetalleAreaCr.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleAreaCr() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAreaCr);
			
	       	this.jInternalFrameDetalleFormAreaCr.setVisible(false);
	        this.jInternalFrameDetalleFormAreaCr.setSelected(false);
			
			//this.jInternalFrameDetalleFormAreaCr.dispose();
			//this.jInternalFrameDetalleFormAreaCr=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAreaCr() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAreaCr.setVisible(true);
	        this.jInternalFrameReporteDinamicoAreaCr.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAreaCr() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAreaCr.setVisible(true);
	        this.jInternalFrameImportacionAreaCr.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAreaCr() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAreaCr.setVisible(true);
	        this.jInternalFrameOrderByAreaCr.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAreaCr() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAreaCr.setVisible(false);
	        this.jInternalFrameOrderByAreaCr.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAreaCr() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAreaCr.setVisible(false);
	        this.jInternalFrameReporteDinamicoAreaCr.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAreaCr() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAreaCr.setVisible(false);
	        this.jInternalFrameImportacionAreaCr.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAreaCrActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAreaCr(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAreaCr(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAreaCr(true);
			//this.isEsNuevoAreaCr=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAreaCr("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAreaCr(false) ;
			
			if(areacrSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(AreaCrJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAreaCr(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAreaCr(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAreaCrActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAreaCr(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAreaCr(true);
			//this.isEsNuevoAreaCr=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.areacr.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAreaCr("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAreaCr(false) ;
			
			if(AreaCrJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAreaCr(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAreaCr(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarAreaCrActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAreaCr(false);
			
			//if(!this.isEsNuevoAreaCr) {								
				int intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AreaCrJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAreaCr(this.areacr,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
				
			}
			
			if(this.permiteMantenimiento(this.areacr)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.areacrSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAreaCr=true;
					this.inicializarActualizarBindingTablaAreaCr(false);
					this.isEsNuevoAreaCr=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAreaCr=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAreaCr=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAreaCr(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAreaCr(false);
				
				this.habilitarDeshabilitarControlesAreaCr(false);
			
												
				
				if(AreaCrJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAreaCr();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAreaCrActionPerformed(evt,areacrSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAreaCr(this.areacr,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAreaCr.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,areacrSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.areacr.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AreaCr.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AreaCr.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAreaCrActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				this.areacr.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				this.areacr.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.areacr)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.areacrSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AreaCrModel) this.jTableDatosAreaCr.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAreaCr=true;
				this.inicializarActualizarBindingTablaAreaCr(false);
				this.isEsNuevoAreaCr=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAreaCr(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAreaCr(false);
				
				this.habilitarDeshabilitarControlesAreaCr(false);
				
				
				
				if(AreaCrJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAreaCr();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAreaCrActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAreaCr.getRowCount()>=1) {
				jTableDatosAreaCr.removeRowSelectionInterval(0, jTableDatosAreaCr.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAreaCr(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAreaCr(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAreaCr(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAreaCr(false) ;
			
			this.isEsNuevoAreaCr=false;
			
			if(AreaCrJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAreaCr();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAreaCrActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAreaCr(false);
				
				//SI ES MANUAL
				if(AreaCrJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAreaCr();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAreaCrActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAreaCr--;			
			//AreaCr areacrAux= new AreaCr();			
			//areacrAux.setId(this.iIdNuevoAreaCr);
			
			if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAreaCr();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
			
			this.areacr.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.areacrLogic.getAreaCrs().add(this.areacrAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.areacrs.add(this.areacrAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAreaCr(false);
			
			this.jTableDatosAreaCr.setRowSelectionInterval(this.getIndiceNuevoAreaCr(), this.getIndiceNuevoAreaCr());
			
			int iLastRow =  this.jTableDatosAreaCr.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAreaCr.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAreaCr.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAreaCr(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAreaCrActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAreaCr(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAreaCr(false);
			
			//SI ES MANUAL
			if(AreaCrJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAreaCr();
			}
			
			//this.abrirFrameTreeAreaCr();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAreaCrActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE AreaS ?", "MANTENIMIENTO DE Area", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAreaCr.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAreaCr();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.areacrReturnGeneral=areacrLogic.procesarImportacionAreaCrsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.areacrParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAreaCrReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAreaCrActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAreaCr.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAreaCr.setFileImportacion(this.jInternalFrameImportacionAreaCr.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAreaCr.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAreaCr.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAreaCr.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAreaCr.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAreaCrActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();		

		areacrsSeleccionados=this.getAreaCrsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AreaCrBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AreaCrBaseDesign.jrxml";
			
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
			
			this.generarReporteAreaCrs("Todos",areacrsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areacrSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAreaCr.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AreaCrConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AreaCrConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AreaCrConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AreaCrConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAreaCr.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AreaCrConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case AreaCrConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case AreaCrConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case AreaCrConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AreaCrConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case AreaCrConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case AreaCrConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case AreaCrConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAreaCr.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AreaCrConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case AreaCrConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case AreaCrConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case AreaCrConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoAreaCrActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();		
		
		areacrsSeleccionados=this.getAreaCrsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"areacr";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AreaCrs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAreaCr.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AreaCrConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AreaCrConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(AreaCr areacr:areacrsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(areacr.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AreaCrConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AreaCrConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(AreaCr areacr:areacrsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(areacr.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AreaCrConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AreaCrConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(AreaCr areacr:areacrsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(areacr.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AreaCrConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AreaCrConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(AreaCr areacr:areacrsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(areacr.getnombre());
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
			//	this.getFilaCabeceraExportarExcelAreaCr(row);				
			//	iRow++;
			//}				
			
			//for(AreaCr areacrAux:areacrsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAreaCr(areacrAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areacrSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
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
				this.areacrLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAreaCr(false);
			
			//SI ES MANUAL
			if(AreaCrJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAreaCr();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAreaCrActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAreaCr(false);
			
			//SI ES MANUAL
			if(AreaCrJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAreaCr();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAreaCrActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAreaCr(false);
			
			//SI ES MANUAL
			if(AreaCrJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAreaCr();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAreaCr() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAreaCr.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAreaCr.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAreaCr.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAreaCr.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAreaCr.setMinimumSize(dimensionMinimum);
		this.jTableDatosAreaCr.setMaximumSize(dimensionMaximum);
		this.jTableDatosAreaCr.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAreaCr(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAreaCr(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAreaCr(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAreaCr(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAreaCr(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAreaCr(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAreaCr(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAreaCr(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AreaCrJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AreaCrJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAreaCr() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAreaCr();
		
		this.inicializarActualizarBindingBotonesManualAreaCr(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAreaCr();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAreaCr() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAreaCr(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAreaCr(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAreaCr.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAreaCr.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAreaCr.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAreaCr!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAreaCr.jCheckBoxPostAccionNuevoAreaCr.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAreaCr.jCheckBoxPostAccionSinCerrarAreaCr.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAreaCr.jCheckBoxPostAccionSinMensajeAreaCr.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAreaCr.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAreaCr.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAreaCr.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAreaCr!=null) {
				this.jInternalFrameDetalleFormAreaCr.jCheckBoxPostAccionNuevoAreaCr.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAreaCr.jCheckBoxPostAccionSinCerrarAreaCr.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAreaCr.jCheckBoxPostAccionSinMensajeAreaCr.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAreaCr.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAreaCr.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAreaCr!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAreaCr.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAreaCr!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAreaCr.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAreaCr.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAreaCr.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAreaCr.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAreaCr!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAreaCr.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAreaCr.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAreaCr.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAreaCr(Boolean esInicializar) throws Exception {
		try	{	
			if(AreaCrJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAreaCr(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAreaCr() throws Exception {
		try	{
			if(AreaCrJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAreaCr();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAreaCr() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAreaCr() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAreaCr.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAreaCr.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAreaCr.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAreaCr.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAreaCr.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAreaCr.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAreaCr.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAreaCr.addItem(reporte);
			}
			
			
			if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAreaCr.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAreaCr.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAreaCr.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAreaCr.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAreaCr.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAreaCr.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAreaCr.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAreaCr.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAreaCr.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAreaCr();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAreaCr() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAreaCr!=null) {
				this.jInternalFrameReporteDinamicoAreaCr.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAreaCr.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAreaCr!=null) {
				this.jInternalFrameReporteDinamicoAreaCr.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAreaCr.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAreaCr!=null) {
				
				if(this.jInternalFrameReporteDinamicoAreaCr.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAreaCr.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAreaCr.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAreaCr.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAreaCr.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAreaCr.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAreaCr()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoAreaCr.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreAreaCr.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAreaCr(Boolean esInicializar) throws Exception {				
		if(AreaCrJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAreaCr();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAreaCr() throws Exception {
		this.inicializarActualizarBindingTablaAreaCr(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAreaCr() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AreaCrPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AreaCrPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAreaCrOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAreaCrOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AreaCrPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AreaCrPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAreaCr(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=areacrLogic.getAreaCrs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=areacrs.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AreaCrJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAreaCr.setModel(new AreaCrModel(this.areacrLogic.getAreaCrs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAreaCr.setModel(new AreaCrModel(this.areacrs,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAreaCr!=null && this.jInternalFrameOrderByAreaCr.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAreaCr();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAreaCr.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAreaCr,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AreaCrPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AreaCrConstantesFunciones.SCLASSWEBTITULO,areacrConstantesFunciones.resaltarSeleccionarAreaCr,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AreaCrConstantesFunciones.SCLASSWEBTITULO,areacrConstantesFunciones.resaltarSeleccionarAreaCr,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAreaCr.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAreaCr,AreaCrConstantesFunciones.LABEL_ID));

		if(this.areacrConstantesFunciones.mostraridAreaCr && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaCrConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.areacrConstantesFunciones.resaltaridAreaCr,this.areacrConstantesFunciones.activaridAreaCr,this,true,"idAreaCr","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.areacrConstantesFunciones.resaltaridAreaCr,this.areacrConstantesFunciones.activaridAreaCr,this,true,"idAreaCr","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAreaCr.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAreaCr,AreaCrConstantesFunciones.LABEL_IDEMPRESA));

		if(this.areacrConstantesFunciones.mostrarid_empresaAreaCr && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaCrConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.areacrConstantesFunciones.resaltarid_empresaAreaCr,this,this.areacrConstantesFunciones.activarid_empresaAreaCr));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.areacrConstantesFunciones.resaltarid_empresaAreaCr,this,this.areacrConstantesFunciones.activarid_empresaAreaCr,false,"id_empresaAreaCr","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AreaCrPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAreaCr.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAreaCr,AreaCrConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.areacrConstantesFunciones.mostrarid_sucursalAreaCr && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaCrConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.areacrConstantesFunciones.resaltarid_sucursalAreaCr,this,this.areacrConstantesFunciones.activarid_sucursalAreaCr));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.areacrConstantesFunciones.resaltarid_sucursalAreaCr,this,this.areacrConstantesFunciones.activarid_sucursalAreaCr,false,"id_sucursalAreaCr","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AreaCrPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAreaCr.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAreaCr,AreaCrConstantesFunciones.LABEL_CODIGO));

		if(this.areacrConstantesFunciones.mostrarcodigoAreaCr && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaCrConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.areacrConstantesFunciones.resaltarcodigoAreaCr,this.areacrConstantesFunciones.activarcodigoAreaCr,this,true,"codigoAreaCr","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.areacrConstantesFunciones.resaltarcodigoAreaCr,this.areacrConstantesFunciones.activarcodigoAreaCr,this,true,"codigoAreaCr","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AreaCrPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAreaCr.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAreaCr,AreaCrConstantesFunciones.LABEL_NOMBRE));

		if(this.areacrConstantesFunciones.mostrarnombreAreaCr && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AreaCrConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.areacrConstantesFunciones.resaltarnombreAreaCr,this.areacrConstantesFunciones.activarnombreAreaCr,this,true,"nombreAreaCr","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.areacrConstantesFunciones.resaltarnombreAreaCr,this.areacrConstantesFunciones.activarnombreAreaCr,this,true,"nombreAreaCr","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AreaCrPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.areacrSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.areacrConstantesFunciones.mostrarClienteAreaCr && !AreaCrConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(areacrConstantesFunciones.resaltarClienteAreaCr,this,this.areacrConstantesFunciones.activarClienteAreaCr));
				tableColumn.setCellEditor(new ClienteTableCell(areacrConstantesFunciones.resaltarClienteAreaCr,this,this.areacrConstantesFunciones.activarClienteAreaCr));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosAreaCr.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.areacrSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.areacrSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAreaCr.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.areacrSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.areacrSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAreaCr.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAreaCr && this.isPermisoGuardarCambiosAreaCr) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.areacrSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.areacrSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAreaCr.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.areacrSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosAreaCr.addColumn(tableColumn);
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
			
			this.jTableDatosAreaCr.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAreaCr && this.isPermisoGuardarCambiosAreaCr) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.areacrSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAreaCr && this.isPermisoGuardarCambiosAreaCr) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAreaCr.moveColumn(this.jTableDatosAreaCr.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAreaCr.moveColumn(this.jTableDatosAreaCr.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.areacrSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosAreaCr.moveColumn(this.jTableDatosAreaCr.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAreaCr.moveColumn(this.jTableDatosAreaCr.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAreaCr.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAreaCr.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAreaCr,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AreaCrJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAreaCr.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAreaCr.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AreaCrJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AreaCrJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAreaCr.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAreaCr.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAreaCr.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=areacrLogic.getAreaCrs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=areacrs.size()-1;
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
		//this.jTableDatosAreaCr.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAreaCr.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAreaCr();
			
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
				
				//this.isEsNuevoAreaCr=false;
					
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
				if(this.areacrSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAreaCr==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAreaCr.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAreaCr.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.areacr.getsType().equals("DUPLICADO")
				   || this.areacr.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAreaCr=true;
				
				} else {
					this.isEsNuevoAreaCr=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
					if(this.areacr.getId()>=0 && !this.areacr.getIsNew()) {						
						this.isEsNuevoAreaCr=false;
						
					} else {
						this.isEsNuevoAreaCr=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAreaCr(esRelaciones);						
				
				this.seleccionarAreaCr(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.areacr.getId()<0) {
					this.isEsNuevoAreaCr=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAreaCr(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAreaCr(evt,rowIndex);
				}	
				
				if(this.areacrSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AreaCr: " + this.dDif); 
					}
				}								
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAreaCr(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.areacr)) {
					if(this.areacr.getId()>0) {
						this.areacr.setIsDeleted(true);
						
						this.areacrsEliminados.add(this.areacr);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.areacrLogic.getAreaCrs().remove(this.areacr);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.areacrs.remove(this.areacr);				
					}
					
					
					((AreaCrModel) this.jTableDatosAreaCr.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAreaCr(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAreaCr(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAreaCr) {
			
			if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAreaCr.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAreaCr.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AreaCrJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAreaCr(this.areacr);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.areacrConstantesFunciones.cargarid_empresaAreaCr || this.areacrConstantesFunciones.event_dependid_empresaAreaCr) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.areacr.getid_empresa());
									//this.inicializarActualizarBindingAreaCr(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(areacr.getEmpresa()!=null) {
							this.empresasForeignKey.add(areacr.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.areacr.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.areacrConstantesFunciones.cargarid_sucursalAreaCr || this.areacrConstantesFunciones.event_dependid_sucursalAreaCr) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.areacr.getid_sucursal());
									//this.inicializarActualizarBindingAreaCr(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(areacr.getSucursal()!=null) {
							this.sucursalsForeignKey.add(areacr.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.areacr.getid_sucursal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAreaCr("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAreaCr(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAreaCr() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAreaCr(AreaCr areacr) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAreaCr(areacr,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAreaCr(AreaCr areacr,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAreaCr(areacr);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAreaCr(areacr,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAreaCr(areacr);
	}
	
	public void setVariablesObjetoActualToFormularioAreaCr(AreaCr areacr) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAreaCr.jLabelidAreaCr.setText(areacr.getId().toString());
			this.jInternalFrameDetalleFormAreaCr.jTextFieldcodigoAreaCr.setText(areacr.getcodigo());
			this.jInternalFrameDetalleFormAreaCr.jTextAreanombreAreaCr.setText(areacr.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AreaCr areacrLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,areacrLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AreaCr areacrLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				areacrLocal=this.areacr;
			} else {
				areacrLocal=this.areacrAnterior;
			}
		}
		
		if(this.permiteMantenimiento(areacrLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAreaCr(areacrLocal,true);
					
					if(areacrSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(areacrLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.areacrSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(areacrLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAreaCr(AreaCr areacr,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAreaCr(areacr,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(areacr);
	}
	
	public void setVariablesFormularioToObjetoActualAreaCr(AreaCr areacr,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAreaCr(areacr,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAreaCr(AreaCr areacr,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAreaCr.jLabelidAreaCr.getText()==null || this.jInternalFrameDetalleFormAreaCr.jLabelidAreaCr.getText()=="" || this.jInternalFrameDetalleFormAreaCr.jLabelidAreaCr.getText()=="Id") {
				this.jInternalFrameDetalleFormAreaCr.jLabelidAreaCr.setText("0");
			}

			if(conColumnasBase) {areacr.setId(Long.parseLong(this.jInternalFrameDetalleFormAreaCr.jLabelidAreaCr.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AreaCrConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAreaCr.jLabelIdAreaCr,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			areacr.setcodigo(this.jInternalFrameDetalleFormAreaCr.jTextFieldcodigoAreaCr.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AreaCrConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAreaCr.jLabelcodigoAreaCr,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			areacr.setnombre(this.jInternalFrameDetalleFormAreaCr.jTextAreanombreAreaCr.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AreaCrConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAreaCr.jLabelnombreAreaCr,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAreaCr(AreaCr areacrBean,AreaCr areacr,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAreaCr(AreaCr areacrOrigen,AreaCr areacr,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && areacrOrigen.getId()!=null && !areacrOrigen.getId().equals(0L))) {areacr.setId(areacrOrigen.getId());}}
			if(conDefault || (!conDefault && areacrOrigen.getcodigo()!=null && !areacrOrigen.getcodigo().equals(""))) {areacr.setcodigo(areacrOrigen.getcodigo());}
			if(conDefault || (!conDefault && areacrOrigen.getnombre()!=null && !areacrOrigen.getnombre().equals(""))) {areacr.setnombre(areacrOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAreaCr(AreaCr areacr) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAreaCr.jLabelidAreaCr.setText(areacr.getId().toString());
			this.jInternalFrameDetalleFormAreaCr.jTextFieldcodigoAreaCr.setText(areacr.getcodigo());
			this.jInternalFrameDetalleFormAreaCr.jTextAreanombreAreaCr.setText(areacr.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAreaCr(AreaCrBean areacrBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAreaCr.jLabelidAreaCr.setText(areacrBean.getId().toString());
			this.jInternalFrameDetalleFormAreaCr.jTextFieldcodigoAreaCr.setText(areacrBean.getcodigo());
			this.jInternalFrameDetalleFormAreaCr.jTextAreanombreAreaCr.setText(areacrBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAreaCr(AreaCrParameterReturnGeneral areacrReturnGeneral,AreaCrBean areacrBean,Boolean conDefault) throws Exception { 
		try {
			AreaCr areacrLocal=new AreaCr();
			
			areacrLocal=areacrReturnGeneral.getAreaCr();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && areacrLocal.getId()!=null && !areacrLocal.getId().equals(0L))) {areacrBean.setId(areacrLocal.getId());}}
			if(conDefault || (!conDefault && areacrLocal.getcodigo()!=null && !areacrLocal.getcodigo().equals(""))) {areacrBean.setcodigo(areacrLocal.getcodigo());}
			if(conDefault || (!conDefault && areacrLocal.getnombre()!=null && !areacrLocal.getnombre().equals(""))) {areacrBean.setnombre(areacrLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAreaCrGenerico(Long idAreaCrSeleccionado,JComboBox jComboBoxAreaCr,List<AreaCr> areacrsLocal)throws Exception {
		try {
			AreaCr  areacrTemp=null;

			for(AreaCr areacrAux:areacrsLocal) {
				if(areacrAux.getId()!=null && areacrAux.getId().equals(idAreaCrSeleccionado)) {
					areacrTemp=areacrAux;
					break;
				}
			}

			jComboBoxAreaCr.setSelectedItem(areacrTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAreaCrGenerico(JComboBox jComboBoxAreaCr,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAreaCr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAreaCr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAreaCr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAreaCr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAreaCr.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAreaCr.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAreaCr.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAreaCr.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAreaCr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAreaCr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			areacr=(AreaCr) areacrLogic.getAreaCrs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			areacr =(AreaCr) areacrs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!areacr.getIsNew() && !areacr.getIsChanged() && !areacr.getIsDeleted()) {
				sDescripcion=areacr.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=areacr.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!areacr.getIsNew() && !areacr.getIsChanged() && !areacr.getIsDeleted()) {
				sDescripcion=areacr.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=areacr.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AreaCr areacrRow=new AreaCr();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			areacrRow=(AreaCr) areacrLogic.getAreaCrs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			areacrRow=(AreaCr) areacrs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,AreaCr areacr) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormAreaCr==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.areacr = (AreaCr)this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.areacr = (AreaCr)this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(areacr!=null) {
						this.areacr = areacr;
					} else {
						this.areacr = new AreaCr();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.areacr)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame;
					}

					List<AreaCr> areacrs=new ArrayList<AreaCr>();
					areacrs.add(this.areacr);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormAreaCr.cargarClienteBeanSwingJInternalFrame(areacrs,this.areacr,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderAreaCr=(TitledBorder)this.jScrollPanelDatosAreaCr.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderAreaCr.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.areacrSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAreaCr(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAreaCr.setVisible((this.isVisibilidadCeldaNuevoAreaCr && this.isPermisoNuevoAreaCr));			
			this.jButtonDuplicarAreaCr.setVisible((this.isVisibilidadCeldaDuplicarAreaCr && this.isPermisoDuplicarAreaCr));			
			this.jButtonCopiarAreaCr.setVisible((this.isVisibilidadCeldaCopiarAreaCr && this.isPermisoCopiarAreaCr));
			this.jButtonVerFormAreaCr.setVisible((this.isVisibilidadCeldaVerFormAreaCr && this.isPermisoVerFormAreaCr));
			
			this.jButtonAbrirOrderByAreaCr.setVisible((this.isVisibilidadCeldaOrdenAreaCr && this.isPermisoOrdenAreaCr));			
			
			this.jButtonNuevoRelacionesAreaCr.setVisible((this.isVisibilidadCeldaNuevoRelacionesAreaCr && this.isPermisoNuevoAreaCr));			
			this.jButtonNuevoGuardarCambiosAreaCr.setVisible((this.isVisibilidadCeldaNuevoAreaCr && this.isPermisoNuevoAreaCr && this.isPermisoGuardarCambiosAreaCr));
			
			if(this.jInternalFrameDetalleFormAreaCr!=null) {
			this.jInternalFrameDetalleFormAreaCr.jButtonModificarAreaCr.setVisible((this.isVisibilidadCeldaModificarAreaCr && this.isPermisoActualizarAreaCr));	
			this.jInternalFrameDetalleFormAreaCr.jButtonActualizarAreaCr.setVisible((this.isVisibilidadCeldaActualizarAreaCr && this.isPermisoActualizarAreaCr));	
			this.jInternalFrameDetalleFormAreaCr.jButtonEliminarAreaCr.setVisible((this.isVisibilidadCeldaEliminarAreaCr && this.isPermisoEliminarAreaCr));
			this.jInternalFrameDetalleFormAreaCr.jButtonCancelarAreaCr.setVisible(this.isVisibilidadCeldaCancelarAreaCr);							
			this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosAreaCr.setVisible((this.isVisibilidadCeldaGuardarAreaCr && this.isPermisoGuardarCambiosAreaCr));			
			
			}
						
			this.jButtonGuardarCambiosTablaAreaCr.setVisible((this.isVisibilidadCeldaGuardarCambiosAreaCr && this.isPermisoGuardarCambiosAreaCr));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAreaCr.setVisible((this.isVisibilidadCeldaNuevoAreaCr && this.isPermisoNuevoAreaCr));						
			this.jButtonDuplicarToolBarAreaCr.setVisible((this.isVisibilidadCeldaDuplicarAreaCr && this.isPermisoDuplicarAreaCr));						
			this.jButtonCopiarToolBarAreaCr.setVisible((this.isVisibilidadCeldaCopiarAreaCr && this.isPermisoCopiarAreaCr));			
			this.jButtonVerFormToolBarAreaCr.setVisible((this.isVisibilidadCeldaVerFormAreaCr && this.isPermisoVerFormAreaCr));			
			this.jButtonAbrirOrderByToolBarAreaCr.setVisible((this.isVisibilidadCeldaOrdenAreaCr && this.isPermisoOrdenAreaCr));
			this.jButtonNuevoRelacionesToolBarAreaCr.setVisible((this.isVisibilidadCeldaNuevoRelacionesAreaCr && this.isPermisoNuevoAreaCr));			
			this.jButtonNuevoGuardarCambiosToolBarAreaCr.setVisible((this.isVisibilidadCeldaNuevoAreaCr && this.isPermisoNuevoAreaCr && this.isPermisoGuardarCambiosAreaCr));			
			
			if(this.jInternalFrameDetalleFormAreaCr!=null) {
			this.jInternalFrameDetalleFormAreaCr.jButtonModificarToolBarAreaCr.setVisible((this.isVisibilidadCeldaModificarAreaCr && this.isPermisoActualizarAreaCr));	
			this.jInternalFrameDetalleFormAreaCr.jButtonActualizarToolBarAreaCr.setVisible((this.isVisibilidadCeldaActualizarAreaCr  && this.isPermisoActualizarAreaCr));	
			this.jInternalFrameDetalleFormAreaCr.jButtonEliminarToolBarAreaCr.setVisible((this.isVisibilidadCeldaEliminarAreaCr && this.isPermisoEliminarAreaCr));
			this.jInternalFrameDetalleFormAreaCr.jButtonCancelarToolBarAreaCr.setVisible(this.isVisibilidadCeldaCancelarAreaCr);				
			this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosToolBarAreaCr.setVisible((this.isVisibilidadCeldaGuardarAreaCr && this.isPermisoGuardarCambiosAreaCr));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAreaCr.setVisible((this.isVisibilidadCeldaGuardarCambiosAreaCr && this.isPermisoGuardarCambiosAreaCr));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAreaCr.setVisible((this.isVisibilidadCeldaNuevoAreaCr && this.isPermisoNuevoAreaCr));			
			this.jMenuItemDuplicarAreaCr.setVisible((this.isVisibilidadCeldaDuplicarAreaCr && this.isPermisoDuplicarAreaCr));			
			this.jMenuItemCopiarAreaCr.setVisible((this.isVisibilidadCeldaCopiarAreaCr && this.isPermisoCopiarAreaCr));			
			this.jMenuItemVerFormAreaCr.setVisible((this.isVisibilidadCeldaVerFormAreaCr && this.isPermisoVerFormAreaCr));			
			this.jMenuItemAbrirOrderByAreaCr.setVisible((this.isVisibilidadCeldaOrdenAreaCr && this.isPermisoOrdenAreaCr));			
			//this.jMenuItemMostrarOcultarAreaCr.setVisible((this.isVisibilidadCeldaOrdenAreaCr && this.isPermisoOrdenAreaCr));
			this.jMenuItemDetalleAbrirOrderByAreaCr.setVisible((this.isVisibilidadCeldaOrdenAreaCr && this.isPermisoOrdenAreaCr));			
			//this.jMenuItemDetalleMostrarOcultarAreaCr.setVisible((this.isVisibilidadCeldaOrdenAreaCr && this.isPermisoOrdenAreaCr));			
			this.jMenuItemNuevoRelacionesAreaCr.setVisible((this.isVisibilidadCeldaNuevoRelacionesAreaCr && this.isPermisoNuevoAreaCr));			
			this.jMenuItemNuevoGuardarCambiosAreaCr.setVisible((this.isVisibilidadCeldaNuevoAreaCr && this.isPermisoNuevoAreaCr && this.isPermisoGuardarCambiosAreaCr));									
			
			if(this.jInternalFrameDetalleFormAreaCr!=null) {
			this.jInternalFrameDetalleFormAreaCr.jMenuItemModificarAreaCr.setVisible((this.isVisibilidadCeldaModificarAreaCr && this.isPermisoActualizarAreaCr));	
			this.jInternalFrameDetalleFormAreaCr.jMenuItemActualizarAreaCr.setVisible((this.isVisibilidadCeldaActualizarAreaCr && this.isPermisoActualizarAreaCr));	
			this.jInternalFrameDetalleFormAreaCr.jMenuItemEliminarAreaCr.setVisible((this.isVisibilidadCeldaEliminarAreaCr && this.isPermisoEliminarAreaCr));
			this.jInternalFrameDetalleFormAreaCr.jMenuItemCancelarAreaCr.setVisible(this.isVisibilidadCeldaCancelarAreaCr);				
			}
			
			this.jMenuItemGuardarCambiosAreaCr.setVisible((this.isVisibilidadCeldaGuardarAreaCr && this.isPermisoGuardarCambiosAreaCr));						
			this.jMenuItemGuardarCambiosTablaAreaCr.setVisible((this.isVisibilidadCeldaGuardarCambiosAreaCr && this.isPermisoGuardarCambiosAreaCr));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAreaCr=this.jButtonNuevoAreaCr.isVisible();
			this.isVisibilidadCeldaDuplicarAreaCr=this.jButtonDuplicarAreaCr.isVisible();
			this.isVisibilidadCeldaCopiarAreaCr=this.jButtonCopiarAreaCr.isVisible();
			this.isVisibilidadCeldaVerFormAreaCr=this.jButtonVerFormAreaCr.isVisible();
			
			this.isVisibilidadCeldaOrdenAreaCr=this.jButtonAbrirOrderByAreaCr.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=this.jButtonNuevoRelacionesAreaCr.isVisible();
			this.isVisibilidadCeldaModificarAreaCr=this.jButtonModificarAreaCr.isVisible();
			
			if(this.jInternalFrameDetalleFormAreaCr!=null) {
			this.isVisibilidadCeldaActualizarAreaCr=this.jInternalFrameDetalleFormAreaCr.jButtonActualizarAreaCr.isVisible();
			this.isVisibilidadCeldaEliminarAreaCr=this.jInternalFrameDetalleFormAreaCr.jButtonEliminarAreaCr.isVisible();
			this.isVisibilidadCeldaCancelarAreaCr=this.jInternalFrameDetalleFormAreaCr.jButtonCancelarAreaCr.isVisible();
			this.isVisibilidadCeldaGuardarAreaCr=this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosAreaCr.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAreaCr=this.jButtonGuardarCambiosTablaAreaCr.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAreaCr=this.jButtonNuevoToolBarAreaCr.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=this.jButtonNuevoRelacionesToolBarAreaCr.isVisible();
			
			if(this.jInternalFrameDetalleFormAreaCr!=null) {
			this.isVisibilidadCeldaModificarAreaCr=this.jInternalFrameDetalleFormAreaCr.jButtonModificarToolBarAreaCr.isVisible();
			this.isVisibilidadCeldaActualizarAreaCr=this.jInternalFrameDetalleFormAreaCr.jButtonActualizarToolBarAreaCr.isVisible();
			this.isVisibilidadCeldaEliminarAreaCr=this.jInternalFrameDetalleFormAreaCr.jButtonEliminarToolBarAreaCr.isVisible();
			this.isVisibilidadCeldaCancelarAreaCr=this.jInternalFrameDetalleFormAreaCr.jButtonCancelarToolBarAreaCr.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAreaCr=this.jButtonGuardarCambiosToolBarAreaCr.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAreaCr=this.jButtonGuardarCambiosTablaToolBarAreaCr.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAreaCr=this.jMenuItemNuevoAreaCr.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=this.jMenuItemNuevoRelacionesAreaCr.isVisible();
			
			if(this.jInternalFrameDetalleFormAreaCr!=null) {
			this.isVisibilidadCeldaModificarAreaCr=this.jInternalFrameDetalleFormAreaCr.jMenuItemModificarAreaCr.isVisible();
			this.isVisibilidadCeldaActualizarAreaCr=this.jInternalFrameDetalleFormAreaCr.jMenuItemActualizarAreaCr.isVisible();
			this.isVisibilidadCeldaEliminarAreaCr=this.jInternalFrameDetalleFormAreaCr.jMenuItemEliminarAreaCr.isVisible();
			this.isVisibilidadCeldaCancelarAreaCr=this.jInternalFrameDetalleFormAreaCr.jMenuItemCancelarAreaCr.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAreaCr=this.jMenuItemGuardarCambiosAreaCr.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAreaCr=this.jMenuItemGuardarCambiosTablaAreaCr.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAreaCr(Boolean esInicializar) {
		if(AreaCrJInternalFrame.ISBINDING_MANUAL) {			
			if(this.areacrSessionBean.getConGuardarRelaciones()) {
				//if(this.areacrSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAreaCr();
			}
			
			this.inicializarActualizarBindingBotonesManualAreaCr(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAreaCr() {
		this.jButtonNuevoAreaCr.setVisible(this.isPermisoNuevoAreaCr);			
		this.jButtonDuplicarAreaCr.setVisible(this.isPermisoDuplicarAreaCr);			
		this.jButtonCopiarAreaCr.setVisible(this.isPermisoCopiarAreaCr);			
		this.jButtonVerFormAreaCr.setVisible(this.isPermisoVerFormAreaCr);			
		
		this.jButtonAbrirOrderByAreaCr.setVisible(this.isPermisoOrdenAreaCr);					
		
		this.jButtonNuevoRelacionesAreaCr.setVisible(this.isPermisoNuevoAreaCr);			
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jButtonModificarAreaCr.setVisible(this.isPermisoActualizarAreaCr);	
			this.jInternalFrameDetalleFormAreaCr.jButtonActualizarAreaCr.setVisible(this.isPermisoActualizarAreaCr);	
			this.jInternalFrameDetalleFormAreaCr.jButtonEliminarAreaCr.setVisible(this.isPermisoEliminarAreaCr);
			this.jInternalFrameDetalleFormAreaCr.jButtonCancelarAreaCr.setVisible(this.isVisibilidadCeldaCancelarAreaCr);						
			this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosAreaCr.setVisible(this.isPermisoGuardarCambiosAreaCr);							
		}
		
		this.jButtonGuardarCambiosTablaAreaCr.setVisible(this.isPermisoActualizarAreaCr);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAreaCr() {
		this.jInternalFrameDetalleFormAreaCr.jButtonModificarAreaCr.setVisible(this.isPermisoActualizarAreaCr);	
		this.jInternalFrameDetalleFormAreaCr.jButtonActualizarAreaCr.setVisible(this.isPermisoActualizarAreaCr);	
		this.jInternalFrameDetalleFormAreaCr.jButtonEliminarAreaCr.setVisible(this.isPermisoEliminarAreaCr);
		this.jInternalFrameDetalleFormAreaCr.jButtonCancelarAreaCr.setVisible(this.isVisibilidadCeldaCancelarAreaCr);							
		this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosAreaCr.setVisible((this.isVisibilidadCeldaGuardarAreaCr && this.isPermisoGuardarCambiosAreaCr));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAreaCr() {
		if(AreaCrJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAreaCr();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAreaCr() {
	}
	
	public void jTableDatosAreaCrListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAreaCr(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAreaCrBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAreaCr(this.getareacr(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.areacr==null) {
						this.areacr = new AreaCr();
					}

					this.setVariablesFormularioToObjetoActualAreaCr(this.areacr,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
				}

				if(this.areacr.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.areacr.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAreaCr(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAreaCrUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAreaCr(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAreaCr.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAreaCr.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAreaCr(this.getareacr(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.areacrLogic.getConnexion());

				if(this.areacr.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.areacr.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAreaCr=(TitledBorder)this.jScrollPanelDatosAreaCr.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAreaCr.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAreaCrBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAreaCr(this.getareacr(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.areacr==null) {
						this.areacr = new AreaCr();
					}

					this.setVariablesFormularioToObjetoActualAreaCr(this.areacr,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
				}

				if(this.areacr.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.areacr.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAreaCr(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalAreaCrUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebAreaCr(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAreaCr.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAreaCr.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAreaCr(this.getareacr(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.areacrLogic.getConnexion());

				if(this.areacr.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.areacr.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAreaCr=(TitledBorder)this.jScrollPanelDatosAreaCr.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderAreaCr.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalAreaCrBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAreaCr(this.getareacr(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.areacr==null) {
						this.areacr = new AreaCr();
					}

					this.setVariablesFormularioToObjetoActualAreaCr(this.areacr,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
				}

				if(this.areacr.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.areacr.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAreaCr(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoAreaCrBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAreaCr(this.getareacr(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.areacr==null) {
						this.areacr = new AreaCr();
					}

					this.setVariablesFormularioToObjetoActualAreaCr(this.areacr,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
				}

				if(this.areacr.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.areacr.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAreaCr(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreAreaCrBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAreaCr(this.getareacr(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.areacr==null) {
						this.areacr = new AreaCr();
					}

					this.setVariablesFormularioToObjetoActualAreaCr(this.areacr,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);
				}

				if(this.areacr.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.areacr.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAreaCr(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoAreaCrActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAreaCr(false,false);

			this.getAreaCrsBusquedaPorCodigo();

			this.inicializarActualizarBindingAreaCr(false);

			//if(AreaCrBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAreaCr(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreAreaCrActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAreaCr(false,false);

			this.getAreaCrsBusquedaPorNombre();

			this.inicializarActualizarBindingAreaCr(false);

			//if(AreaCrBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAreaCr(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAreaCrActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAreaCr(false,false);

			this.getAreaCrsFK_IdEmpresa();

			this.inicializarActualizarBindingAreaCr(false);

			//if(AreaCrBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAreaCr(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalAreaCrActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAreaCr(false,false);

			this.getAreaCrsFK_IdSucursal();

			this.inicializarActualizarBindingAreaCr(false);

			//if(AreaCrBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAreaCr(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.areacrLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAreaCr() {
		if(this.jInternalFrameDetalleFormAreaCr!=null) {
		

		if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) {
			this.jInternalFrameDetalleFormAreaCr.setVisible(false);	    			
			this.jInternalFrameDetalleFormAreaCr.dispose();
			this.jInternalFrameDetalleFormAreaCr=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAreaCr!=null) {
			this.jInternalFrameReporteDinamicoAreaCr.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAreaCr.dispose();
			this.jInternalFrameReporteDinamicoAreaCr=null;
		}
		
		if(this.jInternalFrameImportacionAreaCr!=null) {
			this.jInternalFrameImportacionAreaCr.setVisible(false);	    			
			this.jInternalFrameImportacionAreaCr.dispose();
			this.jInternalFrameImportacionAreaCr=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAreaCr();
			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
			
			if(sTipo.equals("NuevoAreaCr")) {
				jButtonNuevoAreaCrActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAreaCr")) {
				jButtonDuplicarAreaCrActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAreaCr")) {
				jButtonCopiarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("VerFormAreaCr")) {
				jButtonVerFormAreaCrActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAreaCr")) {
				jButtonNuevoAreaCrActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAreaCr")) {
				jButtonDuplicarAreaCrActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAreaCr")) {
				jButtonNuevoAreaCrActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAreaCr")) {
				jButtonDuplicarAreaCrActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAreaCr")) {
				jButtonNuevoAreaCrActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAreaCr")) {
				jButtonNuevoAreaCrActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAreaCr")) {
				jButtonNuevoAreaCrActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAreaCr")) {
				jButtonModificarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAreaCr")) {
				jButtonModificarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAreaCr")) {
				jButtonModificarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAreaCr")) {
				jButtonActualizarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAreaCr")) {
				jButtonActualizarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAreaCr")) {
				jButtonActualizarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("EliminarAreaCr")) {
				jButtonEliminarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAreaCr")) {
				jButtonEliminarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAreaCr")) {
				jButtonEliminarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("CancelarAreaCr")) {
				jButtonCancelarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAreaCr")) {
				jButtonCancelarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAreaCr")) {
				jButtonCancelarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("CerrarAreaCr")) {
				jButtonCerrarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAreaCr")) {
				jButtonCerrarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAreaCr")) {
				jButtonCerrarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAreaCr")) {
				jButtonMostrarOcultarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAreaCr")) {
				jButtonCancelarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAreaCr")) {
				jButtonGuardarCambiosAreaCrActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAreaCr")) {
				jButtonGuardarCambiosAreaCrActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAreaCr")) {
				jButtonCopiarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAreaCr")) {
				jButtonVerFormAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAreaCr")) {
				jButtonGuardarCambiosAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAreaCr")) {
				jButtonCopiarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAreaCr")) {
				jButtonVerFormAreaCrActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAreaCr")) {
				jButtonGuardarCambiosAreaCrActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAreaCr")) {
				jButtonGuardarCambiosAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAreaCr")) {
				jButtonGuardarCambiosAreaCrActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAreaCr")) {
				jButtonRecargarInformacionAreaCrActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAreaCr")) {
				jButtonRecargarInformacionAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAreaCr")) {
				jButtonRecargarInformacionAreaCrActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAreaCr")) {
				jButtonAnterioresAreaCrActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAreaCr")) {
				jButtonAnterioresAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAreaCr")) {
				jButtonAnterioresAreaCrActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAreaCr")) {
				jButtonSiguientesAreaCrActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAreaCr")) {
				jButtonSiguientesAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAreaCr")) {
				jButtonSiguientesAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAreaCr") || sTipo.equals("MenuItemDetalleAbrirOrderByAreaCr")) {
				jButtonAbrirOrderByAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAreaCr") || sTipo.equals("MenuItemDetalleMostrarOcultarAreaCr")) {
				jButtonMostrarOcultarAreaCrActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAreaCr")) {
				jButtonNuevoGuardarCambiosAreaCrActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAreaCr")) {
				jButtonNuevoGuardarCambiosAreaCrActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAreaCr")) {
				jButtonNuevoGuardarCambiosAreaCrActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAreaCr")) {
				jButtonCerrarReporteDinamicoAreaCrActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAreaCr")) {
				jButtonGenerarReporteDinamicoAreaCrActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAreaCr")) {
				
				jButtonGenerarExcelReporteDinamicoAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAreaCr")) {
				jButtonCerrarImportacionAreaCrActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAreaCr")) {
				
				jButtonGenerarImportacionAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAreaCr")) {
				
				jButtonAbrirImportacionAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAreaCr")) {
				jComboBoxTiposAccionesAreaCrActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAreaCr")) {
				jComboBoxTiposRelacionesAreaCrActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAreaCr")) {
				jComboBoxTiposAccionesAreaCrActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAreaCr")) {
				
				jComboBoxTiposSeleccionarAreaCrActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAreaCr")) {
				jTextFieldValorCampoGeneralAreaCrActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAreaCr")) {
				jButtonAbrirOrderByAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAreaCr")) {
				jButtonAbrirOrderByAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAreaCr")) {
				jButtonCerrarOrderByAreaCrActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAreaCrBusqueda")) {
				this.jButtonidAreaCrBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAreaCrUpdate")) {
				this.jButtonid_empresaAreaCrUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAreaCrBusqueda")) {
				this.jButtonid_empresaAreaCrBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalAreaCrUpdate")) {
				this.jButtonid_sucursalAreaCrUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalAreaCrBusqueda")) {
				this.jButtonid_sucursalAreaCrBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAreaCrBusqueda")) {
				this.jButtoncodigoAreaCrBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAreaCrBusqueda")) {
				this.jButtonnombreAreaCrBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoAreaCr")) {
				this.jButtonBusquedaPorCodigoAreaCrActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreAreaCr")) {
				this.jButtonBusquedaPorNombreAreaCrActionPerformed(evt);
			}
			
			;
			
			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAreaCr();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaCrActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				


				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AreaCr.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AreaCr.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AreaCr areacrLocal=null;
			
			if(!this.getEsControlTabla()) {
				areacrLocal=this.areacr;
			} else {
				areacrLocal=this.areacrAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
							
				
				


				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AreaCr.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AreaCr.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaCrActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrAnterior =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areacrAnterior =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
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
			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
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
			
			


			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaCrActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
								
						
				


				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AreaCr.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AreaCr.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
								
				
				


				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AreaCr.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AreaCr.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaCrActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrAnterior =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areacrAnterior =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				this.actualizarInformacion("INFO_PADRE",false,this.areacr);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaCrActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrAnterior =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areacrAnterior =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaCrActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
			
			this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
							
				
				


				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AreaCr.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AreaCr.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaCrActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.areacrAnterior =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.areacrAnterior =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
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
			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
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
			
			


			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaCrActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
			
			this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
								
				
				


				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AreaCr.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AreaCr.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaCrActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrAnterior =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areacrAnterior =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaCrActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
			
			this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaCrActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAreaCr")) {
					jCheckBoxSeleccionarTodosAreaCrItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAreaCr")) {
					jCheckBoxSeleccionadosAreaCrItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAreaCr")) {
					
				}
				
				


				
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AreaCr.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AreaCr.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
												
				
				


				
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AreaCr.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AreaCr.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaCrActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.areacrAnterior =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.areacrAnterior =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaCrActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
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
			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
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
			
			


			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAreaCrActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AreaCr.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AreaCr.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.areacr);
				
				this.actualizarInformacion("INFO_PADRE",false,this.areacr);
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
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
				
				


				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AreaCr.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AreaCr.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAreaCrActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.areacrAnterior =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.areacrAnterior =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAreaCr")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAreaCrListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAreaCr.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.areacr =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.areacr =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.areacr);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAreaCr")) {
				
				}
				
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAreaCr")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAreaCr.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAreaCr")) {
			
			}
			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAreaCr();
			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
			if(sTipo.equals("NuevoAreaCr")) {
				jButtonNuevoAreaCrActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAreaCr")) {
				jButtonDuplicarAreaCrActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAreaCr")) {
				jButtonCopiarAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAreaCr")) {
				jButtonVerFormAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAreaCr")) {
				jButtonNuevoAreaCrActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAreaCr")) {
				jButtonModificarAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAreaCr")) {
				jButtonActualizarAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAreaCr")) {
				jButtonEliminarAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAreaCr")) {
				jButtonGuardarCambiosAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAreaCr")) {
				jButtonCancelarAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAreaCr")) {
				jButtonCerrarAreaCrActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAreaCr")) {
				jButtonGuardarCambiosAreaCrActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAreaCr")) {
				jButtonNuevoGuardarCambiosAreaCrActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAreaCr")) {
				jButtonAbrirOrderByAreaCrActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAreaCr")) {
				jButtonRecargarInformacionAreaCrActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAreaCr")) {
				jButtonAnterioresAreaCrActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAreaCr")) {
				jButtonSiguientesAreaCrActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAreaCrBusqueda")) {
				this.jButtonidAreaCrBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAreaCrUpdate")) {
				this.jButtonid_empresaAreaCrUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAreaCrBusqueda")) {
				this.jButtonid_empresaAreaCrBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalAreaCrUpdate")) {
				this.jButtonid_sucursalAreaCrUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalAreaCrBusqueda")) {
				this.jButtonid_sucursalAreaCrBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAreaCrBusqueda")) {
				this.jButtoncodigoAreaCrBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAreaCrBusqueda")) {
				this.jButtonnombreAreaCrBusquedaActionPerformed(evt);
			}
			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAreaCr();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAreaCr")) {
				closingInternalFrameAreaCr();
				
			} else if(sTipo.equals("jButtonCancelarAreaCr")) {
				JInternalFrameBase jInternalFrameDetalleFormAreaCr = (JInternalFrameBase)evt.getSource();
	            	
	            AreaCrBeanSwingJInternalFrame jInternalFrameParent=(AreaCrBeanSwingJInternalFrame)jInternalFrameDetalleFormAreaCr.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAreaCrActionPerformed(null);
			}
			
			AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.areacr,new Object(),this.areacrParameterGeneral,this.areacrReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAreaCr(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAreaCr(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAreaCr(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.areacr)) {
			if(!esControlTabla) {
				if(AreaCrJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAreaCr(this.areacr,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);			
				}
				
				if(this.areacrSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAreaCr(this.areacr,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.areacrReturnGeneral=areacrLogic.procesarEventosAreaCrsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.areacrLogic.getAreaCrs(),this.areacr,this.areacrParameterGeneral,this.isEsNuevoAreaCr,classes);//this.areacrLogic.getAreaCr()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAreaCr(this.areacrReturnGeneral,this.areacrBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.areacrSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAreaCr(classes,this.areacrReturnGeneral,this.areacrBean,false);
					}
						
					if(this.areacrReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAreaCr(this.areacrReturnGeneral.getAreaCr());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAreaCr(this.areacrReturnGeneral.getAreaCr());	
					}
						
					if(this.areacrReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAreaCr(this.areacrReturnGeneral.getAreaCr(),classes);//this.areacrBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAreaCr(this.areacr,classes);//this.areacrBean);									
				}
			
				if(AreaCrJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAreaCr(this.areacr,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAreaCr(this.areacr);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.areacrAnterior!=null) {
						this.areacr=this.areacrAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.areacrReturnGeneral=areacrLogic.procesarEventosAreaCrsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.areacrLogic.getAreaCrs(),this.areacr,this.areacrParameterGeneral,this.isEsNuevoAreaCr,classes);//this.areacrLogic.getAreaCr()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.areacrSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.areacrSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.areacrReturnGeneral.getAreaCr(),areacrLogic.getAreaCrs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.areacrReturnGeneral.getAreaCr(),this.areacrs);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAreaCr.repaint();
				
				//((AbstractTableModel) this.jTableDatosAreaCr.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAreaCr();
			}
		}
	}
	
	public void actualizarVisualTableDatosAreaCr() throws Exception {
		
		AreaCrModel areacrModel=(AreaCrModel)this.jTableDatosAreaCr.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			areacrModel.areacrs=this.areacrLogic.getAreaCrs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			areacrModel.areacrs=this.areacrs;
		}
		
		
		((AreaCrModel) this.jTableDatosAreaCr.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAreaCr() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getareacrAnterior(),this.areacrLogic.getAreaCrs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getareacrAnterior(),this.areacrs);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAreaCr();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAreaCr(AreaCr areacr,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(areacr.getClientes());
					this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
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
										
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.areacr,new Object(),generalEntityParameterGeneral,this.areacrReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.areacrSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AreaCrConstantesFunciones.getClassesRelationshipsOfAreaCr(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AreaCrConstantesFunciones.getClassesRelationshipsFromStringsOfAreaCr(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAreaCr(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AreaCrBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.areacr,new Object(),generalEntityParameterGeneral,this.areacrReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAreaCr(AreaCrBean areacrBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(areacr.getClientes());
					this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAreaCr(ArrayList<Classe> classes,AreaCrReturnGeneral areacrReturnGeneral,AreaCrBean areacrBean,Boolean conDefault) throws Exception {
		
			this.areacrBean.setClientes(areacrReturnGeneral.getAreaCr().getClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAreaCr(AreaCr areacr,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					areacr.setClientes(this.jInternalFrameDetalleFormAreaCr.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.areacr)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAreaCr = new AreaCrDetalleFormJInternalFrame(jDesktopPane,this.areacrSessionBean.getConGuardarRelaciones(),this.areacrSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAreaCr);
		this.jInternalFrameDetalleFormAreaCr.setVisible(false);
		this.jInternalFrameDetalleFormAreaCr.setSelected(false);						
		
		this.jInternalFrameDetalleFormAreaCr.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAreaCr.areacrLogic=this.areacrLogic;
		
		this.cargarCombosFrameForeignKeyAreaCr("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAreaCr();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAreaCr();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAreaCr("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAreaCr();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAreaCr.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAreaCr"));
		
		this.jInternalFrameDetalleFormAreaCr.jButtonModificarAreaCr.addActionListener(new ButtonActionListener(this,"ModificarAreaCr"));

		
		this.jInternalFrameDetalleFormAreaCr.jButtonModificarToolBarAreaCr.addActionListener(new ButtonActionListener(this,"ModificarToolBarAreaCr"));
					
		this.jInternalFrameDetalleFormAreaCr.jMenuItemModificarAreaCr.addActionListener(new ButtonActionListener(this,"MenuItemModificarAreaCr"));		
		
		
		
		this.jInternalFrameDetalleFormAreaCr.jButtonActualizarAreaCr.addActionListener (new ButtonActionListener(this,"ActualizarAreaCr"));
		
		
		this.jInternalFrameDetalleFormAreaCr.jButtonActualizarToolBarAreaCr.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAreaCr"));
						
		this.jInternalFrameDetalleFormAreaCr.jMenuItemActualizarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAreaCr"));		
		
		
		
		this.jInternalFrameDetalleFormAreaCr.jButtonEliminarAreaCr.addActionListener (new ButtonActionListener(this,"EliminarAreaCr"));
		
		
		this.jInternalFrameDetalleFormAreaCr.jButtonEliminarToolBarAreaCr.addActionListener (new ButtonActionListener(this,"EliminarToolBarAreaCr"));
								
		this.jInternalFrameDetalleFormAreaCr.jMenuItemEliminarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAreaCr"));		
		
		
		
		this.jInternalFrameDetalleFormAreaCr.jButtonCancelarAreaCr.addActionListener (new ButtonActionListener(this,"CancelarAreaCr"));
		
		
		this.jInternalFrameDetalleFormAreaCr.jButtonCancelarToolBarAreaCr.addActionListener (new ButtonActionListener(this,"CancelarToolBarAreaCr"));
					
		this.jInternalFrameDetalleFormAreaCr.jMenuItemCancelarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAreaCr"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAreaCr.jMenuItemDetalleCerrarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAreaCr"));		
		
		
		
		this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosToolBarAreaCr.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAreaCr"));
		
		
		
		this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosToolBarAreaCr.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAreaCr"));
		
		
		
		this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAreaCr"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonidAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"idAreaCrBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAreaCr.jButtonid_empresaAreaCrUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAreaCrUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonid_empresaAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAreaCrBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAreaCr.jButtonid_sucursalAreaCrUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAreaCrUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonid_sucursalAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAreaCrBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtoncodigoAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"codigoAreaCrBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonnombreAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"nombreAreaCrBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAreaCr.jTabbedPaneRelacionesAreaCr.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAreaCr"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAreaCr"));
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAreaCr"));
		}
		
		this.jTableDatosAreaCr.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAreaCr"));
		
		this.jTableDatosAreaCr.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAreaCr"));
		
		this.jButtonNuevoAreaCr.addActionListener(new ButtonActionListener(this,"NuevoAreaCr"));
		
		this.jButtonDuplicarAreaCr.addActionListener(new ButtonActionListener(this,"DuplicarAreaCr"));
		
		this.jButtonCopiarAreaCr.addActionListener(new ButtonActionListener(this,"CopiarAreaCr"));
		
		this.jButtonVerFormAreaCr.addActionListener(new ButtonActionListener(this,"VerFormAreaCr"));
		
		
		this.jButtonNuevoToolBarAreaCr.addActionListener(new ButtonActionListener(this,"NuevoToolBarAreaCr"));
			
		this.jButtonDuplicarToolBarAreaCr.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAreaCr"));
			
		this.jMenuItemNuevoAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAreaCr"));
			
		this.jMenuItemDuplicarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAreaCr"));		
		
		
		this.jButtonNuevoRelacionesAreaCr.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAreaCr"));
		
		
		this.jButtonNuevoRelacionesToolBarAreaCr.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAreaCr"));
			
		this.jMenuItemNuevoRelacionesAreaCr.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAreaCr"));		
		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jButtonModificarAreaCr.addActionListener(new ButtonActionListener(this,"ModificarAreaCr"));
		}
		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jButtonModificarToolBarAreaCr.addActionListener(new ButtonActionListener(this,"ModificarToolBarAreaCr"));
			
			this.jInternalFrameDetalleFormAreaCr.jMenuItemModificarAreaCr.addActionListener(new ButtonActionListener(this,"MenuItemModificarAreaCr"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAreaCr.jButtonActualizarAreaCr.addActionListener (new ButtonActionListener(this,"ActualizarAreaCr"));
		}
		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jButtonActualizarToolBarAreaCr.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAreaCr"));
				
			this.jInternalFrameDetalleFormAreaCr.jMenuItemActualizarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAreaCr"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jButtonEliminarAreaCr.addActionListener (new ButtonActionListener(this,"EliminarAreaCr"));
		}
		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jButtonEliminarToolBarAreaCr.addActionListener (new ButtonActionListener(this,"EliminarToolBarAreaCr"));
						
			this.jInternalFrameDetalleFormAreaCr.jMenuItemEliminarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAreaCr"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jButtonCancelarAreaCr.addActionListener (new ButtonActionListener(this,"CancelarAreaCr"));
		}
		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jButtonCancelarToolBarAreaCr.addActionListener (new ButtonActionListener(this,"CancelarToolBarAreaCr"));
			
			this.jInternalFrameDetalleFormAreaCr.jMenuItemCancelarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAreaCr"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAreaCr.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAreaCr"));		
		
		
		this.jButtonCerrarAreaCr.addActionListener (new ButtonActionListener(this,"CerrarAreaCr"));
		
		
		this.jButtonCerrarToolBarAreaCr.addActionListener (new ButtonActionListener(this,"CerrarToolBarAreaCr"));
			
		this.jMenuItemCerrarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAreaCr"));
			
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jMenuItemDetalleCerrarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAreaCr"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosAreaCr.addActionListener (new ButtonActionListener(this,"GuardarCambiosAreaCr"));
		}
		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosToolBarAreaCr.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAreaCr"));
		}
		
		this.jButtonCopiarToolBarAreaCr.addActionListener (new ButtonActionListener(this,"CopiarToolBarAreaCr"));
			
		this.jButtonVerFormToolBarAreaCr.addActionListener (new ButtonActionListener(this,"VerFormToolBarAreaCr"));
		
		this.jMenuItemGuardarCambiosAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAreaCr"));
			
		this.jMenuItemCopiarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAreaCr"));		
		
		this.jMenuItemVerFormAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAreaCr"));		
		
		
		this.jButtonGuardarCambiosTablaAreaCr.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAreaCr"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAreaCr.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAreaCr"));
			
		this.jMenuItemGuardarCambiosTablaAreaCr.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAreaCr"));		
		
		
		
		this.jButtonRecargarInformacionAreaCr.addActionListener (new ButtonActionListener(this,"RecargarInformacionAreaCr"));
					
		this.jButtonRecargarInformacionToolBarAreaCr.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAreaCr"));
		
		this.jMenuItemRecargarInformacionAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAreaCr"));		
		
		
		
		this.jButtonAnterioresAreaCr.addActionListener (new ButtonActionListener(this,"AnterioresAreaCr"));
		
		
		this.jButtonAnterioresToolBarAreaCr.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAreaCr"));
		
		this.jMenuItemAnterioresAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAreaCr"));		
		
		
		this.jButtonSiguientesAreaCr.addActionListener (new ButtonActionListener(this,"SiguientesAreaCr"));
		
		
		this.jButtonSiguientesToolBarAreaCr.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAreaCr"));
			
		this.jMenuItemSiguientesAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAreaCr"));
			
		this.jMenuItemAbrirOrderByAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAreaCr"));
			
		this.jMenuItemMostrarOcultarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAreaCr"));
			
		this.jMenuItemDetalleAbrirOrderByAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAreaCr"));
			
		this.jMenuItemDetalleMostarOcultarAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAreaCr"));		
		
		
		this.jButtonNuevoGuardarCambiosAreaCr.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAreaCr"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAreaCr.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAreaCr"));
			
		this.jMenuItemNuevoGuardarCambiosAreaCr.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAreaCr"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAreaCr.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAreaCr"));

		this.jCheckBoxSeleccionadosAreaCr.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAreaCr"));
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAreaCr"));
		}
		
		
		this.jComboBoxTiposRelacionesAreaCr.addActionListener (new ButtonActionListener(this,"TiposRelacionesAreaCr"));
			
		this.jComboBoxTiposAccionesAreaCr.addActionListener (new ButtonActionListener(this,"TiposAccionesAreaCr"));
					
		this.jComboBoxTiposSeleccionarAreaCr.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAreaCr"));
			
		this.jTextFieldValorCampoGeneralAreaCr.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAreaCr"));		
		
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonidAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"idAreaCrBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAreaCr.jButtonid_empresaAreaCrUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAreaCrUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonid_empresaAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAreaCrBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAreaCr.jButtonid_sucursalAreaCrUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAreaCrUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonid_sucursalAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAreaCrBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtoncodigoAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"codigoAreaCrBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonnombreAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"nombreAreaCrBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoAreaCr.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoAreaCr"));

			this.jButtonBusquedaPorNombreAreaCr.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreAreaCr"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAreaCr!=null) {
				this.jInternalFrameReporteDinamicoAreaCr.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAreaCr"));
				this.jInternalFrameReporteDinamicoAreaCr.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAreaCr"));
				this.jInternalFrameReporteDinamicoAreaCr.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAreaCr"));
			}
			
			//this.jButtonCerrarReporteDinamicoAreaCr.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAreaCr"));				
			//this.jButtonGenerarReporteDinamicoAreaCr.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAreaCr"));
			//this.jButtonGenerarExcelReporteDinamicoAreaCr.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAreaCr"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAreaCr!=null) {
				this.jInternalFrameImportacionAreaCr.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAreaCr"));
				this.jInternalFrameImportacionAreaCr.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAreaCr"));
				this.jInternalFrameImportacionAreaCr.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAreaCr"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAreaCr.addActionListener (new ButtonActionListener(this,"AbrirOrderByAreaCr"));
			
			this.jButtonAbrirOrderByToolBarAreaCr.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAreaCr"));			
			
			if(this.jInternalFrameOrderByAreaCr!=null) {
				this.jInternalFrameOrderByAreaCr.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAreaCr"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAreaCr!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAreaCr.jTabbedPaneRelacionesAreaCr.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAreaCr"));
		
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
            		closingInternalFrameAreaCr();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAreaCr.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAreaCr = (JInternalFrameBase)event.getSource();
	            	
	            AreaCrBeanSwingJInternalFrame jInternalFrameParent=(AreaCrBeanSwingJInternalFrame)jInternalFrameDetalleFormAreaCr.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAreaCrActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAreaCr.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAreaCrListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAreaCr.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAreaCr.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaCrActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaCrActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaCrActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAreaCr";
		inputMap = this.jButtonNuevoAreaCr.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAreaCr.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAreaCrActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaCrActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaCrActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAreaCrActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAreaCr";
		inputMap = this.jButtonNuevoRelacionesAreaCr.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAreaCr.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAreaCrActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAreaCr";
		inputMap = this.jButtonModificarAreaCr.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAreaCr.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAreaCrActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAreaCr";
		inputMap = this.jButtonActualizarAreaCr.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAreaCr.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAreaCrActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAreaCr";
		inputMap = this.jButtonEliminarAreaCr.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAreaCr.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAreaCrActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAreaCr";
		inputMap = this.jButtonCancelarAreaCr.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAreaCr.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAreaCrActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAreaCr";
		inputMap = this.jButtonCerrarAreaCr.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAreaCr.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAreaCrActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAreaCr";
		inputMap = this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosAreaCr.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAreaCr.jButtonGuardarCambiosAreaCr.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAreaCrActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAreaCr.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAreaCrItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAreaCr.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAreaCrActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAreaCr.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAreaCrActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAreaCr.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAreaCrActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonidAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"idAreaCrBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAreaCr.jButtonid_empresaAreaCrUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAreaCrUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonid_empresaAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAreaCrBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAreaCr.jButtonid_sucursalAreaCrUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAreaCrUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonid_sucursalAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAreaCrBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtoncodigoAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"codigoAreaCrBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAreaCr.jButtonnombreAreaCrBusqueda.addActionListener(new ButtonActionListener(this,"nombreAreaCrBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoAreaCr.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoAreaCr"));

		this.jButtonBusquedaPorNombreAreaCr.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreAreaCr"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAreaCr.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAreaCrActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAreaCrActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAreaCr.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAreaCr(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AreaCr areacrAux:this.areacrLogic.getAreaCrs()) {
					areacrAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AreaCr areacrAux:areacrs) {
					areacrAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAreaCrItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAreaCr(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AreaCr areacrAux:this.areacrLogic.getAreaCrs()) {
						areacrAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AreaCr areacrAux:areacrs) {
						areacrAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AreaCr areacrAux:this.areacrLogic.getAreaCrs()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AreaCr areacrAux:areacrs) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAreaCr(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAreaCr.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAreaCr.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAreaCr,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAreaCrItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAreaCr(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAreaCr.getSelectedRows();
			
			AreaCr areacrLocal=new AreaCr();
			
			//this.seleccionarTodosAreaCr(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					areacrLocal =(AreaCr) this.areacrLogic.getAreaCrs().toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					areacrLocal =(AreaCr) this.areacrs.toArray()[this.jTableDatosAreaCr.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				areacrLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AreaCr areacrAux:this.areacrLogic.getAreaCrs()) {
						areacrAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AreaCr areacrAux:areacrs) {
						areacrAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAreaCr(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAreaCr.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAreaCr.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAreaCr,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAreaCrItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAreaCrParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAreaCrActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAreaCr(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAreaCr.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AreaCr areacrAux:this.areacrLogic.getAreaCrs()) {
				
						if(sTipoSeleccionar.equals(AreaCrConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							areacrAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AreaCrConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							areacrAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AreaCr areacrAux:areacrs) {
					
						if(sTipoSeleccionar.equals(AreaCrConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							areacrAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AreaCrConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							areacrAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAreaCr(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAreaCrActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAreaCr(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAreaCr=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAreaCr.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAreaCr) {				
					conSplash=true;//false;										
					
					//this.startProcessAreaCr(conSplash);
				
					this.generarReporteAreaCrsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAreaCr.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAreaCrsSeleccionados();
				//this.jComboBoxTiposAccionesAreaCr.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAreaCrsSeleccionados(false);
				//this.jComboBoxTiposAccionesAreaCr.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAreaCrsSeleccionados(true);
				//this.jComboBoxTiposAccionesAreaCr.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAreaCr();
				
				this.exportarAreaCrsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAreaCr.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAreaCrs();
				//this.importarAreaCrs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAreaCr.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAreaCr();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAreaCrsSeleccionados();
				//this.jComboBoxTiposAccionesAreaCr.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Area", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAreaCr();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAreaCr)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAreaCr(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAreaCr.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.setSelectedIndex(0);					
				}	
			} 			
			else if(AreaCrBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAreaCr) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAreaCr(conSplash);
					
						//this.actualizarParametrosGeneralAreaCr();
						
						this.generarReporteProcesoAccionAreaCrsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAreaCr.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AreaCrBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO AreaS SELECCIONADOS?", "MANTENIMIENTO DE Area", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAreaCr();
				
						this.actualizarParametrosGeneralAreaCr();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.areacrReturnGeneral=areacrLogic.procesarAccionAreaCrsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.areacrLogic.getAreaCrs(),this.areacrParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAreaCrReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAreaCr.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAreaCr();
					
					AreaCrBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAreaCrReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAreaCr.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAreaCr.jComboBoxTiposAccionesFormularioAreaCr.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAreaCr(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAreaCrActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAreaCr();
			
			if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();		
			AreaCr areacr=new AreaCr();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAreaCr(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAreaCr.getSelectedItem();
			
			
			
			
			areacrsSeleccionados=this.getAreaCrsSeleccionados(true);
			//this.sTipoAccion;
			
			if(areacrsSeleccionados.size()==1) {
				for(AreaCr areacrAux:areacrsSeleccionados) {
					areacr=areacrAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,areacr);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAreaCr();
			
      		//this.finishProcessAreaCr(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAreaCrReturnGeneral() throws Exception {
		if(this.areacrReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.areacrReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.areacrReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.areacrReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.areacrReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.areacrReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAreaCr(false);
		}
		
		if(this.areacrReturnGeneral.getConRetornoLista() || this.areacrReturnGeneral.getConRetornoObjeto()) {
			if(this.areacrReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.areacrLogic.setAreaCrs(this.areacrReturnGeneral.getAreaCrs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.areacrReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.areacrLogic.setAreaCr(this.areacrReturnGeneral.getAreaCr());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAreaCr(false);
		}
	}
	
	public void actualizarParametrosGeneralAreaCr() throws Exception {
		
		
	}
	
	public ArrayList<AreaCr> getAreaCrsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAreaCr) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AreaCr areacrAux:areacrLogic.getAreaCrs()) {
					if(areacrAux.getIsSelected()) {
						areacrsSeleccionados.add(areacrAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AreaCr areacrAux:this.areacrs) {
					if(areacrAux.getIsSelected()) {
						areacrsSeleccionados.add(areacrAux);				
					}
				}
			}
			
			if(areacrsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						areacrsSeleccionados.addAll(this.areacrLogic.getAreaCrs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						areacrsSeleccionados.addAll(this.areacrs);				
					}
				}
			}
		} else {
			areacrsSeleccionados.add(this.areacr);
		}
		
		return areacrsSeleccionados;
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
	
	public void generarReporteAreaCrsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAreaCrsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAreaCrsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAreaCrsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAreaCrsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesAreaCrsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Area",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAreaCrsSeleccionados() throws Exception {
		ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();		
		
		areacrsSeleccionados=this.getAreaCrsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAreaCrs("Todos",areacrsSeleccionados);
		
	}	
	
	public void generarReporteNormalAreaCrsSeleccionados() throws Exception {
		ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();		
		
		areacrsSeleccionados=this.getAreaCrsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAreaCrs("Todos",areacrsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAreaCrsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();
		
		areacrsSeleccionados=this.getAreaCrsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAreaCrs("Todos",areacrsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAreaCrsSeleccionados() throws Exception {
		ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAreaCr();
		
		
		areacrsSeleccionados=this.getAreaCrsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAreaCr();
		
		
		//this.generarReporteAreaCrs("Todos",areacrsSeleccionados ,areacrImplementable,areacrImplementableHome);
	}
	
	public void mostrarImportacionAreaCrs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAreaCr();
		
		this.abrirFrameImportacionAreaCr();		
		
			
		//this.generarReporteAreaCrs("Todos",areacrsSeleccionados ,areacrImplementable,areacrImplementableHome);
	}
	
	public void importarAreaCrs() throws Exception {		
	
	}
	
	public void exportarAreaCrsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAreaCrsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAreaCrsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAreaCrsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Area",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAreaCrsSeleccionados() throws Exception {
		ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();		
		
		areacrsSeleccionados=this.getAreaCrsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"areacr."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAreaCr(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AreaCr areacrAux:areacrsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAreaCr(areacrAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//areacrAux.setsDetalleGeneralEntityReporte(areacrAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areacrSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAreaCr(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AreaCrConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaCrConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaCrConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaCrConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaCrConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AreaCrConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAreaCr(AreaCr areacr,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=areacr.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=areacr.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=areacr.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=areacr.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=areacr.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=areacr.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAreaCrsSeleccionados() throws Exception {
		ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();		
		
		areacrsSeleccionados=this.getAreaCrsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"areacr.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AreaCrs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAreaCr(row);				
				iRow++;
			}				
			
			for(AreaCr areacrAux:areacrsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAreaCr(areacrAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areacrSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAreaCrsSeleccionados() throws Exception {
		ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();		
		
		areacrsSeleccionados=this.getAreaCrsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"areacr.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("areacrs");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("areacr");
			//elementRoot.appendChild(element);
		
			for(AreaCr areacrAux:areacrsSeleccionados) {
				element = document.createElement("areacr");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAreaCr(areacrAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.areacrSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Area",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAreaCr(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AreaCrConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AreaCrConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AreaCrConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AreaCrConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AreaCrConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(AreaCrConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAreaCr(AreaCr areacr,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(areacr.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(areacr.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(areacr.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(areacr.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(areacr.getnombre());				
	}
	
	public void setFilaDatosExportarXmlAreaCr(AreaCr areacr,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AreaCrConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(areacr.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AreaCrConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(areacr.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AreaCrConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(areacr.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(AreaCrConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(areacr.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcodigo = document.createElement(AreaCrConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(areacr.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(AreaCrConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(areacr.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoAreaCrsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AreaCr> areacrsSeleccionados=new ArrayList<AreaCr>();
		
		areacrsSeleccionados=this.getAreaCrsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAreaCr(areacrsSeleccionados);
		
		this.generarReporteAreaCrs("Todos",areacrsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAreaCr(ArrayList<AreaCr> areacrsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AreaCr areacrAux:areacrsSeleccionados) {
				areacrAux.setsDetalleGeneralEntityReporte(areacrAux.toString());
			
				if(sTipoSeleccionar.equals(AreaCrConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					areacrAux.setsDescripcionGeneralEntityReporte1(areacrAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AreaCrConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					areacrAux.setsDescripcionGeneralEntityReporte1(areacrAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AreaCrConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					areacrAux.setsDescripcionGeneralEntityReporte1(areacrAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(AreaCrConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					areacrAux.setsDescripcionGeneralEntityReporte1(areacrAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AreaCrConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAreaCr(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAreaCr=true;
				this.isVisibilidadCeldaNuevoRelacionesAreaCr=true;
				this.isVisibilidadCeldaGuardarCambiosAreaCr=true;
			}
			
			this.isVisibilidadCeldaModificarAreaCr=false;
			this.isVisibilidadCeldaActualizarAreaCr=false;
			this.isVisibilidadCeldaEliminarAreaCr=false;
			this.isVisibilidadCeldaCancelarAreaCr=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAreaCr=true;
				} else {
					this.isVisibilidadCeldaGuardarAreaCr=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAreaCr=false;
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=false;
			this.isVisibilidadCeldaGuardarCambiosAreaCr=false;
			this.isVisibilidadCeldaModificarAreaCr=false;
			this.isVisibilidadCeldaActualizarAreaCr=true;
			this.isVisibilidadCeldaEliminarAreaCr=false;
			this.isVisibilidadCeldaCancelarAreaCr=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAreaCr=true;
				} else {
					this.isVisibilidadCeldaGuardarAreaCr=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAreaCr=false;
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=false;
			this.isVisibilidadCeldaGuardarCambiosAreaCr=false;
			this.isVisibilidadCeldaModificarAreaCr=false;
			this.isVisibilidadCeldaActualizarAreaCr=true;
			this.isVisibilidadCeldaEliminarAreaCr=true;
			this.isVisibilidadCeldaCancelarAreaCr=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAreaCr=true;
				} else {
					this.isVisibilidadCeldaGuardarAreaCr=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAreaCr=false;
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=false;
			this.isVisibilidadCeldaGuardarCambiosAreaCr=false;
			this.isVisibilidadCeldaModificarAreaCr=false;
			this.isVisibilidadCeldaActualizarAreaCr=true;
			this.isVisibilidadCeldaEliminarAreaCr=false;
			this.isVisibilidadCeldaCancelarAreaCr=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAreaCr=false;
				} else {
					this.isVisibilidadCeldaGuardarAreaCr=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAreaCr=true;
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=true;
			this.isVisibilidadCeldaGuardarCambiosAreaCr=true;
			this.isVisibilidadCeldaModificarAreaCr=false;
			this.isVisibilidadCeldaActualizarAreaCr=false;
			this.isVisibilidadCeldaEliminarAreaCr=false;
			this.isVisibilidadCeldaCancelarAreaCr=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAreaCr=true;
				} else {
					this.isVisibilidadCeldaGuardarAreaCr=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAreaCr=false;
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=false;
			this.isVisibilidadCeldaGuardarCambiosAreaCr=false;
			this.isVisibilidadCeldaActualizarAreaCr=false;
			this.isVisibilidadCeldaEliminarAreaCr=false;
			this.isVisibilidadCeldaCancelarAreaCr=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAreaCr=false;
				} else {
					this.isVisibilidadCeldaGuardarAreaCr=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAreaCr=false;
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=false;
			this.isVisibilidadCeldaGuardarCambiosAreaCr=false;
			this.isVisibilidadCeldaModificarAreaCr=true;
			this.isVisibilidadCeldaActualizarAreaCr=false;
			this.isVisibilidadCeldaEliminarAreaCr=false;
			this.isVisibilidadCeldaCancelarAreaCr=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAreaCr=false;
				} else {
					this.isVisibilidadCeldaGuardarAreaCr=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AreaCrJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAreaCr=true;
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=true;
			this.isVisibilidadCeldaGuardarCambiosAreaCr=true;
		} else {
			this.actualizarEstadoPanelsAreaCr(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAreaCr=false;
			//this.isVisibilidadCeldaVerFormAreaCr=false;
			this.isVisibilidadCeldaDuplicarAreaCr=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!areacrSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=false;
		} else {
			this.isVisibilidadCeldaNuevoAreaCr=false;
			this.isVisibilidadCeldaGuardarCambiosAreaCr=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(areacrSessionBean.getEsGuardarRelacionado()) {
			if(!areacrSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAreaCr=false;												
			}
			
			this.jButtonCerrarAreaCr.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAreaCr=false;
		}
		
		if(!this.permiteMantenimiento(this.areacr)) {
			this.isVisibilidadCeldaActualizarAreaCr=false;
			this.isVisibilidadCeldaEliminarAreaCr=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAreaCr() {
		this.isVisibilidadCeldaNuevoAreaCr=false;
		this.isVisibilidadCeldaGuardarCambiosAreaCr=false;
	}
	
	public void actualizarEstadoPanelsAreaCr(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAreaCr!=null) {
				this.jScrollPanelDatosEdicionAreaCr.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAreaCr!=null) {
				this.jTabbedPaneBusquedasAreaCr.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAreaCr!=null) {
				this.jScrollPanelDatosAreaCr.setVisible(true);
			}
			
			if(this.jPanelPaginacionAreaCr!=null) {
				this.jPanelPaginacionAreaCr.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAreaCr!=null) {
				this.jPanelParametrosReportesAreaCr.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAreaCr!=null) {
				this.jScrollPanelDatosEdicionAreaCr.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAreaCr!=null) {
				this.jTabbedPaneBusquedasAreaCr.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAreaCr!=null) {
				this.jScrollPanelDatosAreaCr.setVisible(false);
			}
			
			if(this.jPanelPaginacionAreaCr!=null) {
				this.jPanelPaginacionAreaCr.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAreaCr!=null) {
				this.jPanelParametrosReportesAreaCr.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAreaCr!=null) {
				this.jScrollPanelDatosEdicionAreaCr.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAreaCr!=null) {
				this.jTabbedPaneBusquedasAreaCr.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAreaCr!=null) {
				this.jScrollPanelDatosAreaCr.setVisible(false);
			}
			
			if(this.jPanelPaginacionAreaCr!=null) {
				this.jPanelPaginacionAreaCr.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAreaCr!=null) {
				this.jPanelParametrosReportesAreaCr.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAreaCr!=null) {
				this.jScrollPanelDatosEdicionAreaCr.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAreaCr!=null) {
				this.jTabbedPaneBusquedasAreaCr.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAreaCr!=null) {
				this.jScrollPanelDatosAreaCr.setVisible(false);
			}
			
			if(this.jPanelPaginacionAreaCr!=null) {
				this.jPanelPaginacionAreaCr.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAreaCr!=null) {
				this.jPanelParametrosReportesAreaCr.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAreaCr!=null) {
				this.jScrollPanelDatosEdicionAreaCr.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAreaCr!=null) {
				this.jTabbedPaneBusquedasAreaCr.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAreaCr!=null) {
				this.jScrollPanelDatosAreaCr.setVisible(true);
			}
			
			if(this.jPanelPaginacionAreaCr!=null) {
				this.jPanelPaginacionAreaCr.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAreaCr!=null) {
				this.jPanelParametrosReportesAreaCr.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAreaCr!=null) {
				this.jScrollPanelDatosEdicionAreaCr.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAreaCr!=null) {
				this.jTabbedPaneBusquedasAreaCr.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAreaCr!=null) {
				this.jScrollPanelDatosAreaCr.setVisible(true);
			}
			
			if(this.jPanelPaginacionAreaCr!=null) {
				this.jPanelPaginacionAreaCr.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAreaCr!=null) {
				this.jPanelParametrosReportesAreaCr.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAreaCr!=null) {
				this.jScrollPanelDatosEdicionAreaCr.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAreaCr!=null) {
				this.jTabbedPaneBusquedasAreaCr.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAreaCr!=null) {
				this.jScrollPanelDatosAreaCr.setVisible(true);
			}
			
			if(this.jPanelPaginacionAreaCr!=null) {
				this.jPanelPaginacionAreaCr.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAreaCr!=null) {
				this.jPanelParametrosReportesAreaCr.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.areacrSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAreaCr!=null) {
					this.jTabbedPaneBusquedasAreaCr.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAreaCr!=null) {
				this.jPanelParametrosReportesAreaCr.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.areacrSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAreaCr!=null) {
				this.jTabbedPaneBusquedasAreaCr.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAreaCr!=null) {
				this.jPanelParametrosReportesAreaCr.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasAreaCr.remove(jPanelBusquedaPorCodigoAreaCr);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasAreaCr.remove(jPanelBusquedaPorNombreAreaCr);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorCodigo=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasAreaCr.remove(jPanelBusquedaPorCodigoAreaCr);}

			this.isVisibilidadBusquedaPorNombre=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasAreaCr.remove(jPanelBusquedaPorNombreAreaCr);}
		}
		
	}
	
	

	public String registrarSesionAreaCrParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.areacrSessionBean==null) {
				this.areacrSessionBean=new AreaCrSessionBean();
			}

			if(this.jInternalFrameDetalleFormAreaCr.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormAreaCr.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormAreaCr.clienteSessionBean.setsPathNavegacionActual(areacrSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormAreaCr.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormAreaCr.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormAreaCr.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormAreaCr.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(AreaCrConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormAreaCr.clienteSessionBean.setisBusquedaDesdeForeignKeySesionAreaCr(true);
			this.jInternalFrameDetalleFormAreaCr.clienteSessionBean.setlidAreaCrActual(this.idAreaCrActual);

			areacrSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyAreaCr(true);
			areacrSessionBean.setlIdAreaCrActualForeignKey(this.idAreaCrActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AreaCrSessionBean areacrSessionBean=new AreaCrSessionBean();
		
		if(this.areacrSessionBean==null) {
			this.areacrSessionBean=new AreaCrSessionBean();
		}
		
		this.areacrSessionBean.setsUltimaBusquedaAreaCr(this.getsAccionBusqueda());
		this.areacrSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.areacrSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			areacrSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			areacrSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			areacrSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			areacrSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AreaCrSessionBean areacrSessionBean=new AreaCrSessionBean();
		
		if(this.areacrSessionBean==null) {
			this.areacrSessionBean=new AreaCrSessionBean();
		}
		
		if(this.areacrSessionBean.getsUltimaBusquedaAreaCr()!=null&&!this.areacrSessionBean.getsUltimaBusquedaAreaCr().equals("")) {
			this.setsAccionBusqueda(areacrSessionBean.getsUltimaBusquedaAreaCr());
			this.setiNumeroPaginacion(areacrSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(areacrSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(areacrSessionBean.getcodigo());
				areacrSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(areacrSessionBean.getnombre());
				areacrSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(areacrSessionBean.getid_empresa());
				areacrSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(areacrSessionBean.getid_sucursal());
				areacrSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.areacrSessionBean.setsUltimaBusquedaAreaCr("");
		this.areacrSessionBean.setiNumeroPaginacion(AreaCrConstantesFunciones.INUMEROPAGINACION);
		this.areacrSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAreaCr(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAreaCr() {
		this.updateBorderResaltarBusquedasFormularioAreaCr();
		this.updateVisibilidadBusquedasFormularioAreaCr();
		this.updateHabilitarBusquedasFormularioAreaCr();
	}
	
	public void updateBorderResaltarBusquedasFormularioAreaCr() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAreaCr.getComponents().length>0) {
	

		if(this.areacrConstantesFunciones.resaltarBusquedaPorCodigoAreaCr!=null) {
			index= this.jTabbedPaneBusquedasAreaCr.indexOfComponent(this.jPanelBusquedaPorCodigoAreaCr);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAreaCr.getComponent(index);
				jPanel.setBorder(this.areacrConstantesFunciones.resaltarBusquedaPorCodigoAreaCr);
			}
		}

		if(this.areacrConstantesFunciones.resaltarBusquedaPorNombreAreaCr!=null) {
			index= this.jTabbedPaneBusquedasAreaCr.indexOfComponent(this.jPanelBusquedaPorNombreAreaCr);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAreaCr.getComponent(index);
				jPanel.setBorder(this.areacrConstantesFunciones.resaltarBusquedaPorNombreAreaCr);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAreaCr() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAreaCr.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAreaCr.indexOfComponent(this.jPanelBusquedaPorCodigoAreaCr);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAreaCr.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.areacrConstantesFunciones.mostrarBusquedaPorCodigoAreaCr);
			if(!this.areacrConstantesFunciones.mostrarBusquedaPorCodigoAreaCr && index>-1) {
				this.jTabbedPaneBusquedasAreaCr.remove(index);
			}

			index= this.jTabbedPaneBusquedasAreaCr.indexOfComponent(this.jPanelBusquedaPorNombreAreaCr);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAreaCr.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.areacrConstantesFunciones.mostrarBusquedaPorNombreAreaCr);
			if(!this.areacrConstantesFunciones.mostrarBusquedaPorNombreAreaCr && index>-1) {
				this.jTabbedPaneBusquedasAreaCr.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAreaCr() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAreaCr.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAreaCr.indexOfComponent(this.jPanelBusquedaPorCodigoAreaCr);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAreaCr.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.areacrConstantesFunciones.activarBusquedaPorCodigoAreaCr);
				this.jTabbedPaneBusquedasAreaCr.setEnabledAt(index,this.areacrConstantesFunciones.activarBusquedaPorCodigoAreaCr);
			}

			index= this.jTabbedPaneBusquedasAreaCr.indexOfComponent(this.jPanelBusquedaPorNombreAreaCr);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAreaCr.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.areacrConstantesFunciones.activarBusquedaPorNombreAreaCr);
				this.jTabbedPaneBusquedasAreaCr.setEnabledAt(index,this.areacrConstantesFunciones.activarBusquedaPorNombreAreaCr);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAreaCr(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasAreaCr.indexOfComponent(this.jPanelBusquedaPorCodigoAreaCr);

			this.jTabbedPaneBusquedasAreaCr.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAreaCr.getComponent(index);

			this.areacrConstantesFunciones.setResaltarBusquedaPorCodigoAreaCr(resaltar);

			jPanel.setBorder(this.areacrConstantesFunciones.resaltarBusquedaPorCodigoAreaCr);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasAreaCr.indexOfComponent(this.jPanelBusquedaPorNombreAreaCr);

			this.jTabbedPaneBusquedasAreaCr.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAreaCr.getComponent(index);

			this.areacrConstantesFunciones.setResaltarBusquedaPorNombreAreaCr(resaltar);

			jPanel.setBorder(this.areacrConstantesFunciones.resaltarBusquedaPorNombreAreaCr);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAreaCr.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAreaCr() throws Exception {

		if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAreaCr();
		this.updateVisibilidadResaltarControlesFormularioAreaCr();
		this.updateHabilitarResaltarControlesFormularioAreaCr();
		
	}
	
	public void updateBorderResaltarControlesFormularioAreaCr() throws Exception {
		if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.areacrConstantesFunciones.resaltaridAreaCr!=null && this.jInternalFrameDetalleFormAreaCr!=null) {this.jInternalFrameDetalleFormAreaCr.jLabelidAreaCr.setBorder(this.areacrConstantesFunciones.resaltaridAreaCr);}
		if(this.areacrConstantesFunciones.resaltarid_empresaAreaCr!=null && this.jInternalFrameDetalleFormAreaCr!=null) {this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.setBorder(this.areacrConstantesFunciones.resaltarid_empresaAreaCr);}
		if(this.areacrConstantesFunciones.resaltarid_sucursalAreaCr!=null && this.jInternalFrameDetalleFormAreaCr!=null) {this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.setBorder(this.areacrConstantesFunciones.resaltarid_sucursalAreaCr);}
		if(this.areacrConstantesFunciones.resaltarcodigoAreaCr!=null && this.jInternalFrameDetalleFormAreaCr!=null) {this.jInternalFrameDetalleFormAreaCr.jTextFieldcodigoAreaCr.setBorder(this.areacrConstantesFunciones.resaltarcodigoAreaCr);}
		if(this.areacrConstantesFunciones.resaltarnombreAreaCr!=null && this.jInternalFrameDetalleFormAreaCr!=null) {this.jInternalFrameDetalleFormAreaCr.jTextAreanombreAreaCr.setBorder(this.areacrConstantesFunciones.resaltarnombreAreaCr);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAreaCr() throws Exception {		
		if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) {
	
		//this.jInternalFrameDetalleFormAreaCr.jLabelidAreaCr.setVisible(this.areacrConstantesFunciones.mostraridAreaCr);
		this.jInternalFrameDetalleFormAreaCr.jPanelidAreaCr.setVisible(this.areacrConstantesFunciones.mostraridAreaCr);
		//this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.setVisible(this.areacrConstantesFunciones.mostrarid_empresaAreaCr);
		this.jInternalFrameDetalleFormAreaCr.jPanelid_empresaAreaCr.setVisible(this.areacrConstantesFunciones.mostrarid_empresaAreaCr);
		//this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.setVisible(this.areacrConstantesFunciones.mostrarid_sucursalAreaCr);
		this.jInternalFrameDetalleFormAreaCr.jPanelid_sucursalAreaCr.setVisible(this.areacrConstantesFunciones.mostrarid_sucursalAreaCr);
		//this.jInternalFrameDetalleFormAreaCr.jTextFieldcodigoAreaCr.setVisible(this.areacrConstantesFunciones.mostrarcodigoAreaCr);
		this.jInternalFrameDetalleFormAreaCr.jPanelcodigoAreaCr.setVisible(this.areacrConstantesFunciones.mostrarcodigoAreaCr);
		//this.jInternalFrameDetalleFormAreaCr.jTextAreanombreAreaCr.setVisible(this.areacrConstantesFunciones.mostrarnombreAreaCr);
		this.jInternalFrameDetalleFormAreaCr.jPanelnombreAreaCr.setVisible(this.areacrConstantesFunciones.mostrarnombreAreaCr);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAreaCr() throws Exception {
		if(this.jInternalFrameDetalleFormAreaCr==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAreaCr!=null) {
	
		this.jInternalFrameDetalleFormAreaCr.jLabelidAreaCr.setEnabled(this.areacrConstantesFunciones.activaridAreaCr);
		this.jInternalFrameDetalleFormAreaCr.jComboBoxid_empresaAreaCr.setEnabled(this.areacrConstantesFunciones.activarid_empresaAreaCr);
		this.jInternalFrameDetalleFormAreaCr.jComboBoxid_sucursalAreaCr.setEnabled(this.areacrConstantesFunciones.activarid_sucursalAreaCr);
		this.jInternalFrameDetalleFormAreaCr.jTextFieldcodigoAreaCr.setEnabled(this.areacrConstantesFunciones.activarcodigoAreaCr);
		this.jInternalFrameDetalleFormAreaCr.jTextAreanombreAreaCr.setEnabled(this.areacrConstantesFunciones.activarnombreAreaCr);
		}
	}
	
		
}