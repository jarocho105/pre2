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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.MantenimientoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.MantenimientoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.MantenimientoActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.MantenimientoActivoFijoBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class MantenimientoActivoFijoBeanSwingJInternalFrame extends MantenimientoActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MantenimientoActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<MantenimientoActivoFijo> mantenimientoactivofijoValidator = new ClassValidator<MantenimientoActivoFijo>(MantenimientoActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public MantenimientoActivoFijo mantenimientoactivofijo;	
	public MantenimientoActivoFijo mantenimientoactivofijoAux;
	public MantenimientoActivoFijo mantenimientoactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public MantenimientoActivoFijo mantenimientoactivofijoTotales;
	public Long idMantenimientoActivoFijoActual;
	public Long iIdNuevoMantenimientoActivoFijo=0L;
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

	public String sFinalQueryComboDetalleActivoFijo="";

	public List<DetalleActivoFijo> detalleactivofijosForeignKey;

	public List<DetalleActivoFijo> getdetalleactivofijosForeignKey() {
		return detalleactivofijosForeignKey;
	}

	public void setdetalleactivofijosForeignKey(List<DetalleActivoFijo> detalleactivofijosForeignKey) {
		this.detalleactivofijosForeignKey = detalleactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleActivoFijo detalleactivofijoForeignKey;

	public DetalleActivoFijo getdetalleactivofijoForeignKey() {
		return detalleactivofijoForeignKey;
	}

	public void setdetalleactivofijoForeignKey(DetalleActivoFijo detalleactivofijoForeignKey) {
		this.detalleactivofijoForeignKey = detalleactivofijoForeignKey;
	}

	public String sFinalQueryComboTipoMovimiento="";

	public List<TipoMovimiento> tipomovimientosForeignKey;

	public List<TipoMovimiento> gettipomovimientosForeignKey() {
		return tipomovimientosForeignKey;
	}

	public void settipomovimientosForeignKey(List<TipoMovimiento> tipomovimientosForeignKey) {
		this.tipomovimientosForeignKey = tipomovimientosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMovimiento tipomovimientoForeignKey;

	public TipoMovimiento gettipomovimientoForeignKey() {
		return tipomovimientoForeignKey;
	}

	public void settipomovimientoForeignKey(TipoMovimiento tipomovimientoForeignKey) {
		this.tipomovimientoForeignKey = tipomovimientoForeignKey;
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
	
	public Boolean isPermisoTodoMantenimientoActivoFijo;
	public Boolean isPermisoNuevoMantenimientoActivoFijo;
	public Boolean isPermisoActualizarMantenimientoActivoFijo;
	public Boolean isPermisoActualizarOriginalMantenimientoActivoFijo;
	public Boolean isPermisoEliminarMantenimientoActivoFijo;
	public Boolean isPermisoGuardarCambiosMantenimientoActivoFijo;
	public Boolean isPermisoConsultaMantenimientoActivoFijo;
	public Boolean isPermisoBusquedaMantenimientoActivoFijo;
	public Boolean isPermisoReporteMantenimientoActivoFijo;
	public Boolean isPermisoPaginacionMedioMantenimientoActivoFijo;
	public Boolean isPermisoPaginacionAltoMantenimientoActivoFijo;
	public Boolean isPermisoPaginacionTodoMantenimientoActivoFijo;
	public Boolean isPermisoCopiarMantenimientoActivoFijo;
	public Boolean isPermisoVerFormMantenimientoActivoFijo;
	public Boolean isPermisoDuplicarMantenimientoActivoFijo;
	public Boolean isPermisoOrdenMantenimientoActivoFijo;
	
	
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
	
	public MantenimientoActivoFijoParameterReturnGeneral mantenimientoactivofijoReturnGeneral;
	public MantenimientoActivoFijoParameterReturnGeneral mantenimientoactivofijoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMantenimientoActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioMantenimientoActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MantenimientoActivoFijoSessionBeanAdditional mantenimientoactivofijoSessionBeanAdditional=null;
	
	public MantenimientoActivoFijoSessionBeanAdditional getMantenimientoActivoFijoSessionBeanAdditional() {
		return this.mantenimientoactivofijoSessionBeanAdditional;
	}
	
	public void setMantenimientoActivoFijoSessionBeanAdditional(MantenimientoActivoFijoSessionBeanAdditional mantenimientoactivofijoSessionBeanAdditional) {
		try {
			this.mantenimientoactivofijoSessionBeanAdditional=mantenimientoactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MantenimientoActivoFijoBeanSwingJInternalFrameAdditional mantenimientoactivofijoBeanSwingJInternalFrameAdditional=null;
	//public class MantenimientoActivoFijoBeanSwingJInternalFrame
	
	public MantenimientoActivoFijoBeanSwingJInternalFrameAdditional getMantenimientoActivoFijoBeanSwingJInternalFrameAdditional() {
		return this.mantenimientoactivofijoBeanSwingJInternalFrameAdditional;
	}
	
	public void setMantenimientoActivoFijoBeanSwingJInternalFrameAdditional(MantenimientoActivoFijoBeanSwingJInternalFrameAdditional mantenimientoactivofijoBeanSwingJInternalFrameAdditional) {
		try {
			this.mantenimientoactivofijoBeanSwingJInternalFrameAdditional=mantenimientoactivofijoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MantenimientoActivoFijoLogic mantenimientoactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public MantenimientoActivoFijo mantenimientoactivofijoBean;
	public MantenimientoActivoFijoConstantesFunciones mantenimientoactivofijoConstantesFunciones;
	//public MantenimientoActivoFijoParameterReturnGeneral mantenimientoactivofijoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public DetalleActivoFijoLogic detalleactivofijoLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	
	//PARAMETROS
	
	
	//public List<MantenimientoActivoFijo> mantenimientoactivofijos;	
	//public List<MantenimientoActivoFijo> mantenimientoactivofijosEliminados;
	//public List<MantenimientoActivoFijo> mantenimientoactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMantenimientoActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarMantenimientoActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarMantenimientoActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormMantenimientoActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenMantenimientoActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarMantenimientoActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarMantenimientoActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarMantenimientoActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarMantenimientoActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdDetalleActivoFijo=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoMantenimientoActivoFijo() {
		return this.iIdNuevoMantenimientoActivoFijo;
	}

	public void setiIdNuevoMantenimientoActivoFijo(Long iIdNuevoMantenimientoActivoFijo) {
		this.iIdNuevoMantenimientoActivoFijo = iIdNuevoMantenimientoActivoFijo;
	}
	
	public Long getidMantenimientoActivoFijoActual() {
		return this.idMantenimientoActivoFijoActual;
	}

	public void setidMantenimientoActivoFijoActual(Long idMantenimientoActivoFijoActual) {
		this.idMantenimientoActivoFijoActual = idMantenimientoActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public MantenimientoActivoFijo getmantenimientoactivofijo() {
		return this.mantenimientoactivofijo;
	}

	public void setmantenimientoactivofijo(MantenimientoActivoFijo mantenimientoactivofijo) {
		this.mantenimientoactivofijo = mantenimientoactivofijo;
	}
	
	public MantenimientoActivoFijo getmantenimientoactivofijoAux() {
		return this.mantenimientoactivofijoAux;
	}

	public void setmantenimientoactivofijoAux(MantenimientoActivoFijo mantenimientoactivofijoAux) {
		this.mantenimientoactivofijoAux = mantenimientoactivofijoAux;
	}				
	
	public MantenimientoActivoFijo getmantenimientoactivofijoAnterior() {
		return this.mantenimientoactivofijoAnterior;
	}

	public void setmantenimientoactivofijoAnterior(MantenimientoActivoFijo mantenimientoactivofijoAnterior) {
		this.mantenimientoactivofijoAnterior = mantenimientoactivofijoAnterior;
	}	
	
	public MantenimientoActivoFijo getmantenimientoactivofijoTotales() {
		return this.mantenimientoactivofijoTotales;
	}

	public void setmantenimientoactivofijoTotales(MantenimientoActivoFijo mantenimientoactivofijoTotales) {
		this.mantenimientoactivofijoTotales = mantenimientoactivofijoTotales;
	}	
	
	public MantenimientoActivoFijo getmantenimientoactivofijoBean() {
		return this.mantenimientoactivofijoBean;
	}

	public void setmantenimientoactivofijoBean(MantenimientoActivoFijo mantenimientoactivofijoBean) {
		this.mantenimientoactivofijoBean = mantenimientoactivofijoBean;
	}	
	
	public MantenimientoActivoFijoParameterReturnGeneral getmantenimientoactivofijoReturnGeneral() {
		return this.mantenimientoactivofijoReturnGeneral;
	}

	public void setmantenimientoactivofijoReturnGeneral(MantenimientoActivoFijoParameterReturnGeneral mantenimientoactivofijoReturnGeneral) {
		this.mantenimientoactivofijoReturnGeneral = mantenimientoactivofijoReturnGeneral;
	}	
	
	
	public Long id_detalle_activo_fijoFK_IdDetalleActivoFijo=-1L;

	public Long getid_detalle_activo_fijoFK_IdDetalleActivoFijo() {
		return this.id_detalle_activo_fijoFK_IdDetalleActivoFijo;
	}

	public void setid_detalle_activo_fijoFK_IdDetalleActivoFijo(Long id_detalle_activo_fijoFK_IdDetalleActivoFijo) {
		this.id_detalle_activo_fijoFK_IdDetalleActivoFijo = id_detalle_activo_fijoFK_IdDetalleActivoFijo;
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

	public Long id_tipo_movimientoFK_IdTipoMovimiento=-1L;

	public Long getid_tipo_movimientoFK_IdTipoMovimiento() {
		return this.id_tipo_movimientoFK_IdTipoMovimiento;
	}

	public void setid_tipo_movimientoFK_IdTipoMovimiento(Long id_tipo_movimientoFK_IdTipoMovimiento) {
		this.id_tipo_movimientoFK_IdTipoMovimiento = id_tipo_movimientoFK_IdTipoMovimiento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public MantenimientoActivoFijoLogic getMantenimientoActivoFijoLogic()	{		
		return mantenimientoactivofijoLogic;
	}

	public void setMantenimientoActivoFijoLogic(MantenimientoActivoFijoLogic mantenimientoactivofijoLogic) {
		this.mantenimientoactivofijoLogic = mantenimientoactivofijoLogic;
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
	
	public Boolean getIsEsNuevoMantenimientoActivoFijo() {
		return isEsNuevoMantenimientoActivoFijo;
	}

	public void setIsEsNuevoMantenimientoActivoFijo(Boolean isEsNuevoMantenimientoActivoFijo) {
		this.isEsNuevoMantenimientoActivoFijo = isEsNuevoMantenimientoActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioMantenimientoActivoFijo() {
		return esParaAccionDesdeFormularioMantenimientoActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioMantenimientoActivoFijo(Boolean esParaAccionDesdeFormularioMantenimientoActivoFijo) {
		this.esParaAccionDesdeFormularioMantenimientoActivoFijo = esParaAccionDesdeFormularioMantenimientoActivoFijo;
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

			if(this.mantenimientoactivofijoSessionBean==null) {
				this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
			}

			if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(mantenimientoactivofijoSessionBean.getlidEmpresaActual());
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

			if(this.mantenimientoactivofijoSessionBean==null) {
				this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
			}

			if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(mantenimientoactivofijoSessionBean.getlidSucursalActual());
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

	public void cargarCombosDetalleActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleActivoFijoLogic detalleactivofijoLogic=new DetalleActivoFijoLogic();

			//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.mantenimientoactivofijoSessionBean==null) {
				this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
			}

			if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

					detalleactivofijoLogic.getTodosDetalleActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.detalleactivofijosForeignKey=detalleactivofijoLogic.getDetalleActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleactivofijoLogic.getEntityWithConnection(mantenimientoactivofijoSessionBean.getlidDetalleActivoFijoActual());
					this.detalleactivofijosForeignKey.add(detalleactivofijoLogic.getDetalleActivoFijo());
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

	public void cargarCombosTipoMovimientosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMovimientoLogic tipomovimientoLogic=new TipoMovimientoLogic();

			//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

			if(this.mantenimientoactivofijoSessionBean==null) {
				this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
			}

			if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomovimientoLogic.getTipoMovimientoDataAccess().setIsForForeingKeyData(true);

					tipomovimientoLogic.getTodosTipoMovimientosWithConnection(sFinalQuery,new Pagination());

					this.tipomovimientosForeignKey=tipomovimientoLogic.getTipoMovimientos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMovimiento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientoLogic.getEntityWithConnection(mantenimientoactivofijoSessionBean.getlidTipoMovimientoActual());
					this.tipomovimientosForeignKey.add(tipomovimientoLogic.getTipoMovimiento());
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

					if(this.mantenimientoactivofijo!=null) {
						this.mantenimientoactivofijo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
						this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMantenimientoActivoFijo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMantenimientoActivoFijoGenerico)throws Exception
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
				jComboBoxid_empresaMantenimientoActivoFijoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMantenimientoActivoFijoGenerico!=null && jComboBoxid_empresaMantenimientoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_empresaMantenimientoActivoFijoGenerico.setSelectedIndex(0);
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

					if(this.mantenimientoactivofijo!=null) {
						this.mantenimientoactivofijo.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
						this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalMantenimientoActivoFijo.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalMantenimientoActivoFijoGenerico)throws Exception
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
				jComboBoxid_sucursalMantenimientoActivoFijoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalMantenimientoActivoFijoGenerico!=null && jComboBoxid_sucursalMantenimientoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalMantenimientoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleActivoFijoForeignKey(Long idDetalleActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detalleactivofijoTemp!=null) {

					if(this.mantenimientoactivofijo!=null) {
						this.mantenimientoactivofijo.setDetalleActivoFijo(detalleactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
						this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setSelectedItem(detalleactivofijoTemp);
					}
				} else {
					//jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setSelectedItem(detalleactivofijoTemp);
					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){
					if(detalleactivofijoTemp!=null && jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo!=null) {
						jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setSelectedItem(detalleactivofijoTemp);
					} else {
						if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo!=null) {
							//jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setSelectedItem(detalleactivofijoTemp);
							if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.getItemCount()>0) {
								jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setSelectedIndex(0);
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

	public String getActualDetalleActivoFijoForeignKeyDescripcion(Long idDetalleActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}


			sDescripcion=DetalleActivoFijoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleActivoFijoForeignKeyGenerico(Long idDetalleActivoFijoSeleccionado,JComboBox jComboBoxid_detalle_activo_fijoMantenimientoActivoFijoGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(detalleactivofijoTemp!=null) {
				jComboBoxid_detalle_activo_fijoMantenimientoActivoFijoGenerico.setSelectedItem(detalleactivofijoTemp);
			} else {
				if(jComboBoxid_detalle_activo_fijoMantenimientoActivoFijoGenerico!=null && jComboBoxid_detalle_activo_fijoMantenimientoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_detalle_activo_fijoMantenimientoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMovimientoForeignKey(Long idTipoMovimientoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomovimientoTemp!=null) {

					if(this.mantenimientoactivofijo!=null) {
						this.mantenimientoactivofijo.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
						this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoMovimiento") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo!=null) {
						jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo!=null) {
							//jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.getItemCount()>0) {
								jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setSelectedIndex(0);
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

	public String getActualTipoMovimientoForeignKeyDescripcion(Long idTipoMovimientoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}


			sDescripcion=TipoMovimientoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoMantenimientoActivoFijoGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoTemp=null;

			for(TipoMovimiento tipomovimientoAux:tipomovimientosForeignKey) {
				if(tipomovimientoAux.getId()!=null && tipomovimientoAux.getId().equals(idTipoMovimientoSeleccionado)) {
					tipomovimientoTemp=tipomovimientoAux;
					break;
				}
			}

			if(tipomovimientoTemp!=null) {
				jComboBoxid_tipo_movimientoMantenimientoActivoFijoGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoMantenimientoActivoFijoGenerico!=null && jComboBoxid_tipo_movimientoMantenimientoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoMantenimientoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(MantenimientoActivoFijo mantenimientoactivofijo,JComboBox jComboBoxid_empresaMantenimientoActivoFijoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMantenimientoActivoFijoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMantenimientoActivoFijoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				mantenimientoactivofijo.setid_empresa(empresaAux.getId());
				mantenimientoactivofijo.setempresa_descripcion(MantenimientoActivoFijoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				mantenimientoactivofijo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(MantenimientoActivoFijo mantenimientoactivofijo,JComboBox jComboBoxid_sucursalMantenimientoActivoFijoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalMantenimientoActivoFijoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalMantenimientoActivoFijoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				mantenimientoactivofijo.setid_sucursal(sucursalAux.getId());
				mantenimientoactivofijo.setsucursal_descripcion(MantenimientoActivoFijoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				mantenimientoactivofijo.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleActivoFijoForeignKey(MantenimientoActivoFijo mantenimientoactivofijo,JComboBox jComboBoxid_detalle_activo_fijoMantenimientoActivoFijoGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoAux=new DetalleActivoFijo();

			if(jComboBoxid_detalle_activo_fijoMantenimientoActivoFijoGenerico==null) {
				detalleactivofijoAux=(DetalleActivoFijo)this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.getSelectedItem();
			} else {
				detalleactivofijoAux=(DetalleActivoFijo)jComboBoxid_detalle_activo_fijoMantenimientoActivoFijoGenerico.getSelectedItem();
			}

			if(detalleactivofijoAux!=null && detalleactivofijoAux.getId()!=null) {
				mantenimientoactivofijo.setid_detalle_activo_fijo(detalleactivofijoAux.getId());
				mantenimientoactivofijo.setdetalleactivofijo_descripcion(MantenimientoActivoFijoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoAux));
				mantenimientoactivofijo.setDetalleActivoFijo(detalleactivofijoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(MantenimientoActivoFijo mantenimientoactivofijo,JComboBox jComboBoxid_tipo_movimientoMantenimientoActivoFijoGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoMantenimientoActivoFijoGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoMantenimientoActivoFijoGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				mantenimientoactivofijo.setid_tipo_movimiento(tipomovimientoAux.getId());
				mantenimientoactivofijo.settipomovimiento_descripcion(MantenimientoActivoFijoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				mantenimientoactivofijo.setTipoMovimiento(tipomovimientoAux);			}
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

					if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { 
					}

					if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { 
					}

					if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.addItem(detalleactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { 
					}

					if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.addItem(detalleactivofijo);
							}
						}

						if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMovimientosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMovimiento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { 
					}

					if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoMovimiento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.addItem(tipomovimiento);
							}
						}

						if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDetalleActivoFijoForeignKey(DetalleActivoFijo detalleactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setSelectedItem(detalleactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setSelectedItem(detalleactivofijo);
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMovimientoForeignKey(TipoMovimiento tipomovimiento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesMantenimientoActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			MantenimientoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesMantenimientoActivoFijo(this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			MantenimientoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesMantenimientoActivoFijo(this.mantenimientoactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(DetalleActivoFijo.class));
		classes.add(new Classe(TipoMovimiento.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//mantenimientoactivofijoLogic.setMantenimientoActivoFijos(this.mantenimientoactivofijos);
			mantenimientoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public MantenimientoActivoFijoParameterReturnGeneral getMantenimientoActivoFijoParameterGeneral() {
		return this.mantenimientoactivofijoParameterGeneral;
	}
	
	public void setMantenimientoActivoFijoParameterGeneral(MantenimientoActivoFijoParameterReturnGeneral mantenimientoactivofijoParameterGeneral) {
		this.mantenimientoactivofijoParameterGeneral = mantenimientoactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMantenimientoActivoFijo() {
		return isPermisoTodoMantenimientoActivoFijo;
	}

	public void setIsPermisoTodoMantenimientoActivoFijo(Boolean isPermisoTodoMantenimientoActivoFijo) {
		this.isPermisoTodoMantenimientoActivoFijo = isPermisoTodoMantenimientoActivoFijo;
	}

	public Boolean getIsPermisoNuevoMantenimientoActivoFijo() {
		return isPermisoNuevoMantenimientoActivoFijo;
	}

	public void setIsPermisoNuevoMantenimientoActivoFijo(Boolean isPermisoNuevoMantenimientoActivoFijo) {
		this.isPermisoNuevoMantenimientoActivoFijo = isPermisoNuevoMantenimientoActivoFijo;
	}

	public Boolean getIsPermisoActualizarMantenimientoActivoFijo() {
		return isPermisoActualizarMantenimientoActivoFijo;
	}

	public void setIsPermisoActualizarMantenimientoActivoFijo(Boolean isPermisoActualizarMantenimientoActivoFijo) {
		this.isPermisoActualizarMantenimientoActivoFijo = isPermisoActualizarMantenimientoActivoFijo;
	}

	public Boolean getIsPermisoEliminarMantenimientoActivoFijo() {
		return isPermisoEliminarMantenimientoActivoFijo;
	}

	public void setIsPermisoEliminarMantenimientoActivoFijo(Boolean isPermisoEliminarMantenimientoActivoFijo) {
		this.isPermisoEliminarMantenimientoActivoFijo = isPermisoEliminarMantenimientoActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosMantenimientoActivoFijo() {
		return isPermisoGuardarCambiosMantenimientoActivoFijo;
	}

	public void setIsPermisoGuardarCambiosMantenimientoActivoFijo(Boolean isPermisoGuardarCambiosMantenimientoActivoFijo) {
		this.isPermisoGuardarCambiosMantenimientoActivoFijo = isPermisoGuardarCambiosMantenimientoActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaMantenimientoActivoFijo() {
		return isPermisoConsultaMantenimientoActivoFijo;
	}

	public void setIsPermisoConsultaMantenimientoActivoFijo(Boolean isPermisoConsultaMantenimientoActivoFijo) {
		this.isPermisoConsultaMantenimientoActivoFijo = isPermisoConsultaMantenimientoActivoFijo;
	}

	public Boolean getIsPermisoBusquedaMantenimientoActivoFijo() {
		return isPermisoBusquedaMantenimientoActivoFijo;
	}

	public void setIsPermisoBusquedaMantenimientoActivoFijo(Boolean isPermisoBusquedaMantenimientoActivoFijo) {
		this.isPermisoBusquedaMantenimientoActivoFijo = isPermisoBusquedaMantenimientoActivoFijo;
	}

	public Boolean getIsPermisoReporteMantenimientoActivoFijo() {
		return isPermisoReporteMantenimientoActivoFijo;
	}

	public void setIsPermisoReporteMantenimientoActivoFijo(Boolean isPermisoReporteMantenimientoActivoFijo) {
		this.isPermisoReporteMantenimientoActivoFijo = isPermisoReporteMantenimientoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioMantenimientoActivoFijo() {
		return isPermisoPaginacionMedioMantenimientoActivoFijo;
	}

	public void setIsPermisoPaginacionMedioMantenimientoActivoFijo(Boolean isPermisoPaginacionMedioMantenimientoActivoFijo) {
		this.isPermisoPaginacionMedioMantenimientoActivoFijo = isPermisoPaginacionMedioMantenimientoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoMantenimientoActivoFijo() {
		return isPermisoPaginacionTodoMantenimientoActivoFijo;
	}

	public void setIsPermisoPaginacionTodoMantenimientoActivoFijo(Boolean isPermisoPaginacionTodoMantenimientoActivoFijo) {
		this.isPermisoPaginacionTodoMantenimientoActivoFijo = isPermisoPaginacionTodoMantenimientoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoMantenimientoActivoFijo() {
		return isPermisoPaginacionAltoMantenimientoActivoFijo;
	}

	public void setIsPermisoPaginacionAltoMantenimientoActivoFijo(Boolean isPermisoPaginacionAltoMantenimientoActivoFijo) {
		this.isPermisoPaginacionAltoMantenimientoActivoFijo = isPermisoPaginacionAltoMantenimientoActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarMantenimientoActivoFijo() {
		return isPermisoCopiarMantenimientoActivoFijo;
	}

	public void setIsPermisoCopiarMantenimientoActivoFijo(Boolean isPermisoCopiarMantenimientoActivoFijo) {
		this.isPermisoCopiarMantenimientoActivoFijo = isPermisoCopiarMantenimientoActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormMantenimientoActivoFijo() {
		return isPermisoVerFormMantenimientoActivoFijo;
	}

	public void setIsPermisoVerFormMantenimientoActivoFijo(Boolean isPermisoVerFormMantenimientoActivoFijo) {
		this.isPermisoVerFormMantenimientoActivoFijo = isPermisoVerFormMantenimientoActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarMantenimientoActivoFijo() {
		return isPermisoDuplicarMantenimientoActivoFijo;
	}

	public void setIsPermisoDuplicarMantenimientoActivoFijo(Boolean isPermisoDuplicarMantenimientoActivoFijo) {
		this.isPermisoDuplicarMantenimientoActivoFijo = isPermisoDuplicarMantenimientoActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenMantenimientoActivoFijo() {
		return isPermisoOrdenMantenimientoActivoFijo;
	}

	public void setIsPermisoOrdenMantenimientoActivoFijo(Boolean isPermisoOrdenMantenimientoActivoFijo) {
		this.isPermisoOrdenMantenimientoActivoFijo = isPermisoOrdenMantenimientoActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMantenimientoActivoFijo() {
		return isVisibilidadCeldaNuevoMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoMantenimientoActivoFijo(Boolean isVisibilidadCeldaNuevoMantenimientoActivoFijo) {
		this.isVisibilidadCeldaNuevoMantenimientoActivoFijo = isVisibilidadCeldaNuevoMantenimientoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMantenimientoActivoFijo() {
		return isVisibilidadCeldaDuplicarMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarMantenimientoActivoFijo(Boolean isVisibilidadCeldaDuplicarMantenimientoActivoFijo) {
		this.isVisibilidadCeldaDuplicarMantenimientoActivoFijo = isVisibilidadCeldaDuplicarMantenimientoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMantenimientoActivoFijo() {
		return isVisibilidadCeldaCopiarMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarMantenimientoActivoFijo(Boolean isVisibilidadCeldaCopiarMantenimientoActivoFijo) {
		this.isVisibilidadCeldaCopiarMantenimientoActivoFijo = isVisibilidadCeldaCopiarMantenimientoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMantenimientoActivoFijo() {
		return isVisibilidadCeldaVerFormMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormMantenimientoActivoFijo(Boolean isVisibilidadCeldaVerFormMantenimientoActivoFijo) {
		this.isVisibilidadCeldaVerFormMantenimientoActivoFijo = isVisibilidadCeldaVerFormMantenimientoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMantenimientoActivoFijo() {
		return isVisibilidadCeldaOrdenMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenMantenimientoActivoFijo(Boolean isVisibilidadCeldaOrdenMantenimientoActivoFijo) {
		this.isVisibilidadCeldaOrdenMantenimientoActivoFijo = isVisibilidadCeldaOrdenMantenimientoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo = isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMantenimientoActivoFijo() {
		return isVisibilidadCeldaModificarMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarMantenimientoActivoFijo(Boolean isVisibilidadCeldaModificarMantenimientoActivoFijo) {
		this.isVisibilidadCeldaModificarMantenimientoActivoFijo = isVisibilidadCeldaModificarMantenimientoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMantenimientoActivoFijo() {
		return isVisibilidadCeldaActualizarMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarMantenimientoActivoFijo(Boolean isVisibilidadCeldaActualizarMantenimientoActivoFijo) {
		this.isVisibilidadCeldaActualizarMantenimientoActivoFijo = isVisibilidadCeldaActualizarMantenimientoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarMantenimientoActivoFijo() {
		return isVisibilidadCeldaEliminarMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarMantenimientoActivoFijo(Boolean isVisibilidadCeldaEliminarMantenimientoActivoFijo) {
		this.isVisibilidadCeldaEliminarMantenimientoActivoFijo = isVisibilidadCeldaEliminarMantenimientoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarMantenimientoActivoFijo() {
		return isVisibilidadCeldaCancelarMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarMantenimientoActivoFijo(Boolean isVisibilidadCeldaCancelarMantenimientoActivoFijo) {
		this.isVisibilidadCeldaCancelarMantenimientoActivoFijo = isVisibilidadCeldaCancelarMantenimientoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarMantenimientoActivoFijo() {
		return isVisibilidadCeldaGuardarMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarMantenimientoActivoFijo(Boolean isVisibilidadCeldaGuardarMantenimientoActivoFijo) {
		this.isVisibilidadCeldaGuardarMantenimientoActivoFijo = isVisibilidadCeldaGuardarMantenimientoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo = isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo;
	}
		
	public MantenimientoActivoFijoSessionBean getmantenimientoactivofijoSessionBean() {
		return this.mantenimientoactivofijoSessionBean;
	}
	
	public void setmantenimientoactivofijoSessionBean(MantenimientoActivoFijoSessionBean mantenimientoactivofijoSessionBean) {
		this.mantenimientoactivofijoSessionBean=mantenimientoactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdDetalleActivoFijo() {
		return this.isVisibilidadFK_IdDetalleActivoFijo;
	}

	public void setisVisibilidadFK_IdDetalleActivoFijo(Boolean isVisibilidadFK_IdDetalleActivoFijo) {
		this.isVisibilidadFK_IdDetalleActivoFijo=isVisibilidadFK_IdDetalleActivoFijo;
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

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(mantenimientoactivofijo,null);
				this.setActualParaGuardarSucursalForeignKey(mantenimientoactivofijo,null);
				this.setActualParaGuardarDetalleActivoFijoForeignKey(mantenimientoactivofijo,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(mantenimientoactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(MantenimientoActivoFijo mantenimientoactivofijo,MantenimientoActivoFijo mantenimientoactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMantenimientoActivoFijo(mantenimientoactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		mantenimientoactivofijoAux.setId(mantenimientoactivofijo.getId());
		mantenimientoactivofijoAux.setVersionRow(mantenimientoactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessMantenimientoActivoFijo();
		
			int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = mantenimientoactivofijoValidator.getInvalidValues(this.mantenimientoactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			mantenimientoactivofijoLogic.setDatosCliente(datosCliente);
			mantenimientoactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				mantenimientoactivofijoAux=new  MantenimientoActivoFijo();
				
				mantenimientoactivofijoAux.setIsNew(true);
				mantenimientoactivofijoAux.setIsChanged(true);
				
				mantenimientoactivofijoAux.setMantenimientoActivoFijoOriginal(this.mantenimientoactivofijo);
				
				mantenimientoactivofijoAux.setId(this.mantenimientoactivofijo.getId());	
				mantenimientoactivofijoAux.setVersionRow(this.mantenimientoactivofijo.getVersionRow());	
				mantenimientoactivofijoAux.setid_empresa(this.mantenimientoactivofijo.getid_empresa());	
				mantenimientoactivofijoAux.setid_sucursal(this.mantenimientoactivofijo.getid_sucursal());	
				mantenimientoactivofijoAux.setid_detalle_activo_fijo(this.mantenimientoactivofijo.getid_detalle_activo_fijo());	
				mantenimientoactivofijoAux.setid_tipo_movimiento(this.mantenimientoactivofijo.getid_tipo_movimiento());	
				mantenimientoactivofijoAux.setnumero_documento(this.mantenimientoactivofijo.getnumero_documento());	
				mantenimientoactivofijoAux.setcausa(this.mantenimientoactivofijo.getcausa());	
				mantenimientoactivofijoAux.setreferencia(this.mantenimientoactivofijo.getreferencia());	
				mantenimientoactivofijoAux.settaller(this.mantenimientoactivofijo.gettaller());	
				mantenimientoactivofijoAux.settelefono(this.mantenimientoactivofijo.gettelefono());	
				mantenimientoactivofijoAux.setfecha_inicio(this.mantenimientoactivofijo.getfecha_inicio());	
				mantenimientoactivofijoAux.setfecha_entrega(this.mantenimientoactivofijo.getfecha_entrega());	
				mantenimientoactivofijoAux.setcosto(this.mantenimientoactivofijo.getcosto());	
				mantenimientoactivofijoAux.setresponsable(this.mantenimientoactivofijo.getresponsable());	
				mantenimientoactivofijoAux.setobservacion(this.mantenimientoactivofijo.getobservacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijoLogic.saveMantenimientoActivoFijos();//WithConnection
						//mantenimientoactivofijoLogic.getSetVersionRowMantenimientoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.mantenimientoactivofijo,mantenimientoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesMantenimientoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mantenimientoactivofijoLogic.saveMantenimientoActivoFijoRelaciones(mantenimientoactivofijoAux);//WithConnection
								//mantenimientoactivofijoLogic.getSetVersionRowMantenimientoActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.mantenimientoactivofijo,mantenimientoactivofijoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.mantenimientoactivofijo,mantenimientoactivofijoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				mantenimientoactivofijoAux=new  MantenimientoActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() && this.mantenimientoactivofijo.getId()>=0)) {
						
					mantenimientoactivofijoAux.setIsNew(false);
				}
				
				mantenimientoactivofijoAux.setIsDeleted(false);
			
				mantenimientoactivofijoAux.setId(this.mantenimientoactivofijo.getId());	
				mantenimientoactivofijoAux.setVersionRow(this.mantenimientoactivofijo.getVersionRow());	
				mantenimientoactivofijoAux.setid_empresa(this.mantenimientoactivofijo.getid_empresa());	
				mantenimientoactivofijoAux.setid_sucursal(this.mantenimientoactivofijo.getid_sucursal());	
				mantenimientoactivofijoAux.setid_detalle_activo_fijo(this.mantenimientoactivofijo.getid_detalle_activo_fijo());	
				mantenimientoactivofijoAux.setid_tipo_movimiento(this.mantenimientoactivofijo.getid_tipo_movimiento());	
				mantenimientoactivofijoAux.setnumero_documento(this.mantenimientoactivofijo.getnumero_documento());	
				mantenimientoactivofijoAux.setcausa(this.mantenimientoactivofijo.getcausa());	
				mantenimientoactivofijoAux.setreferencia(this.mantenimientoactivofijo.getreferencia());	
				mantenimientoactivofijoAux.settaller(this.mantenimientoactivofijo.gettaller());	
				mantenimientoactivofijoAux.settelefono(this.mantenimientoactivofijo.gettelefono());	
				mantenimientoactivofijoAux.setfecha_inicio(this.mantenimientoactivofijo.getfecha_inicio());	
				mantenimientoactivofijoAux.setfecha_entrega(this.mantenimientoactivofijo.getfecha_entrega());	
				mantenimientoactivofijoAux.setcosto(this.mantenimientoactivofijo.getcosto());	
				mantenimientoactivofijoAux.setresponsable(this.mantenimientoactivofijo.getresponsable());	
				mantenimientoactivofijoAux.setobservacion(this.mantenimientoactivofijo.getobservacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijoLogic.saveMantenimientoActivoFijos();//WithConnection
						//mantenimientoactivofijoLogic.getSetVersionRowMantenimientoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.mantenimientoactivofijo,mantenimientoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesMantenimientoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mantenimientoactivofijoLogic.saveMantenimientoActivoFijoRelaciones(mantenimientoactivofijoAux);//WithConnection
								//mantenimientoactivofijoLogic.getSetVersionRowMantenimientoActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.mantenimientoactivofijo,mantenimientoactivofijoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.mantenimientoactivofijo,mantenimientoactivofijoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				mantenimientoactivofijoAux=new  MantenimientoActivoFijo();
				
				mantenimientoactivofijoAux.setIsNew(false);
				mantenimientoactivofijoAux.setIsChanged(false);
				
				mantenimientoactivofijoAux.setIsDeleted(true);
				
				mantenimientoactivofijoAux.setId(this.mantenimientoactivofijo.getId());	
				mantenimientoactivofijoAux.setVersionRow(this.mantenimientoactivofijo.getVersionRow());	
				mantenimientoactivofijoAux.setid_empresa(this.mantenimientoactivofijo.getid_empresa());	
				mantenimientoactivofijoAux.setid_sucursal(this.mantenimientoactivofijo.getid_sucursal());	
				mantenimientoactivofijoAux.setid_detalle_activo_fijo(this.mantenimientoactivofijo.getid_detalle_activo_fijo());	
				mantenimientoactivofijoAux.setid_tipo_movimiento(this.mantenimientoactivofijo.getid_tipo_movimiento());	
				mantenimientoactivofijoAux.setnumero_documento(this.mantenimientoactivofijo.getnumero_documento());	
				mantenimientoactivofijoAux.setcausa(this.mantenimientoactivofijo.getcausa());	
				mantenimientoactivofijoAux.setreferencia(this.mantenimientoactivofijo.getreferencia());	
				mantenimientoactivofijoAux.settaller(this.mantenimientoactivofijo.gettaller());	
				mantenimientoactivofijoAux.settelefono(this.mantenimientoactivofijo.gettelefono());	
				mantenimientoactivofijoAux.setfecha_inicio(this.mantenimientoactivofijo.getfecha_inicio());	
				mantenimientoactivofijoAux.setfecha_entrega(this.mantenimientoactivofijo.getfecha_entrega());	
				mantenimientoactivofijoAux.setcosto(this.mantenimientoactivofijo.getcosto());	
				mantenimientoactivofijoAux.setresponsable(this.mantenimientoactivofijo.getresponsable());	
				mantenimientoactivofijoAux.setobservacion(this.mantenimientoactivofijo.getobservacion());	
				
				if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.mantenimientoactivofijoAux.getId()>=0) {	
						this.mantenimientoactivofijosEliminados.add(mantenimientoactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijoLogic.saveMantenimientoActivoFijos();//WithConnection
						//mantenimientoactivofijoLogic.getSetVersionRowMantenimientoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								mantenimientoactivofijoLogic.saveMantenimientoActivoFijoRelaciones(mantenimientoactivofijoAux);//WithConnection
								//mantenimientoactivofijoLogic.getSetVersionRowMantenimientoActivoFijos();//WithConnection
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
							if(this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(mantenimientoactivofijoAux,mantenimientoactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().addAll(this.mantenimientoactivofijosEliminados);
					
					mantenimientoactivofijoLogic.saveMantenimientoActivoFijos();//WithConnection
					//mantenimientoactivofijoLogic.getSetVersionRowMantenimientoActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesMantenimientoActivoFijo();
				
				this.mantenimientoactivofijosEliminados= new ArrayList<MantenimientoActivoFijo>();		
			}
			
			if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Mantenimiento Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Mantenimiento Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.mantenimientoactivofijo=mantenimientoactivofijoAux;
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
      		//this.finishProcessMantenimientoActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(MantenimientoActivoFijo mantenimientoactivofijoLocal) throws Exception {
		
		if(this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(MantenimientoActivoFijo mantenimientoactivofijoLocal) throws Exception {	
		if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				mantenimientoactivofijoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				mantenimientoactivofijoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleActivoFijoDetalleFormJInternalFrame.class)) {
				DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrameLocal=(DetalleActivoFijoBeanSwingJInternalFrame) ((DetalleActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detalleactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.getdetalleactivofijo(),true);
				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarLista(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo,this.detalleactivofijosForeignKey);

				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				mantenimientoactivofijoLocal.setDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey("Formulario");
				this.setActualDetalleActivoFijoForeignKey(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				mantenimientoactivofijoLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMantenimientoActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = mantenimientoactivofijoValidator.getInvalidValues(this.mantenimientoactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(MantenimientoActivoFijo mantenimientoactivofijo,List<MantenimientoActivoFijo> mantenimientoactivofijos) throws Exception {
		try	{		
			MantenimientoActivoFijoConstantesFunciones.actualizarLista(mantenimientoactivofijo,mantenimientoactivofijos,this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(MantenimientoActivoFijo mantenimientoactivofijo,List<MantenimientoActivoFijo> mantenimientoactivofijos) throws Exception {
		try	{			
			MantenimientoActivoFijoConstantesFunciones.actualizarSelectedLista(mantenimientoactivofijo,mantenimientoactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<MantenimientoActivoFijo> mantenimientoactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				mantenimientoactivofijosLocal=this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				mantenimientoactivofijosLocal=this.mantenimientoactivofijos;
			}
			//ARCHITECTURE
		
			for(MantenimientoActivoFijo mantenimientoactivofijoLocal:mantenimientoactivofijosLocal) {
				if(this.permiteMantenimiento(mantenimientoactivofijoLocal) && mantenimientoactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MantenimientoActivoFijoConstantesFunciones.getMantenimientoActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelid_empresaMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelid_sucursalMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.IDDETALLEACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelid_detalle_activo_fijoMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.IDTIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelid_tipo_movimientoMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.NUMERODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelnumero_documentoMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.CAUSA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelcausaMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.REFERENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelreferenciaMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.TALLER)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabeltallerMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabeltelefonoMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelfecha_inicioMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.FECHAENTREGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelfecha_entregaMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelcostoMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.RESPONSABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelresponsableMantenimientoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoActivoFijoConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelobservacionMantenimientoActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelid_empresaMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelid_sucursalMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelid_detalle_activo_fijoMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelid_tipo_movimientoMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelnumero_documentoMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelcausaMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelreferenciaMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabeltallerMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabeltelefonoMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelfecha_inicioMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelfecha_entregaMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelcostoMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelresponsableMantenimientoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelobservacionMantenimientoActivoFijo,"");
		
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
		this.iIdNuevoMantenimientoActivoFijo--;	
		
		
		this.mantenimientoactivofijoAux=new MantenimientoActivoFijo();
		
		this.mantenimientoactivofijoAux.setId(this.iIdNuevoMantenimientoActivoFijo);
		this.mantenimientoactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().add(this.mantenimientoactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.mantenimientoactivofijos.add(this.mantenimientoactivofijoAux);
		}
		//ARCHITECTURE
		
		this.mantenimientoactivofijo=this.mantenimientoactivofijoAux;
		
		if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMantenimientoActivoFijo(this.mantenimientoactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyMantenimientoActivoFijo(this.mantenimientoactivofijo);
		}
				
		//this.setDefaultControlesMantenimientoActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMantenimientoActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMantenimientoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMantenimientoActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijoBean,this.mantenimientoactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=MantenimientoActivoFijoConstantesFunciones.getClassesRelationshipsOfMantenimientoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.mantenimientoactivofijoReturnGeneral=mantenimientoactivofijoLogic.procesarEventosMantenimientoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos(),this.mantenimientoactivofijo,this.mantenimientoactivofijoParameterGeneral,this.isEsNuevoMantenimientoActivoFijo,classes);//this.mantenimientoactivofijoLogic.getMantenimientoActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMantenimientoActivoFijo(this.mantenimientoactivofijoReturnGeneral,this.mantenimientoactivofijoBean,false);
		
		if(this.mantenimientoactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMantenimientoActivoFijo(this.mantenimientoactivofijoReturnGeneral.getMantenimientoActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMantenimientoActivoFijo(this.mantenimientoactivofijoReturnGeneral.getMantenimientoActivoFijo());
		}
		
		if(this.mantenimientoactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMantenimientoActivoFijo(this.mantenimientoactivofijoReturnGeneral.getMantenimientoActivoFijo(),classes);//this.mantenimientoactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMantenimientoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMantenimientoActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.RecargarFormMantenimientoActivoFijo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMantenimientoActivoFijo(false);
						
			if(mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMantenimientoActivoFijo();
			}
			
			this.actualizarVisualTableDatosMantenimientoActivoFijo();
			
			this.jTableDatosMantenimientoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoMantenimientoActivoFijo(), this.getIndiceNuevoMantenimientoActivoFijo());
			
			this.seleccionarFilaTablaMantenimientoActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMantenimientoActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldnumero_documentoMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarnumero_documentoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreacausaMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarcausaMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreareferenciaMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarreferenciaMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatallerMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activartallerMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatelefonoMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activartelefonoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_inicioMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarfecha_inicioMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_entregaMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarfecha_entregaMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldcostoMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarcostoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextArearesponsableMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarresponsableMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreaobservacionMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarobservacionMantenimientoActivoFijo);	
		//
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarid_empresaMantenimientoActivoFijo);//
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarid_sucursalMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarid_detalle_activo_fijoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setEnabled(isHabilitar && this.mantenimientoactivofijoConstantesFunciones.activarid_tipo_movimientoMantenimientoActivoFijo);
	};
	
	public void setDefaultControlesMantenimientoActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMantenimientoActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.mantenimientoactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.mantenimientoactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTabbedPaneRelacionesMantenimientoActivoFijo.setVisible(true);
			
					
		} else {
			//this.mantenimientoactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.mantenimientoactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTabbedPaneRelacionesMantenimientoActivoFijo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoMantenimientoActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
				if(mantenimientoactivofijoAux.getId().equals(this.iIdNuevoMantenimientoActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijos) {
				if(mantenimientoactivofijoAux.getId().equals(this.iIdNuevoMantenimientoActivoFijo)) {
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
	
	public int getIndiceActualMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
				if(mantenimientoactivofijoAux.getId().equals(mantenimientoactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijos) {
				if(mantenimientoactivofijoAux.getId().equals(mantenimientoactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
				if(mantenimientoactivofijoAux.getMantenimientoActivoFijoOriginal().getId().equals(mantenimientoactivofijoOriginal.getId())) {
					existe=true;
					mantenimientoactivofijoOriginal.setId(mantenimientoactivofijoAux.getId());
					mantenimientoactivofijoOriginal.setVersionRow(mantenimientoactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijos) {
				if(mantenimientoactivofijoAux.getMantenimientoActivoFijoOriginal().getId().equals(mantenimientoactivofijoOriginal.getId())) {
					existe=true;
					mantenimientoactivofijoOriginal.setId(mantenimientoactivofijoAux.getId());
					mantenimientoactivofijoOriginal.setVersionRow(mantenimientoactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMantenimientoActivoFijo(Boolean esParaCancelar) throws Exception {
		mantenimientoactivofijosAux=new ArrayList<MantenimientoActivoFijo>();
		mantenimientoactivofijoAux=new MantenimientoActivoFijo();
		
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
					if(mantenimientoactivofijoAux.getId()<0) {
						mantenimientoactivofijosAux.add(mantenimientoactivofijoAux);
					}		
				}
				this.iIdNuevoMantenimientoActivoFijo=0L;
				this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().removeAll(mantenimientoactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijos) {
					if(mantenimientoactivofijoAux.getId()<0) {
						mantenimientoactivofijosAux.add(mantenimientoactivofijoAux);
					}		
				}
				this.iIdNuevoMantenimientoActivoFijo=0L;
				this.mantenimientoactivofijos.removeAll(mantenimientoactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMantenimientoActivoFijo 
					&& this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size()>0
					) {
					mantenimientoactivofijoAux=this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().get(this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size() - 1);
				
					if(mantenimientoactivofijoAux.getId()<0) {
						this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().remove(mantenimientoactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMantenimientoActivoFijo && this.mantenimientoactivofijos.size()>0) {
					mantenimientoactivofijoAux=this.mantenimientoactivofijos.get(this.mantenimientoactivofijos.size() - 1);
				
					if(mantenimientoactivofijoAux.getId()<0) {
						this.mantenimientoactivofijos.remove(mantenimientoactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMantenimientoActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(mantenimientoactivofijo.getId()<0) {
				this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().remove(this.mantenimientoactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(mantenimientoactivofijo.getId()<0) {
				this.mantenimientoactivofijos.remove(this.mantenimientoactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesMantenimientoActivoFijo(List<MantenimientoActivoFijo> mantenimientoactivofijosAux) throws Exception {
		MantenimientoActivoFijoConstantesFunciones.setEstadosInicialesMantenimientoActivoFijo(mantenimientoactivofijosAux);
	}
	
	public void setEstadosInicialesMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijoAux) throws Exception {
		MantenimientoActivoFijoConstantesFunciones.setEstadosInicialesMantenimientoActivoFijo(mantenimientoactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMantenimientoActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMantenimientoActivoFijoActual()) {
				if(!this.isEsNuevoMantenimientoActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMantenimientoActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMantenimientoActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Mantenimiento Activo Fijo ?", "MANTENIMIENTO DE Mantenimiento Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(MantenimientoActivoFijo mantenimientoactivofijo) throws Exception {
		MantenimientoActivoFijoConstantesFunciones.seleccionarAsignar(this.mantenimientoactivofijo,mantenimientoactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMantenimientoActivoFijo=this.isPermisoActualizarOriginalMantenimientoActivoFijo;
			
			
			this.seleccionarAsignar(mantenimientoactivofijo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MantenimientoActivoFijoConstantesFunciones.quitarEspaciosMantenimientoActivoFijo(this.mantenimientoactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.mantenimientoactivofijoSessionBean.setsFuncionBusquedaRapida(this.mantenimientoactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMantenimientoActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMantenimientoActivoFijo(esParaCancelar);				
				this.cancelarNuevoMantenimientoActivoFijo(esParaCancelar);								
			}
			
			this.mantenimientoactivofijo=new MantenimientoActivoFijo();
			
			this.inicializarMantenimientoActivoFijo();
			
			this.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMantenimientoActivoFijo() throws Exception {
		try {
			MantenimientoActivoFijoConstantesFunciones.inicializarMantenimientoActivoFijo(this.mantenimientoactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMantenimientoActivoFijos(String sAccionBusqueda,List<MantenimientoActivoFijo> mantenimientoactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="MantenimientoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MantenimientoActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MantenimientoActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="MantenimientoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Mantenimiento Activo Fijos");		
		parameters.put("busquedapor", MantenimientoActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMantenimientoActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MantenimientoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MantenimientoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMantenimientoActivoFijo=new JRBeanArrayDataSource(MantenimientoActivoFijoJInternalFrame.TraerMantenimientoActivoFijoBeans(mantenimientoactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMantenimientoActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MantenimientoActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MantenimientoActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MantenimientoActivoFijoBean.TraerMantenimientoActivoFijoBeans(mantenimientoactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteMantenimientoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,mantenimientoactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMantenimientoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,mantenimientoactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijoActionPerformed(null);
					//this.generarExcelReporteMantenimientoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,mantenimientoactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMantenimientoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,mantenimientoactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMantenimientoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,mantenimientoactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMantenimientoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,mantenimientoactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMantenimientoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<MantenimientoActivoFijo> mantenimientoactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MantenimientoActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMantenimientoActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(MantenimientoActivoFijo mantenimientoactivofijo : mantenimientoactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MantenimientoActivoFijoConstantesFunciones.generarExcelReporteDataMantenimientoActivoFijo("NORMAL",row,workbook,mantenimientoactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimiento Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMantenimientoActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		MantenimientoActivoFijoConstantesFunciones.generarExcelReporteHeaderMantenimientoActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMantenimientoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<MantenimientoActivoFijo> mantenimientoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MantenimientoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(MantenimientoActivoFijo mantenimientoactivofijo : mantenimientoactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.getMantenimientoActivoFijoDescripcion(mantenimientoactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.getdetalleactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.getnumero_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.getcausa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.getreferencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.gettaller());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.getfecha_entrega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.getresponsable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoactivofijo.getobservacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimiento Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMantenimientoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<MantenimientoActivoFijo> mantenimientoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<MantenimientoActivoFijo> mantenimientoactivofijosRespaldo=null;
		
		classes=MantenimientoActivoFijoConstantesFunciones.getClassesRelationshipsOfMantenimientoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.mantenimientoactivofijoLogic.setDatosCliente(this.datosCliente);
		this.mantenimientoactivofijoLogic.setDatosDeep(this.datosDeep);
		this.mantenimientoactivofijoLogic.setIsConDeep(true);
		
		mantenimientoactivofijosRespaldo=this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos();
		
		this.mantenimientoactivofijoLogic.setMantenimientoActivoFijos(mantenimientoactivofijosParaReportes);	
		this.mantenimientoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		mantenimientoactivofijosParaReportes=this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos();
		this.mantenimientoactivofijoLogic.setMantenimientoActivoFijos(mantenimientoactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MantenimientoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMantenimientoActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(MantenimientoActivoFijo mantenimientoactivofijo : mantenimientoactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMantenimientoActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MantenimientoActivoFijoConstantesFunciones.generarExcelReporteDataMantenimientoActivoFijo("NORMAL",row,workbook,mantenimientoactivofijo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.getMantenimientoActivoFijoDescripcion(mantenimientoactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimiento Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMantenimientoActivoFijo() throws Exception {		
		this.startProcessMantenimientoActivoFijo(true);
	}
	
	public void startProcessMantenimientoActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMantenimientoActivoFijo ,this.jPanelParametrosReportesMantenimientoActivoFijo, this.jScrollPanelDatosMantenimientoActivoFijo,this.jPanelPaginacionMantenimientoActivoFijo, this.jScrollPanelDatosEdicionMantenimientoActivoFijo, this.jPanelAccionesMantenimientoActivoFijo,this.jPanelAccionesFormularioMantenimientoActivoFijo,this.jmenuBarMantenimientoActivoFijo,this.jmenuBarDetalleMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,this.jTtoolBarDetalleMantenimientoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasMantenimientoActivoFijo=this.jTabbedPaneBusquedasMantenimientoActivoFijo; 
		
		final JPanel jPanelParametrosReportesMantenimientoActivoFijo=this.jPanelParametrosReportesMantenimientoActivoFijo;
		//final JScrollPane jScrollPanelDatosMantenimientoActivoFijo=this.jScrollPanelDatosMantenimientoActivoFijo;
		final JTable jTableDatosMantenimientoActivoFijo=this.jTableDatosMantenimientoActivoFijo;		
		final JPanel jPanelPaginacionMantenimientoActivoFijo=this.jPanelPaginacionMantenimientoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionMantenimientoActivoFijo=this.jScrollPanelDatosEdicionMantenimientoActivoFijo;
		final JPanel jPanelAccionesMantenimientoActivoFijo=this.jPanelAccionesMantenimientoActivoFijo;
		
		JPanel jPanelCamposAuxiliarMantenimientoActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMantenimientoActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			jPanelCamposAuxiliarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelCamposMantenimientoActivoFijo;
			jPanelAccionesFormularioAuxiliarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelAccionesFormularioMantenimientoActivoFijo;
		}
		
		final JPanel jPanelCamposMantenimientoActivoFijo=jPanelCamposAuxiliarMantenimientoActivoFijo;
		final JPanel jPanelAccionesFormularioMantenimientoActivoFijo=jPanelAccionesFormularioAuxiliarMantenimientoActivoFijo;
		
		
		final JMenuBar jmenuBarMantenimientoActivoFijo=this.jmenuBarMantenimientoActivoFijo;
		final JToolBar jTtoolBarMantenimientoActivoFijo=this.jTtoolBarMantenimientoActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMantenimientoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMantenimientoActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jmenuBarDetalleMantenimientoActivoFijo;
			jTtoolBarDetalleAuxiliarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTtoolBarDetalleMantenimientoActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleMantenimientoActivoFijo=jmenuBarDetalleAuxiliarMantenimientoActivoFijo;
		final JToolBar jTtoolBarDetalleMantenimientoActivoFijo=jTtoolBarDetalleAuxiliarMantenimientoActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMantenimientoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMantenimientoActivoFijo;
			processRunnable.jTableDatos=jTableDatosMantenimientoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposMantenimientoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionMantenimientoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesMantenimientoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMantenimientoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarMantenimientoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMantenimientoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarMantenimientoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMantenimientoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMantenimientoActivoFijo ,jPanelParametrosReportesMantenimientoActivoFijo,jTableDatosMantenimientoActivoFijo, /*jScrollPanelDatosMantenimientoActivoFijo,*/jPanelCamposMantenimientoActivoFijo,jPanelPaginacionMantenimientoActivoFijo, /*jScrollPanelDatosEdicionMantenimientoActivoFijo,*/ jPanelAccionesMantenimientoActivoFijo,jPanelAccionesFormularioMantenimientoActivoFijo,jmenuBarMantenimientoActivoFijo,jmenuBarDetalleMantenimientoActivoFijo,jTtoolBarMantenimientoActivoFijo,jTtoolBarDetalleMantenimientoActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMantenimientoActivoFijo ,jPanelParametrosReportesMantenimientoActivoFijo, jScrollPanelDatosMantenimientoActivoFijo,jPanelPaginacionMantenimientoActivoFijo, jScrollPanelDatosEdicionMantenimientoActivoFijo, jPanelAccionesMantenimientoActivoFijo,jPanelAccionesFormularioMantenimientoActivoFijo,jmenuBarMantenimientoActivoFijo,jmenuBarDetalleMantenimientoActivoFijo,jTtoolBarMantenimientoActivoFijo,jTtoolBarDetalleMantenimientoActivoFijo);
						
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
	
	public void finishProcessMantenimientoActivoFijo() {// throws Exception 
		this.finishProcessMantenimientoActivoFijo(true);
	}
	
	public void finishProcessMantenimientoActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMantenimientoActivoFijo ,this.jPanelParametrosReportesMantenimientoActivoFijo, this.jScrollPanelDatosMantenimientoActivoFijo,this.jPanelPaginacionMantenimientoActivoFijo, this.jScrollPanelDatosEdicionMantenimientoActivoFijo, this.jPanelAccionesMantenimientoActivoFijo,this.jPanelAccionesFormularioMantenimientoActivoFijo,this.jmenuBarMantenimientoActivoFijo,this.jmenuBarDetalleMantenimientoActivoFijo,this.jTtoolBarMantenimientoActivoFijo,this.jTtoolBarDetalleMantenimientoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasMantenimientoActivoFijo=this.jTabbedPaneBusquedasMantenimientoActivoFijo; 
		
		final JPanel jPanelParametrosReportesMantenimientoActivoFijo=this.jPanelParametrosReportesMantenimientoActivoFijo;
		//final JScrollPane jScrollPanelDatosMantenimientoActivoFijo=this.jScrollPanelDatosMantenimientoActivoFijo;
		final JTable jTableDatosMantenimientoActivoFijo=this.jTableDatosMantenimientoActivoFijo;		
		final JPanel jPanelPaginacionMantenimientoActivoFijo=this.jPanelPaginacionMantenimientoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionMantenimientoActivoFijo=this.jScrollPanelDatosEdicionMantenimientoActivoFijo;
		final JPanel jPanelAccionesMantenimientoActivoFijo=this.jPanelAccionesMantenimientoActivoFijo;
		
		JPanel jPanelCamposAuxiliarMantenimientoActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMantenimientoActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			jPanelCamposAuxiliarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelCamposMantenimientoActivoFijo;
			jPanelAccionesFormularioAuxiliarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelAccionesFormularioMantenimientoActivoFijo;
		}
		
		final JPanel jPanelCamposMantenimientoActivoFijo=jPanelCamposAuxiliarMantenimientoActivoFijo;
		final JPanel jPanelAccionesFormularioMantenimientoActivoFijo=jPanelAccionesFormularioAuxiliarMantenimientoActivoFijo;
		
		
		final JMenuBar jmenuBarMantenimientoActivoFijo=this.jmenuBarMantenimientoActivoFijo;		
		final JToolBar jTtoolBarMantenimientoActivoFijo=this.jTtoolBarMantenimientoActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarMantenimientoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMantenimientoActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jmenuBarDetalleMantenimientoActivoFijo;
			jTtoolBarDetalleAuxiliarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTtoolBarDetalleMantenimientoActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleMantenimientoActivoFijo=jmenuBarDetalleAuxiliarMantenimientoActivoFijo;
		final JToolBar jTtoolBarDetalleMantenimientoActivoFijo=jTtoolBarDetalleAuxiliarMantenimientoActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMantenimientoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMantenimientoActivoFijo;
			processRunnable.jTableDatos=jTableDatosMantenimientoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposMantenimientoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionMantenimientoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesMantenimientoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMantenimientoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarMantenimientoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMantenimientoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarMantenimientoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMantenimientoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMantenimientoActivoFijo ,jPanelParametrosReportesMantenimientoActivoFijo, jTableDatosMantenimientoActivoFijo,/*jScrollPanelDatosMantenimientoActivoFijo,*/jPanelCamposMantenimientoActivoFijo,jPanelPaginacionMantenimientoActivoFijo, /*jScrollPanelDatosEdicionMantenimientoActivoFijo,*/ jPanelAccionesMantenimientoActivoFijo,jPanelAccionesFormularioMantenimientoActivoFijo,jmenuBarMantenimientoActivoFijo,jmenuBarDetalleMantenimientoActivoFijo,jTtoolBarMantenimientoActivoFijo,jTtoolBarDetalleMantenimientoActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMantenimientoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMantenimientoActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMantenimientoActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMantenimientoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMantenimientoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMantenimientoActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMantenimientoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMantenimientoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMantenimientoActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.mantenimientoactivofijoConstantesFunciones.getsFinalQueryMantenimientoActivoFijo();
		String  finalQueryPaginacionTodos=this.mantenimientoactivofijoConstantesFunciones.getsFinalQueryMantenimientoActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MantenimientoActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoMantenimientoActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MantenimientoActivoFijoConstantesFunciones.getArrayColumnasGlobalesMantenimientoActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MantenimientoActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.mantenimientoactivofijosEliminados= new ArrayList<MantenimientoActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMantenimientoActivoFijo();
		
				///*MantenimientoActivoFijoSessionBean*/this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
			
			if(this.mantenimientoactivofijoSessionBean==null) {
				this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
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
					this.iNumeroPaginacion=MantenimientoActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MantenimientoActivoFijoConstantesFunciones.getClassesForeignKeysOfMantenimientoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/mantenimientoactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			mantenimientoactivofijosAux= new ArrayList<MantenimientoActivoFijo>();
			
				
			mantenimientoactivofijoLogic.setDatosCliente(this.datosCliente);
			mantenimientoactivofijoLogic.setDatosDeep(this.datosDeep);
			mantenimientoactivofijoLogic.setIsConDeep(true);
			
			
			mantenimientoactivofijoLogic.getMantenimientoActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					mantenimientoactivofijoLogic.getTodosMantenimientoActivoFijos(finalQueryGlobal,pagination);
					
					//mantenimientoactivofijoLogic.getTodosMantenimientoActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(mantenimientoactivofijoLogic.getMantenimientoActivoFijos()==null|| mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mantenimientoactivofijosAux= new ArrayList<MantenimientoActivoFijo>();
							mantenimientoactivofijosAux.addAll(mantenimientoactivofijoLogic.getMantenimientoActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoactivofijosAux= new ArrayList<MantenimientoActivoFijo>();
							mantenimientoactivofijosAux.addAll(mantenimientoactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mantenimientoactivofijoLogic.getTodosMantenimientoActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//mantenimientoactivofijoLogic.getTodosMantenimientoActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteMantenimientoActivoFijos("Todos",mantenimientoactivofijoLogic.getMantenimientoActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mantenimientoactivofijoLogic.setMantenimientoActivoFijos(new ArrayList<MantenimientoActivoFijo>());					
							mantenimientoactivofijoLogic.getMantenimientoActivoFijos().addAll(mantenimientoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoactivofijos=new ArrayList<MantenimientoActivoFijo>();
							mantenimientoactivofijos.addAll(mantenimientoactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idMantenimientoActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idMantenimientoActivoFijo=this.idActual;
				
				} else if(this.idMantenimientoActivoFijoActual!=null && this.idMantenimientoActivoFijoActual!=0L) {
					idMantenimientoActivoFijo=idMantenimientoActivoFijoActual;
				}
				
					
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndicePorId(idMantenimientoActivoFijo);
				
				this.mantenimientoactivofijos=new ArrayList<MantenimientoActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					mantenimientoactivofijoLogic.getEntity(idMantenimientoActivoFijo);
					
					//mantenimientoactivofijoLogic.getEntityWithConnection(idMantenimientoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mantenimientoactivofijoLogic.setMantenimientoActivoFijos(new ArrayList<MantenimientoActivoFijo>());
					mantenimientoactivofijoLogic.getMantenimientoActivoFijos().add(mantenimientoactivofijoLogic.getMantenimientoActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mantenimientoactivofijos=new ArrayList<MantenimientoActivoFijo>();
					this.mantenimientoactivofijos.add(mantenimientoactivofijo);
				}
				
				if(mantenimientoactivofijoLogic.getMantenimientoActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdDetalleActivoFijo")) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mantenimientoactivofijoLogic.getMantenimientoActivoFijos()==null||mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mantenimientoactivofijos==null|| mantenimientoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijosAux=new ArrayList<MantenimientoActivoFijo>();
						mantenimientoactivofijosAux.addAll(mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoactivofijosAux=new ArrayList<MantenimientoActivoFijo>();
							mantenimientoactivofijosAux.addAll(mantenimientoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMantenimientoActivoFijos("FK_IdDetalleActivoFijo",mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMantenimientoActivoFijos("FK_IdDetalleActivoFijo",mantenimientoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijoLogic.setMantenimientoActivoFijos(new ArrayList<MantenimientoActivoFijo>());
						mantenimientoactivofijoLogic.getMantenimientoActivoFijos().addAll(mantenimientoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoactivofijos=new ArrayList<MantenimientoActivoFijo>();
							mantenimientoactivofijos.addAll(mantenimientoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mantenimientoactivofijoLogic.getMantenimientoActivoFijos()==null||mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mantenimientoactivofijos==null|| mantenimientoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijosAux=new ArrayList<MantenimientoActivoFijo>();
						mantenimientoactivofijosAux.addAll(mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoactivofijosAux=new ArrayList<MantenimientoActivoFijo>();
							mantenimientoactivofijosAux.addAll(mantenimientoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMantenimientoActivoFijos("FK_IdEmpresa",mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMantenimientoActivoFijos("FK_IdEmpresa",mantenimientoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijoLogic.setMantenimientoActivoFijos(new ArrayList<MantenimientoActivoFijo>());
						mantenimientoactivofijoLogic.getMantenimientoActivoFijos().addAll(mantenimientoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoactivofijos=new ArrayList<MantenimientoActivoFijo>();
							mantenimientoactivofijos.addAll(mantenimientoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mantenimientoactivofijoLogic.getMantenimientoActivoFijos()==null||mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mantenimientoactivofijos==null|| mantenimientoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijosAux=new ArrayList<MantenimientoActivoFijo>();
						mantenimientoactivofijosAux.addAll(mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoactivofijosAux=new ArrayList<MantenimientoActivoFijo>();
							mantenimientoactivofijosAux.addAll(mantenimientoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMantenimientoActivoFijos("FK_IdSucursal",mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMantenimientoActivoFijos("FK_IdSucursal",mantenimientoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijoLogic.setMantenimientoActivoFijos(new ArrayList<MantenimientoActivoFijo>());
						mantenimientoactivofijoLogic.getMantenimientoActivoFijos().addAll(mantenimientoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoactivofijos=new ArrayList<MantenimientoActivoFijo>();
							mantenimientoactivofijos.addAll(mantenimientoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoMovimiento")) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdTipoMovimiento(finalQueryGlobal,pagination,id_tipo_movimientoFK_IdTipoMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mantenimientoactivofijoLogic.getMantenimientoActivoFijos()==null||mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mantenimientoactivofijos==null|| mantenimientoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijosAux=new ArrayList<MantenimientoActivoFijo>();
						mantenimientoactivofijosAux.addAll(mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoactivofijosAux=new ArrayList<MantenimientoActivoFijo>();
							mantenimientoactivofijosAux.addAll(mantenimientoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdTipoMovimiento(finalQueryGlobal,pagination,id_tipo_movimientoFK_IdTipoMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MantenimientoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMantenimientoActivoFijos("FK_IdTipoMovimiento",mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMantenimientoActivoFijos("FK_IdTipoMovimiento",mantenimientoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijoLogic.setMantenimientoActivoFijos(new ArrayList<MantenimientoActivoFijo>());
						mantenimientoactivofijoLogic.getMantenimientoActivoFijos().addAll(mantenimientoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoactivofijos=new ArrayList<MantenimientoActivoFijo>();
							mantenimientoactivofijos.addAll(mantenimientoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMantenimientoActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMantenimientoActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mantenimientoactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mantenimientoactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(MantenimientoActivoFijo mantenimientoactivofijo) {
		Boolean permite=true;
		
		if(this.mantenimientoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MantenimientoActivoFijoConstantesFunciones.getOrderByListaMantenimientoActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MantenimientoActivoFijoConstantesFunciones.getOrderByListaMantenimientoActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
				if(mantenimientoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					mantenimientoactivofijoTotales=mantenimientoactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MantenimientoActivoFijo mantenimientoactivofijo:this.mantenimientoactivofijos) {
				if(mantenimientoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					mantenimientoactivofijoTotales=mantenimientoactivofijo;
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
			this.mantenimientoactivofijoAux=new MantenimientoActivoFijo();
			this.mantenimientoactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.mantenimientoactivofijoAux.setIsNew(false);
			this.mantenimientoactivofijoAux.setIsChanged(false);
			this.mantenimientoactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				MantenimientoActivoFijoConstantesFunciones.TotalizarValoresFilaMantenimientoActivoFijo(this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos(),this.mantenimientoactivofijoAux);
				
				this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().add(this.mantenimientoactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MantenimientoActivoFijoConstantesFunciones.TotalizarValoresFilaMantenimientoActivoFijo(this.mantenimientoactivofijos,this.mantenimientoactivofijoAux);
				
				this.mantenimientoactivofijos.add(this.mantenimientoactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		mantenimientoactivofijoTotales=new MantenimientoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().remove(mantenimientoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mantenimientoactivofijos.remove(mantenimientoactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		mantenimientoactivofijoTotales=new MantenimientoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
				if(mantenimientoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					mantenimientoactivofijoTotales=mantenimientoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MantenimientoActivoFijoConstantesFunciones.TotalizarValoresFilaMantenimientoActivoFijo(this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos(),mantenimientoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MantenimientoActivoFijo mantenimientoactivofijo:this.mantenimientoactivofijos) {
				if(mantenimientoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					mantenimientoactivofijoTotales=mantenimientoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MantenimientoActivoFijoConstantesFunciones.TotalizarValoresFilaMantenimientoActivoFijo(this.mantenimientoactivofijos,mantenimientoactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMantenimientoActivoFijosFK_IdDetalleActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMantenimientoActivoFijosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMantenimientoActivoFijosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMantenimientoActivoFijosFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMantenimientoActivoFijosFK_IdDetalleActivoFijo(String sFinalQuery,Long id_detalle_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdDetalleActivoFijo(sFinalQuery,this.pagination,id_detalle_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMantenimientoActivoFijosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMantenimientoActivoFijosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMantenimientoActivoFijosFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mantenimientoactivofijoLogic.getMantenimientoActivoFijosFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
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
	
	public void inicializarPermisosMantenimientoActivoFijo() {
		this.isPermisoTodoMantenimientoActivoFijo=false;
		this.isPermisoNuevoMantenimientoActivoFijo=false;
		this.isPermisoActualizarMantenimientoActivoFijo=false;
		this.isPermisoActualizarOriginalMantenimientoActivoFijo=false;
		this.isPermisoEliminarMantenimientoActivoFijo=false;
		this.isPermisoGuardarCambiosMantenimientoActivoFijo=false;
		this.isPermisoConsultaMantenimientoActivoFijo=false;
		this.isPermisoBusquedaMantenimientoActivoFijo=false;
		this.isPermisoReporteMantenimientoActivoFijo=false;		
		this.isPermisoOrdenMantenimientoActivoFijo=false;		
		this.isPermisoPaginacionMedioMantenimientoActivoFijo=false;		
		this.isPermisoPaginacionAltoMantenimientoActivoFijo=false;
		this.isPermisoPaginacionTodoMantenimientoActivoFijo=false;
		this.isPermisoCopiarMantenimientoActivoFijo=false;		
		this.isPermisoVerFormMantenimientoActivoFijo=false;		
		this.isPermisoDuplicarMantenimientoActivoFijo=false;		
		this.isPermisoOrdenMantenimientoActivoFijo=false;		
	}
	
	public void setPermisosUsuarioMantenimientoActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoMantenimientoActivoFijo=isPermiso;
		this.isPermisoNuevoMantenimientoActivoFijo=isPermiso;
		this.isPermisoActualizarMantenimientoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalMantenimientoActivoFijo=isPermiso;
		this.isPermisoEliminarMantenimientoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosMantenimientoActivoFijo=isPermiso;
		this.isPermisoConsultaMantenimientoActivoFijo=isPermiso;
		this.isPermisoBusquedaMantenimientoActivoFijo=isPermiso;
		this.isPermisoReporteMantenimientoActivoFijo=isPermiso;
		this.isPermisoOrdenMantenimientoActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioMantenimientoActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoMantenimientoActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoMantenimientoActivoFijo=isPermiso;		
		this.isPermisoCopiarMantenimientoActivoFijo=isPermiso;		
		this.isPermisoVerFormMantenimientoActivoFijo=isPermiso;		
		this.isPermisoDuplicarMantenimientoActivoFijo=isPermiso;
		this.isPermisoOrdenMantenimientoActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMantenimientoActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoMantenimientoActivoFijo=isPermiso;
		this.isPermisoNuevoMantenimientoActivoFijo=isPermiso;
		this.isPermisoActualizarMantenimientoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalMantenimientoActivoFijo=isPermiso;
		this.isPermisoEliminarMantenimientoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosMantenimientoActivoFijo=isPermiso;
		//this.isPermisoConsultaMantenimientoActivoFijo=isPermiso;
		//this.isPermisoBusquedaMantenimientoActivoFijo=isPermiso;
		//this.isPermisoReporteMantenimientoActivoFijo=isPermiso;
		//this.isPermisoOrdenMantenimientoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioMantenimientoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoMantenimientoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoMantenimientoActivoFijo=isPermiso;		
		//this.isPermisoCopiarMantenimientoActivoFijo=isPermiso;		
		//this.isPermisoDuplicarMantenimientoActivoFijo=isPermiso;
		//this.isPermisoOrdenMantenimientoActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMantenimientoActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(MantenimientoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebMantenimientoActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMantenimientoActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioMantenimientoActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMantenimientoActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMantenimientoActivoFijoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioMantenimientoActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MantenimientoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MantenimientoActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMantenimientoActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMantenimientoActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMantenimientoActivoFijo=this.isPermisoActualizarMantenimientoActivoFijo;
			this.isPermisoEliminarMantenimientoActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMantenimientoActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMantenimientoActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMantenimientoActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMantenimientoActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMantenimientoActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMantenimientoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMantenimientoActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMantenimientoActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMantenimientoActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMantenimientoActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMantenimientoActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMantenimientoActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMantenimientoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMantenimientoActivoFijo.setToolTipText(this.jTableDatosMantenimientoActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMantenimientoActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMantenimientoActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MantenimientoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MantenimientoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMantenimientoActivoFijo() throws Exception {
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
	public void inicializarCombosForeignKeyMantenimientoActivoFijoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.detalleactivofijosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMantenimientoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MantenimientoActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyMantenimientoActivoFijoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyDetalleActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMovimientoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMovimientoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyMantenimientoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			MantenimientoActivoFijoParameterReturnGeneral mantenimientoactivofijoReturnGeneral=new MantenimientoActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.mantenimientoactivofijoConstantesFunciones.cargarid_empresaMantenimientoActivoFijo)
					 || (this.esRecargarFks && this.mantenimientoactivofijoConstantesFunciones.cargarid_empresaMantenimientoActivoFijo)) {

					if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+mantenimientoactivofijoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.mantenimientoactivofijoConstantesFunciones.cargarid_sucursalMantenimientoActivoFijo)
					 || (this.esRecargarFks && this.mantenimientoactivofijoConstantesFunciones.cargarid_sucursalMantenimientoActivoFijo)) {

					if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+mantenimientoactivofijoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalDetalleActivoFijo="";

				if(((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0) && this.mantenimientoactivofijoConstantesFunciones.cargarid_detalle_activo_fijoMantenimientoActivoFijo)
					 || (this.esRecargarFks && this.mantenimientoactivofijoConstantesFunciones.cargarid_detalle_activo_fijoMantenimientoActivoFijo)) {

					if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleActivoFijo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleActivoFijo=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleActivoFijo, "");
						finalQueryGlobalDetalleActivoFijo+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleActivoFijo=" WHERE " + ConstantesSql.ID + "="+mantenimientoactivofijoSessionBean.getlidDetalleActivoFijoActual();
					}
				} else {
					finalQueryGlobalDetalleActivoFijo="NONE";
				}


				String finalQueryGlobalTipoMovimiento="";

				if(((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0) && this.mantenimientoactivofijoConstantesFunciones.cargarid_tipo_movimientoMantenimientoActivoFijo)
					 || (this.esRecargarFks && this.mantenimientoactivofijoConstantesFunciones.cargarid_tipo_movimientoMantenimientoActivoFijo)) {

					if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMovimiento=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMovimiento=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMovimiento, "");
						finalQueryGlobalTipoMovimiento+=TipoMovimientoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMovimiento=" WHERE " + ConstantesSql.ID + "="+mantenimientoactivofijoSessionBean.getlidTipoMovimientoActual();
					}
				} else {
					finalQueryGlobalTipoMovimiento="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				mantenimientoactivofijoReturnGeneral=mantenimientoactivofijoLogic.cargarCombosLoteForeignKeyMantenimientoActivoFijo(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalDetalleActivoFijo,finalQueryGlobalTipoMovimiento);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=mantenimientoactivofijoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=mantenimientoactivofijoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalDetalleActivoFijo.equals("NONE")) {
				this.detalleactivofijosForeignKey=mantenimientoactivofijoReturnGeneral.getdetalleactivofijosForeignKey();
			}

			if(!finalQueryGlobalTipoMovimiento.equals("NONE")) {
				this.tipomovimientosForeignKey=mantenimientoactivofijoReturnGeneral.gettipomovimientosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyMantenimientoActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.mantenimientoactivofijoSessionBean==null) {
				this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
			}

			if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyDetalleActivoFijo()throws Exception {
		try {

			if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				DetalleActivoFijo detalleactivofijo=new DetalleActivoFijo();
				DetalleActivoFijoConstantesFunciones.setDetalleActivoFijoDescripcion(detalleactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				detalleactivofijo.setId(null);

				if(!DetalleActivoFijoConstantesFunciones.ExisteEnLista(this.detalleactivofijosForeignKey,detalleactivofijo,true)) {

					this.detalleactivofijosForeignKey.add(0,detalleactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.mantenimientoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
				TipoMovimiento tipomovimiento=new TipoMovimiento();
				TipoMovimientoConstantesFunciones.setTipoMovimientoDescripcion(tipomovimiento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomovimiento.setId(null);

				if(!TipoMovimientoConstantesFunciones.ExisteEnLista(this.tipomovimientosForeignKey,tipomovimiento,true)) {

					this.tipomovimientosForeignKey.add(0,tipomovimiento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyMantenimientoActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMantenimientoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMantenimientoActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.mantenimientoactivofijo.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.mantenimientoactivofijo.setfecha_entrega(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMantenimientoActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo)throws Exception {	
		try {
			
			this.setActualDetalleActivoFijoForeignKey(mantenimientoactivofijo.getid_detalle_activo_fijo(),false,"Formulario");
			this.setActualTipoMovimientoForeignKey(mantenimientoactivofijo.getid_tipo_movimiento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMantenimientoActivoFijo()throws Exception {	
		try {
			
			this.setActualDetalleActivoFijoForeignKey(this.mantenimientoactivofijoConstantesFunciones.getid_detalle_activo_fijo(),false,"Formulario");
			this.setActualTipoMovimientoForeignKey(this.mantenimientoactivofijoConstantesFunciones.getid_tipo_movimiento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMantenimientoActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMantenimientoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMantenimientoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMantenimientoActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMantenimientoActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMantenimientoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMantenimientoActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public MantenimientoActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MantenimientoActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MantenimientoActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean(); 
		this.mantenimientoactivofijoConstantesFunciones=new MantenimientoActivoFijoConstantesFunciones(); 
		this.mantenimientoactivofijoBean=new MantenimientoActivoFijo();//(this.mantenimientoactivofijoConstantesFunciones); 		
		this.mantenimientoactivofijoReturnGeneral=new MantenimientoActivoFijoParameterReturnGeneral(); 
		
		this.mantenimientoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mantenimientoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MantenimientoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MantenimientoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MantenimientoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMantenimientoActivoFijo(true);
			
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
			
			this.mantenimientoactivofijoConstantesFunciones=new MantenimientoActivoFijoConstantesFunciones(); 
			this.mantenimientoactivofijoBean=new MantenimientoActivoFijo();//this.mantenimientoactivofijoConstantesFunciones); 			
			this.mantenimientoactivofijoReturnGeneral=new MantenimientoActivoFijoParameterReturnGeneral(); 
		
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mantenimiento Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.mantenimientoactivofijo=new MantenimientoActivoFijo();
			this.mantenimientoactivofijos = new ArrayList<MantenimientoActivoFijo>();
			this.mantenimientoactivofijosAux = new ArrayList<MantenimientoActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic=new MantenimientoActivoFijoLogic();
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.mantenimientoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.mantenimientoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMantenimientoActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMantenimientoActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionMantenimientoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMantenimientoActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMantenimientoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMantenimientoActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMantenimientoActivoFijo);
				this.jInternalFrameDetalleFormMantenimientoActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormMantenimientoActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo);
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMantenimientoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMantenimientoActivoFijo);
					this.jInternalFrameImportacionMantenimientoActivoFijo.setVisible(false);
					this.jInternalFrameImportacionMantenimientoActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMantenimientoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMantenimientoActivoFijo);
					this.jInternalFrameOrderByMantenimientoActivoFijo.setVisible(false);
					this.jInternalFrameOrderByMantenimientoActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMantenimientoActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MantenimientoActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.mantenimientoactivofijoReturnGeneral=new MantenimientoActivoFijoParameterReturnGeneral();
			
			this.mantenimientoactivofijoParameterGeneral=new MantenimientoActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.mantenimientoactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MantenimientoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MantenimientoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado(),this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MantenimientoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado(),this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaCopiarMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaVerFormMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaOrdenMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaModificarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaCancelarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=false;
			
			
			this.isVisibilidadFK_IdDetalleActivoFijo=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMantenimientoActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMantenimientoActivoFijo(false);
			
			this.setPermisosUsuarioMantenimientoActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado() && this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMantenimientoActivoFijoClasesRelacionadas();
			}
			
			if(this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMantenimientoActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMantenimientoActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMantenimientoActivoFijo();
			}
			
			if(!this.isPermisoBusquedaMantenimientoActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioMantenimientoActivoFijo,this.isPermisoPaginacionMedioMantenimientoActivoFijo,this.isPermisoPaginacionTodoMantenimientoActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MantenimientoActivoFijoConstantesFunciones.getTiposSeleccionarMantenimientoActivoFijo());
				
				this.tiposColumnasSelect=MantenimientoActivoFijoConstantesFunciones.getTiposSeleccionarMantenimientoActivoFijo(true);
				
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
			//if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMantenimientoActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioMantenimientoActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioMantenimientoActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMantenimientoActivoFijo() ;
			
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
			this.detalleactivofijoLogic=new DetalleActivoFijoLogic();
			this.tipomovimientoLogic=new TipoMovimientoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				mantenimientoactivofijoImplementable= (MantenimientoActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MantenimientoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				mantenimientoactivofijoImplementableHome= (MantenimientoActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MantenimientoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.mantenimientoactivofijos= new ArrayList<MantenimientoActivoFijo>();
			this.mantenimientoactivofijosEliminados= new ArrayList<MantenimientoActivoFijo>();
						
			this.isEsNuevoMantenimientoActivoFijo=false;
			this.esParaAccionDesdeFormularioMantenimientoActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMantenimientoActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMantenimientoActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MantenimientoActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMantenimientoActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMantenimientoActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMantenimientoActivoFijo();
			}
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMantenimientoActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMantenimientoActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMantenimientoActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMantenimientoActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga MantenimientoActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMantenimientoActivoFijo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMantenimientoActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTabbedPaneRelacionesMantenimientoActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTabbedPaneRelacionesMantenimientoActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMantenimientoActivoFijo();	
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
	
	public void cargarCombosForeignKeyMantenimientoActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMantenimientoActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMantenimientoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMantenimientoActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMantenimientoActivoFijo();
		
		this.cargarCombosFrameForeignKeyMantenimientoActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMantenimientoActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMantenimientoActivoFijo();
		}
	}
	
	

	public void cargarCombosForeignKeyDetalleActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleActivoFijo(this.detalleactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMovimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMovimiento(this.tipomovimientosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoMantenimientoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
			
			if(jTableDatosMantenimientoActivoFijo.getRowCount()>=1) {
				jTableDatosMantenimientoActivoFijo.removeRowSelectionInterval(0, jTableDatosMantenimientoActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoMantenimientoActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMantenimientoActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMantenimientoActivoFijo(true);			
			//this.mantenimientoactivofijo=new MantenimientoActivoFijo();
			//this.mantenimientoactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMantenimientoActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMantenimientoActivoFijo() ;
			
			if(MantenimientoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMantenimientoActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.mantenimientoactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);				
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
			if(this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar MantenimientoActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMantenimientoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMantenimientoActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMantenimientoActivoFijo.getSelectedRows().length;			
			}
			
			mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMantenimientoActivoFijo--;			
				//MantenimientoActivoFijo mantenimientoactivofijoAux= new MantenimientoActivoFijo();			
				//mantenimientoactivofijoAux.setId(this.iIdNuevoMantenimientoActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//MantenimientoActivoFijo mantenimientoactivofijoOrigen=new MantenimientoActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(MantenimientoActivoFijo mantenimientoactivofijoOrigen : mantenimientoactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							mantenimientoactivofijoOrigen =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoactivofijoOrigen =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMantenimientoActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.mantenimientoactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMantenimientoActivoFijo(mantenimientoactivofijoOrigen,this.mantenimientoactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().add(this.mantenimientoactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijos.add(this.mantenimientoactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
				
				this.jTableDatosMantenimientoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoMantenimientoActivoFijo(), this.getIndiceNuevoMantenimientoActivoFijo());
				
				int iLastRow =  this.jTableDatosMantenimientoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMantenimientoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMantenimientoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();									
		
			MantenimientoActivoFijo mantenimientoactivofijoOrigen=new MantenimientoActivoFijo();
			MantenimientoActivoFijo mantenimientoactivofijoDestino=new MantenimientoActivoFijo();
				
			mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMantenimientoActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || mantenimientoactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMantenimientoActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijoOrigen =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mantenimientoactivofijoOrigen =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoactivofijoDestino =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mantenimientoactivofijoDestino =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				mantenimientoactivofijoOrigen =mantenimientoactivofijosSeleccionados.get(0);
				mantenimientoactivofijoDestino =mantenimientoactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMantenimientoActivoFijo(mantenimientoactivofijoOrigen,mantenimientoactivofijoDestino,true,false);
				
				mantenimientoactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mantenimientoactivofijoDestino,mantenimientoactivofijoLogic.getMantenimientoActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mantenimientoactivofijoDestino,mantenimientoactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
				
				//this.jTableDatosMantenimientoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoMantenimientoActivoFijo(), this.getIndiceNuevoMantenimientoActivoFijo());
				
				int iLastRow =  this.jTableDatosMantenimientoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMantenimientoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMantenimientoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMantenimientoActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMantenimientoActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMantenimientoActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionMantenimientoActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesMantenimientoActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMantenimientoActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMantenimientoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMantenimientoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMantenimientoActivoFijo();
			
			this.abrirFrameOrderByMantenimientoActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMantenimientoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMantenimientoActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMantenimientoActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMantenimientoActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormMantenimientoActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMantenimientoActivoFijo.setSize(this.jInternalFrameDetalleFormMantenimientoActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormMantenimientoActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMantenimientoActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMantenimientoActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMantenimientoActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormMantenimientoActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jContentPaneDetalleMantenimientoActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTabbedPaneRelacionesMantenimientoActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jContentPaneDetalleMantenimientoActivoFijo.getWidth(),MantenimientoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTabbedPaneRelacionesMantenimientoActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jContentPaneDetalleMantenimientoActivoFijo.getWidth(),MantenimientoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTabbedPaneRelacionesMantenimientoActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jContentPaneDetalleMantenimientoActivoFijo.getWidth(),MantenimientoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMantenimientoActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormMantenimientoActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMantenimientoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMantenimientoActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMantenimientoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMantenimientoActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByMantenimientoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMantenimientoActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMantenimientoActivoFijo);
				this.jInternalFrameOrderByMantenimientoActivoFijo.setVisible(false);
				this.jInternalFrameOrderByMantenimientoActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByMantenimientoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMantenimientoActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByMantenimientoActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMantenimientoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMantenimientoActivoFijo==null) {
				
				this.jInternalFrameImportacionMantenimientoActivoFijo=new ImportacionJInternalFrame(MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMantenimientoActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMantenimientoActivoFijo);
				this.jInternalFrameImportacionMantenimientoActivoFijo.setVisible(false);
				this.jInternalFrameImportacionMantenimientoActivoFijo.setSelected(false);


				this.jInternalFrameImportacionMantenimientoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMantenimientoActivoFijo"));
				this.jInternalFrameImportacionMantenimientoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMantenimientoActivoFijo"));
				this.jInternalFrameImportacionMantenimientoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMantenimientoActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMantenimientoActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo==null) {
				this.jInternalFrameReporteDinamicoMantenimientoActivoFijo=new ReporteDinamicoJInternalFrame(MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMantenimientoActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo);
				this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMantenimientoActivoFijo"));
				this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMantenimientoActivoFijo"));
				this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMantenimientoActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMantenimientoActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleMantenimientoActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMantenimientoActivoFijo);
			
	       	this.jInternalFrameDetalleFormMantenimientoActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormMantenimientoActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormMantenimientoActivoFijo.dispose();
			//this.jInternalFrameDetalleFormMantenimientoActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMantenimientoActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMantenimientoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMantenimientoActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionMantenimientoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMantenimientoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMantenimientoActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByMantenimientoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMantenimientoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMantenimientoActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByMantenimientoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMantenimientoActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMantenimientoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMantenimientoActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionMantenimientoActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMantenimientoActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMantenimientoActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMantenimientoActivoFijo(true);
			//this.isEsNuevoMantenimientoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMantenimientoActivoFijo(false) ;
			
			if(mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(MantenimientoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMantenimientoActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMantenimientoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMantenimientoActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMantenimientoActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMantenimientoActivoFijo(true);
			//this.isEsNuevoMantenimientoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.mantenimientoactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMantenimientoActivoFijo(false) ;
			
			if(MantenimientoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMantenimientoActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMantenimientoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaDetalleActivoFijo(List<DetalleActivoFijo> detalleactivofijosForeignKey)throws Exception{
		TableColumn tableColumnDetalleActivoFijo=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));
		TableCellEditor tableCellEditorDetalleActivoFijo =tableColumnDetalleActivoFijo.getCellEditor();

		DetalleActivoFijoTableCell detalleactivofijoTableCellFk=(DetalleActivoFijoTableCell)tableCellEditorDetalleActivoFijo;

		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.setdetalleactivofijosForeignKey(detalleactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detalleactivofijoTableCellFk.setRowActual(intSelectedRow);
			//detalleactivofijoTableCellFk.setdetalleactivofijosForeignKeyActual(detalleactivofijosForeignKey);
		//}


		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.RecargarDetalleActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMantenimientoActivoFijo(false);
			
			//if(!this.isEsNuevoMantenimientoActivoFijo) {								
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.mantenimientoactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMantenimientoActivoFijo=true;
					this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
					this.isEsNuevoMantenimientoActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMantenimientoActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMantenimientoActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMantenimientoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMantenimientoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesMantenimientoActivoFijo(false);
			
												
				
				if(MantenimientoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMantenimientoActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,mantenimientoactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMantenimientoActivoFijo(this.mantenimientoactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMantenimientoActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,mantenimientoactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.mantenimientoactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(MantenimientoActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.mantenimientoactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.mantenimientoactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.mantenimientoactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MantenimientoActivoFijoModel) this.jTableDatosMantenimientoActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMantenimientoActivoFijo=true;
				this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
				this.isEsNuevoMantenimientoActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMantenimientoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMantenimientoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesMantenimientoActivoFijo(false);
				
				
				
				if(MantenimientoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMantenimientoActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMantenimientoActivoFijo.getRowCount()>=1) {
				jTableDatosMantenimientoActivoFijo.removeRowSelectionInterval(0, jTableDatosMantenimientoActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMantenimientoActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMantenimientoActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMantenimientoActivoFijo(false) ;
			
			this.isEsNuevoMantenimientoActivoFijo=false;
			
			if(MantenimientoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMantenimientoActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				
				//SI ES MANUAL
				if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMantenimientoActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMantenimientoActivoFijo--;			
			//MantenimientoActivoFijo mantenimientoactivofijoAux= new MantenimientoActivoFijo();			
			//mantenimientoactivofijoAux.setId(this.iIdNuevoMantenimientoActivoFijo);
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMantenimientoActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
			
			this.mantenimientoactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().add(this.mantenimientoactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.mantenimientoactivofijos.add(this.mantenimientoactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
			
			this.jTableDatosMantenimientoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoMantenimientoActivoFijo(), this.getIndiceNuevoMantenimientoActivoFijo());
			
			int iLastRow =  this.jTableDatosMantenimientoActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMantenimientoActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMantenimientoActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMantenimientoActivoFijo(false);
			
			//SI ES MANUAL
			if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMantenimientoActivoFijo();
			}
			
			//this.abrirFrameTreeMantenimientoActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Mantenimiento Activo FijoS ?", "MANTENIMIENTO DE Mantenimiento Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionMantenimientoActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralMantenimientoActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.mantenimientoactivofijoReturnGeneral=mantenimientoactivofijoLogic.procesarImportacionMantenimientoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.mantenimientoactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarMantenimientoActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMantenimientoActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMantenimientoActivoFijo.setFileImportacion(this.jInternalFrameImportacionMantenimientoActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMantenimientoActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMantenimientoActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMantenimientoActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMantenimientoActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();		

		mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MantenimientoActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MantenimientoActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteMantenimientoActivoFijos("Todos",mantenimientoactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimiento Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleActivoFijo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_usa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_usa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_usa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_usa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ferencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ferencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ferencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ferencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ller_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ller_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ller_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ller_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEntrega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEntrega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEntrega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEntrega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sponsable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sponsable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sponsable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sponsable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoria="id_detalle_activo_fijo";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoria="id_tipo_movimiento";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoria="numero_documento";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA:
					sNombreCampoCategoria="causa";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA:
					sNombreCampoCategoria="referencia";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER:
					sNombreCampoCategoria="taller";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoria="fecha_entrega";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE:
					sNombreCampoCategoria="responsable";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoriaValor="id_detalle_activo_fijo";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="id_tipo_movimiento";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoriaValor="numero_documento";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA:
					sNombreCampoCategoriaValor="causa";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA:
					sNombreCampoCategoriaValor="referencia";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER:
					sNombreCampoCategoriaValor="taller";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoriaValor="fecha_entrega";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE:
					sNombreCampoCategoriaValor="responsable";
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_activo_fijo");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_movimiento");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_documento");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Causa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"causa");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Referencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"referencia");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Taller",sNombreCampoCategoria,sNombreCampoCategoriaValor,"taller");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Entrega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_entrega");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Responsable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"responsable");
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();		
		
		mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("MantenimientoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.getdetalleactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.getnumero_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.getcausa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.getreferencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.gettaller());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.getfecha_entrega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.getresponsable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(MantenimientoActivoFijo mantenimientoactivofijo:mantenimientoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoactivofijo.getobservacion());
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
			//	this.getFilaCabeceraExportarExcelMantenimientoActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMantenimientoActivoFijo(mantenimientoactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimiento Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMantenimientoActivoFijo(false);
			
			//SI ES MANUAL
			if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMantenimientoActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMantenimientoActivoFijo(false);
			
			//SI ES MANUAL
			if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMantenimientoActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMantenimientoActivoFijo(false);
			
			//SI ES MANUAL
			if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMantenimientoActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMantenimientoActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMantenimientoActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMantenimientoActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMantenimientoActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMantenimientoActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMantenimientoActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosMantenimientoActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosMantenimientoActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMantenimientoActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMantenimientoActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMantenimientoActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMantenimientoActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMantenimientoActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMantenimientoActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMantenimientoActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMantenimientoActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMantenimientoActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMantenimientoActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualMantenimientoActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMantenimientoActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMantenimientoActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMantenimientoActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMantenimientoActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMantenimientoActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMantenimientoActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jCheckBoxPostAccionNuevoMantenimientoActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jCheckBoxPostAccionSinCerrarMantenimientoActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jCheckBoxPostAccionSinMensajeMantenimientoActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMantenimientoActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMantenimientoActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
				this.jInternalFrameDetalleFormMantenimientoActivoFijo.jCheckBoxPostAccionNuevoMantenimientoActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMantenimientoActivoFijo.jCheckBoxPostAccionSinCerrarMantenimientoActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMantenimientoActivoFijo.jCheckBoxPostAccionSinMensajeMantenimientoActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMantenimientoActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMantenimientoActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMantenimientoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMantenimientoActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMantenimientoActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMantenimientoActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMantenimientoActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMantenimientoActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMantenimientoActivoFijo() throws Exception {
		try	{
			if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMantenimientoActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMantenimientoActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMantenimientoActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMantenimientoActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMantenimientoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMantenimientoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMantenimientoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMantenimientoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMantenimientoActivoFijo.addItem(reporte);
			}
			
			
			if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMantenimientoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMantenimientoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMantenimientoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMantenimientoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMantenimientoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMantenimientoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMantenimientoActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMantenimientoActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=MantenimientoActivoFijoConstantesFunciones.getTiposSeleccionarMantenimientoActivoFijo(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=MantenimientoActivoFijoConstantesFunciones.getTiposSeleccionarMantenimientoActivoFijo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=MantenimientoActivoFijoConstantesFunciones.getTiposSeleccionarMantenimientoActivoFijo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMantenimientoActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.getSelectedItem()!=null){this.id_detalle_activo_fijoFK_IdDetalleActivoFijo=((DetalleActivoFijo)this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMantenimientoActivoFijo.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.getSelectedItem()!=null){this.id_tipo_movimientoFK_IdTipoMovimiento=((TipoMovimiento)this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoMantenimientoActivoFijo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMantenimientoActivoFijo(Boolean esInicializar) throws Exception {				
		if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMantenimientoActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMantenimientoActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMantenimientoActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMantenimientoActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMantenimientoActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=mantenimientoactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMantenimientoActivoFijo.setModel(new MantenimientoActivoFijoModel(this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMantenimientoActivoFijo.setModel(new MantenimientoActivoFijoModel(this.mantenimientoactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMantenimientoActivoFijo!=null && this.jInternalFrameOrderByMantenimientoActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMantenimientoActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO,mantenimientoactivofijoConstantesFunciones.resaltarSeleccionarMantenimientoActivoFijo,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MantenimientoActivoFijoConstantesFunciones.SCLASSWEBTITULO,mantenimientoactivofijoConstantesFunciones.resaltarSeleccionarMantenimientoActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_ID));

		if(this.mantenimientoactivofijoConstantesFunciones.mostraridMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltaridMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activaridMantenimientoActivoFijo,iSizeTabla,this,true,"idMantenimientoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltaridMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activaridMantenimientoActivoFijo,this,true,"idMantenimientoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarid_empresaMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.mantenimientoactivofijoConstantesFunciones.resaltarid_empresaMantenimientoActivoFijo,this,this.mantenimientoactivofijoConstantesFunciones.activarid_empresaMantenimientoActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.mantenimientoactivofijoConstantesFunciones.resaltarid_empresaMantenimientoActivoFijo,this,this.mantenimientoactivofijoConstantesFunciones.activarid_empresaMantenimientoActivoFijo,false,"id_empresaMantenimientoActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarid_sucursalMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.mantenimientoactivofijoConstantesFunciones.resaltarid_sucursalMantenimientoActivoFijo,this,this.mantenimientoactivofijoConstantesFunciones.activarid_sucursalMantenimientoActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.mantenimientoactivofijoConstantesFunciones.resaltarid_sucursalMantenimientoActivoFijo,this,this.mantenimientoactivofijoConstantesFunciones.activarid_sucursalMantenimientoActivoFijo,false,"id_sucursalMantenimientoActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.mantenimientoactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoMantenimientoActivoFijo,this,this.mantenimientoactivofijoConstantesFunciones.activarid_detalle_activo_fijoMantenimientoActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.mantenimientoactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoMantenimientoActivoFijo,this,this.mantenimientoactivofijoConstantesFunciones.activarid_detalle_activo_fijoMantenimientoActivoFijo,true,"id_detalle_activo_fijoMantenimientoActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarid_tipo_movimientoMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.mantenimientoactivofijoConstantesFunciones.resaltarid_tipo_movimientoMantenimientoActivoFijo,this,this.mantenimientoactivofijoConstantesFunciones.activarid_tipo_movimientoMantenimientoActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.mantenimientoactivofijoConstantesFunciones.resaltarid_tipo_movimientoMantenimientoActivoFijo,this,this.mantenimientoactivofijoConstantesFunciones.activarid_tipo_movimientoMantenimientoActivoFijo,true,"id_tipo_movimientoMantenimientoActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarnumero_documentoMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarnumero_documentoMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarnumero_documentoMantenimientoActivoFijo,iSizeTabla,this,true,"numero_documentoMantenimientoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarnumero_documentoMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarnumero_documentoMantenimientoActivoFijo,this,true,"numero_documentoMantenimientoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarcausaMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarcausaMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarcausaMantenimientoActivoFijo,iSizeTabla,this,true,"causaMantenimientoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarcausaMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarcausaMantenimientoActivoFijo,this,true,"causaMantenimientoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarreferenciaMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarreferenciaMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarreferenciaMantenimientoActivoFijo,iSizeTabla,this,true,"referenciaMantenimientoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarreferenciaMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarreferenciaMantenimientoActivoFijo,this,true,"referenciaMantenimientoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrartallerMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltartallerMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activartallerMantenimientoActivoFijo,iSizeTabla,this,true,"tallerMantenimientoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltartallerMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activartallerMantenimientoActivoFijo,this,true,"tallerMantenimientoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrartelefonoMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltartelefonoMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activartelefonoMantenimientoActivoFijo,iSizeTabla,this,true,"telefonoMantenimientoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltartelefonoMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activartelefonoMantenimientoActivoFijo,this,true,"telefonoMantenimientoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarfecha_inicioMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarfecha_inicioMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarfecha_inicioMantenimientoActivoFijo,iSizeTabla,this,true,"fecha_inicioMantenimientoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarfecha_inicioMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarfecha_inicioMantenimientoActivoFijo,this,true,"fecha_inicioMantenimientoActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarfecha_entregaMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarfecha_entregaMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarfecha_entregaMantenimientoActivoFijo,iSizeTabla,this,true,"fecha_entregaMantenimientoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarfecha_entregaMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarfecha_entregaMantenimientoActivoFijo,this,true,"fecha_entregaMantenimientoActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarcostoMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarcostoMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarcostoMantenimientoActivoFijo,iSizeTabla,this,true,"costoMantenimientoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarcostoMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarcostoMantenimientoActivoFijo,this,true,"costoMantenimientoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarresponsableMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarresponsableMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarresponsableMantenimientoActivoFijo,iSizeTabla,this,true,"responsableMantenimientoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarresponsableMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarresponsableMantenimientoActivoFijo,this,true,"responsableMantenimientoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION));

		if(this.mantenimientoactivofijoConstantesFunciones.mostrarobservacionMantenimientoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarobservacionMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarobservacionMantenimientoActivoFijo,iSizeTabla,this,true,"observacionMantenimientoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoactivofijoConstantesFunciones.resaltarobservacionMantenimientoActivoFijo,this.mantenimientoactivofijoConstantesFunciones.activarobservacionMantenimientoActivoFijo,this,true,"observacionMantenimientoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMantenimientoActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMantenimientoActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMantenimientoActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosMantenimientoActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMantenimientoActivoFijo.moveColumn(this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMantenimientoActivoFijo.moveColumn(this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMantenimientoActivoFijo.moveColumn(this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMantenimientoActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMantenimientoActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMantenimientoActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMantenimientoActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMantenimientoActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMantenimientoActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=mantenimientoactivofijoLogic.getMantenimientoActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=mantenimientoactivofijos.size()-1;
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
		//this.jTableDatosMantenimientoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMantenimientoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMantenimientoActivoFijo();
			
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
				
				//this.isEsNuevoMantenimientoActivoFijo=false;
					
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
				if(this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMantenimientoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMantenimientoActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.mantenimientoactivofijo.getsType().equals("DUPLICADO")
				   || this.mantenimientoactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMantenimientoActivoFijo=true;
				
				} else {
					this.isEsNuevoMantenimientoActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.mantenimientoactivofijo.getId()>=0 && !this.mantenimientoactivofijo.getIsNew()) {						
						this.isEsNuevoMantenimientoActivoFijo=false;
						
					} else {
						this.isEsNuevoMantenimientoActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMantenimientoActivoFijo(esRelaciones);						
				
				this.seleccionarMantenimientoActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.mantenimientoactivofijo.getId()<0) {
					this.isEsNuevoMantenimientoActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMantenimientoActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMantenimientoActivoFijo(evt,rowIndex);
				}	
				
				if(this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion MantenimientoActivoFijo: " + this.dDif); 
					}
				}								
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMantenimientoActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.mantenimientoactivofijo)) {
					if(this.mantenimientoactivofijo.getId()>0) {
						this.mantenimientoactivofijo.setIsDeleted(true);
						
						this.mantenimientoactivofijosEliminados.add(this.mantenimientoactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().remove(this.mantenimientoactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijos.remove(this.mantenimientoactivofijo);				
					}
					
					
					((MantenimientoActivoFijoModel) this.jTableDatosMantenimientoActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMantenimientoActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMantenimientoActivoFijo) {
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMantenimientoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMantenimientoActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.mantenimientoactivofijoConstantesFunciones.cargarid_empresaMantenimientoActivoFijo || this.mantenimientoactivofijoConstantesFunciones.event_dependid_empresaMantenimientoActivoFijo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.mantenimientoactivofijo.getid_empresa());
									//this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(mantenimientoactivofijo.getEmpresa()!=null) {
							this.empresasForeignKey.add(mantenimientoactivofijo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.mantenimientoactivofijo.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.mantenimientoactivofijoConstantesFunciones.cargarid_sucursalMantenimientoActivoFijo || this.mantenimientoactivofijoConstantesFunciones.event_dependid_sucursalMantenimientoActivoFijo) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.mantenimientoactivofijo.getid_sucursal());
									//this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(mantenimientoactivofijo.getSucursal()!=null) {
							this.sucursalsForeignKey.add(mantenimientoactivofijo.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.mantenimientoactivofijo.getid_sucursal(),false,"Formulario");

					//DetalleActivoFijo
					if(!this.mantenimientoactivofijoConstantesFunciones.cargarid_detalle_activo_fijoMantenimientoActivoFijo || this.mantenimientoactivofijoConstantesFunciones.event_dependid_detalle_activo_fijoMantenimientoActivoFijo) {
						//this.cargarCombosDetalleActivoFijosForeignKeyLista(" where id="+this.mantenimientoactivofijo.getid_detalle_activo_fijo());
									//this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
						this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

						if(mantenimientoactivofijo.getDetalleActivoFijo()!=null) {
							this.detalleactivofijosForeignKey.add(mantenimientoactivofijo.getDetalleActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
						this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
					}
					this.setActualDetalleActivoFijoForeignKey(this.mantenimientoactivofijo.getid_detalle_activo_fijo(),false,"Formulario");

					//TipoMovimiento
					if(!this.mantenimientoactivofijoConstantesFunciones.cargarid_tipo_movimientoMantenimientoActivoFijo || this.mantenimientoactivofijoConstantesFunciones.event_dependid_tipo_movimientoMantenimientoActivoFijo) {
						//this.cargarCombosTipoMovimientosForeignKeyLista(" where id="+this.mantenimientoactivofijo.getid_tipo_movimiento());
									//this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
						this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

						if(mantenimientoactivofijo.getTipoMovimiento()!=null) {
							this.tipomovimientosForeignKey.add(mantenimientoactivofijo.getTipoMovimiento());
						}

						this.addItemDefectoCombosForeignKeyTipoMovimiento();
						this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
					}
					this.setActualTipoMovimientoForeignKey(this.mantenimientoactivofijo.getid_tipo_movimiento(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMantenimientoActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMantenimientoActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMantenimientoActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMantenimientoActivoFijo(mantenimientoactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMantenimientoActivoFijo(mantenimientoactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMantenimientoActivoFijo(mantenimientoactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMantenimientoActivoFijo(mantenimientoactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelidMantenimientoActivoFijo.setText(mantenimientoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldnumero_documentoMantenimientoActivoFijo.setText(mantenimientoactivofijo.getnumero_documento());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreacausaMantenimientoActivoFijo.setText(mantenimientoactivofijo.getcausa());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreareferenciaMantenimientoActivoFijo.setText(mantenimientoactivofijo.getreferencia());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatallerMantenimientoActivoFijo.setText(mantenimientoactivofijo.gettaller());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatelefonoMantenimientoActivoFijo.setText(mantenimientoactivofijo.gettelefono());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_inicioMantenimientoActivoFijo.setDate(mantenimientoactivofijo.getfecha_inicio());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_entregaMantenimientoActivoFijo.setDate(mantenimientoactivofijo.getfecha_entrega());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldcostoMantenimientoActivoFijo.setText(mantenimientoactivofijo.getcosto().toString());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextArearesponsableMantenimientoActivoFijo.setText(mantenimientoactivofijo.getresponsable());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreaobservacionMantenimientoActivoFijo.setText(mantenimientoactivofijo.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,MantenimientoActivoFijo mantenimientoactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,mantenimientoactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,MantenimientoActivoFijo mantenimientoactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				mantenimientoactivofijoLocal=this.mantenimientoactivofijo;
			} else {
				mantenimientoactivofijoLocal=this.mantenimientoactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(mantenimientoactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMantenimientoActivoFijo(mantenimientoactivofijoLocal,true);
					
					if(mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(mantenimientoactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(mantenimientoactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(mantenimientoactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(mantenimientoactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(mantenimientoactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelidMantenimientoActivoFijo.getText()==null || this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelidMantenimientoActivoFijo.getText()=="" || this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelidMantenimientoActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelidMantenimientoActivoFijo.setText("0");
			}

			if(conColumnasBase) {mantenimientoactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelidMantenimientoActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelIdMantenimientoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoactivofijo.setnumero_documento(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldnumero_documentoMantenimientoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelnumero_documentoMantenimientoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoactivofijo.setcausa(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreacausaMantenimientoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelcausaMantenimientoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoactivofijo.setreferencia(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreareferenciaMantenimientoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelreferenciaMantenimientoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoactivofijo.settaller(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatallerMantenimientoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabeltallerMantenimientoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoactivofijo.settelefono(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatelefonoMantenimientoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabeltelefonoMantenimientoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoactivofijo.setfecha_inicio(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_inicioMantenimientoActivoFijo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelfecha_inicioMantenimientoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoactivofijo.setfecha_entrega(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_entregaMantenimientoActivoFijo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelfecha_entregaMantenimientoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoactivofijo.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldcostoMantenimientoActivoFijo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelcostoMantenimientoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoactivofijo.setresponsable(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextArearesponsableMantenimientoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelresponsableMantenimientoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoactivofijo.setobservacion(this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreaobservacionMantenimientoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelobservacionMantenimientoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijoBean,MantenimientoActivoFijo mantenimientoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && mantenimientoactivofijoBean.getid_detalle_activo_fijo()!=null && !mantenimientoactivofijoBean.getid_detalle_activo_fijo().equals(-1L))) {mantenimientoactivofijo.setid_detalle_activo_fijo(mantenimientoactivofijoBean.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && mantenimientoactivofijoBean.getid_tipo_movimiento()!=null && !mantenimientoactivofijoBean.getid_tipo_movimiento().equals(-1L))) {mantenimientoactivofijo.setid_tipo_movimiento(mantenimientoactivofijoBean.getid_tipo_movimiento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijoOrigen,MantenimientoActivoFijo mantenimientoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.getId()!=null && !mantenimientoactivofijoOrigen.getId().equals(0L))) {mantenimientoactivofijo.setId(mantenimientoactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.getid_detalle_activo_fijo()!=null && !mantenimientoactivofijoOrigen.getid_detalle_activo_fijo().equals(-1L))) {mantenimientoactivofijo.setid_detalle_activo_fijo(mantenimientoactivofijoOrigen.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.getid_tipo_movimiento()!=null && !mantenimientoactivofijoOrigen.getid_tipo_movimiento().equals(-1L))) {mantenimientoactivofijo.setid_tipo_movimiento(mantenimientoactivofijoOrigen.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.getnumero_documento()!=null && !mantenimientoactivofijoOrigen.getnumero_documento().equals(""))) {mantenimientoactivofijo.setnumero_documento(mantenimientoactivofijoOrigen.getnumero_documento());}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.getcausa()!=null && !mantenimientoactivofijoOrigen.getcausa().equals(""))) {mantenimientoactivofijo.setcausa(mantenimientoactivofijoOrigen.getcausa());}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.getreferencia()!=null && !mantenimientoactivofijoOrigen.getreferencia().equals(""))) {mantenimientoactivofijo.setreferencia(mantenimientoactivofijoOrigen.getreferencia());}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.gettaller()!=null && !mantenimientoactivofijoOrigen.gettaller().equals(""))) {mantenimientoactivofijo.settaller(mantenimientoactivofijoOrigen.gettaller());}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.gettelefono()!=null && !mantenimientoactivofijoOrigen.gettelefono().equals(""))) {mantenimientoactivofijo.settelefono(mantenimientoactivofijoOrigen.gettelefono());}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.getfecha_inicio()!=null && !mantenimientoactivofijoOrigen.getfecha_inicio().equals(new Date()))) {mantenimientoactivofijo.setfecha_inicio(mantenimientoactivofijoOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.getfecha_entrega()!=null && !mantenimientoactivofijoOrigen.getfecha_entrega().equals(new Date()))) {mantenimientoactivofijo.setfecha_entrega(mantenimientoactivofijoOrigen.getfecha_entrega());}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.getcosto()!=null && !mantenimientoactivofijoOrigen.getcosto().equals(0.0))) {mantenimientoactivofijo.setcosto(mantenimientoactivofijoOrigen.getcosto());}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.getresponsable()!=null && !mantenimientoactivofijoOrigen.getresponsable().equals(""))) {mantenimientoactivofijo.setresponsable(mantenimientoactivofijoOrigen.getresponsable());}
			if(conDefault || (!conDefault && mantenimientoactivofijoOrigen.getobservacion()!=null && !mantenimientoactivofijoOrigen.getobservacion().equals(""))) {mantenimientoactivofijo.setobservacion(mantenimientoactivofijoOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelidMantenimientoActivoFijo.setText(mantenimientoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldnumero_documentoMantenimientoActivoFijo.setText(mantenimientoactivofijo.getnumero_documento());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreacausaMantenimientoActivoFijo.setText(mantenimientoactivofijo.getcausa());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreareferenciaMantenimientoActivoFijo.setText(mantenimientoactivofijo.getreferencia());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatallerMantenimientoActivoFijo.setText(mantenimientoactivofijo.gettaller());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatelefonoMantenimientoActivoFijo.setText(mantenimientoactivofijo.gettelefono());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_inicioMantenimientoActivoFijo.setDate(mantenimientoactivofijo.getfecha_inicio());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_entregaMantenimientoActivoFijo.setDate(mantenimientoactivofijo.getfecha_entrega());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldcostoMantenimientoActivoFijo.setText(mantenimientoactivofijo.getcosto().toString());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextArearesponsableMantenimientoActivoFijo.setText(mantenimientoactivofijo.getresponsable());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreaobservacionMantenimientoActivoFijo.setText(mantenimientoactivofijo.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMantenimientoActivoFijo(MantenimientoActivoFijoBean mantenimientoactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelidMantenimientoActivoFijo.setText(mantenimientoactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldnumero_documentoMantenimientoActivoFijo.setText(mantenimientoactivofijoBean.getnumero_documento());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreacausaMantenimientoActivoFijo.setText(mantenimientoactivofijoBean.getcausa());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreareferenciaMantenimientoActivoFijo.setText(mantenimientoactivofijoBean.getreferencia());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatallerMantenimientoActivoFijo.setText(mantenimientoactivofijoBean.gettaller());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatelefonoMantenimientoActivoFijo.setText(mantenimientoactivofijoBean.gettelefono());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_inicioMantenimientoActivoFijo.setDate(mantenimientoactivofijoBean.getfecha_inicio());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_entregaMantenimientoActivoFijo.setDate(mantenimientoactivofijoBean.getfecha_entrega());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldcostoMantenimientoActivoFijo.setText(mantenimientoactivofijoBean.getcosto().toString());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextArearesponsableMantenimientoActivoFijo.setText(mantenimientoactivofijoBean.getresponsable());
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreaobservacionMantenimientoActivoFijo.setText(mantenimientoactivofijoBean.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMantenimientoActivoFijo(MantenimientoActivoFijoParameterReturnGeneral mantenimientoactivofijoReturnGeneral,MantenimientoActivoFijoBean mantenimientoactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			MantenimientoActivoFijo mantenimientoactivofijoLocal=new MantenimientoActivoFijo();
			
			mantenimientoactivofijoLocal=mantenimientoactivofijoReturnGeneral.getMantenimientoActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mantenimientoactivofijoLocal.getId()!=null && !mantenimientoactivofijoLocal.getId().equals(0L))) {mantenimientoactivofijoBean.setId(mantenimientoactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.getid_detalle_activo_fijo()!=null && !mantenimientoactivofijoLocal.getid_detalle_activo_fijo().equals(-1L))) {mantenimientoactivofijoBean.setid_detalle_activo_fijo(mantenimientoactivofijoLocal.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.getid_tipo_movimiento()!=null && !mantenimientoactivofijoLocal.getid_tipo_movimiento().equals(-1L))) {mantenimientoactivofijoBean.setid_tipo_movimiento(mantenimientoactivofijoLocal.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.getnumero_documento()!=null && !mantenimientoactivofijoLocal.getnumero_documento().equals(""))) {mantenimientoactivofijoBean.setnumero_documento(mantenimientoactivofijoLocal.getnumero_documento());}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.getcausa()!=null && !mantenimientoactivofijoLocal.getcausa().equals(""))) {mantenimientoactivofijoBean.setcausa(mantenimientoactivofijoLocal.getcausa());}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.getreferencia()!=null && !mantenimientoactivofijoLocal.getreferencia().equals(""))) {mantenimientoactivofijoBean.setreferencia(mantenimientoactivofijoLocal.getreferencia());}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.gettaller()!=null && !mantenimientoactivofijoLocal.gettaller().equals(""))) {mantenimientoactivofijoBean.settaller(mantenimientoactivofijoLocal.gettaller());}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.gettelefono()!=null && !mantenimientoactivofijoLocal.gettelefono().equals(""))) {mantenimientoactivofijoBean.settelefono(mantenimientoactivofijoLocal.gettelefono());}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.getfecha_inicio()!=null && !mantenimientoactivofijoLocal.getfecha_inicio().equals(new Date()))) {mantenimientoactivofijoBean.setfecha_inicio(mantenimientoactivofijoLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.getfecha_entrega()!=null && !mantenimientoactivofijoLocal.getfecha_entrega().equals(new Date()))) {mantenimientoactivofijoBean.setfecha_entrega(mantenimientoactivofijoLocal.getfecha_entrega());}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.getcosto()!=null && !mantenimientoactivofijoLocal.getcosto().equals(0.0))) {mantenimientoactivofijoBean.setcosto(mantenimientoactivofijoLocal.getcosto());}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.getresponsable()!=null && !mantenimientoactivofijoLocal.getresponsable().equals(""))) {mantenimientoactivofijoBean.setresponsable(mantenimientoactivofijoLocal.getresponsable());}
			if(conDefault || (!conDefault && mantenimientoactivofijoLocal.getobservacion()!=null && !mantenimientoactivofijoLocal.getobservacion().equals(""))) {mantenimientoactivofijoBean.setobservacion(mantenimientoactivofijoLocal.getobservacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMantenimientoActivoFijoGenerico(Long idMantenimientoActivoFijoSeleccionado,JComboBox jComboBoxMantenimientoActivoFijo,List<MantenimientoActivoFijo> mantenimientoactivofijosLocal)throws Exception {
		try {
			MantenimientoActivoFijo  mantenimientoactivofijoTemp=null;

			for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijosLocal) {
				if(mantenimientoactivofijoAux.getId()!=null && mantenimientoactivofijoAux.getId().equals(idMantenimientoActivoFijoSeleccionado)) {
					mantenimientoactivofijoTemp=mantenimientoactivofijoAux;
					break;
				}
			}

			jComboBoxMantenimientoActivoFijo.setSelectedItem(mantenimientoactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMantenimientoActivoFijoGenerico(JComboBox jComboBoxMantenimientoActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMantenimientoActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMantenimientoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMantenimientoActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMantenimientoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMantenimientoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMantenimientoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mantenimientoactivofijo=(MantenimientoActivoFijo) mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mantenimientoactivofijo =(MantenimientoActivoFijo) mantenimientoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!mantenimientoactivofijo.getIsNew() && !mantenimientoactivofijo.getIsChanged() && !mantenimientoactivofijo.getIsDeleted()) {
				sDescripcion=mantenimientoactivofijo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=mantenimientoactivofijo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!mantenimientoactivofijo.getIsNew() && !mantenimientoactivofijo.getIsChanged() && !mantenimientoactivofijo.getIsDeleted()) {
				sDescripcion=mantenimientoactivofijo.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=mantenimientoactivofijo.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("DetalleActivoFijo")) {
			//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
			if(!mantenimientoactivofijo.getIsNew() && !mantenimientoactivofijo.getIsChanged() && !mantenimientoactivofijo.getIsDeleted()) {
				sDescripcion=mantenimientoactivofijo.getdetalleactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=mantenimientoactivofijo.getdetalleactivofijo_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!mantenimientoactivofijo.getIsNew() && !mantenimientoactivofijo.getIsChanged() && !mantenimientoactivofijo.getIsDeleted()) {
				sDescripcion=mantenimientoactivofijo.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=mantenimientoactivofijo.gettipomovimiento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		MantenimientoActivoFijo mantenimientoactivofijoRow=new MantenimientoActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mantenimientoactivofijoRow=(MantenimientoActivoFijo) mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mantenimientoactivofijoRow=(MantenimientoActivoFijo) mantenimientoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMantenimientoActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoMantenimientoActivoFijo && this.isPermisoNuevoMantenimientoActivoFijo));			
			this.jButtonDuplicarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarMantenimientoActivoFijo && this.isPermisoDuplicarMantenimientoActivoFijo));			
			this.jButtonCopiarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarMantenimientoActivoFijo && this.isPermisoCopiarMantenimientoActivoFijo));
			this.jButtonVerFormMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormMantenimientoActivoFijo && this.isPermisoVerFormMantenimientoActivoFijo));
			
			this.jButtonAbrirOrderByMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenMantenimientoActivoFijo && this.isPermisoOrdenMantenimientoActivoFijo));			
			
			this.jButtonNuevoRelacionesMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo && this.isPermisoNuevoMantenimientoActivoFijo));			
			this.jButtonNuevoGuardarCambiosMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoMantenimientoActivoFijo && this.isPermisoNuevoMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo));
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonModificarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaModificarMantenimientoActivoFijo && this.isPermisoActualizarMantenimientoActivoFijo));	
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonActualizarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarMantenimientoActivoFijo && this.isPermisoActualizarMantenimientoActivoFijo));	
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonEliminarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarMantenimientoActivoFijo && this.isPermisoEliminarMantenimientoActivoFijo));
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonCancelarMantenimientoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarMantenimientoActivoFijo);							
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoMantenimientoActivoFijo && this.isPermisoNuevoMantenimientoActivoFijo));						
			this.jButtonDuplicarToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarMantenimientoActivoFijo && this.isPermisoDuplicarMantenimientoActivoFijo));						
			this.jButtonCopiarToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarMantenimientoActivoFijo && this.isPermisoCopiarMantenimientoActivoFijo));			
			this.jButtonVerFormToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormMantenimientoActivoFijo && this.isPermisoVerFormMantenimientoActivoFijo));			
			this.jButtonAbrirOrderByToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenMantenimientoActivoFijo && this.isPermisoOrdenMantenimientoActivoFijo));
			this.jButtonNuevoRelacionesToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo && this.isPermisoNuevoMantenimientoActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoMantenimientoActivoFijo && this.isPermisoNuevoMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo));			
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonModificarToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaModificarMantenimientoActivoFijo && this.isPermisoActualizarMantenimientoActivoFijo));	
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonActualizarToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarMantenimientoActivoFijo  && this.isPermisoActualizarMantenimientoActivoFijo));	
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonEliminarToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarMantenimientoActivoFijo && this.isPermisoEliminarMantenimientoActivoFijo));
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonCancelarToolBarMantenimientoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarMantenimientoActivoFijo);				
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoMantenimientoActivoFijo && this.isPermisoNuevoMantenimientoActivoFijo));			
			this.jMenuItemDuplicarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarMantenimientoActivoFijo && this.isPermisoDuplicarMantenimientoActivoFijo));			
			this.jMenuItemCopiarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarMantenimientoActivoFijo && this.isPermisoCopiarMantenimientoActivoFijo));			
			this.jMenuItemVerFormMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormMantenimientoActivoFijo && this.isPermisoVerFormMantenimientoActivoFijo));			
			this.jMenuItemAbrirOrderByMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenMantenimientoActivoFijo && this.isPermisoOrdenMantenimientoActivoFijo));			
			//this.jMenuItemMostrarOcultarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenMantenimientoActivoFijo && this.isPermisoOrdenMantenimientoActivoFijo));
			this.jMenuItemDetalleAbrirOrderByMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenMantenimientoActivoFijo && this.isPermisoOrdenMantenimientoActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenMantenimientoActivoFijo && this.isPermisoOrdenMantenimientoActivoFijo));			
			this.jMenuItemNuevoRelacionesMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo && this.isPermisoNuevoMantenimientoActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoMantenimientoActivoFijo && this.isPermisoNuevoMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo));									
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemModificarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaModificarMantenimientoActivoFijo && this.isPermisoActualizarMantenimientoActivoFijo));	
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemActualizarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarMantenimientoActivoFijo && this.isPermisoActualizarMantenimientoActivoFijo));	
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemEliminarMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarMantenimientoActivoFijo && this.isPermisoEliminarMantenimientoActivoFijo));
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemCancelarMantenimientoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarMantenimientoActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo));						
			this.jMenuItemGuardarCambiosTablaMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=this.jButtonNuevoMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarMantenimientoActivoFijo=this.jButtonDuplicarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarMantenimientoActivoFijo=this.jButtonCopiarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormMantenimientoActivoFijo=this.jButtonVerFormMantenimientoActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenMantenimientoActivoFijo=this.jButtonAbrirOrderByMantenimientoActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=this.jButtonNuevoRelacionesMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarMantenimientoActivoFijo=this.jButtonModificarMantenimientoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonActualizarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonEliminarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonCancelarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosMantenimientoActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=this.jButtonNuevoToolBarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=this.jButtonNuevoRelacionesToolBarMantenimientoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonModificarToolBarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonActualizarToolBarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonEliminarToolBarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonCancelarToolBarMantenimientoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=this.jButtonGuardarCambiosToolBarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=this.jButtonGuardarCambiosTablaToolBarMantenimientoActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=this.jMenuItemNuevoMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=this.jMenuItemNuevoRelacionesMantenimientoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemModificarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemActualizarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemEliminarMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarMantenimientoActivoFijo=this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemCancelarMantenimientoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=this.jMenuItemGuardarCambiosMantenimientoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=this.jMenuItemGuardarCambiosTablaMantenimientoActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMantenimientoActivoFijo(Boolean esInicializar) {
		if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMantenimientoActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualMantenimientoActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMantenimientoActivoFijo() {
		this.jButtonNuevoMantenimientoActivoFijo.setVisible(this.isPermisoNuevoMantenimientoActivoFijo);			
		this.jButtonDuplicarMantenimientoActivoFijo.setVisible(this.isPermisoDuplicarMantenimientoActivoFijo);			
		this.jButtonCopiarMantenimientoActivoFijo.setVisible(this.isPermisoCopiarMantenimientoActivoFijo);			
		this.jButtonVerFormMantenimientoActivoFijo.setVisible(this.isPermisoVerFormMantenimientoActivoFijo);			
		
		this.jButtonAbrirOrderByMantenimientoActivoFijo.setVisible(this.isPermisoOrdenMantenimientoActivoFijo);					
		
		this.jButtonNuevoRelacionesMantenimientoActivoFijo.setVisible(this.isPermisoNuevoMantenimientoActivoFijo);			
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonModificarMantenimientoActivoFijo.setVisible(this.isPermisoActualizarMantenimientoActivoFijo);	
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonActualizarMantenimientoActivoFijo.setVisible(this.isPermisoActualizarMantenimientoActivoFijo);	
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonEliminarMantenimientoActivoFijo.setVisible(this.isPermisoEliminarMantenimientoActivoFijo);
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonCancelarMantenimientoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarMantenimientoActivoFijo);						
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosMantenimientoActivoFijo.setVisible(this.isPermisoGuardarCambiosMantenimientoActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.setVisible(this.isPermisoActualizarMantenimientoActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMantenimientoActivoFijo() {
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonModificarMantenimientoActivoFijo.setVisible(this.isPermisoActualizarMantenimientoActivoFijo);	
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonActualizarMantenimientoActivoFijo.setVisible(this.isPermisoActualizarMantenimientoActivoFijo);	
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonEliminarMantenimientoActivoFijo.setVisible(this.isPermisoEliminarMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonCancelarMantenimientoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarMantenimientoActivoFijo);							
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosMantenimientoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarMantenimientoActivoFijo && this.isPermisoGuardarCambiosMantenimientoActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMantenimientoActivoFijo() {
		if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMantenimientoActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMantenimientoActivoFijo() {
	}
	
	public void jTableDatosMantenimientoActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMantenimientoActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.mantenimientoactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMantenimientoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMantenimientoActivoFijo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMantenimientoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMantenimientoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.mantenimientoactivofijoLogic.getConnexion());

				if(this.mantenimientoactivofijo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.mantenimientoactivofijo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMantenimientoActivoFijo=(TitledBorder)this.jScrollPanelDatosMantenimientoActivoFijo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMantenimientoActivoFijo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.mantenimientoactivofijo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalMantenimientoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebMantenimientoActivoFijo(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMantenimientoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMantenimientoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.mantenimientoactivofijoLogic.getConnexion());

				if(this.mantenimientoactivofijo.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.mantenimientoactivofijo.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMantenimientoActivoFijo=(TitledBorder)this.jScrollPanelDatosMantenimientoActivoFijo.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderMantenimientoActivoFijo.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.mantenimientoactivofijo.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetalleactivofijo=true;

			idTienePermisodetalleactivofijo=this.tienePermisosUsuarioEnPaginaWebMantenimientoActivoFijo(DetalleActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetalleactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMantenimientoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMantenimientoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.mantenimientoactivofijoLogic.getConnexion());

				if(this.mantenimientoactivofijo.getid_detalle_activo_fijo()!=null) {
					this.detalleactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detalleactivofijoBeanSwingJInternalFrame.setIdActual(this.mantenimientoactivofijo.getid_detalle_activo_fijo());
					this.detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.detalleactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMantenimientoActivoFijo=(TitledBorder)this.jScrollPanelDatosMantenimientoActivoFijo.getBorder();
				TitledBorder titledBorderdetalleactivofijo=(TitledBorder)this.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

				titledBorderdetalleactivofijo.setTitle(titledBorderMantenimientoActivoFijo.getTitle() + " -> Detalle Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getid_detalle_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_activo_fijo = "+this.mantenimientoactivofijo.getid_detalle_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoMantenimientoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebMantenimientoActivoFijo(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMantenimientoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMantenimientoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.mantenimientoactivofijoLogic.getConnexion());

				if(this.mantenimientoactivofijo.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.mantenimientoactivofijo.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMantenimientoActivoFijo=(TitledBorder)this.jScrollPanelDatosMantenimientoActivoFijo.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderMantenimientoActivoFijo.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.mantenimientoactivofijo.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_documentoMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getnumero_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_documento like '%"+this.mantenimientoactivofijo.getnumero_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncausaMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getcausa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where causa like '%"+this.mantenimientoactivofijo.getcausa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonreferenciaMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getreferencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where referencia like '%"+this.mantenimientoactivofijo.getreferencia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontallerMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.gettaller()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where taller like '%"+this.mantenimientoactivofijo.gettaller()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.mantenimientoactivofijo.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.mantenimientoactivofijo.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_entregaMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getfecha_entrega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_entrega = '"+Funciones2.getStringPostgresDate(this.mantenimientoactivofijo.getfecha_entrega())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.mantenimientoactivofijo.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonresponsableMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getresponsable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where responsable like '%"+this.mantenimientoactivofijo.getresponsable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionMantenimientoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.getmantenimientoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoactivofijo==null) {
						this.mantenimientoactivofijo = new MantenimientoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);
				}

				if(this.mantenimientoactivofijo.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.mantenimientoactivofijo.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdDetalleActivoFijoMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);

			this.getMantenimientoActivoFijosFK_IdDetalleActivoFijo();

			this.inicializarActualizarBindingMantenimientoActivoFijo(false);

			//if(MantenimientoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);

			this.getMantenimientoActivoFijosFK_IdEmpresa();

			this.inicializarActualizarBindingMantenimientoActivoFijo(false);

			//if(MantenimientoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);

			this.getMantenimientoActivoFijosFK_IdSucursal();

			this.inicializarActualizarBindingMantenimientoActivoFijo(false);

			//if(MantenimientoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoMantenimientoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);

			this.getMantenimientoActivoFijosFK_IdTipoMovimiento();

			this.inicializarActualizarBindingMantenimientoActivoFijo(false);

			//if(MantenimientoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMantenimientoActivoFijo() {
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.dispose();
			this.jInternalFrameDetalleFormMantenimientoActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoMantenimientoActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionMantenimientoActivoFijo!=null) {
			this.jInternalFrameImportacionMantenimientoActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionMantenimientoActivoFijo.dispose();
			this.jInternalFrameImportacionMantenimientoActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMantenimientoActivoFijo();
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoMantenimientoActivoFijo")) {
				jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMantenimientoActivoFijo")) {
				jButtonDuplicarMantenimientoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMantenimientoActivoFijo")) {
				jButtonCopiarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormMantenimientoActivoFijo")) {
				jButtonVerFormMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMantenimientoActivoFijo")) {
				jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMantenimientoActivoFijo")) {
				jButtonDuplicarMantenimientoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMantenimientoActivoFijo")) {
				jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMantenimientoActivoFijo")) {
				jButtonDuplicarMantenimientoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMantenimientoActivoFijo")) {
				jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMantenimientoActivoFijo")) {
				jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMantenimientoActivoFijo")) {
				jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMantenimientoActivoFijo")) {
				jButtonModificarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMantenimientoActivoFijo")) {
				jButtonModificarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMantenimientoActivoFijo")) {
				jButtonModificarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMantenimientoActivoFijo")) {
				jButtonActualizarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMantenimientoActivoFijo")) {
				jButtonActualizarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMantenimientoActivoFijo")) {
				jButtonActualizarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarMantenimientoActivoFijo")) {
				jButtonEliminarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMantenimientoActivoFijo")) {
				jButtonEliminarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMantenimientoActivoFijo")) {
				jButtonEliminarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarMantenimientoActivoFijo")) {
				jButtonCancelarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMantenimientoActivoFijo")) {
				jButtonCancelarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMantenimientoActivoFijo")) {
				jButtonCancelarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarMantenimientoActivoFijo")) {
				jButtonCerrarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMantenimientoActivoFijo")) {
				jButtonCerrarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMantenimientoActivoFijo")) {
				jButtonCerrarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMantenimientoActivoFijo")) {
				jButtonMostrarOcultarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMantenimientoActivoFijo")) {
				jButtonCancelarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMantenimientoActivoFijo")) {
				jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMantenimientoActivoFijo")) {
				jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMantenimientoActivoFijo")) {
				jButtonCopiarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMantenimientoActivoFijo")) {
				jButtonVerFormMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMantenimientoActivoFijo")) {
				jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMantenimientoActivoFijo")) {
				jButtonCopiarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMantenimientoActivoFijo")) {
				jButtonVerFormMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMantenimientoActivoFijo")) {
				jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMantenimientoActivoFijo")) {
				jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMantenimientoActivoFijo")) {
				jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMantenimientoActivoFijo")) {
				jButtonRecargarInformacionMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMantenimientoActivoFijo")) {
				jButtonRecargarInformacionMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMantenimientoActivoFijo")) {
				jButtonRecargarInformacionMantenimientoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMantenimientoActivoFijo")) {
				jButtonAnterioresMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMantenimientoActivoFijo")) {
				jButtonAnterioresMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMantenimientoActivoFijo")) {
				jButtonAnterioresMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMantenimientoActivoFijo")) {
				jButtonSiguientesMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMantenimientoActivoFijo")) {
				jButtonSiguientesMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMantenimientoActivoFijo")) {
				jButtonSiguientesMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMantenimientoActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByMantenimientoActivoFijo")) {
				jButtonAbrirOrderByMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMantenimientoActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarMantenimientoActivoFijo")) {
				jButtonMostrarOcultarMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMantenimientoActivoFijo")) {
				jButtonNuevoGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMantenimientoActivoFijo")) {
				jButtonNuevoGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMantenimientoActivoFijo")) {
				jButtonNuevoGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMantenimientoActivoFijo")) {
				jButtonCerrarReporteDinamicoMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMantenimientoActivoFijo")) {
				jButtonGenerarReporteDinamicoMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMantenimientoActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMantenimientoActivoFijo")) {
				jButtonCerrarImportacionMantenimientoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMantenimientoActivoFijo")) {
				
				jButtonGenerarImportacionMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMantenimientoActivoFijo")) {
				
				jButtonAbrirImportacionMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMantenimientoActivoFijo")) {
				jComboBoxTiposAccionesMantenimientoActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMantenimientoActivoFijo")) {
				jComboBoxTiposRelacionesMantenimientoActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMantenimientoActivoFijo")) {
				jComboBoxTiposAccionesMantenimientoActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMantenimientoActivoFijo")) {
				
				jComboBoxTiposSeleccionarMantenimientoActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMantenimientoActivoFijo")) {
				jTextFieldValorCampoGeneralMantenimientoActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMantenimientoActivoFijo")) {
				jButtonAbrirOrderByMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMantenimientoActivoFijo")) {
				jButtonAbrirOrderByMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMantenimientoActivoFijo")) {
				jButtonCerrarOrderByMantenimientoActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMantenimientoActivoFijoBusqueda")) {
				this.jButtonidMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMantenimientoActivoFijoUpdate")) {
				this.jButtonid_empresaMantenimientoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMantenimientoActivoFijoBusqueda")) {
				this.jButtonid_empresaMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMantenimientoActivoFijoUpdate")) {
				this.jButtonid_sucursalMantenimientoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMantenimientoActivoFijoBusqueda")) {
				this.jButtonid_sucursalMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoMantenimientoActivoFijoUpdate")) {
				this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoMantenimientoActivoFijoBusqueda")) {
				this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoMantenimientoActivoFijoUpdate")) {
				this.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoMantenimientoActivoFijoBusqueda")) {
				this.jButtonid_tipo_movimientoMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoMantenimientoActivoFijoBusqueda")) {
				this.jButtonnumero_documentoMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("causaMantenimientoActivoFijoBusqueda")) {
				this.jButtoncausaMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("referenciaMantenimientoActivoFijoBusqueda")) {
				this.jButtonreferenciaMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tallerMantenimientoActivoFijoBusqueda")) {
				this.jButtontallerMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoMantenimientoActivoFijoBusqueda")) {
				this.jButtontelefonoMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioMantenimientoActivoFijoBusqueda")) {
				this.jButtonfecha_inicioMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaMantenimientoActivoFijoBusqueda")) {
				this.jButtonfecha_entregaMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoMantenimientoActivoFijoBusqueda")) {
				this.jButtoncostoMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("responsableMantenimientoActivoFijoBusqueda")) {
				this.jButtonresponsableMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionMantenimientoActivoFijoBusqueda")) {
				this.jButtonobservacionMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdDetalleActivoFijoMantenimientoActivoFijo")) {
				this.jButtonFK_IdDetalleActivoFijoMantenimientoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoMovimientoMantenimientoActivoFijo")) {
				this.jButtonFK_IdTipoMovimientoMantenimientoActivoFijoActionPerformed(evt);
			}
			
			;
			
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMantenimientoActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				


				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			MantenimientoActivoFijo mantenimientoactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				mantenimientoactivofijoLocal=this.mantenimientoactivofijo;
			} else {
				mantenimientoactivofijoLocal=this.mantenimientoactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
							
				
				


				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
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
			
			


			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
								
						
				


				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
								
				
				


				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
							
				
				


				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
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
			
			


			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
								
				
				


				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMantenimientoActivoFijo")) {
					jCheckBoxSeleccionarTodosMantenimientoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMantenimientoActivoFijo")) {
					jCheckBoxSeleccionadosMantenimientoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMantenimientoActivoFijo")) {
					
				}
				
				


				
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
												
				
				


				
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
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
			
			


			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoactivofijo);
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
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
				
				


				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoactivofijoAnterior =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMantenimientoActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMantenimientoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMantenimientoActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.mantenimientoactivofijo =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.mantenimientoactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMantenimientoActivoFijo")) {
				
				}
				
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMantenimientoActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMantenimientoActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMantenimientoActivoFijo")) {
			
			}
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMantenimientoActivoFijo();
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoMantenimientoActivoFijo")) {
				jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMantenimientoActivoFijo")) {
				jButtonDuplicarMantenimientoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMantenimientoActivoFijo")) {
				jButtonCopiarMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMantenimientoActivoFijo")) {
				jButtonVerFormMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMantenimientoActivoFijo")) {
				jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMantenimientoActivoFijo")) {
				jButtonModificarMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMantenimientoActivoFijo")) {
				jButtonActualizarMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMantenimientoActivoFijo")) {
				jButtonEliminarMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMantenimientoActivoFijo")) {
				jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMantenimientoActivoFijo")) {
				jButtonCancelarMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMantenimientoActivoFijo")) {
				jButtonCerrarMantenimientoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMantenimientoActivoFijo")) {
				jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMantenimientoActivoFijo")) {
				jButtonNuevoGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMantenimientoActivoFijo")) {
				jButtonAbrirOrderByMantenimientoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMantenimientoActivoFijo")) {
				jButtonRecargarInformacionMantenimientoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMantenimientoActivoFijo")) {
				jButtonAnterioresMantenimientoActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMantenimientoActivoFijo")) {
				jButtonSiguientesMantenimientoActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMantenimientoActivoFijoBusqueda")) {
				this.jButtonidMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMantenimientoActivoFijoUpdate")) {
				this.jButtonid_empresaMantenimientoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMantenimientoActivoFijoBusqueda")) {
				this.jButtonid_empresaMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMantenimientoActivoFijoUpdate")) {
				this.jButtonid_sucursalMantenimientoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMantenimientoActivoFijoBusqueda")) {
				this.jButtonid_sucursalMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoMantenimientoActivoFijoUpdate")) {
				this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoMantenimientoActivoFijoBusqueda")) {
				this.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoMantenimientoActivoFijoUpdate")) {
				this.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoMantenimientoActivoFijoBusqueda")) {
				this.jButtonid_tipo_movimientoMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoMantenimientoActivoFijoBusqueda")) {
				this.jButtonnumero_documentoMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("causaMantenimientoActivoFijoBusqueda")) {
				this.jButtoncausaMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("referenciaMantenimientoActivoFijoBusqueda")) {
				this.jButtonreferenciaMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tallerMantenimientoActivoFijoBusqueda")) {
				this.jButtontallerMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoMantenimientoActivoFijoBusqueda")) {
				this.jButtontelefonoMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioMantenimientoActivoFijoBusqueda")) {
				this.jButtonfecha_inicioMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaMantenimientoActivoFijoBusqueda")) {
				this.jButtonfecha_entregaMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoMantenimientoActivoFijoBusqueda")) {
				this.jButtoncostoMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("responsableMantenimientoActivoFijoBusqueda")) {
				this.jButtonresponsableMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionMantenimientoActivoFijoBusqueda")) {
				this.jButtonobservacionMantenimientoActivoFijoBusquedaActionPerformed(evt);
			}
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMantenimientoActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMantenimientoActivoFijo")) {
				closingInternalFrameMantenimientoActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarMantenimientoActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormMantenimientoActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            MantenimientoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(MantenimientoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormMantenimientoActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMantenimientoActivoFijoActionPerformed(null);
			}
			
			MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mantenimientoactivofijo,new Object(),this.mantenimientoactivofijoParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMantenimientoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMantenimientoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMantenimientoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.mantenimientoactivofijo)) {
			if(!esControlTabla) {
				if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);			
				}
				
				if(this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.mantenimientoactivofijoReturnGeneral=mantenimientoactivofijoLogic.procesarEventosMantenimientoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos(),this.mantenimientoactivofijo,this.mantenimientoactivofijoParameterGeneral,this.isEsNuevoMantenimientoActivoFijo,classes);//this.mantenimientoactivofijoLogic.getMantenimientoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMantenimientoActivoFijo(this.mantenimientoactivofijoReturnGeneral,this.mantenimientoactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMantenimientoActivoFijo(classes,this.mantenimientoactivofijoReturnGeneral,this.mantenimientoactivofijoBean,false);
					}
						
					if(this.mantenimientoactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMantenimientoActivoFijo(this.mantenimientoactivofijoReturnGeneral.getMantenimientoActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMantenimientoActivoFijo(this.mantenimientoactivofijoReturnGeneral.getMantenimientoActivoFijo());	
					}
						
					if(this.mantenimientoactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMantenimientoActivoFijo(this.mantenimientoactivofijoReturnGeneral.getMantenimientoActivoFijo(),classes);//this.mantenimientoactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMantenimientoActivoFijo(this.mantenimientoactivofijo,classes);//this.mantenimientoactivofijoBean);									
				}
			
				if(MantenimientoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMantenimientoActivoFijo(this.mantenimientoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoActivoFijo(this.mantenimientoactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.mantenimientoactivofijoAnterior!=null) {
						this.mantenimientoactivofijo=this.mantenimientoactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.mantenimientoactivofijoReturnGeneral=mantenimientoactivofijoLogic.procesarEventosMantenimientoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos(),this.mantenimientoactivofijo,this.mantenimientoactivofijoParameterGeneral,this.isEsNuevoMantenimientoActivoFijo,classes);//this.mantenimientoactivofijoLogic.getMantenimientoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mantenimientoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.mantenimientoactivofijoReturnGeneral.getMantenimientoActivoFijo(),mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.mantenimientoactivofijoReturnGeneral.getMantenimientoActivoFijo(),this.mantenimientoactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMantenimientoActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosMantenimientoActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMantenimientoActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosMantenimientoActivoFijo() throws Exception {
		
		MantenimientoActivoFijoModel mantenimientoactivofijoModel=(MantenimientoActivoFijoModel)this.jTableDatosMantenimientoActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mantenimientoactivofijoModel.mantenimientoactivofijos=this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			mantenimientoactivofijoModel.mantenimientoactivofijos=this.mantenimientoactivofijos;
		}
		
		
		((MantenimientoActivoFijoModel) this.jTableDatosMantenimientoActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMantenimientoActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmantenimientoactivofijoAnterior(),this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmantenimientoactivofijoAnterior(),this.mantenimientoactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMantenimientoActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
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
										
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mantenimientoactivofijo,new Object(),generalEntityParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MantenimientoActivoFijoConstantesFunciones.getClassesRelationshipsOfMantenimientoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MantenimientoActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfMantenimientoActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMantenimientoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mantenimientoactivofijo,new Object(),generalEntityParameterGeneral,this.mantenimientoactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMantenimientoActivoFijo(MantenimientoActivoFijoBean mantenimientoactivofijoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMantenimientoActivoFijo(ArrayList<Classe> classes,MantenimientoActivoFijoReturnGeneral mantenimientoactivofijoReturnGeneral,MantenimientoActivoFijoBean mantenimientoactivofijoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.mantenimientoactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo = new MantenimientoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.mantenimientoactivofijoSessionBean.getConGuardarRelaciones(),this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.mantenimientoactivofijoLogic=this.mantenimientoactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyMantenimientoActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMantenimientoActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMantenimientoActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMantenimientoActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMantenimientoActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMantenimientoActivoFijo"));
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonModificarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarMantenimientoActivoFijo"));

		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonModificarToolBarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarMantenimientoActivoFijo"));
					
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemModificarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarMantenimientoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonActualizarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarMantenimientoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonActualizarToolBarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMantenimientoActivoFijo"));
						
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemActualizarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMantenimientoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonEliminarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarMantenimientoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonEliminarToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarMantenimientoActivoFijo"));
								
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemEliminarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMantenimientoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonCancelarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarMantenimientoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonCancelarToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarMantenimientoActivoFijo"));
					
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemCancelarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMantenimientoActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemDetalleCerrarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMantenimientoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMantenimientoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMantenimientoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMantenimientoActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonidMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_empresaMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_empresaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_sucursalMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_sucursalMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonnumero_documentoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtoncausaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"causaMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonreferenciaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"referenciaMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtontallerMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"tallerMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtontelefonoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"telefonoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonfecha_inicioMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonfecha_entregaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtoncostoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"costoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonresponsableMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"responsableMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonobservacionMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"observacionMantenimientoActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTabbedPaneRelacionesMantenimientoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMantenimientoActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMantenimientoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMantenimientoActivoFijo"));
		}
		
		this.jTableDatosMantenimientoActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMantenimientoActivoFijo"));
		
		this.jTableDatosMantenimientoActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMantenimientoActivoFijo"));
		
		this.jButtonNuevoMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoMantenimientoActivoFijo"));
		
		this.jButtonDuplicarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarMantenimientoActivoFijo"));
		
		this.jButtonCopiarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarMantenimientoActivoFijo"));
		
		this.jButtonVerFormMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormMantenimientoActivoFijo"));
		
		
		this.jButtonNuevoToolBarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarMantenimientoActivoFijo"));
			
		this.jButtonDuplicarToolBarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMantenimientoActivoFijo"));
			
		this.jMenuItemNuevoMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMantenimientoActivoFijo"));
			
		this.jMenuItemDuplicarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMantenimientoActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMantenimientoActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMantenimientoActivoFijo"));
			
		this.jMenuItemNuevoRelacionesMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMantenimientoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonModificarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarMantenimientoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonModificarToolBarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarMantenimientoActivoFijo"));
			
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemModificarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarMantenimientoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonActualizarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarMantenimientoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonActualizarToolBarMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMantenimientoActivoFijo"));
				
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemActualizarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMantenimientoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonEliminarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarMantenimientoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonEliminarToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarMantenimientoActivoFijo"));
						
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemEliminarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMantenimientoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonCancelarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarMantenimientoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonCancelarToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarMantenimientoActivoFijo"));
			
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemCancelarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMantenimientoActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMantenimientoActivoFijo"));		
		
		
		this.jButtonCerrarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarMantenimientoActivoFijo"));
		
		
		this.jButtonCerrarToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarMantenimientoActivoFijo"));
			
		this.jMenuItemCerrarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMantenimientoActivoFijo"));
			
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jMenuItemDetalleCerrarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMantenimientoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosMantenimientoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMantenimientoActivoFijo"));
		}
		
		this.jButtonCopiarToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarMantenimientoActivoFijo"));
			
		this.jButtonVerFormToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarMantenimientoActivoFijo"));
		
		this.jMenuItemGuardarCambiosMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMantenimientoActivoFijo"));
			
		this.jMenuItemCopiarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMantenimientoActivoFijo"));		
		
		this.jMenuItemVerFormMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMantenimientoActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMantenimientoActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMantenimientoActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMantenimientoActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionMantenimientoActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMantenimientoActivoFijo"));
		
		this.jMenuItemRecargarInformacionMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMantenimientoActivoFijo"));		
		
		
		
		this.jButtonAnterioresMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresMantenimientoActivoFijo"));
		
		
		this.jButtonAnterioresToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMantenimientoActivoFijo"));
		
		this.jMenuItemAnterioresMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMantenimientoActivoFijo"));		
		
		
		this.jButtonSiguientesMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesMantenimientoActivoFijo"));
		
		
		this.jButtonSiguientesToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMantenimientoActivoFijo"));
			
		this.jMenuItemSiguientesMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMantenimientoActivoFijo"));
			
		this.jMenuItemAbrirOrderByMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMantenimientoActivoFijo"));
			
		this.jMenuItemMostrarOcultarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMantenimientoActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMantenimientoActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMantenimientoActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMantenimientoActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMantenimientoActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMantenimientoActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMantenimientoActivoFijo"));

		this.jCheckBoxSeleccionadosMantenimientoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMantenimientoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMantenimientoActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesMantenimientoActivoFijo"));
			
		this.jComboBoxTiposAccionesMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesMantenimientoActivoFijo"));
					
		this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMantenimientoActivoFijo"));
			
		this.jTextFieldValorCampoGeneralMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMantenimientoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonidMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_empresaMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_empresaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_sucursalMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_sucursalMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonnumero_documentoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtoncausaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"causaMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonreferenciaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"referenciaMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtontallerMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"tallerMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtontelefonoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"telefonoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonfecha_inicioMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonfecha_entregaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtoncostoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"costoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonresponsableMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"responsableMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonobservacionMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"observacionMantenimientoActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdDetalleActivoFijoMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoMantenimientoActivoFijo"));

			this.jButtonFK_IdTipoMovimientoMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdTipoMovimientoMantenimientoActivoFijo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMantenimientoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMantenimientoActivoFijo"));
				this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMantenimientoActivoFijo"));
				this.jInternalFrameReporteDinamicoMantenimientoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMantenimientoActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMantenimientoActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMantenimientoActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMantenimientoActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMantenimientoActivoFijo!=null) {
				this.jInternalFrameImportacionMantenimientoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMantenimientoActivoFijo"));
				this.jInternalFrameImportacionMantenimientoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMantenimientoActivoFijo"));
				this.jInternalFrameImportacionMantenimientoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMantenimientoActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByMantenimientoActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarMantenimientoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMantenimientoActivoFijo"));			
			
			if(this.jInternalFrameOrderByMantenimientoActivoFijo!=null) {
				this.jInternalFrameOrderByMantenimientoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMantenimientoActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTabbedPaneRelacionesMantenimientoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMantenimientoActivoFijo"));
		
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
            		closingInternalFrameMantenimientoActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMantenimientoActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            MantenimientoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(MantenimientoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormMantenimientoActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMantenimientoActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMantenimientoActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMantenimientoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMantenimientoActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMantenimientoActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMantenimientoActivoFijo";
		inputMap = this.jButtonNuevoMantenimientoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMantenimientoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMantenimientoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesMantenimientoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMantenimientoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMantenimientoActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMantenimientoActivoFijo";
		inputMap = this.jButtonModificarMantenimientoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMantenimientoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMantenimientoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMantenimientoActivoFijo";
		inputMap = this.jButtonActualizarMantenimientoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMantenimientoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMantenimientoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMantenimientoActivoFijo";
		inputMap = this.jButtonEliminarMantenimientoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMantenimientoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMantenimientoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMantenimientoActivoFijo";
		inputMap = this.jButtonCancelarMantenimientoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMantenimientoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMantenimientoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMantenimientoActivoFijo";
		inputMap = this.jButtonCerrarMantenimientoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMantenimientoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMantenimientoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMantenimientoActivoFijo";
		inputMap = this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosMantenimientoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonGuardarCambiosMantenimientoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMantenimientoActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMantenimientoActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMantenimientoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMantenimientoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMantenimientoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMantenimientoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMantenimientoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonidMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_empresaMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_empresaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_sucursalMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_sucursalMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_detalle_activo_fijoMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_detalle_activo_fijoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMantenimientoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_tipo_movimientoMantenimientoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoMantenimientoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonid_tipo_movimientoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonnumero_documentoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtoncausaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"causaMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonreferenciaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"referenciaMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtontallerMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"tallerMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtontelefonoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"telefonoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonfecha_inicioMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonfecha_entregaMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtoncostoMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"costoMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonresponsableMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"responsableMantenimientoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jButtonobservacionMantenimientoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"observacionMantenimientoActivoFijoBusqueda"));
		
		
		this.jButtonFK_IdDetalleActivoFijoMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoMantenimientoActivoFijo"));

		this.jButtonFK_IdTipoMovimientoMantenimientoActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdTipoMovimientoMantenimientoActivoFijo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMantenimientoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMantenimientoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMantenimientoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMantenimientoActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMantenimientoActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
					mantenimientoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijos) {
					mantenimientoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMantenimientoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
						mantenimientoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijos) {
						mantenimientoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMantenimientoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMantenimientoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMantenimientoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMantenimientoActivoFijo.getSelectedRows();
			
			MantenimientoActivoFijo mantenimientoactivofijoLocal=new MantenimientoActivoFijo();
			
			//this.seleccionarTodosMantenimientoActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mantenimientoactivofijoLocal =(MantenimientoActivoFijo) this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos().toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					mantenimientoactivofijoLocal =(MantenimientoActivoFijo) this.mantenimientoactivofijos.toArray()[this.jTableDatosMantenimientoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				mantenimientoactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
						mantenimientoactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijos) {
						mantenimientoactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMantenimientoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMantenimientoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMantenimientoActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMantenimientoActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMantenimientoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMantenimientoActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
				
						if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							mantenimientoactivofijoAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA)) {
							existe=true;
							mantenimientoactivofijoAux.setcausa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA)) {
							existe=true;
							mantenimientoactivofijoAux.setreferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER)) {
							existe=true;
							mantenimientoactivofijoAux.settaller(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							mantenimientoactivofijoAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							mantenimientoactivofijoAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							mantenimientoactivofijoAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							mantenimientoactivofijoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE)) {
							existe=true;
							mantenimientoactivofijoAux.setresponsable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							mantenimientoactivofijoAux.setobservacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijos) {
					
						if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							mantenimientoactivofijoAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA)) {
							existe=true;
							mantenimientoactivofijoAux.setcausa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA)) {
							existe=true;
							mantenimientoactivofijoAux.setreferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER)) {
							existe=true;
							mantenimientoactivofijoAux.settaller(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							mantenimientoactivofijoAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							mantenimientoactivofijoAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							mantenimientoactivofijoAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							mantenimientoactivofijoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE)) {
							existe=true;
							mantenimientoactivofijoAux.setresponsable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							mantenimientoactivofijoAux.setobservacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMantenimientoActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMantenimientoActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMantenimientoActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMantenimientoActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessMantenimientoActivoFijo(conSplash);
				
					this.generarReporteMantenimientoActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMantenimientoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMantenimientoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesMantenimientoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMantenimientoActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesMantenimientoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMantenimientoActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesMantenimientoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMantenimientoActivoFijo();
				
				this.exportarMantenimientoActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMantenimientoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMantenimientoActivoFijos();
				//this.importarMantenimientoActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMantenimientoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMantenimientoActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMantenimientoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesMantenimientoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Mantenimiento Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMantenimientoActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMantenimientoActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMantenimientoActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Mantenimiento Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMantenimientoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else if(MantenimientoActivoFijoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMantenimientoActivoFijo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMantenimientoActivoFijo(conSplash);
					
						//this.actualizarParametrosGeneralMantenimientoActivoFijo();
						
						this.generarReporteProcesoAccionMantenimientoActivoFijosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMantenimientoActivoFijo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Mantenimiento Activo FijoS SELECCIONADOS?", "MANTENIMIENTO DE Mantenimiento Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMantenimientoActivoFijo();
				
						this.actualizarParametrosGeneralMantenimientoActivoFijo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.mantenimientoactivofijoReturnGeneral=mantenimientoactivofijoLogic.procesarAccionMantenimientoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos(),this.mantenimientoactivofijoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMantenimientoActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMantenimientoActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMantenimientoActivoFijo();
					
					MantenimientoActivoFijoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMantenimientoActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMantenimientoActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxTiposAccionesFormularioMantenimientoActivoFijo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMantenimientoActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMantenimientoActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMantenimientoActivoFijo();
			
			if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();		
			MantenimientoActivoFijo mantenimientoactivofijo=new MantenimientoActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMantenimientoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMantenimientoActivoFijo.getSelectedItem();
			
			
			
			
			mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(mantenimientoactivofijosSeleccionados.size()==1) {
				for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijosSeleccionados) {
					mantenimientoactivofijo=mantenimientoactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMantenimientoActivoFijo();
			
      		//this.finishProcessMantenimientoActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMantenimientoActivoFijoReturnGeneral() throws Exception {
		if(this.mantenimientoactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.mantenimientoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.mantenimientoactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.mantenimientoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.mantenimientoactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.mantenimientoactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMantenimientoActivoFijo(false);
		}
		
		if(this.mantenimientoactivofijoReturnGeneral.getConRetornoLista() || this.mantenimientoactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.mantenimientoactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mantenimientoactivofijoLogic.setMantenimientoActivoFijos(this.mantenimientoactivofijoReturnGeneral.getMantenimientoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.mantenimientoactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mantenimientoactivofijoLogic.setMantenimientoActivoFijo(this.mantenimientoactivofijoReturnGeneral.getMantenimientoActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingMantenimientoActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralMantenimientoActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<MantenimientoActivoFijo> getMantenimientoActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMantenimientoActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijoLogic.getMantenimientoActivoFijos()) {
					if(mantenimientoactivofijoAux.getIsSelected()) {
						mantenimientoactivofijosSeleccionados.add(mantenimientoactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MantenimientoActivoFijo mantenimientoactivofijoAux:this.mantenimientoactivofijos) {
					if(mantenimientoactivofijoAux.getIsSelected()) {
						mantenimientoactivofijosSeleccionados.add(mantenimientoactivofijoAux);				
					}
				}
			}
			
			if(mantenimientoactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						mantenimientoactivofijosSeleccionados.addAll(this.mantenimientoactivofijoLogic.getMantenimientoActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						mantenimientoactivofijosSeleccionados.addAll(this.mantenimientoactivofijos);				
					}
				}
			}
		} else {
			mantenimientoactivofijosSeleccionados.add(this.mantenimientoactivofijo);
		}
		
		return mantenimientoactivofijosSeleccionados;
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
	
	public void generarReporteMantenimientoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMantenimientoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMantenimientoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMantenimientoActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMantenimientoActivoFijosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Mantenimiento Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMantenimientoActivoFijosSeleccionados() throws Exception {
		ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();		
		
		mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMantenimientoActivoFijos("Todos",mantenimientoactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalMantenimientoActivoFijosSeleccionados() throws Exception {
		ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();		
		
		mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMantenimientoActivoFijos("Todos",mantenimientoactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMantenimientoActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();
		
		mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMantenimientoActivoFijos("Todos",mantenimientoactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMantenimientoActivoFijosSeleccionados() throws Exception {
		ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMantenimientoActivoFijo();
		
		
		mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMantenimientoActivoFijo();
		
		
		//this.generarReporteMantenimientoActivoFijos("Todos",mantenimientoactivofijosSeleccionados ,mantenimientoactivofijoImplementable,mantenimientoactivofijoImplementableHome);
	}
	
	public void mostrarImportacionMantenimientoActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMantenimientoActivoFijo();
		
		this.abrirFrameImportacionMantenimientoActivoFijo();		
		
			
		//this.generarReporteMantenimientoActivoFijos("Todos",mantenimientoactivofijosSeleccionados ,mantenimientoactivofijoImplementable,mantenimientoactivofijoImplementableHome);
	}
	
	public void importarMantenimientoActivoFijos() throws Exception {		
	
	}
	
	public void exportarMantenimientoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMantenimientoActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMantenimientoActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMantenimientoActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Mantenimiento Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMantenimientoActivoFijosSeleccionados() throws Exception {
		ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();		
		
		mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMantenimientoActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMantenimientoActivoFijo(mantenimientoactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//mantenimientoactivofijoAux.setsDetalleGeneralEntityReporte(mantenimientoactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimiento Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMantenimientoActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=mantenimientoactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getdetalleactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getnumero_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getcausa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getreferencia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.gettaller();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getfecha_entrega().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getresponsable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoactivofijo.getobservacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMantenimientoActivoFijosSeleccionados() throws Exception {
		ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();		
		
		mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("MantenimientoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMantenimientoActivoFijo(row);				
				iRow++;
			}				
			
			for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMantenimientoActivoFijo(mantenimientoactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimiento Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMantenimientoActivoFijosSeleccionados() throws Exception {
		ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();		
		
		mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("mantenimientoactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("mantenimientoactivofijo");
			//elementRoot.appendChild(element);
		
			for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijosSeleccionados) {
				element = document.createElement("mantenimientoactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMantenimientoActivoFijo(mantenimientoactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimiento Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMantenimientoActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getdetalleactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getnumero_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getcausa());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getreferencia());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.gettaller());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getfecha_entrega());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getresponsable());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoactivofijo.getobservacion());				
	}
	
	public void setFilaDatosExportarXmlMantenimientoActivoFijo(MantenimientoActivoFijo mantenimientoactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MantenimientoActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(mantenimientoactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MantenimientoActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(mantenimientoactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MantenimientoActivoFijoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(mantenimientoactivofijo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(MantenimientoActivoFijoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(mantenimientoactivofijo.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementdetalleactivofijo_descripcion = document.createElement(MantenimientoActivoFijoConstantesFunciones.IDDETALLEACTIVOFIJO);
		elementdetalleactivofijo_descripcion.appendChild(document.createTextNode(mantenimientoactivofijo.getdetalleactivofijo_descripcion()));
		element.appendChild(elementdetalleactivofijo_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(MantenimientoActivoFijoConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(mantenimientoactivofijo.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementnumero_documento = document.createElement(MantenimientoActivoFijoConstantesFunciones.NUMERODOCUMENTO);
		elementnumero_documento.appendChild(document.createTextNode(mantenimientoactivofijo.getnumero_documento().trim()));
		element.appendChild(elementnumero_documento);

		Element elementcausa = document.createElement(MantenimientoActivoFijoConstantesFunciones.CAUSA);
		elementcausa.appendChild(document.createTextNode(mantenimientoactivofijo.getcausa().trim()));
		element.appendChild(elementcausa);

		Element elementreferencia = document.createElement(MantenimientoActivoFijoConstantesFunciones.REFERENCIA);
		elementreferencia.appendChild(document.createTextNode(mantenimientoactivofijo.getreferencia().trim()));
		element.appendChild(elementreferencia);

		Element elementtaller = document.createElement(MantenimientoActivoFijoConstantesFunciones.TALLER);
		elementtaller.appendChild(document.createTextNode(mantenimientoactivofijo.gettaller().trim()));
		element.appendChild(elementtaller);

		Element elementtelefono = document.createElement(MantenimientoActivoFijoConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(mantenimientoactivofijo.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementfecha_inicio = document.createElement(MantenimientoActivoFijoConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(mantenimientoactivofijo.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_entrega = document.createElement(MantenimientoActivoFijoConstantesFunciones.FECHAENTREGA);
		elementfecha_entrega.appendChild(document.createTextNode(mantenimientoactivofijo.getfecha_entrega().toString().trim()));
		element.appendChild(elementfecha_entrega);

		Element elementcosto = document.createElement(MantenimientoActivoFijoConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(mantenimientoactivofijo.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementresponsable = document.createElement(MantenimientoActivoFijoConstantesFunciones.RESPONSABLE);
		elementresponsable.appendChild(document.createTextNode(mantenimientoactivofijo.getresponsable().trim()));
		element.appendChild(elementresponsable);

		Element elementobservacion = document.createElement(MantenimientoActivoFijoConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(mantenimientoactivofijo.getobservacion().trim()));
		element.appendChild(elementobservacion);
	}
	
	public void generarReporteGroupGenericoMantenimientoActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados=new ArrayList<MantenimientoActivoFijo>();
		
		mantenimientoactivofijosSeleccionados=this.getMantenimientoActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMantenimientoActivoFijo(mantenimientoactivofijosSeleccionados);
		
		this.generarReporteMantenimientoActivoFijos("Todos",mantenimientoactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMantenimientoActivoFijo(ArrayList<MantenimientoActivoFijo> mantenimientoactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(MantenimientoActivoFijo mantenimientoactivofijoAux:mantenimientoactivofijosSeleccionados) {
				mantenimientoactivofijoAux.setsDetalleGeneralEntityReporte(mantenimientoactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(mantenimientoactivofijoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(mantenimientoactivofijoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(mantenimientoactivofijoAux.getdetalleactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(mantenimientoactivofijoAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(mantenimientoactivofijoAux.getnumero_documento());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_CAUSA)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(mantenimientoactivofijoAux.getcausa());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_REFERENCIA)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(mantenimientoactivofijoAux.getreferencia());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_TALLER)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(mantenimientoactivofijoAux.gettaller());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(mantenimientoactivofijoAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(mantenimientoactivofijoAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_FECHAENTREGA)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(mantenimientoactivofijoAux.getfecha_entrega()));
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_RESPONSABLE)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(mantenimientoactivofijoAux.getresponsable());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoActivoFijoConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					mantenimientoactivofijoAux.setsDescripcionGeneralEntityReporte1(mantenimientoactivofijoAux.getobservacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMantenimientoActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaCancelarMantenimientoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaModificarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaCancelarMantenimientoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaModificarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaCancelarMantenimientoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaModificarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaCancelarMantenimientoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaModificarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaCancelarMantenimientoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaCancelarMantenimientoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaModificarMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaCancelarMantenimientoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MantenimientoActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsMantenimientoActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMantenimientoActivoFijo=false;
			//this.isVisibilidadCeldaVerFormMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarMantenimientoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!mantenimientoactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=false;												
			}
			
			this.jButtonCerrarMantenimientoActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.mantenimientoactivofijo)) {
			this.isVisibilidadCeldaActualizarMantenimientoActivoFijo=false;
			this.isVisibilidadCeldaEliminarMantenimientoActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMantenimientoActivoFijo() {
	}
	
	public void actualizarEstadoPanelsMantenimientoActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoActivoFijo!=null) {
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosMantenimientoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionMantenimientoActivoFijo!=null) {
				this.jPanelPaginacionMantenimientoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMantenimientoActivoFijo!=null) {
				this.jPanelParametrosReportesMantenimientoActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoActivoFijo!=null) {
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosMantenimientoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionMantenimientoActivoFijo!=null) {
				this.jPanelPaginacionMantenimientoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMantenimientoActivoFijo!=null) {
				this.jPanelParametrosReportesMantenimientoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoActivoFijo!=null) {
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosMantenimientoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionMantenimientoActivoFijo!=null) {
				this.jPanelPaginacionMantenimientoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMantenimientoActivoFijo!=null) {
				this.jPanelParametrosReportesMantenimientoActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoActivoFijo!=null) {
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosMantenimientoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionMantenimientoActivoFijo!=null) {
				this.jPanelPaginacionMantenimientoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMantenimientoActivoFijo!=null) {
				this.jPanelParametrosReportesMantenimientoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoActivoFijo!=null) {
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosMantenimientoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionMantenimientoActivoFijo!=null) {
				this.jPanelPaginacionMantenimientoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMantenimientoActivoFijo!=null) {
				this.jPanelParametrosReportesMantenimientoActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoActivoFijo!=null) {
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosMantenimientoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionMantenimientoActivoFijo!=null) {
				this.jPanelPaginacionMantenimientoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMantenimientoActivoFijo!=null) {
				this.jPanelParametrosReportesMantenimientoActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionMantenimientoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoActivoFijo!=null) {
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoActivoFijo!=null) {
				this.jScrollPanelDatosMantenimientoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionMantenimientoActivoFijo!=null) {
				this.jPanelPaginacionMantenimientoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMantenimientoActivoFijo!=null) {
				this.jPanelParametrosReportesMantenimientoActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMantenimientoActivoFijo!=null) {
					this.jTabbedPaneBusquedasMantenimientoActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMantenimientoActivoFijo!=null) {
				this.jPanelParametrosReportesMantenimientoActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.mantenimientoactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoActivoFijo!=null) {
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMantenimientoActivoFijo!=null) {
				this.jPanelParametrosReportesMantenimientoActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasMantenimientoActivoFijo.remove(jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasMantenimientoActivoFijo.remove(jPanelFK_IdTipoMovimientoMantenimientoActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasMantenimientoActivoFijo.remove(jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasMantenimientoActivoFijo.remove(jPanelFK_IdTipoMovimientoMantenimientoActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleActivoFijo(Boolean isParaDetalleActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleActivoFijoNegation=!isParaDetalleActivoFijo;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaDetalleActivoFijo;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasMantenimientoActivoFijo.remove(jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasMantenimientoActivoFijo.remove(jPanelFK_IdTipoMovimientoMantenimientoActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasMantenimientoActivoFijo.remove(jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaTipoMovimiento;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasMantenimientoActivoFijo.remove(jPanelFK_IdTipoMovimientoMantenimientoActivoFijo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//MantenimientoActivoFijoSessionBean mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
		
		if(this.mantenimientoactivofijoSessionBean==null) {
			this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
		}
		
		this.mantenimientoactivofijoSessionBean.setsUltimaBusquedaMantenimientoActivoFijo(this.getsAccionBusqueda());
		this.mantenimientoactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.mantenimientoactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
			mantenimientoactivofijoSessionBean.setid_detalle_activo_fijo(this.getid_detalle_activo_fijoFK_IdDetalleActivoFijo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			mantenimientoactivofijoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			mantenimientoactivofijoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoMovimiento")) {
			mantenimientoactivofijoSessionBean.setid_tipo_movimiento(this.getid_tipo_movimientoFK_IdTipoMovimiento());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//MantenimientoActivoFijoSessionBean mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
		
		if(this.mantenimientoactivofijoSessionBean==null) {
			this.mantenimientoactivofijoSessionBean=new MantenimientoActivoFijoSessionBean();
		}
		
		if(this.mantenimientoactivofijoSessionBean.getsUltimaBusquedaMantenimientoActivoFijo()!=null&&!this.mantenimientoactivofijoSessionBean.getsUltimaBusquedaMantenimientoActivoFijo().equals("")) {
			this.setsAccionBusqueda(mantenimientoactivofijoSessionBean.getsUltimaBusquedaMantenimientoActivoFijo());
			this.setiNumeroPaginacion(mantenimientoactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(mantenimientoactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
				this.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(mantenimientoactivofijoSessionBean.getid_detalle_activo_fijo());
				mantenimientoactivofijoSessionBean.setid_detalle_activo_fijo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(mantenimientoactivofijoSessionBean.getid_empresa());
				mantenimientoactivofijoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(mantenimientoactivofijoSessionBean.getid_sucursal());
				mantenimientoactivofijoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoMovimiento")) {
				this.setid_tipo_movimientoFK_IdTipoMovimiento(mantenimientoactivofijoSessionBean.getid_tipo_movimiento());
				mantenimientoactivofijoSessionBean.setid_tipo_movimiento(-1L);
			}
		}
		
		this.mantenimientoactivofijoSessionBean.setsUltimaBusquedaMantenimientoActivoFijo("");
		this.mantenimientoactivofijoSessionBean.setiNumeroPaginacion(MantenimientoActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.mantenimientoactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaMantenimientoActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMantenimientoActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioMantenimientoActivoFijo();
		this.updateVisibilidadBusquedasFormularioMantenimientoActivoFijo();
		this.updateHabilitarBusquedasFormularioMantenimientoActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioMantenimientoActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMantenimientoActivoFijo.getComponents().length>0) {
	

		if(this.mantenimientoactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoMantenimientoActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasMantenimientoActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoActivoFijo.getComponent(index);
				jPanel.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoMantenimientoActivoFijo);
			}
		}

		if(this.mantenimientoactivofijoConstantesFunciones.resaltarFK_IdTipoMovimientoMantenimientoActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasMantenimientoActivoFijo.indexOfComponent(this.jPanelFK_IdTipoMovimientoMantenimientoActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoActivoFijo.getComponent(index);
				jPanel.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarFK_IdTipoMovimientoMantenimientoActivoFijo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMantenimientoActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMantenimientoActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMantenimientoActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarFK_IdDetalleActivoFijoMantenimientoActivoFijo);
			if(!this.mantenimientoactivofijoConstantesFunciones.mostrarFK_IdDetalleActivoFijoMantenimientoActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.remove(index);
			}

			index= this.jTabbedPaneBusquedasMantenimientoActivoFijo.indexOfComponent(this.jPanelFK_IdTipoMovimientoMantenimientoActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarFK_IdTipoMovimientoMantenimientoActivoFijo);
			if(!this.mantenimientoactivofijoConstantesFunciones.mostrarFK_IdTipoMovimientoMantenimientoActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMantenimientoActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMantenimientoActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMantenimientoActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarFK_IdDetalleActivoFijoMantenimientoActivoFijo);
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.setEnabledAt(index,this.mantenimientoactivofijoConstantesFunciones.activarFK_IdDetalleActivoFijoMantenimientoActivoFijo);
			}

			index= this.jTabbedPaneBusquedasMantenimientoActivoFijo.indexOfComponent(this.jPanelFK_IdTipoMovimientoMantenimientoActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarFK_IdTipoMovimientoMantenimientoActivoFijo);
				this.jTabbedPaneBusquedasMantenimientoActivoFijo.setEnabledAt(index,this.mantenimientoactivofijoConstantesFunciones.activarFK_IdTipoMovimientoMantenimientoActivoFijo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMantenimientoActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdDetalleActivoFijo")) {
			index= this.jTabbedPaneBusquedasMantenimientoActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoMantenimientoActivoFijo);

			this.jTabbedPaneBusquedasMantenimientoActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoActivoFijo.getComponent(index);

			this.mantenimientoactivofijoConstantesFunciones.setResaltarFK_IdDetalleActivoFijoMantenimientoActivoFijo(resaltar);

			jPanel.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoMantenimientoActivoFijo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoMovimiento")) {
			index= this.jTabbedPaneBusquedasMantenimientoActivoFijo.indexOfComponent(this.jPanelFK_IdTipoMovimientoMantenimientoActivoFijo);

			this.jTabbedPaneBusquedasMantenimientoActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoActivoFijo.getComponent(index);

			this.mantenimientoactivofijoConstantesFunciones.setResaltarFK_IdTipoMovimientoMantenimientoActivoFijo(resaltar);

			jPanel.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarFK_IdTipoMovimientoMantenimientoActivoFijo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMantenimientoActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMantenimientoActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMantenimientoActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioMantenimientoActivoFijo();
		this.updateHabilitarResaltarControlesFormularioMantenimientoActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioMantenimientoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.mantenimientoactivofijoConstantesFunciones.resaltaridMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelidMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltaridMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarid_empresaMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarid_empresaMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarid_sucursalMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarid_sucursalMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarid_tipo_movimientoMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarid_tipo_movimientoMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarnumero_documentoMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldnumero_documentoMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarnumero_documentoMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarcausaMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreacausaMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarcausaMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarreferenciaMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreareferenciaMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarreferenciaMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltartallerMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatallerMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltartallerMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltartelefonoMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatelefonoMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltartelefonoMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarfecha_inicioMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_inicioMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarfecha_inicioMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarfecha_entregaMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_entregaMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarfecha_entregaMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarcostoMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldcostoMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarcostoMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarresponsableMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextArearesponsableMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarresponsableMantenimientoActivoFijo);}
		if(this.mantenimientoactivofijoConstantesFunciones.resaltarobservacionMantenimientoActivoFijo!=null && this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreaobservacionMantenimientoActivoFijo.setBorder(this.mantenimientoactivofijoConstantesFunciones.resaltarobservacionMantenimientoActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMantenimientoActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelidMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostraridMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelidMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostraridMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarid_empresaMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelid_empresaMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarid_empresaMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarid_sucursalMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelid_sucursalMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarid_sucursalMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelid_detalle_activo_fijoMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarid_tipo_movimientoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelid_tipo_movimientoMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarid_tipo_movimientoMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldnumero_documentoMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarnumero_documentoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelnumero_documentoMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarnumero_documentoMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreacausaMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarcausaMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelcausaMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarcausaMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreareferenciaMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarreferenciaMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelreferenciaMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarreferenciaMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatallerMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrartallerMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPaneltallerMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrartallerMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatelefonoMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrartelefonoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPaneltelefonoMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrartelefonoMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_inicioMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarfecha_inicioMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelfecha_inicioMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarfecha_inicioMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_entregaMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarfecha_entregaMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelfecha_entregaMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarfecha_entregaMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldcostoMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarcostoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelcostoMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarcostoMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextArearesponsableMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarresponsableMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelresponsableMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarresponsableMantenimientoActivoFijo);
		//this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreaobservacionMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarobservacionMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jPanelobservacionMantenimientoActivoFijo.setVisible(this.mantenimientoactivofijoConstantesFunciones.mostrarobservacionMantenimientoActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMantenimientoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMantenimientoActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jLabelidMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activaridMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_empresaMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarid_empresaMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_sucursalMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarid_sucursalMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_detalle_activo_fijoMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarid_detalle_activo_fijoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jComboBoxid_tipo_movimientoMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarid_tipo_movimientoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldnumero_documentoMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarnumero_documentoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreacausaMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarcausaMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreareferenciaMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarreferenciaMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatallerMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activartallerMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreatelefonoMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activartelefonoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_inicioMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarfecha_inicioMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jDateChooserfecha_entregaMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarfecha_entregaMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextFieldcostoMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarcostoMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextArearesponsableMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarresponsableMantenimientoActivoFijo);
		this.jInternalFrameDetalleFormMantenimientoActivoFijo.jTextAreaobservacionMantenimientoActivoFijo.setEnabled(this.mantenimientoactivofijoConstantesFunciones.activarobservacionMantenimientoActivoFijo);
		}
	}
	
		
}