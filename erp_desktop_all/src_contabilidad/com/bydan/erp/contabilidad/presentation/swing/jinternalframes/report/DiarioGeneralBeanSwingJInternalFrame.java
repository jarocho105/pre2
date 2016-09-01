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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.contabilidad.util.DiarioGeneralConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.DiarioGeneralParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.DiarioGeneralParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.DiarioGeneralBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.contabilidad.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.contabilidad.util.*;

import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.contabilidad.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.report.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;

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
public class DiarioGeneralBeanSwingJInternalFrame extends DiarioGeneralJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DiarioGeneralBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DiarioGeneral> diariogeneralValidator = new ClassValidator<DiarioGeneral>(DiarioGeneral.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DiarioGeneral diariogeneral;	
	public DiarioGeneral diariogeneralAux;
	public DiarioGeneral diariogeneralAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DiarioGeneral diariogeneralTotales;
	public Long idDiarioGeneralActual;
	public Long iIdNuevoDiarioGeneral=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
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

	public String sFinalQueryComboAsientoContable="";

	public List<AsientoContable> asientocontablesForeignKey;

	public List<AsientoContable> getasientocontablesForeignKey() {
		return asientocontablesForeignKey;
	}

	public void setasientocontablesForeignKey(List<AsientoContable> asientocontablesForeignKey) {
		this.asientocontablesForeignKey = asientocontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public AsientoContable asientocontableForeignKey;

	public AsientoContable getasientocontableForeignKey() {
		return asientocontableForeignKey;
	}

	public void setasientocontableForeignKey(AsientoContable asientocontableForeignKey) {
		this.asientocontableForeignKey = asientocontableForeignKey;
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
	
	public Boolean isPermisoTodoDiarioGeneral;
	public Boolean isPermisoNuevoDiarioGeneral;
	public Boolean isPermisoActualizarDiarioGeneral;
	public Boolean isPermisoActualizarOriginalDiarioGeneral;
	public Boolean isPermisoEliminarDiarioGeneral;
	public Boolean isPermisoGuardarCambiosDiarioGeneral;
	public Boolean isPermisoConsultaDiarioGeneral;
	public Boolean isPermisoBusquedaDiarioGeneral;
	public Boolean isPermisoReporteDiarioGeneral;
	public Boolean isPermisoPaginacionMedioDiarioGeneral;
	public Boolean isPermisoPaginacionAltoDiarioGeneral;
	public Boolean isPermisoPaginacionTodoDiarioGeneral;
	public Boolean isPermisoCopiarDiarioGeneral;
	public Boolean isPermisoVerFormDiarioGeneral;
	public Boolean isPermisoDuplicarDiarioGeneral;
	public Boolean isPermisoOrdenDiarioGeneral;
	
	
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
	
	public DiarioGeneralParameterReturnGeneral diariogeneralReturnGeneral;
	public DiarioGeneralParameterReturnGeneral diariogeneralParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDiarioGeneral=false;
	public Boolean esParaAccionDesdeFormularioDiarioGeneral=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DiarioGeneralSessionBeanAdditional diariogeneralSessionBeanAdditional=null;
	
	public DiarioGeneralSessionBeanAdditional getDiarioGeneralSessionBeanAdditional() {
		return this.diariogeneralSessionBeanAdditional;
	}
	
	public void setDiarioGeneralSessionBeanAdditional(DiarioGeneralSessionBeanAdditional diariogeneralSessionBeanAdditional) {
		try {
			this.diariogeneralSessionBeanAdditional=diariogeneralSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DiarioGeneralBeanSwingJInternalFrameAdditional diariogeneralBeanSwingJInternalFrameAdditional=null;
	//public class DiarioGeneralBeanSwingJInternalFrame
	
	public DiarioGeneralBeanSwingJInternalFrameAdditional getDiarioGeneralBeanSwingJInternalFrameAdditional() {
		return this.diariogeneralBeanSwingJInternalFrameAdditional;
	}
	
	public void setDiarioGeneralBeanSwingJInternalFrameAdditional(DiarioGeneralBeanSwingJInternalFrameAdditional diariogeneralBeanSwingJInternalFrameAdditional) {
		try {
			this.diariogeneralBeanSwingJInternalFrameAdditional=diariogeneralBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DiarioGeneralLogic diariogeneralLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DiarioGeneral diariogeneralBean;
	public DiarioGeneralConstantesFunciones diariogeneralConstantesFunciones;
	//public DiarioGeneralParameterReturnGeneral diariogeneralReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public ModuloLogic moduloLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	public TipoDocumentoLogic tipodocumentoLogic;
	public AsientoContableLogic asientocontableLogic;
	
	//PARAMETROS
	
	
	//public List<DiarioGeneral> diariogenerals;	
	//public List<DiarioGeneral> diariogeneralsEliminados;
	//public List<DiarioGeneral> diariogeneralsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDiarioGeneral=false;
	public Boolean isVisibilidadCeldaDuplicarDiarioGeneral=true;
	public Boolean isVisibilidadCeldaCopiarDiarioGeneral=true;
	public Boolean isVisibilidadCeldaVerFormDiarioGeneral=true;
	public Boolean isVisibilidadCeldaOrdenDiarioGeneral=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDiarioGeneral=false;
	public Boolean isVisibilidadCeldaModificarDiarioGeneral=false;
	public Boolean isVisibilidadCeldaActualizarDiarioGeneral=false;
	public Boolean isVisibilidadCeldaEliminarDiarioGeneral=false;
	public Boolean isVisibilidadCeldaCancelarDiarioGeneral=false;
	public Boolean isVisibilidadCeldaGuardarDiarioGeneral=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDiarioGeneral=false;	
	
	
	public Boolean isVisibilidadBusquedaReporte=false;
	public Boolean isVisibilidadFK_IdAsientoContable=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoDocumento=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoDiarioGeneral() {
		return this.iIdNuevoDiarioGeneral;
	}

	public void setiIdNuevoDiarioGeneral(Long iIdNuevoDiarioGeneral) {
		this.iIdNuevoDiarioGeneral = iIdNuevoDiarioGeneral;
	}
	
	public Long getidDiarioGeneralActual() {
		return this.idDiarioGeneralActual;
	}

	public void setidDiarioGeneralActual(Long idDiarioGeneralActual) {
		this.idDiarioGeneralActual = idDiarioGeneralActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DiarioGeneral getdiariogeneral() {
		return this.diariogeneral;
	}

	public void setdiariogeneral(DiarioGeneral diariogeneral) {
		this.diariogeneral = diariogeneral;
	}
	
	public DiarioGeneral getdiariogeneralAux() {
		return this.diariogeneralAux;
	}

	public void setdiariogeneralAux(DiarioGeneral diariogeneralAux) {
		this.diariogeneralAux = diariogeneralAux;
	}				
	
	public DiarioGeneral getdiariogeneralAnterior() {
		return this.diariogeneralAnterior;
	}

	public void setdiariogeneralAnterior(DiarioGeneral diariogeneralAnterior) {
		this.diariogeneralAnterior = diariogeneralAnterior;
	}	
	
	public DiarioGeneral getdiariogeneralTotales() {
		return this.diariogeneralTotales;
	}

	public void setdiariogeneralTotales(DiarioGeneral diariogeneralTotales) {
		this.diariogeneralTotales = diariogeneralTotales;
	}	
	
	public DiarioGeneral getdiariogeneralBean() {
		return this.diariogeneralBean;
	}

	public void setdiariogeneralBean(DiarioGeneral diariogeneralBean) {
		this.diariogeneralBean = diariogeneralBean;
	}	
	
	public DiarioGeneralParameterReturnGeneral getdiariogeneralReturnGeneral() {
		return this.diariogeneralReturnGeneral;
	}

	public void setdiariogeneralReturnGeneral(DiarioGeneralParameterReturnGeneral diariogeneralReturnGeneral) {
		this.diariogeneralReturnGeneral = diariogeneralReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaReporte=-1L;

	public Long getid_ejercicioBusquedaReporte() {
		return this.id_ejercicioBusquedaReporte;
	}

	public void setid_ejercicioBusquedaReporte(Long id_ejercicioBusquedaReporte) {
		this.id_ejercicioBusquedaReporte = id_ejercicioBusquedaReporte;
	}

;
	public Long id_periodoBusquedaReporte=-1L;

	public Long getid_periodoBusquedaReporte() {
		return this.id_periodoBusquedaReporte;
	}

	public void setid_periodoBusquedaReporte(Long id_periodoBusquedaReporte) {
		this.id_periodoBusquedaReporte = id_periodoBusquedaReporte;
	}

;
	public Long id_moduloBusquedaReporte=-1L;

	public Long getid_moduloBusquedaReporte() {
		return this.id_moduloBusquedaReporte;
	}

	public void setid_moduloBusquedaReporte(Long id_moduloBusquedaReporte) {
		this.id_moduloBusquedaReporte = id_moduloBusquedaReporte;
	}

;
	public Long id_tipo_movimientoBusquedaReporte=-1L;

	public Long getid_tipo_movimientoBusquedaReporte() {
		return this.id_tipo_movimientoBusquedaReporte;
	}

	public void setid_tipo_movimientoBusquedaReporte(Long id_tipo_movimientoBusquedaReporte) {
		this.id_tipo_movimientoBusquedaReporte = id_tipo_movimientoBusquedaReporte;
	}

;
	public Long id_tipo_documentoBusquedaReporte=-1L;

	public Long getid_tipo_documentoBusquedaReporte() {
		return this.id_tipo_documentoBusquedaReporte;
	}

	public void setid_tipo_documentoBusquedaReporte(Long id_tipo_documentoBusquedaReporte) {
		this.id_tipo_documentoBusquedaReporte = id_tipo_documentoBusquedaReporte;
	}

;
	public Date fecha_inicioBusquedaReporte=new Date();

	public Date getfecha_inicioBusquedaReporte() {
		return this.fecha_inicioBusquedaReporte;
	}

	public void setfecha_inicioBusquedaReporte(Date fecha_inicioBusquedaReporte) {
		this.fecha_inicioBusquedaReporte = fecha_inicioBusquedaReporte;
	}

;
	public Date fecha_finBusquedaReporte=new Date();

	public Date getfecha_finBusquedaReporte() {
		return this.fecha_finBusquedaReporte;
	}

	public void setfecha_finBusquedaReporte(Date fecha_finBusquedaReporte) {
		this.fecha_finBusquedaReporte = fecha_finBusquedaReporte;
	}

	public Long id_asiento_contableFK_IdAsientoContable=-1L;

	public Long getid_asiento_contableFK_IdAsientoContable() {
		return this.id_asiento_contableFK_IdAsientoContable;
	}

	public void setid_asiento_contableFK_IdAsientoContable(Long id_asiento_contableFK_IdAsientoContable) {
		this.id_asiento_contableFK_IdAsientoContable = id_asiento_contableFK_IdAsientoContable;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
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

	public Long id_tipo_movimientoFK_IdTipoMovimiento=-1L;

	public Long getid_tipo_movimientoFK_IdTipoMovimiento() {
		return this.id_tipo_movimientoFK_IdTipoMovimiento;
	}

	public void setid_tipo_movimientoFK_IdTipoMovimiento(Long id_tipo_movimientoFK_IdTipoMovimiento) {
		this.id_tipo_movimientoFK_IdTipoMovimiento = id_tipo_movimientoFK_IdTipoMovimiento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DiarioGeneralLogic getDiarioGeneralLogic()	{		
		return diariogeneralLogic;
	}

	public void setDiarioGeneralLogic(DiarioGeneralLogic diariogeneralLogic) {
		this.diariogeneralLogic = diariogeneralLogic;
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
	
	public Boolean getIsEsNuevoDiarioGeneral() {
		return isEsNuevoDiarioGeneral;
	}

	public void setIsEsNuevoDiarioGeneral(Boolean isEsNuevoDiarioGeneral) {
		this.isEsNuevoDiarioGeneral = isEsNuevoDiarioGeneral;
	}

	public Boolean getEsParaAccionDesdeFormularioDiarioGeneral() {
		return esParaAccionDesdeFormularioDiarioGeneral;
	}
	
	public void setEsParaAccionDesdeFormularioDiarioGeneral(Boolean esParaAccionDesdeFormularioDiarioGeneral) {
		this.esParaAccionDesdeFormularioDiarioGeneral = esParaAccionDesdeFormularioDiarioGeneral;
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

			if(this.diariogeneralSessionBean==null) {
				this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
			}

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(diariogeneralSessionBean.getlidEmpresaActual());
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

			if(this.diariogeneralSessionBean==null) {
				this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
			}

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(diariogeneralSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.diariogeneralSessionBean==null) {
				this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
			}

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(diariogeneralSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.diariogeneralSessionBean==null) {
				this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
			}

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(diariogeneralSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

			if(this.diariogeneralSessionBean==null) {
				this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
			}

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
					moduloLogic.getEntityWithConnection(diariogeneralSessionBean.getlidModuloActual());
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

			if(this.diariogeneralSessionBean==null) {
				this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
			}

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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
					tipomovimientoLogic.getEntityWithConnection(diariogeneralSessionBean.getlidTipoMovimientoActual());
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

			if(this.diariogeneralSessionBean==null) {
				this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
			}

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
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
					tipodocumentoLogic.getEntityWithConnection(diariogeneralSessionBean.getlidTipoDocumentoActual());
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

	public void cargarCombosAsientoContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AsientoContableLogic asientocontableLogic=new AsientoContableLogic();

			//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

			if(this.diariogeneralSessionBean==null) {
				this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
			}

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//asientocontableLogic.getAsientoContableDataAccess().setIsForForeingKeyData(true);

					asientocontableLogic.getTodosAsientoContablesWithConnection(sFinalQuery,new Pagination());

					this.asientocontablesForeignKey=asientocontableLogic.getAsientoContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAsientoContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					asientocontableLogic.getEntityWithConnection(diariogeneralSessionBean.getlidAsientoContableActual());
					this.asientocontablesForeignKey.add(asientocontableLogic.getAsientoContable());
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

					if(this.diariogeneral!=null) {
						this.diariogeneral.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDiarioGeneral.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDiarioGeneralGenerico)throws Exception
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
				jComboBoxid_empresaDiarioGeneralGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDiarioGeneralGenerico!=null && jComboBoxid_empresaDiarioGeneralGenerico.getItemCount()>0) {
					jComboBoxid_empresaDiarioGeneralGenerico.setSelectedIndex(0);
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

					if(this.diariogeneral!=null) {
						this.diariogeneral.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDiarioGeneral.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDiarioGeneralGenerico)throws Exception
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
				jComboBoxid_sucursalDiarioGeneralGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDiarioGeneralGenerico!=null && jComboBoxid_sucursalDiarioGeneralGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDiarioGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.diariogeneral!=null) {
						this.diariogeneral.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioDiarioGeneral.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaReporte") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaReporteDiarioGeneral!=null) {
						jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaReporteDiarioGeneral!=null) {
							//jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioDiarioGeneralGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioDiarioGeneralGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioDiarioGeneralGenerico!=null && jComboBoxid_ejercicioDiarioGeneralGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioDiarioGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.diariogeneral!=null) {
						this.diariogeneral.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoDiarioGeneral.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaReporte") || sFormularioTipoBusqueda.equals("Todos")){
					if(periodoTemp!=null && jComboBoxid_periodoBusquedaReporteDiarioGeneral!=null) {
						jComboBoxid_periodoBusquedaReporteDiarioGeneral.setSelectedItem(periodoTemp);
					} else {
						if(jComboBoxid_periodoBusquedaReporteDiarioGeneral!=null) {
							//jComboBoxid_periodoBusquedaReporteDiarioGeneral.setSelectedItem(periodoTemp);
							if(jComboBoxid_periodoBusquedaReporteDiarioGeneral.getItemCount()>0) {
								jComboBoxid_periodoBusquedaReporteDiarioGeneral.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoDiarioGeneralGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoDiarioGeneralGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoDiarioGeneralGenerico!=null && jComboBoxid_periodoDiarioGeneralGenerico.getItemCount()>0) {
					jComboBoxid_periodoDiarioGeneralGenerico.setSelectedIndex(0);
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

					if(this.diariogeneral!=null) {
						this.diariogeneral.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloDiarioGeneral.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaReporte") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaReporteDiarioGeneral!=null) {
						jComboBoxid_moduloBusquedaReporteDiarioGeneral.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaReporteDiarioGeneral!=null) {
							//jComboBoxid_moduloBusquedaReporteDiarioGeneral.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaReporteDiarioGeneral.getItemCount()>0) {
								jComboBoxid_moduloBusquedaReporteDiarioGeneral.setSelectedIndex(0);
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
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloDiarioGeneralGenerico)throws Exception
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
				jComboBoxid_moduloDiarioGeneralGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloDiarioGeneralGenerico!=null && jComboBoxid_moduloDiarioGeneralGenerico.getItemCount()>0) {
					jComboBoxid_moduloDiarioGeneralGenerico.setSelectedIndex(0);
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

					if(this.diariogeneral!=null) {
						this.diariogeneral.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoDiarioGeneral.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaReporte") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral!=null) {
						jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral!=null) {
							//jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.getItemCount()>0) {
								jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.setSelectedIndex(0);
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
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoDiarioGeneralGenerico)throws Exception
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
				jComboBoxid_tipo_movimientoDiarioGeneralGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoDiarioGeneralGenerico!=null && jComboBoxid_tipo_movimientoDiarioGeneralGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoDiarioGeneralGenerico.setSelectedIndex(0);
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

					if(this.diariogeneral!=null) {
						this.diariogeneral.setTipoDocumento(tipodocumentoTemp);
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.setSelectedItem(tipodocumentoTemp);
					}
				} else {
					//jComboBoxid_tipo_documentoDiarioGeneral.setSelectedItem(tipodocumentoTemp);
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaReporte") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodocumentoTemp!=null && jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral!=null) {
						jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.setSelectedItem(tipodocumentoTemp);
					} else {
						if(jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral!=null) {
							//jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.setSelectedItem(tipodocumentoTemp);
							if(jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.getItemCount()>0) {
								jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.setSelectedIndex(0);
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
	public void setActualTipoDocumentoForeignKeyGenerico(Long idTipoDocumentoSeleccionado,JComboBox jComboBoxid_tipo_documentoDiarioGeneralGenerico)throws Exception
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
				jComboBoxid_tipo_documentoDiarioGeneralGenerico.setSelectedItem(tipodocumentoTemp);
			} else {
				if(jComboBoxid_tipo_documentoDiarioGeneralGenerico!=null && jComboBoxid_tipo_documentoDiarioGeneralGenerico.getItemCount()>0) {
					jComboBoxid_tipo_documentoDiarioGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAsientoContableForeignKey(Long idAsientoContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(asientocontableTemp!=null) {

					if(this.diariogeneral!=null) {
						this.diariogeneral.setAsientoContable(asientocontableTemp);
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.setSelectedItem(asientocontableTemp);
					}
				} else {
					//jComboBoxid_asiento_contableDiarioGeneral.setSelectedItem(asientocontableTemp);
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.setSelectedIndex(0);
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

	public String getActualAsientoContableForeignKeyDescripcion(Long idAsientoContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}


			sDescripcion=AsientoContableConstantesFunciones.getAsientoContableDescripcion(asientocontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAsientoContableForeignKeyGenerico(Long idAsientoContableSeleccionado,JComboBox jComboBoxid_asiento_contableDiarioGeneralGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableTemp=null;

			for(AsientoContable asientocontableAux:asientocontablesForeignKey) {
				if(asientocontableAux.getId()!=null && asientocontableAux.getId().equals(idAsientoContableSeleccionado)) {
					asientocontableTemp=asientocontableAux;
					break;
				}
			}

			if(asientocontableTemp!=null) {
				jComboBoxid_asiento_contableDiarioGeneralGenerico.setSelectedItem(asientocontableTemp);
			} else {
				if(jComboBoxid_asiento_contableDiarioGeneralGenerico!=null && jComboBoxid_asiento_contableDiarioGeneralGenerico.getItemCount()>0) {
					jComboBoxid_asiento_contableDiarioGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DiarioGeneral diariogeneral,JComboBox jComboBoxid_empresaDiarioGeneralGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDiarioGeneralGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDiarioGeneralGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				diariogeneral.setid_empresa(empresaAux.getId());
				diariogeneral.setempresa_descripcion(DiarioGeneralConstantesFunciones.getEmpresaDescripcion(empresaAux));
				diariogeneral.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DiarioGeneral diariogeneral,JComboBox jComboBoxid_sucursalDiarioGeneralGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDiarioGeneralGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDiarioGeneralGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				diariogeneral.setid_sucursal(sucursalAux.getId());
				diariogeneral.setsucursal_descripcion(DiarioGeneralConstantesFunciones.getSucursalDescripcion(sucursalAux));
				diariogeneral.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(DiarioGeneral diariogeneral,JComboBox jComboBoxid_ejercicioDiarioGeneralGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioDiarioGeneralGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioDiarioGeneralGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				diariogeneral.setid_ejercicio(ejercicioAux.getId());
				diariogeneral.setejercicio_descripcion(DiarioGeneralConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				diariogeneral.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(DiarioGeneral diariogeneral,JComboBox jComboBoxid_periodoDiarioGeneralGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoDiarioGeneralGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoDiarioGeneralGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				diariogeneral.setid_periodo(periodoAux.getId());
				diariogeneral.setperiodo_descripcion(DiarioGeneralConstantesFunciones.getPeriodoDescripcion(periodoAux));
				diariogeneral.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(DiarioGeneral diariogeneral,JComboBox jComboBoxid_moduloDiarioGeneralGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloDiarioGeneralGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloDiarioGeneralGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				diariogeneral.setid_modulo(moduloAux.getId());
				diariogeneral.setmodulo_descripcion(DiarioGeneralConstantesFunciones.getModuloDescripcion(moduloAux));
				diariogeneral.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(DiarioGeneral diariogeneral,JComboBox jComboBoxid_tipo_movimientoDiarioGeneralGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoDiarioGeneralGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoDiarioGeneralGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				diariogeneral.setid_tipo_movimiento(tipomovimientoAux.getId());
				diariogeneral.settipomovimiento_descripcion(DiarioGeneralConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				diariogeneral.setTipoMovimiento(tipomovimientoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDocumentoForeignKey(DiarioGeneral diariogeneral,JComboBox jComboBoxid_tipo_documentoDiarioGeneralGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoAux=new TipoDocumento();

			if(jComboBoxid_tipo_documentoDiarioGeneralGenerico==null) {
				tipodocumentoAux=(TipoDocumento)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.getSelectedItem();
			} else {
				tipodocumentoAux=(TipoDocumento)jComboBoxid_tipo_documentoDiarioGeneralGenerico.getSelectedItem();
			}

			if(tipodocumentoAux!=null && tipodocumentoAux.getId()!=null) {
				diariogeneral.setid_tipo_documento(tipodocumentoAux.getId());
				diariogeneral.settipodocumento_descripcion(DiarioGeneralConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoAux));
				diariogeneral.setTipoDocumento(tipodocumentoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAsientoContableForeignKey(DiarioGeneral diariogeneral,JComboBox jComboBoxid_asiento_contableDiarioGeneralGenerico)throws Exception
	{
		try
		{
			AsientoContable  asientocontableAux=new AsientoContable();

			if(jComboBoxid_asiento_contableDiarioGeneralGenerico==null) {
				asientocontableAux=(AsientoContable)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.getSelectedItem();
			} else {
				asientocontableAux=(AsientoContable)jComboBoxid_asiento_contableDiarioGeneralGenerico.getSelectedItem();
			}

			if(asientocontableAux!=null && asientocontableAux.getId()!=null) {
				diariogeneral.setid_asiento_contable(asientocontableAux.getId());
				diariogeneral.setasientocontable_descripcion(DiarioGeneralConstantesFunciones.getAsientoContableDescripcion(asientocontableAux));
				diariogeneral.setAsientoContable(asientocontableAux);			}
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

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
					}

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
					}

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
					}

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaReporte") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.addItem(ejercicio);
							}
						}

						if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
					}

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaReporte") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodoBusquedaReporteDiarioGeneral.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jComboBoxid_periodoBusquedaReporteDiarioGeneral.addItem(periodo);
							}
						}

						if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
					}

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaReporte") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaReporteDiarioGeneral.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaReporteDiarioGeneral.addItem(modulo);
							}
						}

						if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
					}

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaReporte") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.addItem(tipomovimiento);
							}
						}

						if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.addItem(tipodocumento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
					}

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaReporte") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.addItem(tipodocumento);
							}
						}

						if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAsientoContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAsientoContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.removeAllItems();

							for(AsientoContable asientocontable:this.asientocontablesForeignKey) {
								this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.addItem(asientocontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { 
					}

					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodoBusquedaReporteDiarioGeneral.setSelectedItem(periodo);
						} else {
							this.jComboBoxid_periodoBusquedaReporteDiarioGeneral.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaReporteDiarioGeneral.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaReporteDiarioGeneral.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.setSelectedItem(tipodocumento);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.setSelectedItem(tipodocumento);
						} else {
							this.jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAsientoContableForeignKey(AsientoContable asientocontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.setSelectedItem(asientocontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesDiarioGeneral() throws Exception {
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
		
	public DiarioGeneralParameterReturnGeneral getDiarioGeneralParameterGeneral() {
		return this.diariogeneralParameterGeneral;
	}
	
	public void setDiarioGeneralParameterGeneral(DiarioGeneralParameterReturnGeneral diariogeneralParameterGeneral) {
		this.diariogeneralParameterGeneral = diariogeneralParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDiarioGeneral() {
		return isPermisoTodoDiarioGeneral;
	}

	public void setIsPermisoTodoDiarioGeneral(Boolean isPermisoTodoDiarioGeneral) {
		this.isPermisoTodoDiarioGeneral = isPermisoTodoDiarioGeneral;
	}

	public Boolean getIsPermisoNuevoDiarioGeneral() {
		return isPermisoNuevoDiarioGeneral;
	}

	public void setIsPermisoNuevoDiarioGeneral(Boolean isPermisoNuevoDiarioGeneral) {
		this.isPermisoNuevoDiarioGeneral = isPermisoNuevoDiarioGeneral;
	}

	public Boolean getIsPermisoActualizarDiarioGeneral() {
		return isPermisoActualizarDiarioGeneral;
	}

	public void setIsPermisoActualizarDiarioGeneral(Boolean isPermisoActualizarDiarioGeneral) {
		this.isPermisoActualizarDiarioGeneral = isPermisoActualizarDiarioGeneral;
	}

	public Boolean getIsPermisoEliminarDiarioGeneral() {
		return isPermisoEliminarDiarioGeneral;
	}

	public void setIsPermisoEliminarDiarioGeneral(Boolean isPermisoEliminarDiarioGeneral) {
		this.isPermisoEliminarDiarioGeneral = isPermisoEliminarDiarioGeneral;
	}

	public Boolean getIsPermisoGuardarCambiosDiarioGeneral() {
		return isPermisoGuardarCambiosDiarioGeneral;
	}

	public void setIsPermisoGuardarCambiosDiarioGeneral(Boolean isPermisoGuardarCambiosDiarioGeneral) {
		this.isPermisoGuardarCambiosDiarioGeneral = isPermisoGuardarCambiosDiarioGeneral;
	}
	
	public Boolean getIsPermisoConsultaDiarioGeneral() {
		return isPermisoConsultaDiarioGeneral;
	}

	public void setIsPermisoConsultaDiarioGeneral(Boolean isPermisoConsultaDiarioGeneral) {
		this.isPermisoConsultaDiarioGeneral = isPermisoConsultaDiarioGeneral;
	}

	public Boolean getIsPermisoBusquedaDiarioGeneral() {
		return isPermisoBusquedaDiarioGeneral;
	}

	public void setIsPermisoBusquedaDiarioGeneral(Boolean isPermisoBusquedaDiarioGeneral) {
		this.isPermisoBusquedaDiarioGeneral = isPermisoBusquedaDiarioGeneral;
	}

	public Boolean getIsPermisoReporteDiarioGeneral() {
		return isPermisoReporteDiarioGeneral;
	}

	public void setIsPermisoReporteDiarioGeneral(Boolean isPermisoReporteDiarioGeneral) {
		this.isPermisoReporteDiarioGeneral = isPermisoReporteDiarioGeneral;
	}
	
	public Boolean getIsPermisoPaginacionMedioDiarioGeneral() {
		return isPermisoPaginacionMedioDiarioGeneral;
	}

	public void setIsPermisoPaginacionMedioDiarioGeneral(Boolean isPermisoPaginacionMedioDiarioGeneral) {
		this.isPermisoPaginacionMedioDiarioGeneral = isPermisoPaginacionMedioDiarioGeneral;
	}
	
	public Boolean getIsPermisoPaginacionTodoDiarioGeneral() {
		return isPermisoPaginacionTodoDiarioGeneral;
	}

	public void setIsPermisoPaginacionTodoDiarioGeneral(Boolean isPermisoPaginacionTodoDiarioGeneral) {
		this.isPermisoPaginacionTodoDiarioGeneral = isPermisoPaginacionTodoDiarioGeneral;
	}
	
	public Boolean getIsPermisoPaginacionAltoDiarioGeneral() {
		return isPermisoPaginacionAltoDiarioGeneral;
	}

	public void setIsPermisoPaginacionAltoDiarioGeneral(Boolean isPermisoPaginacionAltoDiarioGeneral) {
		this.isPermisoPaginacionAltoDiarioGeneral = isPermisoPaginacionAltoDiarioGeneral;
	}
	
	public Boolean getIsPermisoCopiarDiarioGeneral() {
		return isPermisoCopiarDiarioGeneral;
	}

	public void setIsPermisoCopiarDiarioGeneral(Boolean isPermisoCopiarDiarioGeneral) {
		this.isPermisoCopiarDiarioGeneral = isPermisoCopiarDiarioGeneral;
	}
	
	public Boolean getIsPermisoVerFormDiarioGeneral() {
		return isPermisoVerFormDiarioGeneral;
	}

	public void setIsPermisoVerFormDiarioGeneral(Boolean isPermisoVerFormDiarioGeneral) {
		this.isPermisoVerFormDiarioGeneral = isPermisoVerFormDiarioGeneral;
	}
	
	public Boolean getIsPermisoDuplicarDiarioGeneral() {
		return isPermisoDuplicarDiarioGeneral;
	}

	public void setIsPermisoDuplicarDiarioGeneral(Boolean isPermisoDuplicarDiarioGeneral) {
		this.isPermisoDuplicarDiarioGeneral = isPermisoDuplicarDiarioGeneral;
	}
	
	public Boolean getIsPermisoOrdenDiarioGeneral() {
		return isPermisoOrdenDiarioGeneral;
	}

	public void setIsPermisoOrdenDiarioGeneral(Boolean isPermisoOrdenDiarioGeneral) {
		this.isPermisoOrdenDiarioGeneral = isPermisoOrdenDiarioGeneral;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDiarioGeneral() {
		return isVisibilidadCeldaNuevoDiarioGeneral;
	}

	public void setIsVisibilidadCeldaNuevoDiarioGeneral(Boolean isVisibilidadCeldaNuevoDiarioGeneral) {
		this.isVisibilidadCeldaNuevoDiarioGeneral = isVisibilidadCeldaNuevoDiarioGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDiarioGeneral() {
		return isVisibilidadCeldaDuplicarDiarioGeneral;
	}

	public void setIsVisibilidadCeldaDuplicarDiarioGeneral(Boolean isVisibilidadCeldaDuplicarDiarioGeneral) {
		this.isVisibilidadCeldaDuplicarDiarioGeneral = isVisibilidadCeldaDuplicarDiarioGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDiarioGeneral() {
		return isVisibilidadCeldaCopiarDiarioGeneral;
	}

	public void setIsVisibilidadCeldaCopiarDiarioGeneral(Boolean isVisibilidadCeldaCopiarDiarioGeneral) {
		this.isVisibilidadCeldaCopiarDiarioGeneral = isVisibilidadCeldaCopiarDiarioGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDiarioGeneral() {
		return isVisibilidadCeldaVerFormDiarioGeneral;
	}

	public void setIsVisibilidadCeldaVerFormDiarioGeneral(Boolean isVisibilidadCeldaVerFormDiarioGeneral) {
		this.isVisibilidadCeldaVerFormDiarioGeneral = isVisibilidadCeldaVerFormDiarioGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDiarioGeneral() {
		return isVisibilidadCeldaOrdenDiarioGeneral;
	}

	public void setIsVisibilidadCeldaOrdenDiarioGeneral(Boolean isVisibilidadCeldaOrdenDiarioGeneral) {
		this.isVisibilidadCeldaOrdenDiarioGeneral = isVisibilidadCeldaOrdenDiarioGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDiarioGeneral() {
		return isVisibilidadCeldaNuevoRelacionesDiarioGeneral;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDiarioGeneral(Boolean isVisibilidadCeldaNuevoRelacionesDiarioGeneral) {
		this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral = isVisibilidadCeldaNuevoRelacionesDiarioGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDiarioGeneral() {
		return isVisibilidadCeldaModificarDiarioGeneral;
	}

	public void setIsVisibilidadCeldaModificarDiarioGeneral(Boolean isVisibilidadCeldaModificarDiarioGeneral) {
		this.isVisibilidadCeldaModificarDiarioGeneral = isVisibilidadCeldaModificarDiarioGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDiarioGeneral() {
		return isVisibilidadCeldaActualizarDiarioGeneral;
	}

	public void setIsVisibilidadCeldaActualizarDiarioGeneral(Boolean isVisibilidadCeldaActualizarDiarioGeneral) {
		this.isVisibilidadCeldaActualizarDiarioGeneral = isVisibilidadCeldaActualizarDiarioGeneral;
	}

	public Boolean getIsVisibilidadCeldaEliminarDiarioGeneral() {
		return isVisibilidadCeldaEliminarDiarioGeneral;
	}

	public void setIsVisibilidadCeldaEliminarDiarioGeneral(Boolean isVisibilidadCeldaEliminarDiarioGeneral) {
		this.isVisibilidadCeldaEliminarDiarioGeneral = isVisibilidadCeldaEliminarDiarioGeneral;
	}

	public Boolean getIsVisibilidadCeldaCancelarDiarioGeneral() {
		return isVisibilidadCeldaCancelarDiarioGeneral;
	}

	public void setIsVisibilidadCeldaCancelarDiarioGeneral(Boolean isVisibilidadCeldaCancelarDiarioGeneral) {
		this.isVisibilidadCeldaCancelarDiarioGeneral = isVisibilidadCeldaCancelarDiarioGeneral;
	}

	public Boolean getIsVisibilidadCeldaGuardarDiarioGeneral() {
		return isVisibilidadCeldaGuardarDiarioGeneral;
	}

	public void setIsVisibilidadCeldaGuardarDiarioGeneral(Boolean isVisibilidadCeldaGuardarDiarioGeneral) {
		this.isVisibilidadCeldaGuardarDiarioGeneral = isVisibilidadCeldaGuardarDiarioGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDiarioGeneral() {
		return isVisibilidadCeldaGuardarCambiosDiarioGeneral;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDiarioGeneral(Boolean isVisibilidadCeldaGuardarCambiosDiarioGeneral) {
		this.isVisibilidadCeldaGuardarCambiosDiarioGeneral = isVisibilidadCeldaGuardarCambiosDiarioGeneral;
	}
		
	public DiarioGeneralSessionBean getdiariogeneralSessionBean() {
		return this.diariogeneralSessionBean;
	}
	
	public void setdiariogeneralSessionBean(DiarioGeneralSessionBean diariogeneralSessionBean) {
		this.diariogeneralSessionBean=diariogeneralSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaReporte() {
		return this.isVisibilidadBusquedaReporte;
	}

	public void setisVisibilidadBusquedaReporte(Boolean isVisibilidadBusquedaReporte) {
		this.isVisibilidadBusquedaReporte=isVisibilidadBusquedaReporte;
	}

	public Boolean getisVisibilidadFK_IdAsientoContable() {
		return this.isVisibilidadFK_IdAsientoContable;
	}

	public void setisVisibilidadFK_IdAsientoContable(Boolean isVisibilidadFK_IdAsientoContable) {
		this.isVisibilidadFK_IdAsientoContable=isVisibilidadFK_IdAsientoContable;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
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

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(DiarioGeneral diariogeneral)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(diariogeneral,null);
				this.setActualParaGuardarSucursalForeignKey(diariogeneral,null);
				this.setActualParaGuardarEjercicioForeignKey(diariogeneral,null);
				this.setActualParaGuardarPeriodoForeignKey(diariogeneral,null);
				this.setActualParaGuardarModuloForeignKey(diariogeneral,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(diariogeneral,null);
				this.setActualParaGuardarTipoDocumentoForeignKey(diariogeneral,null);
				this.setActualParaGuardarAsientoContableForeignKey(diariogeneral,null);
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
	
	public void bugActualizarReferenciaActual(DiarioGeneral diariogeneral,DiarioGeneral diariogeneralAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDiarioGeneral(diariogeneral);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		diariogeneralAux.setId(diariogeneral.getId());
		diariogeneralAux.setVersionRow(diariogeneral.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(DiarioGeneral diariogeneralLocal) throws Exception {
		
		if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DiarioGeneral diariogeneralLocal) throws Exception {	
		if(this.diariogeneralSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				diariogeneralLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				diariogeneralLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				diariogeneralLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				diariogeneralLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				diariogeneralLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				diariogeneralLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDocumentoDetalleFormJInternalFrame.class)) {
				TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrameLocal=(TipoDocumentoBeanSwingJInternalFrame) ((TipoDocumentoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodocumentoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.gettipodocumento(),true);
				tipodocumentoBeanSwingJInternalFrameLocal.actualizarLista(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento,this.tipodocumentosForeignKey);

				tipodocumentoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				diariogeneralLocal.setTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey("Formulario");
				this.setActualTipoDocumentoForeignKey(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AsientoContableDetalleFormJInternalFrame.class)) {
				AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrameLocal=(AsientoContableBeanSwingJInternalFrame) ((AsientoContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				asientocontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAsientoContable(asientocontableBeanSwingJInternalFrameLocal.getasientocontable(),true);
				asientocontableBeanSwingJInternalFrameLocal.actualizarLista(asientocontableBeanSwingJInternalFrameLocal.asientocontable,this.asientocontablesForeignKey);

				asientocontableBeanSwingJInternalFrameLocal.actualizarRelaciones(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				diariogeneralLocal.setAsientoContable(asientocontableBeanSwingJInternalFrameLocal.asientocontable);

				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey("Formulario");
				this.setActualAsientoContableForeignKey(asientocontableBeanSwingJInternalFrameLocal.asientocontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDiarioGeneralActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = diariogeneralValidator.getInvalidValues(this.diariogeneral);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DiarioGeneral diariogeneral,List<DiarioGeneral> diariogenerals) throws Exception {
	}		
	
	public void actualizarSelectedLista(DiarioGeneral diariogeneral,List<DiarioGeneral> diariogenerals) throws Exception {
		try	{			
			DiarioGeneralConstantesFunciones.actualizarSelectedLista(diariogeneral,diariogenerals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DiarioGeneral> diariogeneralsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				diariogeneralsLocal=this.diariogeneralLogic.getDiarioGenerals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				diariogeneralsLocal=this.diariogenerals;
			}
			//ARCHITECTURE
		
			for(DiarioGeneral diariogeneralLocal:diariogeneralsLocal) {
				if(this.permiteMantenimiento(diariogeneralLocal) && diariogeneralLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DiarioGeneralConstantesFunciones.getDiarioGeneralLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.IDASIENTOCONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelid_asiento_contableDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.TIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabeltipo_movimientoDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelnumero_mayorDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcodigoDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelnombreDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.CODIGOASIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcodigo_asientoDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.DEBITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabeldebito_localDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.CREDITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcredito_localDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.DEBITOEXTRAN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabeldebito_extranDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.CREDITOEXTRAN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcredito_extranDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelfechaDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabeldetalleDiarioGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiarioGeneralConstantesFunciones.NOMBREESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelnombre_estadoDiarioGeneral,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabelid_asiento_contableDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabeltipo_movimientoDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabelnumero_mayorDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcodigoDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabelnombreDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcodigo_asientoDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabeldebito_localDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcredito_localDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabeldebito_extranDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcredito_extranDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabelfechaDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabeldetalleDiarioGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiarioGeneral.jLabelnombre_estadoDiarioGeneral,"");
		
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
		this.iIdNuevoDiarioGeneral--;	
		
		
		this.diariogeneralAux=new DiarioGeneral();
		
		this.diariogeneralAux.setId(this.iIdNuevoDiarioGeneral);
		this.diariogeneralAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.diariogeneralLogic.getDiarioGenerals().add(this.diariogeneralAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.diariogenerals.add(this.diariogeneralAux);
		}
		//ARCHITECTURE
		
		this.diariogeneral=this.diariogeneralAux;
		
		if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDiarioGeneral(this.diariogeneral);
			this.setVariablesObjetoActualToFormularioForeignKeyDiarioGeneral(this.diariogeneral);
		}
				
		//this.setDefaultControlesDiarioGeneral();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDiarioGeneral();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDiarioGeneral();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDiarioGeneral();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDiarioGeneral(this.diariogeneralBean,this.diariogeneral,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDiarioGeneral(this.diariogeneralReturnGeneral,this.diariogeneralBean,false);
		
		if(this.diariogeneralReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDiarioGeneral(this.diariogeneralReturnGeneral.getDiarioGeneral());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDiarioGeneral(this.diariogeneralReturnGeneral.getDiarioGeneral());
		}
		
		if(this.diariogeneralReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDiarioGeneral(this.diariogeneralReturnGeneral.getDiarioGeneral(),classes);//this.diariogeneralBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDiarioGeneral();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDiarioGeneral();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.RecargarFormDiarioGeneral(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDiarioGeneral(false);
						
			if(diariogeneralSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiarioGeneral();
			}
			
			this.actualizarVisualTableDatosDiarioGeneral();
			
			this.jTableDatosDiarioGeneral.setRowSelectionInterval(this.getIndiceNuevoDiarioGeneral(), this.getIndiceNuevoDiarioGeneral());
			
			this.seleccionarFilaTablaDiarioGeneralActual();
						
			this.actualizarEstadoCeldasBotonesDiarioGeneral("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDiarioGeneral(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfecha_inicioDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarfecha_inicioDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfecha_finDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarfecha_finDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextAreatipo_movimientoDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activartipo_movimientoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanumero_mayorDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarnumero_mayorDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigoDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarcodigoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanombreDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarnombreDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigo_asientoDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarcodigo_asientoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_localDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activardebito_localDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_localDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarcredito_localDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_extranDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activardebito_extranDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_extranDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarcredito_extranDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfechaDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarfechaDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextAreadetalleDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activardetalleDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldnombre_estadoDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarnombre_estadoDiarioGeneral);	
		//
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarid_empresaDiarioGeneral);//
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarid_sucursalDiarioGeneral);//
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarid_ejercicioDiarioGeneral);//
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarid_periodoDiarioGeneral);//
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarid_moduloDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarid_tipo_movimientoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarid_tipo_documentoDiarioGeneral);//
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.setEnabled(isHabilitar && this.diariogeneralConstantesFunciones.activarid_asiento_contableDiarioGeneral);
	};
	
	public void setDefaultControlesDiarioGeneral() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDiarioGeneral(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.diariogeneralSessionBean.setConGuardarRelaciones(true);			
			this.diariogeneralSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDiarioGeneral.jTabbedPaneRelacionesDiarioGeneral.setVisible(true);
			
					
		} else {
			//this.diariogeneralSessionBean.setConGuardarRelaciones(false);			
			this.diariogeneralSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDiarioGeneral.jTabbedPaneRelacionesDiarioGeneral.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDiarioGeneral() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiarioGeneral diariogeneralAux:this.diariogeneralLogic.getDiarioGenerals()) {
				if(diariogeneralAux.getId().equals(this.iIdNuevoDiarioGeneral)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiarioGeneral diariogeneralAux:this.diariogenerals) {
				if(diariogeneralAux.getId().equals(this.iIdNuevoDiarioGeneral)) {
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
	
	public int getIndiceActualDiarioGeneral(DiarioGeneral diariogeneral,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiarioGeneral diariogeneralAux:this.diariogeneralLogic.getDiarioGenerals()) {
				if(diariogeneralAux.getId().equals(diariogeneral.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiarioGeneral diariogeneralAux:this.diariogenerals) {
				if(diariogeneralAux.getId().equals(diariogeneral.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDiarioGeneral(DiarioGeneral diariogeneralOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiarioGeneral diariogeneralAux:this.diariogeneralLogic.getDiarioGenerals()) {
				if(diariogeneralAux.getDiarioGeneralOriginal().getId().equals(diariogeneralOriginal.getId())) {
					existe=true;
					diariogeneralOriginal.setId(diariogeneralAux.getId());
					diariogeneralOriginal.setVersionRow(diariogeneralAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiarioGeneral diariogeneralAux:this.diariogenerals) {
				if(diariogeneralAux.getDiarioGeneralOriginal().getId().equals(diariogeneralOriginal.getId())) {
					existe=true;
					diariogeneralOriginal.setId(diariogeneralAux.getId());
					diariogeneralOriginal.setVersionRow(diariogeneralAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDiarioGeneral(Boolean esParaCancelar) throws Exception {
		diariogeneralsAux=new ArrayList<DiarioGeneral>();
		diariogeneralAux=new DiarioGeneral();
		
		if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DiarioGeneral diariogeneralAux:this.diariogeneralLogic.getDiarioGenerals()) {
					if(diariogeneralAux.getId()<0) {
						diariogeneralsAux.add(diariogeneralAux);
					}		
				}
				this.iIdNuevoDiarioGeneral=0L;
				this.diariogeneralLogic.getDiarioGenerals().removeAll(diariogeneralsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiarioGeneral diariogeneralAux:this.diariogenerals) {
					if(diariogeneralAux.getId()<0) {
						diariogeneralsAux.add(diariogeneralAux);
					}		
				}
				this.iIdNuevoDiarioGeneral=0L;
				this.diariogenerals.removeAll(diariogeneralsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDiarioGeneral 
					&& this.diariogeneralLogic.getDiarioGenerals().size()>0
					) {
					diariogeneralAux=this.diariogeneralLogic.getDiarioGenerals().get(this.diariogeneralLogic.getDiarioGenerals().size() - 1);
				
					if(diariogeneralAux.getId()<0) {
						this.diariogeneralLogic.getDiarioGenerals().remove(diariogeneralAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDiarioGeneral && this.diariogenerals.size()>0) {
					diariogeneralAux=this.diariogenerals.get(this.diariogenerals.size() - 1);
				
					if(diariogeneralAux.getId()<0) {
						this.diariogenerals.remove(diariogeneralAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDiarioGeneral(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(diariogeneral.getId()<0) {
				this.diariogeneralLogic.getDiarioGenerals().remove(this.diariogeneral);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(diariogeneral.getId()<0) {
				this.diariogenerals.remove(this.diariogeneral);
			}
		}			
	}
	
	public void setEstadosInicialesDiarioGeneral(List<DiarioGeneral> diariogeneralsAux) throws Exception {
		DiarioGeneralConstantesFunciones.setEstadosInicialesDiarioGeneral(diariogeneralsAux);
	}
	
	public void setEstadosInicialesDiarioGeneral(DiarioGeneral diariogeneralAux) throws Exception {
		DiarioGeneralConstantesFunciones.setEstadosInicialesDiarioGeneral(diariogeneralAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDiarioGeneralActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDiarioGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDiarioGeneralActual()) {
				if(!this.isEsNuevoDiarioGeneral) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDiarioGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDiarioGeneral=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDiarioGeneralActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Diario General ?", "MANTENIMIENTO DE Diario General", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDiarioGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DiarioGeneral diariogeneral) throws Exception {
		DiarioGeneralConstantesFunciones.seleccionarAsignar(this.diariogeneral,diariogeneral);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDiarioGeneral=this.isPermisoActualizarOriginalDiarioGeneral;
			
			
			this.seleccionarAsignar(diariogeneral);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesDiarioGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.diariogeneralSessionBean.setsFuncionBusquedaRapida(this.diariogeneralSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDiarioGeneral) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDiarioGeneral(esParaCancelar);				
				this.cancelarNuevoDiarioGeneral(esParaCancelar);								
			}
			
			this.diariogeneral=new DiarioGeneral();
			
			this.inicializarDiarioGeneral();
			
			this.actualizarEstadoCeldasBotonesDiarioGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDiarioGeneral() throws Exception {
		try {
			DiarioGeneralConstantesFunciones.inicializarDiarioGeneral(this.diariogeneral);
			
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
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.diariogeneralLogic.getDiarioGenerals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDiarioGenerals(String sAccionBusqueda,List<DiarioGeneral> diariogeneralsParaReportes) throws Exception {
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
					sPathReporteFinal="DiarioGeneral"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DiarioGeneralMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DiarioGeneralMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DiarioGeneral"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Diario Generales");		
		parameters.put("busquedapor", DiarioGeneralConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDiarioGeneral=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DiarioGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DiarioGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDiarioGeneral=new JRBeanArrayDataSource(DiarioGeneralJInternalFrame.TraerDiarioGeneralBeans(diariogeneralsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDiarioGeneral);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DiarioGeneralConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DiarioGeneralConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DiarioGeneralBean.TraerDiarioGeneralBeans(diariogeneralsParaReportes).toArray()));
							
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
				this.generarExcelReporteDiarioGenerals(sAccionBusqueda,sTipoArchivoReporte,diariogeneralsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDiarioGenerals(sAccionBusqueda,sTipoArchivoReporte,diariogeneralsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDiarioGeneralActionPerformed(null);
					//this.generarExcelReporteDiarioGenerals(sAccionBusqueda,sTipoArchivoReporte,diariogeneralsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDiarioGenerals(sAccionBusqueda,sTipoArchivoReporte,diariogeneralsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDiarioGenerals(sAccionBusqueda,sTipoArchivoReporte,diariogeneralsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDiarioGenerals(sAccionBusqueda,sTipoArchivoReporte,diariogeneralsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDiarioGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<DiarioGeneral> diariogeneralsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariogeneral";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiarioGenerals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDiarioGeneral("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DiarioGeneral diariogeneral : diariogeneralsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DiarioGeneralConstantesFunciones.generarExcelReporteDataDiarioGeneral("NORMAL",row,workbook,diariogeneral,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diario General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDiarioGeneral(String sTipo,Row row,Workbook workbook) {
		
		DiarioGeneralConstantesFunciones.generarExcelReporteHeaderDiarioGeneral(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDiarioGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<DiarioGeneral> diariogeneralsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariogeneral_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiarioGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DiarioGeneral diariogeneral : diariogeneralsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DiarioGeneralConstantesFunciones.getDiarioGeneralDescripcion(diariogeneral));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.gettipodocumento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getasientocontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.gettipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getcodigo_asiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getdebito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getcredito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getdebito_extran());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getcredito_extran());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getdetalle());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diariogeneral.getnombre_estado());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diario General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDiarioGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<DiarioGeneral> diariogeneralsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DiarioGeneral> diariogeneralsRespaldo=null;
		
		classes=DiarioGeneralConstantesFunciones.getClassesRelationshipsOfDiarioGeneral(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.diariogeneralLogic.setDatosCliente(this.datosCliente);
		this.diariogeneralLogic.setDatosDeep(this.datosDeep);
		this.diariogeneralLogic.setIsConDeep(true);
		
		diariogeneralsRespaldo=this.diariogeneralLogic.getDiarioGenerals();
		
		this.diariogeneralLogic.setDiarioGenerals(diariogeneralsParaReportes);	
		this.diariogeneralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		diariogeneralsParaReportes=this.diariogeneralLogic.getDiarioGenerals();
		this.diariogeneralLogic.setDiarioGenerals(diariogeneralsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariogeneral_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiarioGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDiarioGeneral("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DiarioGeneral diariogeneral : diariogeneralsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDiarioGeneral("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DiarioGeneralConstantesFunciones.generarExcelReporteDataDiarioGeneral("NORMAL",row,workbook,diariogeneral,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DiarioGeneralConstantesFunciones.getDiarioGeneralDescripcion(diariogeneral));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diario General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDiarioGeneral.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDiarioGeneral() throws Exception {		
		this.startProcessDiarioGeneral(true);
	}
	
	public void startProcessDiarioGeneral(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDiarioGeneral ,this.jPanelParametrosReportesDiarioGeneral, this.jScrollPanelDatosDiarioGeneral,this.jPanelPaginacionDiarioGeneral, this.jScrollPanelDatosEdicionDiarioGeneral, this.jPanelAccionesDiarioGeneral,this.jPanelAccionesFormularioDiarioGeneral,this.jmenuBarDiarioGeneral,this.jmenuBarDetalleDiarioGeneral,this.jTtoolBarDiarioGeneral,this.jTtoolBarDetalleDiarioGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasDiarioGeneral=this.jTabbedPaneBusquedasDiarioGeneral; 
		
		final JPanel jPanelParametrosReportesDiarioGeneral=this.jPanelParametrosReportesDiarioGeneral;
		//final JScrollPane jScrollPanelDatosDiarioGeneral=this.jScrollPanelDatosDiarioGeneral;
		final JTable jTableDatosDiarioGeneral=this.jTableDatosDiarioGeneral;		
		final JPanel jPanelPaginacionDiarioGeneral=this.jPanelPaginacionDiarioGeneral;
		//final JScrollPane jScrollPanelDatosEdicionDiarioGeneral=this.jScrollPanelDatosEdicionDiarioGeneral;
		final JPanel jPanelAccionesDiarioGeneral=this.jPanelAccionesDiarioGeneral;
		
		JPanel jPanelCamposAuxiliarDiarioGeneral=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDiarioGeneral=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			jPanelCamposAuxiliarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jPanelCamposDiarioGeneral;
			jPanelAccionesFormularioAuxiliarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jPanelAccionesFormularioDiarioGeneral;
		}
		
		final JPanel jPanelCamposDiarioGeneral=jPanelCamposAuxiliarDiarioGeneral;
		final JPanel jPanelAccionesFormularioDiarioGeneral=jPanelAccionesFormularioAuxiliarDiarioGeneral;
		
		
		final JMenuBar jmenuBarDiarioGeneral=this.jmenuBarDiarioGeneral;
		final JToolBar jTtoolBarDiarioGeneral=this.jTtoolBarDiarioGeneral;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDiarioGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDiarioGeneral=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			jmenuBarDetalleAuxiliarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jmenuBarDetalleDiarioGeneral;
			jTtoolBarDetalleAuxiliarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jTtoolBarDetalleDiarioGeneral;
		}
		
		final JMenuBar jmenuBarDetalleDiarioGeneral=jmenuBarDetalleAuxiliarDiarioGeneral;
		final JToolBar jTtoolBarDetalleDiarioGeneral=jTtoolBarDetalleAuxiliarDiarioGeneral;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDiarioGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDiarioGeneral;
			processRunnable.jTableDatos=jTableDatosDiarioGeneral;
			processRunnable.jPanelCampos=jPanelCamposDiarioGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionDiarioGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesDiarioGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDiarioGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarDiarioGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDiarioGeneral;
			processRunnable.jTtoolBar=jTtoolBarDiarioGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDiarioGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDiarioGeneral ,jPanelParametrosReportesDiarioGeneral,jTableDatosDiarioGeneral, /*jScrollPanelDatosDiarioGeneral,*/jPanelCamposDiarioGeneral,jPanelPaginacionDiarioGeneral, /*jScrollPanelDatosEdicionDiarioGeneral,*/ jPanelAccionesDiarioGeneral,jPanelAccionesFormularioDiarioGeneral,jmenuBarDiarioGeneral,jmenuBarDetalleDiarioGeneral,jTtoolBarDiarioGeneral,jTtoolBarDetalleDiarioGeneral);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDiarioGeneral ,jPanelParametrosReportesDiarioGeneral, jScrollPanelDatosDiarioGeneral,jPanelPaginacionDiarioGeneral, jScrollPanelDatosEdicionDiarioGeneral, jPanelAccionesDiarioGeneral,jPanelAccionesFormularioDiarioGeneral,jmenuBarDiarioGeneral,jmenuBarDetalleDiarioGeneral,jTtoolBarDiarioGeneral,jTtoolBarDetalleDiarioGeneral);
						
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
	
	public void finishProcessDiarioGeneral() {// throws Exception 
		this.finishProcessDiarioGeneral(true);
	}
	
	public void finishProcessDiarioGeneral(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDiarioGeneral ,this.jPanelParametrosReportesDiarioGeneral, this.jScrollPanelDatosDiarioGeneral,this.jPanelPaginacionDiarioGeneral, this.jScrollPanelDatosEdicionDiarioGeneral, this.jPanelAccionesDiarioGeneral,this.jPanelAccionesFormularioDiarioGeneral,this.jmenuBarDiarioGeneral,this.jmenuBarDetalleDiarioGeneral,this.jTtoolBarDiarioGeneral,this.jTtoolBarDetalleDiarioGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasDiarioGeneral=this.jTabbedPaneBusquedasDiarioGeneral; 
		
		final JPanel jPanelParametrosReportesDiarioGeneral=this.jPanelParametrosReportesDiarioGeneral;
		//final JScrollPane jScrollPanelDatosDiarioGeneral=this.jScrollPanelDatosDiarioGeneral;
		final JTable jTableDatosDiarioGeneral=this.jTableDatosDiarioGeneral;		
		final JPanel jPanelPaginacionDiarioGeneral=this.jPanelPaginacionDiarioGeneral;
		//final JScrollPane jScrollPanelDatosEdicionDiarioGeneral=this.jScrollPanelDatosEdicionDiarioGeneral;
		final JPanel jPanelAccionesDiarioGeneral=this.jPanelAccionesDiarioGeneral;
		
		JPanel jPanelCamposAuxiliarDiarioGeneral=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDiarioGeneral=new JPanel();
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			jPanelCamposAuxiliarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jPanelCamposDiarioGeneral;
			jPanelAccionesFormularioAuxiliarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jPanelAccionesFormularioDiarioGeneral;
		}
		
		final JPanel jPanelCamposDiarioGeneral=jPanelCamposAuxiliarDiarioGeneral;
		final JPanel jPanelAccionesFormularioDiarioGeneral=jPanelAccionesFormularioAuxiliarDiarioGeneral;
		
		
		final JMenuBar jmenuBarDiarioGeneral=this.jmenuBarDiarioGeneral;		
		final JToolBar jTtoolBarDiarioGeneral=this.jTtoolBarDiarioGeneral;
				
		JMenuBar jmenuBarDetalleAuxiliarDiarioGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDiarioGeneral=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			jmenuBarDetalleAuxiliarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jmenuBarDetalleDiarioGeneral;
			jTtoolBarDetalleAuxiliarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jTtoolBarDetalleDiarioGeneral;		
		}
		
		final JMenuBar jmenuBarDetalleDiarioGeneral=jmenuBarDetalleAuxiliarDiarioGeneral;
		final JToolBar jTtoolBarDetalleDiarioGeneral=jTtoolBarDetalleAuxiliarDiarioGeneral;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDiarioGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDiarioGeneral;
			processRunnable.jTableDatos=jTableDatosDiarioGeneral;
			processRunnable.jPanelCampos=jPanelCamposDiarioGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionDiarioGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesDiarioGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDiarioGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarDiarioGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDiarioGeneral;
			processRunnable.jTtoolBar=jTtoolBarDiarioGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDiarioGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDiarioGeneral ,jPanelParametrosReportesDiarioGeneral, jTableDatosDiarioGeneral,/*jScrollPanelDatosDiarioGeneral,*/jPanelCamposDiarioGeneral,jPanelPaginacionDiarioGeneral, /*jScrollPanelDatosEdicionDiarioGeneral,*/ jPanelAccionesDiarioGeneral,jPanelAccionesFormularioDiarioGeneral,jmenuBarDiarioGeneral,jmenuBarDetalleDiarioGeneral,jTtoolBarDiarioGeneral,jTtoolBarDetalleDiarioGeneral));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDiarioGeneral(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDiarioGeneral(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDiarioGeneral(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDiarioGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDiarioGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDiarioGeneral,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDiarioGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDiarioGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDiarioGeneral,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.diariogeneralConstantesFunciones.getsFinalQueryDiarioGeneral();
		String  finalQueryPaginacionTodos=this.diariogeneralConstantesFunciones.getsFinalQueryDiarioGeneral();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DiarioGeneralConstantesFunciones.getArrayColumnasGlobalesNoDiarioGeneral(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DiarioGeneralConstantesFunciones.getArrayColumnasGlobalesDiarioGeneral(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DiarioGeneralConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.diariogeneralsEliminados= new ArrayList<DiarioGeneral>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDiarioGeneral();
		
				///*DiarioGeneralSessionBean*/this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
			
			if(this.diariogeneralSessionBean==null) {
				this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
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
					this.iNumeroPaginacion=DiarioGeneralConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DiarioGeneralConstantesFunciones.getClassesForeignKeysOfDiarioGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/diariogeneral."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			diariogeneralsAux= new ArrayList<DiarioGeneral>();
			
				
			diariogeneralLogic.setDatosCliente(this.datosCliente);
			diariogeneralLogic.setDatosDeep(this.datosDeep);
			diariogeneralLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaReporte")) {
				this.sDetalleReporte=DiarioGeneralConstantesFunciones.getDetalleIndiceBusquedaReporte(id_ejercicioBusquedaReporte,id_periodoBusquedaReporte,id_moduloBusquedaReporte,id_tipo_movimientoBusquedaReporte,id_tipo_documentoBusquedaReporte,fecha_inicioBusquedaReporte,fecha_finBusquedaReporte);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					diariogeneralLogic.getDiarioGeneralsBusquedaReporte(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaReporte,id_periodoBusquedaReporte,id_moduloBusquedaReporte,id_tipo_movimientoBusquedaReporte,id_tipo_documentoBusquedaReporte,fecha_inicioBusquedaReporte,fecha_finBusquedaReporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiarioGeneralConstantesFunciones.getDetalleIndiceBusquedaReporte(id_ejercicioBusquedaReporte,id_periodoBusquedaReporte,id_moduloBusquedaReporte,id_tipo_movimientoBusquedaReporte,id_tipo_documentoBusquedaReporte,fecha_inicioBusquedaReporte,fecha_finBusquedaReporte);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiarioGeneralConstantesFunciones.getDetalleIndiceBusquedaReporte(id_ejercicioBusquedaReporte,id_periodoBusquedaReporte,id_moduloBusquedaReporte,id_tipo_movimientoBusquedaReporte,id_tipo_documentoBusquedaReporte,fecha_inicioBusquedaReporte,fecha_finBusquedaReporte);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=diariogeneralLogic.getDiarioGenerals()==null||diariogeneralLogic.getDiarioGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=diariogenerals==null|| diariogenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						diariogeneralsAux=new ArrayList<DiarioGeneral>();
						diariogeneralsAux.addAll(diariogeneralLogic.getDiarioGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diariogeneralsAux=new ArrayList<DiarioGeneral>();
							diariogeneralsAux.addAll(diariogenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							diariogeneralLogic.getDiarioGeneralsBusquedaReporte(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaReporte,id_periodoBusquedaReporte,id_moduloBusquedaReporte,id_tipo_movimientoBusquedaReporte,id_tipo_documentoBusquedaReporte,fecha_inicioBusquedaReporte,fecha_finBusquedaReporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiarioGeneralConstantesFunciones.getDetalleIndiceBusquedaReporte(id_ejercicioBusquedaReporte,id_periodoBusquedaReporte,id_moduloBusquedaReporte,id_tipo_movimientoBusquedaReporte,id_tipo_documentoBusquedaReporte,fecha_inicioBusquedaReporte,fecha_finBusquedaReporte);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiarioGeneralConstantesFunciones.getDetalleIndiceBusquedaReporte(id_ejercicioBusquedaReporte,id_periodoBusquedaReporte,id_moduloBusquedaReporte,id_tipo_movimientoBusquedaReporte,id_tipo_documentoBusquedaReporte,fecha_inicioBusquedaReporte,fecha_finBusquedaReporte);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDiarioGenerals("BusquedaReporte",diariogeneralLogic.getDiarioGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDiarioGenerals("BusquedaReporte",diariogenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						diariogeneralLogic.setDiarioGenerals(new ArrayList<DiarioGeneral>());
						diariogeneralLogic.getDiarioGenerals().addAll(diariogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diariogenerals=new ArrayList<DiarioGeneral>();
							diariogenerals.addAll(diariogeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDiarioGeneral();
		
		this.traerValoresTablaTotales();	
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//this.arrDatoGeneralTotales=DiarioGeneralConstantesFunciones.getTotalesListaDiarioGeneral(diariogeneralLogic.getDiarioGenerals());							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrDatoGeneralTotales=DiarioGeneralConstantesFunciones.getTotalesListaDiarioGeneral(this.diariogenerals);
		}
		*/
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDiarioGeneral();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=diariogeneralLogic.getDiarioGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diariogenerals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=diariogeneralLogic.getDiarioGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diariogenerals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DiarioGeneral diariogeneral) {
		Boolean permite=true;
		
		if(this.diariogeneral.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//this.arrDatoGeneralTotales=DiarioGeneralConstantesFunciones.getTotalesListaDiarioGeneral(diariogeneralLogic.getDiarioGenerals());							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrDatoGeneralTotales=DiarioGeneralConstantesFunciones.getTotalesListaDiarioGeneral(this.diariogenerals);
		}
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DiarioGeneralConstantesFunciones.getOrderByListaDiarioGeneral();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DiarioGeneralConstantesFunciones.getOrderByListaDiarioGeneral();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiarioGeneral diariogeneral:diariogeneralLogic.getDiarioGenerals()) {
				if(diariogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					diariogeneralTotales=diariogeneral;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiarioGeneral diariogeneral:this.diariogenerals) {
				if(diariogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					diariogeneralTotales=diariogeneral;
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
			this.diariogeneralAux=new DiarioGeneral();
			this.diariogeneralAux.setsType(Constantes2.S_TOTALES);
			this.diariogeneralAux.setIsNew(false);
			this.diariogeneralAux.setIsChanged(false);
			this.diariogeneralAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//DiarioGeneralConstantesFunciones.TotalizarValoresFilaDiarioGeneral(this.diariogeneralLogic.getDiarioGenerals(),this.diariogeneralAux);
				
				//this.diariogeneralLogic.getDiarioGenerals().add(this.diariogeneralAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DiarioGeneralConstantesFunciones.TotalizarValoresFilaDiarioGeneral(this.diariogenerals,this.diariogeneralAux);
				
				this.diariogenerals.add(this.diariogeneralAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		diariogeneralTotales=new DiarioGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.diariogeneralLogic.getDiarioGenerals().remove(diariogeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.diariogenerals.remove(diariogeneralTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		diariogeneralTotales=new DiarioGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiarioGeneral diariogeneral:diariogeneralLogic.getDiarioGenerals()) {
				if(diariogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					diariogeneralTotales=diariogeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DiarioGeneralConstantesFunciones.TotalizarValoresFilaDiarioGeneral(this.diariogeneralLogic.getDiarioGenerals(),diariogeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiarioGeneral diariogeneral:this.diariogenerals) {
				if(diariogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					diariogeneralTotales=diariogeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DiarioGeneralConstantesFunciones.TotalizarValoresFilaDiarioGeneral(this.diariogenerals,diariogeneralTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDiarioGeneralsBusquedaReporte()throws Exception {
		try {
			sAccionBusqueda="BusquedaReporte";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiarioGeneralsFK_IdAsientoContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdAsientoContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiarioGeneralsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiarioGeneralsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiarioGeneralsFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiarioGeneralsFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiarioGeneralsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiarioGeneralsFK_IdTipoDocumento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDocumento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiarioGeneralsFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDiarioGeneralsBusquedaReporte(String sFinalQuery,Long id_ejercicio,Long id_periodo,Long id_modulo,Long id_tipo_movimiento,Long id_tipo_documento,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariogeneralLogic.getDiarioGeneralsBusquedaReporte(sFinalQuery,this.pagination,id_ejercicio,id_periodo,id_modulo,id_tipo_movimiento,id_tipo_documento,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiarioGeneralsFK_IdAsientoContable(String sFinalQuery,Long id_asiento_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariogeneralLogic.getDiarioGeneralsFK_IdAsientoContable(sFinalQuery,this.pagination,id_asiento_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiarioGeneralsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariogeneralLogic.getDiarioGeneralsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiarioGeneralsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariogeneralLogic.getDiarioGeneralsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiarioGeneralsFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariogeneralLogic.getDiarioGeneralsFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiarioGeneralsFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariogeneralLogic.getDiarioGeneralsFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiarioGeneralsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariogeneralLogic.getDiarioGeneralsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiarioGeneralsFK_IdTipoDocumento(String sFinalQuery,Long id_tipo_documento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariogeneralLogic.getDiarioGeneralsFK_IdTipoDocumento(sFinalQuery,this.pagination,id_tipo_documento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiarioGeneralsFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diariogeneralLogic.getDiarioGeneralsFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
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
	
	public void inicializarPermisosDiarioGeneral() {
		this.isPermisoTodoDiarioGeneral=false;
		this.isPermisoNuevoDiarioGeneral=false;
		this.isPermisoActualizarDiarioGeneral=false;
		this.isPermisoActualizarOriginalDiarioGeneral=false;
		this.isPermisoEliminarDiarioGeneral=false;
		this.isPermisoGuardarCambiosDiarioGeneral=false;
		this.isPermisoConsultaDiarioGeneral=true;
		this.isPermisoBusquedaDiarioGeneral=true;
		this.isPermisoReporteDiarioGeneral=true;
		this.isPermisoOrdenDiarioGeneral=false;		
		this.isPermisoPaginacionMedioDiarioGeneral=false;		
		this.isPermisoPaginacionAltoDiarioGeneral=false;		
		this.isPermisoPaginacionTodoDiarioGeneral=false;		
		this.isPermisoCopiarDiarioGeneral=false;		
		this.isPermisoVerFormDiarioGeneral=false;		
		this.isPermisoDuplicarDiarioGeneral=false;
		this.isPermisoOrdenDiarioGeneral=false;
	}
	
	public void setPermisosUsuarioDiarioGeneral(Boolean isPermiso) {
		this.isPermisoTodoDiarioGeneral=isPermiso;
		this.isPermisoNuevoDiarioGeneral=isPermiso;
		this.isPermisoActualizarDiarioGeneral=isPermiso;
		this.isPermisoActualizarOriginalDiarioGeneral=isPermiso;
		this.isPermisoEliminarDiarioGeneral=isPermiso;
		this.isPermisoGuardarCambiosDiarioGeneral=isPermiso;
		this.isPermisoConsultaDiarioGeneral=isPermiso;
		this.isPermisoBusquedaDiarioGeneral=isPermiso;
		this.isPermisoReporteDiarioGeneral=isPermiso;
		this.isPermisoOrdenDiarioGeneral=isPermiso;		
		this.isPermisoPaginacionMedioDiarioGeneral=isPermiso;		
		this.isPermisoPaginacionAltoDiarioGeneral=isPermiso;		
		this.isPermisoPaginacionTodoDiarioGeneral=isPermiso;		
		this.isPermisoCopiarDiarioGeneral=isPermiso;		
		this.isPermisoVerFormDiarioGeneral=isPermiso;		
		this.isPermisoDuplicarDiarioGeneral=isPermiso;
		this.isPermisoOrdenDiarioGeneral=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDiarioGeneral(Boolean isPermiso) {
		//this.isPermisoTodoDiarioGeneral=isPermiso;
		this.isPermisoNuevoDiarioGeneral=isPermiso;
		this.isPermisoActualizarDiarioGeneral=isPermiso;
		this.isPermisoActualizarOriginalDiarioGeneral=isPermiso;
		this.isPermisoEliminarDiarioGeneral=isPermiso;
		this.isPermisoGuardarCambiosDiarioGeneral=isPermiso;
		//this.isPermisoConsultaDiarioGeneral=isPermiso;
		//this.isPermisoBusquedaDiarioGeneral=isPermiso;
		//this.isPermisoReporteDiarioGeneral=isPermiso;
		//this.isPermisoOrdenDiarioGeneral=isPermiso;		
		//this.isPermisoPaginacionMedioDiarioGeneral=isPermiso;		
		//this.isPermisoPaginacionAltoDiarioGeneral=isPermiso;		
		//this.isPermisoPaginacionTodoDiarioGeneral=isPermiso;		
		//this.isPermisoCopiarDiarioGeneral=isPermiso;		
		//this.isPermisoDuplicarDiarioGeneral=isPermiso;
		//this.isPermisoOrdenDiarioGeneral=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDiarioGeneralClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DiarioGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDiarioGeneral(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDiarioGeneralClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDiarioGeneralClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDiarioGeneralClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDiarioGeneralClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDiarioGeneral() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DiarioGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DiarioGeneralConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDiarioGeneral=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDiarioGeneral=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDiarioGeneral=this.isPermisoActualizarDiarioGeneral;
			this.isPermisoEliminarDiarioGeneral=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDiarioGeneral=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDiarioGeneral=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDiarioGeneral=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDiarioGeneral=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDiarioGeneral=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDiarioGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDiarioGeneral=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDiarioGeneral=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDiarioGeneral=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDiarioGeneral=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDiarioGeneral=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDiarioGeneral=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDiarioGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDiarioGeneral.setToolTipText(this.jTableDatosDiarioGeneral.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDiarioGeneral(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDiarioGeneral(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DiarioGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DiarioGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDiarioGeneral() throws Exception {
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
	public void inicializarCombosForeignKeyDiarioGeneralListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
				this.tipodocumentosForeignKey=new ArrayList();
				this.asientocontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDiarioGeneralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DiarioGeneralJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
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

			if(cargarCombosDependencia && (this.tipodocumentosForeignKey==null||this.tipodocumentosForeignKey.size()<=0)) {
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

	public void cargarCombosForeignKeyAsientoContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.asientocontablesForeignKey==null||this.asientocontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AsientoContableConstantesFunciones.getArrayColumnasGlobalesAsientoContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AsientoContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AsientoContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosAsientoContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyDiarioGeneral()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
			this.addItemDefectoCombosForeignKeyTipoDocumento();
			this.addItemDefectoCombosForeignKeyAsientoContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.diariogeneralSessionBean==null) {
				this.diariogeneralSessionBean=new DiarioGeneralSessionBean();
			}

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
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

	public void addItemDefectoCombosForeignKeyAsientoContable()throws Exception {
		try {

			if(!this.diariogeneralSessionBean.getisBusquedaDesdeForeignKeySesionAsientoContable()) {
				AsientoContable asientocontable=new AsientoContable();
				AsientoContableConstantesFunciones.setAsientoContableDescripcion(asientocontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				asientocontable.setId(null);

				if(!AsientoContableConstantesFunciones.ExisteEnLista(this.asientocontablesForeignKey,asientocontable,true)) {

					this.asientocontablesForeignKey.add(0,asientocontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDiarioGeneral()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyEjercicio("Todos");
			this.initActionsCombosForeignKeyModulo("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDiarioGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyEjercicio(sFormularioTipoBusqueda);
			this.initActionsCombosForeignKeyModulo(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyEjercicio(JComboBox jComboBoxEjercicioGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Ejercicio ejercicioLocal=(Ejercicio)jComboBoxEjercicioGenerico.getSelectedItem();

			if(ejercicioLocal!=null  && ejercicioLocal.getId()!=null  && ejercicioLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_ejercicio="+ejercicioLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboPeriodo=sFinalQueryCombo;

			this.periodosForeignKey=new ArrayList<Periodo>();
			this.cargarCombosForeignKeyPeriodo(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyModulo(JComboBox jComboBoxModuloGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Modulo moduloLocal=(Modulo)jComboBoxModuloGenerico.getSelectedItem();

			if(moduloLocal!=null  && moduloLocal.getId()!=null  && moduloLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_modulo="+moduloLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboTipoDocumento=sFinalQueryCombo;

			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>();
			this.cargarCombosForeignKeyTipoDocumento(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyEjercicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.addItemListener(new ComboBoxItemListener(this,"id_ejercicioDiarioGeneral"));
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.addFocusListener(new ComboBoxFocusListener(this,"id_ejercicioDiarioGeneral"));
					}
				} else {
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.addActionListener(new ComboBoxActionListener(this,"id_ejercicioDiarioGeneral"));
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.addFocusListener(new ComboBoxFocusListener(this,"id_ejercicioDiarioGeneral"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_ejercicioBusquedaReporteDiarioGeneral"));

						this.jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_ejercicioBusquedaReporteDiarioGeneral"));

					} else {
						this.jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_ejercicioBusquedaReporteDiarioGeneral"));

						this.jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_ejercicioBusquedaReporteDiarioGeneral"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void initActionsCombosForeignKeyModulo(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.addItemListener(new ComboBoxItemListener(this,"id_moduloDiarioGeneral"));
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.addFocusListener(new ComboBoxFocusListener(this,"id_moduloDiarioGeneral"));
					}
				} else {
					if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.addActionListener(new ComboBoxActionListener(this,"id_moduloDiarioGeneral"));
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.addFocusListener(new ComboBoxFocusListener(this,"id_moduloDiarioGeneral"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloBusquedaReporteDiarioGeneral.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloBusquedaReporteDiarioGeneral"));

						this.jComboBoxid_moduloBusquedaReporteDiarioGeneral.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaReporteDiarioGeneral"));

					} else {
						this.jComboBoxid_moduloBusquedaReporteDiarioGeneral.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloBusquedaReporteDiarioGeneral"));

						this.jComboBoxid_moduloBusquedaReporteDiarioGeneral.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaReporteDiarioGeneral"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyDiarioGeneral()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDiarioGeneral();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDiarioGeneral(DiarioGeneral diariogeneral)throws Exception {	
		try {
			
			this.setActualAsientoContableForeignKey(diariogeneral.getid_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDiarioGeneral(DiarioGeneral diariogeneral,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDiarioGeneral()throws Exception {	
		try {
			
			this.setActualAsientoContableForeignKey(this.diariogeneralConstantesFunciones.getid_asiento_contable(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDiarioGeneral()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDiarioGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDiarioGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDiarioGeneral()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDiarioGeneral()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
			this.cargarCombosFrameTipoDocumentosForeignKey("Todos");
			this.cargarCombosFrameAsientoContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDiarioGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDiarioGeneral()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	





	public void recargarFormDiarioGeneralEjercicio(JComboBox<?> jComboBoxGenericoEjercicio,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormDiarioGeneralid_periodo(jComboBoxGenericoEjercicio,sFormularioTipoBusqueda,"Ejercicio",false);
	}



	public void recargarFormDiarioGeneralModulo(JComboBox<?> jComboBoxGenericoModulo,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormDiarioGeneralid_tipo_documento(jComboBoxGenericoModulo,sFormularioTipoBusqueda,"Modulo",false);
	}






	
	



	public void recargarFormDiarioGeneralid_periodo(JComboBox<?> jComboBoxGenericoPeriodo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Ejercicio")){
				this.setActualParaGuardarEjercicioForeignKey(this.diariogeneral,jComboBoxGenericoPeriodo);
			}

			if(this.diariogeneral.getid_ejercicio()!=null && this.diariogeneral.getid_ejercicio()!=0L) {
				sFinalQuery+="  WHERE  id_ejercicio="+this.diariogeneral.getid_ejercicio();
			} else {
				sFinalQuery+="  WHERE  id_ejercicio=-1";
			}



			//BUCLE RECURSIVO
			this.setActualPeriodoForeignKey(this.diariogeneral.getid_ejercicio(),true,sFormularioTipoBusqueda);

			this.cargarCombosPeriodosForeignKeyLista(sFinalQuery);

			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormDiarioGeneralid_tipo_documento(JComboBox<?> jComboBoxGenericoTipoDocumento,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Modulo")){
				this.setActualParaGuardarModuloForeignKey(this.diariogeneral,jComboBoxGenericoTipoDocumento);
			}

			if(this.diariogeneral.getid_modulo()!=null && this.diariogeneral.getid_modulo()!=0L) {
				sFinalQuery+="  WHERE  id_modulo="+this.diariogeneral.getid_modulo();
			} else {
				sFinalQuery+="  WHERE  id_modulo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualTipoDocumentoForeignKey(this.diariogeneral.getid_modulo(),true,sFormularioTipoBusqueda);

			this.cargarCombosTipoDocumentosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public DiarioGeneralBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DiarioGeneralBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DiarioGeneralBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.diariogeneralSessionBean=new DiarioGeneralSessionBean(); 
		this.diariogeneralConstantesFunciones=new DiarioGeneralConstantesFunciones(); 
		this.diariogeneralBean=new DiarioGeneral();//(this.diariogeneralConstantesFunciones); 		
		this.diariogeneralReturnGeneral=new DiarioGeneralParameterReturnGeneral(); 
		
		this.diariogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diariogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DiarioGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DiarioGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DiarioGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDiarioGeneral(true);
			
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
			
			this.diariogeneralConstantesFunciones=new DiarioGeneralConstantesFunciones(); 
			this.diariogeneralBean=new DiarioGeneral();//this.diariogeneralConstantesFunciones); 			
			this.diariogeneralReturnGeneral=new DiarioGeneralParameterReturnGeneral(); 
		
			DiarioGeneralBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Diario General Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.diariogeneral=new DiarioGeneral();
			this.diariogenerals = new ArrayList<DiarioGeneral>();
			this.diariogeneralsAux = new ArrayList<DiarioGeneral>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic=new DiarioGeneralLogic();
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.diariogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.diariogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDiarioGeneral);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDiarioGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDiarioGeneral);	
					}
					
					if(this.jInternalFrameImportacionDiarioGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDiarioGeneral);							
					}
					
				}
				
				if(this.jInternalFrameTotalesDiarioGeneral!=null) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameTotalesDiarioGeneral);
				}
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDiarioGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDiarioGeneral);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDiarioGeneral);
				this.jInternalFrameDetalleFormDiarioGeneral.setVisible(false);
				this.jInternalFrameDetalleFormDiarioGeneral.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDiarioGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDiarioGeneral);
					this.jInternalFrameReporteDinamicoDiarioGeneral.setVisible(false);
					this.jInternalFrameReporteDinamicoDiarioGeneral.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDiarioGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDiarioGeneral);
					this.jInternalFrameImportacionDiarioGeneral.setVisible(false);
					this.jInternalFrameImportacionDiarioGeneral.setSelected(false);
				}
				
				
			}
			
			if(this.jInternalFrameTotalesDiarioGeneral!=null) {
				//TOTALES
				this.jDesktopPane.add(this.jInternalFrameTotalesDiarioGeneral);
				this.jInternalFrameTotalesDiarioGeneral.setVisible(false);
				this.jInternalFrameTotalesDiarioGeneral.setSelected(false);
			}
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDiarioGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDiarioGeneral);
					this.jInternalFrameOrderByDiarioGeneral.setVisible(false);
					this.jInternalFrameOrderByDiarioGeneral.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDiarioGeneralActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DiarioGeneralConstantesFunciones.INUMEROPAGINACION;
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
			
			this.diariogeneralReturnGeneral=new DiarioGeneralParameterReturnGeneral();
			
			this.diariogeneralParameterGeneral=new DiarioGeneralParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.diariogeneralLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DiarioGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DiarioGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.diariogeneralSessionBean.getEsGuardarRelacionado(),this.diariogeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DiarioGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.diariogeneralSessionBean.getEsGuardarRelacionado(),this.diariogeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDiarioGeneral=false;
			this.isVisibilidadCeldaDuplicarDiarioGeneral=true;
			this.isVisibilidadCeldaCopiarDiarioGeneral=true;
			this.isVisibilidadCeldaVerFormDiarioGeneral=true;
			this.isVisibilidadCeldaOrdenDiarioGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=false;
			this.isVisibilidadCeldaModificarDiarioGeneral=false;
			this.isVisibilidadCeldaActualizarDiarioGeneral=false;
			this.isVisibilidadCeldaEliminarDiarioGeneral=false;
			this.isVisibilidadCeldaCancelarDiarioGeneral=false;
			this.isVisibilidadCeldaGuardarDiarioGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=false;
			
			
			this.isVisibilidadBusquedaReporte=true;
			this.isVisibilidadFK_IdAsientoContable=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoDocumento=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDiarioGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDiarioGeneral();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDiarioGeneral(false);
			
			this.setPermisosUsuarioDiarioGeneral();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diariogeneralSessionBean.getEsGuardarRelacionado() 
				|| (this.diariogeneralSessionBean.getEsGuardarRelacionado() && this.diariogeneralSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDiarioGeneralClasesRelacionadas();
			}
			
			if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDiarioGeneralClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDiarioGeneral();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDiarioGeneral();
			}
			
			if(!this.isPermisoBusquedaDiarioGeneral) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDiarioGeneral.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DiarioGeneralConstantesFunciones.getTiposSeleccionarDiarioGeneral());
				
				this.tiposColumnasSelect=DiarioGeneralConstantesFunciones.getTiposSeleccionarDiarioGeneral(true);
				
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
			//if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDiarioGeneral();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioDiarioGeneral(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioDiarioGeneral(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDiarioGeneral() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			this.arrDatoGeneralTotales= new  ArrayList<DatoGeneral>();
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.moduloLogic=new ModuloLogic();
			this.tipomovimientoLogic=new TipoMovimientoLogic();
			this.tipodocumentoLogic=new TipoDocumentoLogic();
			this.asientocontableLogic=new AsientoContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				diariogeneralImplementable= (DiarioGeneralImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DiarioGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				diariogeneralImplementableHome= (DiarioGeneralImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DiarioGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.diariogenerals= new ArrayList<DiarioGeneral>();
			this.diariogeneralsEliminados= new ArrayList<DiarioGeneral>();
						
			this.isEsNuevoDiarioGeneral=false;
			this.esParaAccionDesdeFormularioDiarioGeneral=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>() ;
			this.asientocontablesForeignKey=new ArrayList<AsientoContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDiarioGeneral(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDiarioGeneral();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DiarioGeneralBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DiarioGeneralConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDiarioGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDiarioGeneral(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDiarioGeneral();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDiarioGeneral();
			}
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDiarioGeneral.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDiarioGeneral.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDiarioGeneral.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDiarioGeneral(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DiarioGeneral: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDiarioGeneral() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDiarioGeneral")) {
				iIndex=this.jInternalFrameDetalleFormDiarioGeneral.jTabbedPaneRelacionesDiarioGeneral.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDiarioGeneral.jTabbedPaneRelacionesDiarioGeneral.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDiarioGeneral();	
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
	
	public void cargarCombosForeignKeyDiarioGeneral(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDiarioGeneral(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDiarioGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDiarioGeneralListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDiarioGeneral();
		
		this.cargarCombosFrameForeignKeyDiarioGeneral();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDiarioGeneral();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDiarioGeneral();
		}
	}
	
	

	public void cargarCombosForeignKeyPeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyEjercicio("Todos");
				}

			this.recargarComboTablaPeriodo(this.periodosForeignKey);

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
					this.initActionsCombosForeignKeyModulo("Todos");
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
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaTipoDocumento(this.tipodocumentosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAsientoContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAsientoContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAsientoContable();
				this.cargarCombosFrameAsientoContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaAsientoContable(this.asientocontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDiarioGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
			
			if(jTableDatosDiarioGeneral.getRowCount()>=1) {
				jTableDatosDiarioGeneral.removeRowSelectionInterval(0, jTableDatosDiarioGeneral.getRowCount()-1);						
			}
			
			this.isEsNuevoDiarioGeneral=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDiarioGeneral(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDiarioGeneral(true);			
			//this.diariogeneral=new DiarioGeneral();
			//this.diariogeneral.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiarioGeneral(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiarioGeneral() ;
			
			if(DiarioGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiarioGeneral(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.diariogeneral);	
			this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);				
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
			if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DiarioGeneral: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDiarioGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDiarioGeneral.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDiarioGeneral.getSelectedRows().length;			
			}
			
			diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDiarioGeneral--;			
				//DiarioGeneral diariogeneralAux= new DiarioGeneral();			
				//diariogeneralAux.setId(this.iIdNuevoDiarioGeneral);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DiarioGeneral diariogeneralOrigen=new DiarioGeneral();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DiarioGeneral diariogeneralOrigen : diariogeneralsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							diariogeneralOrigen =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diariogeneralOrigen =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDiarioGeneral();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.diariogeneral.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDiarioGeneral(diariogeneralOrigen,this.diariogeneral,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.diariogeneralLogic.getDiarioGenerals().add(this.diariogeneralAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.diariogenerals.add(this.diariogeneralAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDiarioGeneral(false);
				
				this.jTableDatosDiarioGeneral.setRowSelectionInterval(this.getIndiceNuevoDiarioGeneral(), this.getIndiceNuevoDiarioGeneral());
				
				int iLastRow =  this.jTableDatosDiarioGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDiarioGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDiarioGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDiarioGeneral(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();									
		
			DiarioGeneral diariogeneralOrigen=new DiarioGeneral();
			DiarioGeneral diariogeneralDestino=new DiarioGeneral();
				
			diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDiarioGeneral.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || diariogeneralsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDiarioGeneral.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diariogeneralOrigen =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						diariogeneralOrigen =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diariogeneralDestino =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						diariogeneralDestino =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				diariogeneralOrigen =diariogeneralsSeleccionados.get(0);
				diariogeneralDestino =diariogeneralsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDiarioGeneral(diariogeneralOrigen,diariogeneralDestino,true,false);
				
				diariogeneralDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(diariogeneralDestino,diariogeneralLogic.getDiarioGenerals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(diariogeneralDestino,diariogenerals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDiarioGeneral(false);
				
				//this.jTableDatosDiarioGeneral.setRowSelectionInterval(this.getIndiceNuevoDiarioGeneral(), this.getIndiceNuevoDiarioGeneral());
				
				int iLastRow =  this.jTableDatosDiarioGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDiarioGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDiarioGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDiarioGeneral(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDiarioGeneral.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDiarioGeneral.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDiarioGeneral.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDiarioGeneral.setVisible(!isVisible);
			this.jPanelPaginacionDiarioGeneral.setVisible(!isVisible);
			this.jPanelAccionesDiarioGeneral.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDiarioGeneral();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDiarioGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDiarioGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonAbrirTotalesDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.abrirInicializarFrameTotalesDiarioGeneral();
			
			this.abrirFrameTotalesDiarioGeneral();
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTotalesDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.cerrarFrameTotalesDiarioGeneral();
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonAbrirOrderByDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDiarioGeneral();
			
			this.abrirFrameOrderByDiarioGeneral();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDiarioGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDiarioGeneral(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDiarioGeneral);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDiarioGeneral.isMaximum()) {
					this.jInternalFrameDetalleFormDiarioGeneral.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDiarioGeneral.setSize(this.jInternalFrameDetalleFormDiarioGeneral.iWidthFormulario,this.jInternalFrameDetalleFormDiarioGeneral.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDiarioGeneral.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDiarioGeneral.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDiarioGeneral.isMaximum()) {
						this.jInternalFrameDetalleFormDiarioGeneral.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDiarioGeneral.jContentPaneDetalleDiarioGeneral.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDiarioGeneral.jTabbedPaneRelacionesDiarioGeneral.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDiarioGeneral.jContentPaneDetalleDiarioGeneral.getWidth(),DiarioGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDiarioGeneral.jTabbedPaneRelacionesDiarioGeneral.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDiarioGeneral.jContentPaneDetalleDiarioGeneral.getWidth(),DiarioGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDiarioGeneral.jTabbedPaneRelacionesDiarioGeneral.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDiarioGeneral.jContentPaneDetalleDiarioGeneral.getWidth(),DiarioGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDiarioGeneral.setVisible(true);
	        this.jInternalFrameDetalleFormDiarioGeneral.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDiarioGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDiarioGeneral==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDiarioGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiarioGeneral,false,this);
				} else {
					this.jInternalFrameOrderByDiarioGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiarioGeneral,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDiarioGeneral);
				this.jInternalFrameOrderByDiarioGeneral.setVisible(false);
				this.jInternalFrameOrderByDiarioGeneral.setSelected(false);
				
				this.jInternalFrameOrderByDiarioGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDiarioGeneral"));
				
				this.inicializarActualizarBindingTablaOrderByDiarioGeneral();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDiarioGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDiarioGeneral==null) {
				
				this.jInternalFrameImportacionDiarioGeneral=new ImportacionJInternalFrame(DiarioGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDiarioGeneral);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDiarioGeneral);
				this.jInternalFrameImportacionDiarioGeneral.setVisible(false);
				this.jInternalFrameImportacionDiarioGeneral.setSelected(false);


				this.jInternalFrameImportacionDiarioGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDiarioGeneral"));
				this.jInternalFrameImportacionDiarioGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDiarioGeneral"));
				this.jInternalFrameImportacionDiarioGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDiarioGeneral"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDiarioGeneral() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDiarioGeneral==null) {
				this.jInternalFrameReporteDinamicoDiarioGeneral=new ReporteDinamicoJInternalFrame(DiarioGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDiarioGeneral);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDiarioGeneral);
				this.jInternalFrameReporteDinamicoDiarioGeneral.setVisible(false);
				this.jInternalFrameReporteDinamicoDiarioGeneral.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDiarioGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiarioGeneral"));
				this.jInternalFrameReporteDinamicoDiarioGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiarioGeneral"));
				this.jInternalFrameReporteDinamicoDiarioGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiarioGeneral"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiarioGeneral();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	public void abrirInicializarFrameTotalesDiarioGeneral() throws Exception {	    	        
	    try {			
			if(this.jInternalFrameTotalesDiarioGeneral==null) {
				this.jInternalFrameTotalesDiarioGeneral=new TotalesJInternalFrame(this.jButtonAbrirTotalesDiarioGeneral,STIPO_TAMANIO_GENERAL,this);
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameTotalesDiarioGeneral);

				//TOTALES
				this.jDesktopPane.add(this.jInternalFrameTotalesDiarioGeneral);
				this.jInternalFrameTotalesDiarioGeneral.setVisible(false);
				this.jInternalFrameTotalesDiarioGeneral.setSelected(false);


				this.jInternalFrameTotalesDiarioGeneral.getjButtonCerrarTotales().addActionListener (new ButtonActionListener(this,"CerrarTotalesDiarioGeneral"));
								
				this.inicializarActualizarBindingTablaTotalesDiarioGeneral();
				
				this.redimensionarTablaTotales();
			}			
		} catch (final Exception e) {
			
		}
	}	
	
		
					
	public void cerrarFrameDetalleDiarioGeneral() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDiarioGeneral);
			
	       	this.jInternalFrameDetalleFormDiarioGeneral.setVisible(false);
	        this.jInternalFrameDetalleFormDiarioGeneral.setSelected(false);
			
			//this.jInternalFrameDetalleFormDiarioGeneral.dispose();
			//this.jInternalFrameDetalleFormDiarioGeneral=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDiarioGeneral() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDiarioGeneral.setVisible(true);
	        this.jInternalFrameReporteDinamicoDiarioGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDiarioGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDiarioGeneral.setVisible(true);
	        this.jInternalFrameImportacionDiarioGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	public void abrirFrameTotalesDiarioGeneral() throws Exception {	    	        
	    try {
			this.jInternalFrameTotalesDiarioGeneral.setVisible(true);
	        this.jInternalFrameTotalesDiarioGeneral.setSelected(true);
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	public void cerrarFrameTotalesDiarioGeneral() throws Exception {	    	        
	    try {
			this.jInternalFrameTotalesDiarioGeneral.setVisible(false);
	        this.jInternalFrameTotalesDiarioGeneral.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	
	public void abrirFrameOrderByDiarioGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDiarioGeneral.setVisible(true);
	        this.jInternalFrameOrderByDiarioGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDiarioGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDiarioGeneral.setVisible(false);
	        this.jInternalFrameOrderByDiarioGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDiarioGeneral() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDiarioGeneral.setVisible(false);
	        this.jInternalFrameReporteDinamicoDiarioGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDiarioGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDiarioGeneral.setVisible(false);
	        this.jInternalFrameImportacionDiarioGeneral.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDiarioGeneral(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDiarioGeneral(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDiarioGeneral(true);
			//this.isEsNuevoDiarioGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDiarioGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiarioGeneral(false) ;
			
			if(diariogeneralSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DiarioGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiarioGeneral(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiarioGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDiarioGeneralActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDiarioGeneral(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDiarioGeneral(true);
			//this.isEsNuevoDiarioGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.diariogeneral.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDiarioGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDiarioGeneral(false) ;
			
			if(DiarioGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiarioGeneral(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiarioGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaPeriodo(List<Periodo> periodosForeignKey)throws Exception{
		TableColumn tableColumnPeriodo=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_IDPERIODO));
		TableCellEditor tableCellEditorPeriodo =tableColumnPeriodo.getCellEditor();

		PeriodoTableCell periodoTableCellFk=(PeriodoTableCell)tableCellEditorPeriodo;

		if(periodoTableCellFk!=null) {
			periodoTableCellFk.setperiodosForeignKey(periodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiarioGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periodoTableCellFk.setRowActual(intSelectedRow);
			//periodoTableCellFk.setperiodosForeignKeyActual(periodosForeignKey);
		//}


		if(periodoTableCellFk!=null) {
			periodoTableCellFk.RecargarPeriodosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiarioGeneral.getSelectedRow();

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
		TableColumn tableColumnTipoDocumento=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTO));
		TableCellEditor tableCellEditorTipoDocumento =tableColumnTipoDocumento.getCellEditor();

		TipoDocumentoTableCell tipodocumentoTableCellFk=(TipoDocumentoTableCell)tableCellEditorTipoDocumento;

		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.settipodocumentosForeignKey(tipodocumentosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiarioGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodocumentoTableCellFk.setRowActual(intSelectedRow);
			//tipodocumentoTableCellFk.settipodocumentosForeignKeyActual(tipodocumentosForeignKey);
		//}


		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.RecargarTipoDocumentosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAsientoContable(List<AsientoContable> asientocontablesForeignKey)throws Exception{
		TableColumn tableColumnAsientoContable=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE));
		TableCellEditor tableCellEditorAsientoContable =tableColumnAsientoContable.getCellEditor();

		AsientoContableTableCell asientocontableTableCellFk=(AsientoContableTableCell)tableCellEditorAsientoContable;

		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.setasientocontablesForeignKey(asientocontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiarioGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//asientocontableTableCellFk.setRowActual(intSelectedRow);
			//asientocontableTableCellFk.setasientocontablesForeignKeyActual(asientocontablesForeignKey);
		//}


		if(asientocontableTableCellFk!=null) {
			asientocontableTableCellFk.RecargarAsientoContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDiarioGeneral(false);
			
			//if(!this.isEsNuevoDiarioGeneral) {								
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				
			}
			
			if(this.permiteMantenimiento(this.diariogeneral)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDiarioGeneral=true;
					this.inicializarActualizarBindingTablaDiarioGeneral(false);
					this.isEsNuevoDiarioGeneral=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDiarioGeneral=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDiarioGeneral=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDiarioGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiarioGeneral(false);
				
				this.habilitarDeshabilitarControlesDiarioGeneral(false);
			
												
				
				if(DiarioGeneralJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDiarioGeneral();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDiarioGeneralActionPerformed(evt,diariogeneralSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDiarioGeneral(this.diariogeneral,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDiarioGeneral.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,diariogeneralSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.diariogeneral.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DiarioGeneral.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiarioGeneral.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				this.diariogeneral.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				this.diariogeneral.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.diariogeneral)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DiarioGeneralModel) this.jTableDatosDiarioGeneral.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDiarioGeneral=true;
				this.inicializarActualizarBindingTablaDiarioGeneral(false);
				this.isEsNuevoDiarioGeneral=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDiarioGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiarioGeneral(false);
				
				this.habilitarDeshabilitarControlesDiarioGeneral(false);
				
				
				
				if(DiarioGeneralJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDiarioGeneral();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDiarioGeneral.getRowCount()>=1) {
				jTableDatosDiarioGeneral.removeRowSelectionInterval(0, jTableDatosDiarioGeneral.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDiarioGeneral(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDiarioGeneral(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiarioGeneral(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiarioGeneral(false) ;
			
			this.isEsNuevoDiarioGeneral=false;
			
			if(DiarioGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDiarioGeneral();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDiarioGeneral(false);
				
				//SI ES MANUAL
				if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDiarioGeneral();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDiarioGeneral--;			
			//DiarioGeneral diariogeneralAux= new DiarioGeneral();			
			//diariogeneralAux.setId(this.iIdNuevoDiarioGeneral);
			
			if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDiarioGeneral();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
			
			this.diariogeneral.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.diariogeneralLogic.getDiarioGenerals().add(this.diariogeneralAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.diariogenerals.add(this.diariogeneralAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDiarioGeneral(false);
			
			this.jTableDatosDiarioGeneral.setRowSelectionInterval(this.getIndiceNuevoDiarioGeneral(), this.getIndiceNuevoDiarioGeneral());
			
			int iLastRow =  this.jTableDatosDiarioGeneral.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDiarioGeneral.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDiarioGeneral.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDiarioGeneral(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDiarioGeneral(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiarioGeneral(false);
			
			//SI ES MANUAL
			if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiarioGeneral();
			}
			
			//this.abrirFrameTreeDiarioGeneral();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDiarioGeneral.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDiarioGeneral.setFileImportacion(this.jInternalFrameImportacionDiarioGeneral.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDiarioGeneral.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDiarioGeneral.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDiarioGeneral.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDiarioGeneral.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();		

		diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DiarioGeneralBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DiarioGeneralBaseDesign.jrxml";
			
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
			
			this.generarReporteDiarioGenerals("Todos",diariogeneralsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diario General",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AsientoContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AsientoContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AsientoContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AsientoContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoAsiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoAsiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoAsiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoAsiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoExtran_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoExtran_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoExtran_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoExtran_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoExtran_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoExtran_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoExtran_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoExtran_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEstado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEstado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEstado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEstado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDiarioGeneral.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoria="id_asiento_contable";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoria="tipo_movimiento";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO:
					sNombreCampoCategoria="codigo_asiento";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoria="debito_local";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoria="credito_local";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN:
					sNombreCampoCategoria="debito_extran";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN:
					sNombreCampoCategoria="credito_extran";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO:
					sNombreCampoCategoria="nombre_estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					sNombreCampoCategoriaValor="id_asiento_contable";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="tipo_movimiento";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO:
					sNombreCampoCategoriaValor="codigo_asiento";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoriaValor="debito_local";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoriaValor="credito_local";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN:
					sNombreCampoCategoriaValor="debito_extran";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN:
					sNombreCampoCategoriaValor="credito_extran";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO:
					sNombreCampoCategoriaValor="nombre_estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Asiento Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_asiento_contable");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_movimiento");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Asiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_asiento");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_local");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_local");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Extranjero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_extran");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Extranjero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_extran");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_estado");
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
	
	public void jButtonGenerarExcelReporteDinamicoDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();		
		
		diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariogeneral";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DiarioGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DiarioGeneralConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTO);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.gettipodocumento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getasientocontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.gettipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getcodigo_asiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getdebito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getcredito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getdebito_extran());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getcredito_extran());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getdetalle());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO);
					iRow++;

					for(DiarioGeneral diariogeneral:diariogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diariogeneral.getnombre_estado());
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
			//	this.getFilaCabeceraExportarExcelDiarioGeneral(row);				
			//	iRow++;
			//}				
			
			//for(DiarioGeneral diariogeneralAux:diariogeneralsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDiarioGeneral(diariogeneralAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diario General",JOptionPane.INFORMATION_MESSAGE);
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
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiarioGeneral(false);
			
			//SI ES MANUAL
			if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiarioGeneral();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiarioGeneral(false);
			
			//SI ES MANUAL
			if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDiarioGeneral();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiarioGeneral(false);
			
			//SI ES MANUAL
			if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDiarioGeneral();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDiarioGeneral() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDiarioGeneral.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDiarioGeneral.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDiarioGeneral.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDiarioGeneral.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDiarioGeneral.setMinimumSize(dimensionMinimum);
		this.jTableDatosDiarioGeneral.setMaximumSize(dimensionMaximum);
		this.jTableDatosDiarioGeneral.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDiarioGeneral(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDiarioGeneral(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDiarioGeneral(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDiarioGeneral(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDiarioGeneral(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDiarioGeneral(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDiarioGeneral(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDiarioGeneral(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DiarioGeneralJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDiarioGeneral() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDiarioGeneral();
		
		this.inicializarActualizarBindingBotonesManualDiarioGeneral(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDiarioGeneral();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDiarioGeneral() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDiarioGeneral(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDiarioGeneral(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDiarioGeneral.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDiarioGeneral.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDiarioGeneral.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDiarioGeneral.jCheckBoxPostAccionNuevoDiarioGeneral.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDiarioGeneral.jCheckBoxPostAccionSinCerrarDiarioGeneral.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDiarioGeneral.jCheckBoxPostAccionSinMensajeDiarioGeneral.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDiarioGeneral.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDiarioGeneral.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDiarioGeneral.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
				this.jInternalFrameDetalleFormDiarioGeneral.jCheckBoxPostAccionNuevoDiarioGeneral.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDiarioGeneral.jCheckBoxPostAccionSinCerrarDiarioGeneral.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDiarioGeneral.jCheckBoxPostAccionSinMensajeDiarioGeneral.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDiarioGeneral.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDiarioGeneral.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDiarioGeneral.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDiarioGeneral!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDiarioGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDiarioGeneral.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDiarioGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDiarioGeneral.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDiarioGeneral!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDiarioGeneral.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDiarioGeneral.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDiarioGeneral(Boolean esInicializar) throws Exception {
		try	{	
			if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDiarioGeneral(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDiarioGeneral() throws Exception {
		try	{
			if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDiarioGeneral();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDiarioGeneral() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDiarioGeneral() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDiarioGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDiarioGeneral.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDiarioGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDiarioGeneral.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDiarioGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDiarioGeneral.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDiarioGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDiarioGeneral.addItem(reporte);
			}
			
			
			if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDiarioGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDiarioGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDiarioGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDiarioGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDiarioGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDiarioGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDiarioGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDiarioGeneral.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDiarioGeneral.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiarioGeneral();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiarioGeneral() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDiarioGeneral!=null) {
				this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDiarioGeneral!=null) {
				this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDiarioGeneral!=null) {
				
				if(this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDiarioGeneral.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDiarioGeneral.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDiarioGeneral.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DiarioGeneralConstantesFunciones.getTiposSeleccionarDiarioGeneral(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DiarioGeneralConstantesFunciones.getTiposSeleccionarDiarioGeneral(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DiarioGeneralConstantesFunciones.getTiposSeleccionarDiarioGeneral(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDiarioGeneral.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDiarioGeneral.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDiarioGeneral()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.getSelectedItem()!=null){this.id_ejercicioBusquedaReporte=((Ejercicio)this.jComboBoxid_ejercicioBusquedaReporteDiarioGeneral.getSelectedItem()).getId();}
		if(this.jComboBoxid_periodoBusquedaReporteDiarioGeneral.getSelectedItem()!=null){this.id_periodoBusquedaReporte=((Periodo)this.jComboBoxid_periodoBusquedaReporteDiarioGeneral.getSelectedItem()).getId();}
		if(this.jComboBoxid_moduloBusquedaReporteDiarioGeneral.getSelectedItem()!=null){this.id_moduloBusquedaReporte=((Modulo)this.jComboBoxid_moduloBusquedaReporteDiarioGeneral.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.getSelectedItem()!=null){this.id_tipo_movimientoBusquedaReporte=((TipoMovimiento)this.jComboBoxid_tipo_movimientoBusquedaReporteDiarioGeneral.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.getSelectedItem()!=null){this.id_tipo_documentoBusquedaReporte=((TipoDocumento)this.jComboBoxid_tipo_documentoBusquedaReporteDiarioGeneral.getSelectedItem()).getId();}
		this.fecha_inicioBusquedaReporte=new Date(this.jDateChooserfecha_inicioBusquedaReporteDiarioGeneral.getDate().getTime());
		this.fecha_finBusquedaReporte=new Date(this.jDateChooserfecha_finBusquedaReporteDiarioGeneral.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDiarioGeneral(Boolean esInicializar) throws Exception {				
		if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDiarioGeneral();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDiarioGeneral() throws Exception {
		this.inicializarActualizarBindingTablaDiarioGeneral(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDiarioGeneral() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDiarioGeneralOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneralOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	public void inicializarActualizarBindingTablaTotalesDiarioGeneral() {		
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		
		//TABLA TOTALES
		this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().setModel(new TablaGeneralTotalModel(this.arrDatoGeneralTotales));
				
		//DEFINIR RENDERERS TOTALES
		tableColumn=this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales(),Constantes2.S_TIPO));			
		//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
				
				
		tableColumn=this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales(),Constantes2.S_TOTAL));
		//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());		
	}
	
	public void inicializarActualizarBindingTablaDiarioGeneral(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=diariogeneralLogic.getDiarioGenerals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=diariogenerals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDiarioGeneral.setModel(new DiarioGeneralModel(this.diariogeneralLogic.getDiarioGenerals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDiarioGeneral.setModel(new DiarioGeneralModel(this.diariogenerals,this));
			}
			//ARCHITECTURE
			
			if(this.jInternalFrameTotalesDiarioGeneral!=null) {
				//TABLA TOTALES
				this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().setModel(new TablaGeneralTotalModel(this.arrDatoGeneralTotales));
				
				//DEFINIR RENDERERS TOTALES
				tableColumn=this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales(),Constantes2.S_TIPO));			
				//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
				
				
				tableColumn=this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameTotalesDiarioGeneral.getjTableDatosTotales(),Constantes2.S_TOTAL));
				//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
			}
							
			
			
			if(this.jInternalFrameOrderByDiarioGeneral!=null && this.jInternalFrameOrderByDiarioGeneral.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDiarioGeneral();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO,diariogeneralConstantesFunciones.resaltarSeleccionarDiarioGeneral,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DiarioGeneralConstantesFunciones.SCLASSWEBTITULO,diariogeneralConstantesFunciones.resaltarSeleccionarDiarioGeneral,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_ID));

		if(this.diariogeneralConstantesFunciones.mostraridDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diariogeneralConstantesFunciones.resaltaridDiarioGeneral,this.diariogeneralConstantesFunciones.activaridDiarioGeneral,iSizeTabla,this,true,"idDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltaridDiarioGeneral,this.diariogeneralConstantesFunciones.activaridDiarioGeneral,this,true,"idDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO));

		if(this.diariogeneralConstantesFunciones.mostrartipo_movimientoDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariogeneralConstantesFunciones.resaltartipo_movimientoDiarioGeneral,this.diariogeneralConstantesFunciones.activartipo_movimientoDiarioGeneral,iSizeTabla,this,true,"tipo_movimientoDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltartipo_movimientoDiarioGeneral,this.diariogeneralConstantesFunciones.activartipo_movimientoDiarioGeneral,this,true,"tipo_movimientoDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.diariogeneralConstantesFunciones.mostrarnumero_mayorDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariogeneralConstantesFunciones.resaltarnumero_mayorDiarioGeneral,this.diariogeneralConstantesFunciones.activarnumero_mayorDiarioGeneral,iSizeTabla,this,true,"numero_mayorDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltarnumero_mayorDiarioGeneral,this.diariogeneralConstantesFunciones.activarnumero_mayorDiarioGeneral,this,true,"numero_mayorDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_CODIGO));

		if(this.diariogeneralConstantesFunciones.mostrarcodigoDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariogeneralConstantesFunciones.resaltarcodigoDiarioGeneral,this.diariogeneralConstantesFunciones.activarcodigoDiarioGeneral,iSizeTabla,this,true,"codigoDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltarcodigoDiarioGeneral,this.diariogeneralConstantesFunciones.activarcodigoDiarioGeneral,this,true,"codigoDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_NOMBRE));

		if(this.diariogeneralConstantesFunciones.mostrarnombreDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariogeneralConstantesFunciones.resaltarnombreDiarioGeneral,this.diariogeneralConstantesFunciones.activarnombreDiarioGeneral,iSizeTabla,this,true,"nombreDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltarnombreDiarioGeneral,this.diariogeneralConstantesFunciones.activarnombreDiarioGeneral,this,true,"nombreDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO));

		if(this.diariogeneralConstantesFunciones.mostrarcodigo_asientoDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariogeneralConstantesFunciones.resaltarcodigo_asientoDiarioGeneral,this.diariogeneralConstantesFunciones.activarcodigo_asientoDiarioGeneral,iSizeTabla,this,true,"codigo_asientoDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltarcodigo_asientoDiarioGeneral,this.diariogeneralConstantesFunciones.activarcodigo_asientoDiarioGeneral,this,true,"codigo_asientoDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL));

		if(this.diariogeneralConstantesFunciones.mostrardebito_localDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diariogeneralConstantesFunciones.resaltardebito_localDiarioGeneral,this.diariogeneralConstantesFunciones.activardebito_localDiarioGeneral,iSizeTabla,this,true,"debito_localDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltardebito_localDiarioGeneral,this.diariogeneralConstantesFunciones.activardebito_localDiarioGeneral,this,true,"debito_localDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL));

		if(this.diariogeneralConstantesFunciones.mostrarcredito_localDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diariogeneralConstantesFunciones.resaltarcredito_localDiarioGeneral,this.diariogeneralConstantesFunciones.activarcredito_localDiarioGeneral,iSizeTabla,this,true,"credito_localDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltarcredito_localDiarioGeneral,this.diariogeneralConstantesFunciones.activarcredito_localDiarioGeneral,this,true,"credito_localDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN));

		if(this.diariogeneralConstantesFunciones.mostrardebito_extranDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diariogeneralConstantesFunciones.resaltardebito_extranDiarioGeneral,this.diariogeneralConstantesFunciones.activardebito_extranDiarioGeneral,iSizeTabla,this,true,"debito_extranDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltardebito_extranDiarioGeneral,this.diariogeneralConstantesFunciones.activardebito_extranDiarioGeneral,this,true,"debito_extranDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN));

		if(this.diariogeneralConstantesFunciones.mostrarcredito_extranDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diariogeneralConstantesFunciones.resaltarcredito_extranDiarioGeneral,this.diariogeneralConstantesFunciones.activarcredito_extranDiarioGeneral,iSizeTabla,this,true,"credito_extranDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltarcredito_extranDiarioGeneral,this.diariogeneralConstantesFunciones.activarcredito_extranDiarioGeneral,this,true,"credito_extranDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_FECHA));

		if(this.diariogeneralConstantesFunciones.mostrarfechaDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.diariogeneralConstantesFunciones.resaltarfechaDiarioGeneral,this.diariogeneralConstantesFunciones.activarfechaDiarioGeneral,iSizeTabla,this,true,"fechaDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.diariogeneralConstantesFunciones.resaltarfechaDiarioGeneral,this.diariogeneralConstantesFunciones.activarfechaDiarioGeneral,this,true,"fechaDiarioGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_DETALLE));

		if(this.diariogeneralConstantesFunciones.mostrardetalleDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariogeneralConstantesFunciones.resaltardetalleDiarioGeneral,this.diariogeneralConstantesFunciones.activardetalleDiarioGeneral,iSizeTabla,this,true,"detalleDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltardetalleDiarioGeneral,this.diariogeneralConstantesFunciones.activardetalleDiarioGeneral,this,true,"detalleDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO));

		if(this.diariogeneralConstantesFunciones.mostrarnombre_estadoDiarioGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diariogeneralConstantesFunciones.resaltarnombre_estadoDiarioGeneral,this.diariogeneralConstantesFunciones.activarnombre_estadoDiarioGeneral,iSizeTabla,this,true,"nombre_estadoDiarioGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diariogeneralConstantesFunciones.resaltarnombre_estadoDiarioGeneral,this.diariogeneralConstantesFunciones.activarnombre_estadoDiarioGeneral,this,true,"nombre_estadoDiarioGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiarioGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diariogeneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diariogeneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDiarioGeneral.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diariogeneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diariogeneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDiarioGeneral.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.diariogeneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.diariogeneralSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDiarioGeneral.addColumn(tableColumn);
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
			
			this.jTableDatosDiarioGeneral.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDiarioGeneral.moveColumn(this.jTableDatosDiarioGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDiarioGeneral.moveColumn(this.jTableDatosDiarioGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDiarioGeneral.moveColumn(this.jTableDatosDiarioGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDiarioGeneral.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDiarioGeneral.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDiarioGeneral,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDiarioGeneral.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDiarioGeneral.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DiarioGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDiarioGeneral.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDiarioGeneral.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDiarioGeneral.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=diariogeneralLogic.getDiarioGenerals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=diariogenerals.size()-1;
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
		//this.jTableDatosDiarioGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDiarioGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDiarioGeneral();
			
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
				
				//this.isEsNuevoDiarioGeneral=false;
					
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
				if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDiarioGeneral==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDiarioGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDiarioGeneral.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.diariogeneral.getsType().equals("DUPLICADO")
				   || this.diariogeneral.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDiarioGeneral=true;
				
				} else {
					this.isEsNuevoDiarioGeneral=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
					if(this.diariogeneral.getId()>=0 && !this.diariogeneral.getIsNew()) {						
						this.isEsNuevoDiarioGeneral=false;
						
					} else {
						this.isEsNuevoDiarioGeneral=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDiarioGeneral(esRelaciones);						
				
				this.seleccionarDiarioGeneral(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.diariogeneral.getId()<0) {
					this.isEsNuevoDiarioGeneral=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDiarioGeneral(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDiarioGeneral(evt,rowIndex);
				}	
				
				if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DiarioGeneral: " + this.dDif); 
					}
				}								
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDiarioGeneral(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.diariogeneral)) {
					if(this.diariogeneral.getId()>0) {
						this.diariogeneral.setIsDeleted(true);
						
						this.diariogeneralsEliminados.add(this.diariogeneral);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.diariogeneralLogic.getDiarioGenerals().remove(this.diariogeneral);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.diariogenerals.remove(this.diariogeneral);				
					}
					
					
					((DiarioGeneralModel) this.jTableDatosDiarioGeneral.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDiarioGeneral(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDiarioGeneral(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDiarioGeneral) {
			
			if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDiarioGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDiarioGeneral.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDiarioGeneral(this.diariogeneral);
				}
				
				//ARCHITECTURE
				try {
					

					//AsientoContable
					if(!this.diariogeneralConstantesFunciones.cargarid_asiento_contableDiarioGeneral || this.diariogeneralConstantesFunciones.event_dependid_asiento_contableDiarioGeneral) {
						//this.cargarCombosAsientoContablesForeignKeyLista(" where id="+this.diariogeneral.getid_asiento_contable());
									//this.inicializarActualizarBindingDiarioGeneral(false,false);
						this.asientocontablesForeignKey=new ArrayList<AsientoContable>();

						if(diariogeneral.getAsientoContable()!=null) {
							this.asientocontablesForeignKey.add(diariogeneral.getAsientoContable());
						}

						this.addItemDefectoCombosForeignKeyAsientoContable();
						this.cargarCombosFrameAsientoContablesForeignKey("Todos");
					}
					this.setActualAsientoContableForeignKey(this.diariogeneral.getid_asiento_contable(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDiarioGeneral("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDiarioGeneral(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiarioGeneral() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDiarioGeneral(DiarioGeneral diariogeneral) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDiarioGeneral(diariogeneral,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDiarioGeneral(DiarioGeneral diariogeneral,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDiarioGeneral(diariogeneral);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDiarioGeneral(diariogeneral,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDiarioGeneral(diariogeneral);
	}
	
	public void setVariablesObjetoActualToFormularioDiarioGeneral(DiarioGeneral diariogeneral) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDiarioGeneral.jLabelidDiarioGeneral.setText(diariogeneral.getId().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreatipo_movimientoDiarioGeneral.setText(diariogeneral.gettipo_movimiento());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanumero_mayorDiarioGeneral.setText(diariogeneral.getnumero_mayor());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigoDiarioGeneral.setText(diariogeneral.getcodigo());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanombreDiarioGeneral.setText(diariogeneral.getnombre());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigo_asientoDiarioGeneral.setText(diariogeneral.getcodigo_asiento());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_localDiarioGeneral.setText(diariogeneral.getdebito_local().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_localDiarioGeneral.setText(diariogeneral.getcredito_local().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_extranDiarioGeneral.setText(diariogeneral.getdebito_extran().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_extranDiarioGeneral.setText(diariogeneral.getcredito_extran().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfechaDiarioGeneral.setDate(diariogeneral.getfecha());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreadetalleDiarioGeneral.setText(diariogeneral.getdetalle());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldnombre_estadoDiarioGeneral.setText(diariogeneral.getnombre_estado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DiarioGeneral diariogeneralLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,diariogeneralLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DiarioGeneral diariogeneralLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				diariogeneralLocal=this.diariogeneral;
			} else {
				diariogeneralLocal=this.diariogeneralAnterior;
			}
		}
		
		if(this.permiteMantenimiento(diariogeneralLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDiarioGeneral(diariogeneralLocal,true);
					
					if(diariogeneralSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(diariogeneralLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(diariogeneralLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDiarioGeneral(DiarioGeneral diariogeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDiarioGeneral(diariogeneral,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(diariogeneral);
	}
	
	public void setVariablesFormularioToObjetoActualDiarioGeneral(DiarioGeneral diariogeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDiarioGeneral(diariogeneral,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDiarioGeneral(DiarioGeneral diariogeneral,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDiarioGeneral.jLabelidDiarioGeneral.getText()==null || this.jInternalFrameDetalleFormDiarioGeneral.jLabelidDiarioGeneral.getText()=="" || this.jInternalFrameDetalleFormDiarioGeneral.jLabelidDiarioGeneral.getText()=="Id") {
				this.jInternalFrameDetalleFormDiarioGeneral.jLabelidDiarioGeneral.setText("0");
			}

			if(conColumnasBase) {diariogeneral.setId(Long.parseLong(this.jInternalFrameDetalleFormDiarioGeneral.jLabelidDiarioGeneral.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelIdDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.settipo_movimiento(this.jInternalFrameDetalleFormDiarioGeneral.jTextAreatipo_movimientoDiarioGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabeltipo_movimientoDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.setnumero_mayor(this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanumero_mayorDiarioGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelnumero_mayorDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.setcodigo(this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigoDiarioGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcodigoDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.setnombre(this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanombreDiarioGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelnombreDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.setcodigo_asiento(this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigo_asientoDiarioGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcodigo_asientoDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.setdebito_local(Double.parseDouble(this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_localDiarioGeneral.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabeldebito_localDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.setcredito_local(Double.parseDouble(this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_localDiarioGeneral.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcredito_localDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.setdebito_extran(Double.parseDouble(this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_extranDiarioGeneral.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabeldebito_extranDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.setcredito_extran(Double.parseDouble(this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_extranDiarioGeneral.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelcredito_extranDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.setfecha(this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfechaDiarioGeneral.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelfechaDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.setdetalle(this.jInternalFrameDetalleFormDiarioGeneral.jTextAreadetalleDiarioGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabeldetalleDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diariogeneral.setnombre_estado(this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldnombre_estadoDiarioGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiarioGeneral.jLabelnombre_estadoDiarioGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDiarioGeneral(DiarioGeneral diariogeneralBean,DiarioGeneral diariogeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDiarioGeneral(DiarioGeneral diariogeneralOrigen,DiarioGeneral diariogeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && diariogeneralOrigen.getId()!=null && !diariogeneralOrigen.getId().equals(0L))) {diariogeneral.setId(diariogeneralOrigen.getId());}}
			if(conDefault || (!conDefault && diariogeneralOrigen.getfecha_inicio()!=null && !diariogeneralOrigen.getfecha_inicio().equals(new Date()))) {diariogeneral.setfecha_inicio(diariogeneralOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getfecha_fin()!=null && !diariogeneralOrigen.getfecha_fin().equals(new Date()))) {diariogeneral.setfecha_fin(diariogeneralOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getid_asiento_contable()!=null && !diariogeneralOrigen.getid_asiento_contable().equals(-1L))) {diariogeneral.setid_asiento_contable(diariogeneralOrigen.getid_asiento_contable());}
			if(conDefault || (!conDefault && diariogeneralOrigen.gettipo_movimiento()!=null && !diariogeneralOrigen.gettipo_movimiento().equals(""))) {diariogeneral.settipo_movimiento(diariogeneralOrigen.gettipo_movimiento());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getnumero_mayor()!=null && !diariogeneralOrigen.getnumero_mayor().equals(""))) {diariogeneral.setnumero_mayor(diariogeneralOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getcodigo()!=null && !diariogeneralOrigen.getcodigo().equals(""))) {diariogeneral.setcodigo(diariogeneralOrigen.getcodigo());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getnombre()!=null && !diariogeneralOrigen.getnombre().equals(""))) {diariogeneral.setnombre(diariogeneralOrigen.getnombre());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getcodigo_asiento()!=null && !diariogeneralOrigen.getcodigo_asiento().equals(""))) {diariogeneral.setcodigo_asiento(diariogeneralOrigen.getcodigo_asiento());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getdebito_local()!=null && !diariogeneralOrigen.getdebito_local().equals(0.0))) {diariogeneral.setdebito_local(diariogeneralOrigen.getdebito_local());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getcredito_local()!=null && !diariogeneralOrigen.getcredito_local().equals(0.0))) {diariogeneral.setcredito_local(diariogeneralOrigen.getcredito_local());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getdebito_extran()!=null && !diariogeneralOrigen.getdebito_extran().equals(0.0))) {diariogeneral.setdebito_extran(diariogeneralOrigen.getdebito_extran());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getcredito_extran()!=null && !diariogeneralOrigen.getcredito_extran().equals(0.0))) {diariogeneral.setcredito_extran(diariogeneralOrigen.getcredito_extran());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getfecha()!=null && !diariogeneralOrigen.getfecha().equals(new Date()))) {diariogeneral.setfecha(diariogeneralOrigen.getfecha());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getdetalle()!=null && !diariogeneralOrigen.getdetalle().equals(""))) {diariogeneral.setdetalle(diariogeneralOrigen.getdetalle());}
			if(conDefault || (!conDefault && diariogeneralOrigen.getnombre_estado()!=null && !diariogeneralOrigen.getnombre_estado().equals(""))) {diariogeneral.setnombre_estado(diariogeneralOrigen.getnombre_estado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDiarioGeneral(DiarioGeneral diariogeneral) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDiarioGeneral.jLabelidDiarioGeneral.setText(diariogeneral.getId().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreatipo_movimientoDiarioGeneral.setText(diariogeneral.gettipo_movimiento());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanumero_mayorDiarioGeneral.setText(diariogeneral.getnumero_mayor());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigoDiarioGeneral.setText(diariogeneral.getcodigo());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanombreDiarioGeneral.setText(diariogeneral.getnombre());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigo_asientoDiarioGeneral.setText(diariogeneral.getcodigo_asiento());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_localDiarioGeneral.setText(diariogeneral.getdebito_local().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_localDiarioGeneral.setText(diariogeneral.getcredito_local().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_extranDiarioGeneral.setText(diariogeneral.getdebito_extran().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_extranDiarioGeneral.setText(diariogeneral.getcredito_extran().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfechaDiarioGeneral.setDate(diariogeneral.getfecha());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreadetalleDiarioGeneral.setText(diariogeneral.getdetalle());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldnombre_estadoDiarioGeneral.setText(diariogeneral.getnombre_estado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDiarioGeneral(DiarioGeneralBean diariogeneralBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDiarioGeneral.jLabelidDiarioGeneral.setText(diariogeneralBean.getId().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreatipo_movimientoDiarioGeneral.setText(diariogeneralBean.gettipo_movimiento());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanumero_mayorDiarioGeneral.setText(diariogeneralBean.getnumero_mayor());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigoDiarioGeneral.setText(diariogeneralBean.getcodigo());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanombreDiarioGeneral.setText(diariogeneralBean.getnombre());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigo_asientoDiarioGeneral.setText(diariogeneralBean.getcodigo_asiento());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_localDiarioGeneral.setText(diariogeneralBean.getdebito_local().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_localDiarioGeneral.setText(diariogeneralBean.getcredito_local().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_extranDiarioGeneral.setText(diariogeneralBean.getdebito_extran().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_extranDiarioGeneral.setText(diariogeneralBean.getcredito_extran().toString());
			this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfechaDiarioGeneral.setDate(diariogeneralBean.getfecha());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextAreadetalleDiarioGeneral.setText(diariogeneralBean.getdetalle());
			this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldnombre_estadoDiarioGeneral.setText(diariogeneralBean.getnombre_estado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDiarioGeneral(DiarioGeneralParameterReturnGeneral diariogeneralReturnGeneral,DiarioGeneralBean diariogeneralBean,Boolean conDefault) throws Exception { 
		try {
			DiarioGeneral diariogeneralLocal=new DiarioGeneral();
			
			diariogeneralLocal=diariogeneralReturnGeneral.getDiarioGeneral();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && diariogeneralLocal.getId()!=null && !diariogeneralLocal.getId().equals(0L))) {diariogeneralBean.setId(diariogeneralLocal.getId());}}
			if(conDefault || (!conDefault && diariogeneralLocal.gettipo_movimiento()!=null && !diariogeneralLocal.gettipo_movimiento().equals(""))) {diariogeneralBean.settipo_movimiento(diariogeneralLocal.gettipo_movimiento());}
			if(conDefault || (!conDefault && diariogeneralLocal.getnumero_mayor()!=null && !diariogeneralLocal.getnumero_mayor().equals(""))) {diariogeneralBean.setnumero_mayor(diariogeneralLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && diariogeneralLocal.getcodigo()!=null && !diariogeneralLocal.getcodigo().equals(""))) {diariogeneralBean.setcodigo(diariogeneralLocal.getcodigo());}
			if(conDefault || (!conDefault && diariogeneralLocal.getnombre()!=null && !diariogeneralLocal.getnombre().equals(""))) {diariogeneralBean.setnombre(diariogeneralLocal.getnombre());}
			if(conDefault || (!conDefault && diariogeneralLocal.getcodigo_asiento()!=null && !diariogeneralLocal.getcodigo_asiento().equals(""))) {diariogeneralBean.setcodigo_asiento(diariogeneralLocal.getcodigo_asiento());}
			if(conDefault || (!conDefault && diariogeneralLocal.getdebito_local()!=null && !diariogeneralLocal.getdebito_local().equals(0.0))) {diariogeneralBean.setdebito_local(diariogeneralLocal.getdebito_local());}
			if(conDefault || (!conDefault && diariogeneralLocal.getcredito_local()!=null && !diariogeneralLocal.getcredito_local().equals(0.0))) {diariogeneralBean.setcredito_local(diariogeneralLocal.getcredito_local());}
			if(conDefault || (!conDefault && diariogeneralLocal.getdebito_extran()!=null && !diariogeneralLocal.getdebito_extran().equals(0.0))) {diariogeneralBean.setdebito_extran(diariogeneralLocal.getdebito_extran());}
			if(conDefault || (!conDefault && diariogeneralLocal.getcredito_extran()!=null && !diariogeneralLocal.getcredito_extran().equals(0.0))) {diariogeneralBean.setcredito_extran(diariogeneralLocal.getcredito_extran());}
			if(conDefault || (!conDefault && diariogeneralLocal.getfecha()!=null && !diariogeneralLocal.getfecha().equals(new Date()))) {diariogeneralBean.setfecha(diariogeneralLocal.getfecha());}
			if(conDefault || (!conDefault && diariogeneralLocal.getdetalle()!=null && !diariogeneralLocal.getdetalle().equals(""))) {diariogeneralBean.setdetalle(diariogeneralLocal.getdetalle());}
			if(conDefault || (!conDefault && diariogeneralLocal.getnombre_estado()!=null && !diariogeneralLocal.getnombre_estado().equals(""))) {diariogeneralBean.setnombre_estado(diariogeneralLocal.getnombre_estado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDiarioGeneralGenerico(Long idDiarioGeneralSeleccionado,JComboBox jComboBoxDiarioGeneral,List<DiarioGeneral> diariogeneralsLocal)throws Exception {
		try {
			DiarioGeneral  diariogeneralTemp=null;

			for(DiarioGeneral diariogeneralAux:diariogeneralsLocal) {
				if(diariogeneralAux.getId()!=null && diariogeneralAux.getId().equals(idDiarioGeneralSeleccionado)) {
					diariogeneralTemp=diariogeneralAux;
					break;
				}
			}

			jComboBoxDiarioGeneral.setSelectedItem(diariogeneralTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDiarioGeneralGenerico(JComboBox jComboBoxDiarioGeneral,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDiarioGeneral.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDiarioGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDiarioGeneral.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDiarioGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDiarioGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDiarioGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diariogeneral=(DiarioGeneral) diariogeneralLogic.getDiarioGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			diariogeneral =(DiarioGeneral) diariogenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!diariogeneral.getIsNew() && !diariogeneral.getIsChanged() && !diariogeneral.getIsDeleted()) {
				sDescripcion=diariogeneral.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=diariogeneral.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!diariogeneral.getIsNew() && !diariogeneral.getIsChanged() && !diariogeneral.getIsDeleted()) {
				sDescripcion=diariogeneral.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=diariogeneral.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!diariogeneral.getIsNew() && !diariogeneral.getIsChanged() && !diariogeneral.getIsDeleted()) {
				sDescripcion=diariogeneral.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=diariogeneral.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!diariogeneral.getIsNew() && !diariogeneral.getIsChanged() && !diariogeneral.getIsDeleted()) {
				sDescripcion=diariogeneral.getperiodo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=diariogeneral.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!diariogeneral.getIsNew() && !diariogeneral.getIsChanged() && !diariogeneral.getIsDeleted()) {
				sDescripcion=diariogeneral.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=diariogeneral.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!diariogeneral.getIsNew() && !diariogeneral.getIsChanged() && !diariogeneral.getIsDeleted()) {
				sDescripcion=diariogeneral.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=diariogeneral.gettipomovimiento_descripcion();
			}
		}

		if(sTipo.equals("TipoDocumento")) {
			//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
			if(!diariogeneral.getIsNew() && !diariogeneral.getIsChanged() && !diariogeneral.getIsDeleted()) {
				sDescripcion=diariogeneral.gettipodocumento_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=diariogeneral.gettipodocumento_descripcion();
			}
		}

		if(sTipo.equals("AsientoContable")) {
			//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
			if(!diariogeneral.getIsNew() && !diariogeneral.getIsChanged() && !diariogeneral.getIsDeleted()) {
				sDescripcion=diariogeneral.getasientocontable_descripcion();
			} else {
				//sDescripcion=this.getActualAsientoContableForeignKeyDescripcion((Long)value);
				sDescripcion=diariogeneral.getasientocontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DiarioGeneral diariogeneralRow=new DiarioGeneral();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diariogeneralRow=(DiarioGeneral) diariogeneralLogic.getDiarioGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			diariogeneralRow=(DiarioGeneral) diariogenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDiarioGeneral(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDiarioGeneral.setVisible((this.isVisibilidadCeldaNuevoDiarioGeneral && this.isPermisoNuevoDiarioGeneral));			
			this.jButtonDuplicarDiarioGeneral.setVisible((this.isVisibilidadCeldaDuplicarDiarioGeneral && this.isPermisoDuplicarDiarioGeneral));			
			this.jButtonCopiarDiarioGeneral.setVisible((this.isVisibilidadCeldaCopiarDiarioGeneral && this.isPermisoCopiarDiarioGeneral));
			this.jButtonVerFormDiarioGeneral.setVisible((this.isVisibilidadCeldaVerFormDiarioGeneral && this.isPermisoVerFormDiarioGeneral));
			
			this.jButtonAbrirOrderByDiarioGeneral.setVisible((this.isVisibilidadCeldaOrdenDiarioGeneral && this.isPermisoOrdenDiarioGeneral));			
			
			this.jButtonNuevoRelacionesDiarioGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral && this.isPermisoNuevoDiarioGeneral));			
			this.jButtonNuevoGuardarCambiosDiarioGeneral.setVisible((this.isVisibilidadCeldaNuevoDiarioGeneral && this.isPermisoNuevoDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral));
			
			if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonModificarDiarioGeneral.setVisible((this.isVisibilidadCeldaModificarDiarioGeneral && this.isPermisoActualizarDiarioGeneral));	
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonActualizarDiarioGeneral.setVisible((this.isVisibilidadCeldaActualizarDiarioGeneral && this.isPermisoActualizarDiarioGeneral));	
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonEliminarDiarioGeneral.setVisible((this.isVisibilidadCeldaEliminarDiarioGeneral && this.isPermisoEliminarDiarioGeneral));
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonCancelarDiarioGeneral.setVisible(this.isVisibilidadCeldaCancelarDiarioGeneral);							
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosDiarioGeneral.setVisible((this.isVisibilidadCeldaGuardarDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral));			
			
			}
						
			this.jButtonGuardarCambiosTablaDiarioGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaNuevoDiarioGeneral && this.isPermisoNuevoDiarioGeneral));						
			this.jButtonDuplicarToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaDuplicarDiarioGeneral && this.isPermisoDuplicarDiarioGeneral));						
			this.jButtonCopiarToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaCopiarDiarioGeneral && this.isPermisoCopiarDiarioGeneral));			
			this.jButtonVerFormToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaVerFormDiarioGeneral && this.isPermisoVerFormDiarioGeneral));			
			this.jButtonAbrirOrderByToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaOrdenDiarioGeneral && this.isPermisoOrdenDiarioGeneral));
			this.jButtonNuevoRelacionesToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral && this.isPermisoNuevoDiarioGeneral));			
			this.jButtonNuevoGuardarCambiosToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaNuevoDiarioGeneral && this.isPermisoNuevoDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral));			
			
			if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonModificarToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaModificarDiarioGeneral && this.isPermisoActualizarDiarioGeneral));	
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonActualizarToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaActualizarDiarioGeneral  && this.isPermisoActualizarDiarioGeneral));	
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonEliminarToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaEliminarDiarioGeneral && this.isPermisoEliminarDiarioGeneral));
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonCancelarToolBarDiarioGeneral.setVisible(this.isVisibilidadCeldaCancelarDiarioGeneral);				
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaGuardarDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDiarioGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDiarioGeneral.setVisible((this.isVisibilidadCeldaNuevoDiarioGeneral && this.isPermisoNuevoDiarioGeneral));			
			this.jMenuItemDuplicarDiarioGeneral.setVisible((this.isVisibilidadCeldaDuplicarDiarioGeneral && this.isPermisoDuplicarDiarioGeneral));			
			this.jMenuItemCopiarDiarioGeneral.setVisible((this.isVisibilidadCeldaCopiarDiarioGeneral && this.isPermisoCopiarDiarioGeneral));			
			this.jMenuItemVerFormDiarioGeneral.setVisible((this.isVisibilidadCeldaVerFormDiarioGeneral && this.isPermisoVerFormDiarioGeneral));			
			this.jMenuItemAbrirOrderByDiarioGeneral.setVisible((this.isVisibilidadCeldaOrdenDiarioGeneral && this.isPermisoOrdenDiarioGeneral));			
			//this.jMenuItemMostrarOcultarDiarioGeneral.setVisible((this.isVisibilidadCeldaOrdenDiarioGeneral && this.isPermisoOrdenDiarioGeneral));
			this.jMenuItemDetalleAbrirOrderByDiarioGeneral.setVisible((this.isVisibilidadCeldaOrdenDiarioGeneral && this.isPermisoOrdenDiarioGeneral));			
			//this.jMenuItemDetalleMostrarOcultarDiarioGeneral.setVisible((this.isVisibilidadCeldaOrdenDiarioGeneral && this.isPermisoOrdenDiarioGeneral));			
			this.jMenuItemNuevoRelacionesDiarioGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral && this.isPermisoNuevoDiarioGeneral));			
			this.jMenuItemNuevoGuardarCambiosDiarioGeneral.setVisible((this.isVisibilidadCeldaNuevoDiarioGeneral && this.isPermisoNuevoDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral));									
			
			if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemModificarDiarioGeneral.setVisible((this.isVisibilidadCeldaModificarDiarioGeneral && this.isPermisoActualizarDiarioGeneral));	
			this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemActualizarDiarioGeneral.setVisible((this.isVisibilidadCeldaActualizarDiarioGeneral && this.isPermisoActualizarDiarioGeneral));	
			this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemEliminarDiarioGeneral.setVisible((this.isVisibilidadCeldaEliminarDiarioGeneral && this.isPermisoEliminarDiarioGeneral));
			this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemCancelarDiarioGeneral.setVisible(this.isVisibilidadCeldaCancelarDiarioGeneral);				
			}
			
			this.jMenuItemGuardarCambiosDiarioGeneral.setVisible((this.isVisibilidadCeldaGuardarDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral));						
			this.jMenuItemGuardarCambiosTablaDiarioGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDiarioGeneral=this.jButtonNuevoDiarioGeneral.isVisible();
			this.isVisibilidadCeldaDuplicarDiarioGeneral=this.jButtonDuplicarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaCopiarDiarioGeneral=this.jButtonCopiarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaVerFormDiarioGeneral=this.jButtonVerFormDiarioGeneral.isVisible();
			
			this.isVisibilidadCeldaOrdenDiarioGeneral=this.jButtonAbrirOrderByDiarioGeneral.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=this.jButtonNuevoRelacionesDiarioGeneral.isVisible();
			this.isVisibilidadCeldaModificarDiarioGeneral=this.jButtonModificarDiarioGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			this.isVisibilidadCeldaActualizarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jButtonActualizarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaEliminarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jButtonEliminarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaCancelarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jButtonCancelarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaGuardarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosDiarioGeneral.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=this.jButtonGuardarCambiosTablaDiarioGeneral.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDiarioGeneral=this.jButtonNuevoToolBarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=this.jButtonNuevoRelacionesToolBarDiarioGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			this.isVisibilidadCeldaModificarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jButtonModificarToolBarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaActualizarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jButtonActualizarToolBarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaEliminarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jButtonEliminarToolBarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaCancelarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jButtonCancelarToolBarDiarioGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDiarioGeneral=this.jButtonGuardarCambiosToolBarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=this.jButtonGuardarCambiosTablaToolBarDiarioGeneral.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDiarioGeneral=this.jMenuItemNuevoDiarioGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=this.jMenuItemNuevoRelacionesDiarioGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			this.isVisibilidadCeldaModificarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemModificarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaActualizarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemActualizarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaEliminarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemEliminarDiarioGeneral.isVisible();
			this.isVisibilidadCeldaCancelarDiarioGeneral=this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemCancelarDiarioGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDiarioGeneral=this.jMenuItemGuardarCambiosDiarioGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=this.jMenuItemGuardarCambiosTablaDiarioGeneral.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDiarioGeneral(Boolean esInicializar) {
		if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {			
			if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
				//if(this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDiarioGeneral();
			}
			
			this.inicializarActualizarBindingBotonesManualDiarioGeneral(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDiarioGeneral() {
		this.jButtonNuevoDiarioGeneral.setVisible(this.isPermisoNuevoDiarioGeneral);			
		this.jButtonDuplicarDiarioGeneral.setVisible(this.isPermisoDuplicarDiarioGeneral);			
		this.jButtonCopiarDiarioGeneral.setVisible(this.isPermisoCopiarDiarioGeneral);			
		this.jButtonVerFormDiarioGeneral.setVisible(this.isPermisoVerFormDiarioGeneral);			
		
		this.jButtonAbrirOrderByDiarioGeneral.setVisible(this.isPermisoOrdenDiarioGeneral);					
		
		this.jButtonNuevoRelacionesDiarioGeneral.setVisible(this.isPermisoNuevoDiarioGeneral);			
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonModificarDiarioGeneral.setVisible(this.isPermisoActualizarDiarioGeneral);	
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonActualizarDiarioGeneral.setVisible(this.isPermisoActualizarDiarioGeneral);	
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonEliminarDiarioGeneral.setVisible(this.isPermisoEliminarDiarioGeneral);
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonCancelarDiarioGeneral.setVisible(this.isVisibilidadCeldaCancelarDiarioGeneral);						
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosDiarioGeneral.setVisible(this.isPermisoGuardarCambiosDiarioGeneral);							
		}
		
		this.jButtonGuardarCambiosTablaDiarioGeneral.setVisible(this.isPermisoActualizarDiarioGeneral);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDiarioGeneral() {
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonModificarDiarioGeneral.setVisible(this.isPermisoActualizarDiarioGeneral);	
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonActualizarDiarioGeneral.setVisible(this.isPermisoActualizarDiarioGeneral);	
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonEliminarDiarioGeneral.setVisible(this.isPermisoEliminarDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonCancelarDiarioGeneral.setVisible(this.isVisibilidadCeldaCancelarDiarioGeneral);							
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosDiarioGeneral.setVisible((this.isVisibilidadCeldaGuardarDiarioGeneral && this.isPermisoGuardarCambiosDiarioGeneral));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDiarioGeneral() {
		if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDiarioGeneral();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDiarioGeneral() {
	}
	
	public void jTableDatosDiarioGeneralListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDiarioGeneral(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.diariogeneral.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDiarioGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDiarioGeneral(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiarioGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiarioGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.diariogeneralLogic.getConnexion());

				if(this.diariogeneral.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.diariogeneral.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiarioGeneral=(TitledBorder)this.jScrollPanelDatosDiarioGeneral.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDiarioGeneral.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.diariogeneral.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDiarioGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDiarioGeneral(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiarioGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiarioGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.diariogeneralLogic.getConnexion());

				if(this.diariogeneral.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.diariogeneral.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiarioGeneral=(TitledBorder)this.jScrollPanelDatosDiarioGeneral.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDiarioGeneral.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.diariogeneral.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioDiarioGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebDiarioGeneral(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiarioGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiarioGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.diariogeneralLogic.getConnexion());

				if(this.diariogeneral.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.diariogeneral.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiarioGeneral=(TitledBorder)this.jScrollPanelDatosDiarioGeneral.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderDiarioGeneral.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.diariogeneral.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoDiarioGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebDiarioGeneral(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiarioGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiarioGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.diariogeneralLogic.getConnexion());

				if(this.diariogeneral.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.diariogeneral.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiarioGeneral=(TitledBorder)this.jScrollPanelDatosDiarioGeneral.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderDiarioGeneral.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.diariogeneral.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloDiarioGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebDiarioGeneral(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiarioGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiarioGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.diariogeneralLogic.getConnexion());

				if(this.diariogeneral.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.diariogeneral.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiarioGeneral=(TitledBorder)this.jScrollPanelDatosDiarioGeneral.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderDiarioGeneral.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.diariogeneral.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoDiarioGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebDiarioGeneral(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiarioGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiarioGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.diariogeneralLogic.getConnexion());

				if(this.diariogeneral.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.diariogeneral.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiarioGeneral=(TitledBorder)this.jScrollPanelDatosDiarioGeneral.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderDiarioGeneral.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.diariogeneral.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_documentoDiarioGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodocumento=true;

			idTienePermisotipodocumento=this.tienePermisosUsuarioEnPaginaWebDiarioGeneral(TipoDocumentoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodocumento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiarioGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiarioGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);

				this.tipodocumentoBeanSwingJInternalFrame=new TipoDocumentoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodocumentoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodocumentoBeanSwingJInternalFrame.getTipoDocumentoLogic().setConnexion(this.diariogeneralLogic.getConnexion());

				if(this.diariogeneral.getid_tipo_documento()!=null) {
					this.tipodocumentoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodocumentoBeanSwingJInternalFrame.setIdActual(this.diariogeneral.getid_tipo_documento());
					this.tipodocumentoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumento();
				}

				JInternalFrameBase jinternalFrame =this.tipodocumentoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiarioGeneral=(TitledBorder)this.jScrollPanelDatosDiarioGeneral.getBorder();
				TitledBorder titledBordertipodocumento=(TitledBorder)this.tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.getBorder();

				titledBordertipodocumento.setTitle(titledBorderDiarioGeneral.getTitle() + " -> Tipo Documento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_documentoDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getid_tipo_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_documento = "+this.diariogeneral.getid_tipo_documento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.diariogeneral.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.diariogeneral.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_asiento_contableDiarioGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoasientocontable=true;

			idTienePermisoasientocontable=this.tienePermisosUsuarioEnPaginaWebDiarioGeneral(AsientoContableConstantesFunciones.CLASSNAME);

			if(idTienePermisoasientocontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiarioGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiarioGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);

				this.asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.asientocontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.asientocontableBeanSwingJInternalFrame.getAsientoContableLogic().setConnexion(this.diariogeneralLogic.getConnexion());

				if(this.diariogeneral.getid_asiento_contable()!=null) {
					this.asientocontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.asientocontableBeanSwingJInternalFrame.setIdActual(this.diariogeneral.getid_asiento_contable());
					this.asientocontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.asientocontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsientoContable();
				}

				JInternalFrameBase jinternalFrame =this.asientocontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiarioGeneral=(TitledBorder)this.jScrollPanelDatosDiarioGeneral.getBorder();
				TitledBorder titledBorderasientocontable=(TitledBorder)this.asientocontableBeanSwingJInternalFrame.jScrollPanelDatosAsientoContable.getBorder();

				titledBorderasientocontable.setTitle(titledBorderDiarioGeneral.getTitle() + " -> Asiento Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_asiento_contableDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getid_asiento_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_asiento_contable = "+this.diariogeneral.getid_asiento_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_movimientoDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.gettipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_movimiento like '%"+this.diariogeneral.gettipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.diariogeneral.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.diariogeneral.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.diariogeneral.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_asientoDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getcodigo_asiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_asiento like '%"+this.diariogeneral.getcodigo_asiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_localDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getdebito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_local = "+this.diariogeneral.getdebito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_localDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getcredito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_local = "+this.diariogeneral.getcredito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_extranDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getdebito_extran()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_extran = "+this.diariogeneral.getdebito_extran().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_extranDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getcredito_extran()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_extran = "+this.diariogeneral.getcredito_extran().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.diariogeneral.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalleDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.diariogeneral.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_estadoDiarioGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.getdiariogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diariogeneral==null) {
						this.diariogeneral = new DiarioGeneral();
					}

					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);
				}

				if(this.diariogeneral.getnombre_estado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_estado like '%"+this.diariogeneral.getnombre_estado()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiarioGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaReporteDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiarioGeneral(false,false);

			this.getDiarioGeneralsBusquedaReporte();

			this.inicializarActualizarBindingDiarioGeneral(false);

			//if(DiarioGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiarioGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAsientoContableDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiarioGeneral(false,false);

			this.getDiarioGeneralsFK_IdAsientoContable();

			this.inicializarActualizarBindingDiarioGeneral(false);

			//if(DiarioGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiarioGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiarioGeneral(false,false);

			this.getDiarioGeneralsFK_IdEjercicio();

			this.inicializarActualizarBindingDiarioGeneral(false);

			//if(DiarioGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiarioGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiarioGeneral(false,false);

			this.getDiarioGeneralsFK_IdEmpresa();

			this.inicializarActualizarBindingDiarioGeneral(false);

			//if(DiarioGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiarioGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiarioGeneral(false,false);

			this.getDiarioGeneralsFK_IdModulo();

			this.inicializarActualizarBindingDiarioGeneral(false);

			//if(DiarioGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiarioGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiarioGeneral(false,false);

			this.getDiarioGeneralsFK_IdPeriodo();

			this.inicializarActualizarBindingDiarioGeneral(false);

			//if(DiarioGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiarioGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiarioGeneral(false,false);

			this.getDiarioGeneralsFK_IdSucursal();

			this.inicializarActualizarBindingDiarioGeneral(false);

			//if(DiarioGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiarioGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDocumentoDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiarioGeneral(false,false);

			this.getDiarioGeneralsFK_IdTipoDocumento();

			this.inicializarActualizarBindingDiarioGeneral(false);

			//if(DiarioGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiarioGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoDiarioGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiarioGeneral(false,false);

			this.getDiarioGeneralsFK_IdTipoMovimiento();

			this.inicializarActualizarBindingDiarioGeneral(false);

			//if(DiarioGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiarioGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diariogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDiarioGeneral() {
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
			this.jInternalFrameDetalleFormDiarioGeneral.setVisible(false);	    			
			this.jInternalFrameDetalleFormDiarioGeneral.dispose();
			this.jInternalFrameDetalleFormDiarioGeneral=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDiarioGeneral!=null) {
			this.jInternalFrameReporteDinamicoDiarioGeneral.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDiarioGeneral.dispose();
			this.jInternalFrameReporteDinamicoDiarioGeneral=null;
		}
		
		if(this.jInternalFrameImportacionDiarioGeneral!=null) {
			this.jInternalFrameImportacionDiarioGeneral.setVisible(false);	    			
			this.jInternalFrameImportacionDiarioGeneral.dispose();
			this.jInternalFrameImportacionDiarioGeneral=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDiarioGeneral();
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
			
			if(sTipo.equals("NuevoDiarioGeneral")) {
				jButtonNuevoDiarioGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDiarioGeneral")) {
				jButtonDuplicarDiarioGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDiarioGeneral")) {
				jButtonCopiarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormDiarioGeneral")) {
				jButtonVerFormDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDiarioGeneral")) {
				jButtonNuevoDiarioGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDiarioGeneral")) {
				jButtonDuplicarDiarioGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDiarioGeneral")) {
				jButtonNuevoDiarioGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDiarioGeneral")) {
				jButtonDuplicarDiarioGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDiarioGeneral")) {
				jButtonNuevoDiarioGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDiarioGeneral")) {
				jButtonNuevoDiarioGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDiarioGeneral")) {
				jButtonNuevoDiarioGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDiarioGeneral")) {
				jButtonModificarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDiarioGeneral")) {
				jButtonModificarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDiarioGeneral")) {
				jButtonModificarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDiarioGeneral")) {
				jButtonActualizarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDiarioGeneral")) {
				jButtonActualizarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDiarioGeneral")) {
				jButtonActualizarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarDiarioGeneral")) {
				jButtonEliminarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDiarioGeneral")) {
				jButtonEliminarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDiarioGeneral")) {
				jButtonEliminarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarDiarioGeneral")) {
				jButtonCancelarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDiarioGeneral")) {
				jButtonCancelarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDiarioGeneral")) {
				jButtonCancelarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarDiarioGeneral")) {
				jButtonCerrarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDiarioGeneral")) {
				jButtonCerrarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDiarioGeneral")) {
				jButtonCerrarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDiarioGeneral")) {
				jButtonMostrarOcultarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDiarioGeneral")) {
				jButtonCancelarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDiarioGeneral")) {
				jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDiarioGeneral")) {
				jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDiarioGeneral")) {
				jButtonCopiarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDiarioGeneral")) {
				jButtonVerFormDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDiarioGeneral")) {
				jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDiarioGeneral")) {
				jButtonCopiarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDiarioGeneral")) {
				jButtonVerFormDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDiarioGeneral")) {
				jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDiarioGeneral")) {
				jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDiarioGeneral")) {
				jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDiarioGeneral")) {
				jButtonRecargarInformacionDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDiarioGeneral")) {
				jButtonRecargarInformacionDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDiarioGeneral")) {
				jButtonRecargarInformacionDiarioGeneralActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDiarioGeneral")) {
				jButtonAnterioresDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDiarioGeneral")) {
				jButtonAnterioresDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDiarioGeneral")) {
				jButtonAnterioresDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDiarioGeneral")) {
				jButtonSiguientesDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDiarioGeneral")) {
				jButtonSiguientesDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDiarioGeneral")) {
				jButtonSiguientesDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDiarioGeneral") || sTipo.equals("MenuItemDetalleAbrirOrderByDiarioGeneral")) {
				jButtonAbrirOrderByDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDiarioGeneral") || sTipo.equals("MenuItemDetalleMostrarOcultarDiarioGeneral")) {
				jButtonMostrarOcultarDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDiarioGeneral")) {
				jButtonNuevoGuardarCambiosDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDiarioGeneral")) {
				jButtonNuevoGuardarCambiosDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDiarioGeneral")) {
				jButtonNuevoGuardarCambiosDiarioGeneralActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDiarioGeneral")) {
				jButtonCerrarReporteDinamicoDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDiarioGeneral")) {
				jButtonGenerarReporteDinamicoDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDiarioGeneral")) {
				
				jButtonGenerarExcelReporteDinamicoDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDiarioGeneral")) {
				jButtonCerrarImportacionDiarioGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDiarioGeneral")) {
				
				jButtonGenerarImportacionDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDiarioGeneral")) {
				
				jButtonAbrirImportacionDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDiarioGeneral")) {
				jComboBoxTiposAccionesDiarioGeneralActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDiarioGeneral")) {
				jComboBoxTiposRelacionesDiarioGeneralActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDiarioGeneral")) {
				jComboBoxTiposAccionesDiarioGeneralActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDiarioGeneral")) {
				
				jComboBoxTiposSeleccionarDiarioGeneralActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDiarioGeneral")) {
				jTextFieldValorCampoGeneralDiarioGeneralActionListener(evt);
			}
			
			else if(sTipo.equals("AbrirTotalesDiarioGeneral")) {
				jButtonAbrirTotalesDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTotalesDiarioGeneral")) {
				jButtonCerrarTotalesDiarioGeneralActionPerformed(evt);
			} 
			
			else if(sTipo.equals("AbrirOrderByDiarioGeneral")) {
				jButtonAbrirOrderByDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDiarioGeneral")) {
				jButtonAbrirOrderByDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDiarioGeneral")) {
				jButtonCerrarOrderByDiarioGeneralActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDiarioGeneralBusqueda")) {
				this.jButtonidDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDiarioGeneralUpdate")) {
				this.jButtonid_empresaDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDiarioGeneralBusqueda")) {
				this.jButtonid_empresaDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDiarioGeneralUpdate")) {
				this.jButtonid_sucursalDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDiarioGeneralBusqueda")) {
				this.jButtonid_sucursalDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDiarioGeneralUpdate")) {
				this.jButtonid_ejercicioDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDiarioGeneralBusqueda")) {
				this.jButtonid_ejercicioDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDiarioGeneralUpdate")) {
				this.jButtonid_periodoDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDiarioGeneralBusqueda")) {
				this.jButtonid_periodoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloDiarioGeneralUpdate")) {
				this.jButtonid_moduloDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloDiarioGeneralBusqueda")) {
				this.jButtonid_moduloDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoDiarioGeneralUpdate")) {
				this.jButtonid_tipo_movimientoDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoDiarioGeneralBusqueda")) {
				this.jButtonid_tipo_movimientoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoDiarioGeneralUpdate")) {
				this.jButtonid_tipo_documentoDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoDiarioGeneralBusqueda")) {
				this.jButtonid_tipo_documentoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioDiarioGeneralBusqueda")) {
				this.jButtonfecha_inicioDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finDiarioGeneralBusqueda")) {
				this.jButtonfecha_finDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableDiarioGeneralUpdate")) {
				this.jButtonid_asiento_contableDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableDiarioGeneralBusqueda")) {
				this.jButtonid_asiento_contableDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoDiarioGeneralBusqueda")) {
				this.jButtontipo_movimientoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorDiarioGeneralBusqueda")) {
				this.jButtonnumero_mayorDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDiarioGeneralBusqueda")) {
				this.jButtoncodigoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDiarioGeneralBusqueda")) {
				this.jButtonnombreDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asientoDiarioGeneralBusqueda")) {
				this.jButtoncodigo_asientoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localDiarioGeneralBusqueda")) {
				this.jButtondebito_localDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localDiarioGeneralBusqueda")) {
				this.jButtoncredito_localDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_extranDiarioGeneralBusqueda")) {
				this.jButtondebito_extranDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_extranDiarioGeneralBusqueda")) {
				this.jButtoncredito_extranDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDiarioGeneralBusqueda")) {
				this.jButtonfechaDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleDiarioGeneralBusqueda")) {
				this.jButtondetalleDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_estadoDiarioGeneralBusqueda")) {
				this.jButtonnombre_estadoDiarioGeneralBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaReporteDiarioGeneral")) {
				this.jButtonBusquedaReporteDiarioGeneralActionPerformed(evt);
			}
			
			;
			
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDiarioGeneral();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiarioGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				


				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiarioGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiarioGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DiarioGeneral diariogeneralLocal=null;
			
			if(!this.getEsControlTabla()) {
				diariogeneralLocal=this.diariogeneral;
			} else {
				diariogeneralLocal=this.diariogeneralAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
							
				
				


				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiarioGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiarioGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiarioGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralAnterior =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariogeneralAnterior =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
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
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
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
			
			


			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiarioGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
								
						
				


				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiarioGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiarioGeneral.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
								
				
				


				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiarioGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiarioGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiarioGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralAnterior =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariogeneralAnterior =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiarioGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralAnterior =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariogeneralAnterior =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiarioGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
							
				
				


				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiarioGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiarioGeneral.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiarioGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneralAnterior =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.diariogeneralAnterior =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
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
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
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
			
			


			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiarioGeneralActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
								
				
				


				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiarioGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiarioGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiarioGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralAnterior =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariogeneralAnterior =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiarioGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiarioGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDiarioGeneral")) {
					jCheckBoxSeleccionarTodosDiarioGeneralItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDiarioGeneral")) {
					jCheckBoxSeleccionadosDiarioGeneralItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDiarioGeneral")) {
					
				}
				
				


				
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiarioGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiarioGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
												
				
				


				
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiarioGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiarioGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiarioGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diariogeneralAnterior =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.diariogeneralAnterior =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiarioGeneralActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
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
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
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
			
			


			if(sTipo.equals("id_ejercicioDiarioGeneral")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral;
				}

				if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
					//classes=DiarioGeneralConstantesFunciones.getClassesRelationshipsOfDiarioGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormDiarioGeneral(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaReporteDiarioGeneral")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaReporteDiarioGeneral,"BusquedaReporte");
				//recargarFormDiarioGeneralEjercicio(jComboBoxid_ejercicioBusquedaReporteDiarioGeneral,"BusquedaReporte");
			}
			 else if(sTipo.equals("id_moduloDiarioGeneral")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral;
				}

				if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
					//classes=DiarioGeneralConstantesFunciones.getClassesRelationshipsOfDiarioGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormDiarioGeneral(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaReporteDiarioGeneral")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaReporteDiarioGeneral,"BusquedaReporte");
				//recargarFormDiarioGeneralModulo(jComboBoxid_moduloBusquedaReporteDiarioGeneral,"BusquedaReporte");
			}
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiarioGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_ejercicioDiarioGeneral")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral;
				}

				if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
					//classes=DiarioGeneralConstantesFunciones.getClassesRelationshipsOfDiarioGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormDiarioGeneral(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaReporteDiarioGeneral")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaReporteDiarioGeneral,"BusquedaReporte");
				//recargarFormDiarioGeneralEjercicio(jComboBoxid_ejercicioBusquedaReporteDiarioGeneral,"BusquedaReporte");
			}
			 else if(sTipo.equals("id_moduloDiarioGeneral")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral;
				}

				if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
					//classes=DiarioGeneralConstantesFunciones.getClassesRelationshipsOfDiarioGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormDiarioGeneral(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaReporteDiarioGeneral")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaReporteDiarioGeneral,"BusquedaReporte");
				//recargarFormDiarioGeneralModulo(jComboBoxid_moduloBusquedaReporteDiarioGeneral,"BusquedaReporte");
			}
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiarioGeneral.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiarioGeneral.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diariogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diariogeneral);
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
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
				
				


			if(sTipo.equals("id_ejercicioDiarioGeneral")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral;
				}

				if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
					//classes=DiarioGeneralConstantesFunciones.getClassesRelationshipsOfDiarioGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormDiarioGeneral(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaReporteDiarioGeneral")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaReporteDiarioGeneral,"BusquedaReporte");
				//recargarFormDiarioGeneralEjercicio(jComboBoxid_ejercicioBusquedaReporteDiarioGeneral,"BusquedaReporte");
			}
			 else if(sTipo.equals("id_moduloDiarioGeneral")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral;
				}

				if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
					//classes=DiarioGeneralConstantesFunciones.getClassesRelationshipsOfDiarioGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormDiarioGeneral(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaReporteDiarioGeneral")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaReporteDiarioGeneral,"BusquedaReporte");
				//recargarFormDiarioGeneralModulo(jComboBoxid_moduloBusquedaReporteDiarioGeneral,"BusquedaReporte");
			}
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiarioGeneral.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiarioGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiarioGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diariogeneralAnterior =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diariogeneralAnterior =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDiarioGeneral")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDiarioGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDiarioGeneral.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.diariogeneral =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.diariogeneral =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.diariogeneral);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDiarioGeneral")) {
				
				}
				
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDiarioGeneral")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDiarioGeneral.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDiarioGeneral")) {
			
			}
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDiarioGeneral();
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
			if(sTipo.equals("NuevoDiarioGeneral")) {
				jButtonNuevoDiarioGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDiarioGeneral")) {
				jButtonDuplicarDiarioGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDiarioGeneral")) {
				jButtonCopiarDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDiarioGeneral")) {
				jButtonVerFormDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDiarioGeneral")) {
				jButtonNuevoDiarioGeneralActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDiarioGeneral")) {
				jButtonModificarDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDiarioGeneral")) {
				jButtonActualizarDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDiarioGeneral")) {
				jButtonEliminarDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDiarioGeneral")) {
				jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDiarioGeneral")) {
				jButtonCancelarDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDiarioGeneral")) {
				jButtonCerrarDiarioGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDiarioGeneral")) {
				jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDiarioGeneral")) {
				jButtonNuevoGuardarCambiosDiarioGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDiarioGeneral")) {
				jButtonAbrirOrderByDiarioGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDiarioGeneral")) {
				jButtonRecargarInformacionDiarioGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDiarioGeneral")) {
				jButtonAnterioresDiarioGeneralActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDiarioGeneral")) {
				jButtonSiguientesDiarioGeneralActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDiarioGeneralBusqueda")) {
				this.jButtonidDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDiarioGeneralUpdate")) {
				this.jButtonid_empresaDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDiarioGeneralBusqueda")) {
				this.jButtonid_empresaDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDiarioGeneralUpdate")) {
				this.jButtonid_sucursalDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDiarioGeneralBusqueda")) {
				this.jButtonid_sucursalDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioDiarioGeneralUpdate")) {
				this.jButtonid_ejercicioDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioDiarioGeneralBusqueda")) {
				this.jButtonid_ejercicioDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoDiarioGeneralUpdate")) {
				this.jButtonid_periodoDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoDiarioGeneralBusqueda")) {
				this.jButtonid_periodoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloDiarioGeneralUpdate")) {
				this.jButtonid_moduloDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloDiarioGeneralBusqueda")) {
				this.jButtonid_moduloDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoDiarioGeneralUpdate")) {
				this.jButtonid_tipo_movimientoDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoDiarioGeneralBusqueda")) {
				this.jButtonid_tipo_movimientoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoDiarioGeneralUpdate")) {
				this.jButtonid_tipo_documentoDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoDiarioGeneralBusqueda")) {
				this.jButtonid_tipo_documentoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioDiarioGeneralBusqueda")) {
				this.jButtonfecha_inicioDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finDiarioGeneralBusqueda")) {
				this.jButtonfecha_finDiarioGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_asiento_contableDiarioGeneralUpdate")) {
				this.jButtonid_asiento_contableDiarioGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_asiento_contableDiarioGeneralBusqueda")) {
				this.jButtonid_asiento_contableDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoDiarioGeneralBusqueda")) {
				this.jButtontipo_movimientoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorDiarioGeneralBusqueda")) {
				this.jButtonnumero_mayorDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDiarioGeneralBusqueda")) {
				this.jButtoncodigoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDiarioGeneralBusqueda")) {
				this.jButtonnombreDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_asientoDiarioGeneralBusqueda")) {
				this.jButtoncodigo_asientoDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localDiarioGeneralBusqueda")) {
				this.jButtondebito_localDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localDiarioGeneralBusqueda")) {
				this.jButtoncredito_localDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_extranDiarioGeneralBusqueda")) {
				this.jButtondebito_extranDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_extranDiarioGeneralBusqueda")) {
				this.jButtoncredito_extranDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDiarioGeneralBusqueda")) {
				this.jButtonfechaDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleDiarioGeneralBusqueda")) {
				this.jButtondetalleDiarioGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_estadoDiarioGeneralBusqueda")) {
				this.jButtonnombre_estadoDiarioGeneralBusquedaActionPerformed(evt);
			}
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDiarioGeneral();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDiarioGeneral")) {
				closingInternalFrameDiarioGeneral();
				
			} else if(sTipo.equals("jButtonCancelarDiarioGeneral")) {
				JInternalFrameBase jInternalFrameDetalleFormDiarioGeneral = (JInternalFrameBase)evt.getSource();
	            	
	            DiarioGeneralBeanSwingJInternalFrame jInternalFrameParent=(DiarioGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormDiarioGeneral.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDiarioGeneralActionPerformed(null);
			}
			
			DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.diariogeneral,new Object(),this.diariogeneralParameterGeneral,this.diariogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDiarioGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDiarioGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDiarioGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.diariogeneral)) {
			if(!esControlTabla) {
				if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);			
				}
				
				if(this.diariogeneralSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDiarioGeneral(this.diariogeneral,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDiarioGeneral(this.diariogeneralReturnGeneral,this.diariogeneralBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.diariogeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDiarioGeneral(classes,this.diariogeneralReturnGeneral,this.diariogeneralBean,false);
					}
						
					if(this.diariogeneralReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDiarioGeneral(this.diariogeneralReturnGeneral.getDiarioGeneral());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDiarioGeneral(this.diariogeneralReturnGeneral.getDiarioGeneral());	
					}
						
					if(this.diariogeneralReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDiarioGeneral(this.diariogeneralReturnGeneral.getDiarioGeneral(),classes);//this.diariogeneralBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDiarioGeneral(this.diariogeneral,classes);//this.diariogeneralBean);									
				}
			
				if(DiarioGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDiarioGeneral(this.diariogeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDiarioGeneral(this.diariogeneral);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.diariogeneralAnterior!=null) {
						this.diariogeneral=this.diariogeneralAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.diariogeneralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.diariogeneralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.diariogeneralReturnGeneral.getDiarioGeneral(),diariogeneralLogic.getDiarioGenerals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.diariogeneralReturnGeneral.getDiarioGeneral(),this.diariogenerals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDiarioGeneral.repaint();
				
				//((AbstractTableModel) this.jTableDatosDiarioGeneral.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDiarioGeneral();
			}
		}
	}
	
	public void actualizarVisualTableDatosDiarioGeneral() throws Exception {
		
		DiarioGeneralModel diariogeneralModel=(DiarioGeneralModel)this.jTableDatosDiarioGeneral.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diariogeneralModel.diariogenerals=this.diariogeneralLogic.getDiarioGenerals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			diariogeneralModel.diariogenerals=this.diariogenerals;
		}
		
		
		((DiarioGeneralModel) this.jTableDatosDiarioGeneral.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDiarioGeneral() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdiariogeneralAnterior(),this.diariogeneralLogic.getDiarioGenerals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdiariogeneralAnterior(),this.diariogenerals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDiarioGeneral();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDiarioGeneral(DiarioGeneral diariogeneral,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
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
										
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diariogeneral,new Object(),generalEntityParameterGeneral,this.diariogeneralReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.diariogeneralSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DiarioGeneralConstantesFunciones.getClassesRelationshipsOfDiarioGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DiarioGeneralConstantesFunciones.getClassesRelationshipsFromStringsOfDiarioGeneral(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDiarioGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DiarioGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diariogeneral,new Object(),generalEntityParameterGeneral,this.diariogeneralReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDiarioGeneral(DiarioGeneralBean diariogeneralBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDiarioGeneral(ArrayList<Classe> classes,DiarioGeneralReturnGeneral diariogeneralReturnGeneral,DiarioGeneralBean diariogeneralBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDiarioGeneral(DiarioGeneral diariogeneral,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.diariogeneral)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDiarioGeneral = new DiarioGeneralDetalleFormJInternalFrame(jDesktopPane,this.diariogeneralSessionBean.getConGuardarRelaciones(),this.diariogeneralSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.setVisible(false);
		this.jInternalFrameDetalleFormDiarioGeneral.setSelected(false);						
		
		this.jInternalFrameDetalleFormDiarioGeneral.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDiarioGeneral.diariogeneralLogic=this.diariogeneralLogic;
		
		this.cargarCombosFrameForeignKeyDiarioGeneral("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDiarioGeneral();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDiarioGeneral();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDiarioGeneral("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDiarioGeneral();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDiarioGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDiarioGeneral"));
		
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonModificarDiarioGeneral.addActionListener(new ButtonActionListener(this,"ModificarDiarioGeneral"));

		
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonModificarToolBarDiarioGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarDiarioGeneral"));
					
		this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemModificarDiarioGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarDiarioGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonActualizarDiarioGeneral.addActionListener (new ButtonActionListener(this,"ActualizarDiarioGeneral"));
		
		
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonActualizarToolBarDiarioGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDiarioGeneral"));
						
		this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemActualizarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDiarioGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonEliminarDiarioGeneral.addActionListener (new ButtonActionListener(this,"EliminarDiarioGeneral"));
		
		
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonEliminarToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarDiarioGeneral"));
								
		this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemEliminarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDiarioGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonCancelarDiarioGeneral.addActionListener (new ButtonActionListener(this,"CancelarDiarioGeneral"));
		
		
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonCancelarToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarDiarioGeneral"));
					
		this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemCancelarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDiarioGeneral"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemDetalleCerrarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDiarioGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiarioGeneral"));
		
		
		
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiarioGeneral"));
		
		
		
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDiarioGeneral"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonidDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_empresaDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_empresaDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_sucursalDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_sucursalDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_ejercicioDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_ejercicioDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_periodoDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_periodoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_moduloDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_moduloDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_movimientoDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_movimientoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_documentoDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_documentoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonfecha_inicioDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonfecha_finDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_asiento_contableDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_asiento_contableDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtontipo_movimientoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonnumero_mayorDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncodigoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonnombreDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncodigo_asientoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asientoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtondebito_localDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"debito_localDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncredito_localDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"credito_localDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtondebito_extranDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"debito_extranDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncredito_extranDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"credito_extranDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonfechaDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fechaDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtondetalleDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"detalleDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonnombre_estadoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estadoDiarioGeneralBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDiarioGeneral.jTabbedPaneRelacionesDiarioGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDiarioGeneral"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDiarioGeneral"));
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDiarioGeneral"));
		}
		
		this.jTableDatosDiarioGeneral.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDiarioGeneral"));
		
		this.jTableDatosDiarioGeneral.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDiarioGeneral"));
		
		this.jButtonNuevoDiarioGeneral.addActionListener(new ButtonActionListener(this,"NuevoDiarioGeneral"));
		
		this.jButtonDuplicarDiarioGeneral.addActionListener(new ButtonActionListener(this,"DuplicarDiarioGeneral"));
		
		this.jButtonCopiarDiarioGeneral.addActionListener(new ButtonActionListener(this,"CopiarDiarioGeneral"));
		
		this.jButtonVerFormDiarioGeneral.addActionListener(new ButtonActionListener(this,"VerFormDiarioGeneral"));
		
		
		this.jButtonNuevoToolBarDiarioGeneral.addActionListener(new ButtonActionListener(this,"NuevoToolBarDiarioGeneral"));
			
		this.jButtonDuplicarToolBarDiarioGeneral.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDiarioGeneral"));
			
		this.jMenuItemNuevoDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDiarioGeneral"));
			
		this.jMenuItemDuplicarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDiarioGeneral"));		
		
		
		this.jButtonNuevoRelacionesDiarioGeneral.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDiarioGeneral"));
		
		
		this.jButtonNuevoRelacionesToolBarDiarioGeneral.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDiarioGeneral"));
			
		this.jMenuItemNuevoRelacionesDiarioGeneral.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDiarioGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonModificarDiarioGeneral.addActionListener(new ButtonActionListener(this,"ModificarDiarioGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonModificarToolBarDiarioGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarDiarioGeneral"));
			
			this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemModificarDiarioGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarDiarioGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonActualizarDiarioGeneral.addActionListener (new ButtonActionListener(this,"ActualizarDiarioGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonActualizarToolBarDiarioGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDiarioGeneral"));
				
			this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemActualizarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDiarioGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonEliminarDiarioGeneral.addActionListener (new ButtonActionListener(this,"EliminarDiarioGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonEliminarToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarDiarioGeneral"));
						
			this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemEliminarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDiarioGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonCancelarDiarioGeneral.addActionListener (new ButtonActionListener(this,"CancelarDiarioGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonCancelarToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarDiarioGeneral"));
			
			this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemCancelarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDiarioGeneral"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDiarioGeneral"));		
		
		
		this.jButtonCerrarDiarioGeneral.addActionListener (new ButtonActionListener(this,"CerrarDiarioGeneral"));
		
		
		this.jButtonCerrarToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"CerrarToolBarDiarioGeneral"));
			
		this.jMenuItemCerrarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDiarioGeneral"));
			
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jMenuItemDetalleCerrarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDiarioGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosDiarioGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosDiarioGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiarioGeneral"));
		}
		
		this.jButtonCopiarToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"CopiarToolBarDiarioGeneral"));
			
		this.jButtonVerFormToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"VerFormToolBarDiarioGeneral"));
		
		this.jMenuItemGuardarCambiosDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDiarioGeneral"));
			
		this.jMenuItemCopiarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDiarioGeneral"));		
		
		this.jMenuItemVerFormDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDiarioGeneral"));		
		
		
		this.jButtonGuardarCambiosTablaDiarioGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDiarioGeneral"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDiarioGeneral"));
			
		this.jMenuItemGuardarCambiosTablaDiarioGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDiarioGeneral"));		
		
		
		
		this.jButtonRecargarInformacionDiarioGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionDiarioGeneral"));
					
		this.jButtonRecargarInformacionToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDiarioGeneral"));
		
		this.jMenuItemRecargarInformacionDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDiarioGeneral"));		
		
		
		
		this.jButtonAnterioresDiarioGeneral.addActionListener (new ButtonActionListener(this,"AnterioresDiarioGeneral"));
		
		
		this.jButtonAnterioresToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDiarioGeneral"));
		
		this.jMenuItemAnterioresDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDiarioGeneral"));		
		
		
		this.jButtonSiguientesDiarioGeneral.addActionListener (new ButtonActionListener(this,"SiguientesDiarioGeneral"));
		
		
		this.jButtonSiguientesToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDiarioGeneral"));
			
		this.jMenuItemSiguientesDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDiarioGeneral"));
			
		this.jMenuItemAbrirOrderByDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDiarioGeneral"));
			
		this.jMenuItemMostrarOcultarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDiarioGeneral"));
			
		this.jMenuItemDetalleAbrirOrderByDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDiarioGeneral"));
			
		this.jMenuItemDetalleMostarOcultarDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDiarioGeneral"));		
		
		
		this.jButtonNuevoGuardarCambiosDiarioGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDiarioGeneral"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDiarioGeneral"));
			
		this.jMenuItemNuevoGuardarCambiosDiarioGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDiarioGeneral"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDiarioGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDiarioGeneral"));

		this.jCheckBoxSeleccionadosDiarioGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDiarioGeneral"));
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDiarioGeneral"));
		}
		
		
		this.jComboBoxTiposRelacionesDiarioGeneral.addActionListener (new ButtonActionListener(this,"TiposRelacionesDiarioGeneral"));
			
		this.jComboBoxTiposAccionesDiarioGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesDiarioGeneral"));
					
		this.jComboBoxTiposSeleccionarDiarioGeneral.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDiarioGeneral"));
			
		this.jTextFieldValorCampoGeneralDiarioGeneral.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDiarioGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonidDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_empresaDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_empresaDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_sucursalDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_sucursalDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_ejercicioDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_ejercicioDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_periodoDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_periodoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_moduloDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_moduloDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_movimientoDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_movimientoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_documentoDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_documentoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonfecha_inicioDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonfecha_finDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_asiento_contableDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_asiento_contableDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtontipo_movimientoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonnumero_mayorDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncodigoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonnombreDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncodigo_asientoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asientoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtondebito_localDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"debito_localDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncredito_localDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"credito_localDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtondebito_extranDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"debito_extranDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncredito_extranDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"credito_extranDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonfechaDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fechaDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtondetalleDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"detalleDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonnombre_estadoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estadoDiarioGeneralBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaReporteDiarioGeneral.addActionListener(new ButtonActionListener(this,"BusquedaReporteDiarioGeneral"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDiarioGeneral!=null) {
				this.jInternalFrameReporteDinamicoDiarioGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiarioGeneral"));
				this.jInternalFrameReporteDinamicoDiarioGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiarioGeneral"));
				this.jInternalFrameReporteDinamicoDiarioGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiarioGeneral"));
			}
			
			//this.jButtonCerrarReporteDinamicoDiarioGeneral.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiarioGeneral"));				
			//this.jButtonGenerarReporteDinamicoDiarioGeneral.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiarioGeneral"));
			//this.jButtonGenerarExcelReporteDinamicoDiarioGeneral.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiarioGeneral"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDiarioGeneral!=null) {
				this.jInternalFrameImportacionDiarioGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDiarioGeneral"));
				this.jInternalFrameImportacionDiarioGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDiarioGeneral"));
				this.jInternalFrameImportacionDiarioGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDiarioGeneral"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDiarioGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByDiarioGeneral"));
			
			this.jButtonAbrirOrderByToolBarDiarioGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDiarioGeneral"));			
			
			if(this.jInternalFrameOrderByDiarioGeneral!=null) {
				this.jInternalFrameOrderByDiarioGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDiarioGeneral"));				
			}
			
			
		}
		
		this.jButtonAbrirTotalesDiarioGeneral.addActionListener (new ButtonActionListener(this,"AbrirTotalesDiarioGeneral"));
		
		if(this.jInternalFrameTotalesDiarioGeneral!=null) {
			this.jInternalFrameTotalesDiarioGeneral.getjButtonCerrarTotales().addActionListener (new ButtonActionListener(this,"CerrarTotalesDiarioGeneral"));
		}
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiarioGeneral.jTabbedPaneRelacionesDiarioGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDiarioGeneral"));
		
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
            		closingInternalFrameDiarioGeneral();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDiarioGeneral.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDiarioGeneral = (JInternalFrameBase)event.getSource();
	            	
	            DiarioGeneralBeanSwingJInternalFrame jInternalFrameParent=(DiarioGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormDiarioGeneral.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDiarioGeneralActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDiarioGeneral.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDiarioGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDiarioGeneral.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDiarioGeneral.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiarioGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiarioGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiarioGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDiarioGeneral";
		inputMap = this.jButtonNuevoDiarioGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDiarioGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDiarioGeneralActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiarioGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiarioGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiarioGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDiarioGeneral";
		inputMap = this.jButtonNuevoRelacionesDiarioGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDiarioGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDiarioGeneralActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDiarioGeneral";
		inputMap = this.jButtonModificarDiarioGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDiarioGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDiarioGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDiarioGeneral";
		inputMap = this.jButtonActualizarDiarioGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDiarioGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDiarioGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDiarioGeneral";
		inputMap = this.jButtonEliminarDiarioGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDiarioGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDiarioGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDiarioGeneral";
		inputMap = this.jButtonCancelarDiarioGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDiarioGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDiarioGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDiarioGeneral";
		inputMap = this.jButtonCerrarDiarioGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDiarioGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDiarioGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDiarioGeneral";
		inputMap = this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosDiarioGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonGuardarCambiosDiarioGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDiarioGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDiarioGeneral.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDiarioGeneralItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDiarioGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDiarioGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDiarioGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDiarioGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDiarioGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDiarioGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonidDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_empresaDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_empresaDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_sucursalDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_sucursalDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_ejercicioDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_ejercicioDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_periodoDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_periodoDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_periodoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_moduloDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_moduloDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_moduloDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_movimientoDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_movimientoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_documentoDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_tipo_documentoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonfecha_inicioDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonfecha_finDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finDiarioGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_asiento_contableDiarioGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_asiento_contableDiarioGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonid_asiento_contableDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_asiento_contableDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtontipo_movimientoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonnumero_mayorDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncodigoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonnombreDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncodigo_asientoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigo_asientoDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtondebito_localDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"debito_localDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncredito_localDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"credito_localDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtondebito_extranDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"debito_extranDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtoncredito_extranDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"credito_extranDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonfechaDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fechaDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtondetalleDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"detalleDiarioGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiarioGeneral.jButtonnombre_estadoDiarioGeneralBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estadoDiarioGeneralBusqueda"));
		
		
		this.jButtonBusquedaReporteDiarioGeneral.addActionListener(new ButtonActionListener(this,"BusquedaReporteDiarioGeneral"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDiarioGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDiarioGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDiarioGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDiarioGeneral.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDiarioGeneral(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DiarioGeneral diariogeneralAux:this.diariogeneralLogic.getDiarioGenerals()) {
					diariogeneralAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiarioGeneral diariogeneralAux:diariogenerals) {
					diariogeneralAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDiarioGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDiarioGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DiarioGeneral diariogeneralAux:this.diariogeneralLogic.getDiarioGenerals()) {
						diariogeneralAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiarioGeneral diariogeneralAux:diariogenerals) {
						diariogeneralAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DiarioGeneral diariogeneralAux:this.diariogeneralLogic.getDiarioGenerals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiarioGeneral diariogeneralAux:diariogenerals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDiarioGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDiarioGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDiarioGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDiarioGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDiarioGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDiarioGeneral.getSelectedRows();
			
			DiarioGeneral diariogeneralLocal=new DiarioGeneral();
			
			//this.seleccionarTodosDiarioGeneral(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					diariogeneralLocal =(DiarioGeneral) this.diariogeneralLogic.getDiarioGenerals().toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					diariogeneralLocal =(DiarioGeneral) this.diariogenerals.toArray()[this.jTableDatosDiarioGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				diariogeneralLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DiarioGeneral diariogeneralAux:this.diariogeneralLogic.getDiarioGenerals()) {
						diariogeneralAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiarioGeneral diariogeneralAux:diariogenerals) {
						diariogeneralAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDiarioGeneral(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDiarioGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDiarioGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDiarioGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDiarioGeneralItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDiarioGeneralParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDiarioGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDiarioGeneral(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDiarioGeneral.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DiarioGeneral diariogeneralAux:this.diariogeneralLogic.getDiarioGenerals()) {
				
						if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							diariogeneralAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							diariogeneralAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							diariogeneralAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							diariogeneralAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							diariogeneralAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							diariogeneralAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO)) {
							existe=true;
							diariogeneralAux.setcodigo_asiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							diariogeneralAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							diariogeneralAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN)) {
							existe=true;
							diariogeneralAux.setdebito_extran(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN)) {
							existe=true;
							diariogeneralAux.setcredito_extran(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							diariogeneralAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							diariogeneralAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO)) {
							existe=true;
							diariogeneralAux.setnombre_estado(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiarioGeneral diariogeneralAux:diariogenerals) {
					
						if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							diariogeneralAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							diariogeneralAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							diariogeneralAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							diariogeneralAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							diariogeneralAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							diariogeneralAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO)) {
							existe=true;
							diariogeneralAux.setcodigo_asiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							diariogeneralAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							diariogeneralAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN)) {
							existe=true;
							diariogeneralAux.setdebito_extran(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN)) {
							existe=true;
							diariogeneralAux.setcredito_extran(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							diariogeneralAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							diariogeneralAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO)) {
							existe=true;
							diariogeneralAux.setnombre_estado(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDiarioGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDiarioGeneralActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDiarioGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDiarioGeneral=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDiarioGeneral.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDiarioGeneral) {				
					conSplash=true;//false;										
					
					//this.startProcessDiarioGeneral(conSplash);
				
					this.generarReporteDiarioGeneralsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiarioGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDiarioGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesDiarioGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDiarioGeneralsSeleccionados(false);
				//this.jComboBoxTiposAccionesDiarioGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDiarioGeneralsSeleccionados(true);
				//this.jComboBoxTiposAccionesDiarioGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDiarioGeneral();
				
				this.exportarDiarioGeneralsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiarioGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDiarioGenerals();
				//this.importarDiarioGenerals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiarioGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDiarioGeneral();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDiarioGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesDiarioGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Diario General", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDiarioGeneral();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDiarioGeneral)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDiarioGeneral(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Diario General",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiarioGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.setSelectedIndex(0);					
				}	
			} 			
			else if(DiarioGeneralBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDiarioGeneral) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDiarioGeneral(conSplash);
					
						//this.actualizarParametrosGeneralDiarioGeneral();
						
						this.generarReporteProcesoAccionDiarioGeneralsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDiarioGeneral.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DiarioGeneralBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Diario GeneralES SELECCIONADOS?", "MANTENIMIENTO DE Diario General", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDiarioGeneral();
				
						this.actualizarParametrosGeneralDiarioGeneral();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.diariogeneralReturnGeneral=diariogeneralLogic.procesarAccionDiarioGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.diariogeneralLogic.getDiarioGenerals(),this.diariogeneralParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDiarioGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDiarioGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDiarioGeneral();
					
					DiarioGeneralBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDiarioGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDiarioGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxTiposAccionesFormularioDiarioGeneral.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDiarioGeneral(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDiarioGeneralActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDiarioGeneral();
			
			if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();		
			DiarioGeneral diariogeneral=new DiarioGeneral();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDiarioGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDiarioGeneral.getSelectedItem();
			
			
			
			
			diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(true);
			//this.sTipoAccion;
			
			if(diariogeneralsSeleccionados.size()==1) {
				for(DiarioGeneral diariogeneralAux:diariogeneralsSeleccionados) {
					diariogeneral=diariogeneralAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDiarioGeneral();
			
      		//this.finishProcessDiarioGeneral(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDiarioGeneralReturnGeneral() throws Exception {
		if(this.diariogeneralReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.diariogeneralReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.diariogeneralReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.diariogeneralReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.diariogeneralReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.diariogeneralReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDiarioGeneral(false);
		}
		
		if(this.diariogeneralReturnGeneral.getConRetornoLista() || this.diariogeneralReturnGeneral.getConRetornoObjeto()) {
			if(this.diariogeneralReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.diariogeneralLogic.setDiarioGenerals(this.diariogeneralReturnGeneral.getDiarioGenerals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingDiarioGeneral(false);
		}
	}
	
	public void actualizarParametrosGeneralDiarioGeneral() throws Exception {
		
		
	}
	
	public ArrayList<DiarioGeneral> getDiarioGeneralsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDiarioGeneral) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DiarioGeneral diariogeneralAux:diariogeneralLogic.getDiarioGenerals()) {
					if(diariogeneralAux.getIsSelected()) {
						diariogeneralsSeleccionados.add(diariogeneralAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiarioGeneral diariogeneralAux:this.diariogenerals) {
					if(diariogeneralAux.getIsSelected()) {
						diariogeneralsSeleccionados.add(diariogeneralAux);				
					}
				}
			}
			
			if(diariogeneralsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						diariogeneralsSeleccionados.addAll(this.diariogeneralLogic.getDiarioGenerals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						diariogeneralsSeleccionados.addAll(this.diariogenerals);				
					}
				}
			}
		} else {
			diariogeneralsSeleccionados.add(this.diariogeneral);
		}
		
		return diariogeneralsSeleccionados;
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
	
	public void generarReporteDiarioGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDiarioGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDiarioGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDiarioGeneralsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDiarioGeneralsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Diario General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDiarioGeneralsSeleccionados() throws Exception {
		ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();		
		
		diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDiarioGenerals("Todos",diariogeneralsSeleccionados);
		
	}	
	
	public void generarReporteNormalDiarioGeneralsSeleccionados() throws Exception {
		ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();		
		
		diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDiarioGenerals("Todos",diariogeneralsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDiarioGeneralsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();
		
		diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDiarioGenerals("Todos",diariogeneralsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDiarioGeneralsSeleccionados() throws Exception {
		ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDiarioGeneral();
		
		
		diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDiarioGeneral();
		
		
		//this.generarReporteDiarioGenerals("Todos",diariogeneralsSeleccionados ,diariogeneralImplementable,diariogeneralImplementableHome);
	}
	
	public void mostrarImportacionDiarioGenerals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDiarioGeneral();
		
		this.abrirFrameImportacionDiarioGeneral();		
		
			
		//this.generarReporteDiarioGenerals("Todos",diariogeneralsSeleccionados ,diariogeneralImplementable,diariogeneralImplementableHome);
	}
	
	public void importarDiarioGenerals() throws Exception {		
	
	}
	
	public void exportarDiarioGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDiarioGeneralsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDiarioGeneralsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDiarioGeneralsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Diario General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDiarioGeneralsSeleccionados() throws Exception {
		ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();		
		
		diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariogeneral."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDiarioGeneral(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DiarioGeneral diariogeneralAux:diariogeneralsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDiarioGeneral(diariogeneralAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//diariogeneralAux.setsDetalleGeneralEntityReporte(diariogeneralAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diario General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDiarioGeneral(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_DETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDiarioGeneral(DiarioGeneral diariogeneral,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=diariogeneral.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.gettipodocumento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getasientocontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.gettipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getcodigo_asiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getdebito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getcredito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getdebito_extran().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getcredito_extran().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getdetalle();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diariogeneral.getnombre_estado();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDiarioGeneralsSeleccionados() throws Exception {
		ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();		
		
		diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariogeneral.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DiarioGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDiarioGeneral(row);				
				iRow++;
			}				
			
			for(DiarioGeneral diariogeneralAux:diariogeneralsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDiarioGeneral(diariogeneralAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diario General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDiarioGeneralsSeleccionados() throws Exception {
		ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();		
		
		diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diariogeneral.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("diariogenerals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("diariogeneral");
			//elementRoot.appendChild(element);
		
			for(DiarioGeneral diariogeneralAux:diariogeneralsSeleccionados) {
				element = document.createElement("diariogeneral");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDiarioGeneral(diariogeneralAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diario General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDiarioGeneral(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_DEBITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CREDITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_DEBITOEXTRAN);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_CREDITOEXTRAN);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_DETALLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDiarioGeneral(DiarioGeneral diariogeneral,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.gettipodocumento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getasientocontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.gettipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getcodigo_asiento());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getdebito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getcredito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getdebito_extran());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getcredito_extran());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getdetalle());
		cell = row.createCell(iColumn++);cell.setCellValue(diariogeneral.getnombre_estado());				
	}
	
	public void setFilaDatosExportarXmlDiarioGeneral(DiarioGeneral diariogeneral,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DiarioGeneralConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(diariogeneral.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DiarioGeneralConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(diariogeneral.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DiarioGeneralConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(diariogeneral.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DiarioGeneralConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(diariogeneral.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(DiarioGeneralConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(diariogeneral.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(DiarioGeneralConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(diariogeneral.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementmodulo_descripcion = document.createElement(DiarioGeneralConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(diariogeneral.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(DiarioGeneralConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(diariogeneral.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementtipodocumento_descripcion = document.createElement(DiarioGeneralConstantesFunciones.IDTIPODOCUMENTO);
		elementtipodocumento_descripcion.appendChild(document.createTextNode(diariogeneral.gettipodocumento_descripcion()));
		element.appendChild(elementtipodocumento_descripcion);

		Element elementfecha_inicio = document.createElement(DiarioGeneralConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(diariogeneral.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(DiarioGeneralConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(diariogeneral.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementasientocontable_descripcion = document.createElement(DiarioGeneralConstantesFunciones.IDASIENTOCONTABLE);
		elementasientocontable_descripcion.appendChild(document.createTextNode(diariogeneral.getasientocontable_descripcion()));
		element.appendChild(elementasientocontable_descripcion);

		Element elementtipo_movimiento = document.createElement(DiarioGeneralConstantesFunciones.TIPOMOVIMIENTO);
		elementtipo_movimiento.appendChild(document.createTextNode(diariogeneral.gettipo_movimiento().trim()));
		element.appendChild(elementtipo_movimiento);

		Element elementnumero_mayor = document.createElement(DiarioGeneralConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(diariogeneral.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementcodigo = document.createElement(DiarioGeneralConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(diariogeneral.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(DiarioGeneralConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(diariogeneral.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcodigo_asiento = document.createElement(DiarioGeneralConstantesFunciones.CODIGOASIENTO);
		elementcodigo_asiento.appendChild(document.createTextNode(diariogeneral.getcodigo_asiento().trim()));
		element.appendChild(elementcodigo_asiento);

		Element elementdebito_local = document.createElement(DiarioGeneralConstantesFunciones.DEBITOLOCAL);
		elementdebito_local.appendChild(document.createTextNode(diariogeneral.getdebito_local().toString().trim()));
		element.appendChild(elementdebito_local);

		Element elementcredito_local = document.createElement(DiarioGeneralConstantesFunciones.CREDITOLOCAL);
		elementcredito_local.appendChild(document.createTextNode(diariogeneral.getcredito_local().toString().trim()));
		element.appendChild(elementcredito_local);

		Element elementdebito_extran = document.createElement(DiarioGeneralConstantesFunciones.DEBITOEXTRAN);
		elementdebito_extran.appendChild(document.createTextNode(diariogeneral.getdebito_extran().toString().trim()));
		element.appendChild(elementdebito_extran);

		Element elementcredito_extran = document.createElement(DiarioGeneralConstantesFunciones.CREDITOEXTRAN);
		elementcredito_extran.appendChild(document.createTextNode(diariogeneral.getcredito_extran().toString().trim()));
		element.appendChild(elementcredito_extran);

		Element elementfecha = document.createElement(DiarioGeneralConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(diariogeneral.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementdetalle = document.createElement(DiarioGeneralConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(diariogeneral.getdetalle().trim()));
		element.appendChild(elementdetalle);

		Element elementnombre_estado = document.createElement(DiarioGeneralConstantesFunciones.NOMBREESTADO);
		elementnombre_estado.appendChild(document.createTextNode(diariogeneral.getnombre_estado().trim()));
		element.appendChild(elementnombre_estado);
	}
	
	public void generarReporteGroupGenericoDiarioGeneralsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DiarioGeneral> diariogeneralsSeleccionados=new ArrayList<DiarioGeneral>();
		
		diariogeneralsSeleccionados=this.getDiarioGeneralsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDiarioGeneral(diariogeneralsSeleccionados);
		
		this.generarReporteDiarioGenerals("Todos",diariogeneralsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDiarioGeneral(ArrayList<DiarioGeneral> diariogeneralsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DiarioGeneral diariogeneralAux:diariogeneralsSeleccionados) {
				diariogeneralAux.setsDetalleGeneralEntityReporte(diariogeneralAux.toString());
			
				if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTO)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.gettipodocumento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(diariogeneralAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(diariogeneralAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_IDASIENTOCONTABLE)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getasientocontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.gettipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_CODIGOASIENTO)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getcodigo_asiento());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(diariogeneralAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getdetalle());
				}
				 else if(sTipoSeleccionar.equals(DiarioGeneralConstantesFunciones.LABEL_NOMBREESTADO)) {
					existe=true;
					diariogeneralAux.setsDescripcionGeneralEntityReporte1(diariogeneralAux.getnombre_estado());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiarioGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDiarioGeneral(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDiarioGeneral=true;
				this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=true;
				this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=true;
			}
			
			this.isVisibilidadCeldaModificarDiarioGeneral=false;
			this.isVisibilidadCeldaActualizarDiarioGeneral=false;
			this.isVisibilidadCeldaEliminarDiarioGeneral=false;
			this.isVisibilidadCeldaCancelarDiarioGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiarioGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarDiarioGeneral=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDiarioGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=false;
			this.isVisibilidadCeldaModificarDiarioGeneral=false;
			this.isVisibilidadCeldaActualizarDiarioGeneral=true;
			this.isVisibilidadCeldaEliminarDiarioGeneral=false;
			this.isVisibilidadCeldaCancelarDiarioGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiarioGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarDiarioGeneral=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDiarioGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=false;
			this.isVisibilidadCeldaModificarDiarioGeneral=false;
			this.isVisibilidadCeldaActualizarDiarioGeneral=true;
			this.isVisibilidadCeldaEliminarDiarioGeneral=true;
			this.isVisibilidadCeldaCancelarDiarioGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiarioGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarDiarioGeneral=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDiarioGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=false;
			this.isVisibilidadCeldaModificarDiarioGeneral=false;
			this.isVisibilidadCeldaActualizarDiarioGeneral=true;
			this.isVisibilidadCeldaEliminarDiarioGeneral=false;
			this.isVisibilidadCeldaCancelarDiarioGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiarioGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarDiarioGeneral=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDiarioGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=true;
			this.isVisibilidadCeldaModificarDiarioGeneral=false;
			this.isVisibilidadCeldaActualizarDiarioGeneral=false;
			this.isVisibilidadCeldaEliminarDiarioGeneral=false;
			this.isVisibilidadCeldaCancelarDiarioGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiarioGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarDiarioGeneral=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDiarioGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=false;
			this.isVisibilidadCeldaActualizarDiarioGeneral=false;
			this.isVisibilidadCeldaEliminarDiarioGeneral=false;
			this.isVisibilidadCeldaCancelarDiarioGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiarioGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarDiarioGeneral=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDiarioGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=false;
			this.isVisibilidadCeldaModificarDiarioGeneral=true;
			this.isVisibilidadCeldaActualizarDiarioGeneral=false;
			this.isVisibilidadCeldaEliminarDiarioGeneral=false;
			this.isVisibilidadCeldaCancelarDiarioGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiarioGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarDiarioGeneral=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DiarioGeneralJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDiarioGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=true;
		} else {
			this.actualizarEstadoPanelsDiarioGeneral(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDiarioGeneral=false;
			//this.isVisibilidadCeldaVerFormDiarioGeneral=false;
			this.isVisibilidadCeldaDuplicarDiarioGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!diariogeneralSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=false;
		} else {
			this.isVisibilidadCeldaNuevoDiarioGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(diariogeneralSessionBean.getEsGuardarRelacionado()) {
			if(!diariogeneralSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=false;												
			}
			
			this.jButtonCerrarDiarioGeneral.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=false;
		}
		
		if(!this.permiteMantenimiento(this.diariogeneral)) {
			this.isVisibilidadCeldaActualizarDiarioGeneral=false;
			this.isVisibilidadCeldaEliminarDiarioGeneral=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoDiarioGeneral=false;
		this.isVisibilidadCeldaNuevoRelacionesDiarioGeneral=false;
		this.isVisibilidadCeldaGuardarCambiosDiarioGeneral=false;
		//this.isVisibilidadCeldaModificarDiarioGeneral=true;
		this.isVisibilidadCeldaActualizarDiarioGeneral=false;
		this.isVisibilidadCeldaEliminarDiarioGeneral=false;
		//this.isVisibilidadCeldaCancelarDiarioGeneral=true;			
		this.isVisibilidadCeldaGuardarDiarioGeneral=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDiarioGeneral() {
	}
	
	public void actualizarEstadoPanelsDiarioGeneral(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDiarioGeneral!=null) {
				this.jScrollPanelDatosEdicionDiarioGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiarioGeneral!=null) {
				this.jTabbedPaneBusquedasDiarioGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiarioGeneral!=null) {
				this.jScrollPanelDatosDiarioGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiarioGeneral!=null) {
				this.jPanelPaginacionDiarioGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiarioGeneral!=null) {
				this.jPanelParametrosReportesDiarioGeneral.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDiarioGeneral!=null) {
				this.jScrollPanelDatosEdicionDiarioGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiarioGeneral!=null) {
				this.jTabbedPaneBusquedasDiarioGeneral.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDiarioGeneral!=null) {
				this.jScrollPanelDatosDiarioGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiarioGeneral!=null) {
				this.jPanelPaginacionDiarioGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiarioGeneral!=null) {
				this.jPanelParametrosReportesDiarioGeneral.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDiarioGeneral!=null) {
				this.jScrollPanelDatosEdicionDiarioGeneral.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiarioGeneral!=null) {
				this.jTabbedPaneBusquedasDiarioGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDiarioGeneral!=null) {
				this.jScrollPanelDatosDiarioGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiarioGeneral!=null) {
				this.jPanelPaginacionDiarioGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiarioGeneral!=null) {
				this.jPanelParametrosReportesDiarioGeneral.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDiarioGeneral!=null) {
				this.jScrollPanelDatosEdicionDiarioGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiarioGeneral!=null) {
				this.jTabbedPaneBusquedasDiarioGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDiarioGeneral!=null) {
				this.jScrollPanelDatosDiarioGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiarioGeneral!=null) {
				this.jPanelPaginacionDiarioGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiarioGeneral!=null) {
				this.jPanelParametrosReportesDiarioGeneral.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDiarioGeneral!=null) {
				this.jScrollPanelDatosEdicionDiarioGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiarioGeneral!=null) {
				this.jTabbedPaneBusquedasDiarioGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiarioGeneral!=null) {
				this.jScrollPanelDatosDiarioGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiarioGeneral!=null) {
				this.jPanelPaginacionDiarioGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiarioGeneral!=null) {
				this.jPanelParametrosReportesDiarioGeneral.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDiarioGeneral!=null) {
				this.jScrollPanelDatosEdicionDiarioGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiarioGeneral!=null) {
				this.jTabbedPaneBusquedasDiarioGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiarioGeneral!=null) {
				this.jScrollPanelDatosDiarioGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiarioGeneral!=null) {
				this.jPanelPaginacionDiarioGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiarioGeneral!=null) {
				this.jPanelParametrosReportesDiarioGeneral.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDiarioGeneral!=null) {
				this.jScrollPanelDatosEdicionDiarioGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiarioGeneral!=null) {
				this.jTabbedPaneBusquedasDiarioGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiarioGeneral!=null) {
				this.jScrollPanelDatosDiarioGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiarioGeneral!=null) {
				this.jPanelPaginacionDiarioGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiarioGeneral!=null) {
				this.jPanelParametrosReportesDiarioGeneral.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDiarioGeneral!=null) {
					this.jTabbedPaneBusquedasDiarioGeneral.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDiarioGeneral!=null) {
				this.jPanelParametrosReportesDiarioGeneral.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.diariogeneralSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiarioGeneral!=null) {
				this.jTabbedPaneBusquedasDiarioGeneral.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDiarioGeneral!=null) {
				this.jPanelParametrosReportesDiarioGeneral.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaReporte=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaReporte) {this.jTabbedPaneBusquedasDiarioGeneral.remove(jPanelBusquedaReporteDiarioGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaReporte=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaReporte) {this.jTabbedPaneBusquedasDiarioGeneral.remove(jPanelBusquedaReporteDiarioGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaReporte=isParaEjercicio;
			if(!this.isVisibilidadBusquedaReporte) {this.jTabbedPaneBusquedasDiarioGeneral.remove(jPanelBusquedaReporteDiarioGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaReporte=isParaPeriodo;
			if(!this.isVisibilidadBusquedaReporte) {this.jTabbedPaneBusquedasDiarioGeneral.remove(jPanelBusquedaReporteDiarioGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaReporte=isParaModulo;
			if(!this.isVisibilidadBusquedaReporte) {this.jTabbedPaneBusquedasDiarioGeneral.remove(jPanelBusquedaReporteDiarioGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaReporte=isParaTipoMovimiento;
			if(!this.isVisibilidadBusquedaReporte) {this.jTabbedPaneBusquedasDiarioGeneral.remove(jPanelBusquedaReporteDiarioGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDocumento(Boolean isParaTipoDocumento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDocumentoNegation=!isParaTipoDocumento;

			this.isVisibilidadBusquedaReporte=isParaTipoDocumento;
			if(!this.isVisibilidadBusquedaReporte) {this.jTabbedPaneBusquedasDiarioGeneral.remove(jPanelBusquedaReporteDiarioGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaAsientoContable(Boolean isParaAsientoContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAsientoContableNegation=!isParaAsientoContable;

			this.isVisibilidadBusquedaReporte=isParaAsientoContableNegation;
			if(!this.isVisibilidadBusquedaReporte) {this.jTabbedPaneBusquedasDiarioGeneral.remove(jPanelBusquedaReporteDiarioGeneral);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDiarioGeneral(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDiarioGeneral() {
		this.updateBorderResaltarBusquedasFormularioDiarioGeneral();
		this.updateVisibilidadBusquedasFormularioDiarioGeneral();
		this.updateHabilitarBusquedasFormularioDiarioGeneral();
	}
	
	public void updateBorderResaltarBusquedasFormularioDiarioGeneral() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDiarioGeneral.getComponents().length>0) {
	

		if(this.diariogeneralConstantesFunciones.resaltarBusquedaReporteDiarioGeneral!=null) {
			index= this.jTabbedPaneBusquedasDiarioGeneral.indexOfComponent(this.jPanelBusquedaReporteDiarioGeneral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDiarioGeneral.getComponent(index);
				jPanel.setBorder(this.diariogeneralConstantesFunciones.resaltarBusquedaReporteDiarioGeneral);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDiarioGeneral() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDiarioGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDiarioGeneral.indexOfComponent(this.jPanelBusquedaReporteDiarioGeneral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDiarioGeneral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.diariogeneralConstantesFunciones.mostrarBusquedaReporteDiarioGeneral);
			if(!this.diariogeneralConstantesFunciones.mostrarBusquedaReporteDiarioGeneral && index>-1) {
				this.jTabbedPaneBusquedasDiarioGeneral.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDiarioGeneral() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDiarioGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDiarioGeneral.indexOfComponent(this.jPanelBusquedaReporteDiarioGeneral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDiarioGeneral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.diariogeneralConstantesFunciones.activarBusquedaReporteDiarioGeneral);
				this.jTabbedPaneBusquedasDiarioGeneral.setEnabledAt(index,this.diariogeneralConstantesFunciones.activarBusquedaReporteDiarioGeneral);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDiarioGeneral(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaReporte")) {
			index= this.jTabbedPaneBusquedasDiarioGeneral.indexOfComponent(this.jPanelBusquedaReporteDiarioGeneral);

			this.jTabbedPaneBusquedasDiarioGeneral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDiarioGeneral.getComponent(index);

			this.diariogeneralConstantesFunciones.setResaltarBusquedaReporteDiarioGeneral(resaltar);

			jPanel.setBorder(this.diariogeneralConstantesFunciones.resaltarBusquedaReporteDiarioGeneral);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDiarioGeneral.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDiarioGeneral() throws Exception {

		if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDiarioGeneral();
		this.updateVisibilidadResaltarControlesFormularioDiarioGeneral();
		this.updateHabilitarResaltarControlesFormularioDiarioGeneral();
		
	}
	
	public void updateBorderResaltarControlesFormularioDiarioGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.diariogeneralConstantesFunciones.resaltaridDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jLabelidDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltaridDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarid_empresaDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarid_empresaDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarid_sucursalDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarid_sucursalDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarid_ejercicioDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarid_ejercicioDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarid_periodoDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarid_periodoDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarid_moduloDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarid_moduloDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarid_tipo_movimientoDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarid_tipo_movimientoDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarid_tipo_documentoDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarid_tipo_documentoDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarfecha_inicioDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfecha_inicioDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarfecha_inicioDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarfecha_finDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfecha_finDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarfecha_finDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarid_asiento_contableDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarid_asiento_contableDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltartipo_movimientoDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jTextAreatipo_movimientoDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltartipo_movimientoDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarnumero_mayorDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanumero_mayorDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarnumero_mayorDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarcodigoDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigoDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarcodigoDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarnombreDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanombreDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarnombreDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarcodigo_asientoDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigo_asientoDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarcodigo_asientoDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltardebito_localDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_localDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltardebito_localDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarcredito_localDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_localDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarcredito_localDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltardebito_extranDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_extranDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltardebito_extranDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarcredito_extranDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_extranDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarcredito_extranDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarfechaDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfechaDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarfechaDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltardetalleDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jTextAreadetalleDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltardetalleDiarioGeneral);}
		if(this.diariogeneralConstantesFunciones.resaltarnombre_estadoDiarioGeneral!=null && this.jInternalFrameDetalleFormDiarioGeneral!=null) {this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldnombre_estadoDiarioGeneral.setBorder(this.diariogeneralConstantesFunciones.resaltarnombre_estadoDiarioGeneral);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDiarioGeneral() throws Exception {		
		if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
	
		//this.jInternalFrameDetalleFormDiarioGeneral.jLabelidDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostraridDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelidDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostraridDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_empresaDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelid_empresaDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_empresaDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_sucursalDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelid_sucursalDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_sucursalDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_ejercicioDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelid_ejercicioDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_ejercicioDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_periodoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelid_periodoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_periodoDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_moduloDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelid_moduloDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_moduloDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_tipo_movimientoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelid_tipo_movimientoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_tipo_movimientoDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_tipo_documentoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelid_tipo_documentoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_tipo_documentoDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfecha_inicioDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarfecha_inicioDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelfecha_inicioDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarfecha_inicioDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfecha_finDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarfecha_finDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelfecha_finDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarfecha_finDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_asiento_contableDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelid_asiento_contableDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarid_asiento_contableDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jTextAreatipo_movimientoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrartipo_movimientoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPaneltipo_movimientoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrartipo_movimientoDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanumero_mayorDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarnumero_mayorDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelnumero_mayorDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarnumero_mayorDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarcodigoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelcodigoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarcodigoDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanombreDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarnombreDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelnombreDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarnombreDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigo_asientoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarcodigo_asientoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelcodigo_asientoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarcodigo_asientoDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_localDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrardebito_localDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPaneldebito_localDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrardebito_localDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_localDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarcredito_localDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelcredito_localDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarcredito_localDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_extranDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrardebito_extranDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPaneldebito_extranDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrardebito_extranDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_extranDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarcredito_extranDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelcredito_extranDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarcredito_extranDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfechaDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarfechaDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelfechaDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarfechaDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jTextAreadetalleDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrardetalleDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPaneldetalleDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrardetalleDiarioGeneral);
		//this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldnombre_estadoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarnombre_estadoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jPanelnombre_estadoDiarioGeneral.setVisible(this.diariogeneralConstantesFunciones.mostrarnombre_estadoDiarioGeneral);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDiarioGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormDiarioGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDiarioGeneral!=null) {
	
		this.jInternalFrameDetalleFormDiarioGeneral.jLabelidDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activaridDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_empresaDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarid_empresaDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_sucursalDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarid_sucursalDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_ejercicioDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarid_ejercicioDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_periodoDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarid_periodoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_moduloDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarid_moduloDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_movimientoDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarid_tipo_movimientoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_tipo_documentoDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarid_tipo_documentoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfecha_inicioDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarfecha_inicioDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfecha_finDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarfecha_finDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jComboBoxid_asiento_contableDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarid_asiento_contableDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextAreatipo_movimientoDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activartipo_movimientoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanumero_mayorDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarnumero_mayorDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigoDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarcodigoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextAreanombreDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarnombreDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcodigo_asientoDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarcodigo_asientoDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_localDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activardebito_localDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_localDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarcredito_localDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFielddebito_extranDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activardebito_extranDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldcredito_extranDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarcredito_extranDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jDateChooserfechaDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarfechaDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextAreadetalleDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activardetalleDiarioGeneral);
		this.jInternalFrameDetalleFormDiarioGeneral.jTextFieldnombre_estadoDiarioGeneral.setEnabled(this.diariogeneralConstantesFunciones.activarnombre_estadoDiarioGeneral);
		}
	}
	
		
}