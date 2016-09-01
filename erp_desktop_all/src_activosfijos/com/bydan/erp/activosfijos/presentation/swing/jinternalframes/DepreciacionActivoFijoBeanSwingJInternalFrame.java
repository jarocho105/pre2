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

import com.bydan.erp.activosfijos.util.DepreciacionActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.DepreciacionActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.DepreciacionActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.DepreciacionActivoFijoBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DepreciacionActivoFijoBeanSwingJInternalFrame extends DepreciacionActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DepreciacionActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DepreciacionActivoFijo> depreciacionactivofijoValidator = new ClassValidator<DepreciacionActivoFijo>(DepreciacionActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DepreciacionActivoFijo depreciacionactivofijo;	
	public DepreciacionActivoFijo depreciacionactivofijoAux;
	public DepreciacionActivoFijo depreciacionactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DepreciacionActivoFijo depreciacionactivofijoTotales;
	public Long idDepreciacionActivoFijoActual;
	public Long iIdNuevoDepreciacionActivoFijo=0L;
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

	public String sFinalQueryComboTipoDepreciacionEmpresa="";

	public List<TipoDepreciacionEmpresa> tipodepreciacionempresasForeignKey;

	public List<TipoDepreciacionEmpresa> gettipodepreciacionempresasForeignKey() {
		return tipodepreciacionempresasForeignKey;
	}

	public void settipodepreciacionempresasForeignKey(List<TipoDepreciacionEmpresa> tipodepreciacionempresasForeignKey) {
		this.tipodepreciacionempresasForeignKey = tipodepreciacionempresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDepreciacionEmpresa tipodepreciacionempresaForeignKey;

	public TipoDepreciacionEmpresa gettipodepreciacionempresaForeignKey() {
		return tipodepreciacionempresaForeignKey;
	}

	public void settipodepreciacionempresaForeignKey(TipoDepreciacionEmpresa tipodepreciacionempresaForeignKey) {
		this.tipodepreciacionempresaForeignKey = tipodepreciacionempresaForeignKey;
	}

	public String sFinalQueryComboEstadoDepreActi="";

	public List<EstadoDepreActi> estadodepreactisForeignKey;

	public List<EstadoDepreActi> getestadodepreactisForeignKey() {
		return estadodepreactisForeignKey;
	}

	public void setestadodepreactisForeignKey(List<EstadoDepreActi> estadodepreactisForeignKey) {
		this.estadodepreactisForeignKey = estadodepreactisForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoDepreActi estadodepreactiForeignKey;

	public EstadoDepreActi getestadodepreactiForeignKey() {
		return estadodepreactiForeignKey;
	}

	public void setestadodepreactiForeignKey(EstadoDepreActi estadodepreactiForeignKey) {
		this.estadodepreactiForeignKey = estadodepreactiForeignKey;
	}

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
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
	
	public Boolean isPermisoTodoDepreciacionActivoFijo;
	public Boolean isPermisoNuevoDepreciacionActivoFijo;
	public Boolean isPermisoActualizarDepreciacionActivoFijo;
	public Boolean isPermisoActualizarOriginalDepreciacionActivoFijo;
	public Boolean isPermisoEliminarDepreciacionActivoFijo;
	public Boolean isPermisoGuardarCambiosDepreciacionActivoFijo;
	public Boolean isPermisoConsultaDepreciacionActivoFijo;
	public Boolean isPermisoBusquedaDepreciacionActivoFijo;
	public Boolean isPermisoReporteDepreciacionActivoFijo;
	public Boolean isPermisoPaginacionMedioDepreciacionActivoFijo;
	public Boolean isPermisoPaginacionAltoDepreciacionActivoFijo;
	public Boolean isPermisoPaginacionTodoDepreciacionActivoFijo;
	public Boolean isPermisoCopiarDepreciacionActivoFijo;
	public Boolean isPermisoVerFormDepreciacionActivoFijo;
	public Boolean isPermisoDuplicarDepreciacionActivoFijo;
	public Boolean isPermisoOrdenDepreciacionActivoFijo;
	
	
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
	
	public DepreciacionActivoFijoParameterReturnGeneral depreciacionactivofijoReturnGeneral;
	public DepreciacionActivoFijoParameterReturnGeneral depreciacionactivofijoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDepreciacionActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioDepreciacionActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DepreciacionActivoFijoSessionBeanAdditional depreciacionactivofijoSessionBeanAdditional=null;
	
	public DepreciacionActivoFijoSessionBeanAdditional getDepreciacionActivoFijoSessionBeanAdditional() {
		return this.depreciacionactivofijoSessionBeanAdditional;
	}
	
	public void setDepreciacionActivoFijoSessionBeanAdditional(DepreciacionActivoFijoSessionBeanAdditional depreciacionactivofijoSessionBeanAdditional) {
		try {
			this.depreciacionactivofijoSessionBeanAdditional=depreciacionactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DepreciacionActivoFijoBeanSwingJInternalFrameAdditional depreciacionactivofijoBeanSwingJInternalFrameAdditional=null;
	//public class DepreciacionActivoFijoBeanSwingJInternalFrame
	
	public DepreciacionActivoFijoBeanSwingJInternalFrameAdditional getDepreciacionActivoFijoBeanSwingJInternalFrameAdditional() {
		return this.depreciacionactivofijoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDepreciacionActivoFijoBeanSwingJInternalFrameAdditional(DepreciacionActivoFijoBeanSwingJInternalFrameAdditional depreciacionactivofijoBeanSwingJInternalFrameAdditional) {
		try {
			this.depreciacionactivofijoBeanSwingJInternalFrameAdditional=depreciacionactivofijoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DepreciacionActivoFijoLogic depreciacionactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DepreciacionActivoFijo depreciacionactivofijoBean;
	public DepreciacionActivoFijoConstantesFunciones depreciacionactivofijoConstantesFunciones;
	//public DepreciacionActivoFijoParameterReturnGeneral depreciacionactivofijoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public DetalleActivoFijoLogic detalleactivofijoLogic;
	public TipoDepreciacionEmpresaLogic tipodepreciacionempresaLogic;
	public EstadoDepreActiLogic estadodepreactiLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<DepreciacionActivoFijo> depreciacionactivofijos;	
	//public List<DepreciacionActivoFijo> depreciacionactivofijosEliminados;
	//public List<DepreciacionActivoFijo> depreciacionactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDepreciacionActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarDepreciacionActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarDepreciacionActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormDepreciacionActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenDepreciacionActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarDepreciacionActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarDepreciacionActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarDepreciacionActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarDepreciacionActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdDepreciacionActivoFijo=false;
	public Boolean isVisibilidadFK_IdDetalleActivoFijo=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoDepreciacionEmpresa=false;
	
	public Long getiIdNuevoDepreciacionActivoFijo() {
		return this.iIdNuevoDepreciacionActivoFijo;
	}

	public void setiIdNuevoDepreciacionActivoFijo(Long iIdNuevoDepreciacionActivoFijo) {
		this.iIdNuevoDepreciacionActivoFijo = iIdNuevoDepreciacionActivoFijo;
	}
	
	public Long getidDepreciacionActivoFijoActual() {
		return this.idDepreciacionActivoFijoActual;
	}

	public void setidDepreciacionActivoFijoActual(Long idDepreciacionActivoFijoActual) {
		this.idDepreciacionActivoFijoActual = idDepreciacionActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DepreciacionActivoFijo getdepreciacionactivofijo() {
		return this.depreciacionactivofijo;
	}

	public void setdepreciacionactivofijo(DepreciacionActivoFijo depreciacionactivofijo) {
		this.depreciacionactivofijo = depreciacionactivofijo;
	}
	
	public DepreciacionActivoFijo getdepreciacionactivofijoAux() {
		return this.depreciacionactivofijoAux;
	}

	public void setdepreciacionactivofijoAux(DepreciacionActivoFijo depreciacionactivofijoAux) {
		this.depreciacionactivofijoAux = depreciacionactivofijoAux;
	}				
	
	public DepreciacionActivoFijo getdepreciacionactivofijoAnterior() {
		return this.depreciacionactivofijoAnterior;
	}

	public void setdepreciacionactivofijoAnterior(DepreciacionActivoFijo depreciacionactivofijoAnterior) {
		this.depreciacionactivofijoAnterior = depreciacionactivofijoAnterior;
	}	
	
	public DepreciacionActivoFijo getdepreciacionactivofijoTotales() {
		return this.depreciacionactivofijoTotales;
	}

	public void setdepreciacionactivofijoTotales(DepreciacionActivoFijo depreciacionactivofijoTotales) {
		this.depreciacionactivofijoTotales = depreciacionactivofijoTotales;
	}	
	
	public DepreciacionActivoFijo getdepreciacionactivofijoBean() {
		return this.depreciacionactivofijoBean;
	}

	public void setdepreciacionactivofijoBean(DepreciacionActivoFijo depreciacionactivofijoBean) {
		this.depreciacionactivofijoBean = depreciacionactivofijoBean;
	}	
	
	public DepreciacionActivoFijoParameterReturnGeneral getdepreciacionactivofijoReturnGeneral() {
		return this.depreciacionactivofijoReturnGeneral;
	}

	public void setdepreciacionactivofijoReturnGeneral(DepreciacionActivoFijoParameterReturnGeneral depreciacionactivofijoReturnGeneral) {
		this.depreciacionactivofijoReturnGeneral = depreciacionactivofijoReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_estado_depre_actiFK_IdDepreciacionActivoFijo=-1L;

	public Long getid_estado_depre_actiFK_IdDepreciacionActivoFijo() {
		return this.id_estado_depre_actiFK_IdDepreciacionActivoFijo;
	}

	public void setid_estado_depre_actiFK_IdDepreciacionActivoFijo(Long id_estado_depre_actiFK_IdDepreciacionActivoFijo) {
		this.id_estado_depre_actiFK_IdDepreciacionActivoFijo = id_estado_depre_actiFK_IdDepreciacionActivoFijo;
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

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa=-1L;

	public Long getid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa() {
		return this.id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa;
	}

	public void setid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa(Long id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa) {
		this.id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa = id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DepreciacionActivoFijoLogic getDepreciacionActivoFijoLogic()	{		
		return depreciacionactivofijoLogic;
	}

	public void setDepreciacionActivoFijoLogic(DepreciacionActivoFijoLogic depreciacionactivofijoLogic) {
		this.depreciacionactivofijoLogic = depreciacionactivofijoLogic;
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
	
	public Boolean getIsEsNuevoDepreciacionActivoFijo() {
		return isEsNuevoDepreciacionActivoFijo;
	}

	public void setIsEsNuevoDepreciacionActivoFijo(Boolean isEsNuevoDepreciacionActivoFijo) {
		this.isEsNuevoDepreciacionActivoFijo = isEsNuevoDepreciacionActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioDepreciacionActivoFijo() {
		return esParaAccionDesdeFormularioDepreciacionActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioDepreciacionActivoFijo(Boolean esParaAccionDesdeFormularioDepreciacionActivoFijo) {
		this.esParaAccionDesdeFormularioDepreciacionActivoFijo = esParaAccionDesdeFormularioDepreciacionActivoFijo;
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

			if(this.depreciacionactivofijoSessionBean==null) {
				this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
			}

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(depreciacionactivofijoSessionBean.getlidEmpresaActual());
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

			if(this.depreciacionactivofijoSessionBean==null) {
				this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
			}

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(depreciacionactivofijoSessionBean.getlidSucursalActual());
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

			if(this.depreciacionactivofijoSessionBean==null) {
				this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
			}

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
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
					detalleactivofijoLogic.getEntityWithConnection(depreciacionactivofijoSessionBean.getlidDetalleActivoFijoActual());
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

	public void cargarCombosTipoDepreciacionEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodepreciacionempresasForeignKey=new ArrayList<TipoDepreciacionEmpresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDepreciacionEmpresaLogic tipodepreciacionempresaLogic=new TipoDepreciacionEmpresaLogic();

			//tipodepreciacionempresaLogic.getTipoDepreciacionEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.depreciacionactivofijoSessionBean==null) {
				this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
			}

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipodepreciacionempresaLogic.getTipoDepreciacionEmpresaDataAccess().setIsForForeingKeyData(true);

					tipodepreciacionempresaLogic.getTodosTipoDepreciacionEmpresasWithConnection(sFinalQuery,new Pagination());

					this.tipodepreciacionempresasForeignKey=tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDepreciacionEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodepreciacionempresaLogic.getEntityWithConnection(depreciacionactivofijoSessionBean.getlidTipoDepreciacionEmpresaActual());
					this.tipodepreciacionempresasForeignKey.add(tipodepreciacionempresaLogic.getTipoDepreciacionEmpresa());
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

	public void cargarCombosEstadoDepreActisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadodepreactisForeignKey=new ArrayList<EstadoDepreActi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoDepreActiLogic estadodepreactiLogic=new EstadoDepreActiLogic();

			//estadodepreactiLogic.getEstadoDepreActiDataAccess().setIsForForeingKeyData(true);

			if(this.depreciacionactivofijoSessionBean==null) {
				this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
			}

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoDepreActi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadodepreactiLogic.getEstadoDepreActiDataAccess().setIsForForeingKeyData(true);

					estadodepreactiLogic.getTodosEstadoDepreActisWithConnection(sFinalQuery,new Pagination());

					this.estadodepreactisForeignKey=estadodepreactiLogic.getEstadoDepreActis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoDepreActi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodepreactiLogic.getEntityWithConnection(depreciacionactivofijoSessionBean.getlidEstadoDepreActiActual());
					this.estadodepreactisForeignKey.add(estadodepreactiLogic.getEstadoDepreActi());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.depreciacionactivofijoSessionBean==null) {
				this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
			}

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(depreciacionactivofijoSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.depreciacionactivofijoSessionBean==null) {
				this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
			}

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(depreciacionactivofijoSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

					if(this.depreciacionactivofijo!=null) {
						this.depreciacionactivofijo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDepreciacionActivoFijo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDepreciacionActivoFijoGenerico)throws Exception
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
				jComboBoxid_empresaDepreciacionActivoFijoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDepreciacionActivoFijoGenerico!=null && jComboBoxid_empresaDepreciacionActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_empresaDepreciacionActivoFijoGenerico.setSelectedIndex(0);
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

					if(this.depreciacionactivofijo!=null) {
						this.depreciacionactivofijo.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDepreciacionActivoFijo.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDepreciacionActivoFijoGenerico)throws Exception
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
				jComboBoxid_sucursalDepreciacionActivoFijoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDepreciacionActivoFijoGenerico!=null && jComboBoxid_sucursalDepreciacionActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDepreciacionActivoFijoGenerico.setSelectedIndex(0);
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

					if(this.depreciacionactivofijo!=null) {
						this.depreciacionactivofijo.setDetalleActivoFijo(detalleactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setSelectedItem(detalleactivofijoTemp);
					}
				} else {
					//jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setSelectedItem(detalleactivofijoTemp);
					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){
					if(detalleactivofijoTemp!=null && jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo!=null) {
						jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setSelectedItem(detalleactivofijoTemp);
					} else {
						if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo!=null) {
							//jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setSelectedItem(detalleactivofijoTemp);
							if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.getItemCount()>0) {
								jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setSelectedIndex(0);
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
	public void setActualDetalleActivoFijoForeignKeyGenerico(Long idDetalleActivoFijoSeleccionado,JComboBox jComboBoxid_detalle_activo_fijoDepreciacionActivoFijoGenerico)throws Exception
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
				jComboBoxid_detalle_activo_fijoDepreciacionActivoFijoGenerico.setSelectedItem(detalleactivofijoTemp);
			} else {
				if(jComboBoxid_detalle_activo_fijoDepreciacionActivoFijoGenerico!=null && jComboBoxid_detalle_activo_fijoDepreciacionActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_detalle_activo_fijoDepreciacionActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDepreciacionEmpresaForeignKey(Long idTipoDepreciacionEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDepreciacionEmpresa  tipodepreciacionempresaTemp=null;

			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresasForeignKey) {
				if(tipodepreciacionempresaAux.getId()!=null && tipodepreciacionempresaAux.getId().equals(idTipoDepreciacionEmpresaSeleccionado)) {
					tipodepreciacionempresaTemp=tipodepreciacionempresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodepreciacionempresaTemp!=null) {

					if(this.depreciacionactivofijo!=null) {
						this.depreciacionactivofijo.setTipoDepreciacionEmpresa(tipodepreciacionempresaTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setSelectedItem(tipodepreciacionempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setSelectedItem(tipodepreciacionempresaTemp);
					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoDepreciacionEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodepreciacionempresaTemp!=null && jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo!=null) {
						jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setSelectedItem(tipodepreciacionempresaTemp);
					} else {
						if(jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo!=null) {
							//jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setSelectedItem(tipodepreciacionempresaTemp);
							if(jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.getItemCount()>0) {
								jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setSelectedIndex(0);
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

	public String getActualTipoDepreciacionEmpresaForeignKeyDescripcion(Long idTipoDepreciacionEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDepreciacionEmpresa  tipodepreciacionempresaTemp=null;

			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresasForeignKey) {
				if(tipodepreciacionempresaAux.getId()!=null && tipodepreciacionempresaAux.getId().equals(idTipoDepreciacionEmpresaSeleccionado)) {
					tipodepreciacionempresaTemp=tipodepreciacionempresaAux;
					break;
				}
			}


			sDescripcion=TipoDepreciacionEmpresaConstantesFunciones.getTipoDepreciacionEmpresaDescripcion(tipodepreciacionempresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDepreciacionEmpresaForeignKeyGenerico(Long idTipoDepreciacionEmpresaSeleccionado,JComboBox jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijoGenerico)throws Exception
	{
		try
		{
			TipoDepreciacionEmpresa  tipodepreciacionempresaTemp=null;

			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresasForeignKey) {
				if(tipodepreciacionempresaAux.getId()!=null && tipodepreciacionempresaAux.getId().equals(idTipoDepreciacionEmpresaSeleccionado)) {
					tipodepreciacionempresaTemp=tipodepreciacionempresaAux;
					break;
				}
			}

			if(tipodepreciacionempresaTemp!=null) {
				jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijoGenerico.setSelectedItem(tipodepreciacionempresaTemp);
			} else {
				if(jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijoGenerico!=null && jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoDepreActiForeignKey(Long idEstadoDepreActiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoDepreActi  estadodepreactiTemp=null;

			for(EstadoDepreActi estadodepreactiAux:estadodepreactisForeignKey) {
				if(estadodepreactiAux.getId()!=null && estadodepreactiAux.getId().equals(idEstadoDepreActiSeleccionado)) {
					estadodepreactiTemp=estadodepreactiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadodepreactiTemp!=null) {

					if(this.depreciacionactivofijo!=null) {
						this.depreciacionactivofijo.setEstadoDepreActi(estadodepreactiTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setSelectedItem(estadodepreactiTemp);
					}
				} else {
					//jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setSelectedItem(estadodepreactiTemp);
					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDepreciacionActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadodepreactiTemp!=null && jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo!=null) {
						jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setSelectedItem(estadodepreactiTemp);
					} else {
						if(jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo!=null) {
							//jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setSelectedItem(estadodepreactiTemp);
							if(jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.getItemCount()>0) {
								jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setSelectedIndex(0);
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

	public String getActualEstadoDepreActiForeignKeyDescripcion(Long idEstadoDepreActiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoDepreActi  estadodepreactiTemp=null;

			for(EstadoDepreActi estadodepreactiAux:estadodepreactisForeignKey) {
				if(estadodepreactiAux.getId()!=null && estadodepreactiAux.getId().equals(idEstadoDepreActiSeleccionado)) {
					estadodepreactiTemp=estadodepreactiAux;
					break;
				}
			}


			sDescripcion=EstadoDepreActiConstantesFunciones.getEstadoDepreActiDescripcion(estadodepreactiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoDepreActiForeignKeyGenerico(Long idEstadoDepreActiSeleccionado,JComboBox jComboBoxid_estado_depre_actiDepreciacionActivoFijoGenerico)throws Exception
	{
		try
		{
			EstadoDepreActi  estadodepreactiTemp=null;

			for(EstadoDepreActi estadodepreactiAux:estadodepreactisForeignKey) {
				if(estadodepreactiAux.getId()!=null && estadodepreactiAux.getId().equals(idEstadoDepreActiSeleccionado)) {
					estadodepreactiTemp=estadodepreactiAux;
					break;
				}
			}

			if(estadodepreactiTemp!=null) {
				jComboBoxid_estado_depre_actiDepreciacionActivoFijoGenerico.setSelectedItem(estadodepreactiTemp);
			} else {
				if(jComboBoxid_estado_depre_actiDepreciacionActivoFijoGenerico!=null && jComboBoxid_estado_depre_actiDepreciacionActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_estado_depre_actiDepreciacionActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.depreciacionactivofijo!=null) {
						this.depreciacionactivofijo.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioDepreciacionActivoFijo.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo!=null) {
						jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo!=null) {
							//jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioDepreciacionActivoFijoGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioDepreciacionActivoFijoGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioDepreciacionActivoFijoGenerico!=null && jComboBoxid_anioDepreciacionActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_anioDepreciacionActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.depreciacionactivofijo!=null) {
						this.depreciacionactivofijo.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesDepreciacionActivoFijo.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesDepreciacionActivoFijo!=null) {
						jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesDepreciacionActivoFijo!=null) {
							//jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesDepreciacionActivoFijoGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesDepreciacionActivoFijoGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesDepreciacionActivoFijoGenerico!=null && jComboBoxid_mesDepreciacionActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_mesDepreciacionActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DepreciacionActivoFijo depreciacionactivofijo,JComboBox jComboBoxid_empresaDepreciacionActivoFijoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDepreciacionActivoFijoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDepreciacionActivoFijoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				depreciacionactivofijo.setid_empresa(empresaAux.getId());
				depreciacionactivofijo.setempresa_descripcion(DepreciacionActivoFijoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				depreciacionactivofijo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DepreciacionActivoFijo depreciacionactivofijo,JComboBox jComboBoxid_sucursalDepreciacionActivoFijoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDepreciacionActivoFijoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDepreciacionActivoFijoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				depreciacionactivofijo.setid_sucursal(sucursalAux.getId());
				depreciacionactivofijo.setsucursal_descripcion(DepreciacionActivoFijoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				depreciacionactivofijo.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleActivoFijoForeignKey(DepreciacionActivoFijo depreciacionactivofijo,JComboBox jComboBoxid_detalle_activo_fijoDepreciacionActivoFijoGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoAux=new DetalleActivoFijo();

			if(jComboBoxid_detalle_activo_fijoDepreciacionActivoFijoGenerico==null) {
				detalleactivofijoAux=(DetalleActivoFijo)this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.getSelectedItem();
			} else {
				detalleactivofijoAux=(DetalleActivoFijo)jComboBoxid_detalle_activo_fijoDepreciacionActivoFijoGenerico.getSelectedItem();
			}

			if(detalleactivofijoAux!=null && detalleactivofijoAux.getId()!=null) {
				depreciacionactivofijo.setid_detalle_activo_fijo(detalleactivofijoAux.getId());
				depreciacionactivofijo.setdetalleactivofijo_descripcion(DepreciacionActivoFijoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoAux));
				depreciacionactivofijo.setDetalleActivoFijo(detalleactivofijoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDepreciacionEmpresaForeignKey(DepreciacionActivoFijo depreciacionactivofijo,JComboBox jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijoGenerico)throws Exception
	{
		try
		{
			TipoDepreciacionEmpresa  tipodepreciacionempresaAux=new TipoDepreciacionEmpresa();

			if(jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijoGenerico==null) {
				tipodepreciacionempresaAux=(TipoDepreciacionEmpresa)this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.getSelectedItem();
			} else {
				tipodepreciacionempresaAux=(TipoDepreciacionEmpresa)jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijoGenerico.getSelectedItem();
			}

			if(tipodepreciacionempresaAux!=null && tipodepreciacionempresaAux.getId()!=null) {
				depreciacionactivofijo.setid_tipo_depreciacion_empresa(tipodepreciacionempresaAux.getId());
				depreciacionactivofijo.settipodepreciacionempresa_descripcion(DepreciacionActivoFijoConstantesFunciones.getTipoDepreciacionEmpresaDescripcion(tipodepreciacionempresaAux));
				depreciacionactivofijo.setTipoDepreciacionEmpresa(tipodepreciacionempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoDepreActiForeignKey(DepreciacionActivoFijo depreciacionactivofijo,JComboBox jComboBoxid_estado_depre_actiDepreciacionActivoFijoGenerico)throws Exception
	{
		try
		{
			EstadoDepreActi  estadodepreactiAux=new EstadoDepreActi();

			if(jComboBoxid_estado_depre_actiDepreciacionActivoFijoGenerico==null) {
				estadodepreactiAux=(EstadoDepreActi)this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.getSelectedItem();
			} else {
				estadodepreactiAux=(EstadoDepreActi)jComboBoxid_estado_depre_actiDepreciacionActivoFijoGenerico.getSelectedItem();
			}

			if(estadodepreactiAux!=null && estadodepreactiAux.getId()!=null) {
				depreciacionactivofijo.setid_estado_depre_acti(estadodepreactiAux.getId());
				depreciacionactivofijo.setestadodepreacti_descripcion(DepreciacionActivoFijoConstantesFunciones.getEstadoDepreActiDescripcion(estadodepreactiAux));
				depreciacionactivofijo.setEstadoDepreActi(estadodepreactiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(DepreciacionActivoFijo depreciacionactivofijo,JComboBox jComboBoxid_anioDepreciacionActivoFijoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioDepreciacionActivoFijoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioDepreciacionActivoFijoGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				depreciacionactivofijo.setid_anio(anioAux.getId());
				depreciacionactivofijo.setanio_descripcion(DepreciacionActivoFijoConstantesFunciones.getAnioDescripcion(anioAux));
				depreciacionactivofijo.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(DepreciacionActivoFijo depreciacionactivofijo,JComboBox jComboBoxid_mesDepreciacionActivoFijoGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesDepreciacionActivoFijoGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesDepreciacionActivoFijoGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				depreciacionactivofijo.setid_mes(mesAux.getId());
				depreciacionactivofijo.setmes_descripcion(DepreciacionActivoFijoConstantesFunciones.getMesDescripcion(mesAux));
				depreciacionactivofijo.setMes(mesAux);			}
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

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
					}

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
					}

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.addItem(detalleactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
					}

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.addItem(detalleactivofijo);
							}
						}

						if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDepreciacionEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDepreciacionEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.removeAllItems();

							for(TipoDepreciacionEmpresa tipodepreciacionempresa:this.tipodepreciacionempresasForeignKey) {
								this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.addItem(tipodepreciacionempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
					}

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoDepreciacionEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.removeAllItems();

							for(TipoDepreciacionEmpresa tipodepreciacionempresa:this.tipodepreciacionempresasForeignKey) {
								this.jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.addItem(tipodepreciacionempresa);
							}
						}

						if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoDepreActisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoDepreActi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.removeAllItems();

							for(EstadoDepreActi estadodepreacti:this.estadodepreactisForeignKey) {
								this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.addItem(estadodepreacti);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
					}

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDepreciacionActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.removeAllItems();

							for(EstadoDepreActi estadodepreacti:this.estadodepreactisForeignKey) {
								this.jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.addItem(estadodepreacti);
							}
						}

						if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
					}

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.addItem(anio);
							}
						}

						if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { 
					}

					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.addItem(mes);
							}
						}

						if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setSelectedItem(detalleactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setSelectedItem(detalleactivofijo);
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoDepreciacionEmpresaForeignKey(TipoDepreciacionEmpresa tipodepreciacionempresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setSelectedItem(tipodepreciacionempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setSelectedItem(tipodepreciacionempresa);
						} else {
							this.jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoDepreActiForeignKey(EstadoDepreActi estadodepreacti,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setSelectedItem(estadodepreacti);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setSelectedItem(estadodepreacti);
						} else {
							this.jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDepreciacionActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DepreciacionActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesDepreciacionActivoFijo(this.depreciacionactivofijoLogic.getDepreciacionActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DepreciacionActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesDepreciacionActivoFijo(this.depreciacionactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(DetalleActivoFijo.class));
		classes.add(new Classe(TipoDepreciacionEmpresa.class));
		classes.add(new Classe(EstadoDepreActi.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//depreciacionactivofijoLogic.setDepreciacionActivoFijos(this.depreciacionactivofijos);
			depreciacionactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DepreciacionActivoFijoParameterReturnGeneral getDepreciacionActivoFijoParameterGeneral() {
		return this.depreciacionactivofijoParameterGeneral;
	}
	
	public void setDepreciacionActivoFijoParameterGeneral(DepreciacionActivoFijoParameterReturnGeneral depreciacionactivofijoParameterGeneral) {
		this.depreciacionactivofijoParameterGeneral = depreciacionactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDepreciacionActivoFijo() {
		return isPermisoTodoDepreciacionActivoFijo;
	}

	public void setIsPermisoTodoDepreciacionActivoFijo(Boolean isPermisoTodoDepreciacionActivoFijo) {
		this.isPermisoTodoDepreciacionActivoFijo = isPermisoTodoDepreciacionActivoFijo;
	}

	public Boolean getIsPermisoNuevoDepreciacionActivoFijo() {
		return isPermisoNuevoDepreciacionActivoFijo;
	}

	public void setIsPermisoNuevoDepreciacionActivoFijo(Boolean isPermisoNuevoDepreciacionActivoFijo) {
		this.isPermisoNuevoDepreciacionActivoFijo = isPermisoNuevoDepreciacionActivoFijo;
	}

	public Boolean getIsPermisoActualizarDepreciacionActivoFijo() {
		return isPermisoActualizarDepreciacionActivoFijo;
	}

	public void setIsPermisoActualizarDepreciacionActivoFijo(Boolean isPermisoActualizarDepreciacionActivoFijo) {
		this.isPermisoActualizarDepreciacionActivoFijo = isPermisoActualizarDepreciacionActivoFijo;
	}

	public Boolean getIsPermisoEliminarDepreciacionActivoFijo() {
		return isPermisoEliminarDepreciacionActivoFijo;
	}

	public void setIsPermisoEliminarDepreciacionActivoFijo(Boolean isPermisoEliminarDepreciacionActivoFijo) {
		this.isPermisoEliminarDepreciacionActivoFijo = isPermisoEliminarDepreciacionActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosDepreciacionActivoFijo() {
		return isPermisoGuardarCambiosDepreciacionActivoFijo;
	}

	public void setIsPermisoGuardarCambiosDepreciacionActivoFijo(Boolean isPermisoGuardarCambiosDepreciacionActivoFijo) {
		this.isPermisoGuardarCambiosDepreciacionActivoFijo = isPermisoGuardarCambiosDepreciacionActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaDepreciacionActivoFijo() {
		return isPermisoConsultaDepreciacionActivoFijo;
	}

	public void setIsPermisoConsultaDepreciacionActivoFijo(Boolean isPermisoConsultaDepreciacionActivoFijo) {
		this.isPermisoConsultaDepreciacionActivoFijo = isPermisoConsultaDepreciacionActivoFijo;
	}

	public Boolean getIsPermisoBusquedaDepreciacionActivoFijo() {
		return isPermisoBusquedaDepreciacionActivoFijo;
	}

	public void setIsPermisoBusquedaDepreciacionActivoFijo(Boolean isPermisoBusquedaDepreciacionActivoFijo) {
		this.isPermisoBusquedaDepreciacionActivoFijo = isPermisoBusquedaDepreciacionActivoFijo;
	}

	public Boolean getIsPermisoReporteDepreciacionActivoFijo() {
		return isPermisoReporteDepreciacionActivoFijo;
	}

	public void setIsPermisoReporteDepreciacionActivoFijo(Boolean isPermisoReporteDepreciacionActivoFijo) {
		this.isPermisoReporteDepreciacionActivoFijo = isPermisoReporteDepreciacionActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioDepreciacionActivoFijo() {
		return isPermisoPaginacionMedioDepreciacionActivoFijo;
	}

	public void setIsPermisoPaginacionMedioDepreciacionActivoFijo(Boolean isPermisoPaginacionMedioDepreciacionActivoFijo) {
		this.isPermisoPaginacionMedioDepreciacionActivoFijo = isPermisoPaginacionMedioDepreciacionActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoDepreciacionActivoFijo() {
		return isPermisoPaginacionTodoDepreciacionActivoFijo;
	}

	public void setIsPermisoPaginacionTodoDepreciacionActivoFijo(Boolean isPermisoPaginacionTodoDepreciacionActivoFijo) {
		this.isPermisoPaginacionTodoDepreciacionActivoFijo = isPermisoPaginacionTodoDepreciacionActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoDepreciacionActivoFijo() {
		return isPermisoPaginacionAltoDepreciacionActivoFijo;
	}

	public void setIsPermisoPaginacionAltoDepreciacionActivoFijo(Boolean isPermisoPaginacionAltoDepreciacionActivoFijo) {
		this.isPermisoPaginacionAltoDepreciacionActivoFijo = isPermisoPaginacionAltoDepreciacionActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarDepreciacionActivoFijo() {
		return isPermisoCopiarDepreciacionActivoFijo;
	}

	public void setIsPermisoCopiarDepreciacionActivoFijo(Boolean isPermisoCopiarDepreciacionActivoFijo) {
		this.isPermisoCopiarDepreciacionActivoFijo = isPermisoCopiarDepreciacionActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormDepreciacionActivoFijo() {
		return isPermisoVerFormDepreciacionActivoFijo;
	}

	public void setIsPermisoVerFormDepreciacionActivoFijo(Boolean isPermisoVerFormDepreciacionActivoFijo) {
		this.isPermisoVerFormDepreciacionActivoFijo = isPermisoVerFormDepreciacionActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarDepreciacionActivoFijo() {
		return isPermisoDuplicarDepreciacionActivoFijo;
	}

	public void setIsPermisoDuplicarDepreciacionActivoFijo(Boolean isPermisoDuplicarDepreciacionActivoFijo) {
		this.isPermisoDuplicarDepreciacionActivoFijo = isPermisoDuplicarDepreciacionActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenDepreciacionActivoFijo() {
		return isPermisoOrdenDepreciacionActivoFijo;
	}

	public void setIsPermisoOrdenDepreciacionActivoFijo(Boolean isPermisoOrdenDepreciacionActivoFijo) {
		this.isPermisoOrdenDepreciacionActivoFijo = isPermisoOrdenDepreciacionActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDepreciacionActivoFijo() {
		return isVisibilidadCeldaNuevoDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoDepreciacionActivoFijo(Boolean isVisibilidadCeldaNuevoDepreciacionActivoFijo) {
		this.isVisibilidadCeldaNuevoDepreciacionActivoFijo = isVisibilidadCeldaNuevoDepreciacionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDepreciacionActivoFijo() {
		return isVisibilidadCeldaDuplicarDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarDepreciacionActivoFijo(Boolean isVisibilidadCeldaDuplicarDepreciacionActivoFijo) {
		this.isVisibilidadCeldaDuplicarDepreciacionActivoFijo = isVisibilidadCeldaDuplicarDepreciacionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDepreciacionActivoFijo() {
		return isVisibilidadCeldaCopiarDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarDepreciacionActivoFijo(Boolean isVisibilidadCeldaCopiarDepreciacionActivoFijo) {
		this.isVisibilidadCeldaCopiarDepreciacionActivoFijo = isVisibilidadCeldaCopiarDepreciacionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDepreciacionActivoFijo() {
		return isVisibilidadCeldaVerFormDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormDepreciacionActivoFijo(Boolean isVisibilidadCeldaVerFormDepreciacionActivoFijo) {
		this.isVisibilidadCeldaVerFormDepreciacionActivoFijo = isVisibilidadCeldaVerFormDepreciacionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDepreciacionActivoFijo() {
		return isVisibilidadCeldaOrdenDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenDepreciacionActivoFijo(Boolean isVisibilidadCeldaOrdenDepreciacionActivoFijo) {
		this.isVisibilidadCeldaOrdenDepreciacionActivoFijo = isVisibilidadCeldaOrdenDepreciacionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo = isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDepreciacionActivoFijo() {
		return isVisibilidadCeldaModificarDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarDepreciacionActivoFijo(Boolean isVisibilidadCeldaModificarDepreciacionActivoFijo) {
		this.isVisibilidadCeldaModificarDepreciacionActivoFijo = isVisibilidadCeldaModificarDepreciacionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDepreciacionActivoFijo() {
		return isVisibilidadCeldaActualizarDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarDepreciacionActivoFijo(Boolean isVisibilidadCeldaActualizarDepreciacionActivoFijo) {
		this.isVisibilidadCeldaActualizarDepreciacionActivoFijo = isVisibilidadCeldaActualizarDepreciacionActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarDepreciacionActivoFijo() {
		return isVisibilidadCeldaEliminarDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarDepreciacionActivoFijo(Boolean isVisibilidadCeldaEliminarDepreciacionActivoFijo) {
		this.isVisibilidadCeldaEliminarDepreciacionActivoFijo = isVisibilidadCeldaEliminarDepreciacionActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarDepreciacionActivoFijo() {
		return isVisibilidadCeldaCancelarDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarDepreciacionActivoFijo(Boolean isVisibilidadCeldaCancelarDepreciacionActivoFijo) {
		this.isVisibilidadCeldaCancelarDepreciacionActivoFijo = isVisibilidadCeldaCancelarDepreciacionActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarDepreciacionActivoFijo() {
		return isVisibilidadCeldaGuardarDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarDepreciacionActivoFijo(Boolean isVisibilidadCeldaGuardarDepreciacionActivoFijo) {
		this.isVisibilidadCeldaGuardarDepreciacionActivoFijo = isVisibilidadCeldaGuardarDepreciacionActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo = isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo;
	}
		
	public DepreciacionActivoFijoSessionBean getdepreciacionactivofijoSessionBean() {
		return this.depreciacionactivofijoSessionBean;
	}
	
	public void setdepreciacionactivofijoSessionBean(DepreciacionActivoFijoSessionBean depreciacionactivofijoSessionBean) {
		this.depreciacionactivofijoSessionBean=depreciacionactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdDepreciacionActivoFijo() {
		return this.isVisibilidadFK_IdDepreciacionActivoFijo;
	}

	public void setisVisibilidadFK_IdDepreciacionActivoFijo(Boolean isVisibilidadFK_IdDepreciacionActivoFijo) {
		this.isVisibilidadFK_IdDepreciacionActivoFijo=isVisibilidadFK_IdDepreciacionActivoFijo;
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

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoDepreciacionEmpresa() {
		return this.isVisibilidadFK_IdTipoDepreciacionEmpresa;
	}

	public void setisVisibilidadFK_IdTipoDepreciacionEmpresa(Boolean isVisibilidadFK_IdTipoDepreciacionEmpresa) {
		this.isVisibilidadFK_IdTipoDepreciacionEmpresa=isVisibilidadFK_IdTipoDepreciacionEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(depreciacionactivofijo,null);
				this.setActualParaGuardarSucursalForeignKey(depreciacionactivofijo,null);
				this.setActualParaGuardarDetalleActivoFijoForeignKey(depreciacionactivofijo,null);
				this.setActualParaGuardarTipoDepreciacionEmpresaForeignKey(depreciacionactivofijo,null);
				this.setActualParaGuardarEstadoDepreActiForeignKey(depreciacionactivofijo,null);
				this.setActualParaGuardarAnioForeignKey(depreciacionactivofijo,null);
				this.setActualParaGuardarMesForeignKey(depreciacionactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(DepreciacionActivoFijo depreciacionactivofijo,DepreciacionActivoFijo depreciacionactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDepreciacionActivoFijo(depreciacionactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		depreciacionactivofijoAux.setId(depreciacionactivofijo.getId());
		depreciacionactivofijoAux.setVersionRow(depreciacionactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDepreciacionActivoFijo();
		
			int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = depreciacionactivofijoValidator.getInvalidValues(this.depreciacionactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			depreciacionactivofijoLogic.setDatosCliente(datosCliente);
			depreciacionactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				depreciacionactivofijoAux=new  DepreciacionActivoFijo();
				
				depreciacionactivofijoAux.setIsNew(true);
				depreciacionactivofijoAux.setIsChanged(true);
				
				depreciacionactivofijoAux.setDepreciacionActivoFijoOriginal(this.depreciacionactivofijo);
				
				depreciacionactivofijoAux.setId(this.depreciacionactivofijo.getId());	
				depreciacionactivofijoAux.setVersionRow(this.depreciacionactivofijo.getVersionRow());	
				depreciacionactivofijoAux.setid_empresa(this.depreciacionactivofijo.getid_empresa());	
				depreciacionactivofijoAux.setid_sucursal(this.depreciacionactivofijo.getid_sucursal());	
				depreciacionactivofijoAux.setid_detalle_activo_fijo(this.depreciacionactivofijo.getid_detalle_activo_fijo());	
				depreciacionactivofijoAux.setid_tipo_depreciacion_empresa(this.depreciacionactivofijo.getid_tipo_depreciacion_empresa());	
				depreciacionactivofijoAux.setid_estado_depre_acti(this.depreciacionactivofijo.getid_estado_depre_acti());	
				depreciacionactivofijoAux.setid_anio(this.depreciacionactivofijo.getid_anio());	
				depreciacionactivofijoAux.setid_mes(this.depreciacionactivofijo.getid_mes());	
				depreciacionactivofijoAux.setfecha_compra(this.depreciacionactivofijo.getfecha_compra());	
				depreciacionactivofijoAux.setfecha_depre_acti(this.depreciacionactivofijo.getfecha_depre_acti());	
				depreciacionactivofijoAux.setporcentaje(this.depreciacionactivofijo.getporcentaje());	
				depreciacionactivofijoAux.setcosto(this.depreciacionactivofijo.getcosto());	
				depreciacionactivofijoAux.setvalor_acumulado(this.depreciacionactivofijo.getvalor_acumulado());	
				depreciacionactivofijoAux.setvalor_total(this.depreciacionactivofijo.getvalor_total());	
				depreciacionactivofijoAux.setvalor_gasto(this.depreciacionactivofijo.getvalor_gasto());	
				depreciacionactivofijoAux.setfecha(this.depreciacionactivofijo.getfecha());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(depreciacionactivofijoAux,depreciacionactivofijoLogic.getDepreciacionActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(depreciacionactivofijoAux,depreciacionactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoLogic.saveDepreciacionActivoFijos();//WithConnection
						//depreciacionactivofijoLogic.getSetVersionRowDepreciacionActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.depreciacionactivofijo,depreciacionactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesDepreciacionActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								depreciacionactivofijoLogic.saveDepreciacionActivoFijoRelaciones(depreciacionactivofijoAux);//WithConnection
								//depreciacionactivofijoLogic.getSetVersionRowDepreciacionActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.depreciacionactivofijo,depreciacionactivofijoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(depreciacionactivofijoAux,depreciacionactivofijoLogic.getDepreciacionActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(depreciacionactivofijoAux,depreciacionactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.depreciacionactivofijo,depreciacionactivofijoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				depreciacionactivofijoAux=new  DepreciacionActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() && this.depreciacionactivofijo.getId()>=0)) {
						
					depreciacionactivofijoAux.setIsNew(false);
				}
				
				depreciacionactivofijoAux.setIsDeleted(false);
			
				depreciacionactivofijoAux.setId(this.depreciacionactivofijo.getId());	
				depreciacionactivofijoAux.setVersionRow(this.depreciacionactivofijo.getVersionRow());	
				depreciacionactivofijoAux.setid_empresa(this.depreciacionactivofijo.getid_empresa());	
				depreciacionactivofijoAux.setid_sucursal(this.depreciacionactivofijo.getid_sucursal());	
				depreciacionactivofijoAux.setid_detalle_activo_fijo(this.depreciacionactivofijo.getid_detalle_activo_fijo());	
				depreciacionactivofijoAux.setid_tipo_depreciacion_empresa(this.depreciacionactivofijo.getid_tipo_depreciacion_empresa());	
				depreciacionactivofijoAux.setid_estado_depre_acti(this.depreciacionactivofijo.getid_estado_depre_acti());	
				depreciacionactivofijoAux.setid_anio(this.depreciacionactivofijo.getid_anio());	
				depreciacionactivofijoAux.setid_mes(this.depreciacionactivofijo.getid_mes());	
				depreciacionactivofijoAux.setfecha_compra(this.depreciacionactivofijo.getfecha_compra());	
				depreciacionactivofijoAux.setfecha_depre_acti(this.depreciacionactivofijo.getfecha_depre_acti());	
				depreciacionactivofijoAux.setporcentaje(this.depreciacionactivofijo.getporcentaje());	
				depreciacionactivofijoAux.setcosto(this.depreciacionactivofijo.getcosto());	
				depreciacionactivofijoAux.setvalor_acumulado(this.depreciacionactivofijo.getvalor_acumulado());	
				depreciacionactivofijoAux.setvalor_total(this.depreciacionactivofijo.getvalor_total());	
				depreciacionactivofijoAux.setvalor_gasto(this.depreciacionactivofijo.getvalor_gasto());	
				depreciacionactivofijoAux.setfecha(this.depreciacionactivofijo.getfecha());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(depreciacionactivofijoAux,depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(depreciacionactivofijoAux,depreciacionactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoLogic.saveDepreciacionActivoFijos();//WithConnection
						//depreciacionactivofijoLogic.getSetVersionRowDepreciacionActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.depreciacionactivofijo,depreciacionactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesDepreciacionActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								depreciacionactivofijoLogic.saveDepreciacionActivoFijoRelaciones(depreciacionactivofijoAux);//WithConnection
								//depreciacionactivofijoLogic.getSetVersionRowDepreciacionActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.depreciacionactivofijo,depreciacionactivofijoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(depreciacionactivofijoAux,depreciacionactivofijoLogic.getDepreciacionActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(depreciacionactivofijoAux,depreciacionactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.depreciacionactivofijo,depreciacionactivofijoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				depreciacionactivofijoAux=new  DepreciacionActivoFijo();
				
				depreciacionactivofijoAux.setIsNew(false);
				depreciacionactivofijoAux.setIsChanged(false);
				
				depreciacionactivofijoAux.setIsDeleted(true);
				
				depreciacionactivofijoAux.setId(this.depreciacionactivofijo.getId());	
				depreciacionactivofijoAux.setVersionRow(this.depreciacionactivofijo.getVersionRow());	
				depreciacionactivofijoAux.setid_empresa(this.depreciacionactivofijo.getid_empresa());	
				depreciacionactivofijoAux.setid_sucursal(this.depreciacionactivofijo.getid_sucursal());	
				depreciacionactivofijoAux.setid_detalle_activo_fijo(this.depreciacionactivofijo.getid_detalle_activo_fijo());	
				depreciacionactivofijoAux.setid_tipo_depreciacion_empresa(this.depreciacionactivofijo.getid_tipo_depreciacion_empresa());	
				depreciacionactivofijoAux.setid_estado_depre_acti(this.depreciacionactivofijo.getid_estado_depre_acti());	
				depreciacionactivofijoAux.setid_anio(this.depreciacionactivofijo.getid_anio());	
				depreciacionactivofijoAux.setid_mes(this.depreciacionactivofijo.getid_mes());	
				depreciacionactivofijoAux.setfecha_compra(this.depreciacionactivofijo.getfecha_compra());	
				depreciacionactivofijoAux.setfecha_depre_acti(this.depreciacionactivofijo.getfecha_depre_acti());	
				depreciacionactivofijoAux.setporcentaje(this.depreciacionactivofijo.getporcentaje());	
				depreciacionactivofijoAux.setcosto(this.depreciacionactivofijo.getcosto());	
				depreciacionactivofijoAux.setvalor_acumulado(this.depreciacionactivofijo.getvalor_acumulado());	
				depreciacionactivofijoAux.setvalor_total(this.depreciacionactivofijo.getvalor_total());	
				depreciacionactivofijoAux.setvalor_gasto(this.depreciacionactivofijo.getvalor_gasto());	
				depreciacionactivofijoAux.setfecha(this.depreciacionactivofijo.getfecha());	
				
				if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.depreciacionactivofijoAux.getId()>=0) {	
						this.depreciacionactivofijosEliminados.add(depreciacionactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(depreciacionactivofijoAux,depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(depreciacionactivofijoAux,depreciacionactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoLogic.saveDepreciacionActivoFijos();//WithConnection
						//depreciacionactivofijoLogic.getSetVersionRowDepreciacionActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								depreciacionactivofijoLogic.saveDepreciacionActivoFijoRelaciones(depreciacionactivofijoAux);//WithConnection
								//depreciacionactivofijoLogic.getSetVersionRowDepreciacionActivoFijos();//WithConnection
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
							if(this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(depreciacionactivofijoAux,depreciacionactivofijoLogic.getDepreciacionActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(depreciacionactivofijoAux,depreciacionactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(this.depreciacionactivofijosEliminados);
					
					depreciacionactivofijoLogic.saveDepreciacionActivoFijos();//WithConnection
					//depreciacionactivofijoLogic.getSetVersionRowDepreciacionActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDepreciacionActivoFijo();
				
				this.depreciacionactivofijosEliminados= new ArrayList<DepreciacionActivoFijo>();		
			}
			
			if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Depreciacion Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Depreciacion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.depreciacionactivofijo=depreciacionactivofijoAux;
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
      		//this.finishProcessDepreciacionActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(DepreciacionActivoFijo depreciacionactivofijoLocal) throws Exception {
		
		if(this.depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DepreciacionActivoFijo depreciacionactivofijoLocal) throws Exception {	
		if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				depreciacionactivofijoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				depreciacionactivofijoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleActivoFijoDetalleFormJInternalFrame.class)) {
				DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrameLocal=(DetalleActivoFijoBeanSwingJInternalFrame) ((DetalleActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detalleactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.getdetalleactivofijo(),true);
				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarLista(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo,this.detalleactivofijosForeignKey);

				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				depreciacionactivofijoLocal.setDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey("Formulario");
				this.setActualDetalleActivoFijoForeignKey(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDepreciacionEmpresaDetalleFormJInternalFrame.class)) {
				TipoDepreciacionEmpresaBeanSwingJInternalFrame tipodepreciacionempresaBeanSwingJInternalFrameLocal=(TipoDepreciacionEmpresaBeanSwingJInternalFrame) ((TipoDepreciacionEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodepreciacionempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDepreciacionEmpresa(tipodepreciacionempresaBeanSwingJInternalFrameLocal.gettipodepreciacionempresa(),true);
				tipodepreciacionempresaBeanSwingJInternalFrameLocal.actualizarLista(tipodepreciacionempresaBeanSwingJInternalFrameLocal.tipodepreciacionempresa,this.tipodepreciacionempresasForeignKey);

				tipodepreciacionempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodepreciacionempresaBeanSwingJInternalFrameLocal.tipodepreciacionempresa);

				depreciacionactivofijoLocal.setTipoDepreciacionEmpresa(tipodepreciacionempresaBeanSwingJInternalFrameLocal.tipodepreciacionempresa);

				this.addItemDefectoCombosForeignKeyTipoDepreciacionEmpresa();
				this.cargarCombosFrameTipoDepreciacionEmpresasForeignKey("Formulario");
				this.setActualTipoDepreciacionEmpresaForeignKey(tipodepreciacionempresaBeanSwingJInternalFrameLocal.tipodepreciacionempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoDepreActiDetalleFormJInternalFrame.class)) {
				EstadoDepreActiBeanSwingJInternalFrame estadodepreactiBeanSwingJInternalFrameLocal=(EstadoDepreActiBeanSwingJInternalFrame) ((EstadoDepreActiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadodepreactiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoDepreActi(estadodepreactiBeanSwingJInternalFrameLocal.getestadodepreacti(),true);
				estadodepreactiBeanSwingJInternalFrameLocal.actualizarLista(estadodepreactiBeanSwingJInternalFrameLocal.estadodepreacti,this.estadodepreactisForeignKey);

				estadodepreactiBeanSwingJInternalFrameLocal.actualizarRelaciones(estadodepreactiBeanSwingJInternalFrameLocal.estadodepreacti);

				depreciacionactivofijoLocal.setEstadoDepreActi(estadodepreactiBeanSwingJInternalFrameLocal.estadodepreacti);

				this.addItemDefectoCombosForeignKeyEstadoDepreActi();
				this.cargarCombosFrameEstadoDepreActisForeignKey("Formulario");
				this.setActualEstadoDepreActiForeignKey(estadodepreactiBeanSwingJInternalFrameLocal.estadodepreacti.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				depreciacionactivofijoLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				depreciacionactivofijoLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDepreciacionActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = depreciacionactivofijoValidator.getInvalidValues(this.depreciacionactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DepreciacionActivoFijo depreciacionactivofijo,List<DepreciacionActivoFijo> depreciacionactivofijos) throws Exception {
		try	{		
			DepreciacionActivoFijoConstantesFunciones.actualizarLista(depreciacionactivofijo,depreciacionactivofijos,this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DepreciacionActivoFijo depreciacionactivofijo,List<DepreciacionActivoFijo> depreciacionactivofijos) throws Exception {
		try	{			
			DepreciacionActivoFijoConstantesFunciones.actualizarSelectedLista(depreciacionactivofijo,depreciacionactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DepreciacionActivoFijo> depreciacionactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				depreciacionactivofijosLocal=this.depreciacionactivofijoLogic.getDepreciacionActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				depreciacionactivofijosLocal=this.depreciacionactivofijos;
			}
			//ARCHITECTURE
		
			for(DepreciacionActivoFijo depreciacionactivofijoLocal:depreciacionactivofijosLocal) {
				if(this.permiteMantenimiento(depreciacionactivofijoLocal) && depreciacionactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DepreciacionActivoFijoConstantesFunciones.getDepreciacionActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_empresaDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_sucursalDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.IDDETALLEACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_detalle_activo_fijoDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.IDTIPODEPRECIACIONEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_tipo_depreciacion_empresaDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.IDESTADODEPREACTI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_estado_depre_actiDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_anioDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_mesDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.FECHACOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelfecha_compraDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.FECHADEPREACTI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelfecha_depre_actiDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelporcentajeDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelcostoDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.VALORACUMULADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelvalor_acumuladoDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.VALORTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelvalor_totalDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.VALORGASTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelvalor_gastoDepreciacionActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DepreciacionActivoFijoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelfechaDepreciacionActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_empresaDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_sucursalDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_detalle_activo_fijoDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_tipo_depreciacion_empresaDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_estado_depre_actiDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_anioDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelid_mesDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelfecha_compraDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelfecha_depre_actiDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelporcentajeDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelcostoDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelvalor_acumuladoDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelvalor_totalDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelvalor_gastoDepreciacionActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelfechaDepreciacionActivoFijo,"");
		
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
		this.iIdNuevoDepreciacionActivoFijo--;	
		
		
		this.depreciacionactivofijoAux=new DepreciacionActivoFijo();
		
		this.depreciacionactivofijoAux.setId(this.iIdNuevoDepreciacionActivoFijo);
		this.depreciacionactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().add(this.depreciacionactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.depreciacionactivofijos.add(this.depreciacionactivofijoAux);
		}
		//ARCHITECTURE
		
		this.depreciacionactivofijo=this.depreciacionactivofijoAux;
		
		if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDepreciacionActivoFijo(this.depreciacionactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyDepreciacionActivoFijo(this.depreciacionactivofijo);
		}
				
		//this.setDefaultControlesDepreciacionActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDepreciacionActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDepreciacionActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDepreciacionActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijoBean,this.depreciacionactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=DepreciacionActivoFijoConstantesFunciones.getClassesRelationshipsOfDepreciacionActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.depreciacionactivofijoReturnGeneral=depreciacionactivofijoLogic.procesarEventosDepreciacionActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.depreciacionactivofijoLogic.getDepreciacionActivoFijos(),this.depreciacionactivofijo,this.depreciacionactivofijoParameterGeneral,this.isEsNuevoDepreciacionActivoFijo,classes);//this.depreciacionactivofijoLogic.getDepreciacionActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDepreciacionActivoFijo(this.depreciacionactivofijoReturnGeneral,this.depreciacionactivofijoBean,false);
		
		if(this.depreciacionactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDepreciacionActivoFijo(this.depreciacionactivofijoReturnGeneral.getDepreciacionActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDepreciacionActivoFijo(this.depreciacionactivofijoReturnGeneral.getDepreciacionActivoFijo());
		}
		
		if(this.depreciacionactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDepreciacionActivoFijo(this.depreciacionactivofijoReturnGeneral.getDepreciacionActivoFijo(),classes);//this.depreciacionactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDepreciacionActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDepreciacionActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.RecargarFormDepreciacionActivoFijo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDepreciacionActivoFijo(false);
						
			if(depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDepreciacionActivoFijo();
			}
			
			this.actualizarVisualTableDatosDepreciacionActivoFijo();
			
			this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(this.getIndiceNuevoDepreciacionActivoFijo(), this.getIndiceNuevoDepreciacionActivoFijo());
			
			this.seleccionarFilaTablaDepreciacionActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDepreciacionActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_compraDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarfecha_compraDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_depre_actiDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarfecha_depre_actiDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldporcentajeDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarporcentajeDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldcostoDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarcostoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_acumuladoDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarvalor_acumuladoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_totalDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarvalor_totalDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_gastoDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarvalor_gastoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfechaDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarfechaDepreciacionActivoFijo);	
		//
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarid_empresaDepreciacionActivoFijo);//
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarid_sucursalDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarid_detalle_activo_fijoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarid_tipo_depreciacion_empresaDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarid_estado_depre_actiDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarid_anioDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.setEnabled(isHabilitar && this.depreciacionactivofijoConstantesFunciones.activarid_mesDepreciacionActivoFijo);
	};
	
	public void setDefaultControlesDepreciacionActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDepreciacionActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.depreciacionactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.depreciacionactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTabbedPaneRelacionesDepreciacionActivoFijo.setVisible(true);
			
					
		} else {
			//this.depreciacionactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.depreciacionactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTabbedPaneRelacionesDepreciacionActivoFijo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDepreciacionActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
				if(depreciacionactivofijoAux.getId().equals(this.iIdNuevoDepreciacionActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijos) {
				if(depreciacionactivofijoAux.getId().equals(this.iIdNuevoDepreciacionActivoFijo)) {
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
	
	public int getIndiceActualDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
				if(depreciacionactivofijoAux.getId().equals(depreciacionactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijos) {
				if(depreciacionactivofijoAux.getId().equals(depreciacionactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
				if(depreciacionactivofijoAux.getDepreciacionActivoFijoOriginal().getId().equals(depreciacionactivofijoOriginal.getId())) {
					existe=true;
					depreciacionactivofijoOriginal.setId(depreciacionactivofijoAux.getId());
					depreciacionactivofijoOriginal.setVersionRow(depreciacionactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijos) {
				if(depreciacionactivofijoAux.getDepreciacionActivoFijoOriginal().getId().equals(depreciacionactivofijoOriginal.getId())) {
					existe=true;
					depreciacionactivofijoOriginal.setId(depreciacionactivofijoAux.getId());
					depreciacionactivofijoOriginal.setVersionRow(depreciacionactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDepreciacionActivoFijo(Boolean esParaCancelar) throws Exception {
		depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
		depreciacionactivofijoAux=new DepreciacionActivoFijo();
		
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
					if(depreciacionactivofijoAux.getId()<0) {
						depreciacionactivofijosAux.add(depreciacionactivofijoAux);
					}		
				}
				this.iIdNuevoDepreciacionActivoFijo=0L;
				this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().removeAll(depreciacionactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijos) {
					if(depreciacionactivofijoAux.getId()<0) {
						depreciacionactivofijosAux.add(depreciacionactivofijoAux);
					}		
				}
				this.iIdNuevoDepreciacionActivoFijo=0L;
				this.depreciacionactivofijos.removeAll(depreciacionactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDepreciacionActivoFijo 
					&& this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()>0
					) {
					depreciacionactivofijoAux=this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().get(this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().size() - 1);
				
					if(depreciacionactivofijoAux.getId()<0) {
						this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().remove(depreciacionactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDepreciacionActivoFijo && this.depreciacionactivofijos.size()>0) {
					depreciacionactivofijoAux=this.depreciacionactivofijos.get(this.depreciacionactivofijos.size() - 1);
				
					if(depreciacionactivofijoAux.getId()<0) {
						this.depreciacionactivofijos.remove(depreciacionactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDepreciacionActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(depreciacionactivofijo.getId()<0) {
				this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().remove(this.depreciacionactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(depreciacionactivofijo.getId()<0) {
				this.depreciacionactivofijos.remove(this.depreciacionactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesDepreciacionActivoFijo(List<DepreciacionActivoFijo> depreciacionactivofijosAux) throws Exception {
		DepreciacionActivoFijoConstantesFunciones.setEstadosInicialesDepreciacionActivoFijo(depreciacionactivofijosAux);
	}
	
	public void setEstadosInicialesDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijoAux) throws Exception {
		DepreciacionActivoFijoConstantesFunciones.setEstadosInicialesDepreciacionActivoFijo(depreciacionactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDepreciacionActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDepreciacionActivoFijoActual()) {
				if(!this.isEsNuevoDepreciacionActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDepreciacionActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDepreciacionActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Depreciacion Activo Fijo ?", "MANTENIMIENTO DE Depreciacion Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DepreciacionActivoFijo depreciacionactivofijo) throws Exception {
		DepreciacionActivoFijoConstantesFunciones.seleccionarAsignar(this.depreciacionactivofijo,depreciacionactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDepreciacionActivoFijo=this.isPermisoActualizarOriginalDepreciacionActivoFijo;
			
			
			this.seleccionarAsignar(depreciacionactivofijo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DepreciacionActivoFijoConstantesFunciones.quitarEspaciosDepreciacionActivoFijo(this.depreciacionactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.depreciacionactivofijoSessionBean.setsFuncionBusquedaRapida(this.depreciacionactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDepreciacionActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDepreciacionActivoFijo(esParaCancelar);				
				this.cancelarNuevoDepreciacionActivoFijo(esParaCancelar);								
			}
			
			this.depreciacionactivofijo=new DepreciacionActivoFijo();
			
			this.inicializarDepreciacionActivoFijo();
			
			this.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDepreciacionActivoFijo() throws Exception {
		try {
			DepreciacionActivoFijoConstantesFunciones.inicializarDepreciacionActivoFijo(this.depreciacionactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDepreciacionActivoFijos(String sAccionBusqueda,List<DepreciacionActivoFijo> depreciacionactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="DepreciacionActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DepreciacionActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DepreciacionActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DepreciacionActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Depreciacion Activo Fijos");		
		parameters.put("busquedapor", DepreciacionActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDepreciacionActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DepreciacionActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DepreciacionActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDepreciacionActivoFijo=new JRBeanArrayDataSource(DepreciacionActivoFijoJInternalFrame.TraerDepreciacionActivoFijoBeans(depreciacionactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDepreciacionActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DepreciacionActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DepreciacionActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DepreciacionActivoFijoBean.TraerDepreciacionActivoFijoBeans(depreciacionactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteDepreciacionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,depreciacionactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDepreciacionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,depreciacionactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijoActionPerformed(null);
					//this.generarExcelReporteDepreciacionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,depreciacionactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDepreciacionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,depreciacionactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDepreciacionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,depreciacionactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDepreciacionActivoFijos(sAccionBusqueda,sTipoArchivoReporte,depreciacionactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDepreciacionActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<DepreciacionActivoFijo> depreciacionactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciacionactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DepreciacionActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDepreciacionActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DepreciacionActivoFijo depreciacionactivofijo : depreciacionactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DepreciacionActivoFijoConstantesFunciones.generarExcelReporteDataDepreciacionActivoFijo("NORMAL",row,workbook,depreciacionactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciacion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDepreciacionActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		DepreciacionActivoFijoConstantesFunciones.generarExcelReporteHeaderDepreciacionActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDepreciacionActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<DepreciacionActivoFijo> depreciacionactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciacionactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DepreciacionActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DepreciacionActivoFijo depreciacionactivofijo : depreciacionactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.getDepreciacionActivoFijoDescripcion(depreciacionactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getdetalleactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.gettipodepreciacionempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getestadodepreacti_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getfecha_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getfecha_depre_acti());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getvalor_acumulado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getvalor_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getvalor_gasto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(depreciacionactivofijo.getfecha());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciacion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDepreciacionActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<DepreciacionActivoFijo> depreciacionactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DepreciacionActivoFijo> depreciacionactivofijosRespaldo=null;
		
		classes=DepreciacionActivoFijoConstantesFunciones.getClassesRelationshipsOfDepreciacionActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.depreciacionactivofijoLogic.setDatosCliente(this.datosCliente);
		this.depreciacionactivofijoLogic.setDatosDeep(this.datosDeep);
		this.depreciacionactivofijoLogic.setIsConDeep(true);
		
		depreciacionactivofijosRespaldo=this.depreciacionactivofijoLogic.getDepreciacionActivoFijos();
		
		this.depreciacionactivofijoLogic.setDepreciacionActivoFijos(depreciacionactivofijosParaReportes);	
		this.depreciacionactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		depreciacionactivofijosParaReportes=this.depreciacionactivofijoLogic.getDepreciacionActivoFijos();
		this.depreciacionactivofijoLogic.setDepreciacionActivoFijos(depreciacionactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciacionactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DepreciacionActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDepreciacionActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DepreciacionActivoFijo depreciacionactivofijo : depreciacionactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDepreciacionActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DepreciacionActivoFijoConstantesFunciones.generarExcelReporteDataDepreciacionActivoFijo("NORMAL",row,workbook,depreciacionactivofijo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.getDepreciacionActivoFijoDescripcion(depreciacionactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciacion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDepreciacionActivoFijo() throws Exception {		
		this.startProcessDepreciacionActivoFijo(true);
	}
	
	public void startProcessDepreciacionActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDepreciacionActivoFijo ,this.jPanelParametrosReportesDepreciacionActivoFijo, this.jScrollPanelDatosDepreciacionActivoFijo,this.jPanelPaginacionDepreciacionActivoFijo, this.jScrollPanelDatosEdicionDepreciacionActivoFijo, this.jPanelAccionesDepreciacionActivoFijo,this.jPanelAccionesFormularioDepreciacionActivoFijo,this.jmenuBarDepreciacionActivoFijo,this.jmenuBarDetalleDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,this.jTtoolBarDetalleDepreciacionActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasDepreciacionActivoFijo=this.jTabbedPaneBusquedasDepreciacionActivoFijo; 
		
		final JPanel jPanelParametrosReportesDepreciacionActivoFijo=this.jPanelParametrosReportesDepreciacionActivoFijo;
		//final JScrollPane jScrollPanelDatosDepreciacionActivoFijo=this.jScrollPanelDatosDepreciacionActivoFijo;
		final JTable jTableDatosDepreciacionActivoFijo=this.jTableDatosDepreciacionActivoFijo;		
		final JPanel jPanelPaginacionDepreciacionActivoFijo=this.jPanelPaginacionDepreciacionActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionDepreciacionActivoFijo=this.jScrollPanelDatosEdicionDepreciacionActivoFijo;
		final JPanel jPanelAccionesDepreciacionActivoFijo=this.jPanelAccionesDepreciacionActivoFijo;
		
		JPanel jPanelCamposAuxiliarDepreciacionActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDepreciacionActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			jPanelCamposAuxiliarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelCamposDepreciacionActivoFijo;
			jPanelAccionesFormularioAuxiliarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelAccionesFormularioDepreciacionActivoFijo;
		}
		
		final JPanel jPanelCamposDepreciacionActivoFijo=jPanelCamposAuxiliarDepreciacionActivoFijo;
		final JPanel jPanelAccionesFormularioDepreciacionActivoFijo=jPanelAccionesFormularioAuxiliarDepreciacionActivoFijo;
		
		
		final JMenuBar jmenuBarDepreciacionActivoFijo=this.jmenuBarDepreciacionActivoFijo;
		final JToolBar jTtoolBarDepreciacionActivoFijo=this.jTtoolBarDepreciacionActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDepreciacionActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDepreciacionActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			jmenuBarDetalleAuxiliarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jmenuBarDetalleDepreciacionActivoFijo;
			jTtoolBarDetalleAuxiliarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTtoolBarDetalleDepreciacionActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleDepreciacionActivoFijo=jmenuBarDetalleAuxiliarDepreciacionActivoFijo;
		final JToolBar jTtoolBarDetalleDepreciacionActivoFijo=jTtoolBarDetalleAuxiliarDepreciacionActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDepreciacionActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDepreciacionActivoFijo;
			processRunnable.jTableDatos=jTableDatosDepreciacionActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposDepreciacionActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionDepreciacionActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesDepreciacionActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDepreciacionActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarDepreciacionActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDepreciacionActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarDepreciacionActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDepreciacionActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDepreciacionActivoFijo ,jPanelParametrosReportesDepreciacionActivoFijo,jTableDatosDepreciacionActivoFijo, /*jScrollPanelDatosDepreciacionActivoFijo,*/jPanelCamposDepreciacionActivoFijo,jPanelPaginacionDepreciacionActivoFijo, /*jScrollPanelDatosEdicionDepreciacionActivoFijo,*/ jPanelAccionesDepreciacionActivoFijo,jPanelAccionesFormularioDepreciacionActivoFijo,jmenuBarDepreciacionActivoFijo,jmenuBarDetalleDepreciacionActivoFijo,jTtoolBarDepreciacionActivoFijo,jTtoolBarDetalleDepreciacionActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDepreciacionActivoFijo ,jPanelParametrosReportesDepreciacionActivoFijo, jScrollPanelDatosDepreciacionActivoFijo,jPanelPaginacionDepreciacionActivoFijo, jScrollPanelDatosEdicionDepreciacionActivoFijo, jPanelAccionesDepreciacionActivoFijo,jPanelAccionesFormularioDepreciacionActivoFijo,jmenuBarDepreciacionActivoFijo,jmenuBarDetalleDepreciacionActivoFijo,jTtoolBarDepreciacionActivoFijo,jTtoolBarDetalleDepreciacionActivoFijo);
						
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
	
	public void finishProcessDepreciacionActivoFijo() {// throws Exception 
		this.finishProcessDepreciacionActivoFijo(true);
	}
	
	public void finishProcessDepreciacionActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDepreciacionActivoFijo ,this.jPanelParametrosReportesDepreciacionActivoFijo, this.jScrollPanelDatosDepreciacionActivoFijo,this.jPanelPaginacionDepreciacionActivoFijo, this.jScrollPanelDatosEdicionDepreciacionActivoFijo, this.jPanelAccionesDepreciacionActivoFijo,this.jPanelAccionesFormularioDepreciacionActivoFijo,this.jmenuBarDepreciacionActivoFijo,this.jmenuBarDetalleDepreciacionActivoFijo,this.jTtoolBarDepreciacionActivoFijo,this.jTtoolBarDetalleDepreciacionActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasDepreciacionActivoFijo=this.jTabbedPaneBusquedasDepreciacionActivoFijo; 
		
		final JPanel jPanelParametrosReportesDepreciacionActivoFijo=this.jPanelParametrosReportesDepreciacionActivoFijo;
		//final JScrollPane jScrollPanelDatosDepreciacionActivoFijo=this.jScrollPanelDatosDepreciacionActivoFijo;
		final JTable jTableDatosDepreciacionActivoFijo=this.jTableDatosDepreciacionActivoFijo;		
		final JPanel jPanelPaginacionDepreciacionActivoFijo=this.jPanelPaginacionDepreciacionActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionDepreciacionActivoFijo=this.jScrollPanelDatosEdicionDepreciacionActivoFijo;
		final JPanel jPanelAccionesDepreciacionActivoFijo=this.jPanelAccionesDepreciacionActivoFijo;
		
		JPanel jPanelCamposAuxiliarDepreciacionActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDepreciacionActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			jPanelCamposAuxiliarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelCamposDepreciacionActivoFijo;
			jPanelAccionesFormularioAuxiliarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelAccionesFormularioDepreciacionActivoFijo;
		}
		
		final JPanel jPanelCamposDepreciacionActivoFijo=jPanelCamposAuxiliarDepreciacionActivoFijo;
		final JPanel jPanelAccionesFormularioDepreciacionActivoFijo=jPanelAccionesFormularioAuxiliarDepreciacionActivoFijo;
		
		
		final JMenuBar jmenuBarDepreciacionActivoFijo=this.jmenuBarDepreciacionActivoFijo;		
		final JToolBar jTtoolBarDepreciacionActivoFijo=this.jTtoolBarDepreciacionActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarDepreciacionActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDepreciacionActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			jmenuBarDetalleAuxiliarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jmenuBarDetalleDepreciacionActivoFijo;
			jTtoolBarDetalleAuxiliarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTtoolBarDetalleDepreciacionActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleDepreciacionActivoFijo=jmenuBarDetalleAuxiliarDepreciacionActivoFijo;
		final JToolBar jTtoolBarDetalleDepreciacionActivoFijo=jTtoolBarDetalleAuxiliarDepreciacionActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDepreciacionActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDepreciacionActivoFijo;
			processRunnable.jTableDatos=jTableDatosDepreciacionActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposDepreciacionActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionDepreciacionActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesDepreciacionActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDepreciacionActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarDepreciacionActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDepreciacionActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarDepreciacionActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDepreciacionActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDepreciacionActivoFijo ,jPanelParametrosReportesDepreciacionActivoFijo, jTableDatosDepreciacionActivoFijo,/*jScrollPanelDatosDepreciacionActivoFijo,*/jPanelCamposDepreciacionActivoFijo,jPanelPaginacionDepreciacionActivoFijo, /*jScrollPanelDatosEdicionDepreciacionActivoFijo,*/ jPanelAccionesDepreciacionActivoFijo,jPanelAccionesFormularioDepreciacionActivoFijo,jmenuBarDepreciacionActivoFijo,jmenuBarDetalleDepreciacionActivoFijo,jTtoolBarDepreciacionActivoFijo,jTtoolBarDetalleDepreciacionActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDepreciacionActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDepreciacionActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDepreciacionActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDepreciacionActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDepreciacionActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDepreciacionActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDepreciacionActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDepreciacionActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDepreciacionActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.depreciacionactivofijoConstantesFunciones.getsFinalQueryDepreciacionActivoFijo();
		String  finalQueryPaginacionTodos=this.depreciacionactivofijoConstantesFunciones.getsFinalQueryDepreciacionActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DepreciacionActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoDepreciacionActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DepreciacionActivoFijoConstantesFunciones.getArrayColumnasGlobalesDepreciacionActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DepreciacionActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.depreciacionactivofijosEliminados= new ArrayList<DepreciacionActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDepreciacionActivoFijo();
		
				///*DepreciacionActivoFijoSessionBean*/this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
			
			if(this.depreciacionactivofijoSessionBean==null) {
				this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
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
					this.iNumeroPaginacion=DepreciacionActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DepreciacionActivoFijoConstantesFunciones.getClassesForeignKeysOfDepreciacionActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/depreciacionactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			depreciacionactivofijosAux= new ArrayList<DepreciacionActivoFijo>();
			
				
			depreciacionactivofijoLogic.setDatosCliente(this.datosCliente);
			depreciacionactivofijoLogic.setDatosDeep(this.datosDeep);
			depreciacionactivofijoLogic.setIsConDeep(true);
			
			
			depreciacionactivofijoLogic.getDepreciacionActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					depreciacionactivofijoLogic.getTodosDepreciacionActivoFijos(finalQueryGlobal,pagination);
					
					//depreciacionactivofijoLogic.getTodosDepreciacionActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(depreciacionactivofijoLogic.getDepreciacionActivoFijos()==null|| depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							depreciacionactivofijosAux= new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijosAux.addAll(depreciacionactivofijoLogic.getDepreciacionActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijosAux= new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijosAux.addAll(depreciacionactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							depreciacionactivofijoLogic.getTodosDepreciacionActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//depreciacionactivofijoLogic.getTodosDepreciacionActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDepreciacionActivoFijos("Todos",depreciacionactivofijoLogic.getDepreciacionActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());					
							depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(depreciacionactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijos=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijos.addAll(depreciacionactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDepreciacionActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDepreciacionActivoFijo=this.idActual;
				
				} else if(this.idDepreciacionActivoFijoActual!=null && this.idDepreciacionActivoFijoActual!=0L) {
					idDepreciacionActivoFijo=idDepreciacionActivoFijoActual;
				}
				
					
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndicePorId(idDepreciacionActivoFijo);
				
				this.depreciacionactivofijos=new ArrayList<DepreciacionActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					depreciacionactivofijoLogic.getEntity(idDepreciacionActivoFijo);
					
					//depreciacionactivofijoLogic.getEntityWithConnection(idDepreciacionActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());
					depreciacionactivofijoLogic.getDepreciacionActivoFijos().add(depreciacionactivofijoLogic.getDepreciacionActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciacionactivofijos=new ArrayList<DepreciacionActivoFijo>();
					this.depreciacionactivofijos.add(depreciacionactivofijo);
				}
				
				if(depreciacionactivofijoLogic.getDepreciacionActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depreciacionactivofijoLogic.getDepreciacionActivoFijos()==null||depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depreciacionactivofijos==null|| depreciacionactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
						depreciacionactivofijosAux.addAll(depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijosAux.addAll(depreciacionactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepreciacionActivoFijos("FK_IdAnio",depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepreciacionActivoFijos("FK_IdAnio",depreciacionactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());
						depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(depreciacionactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijos=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijos.addAll(depreciacionactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDepreciacionActivoFijo")) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDepreciacionActivoFijo(id_estado_depre_actiFK_IdDepreciacionActivoFijo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdDepreciacionActivoFijo(finalQueryGlobal,pagination,id_estado_depre_actiFK_IdDepreciacionActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDepreciacionActivoFijo(id_estado_depre_actiFK_IdDepreciacionActivoFijo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDepreciacionActivoFijo(id_estado_depre_actiFK_IdDepreciacionActivoFijo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depreciacionactivofijoLogic.getDepreciacionActivoFijos()==null||depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depreciacionactivofijos==null|| depreciacionactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
						depreciacionactivofijosAux.addAll(depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijosAux.addAll(depreciacionactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdDepreciacionActivoFijo(finalQueryGlobal,pagination,id_estado_depre_actiFK_IdDepreciacionActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDepreciacionActivoFijo(id_estado_depre_actiFK_IdDepreciacionActivoFijo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDepreciacionActivoFijo(id_estado_depre_actiFK_IdDepreciacionActivoFijo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepreciacionActivoFijos("FK_IdDepreciacionActivoFijo",depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepreciacionActivoFijos("FK_IdDepreciacionActivoFijo",depreciacionactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());
						depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(depreciacionactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijos=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijos.addAll(depreciacionactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDetalleActivoFijo")) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depreciacionactivofijoLogic.getDepreciacionActivoFijos()==null||depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depreciacionactivofijos==null|| depreciacionactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
						depreciacionactivofijosAux.addAll(depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijosAux.addAll(depreciacionactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepreciacionActivoFijos("FK_IdDetalleActivoFijo",depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepreciacionActivoFijos("FK_IdDetalleActivoFijo",depreciacionactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());
						depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(depreciacionactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijos=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijos.addAll(depreciacionactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depreciacionactivofijoLogic.getDepreciacionActivoFijos()==null||depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depreciacionactivofijos==null|| depreciacionactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
						depreciacionactivofijosAux.addAll(depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijosAux.addAll(depreciacionactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepreciacionActivoFijos("FK_IdEmpresa",depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepreciacionActivoFijos("FK_IdEmpresa",depreciacionactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());
						depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(depreciacionactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijos=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijos.addAll(depreciacionactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depreciacionactivofijoLogic.getDepreciacionActivoFijos()==null||depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depreciacionactivofijos==null|| depreciacionactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
						depreciacionactivofijosAux.addAll(depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijosAux.addAll(depreciacionactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepreciacionActivoFijos("FK_IdMes",depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepreciacionActivoFijos("FK_IdMes",depreciacionactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());
						depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(depreciacionactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijos=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijos.addAll(depreciacionactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depreciacionactivofijoLogic.getDepreciacionActivoFijos()==null||depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depreciacionactivofijos==null|| depreciacionactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
						depreciacionactivofijosAux.addAll(depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijosAux.addAll(depreciacionactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepreciacionActivoFijos("FK_IdSucursal",depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepreciacionActivoFijos("FK_IdSucursal",depreciacionactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());
						depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(depreciacionactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijos=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijos.addAll(depreciacionactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoDepreciacionEmpresa")) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdTipoDepreciacionEmpresa(id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdTipoDepreciacionEmpresa(finalQueryGlobal,pagination,id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdTipoDepreciacionEmpresa(id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdTipoDepreciacionEmpresa(id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=depreciacionactivofijoLogic.getDepreciacionActivoFijos()==null||depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=depreciacionactivofijos==null|| depreciacionactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
						depreciacionactivofijosAux.addAll(depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijosAux=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijosAux.addAll(depreciacionactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdTipoDepreciacionEmpresa(finalQueryGlobal,pagination,id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdTipoDepreciacionEmpresa(id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DepreciacionActivoFijoConstantesFunciones.getDetalleIndiceFK_IdTipoDepreciacionEmpresa(id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDepreciacionActivoFijos("FK_IdTipoDepreciacionEmpresa",depreciacionactivofijoLogic.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDepreciacionActivoFijos("FK_IdTipoDepreciacionEmpresa",depreciacionactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());
						depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(depreciacionactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijos=new ArrayList<DepreciacionActivoFijo>();
							depreciacionactivofijos.addAll(depreciacionactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDepreciacionActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDepreciacionActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=depreciacionactivofijoLogic.getDepreciacionActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=depreciacionactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=depreciacionactivofijoLogic.getDepreciacionActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=depreciacionactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DepreciacionActivoFijo depreciacionactivofijo) {
		Boolean permite=true;
		
		if(this.depreciacionactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DepreciacionActivoFijoConstantesFunciones.getOrderByListaDepreciacionActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DepreciacionActivoFijoConstantesFunciones.getOrderByListaDepreciacionActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
				if(depreciacionactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					depreciacionactivofijoTotales=depreciacionactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DepreciacionActivoFijo depreciacionactivofijo:this.depreciacionactivofijos) {
				if(depreciacionactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					depreciacionactivofijoTotales=depreciacionactivofijo;
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
			this.depreciacionactivofijoAux=new DepreciacionActivoFijo();
			this.depreciacionactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.depreciacionactivofijoAux.setIsNew(false);
			this.depreciacionactivofijoAux.setIsChanged(false);
			this.depreciacionactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DepreciacionActivoFijoConstantesFunciones.TotalizarValoresFilaDepreciacionActivoFijo(this.depreciacionactivofijoLogic.getDepreciacionActivoFijos(),this.depreciacionactivofijoAux);
				
				this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().add(this.depreciacionactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DepreciacionActivoFijoConstantesFunciones.TotalizarValoresFilaDepreciacionActivoFijo(this.depreciacionactivofijos,this.depreciacionactivofijoAux);
				
				this.depreciacionactivofijos.add(this.depreciacionactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		depreciacionactivofijoTotales=new DepreciacionActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().remove(depreciacionactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.depreciacionactivofijos.remove(depreciacionactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		depreciacionactivofijoTotales=new DepreciacionActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
				if(depreciacionactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					depreciacionactivofijoTotales=depreciacionactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DepreciacionActivoFijoConstantesFunciones.TotalizarValoresFilaDepreciacionActivoFijo(this.depreciacionactivofijoLogic.getDepreciacionActivoFijos(),depreciacionactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DepreciacionActivoFijo depreciacionactivofijo:this.depreciacionactivofijos) {
				if(depreciacionactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					depreciacionactivofijoTotales=depreciacionactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DepreciacionActivoFijoConstantesFunciones.TotalizarValoresFilaDepreciacionActivoFijo(this.depreciacionactivofijos,depreciacionactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDepreciacionActivoFijosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionActivoFijosFK_IdDepreciacionActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDepreciacionActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionActivoFijosFK_IdDetalleActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionActivoFijosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionActivoFijosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionActivoFijosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDepreciacionActivoFijosFK_IdTipoDepreciacionEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDepreciacionEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDepreciacionActivoFijosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionActivoFijosFK_IdDepreciacionActivoFijo(String sFinalQuery,Long id_estado_depre_acti)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdDepreciacionActivoFijo(sFinalQuery,this.pagination,id_estado_depre_acti);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionActivoFijosFK_IdDetalleActivoFijo(String sFinalQuery,Long id_detalle_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdDetalleActivoFijo(sFinalQuery,this.pagination,id_detalle_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionActivoFijosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionActivoFijosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionActivoFijosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDepreciacionActivoFijosFK_IdTipoDepreciacionEmpresa(String sFinalQuery,Long id_tipo_depreciacion_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depreciacionactivofijoLogic.getDepreciacionActivoFijosFK_IdTipoDepreciacionEmpresa(sFinalQuery,this.pagination,id_tipo_depreciacion_empresa);
				
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
	
	public void inicializarPermisosDepreciacionActivoFijo() {
		this.isPermisoTodoDepreciacionActivoFijo=false;
		this.isPermisoNuevoDepreciacionActivoFijo=false;
		this.isPermisoActualizarDepreciacionActivoFijo=false;
		this.isPermisoActualizarOriginalDepreciacionActivoFijo=false;
		this.isPermisoEliminarDepreciacionActivoFijo=false;
		this.isPermisoGuardarCambiosDepreciacionActivoFijo=false;
		this.isPermisoConsultaDepreciacionActivoFijo=false;
		this.isPermisoBusquedaDepreciacionActivoFijo=false;
		this.isPermisoReporteDepreciacionActivoFijo=false;		
		this.isPermisoOrdenDepreciacionActivoFijo=false;		
		this.isPermisoPaginacionMedioDepreciacionActivoFijo=false;		
		this.isPermisoPaginacionAltoDepreciacionActivoFijo=false;
		this.isPermisoPaginacionTodoDepreciacionActivoFijo=false;
		this.isPermisoCopiarDepreciacionActivoFijo=false;		
		this.isPermisoVerFormDepreciacionActivoFijo=false;		
		this.isPermisoDuplicarDepreciacionActivoFijo=false;		
		this.isPermisoOrdenDepreciacionActivoFijo=false;		
	}
	
	public void setPermisosUsuarioDepreciacionActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoDepreciacionActivoFijo=isPermiso;
		this.isPermisoNuevoDepreciacionActivoFijo=isPermiso;
		this.isPermisoActualizarDepreciacionActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalDepreciacionActivoFijo=isPermiso;
		this.isPermisoEliminarDepreciacionActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosDepreciacionActivoFijo=isPermiso;
		this.isPermisoConsultaDepreciacionActivoFijo=isPermiso;
		this.isPermisoBusquedaDepreciacionActivoFijo=isPermiso;
		this.isPermisoReporteDepreciacionActivoFijo=isPermiso;
		this.isPermisoOrdenDepreciacionActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioDepreciacionActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoDepreciacionActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoDepreciacionActivoFijo=isPermiso;		
		this.isPermisoCopiarDepreciacionActivoFijo=isPermiso;		
		this.isPermisoVerFormDepreciacionActivoFijo=isPermiso;		
		this.isPermisoDuplicarDepreciacionActivoFijo=isPermiso;
		this.isPermisoOrdenDepreciacionActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDepreciacionActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoDepreciacionActivoFijo=isPermiso;
		this.isPermisoNuevoDepreciacionActivoFijo=isPermiso;
		this.isPermisoActualizarDepreciacionActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalDepreciacionActivoFijo=isPermiso;
		this.isPermisoEliminarDepreciacionActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosDepreciacionActivoFijo=isPermiso;
		//this.isPermisoConsultaDepreciacionActivoFijo=isPermiso;
		//this.isPermisoBusquedaDepreciacionActivoFijo=isPermiso;
		//this.isPermisoReporteDepreciacionActivoFijo=isPermiso;
		//this.isPermisoOrdenDepreciacionActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioDepreciacionActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoDepreciacionActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoDepreciacionActivoFijo=isPermiso;		
		//this.isPermisoCopiarDepreciacionActivoFijo=isPermiso;		
		//this.isPermisoDuplicarDepreciacionActivoFijo=isPermiso;
		//this.isPermisoOrdenDepreciacionActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDepreciacionActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DepreciacionActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDepreciacionActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDepreciacionActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDepreciacionActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDepreciacionActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDepreciacionActivoFijoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDepreciacionActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DepreciacionActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DepreciacionActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDepreciacionActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDepreciacionActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDepreciacionActivoFijo=this.isPermisoActualizarDepreciacionActivoFijo;
			this.isPermisoEliminarDepreciacionActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDepreciacionActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDepreciacionActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDepreciacionActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDepreciacionActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDepreciacionActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDepreciacionActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDepreciacionActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDepreciacionActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDepreciacionActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDepreciacionActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDepreciacionActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDepreciacionActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDepreciacionActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDepreciacionActivoFijo.setToolTipText(this.jTableDatosDepreciacionActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDepreciacionActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDepreciacionActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DepreciacionActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DepreciacionActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDepreciacionActivoFijo() throws Exception {
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
	public void inicializarCombosForeignKeyDepreciacionActivoFijoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.detalleactivofijosForeignKey=new ArrayList();
				this.tipodepreciacionempresasForeignKey=new ArrayList();
				this.estadodepreactisForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDepreciacionActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DepreciacionActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDepreciacionActivoFijoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDepreciacionEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoDepreActiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoDepreciacionEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodepreciacionempresasForeignKey==null||this.tipodepreciacionempresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDepreciacionEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoDepreciacionEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDepreciacionEmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDepreciacionEmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDepreciacionEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoDepreActiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadodepreactisForeignKey==null||this.estadodepreactisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoDepreActiConstantesFunciones.getArrayColumnasGlobalesEstadoDepreActi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoDepreActiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoDepreActiConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoDepreActisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDepreciacionActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DepreciacionActivoFijoParameterReturnGeneral depreciacionactivofijoReturnGeneral=new DepreciacionActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.depreciacionactivofijoConstantesFunciones.cargarid_empresaDepreciacionActivoFijo)
					 || (this.esRecargarFks && this.depreciacionactivofijoConstantesFunciones.cargarid_empresaDepreciacionActivoFijo)) {

					if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+depreciacionactivofijoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.depreciacionactivofijoConstantesFunciones.cargarid_sucursalDepreciacionActivoFijo)
					 || (this.esRecargarFks && this.depreciacionactivofijoConstantesFunciones.cargarid_sucursalDepreciacionActivoFijo)) {

					if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+depreciacionactivofijoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalDetalleActivoFijo="";

				if(((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0) && this.depreciacionactivofijoConstantesFunciones.cargarid_detalle_activo_fijoDepreciacionActivoFijo)
					 || (this.esRecargarFks && this.depreciacionactivofijoConstantesFunciones.cargarid_detalle_activo_fijoDepreciacionActivoFijo)) {

					if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleActivoFijo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleActivoFijo=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleActivoFijo, "");
						finalQueryGlobalDetalleActivoFijo+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleActivoFijo=" WHERE " + ConstantesSql.ID + "="+depreciacionactivofijoSessionBean.getlidDetalleActivoFijoActual();
					}
				} else {
					finalQueryGlobalDetalleActivoFijo="NONE";
				}


				String finalQueryGlobalTipoDepreciacionEmpresa="";

				if(((this.tipodepreciacionempresasForeignKey==null||this.tipodepreciacionempresasForeignKey.size()<=0) && this.depreciacionactivofijoConstantesFunciones.cargarid_tipo_depreciacion_empresaDepreciacionActivoFijo)
					 || (this.esRecargarFks && this.depreciacionactivofijoConstantesFunciones.cargarid_tipo_depreciacion_empresaDepreciacionActivoFijo)) {

					if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoDepreciacionEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoDepreciacionEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoDepreciacionEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDepreciacionEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoDepreciacionEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoDepreciacionEmpresa, "");
						finalQueryGlobalTipoDepreciacionEmpresa+=TipoDepreciacionEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoDepreciacionEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoDepreciacionEmpresa=" WHERE " + ConstantesSql.ID + "="+depreciacionactivofijoSessionBean.getlidTipoDepreciacionEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoDepreciacionEmpresa="NONE";
				}


				String finalQueryGlobalEstadoDepreActi="";

				if(((this.estadodepreactisForeignKey==null||this.estadodepreactisForeignKey.size()<=0) && this.depreciacionactivofijoConstantesFunciones.cargarid_estado_depre_actiDepreciacionActivoFijo)
					 || (this.esRecargarFks && this.depreciacionactivofijoConstantesFunciones.cargarid_estado_depre_actiDepreciacionActivoFijo)) {

					if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoDepreActi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoDepreActiConstantesFunciones.getArrayColumnasGlobalesEstadoDepreActi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoDepreActi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoDepreActiConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoDepreActi=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoDepreActi, "");
						finalQueryGlobalEstadoDepreActi+=EstadoDepreActiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoDepreActisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoDepreActi=" WHERE " + ConstantesSql.ID + "="+depreciacionactivofijoSessionBean.getlidEstadoDepreActiActual();
					}
				} else {
					finalQueryGlobalEstadoDepreActi="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.depreciacionactivofijoConstantesFunciones.cargarid_anioDepreciacionActivoFijo)
					 || (this.esRecargarFks && this.depreciacionactivofijoConstantesFunciones.cargarid_anioDepreciacionActivoFijo)) {

					if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+depreciacionactivofijoSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.depreciacionactivofijoConstantesFunciones.cargarid_mesDepreciacionActivoFijo)
					 || (this.esRecargarFks && this.depreciacionactivofijoConstantesFunciones.cargarid_mesDepreciacionActivoFijo)) {

					if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+depreciacionactivofijoSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				depreciacionactivofijoReturnGeneral=depreciacionactivofijoLogic.cargarCombosLoteForeignKeyDepreciacionActivoFijo(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalDetalleActivoFijo,finalQueryGlobalTipoDepreciacionEmpresa,finalQueryGlobalEstadoDepreActi,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=depreciacionactivofijoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=depreciacionactivofijoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalDetalleActivoFijo.equals("NONE")) {
				this.detalleactivofijosForeignKey=depreciacionactivofijoReturnGeneral.getdetalleactivofijosForeignKey();
			}

			if(!finalQueryGlobalTipoDepreciacionEmpresa.equals("NONE")) {
				this.tipodepreciacionempresasForeignKey=depreciacionactivofijoReturnGeneral.gettipodepreciacionempresasForeignKey();
			}

			if(!finalQueryGlobalEstadoDepreActi.equals("NONE")) {
				this.estadodepreactisForeignKey=depreciacionactivofijoReturnGeneral.getestadodepreactisForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=depreciacionactivofijoReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=depreciacionactivofijoReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDepreciacionActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
			this.addItemDefectoCombosForeignKeyTipoDepreciacionEmpresa();
			this.addItemDefectoCombosForeignKeyEstadoDepreActi();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.depreciacionactivofijoSessionBean==null) {
				this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
			}

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
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

	public void addItemDefectoCombosForeignKeyTipoDepreciacionEmpresa()throws Exception {
		try {

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa()) {
				TipoDepreciacionEmpresa tipodepreciacionempresa=new TipoDepreciacionEmpresa();
				TipoDepreciacionEmpresaConstantesFunciones.setTipoDepreciacionEmpresaDescripcion(tipodepreciacionempresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodepreciacionempresa.setId(null);

				if(!TipoDepreciacionEmpresaConstantesFunciones.ExisteEnLista(this.tipodepreciacionempresasForeignKey,tipodepreciacionempresa,true)) {

					this.tipodepreciacionempresasForeignKey.add(0,tipodepreciacionempresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoDepreActi()throws Exception {
		try {

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoDepreActi()) {
				EstadoDepreActi estadodepreacti=new EstadoDepreActi();
				EstadoDepreActiConstantesFunciones.setEstadoDepreActiDescripcion(estadodepreacti,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadodepreacti.setId(null);

				if(!EstadoDepreActiConstantesFunciones.ExisteEnLista(this.estadodepreactisForeignKey,estadodepreacti,true)) {

					this.estadodepreactisForeignKey.add(0,estadodepreacti);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.depreciacionactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDepreciacionActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDepreciacionActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDepreciacionActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.depreciacionactivofijo.setfecha_compra(this.parametroGeneralUsuario.getfecha_sistema());
				this.depreciacionactivofijo.setfecha_depre_acti(this.parametroGeneralUsuario.getfecha_sistema());
				this.depreciacionactivofijo.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDepreciacionActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo)throws Exception {	
		try {
			
			this.setActualDetalleActivoFijoForeignKey(depreciacionactivofijo.getid_detalle_activo_fijo(),false,"Formulario");
			this.setActualTipoDepreciacionEmpresaForeignKey(depreciacionactivofijo.getid_tipo_depreciacion_empresa(),false,"Formulario");
			this.setActualEstadoDepreActiForeignKey(depreciacionactivofijo.getid_estado_depre_acti(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDepreciacionActivoFijo()throws Exception {	
		try {
			
			this.setActualDetalleActivoFijoForeignKey(this.depreciacionactivofijoConstantesFunciones.getid_detalle_activo_fijo(),false,"Formulario");
			this.setActualTipoDepreciacionEmpresaForeignKey(this.depreciacionactivofijoConstantesFunciones.getid_tipo_depreciacion_empresa(),false,"Formulario");
			this.setActualEstadoDepreActiForeignKey(this.depreciacionactivofijoConstantesFunciones.getid_estado_depre_acti(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDepreciacionActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDepreciacionActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDepreciacionActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDepreciacionActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDepreciacionActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
			this.cargarCombosFrameTipoDepreciacionEmpresasForeignKey("Todos");
			this.cargarCombosFrameEstadoDepreActisForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDepreciacionActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDepreciacionEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoDepreActisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDepreciacionActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	














	
	

	public DepreciacionActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DepreciacionActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DepreciacionActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean(); 
		this.depreciacionactivofijoConstantesFunciones=new DepreciacionActivoFijoConstantesFunciones(); 
		this.depreciacionactivofijoBean=new DepreciacionActivoFijo();//(this.depreciacionactivofijoConstantesFunciones); 		
		this.depreciacionactivofijoReturnGeneral=new DepreciacionActivoFijoParameterReturnGeneral(); 
		
		this.depreciacionactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DepreciacionActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DepreciacionActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DepreciacionActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDepreciacionActivoFijo(true);
			
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
			
			this.depreciacionactivofijoConstantesFunciones=new DepreciacionActivoFijoConstantesFunciones(); 
			this.depreciacionactivofijoBean=new DepreciacionActivoFijo();//this.depreciacionactivofijoConstantesFunciones); 			
			this.depreciacionactivofijoReturnGeneral=new DepreciacionActivoFijoParameterReturnGeneral(); 
		
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Depreciacion Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.depreciacionactivofijo=new DepreciacionActivoFijo();
			this.depreciacionactivofijos = new ArrayList<DepreciacionActivoFijo>();
			this.depreciacionactivofijosAux = new ArrayList<DepreciacionActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic=new DepreciacionActivoFijoLogic();
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.depreciacionactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDepreciacionActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDepreciacionActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionDepreciacionActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDepreciacionActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDepreciacionActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDepreciacionActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDepreciacionActivoFijo);
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo);
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDepreciacionActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDepreciacionActivoFijo);
					this.jInternalFrameImportacionDepreciacionActivoFijo.setVisible(false);
					this.jInternalFrameImportacionDepreciacionActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDepreciacionActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDepreciacionActivoFijo);
					this.jInternalFrameOrderByDepreciacionActivoFijo.setVisible(false);
					this.jInternalFrameOrderByDepreciacionActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDepreciacionActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DepreciacionActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.depreciacionactivofijoReturnGeneral=new DepreciacionActivoFijoParameterReturnGeneral();
			
			this.depreciacionactivofijoParameterGeneral=new DepreciacionActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.depreciacionactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DepreciacionActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DepreciacionActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado(),this.depreciacionactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DepreciacionActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado(),this.depreciacionactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaDuplicarDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaCopiarDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaVerFormDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaOrdenDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaModificarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaCancelarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdDepreciacionActivoFijo=true;
			this.isVisibilidadFK_IdDetalleActivoFijo=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoDepreciacionEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDepreciacionActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDepreciacionActivoFijo(false);
			
			this.setPermisosUsuarioDepreciacionActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() && this.depreciacionactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDepreciacionActivoFijoClasesRelacionadas();
			}
			
			if(this.depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDepreciacionActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDepreciacionActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDepreciacionActivoFijo();
			}
			
			if(!this.isPermisoBusquedaDepreciacionActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDepreciacionActivoFijo,this.isPermisoPaginacionMedioDepreciacionActivoFijo,this.isPermisoPaginacionTodoDepreciacionActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DepreciacionActivoFijoConstantesFunciones.getTiposSeleccionarDepreciacionActivoFijo());
				
				this.tiposColumnasSelect=DepreciacionActivoFijoConstantesFunciones.getTiposSeleccionarDepreciacionActivoFijo(true);
				
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
			//if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDepreciacionActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDepreciacionActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDepreciacionActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDepreciacionActivoFijo() ;
			
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
			this.tipodepreciacionempresaLogic=new TipoDepreciacionEmpresaLogic();
			this.estadodepreactiLogic=new EstadoDepreActiLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				depreciacionactivofijoImplementable= (DepreciacionActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DepreciacionActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				depreciacionactivofijoImplementableHome= (DepreciacionActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DepreciacionActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.depreciacionactivofijos= new ArrayList<DepreciacionActivoFijo>();
			this.depreciacionactivofijosEliminados= new ArrayList<DepreciacionActivoFijo>();
						
			this.isEsNuevoDepreciacionActivoFijo=false;
			this.esParaAccionDesdeFormularioDepreciacionActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>() ;
			this.tipodepreciacionempresasForeignKey=new ArrayList<TipoDepreciacionEmpresa>() ;
			this.estadodepreactisForeignKey=new ArrayList<EstadoDepreActi>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDepreciacionActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDepreciacionActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DepreciacionActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDepreciacionActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDepreciacionActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDepreciacionActivoFijo();
			}
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDepreciacionActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDepreciacionActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDepreciacionActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDepreciacionActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DepreciacionActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDepreciacionActivoFijo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDepreciacionActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTabbedPaneRelacionesDepreciacionActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTabbedPaneRelacionesDepreciacionActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDepreciacionActivoFijo();	
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
	
	public void cargarCombosForeignKeyDepreciacionActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDepreciacionActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDepreciacionActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDepreciacionActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDepreciacionActivoFijo();
		
		this.cargarCombosFrameForeignKeyDepreciacionActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDepreciacionActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDepreciacionActivoFijo();
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

	public void cargarCombosForeignKeyTipoDepreciacionEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDepreciacionEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDepreciacionEmpresa();
				this.cargarCombosFrameTipoDepreciacionEmpresasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDepreciacionEmpresa(this.tipodepreciacionempresasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoDepreActi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoDepreActiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoDepreActi();
				this.cargarCombosFrameEstadoDepreActisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoDepreActi(this.estadodepreactisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDepreciacionActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
			
			if(jTableDatosDepreciacionActivoFijo.getRowCount()>=1) {
				jTableDatosDepreciacionActivoFijo.removeRowSelectionInterval(0, jTableDatosDepreciacionActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoDepreciacionActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDepreciacionActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDepreciacionActivoFijo(true);			
			//this.depreciacionactivofijo=new DepreciacionActivoFijo();
			//this.depreciacionactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDepreciacionActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepreciacionActivoFijo() ;
			
			if(DepreciacionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDepreciacionActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.depreciacionactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);				
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
			if(this.depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DepreciacionActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDepreciacionActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDepreciacionActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDepreciacionActivoFijo.getSelectedRows().length;			
			}
			
			depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDepreciacionActivoFijo--;			
				//DepreciacionActivoFijo depreciacionactivofijoAux= new DepreciacionActivoFijo();			
				//depreciacionactivofijoAux.setId(this.iIdNuevoDepreciacionActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DepreciacionActivoFijo depreciacionactivofijoOrigen=new DepreciacionActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DepreciacionActivoFijo depreciacionactivofijoOrigen : depreciacionactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							depreciacionactivofijoOrigen =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							depreciacionactivofijoOrigen =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDepreciacionActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.depreciacionactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDepreciacionActivoFijo(depreciacionactivofijoOrigen,this.depreciacionactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().add(this.depreciacionactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijos.add(this.depreciacionactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
				
				this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(this.getIndiceNuevoDepreciacionActivoFijo(), this.getIndiceNuevoDepreciacionActivoFijo());
				
				int iLastRow =  this.jTableDatosDepreciacionActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDepreciacionActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDepreciacionActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();									
		
			DepreciacionActivoFijo depreciacionactivofijoOrigen=new DepreciacionActivoFijo();
			DepreciacionActivoFijo depreciacionactivofijoDestino=new DepreciacionActivoFijo();
				
			depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDepreciacionActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || depreciacionactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDepreciacionActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoOrigen =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						depreciacionactivofijoOrigen =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						depreciacionactivofijoDestino =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						depreciacionactivofijoDestino =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				depreciacionactivofijoOrigen =depreciacionactivofijosSeleccionados.get(0);
				depreciacionactivofijoDestino =depreciacionactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDepreciacionActivoFijo(depreciacionactivofijoOrigen,depreciacionactivofijoDestino,true,false);
				
				depreciacionactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(depreciacionactivofijoDestino,depreciacionactivofijoLogic.getDepreciacionActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(depreciacionactivofijoDestino,depreciacionactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
				
				//this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(this.getIndiceNuevoDepreciacionActivoFijo(), this.getIndiceNuevoDepreciacionActivoFijo());
				
				int iLastRow =  this.jTableDatosDepreciacionActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDepreciacionActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDepreciacionActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDepreciacionActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDepreciacionActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDepreciacionActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionDepreciacionActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesDepreciacionActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDepreciacionActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDepreciacionActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDepreciacionActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDepreciacionActivoFijo();
			
			this.abrirFrameOrderByDepreciacionActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDepreciacionActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDepreciacionActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDepreciacionActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormDepreciacionActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDepreciacionActivoFijo.setSize(this.jInternalFrameDetalleFormDepreciacionActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormDepreciacionActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDepreciacionActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDepreciacionActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDepreciacionActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormDepreciacionActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jContentPaneDetalleDepreciacionActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTabbedPaneRelacionesDepreciacionActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jContentPaneDetalleDepreciacionActivoFijo.getWidth(),DepreciacionActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTabbedPaneRelacionesDepreciacionActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jContentPaneDetalleDepreciacionActivoFijo.getWidth(),DepreciacionActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTabbedPaneRelacionesDepreciacionActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jContentPaneDetalleDepreciacionActivoFijo.getWidth(),DepreciacionActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDepreciacionActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormDepreciacionActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDepreciacionActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDepreciacionActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDepreciacionActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepreciacionActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByDepreciacionActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDepreciacionActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDepreciacionActivoFijo);
				this.jInternalFrameOrderByDepreciacionActivoFijo.setVisible(false);
				this.jInternalFrameOrderByDepreciacionActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByDepreciacionActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDepreciacionActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByDepreciacionActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDepreciacionActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDepreciacionActivoFijo==null) {
				
				this.jInternalFrameImportacionDepreciacionActivoFijo=new ImportacionJInternalFrame(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDepreciacionActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDepreciacionActivoFijo);
				this.jInternalFrameImportacionDepreciacionActivoFijo.setVisible(false);
				this.jInternalFrameImportacionDepreciacionActivoFijo.setSelected(false);


				this.jInternalFrameImportacionDepreciacionActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDepreciacionActivoFijo"));
				this.jInternalFrameImportacionDepreciacionActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDepreciacionActivoFijo"));
				this.jInternalFrameImportacionDepreciacionActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDepreciacionActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDepreciacionActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo==null) {
				this.jInternalFrameReporteDinamicoDepreciacionActivoFijo=new ReporteDinamicoJInternalFrame(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDepreciacionActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo);
				this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDepreciacionActivoFijo"));
				this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDepreciacionActivoFijo"));
				this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDepreciacionActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDepreciacionActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDepreciacionActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDepreciacionActivoFijo);
			
	       	this.jInternalFrameDetalleFormDepreciacionActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormDepreciacionActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormDepreciacionActivoFijo.dispose();
			//this.jInternalFrameDetalleFormDepreciacionActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDepreciacionActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDepreciacionActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDepreciacionActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionDepreciacionActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDepreciacionActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDepreciacionActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByDepreciacionActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDepreciacionActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDepreciacionActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByDepreciacionActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDepreciacionActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDepreciacionActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDepreciacionActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionDepreciacionActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDepreciacionActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDepreciacionActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDepreciacionActivoFijo(true);
			//this.isEsNuevoDepreciacionActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDepreciacionActivoFijo(false) ;
			
			if(depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DepreciacionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDepreciacionActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepreciacionActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDepreciacionActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDepreciacionActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDepreciacionActivoFijo(true);
			//this.isEsNuevoDepreciacionActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.depreciacionactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDepreciacionActivoFijo(false) ;
			
			if(DepreciacionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDepreciacionActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepreciacionActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaDetalleActivoFijo(List<DetalleActivoFijo> detalleactivofijosForeignKey)throws Exception{
		TableColumn tableColumnDetalleActivoFijo=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));
		TableCellEditor tableCellEditorDetalleActivoFijo =tableColumnDetalleActivoFijo.getCellEditor();

		DetalleActivoFijoTableCell detalleactivofijoTableCellFk=(DetalleActivoFijoTableCell)tableCellEditorDetalleActivoFijo;

		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.setdetalleactivofijosForeignKey(detalleactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detalleactivofijoTableCellFk.setRowActual(intSelectedRow);
			//detalleactivofijoTableCellFk.setdetalleactivofijosForeignKeyActual(detalleactivofijosForeignKey);
		//}


		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.RecargarDetalleActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoDepreciacionEmpresa(List<TipoDepreciacionEmpresa> tipodepreciacionempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoDepreciacionEmpresa=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA));
		TableCellEditor tableCellEditorTipoDepreciacionEmpresa =tableColumnTipoDepreciacionEmpresa.getCellEditor();

		TipoDepreciacionEmpresaTableCell tipodepreciacionempresaTableCellFk=(TipoDepreciacionEmpresaTableCell)tableCellEditorTipoDepreciacionEmpresa;

		if(tipodepreciacionempresaTableCellFk!=null) {
			tipodepreciacionempresaTableCellFk.settipodepreciacionempresasForeignKey(tipodepreciacionempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodepreciacionempresaTableCellFk.setRowActual(intSelectedRow);
			//tipodepreciacionempresaTableCellFk.settipodepreciacionempresasForeignKeyActual(tipodepreciacionempresasForeignKey);
		//}


		if(tipodepreciacionempresaTableCellFk!=null) {
			tipodepreciacionempresaTableCellFk.RecargarTipoDepreciacionEmpresasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoDepreActi(List<EstadoDepreActi> estadodepreactisForeignKey)throws Exception{
		TableColumn tableColumnEstadoDepreActi=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI));
		TableCellEditor tableCellEditorEstadoDepreActi =tableColumnEstadoDepreActi.getCellEditor();

		EstadoDepreActiTableCell estadodepreactiTableCellFk=(EstadoDepreActiTableCell)tableCellEditorEstadoDepreActi;

		if(estadodepreactiTableCellFk!=null) {
			estadodepreactiTableCellFk.setestadodepreactisForeignKey(estadodepreactisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadodepreactiTableCellFk.setRowActual(intSelectedRow);
			//estadodepreactiTableCellFk.setestadodepreactisForeignKeyActual(estadodepreactisForeignKey);
		//}


		if(estadodepreactiTableCellFk!=null) {
			estadodepreactiTableCellFk.RecargarEstadoDepreActisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDepreciacionActivoFijo(false);
			
			//if(!this.isEsNuevoDepreciacionActivoFijo) {								
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.depreciacionactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDepreciacionActivoFijo=true;
					this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
					this.isEsNuevoDepreciacionActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDepreciacionActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDepreciacionActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDepreciacionActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDepreciacionActivoFijo(false);
				
				this.habilitarDeshabilitarControlesDepreciacionActivoFijo(false);
			
												
				
				if(DepreciacionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDepreciacionActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,depreciacionactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDepreciacionActivoFijo(this.depreciacionactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,depreciacionactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.depreciacionactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DepreciacionActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepreciacionActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.depreciacionactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.depreciacionactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.depreciacionactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DepreciacionActivoFijoModel) this.jTableDatosDepreciacionActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDepreciacionActivoFijo=true;
				this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
				this.isEsNuevoDepreciacionActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDepreciacionActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDepreciacionActivoFijo(false);
				
				this.habilitarDeshabilitarControlesDepreciacionActivoFijo(false);
				
				
				
				if(DepreciacionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDepreciacionActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDepreciacionActivoFijo.getRowCount()>=1) {
				jTableDatosDepreciacionActivoFijo.removeRowSelectionInterval(0, jTableDatosDepreciacionActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDepreciacionActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDepreciacionActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDepreciacionActivoFijo(false) ;
			
			this.isEsNuevoDepreciacionActivoFijo=false;
			
			if(DepreciacionActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDepreciacionActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				
				//SI ES MANUAL
				if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDepreciacionActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDepreciacionActivoFijo--;			
			//DepreciacionActivoFijo depreciacionactivofijoAux= new DepreciacionActivoFijo();			
			//depreciacionactivofijoAux.setId(this.iIdNuevoDepreciacionActivoFijo);
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDepreciacionActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
			
			this.depreciacionactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().add(this.depreciacionactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.depreciacionactivofijos.add(this.depreciacionactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
			
			this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(this.getIndiceNuevoDepreciacionActivoFijo(), this.getIndiceNuevoDepreciacionActivoFijo());
			
			int iLastRow =  this.jTableDatosDepreciacionActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDepreciacionActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDepreciacionActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepreciacionActivoFijo(false);
			
			//SI ES MANUAL
			if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDepreciacionActivoFijo();
			}
			
			//this.abrirFrameTreeDepreciacionActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Depreciacion Activo FijoS ?", "MANTENIMIENTO DE Depreciacion Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDepreciacionActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDepreciacionActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.depreciacionactivofijoReturnGeneral=depreciacionactivofijoLogic.procesarImportacionDepreciacionActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.depreciacionactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDepreciacionActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDepreciacionActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDepreciacionActivoFijo.setFileImportacion(this.jInternalFrameImportacionDepreciacionActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDepreciacionActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDepreciacionActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDepreciacionActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDepreciacionActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();		

		depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DepreciacionActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DepreciacionActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteDepreciacionActivoFijos("Todos",depreciacionactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciacion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleActivoFijo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDepreciacionEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDepreciacionEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDepreciacionEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDepreciacionEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoDepreActi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoDepreActi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoDepreActi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoDepreActi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaDepreActi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaDepreActi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaDepreActi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaDepreActi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorAcumulado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorAcumulado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorAcumulado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorAcumulado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorGasto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorGasto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorGasto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorGasto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoria="id_detalle_activo_fijo";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA:
					sNombreCampoCategoria="id_tipo_depreciacion_empresa";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI:
					sNombreCampoCategoria="id_estado_depre_acti";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoria="fecha_compra";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI:
					sNombreCampoCategoria="fecha_depre_acti";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO:
					sNombreCampoCategoria="valor_acumulado";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL:
					sNombreCampoCategoria="valor_total";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO:
					sNombreCampoCategoria="valor_gasto";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoriaValor="id_detalle_activo_fijo";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA:
					sNombreCampoCategoriaValor="id_tipo_depreciacion_empresa";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI:
					sNombreCampoCategoriaValor="id_estado_depre_acti";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoriaValor="fecha_compra";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI:
					sNombreCampoCategoriaValor="fecha_depre_acti";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO:
					sNombreCampoCategoriaValor="valor_acumulado";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL:
					sNombreCampoCategoriaValor="valor_total";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO:
					sNombreCampoCategoriaValor="valor_gasto";
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_activo_fijo");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Depreciacion Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_depreciacion_empresa");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Depre Acti",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_depre_acti");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_compra");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Depre Acti",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_depre_acti");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Acumulado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_acumulado");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_total");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Gasto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_gasto");
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
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
	
	public void jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();		
		
		depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciacionactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DepreciacionActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getdetalleactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.gettipodepreciacionempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getestadodepreacti_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getfecha_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getfecha_depre_acti());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getvalor_acumulado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getvalor_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getvalor_gasto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(DepreciacionActivoFijo depreciacionactivofijo:depreciacionactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(depreciacionactivofijo.getfecha());
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
			//	this.getFilaCabeceraExportarExcelDepreciacionActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDepreciacionActivoFijo(depreciacionactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciacion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepreciacionActivoFijo(false);
			
			//SI ES MANUAL
			if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDepreciacionActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepreciacionActivoFijo(false);
			
			//SI ES MANUAL
			if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDepreciacionActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDepreciacionActivoFijo(false);
			
			//SI ES MANUAL
			if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDepreciacionActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDepreciacionActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDepreciacionActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDepreciacionActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDepreciacionActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDepreciacionActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDepreciacionActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosDepreciacionActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosDepreciacionActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDepreciacionActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDepreciacionActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDepreciacionActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDepreciacionActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDepreciacionActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDepreciacionActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDepreciacionActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDepreciacionActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDepreciacionActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDepreciacionActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualDepreciacionActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDepreciacionActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDepreciacionActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDepreciacionActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDepreciacionActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDepreciacionActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDepreciacionActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jCheckBoxPostAccionNuevoDepreciacionActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jCheckBoxPostAccionSinCerrarDepreciacionActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jCheckBoxPostAccionSinMensajeDepreciacionActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDepreciacionActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDepreciacionActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jCheckBoxPostAccionNuevoDepreciacionActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jCheckBoxPostAccionSinCerrarDepreciacionActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jCheckBoxPostAccionSinMensajeDepreciacionActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDepreciacionActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDepreciacionActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDepreciacionActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDepreciacionActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDepreciacionActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDepreciacionActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDepreciacionActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDepreciacionActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDepreciacionActivoFijo() throws Exception {
		try	{
			if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDepreciacionActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDepreciacionActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDepreciacionActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDepreciacionActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDepreciacionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDepreciacionActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDepreciacionActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDepreciacionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDepreciacionActivoFijo.addItem(reporte);
			}
			
			
			if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDepreciacionActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDepreciacionActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDepreciacionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDepreciacionActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDepreciacionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDepreciacionActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDepreciacionActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDepreciacionActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DepreciacionActivoFijoConstantesFunciones.getTiposSeleccionarDepreciacionActivoFijo(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DepreciacionActivoFijoConstantesFunciones.getTiposSeleccionarDepreciacionActivoFijo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DepreciacionActivoFijoConstantesFunciones.getTiposSeleccionarDepreciacionActivoFijo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDepreciacionActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioDepreciacionActivoFijo.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.getSelectedItem()!=null){this.id_estado_depre_actiFK_IdDepreciacionActivoFijo=((EstadoDepreActi)this.jComboBoxid_estado_depre_actiFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.getSelectedItem()).getId();}
		if(this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.getSelectedItem()!=null){this.id_detalle_activo_fijoFK_IdDetalleActivoFijo=((DetalleActivoFijo)this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoDepreciacionActivoFijo.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesDepreciacionActivoFijo.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.getSelectedItem()!=null){this.id_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa=((TipoDepreciacionEmpresa)this.jComboBoxid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDepreciacionActivoFijo(Boolean esInicializar) throws Exception {				
		if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDepreciacionActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDepreciacionActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDepreciacionActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDepreciacionActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDepreciacionActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=depreciacionactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDepreciacionActivoFijo.setModel(new DepreciacionActivoFijoModel(this.depreciacionactivofijoLogic.getDepreciacionActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDepreciacionActivoFijo.setModel(new DepreciacionActivoFijoModel(this.depreciacionactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDepreciacionActivoFijo!=null && this.jInternalFrameOrderByDepreciacionActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDepreciacionActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO,depreciacionactivofijoConstantesFunciones.resaltarSeleccionarDepreciacionActivoFijo,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO,depreciacionactivofijoConstantesFunciones.resaltarSeleccionarDepreciacionActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_ID));

		if(this.depreciacionactivofijoConstantesFunciones.mostraridDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depreciacionactivofijoConstantesFunciones.resaltaridDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activaridDepreciacionActivoFijo,iSizeTabla,this,true,"idDepreciacionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionactivofijoConstantesFunciones.resaltaridDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activaridDepreciacionActivoFijo,this,true,"idDepreciacionActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarid_empresaDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_empresaDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_empresaDepreciacionActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_empresaDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_empresaDepreciacionActivoFijo,false,"id_empresaDepreciacionActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarid_sucursalDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_sucursalDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_sucursalDepreciacionActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_sucursalDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_sucursalDepreciacionActivoFijo,false,"id_sucursalDepreciacionActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_detalle_activo_fijoDepreciacionActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_detalle_activo_fijoDepreciacionActivoFijo,true,"id_detalle_activo_fijoDepreciacionActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarid_tipo_depreciacion_empresaDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDepreciacionEmpresaTableCell(this.tipodepreciacionempresasForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_tipo_depreciacion_empresaDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_tipo_depreciacion_empresaDepreciacionActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new TipoDepreciacionEmpresaTableCell(this.tipodepreciacionempresasForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_tipo_depreciacion_empresaDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_tipo_depreciacion_empresaDepreciacionActivoFijo,true,"id_tipo_depreciacion_empresaDepreciacionActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarid_estado_depre_actiDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoDepreActiTableCell(this.estadodepreactisForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_estado_depre_actiDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_estado_depre_actiDepreciacionActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new EstadoDepreActiTableCell(this.estadodepreactisForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_estado_depre_actiDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_estado_depre_actiDepreciacionActivoFijo,true,"id_estado_depre_actiDepreciacionActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarid_anioDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_anioDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_anioDepreciacionActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_anioDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_anioDepreciacionActivoFijo,true,"id_anioDepreciacionActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarid_mesDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_mesDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_mesDepreciacionActivoFijo,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.depreciacionactivofijoConstantesFunciones.resaltarid_mesDepreciacionActivoFijo,this,this.depreciacionactivofijoConstantesFunciones.activarid_mesDepreciacionActivoFijo,true,"id_mesDepreciacionActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarfecha_compraDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarfecha_compraDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarfecha_compraDepreciacionActivoFijo,iSizeTabla,this,true,"fecha_compraDepreciacionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarfecha_compraDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarfecha_compraDepreciacionActivoFijo,this,true,"fecha_compraDepreciacionActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarfecha_depre_actiDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarfecha_depre_actiDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarfecha_depre_actiDepreciacionActivoFijo,iSizeTabla,this,true,"fecha_depre_actiDepreciacionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarfecha_depre_actiDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarfecha_depre_actiDepreciacionActivoFijo,this,true,"fecha_depre_actiDepreciacionActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarporcentajeDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarporcentajeDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarporcentajeDepreciacionActivoFijo,iSizeTabla,this,true,"porcentajeDepreciacionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarporcentajeDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarporcentajeDepreciacionActivoFijo,this,true,"porcentajeDepreciacionActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarcostoDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarcostoDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarcostoDepreciacionActivoFijo,iSizeTabla,this,true,"costoDepreciacionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarcostoDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarcostoDepreciacionActivoFijo,this,true,"costoDepreciacionActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarvalor_acumuladoDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_acumuladoDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarvalor_acumuladoDepreciacionActivoFijo,iSizeTabla,this,true,"valor_acumuladoDepreciacionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_acumuladoDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarvalor_acumuladoDepreciacionActivoFijo,this,true,"valor_acumuladoDepreciacionActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarvalor_totalDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_totalDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarvalor_totalDepreciacionActivoFijo,iSizeTabla,this,true,"valor_totalDepreciacionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_totalDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarvalor_totalDepreciacionActivoFijo,this,true,"valor_totalDepreciacionActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarvalor_gastoDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_gastoDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarvalor_gastoDepreciacionActivoFijo,iSizeTabla,this,true,"valor_gastoDepreciacionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_gastoDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarvalor_gastoDepreciacionActivoFijo,this,true,"valor_gastoDepreciacionActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA));

		if(this.depreciacionactivofijoConstantesFunciones.mostrarfechaDepreciacionActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarfechaDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarfechaDepreciacionActivoFijo,iSizeTabla,this,true,"fechaDepreciacionActivoFijo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.depreciacionactivofijoConstantesFunciones.resaltarfechaDepreciacionActivoFijo,this.depreciacionactivofijoConstantesFunciones.activarfechaDepreciacionActivoFijo,this,true,"fechaDepreciacionActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DepreciacionActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDepreciacionActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDepreciacionActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDepreciacionActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosDepreciacionActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDepreciacionActivoFijo.moveColumn(this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDepreciacionActivoFijo.moveColumn(this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDepreciacionActivoFijo.moveColumn(this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDepreciacionActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDepreciacionActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDepreciacionActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDepreciacionActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDepreciacionActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDepreciacionActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=depreciacionactivofijoLogic.getDepreciacionActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=depreciacionactivofijos.size()-1;
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
		//this.jTableDatosDepreciacionActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDepreciacionActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDepreciacionActivoFijo();
			
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
				
				//this.isEsNuevoDepreciacionActivoFijo=false;
					
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
				if(this.depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDepreciacionActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDepreciacionActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.depreciacionactivofijo.getsType().equals("DUPLICADO")
				   || this.depreciacionactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDepreciacionActivoFijo=true;
				
				} else {
					this.isEsNuevoDepreciacionActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.depreciacionactivofijo.getId()>=0 && !this.depreciacionactivofijo.getIsNew()) {						
						this.isEsNuevoDepreciacionActivoFijo=false;
						
					} else {
						this.isEsNuevoDepreciacionActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDepreciacionActivoFijo(esRelaciones);						
				
				this.seleccionarDepreciacionActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.depreciacionactivofijo.getId()<0) {
					this.isEsNuevoDepreciacionActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDepreciacionActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDepreciacionActivoFijo(evt,rowIndex);
				}	
				
				if(this.depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DepreciacionActivoFijo: " + this.dDif); 
					}
				}								
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDepreciacionActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.depreciacionactivofijo)) {
					if(this.depreciacionactivofijo.getId()>0) {
						this.depreciacionactivofijo.setIsDeleted(true);
						
						this.depreciacionactivofijosEliminados.add(this.depreciacionactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().remove(this.depreciacionactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijos.remove(this.depreciacionactivofijo);				
					}
					
					
					((DepreciacionActivoFijoModel) this.jTableDatosDepreciacionActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDepreciacionActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDepreciacionActivoFijo) {
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDepreciacionActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDepreciacionActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDepreciacionActivoFijo(this.depreciacionactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.depreciacionactivofijoConstantesFunciones.cargarid_empresaDepreciacionActivoFijo || this.depreciacionactivofijoConstantesFunciones.event_dependid_empresaDepreciacionActivoFijo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.depreciacionactivofijo.getid_empresa());
									//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(depreciacionactivofijo.getEmpresa()!=null) {
							this.empresasForeignKey.add(depreciacionactivofijo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.depreciacionactivofijo.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.depreciacionactivofijoConstantesFunciones.cargarid_sucursalDepreciacionActivoFijo || this.depreciacionactivofijoConstantesFunciones.event_dependid_sucursalDepreciacionActivoFijo) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.depreciacionactivofijo.getid_sucursal());
									//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(depreciacionactivofijo.getSucursal()!=null) {
							this.sucursalsForeignKey.add(depreciacionactivofijo.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.depreciacionactivofijo.getid_sucursal(),false,"Formulario");

					//DetalleActivoFijo
					if(!this.depreciacionactivofijoConstantesFunciones.cargarid_detalle_activo_fijoDepreciacionActivoFijo || this.depreciacionactivofijoConstantesFunciones.event_dependid_detalle_activo_fijoDepreciacionActivoFijo) {
						//this.cargarCombosDetalleActivoFijosForeignKeyLista(" where id="+this.depreciacionactivofijo.getid_detalle_activo_fijo());
									//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
						this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

						if(depreciacionactivofijo.getDetalleActivoFijo()!=null) {
							this.detalleactivofijosForeignKey.add(depreciacionactivofijo.getDetalleActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
						this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
					}
					this.setActualDetalleActivoFijoForeignKey(this.depreciacionactivofijo.getid_detalle_activo_fijo(),false,"Formulario");

					//TipoDepreciacionEmpresa
					if(!this.depreciacionactivofijoConstantesFunciones.cargarid_tipo_depreciacion_empresaDepreciacionActivoFijo || this.depreciacionactivofijoConstantesFunciones.event_dependid_tipo_depreciacion_empresaDepreciacionActivoFijo) {
						//this.cargarCombosTipoDepreciacionEmpresasForeignKeyLista(" where id="+this.depreciacionactivofijo.getid_tipo_depreciacion_empresa());
									//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
						this.tipodepreciacionempresasForeignKey=new ArrayList<TipoDepreciacionEmpresa>();

						if(depreciacionactivofijo.getTipoDepreciacionEmpresa()!=null) {
							this.tipodepreciacionempresasForeignKey.add(depreciacionactivofijo.getTipoDepreciacionEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoDepreciacionEmpresa();
						this.cargarCombosFrameTipoDepreciacionEmpresasForeignKey("Todos");
					}
					this.setActualTipoDepreciacionEmpresaForeignKey(this.depreciacionactivofijo.getid_tipo_depreciacion_empresa(),false,"Formulario");

					//EstadoDepreActi
					if(!this.depreciacionactivofijoConstantesFunciones.cargarid_estado_depre_actiDepreciacionActivoFijo || this.depreciacionactivofijoConstantesFunciones.event_dependid_estado_depre_actiDepreciacionActivoFijo) {
						//this.cargarCombosEstadoDepreActisForeignKeyLista(" where id="+this.depreciacionactivofijo.getid_estado_depre_acti());
									//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
						this.estadodepreactisForeignKey=new ArrayList<EstadoDepreActi>();

						if(depreciacionactivofijo.getEstadoDepreActi()!=null) {
							this.estadodepreactisForeignKey.add(depreciacionactivofijo.getEstadoDepreActi());
						}

						this.addItemDefectoCombosForeignKeyEstadoDepreActi();
						this.cargarCombosFrameEstadoDepreActisForeignKey("Todos");
					}
					this.setActualEstadoDepreActiForeignKey(this.depreciacionactivofijo.getid_estado_depre_acti(),false,"Formulario");

					//Anio
					if(!this.depreciacionactivofijoConstantesFunciones.cargarid_anioDepreciacionActivoFijo || this.depreciacionactivofijoConstantesFunciones.event_dependid_anioDepreciacionActivoFijo) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.depreciacionactivofijo.getid_anio());
									//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(depreciacionactivofijo.getAnio()!=null) {
							this.aniosForeignKey.add(depreciacionactivofijo.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.depreciacionactivofijo.getid_anio(),false,"Formulario");

					//Mes
					if(!this.depreciacionactivofijoConstantesFunciones.cargarid_mesDepreciacionActivoFijo || this.depreciacionactivofijoConstantesFunciones.event_dependid_mesDepreciacionActivoFijo) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.depreciacionactivofijo.getid_mes());
									//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(depreciacionactivofijo.getMes()!=null) {
							this.messForeignKey.add(depreciacionactivofijo.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.depreciacionactivofijo.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDepreciacionActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDepreciacionActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDepreciacionActivoFijo(depreciacionactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDepreciacionActivoFijo(depreciacionactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDepreciacionActivoFijo(depreciacionactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDepreciacionActivoFijo(depreciacionactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelidDepreciacionActivoFijo.setText(depreciacionactivofijo.getId().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_compraDepreciacionActivoFijo.setDate(depreciacionactivofijo.getfecha_compra());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_depre_actiDepreciacionActivoFijo.setDate(depreciacionactivofijo.getfecha_depre_acti());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldporcentajeDepreciacionActivoFijo.setText(depreciacionactivofijo.getporcentaje().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldcostoDepreciacionActivoFijo.setText(depreciacionactivofijo.getcosto().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_acumuladoDepreciacionActivoFijo.setText(depreciacionactivofijo.getvalor_acumulado().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_totalDepreciacionActivoFijo.setText(depreciacionactivofijo.getvalor_total().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_gastoDepreciacionActivoFijo.setText(depreciacionactivofijo.getvalor_gasto().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfechaDepreciacionActivoFijo.setDate(depreciacionactivofijo.getfecha());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DepreciacionActivoFijo depreciacionactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,depreciacionactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DepreciacionActivoFijo depreciacionactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				depreciacionactivofijoLocal=this.depreciacionactivofijo;
			} else {
				depreciacionactivofijoLocal=this.depreciacionactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(depreciacionactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDepreciacionActivoFijo(depreciacionactivofijoLocal,true);
					
					if(depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(depreciacionactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(depreciacionactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(depreciacionactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(depreciacionactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(depreciacionactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelidDepreciacionActivoFijo.getText()==null || this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelidDepreciacionActivoFijo.getText()=="" || this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelidDepreciacionActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelidDepreciacionActivoFijo.setText("0");
			}

			if(conColumnasBase) {depreciacionactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelidDepreciacionActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelIdDepreciacionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciacionactivofijo.setfecha_compra(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_compraDepreciacionActivoFijo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelfecha_compraDepreciacionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciacionactivofijo.setfecha_depre_acti(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_depre_actiDepreciacionActivoFijo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelfecha_depre_actiDepreciacionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciacionactivofijo.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldporcentajeDepreciacionActivoFijo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelporcentajeDepreciacionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciacionactivofijo.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldcostoDepreciacionActivoFijo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelcostoDepreciacionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciacionactivofijo.setvalor_acumulado(Double.parseDouble(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_acumuladoDepreciacionActivoFijo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelvalor_acumuladoDepreciacionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciacionactivofijo.setvalor_total(Double.parseDouble(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_totalDepreciacionActivoFijo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelvalor_totalDepreciacionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciacionactivofijo.setvalor_gasto(Double.parseDouble(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_gastoDepreciacionActivoFijo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelvalor_gastoDepreciacionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			depreciacionactivofijo.setfecha(this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfechaDepreciacionActivoFijo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelfechaDepreciacionActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijoBean,DepreciacionActivoFijo depreciacionactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijoOrigen,DepreciacionActivoFijo depreciacionactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && depreciacionactivofijoOrigen.getId()!=null && !depreciacionactivofijoOrigen.getId().equals(0L))) {depreciacionactivofijo.setId(depreciacionactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && depreciacionactivofijoOrigen.getfecha_compra()!=null && !depreciacionactivofijoOrigen.getfecha_compra().equals(new Date()))) {depreciacionactivofijo.setfecha_compra(depreciacionactivofijoOrigen.getfecha_compra());}
			if(conDefault || (!conDefault && depreciacionactivofijoOrigen.getfecha_depre_acti()!=null && !depreciacionactivofijoOrigen.getfecha_depre_acti().equals(new Date()))) {depreciacionactivofijo.setfecha_depre_acti(depreciacionactivofijoOrigen.getfecha_depre_acti());}
			if(conDefault || (!conDefault && depreciacionactivofijoOrigen.getporcentaje()!=null && !depreciacionactivofijoOrigen.getporcentaje().equals(0.0))) {depreciacionactivofijo.setporcentaje(depreciacionactivofijoOrigen.getporcentaje());}
			if(conDefault || (!conDefault && depreciacionactivofijoOrigen.getcosto()!=null && !depreciacionactivofijoOrigen.getcosto().equals(0.0))) {depreciacionactivofijo.setcosto(depreciacionactivofijoOrigen.getcosto());}
			if(conDefault || (!conDefault && depreciacionactivofijoOrigen.getvalor_acumulado()!=null && !depreciacionactivofijoOrigen.getvalor_acumulado().equals(0.0))) {depreciacionactivofijo.setvalor_acumulado(depreciacionactivofijoOrigen.getvalor_acumulado());}
			if(conDefault || (!conDefault && depreciacionactivofijoOrigen.getvalor_total()!=null && !depreciacionactivofijoOrigen.getvalor_total().equals(0.0))) {depreciacionactivofijo.setvalor_total(depreciacionactivofijoOrigen.getvalor_total());}
			if(conDefault || (!conDefault && depreciacionactivofijoOrigen.getvalor_gasto()!=null && !depreciacionactivofijoOrigen.getvalor_gasto().equals(0.0))) {depreciacionactivofijo.setvalor_gasto(depreciacionactivofijoOrigen.getvalor_gasto());}
			if(conDefault || (!conDefault && depreciacionactivofijoOrigen.getfecha()!=null && !depreciacionactivofijoOrigen.getfecha().equals(new Date()))) {depreciacionactivofijo.setfecha(depreciacionactivofijoOrigen.getfecha());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelidDepreciacionActivoFijo.setText(depreciacionactivofijo.getId().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_compraDepreciacionActivoFijo.setDate(depreciacionactivofijo.getfecha_compra());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_depre_actiDepreciacionActivoFijo.setDate(depreciacionactivofijo.getfecha_depre_acti());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldporcentajeDepreciacionActivoFijo.setText(depreciacionactivofijo.getporcentaje().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldcostoDepreciacionActivoFijo.setText(depreciacionactivofijo.getcosto().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_acumuladoDepreciacionActivoFijo.setText(depreciacionactivofijo.getvalor_acumulado().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_totalDepreciacionActivoFijo.setText(depreciacionactivofijo.getvalor_total().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_gastoDepreciacionActivoFijo.setText(depreciacionactivofijo.getvalor_gasto().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfechaDepreciacionActivoFijo.setDate(depreciacionactivofijo.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDepreciacionActivoFijo(DepreciacionActivoFijoBean depreciacionactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelidDepreciacionActivoFijo.setText(depreciacionactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_compraDepreciacionActivoFijo.setDate(depreciacionactivofijoBean.getfecha_compra());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_depre_actiDepreciacionActivoFijo.setDate(depreciacionactivofijoBean.getfecha_depre_acti());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldporcentajeDepreciacionActivoFijo.setText(depreciacionactivofijoBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldcostoDepreciacionActivoFijo.setText(depreciacionactivofijoBean.getcosto().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_acumuladoDepreciacionActivoFijo.setText(depreciacionactivofijoBean.getvalor_acumulado().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_totalDepreciacionActivoFijo.setText(depreciacionactivofijoBean.getvalor_total().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_gastoDepreciacionActivoFijo.setText(depreciacionactivofijoBean.getvalor_gasto().toString());
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfechaDepreciacionActivoFijo.setDate(depreciacionactivofijoBean.getfecha());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDepreciacionActivoFijo(DepreciacionActivoFijoParameterReturnGeneral depreciacionactivofijoReturnGeneral,DepreciacionActivoFijoBean depreciacionactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			DepreciacionActivoFijo depreciacionactivofijoLocal=new DepreciacionActivoFijo();
			
			depreciacionactivofijoLocal=depreciacionactivofijoReturnGeneral.getDepreciacionActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && depreciacionactivofijoLocal.getId()!=null && !depreciacionactivofijoLocal.getId().equals(0L))) {depreciacionactivofijoBean.setId(depreciacionactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && depreciacionactivofijoLocal.getfecha_compra()!=null && !depreciacionactivofijoLocal.getfecha_compra().equals(new Date()))) {depreciacionactivofijoBean.setfecha_compra(depreciacionactivofijoLocal.getfecha_compra());}
			if(conDefault || (!conDefault && depreciacionactivofijoLocal.getfecha_depre_acti()!=null && !depreciacionactivofijoLocal.getfecha_depre_acti().equals(new Date()))) {depreciacionactivofijoBean.setfecha_depre_acti(depreciacionactivofijoLocal.getfecha_depre_acti());}
			if(conDefault || (!conDefault && depreciacionactivofijoLocal.getporcentaje()!=null && !depreciacionactivofijoLocal.getporcentaje().equals(0.0))) {depreciacionactivofijoBean.setporcentaje(depreciacionactivofijoLocal.getporcentaje());}
			if(conDefault || (!conDefault && depreciacionactivofijoLocal.getcosto()!=null && !depreciacionactivofijoLocal.getcosto().equals(0.0))) {depreciacionactivofijoBean.setcosto(depreciacionactivofijoLocal.getcosto());}
			if(conDefault || (!conDefault && depreciacionactivofijoLocal.getvalor_acumulado()!=null && !depreciacionactivofijoLocal.getvalor_acumulado().equals(0.0))) {depreciacionactivofijoBean.setvalor_acumulado(depreciacionactivofijoLocal.getvalor_acumulado());}
			if(conDefault || (!conDefault && depreciacionactivofijoLocal.getvalor_total()!=null && !depreciacionactivofijoLocal.getvalor_total().equals(0.0))) {depreciacionactivofijoBean.setvalor_total(depreciacionactivofijoLocal.getvalor_total());}
			if(conDefault || (!conDefault && depreciacionactivofijoLocal.getvalor_gasto()!=null && !depreciacionactivofijoLocal.getvalor_gasto().equals(0.0))) {depreciacionactivofijoBean.setvalor_gasto(depreciacionactivofijoLocal.getvalor_gasto());}
			if(conDefault || (!conDefault && depreciacionactivofijoLocal.getfecha()!=null && !depreciacionactivofijoLocal.getfecha().equals(new Date()))) {depreciacionactivofijoBean.setfecha(depreciacionactivofijoLocal.getfecha());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDepreciacionActivoFijoGenerico(Long idDepreciacionActivoFijoSeleccionado,JComboBox jComboBoxDepreciacionActivoFijo,List<DepreciacionActivoFijo> depreciacionactivofijosLocal)throws Exception {
		try {
			DepreciacionActivoFijo  depreciacionactivofijoTemp=null;

			for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijosLocal) {
				if(depreciacionactivofijoAux.getId()!=null && depreciacionactivofijoAux.getId().equals(idDepreciacionActivoFijoSeleccionado)) {
					depreciacionactivofijoTemp=depreciacionactivofijoAux;
					break;
				}
			}

			jComboBoxDepreciacionActivoFijo.setSelectedItem(depreciacionactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDepreciacionActivoFijoGenerico(JComboBox jComboBoxDepreciacionActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDepreciacionActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDepreciacionActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDepreciacionActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDepreciacionActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDepreciacionActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDepreciacionActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			depreciacionactivofijo=(DepreciacionActivoFijo) depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			depreciacionactivofijo =(DepreciacionActivoFijo) depreciacionactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!depreciacionactivofijo.getIsNew() && !depreciacionactivofijo.getIsChanged() && !depreciacionactivofijo.getIsDeleted()) {
				sDescripcion=depreciacionactivofijo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=depreciacionactivofijo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!depreciacionactivofijo.getIsNew() && !depreciacionactivofijo.getIsChanged() && !depreciacionactivofijo.getIsDeleted()) {
				sDescripcion=depreciacionactivofijo.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=depreciacionactivofijo.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("DetalleActivoFijo")) {
			//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
			if(!depreciacionactivofijo.getIsNew() && !depreciacionactivofijo.getIsChanged() && !depreciacionactivofijo.getIsDeleted()) {
				sDescripcion=depreciacionactivofijo.getdetalleactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=depreciacionactivofijo.getdetalleactivofijo_descripcion();
			}
		}

		if(sTipo.equals("TipoDepreciacionEmpresa")) {
			//sDescripcion=this.getActualTipoDepreciacionEmpresaForeignKeyDescripcion((Long)value);
			if(!depreciacionactivofijo.getIsNew() && !depreciacionactivofijo.getIsChanged() && !depreciacionactivofijo.getIsDeleted()) {
				sDescripcion=depreciacionactivofijo.gettipodepreciacionempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDepreciacionEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=depreciacionactivofijo.gettipodepreciacionempresa_descripcion();
			}
		}

		if(sTipo.equals("EstadoDepreActi")) {
			//sDescripcion=this.getActualEstadoDepreActiForeignKeyDescripcion((Long)value);
			if(!depreciacionactivofijo.getIsNew() && !depreciacionactivofijo.getIsChanged() && !depreciacionactivofijo.getIsDeleted()) {
				sDescripcion=depreciacionactivofijo.getestadodepreacti_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoDepreActiForeignKeyDescripcion((Long)value);
				sDescripcion=depreciacionactivofijo.getestadodepreacti_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!depreciacionactivofijo.getIsNew() && !depreciacionactivofijo.getIsChanged() && !depreciacionactivofijo.getIsDeleted()) {
				sDescripcion=depreciacionactivofijo.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=depreciacionactivofijo.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!depreciacionactivofijo.getIsNew() && !depreciacionactivofijo.getIsChanged() && !depreciacionactivofijo.getIsDeleted()) {
				sDescripcion=depreciacionactivofijo.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=depreciacionactivofijo.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DepreciacionActivoFijo depreciacionactivofijoRow=new DepreciacionActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			depreciacionactivofijoRow=(DepreciacionActivoFijo) depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			depreciacionactivofijoRow=(DepreciacionActivoFijo) depreciacionactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDepreciacionActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDepreciacionActivoFijo && this.isPermisoNuevoDepreciacionActivoFijo));			
			this.jButtonDuplicarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarDepreciacionActivoFijo && this.isPermisoDuplicarDepreciacionActivoFijo));			
			this.jButtonCopiarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaCopiarDepreciacionActivoFijo && this.isPermisoCopiarDepreciacionActivoFijo));
			this.jButtonVerFormDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaVerFormDepreciacionActivoFijo && this.isPermisoVerFormDepreciacionActivoFijo));
			
			this.jButtonAbrirOrderByDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDepreciacionActivoFijo && this.isPermisoOrdenDepreciacionActivoFijo));			
			
			this.jButtonNuevoRelacionesDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo && this.isPermisoNuevoDepreciacionActivoFijo));			
			this.jButtonNuevoGuardarCambiosDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDepreciacionActivoFijo && this.isPermisoNuevoDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo));
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonModificarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaModificarDepreciacionActivoFijo && this.isPermisoActualizarDepreciacionActivoFijo));	
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonActualizarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaActualizarDepreciacionActivoFijo && this.isPermisoActualizarDepreciacionActivoFijo));	
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonEliminarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaEliminarDepreciacionActivoFijo && this.isPermisoEliminarDepreciacionActivoFijo));
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonCancelarDepreciacionActivoFijo.setVisible(this.isVisibilidadCeldaCancelarDepreciacionActivoFijo);							
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDepreciacionActivoFijo && this.isPermisoNuevoDepreciacionActivoFijo));						
			this.jButtonDuplicarToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarDepreciacionActivoFijo && this.isPermisoDuplicarDepreciacionActivoFijo));						
			this.jButtonCopiarToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaCopiarDepreciacionActivoFijo && this.isPermisoCopiarDepreciacionActivoFijo));			
			this.jButtonVerFormToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaVerFormDepreciacionActivoFijo && this.isPermisoVerFormDepreciacionActivoFijo));			
			this.jButtonAbrirOrderByToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDepreciacionActivoFijo && this.isPermisoOrdenDepreciacionActivoFijo));
			this.jButtonNuevoRelacionesToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo && this.isPermisoNuevoDepreciacionActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDepreciacionActivoFijo && this.isPermisoNuevoDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo));			
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonModificarToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaModificarDepreciacionActivoFijo && this.isPermisoActualizarDepreciacionActivoFijo));	
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonActualizarToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaActualizarDepreciacionActivoFijo  && this.isPermisoActualizarDepreciacionActivoFijo));	
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonEliminarToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaEliminarDepreciacionActivoFijo && this.isPermisoEliminarDepreciacionActivoFijo));
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonCancelarToolBarDepreciacionActivoFijo.setVisible(this.isVisibilidadCeldaCancelarDepreciacionActivoFijo);				
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDepreciacionActivoFijo && this.isPermisoNuevoDepreciacionActivoFijo));			
			this.jMenuItemDuplicarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarDepreciacionActivoFijo && this.isPermisoDuplicarDepreciacionActivoFijo));			
			this.jMenuItemCopiarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaCopiarDepreciacionActivoFijo && this.isPermisoCopiarDepreciacionActivoFijo));			
			this.jMenuItemVerFormDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaVerFormDepreciacionActivoFijo && this.isPermisoVerFormDepreciacionActivoFijo));			
			this.jMenuItemAbrirOrderByDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDepreciacionActivoFijo && this.isPermisoOrdenDepreciacionActivoFijo));			
			//this.jMenuItemMostrarOcultarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDepreciacionActivoFijo && this.isPermisoOrdenDepreciacionActivoFijo));
			this.jMenuItemDetalleAbrirOrderByDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDepreciacionActivoFijo && this.isPermisoOrdenDepreciacionActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaOrdenDepreciacionActivoFijo && this.isPermisoOrdenDepreciacionActivoFijo));			
			this.jMenuItemNuevoRelacionesDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo && this.isPermisoNuevoDepreciacionActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaNuevoDepreciacionActivoFijo && this.isPermisoNuevoDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo));									
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemModificarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaModificarDepreciacionActivoFijo && this.isPermisoActualizarDepreciacionActivoFijo));	
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemActualizarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaActualizarDepreciacionActivoFijo && this.isPermisoActualizarDepreciacionActivoFijo));	
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemEliminarDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaEliminarDepreciacionActivoFijo && this.isPermisoEliminarDepreciacionActivoFijo));
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemCancelarDepreciacionActivoFijo.setVisible(this.isVisibilidadCeldaCancelarDepreciacionActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo));						
			this.jMenuItemGuardarCambiosTablaDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=this.jButtonNuevoDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarDepreciacionActivoFijo=this.jButtonDuplicarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarDepreciacionActivoFijo=this.jButtonCopiarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormDepreciacionActivoFijo=this.jButtonVerFormDepreciacionActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenDepreciacionActivoFijo=this.jButtonAbrirOrderByDepreciacionActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=this.jButtonNuevoRelacionesDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarDepreciacionActivoFijo=this.jButtonModificarDepreciacionActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonActualizarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonEliminarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonCancelarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosDepreciacionActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=this.jButtonNuevoToolBarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=this.jButtonNuevoRelacionesToolBarDepreciacionActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			this.isVisibilidadCeldaModificarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonModificarToolBarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonActualizarToolBarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonEliminarToolBarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonCancelarToolBarDepreciacionActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=this.jButtonGuardarCambiosToolBarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=this.jButtonGuardarCambiosTablaToolBarDepreciacionActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=this.jMenuItemNuevoDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=this.jMenuItemNuevoRelacionesDepreciacionActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			this.isVisibilidadCeldaModificarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemModificarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemActualizarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemEliminarDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarDepreciacionActivoFijo=this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemCancelarDepreciacionActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=this.jMenuItemGuardarCambiosDepreciacionActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=this.jMenuItemGuardarCambiosTablaDepreciacionActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDepreciacionActivoFijo(Boolean esInicializar) {
		if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDepreciacionActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualDepreciacionActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDepreciacionActivoFijo() {
		this.jButtonNuevoDepreciacionActivoFijo.setVisible(this.isPermisoNuevoDepreciacionActivoFijo);			
		this.jButtonDuplicarDepreciacionActivoFijo.setVisible(this.isPermisoDuplicarDepreciacionActivoFijo);			
		this.jButtonCopiarDepreciacionActivoFijo.setVisible(this.isPermisoCopiarDepreciacionActivoFijo);			
		this.jButtonVerFormDepreciacionActivoFijo.setVisible(this.isPermisoVerFormDepreciacionActivoFijo);			
		
		this.jButtonAbrirOrderByDepreciacionActivoFijo.setVisible(this.isPermisoOrdenDepreciacionActivoFijo);					
		
		this.jButtonNuevoRelacionesDepreciacionActivoFijo.setVisible(this.isPermisoNuevoDepreciacionActivoFijo);			
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonModificarDepreciacionActivoFijo.setVisible(this.isPermisoActualizarDepreciacionActivoFijo);	
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonActualizarDepreciacionActivoFijo.setVisible(this.isPermisoActualizarDepreciacionActivoFijo);	
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonEliminarDepreciacionActivoFijo.setVisible(this.isPermisoEliminarDepreciacionActivoFijo);
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonCancelarDepreciacionActivoFijo.setVisible(this.isVisibilidadCeldaCancelarDepreciacionActivoFijo);						
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosDepreciacionActivoFijo.setVisible(this.isPermisoGuardarCambiosDepreciacionActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.setVisible(this.isPermisoActualizarDepreciacionActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDepreciacionActivoFijo() {
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonModificarDepreciacionActivoFijo.setVisible(this.isPermisoActualizarDepreciacionActivoFijo);	
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonActualizarDepreciacionActivoFijo.setVisible(this.isPermisoActualizarDepreciacionActivoFijo);	
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonEliminarDepreciacionActivoFijo.setVisible(this.isPermisoEliminarDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonCancelarDepreciacionActivoFijo.setVisible(this.isVisibilidadCeldaCancelarDepreciacionActivoFijo);							
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosDepreciacionActivoFijo.setVisible((this.isVisibilidadCeldaGuardarDepreciacionActivoFijo && this.isPermisoGuardarCambiosDepreciacionActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDepreciacionActivoFijo() {
		if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDepreciacionActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDepreciacionActivoFijo() {
	}
	
	public void jTableDatosDepreciacionActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDepreciacionActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.depreciacionactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDepreciacionActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDepreciacionActivoFijo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciacionActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.depreciacionactivofijoLogic.getConnexion());

				if(this.depreciacionactivofijo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.depreciacionactivofijo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciacionActivoFijo=(TitledBorder)this.jScrollPanelDatosDepreciacionActivoFijo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDepreciacionActivoFijo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.depreciacionactivofijo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDepreciacionActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDepreciacionActivoFijo(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciacionActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.depreciacionactivofijoLogic.getConnexion());

				if(this.depreciacionactivofijo.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.depreciacionactivofijo.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciacionActivoFijo=(TitledBorder)this.jScrollPanelDatosDepreciacionActivoFijo.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDepreciacionActivoFijo.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.depreciacionactivofijo.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetalleactivofijo=true;

			idTienePermisodetalleactivofijo=this.tienePermisosUsuarioEnPaginaWebDepreciacionActivoFijo(DetalleActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetalleactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciacionActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.depreciacionactivofijoLogic.getConnexion());

				if(this.depreciacionactivofijo.getid_detalle_activo_fijo()!=null) {
					this.detalleactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detalleactivofijoBeanSwingJInternalFrame.setIdActual(this.depreciacionactivofijo.getid_detalle_activo_fijo());
					this.detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.detalleactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciacionActivoFijo=(TitledBorder)this.jScrollPanelDatosDepreciacionActivoFijo.getBorder();
				TitledBorder titledBorderdetalleactivofijo=(TitledBorder)this.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

				titledBorderdetalleactivofijo.setTitle(titledBorderDepreciacionActivoFijo.getTitle() + " -> Detalle Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getid_detalle_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_activo_fijo = "+this.depreciacionactivofijo.getid_detalle_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodepreciacionempresa=true;

			idTienePermisotipodepreciacionempresa=this.tienePermisosUsuarioEnPaginaWebDepreciacionActivoFijo(TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodepreciacionempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciacionActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);

				this.tipodepreciacionempresaBeanSwingJInternalFrame=new TipoDepreciacionEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodepreciacionempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodepreciacionempresaBeanSwingJInternalFrame.getTipoDepreciacionEmpresaLogic().setConnexion(this.depreciacionactivofijoLogic.getConnexion());

				if(this.depreciacionactivofijo.getid_tipo_depreciacion_empresa()!=null) {
					this.tipodepreciacionempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodepreciacionempresaBeanSwingJInternalFrame.setIdActual(this.depreciacionactivofijo.getid_tipo_depreciacion_empresa());
					this.tipodepreciacionempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodepreciacionempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodepreciacionempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDepreciacionEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipodepreciacionempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciacionActivoFijo=(TitledBorder)this.jScrollPanelDatosDepreciacionActivoFijo.getBorder();
				TitledBorder titledBordertipodepreciacionempresa=(TitledBorder)this.tipodepreciacionempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoDepreciacionEmpresa.getBorder();

				titledBordertipodepreciacionempresa.setTitle(titledBorderDepreciacionActivoFijo.getTitle() + " -> Tipo Depreciacion Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getid_tipo_depreciacion_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_depreciacion_empresa = "+this.depreciacionactivofijo.getid_tipo_depreciacion_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_depre_actiDepreciacionActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadodepreacti=true;

			idTienePermisoestadodepreacti=this.tienePermisosUsuarioEnPaginaWebDepreciacionActivoFijo(EstadoDepreActiConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadodepreacti) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciacionActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);

				this.estadodepreactiBeanSwingJInternalFrame=new EstadoDepreActiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadodepreactiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadodepreactiBeanSwingJInternalFrame.getEstadoDepreActiLogic().setConnexion(this.depreciacionactivofijoLogic.getConnexion());

				if(this.depreciacionactivofijo.getid_estado_depre_acti()!=null) {
					this.estadodepreactiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadodepreactiBeanSwingJInternalFrame.setIdActual(this.depreciacionactivofijo.getid_estado_depre_acti());
					this.estadodepreactiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadodepreactiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadodepreactiBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoDepreActi();
				}

				JInternalFrameBase jinternalFrame =this.estadodepreactiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciacionActivoFijo=(TitledBorder)this.jScrollPanelDatosDepreciacionActivoFijo.getBorder();
				TitledBorder titledBorderestadodepreacti=(TitledBorder)this.estadodepreactiBeanSwingJInternalFrame.jScrollPanelDatosEstadoDepreActi.getBorder();

				titledBorderestadodepreacti.setTitle(titledBorderDepreciacionActivoFijo.getTitle() + " -> Estado Depre Acti");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_depre_actiDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getid_estado_depre_acti()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_depre_acti = "+this.depreciacionactivofijo.getid_estado_depre_acti().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioDepreciacionActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebDepreciacionActivoFijo(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciacionActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.depreciacionactivofijoLogic.getConnexion());

				if(this.depreciacionactivofijo.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.depreciacionactivofijo.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciacionActivoFijo=(TitledBorder)this.jScrollPanelDatosDepreciacionActivoFijo.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderDepreciacionActivoFijo.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.depreciacionactivofijo.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesDepreciacionActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebDepreciacionActivoFijo(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDepreciacionActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDepreciacionActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.depreciacionactivofijoLogic.getConnexion());

				if(this.depreciacionactivofijo.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.depreciacionactivofijo.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDepreciacionActivoFijo=(TitledBorder)this.jScrollPanelDatosDepreciacionActivoFijo.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderDepreciacionActivoFijo.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.depreciacionactivofijo.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_compraDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getfecha_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_compra = '"+Funciones2.getStringPostgresDate(this.depreciacionactivofijo.getfecha_compra())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_depre_actiDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getfecha_depre_acti()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_depre_acti = '"+Funciones2.getStringPostgresDate(this.depreciacionactivofijo.getfecha_depre_acti())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.depreciacionactivofijo.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.depreciacionactivofijo.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_acumuladoDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getvalor_acumulado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_acumulado = "+this.depreciacionactivofijo.getvalor_acumulado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_totalDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getvalor_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_total = "+this.depreciacionactivofijo.getvalor_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_gastoDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getvalor_gasto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_gasto = "+this.depreciacionactivofijo.getvalor_gasto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaDepreciacionActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.getdepreciacionactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.depreciacionactivofijo==null) {
						this.depreciacionactivofijo = new DepreciacionActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);
				}

				if(this.depreciacionactivofijo.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.depreciacionactivofijo.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDepreciacionActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);

			this.getDepreciacionActivoFijosFK_IdAnio();

			this.inicializarActualizarBindingDepreciacionActivoFijo(false);

			//if(DepreciacionActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDepreciacionActivoFijoDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);

			this.getDepreciacionActivoFijosFK_IdDepreciacionActivoFijo();

			this.inicializarActualizarBindingDepreciacionActivoFijo(false);

			//if(DepreciacionActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDetalleActivoFijoDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);

			this.getDepreciacionActivoFijosFK_IdDetalleActivoFijo();

			this.inicializarActualizarBindingDepreciacionActivoFijo(false);

			//if(DepreciacionActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);

			this.getDepreciacionActivoFijosFK_IdEmpresa();

			this.inicializarActualizarBindingDepreciacionActivoFijo(false);

			//if(DepreciacionActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);

			this.getDepreciacionActivoFijosFK_IdMes();

			this.inicializarActualizarBindingDepreciacionActivoFijo(false);

			//if(DepreciacionActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);

			this.getDepreciacionActivoFijosFK_IdSucursal();

			this.inicializarActualizarBindingDepreciacionActivoFijo(false);

			//if(DepreciacionActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);

			this.getDepreciacionActivoFijosFK_IdTipoDepreciacionEmpresa();

			this.inicializarActualizarBindingDepreciacionActivoFijo(false);

			//if(DepreciacionActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.depreciacionactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDepreciacionActivoFijo() {
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.dispose();
			this.jInternalFrameDetalleFormDepreciacionActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoDepreciacionActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionDepreciacionActivoFijo!=null) {
			this.jInternalFrameImportacionDepreciacionActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionDepreciacionActivoFijo.dispose();
			this.jInternalFrameImportacionDepreciacionActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDepreciacionActivoFijo();
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDepreciacionActivoFijo")) {
				jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDepreciacionActivoFijo")) {
				jButtonDuplicarDepreciacionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDepreciacionActivoFijo")) {
				jButtonCopiarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDepreciacionActivoFijo")) {
				jButtonVerFormDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDepreciacionActivoFijo")) {
				jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDepreciacionActivoFijo")) {
				jButtonDuplicarDepreciacionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDepreciacionActivoFijo")) {
				jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDepreciacionActivoFijo")) {
				jButtonDuplicarDepreciacionActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDepreciacionActivoFijo")) {
				jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDepreciacionActivoFijo")) {
				jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDepreciacionActivoFijo")) {
				jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDepreciacionActivoFijo")) {
				jButtonModificarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDepreciacionActivoFijo")) {
				jButtonModificarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDepreciacionActivoFijo")) {
				jButtonModificarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDepreciacionActivoFijo")) {
				jButtonActualizarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDepreciacionActivoFijo")) {
				jButtonActualizarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDepreciacionActivoFijo")) {
				jButtonActualizarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDepreciacionActivoFijo")) {
				jButtonEliminarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDepreciacionActivoFijo")) {
				jButtonEliminarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDepreciacionActivoFijo")) {
				jButtonEliminarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDepreciacionActivoFijo")) {
				jButtonCancelarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDepreciacionActivoFijo")) {
				jButtonCancelarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDepreciacionActivoFijo")) {
				jButtonCancelarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDepreciacionActivoFijo")) {
				jButtonCerrarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDepreciacionActivoFijo")) {
				jButtonCerrarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDepreciacionActivoFijo")) {
				jButtonCerrarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDepreciacionActivoFijo")) {
				jButtonMostrarOcultarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDepreciacionActivoFijo")) {
				jButtonCancelarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDepreciacionActivoFijo")) {
				jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDepreciacionActivoFijo")) {
				jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDepreciacionActivoFijo")) {
				jButtonCopiarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDepreciacionActivoFijo")) {
				jButtonVerFormDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDepreciacionActivoFijo")) {
				jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDepreciacionActivoFijo")) {
				jButtonCopiarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDepreciacionActivoFijo")) {
				jButtonVerFormDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDepreciacionActivoFijo")) {
				jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDepreciacionActivoFijo")) {
				jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDepreciacionActivoFijo")) {
				jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDepreciacionActivoFijo")) {
				jButtonRecargarInformacionDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDepreciacionActivoFijo")) {
				jButtonRecargarInformacionDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDepreciacionActivoFijo")) {
				jButtonRecargarInformacionDepreciacionActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDepreciacionActivoFijo")) {
				jButtonAnterioresDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDepreciacionActivoFijo")) {
				jButtonAnterioresDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDepreciacionActivoFijo")) {
				jButtonAnterioresDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDepreciacionActivoFijo")) {
				jButtonSiguientesDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDepreciacionActivoFijo")) {
				jButtonSiguientesDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDepreciacionActivoFijo")) {
				jButtonSiguientesDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDepreciacionActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByDepreciacionActivoFijo")) {
				jButtonAbrirOrderByDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDepreciacionActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarDepreciacionActivoFijo")) {
				jButtonMostrarOcultarDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDepreciacionActivoFijo")) {
				jButtonNuevoGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDepreciacionActivoFijo")) {
				jButtonNuevoGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDepreciacionActivoFijo")) {
				jButtonNuevoGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDepreciacionActivoFijo")) {
				jButtonCerrarReporteDinamicoDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDepreciacionActivoFijo")) {
				jButtonGenerarReporteDinamicoDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDepreciacionActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDepreciacionActivoFijo")) {
				jButtonCerrarImportacionDepreciacionActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDepreciacionActivoFijo")) {
				
				jButtonGenerarImportacionDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDepreciacionActivoFijo")) {
				
				jButtonAbrirImportacionDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDepreciacionActivoFijo")) {
				jComboBoxTiposAccionesDepreciacionActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDepreciacionActivoFijo")) {
				jComboBoxTiposRelacionesDepreciacionActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDepreciacionActivoFijo")) {
				jComboBoxTiposAccionesDepreciacionActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDepreciacionActivoFijo")) {
				
				jComboBoxTiposSeleccionarDepreciacionActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDepreciacionActivoFijo")) {
				jTextFieldValorCampoGeneralDepreciacionActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDepreciacionActivoFijo")) {
				jButtonAbrirOrderByDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDepreciacionActivoFijo")) {
				jButtonAbrirOrderByDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDepreciacionActivoFijo")) {
				jButtonCerrarOrderByDepreciacionActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDepreciacionActivoFijoBusqueda")) {
				this.jButtonidDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDepreciacionActivoFijoUpdate")) {
				this.jButtonid_empresaDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_empresaDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDepreciacionActivoFijoUpdate")) {
				this.jButtonid_sucursalDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_sucursalDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoDepreciacionActivoFijoUpdate")) {
				this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate")) {
				this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_depre_actiDepreciacionActivoFijoUpdate")) {
				this.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_depre_actiDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_estado_depre_actiDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDepreciacionActivoFijoUpdate")) {
				this.jButtonid_anioDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_anioDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDepreciacionActivoFijoUpdate")) {
				this.jButtonid_mesDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_mesDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraDepreciacionActivoFijoBusqueda")) {
				this.jButtonfecha_compraDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_depre_actiDepreciacionActivoFijoBusqueda")) {
				this.jButtonfecha_depre_actiDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeDepreciacionActivoFijoBusqueda")) {
				this.jButtonporcentajeDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoDepreciacionActivoFijoBusqueda")) {
				this.jButtoncostoDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_acumuladoDepreciacionActivoFijoBusqueda")) {
				this.jButtonvalor_acumuladoDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_totalDepreciacionActivoFijoBusqueda")) {
				this.jButtonvalor_totalDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_gastoDepreciacionActivoFijoBusqueda")) {
				this.jButtonvalor_gastoDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDepreciacionActivoFijoBusqueda")) {
				this.jButtonfechaDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioDepreciacionActivoFijo")) {
				this.jButtonFK_IdAnioDepreciacionActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDepreciacionActivoFijoDepreciacionActivoFijo")) {
				this.jButtonFK_IdDepreciacionActivoFijoDepreciacionActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDetalleActivoFijoDepreciacionActivoFijo")) {
				this.jButtonFK_IdDetalleActivoFijoDepreciacionActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesDepreciacionActivoFijo")) {
				this.jButtonFK_IdMesDepreciacionActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo")) {
				this.jButtonFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijoActionPerformed(evt);
			}
			
			;
			
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDepreciacionActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				


				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepreciacionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepreciacionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DepreciacionActivoFijo depreciacionactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				depreciacionactivofijoLocal=this.depreciacionactivofijo;
			} else {
				depreciacionactivofijoLocal=this.depreciacionactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
							
				
				


				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepreciacionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepreciacionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
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
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
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
			
			


			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
								
						
				


				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepreciacionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepreciacionActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
								
				
				


				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepreciacionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepreciacionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
							
				
				


				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepreciacionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepreciacionActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
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
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
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
			
			


			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
								
				
				


				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepreciacionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepreciacionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDepreciacionActivoFijo")) {
					jCheckBoxSeleccionarTodosDepreciacionActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDepreciacionActivoFijo")) {
					jCheckBoxSeleccionadosDepreciacionActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDepreciacionActivoFijo")) {
					
				}
				
				


				
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepreciacionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepreciacionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
												
				
				


				
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepreciacionActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepreciacionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
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
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
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
			
			


			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDepreciacionActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepreciacionActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepreciacionActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.depreciacionactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.depreciacionactivofijo);
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
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
				
				


				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DepreciacionActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DepreciacionActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDepreciacionActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.depreciacionactivofijoAnterior =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDepreciacionActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDepreciacionActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDepreciacionActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.depreciacionactivofijo =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.depreciacionactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDepreciacionActivoFijo")) {
				
				}
				
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDepreciacionActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDepreciacionActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDepreciacionActivoFijo")) {
			
			}
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDepreciacionActivoFijo();
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoDepreciacionActivoFijo")) {
				jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDepreciacionActivoFijo")) {
				jButtonDuplicarDepreciacionActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDepreciacionActivoFijo")) {
				jButtonCopiarDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDepreciacionActivoFijo")) {
				jButtonVerFormDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDepreciacionActivoFijo")) {
				jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDepreciacionActivoFijo")) {
				jButtonModificarDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDepreciacionActivoFijo")) {
				jButtonActualizarDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDepreciacionActivoFijo")) {
				jButtonEliminarDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDepreciacionActivoFijo")) {
				jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDepreciacionActivoFijo")) {
				jButtonCancelarDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDepreciacionActivoFijo")) {
				jButtonCerrarDepreciacionActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDepreciacionActivoFijo")) {
				jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDepreciacionActivoFijo")) {
				jButtonNuevoGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDepreciacionActivoFijo")) {
				jButtonAbrirOrderByDepreciacionActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDepreciacionActivoFijo")) {
				jButtonRecargarInformacionDepreciacionActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDepreciacionActivoFijo")) {
				jButtonAnterioresDepreciacionActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDepreciacionActivoFijo")) {
				jButtonSiguientesDepreciacionActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDepreciacionActivoFijoBusqueda")) {
				this.jButtonidDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDepreciacionActivoFijoUpdate")) {
				this.jButtonid_empresaDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_empresaDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDepreciacionActivoFijoUpdate")) {
				this.jButtonid_sucursalDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_sucursalDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoDepreciacionActivoFijoUpdate")) {
				this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate")) {
				this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_depre_actiDepreciacionActivoFijoUpdate")) {
				this.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_depre_actiDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_estado_depre_actiDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioDepreciacionActivoFijoUpdate")) {
				this.jButtonid_anioDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_anioDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesDepreciacionActivoFijoUpdate")) {
				this.jButtonid_mesDepreciacionActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesDepreciacionActivoFijoBusqueda")) {
				this.jButtonid_mesDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraDepreciacionActivoFijoBusqueda")) {
				this.jButtonfecha_compraDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_depre_actiDepreciacionActivoFijoBusqueda")) {
				this.jButtonfecha_depre_actiDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeDepreciacionActivoFijoBusqueda")) {
				this.jButtonporcentajeDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoDepreciacionActivoFijoBusqueda")) {
				this.jButtoncostoDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_acumuladoDepreciacionActivoFijoBusqueda")) {
				this.jButtonvalor_acumuladoDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_totalDepreciacionActivoFijoBusqueda")) {
				this.jButtonvalor_totalDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_gastoDepreciacionActivoFijoBusqueda")) {
				this.jButtonvalor_gastoDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDepreciacionActivoFijoBusqueda")) {
				this.jButtonfechaDepreciacionActivoFijoBusquedaActionPerformed(evt);
			}
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDepreciacionActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDepreciacionActivoFijo")) {
				closingInternalFrameDepreciacionActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarDepreciacionActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormDepreciacionActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            DepreciacionActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(DepreciacionActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormDepreciacionActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDepreciacionActivoFijoActionPerformed(null);
			}
			
			DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.depreciacionactivofijo,new Object(),this.depreciacionactivofijoParameterGeneral,this.depreciacionactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDepreciacionActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDepreciacionActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDepreciacionActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.depreciacionactivofijo)) {
			if(!esControlTabla) {
				if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);			
				}
				
				if(this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.depreciacionactivofijoReturnGeneral=depreciacionactivofijoLogic.procesarEventosDepreciacionActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.depreciacionactivofijoLogic.getDepreciacionActivoFijos(),this.depreciacionactivofijo,this.depreciacionactivofijoParameterGeneral,this.isEsNuevoDepreciacionActivoFijo,classes);//this.depreciacionactivofijoLogic.getDepreciacionActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDepreciacionActivoFijo(this.depreciacionactivofijoReturnGeneral,this.depreciacionactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDepreciacionActivoFijo(classes,this.depreciacionactivofijoReturnGeneral,this.depreciacionactivofijoBean,false);
					}
						
					if(this.depreciacionactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDepreciacionActivoFijo(this.depreciacionactivofijoReturnGeneral.getDepreciacionActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDepreciacionActivoFijo(this.depreciacionactivofijoReturnGeneral.getDepreciacionActivoFijo());	
					}
						
					if(this.depreciacionactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDepreciacionActivoFijo(this.depreciacionactivofijoReturnGeneral.getDepreciacionActivoFijo(),classes);//this.depreciacionactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDepreciacionActivoFijo(this.depreciacionactivofijo,classes);//this.depreciacionactivofijoBean);									
				}
			
				if(DepreciacionActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDepreciacionActivoFijo(this.depreciacionactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDepreciacionActivoFijo(this.depreciacionactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.depreciacionactivofijoAnterior!=null) {
						this.depreciacionactivofijo=this.depreciacionactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.depreciacionactivofijoReturnGeneral=depreciacionactivofijoLogic.procesarEventosDepreciacionActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.depreciacionactivofijoLogic.getDepreciacionActivoFijos(),this.depreciacionactivofijo,this.depreciacionactivofijoParameterGeneral,this.isEsNuevoDepreciacionActivoFijo,classes);//this.depreciacionactivofijoLogic.getDepreciacionActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.depreciacionactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.depreciacionactivofijoReturnGeneral.getDepreciacionActivoFijo(),depreciacionactivofijoLogic.getDepreciacionActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.depreciacionactivofijoReturnGeneral.getDepreciacionActivoFijo(),this.depreciacionactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDepreciacionActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosDepreciacionActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDepreciacionActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosDepreciacionActivoFijo() throws Exception {
		
		DepreciacionActivoFijoModel depreciacionactivofijoModel=(DepreciacionActivoFijoModel)this.jTableDatosDepreciacionActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			depreciacionactivofijoModel.depreciacionactivofijos=this.depreciacionactivofijoLogic.getDepreciacionActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			depreciacionactivofijoModel.depreciacionactivofijos=this.depreciacionactivofijos;
		}
		
		
		((DepreciacionActivoFijoModel) this.jTableDatosDepreciacionActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDepreciacionActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdepreciacionactivofijoAnterior(),this.depreciacionactivofijoLogic.getDepreciacionActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdepreciacionactivofijoAnterior(),this.depreciacionactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDepreciacionActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
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
										
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.depreciacionactivofijo,new Object(),generalEntityParameterGeneral,this.depreciacionactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DepreciacionActivoFijoConstantesFunciones.getClassesRelationshipsOfDepreciacionActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DepreciacionActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfDepreciacionActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDepreciacionActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.depreciacionactivofijo,new Object(),generalEntityParameterGeneral,this.depreciacionactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDepreciacionActivoFijo(DepreciacionActivoFijoBean depreciacionactivofijoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDepreciacionActivoFijo(ArrayList<Classe> classes,DepreciacionActivoFijoReturnGeneral depreciacionactivofijoReturnGeneral,DepreciacionActivoFijoBean depreciacionactivofijoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.depreciacionactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo = new DepreciacionActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.depreciacionactivofijoSessionBean.getConGuardarRelaciones(),this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.depreciacionactivofijoLogic=this.depreciacionactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyDepreciacionActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDepreciacionActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDepreciacionActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDepreciacionActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDepreciacionActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDepreciacionActivoFijo"));
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonModificarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarDepreciacionActivoFijo"));

		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonModificarToolBarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarDepreciacionActivoFijo"));
					
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemModificarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarDepreciacionActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonActualizarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarDepreciacionActivoFijo"));
		
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonActualizarToolBarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDepreciacionActivoFijo"));
						
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemActualizarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDepreciacionActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonEliminarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarDepreciacionActivoFijo"));
		
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonEliminarToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarDepreciacionActivoFijo"));
								
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemEliminarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDepreciacionActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonCancelarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarDepreciacionActivoFijo"));
		
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonCancelarToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarDepreciacionActivoFijo"));
					
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemCancelarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDepreciacionActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemDetalleCerrarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDepreciacionActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDepreciacionActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDepreciacionActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDepreciacionActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonidDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_empresaDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_empresaDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_sucursalDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_sucursalDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_depre_actiDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_depre_actiDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_anioDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_anioDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_mesDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_mesDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonfecha_compraDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_depre_actiDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonporcentajeDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtoncostoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"costoDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valor_acumuladoDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonvalor_totalDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonvalor_gastoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valor_gastoDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonfechaDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDepreciacionActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTabbedPaneRelacionesDepreciacionActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDepreciacionActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDepreciacionActivoFijo"));
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDepreciacionActivoFijo"));
		}
		
		this.jTableDatosDepreciacionActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDepreciacionActivoFijo"));
		
		this.jTableDatosDepreciacionActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDepreciacionActivoFijo"));
		
		this.jButtonNuevoDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoDepreciacionActivoFijo"));
		
		this.jButtonDuplicarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarDepreciacionActivoFijo"));
		
		this.jButtonCopiarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarDepreciacionActivoFijo"));
		
		this.jButtonVerFormDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormDepreciacionActivoFijo"));
		
		
		this.jButtonNuevoToolBarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarDepreciacionActivoFijo"));
			
		this.jButtonDuplicarToolBarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDepreciacionActivoFijo"));
			
		this.jMenuItemNuevoDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDepreciacionActivoFijo"));
			
		this.jMenuItemDuplicarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDepreciacionActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDepreciacionActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDepreciacionActivoFijo"));
			
		this.jMenuItemNuevoRelacionesDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDepreciacionActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonModificarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarDepreciacionActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonModificarToolBarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarDepreciacionActivoFijo"));
			
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemModificarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarDepreciacionActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonActualizarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarDepreciacionActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonActualizarToolBarDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDepreciacionActivoFijo"));
				
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemActualizarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDepreciacionActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonEliminarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarDepreciacionActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonEliminarToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarDepreciacionActivoFijo"));
						
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemEliminarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDepreciacionActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonCancelarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarDepreciacionActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonCancelarToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarDepreciacionActivoFijo"));
			
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemCancelarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDepreciacionActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDepreciacionActivoFijo"));		
		
		
		this.jButtonCerrarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarDepreciacionActivoFijo"));
		
		
		this.jButtonCerrarToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarDepreciacionActivoFijo"));
			
		this.jMenuItemCerrarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDepreciacionActivoFijo"));
			
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jMenuItemDetalleCerrarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDepreciacionActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosDepreciacionActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDepreciacionActivoFijo"));
		}
		
		this.jButtonCopiarToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarDepreciacionActivoFijo"));
			
		this.jButtonVerFormToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarDepreciacionActivoFijo"));
		
		this.jMenuItemGuardarCambiosDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDepreciacionActivoFijo"));
			
		this.jMenuItemCopiarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDepreciacionActivoFijo"));		
		
		this.jMenuItemVerFormDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDepreciacionActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDepreciacionActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDepreciacionActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDepreciacionActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionDepreciacionActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDepreciacionActivoFijo"));
		
		this.jMenuItemRecargarInformacionDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDepreciacionActivoFijo"));		
		
		
		
		this.jButtonAnterioresDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresDepreciacionActivoFijo"));
		
		
		this.jButtonAnterioresToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDepreciacionActivoFijo"));
		
		this.jMenuItemAnterioresDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDepreciacionActivoFijo"));		
		
		
		this.jButtonSiguientesDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesDepreciacionActivoFijo"));
		
		
		this.jButtonSiguientesToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDepreciacionActivoFijo"));
			
		this.jMenuItemSiguientesDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDepreciacionActivoFijo"));
			
		this.jMenuItemAbrirOrderByDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDepreciacionActivoFijo"));
			
		this.jMenuItemMostrarOcultarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDepreciacionActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDepreciacionActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDepreciacionActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDepreciacionActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDepreciacionActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDepreciacionActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDepreciacionActivoFijo"));

		this.jCheckBoxSeleccionadosDepreciacionActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDepreciacionActivoFijo"));
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDepreciacionActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesDepreciacionActivoFijo"));
			
		this.jComboBoxTiposAccionesDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesDepreciacionActivoFijo"));
					
		this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDepreciacionActivoFijo"));
			
		this.jTextFieldValorCampoGeneralDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDepreciacionActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonidDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_empresaDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_empresaDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_sucursalDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_sucursalDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_depre_actiDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_depre_actiDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_anioDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_anioDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_mesDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_mesDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonfecha_compraDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_depre_actiDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonporcentajeDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtoncostoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"costoDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valor_acumuladoDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonvalor_totalDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonvalor_gastoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valor_gastoDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonfechaDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDepreciacionActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdAnioDepreciacionActivoFijo"));

			this.jButtonFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdDepreciacionActivoFijoDepreciacionActivoFijo"));

			this.jButtonFK_IdDetalleActivoFijoDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoDepreciacionActivoFijo"));

			this.jButtonFK_IdMesDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdMesDepreciacionActivoFijo"));

			this.jButtonFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDepreciacionActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDepreciacionActivoFijo"));
				this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDepreciacionActivoFijo"));
				this.jInternalFrameReporteDinamicoDepreciacionActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDepreciacionActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDepreciacionActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDepreciacionActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDepreciacionActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDepreciacionActivoFijo!=null) {
				this.jInternalFrameImportacionDepreciacionActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDepreciacionActivoFijo"));
				this.jInternalFrameImportacionDepreciacionActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDepreciacionActivoFijo"));
				this.jInternalFrameImportacionDepreciacionActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDepreciacionActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByDepreciacionActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarDepreciacionActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDepreciacionActivoFijo"));			
			
			if(this.jInternalFrameOrderByDepreciacionActivoFijo!=null) {
				this.jInternalFrameOrderByDepreciacionActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDepreciacionActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTabbedPaneRelacionesDepreciacionActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDepreciacionActivoFijo"));
		
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
            		closingInternalFrameDepreciacionActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDepreciacionActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            DepreciacionActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(DepreciacionActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormDepreciacionActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDepreciacionActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDepreciacionActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDepreciacionActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDepreciacionActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDepreciacionActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDepreciacionActivoFijo";
		inputMap = this.jButtonNuevoDepreciacionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDepreciacionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDepreciacionActivoFijo";
		inputMap = this.jButtonNuevoRelacionesDepreciacionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDepreciacionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDepreciacionActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDepreciacionActivoFijo";
		inputMap = this.jButtonModificarDepreciacionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDepreciacionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDepreciacionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDepreciacionActivoFijo";
		inputMap = this.jButtonActualizarDepreciacionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDepreciacionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDepreciacionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDepreciacionActivoFijo";
		inputMap = this.jButtonEliminarDepreciacionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDepreciacionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDepreciacionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDepreciacionActivoFijo";
		inputMap = this.jButtonCancelarDepreciacionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDepreciacionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDepreciacionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDepreciacionActivoFijo";
		inputMap = this.jButtonCerrarDepreciacionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDepreciacionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDepreciacionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDepreciacionActivoFijo";
		inputMap = this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosDepreciacionActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonGuardarCambiosDepreciacionActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDepreciacionActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDepreciacionActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDepreciacionActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDepreciacionActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDepreciacionActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDepreciacionActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDepreciacionActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonidDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_empresaDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_empresaDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_sucursalDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_sucursalDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_detalle_activo_fijoDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_detalle_activo_fijoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_depreciacion_empresaDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_depreciacion_empresaDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_estado_depre_actiDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_depre_actiDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_estado_depre_actiDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_depre_actiDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_anioDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_anioDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_anioDepreciacionActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_mesDepreciacionActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonid_mesDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_mesDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonfecha_compraDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonfecha_depre_actiDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_depre_actiDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonporcentajeDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtoncostoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"costoDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonvalor_acumuladoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valor_acumuladoDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonvalor_totalDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valor_totalDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonvalor_gastoDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"valor_gastoDepreciacionActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jButtonfechaDepreciacionActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"fechaDepreciacionActivoFijoBusqueda"));
		
		
		this.jButtonFK_IdAnioDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdAnioDepreciacionActivoFijo"));

		this.jButtonFK_IdDepreciacionActivoFijoDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdDepreciacionActivoFijoDepreciacionActivoFijo"));

		this.jButtonFK_IdDetalleActivoFijoDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoDepreciacionActivoFijo"));

		this.jButtonFK_IdMesDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdMesDepreciacionActivoFijo"));

		this.jButtonFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo.addActionListener(new ButtonActionListener(this,"FK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDepreciacionActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDepreciacionActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDepreciacionActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDepreciacionActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDepreciacionActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
					depreciacionactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijos) {
					depreciacionactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDepreciacionActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
						depreciacionactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijos) {
						depreciacionactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDepreciacionActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDepreciacionActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDepreciacionActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDepreciacionActivoFijo.getSelectedRows();
			
			DepreciacionActivoFijo depreciacionactivofijoLocal=new DepreciacionActivoFijo();
			
			//this.seleccionarTodosDepreciacionActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					depreciacionactivofijoLocal =(DepreciacionActivoFijo) this.depreciacionactivofijoLogic.getDepreciacionActivoFijos().toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					depreciacionactivofijoLocal =(DepreciacionActivoFijo) this.depreciacionactivofijos.toArray()[this.jTableDatosDepreciacionActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				depreciacionactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
						depreciacionactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijos) {
						depreciacionactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDepreciacionActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDepreciacionActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDepreciacionActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDepreciacionActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDepreciacionActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDepreciacionActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDepreciacionActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
				
						if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							depreciacionactivofijoAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI)) {
							existe=true;
							depreciacionactivofijoAux.setfecha_depre_acti(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							depreciacionactivofijoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							depreciacionactivofijoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO)) {
							existe=true;
							depreciacionactivofijoAux.setvalor_acumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL)) {
							existe=true;
							depreciacionactivofijoAux.setvalor_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO)) {
							existe=true;
							depreciacionactivofijoAux.setvalor_gasto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							depreciacionactivofijoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijos) {
					
						if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							depreciacionactivofijoAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI)) {
							existe=true;
							depreciacionactivofijoAux.setfecha_depre_acti(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							depreciacionactivofijoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							depreciacionactivofijoAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO)) {
							existe=true;
							depreciacionactivofijoAux.setvalor_acumulado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL)) {
							existe=true;
							depreciacionactivofijoAux.setvalor_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO)) {
							existe=true;
							depreciacionactivofijoAux.setvalor_gasto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							depreciacionactivofijoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDepreciacionActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDepreciacionActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDepreciacionActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDepreciacionActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessDepreciacionActivoFijo(conSplash);
				
					this.generarReporteDepreciacionActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepreciacionActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDepreciacionActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesDepreciacionActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDepreciacionActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesDepreciacionActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDepreciacionActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesDepreciacionActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDepreciacionActivoFijo();
				
				this.exportarDepreciacionActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepreciacionActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDepreciacionActivoFijos();
				//this.importarDepreciacionActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepreciacionActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDepreciacionActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDepreciacionActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesDepreciacionActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Depreciacion Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDepreciacionActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDepreciacionActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDepreciacionActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Depreciacion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDepreciacionActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else if(DepreciacionActivoFijoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDepreciacionActivoFijo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDepreciacionActivoFijo(conSplash);
					
						//this.actualizarParametrosGeneralDepreciacionActivoFijo();
						
						this.generarReporteProcesoAccionDepreciacionActivoFijosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDepreciacionActivoFijo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Depreciacion Activo FijoS SELECCIONADOS?", "MANTENIMIENTO DE Depreciacion Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDepreciacionActivoFijo();
				
						this.actualizarParametrosGeneralDepreciacionActivoFijo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.depreciacionactivofijoReturnGeneral=depreciacionactivofijoLogic.procesarAccionDepreciacionActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.depreciacionactivofijoLogic.getDepreciacionActivoFijos(),this.depreciacionactivofijoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDepreciacionActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDepreciacionActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDepreciacionActivoFijo();
					
					DepreciacionActivoFijoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDepreciacionActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDepreciacionActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxTiposAccionesFormularioDepreciacionActivoFijo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDepreciacionActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDepreciacionActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDepreciacionActivoFijo();
			
			if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();		
			DepreciacionActivoFijo depreciacionactivofijo=new DepreciacionActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDepreciacionActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDepreciacionActivoFijo.getSelectedItem();
			
			
			
			
			depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(depreciacionactivofijosSeleccionados.size()==1) {
				for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijosSeleccionados) {
					depreciacionactivofijo=depreciacionactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDepreciacionActivoFijo();
			
      		//this.finishProcessDepreciacionActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDepreciacionActivoFijoReturnGeneral() throws Exception {
		if(this.depreciacionactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.depreciacionactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.depreciacionactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.depreciacionactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.depreciacionactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.depreciacionactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDepreciacionActivoFijo(false);
		}
		
		if(this.depreciacionactivofijoReturnGeneral.getConRetornoLista() || this.depreciacionactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.depreciacionactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.depreciacionactivofijoLogic.setDepreciacionActivoFijos(this.depreciacionactivofijoReturnGeneral.getDepreciacionActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.depreciacionactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.depreciacionactivofijoLogic.setDepreciacionActivoFijo(this.depreciacionactivofijoReturnGeneral.getDepreciacionActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDepreciacionActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralDepreciacionActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<DepreciacionActivoFijo> getDepreciacionActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDepreciacionActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijoLogic.getDepreciacionActivoFijos()) {
					if(depreciacionactivofijoAux.getIsSelected()) {
						depreciacionactivofijosSeleccionados.add(depreciacionactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DepreciacionActivoFijo depreciacionactivofijoAux:this.depreciacionactivofijos) {
					if(depreciacionactivofijoAux.getIsSelected()) {
						depreciacionactivofijosSeleccionados.add(depreciacionactivofijoAux);				
					}
				}
			}
			
			if(depreciacionactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						depreciacionactivofijosSeleccionados.addAll(this.depreciacionactivofijoLogic.getDepreciacionActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						depreciacionactivofijosSeleccionados.addAll(this.depreciacionactivofijos);				
					}
				}
			}
		} else {
			depreciacionactivofijosSeleccionados.add(this.depreciacionactivofijo);
		}
		
		return depreciacionactivofijosSeleccionados;
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
	
	public void generarReporteDepreciacionActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDepreciacionActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDepreciacionActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDepreciacionActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDepreciacionActivoFijosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Depreciacion Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDepreciacionActivoFijosSeleccionados() throws Exception {
		ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();		
		
		depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDepreciacionActivoFijos("Todos",depreciacionactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalDepreciacionActivoFijosSeleccionados() throws Exception {
		ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();		
		
		depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDepreciacionActivoFijos("Todos",depreciacionactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDepreciacionActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();
		
		depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDepreciacionActivoFijos("Todos",depreciacionactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDepreciacionActivoFijosSeleccionados() throws Exception {
		ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDepreciacionActivoFijo();
		
		
		depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDepreciacionActivoFijo();
		
		
		//this.generarReporteDepreciacionActivoFijos("Todos",depreciacionactivofijosSeleccionados ,depreciacionactivofijoImplementable,depreciacionactivofijoImplementableHome);
	}
	
	public void mostrarImportacionDepreciacionActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDepreciacionActivoFijo();
		
		this.abrirFrameImportacionDepreciacionActivoFijo();		
		
			
		//this.generarReporteDepreciacionActivoFijos("Todos",depreciacionactivofijosSeleccionados ,depreciacionactivofijoImplementable,depreciacionactivofijoImplementableHome);
	}
	
	public void importarDepreciacionActivoFijos() throws Exception {		
	
	}
	
	public void exportarDepreciacionActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDepreciacionActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDepreciacionActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDepreciacionActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Depreciacion Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDepreciacionActivoFijosSeleccionados() throws Exception {
		ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();		
		
		depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciacionactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDepreciacionActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDepreciacionActivoFijo(depreciacionactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//depreciacionactivofijoAux.setsDetalleGeneralEntityReporte(depreciacionactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciacion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDepreciacionActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=depreciacionactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getdetalleactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.gettipodepreciacionempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getestadodepreacti_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getfecha_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getfecha_depre_acti().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getvalor_acumulado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getvalor_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getvalor_gasto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=depreciacionactivofijo.getfecha().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDepreciacionActivoFijosSeleccionados() throws Exception {
		ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();		
		
		depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciacionactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DepreciacionActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDepreciacionActivoFijo(row);				
				iRow++;
			}				
			
			for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDepreciacionActivoFijo(depreciacionactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciacion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDepreciacionActivoFijosSeleccionados() throws Exception {
		ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();		
		
		depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"depreciacionactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("depreciacionactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("depreciacionactivofijo");
			//elementRoot.appendChild(element);
		
			for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijosSeleccionados) {
				element = document.createElement("depreciacionactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDepreciacionActivoFijo(depreciacionactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Depreciacion Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDepreciacionActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORACUMULADO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_VALORGASTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getdetalleactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.gettipodepreciacionempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getestadodepreacti_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getfecha_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getfecha_depre_acti());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getvalor_acumulado());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getvalor_total());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getvalor_gasto());
		cell = row.createCell(iColumn++);cell.setCellValue(depreciacionactivofijo.getfecha());				
	}
	
	public void setFilaDatosExportarXmlDepreciacionActivoFijo(DepreciacionActivoFijo depreciacionactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DepreciacionActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(depreciacionactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DepreciacionActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(depreciacionactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DepreciacionActivoFijoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(depreciacionactivofijo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DepreciacionActivoFijoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(depreciacionactivofijo.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementdetalleactivofijo_descripcion = document.createElement(DepreciacionActivoFijoConstantesFunciones.IDDETALLEACTIVOFIJO);
		elementdetalleactivofijo_descripcion.appendChild(document.createTextNode(depreciacionactivofijo.getdetalleactivofijo_descripcion()));
		element.appendChild(elementdetalleactivofijo_descripcion);

		Element elementtipodepreciacionempresa_descripcion = document.createElement(DepreciacionActivoFijoConstantesFunciones.IDTIPODEPRECIACIONEMPRESA);
		elementtipodepreciacionempresa_descripcion.appendChild(document.createTextNode(depreciacionactivofijo.gettipodepreciacionempresa_descripcion()));
		element.appendChild(elementtipodepreciacionempresa_descripcion);

		Element elementestadodepreacti_descripcion = document.createElement(DepreciacionActivoFijoConstantesFunciones.IDESTADODEPREACTI);
		elementestadodepreacti_descripcion.appendChild(document.createTextNode(depreciacionactivofijo.getestadodepreacti_descripcion()));
		element.appendChild(elementestadodepreacti_descripcion);

		Element elementanio_descripcion = document.createElement(DepreciacionActivoFijoConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(depreciacionactivofijo.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(DepreciacionActivoFijoConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(depreciacionactivofijo.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementfecha_compra = document.createElement(DepreciacionActivoFijoConstantesFunciones.FECHACOMPRA);
		elementfecha_compra.appendChild(document.createTextNode(depreciacionactivofijo.getfecha_compra().toString().trim()));
		element.appendChild(elementfecha_compra);

		Element elementfecha_depre_acti = document.createElement(DepreciacionActivoFijoConstantesFunciones.FECHADEPREACTI);
		elementfecha_depre_acti.appendChild(document.createTextNode(depreciacionactivofijo.getfecha_depre_acti().toString().trim()));
		element.appendChild(elementfecha_depre_acti);

		Element elementporcentaje = document.createElement(DepreciacionActivoFijoConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(depreciacionactivofijo.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementcosto = document.createElement(DepreciacionActivoFijoConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(depreciacionactivofijo.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementvalor_acumulado = document.createElement(DepreciacionActivoFijoConstantesFunciones.VALORACUMULADO);
		elementvalor_acumulado.appendChild(document.createTextNode(depreciacionactivofijo.getvalor_acumulado().toString().trim()));
		element.appendChild(elementvalor_acumulado);

		Element elementvalor_total = document.createElement(DepreciacionActivoFijoConstantesFunciones.VALORTOTAL);
		elementvalor_total.appendChild(document.createTextNode(depreciacionactivofijo.getvalor_total().toString().trim()));
		element.appendChild(elementvalor_total);

		Element elementvalor_gasto = document.createElement(DepreciacionActivoFijoConstantesFunciones.VALORGASTO);
		elementvalor_gasto.appendChild(document.createTextNode(depreciacionactivofijo.getvalor_gasto().toString().trim()));
		element.appendChild(elementvalor_gasto);

		Element elementfecha = document.createElement(DepreciacionActivoFijoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(depreciacionactivofijo.getfecha().toString().trim()));
		element.appendChild(elementfecha);
	}
	
	public void generarReporteGroupGenericoDepreciacionActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados=new ArrayList<DepreciacionActivoFijo>();
		
		depreciacionactivofijosSeleccionados=this.getDepreciacionActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDepreciacionActivoFijo(depreciacionactivofijosSeleccionados);
		
		this.generarReporteDepreciacionActivoFijos("Todos",depreciacionactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDepreciacionActivoFijo(ArrayList<DepreciacionActivoFijo> depreciacionactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DepreciacionActivoFijo depreciacionactivofijoAux:depreciacionactivofijosSeleccionados) {
				depreciacionactivofijoAux.setsDetalleGeneralEntityReporte(depreciacionactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					depreciacionactivofijoAux.setsDescripcionGeneralEntityReporte1(depreciacionactivofijoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					depreciacionactivofijoAux.setsDescripcionGeneralEntityReporte1(depreciacionactivofijoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO)) {
					existe=true;
					depreciacionactivofijoAux.setsDescripcionGeneralEntityReporte1(depreciacionactivofijoAux.getdetalleactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_IDTIPODEPRECIACIONEMPRESA)) {
					existe=true;
					depreciacionactivofijoAux.setsDescripcionGeneralEntityReporte1(depreciacionactivofijoAux.gettipodepreciacionempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_IDESTADODEPREACTI)) {
					existe=true;
					depreciacionactivofijoAux.setsDescripcionGeneralEntityReporte1(depreciacionactivofijoAux.getestadodepreacti_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					depreciacionactivofijoAux.setsDescripcionGeneralEntityReporte1(depreciacionactivofijoAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					depreciacionactivofijoAux.setsDescripcionGeneralEntityReporte1(depreciacionactivofijoAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHACOMPRA)) {
					existe=true;
					depreciacionactivofijoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(depreciacionactivofijoAux.getfecha_compra()));
				}
				 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHADEPREACTI)) {
					existe=true;
					depreciacionactivofijoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(depreciacionactivofijoAux.getfecha_depre_acti()));
				}
				 else if(sTipoSeleccionar.equals(DepreciacionActivoFijoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					depreciacionactivofijoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(depreciacionactivofijoAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DepreciacionActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDepreciacionActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaCancelarDepreciacionActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaModificarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaCancelarDepreciacionActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaModificarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaCancelarDepreciacionActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaModificarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaCancelarDepreciacionActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaModificarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaCancelarDepreciacionActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaCancelarDepreciacionActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaModificarDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaCancelarDepreciacionActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarDepreciacionActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DepreciacionActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsDepreciacionActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDepreciacionActivoFijo=false;
			//this.isVisibilidadCeldaVerFormDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaDuplicarDepreciacionActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosDepreciacionActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!depreciacionactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=false;												
			}
			
			this.jButtonCerrarDepreciacionActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDepreciacionActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.depreciacionactivofijo)) {
			this.isVisibilidadCeldaActualizarDepreciacionActivoFijo=false;
			this.isVisibilidadCeldaEliminarDepreciacionActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDepreciacionActivoFijo() {
	}
	
	public void actualizarEstadoPanelsDepreciacionActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciacionActivoFijo!=null) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosDepreciacionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepreciacionActivoFijo!=null) {
				this.jPanelPaginacionDepreciacionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepreciacionActivoFijo!=null) {
				this.jPanelParametrosReportesDepreciacionActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciacionActivoFijo!=null) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosDepreciacionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionDepreciacionActivoFijo!=null) {
				this.jPanelPaginacionDepreciacionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDepreciacionActivoFijo!=null) {
				this.jPanelParametrosReportesDepreciacionActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciacionActivoFijo!=null) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosDepreciacionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionDepreciacionActivoFijo!=null) {
				this.jPanelPaginacionDepreciacionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDepreciacionActivoFijo!=null) {
				this.jPanelParametrosReportesDepreciacionActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciacionActivoFijo!=null) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosDepreciacionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionDepreciacionActivoFijo!=null) {
				this.jPanelPaginacionDepreciacionActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDepreciacionActivoFijo!=null) {
				this.jPanelParametrosReportesDepreciacionActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciacionActivoFijo!=null) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosDepreciacionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepreciacionActivoFijo!=null) {
				this.jPanelPaginacionDepreciacionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepreciacionActivoFijo!=null) {
				this.jPanelParametrosReportesDepreciacionActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciacionActivoFijo!=null) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosDepreciacionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepreciacionActivoFijo!=null) {
				this.jPanelPaginacionDepreciacionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepreciacionActivoFijo!=null) {
				this.jPanelParametrosReportesDepreciacionActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosEdicionDepreciacionActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciacionActivoFijo!=null) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDepreciacionActivoFijo!=null) {
				this.jScrollPanelDatosDepreciacionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionDepreciacionActivoFijo!=null) {
				this.jPanelPaginacionDepreciacionActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDepreciacionActivoFijo!=null) {
				this.jPanelParametrosReportesDepreciacionActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDepreciacionActivoFijo!=null) {
					this.jTabbedPaneBusquedasDepreciacionActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDepreciacionActivoFijo!=null) {
				this.jPanelParametrosReportesDepreciacionActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDepreciacionActivoFijo!=null) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDepreciacionActivoFijo!=null) {
				this.jPanelParametrosReportesDepreciacionActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdAnioDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDepreciacionActivoFijo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDepreciacionActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdMes=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdMesDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdTipoDepreciacionEmpresa=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoDepreciacionEmpresa) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdAnio=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdAnioDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDepreciacionActivoFijo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDepreciacionActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdMes=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdMesDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdTipoDepreciacionEmpresa=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoDepreciacionEmpresa) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleActivoFijo(Boolean isParaDetalleActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleActivoFijoNegation=!isParaDetalleActivoFijo;

			this.isVisibilidadFK_IdAnio=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdAnioDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDepreciacionActivoFijo=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdDepreciacionActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaDetalleActivoFijo;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdMes=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdMesDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdTipoDepreciacionEmpresa=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdTipoDepreciacionEmpresa) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDepreciacionEmpresa(Boolean isParaTipoDepreciacionEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDepreciacionEmpresaNegation=!isParaTipoDepreciacionEmpresa;

			this.isVisibilidadFK_IdAnio=isParaTipoDepreciacionEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdAnioDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDepreciacionActivoFijo=isParaTipoDepreciacionEmpresaNegation;
			if(!this.isVisibilidadFK_IdDepreciacionActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaTipoDepreciacionEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdMes=isParaTipoDepreciacionEmpresaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdMesDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdTipoDepreciacionEmpresa=isParaTipoDepreciacionEmpresa;
			if(!this.isVisibilidadFK_IdTipoDepreciacionEmpresa) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoDepreActi(Boolean isParaEstadoDepreActi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoDepreActiNegation=!isParaEstadoDepreActi;

			this.isVisibilidadFK_IdAnio=isParaEstadoDepreActiNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdAnioDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDepreciacionActivoFijo=isParaEstadoDepreActi;
			if(!this.isVisibilidadFK_IdDepreciacionActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaEstadoDepreActiNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdMes=isParaEstadoDepreActiNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdMesDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdTipoDepreciacionEmpresa=isParaEstadoDepreActiNegation;
			if(!this.isVisibilidadFK_IdTipoDepreciacionEmpresa) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdAnioDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDepreciacionActivoFijo=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdDepreciacionActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdMesDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdTipoDepreciacionEmpresa=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTipoDepreciacionEmpresa) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdAnioDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDepreciacionActivoFijo=isParaMesNegation;
			if(!this.isVisibilidadFK_IdDepreciacionActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaMesNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdMesDepreciacionActivoFijo);}

			this.isVisibilidadFK_IdTipoDepreciacionEmpresa=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTipoDepreciacionEmpresa) {this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DepreciacionActivoFijoSessionBean depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		
		if(this.depreciacionactivofijoSessionBean==null) {
			this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		}
		
		this.depreciacionactivofijoSessionBean.setsUltimaBusquedaDepreciacionActivoFijo(this.getsAccionBusqueda());
		this.depreciacionactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.depreciacionactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			depreciacionactivofijoSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDepreciacionActivoFijo")) {
			depreciacionactivofijoSessionBean.setid_estado_depre_acti(this.getid_estado_depre_actiFK_IdDepreciacionActivoFijo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
			depreciacionactivofijoSessionBean.setid_detalle_activo_fijo(this.getid_detalle_activo_fijoFK_IdDetalleActivoFijo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			depreciacionactivofijoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			depreciacionactivofijoSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			depreciacionactivofijoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoDepreciacionEmpresa")) {
			depreciacionactivofijoSessionBean.setid_tipo_depreciacion_empresa(this.getid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DepreciacionActivoFijoSessionBean depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		
		if(this.depreciacionactivofijoSessionBean==null) {
			this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		}
		
		if(this.depreciacionactivofijoSessionBean.getsUltimaBusquedaDepreciacionActivoFijo()!=null&&!this.depreciacionactivofijoSessionBean.getsUltimaBusquedaDepreciacionActivoFijo().equals("")) {
			this.setsAccionBusqueda(depreciacionactivofijoSessionBean.getsUltimaBusquedaDepreciacionActivoFijo());
			this.setiNumeroPaginacion(depreciacionactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(depreciacionactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(depreciacionactivofijoSessionBean.getid_anio());
				depreciacionactivofijoSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDepreciacionActivoFijo")) {
				this.setid_estado_depre_actiFK_IdDepreciacionActivoFijo(depreciacionactivofijoSessionBean.getid_estado_depre_acti());
				depreciacionactivofijoSessionBean.setid_estado_depre_acti(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
				this.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(depreciacionactivofijoSessionBean.getid_detalle_activo_fijo());
				depreciacionactivofijoSessionBean.setid_detalle_activo_fijo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(depreciacionactivofijoSessionBean.getid_empresa());
				depreciacionactivofijoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(depreciacionactivofijoSessionBean.getid_mes());
				depreciacionactivofijoSessionBean.setid_mes(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(depreciacionactivofijoSessionBean.getid_sucursal());
				depreciacionactivofijoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoDepreciacionEmpresa")) {
				this.setid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa(depreciacionactivofijoSessionBean.getid_tipo_depreciacion_empresa());
				depreciacionactivofijoSessionBean.setid_tipo_depreciacion_empresa(-1L);
			}
		}
		
		this.depreciacionactivofijoSessionBean.setsUltimaBusquedaDepreciacionActivoFijo("");
		this.depreciacionactivofijoSessionBean.setiNumeroPaginacion(DepreciacionActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.depreciacionactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDepreciacionActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioDepreciacionActivoFijo();
		this.updateVisibilidadBusquedasFormularioDepreciacionActivoFijo();
		this.updateHabilitarBusquedasFormularioDepreciacionActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioDepreciacionActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponents().length>0) {
	

		if(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdAnioDepreciacionActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdAnioDepreciacionActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
				jPanel.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdAnioDepreciacionActivoFijo);
			}
		}

		if(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdDepreciacionActivoFijoDepreciacionActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
				jPanel.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);
			}
		}

		if(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoDepreciacionActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
				jPanel.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoDepreciacionActivoFijo);
			}
		}

		if(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdMesDepreciacionActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdMesDepreciacionActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
				jPanel.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdMesDepreciacionActivoFijo);
			}
		}

		if(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo!=null) {
			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
				jPanel.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDepreciacionActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdAnioDepreciacionActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarFK_IdAnioDepreciacionActivoFijo);
			if(!this.depreciacionactivofijoConstantesFunciones.mostrarFK_IdAnioDepreciacionActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(index);
			}

			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);
			if(!this.depreciacionactivofijoConstantesFunciones.mostrarFK_IdDepreciacionActivoFijoDepreciacionActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(index);
			}

			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarFK_IdDetalleActivoFijoDepreciacionActivoFijo);
			if(!this.depreciacionactivofijoConstantesFunciones.mostrarFK_IdDetalleActivoFijoDepreciacionActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(index);
			}

			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdMesDepreciacionActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarFK_IdMesDepreciacionActivoFijo);
			if(!this.depreciacionactivofijoConstantesFunciones.mostrarFK_IdMesDepreciacionActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(index);
			}

			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);
			if(!this.depreciacionactivofijoConstantesFunciones.mostrarFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo && index>-1) {
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDepreciacionActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdAnioDepreciacionActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarFK_IdAnioDepreciacionActivoFijo);
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setEnabledAt(index,this.depreciacionactivofijoConstantesFunciones.activarFK_IdAnioDepreciacionActivoFijo);
			}

			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setEnabledAt(index,this.depreciacionactivofijoConstantesFunciones.activarFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);
			}

			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarFK_IdDetalleActivoFijoDepreciacionActivoFijo);
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setEnabledAt(index,this.depreciacionactivofijoConstantesFunciones.activarFK_IdDetalleActivoFijoDepreciacionActivoFijo);
			}

			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdMesDepreciacionActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarFK_IdMesDepreciacionActivoFijo);
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setEnabledAt(index,this.depreciacionactivofijoConstantesFunciones.activarFK_IdMesDepreciacionActivoFijo);
			}

			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);
				this.jTabbedPaneBusquedasDepreciacionActivoFijo.setEnabledAt(index,this.depreciacionactivofijoConstantesFunciones.activarFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDepreciacionActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdAnioDepreciacionActivoFijo);

			this.jTabbedPaneBusquedasDepreciacionActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);

			this.depreciacionactivofijoConstantesFunciones.setResaltarFK_IdAnioDepreciacionActivoFijo(resaltar);

			jPanel.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdAnioDepreciacionActivoFijo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDepreciacionActivoFijo")) {
			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);

			this.jTabbedPaneBusquedasDepreciacionActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);

			this.depreciacionactivofijoConstantesFunciones.setResaltarFK_IdDepreciacionActivoFijoDepreciacionActivoFijo(resaltar);

			jPanel.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdDepreciacionActivoFijoDepreciacionActivoFijo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDetalleActivoFijo")) {
			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoDepreciacionActivoFijo);

			this.jTabbedPaneBusquedasDepreciacionActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);

			this.depreciacionactivofijoConstantesFunciones.setResaltarFK_IdDetalleActivoFijoDepreciacionActivoFijo(resaltar);

			jPanel.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdDetalleActivoFijoDepreciacionActivoFijo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdMesDepreciacionActivoFijo);

			this.jTabbedPaneBusquedasDepreciacionActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);

			this.depreciacionactivofijoConstantesFunciones.setResaltarFK_IdMesDepreciacionActivoFijo(resaltar);

			jPanel.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdMesDepreciacionActivoFijo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoDepreciacionEmpresa")) {
			index= this.jTabbedPaneBusquedasDepreciacionActivoFijo.indexOfComponent(this.jPanelFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);

			this.jTabbedPaneBusquedasDepreciacionActivoFijo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDepreciacionActivoFijo.getComponent(index);

			this.depreciacionactivofijoConstantesFunciones.setResaltarFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo(resaltar);

			jPanel.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarFK_IdTipoDepreciacionEmpresaDepreciacionActivoFijo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDepreciacionActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDepreciacionActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDepreciacionActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioDepreciacionActivoFijo();
		this.updateHabilitarResaltarControlesFormularioDepreciacionActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioDepreciacionActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.depreciacionactivofijoConstantesFunciones.resaltaridDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelidDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltaridDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarid_empresaDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarid_empresaDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarid_sucursalDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarid_sucursalDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarid_detalle_activo_fijoDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarid_tipo_depreciacion_empresaDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarid_tipo_depreciacion_empresaDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarid_estado_depre_actiDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarid_estado_depre_actiDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarid_anioDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarid_anioDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarid_mesDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarid_mesDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarfecha_compraDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_compraDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarfecha_compraDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarfecha_depre_actiDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_depre_actiDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarfecha_depre_actiDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarporcentajeDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldporcentajeDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarporcentajeDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarcostoDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldcostoDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarcostoDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_acumuladoDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_acumuladoDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_acumuladoDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_totalDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_totalDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_totalDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_gastoDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_gastoDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarvalor_gastoDepreciacionActivoFijo);}
		if(this.depreciacionactivofijoConstantesFunciones.resaltarfechaDepreciacionActivoFijo!=null && this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfechaDepreciacionActivoFijo.setBorder(this.depreciacionactivofijoConstantesFunciones.resaltarfechaDepreciacionActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDepreciacionActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelidDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostraridDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelidDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostraridDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_empresaDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelid_empresaDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_empresaDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_sucursalDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelid_sucursalDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_sucursalDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelid_detalle_activo_fijoDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_detalle_activo_fijoDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_tipo_depreciacion_empresaDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelid_tipo_depreciacion_empresaDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_tipo_depreciacion_empresaDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_estado_depre_actiDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelid_estado_depre_actiDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_estado_depre_actiDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_anioDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelid_anioDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_anioDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_mesDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelid_mesDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarid_mesDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_compraDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarfecha_compraDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelfecha_compraDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarfecha_compraDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_depre_actiDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarfecha_depre_actiDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelfecha_depre_actiDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarfecha_depre_actiDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldporcentajeDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarporcentajeDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelporcentajeDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarporcentajeDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldcostoDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarcostoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelcostoDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarcostoDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_acumuladoDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarvalor_acumuladoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelvalor_acumuladoDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarvalor_acumuladoDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_totalDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarvalor_totalDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelvalor_totalDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarvalor_totalDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_gastoDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarvalor_gastoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelvalor_gastoDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarvalor_gastoDepreciacionActivoFijo);
		//this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfechaDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarfechaDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jPanelfechaDepreciacionActivoFijo.setVisible(this.depreciacionactivofijoConstantesFunciones.mostrarfechaDepreciacionActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDepreciacionActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDepreciacionActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jLabelidDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activaridDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_empresaDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarid_empresaDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_sucursalDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarid_sucursalDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_detalle_activo_fijoDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarid_detalle_activo_fijoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_tipo_depreciacion_empresaDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarid_tipo_depreciacion_empresaDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_estado_depre_actiDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarid_estado_depre_actiDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_anioDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarid_anioDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jComboBoxid_mesDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarid_mesDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_compraDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarfecha_compraDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfecha_depre_actiDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarfecha_depre_actiDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldporcentajeDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarporcentajeDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldcostoDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarcostoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_acumuladoDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarvalor_acumuladoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_totalDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarvalor_totalDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jTextFieldvalor_gastoDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarvalor_gastoDepreciacionActivoFijo);
		this.jInternalFrameDetalleFormDepreciacionActivoFijo.jDateChooserfechaDepreciacionActivoFijo.setEnabled(this.depreciacionactivofijoConstantesFunciones.activarfechaDepreciacionActivoFijo);
		}
	}
	
		
}