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

import com.bydan.erp.contabilidad.util.ParametroContabilidadDefectoConstantesFunciones;
import com.bydan.erp.contabilidad.util.ParametroContabilidadDefectoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.ParametroContabilidadDefectoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.ParametroContabilidadDefectoBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ParametroContabilidadDefectoBeanSwingJInternalFrame extends ParametroContabilidadDefectoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroContabilidadDefectoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroContabilidadDefecto> parametrocontabilidaddefectoValidator = new ClassValidator<ParametroContabilidadDefecto>(ParametroContabilidadDefecto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroContabilidadDefecto parametrocontabilidaddefecto;	
	public ParametroContabilidadDefecto parametrocontabilidaddefectoAux;
	public ParametroContabilidadDefecto parametrocontabilidaddefectoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroContabilidadDefecto parametrocontabilidaddefectoTotales;
	public Long idParametroContabilidadDefectoActual;
	public Long iIdNuevoParametroContabilidadDefecto=0L;
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

	public String sFinalQueryComboTipoMoneda="";

	public List<TipoMoneda> tipomonedasForeignKey;

	public List<TipoMoneda> gettipomonedasForeignKey() {
		return tipomonedasForeignKey;
	}

	public void settipomonedasForeignKey(List<TipoMoneda> tipomonedasForeignKey) {
		this.tipomonedasForeignKey = tipomonedasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMoneda tipomonedaForeignKey;

	public TipoMoneda gettipomonedaForeignKey() {
		return tipomonedaForeignKey;
	}

	public void settipomonedaForeignKey(TipoMoneda tipomonedaForeignKey) {
		this.tipomonedaForeignKey = tipomonedaForeignKey;
	}

	public String sFinalQueryComboMoneda="";

	public List<Moneda> monedasForeignKey;

	public List<Moneda> getmonedasForeignKey() {
		return monedasForeignKey;
	}

	public void setmonedasForeignKey(List<Moneda> monedasForeignKey) {
		this.monedasForeignKey = monedasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Moneda monedaForeignKey;

	public Moneda getmonedaForeignKey() {
		return monedaForeignKey;
	}

	public void setmonedaForeignKey(Moneda monedaForeignKey) {
		this.monedaForeignKey = monedaForeignKey;
	}

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboTipoIntervalo="";

	public List<TipoIntervalo> tipointervalosForeignKey;

	public List<TipoIntervalo> gettipointervalosForeignKey() {
		return tipointervalosForeignKey;
	}

	public void settipointervalosForeignKey(List<TipoIntervalo> tipointervalosForeignKey) {
		this.tipointervalosForeignKey = tipointervalosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoIntervalo tipointervaloForeignKey;

	public TipoIntervalo gettipointervaloForeignKey() {
		return tipointervaloForeignKey;
	}

	public void settipointervaloForeignKey(TipoIntervalo tipointervaloForeignKey) {
		this.tipointervaloForeignKey = tipointervaloForeignKey;
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

	public String sFinalQueryComboTipoDocumento="";

	public List<TipoDocumento> tipodocumentosForeignKey;

	public List<TipoDocumento> gettipodocumentosForeignKey() {
		return tipodocumentosForeignKey;
	}

	public void settipodocumentosForeignKey(List<TipoDocumento> tipodocumentosForeignKey) {
		this.tipodocumentosForeignKey = tipodocumentosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDocumento tipodocumentoForeignKey;

	public TipoDocumento gettipodocumentoForeignKey() {
		return tipodocumentoForeignKey;
	}

	public void settipodocumentoForeignKey(TipoDocumento tipodocumentoForeignKey) {
		this.tipodocumentoForeignKey = tipodocumentoForeignKey;
	}

	public String sFinalQueryComboEstadoAsientoContable="";

	public List<EstadoAsientoContable> estadoasientocontablesForeignKey;

	public List<EstadoAsientoContable> getestadoasientocontablesForeignKey() {
		return estadoasientocontablesForeignKey;
	}

	public void setestadoasientocontablesForeignKey(List<EstadoAsientoContable> estadoasientocontablesForeignKey) {
		this.estadoasientocontablesForeignKey = estadoasientocontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoAsientoContable estadoasientocontableForeignKey;

	public EstadoAsientoContable getestadoasientocontableForeignKey() {
		return estadoasientocontableForeignKey;
	}

	public void setestadoasientocontableForeignKey(EstadoAsientoContable estadoasientocontableForeignKey) {
		this.estadoasientocontableForeignKey = estadoasientocontableForeignKey;
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
	
	public Boolean isPermisoTodoParametroContabilidadDefecto;
	public Boolean isPermisoNuevoParametroContabilidadDefecto;
	public Boolean isPermisoActualizarParametroContabilidadDefecto;
	public Boolean isPermisoActualizarOriginalParametroContabilidadDefecto;
	public Boolean isPermisoEliminarParametroContabilidadDefecto;
	public Boolean isPermisoGuardarCambiosParametroContabilidadDefecto;
	public Boolean isPermisoConsultaParametroContabilidadDefecto;
	public Boolean isPermisoBusquedaParametroContabilidadDefecto;
	public Boolean isPermisoReporteParametroContabilidadDefecto;
	public Boolean isPermisoPaginacionMedioParametroContabilidadDefecto;
	public Boolean isPermisoPaginacionAltoParametroContabilidadDefecto;
	public Boolean isPermisoPaginacionTodoParametroContabilidadDefecto;
	public Boolean isPermisoCopiarParametroContabilidadDefecto;
	public Boolean isPermisoVerFormParametroContabilidadDefecto;
	public Boolean isPermisoDuplicarParametroContabilidadDefecto;
	public Boolean isPermisoOrdenParametroContabilidadDefecto;
	
	
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
	
	public ParametroContabilidadDefectoParameterReturnGeneral parametrocontabilidaddefectoReturnGeneral;
	public ParametroContabilidadDefectoParameterReturnGeneral parametrocontabilidaddefectoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroContabilidadDefecto=false;
	public Boolean esParaAccionDesdeFormularioParametroContabilidadDefecto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroContabilidadDefectoSessionBeanAdditional parametrocontabilidaddefectoSessionBeanAdditional=null;
	
	public ParametroContabilidadDefectoSessionBeanAdditional getParametroContabilidadDefectoSessionBeanAdditional() {
		return this.parametrocontabilidaddefectoSessionBeanAdditional;
	}
	
	public void setParametroContabilidadDefectoSessionBeanAdditional(ParametroContabilidadDefectoSessionBeanAdditional parametrocontabilidaddefectoSessionBeanAdditional) {
		try {
			this.parametrocontabilidaddefectoSessionBeanAdditional=parametrocontabilidaddefectoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional parametrocontabilidaddefectoBeanSwingJInternalFrameAdditional=null;
	//public class ParametroContabilidadDefectoBeanSwingJInternalFrame
	
	public ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional getParametroContabilidadDefectoBeanSwingJInternalFrameAdditional() {
		return this.parametrocontabilidaddefectoBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroContabilidadDefectoBeanSwingJInternalFrameAdditional(ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional parametrocontabilidaddefectoBeanSwingJInternalFrameAdditional) {
		try {
			this.parametrocontabilidaddefectoBeanSwingJInternalFrameAdditional=parametrocontabilidaddefectoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroContabilidadDefectoLogic parametrocontabilidaddefectoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroContabilidadDefecto parametrocontabilidaddefectoBean;
	public ParametroContabilidadDefectoConstantesFunciones parametrocontabilidaddefectoConstantesFunciones;
	//public ParametroContabilidadDefectoParameterReturnGeneral parametrocontabilidaddefectoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TipoMonedaLogic tipomonedaLogic;
	public MonedaLogic monedaLogic;
	public ModuloLogic moduloLogic;
	public TipoIntervaloLogic tipointervaloLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	public TipoDocumentoLogic tipodocumentoLogic;
	public EstadoAsientoContableLogic estadoasientocontableLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroContabilidadDefecto> parametrocontabilidaddefectos;	
	//public List<ParametroContabilidadDefecto> parametrocontabilidaddefectosEliminados;
	//public List<ParametroContabilidadDefecto> parametrocontabilidaddefectosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroContabilidadDefecto=false;
	public Boolean isVisibilidadCeldaDuplicarParametroContabilidadDefecto=true;
	public Boolean isVisibilidadCeldaCopiarParametroContabilidadDefecto=true;
	public Boolean isVisibilidadCeldaVerFormParametroContabilidadDefecto=true;
	public Boolean isVisibilidadCeldaOrdenParametroContabilidadDefecto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=false;
	public Boolean isVisibilidadCeldaModificarParametroContabilidadDefecto=false;
	public Boolean isVisibilidadCeldaActualizarParametroContabilidadDefecto=false;
	public Boolean isVisibilidadCeldaEliminarParametroContabilidadDefecto=false;
	public Boolean isVisibilidadCeldaCancelarParametroContabilidadDefecto=false;
	public Boolean isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoAsientoContable=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdMoneda=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoDocumento=false;
	public Boolean isVisibilidadFK_IdTipoIntervalo=false;
	public Boolean isVisibilidadFK_IdTipoMoneda=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoParametroContabilidadDefecto() {
		return this.iIdNuevoParametroContabilidadDefecto;
	}

	public void setiIdNuevoParametroContabilidadDefecto(Long iIdNuevoParametroContabilidadDefecto) {
		this.iIdNuevoParametroContabilidadDefecto = iIdNuevoParametroContabilidadDefecto;
	}
	
	public Long getidParametroContabilidadDefectoActual() {
		return this.idParametroContabilidadDefectoActual;
	}

	public void setidParametroContabilidadDefectoActual(Long idParametroContabilidadDefectoActual) {
		this.idParametroContabilidadDefectoActual = idParametroContabilidadDefectoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroContabilidadDefecto getparametrocontabilidaddefecto() {
		return this.parametrocontabilidaddefecto;
	}

	public void setparametrocontabilidaddefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto) {
		this.parametrocontabilidaddefecto = parametrocontabilidaddefecto;
	}
	
	public ParametroContabilidadDefecto getparametrocontabilidaddefectoAux() {
		return this.parametrocontabilidaddefectoAux;
	}

	public void setparametrocontabilidaddefectoAux(ParametroContabilidadDefecto parametrocontabilidaddefectoAux) {
		this.parametrocontabilidaddefectoAux = parametrocontabilidaddefectoAux;
	}				
	
	public ParametroContabilidadDefecto getparametrocontabilidaddefectoAnterior() {
		return this.parametrocontabilidaddefectoAnterior;
	}

	public void setparametrocontabilidaddefectoAnterior(ParametroContabilidadDefecto parametrocontabilidaddefectoAnterior) {
		this.parametrocontabilidaddefectoAnterior = parametrocontabilidaddefectoAnterior;
	}	
	
	public ParametroContabilidadDefecto getparametrocontabilidaddefectoTotales() {
		return this.parametrocontabilidaddefectoTotales;
	}

	public void setparametrocontabilidaddefectoTotales(ParametroContabilidadDefecto parametrocontabilidaddefectoTotales) {
		this.parametrocontabilidaddefectoTotales = parametrocontabilidaddefectoTotales;
	}	
	
	public ParametroContabilidadDefecto getparametrocontabilidaddefectoBean() {
		return this.parametrocontabilidaddefectoBean;
	}

	public void setparametrocontabilidaddefectoBean(ParametroContabilidadDefecto parametrocontabilidaddefectoBean) {
		this.parametrocontabilidaddefectoBean = parametrocontabilidaddefectoBean;
	}	
	
	public ParametroContabilidadDefectoParameterReturnGeneral getparametrocontabilidaddefectoReturnGeneral() {
		return this.parametrocontabilidaddefectoReturnGeneral;
	}

	public void setparametrocontabilidaddefectoReturnGeneral(ParametroContabilidadDefectoParameterReturnGeneral parametrocontabilidaddefectoReturnGeneral) {
		this.parametrocontabilidaddefectoReturnGeneral = parametrocontabilidaddefectoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_asiento_contableFK_IdEstadoAsientoContable=-1L;

	public Long getid_estado_asiento_contableFK_IdEstadoAsientoContable() {
		return this.id_estado_asiento_contableFK_IdEstadoAsientoContable;
	}

	public void setid_estado_asiento_contableFK_IdEstadoAsientoContable(Long id_estado_asiento_contableFK_IdEstadoAsientoContable) {
		this.id_estado_asiento_contableFK_IdEstadoAsientoContable = id_estado_asiento_contableFK_IdEstadoAsientoContable;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_monedaFK_IdMoneda=-1L;

	public Long getid_monedaFK_IdMoneda() {
		return this.id_monedaFK_IdMoneda;
	}

	public void setid_monedaFK_IdMoneda(Long id_monedaFK_IdMoneda) {
		this.id_monedaFK_IdMoneda = id_monedaFK_IdMoneda;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_documentoFK_IdTipoDocumento=-1L;

	public Long getid_tipo_documentoFK_IdTipoDocumento() {
		return this.id_tipo_documentoFK_IdTipoDocumento;
	}

	public void setid_tipo_documentoFK_IdTipoDocumento(Long id_tipo_documentoFK_IdTipoDocumento) {
		this.id_tipo_documentoFK_IdTipoDocumento = id_tipo_documentoFK_IdTipoDocumento;
	}

	public Long id_tipo_intervaloFK_IdTipoIntervalo=-1L;

	public Long getid_tipo_intervaloFK_IdTipoIntervalo() {
		return this.id_tipo_intervaloFK_IdTipoIntervalo;
	}

	public void setid_tipo_intervaloFK_IdTipoIntervalo(Long id_tipo_intervaloFK_IdTipoIntervalo) {
		this.id_tipo_intervaloFK_IdTipoIntervalo = id_tipo_intervaloFK_IdTipoIntervalo;
	}

	public Long id_tipo_monedaFK_IdTipoMoneda=-1L;

	public Long getid_tipo_monedaFK_IdTipoMoneda() {
		return this.id_tipo_monedaFK_IdTipoMoneda;
	}

	public void setid_tipo_monedaFK_IdTipoMoneda(Long id_tipo_monedaFK_IdTipoMoneda) {
		this.id_tipo_monedaFK_IdTipoMoneda = id_tipo_monedaFK_IdTipoMoneda;
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
	
	
	public ParametroContabilidadDefectoLogic getParametroContabilidadDefectoLogic()	{		
		return parametrocontabilidaddefectoLogic;
	}

	public void setParametroContabilidadDefectoLogic(ParametroContabilidadDefectoLogic parametrocontabilidaddefectoLogic) {
		this.parametrocontabilidaddefectoLogic = parametrocontabilidaddefectoLogic;
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
	
	public Boolean getIsEsNuevoParametroContabilidadDefecto() {
		return isEsNuevoParametroContabilidadDefecto;
	}

	public void setIsEsNuevoParametroContabilidadDefecto(Boolean isEsNuevoParametroContabilidadDefecto) {
		this.isEsNuevoParametroContabilidadDefecto = isEsNuevoParametroContabilidadDefecto;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroContabilidadDefecto() {
		return esParaAccionDesdeFormularioParametroContabilidadDefecto;
	}
	
	public void setEsParaAccionDesdeFormularioParametroContabilidadDefecto(Boolean esParaAccionDesdeFormularioParametroContabilidadDefecto) {
		this.esParaAccionDesdeFormularioParametroContabilidadDefecto = esParaAccionDesdeFormularioParametroContabilidadDefecto;
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

			if(this.parametrocontabilidaddefectoSessionBean==null) {
				this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametrocontabilidaddefectoSessionBean.getlidEmpresaActual());
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

			if(this.parametrocontabilidaddefectoSessionBean==null) {
				this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(parametrocontabilidaddefectoSessionBean.getlidSucursalActual());
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

	public void cargarCombosTipoMonedasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomonedasForeignKey=new ArrayList<TipoMoneda>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMonedaLogic tipomonedaLogic=new TipoMonedaLogic();

			//tipomonedaLogic.getTipoMonedaDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocontabilidaddefectoSessionBean==null) {
				this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMoneda()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomonedaLogic.getTipoMonedaDataAccess().setIsForForeingKeyData(true);

					tipomonedaLogic.getTodosTipoMonedasWithConnection(sFinalQuery,new Pagination());

					this.tipomonedasForeignKey=tipomonedaLogic.getTipoMonedas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMoneda(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomonedaLogic.getEntityWithConnection(parametrocontabilidaddefectoSessionBean.getlidTipoMonedaActual());
					this.tipomonedasForeignKey.add(tipomonedaLogic.getTipoMoneda());
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

	public void cargarCombosMonedasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.monedasForeignKey=new ArrayList<Moneda>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MonedaLogic monedaLogic=new MonedaLogic();

			//monedaLogic.getMonedaDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocontabilidaddefectoSessionBean==null) {
				this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//monedaLogic.getMonedaDataAccess().setIsForForeingKeyData(true);

					monedaLogic.getTodosMonedasWithConnection(sFinalQuery,new Pagination());

					this.monedasForeignKey=monedaLogic.getMonedas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMoneda(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					monedaLogic.getEntityWithConnection(parametrocontabilidaddefectoSessionBean.getlidMonedaActual());
					this.monedasForeignKey.add(monedaLogic.getMoneda());
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

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocontabilidaddefectoSessionBean==null) {
				this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(parametrocontabilidaddefectoSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

	public void cargarCombosTipoIntervalosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipointervalosForeignKey=new ArrayList<TipoIntervalo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoIntervaloLogic tipointervaloLogic=new TipoIntervaloLogic();

			//tipointervaloLogic.getTipoIntervaloDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocontabilidaddefectoSessionBean==null) {
				this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoIntervalo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipointervaloLogic.getTipoIntervaloDataAccess().setIsForForeingKeyData(true);

					tipointervaloLogic.getTodosTipoIntervalosWithConnection(sFinalQuery,new Pagination());

					this.tipointervalosForeignKey=tipointervaloLogic.getTipoIntervalos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoIntervalo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipointervaloLogic.getEntityWithConnection(parametrocontabilidaddefectoSessionBean.getlidTipoIntervaloActual());
					this.tipointervalosForeignKey.add(tipointervaloLogic.getTipoIntervalo());
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

			if(this.parametrocontabilidaddefectoSessionBean==null) {
				this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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
					tipomovimientoLogic.getEntityWithConnection(parametrocontabilidaddefectoSessionBean.getlidTipoMovimientoActual());
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

	public void cargarCombosTipoDocumentosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDocumentoLogic tipodocumentoLogic=new TipoDocumentoLogic();

			//tipodocumentoLogic.getTipoDocumentoDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocontabilidaddefectoSessionBean==null) {
				this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipodocumentoLogic.getTipoDocumentoDataAccess().setIsForForeingKeyData(true);

					tipodocumentoLogic.getTodosTipoDocumentosWithConnection(sFinalQuery,new Pagination());

					this.tipodocumentosForeignKey=tipodocumentoLogic.getTipoDocumentos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDocumento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getEntityWithConnection(parametrocontabilidaddefectoSessionBean.getlidTipoDocumentoActual());
					this.tipodocumentosForeignKey.add(tipodocumentoLogic.getTipoDocumento());
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

	public void cargarCombosEstadoAsientoContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadoasientocontablesForeignKey=new ArrayList<EstadoAsientoContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoAsientoContableLogic estadoasientocontableLogic=new EstadoAsientoContableLogic();

			//estadoasientocontableLogic.getEstadoAsientoContableDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocontabilidaddefectoSessionBean==null) {
				this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoAsientoContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadoasientocontableLogic.getEstadoAsientoContableDataAccess().setIsForForeingKeyData(true);

					estadoasientocontableLogic.getTodosEstadoAsientoContablesWithConnection(sFinalQuery,new Pagination());

					this.estadoasientocontablesForeignKey=estadoasientocontableLogic.getEstadoAsientoContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoAsientoContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoasientocontableLogic.getEntityWithConnection(parametrocontabilidaddefectoSessionBean.getlidEstadoAsientoContableActual());
					this.estadoasientocontablesForeignKey.add(estadoasientocontableLogic.getEstadoAsientoContable());
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

					if(this.parametrocontabilidaddefecto!=null) {
						this.parametrocontabilidaddefecto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroContabilidadDefecto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroContabilidadDefectoGenerico)throws Exception
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
				jComboBoxid_empresaParametroContabilidadDefectoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroContabilidadDefectoGenerico!=null && jComboBoxid_empresaParametroContabilidadDefectoGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroContabilidadDefectoGenerico.setSelectedIndex(0);
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

					if(this.parametrocontabilidaddefecto!=null) {
						this.parametrocontabilidaddefecto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalParametroContabilidadDefecto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalParametroContabilidadDefectoGenerico)throws Exception
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
				jComboBoxid_sucursalParametroContabilidadDefectoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalParametroContabilidadDefectoGenerico!=null && jComboBoxid_sucursalParametroContabilidadDefectoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalParametroContabilidadDefectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMonedaForeignKey(Long idTipoMonedaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMoneda  tipomonedaTemp=null;

			for(TipoMoneda tipomonedaAux:tipomonedasForeignKey) {
				if(tipomonedaAux.getId()!=null && tipomonedaAux.getId().equals(idTipoMonedaSeleccionado)) {
					tipomonedaTemp=tipomonedaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomonedaTemp!=null) {

					if(this.parametrocontabilidaddefecto!=null) {
						this.parametrocontabilidaddefecto.setTipoMoneda(tipomonedaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.setSelectedItem(tipomonedaTemp);
					}
				} else {
					//jComboBoxid_tipo_monedaParametroContabilidadDefecto.setSelectedItem(tipomonedaTemp);
					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoMoneda") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomonedaTemp!=null && jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto!=null) {
						jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setSelectedItem(tipomonedaTemp);
					} else {
						if(jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto!=null) {
							//jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setSelectedItem(tipomonedaTemp);
							if(jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.getItemCount()>0) {
								jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setSelectedIndex(0);
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

	public String getActualTipoMonedaForeignKeyDescripcion(Long idTipoMonedaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMoneda  tipomonedaTemp=null;

			for(TipoMoneda tipomonedaAux:tipomonedasForeignKey) {
				if(tipomonedaAux.getId()!=null && tipomonedaAux.getId().equals(idTipoMonedaSeleccionado)) {
					tipomonedaTemp=tipomonedaAux;
					break;
				}
			}


			sDescripcion=TipoMonedaConstantesFunciones.getTipoMonedaDescripcion(tipomonedaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMonedaForeignKeyGenerico(Long idTipoMonedaSeleccionado,JComboBox jComboBoxid_tipo_monedaParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			TipoMoneda  tipomonedaTemp=null;

			for(TipoMoneda tipomonedaAux:tipomonedasForeignKey) {
				if(tipomonedaAux.getId()!=null && tipomonedaAux.getId().equals(idTipoMonedaSeleccionado)) {
					tipomonedaTemp=tipomonedaAux;
					break;
				}
			}

			if(tipomonedaTemp!=null) {
				jComboBoxid_tipo_monedaParametroContabilidadDefectoGenerico.setSelectedItem(tipomonedaTemp);
			} else {
				if(jComboBoxid_tipo_monedaParametroContabilidadDefectoGenerico!=null && jComboBoxid_tipo_monedaParametroContabilidadDefectoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_monedaParametroContabilidadDefectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMonedaForeignKey(Long idMonedaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(monedaTemp!=null) {

					if(this.parametrocontabilidaddefecto!=null) {
						this.parametrocontabilidaddefecto.setMoneda(monedaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.setSelectedItem(monedaTemp);
					}
				} else {
					//jComboBoxid_monedaParametroContabilidadDefecto.setSelectedItem(monedaTemp);
					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.setSelectedIndex(0);
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

	public String getActualMonedaForeignKeyDescripcion(Long idMonedaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}


			sDescripcion=MonedaConstantesFunciones.getMonedaDescripcion(monedaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMonedaForeignKeyGenerico(Long idMonedaSeleccionado,JComboBox jComboBoxid_monedaParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}

			if(monedaTemp!=null) {
				jComboBoxid_monedaParametroContabilidadDefectoGenerico.setSelectedItem(monedaTemp);
			} else {
				if(jComboBoxid_monedaParametroContabilidadDefectoGenerico!=null && jComboBoxid_monedaParametroContabilidadDefectoGenerico.getItemCount()>0) {
					jComboBoxid_monedaParametroContabilidadDefectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.parametrocontabilidaddefecto!=null) {
						this.parametrocontabilidaddefecto.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloParametroContabilidadDefecto.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto!=null) {
						jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto!=null) {
							//jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.getItemCount()>0) {
								jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloParametroContabilidadDefectoGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloParametroContabilidadDefectoGenerico!=null && jComboBoxid_moduloParametroContabilidadDefectoGenerico.getItemCount()>0) {
					jComboBoxid_moduloParametroContabilidadDefectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoIntervaloForeignKey(Long idTipoIntervaloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoIntervalo  tipointervaloTemp=null;

			for(TipoIntervalo tipointervaloAux:tipointervalosForeignKey) {
				if(tipointervaloAux.getId()!=null && tipointervaloAux.getId().equals(idTipoIntervaloSeleccionado)) {
					tipointervaloTemp=tipointervaloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipointervaloTemp!=null) {

					if(this.parametrocontabilidaddefecto!=null) {
						this.parametrocontabilidaddefecto.setTipoIntervalo(tipointervaloTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setSelectedItem(tipointervaloTemp);
					}
				} else {
					//jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setSelectedItem(tipointervaloTemp);
					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoIntervalo") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipointervaloTemp!=null && jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto!=null) {
						jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setSelectedItem(tipointervaloTemp);
					} else {
						if(jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto!=null) {
							//jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setSelectedItem(tipointervaloTemp);
							if(jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.getItemCount()>0) {
								jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setSelectedIndex(0);
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

	public String getActualTipoIntervaloForeignKeyDescripcion(Long idTipoIntervaloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoIntervalo  tipointervaloTemp=null;

			for(TipoIntervalo tipointervaloAux:tipointervalosForeignKey) {
				if(tipointervaloAux.getId()!=null && tipointervaloAux.getId().equals(idTipoIntervaloSeleccionado)) {
					tipointervaloTemp=tipointervaloAux;
					break;
				}
			}


			sDescripcion=TipoIntervaloConstantesFunciones.getTipoIntervaloDescripcion(tipointervaloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoIntervaloForeignKeyGenerico(Long idTipoIntervaloSeleccionado,JComboBox jComboBoxid_tipo_intervaloParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			TipoIntervalo  tipointervaloTemp=null;

			for(TipoIntervalo tipointervaloAux:tipointervalosForeignKey) {
				if(tipointervaloAux.getId()!=null && tipointervaloAux.getId().equals(idTipoIntervaloSeleccionado)) {
					tipointervaloTemp=tipointervaloAux;
					break;
				}
			}

			if(tipointervaloTemp!=null) {
				jComboBoxid_tipo_intervaloParametroContabilidadDefectoGenerico.setSelectedItem(tipointervaloTemp);
			} else {
				if(jComboBoxid_tipo_intervaloParametroContabilidadDefectoGenerico!=null && jComboBoxid_tipo_intervaloParametroContabilidadDefectoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_intervaloParametroContabilidadDefectoGenerico.setSelectedIndex(0);
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

					if(this.parametrocontabilidaddefecto!=null) {
						this.parametrocontabilidaddefecto.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoMovimiento") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto!=null) {
						jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto!=null) {
							//jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.getItemCount()>0) {
								jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setSelectedIndex(0);
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
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoParametroContabilidadDefectoGenerico)throws Exception
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
				jComboBoxid_tipo_movimientoParametroContabilidadDefectoGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoParametroContabilidadDefectoGenerico!=null && jComboBoxid_tipo_movimientoParametroContabilidadDefectoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoParametroContabilidadDefectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDocumentoForeignKey(Long idTipoDocumentoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodocumentoTemp!=null) {

					if(this.parametrocontabilidaddefecto!=null) {
						this.parametrocontabilidaddefecto.setTipoDocumento(tipodocumentoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.setSelectedItem(tipodocumentoTemp);
					}
				} else {
					//jComboBoxid_tipo_documentoParametroContabilidadDefecto.setSelectedItem(tipodocumentoTemp);
					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoDocumento") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodocumentoTemp!=null && jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto!=null) {
						jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setSelectedItem(tipodocumentoTemp);
					} else {
						if(jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto!=null) {
							//jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setSelectedItem(tipodocumentoTemp);
							if(jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.getItemCount()>0) {
								jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setSelectedIndex(0);
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

	public String getActualTipoDocumentoForeignKeyDescripcion(Long idTipoDocumentoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}


			sDescripcion=TipoDocumentoConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDocumentoForeignKeyGenerico(Long idTipoDocumentoSeleccionado,JComboBox jComboBoxid_tipo_documentoParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}

			if(tipodocumentoTemp!=null) {
				jComboBoxid_tipo_documentoParametroContabilidadDefectoGenerico.setSelectedItem(tipodocumentoTemp);
			} else {
				if(jComboBoxid_tipo_documentoParametroContabilidadDefectoGenerico!=null && jComboBoxid_tipo_documentoParametroContabilidadDefectoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_documentoParametroContabilidadDefectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoAsientoContableForeignKey(Long idEstadoAsientoContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoAsientoContable  estadoasientocontableTemp=null;

			for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontablesForeignKey) {
				if(estadoasientocontableAux.getId()!=null && estadoasientocontableAux.getId().equals(idEstadoAsientoContableSeleccionado)) {
					estadoasientocontableTemp=estadoasientocontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadoasientocontableTemp!=null) {

					if(this.parametrocontabilidaddefecto!=null) {
						this.parametrocontabilidaddefecto.setEstadoAsientoContable(estadoasientocontableTemp);
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setSelectedItem(estadoasientocontableTemp);
					}
				} else {
					//jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setSelectedItem(estadoasientocontableTemp);
					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadoasientocontableTemp!=null && jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto!=null) {
						jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setSelectedItem(estadoasientocontableTemp);
					} else {
						if(jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto!=null) {
							//jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setSelectedItem(estadoasientocontableTemp);
							if(jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.getItemCount()>0) {
								jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setSelectedIndex(0);
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

	public String getActualEstadoAsientoContableForeignKeyDescripcion(Long idEstadoAsientoContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoAsientoContable  estadoasientocontableTemp=null;

			for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontablesForeignKey) {
				if(estadoasientocontableAux.getId()!=null && estadoasientocontableAux.getId().equals(idEstadoAsientoContableSeleccionado)) {
					estadoasientocontableTemp=estadoasientocontableAux;
					break;
				}
			}


			sDescripcion=EstadoAsientoContableConstantesFunciones.getEstadoAsientoContableDescripcion(estadoasientocontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoAsientoContableForeignKeyGenerico(Long idEstadoAsientoContableSeleccionado,JComboBox jComboBoxid_estado_asiento_contableParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			EstadoAsientoContable  estadoasientocontableTemp=null;

			for(EstadoAsientoContable estadoasientocontableAux:estadoasientocontablesForeignKey) {
				if(estadoasientocontableAux.getId()!=null && estadoasientocontableAux.getId().equals(idEstadoAsientoContableSeleccionado)) {
					estadoasientocontableTemp=estadoasientocontableAux;
					break;
				}
			}

			if(estadoasientocontableTemp!=null) {
				jComboBoxid_estado_asiento_contableParametroContabilidadDefectoGenerico.setSelectedItem(estadoasientocontableTemp);
			} else {
				if(jComboBoxid_estado_asiento_contableParametroContabilidadDefectoGenerico!=null && jComboBoxid_estado_asiento_contableParametroContabilidadDefectoGenerico.getItemCount()>0) {
					jComboBoxid_estado_asiento_contableParametroContabilidadDefectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroContabilidadDefecto parametrocontabilidaddefecto,JComboBox jComboBoxid_empresaParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroContabilidadDefectoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroContabilidadDefectoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametrocontabilidaddefecto.setid_empresa(empresaAux.getId());
				parametrocontabilidaddefecto.setempresa_descripcion(ParametroContabilidadDefectoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametrocontabilidaddefecto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ParametroContabilidadDefecto parametrocontabilidaddefecto,JComboBox jComboBoxid_sucursalParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalParametroContabilidadDefectoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalParametroContabilidadDefectoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				parametrocontabilidaddefecto.setid_sucursal(sucursalAux.getId());
				parametrocontabilidaddefecto.setsucursal_descripcion(ParametroContabilidadDefectoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				parametrocontabilidaddefecto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMonedaForeignKey(ParametroContabilidadDefecto parametrocontabilidaddefecto,JComboBox jComboBoxid_tipo_monedaParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			TipoMoneda  tipomonedaAux=new TipoMoneda();

			if(jComboBoxid_tipo_monedaParametroContabilidadDefectoGenerico==null) {
				tipomonedaAux=(TipoMoneda)this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.getSelectedItem();
			} else {
				tipomonedaAux=(TipoMoneda)jComboBoxid_tipo_monedaParametroContabilidadDefectoGenerico.getSelectedItem();
			}

			if(tipomonedaAux!=null && tipomonedaAux.getId()!=null) {
				parametrocontabilidaddefecto.setid_tipo_moneda(tipomonedaAux.getId());
				parametrocontabilidaddefecto.settipomoneda_descripcion(ParametroContabilidadDefectoConstantesFunciones.getTipoMonedaDescripcion(tipomonedaAux));
				parametrocontabilidaddefecto.setTipoMoneda(tipomonedaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMonedaForeignKey(ParametroContabilidadDefecto parametrocontabilidaddefecto,JComboBox jComboBoxid_monedaParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			Moneda  monedaAux=new Moneda();

			if(jComboBoxid_monedaParametroContabilidadDefectoGenerico==null) {
				monedaAux=(Moneda)this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.getSelectedItem();
			} else {
				monedaAux=(Moneda)jComboBoxid_monedaParametroContabilidadDefectoGenerico.getSelectedItem();
			}

			if(monedaAux!=null && monedaAux.getId()!=null) {
				parametrocontabilidaddefecto.setid_moneda(monedaAux.getId());
				parametrocontabilidaddefecto.setmoneda_descripcion(ParametroContabilidadDefectoConstantesFunciones.getMonedaDescripcion(monedaAux));
				parametrocontabilidaddefecto.setMoneda(monedaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(ParametroContabilidadDefecto parametrocontabilidaddefecto,JComboBox jComboBoxid_moduloParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloParametroContabilidadDefectoGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloParametroContabilidadDefectoGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				parametrocontabilidaddefecto.setid_modulo(moduloAux.getId());
				parametrocontabilidaddefecto.setmodulo_descripcion(ParametroContabilidadDefectoConstantesFunciones.getModuloDescripcion(moduloAux));
				parametrocontabilidaddefecto.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoIntervaloForeignKey(ParametroContabilidadDefecto parametrocontabilidaddefecto,JComboBox jComboBoxid_tipo_intervaloParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			TipoIntervalo  tipointervaloAux=new TipoIntervalo();

			if(jComboBoxid_tipo_intervaloParametroContabilidadDefectoGenerico==null) {
				tipointervaloAux=(TipoIntervalo)this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.getSelectedItem();
			} else {
				tipointervaloAux=(TipoIntervalo)jComboBoxid_tipo_intervaloParametroContabilidadDefectoGenerico.getSelectedItem();
			}

			if(tipointervaloAux!=null && tipointervaloAux.getId()!=null) {
				parametrocontabilidaddefecto.setid_tipo_intervalo(tipointervaloAux.getId());
				parametrocontabilidaddefecto.settipointervalo_descripcion(ParametroContabilidadDefectoConstantesFunciones.getTipoIntervaloDescripcion(tipointervaloAux));
				parametrocontabilidaddefecto.setTipoIntervalo(tipointervaloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(ParametroContabilidadDefecto parametrocontabilidaddefecto,JComboBox jComboBoxid_tipo_movimientoParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoParametroContabilidadDefectoGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoParametroContabilidadDefectoGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				parametrocontabilidaddefecto.setid_tipo_movimiento(tipomovimientoAux.getId());
				parametrocontabilidaddefecto.settipomovimiento_descripcion(ParametroContabilidadDefectoConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				parametrocontabilidaddefecto.setTipoMovimiento(tipomovimientoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDocumentoForeignKey(ParametroContabilidadDefecto parametrocontabilidaddefecto,JComboBox jComboBoxid_tipo_documentoParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoAux=new TipoDocumento();

			if(jComboBoxid_tipo_documentoParametroContabilidadDefectoGenerico==null) {
				tipodocumentoAux=(TipoDocumento)this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.getSelectedItem();
			} else {
				tipodocumentoAux=(TipoDocumento)jComboBoxid_tipo_documentoParametroContabilidadDefectoGenerico.getSelectedItem();
			}

			if(tipodocumentoAux!=null && tipodocumentoAux.getId()!=null) {
				parametrocontabilidaddefecto.setid_tipo_documento(tipodocumentoAux.getId());
				parametrocontabilidaddefecto.settipodocumento_descripcion(ParametroContabilidadDefectoConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoAux));
				parametrocontabilidaddefecto.setTipoDocumento(tipodocumentoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoAsientoContableForeignKey(ParametroContabilidadDefecto parametrocontabilidaddefecto,JComboBox jComboBoxid_estado_asiento_contableParametroContabilidadDefectoGenerico)throws Exception
	{
		try
		{
			EstadoAsientoContable  estadoasientocontableAux=new EstadoAsientoContable();

			if(jComboBoxid_estado_asiento_contableParametroContabilidadDefectoGenerico==null) {
				estadoasientocontableAux=(EstadoAsientoContable)this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.getSelectedItem();
			} else {
				estadoasientocontableAux=(EstadoAsientoContable)jComboBoxid_estado_asiento_contableParametroContabilidadDefectoGenerico.getSelectedItem();
			}

			if(estadoasientocontableAux!=null && estadoasientocontableAux.getId()!=null) {
				parametrocontabilidaddefecto.setid_estado_asiento_contable(estadoasientocontableAux.getId());
				parametrocontabilidaddefecto.setestadoasientocontable_descripcion(ParametroContabilidadDefectoConstantesFunciones.getEstadoAsientoContableDescripcion(estadoasientocontableAux));
				parametrocontabilidaddefecto.setEstadoAsientoContable(estadoasientocontableAux);			}
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

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
					}

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
					}

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMonedasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMoneda=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.removeAllItems();

							for(TipoMoneda tipomoneda:this.tipomonedasForeignKey) {
								this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.addItem(tipomoneda);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
					}

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoMoneda") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.removeAllItems();

							for(TipoMoneda tipomoneda:this.tipomonedasForeignKey) {
								this.jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.addItem(tipomoneda);
							}
						}

						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMonedasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMoneda=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.removeAllItems();

							for(Moneda moneda:this.monedasForeignKey) {
								this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.addItem(moneda);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
					}

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
					}

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.addItem(modulo);
							}
						}

						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoIntervalosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoIntervalo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.removeAllItems();

							for(TipoIntervalo tipointervalo:this.tipointervalosForeignKey) {
								this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.addItem(tipointervalo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
					}

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoIntervalo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.removeAllItems();

							for(TipoIntervalo tipointervalo:this.tipointervalosForeignKey) {
								this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.addItem(tipointervalo);
							}
						}

						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
					}

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoMovimiento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.addItem(tipomovimiento);
							}
						}

						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDocumentosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDocumento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.addItem(tipodocumento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
					}

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoDocumento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.addItem(tipodocumento);
							}
						}

						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoAsientoContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoAsientoContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.removeAllItems();

							for(EstadoAsientoContable estadoasientocontable:this.estadoasientocontablesForeignKey) {
								this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.addItem(estadoasientocontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { 
					}

					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoAsientoContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.removeAllItems();

							for(EstadoAsientoContable estadoasientocontable:this.estadoasientocontablesForeignKey) {
								this.jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.addItem(estadoasientocontable);
							}
						}

						if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoMonedaForeignKey(TipoMoneda tipomoneda,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.setSelectedItem(tipomoneda);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setSelectedItem(tipomoneda);
						} else {
							this.jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMonedaForeignKey(Moneda moneda,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.setSelectedItem(moneda);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoIntervaloForeignKey(TipoIntervalo tipointervalo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setSelectedItem(tipointervalo);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setSelectedItem(tipointervalo);
						} else {
							this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoDocumentoForeignKey(TipoDocumento tipodocumento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.setSelectedItem(tipodocumento);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setSelectedItem(tipodocumento);
						} else {
							this.jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoAsientoContableForeignKey(EstadoAsientoContable estadoasientocontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setSelectedItem(estadoasientocontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setSelectedItem(estadoasientocontable);
						} else {
							this.jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParametroContabilidadDefecto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroContabilidadDefectoConstantesFunciones.refrescarForeignKeysDescripcionesParametroContabilidadDefecto(this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroContabilidadDefectoConstantesFunciones.refrescarForeignKeysDescripcionesParametroContabilidadDefecto(this.parametrocontabilidaddefectos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TipoMoneda.class));
		classes.add(new Classe(Moneda.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(TipoIntervalo.class));
		classes.add(new Classe(TipoMovimiento.class));
		classes.add(new Classe(TipoDocumento.class));
		classes.add(new Classe(EstadoAsientoContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(this.parametrocontabilidaddefectos);
			parametrocontabilidaddefectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroContabilidadDefectoParameterReturnGeneral getParametroContabilidadDefectoParameterGeneral() {
		return this.parametrocontabilidaddefectoParameterGeneral;
	}
	
	public void setParametroContabilidadDefectoParameterGeneral(ParametroContabilidadDefectoParameterReturnGeneral parametrocontabilidaddefectoParameterGeneral) {
		this.parametrocontabilidaddefectoParameterGeneral = parametrocontabilidaddefectoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroContabilidadDefecto() {
		return isPermisoTodoParametroContabilidadDefecto;
	}

	public void setIsPermisoTodoParametroContabilidadDefecto(Boolean isPermisoTodoParametroContabilidadDefecto) {
		this.isPermisoTodoParametroContabilidadDefecto = isPermisoTodoParametroContabilidadDefecto;
	}

	public Boolean getIsPermisoNuevoParametroContabilidadDefecto() {
		return isPermisoNuevoParametroContabilidadDefecto;
	}

	public void setIsPermisoNuevoParametroContabilidadDefecto(Boolean isPermisoNuevoParametroContabilidadDefecto) {
		this.isPermisoNuevoParametroContabilidadDefecto = isPermisoNuevoParametroContabilidadDefecto;
	}

	public Boolean getIsPermisoActualizarParametroContabilidadDefecto() {
		return isPermisoActualizarParametroContabilidadDefecto;
	}

	public void setIsPermisoActualizarParametroContabilidadDefecto(Boolean isPermisoActualizarParametroContabilidadDefecto) {
		this.isPermisoActualizarParametroContabilidadDefecto = isPermisoActualizarParametroContabilidadDefecto;
	}

	public Boolean getIsPermisoEliminarParametroContabilidadDefecto() {
		return isPermisoEliminarParametroContabilidadDefecto;
	}

	public void setIsPermisoEliminarParametroContabilidadDefecto(Boolean isPermisoEliminarParametroContabilidadDefecto) {
		this.isPermisoEliminarParametroContabilidadDefecto = isPermisoEliminarParametroContabilidadDefecto;
	}

	public Boolean getIsPermisoGuardarCambiosParametroContabilidadDefecto() {
		return isPermisoGuardarCambiosParametroContabilidadDefecto;
	}

	public void setIsPermisoGuardarCambiosParametroContabilidadDefecto(Boolean isPermisoGuardarCambiosParametroContabilidadDefecto) {
		this.isPermisoGuardarCambiosParametroContabilidadDefecto = isPermisoGuardarCambiosParametroContabilidadDefecto;
	}
	
	public Boolean getIsPermisoConsultaParametroContabilidadDefecto() {
		return isPermisoConsultaParametroContabilidadDefecto;
	}

	public void setIsPermisoConsultaParametroContabilidadDefecto(Boolean isPermisoConsultaParametroContabilidadDefecto) {
		this.isPermisoConsultaParametroContabilidadDefecto = isPermisoConsultaParametroContabilidadDefecto;
	}

	public Boolean getIsPermisoBusquedaParametroContabilidadDefecto() {
		return isPermisoBusquedaParametroContabilidadDefecto;
	}

	public void setIsPermisoBusquedaParametroContabilidadDefecto(Boolean isPermisoBusquedaParametroContabilidadDefecto) {
		this.isPermisoBusquedaParametroContabilidadDefecto = isPermisoBusquedaParametroContabilidadDefecto;
	}

	public Boolean getIsPermisoReporteParametroContabilidadDefecto() {
		return isPermisoReporteParametroContabilidadDefecto;
	}

	public void setIsPermisoReporteParametroContabilidadDefecto(Boolean isPermisoReporteParametroContabilidadDefecto) {
		this.isPermisoReporteParametroContabilidadDefecto = isPermisoReporteParametroContabilidadDefecto;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroContabilidadDefecto() {
		return isPermisoPaginacionMedioParametroContabilidadDefecto;
	}

	public void setIsPermisoPaginacionMedioParametroContabilidadDefecto(Boolean isPermisoPaginacionMedioParametroContabilidadDefecto) {
		this.isPermisoPaginacionMedioParametroContabilidadDefecto = isPermisoPaginacionMedioParametroContabilidadDefecto;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroContabilidadDefecto() {
		return isPermisoPaginacionTodoParametroContabilidadDefecto;
	}

	public void setIsPermisoPaginacionTodoParametroContabilidadDefecto(Boolean isPermisoPaginacionTodoParametroContabilidadDefecto) {
		this.isPermisoPaginacionTodoParametroContabilidadDefecto = isPermisoPaginacionTodoParametroContabilidadDefecto;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroContabilidadDefecto() {
		return isPermisoPaginacionAltoParametroContabilidadDefecto;
	}

	public void setIsPermisoPaginacionAltoParametroContabilidadDefecto(Boolean isPermisoPaginacionAltoParametroContabilidadDefecto) {
		this.isPermisoPaginacionAltoParametroContabilidadDefecto = isPermisoPaginacionAltoParametroContabilidadDefecto;
	}
	
	public Boolean getIsPermisoCopiarParametroContabilidadDefecto() {
		return isPermisoCopiarParametroContabilidadDefecto;
	}

	public void setIsPermisoCopiarParametroContabilidadDefecto(Boolean isPermisoCopiarParametroContabilidadDefecto) {
		this.isPermisoCopiarParametroContabilidadDefecto = isPermisoCopiarParametroContabilidadDefecto;
	}
	
	public Boolean getIsPermisoVerFormParametroContabilidadDefecto() {
		return isPermisoVerFormParametroContabilidadDefecto;
	}

	public void setIsPermisoVerFormParametroContabilidadDefecto(Boolean isPermisoVerFormParametroContabilidadDefecto) {
		this.isPermisoVerFormParametroContabilidadDefecto = isPermisoVerFormParametroContabilidadDefecto;
	}
	
	public Boolean getIsPermisoDuplicarParametroContabilidadDefecto() {
		return isPermisoDuplicarParametroContabilidadDefecto;
	}

	public void setIsPermisoDuplicarParametroContabilidadDefecto(Boolean isPermisoDuplicarParametroContabilidadDefecto) {
		this.isPermisoDuplicarParametroContabilidadDefecto = isPermisoDuplicarParametroContabilidadDefecto;
	}
	
	public Boolean getIsPermisoOrdenParametroContabilidadDefecto() {
		return isPermisoOrdenParametroContabilidadDefecto;
	}

	public void setIsPermisoOrdenParametroContabilidadDefecto(Boolean isPermisoOrdenParametroContabilidadDefecto) {
		this.isPermisoOrdenParametroContabilidadDefecto = isPermisoOrdenParametroContabilidadDefecto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroContabilidadDefecto() {
		return isVisibilidadCeldaNuevoParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaNuevoParametroContabilidadDefecto(Boolean isVisibilidadCeldaNuevoParametroContabilidadDefecto) {
		this.isVisibilidadCeldaNuevoParametroContabilidadDefecto = isVisibilidadCeldaNuevoParametroContabilidadDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroContabilidadDefecto() {
		return isVisibilidadCeldaDuplicarParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaDuplicarParametroContabilidadDefecto(Boolean isVisibilidadCeldaDuplicarParametroContabilidadDefecto) {
		this.isVisibilidadCeldaDuplicarParametroContabilidadDefecto = isVisibilidadCeldaDuplicarParametroContabilidadDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroContabilidadDefecto() {
		return isVisibilidadCeldaCopiarParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaCopiarParametroContabilidadDefecto(Boolean isVisibilidadCeldaCopiarParametroContabilidadDefecto) {
		this.isVisibilidadCeldaCopiarParametroContabilidadDefecto = isVisibilidadCeldaCopiarParametroContabilidadDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroContabilidadDefecto() {
		return isVisibilidadCeldaVerFormParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaVerFormParametroContabilidadDefecto(Boolean isVisibilidadCeldaVerFormParametroContabilidadDefecto) {
		this.isVisibilidadCeldaVerFormParametroContabilidadDefecto = isVisibilidadCeldaVerFormParametroContabilidadDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroContabilidadDefecto() {
		return isVisibilidadCeldaOrdenParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaOrdenParametroContabilidadDefecto(Boolean isVisibilidadCeldaOrdenParametroContabilidadDefecto) {
		this.isVisibilidadCeldaOrdenParametroContabilidadDefecto = isVisibilidadCeldaOrdenParametroContabilidadDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto() {
		return isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto(Boolean isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto) {
		this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto = isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroContabilidadDefecto() {
		return isVisibilidadCeldaModificarParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaModificarParametroContabilidadDefecto(Boolean isVisibilidadCeldaModificarParametroContabilidadDefecto) {
		this.isVisibilidadCeldaModificarParametroContabilidadDefecto = isVisibilidadCeldaModificarParametroContabilidadDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroContabilidadDefecto() {
		return isVisibilidadCeldaActualizarParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaActualizarParametroContabilidadDefecto(Boolean isVisibilidadCeldaActualizarParametroContabilidadDefecto) {
		this.isVisibilidadCeldaActualizarParametroContabilidadDefecto = isVisibilidadCeldaActualizarParametroContabilidadDefecto;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroContabilidadDefecto() {
		return isVisibilidadCeldaEliminarParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaEliminarParametroContabilidadDefecto(Boolean isVisibilidadCeldaEliminarParametroContabilidadDefecto) {
		this.isVisibilidadCeldaEliminarParametroContabilidadDefecto = isVisibilidadCeldaEliminarParametroContabilidadDefecto;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroContabilidadDefecto() {
		return isVisibilidadCeldaCancelarParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaCancelarParametroContabilidadDefecto(Boolean isVisibilidadCeldaCancelarParametroContabilidadDefecto) {
		this.isVisibilidadCeldaCancelarParametroContabilidadDefecto = isVisibilidadCeldaCancelarParametroContabilidadDefecto;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroContabilidadDefecto() {
		return isVisibilidadCeldaGuardarParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaGuardarParametroContabilidadDefecto(Boolean isVisibilidadCeldaGuardarParametroContabilidadDefecto) {
		this.isVisibilidadCeldaGuardarParametroContabilidadDefecto = isVisibilidadCeldaGuardarParametroContabilidadDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto() {
		return isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto(Boolean isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto) {
		this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto = isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto;
	}
		
	public ParametroContabilidadDefectoSessionBean getparametrocontabilidaddefectoSessionBean() {
		return this.parametrocontabilidaddefectoSessionBean;
	}
	
	public void setparametrocontabilidaddefectoSessionBean(ParametroContabilidadDefectoSessionBean parametrocontabilidaddefectoSessionBean) {
		this.parametrocontabilidaddefectoSessionBean=parametrocontabilidaddefectoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoAsientoContable() {
		return this.isVisibilidadFK_IdEstadoAsientoContable;
	}

	public void setisVisibilidadFK_IdEstadoAsientoContable(Boolean isVisibilidadFK_IdEstadoAsientoContable) {
		this.isVisibilidadFK_IdEstadoAsientoContable=isVisibilidadFK_IdEstadoAsientoContable;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdMoneda() {
		return this.isVisibilidadFK_IdMoneda;
	}

	public void setisVisibilidadFK_IdMoneda(Boolean isVisibilidadFK_IdMoneda) {
		this.isVisibilidadFK_IdMoneda=isVisibilidadFK_IdMoneda;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoDocumento() {
		return this.isVisibilidadFK_IdTipoDocumento;
	}

	public void setisVisibilidadFK_IdTipoDocumento(Boolean isVisibilidadFK_IdTipoDocumento) {
		this.isVisibilidadFK_IdTipoDocumento=isVisibilidadFK_IdTipoDocumento;
	}

	public Boolean getisVisibilidadFK_IdTipoIntervalo() {
		return this.isVisibilidadFK_IdTipoIntervalo;
	}

	public void setisVisibilidadFK_IdTipoIntervalo(Boolean isVisibilidadFK_IdTipoIntervalo) {
		this.isVisibilidadFK_IdTipoIntervalo=isVisibilidadFK_IdTipoIntervalo;
	}

	public Boolean getisVisibilidadFK_IdTipoMoneda() {
		return this.isVisibilidadFK_IdTipoMoneda;
	}

	public void setisVisibilidadFK_IdTipoMoneda(Boolean isVisibilidadFK_IdTipoMoneda) {
		this.isVisibilidadFK_IdTipoMoneda=isVisibilidadFK_IdTipoMoneda;
	}

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametrocontabilidaddefecto,null);
				this.setActualParaGuardarSucursalForeignKey(parametrocontabilidaddefecto,null);
				this.setActualParaGuardarTipoMonedaForeignKey(parametrocontabilidaddefecto,null);
				this.setActualParaGuardarMonedaForeignKey(parametrocontabilidaddefecto,null);
				this.setActualParaGuardarModuloForeignKey(parametrocontabilidaddefecto,null);
				this.setActualParaGuardarTipoIntervaloForeignKey(parametrocontabilidaddefecto,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(parametrocontabilidaddefecto,null);
				this.setActualParaGuardarTipoDocumentoForeignKey(parametrocontabilidaddefecto,null);
				this.setActualParaGuardarEstadoAsientoContableForeignKey(parametrocontabilidaddefecto,null);
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
	
	public void bugActualizarReferenciaActual(ParametroContabilidadDefecto parametrocontabilidaddefecto,ParametroContabilidadDefecto parametrocontabilidaddefectoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroContabilidadDefecto(parametrocontabilidaddefecto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametrocontabilidaddefectoAux.setId(parametrocontabilidaddefecto.getId());
		parametrocontabilidaddefectoAux.setVersionRow(parametrocontabilidaddefecto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroContabilidadDefecto();
		
			int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametrocontabilidaddefectoValidator.getInvalidValues(this.parametrocontabilidaddefecto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametrocontabilidaddefectoLogic.setDatosCliente(datosCliente);
			parametrocontabilidaddefectoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametrocontabilidaddefectoAux=new  ParametroContabilidadDefecto();
				
				parametrocontabilidaddefectoAux.setIsNew(true);
				parametrocontabilidaddefectoAux.setIsChanged(true);
				
				parametrocontabilidaddefectoAux.setParametroContabilidadDefectoOriginal(this.parametrocontabilidaddefecto);
				
				parametrocontabilidaddefectoAux.setId(this.parametrocontabilidaddefecto.getId());	
				parametrocontabilidaddefectoAux.setVersionRow(this.parametrocontabilidaddefecto.getVersionRow());	
				parametrocontabilidaddefectoAux.setid_empresa(this.parametrocontabilidaddefecto.getid_empresa());	
				parametrocontabilidaddefectoAux.setid_sucursal(this.parametrocontabilidaddefecto.getid_sucursal());	
				parametrocontabilidaddefectoAux.setid_tipo_moneda(this.parametrocontabilidaddefecto.getid_tipo_moneda());	
				parametrocontabilidaddefectoAux.setid_moneda(this.parametrocontabilidaddefecto.getid_moneda());	
				parametrocontabilidaddefectoAux.setid_modulo(this.parametrocontabilidaddefecto.getid_modulo());	
				parametrocontabilidaddefectoAux.setid_tipo_intervalo(this.parametrocontabilidaddefecto.getid_tipo_intervalo());	
				parametrocontabilidaddefectoAux.setid_tipo_movimiento(this.parametrocontabilidaddefecto.getid_tipo_movimiento());	
				parametrocontabilidaddefectoAux.setid_tipo_documento(this.parametrocontabilidaddefecto.getid_tipo_documento());	
				parametrocontabilidaddefectoAux.setid_estado_asiento_contable(this.parametrocontabilidaddefecto.getid_estado_asiento_contable());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.saveParametroContabilidadDefectos();//WithConnection
						//parametrocontabilidaddefectoLogic.getSetVersionRowParametroContabilidadDefectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrocontabilidaddefecto,parametrocontabilidaddefectoAux);
					
					this.refrescarForeignKeysDescripcionesParametroContabilidadDefecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrocontabilidaddefectoLogic.saveParametroContabilidadDefectoRelaciones(parametrocontabilidaddefectoAux);//WithConnection
								//parametrocontabilidaddefectoLogic.getSetVersionRowParametroContabilidadDefectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrocontabilidaddefecto,parametrocontabilidaddefectoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrocontabilidaddefecto,parametrocontabilidaddefectoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametrocontabilidaddefectoAux=new  ParametroContabilidadDefecto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() 
					|| (this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() && this.parametrocontabilidaddefecto.getId()>=0)) {
						
					parametrocontabilidaddefectoAux.setIsNew(false);
				}
				
				parametrocontabilidaddefectoAux.setIsDeleted(false);
			
				parametrocontabilidaddefectoAux.setId(this.parametrocontabilidaddefecto.getId());	
				parametrocontabilidaddefectoAux.setVersionRow(this.parametrocontabilidaddefecto.getVersionRow());	
				parametrocontabilidaddefectoAux.setid_empresa(this.parametrocontabilidaddefecto.getid_empresa());	
				parametrocontabilidaddefectoAux.setid_sucursal(this.parametrocontabilidaddefecto.getid_sucursal());	
				parametrocontabilidaddefectoAux.setid_tipo_moneda(this.parametrocontabilidaddefecto.getid_tipo_moneda());	
				parametrocontabilidaddefectoAux.setid_moneda(this.parametrocontabilidaddefecto.getid_moneda());	
				parametrocontabilidaddefectoAux.setid_modulo(this.parametrocontabilidaddefecto.getid_modulo());	
				parametrocontabilidaddefectoAux.setid_tipo_intervalo(this.parametrocontabilidaddefecto.getid_tipo_intervalo());	
				parametrocontabilidaddefectoAux.setid_tipo_movimiento(this.parametrocontabilidaddefecto.getid_tipo_movimiento());	
				parametrocontabilidaddefectoAux.setid_tipo_documento(this.parametrocontabilidaddefecto.getid_tipo_documento());	
				parametrocontabilidaddefectoAux.setid_estado_asiento_contable(this.parametrocontabilidaddefecto.getid_estado_asiento_contable());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.saveParametroContabilidadDefectos();//WithConnection
						//parametrocontabilidaddefectoLogic.getSetVersionRowParametroContabilidadDefectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrocontabilidaddefecto,parametrocontabilidaddefectoAux);
					
					this.refrescarForeignKeysDescripcionesParametroContabilidadDefecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrocontabilidaddefectoLogic.saveParametroContabilidadDefectoRelaciones(parametrocontabilidaddefectoAux);//WithConnection
								//parametrocontabilidaddefectoLogic.getSetVersionRowParametroContabilidadDefectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrocontabilidaddefecto,parametrocontabilidaddefectoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrocontabilidaddefecto,parametrocontabilidaddefectoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametrocontabilidaddefectoAux=new  ParametroContabilidadDefecto();
				
				parametrocontabilidaddefectoAux.setIsNew(false);
				parametrocontabilidaddefectoAux.setIsChanged(false);
				
				parametrocontabilidaddefectoAux.setIsDeleted(true);
				
				parametrocontabilidaddefectoAux.setId(this.parametrocontabilidaddefecto.getId());	
				parametrocontabilidaddefectoAux.setVersionRow(this.parametrocontabilidaddefecto.getVersionRow());	
				parametrocontabilidaddefectoAux.setid_empresa(this.parametrocontabilidaddefecto.getid_empresa());	
				parametrocontabilidaddefectoAux.setid_sucursal(this.parametrocontabilidaddefecto.getid_sucursal());	
				parametrocontabilidaddefectoAux.setid_tipo_moneda(this.parametrocontabilidaddefecto.getid_tipo_moneda());	
				parametrocontabilidaddefectoAux.setid_moneda(this.parametrocontabilidaddefecto.getid_moneda());	
				parametrocontabilidaddefectoAux.setid_modulo(this.parametrocontabilidaddefecto.getid_modulo());	
				parametrocontabilidaddefectoAux.setid_tipo_intervalo(this.parametrocontabilidaddefecto.getid_tipo_intervalo());	
				parametrocontabilidaddefectoAux.setid_tipo_movimiento(this.parametrocontabilidaddefecto.getid_tipo_movimiento());	
				parametrocontabilidaddefectoAux.setid_tipo_documento(this.parametrocontabilidaddefecto.getid_tipo_documento());	
				parametrocontabilidaddefectoAux.setid_estado_asiento_contable(this.parametrocontabilidaddefecto.getid_estado_asiento_contable());	
				
				if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametrocontabilidaddefectoAux.getId()>=0) {	
						this.parametrocontabilidaddefectosEliminados.add(parametrocontabilidaddefectoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.saveParametroContabilidadDefectos();//WithConnection
						//parametrocontabilidaddefectoLogic.getSetVersionRowParametroContabilidadDefectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrocontabilidaddefectoLogic.saveParametroContabilidadDefectoRelaciones(parametrocontabilidaddefectoAux);//WithConnection
								//parametrocontabilidaddefectoLogic.getSetVersionRowParametroContabilidadDefectos();//WithConnection
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
							if(this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametrocontabilidaddefectoAux,parametrocontabilidaddefectos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(this.parametrocontabilidaddefectosEliminados);
					
					parametrocontabilidaddefectoLogic.saveParametroContabilidadDefectos();//WithConnection
					//parametrocontabilidaddefectoLogic.getSetVersionRowParametroContabilidadDefectos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroContabilidadDefecto();
				
				this.parametrocontabilidaddefectosEliminados= new ArrayList<ParametroContabilidadDefecto>();		
			}
			
			if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Contabilidad Defecto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Contabilidad Defecto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametrocontabilidaddefecto=parametrocontabilidaddefectoAux;
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
      		//this.finishProcessParametroContabilidadDefecto();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroContabilidadDefecto parametrocontabilidaddefectoLocal) throws Exception {
		
		if(this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroContabilidadDefecto parametrocontabilidaddefectoLocal) throws Exception {	
		if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametrocontabilidaddefectoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				parametrocontabilidaddefectoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMonedaDetalleFormJInternalFrame.class)) {
				TipoMonedaBeanSwingJInternalFrame tipomonedaBeanSwingJInternalFrameLocal=(TipoMonedaBeanSwingJInternalFrame) ((TipoMonedaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomonedaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMoneda(tipomonedaBeanSwingJInternalFrameLocal.gettipomoneda(),true);
				tipomonedaBeanSwingJInternalFrameLocal.actualizarLista(tipomonedaBeanSwingJInternalFrameLocal.tipomoneda,this.tipomonedasForeignKey);

				tipomonedaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomonedaBeanSwingJInternalFrameLocal.tipomoneda);

				parametrocontabilidaddefectoLocal.setTipoMoneda(tipomonedaBeanSwingJInternalFrameLocal.tipomoneda);

				this.addItemDefectoCombosForeignKeyTipoMoneda();
				this.cargarCombosFrameTipoMonedasForeignKey("Formulario");
				this.setActualTipoMonedaForeignKey(tipomonedaBeanSwingJInternalFrameLocal.tipomoneda.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MonedaDetalleFormJInternalFrame.class)) {
				MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrameLocal=(MonedaBeanSwingJInternalFrame) ((MonedaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				monedaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMoneda(monedaBeanSwingJInternalFrameLocal.getmoneda(),true);
				monedaBeanSwingJInternalFrameLocal.actualizarLista(monedaBeanSwingJInternalFrameLocal.moneda,this.monedasForeignKey);

				monedaBeanSwingJInternalFrameLocal.actualizarRelaciones(monedaBeanSwingJInternalFrameLocal.moneda);

				parametrocontabilidaddefectoLocal.setMoneda(monedaBeanSwingJInternalFrameLocal.moneda);

				this.addItemDefectoCombosForeignKeyMoneda();
				this.cargarCombosFrameMonedasForeignKey("Formulario");
				this.setActualMonedaForeignKey(monedaBeanSwingJInternalFrameLocal.moneda.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				parametrocontabilidaddefectoLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoIntervaloDetalleFormJInternalFrame.class)) {
				TipoIntervaloBeanSwingJInternalFrame tipointervaloBeanSwingJInternalFrameLocal=(TipoIntervaloBeanSwingJInternalFrame) ((TipoIntervaloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipointervaloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoIntervalo(tipointervaloBeanSwingJInternalFrameLocal.gettipointervalo(),true);
				tipointervaloBeanSwingJInternalFrameLocal.actualizarLista(tipointervaloBeanSwingJInternalFrameLocal.tipointervalo,this.tipointervalosForeignKey);

				tipointervaloBeanSwingJInternalFrameLocal.actualizarRelaciones(tipointervaloBeanSwingJInternalFrameLocal.tipointervalo);

				parametrocontabilidaddefectoLocal.setTipoIntervalo(tipointervaloBeanSwingJInternalFrameLocal.tipointervalo);

				this.addItemDefectoCombosForeignKeyTipoIntervalo();
				this.cargarCombosFrameTipoIntervalosForeignKey("Formulario");
				this.setActualTipoIntervaloForeignKey(tipointervaloBeanSwingJInternalFrameLocal.tipointervalo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				parametrocontabilidaddefectoLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDocumentoDetalleFormJInternalFrame.class)) {
				TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrameLocal=(TipoDocumentoBeanSwingJInternalFrame) ((TipoDocumentoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodocumentoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.gettipodocumento(),true);
				tipodocumentoBeanSwingJInternalFrameLocal.actualizarLista(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento,this.tipodocumentosForeignKey);

				tipodocumentoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				parametrocontabilidaddefectoLocal.setTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey("Formulario");
				this.setActualTipoDocumentoForeignKey(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoAsientoContableDetalleFormJInternalFrame.class)) {
				EstadoAsientoContableBeanSwingJInternalFrame estadoasientocontableBeanSwingJInternalFrameLocal=(EstadoAsientoContableBeanSwingJInternalFrame) ((EstadoAsientoContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadoasientocontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoAsientoContable(estadoasientocontableBeanSwingJInternalFrameLocal.getestadoasientocontable(),true);
				estadoasientocontableBeanSwingJInternalFrameLocal.actualizarLista(estadoasientocontableBeanSwingJInternalFrameLocal.estadoasientocontable,this.estadoasientocontablesForeignKey);

				estadoasientocontableBeanSwingJInternalFrameLocal.actualizarRelaciones(estadoasientocontableBeanSwingJInternalFrameLocal.estadoasientocontable);

				parametrocontabilidaddefectoLocal.setEstadoAsientoContable(estadoasientocontableBeanSwingJInternalFrameLocal.estadoasientocontable);

				this.addItemDefectoCombosForeignKeyEstadoAsientoContable();
				this.cargarCombosFrameEstadoAsientoContablesForeignKey("Formulario");
				this.setActualEstadoAsientoContableForeignKey(estadoasientocontableBeanSwingJInternalFrameLocal.estadoasientocontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroContabilidadDefectoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametrocontabilidaddefectoValidator.getInvalidValues(this.parametrocontabilidaddefecto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroContabilidadDefecto parametrocontabilidaddefecto,List<ParametroContabilidadDefecto> parametrocontabilidaddefectos) throws Exception {
		try	{		
			ParametroContabilidadDefectoConstantesFunciones.actualizarLista(parametrocontabilidaddefecto,parametrocontabilidaddefectos,this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroContabilidadDefecto parametrocontabilidaddefecto,List<ParametroContabilidadDefecto> parametrocontabilidaddefectos) throws Exception {
		try	{			
			ParametroContabilidadDefectoConstantesFunciones.actualizarSelectedLista(parametrocontabilidaddefecto,parametrocontabilidaddefectos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroContabilidadDefecto> parametrocontabilidaddefectosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametrocontabilidaddefectosLocal=this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametrocontabilidaddefectosLocal=this.parametrocontabilidaddefectos;
			}
			//ARCHITECTURE
		
			for(ParametroContabilidadDefecto parametrocontabilidaddefectoLocal:parametrocontabilidaddefectosLocal) {
				if(this.permiteMantenimiento(parametrocontabilidaddefectoLocal) && parametrocontabilidaddefectoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroContabilidadDefectoConstantesFunciones.getParametroContabilidadDefectoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroContabilidadDefectoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_empresaParametroContabilidadDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroContabilidadDefectoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_sucursalParametroContabilidadDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroContabilidadDefectoConstantesFunciones.IDTIPOMONEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_tipo_monedaParametroContabilidadDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroContabilidadDefectoConstantesFunciones.IDMONEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_monedaParametroContabilidadDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroContabilidadDefectoConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_moduloParametroContabilidadDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroContabilidadDefectoConstantesFunciones.IDTIPOINTERVALO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_tipo_intervaloParametroContabilidadDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroContabilidadDefectoConstantesFunciones.IDTIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_tipo_movimientoParametroContabilidadDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroContabilidadDefectoConstantesFunciones.IDTIPODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_tipo_documentoParametroContabilidadDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroContabilidadDefectoConstantesFunciones.IDESTADOASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_estado_asiento_contableParametroContabilidadDefecto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_empresaParametroContabilidadDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_sucursalParametroContabilidadDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_tipo_monedaParametroContabilidadDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_monedaParametroContabilidadDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_moduloParametroContabilidadDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_tipo_intervaloParametroContabilidadDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_tipo_movimientoParametroContabilidadDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_tipo_documentoParametroContabilidadDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelid_estado_asiento_contableParametroContabilidadDefecto,"");
		
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
		this.iIdNuevoParametroContabilidadDefecto--;	
		
		
		this.parametrocontabilidaddefectoAux=new ParametroContabilidadDefecto();
		
		this.parametrocontabilidaddefectoAux.setId(this.iIdNuevoParametroContabilidadDefecto);
		this.parametrocontabilidaddefectoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().add(this.parametrocontabilidaddefectoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametrocontabilidaddefectos.add(this.parametrocontabilidaddefectoAux);
		}
		//ARCHITECTURE
		
		this.parametrocontabilidaddefecto=this.parametrocontabilidaddefectoAux;
		
		if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
		}
				
		//this.setDefaultControlesParametroContabilidadDefecto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroContabilidadDefecto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroContabilidadDefecto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroContabilidadDefecto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefectoBean,this.parametrocontabilidaddefecto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
			classes=ParametroContabilidadDefectoConstantesFunciones.getClassesRelationshipsOfParametroContabilidadDefecto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametrocontabilidaddefectoReturnGeneral=parametrocontabilidaddefectoLogic.procesarEventosParametroContabilidadDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos(),this.parametrocontabilidaddefecto,this.parametrocontabilidaddefectoParameterGeneral,this.isEsNuevoParametroContabilidadDefecto,classes);//this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefecto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroContabilidadDefecto(this.parametrocontabilidaddefectoReturnGeneral,this.parametrocontabilidaddefectoBean,false);
		
		if(this.parametrocontabilidaddefectoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroContabilidadDefecto(this.parametrocontabilidaddefectoReturnGeneral.getParametroContabilidadDefecto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroContabilidadDefecto(this.parametrocontabilidaddefectoReturnGeneral.getParametroContabilidadDefecto());
		}
		
		if(this.parametrocontabilidaddefectoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroContabilidadDefecto(this.parametrocontabilidaddefectoReturnGeneral.getParametroContabilidadDefecto(),classes);//this.parametrocontabilidaddefectoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroContabilidadDefecto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroContabilidadDefecto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.RecargarFormParametroContabilidadDefecto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroContabilidadDefecto(false);
						
			if(parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroContabilidadDefecto();
			}
			
			this.actualizarVisualTableDatosParametroContabilidadDefecto();
			
			this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroContabilidadDefecto(), this.getIndiceNuevoParametroContabilidadDefecto());
			
			this.seleccionarFilaTablaParametroContabilidadDefectoActual();
						
			this.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroContabilidadDefecto(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.setEnabled(isHabilitar && this.parametrocontabilidaddefectoConstantesFunciones.activarid_empresaParametroContabilidadDefecto);//
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.setEnabled(isHabilitar && this.parametrocontabilidaddefectoConstantesFunciones.activarid_sucursalParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.setEnabled(isHabilitar && this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_monedaParametroContabilidadDefecto);//
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.setEnabled(isHabilitar && this.parametrocontabilidaddefectoConstantesFunciones.activarid_monedaParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.setEnabled(isHabilitar && this.parametrocontabilidaddefectoConstantesFunciones.activarid_moduloParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setEnabled(isHabilitar && this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_intervaloParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setEnabled(isHabilitar && this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_movimientoParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.setEnabled(isHabilitar && this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_documentoParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setEnabled(isHabilitar && this.parametrocontabilidaddefectoConstantesFunciones.activarid_estado_asiento_contableParametroContabilidadDefecto);
	};
	
	public void setDefaultControlesParametroContabilidadDefecto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroContabilidadDefecto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(true);			
			this.parametrocontabilidaddefectoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jTabbedPaneRelacionesParametroContabilidadDefecto.setVisible(true);
			
					
		} else {
			//this.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(false);			
			this.parametrocontabilidaddefectoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jTabbedPaneRelacionesParametroContabilidadDefecto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroContabilidadDefecto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
				if(parametrocontabilidaddefectoAux.getId().equals(this.iIdNuevoParametroContabilidadDefecto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectos) {
				if(parametrocontabilidaddefectoAux.getId().equals(this.iIdNuevoParametroContabilidadDefecto)) {
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
	
	public int getIndiceActualParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
				if(parametrocontabilidaddefectoAux.getId().equals(parametrocontabilidaddefecto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectos) {
				if(parametrocontabilidaddefectoAux.getId().equals(parametrocontabilidaddefecto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefectoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
				if(parametrocontabilidaddefectoAux.getParametroContabilidadDefectoOriginal().getId().equals(parametrocontabilidaddefectoOriginal.getId())) {
					existe=true;
					parametrocontabilidaddefectoOriginal.setId(parametrocontabilidaddefectoAux.getId());
					parametrocontabilidaddefectoOriginal.setVersionRow(parametrocontabilidaddefectoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectos) {
				if(parametrocontabilidaddefectoAux.getParametroContabilidadDefectoOriginal().getId().equals(parametrocontabilidaddefectoOriginal.getId())) {
					existe=true;
					parametrocontabilidaddefectoOriginal.setId(parametrocontabilidaddefectoAux.getId());
					parametrocontabilidaddefectoOriginal.setVersionRow(parametrocontabilidaddefectoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroContabilidadDefecto(Boolean esParaCancelar) throws Exception {
		parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
		parametrocontabilidaddefectoAux=new ParametroContabilidadDefecto();
		
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
					if(parametrocontabilidaddefectoAux.getId()<0) {
						parametrocontabilidaddefectosAux.add(parametrocontabilidaddefectoAux);
					}		
				}
				this.iIdNuevoParametroContabilidadDefecto=0L;
				this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().removeAll(parametrocontabilidaddefectosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectos) {
					if(parametrocontabilidaddefectoAux.getId()<0) {
						parametrocontabilidaddefectosAux.add(parametrocontabilidaddefectoAux);
					}		
				}
				this.iIdNuevoParametroContabilidadDefecto=0L;
				this.parametrocontabilidaddefectos.removeAll(parametrocontabilidaddefectosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroContabilidadDefecto 
					&& this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()>0
					) {
					parametrocontabilidaddefectoAux=this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().get(this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size() - 1);
				
					if(parametrocontabilidaddefectoAux.getId()<0) {
						this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().remove(parametrocontabilidaddefectoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroContabilidadDefecto && this.parametrocontabilidaddefectos.size()>0) {
					parametrocontabilidaddefectoAux=this.parametrocontabilidaddefectos.get(this.parametrocontabilidaddefectos.size() - 1);
				
					if(parametrocontabilidaddefectoAux.getId()<0) {
						this.parametrocontabilidaddefectos.remove(parametrocontabilidaddefectoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroContabilidadDefecto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametrocontabilidaddefecto.getId()<0) {
				this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().remove(this.parametrocontabilidaddefecto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametrocontabilidaddefecto.getId()<0) {
				this.parametrocontabilidaddefectos.remove(this.parametrocontabilidaddefecto);
			}
		}			
	}
	
	public void setEstadosInicialesParametroContabilidadDefecto(List<ParametroContabilidadDefecto> parametrocontabilidaddefectosAux) throws Exception {
		ParametroContabilidadDefectoConstantesFunciones.setEstadosInicialesParametroContabilidadDefecto(parametrocontabilidaddefectosAux);
	}
	
	public void setEstadosInicialesParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefectoAux) throws Exception {
		ParametroContabilidadDefectoConstantesFunciones.setEstadosInicialesParametroContabilidadDefecto(parametrocontabilidaddefectoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroContabilidadDefectoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroContabilidadDefectoActual()) {
				if(!this.isEsNuevoParametroContabilidadDefecto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroContabilidadDefecto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroContabilidadDefectoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Contabilidad Defecto ?", "MANTENIMIENTO DE Parametro Contabilidad Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroContabilidadDefecto parametrocontabilidaddefecto) throws Exception {
		ParametroContabilidadDefectoConstantesFunciones.seleccionarAsignar(this.parametrocontabilidaddefecto,parametrocontabilidaddefecto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroContabilidadDefecto=this.isPermisoActualizarOriginalParametroContabilidadDefecto;
			
			
			this.seleccionarAsignar(parametrocontabilidaddefecto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroContabilidadDefectoConstantesFunciones.quitarEspaciosParametroContabilidadDefecto(this.parametrocontabilidaddefecto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametrocontabilidaddefectoSessionBean.setsFuncionBusquedaRapida(this.parametrocontabilidaddefectoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroContabilidadDefecto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroContabilidadDefecto(esParaCancelar);				
				this.cancelarNuevoParametroContabilidadDefecto(esParaCancelar);								
			}
			
			this.parametrocontabilidaddefecto=new ParametroContabilidadDefecto();
			
			this.inicializarParametroContabilidadDefecto();
			
			this.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroContabilidadDefecto() throws Exception {
		try {
			ParametroContabilidadDefectoConstantesFunciones.inicializarParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroContabilidadDefectos(String sAccionBusqueda,List<ParametroContabilidadDefecto> parametrocontabilidaddefectosParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroContabilidadDefecto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroContabilidadDefectoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroContabilidadDefectoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroContabilidadDefecto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Contabilidad Defectos");		
		parameters.put("busquedapor", ParametroContabilidadDefectoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroContabilidadDefecto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroContabilidadDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroContabilidadDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroContabilidadDefecto=new JRBeanArrayDataSource(ParametroContabilidadDefectoJInternalFrame.TraerParametroContabilidadDefectoBeans(parametrocontabilidaddefectosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroContabilidadDefecto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroContabilidadDefectoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroContabilidadDefectoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroContabilidadDefectoBean.TraerParametroContabilidadDefectoBeans(parametrocontabilidaddefectosParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroContabilidadDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrocontabilidaddefectosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroContabilidadDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrocontabilidaddefectosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroContabilidadDefectoActionPerformed(null);
					//this.generarExcelReporteParametroContabilidadDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrocontabilidaddefectosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroContabilidadDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrocontabilidaddefectosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroContabilidadDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrocontabilidaddefectosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroContabilidadDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrocontabilidaddefectosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroContabilidadDefectos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroContabilidadDefecto> parametrocontabilidaddefectosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontabilidaddefecto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroContabilidadDefectos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroContabilidadDefecto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroContabilidadDefecto parametrocontabilidaddefecto : parametrocontabilidaddefectosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroContabilidadDefectoConstantesFunciones.generarExcelReporteDataParametroContabilidadDefecto("NORMAL",row,workbook,parametrocontabilidaddefecto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Contabilidad Defecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroContabilidadDefecto(String sTipo,Row row,Workbook workbook) {
		
		ParametroContabilidadDefectoConstantesFunciones.generarExcelReporteHeaderParametroContabilidadDefecto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroContabilidadDefectos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroContabilidadDefecto> parametrocontabilidaddefectosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontabilidaddefecto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroContabilidadDefectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroContabilidadDefecto parametrocontabilidaddefecto : parametrocontabilidaddefectosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.getParametroContabilidadDefectoDescripcion(parametrocontabilidaddefecto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontabilidaddefecto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontabilidaddefecto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontabilidaddefecto.gettipomoneda_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontabilidaddefecto.getmoneda_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontabilidaddefecto.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontabilidaddefecto.gettipointervalo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontabilidaddefecto.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontabilidaddefecto.gettipodocumento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocontabilidaddefecto.getestadoasientocontable_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Contabilidad Defecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroContabilidadDefectos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroContabilidadDefecto> parametrocontabilidaddefectosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroContabilidadDefecto> parametrocontabilidaddefectosRespaldo=null;
		
		classes=ParametroContabilidadDefectoConstantesFunciones.getClassesRelationshipsOfParametroContabilidadDefecto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametrocontabilidaddefectoLogic.setDatosCliente(this.datosCliente);
		this.parametrocontabilidaddefectoLogic.setDatosDeep(this.datosDeep);
		this.parametrocontabilidaddefectoLogic.setIsConDeep(true);
		
		parametrocontabilidaddefectosRespaldo=this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos();
		
		this.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(parametrocontabilidaddefectosParaReportes);	
		this.parametrocontabilidaddefectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametrocontabilidaddefectosParaReportes=this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos();
		this.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(parametrocontabilidaddefectosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontabilidaddefecto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroContabilidadDefectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroContabilidadDefecto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroContabilidadDefecto parametrocontabilidaddefecto : parametrocontabilidaddefectosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroContabilidadDefecto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroContabilidadDefectoConstantesFunciones.generarExcelReporteDataParametroContabilidadDefecto("NORMAL",row,workbook,parametrocontabilidaddefecto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.getParametroContabilidadDefectoDescripcion(parametrocontabilidaddefecto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Contabilidad Defecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroContabilidadDefecto() throws Exception {		
		this.startProcessParametroContabilidadDefecto(true);
	}
	
	public void startProcessParametroContabilidadDefecto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroContabilidadDefecto ,this.jPanelParametrosReportesParametroContabilidadDefecto, this.jScrollPanelDatosParametroContabilidadDefecto,this.jPanelPaginacionParametroContabilidadDefecto, this.jScrollPanelDatosEdicionParametroContabilidadDefecto, this.jPanelAccionesParametroContabilidadDefecto,this.jPanelAccionesFormularioParametroContabilidadDefecto,this.jmenuBarParametroContabilidadDefecto,this.jmenuBarDetalleParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,this.jTtoolBarDetalleParametroContabilidadDefecto);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroContabilidadDefecto=this.jTabbedPaneBusquedasParametroContabilidadDefecto; 
		
		final JPanel jPanelParametrosReportesParametroContabilidadDefecto=this.jPanelParametrosReportesParametroContabilidadDefecto;
		//final JScrollPane jScrollPanelDatosParametroContabilidadDefecto=this.jScrollPanelDatosParametroContabilidadDefecto;
		final JTable jTableDatosParametroContabilidadDefecto=this.jTableDatosParametroContabilidadDefecto;		
		final JPanel jPanelPaginacionParametroContabilidadDefecto=this.jPanelPaginacionParametroContabilidadDefecto;
		//final JScrollPane jScrollPanelDatosEdicionParametroContabilidadDefecto=this.jScrollPanelDatosEdicionParametroContabilidadDefecto;
		final JPanel jPanelAccionesParametroContabilidadDefecto=this.jPanelAccionesParametroContabilidadDefecto;
		
		JPanel jPanelCamposAuxiliarParametroContabilidadDefecto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroContabilidadDefecto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			jPanelCamposAuxiliarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelCamposParametroContabilidadDefecto;
			jPanelAccionesFormularioAuxiliarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelAccionesFormularioParametroContabilidadDefecto;
		}
		
		final JPanel jPanelCamposParametroContabilidadDefecto=jPanelCamposAuxiliarParametroContabilidadDefecto;
		final JPanel jPanelAccionesFormularioParametroContabilidadDefecto=jPanelAccionesFormularioAuxiliarParametroContabilidadDefecto;
		
		
		final JMenuBar jmenuBarParametroContabilidadDefecto=this.jmenuBarParametroContabilidadDefecto;
		final JToolBar jTtoolBarParametroContabilidadDefecto=this.jTtoolBarParametroContabilidadDefecto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroContabilidadDefecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroContabilidadDefecto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			jmenuBarDetalleAuxiliarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jmenuBarDetalleParametroContabilidadDefecto;
			jTtoolBarDetalleAuxiliarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jTtoolBarDetalleParametroContabilidadDefecto;
		}
		
		final JMenuBar jmenuBarDetalleParametroContabilidadDefecto=jmenuBarDetalleAuxiliarParametroContabilidadDefecto;
		final JToolBar jTtoolBarDetalleParametroContabilidadDefecto=jTtoolBarDetalleAuxiliarParametroContabilidadDefecto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroContabilidadDefecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroContabilidadDefecto;
			processRunnable.jTableDatos=jTableDatosParametroContabilidadDefecto;
			processRunnable.jPanelCampos=jPanelCamposParametroContabilidadDefecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroContabilidadDefecto;
			processRunnable.jPanelAcciones=jPanelAccionesParametroContabilidadDefecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroContabilidadDefecto;
			
			
			processRunnable.jmenuBar=jmenuBarParametroContabilidadDefecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroContabilidadDefecto;
			processRunnable.jTtoolBar=jTtoolBarParametroContabilidadDefecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroContabilidadDefecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroContabilidadDefecto ,jPanelParametrosReportesParametroContabilidadDefecto,jTableDatosParametroContabilidadDefecto, /*jScrollPanelDatosParametroContabilidadDefecto,*/jPanelCamposParametroContabilidadDefecto,jPanelPaginacionParametroContabilidadDefecto, /*jScrollPanelDatosEdicionParametroContabilidadDefecto,*/ jPanelAccionesParametroContabilidadDefecto,jPanelAccionesFormularioParametroContabilidadDefecto,jmenuBarParametroContabilidadDefecto,jmenuBarDetalleParametroContabilidadDefecto,jTtoolBarParametroContabilidadDefecto,jTtoolBarDetalleParametroContabilidadDefecto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroContabilidadDefecto ,jPanelParametrosReportesParametroContabilidadDefecto, jScrollPanelDatosParametroContabilidadDefecto,jPanelPaginacionParametroContabilidadDefecto, jScrollPanelDatosEdicionParametroContabilidadDefecto, jPanelAccionesParametroContabilidadDefecto,jPanelAccionesFormularioParametroContabilidadDefecto,jmenuBarParametroContabilidadDefecto,jmenuBarDetalleParametroContabilidadDefecto,jTtoolBarParametroContabilidadDefecto,jTtoolBarDetalleParametroContabilidadDefecto);
						
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
	
	public void finishProcessParametroContabilidadDefecto() {// throws Exception 
		this.finishProcessParametroContabilidadDefecto(true);
	}
	
	public void finishProcessParametroContabilidadDefecto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroContabilidadDefecto ,this.jPanelParametrosReportesParametroContabilidadDefecto, this.jScrollPanelDatosParametroContabilidadDefecto,this.jPanelPaginacionParametroContabilidadDefecto, this.jScrollPanelDatosEdicionParametroContabilidadDefecto, this.jPanelAccionesParametroContabilidadDefecto,this.jPanelAccionesFormularioParametroContabilidadDefecto,this.jmenuBarParametroContabilidadDefecto,this.jmenuBarDetalleParametroContabilidadDefecto,this.jTtoolBarParametroContabilidadDefecto,this.jTtoolBarDetalleParametroContabilidadDefecto);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroContabilidadDefecto=this.jTabbedPaneBusquedasParametroContabilidadDefecto; 
		
		final JPanel jPanelParametrosReportesParametroContabilidadDefecto=this.jPanelParametrosReportesParametroContabilidadDefecto;
		//final JScrollPane jScrollPanelDatosParametroContabilidadDefecto=this.jScrollPanelDatosParametroContabilidadDefecto;
		final JTable jTableDatosParametroContabilidadDefecto=this.jTableDatosParametroContabilidadDefecto;		
		final JPanel jPanelPaginacionParametroContabilidadDefecto=this.jPanelPaginacionParametroContabilidadDefecto;
		//final JScrollPane jScrollPanelDatosEdicionParametroContabilidadDefecto=this.jScrollPanelDatosEdicionParametroContabilidadDefecto;
		final JPanel jPanelAccionesParametroContabilidadDefecto=this.jPanelAccionesParametroContabilidadDefecto;
		
		JPanel jPanelCamposAuxiliarParametroContabilidadDefecto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroContabilidadDefecto=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			jPanelCamposAuxiliarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelCamposParametroContabilidadDefecto;
			jPanelAccionesFormularioAuxiliarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelAccionesFormularioParametroContabilidadDefecto;
		}
		
		final JPanel jPanelCamposParametroContabilidadDefecto=jPanelCamposAuxiliarParametroContabilidadDefecto;
		final JPanel jPanelAccionesFormularioParametroContabilidadDefecto=jPanelAccionesFormularioAuxiliarParametroContabilidadDefecto;
		
		
		final JMenuBar jmenuBarParametroContabilidadDefecto=this.jmenuBarParametroContabilidadDefecto;		
		final JToolBar jTtoolBarParametroContabilidadDefecto=this.jTtoolBarParametroContabilidadDefecto;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroContabilidadDefecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroContabilidadDefecto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			jmenuBarDetalleAuxiliarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jmenuBarDetalleParametroContabilidadDefecto;
			jTtoolBarDetalleAuxiliarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jTtoolBarDetalleParametroContabilidadDefecto;		
		}
		
		final JMenuBar jmenuBarDetalleParametroContabilidadDefecto=jmenuBarDetalleAuxiliarParametroContabilidadDefecto;
		final JToolBar jTtoolBarDetalleParametroContabilidadDefecto=jTtoolBarDetalleAuxiliarParametroContabilidadDefecto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroContabilidadDefecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroContabilidadDefecto;
			processRunnable.jTableDatos=jTableDatosParametroContabilidadDefecto;
			processRunnable.jPanelCampos=jPanelCamposParametroContabilidadDefecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroContabilidadDefecto;
			processRunnable.jPanelAcciones=jPanelAccionesParametroContabilidadDefecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroContabilidadDefecto;
			
			
			processRunnable.jmenuBar=jmenuBarParametroContabilidadDefecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroContabilidadDefecto;
			processRunnable.jTtoolBar=jTtoolBarParametroContabilidadDefecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroContabilidadDefecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroContabilidadDefecto ,jPanelParametrosReportesParametroContabilidadDefecto, jTableDatosParametroContabilidadDefecto,/*jScrollPanelDatosParametroContabilidadDefecto,*/jPanelCamposParametroContabilidadDefecto,jPanelPaginacionParametroContabilidadDefecto, /*jScrollPanelDatosEdicionParametroContabilidadDefecto,*/ jPanelAccionesParametroContabilidadDefecto,jPanelAccionesFormularioParametroContabilidadDefecto,jmenuBarParametroContabilidadDefecto,jmenuBarDetalleParametroContabilidadDefecto,jTtoolBarParametroContabilidadDefecto,jTtoolBarDetalleParametroContabilidadDefecto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroContabilidadDefecto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroContabilidadDefecto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroContabilidadDefecto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroContabilidadDefecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroContabilidadDefecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroContabilidadDefecto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroContabilidadDefecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroContabilidadDefecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroContabilidadDefecto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametrocontabilidaddefectoConstantesFunciones.getsFinalQueryParametroContabilidadDefecto();
		String  finalQueryPaginacionTodos=this.parametrocontabilidaddefectoConstantesFunciones.getsFinalQueryParametroContabilidadDefecto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroContabilidadDefectoConstantesFunciones.getArrayColumnasGlobalesNoParametroContabilidadDefecto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroContabilidadDefectoConstantesFunciones.getArrayColumnasGlobalesParametroContabilidadDefecto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroContabilidadDefectoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametrocontabilidaddefectosEliminados= new ArrayList<ParametroContabilidadDefecto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroContabilidadDefecto();
		
				///*ParametroContabilidadDefectoSessionBean*/this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			
			if(this.parametrocontabilidaddefectoSessionBean==null) {
				this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
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
					this.iNumeroPaginacion=ParametroContabilidadDefectoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroContabilidadDefectoConstantesFunciones.getClassesForeignKeysOfParametroContabilidadDefecto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametrocontabilidaddefecto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametrocontabilidaddefectosAux= new ArrayList<ParametroContabilidadDefecto>();
			
				
			parametrocontabilidaddefectoLogic.setDatosCliente(this.datosCliente);
			parametrocontabilidaddefectoLogic.setDatosDeep(this.datosDeep);
			parametrocontabilidaddefectoLogic.setIsConDeep(true);
			
			
			parametrocontabilidaddefectoLogic.getParametroContabilidadDefectoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametrocontabilidaddefectoLogic.getTodosParametroContabilidadDefectos(finalQueryGlobal,pagination);
					
					//parametrocontabilidaddefectoLogic.getTodosParametroContabilidadDefectosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()==null|| parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrocontabilidaddefectosAux= new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectosAux= new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrocontabilidaddefectoLogic.getTodosParametroContabilidadDefectos(finalQueryGlobal+"",this.pagination);												
							
							//parametrocontabilidaddefectoLogic.getTodosParametroContabilidadDefectosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroContabilidadDefectos("Todos",parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());					
							parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(parametrocontabilidaddefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectos.addAll(parametrocontabilidaddefectosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroContabilidadDefecto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroContabilidadDefecto=this.idActual;
				
				} else if(this.idParametroContabilidadDefectoActual!=null && this.idParametroContabilidadDefectoActual!=0L) {
					idParametroContabilidadDefecto=idParametroContabilidadDefectoActual;
				}
				
					
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndicePorId(idParametroContabilidadDefecto);
				
				this.parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametrocontabilidaddefectoLogic.getEntity(idParametroContabilidadDefecto);
					
					//parametrocontabilidaddefectoLogic.getEntityWithConnection(idParametroContabilidadDefecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().add(parametrocontabilidaddefectoLogic.getParametroContabilidadDefecto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
					this.parametrocontabilidaddefectos.add(parametrocontabilidaddefecto);
				}
				
				if(parametrocontabilidaddefectoLogic.getParametroContabilidadDefecto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()==null||parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontabilidaddefectos==null|| parametrocontabilidaddefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
						parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContabilidadDefectos("FK_IdEmpresa",parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContabilidadDefectos("FK_IdEmpresa",parametrocontabilidaddefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
						parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(parametrocontabilidaddefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectos.addAll(parametrocontabilidaddefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoAsientoContable")) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdEstadoAsientoContable(id_estado_asiento_contableFK_IdEstadoAsientoContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdEstadoAsientoContable(finalQueryGlobal,pagination,id_estado_asiento_contableFK_IdEstadoAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdEstadoAsientoContable(id_estado_asiento_contableFK_IdEstadoAsientoContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdEstadoAsientoContable(id_estado_asiento_contableFK_IdEstadoAsientoContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()==null||parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontabilidaddefectos==null|| parametrocontabilidaddefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
						parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdEstadoAsientoContable(finalQueryGlobal,pagination,id_estado_asiento_contableFK_IdEstadoAsientoContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdEstadoAsientoContable(id_estado_asiento_contableFK_IdEstadoAsientoContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdEstadoAsientoContable(id_estado_asiento_contableFK_IdEstadoAsientoContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContabilidadDefectos("FK_IdEstadoAsientoContable",parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContabilidadDefectos("FK_IdEstadoAsientoContable",parametrocontabilidaddefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
						parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(parametrocontabilidaddefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectos.addAll(parametrocontabilidaddefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()==null||parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontabilidaddefectos==null|| parametrocontabilidaddefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
						parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContabilidadDefectos("FK_IdModulo",parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContabilidadDefectos("FK_IdModulo",parametrocontabilidaddefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
						parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(parametrocontabilidaddefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectos.addAll(parametrocontabilidaddefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMoneda")) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdMoneda(finalQueryGlobal,pagination,id_monedaFK_IdMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()==null||parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontabilidaddefectos==null|| parametrocontabilidaddefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
						parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdMoneda(finalQueryGlobal,pagination,id_monedaFK_IdMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContabilidadDefectos("FK_IdMoneda",parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContabilidadDefectos("FK_IdMoneda",parametrocontabilidaddefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
						parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(parametrocontabilidaddefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectos.addAll(parametrocontabilidaddefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()==null||parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontabilidaddefectos==null|| parametrocontabilidaddefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
						parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContabilidadDefectos("FK_IdSucursal",parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContabilidadDefectos("FK_IdSucursal",parametrocontabilidaddefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
						parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(parametrocontabilidaddefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectos.addAll(parametrocontabilidaddefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoDocumento")) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoDocumento(id_tipo_documentoFK_IdTipoDocumento);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoDocumento(finalQueryGlobal,pagination,id_tipo_documentoFK_IdTipoDocumento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoDocumento(id_tipo_documentoFK_IdTipoDocumento);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoDocumento(id_tipo_documentoFK_IdTipoDocumento);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()==null||parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontabilidaddefectos==null|| parametrocontabilidaddefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
						parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoDocumento(finalQueryGlobal,pagination,id_tipo_documentoFK_IdTipoDocumento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoDocumento(id_tipo_documentoFK_IdTipoDocumento);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoDocumento(id_tipo_documentoFK_IdTipoDocumento);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContabilidadDefectos("FK_IdTipoDocumento",parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContabilidadDefectos("FK_IdTipoDocumento",parametrocontabilidaddefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
						parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(parametrocontabilidaddefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectos.addAll(parametrocontabilidaddefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoIntervalo")) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoIntervalo(id_tipo_intervaloFK_IdTipoIntervalo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoIntervalo(finalQueryGlobal,pagination,id_tipo_intervaloFK_IdTipoIntervalo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoIntervalo(id_tipo_intervaloFK_IdTipoIntervalo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoIntervalo(id_tipo_intervaloFK_IdTipoIntervalo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()==null||parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontabilidaddefectos==null|| parametrocontabilidaddefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
						parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoIntervalo(finalQueryGlobal,pagination,id_tipo_intervaloFK_IdTipoIntervalo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoIntervalo(id_tipo_intervaloFK_IdTipoIntervalo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoIntervalo(id_tipo_intervaloFK_IdTipoIntervalo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContabilidadDefectos("FK_IdTipoIntervalo",parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContabilidadDefectos("FK_IdTipoIntervalo",parametrocontabilidaddefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
						parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(parametrocontabilidaddefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectos.addAll(parametrocontabilidaddefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoMoneda")) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoMoneda(id_tipo_monedaFK_IdTipoMoneda);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoMoneda(finalQueryGlobal,pagination,id_tipo_monedaFK_IdTipoMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoMoneda(id_tipo_monedaFK_IdTipoMoneda);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoMoneda(id_tipo_monedaFK_IdTipoMoneda);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()==null||parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontabilidaddefectos==null|| parametrocontabilidaddefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
						parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoMoneda(finalQueryGlobal,pagination,id_tipo_monedaFK_IdTipoMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoMoneda(id_tipo_monedaFK_IdTipoMoneda);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoMoneda(id_tipo_monedaFK_IdTipoMoneda);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContabilidadDefectos("FK_IdTipoMoneda",parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContabilidadDefectos("FK_IdTipoMoneda",parametrocontabilidaddefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
						parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(parametrocontabilidaddefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectos.addAll(parametrocontabilidaddefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoMovimiento")) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoMovimiento(finalQueryGlobal,pagination,id_tipo_movimientoFK_IdTipoMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()==null||parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocontabilidaddefectos==null|| parametrocontabilidaddefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
						parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectosAux=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectosAux.addAll(parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoMovimiento(finalQueryGlobal,pagination,id_tipo_movimientoFK_IdTipoMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroContabilidadDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoMovimiento(id_tipo_movimientoFK_IdTipoMovimiento);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroContabilidadDefectos("FK_IdTipoMovimiento",parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroContabilidadDefectos("FK_IdTipoMovimiento",parametrocontabilidaddefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(new ArrayList<ParametroContabilidadDefecto>());
						parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().addAll(parametrocontabilidaddefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectos=new ArrayList<ParametroContabilidadDefecto>();
							parametrocontabilidaddefectos.addAll(parametrocontabilidaddefectosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroContabilidadDefecto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroContabilidadDefecto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocontabilidaddefectos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocontabilidaddefectos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroContabilidadDefecto parametrocontabilidaddefecto) {
		Boolean permite=true;
		
		if(this.parametrocontabilidaddefecto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroContabilidadDefectoConstantesFunciones.getOrderByListaParametroContabilidadDefecto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroContabilidadDefectoConstantesFunciones.getOrderByListaParametroContabilidadDefecto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
				if(parametrocontabilidaddefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocontabilidaddefectoTotales=parametrocontabilidaddefecto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroContabilidadDefecto parametrocontabilidaddefecto:this.parametrocontabilidaddefectos) {
				if(parametrocontabilidaddefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocontabilidaddefectoTotales=parametrocontabilidaddefecto;
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
			this.parametrocontabilidaddefectoAux=new ParametroContabilidadDefecto();
			this.parametrocontabilidaddefectoAux.setsType(Constantes2.S_TOTALES);
			this.parametrocontabilidaddefectoAux.setIsNew(false);
			this.parametrocontabilidaddefectoAux.setIsChanged(false);
			this.parametrocontabilidaddefectoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroContabilidadDefectoConstantesFunciones.TotalizarValoresFilaParametroContabilidadDefecto(this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos(),this.parametrocontabilidaddefectoAux);
				
				this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().add(this.parametrocontabilidaddefectoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroContabilidadDefectoConstantesFunciones.TotalizarValoresFilaParametroContabilidadDefecto(this.parametrocontabilidaddefectos,this.parametrocontabilidaddefectoAux);
				
				this.parametrocontabilidaddefectos.add(this.parametrocontabilidaddefectoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrocontabilidaddefectoTotales=new ParametroContabilidadDefecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().remove(parametrocontabilidaddefectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrocontabilidaddefectos.remove(parametrocontabilidaddefectoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrocontabilidaddefectoTotales=new ParametroContabilidadDefecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
				if(parametrocontabilidaddefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocontabilidaddefectoTotales=parametrocontabilidaddefecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroContabilidadDefectoConstantesFunciones.TotalizarValoresFilaParametroContabilidadDefecto(this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos(),parametrocontabilidaddefectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroContabilidadDefecto parametrocontabilidaddefecto:this.parametrocontabilidaddefectos) {
				if(parametrocontabilidaddefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocontabilidaddefectoTotales=parametrocontabilidaddefecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroContabilidadDefectoConstantesFunciones.TotalizarValoresFilaParametroContabilidadDefecto(this.parametrocontabilidaddefectos,parametrocontabilidaddefectoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroContabilidadDefectosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroContabilidadDefectosFK_IdEstadoAsientoContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoAsientoContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroContabilidadDefectosFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroContabilidadDefectosFK_IdMoneda()throws Exception {
		try {
			sAccionBusqueda="FK_IdMoneda";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroContabilidadDefectosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroContabilidadDefectosFK_IdTipoDocumento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDocumento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroContabilidadDefectosFK_IdTipoIntervalo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoIntervalo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroContabilidadDefectosFK_IdTipoMoneda()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMoneda";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroContabilidadDefectosFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroContabilidadDefectosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroContabilidadDefectosFK_IdEstadoAsientoContable(String sFinalQuery,Long id_estado_asiento_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdEstadoAsientoContable(sFinalQuery,this.pagination,id_estado_asiento_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroContabilidadDefectosFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroContabilidadDefectosFK_IdMoneda(String sFinalQuery,Long id_moneda)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdMoneda(sFinalQuery,this.pagination,id_moneda);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroContabilidadDefectosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroContabilidadDefectosFK_IdTipoDocumento(String sFinalQuery,Long id_tipo_documento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoDocumento(sFinalQuery,this.pagination,id_tipo_documento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroContabilidadDefectosFK_IdTipoIntervalo(String sFinalQuery,Long id_tipo_intervalo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoIntervalo(sFinalQuery,this.pagination,id_tipo_intervalo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroContabilidadDefectosFK_IdTipoMoneda(String sFinalQuery,Long id_tipo_moneda)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoMoneda(sFinalQuery,this.pagination,id_tipo_moneda);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroContabilidadDefectosFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontabilidaddefectoLogic.getParametroContabilidadDefectosFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
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
	
	public void inicializarPermisosParametroContabilidadDefecto() {
		this.isPermisoTodoParametroContabilidadDefecto=false;
		this.isPermisoNuevoParametroContabilidadDefecto=false;
		this.isPermisoActualizarParametroContabilidadDefecto=false;
		this.isPermisoActualizarOriginalParametroContabilidadDefecto=false;
		this.isPermisoEliminarParametroContabilidadDefecto=false;
		this.isPermisoGuardarCambiosParametroContabilidadDefecto=false;
		this.isPermisoConsultaParametroContabilidadDefecto=false;
		this.isPermisoBusquedaParametroContabilidadDefecto=false;
		this.isPermisoReporteParametroContabilidadDefecto=false;		
		this.isPermisoOrdenParametroContabilidadDefecto=false;		
		this.isPermisoPaginacionMedioParametroContabilidadDefecto=false;		
		this.isPermisoPaginacionAltoParametroContabilidadDefecto=false;
		this.isPermisoPaginacionTodoParametroContabilidadDefecto=false;
		this.isPermisoCopiarParametroContabilidadDefecto=false;		
		this.isPermisoVerFormParametroContabilidadDefecto=false;		
		this.isPermisoDuplicarParametroContabilidadDefecto=false;		
		this.isPermisoOrdenParametroContabilidadDefecto=false;		
	}
	
	public void setPermisosUsuarioParametroContabilidadDefecto(Boolean isPermiso) {
		this.isPermisoTodoParametroContabilidadDefecto=isPermiso;
		this.isPermisoNuevoParametroContabilidadDefecto=isPermiso;
		this.isPermisoActualizarParametroContabilidadDefecto=isPermiso;
		this.isPermisoActualizarOriginalParametroContabilidadDefecto=isPermiso;
		this.isPermisoEliminarParametroContabilidadDefecto=isPermiso;
		this.isPermisoGuardarCambiosParametroContabilidadDefecto=isPermiso;
		this.isPermisoConsultaParametroContabilidadDefecto=isPermiso;
		this.isPermisoBusquedaParametroContabilidadDefecto=isPermiso;
		this.isPermisoReporteParametroContabilidadDefecto=isPermiso;
		this.isPermisoOrdenParametroContabilidadDefecto=isPermiso;		
		this.isPermisoPaginacionMedioParametroContabilidadDefecto=isPermiso;		
		this.isPermisoPaginacionAltoParametroContabilidadDefecto=isPermiso;		
		this.isPermisoPaginacionTodoParametroContabilidadDefecto=isPermiso;		
		this.isPermisoCopiarParametroContabilidadDefecto=isPermiso;		
		this.isPermisoVerFormParametroContabilidadDefecto=isPermiso;		
		this.isPermisoDuplicarParametroContabilidadDefecto=isPermiso;
		this.isPermisoOrdenParametroContabilidadDefecto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroContabilidadDefecto(Boolean isPermiso) {
		//this.isPermisoTodoParametroContabilidadDefecto=isPermiso;
		this.isPermisoNuevoParametroContabilidadDefecto=isPermiso;
		this.isPermisoActualizarParametroContabilidadDefecto=isPermiso;
		this.isPermisoActualizarOriginalParametroContabilidadDefecto=isPermiso;
		this.isPermisoEliminarParametroContabilidadDefecto=isPermiso;
		this.isPermisoGuardarCambiosParametroContabilidadDefecto=isPermiso;
		//this.isPermisoConsultaParametroContabilidadDefecto=isPermiso;
		//this.isPermisoBusquedaParametroContabilidadDefecto=isPermiso;
		//this.isPermisoReporteParametroContabilidadDefecto=isPermiso;
		//this.isPermisoOrdenParametroContabilidadDefecto=isPermiso;		
		//this.isPermisoPaginacionMedioParametroContabilidadDefecto=isPermiso;		
		//this.isPermisoPaginacionAltoParametroContabilidadDefecto=isPermiso;		
		//this.isPermisoPaginacionTodoParametroContabilidadDefecto=isPermiso;		
		//this.isPermisoCopiarParametroContabilidadDefecto=isPermiso;		
		//this.isPermisoDuplicarParametroContabilidadDefecto=isPermiso;
		//this.isPermisoOrdenParametroContabilidadDefecto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroContabilidadDefectoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroContabilidadDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroContabilidadDefecto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroContabilidadDefectoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroContabilidadDefectoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroContabilidadDefectoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroContabilidadDefectoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroContabilidadDefecto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroContabilidadDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroContabilidadDefecto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroContabilidadDefecto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroContabilidadDefecto=this.isPermisoActualizarParametroContabilidadDefecto;
			this.isPermisoEliminarParametroContabilidadDefecto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroContabilidadDefecto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroContabilidadDefecto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroContabilidadDefecto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroContabilidadDefecto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroContabilidadDefecto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroContabilidadDefecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroContabilidadDefecto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroContabilidadDefecto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroContabilidadDefecto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroContabilidadDefecto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroContabilidadDefecto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroContabilidadDefecto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroContabilidadDefecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroContabilidadDefecto.setToolTipText(this.jTableDatosParametroContabilidadDefecto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroContabilidadDefecto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroContabilidadDefecto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroContabilidadDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroContabilidadDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroContabilidadDefecto() throws Exception {
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
	public void inicializarCombosForeignKeyParametroContabilidadDefectoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tipomonedasForeignKey=new ArrayList();
				this.monedasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.tipointervalosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
				this.tipodocumentosForeignKey=new ArrayList();
				this.estadoasientocontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroContabilidadDefectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroContabilidadDefectoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroContabilidadDefectoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMonedaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMonedaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoIntervaloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoMonedaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipomonedasForeignKey==null||this.tipomonedasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMonedaConstantesFunciones.getArrayColumnasGlobalesTipoMoneda(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMonedaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMonedaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMonedasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMonedaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.monedasForeignKey==null||this.monedasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MonedaConstantesFunciones.getArrayColumnasGlobalesMoneda(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MonedaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MonedaConstantesFunciones.SFINALQUERY;

				this.cargarCombosMonedasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIntervaloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipointervalosForeignKey==null||this.tipointervalosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoIntervaloConstantesFunciones.getArrayColumnasGlobalesTipoIntervalo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIntervaloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoIntervaloConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoIntervalosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyTipoDocumentoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodocumentosForeignKey==null||this.tipodocumentosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDocumentoConstantesFunciones.getArrayColumnasGlobalesTipoDocumento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDocumentoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDocumentosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoAsientoContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadoasientocontablesForeignKey==null||this.estadoasientocontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoAsientoContableConstantesFunciones.getArrayColumnasGlobalesEstadoAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoAsientoContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoAsientoContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoAsientoContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParametroContabilidadDefectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroContabilidadDefectoParameterReturnGeneral parametrocontabilidaddefectoReturnGeneral=new ParametroContabilidadDefectoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_empresaParametroContabilidadDefecto)
					 || (this.esRecargarFks && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_empresaParametroContabilidadDefecto)) {

					if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametrocontabilidaddefectoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_sucursalParametroContabilidadDefecto)
					 || (this.esRecargarFks && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_sucursalParametroContabilidadDefecto)) {

					if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+parametrocontabilidaddefectoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTipoMoneda="";

				if(((this.tipomonedasForeignKey==null||this.tipomonedasForeignKey.size()<=0) && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_monedaParametroContabilidadDefecto)
					 || (this.esRecargarFks && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_monedaParametroContabilidadDefecto)) {

					if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMoneda()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMonedaConstantesFunciones.getArrayColumnasGlobalesTipoMoneda(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMoneda=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMonedaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMoneda=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMoneda, "");
						finalQueryGlobalTipoMoneda+=TipoMonedaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMonedasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMoneda=" WHERE " + ConstantesSql.ID + "="+parametrocontabilidaddefectoSessionBean.getlidTipoMonedaActual();
					}
				} else {
					finalQueryGlobalTipoMoneda="NONE";
				}


				String finalQueryGlobalMoneda="";

				if(((this.monedasForeignKey==null||this.monedasForeignKey.size()<=0) && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_monedaParametroContabilidadDefecto)
					 || (this.esRecargarFks && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_monedaParametroContabilidadDefecto)) {

					if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MonedaConstantesFunciones.getArrayColumnasGlobalesMoneda(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMoneda=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MonedaConstantesFunciones.TABLENAME);

						finalQueryGlobalMoneda=Funciones.GetFinalQueryAppend(finalQueryGlobalMoneda, "");
						finalQueryGlobalMoneda+=MonedaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMonedasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMoneda=" WHERE " + ConstantesSql.ID + "="+parametrocontabilidaddefectoSessionBean.getlidMonedaActual();
					}
				} else {
					finalQueryGlobalMoneda="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_moduloParametroContabilidadDefecto)
					 || (this.esRecargarFks && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_moduloParametroContabilidadDefecto)) {

					if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+parametrocontabilidaddefectoSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTipoIntervalo="";

				if(((this.tipointervalosForeignKey==null||this.tipointervalosForeignKey.size()<=0) && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_intervaloParametroContabilidadDefecto)
					 || (this.esRecargarFks && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_intervaloParametroContabilidadDefecto)) {

					if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoIntervalo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoIntervaloConstantesFunciones.getArrayColumnasGlobalesTipoIntervalo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoIntervalo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIntervaloConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoIntervalo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoIntervalo, "");
						finalQueryGlobalTipoIntervalo+=TipoIntervaloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoIntervalosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoIntervalo=" WHERE " + ConstantesSql.ID + "="+parametrocontabilidaddefectoSessionBean.getlidTipoIntervaloActual();
					}
				} else {
					finalQueryGlobalTipoIntervalo="NONE";
				}


				String finalQueryGlobalTipoMovimiento="";

				if(((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0) && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_movimientoParametroContabilidadDefecto)
					 || (this.esRecargarFks && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_movimientoParametroContabilidadDefecto)) {

					if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMovimiento=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMovimiento=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMovimiento, "");
						finalQueryGlobalTipoMovimiento+=TipoMovimientoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMovimiento=" WHERE " + ConstantesSql.ID + "="+parametrocontabilidaddefectoSessionBean.getlidTipoMovimientoActual();
					}
				} else {
					finalQueryGlobalTipoMovimiento="NONE";
				}


				String finalQueryGlobalTipoDocumento="";

				if(((this.tipodocumentosForeignKey==null||this.tipodocumentosForeignKey.size()<=0) && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_documentoParametroContabilidadDefecto)
					 || (this.esRecargarFks && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_documentoParametroContabilidadDefecto)) {

					if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoDocumentoConstantesFunciones.getArrayColumnasGlobalesTipoDocumento(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoDocumento=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoDocumento=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoDocumento, "");
						finalQueryGlobalTipoDocumento+=TipoDocumentoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoDocumentosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoDocumento=" WHERE " + ConstantesSql.ID + "="+parametrocontabilidaddefectoSessionBean.getlidTipoDocumentoActual();
					}
				} else {
					finalQueryGlobalTipoDocumento="NONE";
				}


				String finalQueryGlobalEstadoAsientoContable="";

				if(((this.estadoasientocontablesForeignKey==null||this.estadoasientocontablesForeignKey.size()<=0) && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_estado_asiento_contableParametroContabilidadDefecto)
					 || (this.esRecargarFks && this.parametrocontabilidaddefectoConstantesFunciones.cargarid_estado_asiento_contableParametroContabilidadDefecto)) {

					if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoAsientoContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoAsientoContableConstantesFunciones.getArrayColumnasGlobalesEstadoAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoAsientoContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoAsientoContableConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoAsientoContable=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoAsientoContable, "");
						finalQueryGlobalEstadoAsientoContable+=EstadoAsientoContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoAsientoContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoAsientoContable=" WHERE " + ConstantesSql.ID + "="+parametrocontabilidaddefectoSessionBean.getlidEstadoAsientoContableActual();
					}
				} else {
					finalQueryGlobalEstadoAsientoContable="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametrocontabilidaddefectoReturnGeneral=parametrocontabilidaddefectoLogic.cargarCombosLoteForeignKeyParametroContabilidadDefecto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTipoMoneda,finalQueryGlobalMoneda,finalQueryGlobalModulo,finalQueryGlobalTipoIntervalo,finalQueryGlobalTipoMovimiento,finalQueryGlobalTipoDocumento,finalQueryGlobalEstadoAsientoContable);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametrocontabilidaddefectoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=parametrocontabilidaddefectoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTipoMoneda.equals("NONE")) {
				this.tipomonedasForeignKey=parametrocontabilidaddefectoReturnGeneral.gettipomonedasForeignKey();
			}

			if(!finalQueryGlobalMoneda.equals("NONE")) {
				this.monedasForeignKey=parametrocontabilidaddefectoReturnGeneral.getmonedasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=parametrocontabilidaddefectoReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTipoIntervalo.equals("NONE")) {
				this.tipointervalosForeignKey=parametrocontabilidaddefectoReturnGeneral.gettipointervalosForeignKey();
			}

			if(!finalQueryGlobalTipoMovimiento.equals("NONE")) {
				this.tipomovimientosForeignKey=parametrocontabilidaddefectoReturnGeneral.gettipomovimientosForeignKey();
			}

			if(!finalQueryGlobalTipoDocumento.equals("NONE")) {
				this.tipodocumentosForeignKey=parametrocontabilidaddefectoReturnGeneral.gettipodocumentosForeignKey();
			}

			if(!finalQueryGlobalEstadoAsientoContable.equals("NONE")) {
				this.estadoasientocontablesForeignKey=parametrocontabilidaddefectoReturnGeneral.getestadoasientocontablesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroContabilidadDefecto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTipoMoneda();
			this.addItemDefectoCombosForeignKeyMoneda();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTipoIntervalo();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
			this.addItemDefectoCombosForeignKeyTipoDocumento();
			this.addItemDefectoCombosForeignKeyEstadoAsientoContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametrocontabilidaddefectoSessionBean==null) {
				this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
			}

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyTipoMoneda()throws Exception {
		try {

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMoneda()) {
				TipoMoneda tipomoneda=new TipoMoneda();
				TipoMonedaConstantesFunciones.setTipoMonedaDescripcion(tipomoneda,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomoneda.setId(null);

				if(!TipoMonedaConstantesFunciones.ExisteEnLista(this.tipomonedasForeignKey,tipomoneda,true)) {

					this.tipomonedasForeignKey.add(0,tipomoneda);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMoneda()throws Exception {
		try {

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {
				Moneda moneda=new Moneda();
				MonedaConstantesFunciones.setMonedaDescripcion(moneda,Constantes.SMENSAJE_ESCOJA_OPCION);
				moneda.setId(null);

				if(!MonedaConstantesFunciones.ExisteEnLista(this.monedasForeignKey,moneda,true)) {

					this.monedasForeignKey.add(0,moneda);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoIntervalo()throws Exception {
		try {

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoIntervalo()) {
				TipoIntervalo tipointervalo=new TipoIntervalo();
				TipoIntervaloConstantesFunciones.setTipoIntervaloDescripcion(tipointervalo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipointervalo.setId(null);

				if(!TipoIntervaloConstantesFunciones.ExisteEnLista(this.tipointervalosForeignKey,tipointervalo,true)) {

					this.tipointervalosForeignKey.add(0,tipointervalo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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

	public void addItemDefectoCombosForeignKeyTipoDocumento()throws Exception {
		try {

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
				TipoDocumento tipodocumento=new TipoDocumento();
				TipoDocumentoConstantesFunciones.setTipoDocumentoDescripcion(tipodocumento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodocumento.setId(null);

				if(!TipoDocumentoConstantesFunciones.ExisteEnLista(this.tipodocumentosForeignKey,tipodocumento,true)) {

					this.tipodocumentosForeignKey.add(0,tipodocumento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoAsientoContable()throws Exception {
		try {

			if(!this.parametrocontabilidaddefectoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoAsientoContable()) {
				EstadoAsientoContable estadoasientocontable=new EstadoAsientoContable();
				EstadoAsientoContableConstantesFunciones.setEstadoAsientoContableDescripcion(estadoasientocontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadoasientocontable.setId(null);

				if(!EstadoAsientoContableConstantesFunciones.ExisteEnLista(this.estadoasientocontablesForeignKey,estadoasientocontable,true)) {

					this.estadoasientocontablesForeignKey.add(0,estadoasientocontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParametroContabilidadDefecto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroContabilidadDefecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroContabilidadDefecto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualMonedaForeignKey(this.parametroGeneralUsuario.getid_moneda(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroContabilidadDefecto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto)throws Exception {	
		try {
			
			this.setActualTipoMonedaForeignKey(parametrocontabilidaddefecto.getid_tipo_moneda(),false,"Formulario");
			this.setActualModuloForeignKey(parametrocontabilidaddefecto.getid_modulo(),false,"Formulario");
			this.setActualTipoIntervaloForeignKey(parametrocontabilidaddefecto.getid_tipo_intervalo(),false,"Formulario");
			this.setActualTipoMovimientoForeignKey(parametrocontabilidaddefecto.getid_tipo_movimiento(),false,"Formulario");
			this.setActualTipoDocumentoForeignKey(parametrocontabilidaddefecto.getid_tipo_documento(),false,"Formulario");
			this.setActualEstadoAsientoContableForeignKey(parametrocontabilidaddefecto.getid_estado_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroContabilidadDefecto()throws Exception {	
		try {
			
			this.setActualTipoMonedaForeignKey(this.parametrocontabilidaddefectoConstantesFunciones.getid_tipo_moneda(),false,"Formulario");
			this.setActualModuloForeignKey(this.parametrocontabilidaddefectoConstantesFunciones.getid_modulo(),false,"Formulario");
			this.setActualTipoIntervaloForeignKey(this.parametrocontabilidaddefectoConstantesFunciones.getid_tipo_intervalo(),false,"Formulario");
			this.setActualTipoMovimientoForeignKey(this.parametrocontabilidaddefectoConstantesFunciones.getid_tipo_movimiento(),false,"Formulario");
			this.setActualTipoDocumentoForeignKey(this.parametrocontabilidaddefectoConstantesFunciones.getid_tipo_documento(),false,"Formulario");
			this.setActualEstadoAsientoContableForeignKey(this.parametrocontabilidaddefectoConstantesFunciones.getid_estado_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroContabilidadDefecto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroContabilidadDefecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroContabilidadDefecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroContabilidadDefecto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroContabilidadDefecto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTipoMonedasForeignKey("Todos");
			this.cargarCombosFrameMonedasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTipoIntervalosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
			this.cargarCombosFrameTipoDocumentosForeignKey("Todos");
			this.cargarCombosFrameEstadoAsientoContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroContabilidadDefecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMonedasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMonedasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoIntervalosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoAsientoContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroContabilidadDefecto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public ParametroContabilidadDefectoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroContabilidadDefectoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroContabilidadDefectoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean(); 
		this.parametrocontabilidaddefectoConstantesFunciones=new ParametroContabilidadDefectoConstantesFunciones(); 
		this.parametrocontabilidaddefectoBean=new ParametroContabilidadDefecto();//(this.parametrocontabilidaddefectoConstantesFunciones); 		
		this.parametrocontabilidaddefectoReturnGeneral=new ParametroContabilidadDefectoParameterReturnGeneral(); 
		
		this.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroContabilidadDefectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroContabilidadDefectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroContabilidadDefectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroContabilidadDefecto(true);
			
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
			
			this.parametrocontabilidaddefectoConstantesFunciones=new ParametroContabilidadDefectoConstantesFunciones(); 
			this.parametrocontabilidaddefectoBean=new ParametroContabilidadDefecto();//this.parametrocontabilidaddefectoConstantesFunciones); 			
			this.parametrocontabilidaddefectoReturnGeneral=new ParametroContabilidadDefectoParameterReturnGeneral(); 
		
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Contabilidad Defecto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parametrocontabilidaddefecto=new ParametroContabilidadDefecto();
			this.parametrocontabilidaddefectos = new ArrayList<ParametroContabilidadDefecto>();
			this.parametrocontabilidaddefectosAux = new ArrayList<ParametroContabilidadDefecto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic=new ParametroContabilidadDefectoLogic();
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}
			
			//this.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroContabilidadDefecto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroContabilidadDefecto);	
					}
					
					if(this.jInternalFrameImportacionParametroContabilidadDefecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroContabilidadDefecto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroContabilidadDefecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroContabilidadDefecto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroContabilidadDefecto);
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.setVisible(false);
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto);
					this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroContabilidadDefecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroContabilidadDefecto);
					this.jInternalFrameImportacionParametroContabilidadDefecto.setVisible(false);
					this.jInternalFrameImportacionParametroContabilidadDefecto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroContabilidadDefecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroContabilidadDefecto);
					this.jInternalFrameOrderByParametroContabilidadDefecto.setVisible(false);
					this.jInternalFrameOrderByParametroContabilidadDefecto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroContabilidadDefectoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroContabilidadDefectoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametrocontabilidaddefectoReturnGeneral=new ParametroContabilidadDefectoParameterReturnGeneral();
			
			this.parametrocontabilidaddefectoParameterGeneral=new ParametroContabilidadDefectoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametrocontabilidaddefectoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroContabilidadDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado(),this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroContabilidadDefectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado(),this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaDuplicarParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaCopiarParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaVerFormParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaOrdenParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaModificarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaCancelarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoAsientoContable=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdMoneda=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoDocumento=true;
			this.isVisibilidadFK_IdTipoIntervalo=true;
			this.isVisibilidadFK_IdTipoMoneda=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroContabilidadDefecto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroContabilidadDefecto(false);
			
			this.setPermisosUsuarioParametroContabilidadDefecto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() 
				|| (this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado() && this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroContabilidadDefectoClasesRelacionadas();
			}
			
			if(this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroContabilidadDefectoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroContabilidadDefecto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroContabilidadDefecto();
			}
			
			if(!this.isPermisoBusquedaParametroContabilidadDefecto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroContabilidadDefecto,this.isPermisoPaginacionMedioParametroContabilidadDefecto,this.isPermisoPaginacionTodoParametroContabilidadDefecto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroContabilidadDefectoConstantesFunciones.getTiposSeleccionarParametroContabilidadDefecto());
				
				this.tiposColumnasSelect=ParametroContabilidadDefectoConstantesFunciones.getTiposSeleccionarParametroContabilidadDefecto(true);
				
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
			//if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroContabilidadDefecto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroContabilidadDefecto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroContabilidadDefecto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroContabilidadDefecto() ;
			
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
			this.tipomonedaLogic=new TipoMonedaLogic();
			this.monedaLogic=new MonedaLogic();
			this.moduloLogic=new ModuloLogic();
			this.tipointervaloLogic=new TipoIntervaloLogic();
			this.tipomovimientoLogic=new TipoMovimientoLogic();
			this.tipodocumentoLogic=new TipoDocumentoLogic();
			this.estadoasientocontableLogic=new EstadoAsientoContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametrocontabilidaddefectoImplementable= (ParametroContabilidadDefectoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroContabilidadDefectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametrocontabilidaddefectoImplementableHome= (ParametroContabilidadDefectoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroContabilidadDefectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametrocontabilidaddefectos= new ArrayList<ParametroContabilidadDefecto>();
			this.parametrocontabilidaddefectosEliminados= new ArrayList<ParametroContabilidadDefecto>();
						
			this.isEsNuevoParametroContabilidadDefecto=false;
			this.esParaAccionDesdeFormularioParametroContabilidadDefecto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tipomonedasForeignKey=new ArrayList<TipoMoneda>() ;
			this.monedasForeignKey=new ArrayList<Moneda>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.tipointervalosForeignKey=new ArrayList<TipoIntervalo>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>() ;
			this.estadoasientocontablesForeignKey=new ArrayList<EstadoAsientoContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroContabilidadDefecto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroContabilidadDefecto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroContabilidadDefectoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroContabilidadDefecto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroContabilidadDefecto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroContabilidadDefecto();
			}
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroContabilidadDefecto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroContabilidadDefecto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroContabilidadDefecto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroContabilidadDefecto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroContabilidadDefecto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroContabilidadDefecto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroContabilidadDefecto")) {
				iIndex=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jTabbedPaneRelacionesParametroContabilidadDefecto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jTabbedPaneRelacionesParametroContabilidadDefecto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroContabilidadDefecto();	
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
	
	public void cargarCombosForeignKeyParametroContabilidadDefecto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroContabilidadDefecto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroContabilidadDefecto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroContabilidadDefectoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroContabilidadDefecto();
		
		this.cargarCombosFrameForeignKeyParametroContabilidadDefecto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroContabilidadDefecto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroContabilidadDefecto();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoMoneda(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMonedaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMoneda();
				this.cargarCombosFrameTipoMonedasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoMoneda(this.tipomonedasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaModulo(this.modulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIntervalo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoIntervaloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoIntervalo();
				this.cargarCombosFrameTipoIntervalosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoIntervalo(this.tipointervalosForeignKey);

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

	public void cargarCombosForeignKeyTipoDocumento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDocumento(this.tipodocumentosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoAsientoContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoAsientoContable();
				this.cargarCombosFrameEstadoAsientoContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoAsientoContable(this.estadoasientocontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParametroContabilidadDefectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
			
			if(jTableDatosParametroContabilidadDefecto.getRowCount()>=1) {
				jTableDatosParametroContabilidadDefecto.removeRowSelectionInterval(0, jTableDatosParametroContabilidadDefecto.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroContabilidadDefecto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroContabilidadDefecto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroContabilidadDefecto(true);			
			//this.parametrocontabilidaddefecto=new ParametroContabilidadDefecto();
			//this.parametrocontabilidaddefecto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroContabilidadDefecto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroContabilidadDefecto() ;
			
			if(ParametroContabilidadDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroContabilidadDefecto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametrocontabilidaddefecto);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);				
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
			if(this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroContabilidadDefecto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroContabilidadDefectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroContabilidadDefecto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroContabilidadDefecto.getSelectedRows().length;			
			}
			
			parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroContabilidadDefecto--;			
				//ParametroContabilidadDefecto parametrocontabilidaddefectoAux= new ParametroContabilidadDefecto();			
				//parametrocontabilidaddefectoAux.setId(this.iIdNuevoParametroContabilidadDefecto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroContabilidadDefecto parametrocontabilidaddefectoOrigen=new ParametroContabilidadDefecto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroContabilidadDefecto parametrocontabilidaddefectoOrigen : parametrocontabilidaddefectosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametrocontabilidaddefectoOrigen =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocontabilidaddefectoOrigen =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroContabilidadDefecto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametrocontabilidaddefecto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroContabilidadDefecto(parametrocontabilidaddefectoOrigen,this.parametrocontabilidaddefecto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().add(this.parametrocontabilidaddefectoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefectos.add(this.parametrocontabilidaddefectoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
				
				this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroContabilidadDefecto(), this.getIndiceNuevoParametroContabilidadDefecto());
				
				int iLastRow =  this.jTableDatosParametroContabilidadDefecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroContabilidadDefecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroContabilidadDefecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();									
		
			ParametroContabilidadDefecto parametrocontabilidaddefectoOrigen=new ParametroContabilidadDefecto();
			ParametroContabilidadDefecto parametrocontabilidaddefectoDestino=new ParametroContabilidadDefecto();
				
			parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroContabilidadDefecto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametrocontabilidaddefectosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroContabilidadDefecto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoOrigen =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrocontabilidaddefectoOrigen =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocontabilidaddefectoDestino =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrocontabilidaddefectoDestino =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametrocontabilidaddefectoOrigen =parametrocontabilidaddefectosSeleccionados.get(0);
				parametrocontabilidaddefectoDestino =parametrocontabilidaddefectosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroContabilidadDefecto(parametrocontabilidaddefectoOrigen,parametrocontabilidaddefectoDestino,true,false);
				
				parametrocontabilidaddefectoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrocontabilidaddefectoDestino,parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocontabilidaddefectoDestino,parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
				
				//this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroContabilidadDefecto(), this.getIndiceNuevoParametroContabilidadDefecto());
				
				int iLastRow =  this.jTableDatosParametroContabilidadDefecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroContabilidadDefecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroContabilidadDefecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroContabilidadDefecto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroContabilidadDefecto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroContabilidadDefecto.setVisible(!isVisible);
			this.jPanelPaginacionParametroContabilidadDefecto.setVisible(!isVisible);
			this.jPanelAccionesParametroContabilidadDefecto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroContabilidadDefecto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroContabilidadDefecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroContabilidadDefecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroContabilidadDefecto();
			
			this.abrirFrameOrderByParametroContabilidadDefecto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroContabilidadDefecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroContabilidadDefecto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroContabilidadDefecto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.isMaximum()) {
					this.jInternalFrameDetalleFormParametroContabilidadDefecto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroContabilidadDefecto.setSize(this.jInternalFrameDetalleFormParametroContabilidadDefecto.iWidthFormulario,this.jInternalFrameDetalleFormParametroContabilidadDefecto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroContabilidadDefecto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroContabilidadDefecto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroContabilidadDefecto.isMaximum()) {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jContentPaneDetalleParametroContabilidadDefecto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroContabilidadDefecto.jTabbedPaneRelacionesParametroContabilidadDefecto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jContentPaneDetalleParametroContabilidadDefecto.getWidth(),ParametroContabilidadDefectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroContabilidadDefecto.jTabbedPaneRelacionesParametroContabilidadDefecto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jContentPaneDetalleParametroContabilidadDefecto.getWidth(),ParametroContabilidadDefectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroContabilidadDefecto.jTabbedPaneRelacionesParametroContabilidadDefecto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jContentPaneDetalleParametroContabilidadDefecto.getWidth(),ParametroContabilidadDefectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroContabilidadDefecto.setVisible(true);
	        this.jInternalFrameDetalleFormParametroContabilidadDefecto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroContabilidadDefecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroContabilidadDefecto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroContabilidadDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroContabilidadDefecto,false,this);
				} else {
					this.jInternalFrameOrderByParametroContabilidadDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroContabilidadDefecto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroContabilidadDefecto);
				this.jInternalFrameOrderByParametroContabilidadDefecto.setVisible(false);
				this.jInternalFrameOrderByParametroContabilidadDefecto.setSelected(false);
				
				this.jInternalFrameOrderByParametroContabilidadDefecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroContabilidadDefecto"));
				
				this.inicializarActualizarBindingTablaOrderByParametroContabilidadDefecto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroContabilidadDefecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroContabilidadDefecto==null) {
				
				this.jInternalFrameImportacionParametroContabilidadDefecto=new ImportacionJInternalFrame(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroContabilidadDefecto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroContabilidadDefecto);
				this.jInternalFrameImportacionParametroContabilidadDefecto.setVisible(false);
				this.jInternalFrameImportacionParametroContabilidadDefecto.setSelected(false);


				this.jInternalFrameImportacionParametroContabilidadDefecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroContabilidadDefecto"));
				this.jInternalFrameImportacionParametroContabilidadDefecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroContabilidadDefecto"));
				this.jInternalFrameImportacionParametroContabilidadDefecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroContabilidadDefecto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroContabilidadDefecto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto==null) {
				this.jInternalFrameReporteDinamicoParametroContabilidadDefecto=new ReporteDinamicoJInternalFrame(ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroContabilidadDefecto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto);
				this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroContabilidadDefecto"));
				this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroContabilidadDefecto"));
				this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroContabilidadDefecto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroContabilidadDefecto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroContabilidadDefecto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroContabilidadDefecto);
			
	       	this.jInternalFrameDetalleFormParametroContabilidadDefecto.setVisible(false);
	        this.jInternalFrameDetalleFormParametroContabilidadDefecto.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroContabilidadDefecto.dispose();
			//this.jInternalFrameDetalleFormParametroContabilidadDefecto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroContabilidadDefecto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroContabilidadDefecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroContabilidadDefecto.setVisible(true);
	        this.jInternalFrameImportacionParametroContabilidadDefecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroContabilidadDefecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroContabilidadDefecto.setVisible(true);
	        this.jInternalFrameOrderByParametroContabilidadDefecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroContabilidadDefecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroContabilidadDefecto.setVisible(false);
	        this.jInternalFrameOrderByParametroContabilidadDefecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroContabilidadDefecto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroContabilidadDefecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroContabilidadDefecto.setVisible(false);
	        this.jInternalFrameImportacionParametroContabilidadDefecto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroContabilidadDefecto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroContabilidadDefecto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroContabilidadDefecto(true);
			//this.isEsNuevoParametroContabilidadDefecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroContabilidadDefecto(false) ;
			
			if(parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroContabilidadDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroContabilidadDefecto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroContabilidadDefecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroContabilidadDefectoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroContabilidadDefecto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroContabilidadDefecto(true);
			//this.isEsNuevoParametroContabilidadDefecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametrocontabilidaddefecto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroContabilidadDefecto(false) ;
			
			if(ParametroContabilidadDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroContabilidadDefecto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroContabilidadDefecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoMoneda(List<TipoMoneda> tipomonedasForeignKey)throws Exception{
		TableColumn tableColumnTipoMoneda=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA));
		TableCellEditor tableCellEditorTipoMoneda =tableColumnTipoMoneda.getCellEditor();

		TipoMonedaTableCell tipomonedaTableCellFk=(TipoMonedaTableCell)tableCellEditorTipoMoneda;

		if(tipomonedaTableCellFk!=null) {
			tipomonedaTableCellFk.settipomonedasForeignKey(tipomonedasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomonedaTableCellFk.setRowActual(intSelectedRow);
			//tipomonedaTableCellFk.settipomonedasForeignKeyActual(tipomonedasForeignKey);
		//}


		if(tipomonedaTableCellFk!=null) {
			tipomonedaTableCellFk.RecargarTipoMonedasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	public void recargarComboTablaModulo(List<Modulo> modulosForeignKey)throws Exception{
		TableColumn tableColumnModulo=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//moduloTableCellFk.setRowActual(intSelectedRow);
			//moduloTableCellFk.setmodulosForeignKeyActual(modulosForeignKey);
		//}


		if(moduloTableCellFk!=null) {
			moduloTableCellFk.RecargarModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoIntervalo(List<TipoIntervalo> tipointervalosForeignKey)throws Exception{
		TableColumn tableColumnTipoIntervalo=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO));
		TableCellEditor tableCellEditorTipoIntervalo =tableColumnTipoIntervalo.getCellEditor();

		TipoIntervaloTableCell tipointervaloTableCellFk=(TipoIntervaloTableCell)tableCellEditorTipoIntervalo;

		if(tipointervaloTableCellFk!=null) {
			tipointervaloTableCellFk.settipointervalosForeignKey(tipointervalosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipointervaloTableCellFk.setRowActual(intSelectedRow);
			//tipointervaloTableCellFk.settipointervalosForeignKeyActual(tipointervalosForeignKey);
		//}


		if(tipointervaloTableCellFk!=null) {
			tipointervaloTableCellFk.RecargarTipoIntervalosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoDocumento(List<TipoDocumento> tipodocumentosForeignKey)throws Exception{
		TableColumn tableColumnTipoDocumento=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO));
		TableCellEditor tableCellEditorTipoDocumento =tableColumnTipoDocumento.getCellEditor();

		TipoDocumentoTableCell tipodocumentoTableCellFk=(TipoDocumentoTableCell)tableCellEditorTipoDocumento;

		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.settipodocumentosForeignKey(tipodocumentosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodocumentoTableCellFk.setRowActual(intSelectedRow);
			//tipodocumentoTableCellFk.settipodocumentosForeignKeyActual(tipodocumentosForeignKey);
		//}


		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.RecargarTipoDocumentosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoAsientoContable(List<EstadoAsientoContable> estadoasientocontablesForeignKey)throws Exception{
		TableColumn tableColumnEstadoAsientoContable=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE));
		TableCellEditor tableCellEditorEstadoAsientoContable =tableColumnEstadoAsientoContable.getCellEditor();

		EstadoAsientoContableTableCell estadoasientocontableTableCellFk=(EstadoAsientoContableTableCell)tableCellEditorEstadoAsientoContable;

		if(estadoasientocontableTableCellFk!=null) {
			estadoasientocontableTableCellFk.setestadoasientocontablesForeignKey(estadoasientocontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadoasientocontableTableCellFk.setRowActual(intSelectedRow);
			//estadoasientocontableTableCellFk.setestadoasientocontablesForeignKeyActual(estadoasientocontablesForeignKey);
		//}


		if(estadoasientocontableTableCellFk!=null) {
			estadoasientocontableTableCellFk.RecargarEstadoAsientoContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroContabilidadDefecto(false);
			
			//if(!this.isEsNuevoParametroContabilidadDefecto) {								
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				
			}
			
			if(this.permiteMantenimiento(this.parametrocontabilidaddefecto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroContabilidadDefecto=true;
					this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
					this.isEsNuevoParametroContabilidadDefecto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroContabilidadDefecto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroContabilidadDefecto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroContabilidadDefecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroContabilidadDefecto(false);
				
				this.habilitarDeshabilitarControlesParametroContabilidadDefecto(false);
			
												
				
				if(ParametroContabilidadDefectoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroContabilidadDefecto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametrocontabilidaddefecto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroContabilidadDefecto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContabilidadDefecto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				this.parametrocontabilidaddefecto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				this.parametrocontabilidaddefecto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametrocontabilidaddefecto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroContabilidadDefectoModel) this.jTableDatosParametroContabilidadDefecto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroContabilidadDefecto=true;
				this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
				this.isEsNuevoParametroContabilidadDefecto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroContabilidadDefecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroContabilidadDefecto(false);
				
				this.habilitarDeshabilitarControlesParametroContabilidadDefecto(false);
				
				
				
				if(ParametroContabilidadDefectoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroContabilidadDefecto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroContabilidadDefecto.getRowCount()>=1) {
				jTableDatosParametroContabilidadDefecto.removeRowSelectionInterval(0, jTableDatosParametroContabilidadDefecto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroContabilidadDefecto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroContabilidadDefecto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroContabilidadDefecto(false) ;
			
			this.isEsNuevoParametroContabilidadDefecto=false;
			
			if(ParametroContabilidadDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroContabilidadDefecto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroContabilidadDefecto(false);
				
				//SI ES MANUAL
				if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroContabilidadDefecto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroContabilidadDefecto--;			
			//ParametroContabilidadDefecto parametrocontabilidaddefectoAux= new ParametroContabilidadDefecto();			
			//parametrocontabilidaddefectoAux.setId(this.iIdNuevoParametroContabilidadDefecto);
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroContabilidadDefecto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
			
			this.parametrocontabilidaddefecto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().add(this.parametrocontabilidaddefectoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametrocontabilidaddefectos.add(this.parametrocontabilidaddefectoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
			
			this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroContabilidadDefecto(), this.getIndiceNuevoParametroContabilidadDefecto());
			
			int iLastRow =  this.jTableDatosParametroContabilidadDefecto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroContabilidadDefecto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroContabilidadDefecto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroContabilidadDefecto(false);
			
			//SI ES MANUAL
			if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroContabilidadDefecto();
			}
			
			//this.abrirFrameTreeParametroContabilidadDefecto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro Contabilidad DefectoS ?", "MANTENIMIENTO DE Parametro Contabilidad Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroContabilidadDefecto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroContabilidadDefecto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametrocontabilidaddefectoReturnGeneral=parametrocontabilidaddefectoLogic.procesarImportacionParametroContabilidadDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametrocontabilidaddefectoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroContabilidadDefectoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroContabilidadDefecto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroContabilidadDefecto.setFileImportacion(this.jInternalFrameImportacionParametroContabilidadDefecto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroContabilidadDefecto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroContabilidadDefecto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroContabilidadDefecto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroContabilidadDefecto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();		

		parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroContabilidadDefectoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroContabilidadDefectoBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroContabilidadDefectos("Todos",parametrocontabilidaddefectosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Contabilidad Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMoneda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMoneda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMoneda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMoneda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Moneda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Moneda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Moneda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Moneda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoIntervalo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoIntervalo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoIntervalo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoIntervalo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoAsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoAsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoAsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoAsientoContable_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA:
					sNombreCampoCategoria="id_tipo_moneda";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA:
					sNombreCampoCategoria="id_moneda";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO:
					sNombreCampoCategoria="id_tipo_intervalo";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoria="id_tipo_movimiento";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					sNombreCampoCategoria="id_tipo_documento";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE:
					sNombreCampoCategoria="id_estado_asiento_contable";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA:
					sNombreCampoCategoriaValor="id_tipo_moneda";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA:
					sNombreCampoCategoriaValor="id_moneda";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO:
					sNombreCampoCategoriaValor="id_tipo_intervalo";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="id_tipo_movimiento";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					sNombreCampoCategoriaValor="id_tipo_documento";
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE:
					sNombreCampoCategoriaValor="id_estado_asiento_contable";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Moneda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_moneda");
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Moneda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_moneda");
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Intervalo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_intervalo");
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_movimiento");
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_documento");
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Asiento C.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_asiento_contable");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();		
		
		parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontabilidaddefecto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroContabilidadDefectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontabilidaddefecto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontabilidaddefecto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA);
					iRow++;

					for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontabilidaddefecto.gettipomoneda_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA);
					iRow++;

					for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontabilidaddefecto.getmoneda_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontabilidaddefecto.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO);
					iRow++;

					for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontabilidaddefecto.gettipointervalo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontabilidaddefecto.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO);
					iRow++;

					for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontabilidaddefecto.gettipodocumento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE);
					iRow++;

					for(ParametroContabilidadDefecto parametrocontabilidaddefecto:parametrocontabilidaddefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocontabilidaddefecto.getestadoasientocontable_descripcion());
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
			//	this.getFilaCabeceraExportarExcelParametroContabilidadDefecto(row);				
			//	iRow++;
			//}				
			
			//for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroContabilidadDefecto(parametrocontabilidaddefectoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Contabilidad Defecto",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroContabilidadDefecto(false);
			
			//SI ES MANUAL
			if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroContabilidadDefecto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroContabilidadDefecto(false);
			
			//SI ES MANUAL
			if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroContabilidadDefecto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroContabilidadDefecto(false);
			
			//SI ES MANUAL
			if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroContabilidadDefecto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroContabilidadDefecto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroContabilidadDefecto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroContabilidadDefecto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroContabilidadDefecto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroContabilidadDefecto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroContabilidadDefecto.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroContabilidadDefecto.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroContabilidadDefecto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroContabilidadDefecto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroContabilidadDefecto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroContabilidadDefecto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroContabilidadDefecto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroContabilidadDefecto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroContabilidadDefecto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroContabilidadDefecto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroContabilidadDefecto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroContabilidadDefecto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroContabilidadDefecto();
		
		this.inicializarActualizarBindingBotonesManualParametroContabilidadDefecto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroContabilidadDefecto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroContabilidadDefecto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroContabilidadDefecto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroContabilidadDefecto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroContabilidadDefecto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroContabilidadDefecto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jCheckBoxPostAccionNuevoParametroContabilidadDefecto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jCheckBoxPostAccionSinCerrarParametroContabilidadDefecto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jCheckBoxPostAccionSinMensajeParametroContabilidadDefecto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroContabilidadDefecto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroContabilidadDefecto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jCheckBoxPostAccionNuevoParametroContabilidadDefecto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jCheckBoxPostAccionSinCerrarParametroContabilidadDefecto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jCheckBoxPostAccionSinMensajeParametroContabilidadDefecto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroContabilidadDefecto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroContabilidadDefecto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroContabilidadDefecto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroContabilidadDefecto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroContabilidadDefecto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroContabilidadDefecto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroContabilidadDefecto(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroContabilidadDefecto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroContabilidadDefecto() throws Exception {
		try	{
			if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroContabilidadDefecto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroContabilidadDefecto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroContabilidadDefecto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroContabilidadDefecto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroContabilidadDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroContabilidadDefecto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroContabilidadDefecto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroContabilidadDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroContabilidadDefecto.addItem(reporte);
			}
			
			
			if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroContabilidadDefecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroContabilidadDefecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroContabilidadDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroContabilidadDefecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroContabilidadDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroContabilidadDefecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroContabilidadDefecto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroContabilidadDefecto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto!=null) {
				this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto!=null) {
				this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroContabilidadDefecto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.getSelectedItem()!=null){this.id_estado_asiento_contableFK_IdEstadoAsientoContable=((EstadoAsientoContable)this.jComboBoxid_estado_asiento_contableFK_IdEstadoAsientoContableParametroContabilidadDefecto.getSelectedItem()).getId();}
		if(this.jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.getSelectedItem()!=null){this.id_moduloFK_IdModulo=((Modulo)this.jComboBoxid_moduloFK_IdModuloParametroContabilidadDefecto.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.getSelectedItem()!=null){this.id_tipo_documentoFK_IdTipoDocumento=((TipoDocumento)this.jComboBoxid_tipo_documentoFK_IdTipoDocumentoParametroContabilidadDefecto.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.getSelectedItem()!=null){this.id_tipo_intervaloFK_IdTipoIntervalo=((TipoIntervalo)this.jComboBoxid_tipo_intervaloFK_IdTipoIntervaloParametroContabilidadDefecto.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.getSelectedItem()!=null){this.id_tipo_monedaFK_IdTipoMoneda=((TipoMoneda)this.jComboBoxid_tipo_monedaFK_IdTipoMonedaParametroContabilidadDefecto.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.getSelectedItem()!=null){this.id_tipo_movimientoFK_IdTipoMovimiento=((TipoMovimiento)this.jComboBoxid_tipo_movimientoFK_IdTipoMovimientoParametroContabilidadDefecto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroContabilidadDefecto(Boolean esInicializar) throws Exception {				
		if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroContabilidadDefecto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroContabilidadDefecto() throws Exception {
		this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroContabilidadDefecto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroContabilidadDefectoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefectoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroContabilidadDefecto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametrocontabilidaddefectos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroContabilidadDefecto.setModel(new ParametroContabilidadDefectoModel(this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroContabilidadDefecto.setModel(new ParametroContabilidadDefectoModel(this.parametrocontabilidaddefectos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroContabilidadDefecto!=null && this.jInternalFrameOrderByParametroContabilidadDefecto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroContabilidadDefecto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO,parametrocontabilidaddefectoConstantesFunciones.resaltarSeleccionarParametroContabilidadDefecto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroContabilidadDefectoConstantesFunciones.SCLASSWEBTITULO,parametrocontabilidaddefectoConstantesFunciones.resaltarSeleccionarParametroContabilidadDefecto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_ID));

		if(this.parametrocontabilidaddefectoConstantesFunciones.mostraridParametroContabilidadDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContabilidadDefectoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrocontabilidaddefectoConstantesFunciones.resaltaridParametroContabilidadDefecto,this.parametrocontabilidaddefectoConstantesFunciones.activaridParametroContabilidadDefecto,this,true,"idParametroContabilidadDefecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrocontabilidaddefectoConstantesFunciones.resaltaridParametroContabilidadDefecto,this.parametrocontabilidaddefectoConstantesFunciones.activaridParametroContabilidadDefecto,this,true,"idParametroContabilidadDefecto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_empresaParametroContabilidadDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_empresaParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_empresaParametroContabilidadDefecto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_empresaParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_empresaParametroContabilidadDefecto,false,"id_empresaParametroContabilidadDefecto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_sucursalParametroContabilidadDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_sucursalParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_sucursalParametroContabilidadDefecto));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_sucursalParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_sucursalParametroContabilidadDefecto,false,"id_sucursalParametroContabilidadDefecto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA));

		if(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_monedaParametroContabilidadDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMonedaTableCell(this.tipomonedasForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_monedaParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_monedaParametroContabilidadDefecto));
			tableColumn.setCellEditor(new TipoMonedaTableCell(this.tipomonedasForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_monedaParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_monedaParametroContabilidadDefecto,true,"id_tipo_monedaParametroContabilidadDefecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA));

		if(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_monedaParametroContabilidadDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MonedaTableCell(this.monedasForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_monedaParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_monedaParametroContabilidadDefecto));
			tableColumn.setCellEditor(new MonedaTableCell(this.monedasForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_monedaParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_monedaParametroContabilidadDefecto,false,"id_monedaParametroContabilidadDefecto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO));

		if(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_moduloParametroContabilidadDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_moduloParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_moduloParametroContabilidadDefecto));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_moduloParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_moduloParametroContabilidadDefecto,true,"id_moduloParametroContabilidadDefecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO));

		if(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_intervaloParametroContabilidadDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoIntervaloTableCell(this.tipointervalosForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_intervaloParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_intervaloParametroContabilidadDefecto));
			tableColumn.setCellEditor(new TipoIntervaloTableCell(this.tipointervalosForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_intervaloParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_intervaloParametroContabilidadDefecto,true,"id_tipo_intervaloParametroContabilidadDefecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));

		if(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_movimientoParametroContabilidadDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_movimientoParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_movimientoParametroContabilidadDefecto));
			tableColumn.setCellEditor(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_movimientoParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_movimientoParametroContabilidadDefecto,true,"id_tipo_movimientoParametroContabilidadDefecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO));

		if(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_documentoParametroContabilidadDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDocumentoTableCell(this.tipodocumentosForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_documentoParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_documentoParametroContabilidadDefecto));
			tableColumn.setCellEditor(new TipoDocumentoTableCell(this.tipodocumentosForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_documentoParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_documentoParametroContabilidadDefecto,true,"id_tipo_documentoParametroContabilidadDefecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE));

		if(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_estado_asiento_contableParametroContabilidadDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoAsientoContableTableCell(this.estadoasientocontablesForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_estado_asiento_contableParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_estado_asiento_contableParametroContabilidadDefecto));
			tableColumn.setCellEditor(new EstadoAsientoContableTableCell(this.estadoasientocontablesForeignKey,this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_estado_asiento_contableParametroContabilidadDefecto,this,this.parametrocontabilidaddefectoConstantesFunciones.activarid_estado_asiento_contableParametroContabilidadDefecto,true,"id_estado_asiento_contableParametroContabilidadDefecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroContabilidadDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroContabilidadDefecto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroContabilidadDefecto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroContabilidadDefecto.addColumn(tableColumn);
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
			
			this.jTableDatosParametroContabilidadDefecto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroContabilidadDefecto.moveColumn(this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroContabilidadDefecto.moveColumn(this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroContabilidadDefecto.moveColumn(this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroContabilidadDefecto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroContabilidadDefecto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroContabilidadDefecto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroContabilidadDefecto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroContabilidadDefecto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroContabilidadDefecto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametrocontabilidaddefectos.size()-1;
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
		//this.jTableDatosParametroContabilidadDefecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroContabilidadDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroContabilidadDefecto();
			
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
				
				//this.isEsNuevoParametroContabilidadDefecto=false;
					
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
				if(this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroContabilidadDefecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroContabilidadDefecto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametrocontabilidaddefecto.getsType().equals("DUPLICADO")
				   || this.parametrocontabilidaddefecto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroContabilidadDefecto=true;
				
				} else {
					this.isEsNuevoParametroContabilidadDefecto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
					if(this.parametrocontabilidaddefecto.getId()>=0 && !this.parametrocontabilidaddefecto.getIsNew()) {						
						this.isEsNuevoParametroContabilidadDefecto=false;
						
					} else {
						this.isEsNuevoParametroContabilidadDefecto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroContabilidadDefecto(esRelaciones);						
				
				this.seleccionarParametroContabilidadDefecto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametrocontabilidaddefecto.getId()<0) {
					this.isEsNuevoParametroContabilidadDefecto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroContabilidadDefecto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroContabilidadDefecto(evt,rowIndex);
				}	
				
				if(this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroContabilidadDefecto: " + this.dDif); 
					}
				}								
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroContabilidadDefecto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametrocontabilidaddefecto)) {
					if(this.parametrocontabilidaddefecto.getId()>0) {
						this.parametrocontabilidaddefecto.setIsDeleted(true);
						
						this.parametrocontabilidaddefectosEliminados.add(this.parametrocontabilidaddefecto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().remove(this.parametrocontabilidaddefecto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefectos.remove(this.parametrocontabilidaddefecto);				
					}
					
					
					((ParametroContabilidadDefectoModel) this.jTableDatosParametroContabilidadDefecto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroContabilidadDefecto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroContabilidadDefecto) {
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroContabilidadDefecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroContabilidadDefecto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametrocontabilidaddefectoConstantesFunciones.cargarid_empresaParametroContabilidadDefecto || this.parametrocontabilidaddefectoConstantesFunciones.event_dependid_empresaParametroContabilidadDefecto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametrocontabilidaddefecto.getid_empresa());
									//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametrocontabilidaddefecto.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametrocontabilidaddefecto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametrocontabilidaddefecto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.parametrocontabilidaddefectoConstantesFunciones.cargarid_sucursalParametroContabilidadDefecto || this.parametrocontabilidaddefectoConstantesFunciones.event_dependid_sucursalParametroContabilidadDefecto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.parametrocontabilidaddefecto.getid_sucursal());
									//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(parametrocontabilidaddefecto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(parametrocontabilidaddefecto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.parametrocontabilidaddefecto.getid_sucursal(),false,"Formulario");

					//TipoMoneda
					if(!this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_monedaParametroContabilidadDefecto || this.parametrocontabilidaddefectoConstantesFunciones.event_dependid_tipo_monedaParametroContabilidadDefecto) {
						//this.cargarCombosTipoMonedasForeignKeyLista(" where id="+this.parametrocontabilidaddefecto.getid_tipo_moneda());
									//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
						this.tipomonedasForeignKey=new ArrayList<TipoMoneda>();

						if(parametrocontabilidaddefecto.getTipoMoneda()!=null) {
							this.tipomonedasForeignKey.add(parametrocontabilidaddefecto.getTipoMoneda());
						}

						this.addItemDefectoCombosForeignKeyTipoMoneda();
						this.cargarCombosFrameTipoMonedasForeignKey("Todos");
					}
					this.setActualTipoMonedaForeignKey(this.parametrocontabilidaddefecto.getid_tipo_moneda(),false,"Formulario");

					//Moneda
					if(!this.parametrocontabilidaddefectoConstantesFunciones.cargarid_monedaParametroContabilidadDefecto || this.parametrocontabilidaddefectoConstantesFunciones.event_dependid_monedaParametroContabilidadDefecto) {
						//this.cargarCombosMonedasForeignKeyLista(" where id="+this.parametrocontabilidaddefecto.getid_moneda());
									//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
						this.monedasForeignKey=new ArrayList<Moneda>();

						if(parametrocontabilidaddefecto.getMoneda()!=null) {
							this.monedasForeignKey.add(parametrocontabilidaddefecto.getMoneda());
						}

						this.addItemDefectoCombosForeignKeyMoneda();
						this.cargarCombosFrameMonedasForeignKey("Todos");
					}
					this.setActualMonedaForeignKey(this.parametrocontabilidaddefecto.getid_moneda(),false,"Formulario");

					//Modulo
					if(!this.parametrocontabilidaddefectoConstantesFunciones.cargarid_moduloParametroContabilidadDefecto || this.parametrocontabilidaddefectoConstantesFunciones.event_dependid_moduloParametroContabilidadDefecto) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.parametrocontabilidaddefecto.getid_modulo());
									//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(parametrocontabilidaddefecto.getModulo()!=null) {
							this.modulosForeignKey.add(parametrocontabilidaddefecto.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.parametrocontabilidaddefecto.getid_modulo(),false,"Formulario");

					//TipoIntervalo
					if(!this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_intervaloParametroContabilidadDefecto || this.parametrocontabilidaddefectoConstantesFunciones.event_dependid_tipo_intervaloParametroContabilidadDefecto) {
						//this.cargarCombosTipoIntervalosForeignKeyLista(" where id="+this.parametrocontabilidaddefecto.getid_tipo_intervalo());
									//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
						this.tipointervalosForeignKey=new ArrayList<TipoIntervalo>();

						if(parametrocontabilidaddefecto.getTipoIntervalo()!=null) {
							this.tipointervalosForeignKey.add(parametrocontabilidaddefecto.getTipoIntervalo());
						}

						this.addItemDefectoCombosForeignKeyTipoIntervalo();
						this.cargarCombosFrameTipoIntervalosForeignKey("Todos");
					}
					this.setActualTipoIntervaloForeignKey(this.parametrocontabilidaddefecto.getid_tipo_intervalo(),false,"Formulario");

					//TipoMovimiento
					if(!this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_movimientoParametroContabilidadDefecto || this.parametrocontabilidaddefectoConstantesFunciones.event_dependid_tipo_movimientoParametroContabilidadDefecto) {
						//this.cargarCombosTipoMovimientosForeignKeyLista(" where id="+this.parametrocontabilidaddefecto.getid_tipo_movimiento());
									//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
						this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

						if(parametrocontabilidaddefecto.getTipoMovimiento()!=null) {
							this.tipomovimientosForeignKey.add(parametrocontabilidaddefecto.getTipoMovimiento());
						}

						this.addItemDefectoCombosForeignKeyTipoMovimiento();
						this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
					}
					this.setActualTipoMovimientoForeignKey(this.parametrocontabilidaddefecto.getid_tipo_movimiento(),false,"Formulario");

					//TipoDocumento
					if(!this.parametrocontabilidaddefectoConstantesFunciones.cargarid_tipo_documentoParametroContabilidadDefecto || this.parametrocontabilidaddefectoConstantesFunciones.event_dependid_tipo_documentoParametroContabilidadDefecto) {
						//this.cargarCombosTipoDocumentosForeignKeyLista(" where id="+this.parametrocontabilidaddefecto.getid_tipo_documento());
									//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
						this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>();

						if(parametrocontabilidaddefecto.getTipoDocumento()!=null) {
							this.tipodocumentosForeignKey.add(parametrocontabilidaddefecto.getTipoDocumento());
						}

						this.addItemDefectoCombosForeignKeyTipoDocumento();
						this.cargarCombosFrameTipoDocumentosForeignKey("Todos");
					}
					this.setActualTipoDocumentoForeignKey(this.parametrocontabilidaddefecto.getid_tipo_documento(),false,"Formulario");

					//EstadoAsientoContable
					if(!this.parametrocontabilidaddefectoConstantesFunciones.cargarid_estado_asiento_contableParametroContabilidadDefecto || this.parametrocontabilidaddefectoConstantesFunciones.event_dependid_estado_asiento_contableParametroContabilidadDefecto) {
						//this.cargarCombosEstadoAsientoContablesForeignKeyLista(" where id="+this.parametrocontabilidaddefecto.getid_estado_asiento_contable());
									//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
						this.estadoasientocontablesForeignKey=new ArrayList<EstadoAsientoContable>();

						if(parametrocontabilidaddefecto.getEstadoAsientoContable()!=null) {
							this.estadoasientocontablesForeignKey.add(parametrocontabilidaddefecto.getEstadoAsientoContable());
						}

						this.addItemDefectoCombosForeignKeyEstadoAsientoContable();
						this.cargarCombosFrameEstadoAsientoContablesForeignKey("Todos");
					}
					this.setActualEstadoAsientoContableForeignKey(this.parametrocontabilidaddefecto.getid_estado_asiento_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroContabilidadDefecto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroContabilidadDefecto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroContabilidadDefecto(parametrocontabilidaddefecto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroContabilidadDefecto(parametrocontabilidaddefecto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroContabilidadDefecto(parametrocontabilidaddefecto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroContabilidadDefecto(parametrocontabilidaddefecto);
	}
	
	public void setVariablesObjetoActualToFormularioParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelidParametroContabilidadDefecto.setText(parametrocontabilidaddefecto.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroContabilidadDefecto parametrocontabilidaddefectoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametrocontabilidaddefectoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroContabilidadDefecto parametrocontabilidaddefectoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametrocontabilidaddefectoLocal=this.parametrocontabilidaddefecto;
			} else {
				parametrocontabilidaddefectoLocal=this.parametrocontabilidaddefectoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametrocontabilidaddefectoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroContabilidadDefecto(parametrocontabilidaddefectoLocal,true);
					
					if(parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametrocontabilidaddefectoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametrocontabilidaddefectoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(parametrocontabilidaddefecto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(parametrocontabilidaddefecto);
	}
	
	public void setVariablesFormularioToObjetoActualParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(parametrocontabilidaddefecto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelidParametroContabilidadDefecto.getText()==null || this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelidParametroContabilidadDefecto.getText()=="" || this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelidParametroContabilidadDefecto.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelidParametroContabilidadDefecto.setText("0");
			}

			if(conColumnasBase) {parametrocontabilidaddefecto.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelidParametroContabilidadDefecto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroContabilidadDefectoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelIdParametroContabilidadDefecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefectoBean,ParametroContabilidadDefecto parametrocontabilidaddefecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parametrocontabilidaddefectoBean.getid_tipo_moneda()!=null && !parametrocontabilidaddefectoBean.getid_tipo_moneda().equals(-1L))) {parametrocontabilidaddefecto.setid_tipo_moneda(parametrocontabilidaddefectoBean.getid_tipo_moneda());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoBean.getid_modulo()!=null && !parametrocontabilidaddefectoBean.getid_modulo().equals(-1L))) {parametrocontabilidaddefecto.setid_modulo(parametrocontabilidaddefectoBean.getid_modulo());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoBean.getid_tipo_intervalo()!=null && !parametrocontabilidaddefectoBean.getid_tipo_intervalo().equals(-1L))) {parametrocontabilidaddefecto.setid_tipo_intervalo(parametrocontabilidaddefectoBean.getid_tipo_intervalo());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoBean.getid_tipo_movimiento()!=null && !parametrocontabilidaddefectoBean.getid_tipo_movimiento().equals(-1L))) {parametrocontabilidaddefecto.setid_tipo_movimiento(parametrocontabilidaddefectoBean.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoBean.getid_tipo_documento()!=null && !parametrocontabilidaddefectoBean.getid_tipo_documento().equals(-1L))) {parametrocontabilidaddefecto.setid_tipo_documento(parametrocontabilidaddefectoBean.getid_tipo_documento());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoBean.getid_estado_asiento_contable()!=null && !parametrocontabilidaddefectoBean.getid_estado_asiento_contable().equals(-1L))) {parametrocontabilidaddefecto.setid_estado_asiento_contable(parametrocontabilidaddefectoBean.getid_estado_asiento_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefectoOrigen,ParametroContabilidadDefecto parametrocontabilidaddefecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrocontabilidaddefectoOrigen.getId()!=null && !parametrocontabilidaddefectoOrigen.getId().equals(0L))) {parametrocontabilidaddefecto.setId(parametrocontabilidaddefectoOrigen.getId());}}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoOrigen.getid_tipo_moneda()!=null && !parametrocontabilidaddefectoOrigen.getid_tipo_moneda().equals(-1L))) {parametrocontabilidaddefecto.setid_tipo_moneda(parametrocontabilidaddefectoOrigen.getid_tipo_moneda());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoOrigen.getid_modulo()!=null && !parametrocontabilidaddefectoOrigen.getid_modulo().equals(-1L))) {parametrocontabilidaddefecto.setid_modulo(parametrocontabilidaddefectoOrigen.getid_modulo());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoOrigen.getid_tipo_intervalo()!=null && !parametrocontabilidaddefectoOrigen.getid_tipo_intervalo().equals(-1L))) {parametrocontabilidaddefecto.setid_tipo_intervalo(parametrocontabilidaddefectoOrigen.getid_tipo_intervalo());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoOrigen.getid_tipo_movimiento()!=null && !parametrocontabilidaddefectoOrigen.getid_tipo_movimiento().equals(-1L))) {parametrocontabilidaddefecto.setid_tipo_movimiento(parametrocontabilidaddefectoOrigen.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoOrigen.getid_tipo_documento()!=null && !parametrocontabilidaddefectoOrigen.getid_tipo_documento().equals(-1L))) {parametrocontabilidaddefecto.setid_tipo_documento(parametrocontabilidaddefectoOrigen.getid_tipo_documento());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoOrigen.getid_estado_asiento_contable()!=null && !parametrocontabilidaddefectoOrigen.getid_estado_asiento_contable().equals(-1L))) {parametrocontabilidaddefecto.setid_estado_asiento_contable(parametrocontabilidaddefectoOrigen.getid_estado_asiento_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelidParametroContabilidadDefecto.setText(parametrocontabilidaddefecto.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroContabilidadDefecto(ParametroContabilidadDefectoBean parametrocontabilidaddefectoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelidParametroContabilidadDefecto.setText(parametrocontabilidaddefectoBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroContabilidadDefecto(ParametroContabilidadDefectoParameterReturnGeneral parametrocontabilidaddefectoReturnGeneral,ParametroContabilidadDefectoBean parametrocontabilidaddefectoBean,Boolean conDefault) throws Exception { 
		try {
			ParametroContabilidadDefecto parametrocontabilidaddefectoLocal=new ParametroContabilidadDefecto();
			
			parametrocontabilidaddefectoLocal=parametrocontabilidaddefectoReturnGeneral.getParametroContabilidadDefecto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrocontabilidaddefectoLocal.getId()!=null && !parametrocontabilidaddefectoLocal.getId().equals(0L))) {parametrocontabilidaddefectoBean.setId(parametrocontabilidaddefectoLocal.getId());}}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoLocal.getid_tipo_moneda()!=null && !parametrocontabilidaddefectoLocal.getid_tipo_moneda().equals(-1L))) {parametrocontabilidaddefectoBean.setid_tipo_moneda(parametrocontabilidaddefectoLocal.getid_tipo_moneda());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoLocal.getid_modulo()!=null && !parametrocontabilidaddefectoLocal.getid_modulo().equals(-1L))) {parametrocontabilidaddefectoBean.setid_modulo(parametrocontabilidaddefectoLocal.getid_modulo());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoLocal.getid_tipo_intervalo()!=null && !parametrocontabilidaddefectoLocal.getid_tipo_intervalo().equals(-1L))) {parametrocontabilidaddefectoBean.setid_tipo_intervalo(parametrocontabilidaddefectoLocal.getid_tipo_intervalo());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoLocal.getid_tipo_movimiento()!=null && !parametrocontabilidaddefectoLocal.getid_tipo_movimiento().equals(-1L))) {parametrocontabilidaddefectoBean.setid_tipo_movimiento(parametrocontabilidaddefectoLocal.getid_tipo_movimiento());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoLocal.getid_tipo_documento()!=null && !parametrocontabilidaddefectoLocal.getid_tipo_documento().equals(-1L))) {parametrocontabilidaddefectoBean.setid_tipo_documento(parametrocontabilidaddefectoLocal.getid_tipo_documento());}
			if(conDefault || (!conDefault && parametrocontabilidaddefectoLocal.getid_estado_asiento_contable()!=null && !parametrocontabilidaddefectoLocal.getid_estado_asiento_contable().equals(-1L))) {parametrocontabilidaddefectoBean.setid_estado_asiento_contable(parametrocontabilidaddefectoLocal.getid_estado_asiento_contable());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroContabilidadDefectoGenerico(Long idParametroContabilidadDefectoSeleccionado,JComboBox jComboBoxParametroContabilidadDefecto,List<ParametroContabilidadDefecto> parametrocontabilidaddefectosLocal)throws Exception {
		try {
			ParametroContabilidadDefecto  parametrocontabilidaddefectoTemp=null;

			for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectosLocal) {
				if(parametrocontabilidaddefectoAux.getId()!=null && parametrocontabilidaddefectoAux.getId().equals(idParametroContabilidadDefectoSeleccionado)) {
					parametrocontabilidaddefectoTemp=parametrocontabilidaddefectoAux;
					break;
				}
			}

			jComboBoxParametroContabilidadDefecto.setSelectedItem(parametrocontabilidaddefectoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroContabilidadDefectoGenerico(JComboBox jComboBoxParametroContabilidadDefecto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroContabilidadDefecto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroContabilidadDefecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroContabilidadDefecto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroContabilidadDefecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroContabilidadDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroContabilidadDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrocontabilidaddefecto=(ParametroContabilidadDefecto) parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrocontabilidaddefecto =(ParametroContabilidadDefecto) parametrocontabilidaddefectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametrocontabilidaddefecto.getIsNew() && !parametrocontabilidaddefecto.getIsChanged() && !parametrocontabilidaddefecto.getIsDeleted()) {
				sDescripcion=parametrocontabilidaddefecto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontabilidaddefecto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!parametrocontabilidaddefecto.getIsNew() && !parametrocontabilidaddefecto.getIsChanged() && !parametrocontabilidaddefecto.getIsDeleted()) {
				sDescripcion=parametrocontabilidaddefecto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontabilidaddefecto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TipoMoneda")) {
			//sDescripcion=this.getActualTipoMonedaForeignKeyDescripcion((Long)value);
			if(!parametrocontabilidaddefecto.getIsNew() && !parametrocontabilidaddefecto.getIsChanged() && !parametrocontabilidaddefecto.getIsDeleted()) {
				sDescripcion=parametrocontabilidaddefecto.gettipomoneda_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMonedaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontabilidaddefecto.gettipomoneda_descripcion();
			}
		}

		if(sTipo.equals("Moneda")) {
			//sDescripcion=this.getActualMonedaForeignKeyDescripcion((Long)value);
			if(!parametrocontabilidaddefecto.getIsNew() && !parametrocontabilidaddefecto.getIsChanged() && !parametrocontabilidaddefecto.getIsDeleted()) {
				sDescripcion=parametrocontabilidaddefecto.getmoneda_descripcion();
			} else {
				//sDescripcion=this.getActualMonedaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontabilidaddefecto.getmoneda_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!parametrocontabilidaddefecto.getIsNew() && !parametrocontabilidaddefecto.getIsChanged() && !parametrocontabilidaddefecto.getIsDeleted()) {
				sDescripcion=parametrocontabilidaddefecto.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontabilidaddefecto.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoIntervalo")) {
			//sDescripcion=this.getActualTipoIntervaloForeignKeyDescripcion((Long)value);
			if(!parametrocontabilidaddefecto.getIsNew() && !parametrocontabilidaddefecto.getIsChanged() && !parametrocontabilidaddefecto.getIsDeleted()) {
				sDescripcion=parametrocontabilidaddefecto.gettipointervalo_descripcion();
			} else {
				//sDescripcion=this.getActualTipoIntervaloForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontabilidaddefecto.gettipointervalo_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!parametrocontabilidaddefecto.getIsNew() && !parametrocontabilidaddefecto.getIsChanged() && !parametrocontabilidaddefecto.getIsDeleted()) {
				sDescripcion=parametrocontabilidaddefecto.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontabilidaddefecto.gettipomovimiento_descripcion();
			}
		}

		if(sTipo.equals("TipoDocumento")) {
			//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
			if(!parametrocontabilidaddefecto.getIsNew() && !parametrocontabilidaddefecto.getIsChanged() && !parametrocontabilidaddefecto.getIsDeleted()) {
				sDescripcion=parametrocontabilidaddefecto.gettipodocumento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontabilidaddefecto.gettipodocumento_descripcion();
			}
		}

		if(sTipo.equals("EstadoAsientoContable")) {
			//sDescripcion=this.getActualEstadoAsientoContableForeignKeyDescripcion((Long)value);
			if(!parametrocontabilidaddefecto.getIsNew() && !parametrocontabilidaddefecto.getIsChanged() && !parametrocontabilidaddefecto.getIsDeleted()) {
				sDescripcion=parametrocontabilidaddefecto.getestadoasientocontable_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoAsientoContableForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocontabilidaddefecto.getestadoasientocontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroContabilidadDefecto parametrocontabilidaddefectoRow=new ParametroContabilidadDefecto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrocontabilidaddefectoRow=(ParametroContabilidadDefecto) parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrocontabilidaddefectoRow=(ParametroContabilidadDefecto) parametrocontabilidaddefectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("EstadoAsientoContable")) {
			color=FuncionesSwing.getColorGeneral(parametrocontabilidaddefectoRow.getEstadoAsientoContable().getid_color_general());
		}

		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroContabilidadDefecto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroContabilidadDefecto && this.isPermisoNuevoParametroContabilidadDefecto));			
			this.jButtonDuplicarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaDuplicarParametroContabilidadDefecto && this.isPermisoDuplicarParametroContabilidadDefecto));			
			this.jButtonCopiarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaCopiarParametroContabilidadDefecto && this.isPermisoCopiarParametroContabilidadDefecto));
			this.jButtonVerFormParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaVerFormParametroContabilidadDefecto && this.isPermisoVerFormParametroContabilidadDefecto));
			
			this.jButtonAbrirOrderByParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroContabilidadDefecto && this.isPermisoOrdenParametroContabilidadDefecto));			
			
			this.jButtonNuevoRelacionesParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto && this.isPermisoNuevoParametroContabilidadDefecto));			
			this.jButtonNuevoGuardarCambiosParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroContabilidadDefecto && this.isPermisoNuevoParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto));
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonModificarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaModificarParametroContabilidadDefecto && this.isPermisoActualizarParametroContabilidadDefecto));	
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonActualizarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaActualizarParametroContabilidadDefecto && this.isPermisoActualizarParametroContabilidadDefecto));	
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonEliminarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaEliminarParametroContabilidadDefecto && this.isPermisoEliminarParametroContabilidadDefecto));
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonCancelarParametroContabilidadDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroContabilidadDefecto);							
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroContabilidadDefecto && this.isPermisoNuevoParametroContabilidadDefecto));						
			this.jButtonDuplicarToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaDuplicarParametroContabilidadDefecto && this.isPermisoDuplicarParametroContabilidadDefecto));						
			this.jButtonCopiarToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaCopiarParametroContabilidadDefecto && this.isPermisoCopiarParametroContabilidadDefecto));			
			this.jButtonVerFormToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaVerFormParametroContabilidadDefecto && this.isPermisoVerFormParametroContabilidadDefecto));			
			this.jButtonAbrirOrderByToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroContabilidadDefecto && this.isPermisoOrdenParametroContabilidadDefecto));
			this.jButtonNuevoRelacionesToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto && this.isPermisoNuevoParametroContabilidadDefecto));			
			this.jButtonNuevoGuardarCambiosToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroContabilidadDefecto && this.isPermisoNuevoParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto));			
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonModificarToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaModificarParametroContabilidadDefecto && this.isPermisoActualizarParametroContabilidadDefecto));	
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonActualizarToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaActualizarParametroContabilidadDefecto  && this.isPermisoActualizarParametroContabilidadDefecto));	
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonEliminarToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaEliminarParametroContabilidadDefecto && this.isPermisoEliminarParametroContabilidadDefecto));
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonCancelarToolBarParametroContabilidadDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroContabilidadDefecto);				
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroContabilidadDefecto && this.isPermisoNuevoParametroContabilidadDefecto));			
			this.jMenuItemDuplicarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaDuplicarParametroContabilidadDefecto && this.isPermisoDuplicarParametroContabilidadDefecto));			
			this.jMenuItemCopiarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaCopiarParametroContabilidadDefecto && this.isPermisoCopiarParametroContabilidadDefecto));			
			this.jMenuItemVerFormParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaVerFormParametroContabilidadDefecto && this.isPermisoVerFormParametroContabilidadDefecto));			
			this.jMenuItemAbrirOrderByParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroContabilidadDefecto && this.isPermisoOrdenParametroContabilidadDefecto));			
			//this.jMenuItemMostrarOcultarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroContabilidadDefecto && this.isPermisoOrdenParametroContabilidadDefecto));
			this.jMenuItemDetalleAbrirOrderByParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroContabilidadDefecto && this.isPermisoOrdenParametroContabilidadDefecto));			
			//this.jMenuItemDetalleMostrarOcultarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroContabilidadDefecto && this.isPermisoOrdenParametroContabilidadDefecto));			
			this.jMenuItemNuevoRelacionesParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto && this.isPermisoNuevoParametroContabilidadDefecto));			
			this.jMenuItemNuevoGuardarCambiosParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroContabilidadDefecto && this.isPermisoNuevoParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto));									
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemModificarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaModificarParametroContabilidadDefecto && this.isPermisoActualizarParametroContabilidadDefecto));	
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemActualizarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaActualizarParametroContabilidadDefecto && this.isPermisoActualizarParametroContabilidadDefecto));	
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemEliminarParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaEliminarParametroContabilidadDefecto && this.isPermisoEliminarParametroContabilidadDefecto));
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemCancelarParametroContabilidadDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroContabilidadDefecto);				
			}
			
			this.jMenuItemGuardarCambiosParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto));						
			this.jMenuItemGuardarCambiosTablaParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=this.jButtonNuevoParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaDuplicarParametroContabilidadDefecto=this.jButtonDuplicarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaCopiarParametroContabilidadDefecto=this.jButtonCopiarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaVerFormParametroContabilidadDefecto=this.jButtonVerFormParametroContabilidadDefecto.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroContabilidadDefecto=this.jButtonAbrirOrderByParametroContabilidadDefecto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=this.jButtonNuevoRelacionesParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaModificarParametroContabilidadDefecto=this.jButtonModificarParametroContabilidadDefecto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonActualizarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonEliminarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaCancelarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonCancelarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosParametroContabilidadDefecto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=this.jButtonNuevoToolBarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=this.jButtonNuevoRelacionesToolBarParametroContabilidadDefecto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			this.isVisibilidadCeldaModificarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonModificarToolBarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonActualizarToolBarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonEliminarToolBarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaCancelarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonCancelarToolBarParametroContabilidadDefecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=this.jButtonGuardarCambiosToolBarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=this.jButtonGuardarCambiosTablaToolBarParametroContabilidadDefecto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=this.jMenuItemNuevoParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=this.jMenuItemNuevoRelacionesParametroContabilidadDefecto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			this.isVisibilidadCeldaModificarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemModificarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemActualizarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemEliminarParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaCancelarParametroContabilidadDefecto=this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemCancelarParametroContabilidadDefecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=this.jMenuItemGuardarCambiosParametroContabilidadDefecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=this.jMenuItemGuardarCambiosTablaParametroContabilidadDefecto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroContabilidadDefecto(Boolean esInicializar) {
		if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
				//if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroContabilidadDefecto();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroContabilidadDefecto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroContabilidadDefecto() {
		this.jButtonNuevoParametroContabilidadDefecto.setVisible(this.isPermisoNuevoParametroContabilidadDefecto);			
		this.jButtonDuplicarParametroContabilidadDefecto.setVisible(this.isPermisoDuplicarParametroContabilidadDefecto);			
		this.jButtonCopiarParametroContabilidadDefecto.setVisible(this.isPermisoCopiarParametroContabilidadDefecto);			
		this.jButtonVerFormParametroContabilidadDefecto.setVisible(this.isPermisoVerFormParametroContabilidadDefecto);			
		
		this.jButtonAbrirOrderByParametroContabilidadDefecto.setVisible(this.isPermisoOrdenParametroContabilidadDefecto);					
		
		this.jButtonNuevoRelacionesParametroContabilidadDefecto.setVisible(this.isPermisoNuevoParametroContabilidadDefecto);			
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonModificarParametroContabilidadDefecto.setVisible(this.isPermisoActualizarParametroContabilidadDefecto);	
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonActualizarParametroContabilidadDefecto.setVisible(this.isPermisoActualizarParametroContabilidadDefecto);	
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonEliminarParametroContabilidadDefecto.setVisible(this.isPermisoEliminarParametroContabilidadDefecto);
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonCancelarParametroContabilidadDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroContabilidadDefecto);						
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosParametroContabilidadDefecto.setVisible(this.isPermisoGuardarCambiosParametroContabilidadDefecto);							
		}
		
		this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.setVisible(this.isPermisoActualizarParametroContabilidadDefecto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroContabilidadDefecto() {
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonModificarParametroContabilidadDefecto.setVisible(this.isPermisoActualizarParametroContabilidadDefecto);	
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonActualizarParametroContabilidadDefecto.setVisible(this.isPermisoActualizarParametroContabilidadDefecto);	
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonEliminarParametroContabilidadDefecto.setVisible(this.isPermisoEliminarParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonCancelarParametroContabilidadDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroContabilidadDefecto);							
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosParametroContabilidadDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroContabilidadDefecto && this.isPermisoGuardarCambiosParametroContabilidadDefecto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroContabilidadDefecto() {
		if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroContabilidadDefecto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroContabilidadDefecto() {
	}
	
	public void jTableDatosParametroContabilidadDefectoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroContabilidadDefecto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroContabilidadDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontabilidaddefecto==null) {
						this.parametrocontabilidaddefecto = new ParametroContabilidadDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				}

				if(this.parametrocontabilidaddefecto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametrocontabilidaddefecto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContabilidadDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroContabilidadDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroContabilidadDefecto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContabilidadDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametrocontabilidaddefectoLogic.getConnexion());

				if(this.parametrocontabilidaddefecto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametrocontabilidaddefecto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)this.jScrollPanelDatosParametroContabilidadDefecto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroContabilidadDefecto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroContabilidadDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontabilidaddefecto==null) {
						this.parametrocontabilidaddefecto = new ParametroContabilidadDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				}

				if(this.parametrocontabilidaddefecto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametrocontabilidaddefecto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContabilidadDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalParametroContabilidadDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebParametroContabilidadDefecto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContabilidadDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.parametrocontabilidaddefectoLogic.getConnexion());

				if(this.parametrocontabilidaddefecto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.parametrocontabilidaddefecto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)this.jScrollPanelDatosParametroContabilidadDefecto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderParametroContabilidadDefecto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalParametroContabilidadDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontabilidaddefecto==null) {
						this.parametrocontabilidaddefecto = new ParametroContabilidadDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				}

				if(this.parametrocontabilidaddefecto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.parametrocontabilidaddefecto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContabilidadDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_monedaParametroContabilidadDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomoneda=true;

			idTienePermisotipomoneda=this.tienePermisosUsuarioEnPaginaWebParametroContabilidadDefecto(TipoMonedaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomoneda) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContabilidadDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);

				this.tipomonedaBeanSwingJInternalFrame=new TipoMonedaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomonedaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomonedaBeanSwingJInternalFrame.getTipoMonedaLogic().setConnexion(this.parametrocontabilidaddefectoLogic.getConnexion());

				if(this.parametrocontabilidaddefecto.getid_tipo_moneda()!=null) {
					this.tipomonedaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomonedaBeanSwingJInternalFrame.setIdActual(this.parametrocontabilidaddefecto.getid_tipo_moneda());
					this.tipomonedaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomonedaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomonedaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMoneda();
				}

				JInternalFrameBase jinternalFrame =this.tipomonedaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)this.jScrollPanelDatosParametroContabilidadDefecto.getBorder();
				TitledBorder titledBordertipomoneda=(TitledBorder)this.tipomonedaBeanSwingJInternalFrame.jScrollPanelDatosTipoMoneda.getBorder();

				titledBordertipomoneda.setTitle(titledBorderParametroContabilidadDefecto.getTitle() + " -> Tipo Moneda");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_monedaParametroContabilidadDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontabilidaddefecto==null) {
						this.parametrocontabilidaddefecto = new ParametroContabilidadDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				}

				if(this.parametrocontabilidaddefecto.getid_tipo_moneda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_moneda = "+this.parametrocontabilidaddefecto.getid_tipo_moneda().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContabilidadDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_monedaParametroContabilidadDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomoneda=true;

			idTienePermisomoneda=this.tienePermisosUsuarioEnPaginaWebParametroContabilidadDefecto(MonedaConstantesFunciones.CLASSNAME);

			if(idTienePermisomoneda) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContabilidadDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);

				this.monedaBeanSwingJInternalFrame=new MonedaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.monedaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.monedaBeanSwingJInternalFrame.getMonedaLogic().setConnexion(this.parametrocontabilidaddefectoLogic.getConnexion());

				if(this.parametrocontabilidaddefecto.getid_moneda()!=null) {
					this.monedaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.monedaBeanSwingJInternalFrame.setIdActual(this.parametrocontabilidaddefecto.getid_moneda());
					this.monedaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.monedaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.monedaBeanSwingJInternalFrame.inicializarActualizarBindingTablaMoneda();
				}

				JInternalFrameBase jinternalFrame =this.monedaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)this.jScrollPanelDatosParametroContabilidadDefecto.getBorder();
				TitledBorder titledBordermoneda=(TitledBorder)this.monedaBeanSwingJInternalFrame.jScrollPanelDatosMoneda.getBorder();

				titledBordermoneda.setTitle(titledBorderParametroContabilidadDefecto.getTitle() + " -> Moneda");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_monedaParametroContabilidadDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontabilidaddefecto==null) {
						this.parametrocontabilidaddefecto = new ParametroContabilidadDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				}

				if(this.parametrocontabilidaddefecto.getid_moneda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_moneda = "+this.parametrocontabilidaddefecto.getid_moneda().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContabilidadDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloParametroContabilidadDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebParametroContabilidadDefecto(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContabilidadDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.parametrocontabilidaddefectoLogic.getConnexion());

				if(this.parametrocontabilidaddefecto.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.parametrocontabilidaddefecto.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)this.jScrollPanelDatosParametroContabilidadDefecto.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderParametroContabilidadDefecto.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloParametroContabilidadDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontabilidaddefecto==null) {
						this.parametrocontabilidaddefecto = new ParametroContabilidadDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				}

				if(this.parametrocontabilidaddefecto.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.parametrocontabilidaddefecto.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContabilidadDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_intervaloParametroContabilidadDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipointervalo=true;

			idTienePermisotipointervalo=this.tienePermisosUsuarioEnPaginaWebParametroContabilidadDefecto(TipoIntervaloConstantesFunciones.CLASSNAME);

			if(idTienePermisotipointervalo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContabilidadDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);

				this.tipointervaloBeanSwingJInternalFrame=new TipoIntervaloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipointervaloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipointervaloBeanSwingJInternalFrame.getTipoIntervaloLogic().setConnexion(this.parametrocontabilidaddefectoLogic.getConnexion());

				if(this.parametrocontabilidaddefecto.getid_tipo_intervalo()!=null) {
					this.tipointervaloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipointervaloBeanSwingJInternalFrame.setIdActual(this.parametrocontabilidaddefecto.getid_tipo_intervalo());
					this.tipointervaloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipointervaloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipointervaloBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoIntervalo();
				}

				JInternalFrameBase jinternalFrame =this.tipointervaloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)this.jScrollPanelDatosParametroContabilidadDefecto.getBorder();
				TitledBorder titledBordertipointervalo=(TitledBorder)this.tipointervaloBeanSwingJInternalFrame.jScrollPanelDatosTipoIntervalo.getBorder();

				titledBordertipointervalo.setTitle(titledBorderParametroContabilidadDefecto.getTitle() + " -> Tipo Intervalo ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_intervaloParametroContabilidadDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontabilidaddefecto==null) {
						this.parametrocontabilidaddefecto = new ParametroContabilidadDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				}

				if(this.parametrocontabilidaddefecto.getid_tipo_intervalo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_intervalo = "+this.parametrocontabilidaddefecto.getid_tipo_intervalo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContabilidadDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoParametroContabilidadDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebParametroContabilidadDefecto(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContabilidadDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.parametrocontabilidaddefectoLogic.getConnexion());

				if(this.parametrocontabilidaddefecto.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.parametrocontabilidaddefecto.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)this.jScrollPanelDatosParametroContabilidadDefecto.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderParametroContabilidadDefecto.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoParametroContabilidadDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontabilidaddefecto==null) {
						this.parametrocontabilidaddefecto = new ParametroContabilidadDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				}

				if(this.parametrocontabilidaddefecto.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.parametrocontabilidaddefecto.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContabilidadDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_documentoParametroContabilidadDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodocumento=true;

			idTienePermisotipodocumento=this.tienePermisosUsuarioEnPaginaWebParametroContabilidadDefecto(TipoDocumentoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodocumento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContabilidadDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);

				this.tipodocumentoBeanSwingJInternalFrame=new TipoDocumentoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodocumentoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodocumentoBeanSwingJInternalFrame.getTipoDocumentoLogic().setConnexion(this.parametrocontabilidaddefectoLogic.getConnexion());

				if(this.parametrocontabilidaddefecto.getid_tipo_documento()!=null) {
					this.tipodocumentoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodocumentoBeanSwingJInternalFrame.setIdActual(this.parametrocontabilidaddefecto.getid_tipo_documento());
					this.tipodocumentoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumento();
				}

				JInternalFrameBase jinternalFrame =this.tipodocumentoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)this.jScrollPanelDatosParametroContabilidadDefecto.getBorder();
				TitledBorder titledBordertipodocumento=(TitledBorder)this.tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.getBorder();

				titledBordertipodocumento.setTitle(titledBorderParametroContabilidadDefecto.getTitle() + " -> Tipo Documento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_documentoParametroContabilidadDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontabilidaddefecto==null) {
						this.parametrocontabilidaddefecto = new ParametroContabilidadDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				}

				if(this.parametrocontabilidaddefecto.getid_tipo_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_documento = "+this.parametrocontabilidaddefecto.getid_tipo_documento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContabilidadDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadoasientocontable=true;

			idTienePermisoestadoasientocontable=this.tienePermisosUsuarioEnPaginaWebParametroContabilidadDefecto(EstadoAsientoContableConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadoasientocontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroContabilidadDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroContabilidadDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);

				this.estadoasientocontableBeanSwingJInternalFrame=new EstadoAsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadoasientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadoasientocontableBeanSwingJInternalFrame.getEstadoAsientoContableLogic().setConnexion(this.parametrocontabilidaddefectoLogic.getConnexion());

				if(this.parametrocontabilidaddefecto.getid_estado_asiento_contable()!=null) {
					this.estadoasientocontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadoasientocontableBeanSwingJInternalFrame.setIdActual(this.parametrocontabilidaddefecto.getid_estado_asiento_contable());
					this.estadoasientocontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadoasientocontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadoasientocontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoAsientoContable();
				}

				JInternalFrameBase jinternalFrame =this.estadoasientocontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroContabilidadDefecto=(TitledBorder)this.jScrollPanelDatosParametroContabilidadDefecto.getBorder();
				TitledBorder titledBorderestadoasientocontable=(TitledBorder)this.estadoasientocontableBeanSwingJInternalFrame.jScrollPanelDatosEstadoAsientoContable.getBorder();

				titledBorderestadoasientocontable.setTitle(titledBorderParametroContabilidadDefecto.getTitle() + " -> Estado Asiento Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_asiento_contableParametroContabilidadDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.getparametrocontabilidaddefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocontabilidaddefecto==null) {
						this.parametrocontabilidaddefecto = new ParametroContabilidadDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);
				}

				if(this.parametrocontabilidaddefecto.getid_estado_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_asiento_contable = "+this.parametrocontabilidaddefecto.getid_estado_asiento_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroContabilidadDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);

			this.getParametroContabilidadDefectosFK_IdEmpresa();

			this.inicializarActualizarBindingParametroContabilidadDefecto(false);

			//if(ParametroContabilidadDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoAsientoContableParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);

			this.getParametroContabilidadDefectosFK_IdEstadoAsientoContable();

			this.inicializarActualizarBindingParametroContabilidadDefecto(false);

			//if(ParametroContabilidadDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);

			this.getParametroContabilidadDefectosFK_IdModulo();

			this.inicializarActualizarBindingParametroContabilidadDefecto(false);

			//if(ParametroContabilidadDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMonedaParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);

			this.getParametroContabilidadDefectosFK_IdMoneda();

			this.inicializarActualizarBindingParametroContabilidadDefecto(false);

			//if(ParametroContabilidadDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);

			this.getParametroContabilidadDefectosFK_IdSucursal();

			this.inicializarActualizarBindingParametroContabilidadDefecto(false);

			//if(ParametroContabilidadDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDocumentoParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);

			this.getParametroContabilidadDefectosFK_IdTipoDocumento();

			this.inicializarActualizarBindingParametroContabilidadDefecto(false);

			//if(ParametroContabilidadDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoIntervaloParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);

			this.getParametroContabilidadDefectosFK_IdTipoIntervalo();

			this.inicializarActualizarBindingParametroContabilidadDefecto(false);

			//if(ParametroContabilidadDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMonedaParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);

			this.getParametroContabilidadDefectosFK_IdTipoMoneda();

			this.inicializarActualizarBindingParametroContabilidadDefecto(false);

			//if(ParametroContabilidadDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoParametroContabilidadDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);

			this.getParametroContabilidadDefectosFK_IdTipoMovimiento();

			this.inicializarActualizarBindingParametroContabilidadDefecto(false);

			//if(ParametroContabilidadDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocontabilidaddefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroContabilidadDefecto() {
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.dispose();
			this.jInternalFrameDetalleFormParametroContabilidadDefecto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto!=null) {
			this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.dispose();
			this.jInternalFrameReporteDinamicoParametroContabilidadDefecto=null;
		}
		
		if(this.jInternalFrameImportacionParametroContabilidadDefecto!=null) {
			this.jInternalFrameImportacionParametroContabilidadDefecto.setVisible(false);	    			
			this.jInternalFrameImportacionParametroContabilidadDefecto.dispose();
			this.jInternalFrameImportacionParametroContabilidadDefecto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroContabilidadDefecto();
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroContabilidadDefecto")) {
				jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroContabilidadDefecto")) {
				jButtonDuplicarParametroContabilidadDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroContabilidadDefecto")) {
				jButtonCopiarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroContabilidadDefecto")) {
				jButtonVerFormParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroContabilidadDefecto")) {
				jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroContabilidadDefecto")) {
				jButtonDuplicarParametroContabilidadDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroContabilidadDefecto")) {
				jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroContabilidadDefecto")) {
				jButtonDuplicarParametroContabilidadDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroContabilidadDefecto")) {
				jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroContabilidadDefecto")) {
				jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroContabilidadDefecto")) {
				jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroContabilidadDefecto")) {
				jButtonModificarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroContabilidadDefecto")) {
				jButtonModificarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroContabilidadDefecto")) {
				jButtonModificarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroContabilidadDefecto")) {
				jButtonActualizarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroContabilidadDefecto")) {
				jButtonActualizarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroContabilidadDefecto")) {
				jButtonActualizarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroContabilidadDefecto")) {
				jButtonEliminarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroContabilidadDefecto")) {
				jButtonEliminarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroContabilidadDefecto")) {
				jButtonEliminarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroContabilidadDefecto")) {
				jButtonCancelarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroContabilidadDefecto")) {
				jButtonCancelarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroContabilidadDefecto")) {
				jButtonCancelarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroContabilidadDefecto")) {
				jButtonCerrarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroContabilidadDefecto")) {
				jButtonCerrarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroContabilidadDefecto")) {
				jButtonCerrarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroContabilidadDefecto")) {
				jButtonMostrarOcultarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroContabilidadDefecto")) {
				jButtonCancelarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroContabilidadDefecto")) {
				jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroContabilidadDefecto")) {
				jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroContabilidadDefecto")) {
				jButtonCopiarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroContabilidadDefecto")) {
				jButtonVerFormParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroContabilidadDefecto")) {
				jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroContabilidadDefecto")) {
				jButtonCopiarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroContabilidadDefecto")) {
				jButtonVerFormParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroContabilidadDefecto")) {
				jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroContabilidadDefecto")) {
				jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroContabilidadDefecto")) {
				jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroContabilidadDefecto")) {
				jButtonRecargarInformacionParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroContabilidadDefecto")) {
				jButtonRecargarInformacionParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroContabilidadDefecto")) {
				jButtonRecargarInformacionParametroContabilidadDefectoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroContabilidadDefecto")) {
				jButtonAnterioresParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroContabilidadDefecto")) {
				jButtonAnterioresParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroContabilidadDefecto")) {
				jButtonAnterioresParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroContabilidadDefecto")) {
				jButtonSiguientesParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroContabilidadDefecto")) {
				jButtonSiguientesParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroContabilidadDefecto")) {
				jButtonSiguientesParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroContabilidadDefecto") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroContabilidadDefecto")) {
				jButtonAbrirOrderByParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroContabilidadDefecto") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroContabilidadDefecto")) {
				jButtonMostrarOcultarParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroContabilidadDefecto")) {
				jButtonNuevoGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroContabilidadDefecto")) {
				jButtonNuevoGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroContabilidadDefecto")) {
				jButtonNuevoGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroContabilidadDefecto")) {
				jButtonCerrarReporteDinamicoParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroContabilidadDefecto")) {
				jButtonGenerarReporteDinamicoParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroContabilidadDefecto")) {
				
				jButtonGenerarExcelReporteDinamicoParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroContabilidadDefecto")) {
				jButtonCerrarImportacionParametroContabilidadDefectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroContabilidadDefecto")) {
				
				jButtonGenerarImportacionParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroContabilidadDefecto")) {
				
				jButtonAbrirImportacionParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroContabilidadDefecto")) {
				jComboBoxTiposAccionesParametroContabilidadDefectoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroContabilidadDefecto")) {
				jComboBoxTiposRelacionesParametroContabilidadDefectoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroContabilidadDefecto")) {
				jComboBoxTiposAccionesParametroContabilidadDefectoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroContabilidadDefecto")) {
				
				jComboBoxTiposSeleccionarParametroContabilidadDefectoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroContabilidadDefecto")) {
				jTextFieldValorCampoGeneralParametroContabilidadDefectoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroContabilidadDefecto")) {
				jButtonAbrirOrderByParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroContabilidadDefecto")) {
				jButtonAbrirOrderByParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroContabilidadDefecto")) {
				jButtonCerrarOrderByParametroContabilidadDefectoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroContabilidadDefectoBusqueda")) {
				this.jButtonidParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroContabilidadDefectoUpdate")) {
				this.jButtonid_empresaParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_empresaParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroContabilidadDefectoUpdate")) {
				this.jButtonid_sucursalParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_sucursalParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_monedaParametroContabilidadDefectoUpdate")) {
				this.jButtonid_tipo_monedaParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_monedaParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_tipo_monedaParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_monedaParametroContabilidadDefectoUpdate")) {
				this.jButtonid_monedaParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_monedaParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_monedaParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloParametroContabilidadDefectoUpdate")) {
				this.jButtonid_moduloParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_moduloParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_intervaloParametroContabilidadDefectoUpdate")) {
				this.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_intervaloParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_tipo_intervaloParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoParametroContabilidadDefectoUpdate")) {
				this.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_tipo_movimientoParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoParametroContabilidadDefectoUpdate")) {
				this.jButtonid_tipo_documentoParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_tipo_documentoParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_asiento_contableParametroContabilidadDefectoUpdate")) {
				this.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_asiento_contableParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEstadoAsientoContableParametroContabilidadDefecto")) {
				this.jButtonFK_IdEstadoAsientoContableParametroContabilidadDefectoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdModuloParametroContabilidadDefecto")) {
				this.jButtonFK_IdModuloParametroContabilidadDefectoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoDocumentoParametroContabilidadDefecto")) {
				this.jButtonFK_IdTipoDocumentoParametroContabilidadDefectoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoIntervaloParametroContabilidadDefecto")) {
				this.jButtonFK_IdTipoIntervaloParametroContabilidadDefectoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoMonedaParametroContabilidadDefecto")) {
				this.jButtonFK_IdTipoMonedaParametroContabilidadDefectoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoMovimientoParametroContabilidadDefecto")) {
				this.jButtonFK_IdTipoMovimientoParametroContabilidadDefectoActionPerformed(evt);
			}
			
			;
			
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroContabilidadDefecto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContabilidadDefectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				


				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContabilidadDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContabilidadDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroContabilidadDefecto parametrocontabilidaddefectoLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrocontabilidaddefectoLocal=this.parametrocontabilidaddefecto;
			} else {
				parametrocontabilidaddefectoLocal=this.parametrocontabilidaddefectoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
							
				
				


				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContabilidadDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContabilidadDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContabilidadDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
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
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
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
			
			


			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContabilidadDefectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
								
						
				


				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContabilidadDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContabilidadDefecto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
								
				
				


				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContabilidadDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContabilidadDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContabilidadDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContabilidadDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContabilidadDefectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
							
				
				


				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContabilidadDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContabilidadDefecto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContabilidadDefectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
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
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
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
			
			


			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContabilidadDefectoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
								
				
				


				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContabilidadDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContabilidadDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContabilidadDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContabilidadDefectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContabilidadDefectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroContabilidadDefecto")) {
					jCheckBoxSeleccionarTodosParametroContabilidadDefectoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroContabilidadDefecto")) {
					jCheckBoxSeleccionadosParametroContabilidadDefectoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroContabilidadDefecto")) {
					
				}
				
				


				
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContabilidadDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContabilidadDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
												
				
				


				
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContabilidadDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContabilidadDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContabilidadDefectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContabilidadDefectoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
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
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
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
			
			


			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroContabilidadDefectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContabilidadDefecto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContabilidadDefecto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocontabilidaddefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocontabilidaddefecto);
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
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
				
				


				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroContabilidadDefecto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroContabilidadDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroContabilidadDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocontabilidaddefectoAnterior =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroContabilidadDefecto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroContabilidadDefectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroContabilidadDefecto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametrocontabilidaddefecto =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametrocontabilidaddefecto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroContabilidadDefecto")) {
				
				}
				
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroContabilidadDefecto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroContabilidadDefecto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroContabilidadDefecto")) {
			
			}
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroContabilidadDefecto();
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
			if(sTipo.equals("NuevoParametroContabilidadDefecto")) {
				jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroContabilidadDefecto")) {
				jButtonDuplicarParametroContabilidadDefectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroContabilidadDefecto")) {
				jButtonCopiarParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroContabilidadDefecto")) {
				jButtonVerFormParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroContabilidadDefecto")) {
				jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroContabilidadDefecto")) {
				jButtonModificarParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroContabilidadDefecto")) {
				jButtonActualizarParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroContabilidadDefecto")) {
				jButtonEliminarParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroContabilidadDefecto")) {
				jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroContabilidadDefecto")) {
				jButtonCancelarParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroContabilidadDefecto")) {
				jButtonCerrarParametroContabilidadDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroContabilidadDefecto")) {
				jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroContabilidadDefecto")) {
				jButtonNuevoGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroContabilidadDefecto")) {
				jButtonAbrirOrderByParametroContabilidadDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroContabilidadDefecto")) {
				jButtonRecargarInformacionParametroContabilidadDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroContabilidadDefecto")) {
				jButtonAnterioresParametroContabilidadDefectoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroContabilidadDefecto")) {
				jButtonSiguientesParametroContabilidadDefectoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroContabilidadDefectoBusqueda")) {
				this.jButtonidParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroContabilidadDefectoUpdate")) {
				this.jButtonid_empresaParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_empresaParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroContabilidadDefectoUpdate")) {
				this.jButtonid_sucursalParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_sucursalParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_monedaParametroContabilidadDefectoUpdate")) {
				this.jButtonid_tipo_monedaParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_monedaParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_tipo_monedaParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_monedaParametroContabilidadDefectoUpdate")) {
				this.jButtonid_monedaParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_monedaParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_monedaParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloParametroContabilidadDefectoUpdate")) {
				this.jButtonid_moduloParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_moduloParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_intervaloParametroContabilidadDefectoUpdate")) {
				this.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_intervaloParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_tipo_intervaloParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoParametroContabilidadDefectoUpdate")) {
				this.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_tipo_movimientoParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoParametroContabilidadDefectoUpdate")) {
				this.jButtonid_tipo_documentoParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_tipo_documentoParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_asiento_contableParametroContabilidadDefectoUpdate")) {
				this.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_asiento_contableParametroContabilidadDefectoBusqueda")) {
				this.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusquedaActionPerformed(evt);
			}
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroContabilidadDefecto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroContabilidadDefecto")) {
				closingInternalFrameParametroContabilidadDefecto();
				
			} else if(sTipo.equals("jButtonCancelarParametroContabilidadDefecto")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroContabilidadDefecto = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroContabilidadDefectoBeanSwingJInternalFrame jInternalFrameParent=(ParametroContabilidadDefectoBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroContabilidadDefecto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroContabilidadDefectoActionPerformed(null);
			}
			
			ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrocontabilidaddefecto,new Object(),this.parametrocontabilidaddefectoParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroContabilidadDefecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroContabilidadDefecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroContabilidadDefecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametrocontabilidaddefecto)) {
			if(!esControlTabla) {
				if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);			
				}
				
				if(this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrocontabilidaddefectoReturnGeneral=parametrocontabilidaddefectoLogic.procesarEventosParametroContabilidadDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos(),this.parametrocontabilidaddefecto,this.parametrocontabilidaddefectoParameterGeneral,this.isEsNuevoParametroContabilidadDefecto,classes);//this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroContabilidadDefecto(this.parametrocontabilidaddefectoReturnGeneral,this.parametrocontabilidaddefectoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroContabilidadDefecto(classes,this.parametrocontabilidaddefectoReturnGeneral,this.parametrocontabilidaddefectoBean,false);
					}
						
					if(this.parametrocontabilidaddefectoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroContabilidadDefecto(this.parametrocontabilidaddefectoReturnGeneral.getParametroContabilidadDefecto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroContabilidadDefecto(this.parametrocontabilidaddefectoReturnGeneral.getParametroContabilidadDefecto());	
					}
						
					if(this.parametrocontabilidaddefectoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroContabilidadDefecto(this.parametrocontabilidaddefectoReturnGeneral.getParametroContabilidadDefecto(),classes);//this.parametrocontabilidaddefectoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroContabilidadDefecto(this.parametrocontabilidaddefecto,classes);//this.parametrocontabilidaddefectoBean);									
				}
			
				if(ParametroContabilidadDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroContabilidadDefecto(this.parametrocontabilidaddefecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroContabilidadDefecto(this.parametrocontabilidaddefecto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametrocontabilidaddefectoAnterior!=null) {
						this.parametrocontabilidaddefecto=this.parametrocontabilidaddefectoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrocontabilidaddefectoReturnGeneral=parametrocontabilidaddefectoLogic.procesarEventosParametroContabilidadDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos(),this.parametrocontabilidaddefecto,this.parametrocontabilidaddefectoParameterGeneral,this.isEsNuevoParametroContabilidadDefecto,classes);//this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrocontabilidaddefectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametrocontabilidaddefectoReturnGeneral.getParametroContabilidadDefecto(),parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametrocontabilidaddefectoReturnGeneral.getParametroContabilidadDefecto(),this.parametrocontabilidaddefectos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroContabilidadDefecto.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroContabilidadDefecto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroContabilidadDefecto();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroContabilidadDefecto() throws Exception {
		
		ParametroContabilidadDefectoModel parametrocontabilidaddefectoModel=(ParametroContabilidadDefectoModel)this.jTableDatosParametroContabilidadDefecto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrocontabilidaddefectoModel.parametrocontabilidaddefectos=this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametrocontabilidaddefectoModel.parametrocontabilidaddefectos=this.parametrocontabilidaddefectos;
		}
		
		
		((ParametroContabilidadDefectoModel) this.jTableDatosParametroContabilidadDefecto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroContabilidadDefecto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametrocontabilidaddefectoAnterior(),this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametrocontabilidaddefectoAnterior(),this.parametrocontabilidaddefectos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroContabilidadDefecto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
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
										
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocontabilidaddefecto,new Object(),generalEntityParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroContabilidadDefectoConstantesFunciones.getClassesRelationshipsOfParametroContabilidadDefecto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroContabilidadDefectoConstantesFunciones.getClassesRelationshipsFromStringsOfParametroContabilidadDefecto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroContabilidadDefecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocontabilidaddefecto,new Object(),generalEntityParameterGeneral,this.parametrocontabilidaddefectoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroContabilidadDefecto(ParametroContabilidadDefectoBean parametrocontabilidaddefectoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroContabilidadDefecto(ArrayList<Classe> classes,ParametroContabilidadDefectoReturnGeneral parametrocontabilidaddefectoReturnGeneral,ParametroContabilidadDefectoBean parametrocontabilidaddefectoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrocontabilidaddefecto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto = new ParametroContabilidadDefectoDetalleFormJInternalFrame(jDesktopPane,this.parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones(),this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.setVisible(false);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.parametrocontabilidaddefectoLogic=this.parametrocontabilidaddefectoLogic;
		
		this.cargarCombosFrameForeignKeyParametroContabilidadDefecto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroContabilidadDefecto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroContabilidadDefecto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroContabilidadDefecto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroContabilidadDefecto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroContabilidadDefecto"));
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonModificarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"ModificarParametroContabilidadDefecto"));

		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonModificarToolBarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroContabilidadDefecto"));
					
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemModificarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroContabilidadDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonActualizarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"ActualizarParametroContabilidadDefecto"));
		
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonActualizarToolBarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroContabilidadDefecto"));
						
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemActualizarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroContabilidadDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonEliminarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"EliminarParametroContabilidadDefecto"));
		
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonEliminarToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroContabilidadDefecto"));
								
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemEliminarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroContabilidadDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonCancelarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"CancelarParametroContabilidadDefecto"));
		
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonCancelarToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroContabilidadDefecto"));
					
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemCancelarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroContabilidadDefecto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemDetalleCerrarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroContabilidadDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroContabilidadDefecto"));
		
		
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroContabilidadDefecto"));
		
		
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroContabilidadDefecto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonidParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_empresaParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_empresaParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_sucursalParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_sucursalParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_monedaParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_monedaParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_monedaParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_monedaParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_monedaParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_monedaParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_moduloParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_moduloParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_documentoParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_asiento_contableParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_asiento_contableParametroContabilidadDefectoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jTabbedPaneRelacionesParametroContabilidadDefecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroContabilidadDefecto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroContabilidadDefecto"));
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroContabilidadDefecto"));
		}
		
		this.jTableDatosParametroContabilidadDefecto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroContabilidadDefecto"));
		
		this.jTableDatosParametroContabilidadDefecto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroContabilidadDefecto"));
		
		this.jButtonNuevoParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"NuevoParametroContabilidadDefecto"));
		
		this.jButtonDuplicarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"DuplicarParametroContabilidadDefecto"));
		
		this.jButtonCopiarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"CopiarParametroContabilidadDefecto"));
		
		this.jButtonVerFormParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"VerFormParametroContabilidadDefecto"));
		
		
		this.jButtonNuevoToolBarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroContabilidadDefecto"));
			
		this.jButtonDuplicarToolBarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroContabilidadDefecto"));
			
		this.jMenuItemNuevoParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroContabilidadDefecto"));
			
		this.jMenuItemDuplicarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroContabilidadDefecto"));		
		
		
		this.jButtonNuevoRelacionesParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroContabilidadDefecto"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroContabilidadDefecto"));
			
		this.jMenuItemNuevoRelacionesParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroContabilidadDefecto"));		
		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonModificarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"ModificarParametroContabilidadDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonModificarToolBarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroContabilidadDefecto"));
			
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemModificarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroContabilidadDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonActualizarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"ActualizarParametroContabilidadDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonActualizarToolBarParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroContabilidadDefecto"));
				
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemActualizarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroContabilidadDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonEliminarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"EliminarParametroContabilidadDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonEliminarToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroContabilidadDefecto"));
						
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemEliminarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroContabilidadDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonCancelarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"CancelarParametroContabilidadDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonCancelarToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroContabilidadDefecto"));
			
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemCancelarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroContabilidadDefecto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroContabilidadDefecto"));		
		
		
		this.jButtonCerrarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"CerrarParametroContabilidadDefecto"));
		
		
		this.jButtonCerrarToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroContabilidadDefecto"));
			
		this.jMenuItemCerrarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroContabilidadDefecto"));
			
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jMenuItemDetalleCerrarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroContabilidadDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroContabilidadDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroContabilidadDefecto"));
		}
		
		this.jButtonCopiarToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroContabilidadDefecto"));
			
		this.jButtonVerFormToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroContabilidadDefecto"));
		
		this.jMenuItemGuardarCambiosParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroContabilidadDefecto"));
			
		this.jMenuItemCopiarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroContabilidadDefecto"));		
		
		this.jMenuItemVerFormParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroContabilidadDefecto"));		
		
		
		this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroContabilidadDefecto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroContabilidadDefecto"));
			
		this.jMenuItemGuardarCambiosTablaParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroContabilidadDefecto"));		
		
		
		
		this.jButtonRecargarInformacionParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroContabilidadDefecto"));
					
		this.jButtonRecargarInformacionToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroContabilidadDefecto"));
		
		this.jMenuItemRecargarInformacionParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroContabilidadDefecto"));		
		
		
		
		this.jButtonAnterioresParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"AnterioresParametroContabilidadDefecto"));
		
		
		this.jButtonAnterioresToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroContabilidadDefecto"));
		
		this.jMenuItemAnterioresParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroContabilidadDefecto"));		
		
		
		this.jButtonSiguientesParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"SiguientesParametroContabilidadDefecto"));
		
		
		this.jButtonSiguientesToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroContabilidadDefecto"));
			
		this.jMenuItemSiguientesParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroContabilidadDefecto"));
			
		this.jMenuItemAbrirOrderByParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroContabilidadDefecto"));
			
		this.jMenuItemMostrarOcultarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroContabilidadDefecto"));
			
		this.jMenuItemDetalleAbrirOrderByParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroContabilidadDefecto"));
			
		this.jMenuItemDetalleMostarOcultarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroContabilidadDefecto"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroContabilidadDefecto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroContabilidadDefecto"));
			
		this.jMenuItemNuevoGuardarCambiosParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroContabilidadDefecto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroContabilidadDefecto"));

		this.jCheckBoxSeleccionadosParametroContabilidadDefecto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroContabilidadDefecto"));
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroContabilidadDefecto"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroContabilidadDefecto"));
			
		this.jComboBoxTiposAccionesParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroContabilidadDefecto"));
					
		this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroContabilidadDefecto"));
			
		this.jTextFieldValorCampoGeneralParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroContabilidadDefecto"));		
		
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonidParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_empresaParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_empresaParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_sucursalParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_sucursalParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_monedaParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_monedaParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_monedaParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_monedaParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_monedaParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_monedaParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_moduloParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_moduloParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_documentoParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_asiento_contableParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_asiento_contableParametroContabilidadDefectoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEstadoAsientoContableParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdEstadoAsientoContableParametroContabilidadDefecto"));

			this.jButtonFK_IdModuloParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdModuloParametroContabilidadDefecto"));

			this.jButtonFK_IdTipoDocumentoParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoDocumentoParametroContabilidadDefecto"));

			this.jButtonFK_IdTipoIntervaloParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoIntervaloParametroContabilidadDefecto"));

			this.jButtonFK_IdTipoMonedaParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoMonedaParametroContabilidadDefecto"));

			this.jButtonFK_IdTipoMovimientoParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoMovimientoParametroContabilidadDefecto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroContabilidadDefecto!=null) {
				this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroContabilidadDefecto"));
				this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroContabilidadDefecto"));
				this.jInternalFrameReporteDinamicoParametroContabilidadDefecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroContabilidadDefecto"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroContabilidadDefecto"));				
			//this.jButtonGenerarReporteDinamicoParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroContabilidadDefecto"));
			//this.jButtonGenerarExcelReporteDinamicoParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroContabilidadDefecto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroContabilidadDefecto!=null) {
				this.jInternalFrameImportacionParametroContabilidadDefecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroContabilidadDefecto"));
				this.jInternalFrameImportacionParametroContabilidadDefecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroContabilidadDefecto"));
				this.jInternalFrameImportacionParametroContabilidadDefecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroContabilidadDefecto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroContabilidadDefecto"));
			
			this.jButtonAbrirOrderByToolBarParametroContabilidadDefecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroContabilidadDefecto"));			
			
			if(this.jInternalFrameOrderByParametroContabilidadDefecto!=null) {
				this.jInternalFrameOrderByParametroContabilidadDefecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroContabilidadDefecto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroContabilidadDefecto.jTabbedPaneRelacionesParametroContabilidadDefecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroContabilidadDefecto"));
		
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
            		closingInternalFrameParametroContabilidadDefecto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroContabilidadDefecto = (JInternalFrameBase)event.getSource();
	            	
	            ParametroContabilidadDefectoBeanSwingJInternalFrame jInternalFrameParent=(ParametroContabilidadDefectoBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroContabilidadDefecto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroContabilidadDefectoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroContabilidadDefecto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroContabilidadDefectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroContabilidadDefecto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroContabilidadDefecto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroContabilidadDefecto";
		inputMap = this.jButtonNuevoParametroContabilidadDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroContabilidadDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroContabilidadDefecto";
		inputMap = this.jButtonNuevoRelacionesParametroContabilidadDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroContabilidadDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroContabilidadDefectoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroContabilidadDefecto";
		inputMap = this.jButtonModificarParametroContabilidadDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroContabilidadDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroContabilidadDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroContabilidadDefecto";
		inputMap = this.jButtonActualizarParametroContabilidadDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroContabilidadDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroContabilidadDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroContabilidadDefecto";
		inputMap = this.jButtonEliminarParametroContabilidadDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroContabilidadDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroContabilidadDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroContabilidadDefecto";
		inputMap = this.jButtonCancelarParametroContabilidadDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroContabilidadDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroContabilidadDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroContabilidadDefecto";
		inputMap = this.jButtonCerrarParametroContabilidadDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroContabilidadDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroContabilidadDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroContabilidadDefecto";
		inputMap = this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosParametroContabilidadDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonGuardarCambiosParametroContabilidadDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroContabilidadDefecto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroContabilidadDefectoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroContabilidadDefecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroContabilidadDefectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroContabilidadDefectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroContabilidadDefecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroContabilidadDefectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonidParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_empresaParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_empresaParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_sucursalParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_sucursalParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_monedaParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_monedaParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_monedaParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_monedaParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_monedaParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_monedaParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_monedaParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_moduloParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_moduloParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_moduloParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_intervaloParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_intervaloParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_intervaloParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_movimientoParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_movimientoParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_documentoParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_tipo_documentoParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoParametroContabilidadDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_estado_asiento_contableParametroContabilidadDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_asiento_contableParametroContabilidadDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jButtonid_estado_asiento_contableParametroContabilidadDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_asiento_contableParametroContabilidadDefectoBusqueda"));
		
		
		this.jButtonFK_IdEstadoAsientoContableParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdEstadoAsientoContableParametroContabilidadDefecto"));

		this.jButtonFK_IdModuloParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdModuloParametroContabilidadDefecto"));

		this.jButtonFK_IdTipoDocumentoParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoDocumentoParametroContabilidadDefecto"));

		this.jButtonFK_IdTipoIntervaloParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoIntervaloParametroContabilidadDefecto"));

		this.jButtonFK_IdTipoMonedaParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoMonedaParametroContabilidadDefecto"));

		this.jButtonFK_IdTipoMovimientoParametroContabilidadDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoMovimientoParametroContabilidadDefecto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroContabilidadDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroContabilidadDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroContabilidadDefectoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroContabilidadDefecto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroContabilidadDefecto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
					parametrocontabilidaddefectoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectos) {
					parametrocontabilidaddefectoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroContabilidadDefectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
						parametrocontabilidaddefectoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectos) {
						parametrocontabilidaddefectoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroContabilidadDefecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroContabilidadDefecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroContabilidadDefectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroContabilidadDefecto.getSelectedRows();
			
			ParametroContabilidadDefecto parametrocontabilidaddefectoLocal=new ParametroContabilidadDefecto();
			
			//this.seleccionarTodosParametroContabilidadDefecto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocontabilidaddefectoLocal =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos().toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametrocontabilidaddefectoLocal =(ParametroContabilidadDefecto) this.parametrocontabilidaddefectos.toArray()[this.jTableDatosParametroContabilidadDefecto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametrocontabilidaddefectoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
						parametrocontabilidaddefectoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectos) {
						parametrocontabilidaddefectoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroContabilidadDefecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroContabilidadDefecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroContabilidadDefecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroContabilidadDefectoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroContabilidadDefectoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroContabilidadDefectoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroContabilidadDefecto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectos) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroContabilidadDefectoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroContabilidadDefecto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroContabilidadDefecto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroContabilidadDefecto) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroContabilidadDefecto(conSplash);
				
					this.generarReporteParametroContabilidadDefectosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroContabilidadDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroContabilidadDefectosSeleccionados();
				//this.jComboBoxTiposAccionesParametroContabilidadDefecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroContabilidadDefectosSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroContabilidadDefecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroContabilidadDefectosSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroContabilidadDefecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroContabilidadDefecto();
				
				this.exportarParametroContabilidadDefectosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroContabilidadDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroContabilidadDefectos();
				//this.importarParametroContabilidadDefectos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroContabilidadDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroContabilidadDefecto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroContabilidadDefectosSeleccionados();
				//this.jComboBoxTiposAccionesParametroContabilidadDefecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Contabilidad Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroContabilidadDefecto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroContabilidadDefecto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroContabilidadDefecto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Contabilidad Defecto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroContabilidadDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroContabilidadDefectoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroContabilidadDefecto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroContabilidadDefecto(conSplash);
					
						//this.actualizarParametrosGeneralParametroContabilidadDefecto();
						
						this.generarReporteProcesoAccionParametroContabilidadDefectosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroContabilidadDefecto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro Contabilidad DefectoS SELECCIONADOS?", "MANTENIMIENTO DE Parametro Contabilidad Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroContabilidadDefecto();
				
						this.actualizarParametrosGeneralParametroContabilidadDefecto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametrocontabilidaddefectoReturnGeneral=parametrocontabilidaddefectoLogic.procesarAccionParametroContabilidadDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos(),this.parametrocontabilidaddefectoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroContabilidadDefectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroContabilidadDefecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroContabilidadDefecto();
					
					ParametroContabilidadDefectoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroContabilidadDefectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroContabilidadDefecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxTiposAccionesFormularioParametroContabilidadDefecto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroContabilidadDefecto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroContabilidadDefectoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroContabilidadDefecto();
			
			if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();		
			ParametroContabilidadDefecto parametrocontabilidaddefecto=new ParametroContabilidadDefecto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroContabilidadDefecto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroContabilidadDefecto.getSelectedItem();
			
			
			
			
			parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametrocontabilidaddefectosSeleccionados.size()==1) {
				for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectosSeleccionados) {
					parametrocontabilidaddefecto=parametrocontabilidaddefectoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroContabilidadDefecto();
			
      		//this.finishProcessParametroContabilidadDefecto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroContabilidadDefectoReturnGeneral() throws Exception {
		if(this.parametrocontabilidaddefectoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametrocontabilidaddefectoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametrocontabilidaddefectoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametrocontabilidaddefectoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametrocontabilidaddefectoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametrocontabilidaddefectoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroContabilidadDefecto(false);
		}
		
		if(this.parametrocontabilidaddefectoReturnGeneral.getConRetornoLista() || this.parametrocontabilidaddefectoReturnGeneral.getConRetornoObjeto()) {
			if(this.parametrocontabilidaddefectoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrocontabilidaddefectoLogic.setParametroContabilidadDefectos(this.parametrocontabilidaddefectoReturnGeneral.getParametroContabilidadDefectos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametrocontabilidaddefectoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrocontabilidaddefectoLogic.setParametroContabilidadDefecto(this.parametrocontabilidaddefectoReturnGeneral.getParametroContabilidadDefecto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroContabilidadDefecto(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroContabilidadDefecto() throws Exception {
		
		
	}
	
	public ArrayList<ParametroContabilidadDefecto> getParametroContabilidadDefectosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroContabilidadDefecto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos()) {
					if(parametrocontabilidaddefectoAux.getIsSelected()) {
						parametrocontabilidaddefectosSeleccionados.add(parametrocontabilidaddefectoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:this.parametrocontabilidaddefectos) {
					if(parametrocontabilidaddefectoAux.getIsSelected()) {
						parametrocontabilidaddefectosSeleccionados.add(parametrocontabilidaddefectoAux);				
					}
				}
			}
			
			if(parametrocontabilidaddefectosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametrocontabilidaddefectosSeleccionados.addAll(this.parametrocontabilidaddefectoLogic.getParametroContabilidadDefectos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametrocontabilidaddefectosSeleccionados.addAll(this.parametrocontabilidaddefectos);				
					}
				}
			}
		} else {
			parametrocontabilidaddefectosSeleccionados.add(this.parametrocontabilidaddefecto);
		}
		
		return parametrocontabilidaddefectosSeleccionados;
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
	
	public void generarReporteParametroContabilidadDefectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroContabilidadDefectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroContabilidadDefectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroContabilidadDefectosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroContabilidadDefectosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Contabilidad Defecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroContabilidadDefectosSeleccionados() throws Exception {
		ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();		
		
		parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroContabilidadDefectos("Todos",parametrocontabilidaddefectosSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroContabilidadDefectosSeleccionados() throws Exception {
		ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();		
		
		parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroContabilidadDefectos("Todos",parametrocontabilidaddefectosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroContabilidadDefectosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();
		
		parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroContabilidadDefectos("Todos",parametrocontabilidaddefectosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroContabilidadDefectosSeleccionados() throws Exception {
		ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroContabilidadDefecto();
		
		
		parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroContabilidadDefecto();
		
		
		//this.generarReporteParametroContabilidadDefectos("Todos",parametrocontabilidaddefectosSeleccionados ,parametrocontabilidaddefectoImplementable,parametrocontabilidaddefectoImplementableHome);
	}
	
	public void mostrarImportacionParametroContabilidadDefectos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroContabilidadDefecto();
		
		this.abrirFrameImportacionParametroContabilidadDefecto();		
		
			
		//this.generarReporteParametroContabilidadDefectos("Todos",parametrocontabilidaddefectosSeleccionados ,parametrocontabilidaddefectoImplementable,parametrocontabilidaddefectoImplementableHome);
	}
	
	public void importarParametroContabilidadDefectos() throws Exception {		
	
	}
	
	public void exportarParametroContabilidadDefectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroContabilidadDefectosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroContabilidadDefectosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroContabilidadDefectosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Contabilidad Defecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroContabilidadDefectosSeleccionados() throws Exception {
		ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();		
		
		parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontabilidaddefecto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroContabilidadDefecto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroContabilidadDefecto(parametrocontabilidaddefectoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametrocontabilidaddefectoAux.setsDetalleGeneralEntityReporte(parametrocontabilidaddefectoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Contabilidad Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroContabilidadDefecto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroContabilidadDefectoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContabilidadDefectoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrocontabilidaddefecto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontabilidaddefecto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontabilidaddefecto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontabilidaddefecto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontabilidaddefecto.gettipomoneda_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontabilidaddefecto.getmoneda_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontabilidaddefecto.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontabilidaddefecto.gettipointervalo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontabilidaddefecto.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontabilidaddefecto.gettipodocumento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocontabilidaddefecto.getestadoasientocontable_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroContabilidadDefectosSeleccionados() throws Exception {
		ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();		
		
		parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontabilidaddefecto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroContabilidadDefectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroContabilidadDefecto(row);				
				iRow++;
			}				
			
			for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroContabilidadDefecto(parametrocontabilidaddefectoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Contabilidad Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroContabilidadDefectosSeleccionados() throws Exception {
		ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();		
		
		parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocontabilidaddefecto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametrocontabilidaddefectos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrocontabilidaddefecto");
			//elementRoot.appendChild(element);
		
			for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectosSeleccionados) {
				element = document.createElement("parametrocontabilidaddefecto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroContabilidadDefecto(parametrocontabilidaddefectoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Contabilidad Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroContabilidadDefecto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontabilidaddefecto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontabilidaddefecto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontabilidaddefecto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontabilidaddefecto.gettipomoneda_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontabilidaddefecto.getmoneda_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontabilidaddefecto.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontabilidaddefecto.gettipointervalo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontabilidaddefecto.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontabilidaddefecto.gettipodocumento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocontabilidaddefecto.getestadoasientocontable_descripcion());				
	}
	
	public void setFilaDatosExportarXmlParametroContabilidadDefecto(ParametroContabilidadDefecto parametrocontabilidaddefecto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroContabilidadDefectoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametrocontabilidaddefecto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroContabilidadDefectoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrocontabilidaddefecto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroContabilidadDefectoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametrocontabilidaddefecto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ParametroContabilidadDefectoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(parametrocontabilidaddefecto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtipomoneda_descripcion = document.createElement(ParametroContabilidadDefectoConstantesFunciones.IDTIPOMONEDA);
		elementtipomoneda_descripcion.appendChild(document.createTextNode(parametrocontabilidaddefecto.gettipomoneda_descripcion()));
		element.appendChild(elementtipomoneda_descripcion);

		Element elementmoneda_descripcion = document.createElement(ParametroContabilidadDefectoConstantesFunciones.IDMONEDA);
		elementmoneda_descripcion.appendChild(document.createTextNode(parametrocontabilidaddefecto.getmoneda_descripcion()));
		element.appendChild(elementmoneda_descripcion);

		Element elementmodulo_descripcion = document.createElement(ParametroContabilidadDefectoConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(parametrocontabilidaddefecto.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtipointervalo_descripcion = document.createElement(ParametroContabilidadDefectoConstantesFunciones.IDTIPOINTERVALO);
		elementtipointervalo_descripcion.appendChild(document.createTextNode(parametrocontabilidaddefecto.gettipointervalo_descripcion()));
		element.appendChild(elementtipointervalo_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(ParametroContabilidadDefectoConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(parametrocontabilidaddefecto.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementtipodocumento_descripcion = document.createElement(ParametroContabilidadDefectoConstantesFunciones.IDTIPODOCUMENTO);
		elementtipodocumento_descripcion.appendChild(document.createTextNode(parametrocontabilidaddefecto.gettipodocumento_descripcion()));
		element.appendChild(elementtipodocumento_descripcion);

		Element elementestadoasientocontable_descripcion = document.createElement(ParametroContabilidadDefectoConstantesFunciones.IDESTADOASIENTOCONTABLE);
		elementestadoasientocontable_descripcion.appendChild(document.createTextNode(parametrocontabilidaddefecto.getestadoasientocontable_descripcion()));
		element.appendChild(elementestadoasientocontable_descripcion);
	}
	
	public void generarReporteGroupGenericoParametroContabilidadDefectosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados=new ArrayList<ParametroContabilidadDefecto>();
		
		parametrocontabilidaddefectosSeleccionados=this.getParametroContabilidadDefectosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroContabilidadDefecto(parametrocontabilidaddefectosSeleccionados);
		
		this.generarReporteParametroContabilidadDefectos("Todos",parametrocontabilidaddefectosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroContabilidadDefecto(ArrayList<ParametroContabilidadDefecto> parametrocontabilidaddefectosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroContabilidadDefecto parametrocontabilidaddefectoAux:parametrocontabilidaddefectosSeleccionados) {
				parametrocontabilidaddefectoAux.setsDetalleGeneralEntityReporte(parametrocontabilidaddefectoAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametrocontabilidaddefectoAux.setsDescripcionGeneralEntityReporte1(parametrocontabilidaddefectoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					parametrocontabilidaddefectoAux.setsDescripcionGeneralEntityReporte1(parametrocontabilidaddefectoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMONEDA)) {
					existe=true;
					parametrocontabilidaddefectoAux.setsDescripcionGeneralEntityReporte1(parametrocontabilidaddefectoAux.gettipomoneda_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMONEDA)) {
					existe=true;
					parametrocontabilidaddefectoAux.setsDescripcionGeneralEntityReporte1(parametrocontabilidaddefectoAux.getmoneda_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					parametrocontabilidaddefectoAux.setsDescripcionGeneralEntityReporte1(parametrocontabilidaddefectoAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOINTERVALO)) {
					existe=true;
					parametrocontabilidaddefectoAux.setsDescripcionGeneralEntityReporte1(parametrocontabilidaddefectoAux.gettipointervalo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					parametrocontabilidaddefectoAux.setsDescripcionGeneralEntityReporte1(parametrocontabilidaddefectoAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDTIPODOCUMENTO)) {
					existe=true;
					parametrocontabilidaddefectoAux.setsDescripcionGeneralEntityReporte1(parametrocontabilidaddefectoAux.gettipodocumento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroContabilidadDefectoConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLE)) {
					existe=true;
					parametrocontabilidaddefectoAux.setsDescripcionGeneralEntityReporte1(parametrocontabilidaddefectoAux.getestadoasientocontable_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroContabilidadDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroContabilidadDefecto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=true;
				this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=true;
			}
			
			this.isVisibilidadCeldaModificarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaCancelarParametroContabilidadDefecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaModificarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaCancelarParametroContabilidadDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaModificarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaCancelarParametroContabilidadDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaModificarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaCancelarParametroContabilidadDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaModificarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaCancelarParametroContabilidadDefecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaCancelarParametroContabilidadDefecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaModificarParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaCancelarParametroContabilidadDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroContabilidadDefecto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroContabilidadDefectoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=true;
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=true;
		} else {
			this.actualizarEstadoPanelsParametroContabilidadDefecto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroContabilidadDefecto=false;
			//this.isVisibilidadCeldaVerFormParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaDuplicarParametroContabilidadDefecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroContabilidadDefecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
			if(!parametrocontabilidaddefectoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=false;												
			}
			
			this.jButtonCerrarParametroContabilidadDefecto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroContabilidadDefecto=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrocontabilidaddefecto)) {
			this.isVisibilidadCeldaActualizarParametroContabilidadDefecto=false;
			this.isVisibilidadCeldaEliminarParametroContabilidadDefecto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroContabilidadDefecto() {
	}
	
	public void actualizarEstadoPanelsParametroContabilidadDefecto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContabilidadDefecto!=null) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosParametroContabilidadDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroContabilidadDefecto!=null) {
				this.jPanelPaginacionParametroContabilidadDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroContabilidadDefecto!=null) {
				this.jPanelParametrosReportesParametroContabilidadDefecto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContabilidadDefecto!=null) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosParametroContabilidadDefecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroContabilidadDefecto!=null) {
				this.jPanelPaginacionParametroContabilidadDefecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroContabilidadDefecto!=null) {
				this.jPanelParametrosReportesParametroContabilidadDefecto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContabilidadDefecto!=null) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosParametroContabilidadDefecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroContabilidadDefecto!=null) {
				this.jPanelPaginacionParametroContabilidadDefecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroContabilidadDefecto!=null) {
				this.jPanelParametrosReportesParametroContabilidadDefecto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContabilidadDefecto!=null) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosParametroContabilidadDefecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroContabilidadDefecto!=null) {
				this.jPanelPaginacionParametroContabilidadDefecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroContabilidadDefecto!=null) {
				this.jPanelParametrosReportesParametroContabilidadDefecto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContabilidadDefecto!=null) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosParametroContabilidadDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroContabilidadDefecto!=null) {
				this.jPanelPaginacionParametroContabilidadDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroContabilidadDefecto!=null) {
				this.jPanelParametrosReportesParametroContabilidadDefecto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContabilidadDefecto!=null) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosParametroContabilidadDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroContabilidadDefecto!=null) {
				this.jPanelPaginacionParametroContabilidadDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroContabilidadDefecto!=null) {
				this.jPanelParametrosReportesParametroContabilidadDefecto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroContabilidadDefecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContabilidadDefecto!=null) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroContabilidadDefecto!=null) {
				this.jScrollPanelDatosParametroContabilidadDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroContabilidadDefecto!=null) {
				this.jPanelPaginacionParametroContabilidadDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroContabilidadDefecto!=null) {
				this.jPanelParametrosReportesParametroContabilidadDefecto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroContabilidadDefecto!=null) {
					this.jTabbedPaneBusquedasParametroContabilidadDefecto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroContabilidadDefecto!=null) {
				this.jPanelParametrosReportesParametroContabilidadDefecto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroContabilidadDefecto!=null) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroContabilidadDefecto!=null) {
				this.jPanelParametrosReportesParametroContabilidadDefecto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEstadoAsientoContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoAsientoContable) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdModulo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdModuloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoDocumento=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoDocumento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMoneda=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoMoneda) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMonedaParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdEstadoAsientoContable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoAsientoContable) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdModulo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdModuloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoDocumento=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoDocumento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMoneda=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoMoneda) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMonedaParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMoneda(Boolean isParaTipoMoneda){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMonedaNegation=!isParaTipoMoneda;

			this.isVisibilidadFK_IdEstadoAsientoContable=isParaTipoMonedaNegation;
			if(!this.isVisibilidadFK_IdEstadoAsientoContable) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdModulo=isParaTipoMonedaNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdModuloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoDocumento=isParaTipoMonedaNegation;
			if(!this.isVisibilidadFK_IdTipoDocumento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaTipoMonedaNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMoneda=isParaTipoMoneda;
			if(!this.isVisibilidadFK_IdTipoMoneda) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMonedaParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaTipoMonedaNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaMoneda(Boolean isParaMoneda){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMonedaNegation=!isParaMoneda;

			this.isVisibilidadFK_IdEstadoAsientoContable=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdEstadoAsientoContable) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdModulo=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdModuloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoDocumento=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdTipoDocumento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMoneda=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdTipoMoneda) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMonedaParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdEstadoAsientoContable=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdEstadoAsientoContable) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdModulo=isParaModulo;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdModuloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoDocumento=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoDocumento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMoneda=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoMoneda) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMonedaParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoIntervalo(Boolean isParaTipoIntervalo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoIntervaloNegation=!isParaTipoIntervalo;

			this.isVisibilidadFK_IdEstadoAsientoContable=isParaTipoIntervaloNegation;
			if(!this.isVisibilidadFK_IdEstadoAsientoContable) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdModulo=isParaTipoIntervaloNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdModuloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoDocumento=isParaTipoIntervaloNegation;
			if(!this.isVisibilidadFK_IdTipoDocumento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaTipoIntervalo;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMoneda=isParaTipoIntervaloNegation;
			if(!this.isVisibilidadFK_IdTipoMoneda) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMonedaParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaTipoIntervaloNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadFK_IdEstadoAsientoContable=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadFK_IdEstadoAsientoContable) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdModulo=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdModuloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoDocumento=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadFK_IdTipoDocumento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMoneda=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadFK_IdTipoMoneda) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMonedaParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaTipoMovimiento;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDocumento(Boolean isParaTipoDocumento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDocumentoNegation=!isParaTipoDocumento;

			this.isVisibilidadFK_IdEstadoAsientoContable=isParaTipoDocumentoNegation;
			if(!this.isVisibilidadFK_IdEstadoAsientoContable) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdModulo=isParaTipoDocumentoNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdModuloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoDocumento=isParaTipoDocumento;
			if(!this.isVisibilidadFK_IdTipoDocumento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaTipoDocumentoNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMoneda=isParaTipoDocumentoNegation;
			if(!this.isVisibilidadFK_IdTipoMoneda) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMonedaParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaTipoDocumentoNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoAsientoContable(Boolean isParaEstadoAsientoContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoAsientoContableNegation=!isParaEstadoAsientoContable;

			this.isVisibilidadFK_IdEstadoAsientoContable=isParaEstadoAsientoContable;
			if(!this.isVisibilidadFK_IdEstadoAsientoContable) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdModulo=isParaEstadoAsientoContableNegation;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdModuloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoDocumento=isParaEstadoAsientoContableNegation;
			if(!this.isVisibilidadFK_IdTipoDocumento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoIntervalo=isParaEstadoAsientoContableNegation;
			if(!this.isVisibilidadFK_IdTipoIntervalo) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMoneda=isParaEstadoAsientoContableNegation;
			if(!this.isVisibilidadFK_IdTipoMoneda) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMonedaParametroContabilidadDefecto);}

			this.isVisibilidadFK_IdTipoMovimiento=isParaEstadoAsientoContableNegation;
			if(!this.isVisibilidadFK_IdTipoMovimiento) {this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroContabilidadDefectoSessionBean parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		
		if(this.parametrocontabilidaddefectoSessionBean==null) {
			this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		}
		
		this.parametrocontabilidaddefectoSessionBean.setsUltimaBusquedaParametroContabilidadDefecto(this.getsAccionBusqueda());
		this.parametrocontabilidaddefectoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametrocontabilidaddefectoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametrocontabilidaddefectoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoAsientoContable")) {
			parametrocontabilidaddefectoSessionBean.setid_estado_asiento_contable(this.getid_estado_asiento_contableFK_IdEstadoAsientoContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			parametrocontabilidaddefectoSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMoneda")) {
			parametrocontabilidaddefectoSessionBean.setid_moneda(this.getid_monedaFK_IdMoneda());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			parametrocontabilidaddefectoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoDocumento")) {
			parametrocontabilidaddefectoSessionBean.setid_tipo_documento(this.getid_tipo_documentoFK_IdTipoDocumento());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoIntervalo")) {
			parametrocontabilidaddefectoSessionBean.setid_tipo_intervalo(this.getid_tipo_intervaloFK_IdTipoIntervalo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoMoneda")) {
			parametrocontabilidaddefectoSessionBean.setid_tipo_moneda(this.getid_tipo_monedaFK_IdTipoMoneda());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoMovimiento")) {
			parametrocontabilidaddefectoSessionBean.setid_tipo_movimiento(this.getid_tipo_movimientoFK_IdTipoMovimiento());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroContabilidadDefectoSessionBean parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		
		if(this.parametrocontabilidaddefectoSessionBean==null) {
			this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		}
		
		if(this.parametrocontabilidaddefectoSessionBean.getsUltimaBusquedaParametroContabilidadDefecto()!=null&&!this.parametrocontabilidaddefectoSessionBean.getsUltimaBusquedaParametroContabilidadDefecto().equals("")) {
			this.setsAccionBusqueda(parametrocontabilidaddefectoSessionBean.getsUltimaBusquedaParametroContabilidadDefecto());
			this.setiNumeroPaginacion(parametrocontabilidaddefectoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametrocontabilidaddefectoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametrocontabilidaddefectoSessionBean.getid_empresa());
				parametrocontabilidaddefectoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoAsientoContable")) {
				this.setid_estado_asiento_contableFK_IdEstadoAsientoContable(parametrocontabilidaddefectoSessionBean.getid_estado_asiento_contable());
				parametrocontabilidaddefectoSessionBean.setid_estado_asiento_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(parametrocontabilidaddefectoSessionBean.getid_modulo());
				parametrocontabilidaddefectoSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMoneda")) {
				this.setid_monedaFK_IdMoneda(parametrocontabilidaddefectoSessionBean.getid_moneda());
				parametrocontabilidaddefectoSessionBean.setid_moneda(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(parametrocontabilidaddefectoSessionBean.getid_sucursal());
				parametrocontabilidaddefectoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoDocumento")) {
				this.setid_tipo_documentoFK_IdTipoDocumento(parametrocontabilidaddefectoSessionBean.getid_tipo_documento());
				parametrocontabilidaddefectoSessionBean.setid_tipo_documento(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoIntervalo")) {
				this.setid_tipo_intervaloFK_IdTipoIntervalo(parametrocontabilidaddefectoSessionBean.getid_tipo_intervalo());
				parametrocontabilidaddefectoSessionBean.setid_tipo_intervalo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoMoneda")) {
				this.setid_tipo_monedaFK_IdTipoMoneda(parametrocontabilidaddefectoSessionBean.getid_tipo_moneda());
				parametrocontabilidaddefectoSessionBean.setid_tipo_moneda(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoMovimiento")) {
				this.setid_tipo_movimientoFK_IdTipoMovimiento(parametrocontabilidaddefectoSessionBean.getid_tipo_movimiento());
				parametrocontabilidaddefectoSessionBean.setid_tipo_movimiento(-1L);
			}
		}
		
		this.parametrocontabilidaddefectoSessionBean.setsUltimaBusquedaParametroContabilidadDefecto("");
		this.parametrocontabilidaddefectoSessionBean.setiNumeroPaginacion(ParametroContabilidadDefectoConstantesFunciones.INUMEROPAGINACION);
		this.parametrocontabilidaddefectoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroContabilidadDefecto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroContabilidadDefecto() {
		this.updateBorderResaltarBusquedasFormularioParametroContabilidadDefecto();
		this.updateVisibilidadBusquedasFormularioParametroContabilidadDefecto();
		this.updateHabilitarBusquedasFormularioParametroContabilidadDefecto();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroContabilidadDefecto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponents().length>0) {
	

		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdEstadoAsientoContableParametroContabilidadDefecto!=null) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdEstadoAsientoContableParametroContabilidadDefecto);
			}
		}

		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdModuloParametroContabilidadDefecto!=null) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdModuloParametroContabilidadDefecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdModuloParametroContabilidadDefecto);
			}
		}

		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoDocumentoParametroContabilidadDefecto!=null) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoDocumentoParametroContabilidadDefecto);
			}
		}

		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoIntervaloParametroContabilidadDefecto!=null) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoIntervaloParametroContabilidadDefecto);
			}
		}

		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoMonedaParametroContabilidadDefecto!=null) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoMonedaParametroContabilidadDefecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoMonedaParametroContabilidadDefecto);
			}
		}

		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoMovimientoParametroContabilidadDefecto!=null) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoMovimientoParametroContabilidadDefecto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroContabilidadDefecto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdEstadoAsientoContableParametroContabilidadDefecto);
			if(!this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdEstadoAsientoContableParametroContabilidadDefecto && index>-1) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdModuloParametroContabilidadDefecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdModuloParametroContabilidadDefecto);
			if(!this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdModuloParametroContabilidadDefecto && index>-1) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdTipoDocumentoParametroContabilidadDefecto);
			if(!this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdTipoDocumentoParametroContabilidadDefecto && index>-1) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdTipoIntervaloParametroContabilidadDefecto);
			if(!this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdTipoIntervaloParametroContabilidadDefecto && index>-1) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoMonedaParametroContabilidadDefecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdTipoMonedaParametroContabilidadDefecto);
			if(!this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdTipoMonedaParametroContabilidadDefecto && index>-1) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdTipoMovimientoParametroContabilidadDefecto);
			if(!this.parametrocontabilidaddefectoConstantesFunciones.mostrarFK_IdTipoMovimientoParametroContabilidadDefecto && index>-1) {
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroContabilidadDefecto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdEstadoAsientoContableParametroContabilidadDefecto);
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setEnabledAt(index,this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdEstadoAsientoContableParametroContabilidadDefecto);
			}

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdModuloParametroContabilidadDefecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdModuloParametroContabilidadDefecto);
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setEnabledAt(index,this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdModuloParametroContabilidadDefecto);
			}

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdTipoDocumentoParametroContabilidadDefecto);
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setEnabledAt(index,this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdTipoDocumentoParametroContabilidadDefecto);
			}

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdTipoIntervaloParametroContabilidadDefecto);
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setEnabledAt(index,this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdTipoIntervaloParametroContabilidadDefecto);
			}

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoMonedaParametroContabilidadDefecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdTipoMonedaParametroContabilidadDefecto);
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setEnabledAt(index,this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdTipoMonedaParametroContabilidadDefecto);
			}

			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdTipoMovimientoParametroContabilidadDefecto);
				this.jTabbedPaneBusquedasParametroContabilidadDefecto.setEnabledAt(index,this.parametrocontabilidaddefectoConstantesFunciones.activarFK_IdTipoMovimientoParametroContabilidadDefecto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroContabilidadDefecto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEstadoAsientoContable")) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdEstadoAsientoContableParametroContabilidadDefecto);

			this.jTabbedPaneBusquedasParametroContabilidadDefecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);

			this.parametrocontabilidaddefectoConstantesFunciones.setResaltarFK_IdEstadoAsientoContableParametroContabilidadDefecto(resaltar);

			jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdEstadoAsientoContableParametroContabilidadDefecto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdModulo")) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdModuloParametroContabilidadDefecto);

			this.jTabbedPaneBusquedasParametroContabilidadDefecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);

			this.parametrocontabilidaddefectoConstantesFunciones.setResaltarFK_IdModuloParametroContabilidadDefecto(resaltar);

			jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdModuloParametroContabilidadDefecto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoDocumento")) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoDocumentoParametroContabilidadDefecto);

			this.jTabbedPaneBusquedasParametroContabilidadDefecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);

			this.parametrocontabilidaddefectoConstantesFunciones.setResaltarFK_IdTipoDocumentoParametroContabilidadDefecto(resaltar);

			jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoDocumentoParametroContabilidadDefecto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoIntervalo")) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoIntervaloParametroContabilidadDefecto);

			this.jTabbedPaneBusquedasParametroContabilidadDefecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);

			this.parametrocontabilidaddefectoConstantesFunciones.setResaltarFK_IdTipoIntervaloParametroContabilidadDefecto(resaltar);

			jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoIntervaloParametroContabilidadDefecto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoMoneda")) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoMonedaParametroContabilidadDefecto);

			this.jTabbedPaneBusquedasParametroContabilidadDefecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);

			this.parametrocontabilidaddefectoConstantesFunciones.setResaltarFK_IdTipoMonedaParametroContabilidadDefecto(resaltar);

			jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoMonedaParametroContabilidadDefecto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoMovimiento")) {
			index= this.jTabbedPaneBusquedasParametroContabilidadDefecto.indexOfComponent(this.jPanelFK_IdTipoMovimientoParametroContabilidadDefecto);

			this.jTabbedPaneBusquedasParametroContabilidadDefecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroContabilidadDefecto.getComponent(index);

			this.parametrocontabilidaddefectoConstantesFunciones.setResaltarFK_IdTipoMovimientoParametroContabilidadDefecto(resaltar);

			jPanel.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarFK_IdTipoMovimientoParametroContabilidadDefecto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParametroContabilidadDefecto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroContabilidadDefecto() throws Exception {

		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroContabilidadDefecto();
		this.updateVisibilidadResaltarControlesFormularioParametroContabilidadDefecto();
		this.updateHabilitarResaltarControlesFormularioParametroContabilidadDefecto();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroContabilidadDefecto() throws Exception {
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltaridParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelidParametroContabilidadDefecto.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltaridParametroContabilidadDefecto);}
		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_empresaParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_empresaParametroContabilidadDefecto);}
		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_sucursalParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_sucursalParametroContabilidadDefecto);}
		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_monedaParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_monedaParametroContabilidadDefecto);}
		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_monedaParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_monedaParametroContabilidadDefecto);}
		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_moduloParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_moduloParametroContabilidadDefecto);}
		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_intervaloParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_intervaloParametroContabilidadDefecto);}
		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_movimientoParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_movimientoParametroContabilidadDefecto);}
		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_documentoParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_tipo_documentoParametroContabilidadDefecto);}
		if(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_estado_asiento_contableParametroContabilidadDefecto!=null && this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setBorder(this.parametrocontabilidaddefectoConstantesFunciones.resaltarid_estado_asiento_contableParametroContabilidadDefecto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroContabilidadDefecto() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
	
		//this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelidParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostraridParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelidParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostraridParametroContabilidadDefecto);
		//this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_empresaParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelid_empresaParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_empresaParametroContabilidadDefecto);
		//this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_sucursalParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelid_sucursalParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_sucursalParametroContabilidadDefecto);
		//this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_monedaParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelid_tipo_monedaParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_monedaParametroContabilidadDefecto);
		//this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_monedaParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelid_monedaParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_monedaParametroContabilidadDefecto);
		//this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_moduloParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelid_moduloParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_moduloParametroContabilidadDefecto);
		//this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_intervaloParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelid_tipo_intervaloParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_intervaloParametroContabilidadDefecto);
		//this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_movimientoParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelid_tipo_movimientoParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_movimientoParametroContabilidadDefecto);
		//this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_documentoParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelid_tipo_documentoParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_tipo_documentoParametroContabilidadDefecto);
		//this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_estado_asiento_contableParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jPanelid_estado_asiento_contableParametroContabilidadDefecto.setVisible(this.parametrocontabilidaddefectoConstantesFunciones.mostrarid_estado_asiento_contableParametroContabilidadDefecto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroContabilidadDefecto() throws Exception {
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroContabilidadDefecto!=null) {
	
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jLabelidParametroContabilidadDefecto.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activaridParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_empresaParametroContabilidadDefecto.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarid_empresaParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_sucursalParametroContabilidadDefecto.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarid_sucursalParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_monedaParametroContabilidadDefecto.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_monedaParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_monedaParametroContabilidadDefecto.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarid_monedaParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_moduloParametroContabilidadDefecto.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarid_moduloParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_intervaloParametroContabilidadDefecto.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_intervaloParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_movimientoParametroContabilidadDefecto.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_movimientoParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_tipo_documentoParametroContabilidadDefecto.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarid_tipo_documentoParametroContabilidadDefecto);
		this.jInternalFrameDetalleFormParametroContabilidadDefecto.jComboBoxid_estado_asiento_contableParametroContabilidadDefecto.setEnabled(this.parametrocontabilidaddefectoConstantesFunciones.activarid_estado_asiento_contableParametroContabilidadDefecto);
		}
	}
	
		
}