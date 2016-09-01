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

import com.bydan.erp.contabilidad.util.SecuencialConstantesFunciones;
import com.bydan.erp.contabilidad.util.SecuencialParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.SecuencialParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.SecuencialBean;
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
public class SecuencialBeanSwingJInternalFrame extends SecuencialJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SecuencialBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Secuencial> secuencialValidator = new ClassValidator<Secuencial>(Secuencial.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Secuencial secuencial;	
	public Secuencial secuencialAux;
	public Secuencial secuencialAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Secuencial secuencialTotales;
	public Long idSecuencialActual;
	public Long iIdNuevoSecuencial=0L;
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

	public String sFinalQueryComboTipoMovimientoModulo="";

	public List<TipoMovimientoModulo> tipomovimientomodulosForeignKey;

	public List<TipoMovimientoModulo> gettipomovimientomodulosForeignKey() {
		return tipomovimientomodulosForeignKey;
	}

	public void settipomovimientomodulosForeignKey(List<TipoMovimientoModulo> tipomovimientomodulosForeignKey) {
		this.tipomovimientomodulosForeignKey = tipomovimientomodulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoMovimientoModulo tipomovimientomoduloForeignKey;

	public TipoMovimientoModulo gettipomovimientomoduloForeignKey() {
		return tipomovimientomoduloForeignKey;
	}

	public void settipomovimientomoduloForeignKey(TipoMovimientoModulo tipomovimientomoduloForeignKey) {
		this.tipomovimientomoduloForeignKey = tipomovimientomoduloForeignKey;
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
	
	public Boolean isPermisoTodoSecuencial;
	public Boolean isPermisoNuevoSecuencial;
	public Boolean isPermisoActualizarSecuencial;
	public Boolean isPermisoActualizarOriginalSecuencial;
	public Boolean isPermisoEliminarSecuencial;
	public Boolean isPermisoGuardarCambiosSecuencial;
	public Boolean isPermisoConsultaSecuencial;
	public Boolean isPermisoBusquedaSecuencial;
	public Boolean isPermisoReporteSecuencial;
	public Boolean isPermisoPaginacionMedioSecuencial;
	public Boolean isPermisoPaginacionAltoSecuencial;
	public Boolean isPermisoPaginacionTodoSecuencial;
	public Boolean isPermisoCopiarSecuencial;
	public Boolean isPermisoVerFormSecuencial;
	public Boolean isPermisoDuplicarSecuencial;
	public Boolean isPermisoOrdenSecuencial;
	
	
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
	
	public SecuencialParameterReturnGeneral secuencialReturnGeneral;
	public SecuencialParameterReturnGeneral secuencialParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSecuencial=false;
	public Boolean esParaAccionDesdeFormularioSecuencial=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SecuencialSessionBeanAdditional secuencialSessionBeanAdditional=null;
	
	public SecuencialSessionBeanAdditional getSecuencialSessionBeanAdditional() {
		return this.secuencialSessionBeanAdditional;
	}
	
	public void setSecuencialSessionBeanAdditional(SecuencialSessionBeanAdditional secuencialSessionBeanAdditional) {
		try {
			this.secuencialSessionBeanAdditional=secuencialSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SecuencialBeanSwingJInternalFrameAdditional secuencialBeanSwingJInternalFrameAdditional=null;
	//public class SecuencialBeanSwingJInternalFrame
	
	public SecuencialBeanSwingJInternalFrameAdditional getSecuencialBeanSwingJInternalFrameAdditional() {
		return this.secuencialBeanSwingJInternalFrameAdditional;
	}
	
	public void setSecuencialBeanSwingJInternalFrameAdditional(SecuencialBeanSwingJInternalFrameAdditional secuencialBeanSwingJInternalFrameAdditional) {
		try {
			this.secuencialBeanSwingJInternalFrameAdditional=secuencialBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SecuencialLogic secuencialLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Secuencial secuencialBean;
	public SecuencialConstantesFunciones secuencialConstantesFunciones;
	//public SecuencialParameterReturnGeneral secuencialReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	public ModuloLogic moduloLogic;
	public TipoMovimientoModuloLogic tipomovimientomoduloLogic;
	public TipoDocumentoLogic tipodocumentoLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	
	//PARAMETROS
	
	
	//public List<Secuencial> secuencials;	
	//public List<Secuencial> secuencialsEliminados;
	//public List<Secuencial> secuencialsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSecuencial=false;
	public Boolean isVisibilidadCeldaDuplicarSecuencial=true;
	public Boolean isVisibilidadCeldaCopiarSecuencial=true;
	public Boolean isVisibilidadCeldaVerFormSecuencial=true;
	public Boolean isVisibilidadCeldaOrdenSecuencial=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSecuencial=false;
	public Boolean isVisibilidadCeldaModificarSecuencial=false;
	public Boolean isVisibilidadCeldaActualizarSecuencial=false;
	public Boolean isVisibilidadCeldaEliminarSecuencial=false;
	public Boolean isVisibilidadCeldaCancelarSecuencial=false;
	public Boolean isVisibilidadCeldaGuardarSecuencial=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSecuencial=false;	
	
	
	public Boolean isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoDocumento=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	public Boolean isVisibilidadFK_IdTipoMovimientoModulo=false;
	
	public Long getiIdNuevoSecuencial() {
		return this.iIdNuevoSecuencial;
	}

	public void setiIdNuevoSecuencial(Long iIdNuevoSecuencial) {
		this.iIdNuevoSecuencial = iIdNuevoSecuencial;
	}
	
	public Long getidSecuencialActual() {
		return this.idSecuencialActual;
	}

	public void setidSecuencialActual(Long idSecuencialActual) {
		this.idSecuencialActual = idSecuencialActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Secuencial getsecuencial() {
		return this.secuencial;
	}

	public void setsecuencial(Secuencial secuencial) {
		this.secuencial = secuencial;
	}
	
	public Secuencial getsecuencialAux() {
		return this.secuencialAux;
	}

	public void setsecuencialAux(Secuencial secuencialAux) {
		this.secuencialAux = secuencialAux;
	}				
	
	public Secuencial getsecuencialAnterior() {
		return this.secuencialAnterior;
	}

	public void setsecuencialAnterior(Secuencial secuencialAnterior) {
		this.secuencialAnterior = secuencialAnterior;
	}	
	
	public Secuencial getsecuencialTotales() {
		return this.secuencialTotales;
	}

	public void setsecuencialTotales(Secuencial secuencialTotales) {
		this.secuencialTotales = secuencialTotales;
	}	
	
	public Secuencial getsecuencialBean() {
		return this.secuencialBean;
	}

	public void setsecuencialBean(Secuencial secuencialBean) {
		this.secuencialBean = secuencialBean;
	}	
	
	public SecuencialParameterReturnGeneral getsecuencialReturnGeneral() {
		return this.secuencialReturnGeneral;
	}

	public void setsecuencialReturnGeneral(SecuencialParameterReturnGeneral secuencialReturnGeneral) {
		this.secuencialReturnGeneral = secuencialReturnGeneral;
	}	
	
	
	public Long id_moduloBusquedaPorEjercicioPorModuloPorMovimiento=-1L;

	public Long getid_moduloBusquedaPorEjercicioPorModuloPorMovimiento() {
		return this.id_moduloBusquedaPorEjercicioPorModuloPorMovimiento;
	}

	public void setid_moduloBusquedaPorEjercicioPorModuloPorMovimiento(Long id_moduloBusquedaPorEjercicioPorModuloPorMovimiento) {
		this.id_moduloBusquedaPorEjercicioPorModuloPorMovimiento = id_moduloBusquedaPorEjercicioPorModuloPorMovimiento;
	}

;
	public Long id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento=-1L;

	public Long getid_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento() {
		return this.id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento;
	}

	public void setid_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento(Long id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento) {
		this.id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento = id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento;
	}

;
	public Long id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento=-1L;

	public Long getid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento() {
		return this.id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento;
	}

	public void setid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento(Long id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento) {
		this.id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento = id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
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

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
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

	public Long id_tipo_movimiento_moduloFK_IdTipoMovimientoModulo=-1L;

	public Long getid_tipo_movimiento_moduloFK_IdTipoMovimientoModulo() {
		return this.id_tipo_movimiento_moduloFK_IdTipoMovimientoModulo;
	}

	public void setid_tipo_movimiento_moduloFK_IdTipoMovimientoModulo(Long id_tipo_movimiento_moduloFK_IdTipoMovimientoModulo) {
		this.id_tipo_movimiento_moduloFK_IdTipoMovimientoModulo = id_tipo_movimiento_moduloFK_IdTipoMovimientoModulo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SecuencialLogic getSecuencialLogic()	{		
		return secuencialLogic;
	}

	public void setSecuencialLogic(SecuencialLogic secuencialLogic) {
		this.secuencialLogic = secuencialLogic;
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
	
	public Boolean getIsEsNuevoSecuencial() {
		return isEsNuevoSecuencial;
	}

	public void setIsEsNuevoSecuencial(Boolean isEsNuevoSecuencial) {
		this.isEsNuevoSecuencial = isEsNuevoSecuencial;
	}

	public Boolean getEsParaAccionDesdeFormularioSecuencial() {
		return esParaAccionDesdeFormularioSecuencial;
	}
	
	public void setEsParaAccionDesdeFormularioSecuencial(Boolean esParaAccionDesdeFormularioSecuencial) {
		this.esParaAccionDesdeFormularioSecuencial = esParaAccionDesdeFormularioSecuencial;
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

			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
			}

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(secuencialSessionBean.getlidEmpresaActual());
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

			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
			}

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(secuencialSessionBean.getlidSucursalActual());
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

			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
			}

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(secuencialSessionBean.getlidEjercicioActual());
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

			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
			}

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(secuencialSessionBean.getlidPeriodoActual());
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

			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
			}

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(secuencialSessionBean.getlidAnioActual());
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

			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
			}

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(secuencialSessionBean.getlidMesActual());
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

			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
			}

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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
					moduloLogic.getEntityWithConnection(secuencialSessionBean.getlidModuloActual());
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

	public void cargarCombosTipoMovimientoModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipomovimientomodulosForeignKey=new ArrayList<TipoMovimientoModulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoMovimientoModuloLogic tipomovimientomoduloLogic=new TipoMovimientoModuloLogic();

			//tipomovimientomoduloLogic.getTipoMovimientoModuloDataAccess().setIsForForeingKeyData(true);

			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
			}

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimientoModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipomovimientomoduloLogic.getTipoMovimientoModuloDataAccess().setIsForForeingKeyData(true);

					tipomovimientomoduloLogic.getTodosTipoMovimientoModulosWithConnection(sFinalQuery,new Pagination());

					this.tipomovimientomodulosForeignKey=tipomovimientomoduloLogic.getTipoMovimientoModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoMovimientoModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientomoduloLogic.getEntityWithConnection(secuencialSessionBean.getlidTipoMovimientoModuloActual());
					this.tipomovimientomodulosForeignKey.add(tipomovimientomoduloLogic.getTipoMovimientoModulo());
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

			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
			}

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
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
					tipodocumentoLogic.getEntityWithConnection(secuencialSessionBean.getlidTipoDocumentoActual());
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

			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
			}

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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
					tipomovimientoLogic.getEntityWithConnection(secuencialSessionBean.getlidTipoMovimientoActual());
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

					if(this.secuencial!=null) {
						this.secuencial.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSecuencial.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSecuencialGenerico)throws Exception
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
				jComboBoxid_empresaSecuencialGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSecuencialGenerico!=null && jComboBoxid_empresaSecuencialGenerico.getItemCount()>0) {
					jComboBoxid_empresaSecuencialGenerico.setSelectedIndex(0);
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

					if(this.secuencial!=null) {
						this.secuencial.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalSecuencial.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalSecuencialGenerico)throws Exception
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
				jComboBoxid_sucursalSecuencialGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalSecuencialGenerico!=null && jComboBoxid_sucursalSecuencialGenerico.getItemCount()>0) {
					jComboBoxid_sucursalSecuencialGenerico.setSelectedIndex(0);
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

					if(this.secuencial!=null) {
						this.secuencial.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioSecuencial.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorEjercicioPorModuloPorMovimiento") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial!=null) {
						jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial!=null) {
							//jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioSecuencialGenerico)throws Exception
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
				jComboBoxid_ejercicioSecuencialGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioSecuencialGenerico!=null && jComboBoxid_ejercicioSecuencialGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioSecuencialGenerico.setSelectedIndex(0);
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

					if(this.secuencial!=null) {
						this.secuencial.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoSecuencial.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoSecuencialGenerico)throws Exception
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
				jComboBoxid_periodoSecuencialGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoSecuencialGenerico!=null && jComboBoxid_periodoSecuencialGenerico.getItemCount()>0) {
					jComboBoxid_periodoSecuencialGenerico.setSelectedIndex(0);
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

					if(this.secuencial!=null) {
						this.secuencial.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioSecuencial.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioSecuencialGenerico)throws Exception
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
				jComboBoxid_anioSecuencialGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioSecuencialGenerico!=null && jComboBoxid_anioSecuencialGenerico.getItemCount()>0) {
					jComboBoxid_anioSecuencialGenerico.setSelectedIndex(0);
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

					if(this.secuencial!=null) {
						this.secuencial.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesSecuencial.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesSecuencialGenerico)throws Exception
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
				jComboBoxid_mesSecuencialGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesSecuencialGenerico!=null && jComboBoxid_mesSecuencialGenerico.getItemCount()>0) {
					jComboBoxid_mesSecuencialGenerico.setSelectedIndex(0);
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

					if(this.secuencial!=null) {
						this.secuencial.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloSecuencial.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorEjercicioPorModuloPorMovimiento") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial!=null) {
						jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial!=null) {
							//jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.getItemCount()>0) {
								jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedIndex(0);
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
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloSecuencialGenerico)throws Exception
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
				jComboBoxid_moduloSecuencialGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloSecuencialGenerico!=null && jComboBoxid_moduloSecuencialGenerico.getItemCount()>0) {
					jComboBoxid_moduloSecuencialGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoMovimientoModuloForeignKey(Long idTipoMovimientoModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoMovimientoModulo  tipomovimientomoduloTemp=null;

			for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosForeignKey) {
				if(tipomovimientomoduloAux.getId()!=null && tipomovimientomoduloAux.getId().equals(idTipoMovimientoModuloSeleccionado)) {
					tipomovimientomoduloTemp=tipomovimientomoduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipomovimientomoduloTemp!=null) {

					if(this.secuencial!=null) {
						this.secuencial.setTipoMovimientoModulo(tipomovimientomoduloTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.setSelectedItem(tipomovimientomoduloTemp);
					}
				} else {
					//jComboBoxid_tipo_movimiento_moduloSecuencial.setSelectedItem(tipomovimientomoduloTemp);
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorEjercicioPorModuloPorMovimiento") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientomoduloTemp!=null && jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial!=null) {
						jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedItem(tipomovimientomoduloTemp);
					} else {
						if(jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial!=null) {
							//jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedItem(tipomovimientomoduloTemp);
							if(jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.getItemCount()>0) {
								jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedIndex(0);
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

	public String getActualTipoMovimientoModuloForeignKeyDescripcion(Long idTipoMovimientoModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoMovimientoModulo  tipomovimientomoduloTemp=null;

			for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosForeignKey) {
				if(tipomovimientomoduloAux.getId()!=null && tipomovimientomoduloAux.getId().equals(idTipoMovimientoModuloSeleccionado)) {
					tipomovimientomoduloTemp=tipomovimientomoduloAux;
					break;
				}
			}


			sDescripcion=TipoMovimientoModuloConstantesFunciones.getTipoMovimientoModuloDescripcion(tipomovimientomoduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoMovimientoModuloForeignKeyGenerico(Long idTipoMovimientoModuloSeleccionado,JComboBox jComboBoxid_tipo_movimiento_moduloSecuencialGenerico)throws Exception
	{
		try
		{
			TipoMovimientoModulo  tipomovimientomoduloTemp=null;

			for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosForeignKey) {
				if(tipomovimientomoduloAux.getId()!=null && tipomovimientomoduloAux.getId().equals(idTipoMovimientoModuloSeleccionado)) {
					tipomovimientomoduloTemp=tipomovimientomoduloAux;
					break;
				}
			}

			if(tipomovimientomoduloTemp!=null) {
				jComboBoxid_tipo_movimiento_moduloSecuencialGenerico.setSelectedItem(tipomovimientomoduloTemp);
			} else {
				if(jComboBoxid_tipo_movimiento_moduloSecuencialGenerico!=null && jComboBoxid_tipo_movimiento_moduloSecuencialGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimiento_moduloSecuencialGenerico.setSelectedIndex(0);
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

					if(this.secuencial!=null) {
						this.secuencial.setTipoDocumento(tipodocumentoTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.setSelectedItem(tipodocumentoTemp);
					}
				} else {
					//jComboBoxid_tipo_documentoSecuencial.setSelectedItem(tipodocumentoTemp);
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.setSelectedIndex(0);
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
	public void setActualTipoDocumentoForeignKeyGenerico(Long idTipoDocumentoSeleccionado,JComboBox jComboBoxid_tipo_documentoSecuencialGenerico)throws Exception
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
				jComboBoxid_tipo_documentoSecuencialGenerico.setSelectedItem(tipodocumentoTemp);
			} else {
				if(jComboBoxid_tipo_documentoSecuencialGenerico!=null && jComboBoxid_tipo_documentoSecuencialGenerico.getItemCount()>0) {
					jComboBoxid_tipo_documentoSecuencialGenerico.setSelectedIndex(0);
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

					if(this.secuencial!=null) {
						this.secuencial.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoSecuencial.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.getItemCount()>0) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.setSelectedIndex(0);
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
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoSecuencialGenerico)throws Exception
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
				jComboBoxid_tipo_movimientoSecuencialGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoSecuencialGenerico!=null && jComboBoxid_tipo_movimientoSecuencialGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoSecuencialGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Secuencial secuencial,JComboBox jComboBoxid_empresaSecuencialGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSecuencialGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSecuencialGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				secuencial.setid_empresa(empresaAux.getId());
				secuencial.setempresa_descripcion(SecuencialConstantesFunciones.getEmpresaDescripcion(empresaAux));
				secuencial.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Secuencial secuencial,JComboBox jComboBoxid_sucursalSecuencialGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalSecuencialGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalSecuencialGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				secuencial.setid_sucursal(sucursalAux.getId());
				secuencial.setsucursal_descripcion(SecuencialConstantesFunciones.getSucursalDescripcion(sucursalAux));
				secuencial.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(Secuencial secuencial,JComboBox jComboBoxid_ejercicioSecuencialGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioSecuencialGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioSecuencialGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				secuencial.setid_ejercicio(ejercicioAux.getId());
				secuencial.setejercicio_descripcion(SecuencialConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				secuencial.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(Secuencial secuencial,JComboBox jComboBoxid_periodoSecuencialGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoSecuencialGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoSecuencialGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				secuencial.setid_periodo(periodoAux.getId());
				secuencial.setperiodo_descripcion(SecuencialConstantesFunciones.getPeriodoDescripcion(periodoAux));
				secuencial.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(Secuencial secuencial,JComboBox jComboBoxid_anioSecuencialGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioSecuencialGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioSecuencialGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				secuencial.setid_anio(anioAux.getId());
				secuencial.setanio_descripcion(SecuencialConstantesFunciones.getAnioDescripcion(anioAux));
				secuencial.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(Secuencial secuencial,JComboBox jComboBoxid_mesSecuencialGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesSecuencialGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesSecuencialGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				secuencial.setid_mes(mesAux.getId());
				secuencial.setmes_descripcion(SecuencialConstantesFunciones.getMesDescripcion(mesAux));
				secuencial.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(Secuencial secuencial,JComboBox jComboBoxid_moduloSecuencialGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloSecuencialGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloSecuencialGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				secuencial.setid_modulo(moduloAux.getId());
				secuencial.setmodulo_descripcion(SecuencialConstantesFunciones.getModuloDescripcion(moduloAux));
				secuencial.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoModuloForeignKey(Secuencial secuencial,JComboBox jComboBoxid_tipo_movimiento_moduloSecuencialGenerico)throws Exception
	{
		try
		{
			TipoMovimientoModulo  tipomovimientomoduloAux=new TipoMovimientoModulo();

			if(jComboBoxid_tipo_movimiento_moduloSecuencialGenerico==null) {
				tipomovimientomoduloAux=(TipoMovimientoModulo)this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.getSelectedItem();
			} else {
				tipomovimientomoduloAux=(TipoMovimientoModulo)jComboBoxid_tipo_movimiento_moduloSecuencialGenerico.getSelectedItem();
			}

			if(tipomovimientomoduloAux!=null && tipomovimientomoduloAux.getId()!=null) {
				secuencial.setid_tipo_movimiento_modulo(tipomovimientomoduloAux.getId());
				secuencial.settipomovimientomodulo_descripcion(SecuencialConstantesFunciones.getTipoMovimientoModuloDescripcion(tipomovimientomoduloAux));
				secuencial.setTipoMovimientoModulo(tipomovimientomoduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDocumentoForeignKey(Secuencial secuencial,JComboBox jComboBoxid_tipo_documentoSecuencialGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoAux=new TipoDocumento();

			if(jComboBoxid_tipo_documentoSecuencialGenerico==null) {
				tipodocumentoAux=(TipoDocumento)this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.getSelectedItem();
			} else {
				tipodocumentoAux=(TipoDocumento)jComboBoxid_tipo_documentoSecuencialGenerico.getSelectedItem();
			}

			if(tipodocumentoAux!=null && tipodocumentoAux.getId()!=null) {
				secuencial.setid_tipo_documento(tipodocumentoAux.getId());
				secuencial.settipodocumento_descripcion(SecuencialConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoAux));
				secuencial.setTipoDocumento(tipodocumentoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(Secuencial secuencial,JComboBox jComboBoxid_tipo_movimientoSecuencialGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoSecuencialGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoSecuencialGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				secuencial.setid_tipo_movimiento(tipomovimientoAux.getId());
				secuencial.settipomovimiento_descripcion(SecuencialConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				secuencial.setTipoMovimiento(tipomovimientoAux);			}
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

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) { 
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) { 
					}

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) { 
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) { 
					}

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) { 
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) { 
					}

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorEjercicioPorModuloPorMovimiento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addItem(ejercicio);
							}
						}

						if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) { 
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) { 
					}

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) { 
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) { 
					}

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) { 
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) { 
					}

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) { 
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) { 
					}

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorEjercicioPorModuloPorMovimiento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addItem(modulo);
							}
						}

						if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoMovimientoModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoMovimientoModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) { 
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.removeAllItems();

							for(TipoMovimientoModulo tipomovimientomodulo:this.tipomovimientomodulosForeignKey) {
								this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.addItem(tipomovimientomodulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) { 
					}

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorEjercicioPorModuloPorMovimiento") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.removeAllItems();

							for(TipoMovimientoModulo tipomovimientomodulo:this.tipomovimientomodulosForeignKey) {
								this.jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addItem(tipomovimientomodulo);
							}
						}

						if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) { 
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.addItem(tipodocumento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) { 
					}

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) { 
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSecuencial!=null) { 
					}

					if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoMovimientoModuloForeignKey(TipoMovimientoModulo tipomovimientomodulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.setSelectedItem(tipomovimientomodulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedItem(tipomovimientomodulo);
						} else {
							this.jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.setSelectedItem(tipodocumento);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoMovimientoForeignKey(TipoMovimiento tipomovimiento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormSecuencial!=null) {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesSecuencial() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SecuencialConstantesFunciones.refrescarForeignKeysDescripcionesSecuencial(this.secuencialLogic.getSecuencials());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SecuencialConstantesFunciones.refrescarForeignKeysDescripcionesSecuencial(this.secuencials);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(TipoMovimientoModulo.class));
		classes.add(new Classe(TipoDocumento.class));
		classes.add(new Classe(TipoMovimiento.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//secuencialLogic.setSecuencials(this.secuencials);
			secuencialLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SecuencialParameterReturnGeneral getSecuencialParameterGeneral() {
		return this.secuencialParameterGeneral;
	}
	
	public void setSecuencialParameterGeneral(SecuencialParameterReturnGeneral secuencialParameterGeneral) {
		this.secuencialParameterGeneral = secuencialParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSecuencial() {
		return isPermisoTodoSecuencial;
	}

	public void setIsPermisoTodoSecuencial(Boolean isPermisoTodoSecuencial) {
		this.isPermisoTodoSecuencial = isPermisoTodoSecuencial;
	}

	public Boolean getIsPermisoNuevoSecuencial() {
		return isPermisoNuevoSecuencial;
	}

	public void setIsPermisoNuevoSecuencial(Boolean isPermisoNuevoSecuencial) {
		this.isPermisoNuevoSecuencial = isPermisoNuevoSecuencial;
	}

	public Boolean getIsPermisoActualizarSecuencial() {
		return isPermisoActualizarSecuencial;
	}

	public void setIsPermisoActualizarSecuencial(Boolean isPermisoActualizarSecuencial) {
		this.isPermisoActualizarSecuencial = isPermisoActualizarSecuencial;
	}

	public Boolean getIsPermisoEliminarSecuencial() {
		return isPermisoEliminarSecuencial;
	}

	public void setIsPermisoEliminarSecuencial(Boolean isPermisoEliminarSecuencial) {
		this.isPermisoEliminarSecuencial = isPermisoEliminarSecuencial;
	}

	public Boolean getIsPermisoGuardarCambiosSecuencial() {
		return isPermisoGuardarCambiosSecuencial;
	}

	public void setIsPermisoGuardarCambiosSecuencial(Boolean isPermisoGuardarCambiosSecuencial) {
		this.isPermisoGuardarCambiosSecuencial = isPermisoGuardarCambiosSecuencial;
	}
	
	public Boolean getIsPermisoConsultaSecuencial() {
		return isPermisoConsultaSecuencial;
	}

	public void setIsPermisoConsultaSecuencial(Boolean isPermisoConsultaSecuencial) {
		this.isPermisoConsultaSecuencial = isPermisoConsultaSecuencial;
	}

	public Boolean getIsPermisoBusquedaSecuencial() {
		return isPermisoBusquedaSecuencial;
	}

	public void setIsPermisoBusquedaSecuencial(Boolean isPermisoBusquedaSecuencial) {
		this.isPermisoBusquedaSecuencial = isPermisoBusquedaSecuencial;
	}

	public Boolean getIsPermisoReporteSecuencial() {
		return isPermisoReporteSecuencial;
	}

	public void setIsPermisoReporteSecuencial(Boolean isPermisoReporteSecuencial) {
		this.isPermisoReporteSecuencial = isPermisoReporteSecuencial;
	}
	
	public Boolean getIsPermisoPaginacionMedioSecuencial() {
		return isPermisoPaginacionMedioSecuencial;
	}

	public void setIsPermisoPaginacionMedioSecuencial(Boolean isPermisoPaginacionMedioSecuencial) {
		this.isPermisoPaginacionMedioSecuencial = isPermisoPaginacionMedioSecuencial;
	}
	
	public Boolean getIsPermisoPaginacionTodoSecuencial() {
		return isPermisoPaginacionTodoSecuencial;
	}

	public void setIsPermisoPaginacionTodoSecuencial(Boolean isPermisoPaginacionTodoSecuencial) {
		this.isPermisoPaginacionTodoSecuencial = isPermisoPaginacionTodoSecuencial;
	}
	
	public Boolean getIsPermisoPaginacionAltoSecuencial() {
		return isPermisoPaginacionAltoSecuencial;
	}

	public void setIsPermisoPaginacionAltoSecuencial(Boolean isPermisoPaginacionAltoSecuencial) {
		this.isPermisoPaginacionAltoSecuencial = isPermisoPaginacionAltoSecuencial;
	}
	
	public Boolean getIsPermisoCopiarSecuencial() {
		return isPermisoCopiarSecuencial;
	}

	public void setIsPermisoCopiarSecuencial(Boolean isPermisoCopiarSecuencial) {
		this.isPermisoCopiarSecuencial = isPermisoCopiarSecuencial;
	}
	
	public Boolean getIsPermisoVerFormSecuencial() {
		return isPermisoVerFormSecuencial;
	}

	public void setIsPermisoVerFormSecuencial(Boolean isPermisoVerFormSecuencial) {
		this.isPermisoVerFormSecuencial = isPermisoVerFormSecuencial;
	}
	
	public Boolean getIsPermisoDuplicarSecuencial() {
		return isPermisoDuplicarSecuencial;
	}

	public void setIsPermisoDuplicarSecuencial(Boolean isPermisoDuplicarSecuencial) {
		this.isPermisoDuplicarSecuencial = isPermisoDuplicarSecuencial;
	}
	
	public Boolean getIsPermisoOrdenSecuencial() {
		return isPermisoOrdenSecuencial;
	}

	public void setIsPermisoOrdenSecuencial(Boolean isPermisoOrdenSecuencial) {
		this.isPermisoOrdenSecuencial = isPermisoOrdenSecuencial;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSecuencial() {
		return isVisibilidadCeldaNuevoSecuencial;
	}

	public void setIsVisibilidadCeldaNuevoSecuencial(Boolean isVisibilidadCeldaNuevoSecuencial) {
		this.isVisibilidadCeldaNuevoSecuencial = isVisibilidadCeldaNuevoSecuencial;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSecuencial() {
		return isVisibilidadCeldaDuplicarSecuencial;
	}

	public void setIsVisibilidadCeldaDuplicarSecuencial(Boolean isVisibilidadCeldaDuplicarSecuencial) {
		this.isVisibilidadCeldaDuplicarSecuencial = isVisibilidadCeldaDuplicarSecuencial;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSecuencial() {
		return isVisibilidadCeldaCopiarSecuencial;
	}

	public void setIsVisibilidadCeldaCopiarSecuencial(Boolean isVisibilidadCeldaCopiarSecuencial) {
		this.isVisibilidadCeldaCopiarSecuencial = isVisibilidadCeldaCopiarSecuencial;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSecuencial() {
		return isVisibilidadCeldaVerFormSecuencial;
	}

	public void setIsVisibilidadCeldaVerFormSecuencial(Boolean isVisibilidadCeldaVerFormSecuencial) {
		this.isVisibilidadCeldaVerFormSecuencial = isVisibilidadCeldaVerFormSecuencial;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSecuencial() {
		return isVisibilidadCeldaOrdenSecuencial;
	}

	public void setIsVisibilidadCeldaOrdenSecuencial(Boolean isVisibilidadCeldaOrdenSecuencial) {
		this.isVisibilidadCeldaOrdenSecuencial = isVisibilidadCeldaOrdenSecuencial;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSecuencial() {
		return isVisibilidadCeldaNuevoRelacionesSecuencial;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSecuencial(Boolean isVisibilidadCeldaNuevoRelacionesSecuencial) {
		this.isVisibilidadCeldaNuevoRelacionesSecuencial = isVisibilidadCeldaNuevoRelacionesSecuencial;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSecuencial() {
		return isVisibilidadCeldaModificarSecuencial;
	}

	public void setIsVisibilidadCeldaModificarSecuencial(Boolean isVisibilidadCeldaModificarSecuencial) {
		this.isVisibilidadCeldaModificarSecuencial = isVisibilidadCeldaModificarSecuencial;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSecuencial() {
		return isVisibilidadCeldaActualizarSecuencial;
	}

	public void setIsVisibilidadCeldaActualizarSecuencial(Boolean isVisibilidadCeldaActualizarSecuencial) {
		this.isVisibilidadCeldaActualizarSecuencial = isVisibilidadCeldaActualizarSecuencial;
	}

	public Boolean getIsVisibilidadCeldaEliminarSecuencial() {
		return isVisibilidadCeldaEliminarSecuencial;
	}

	public void setIsVisibilidadCeldaEliminarSecuencial(Boolean isVisibilidadCeldaEliminarSecuencial) {
		this.isVisibilidadCeldaEliminarSecuencial = isVisibilidadCeldaEliminarSecuencial;
	}

	public Boolean getIsVisibilidadCeldaCancelarSecuencial() {
		return isVisibilidadCeldaCancelarSecuencial;
	}

	public void setIsVisibilidadCeldaCancelarSecuencial(Boolean isVisibilidadCeldaCancelarSecuencial) {
		this.isVisibilidadCeldaCancelarSecuencial = isVisibilidadCeldaCancelarSecuencial;
	}

	public Boolean getIsVisibilidadCeldaGuardarSecuencial() {
		return isVisibilidadCeldaGuardarSecuencial;
	}

	public void setIsVisibilidadCeldaGuardarSecuencial(Boolean isVisibilidadCeldaGuardarSecuencial) {
		this.isVisibilidadCeldaGuardarSecuencial = isVisibilidadCeldaGuardarSecuencial;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSecuencial() {
		return isVisibilidadCeldaGuardarCambiosSecuencial;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSecuencial(Boolean isVisibilidadCeldaGuardarCambiosSecuencial) {
		this.isVisibilidadCeldaGuardarCambiosSecuencial = isVisibilidadCeldaGuardarCambiosSecuencial;
	}
		
	public SecuencialSessionBean getsecuencialSessionBean() {
		return this.secuencialSessionBean;
	}
	
	public void setsecuencialSessionBean(SecuencialSessionBean secuencialSessionBean) {
		this.secuencialSessionBean=secuencialSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento() {
		return this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento;
	}

	public void setisVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento(Boolean isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento) {
		this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
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

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
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

	public Boolean getisVisibilidadFK_IdTipoMovimientoModulo() {
		return this.isVisibilidadFK_IdTipoMovimientoModulo;
	}

	public void setisVisibilidadFK_IdTipoMovimientoModulo(Boolean isVisibilidadFK_IdTipoMovimientoModulo) {
		this.isVisibilidadFK_IdTipoMovimientoModulo=isVisibilidadFK_IdTipoMovimientoModulo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSecuencial(Secuencial secuencial)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(secuencial,null);
				this.setActualParaGuardarSucursalForeignKey(secuencial,null);
				this.setActualParaGuardarEjercicioForeignKey(secuencial,null);
				this.setActualParaGuardarPeriodoForeignKey(secuencial,null);
				this.setActualParaGuardarAnioForeignKey(secuencial,null);
				this.setActualParaGuardarMesForeignKey(secuencial,null);
				this.setActualParaGuardarModuloForeignKey(secuencial,null);
				this.setActualParaGuardarTipoMovimientoModuloForeignKey(secuencial,null);
				this.setActualParaGuardarTipoDocumentoForeignKey(secuencial,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(secuencial,null);
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
	
	public void bugActualizarReferenciaActual(Secuencial secuencial,Secuencial secuencialAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSecuencial(secuencial);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		secuencialAux.setId(secuencial.getId());
		secuencialAux.setVersionRow(secuencial.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSecuencial();
		
			int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SecuencialJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = secuencialValidator.getInvalidValues(this.secuencial);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			secuencialLogic.setDatosCliente(datosCliente);
			secuencialLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				secuencialAux=new  Secuencial();
				
				secuencialAux.setIsNew(true);
				secuencialAux.setIsChanged(true);
				
				secuencialAux.setSecuencialOriginal(this.secuencial);
				
				secuencialAux.setId(this.secuencial.getId());	
				secuencialAux.setVersionRow(this.secuencial.getVersionRow());	
				secuencialAux.setid_empresa(this.secuencial.getid_empresa());	
				secuencialAux.setid_sucursal(this.secuencial.getid_sucursal());	
				secuencialAux.setid_ejercicio(this.secuencial.getid_ejercicio());	
				secuencialAux.setid_periodo(this.secuencial.getid_periodo());	
				secuencialAux.setid_anio(this.secuencial.getid_anio());	
				secuencialAux.setid_mes(this.secuencial.getid_mes());	
				secuencialAux.setid_modulo(this.secuencial.getid_modulo());	
				secuencialAux.setid_tipo_movimiento_modulo(this.secuencial.getid_tipo_movimiento_modulo());	
				secuencialAux.setid_tipo_documento(this.secuencial.getid_tipo_documento());	
				secuencialAux.setid_tipo_movimiento(this.secuencial.getid_tipo_movimiento());	
				secuencialAux.setnumero_asiento(this.secuencial.getnumero_asiento());	
				secuencialAux.setnumero_ingreso(this.secuencial.getnumero_ingreso());	
				secuencialAux.setnumero_egreso(this.secuencial.getnumero_egreso());	
				secuencialAux.setnumero_diario(this.secuencial.getnumero_diario());	
				secuencialAux.setnumero_retencion_iva(this.secuencial.getnumero_retencion_iva());	
				secuencialAux.setnumero_retencion_fuente(this.secuencial.getnumero_retencion_fuente());	
				secuencialAux.setnumero_asiento_formato(this.secuencial.getnumero_asiento_formato());	
				secuencialAux.setnumero_ingreso_formato(this.secuencial.getnumero_ingreso_formato());	
				secuencialAux.setnumero_egreso_formato(this.secuencial.getnumero_egreso_formato());	
				secuencialAux.setnumero_diario_formato(this.secuencial.getnumero_diario_formato());	
				secuencialAux.setnumero_retencion_fuente_formato(this.secuencial.getnumero_retencion_fuente_formato());	
				secuencialAux.setnumero_retencion_iva_formato(this.secuencial.getnumero_retencion_iva_formato());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.secuencialSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.secuencialSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(secuencialAux,secuencialLogic.getSecuencials());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(secuencialAux,secuencials);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.secuencialSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.secuencialSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialLogic.saveSecuencials();//WithConnection
						//secuencialLogic.getSetVersionRowSecuencials();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.secuencial,secuencialAux);
					
					this.refrescarForeignKeysDescripcionesSecuencial();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.secuencialSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								secuencialLogic.saveSecuencialRelaciones(secuencialAux);//WithConnection
								//secuencialLogic.getSetVersionRowSecuencials();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.secuencial,secuencialAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.secuencialSessionBean.getEstaModoGuardarRelaciones() 
									|| this.secuencialSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(secuencialAux,secuencialLogic.getSecuencials());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(secuencialAux,secuencials);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.secuencial,secuencialAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				secuencialAux=new  Secuencial();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.secuencialSessionBean.getEsGuardarRelacionado() 
					|| (this.secuencialSessionBean.getEsGuardarRelacionado() && this.secuencial.getId()>=0)) {
						
					secuencialAux.setIsNew(false);
				}
				
				secuencialAux.setIsDeleted(false);
			
				secuencialAux.setId(this.secuencial.getId());	
				secuencialAux.setVersionRow(this.secuencial.getVersionRow());	
				secuencialAux.setid_empresa(this.secuencial.getid_empresa());	
				secuencialAux.setid_sucursal(this.secuencial.getid_sucursal());	
				secuencialAux.setid_ejercicio(this.secuencial.getid_ejercicio());	
				secuencialAux.setid_periodo(this.secuencial.getid_periodo());	
				secuencialAux.setid_anio(this.secuencial.getid_anio());	
				secuencialAux.setid_mes(this.secuencial.getid_mes());	
				secuencialAux.setid_modulo(this.secuencial.getid_modulo());	
				secuencialAux.setid_tipo_movimiento_modulo(this.secuencial.getid_tipo_movimiento_modulo());	
				secuencialAux.setid_tipo_documento(this.secuencial.getid_tipo_documento());	
				secuencialAux.setid_tipo_movimiento(this.secuencial.getid_tipo_movimiento());	
				secuencialAux.setnumero_asiento(this.secuencial.getnumero_asiento());	
				secuencialAux.setnumero_ingreso(this.secuencial.getnumero_ingreso());	
				secuencialAux.setnumero_egreso(this.secuencial.getnumero_egreso());	
				secuencialAux.setnumero_diario(this.secuencial.getnumero_diario());	
				secuencialAux.setnumero_retencion_iva(this.secuencial.getnumero_retencion_iva());	
				secuencialAux.setnumero_retencion_fuente(this.secuencial.getnumero_retencion_fuente());	
				secuencialAux.setnumero_asiento_formato(this.secuencial.getnumero_asiento_formato());	
				secuencialAux.setnumero_ingreso_formato(this.secuencial.getnumero_ingreso_formato());	
				secuencialAux.setnumero_egreso_formato(this.secuencial.getnumero_egreso_formato());	
				secuencialAux.setnumero_diario_formato(this.secuencial.getnumero_diario_formato());	
				secuencialAux.setnumero_retencion_fuente_formato(this.secuencial.getnumero_retencion_fuente_formato());	
				secuencialAux.setnumero_retencion_iva_formato(this.secuencial.getnumero_retencion_iva_formato());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(secuencialAux,secuencialLogic.getSecuencials());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(secuencialAux,secuencials);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.secuencialSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.secuencialSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialLogic.saveSecuencials();//WithConnection
						//secuencialLogic.getSetVersionRowSecuencials();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.secuencial,secuencialAux);
					
					this.refrescarForeignKeysDescripcionesSecuencial();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.secuencialSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								secuencialLogic.saveSecuencialRelaciones(secuencialAux);//WithConnection
								//secuencialLogic.getSetVersionRowSecuencials();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.secuencial,secuencialAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.secuencialSessionBean.getEstaModoGuardarRelaciones() 
									|| this.secuencialSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(secuencialAux,secuencialLogic.getSecuencials());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(secuencialAux,secuencials);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.secuencial,secuencialAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				secuencialAux=new  Secuencial();
				
				secuencialAux.setIsNew(false);
				secuencialAux.setIsChanged(false);
				
				secuencialAux.setIsDeleted(true);
				
				secuencialAux.setId(this.secuencial.getId());	
				secuencialAux.setVersionRow(this.secuencial.getVersionRow());	
				secuencialAux.setid_empresa(this.secuencial.getid_empresa());	
				secuencialAux.setid_sucursal(this.secuencial.getid_sucursal());	
				secuencialAux.setid_ejercicio(this.secuencial.getid_ejercicio());	
				secuencialAux.setid_periodo(this.secuencial.getid_periodo());	
				secuencialAux.setid_anio(this.secuencial.getid_anio());	
				secuencialAux.setid_mes(this.secuencial.getid_mes());	
				secuencialAux.setid_modulo(this.secuencial.getid_modulo());	
				secuencialAux.setid_tipo_movimiento_modulo(this.secuencial.getid_tipo_movimiento_modulo());	
				secuencialAux.setid_tipo_documento(this.secuencial.getid_tipo_documento());	
				secuencialAux.setid_tipo_movimiento(this.secuencial.getid_tipo_movimiento());	
				secuencialAux.setnumero_asiento(this.secuencial.getnumero_asiento());	
				secuencialAux.setnumero_ingreso(this.secuencial.getnumero_ingreso());	
				secuencialAux.setnumero_egreso(this.secuencial.getnumero_egreso());	
				secuencialAux.setnumero_diario(this.secuencial.getnumero_diario());	
				secuencialAux.setnumero_retencion_iva(this.secuencial.getnumero_retencion_iva());	
				secuencialAux.setnumero_retencion_fuente(this.secuencial.getnumero_retencion_fuente());	
				secuencialAux.setnumero_asiento_formato(this.secuencial.getnumero_asiento_formato());	
				secuencialAux.setnumero_ingreso_formato(this.secuencial.getnumero_ingreso_formato());	
				secuencialAux.setnumero_egreso_formato(this.secuencial.getnumero_egreso_formato());	
				secuencialAux.setnumero_diario_formato(this.secuencial.getnumero_diario_formato());	
				secuencialAux.setnumero_retencion_fuente_formato(this.secuencial.getnumero_retencion_fuente_formato());	
				secuencialAux.setnumero_retencion_iva_formato(this.secuencial.getnumero_retencion_iva_formato());	
				
				if(this.secuencialSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.secuencialAux.getId()>=0) {	
						this.secuencialsEliminados.add(secuencialAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(secuencialAux,secuencialLogic.getSecuencials());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(secuencialAux,secuencials);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.secuencialSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.secuencialSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialLogic.saveSecuencials();//WithConnection
						//secuencialLogic.getSetVersionRowSecuencials();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.secuencialSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								secuencialLogic.saveSecuencialRelaciones(secuencialAux);//WithConnection
								//secuencialLogic.getSetVersionRowSecuencials();//WithConnection
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
							if(this.secuencialSessionBean.getEstaModoGuardarRelaciones() 
								|| this.secuencialSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(secuencialAux,secuencialLogic.getSecuencials());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(secuencialAux,secuencials);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getSecuencials().addAll(this.secuencialsEliminados);
					
					secuencialLogic.saveSecuencials();//WithConnection
					//secuencialLogic.getSetVersionRowSecuencials();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSecuencial();
				
				this.secuencialsEliminados= new ArrayList<Secuencial>();		
			}
			
			if(this.secuencialSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Secuencial GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Secuencial",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.secuencial=secuencialAux;
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
      		//this.finishProcessSecuencial();
      	}
		
	}	
	
	public void actualizarRelaciones(Secuencial secuencialLocal) throws Exception {
		
		if(this.secuencialSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Secuencial secuencialLocal) throws Exception {	
		if(this.secuencialSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				secuencialLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				secuencialLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				secuencialLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				secuencialLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				secuencialLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				secuencialLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				secuencialLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoModuloDetalleFormJInternalFrame.class)) {
				TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrameLocal=(TipoMovimientoModuloBeanSwingJInternalFrame) ((TipoMovimientoModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientomoduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimientoModulo(tipomovimientomoduloBeanSwingJInternalFrameLocal.gettipomovimientomodulo(),true);
				tipomovimientomoduloBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientomoduloBeanSwingJInternalFrameLocal.tipomovimientomodulo,this.tipomovimientomodulosForeignKey);

				tipomovimientomoduloBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientomoduloBeanSwingJInternalFrameLocal.tipomovimientomodulo);

				secuencialLocal.setTipoMovimientoModulo(tipomovimientomoduloBeanSwingJInternalFrameLocal.tipomovimientomodulo);

				this.addItemDefectoCombosForeignKeyTipoMovimientoModulo();
				this.cargarCombosFrameTipoMovimientoModulosForeignKey("Formulario");
				this.setActualTipoMovimientoModuloForeignKey(tipomovimientomoduloBeanSwingJInternalFrameLocal.tipomovimientomodulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDocumentoDetalleFormJInternalFrame.class)) {
				TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrameLocal=(TipoDocumentoBeanSwingJInternalFrame) ((TipoDocumentoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodocumentoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.gettipodocumento(),true);
				tipodocumentoBeanSwingJInternalFrameLocal.actualizarLista(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento,this.tipodocumentosForeignKey);

				tipodocumentoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				secuencialLocal.setTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey("Formulario");
				this.setActualTipoDocumentoForeignKey(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				secuencialLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSecuencialActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = secuencialValidator.getInvalidValues(this.secuencial);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Secuencial secuencial,List<Secuencial> secuencials) throws Exception {
		try	{		
			SecuencialConstantesFunciones.actualizarLista(secuencial,secuencials,this.secuencialSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Secuencial secuencial,List<Secuencial> secuencials) throws Exception {
		try	{			
			SecuencialConstantesFunciones.actualizarSelectedLista(secuencial,secuencials);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Secuencial> secuencialsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				secuencialsLocal=this.secuencialLogic.getSecuencials();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				secuencialsLocal=this.secuencials;
			}
			//ARCHITECTURE
		
			for(Secuencial secuencialLocal:secuencialsLocal) {
				if(this.permiteMantenimiento(secuencialLocal) && secuencialLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SecuencialConstantesFunciones.getSecuencialLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelid_empresaSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelid_sucursalSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelid_ejercicioSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelid_periodoSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelid_anioSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelid_mesSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelid_moduloSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.IDTIPOMOVIMIENTOMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelid_tipo_movimiento_moduloSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.IDTIPODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelid_tipo_documentoSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.IDTIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelid_tipo_movimientoSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMEROASIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_asientoSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMEROINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_ingresoSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMEROEGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_egresoSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMERODIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_diarioSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMERORETENCIONIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_ivaSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMERORETENCIONFUENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_fuenteSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMEROASIENTOFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_asiento_formatoSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMEROINGRESOFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_ingreso_formatoSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMEROEGRESOFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_egreso_formatoSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMERODIARIOFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_diario_formatoSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMERORETENCIONFUENTEFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_fuente_formatoSecuencial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SecuencialConstantesFunciones.NUMERORETENCIONIVAFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_iva_formatoSecuencial,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelid_empresaSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelid_sucursalSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelid_ejercicioSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelid_periodoSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelid_anioSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelid_mesSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelid_moduloSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelid_tipo_movimiento_moduloSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelid_tipo_documentoSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelid_tipo_movimientoSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_asientoSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_ingresoSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_egresoSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_diarioSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_ivaSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_fuenteSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_asiento_formatoSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_ingreso_formatoSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_egreso_formatoSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_diario_formatoSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_fuente_formatoSecuencial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_iva_formatoSecuencial,"");
		
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
		this.iIdNuevoSecuencial--;	
		
		
		this.secuencialAux=new Secuencial();
		
		this.secuencialAux.setId(this.iIdNuevoSecuencial);
		this.secuencialAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.secuencialLogic.getSecuencials().add(this.secuencialAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.secuencials.add(this.secuencialAux);
		}
		//ARCHITECTURE
		
		this.secuencial=this.secuencialAux;
		
		if(SecuencialJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSecuencial(this.secuencial);
			this.setVariablesObjetoActualToFormularioForeignKeySecuencial(this.secuencial);
		}
				
		//this.setDefaultControlesSecuencial();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySecuencial();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySecuencial();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySecuencial();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSecuencial(this.secuencialBean,this.secuencial,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SecuencialConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.secuencialSessionBean.getConGuardarRelaciones()) {
			classes=SecuencialConstantesFunciones.getClassesRelationshipsOfSecuencial(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.secuencialReturnGeneral=secuencialLogic.procesarEventosSecuencialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.secuencialLogic.getSecuencials(),this.secuencial,this.secuencialParameterGeneral,this.isEsNuevoSecuencial,classes);//this.secuencialLogic.getSecuencial()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSecuencial(this.secuencialReturnGeneral,this.secuencialBean,false);
		
		if(this.secuencialReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySecuencial(this.secuencialReturnGeneral.getSecuencial());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSecuencial(this.secuencialReturnGeneral.getSecuencial());
		}
		
		if(this.secuencialReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSecuencial(this.secuencialReturnGeneral.getSecuencial(),classes);//this.secuencialBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySecuencial();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySecuencial();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SecuencialBeanSwingJInternalFrameAdditional.RecargarFormSecuencial(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSecuencial(false);
						
			if(secuencialSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SecuencialJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSecuencial();
			}
			
			this.actualizarVisualTableDatosSecuencial();
			
			this.jTableDatosSecuencial.setRowSelectionInterval(this.getIndiceNuevoSecuencial(), this.getIndiceNuevoSecuencial());
			
			this.seleccionarFilaTablaSecuencialActual();
						
			this.actualizarEstadoCeldasBotonesSecuencial("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSecuencial(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asientoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_asientoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingresoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_ingresoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egresoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_egresoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diarioSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_diarioSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_ivaSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_retencion_ivaSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuenteSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_retencion_fuenteSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asiento_formatoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_asiento_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingreso_formatoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_ingreso_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egreso_formatoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_egreso_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diario_formatoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_diario_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuente_formatoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_retencion_fuente_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_iva_formatoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarnumero_retencion_iva_formatoSecuencial);	
		//
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarid_empresaSecuencial);//
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarid_sucursalSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarid_ejercicioSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarid_periodoSecuencial);//
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarid_anioSecuencial);//
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarid_mesSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarid_moduloSecuencial);//
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarid_tipo_movimiento_moduloSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarid_tipo_documentoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.setEnabled(isHabilitar && this.secuencialConstantesFunciones.activarid_tipo_movimientoSecuencial);
	};
	
	public void setDefaultControlesSecuencial() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSecuencial(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.secuencialSessionBean.setConGuardarRelaciones(true);			
			this.secuencialSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSecuencial.jTabbedPaneRelacionesSecuencial.setVisible(true);
			
					
		} else {
			//this.secuencialSessionBean.setConGuardarRelaciones(false);			
			this.secuencialSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSecuencial.jTabbedPaneRelacionesSecuencial.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSecuencial() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Secuencial secuencialAux:this.secuencialLogic.getSecuencials()) {
				if(secuencialAux.getId().equals(this.iIdNuevoSecuencial)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Secuencial secuencialAux:this.secuencials) {
				if(secuencialAux.getId().equals(this.iIdNuevoSecuencial)) {
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
	
	public int getIndiceActualSecuencial(Secuencial secuencial,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Secuencial secuencialAux:this.secuencialLogic.getSecuencials()) {
				if(secuencialAux.getId().equals(secuencial.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Secuencial secuencialAux:this.secuencials) {
				if(secuencialAux.getId().equals(secuencial.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSecuencial(Secuencial secuencialOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Secuencial secuencialAux:this.secuencialLogic.getSecuencials()) {
				if(secuencialAux.getSecuencialOriginal().getId().equals(secuencialOriginal.getId())) {
					existe=true;
					secuencialOriginal.setId(secuencialAux.getId());
					secuencialOriginal.setVersionRow(secuencialAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Secuencial secuencialAux:this.secuencials) {
				if(secuencialAux.getSecuencialOriginal().getId().equals(secuencialOriginal.getId())) {
					existe=true;
					secuencialOriginal.setId(secuencialAux.getId());
					secuencialOriginal.setVersionRow(secuencialAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSecuencial(Boolean esParaCancelar) throws Exception {
		secuencialsAux=new ArrayList<Secuencial>();
		secuencialAux=new Secuencial();
		
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Secuencial secuencialAux:this.secuencialLogic.getSecuencials()) {
					if(secuencialAux.getId()<0) {
						secuencialsAux.add(secuencialAux);
					}		
				}
				this.iIdNuevoSecuencial=0L;
				this.secuencialLogic.getSecuencials().removeAll(secuencialsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Secuencial secuencialAux:this.secuencials) {
					if(secuencialAux.getId()<0) {
						secuencialsAux.add(secuencialAux);
					}		
				}
				this.iIdNuevoSecuencial=0L;
				this.secuencials.removeAll(secuencialsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSecuencial 
					&& this.secuencialLogic.getSecuencials().size()>0
					) {
					secuencialAux=this.secuencialLogic.getSecuencials().get(this.secuencialLogic.getSecuencials().size() - 1);
				
					if(secuencialAux.getId()<0) {
						this.secuencialLogic.getSecuencials().remove(secuencialAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSecuencial && this.secuencials.size()>0) {
					secuencialAux=this.secuencials.get(this.secuencials.size() - 1);
				
					if(secuencialAux.getId()<0) {
						this.secuencials.remove(secuencialAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSecuencial(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(secuencial.getId()<0) {
				this.secuencialLogic.getSecuencials().remove(this.secuencial);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(secuencial.getId()<0) {
				this.secuencials.remove(this.secuencial);
			}
		}			
	}
	
	public void setEstadosInicialesSecuencial(List<Secuencial> secuencialsAux) throws Exception {
		SecuencialConstantesFunciones.setEstadosInicialesSecuencial(secuencialsAux);
	}
	
	public void setEstadosInicialesSecuencial(Secuencial secuencialAux) throws Exception {
		SecuencialConstantesFunciones.setEstadosInicialesSecuencial(secuencialAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSecuencialActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSecuencial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSecuencialActual()) {
				if(!this.isEsNuevoSecuencial) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSecuencial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSecuencial=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSecuencialActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Secuencial ?", "MANTENIMIENTO DE Secuencial", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSecuencial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Secuencial secuencial) throws Exception {
		SecuencialConstantesFunciones.seleccionarAsignar(this.secuencial,secuencial);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSecuencial=this.isPermisoActualizarOriginalSecuencial;
			
			
			this.seleccionarAsignar(secuencial);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SecuencialConstantesFunciones.quitarEspaciosSecuencial(this.secuencial,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSecuencial("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.secuencialSessionBean.setsFuncionBusquedaRapida(this.secuencialSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSecuencial) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSecuencial(esParaCancelar);				
				this.cancelarNuevoSecuencial(esParaCancelar);								
			}
			
			this.secuencial=new Secuencial();
			
			this.inicializarSecuencial();
			
			this.actualizarEstadoCeldasBotonesSecuencial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSecuencial() throws Exception {
		try {
			SecuencialConstantesFunciones.inicializarSecuencial(this.secuencial);
			
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
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.secuencialLogic.getSecuencials().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSecuencials(String sAccionBusqueda,List<Secuencial> secuencialsParaReportes) throws Exception {
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
					sPathReporteFinal="Secuencial"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SecuencialMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SecuencialMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Secuencial"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Secuenciales");		
		parameters.put("busquedapor", SecuencialConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSecuencial=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SecuencialConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SecuencialConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSecuencial=new JRBeanArrayDataSource(SecuencialJInternalFrame.TraerSecuencialBeans(secuencialsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSecuencial);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SecuencialConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SecuencialConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SecuencialBean.TraerSecuencialBeans(secuencialsParaReportes).toArray()));
							
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
				this.generarExcelReporteSecuencials(sAccionBusqueda,sTipoArchivoReporte,secuencialsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSecuencials(sAccionBusqueda,sTipoArchivoReporte,secuencialsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSecuencialActionPerformed(null);
					//this.generarExcelReporteSecuencials(sAccionBusqueda,sTipoArchivoReporte,secuencialsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSecuencials(sAccionBusqueda,sTipoArchivoReporte,secuencialsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSecuencials(sAccionBusqueda,sTipoArchivoReporte,secuencialsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSecuencials(sAccionBusqueda,sTipoArchivoReporte,secuencialsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSecuencials(String sAccionBusqueda,String sTipoArchivoReporte,List<Secuencial> secuencialsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencial";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Secuencials");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSecuencial("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Secuencial secuencial : secuencialsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SecuencialConstantesFunciones.generarExcelReporteDataSecuencial("NORMAL",row,workbook,secuencial,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSecuencial(String sTipo,Row row,Workbook workbook) {
		
		SecuencialConstantesFunciones.generarExcelReporteHeaderSecuencial(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSecuencials(String sAccionBusqueda,String sTipoArchivoReporte,List<Secuencial> secuencialsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencial_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Secuencials");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Secuencial secuencial : secuencialsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SecuencialConstantesFunciones.getSecuencialDescripcion(secuencial));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.gettipomovimientomodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.gettipodocumento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMEROASIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROASIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_asiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMEROINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_ingreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMEROEGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROEGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_egreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMERODIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERODIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_diario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_retencion_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_retencion_fuente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_asiento_formato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_ingreso_formato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_egreso_formato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_diario_formato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_retencion_fuente_formato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(secuencial.getnumero_retencion_iva_formato());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSecuencials(String sAccionBusqueda,String sTipoArchivoReporte,List<Secuencial> secuencialsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Secuencial> secuencialsRespaldo=null;
		
		classes=SecuencialConstantesFunciones.getClassesRelationshipsOfSecuencial(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.secuencialLogic.setDatosCliente(this.datosCliente);
		this.secuencialLogic.setDatosDeep(this.datosDeep);
		this.secuencialLogic.setIsConDeep(true);
		
		secuencialsRespaldo=this.secuencialLogic.getSecuencials();
		
		this.secuencialLogic.setSecuencials(secuencialsParaReportes);	
		this.secuencialLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		secuencialsParaReportes=this.secuencialLogic.getSecuencials();
		this.secuencialLogic.setSecuencials(secuencialsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencial_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Secuencials");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSecuencial("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Secuencial secuencial : secuencialsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSecuencial("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SecuencialConstantesFunciones.generarExcelReporteDataSecuencial("NORMAL",row,workbook,secuencial,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SecuencialConstantesFunciones.getSecuencialDescripcion(secuencial));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSecuencial.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSecuencial.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSecuencial() throws Exception {		
		this.startProcessSecuencial(true);
	}
	
	public void startProcessSecuencial(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSecuencial ,this.jPanelParametrosReportesSecuencial, this.jScrollPanelDatosSecuencial,this.jPanelPaginacionSecuencial, this.jScrollPanelDatosEdicionSecuencial, this.jPanelAccionesSecuencial,this.jPanelAccionesFormularioSecuencial,this.jmenuBarSecuencial,this.jmenuBarDetalleSecuencial,this.jTtoolBarSecuencial,this.jTtoolBarDetalleSecuencial);		
		
		final JTabbedPane jTabbedPaneBusquedasSecuencial=this.jTabbedPaneBusquedasSecuencial; 
		
		final JPanel jPanelParametrosReportesSecuencial=this.jPanelParametrosReportesSecuencial;
		//final JScrollPane jScrollPanelDatosSecuencial=this.jScrollPanelDatosSecuencial;
		final JTable jTableDatosSecuencial=this.jTableDatosSecuencial;		
		final JPanel jPanelPaginacionSecuencial=this.jPanelPaginacionSecuencial;
		//final JScrollPane jScrollPanelDatosEdicionSecuencial=this.jScrollPanelDatosEdicionSecuencial;
		final JPanel jPanelAccionesSecuencial=this.jPanelAccionesSecuencial;
		
		JPanel jPanelCamposAuxiliarSecuencial=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSecuencial=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) {
			jPanelCamposAuxiliarSecuencial=this.jInternalFrameDetalleFormSecuencial.jPanelCamposSecuencial;
			jPanelAccionesFormularioAuxiliarSecuencial=this.jInternalFrameDetalleFormSecuencial.jPanelAccionesFormularioSecuencial;
		}
		
		final JPanel jPanelCamposSecuencial=jPanelCamposAuxiliarSecuencial;
		final JPanel jPanelAccionesFormularioSecuencial=jPanelAccionesFormularioAuxiliarSecuencial;
		
		
		final JMenuBar jmenuBarSecuencial=this.jmenuBarSecuencial;
		final JToolBar jTtoolBarSecuencial=this.jTtoolBarSecuencial;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSecuencial=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSecuencial=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) {
			jmenuBarDetalleAuxiliarSecuencial=this.jInternalFrameDetalleFormSecuencial.jmenuBarDetalleSecuencial;
			jTtoolBarDetalleAuxiliarSecuencial=this.jInternalFrameDetalleFormSecuencial.jTtoolBarDetalleSecuencial;
		}
		
		final JMenuBar jmenuBarDetalleSecuencial=jmenuBarDetalleAuxiliarSecuencial;
		final JToolBar jTtoolBarDetalleSecuencial=jTtoolBarDetalleAuxiliarSecuencial;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSecuencial;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSecuencial;
			processRunnable.jTableDatos=jTableDatosSecuencial;
			processRunnable.jPanelCampos=jPanelCamposSecuencial;
			processRunnable.jPanelPaginacion=jPanelPaginacionSecuencial;
			processRunnable.jPanelAcciones=jPanelAccionesSecuencial;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSecuencial;
			
			
			processRunnable.jmenuBar=jmenuBarSecuencial;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSecuencial;
			processRunnable.jTtoolBar=jTtoolBarSecuencial;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSecuencial;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSecuencial ,jPanelParametrosReportesSecuencial,jTableDatosSecuencial, /*jScrollPanelDatosSecuencial,*/jPanelCamposSecuencial,jPanelPaginacionSecuencial, /*jScrollPanelDatosEdicionSecuencial,*/ jPanelAccionesSecuencial,jPanelAccionesFormularioSecuencial,jmenuBarSecuencial,jmenuBarDetalleSecuencial,jTtoolBarSecuencial,jTtoolBarDetalleSecuencial);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSecuencial ,jPanelParametrosReportesSecuencial, jScrollPanelDatosSecuencial,jPanelPaginacionSecuencial, jScrollPanelDatosEdicionSecuencial, jPanelAccionesSecuencial,jPanelAccionesFormularioSecuencial,jmenuBarSecuencial,jmenuBarDetalleSecuencial,jTtoolBarSecuencial,jTtoolBarDetalleSecuencial);
						
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
	
	public void finishProcessSecuencial() {// throws Exception 
		this.finishProcessSecuencial(true);
	}
	
	public void finishProcessSecuencial(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSecuencial ,this.jPanelParametrosReportesSecuencial, this.jScrollPanelDatosSecuencial,this.jPanelPaginacionSecuencial, this.jScrollPanelDatosEdicionSecuencial, this.jPanelAccionesSecuencial,this.jPanelAccionesFormularioSecuencial,this.jmenuBarSecuencial,this.jmenuBarDetalleSecuencial,this.jTtoolBarSecuencial,this.jTtoolBarDetalleSecuencial);		
		
		final JTabbedPane jTabbedPaneBusquedasSecuencial=this.jTabbedPaneBusquedasSecuencial; 
		
		final JPanel jPanelParametrosReportesSecuencial=this.jPanelParametrosReportesSecuencial;
		//final JScrollPane jScrollPanelDatosSecuencial=this.jScrollPanelDatosSecuencial;
		final JTable jTableDatosSecuencial=this.jTableDatosSecuencial;		
		final JPanel jPanelPaginacionSecuencial=this.jPanelPaginacionSecuencial;
		//final JScrollPane jScrollPanelDatosEdicionSecuencial=this.jScrollPanelDatosEdicionSecuencial;
		final JPanel jPanelAccionesSecuencial=this.jPanelAccionesSecuencial;
		
		JPanel jPanelCamposAuxiliarSecuencial=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSecuencial=new JPanel();
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) {
			jPanelCamposAuxiliarSecuencial=this.jInternalFrameDetalleFormSecuencial.jPanelCamposSecuencial;
			jPanelAccionesFormularioAuxiliarSecuencial=this.jInternalFrameDetalleFormSecuencial.jPanelAccionesFormularioSecuencial;
		}
		
		final JPanel jPanelCamposSecuencial=jPanelCamposAuxiliarSecuencial;
		final JPanel jPanelAccionesFormularioSecuencial=jPanelAccionesFormularioAuxiliarSecuencial;
		
		
		final JMenuBar jmenuBarSecuencial=this.jmenuBarSecuencial;		
		final JToolBar jTtoolBarSecuencial=this.jTtoolBarSecuencial;
				
		JMenuBar jmenuBarDetalleAuxiliarSecuencial=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSecuencial=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) {
			jmenuBarDetalleAuxiliarSecuencial=this.jInternalFrameDetalleFormSecuencial.jmenuBarDetalleSecuencial;
			jTtoolBarDetalleAuxiliarSecuencial=this.jInternalFrameDetalleFormSecuencial.jTtoolBarDetalleSecuencial;		
		}
		
		final JMenuBar jmenuBarDetalleSecuencial=jmenuBarDetalleAuxiliarSecuencial;
		final JToolBar jTtoolBarDetalleSecuencial=jTtoolBarDetalleAuxiliarSecuencial;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSecuencial;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSecuencial;
			processRunnable.jTableDatos=jTableDatosSecuencial;
			processRunnable.jPanelCampos=jPanelCamposSecuencial;
			processRunnable.jPanelPaginacion=jPanelPaginacionSecuencial;
			processRunnable.jPanelAcciones=jPanelAccionesSecuencial;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSecuencial;
			
			
			processRunnable.jmenuBar=jmenuBarSecuencial;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSecuencial;
			processRunnable.jTtoolBar=jTtoolBarSecuencial;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSecuencial;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSecuencial ,jPanelParametrosReportesSecuencial, jTableDatosSecuencial,/*jScrollPanelDatosSecuencial,*/jPanelCamposSecuencial,jPanelPaginacionSecuencial, /*jScrollPanelDatosEdicionSecuencial,*/ jPanelAccionesSecuencial,jPanelAccionesFormularioSecuencial,jmenuBarSecuencial,jmenuBarDetalleSecuencial,jTtoolBarSecuencial,jTtoolBarDetalleSecuencial));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSecuencial(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSecuencial(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSecuencial(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSecuencial(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSecuencial,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSecuencial,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSecuencial(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSecuencial,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSecuencial,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.secuencialConstantesFunciones.getsFinalQuerySecuencial();
		String  finalQueryPaginacionTodos=this.secuencialConstantesFunciones.getsFinalQuerySecuencial();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SecuencialConstantesFunciones.getArrayColumnasGlobalesNoSecuencial(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SecuencialConstantesFunciones.getArrayColumnasGlobalesSecuencial(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SecuencialConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.secuencialsEliminados= new ArrayList<Secuencial>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSecuencial();
		
				///*SecuencialSessionBean*/this.secuencialSessionBean=new SecuencialSessionBean();
			
			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
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
					this.iNumeroPaginacion=SecuencialConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SecuencialConstantesFunciones.getClassesForeignKeysOfSecuencial(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/secuencial."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			secuencialsAux= new ArrayList<Secuencial>();
			
				
			secuencialLogic.setDatosCliente(this.datosCliente);
			secuencialLogic.setDatosDeep(this.datosDeep);
			secuencialLogic.setIsConDeep(true);
			
			
			secuencialLogic.getSecuencialDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					secuencialLogic.getTodosSecuencials(finalQueryGlobal,pagination);
					
					//secuencialLogic.getTodosSecuencialsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(secuencialLogic.getSecuencials()==null|| secuencialLogic.getSecuencials().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							secuencialsAux= new ArrayList<Secuencial>();
							secuencialsAux.addAll(secuencialLogic.getSecuencials());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialsAux= new ArrayList<Secuencial>();
							secuencialsAux.addAll(secuencials);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							secuencialLogic.getTodosSecuencials(finalQueryGlobal+"",this.pagination);												
							
							//secuencialLogic.getTodosSecuencialsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSecuencials("Todos",secuencialLogic.getSecuencials() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							secuencialLogic.setSecuencials(new ArrayList<Secuencial>());					
							secuencialLogic.getSecuencials().addAll(secuencialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencials=new ArrayList<Secuencial>();
							secuencials.addAll(secuencialsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSecuencial=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSecuencial=this.idActual;
				
				} else if(this.idSecuencialActual!=null && this.idSecuencialActual!=0L) {
					idSecuencial=idSecuencialActual;
				}
				
					
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndicePorId(idSecuencial);
				
				this.secuencials=new ArrayList<Secuencial>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					secuencialLogic.getEntity(idSecuencial);
					
					//secuencialLogic.getEntityWithConnection(idSecuencial);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.setSecuencials(new ArrayList<Secuencial>());
					secuencialLogic.getSecuencials().add(secuencialLogic.getSecuencial());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencials=new ArrayList<Secuencial>();
					this.secuencials.add(secuencial);
				}
				
				if(secuencialLogic.getSecuencial()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorEjercicioPorModuloPorMovimiento")) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceBusquedaPorEjercicioPorModuloPorMovimiento(id_moduloBusquedaPorEjercicioPorModuloPorMovimiento,id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento,id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialLogic.getSecuencialsBusquedaPorEjercicioPorModuloPorMovimiento(finalQueryGlobal,pagination,id_moduloBusquedaPorEjercicioPorModuloPorMovimiento,id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento,id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceBusquedaPorEjercicioPorModuloPorMovimiento(id_moduloBusquedaPorEjercicioPorModuloPorMovimiento,id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento,id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceBusquedaPorEjercicioPorModuloPorMovimiento(id_moduloBusquedaPorEjercicioPorModuloPorMovimiento,id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento,id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialLogic.getSecuencials()==null||secuencialLogic.getSecuencials().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencials==null|| secuencials.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialsAux=new ArrayList<Secuencial>();
						secuencialsAux.addAll(secuencialLogic.getSecuencials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialsAux=new ArrayList<Secuencial>();
							secuencialsAux.addAll(secuencials);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialLogic.getSecuencialsBusquedaPorEjercicioPorModuloPorMovimiento(finalQueryGlobal,pagination,id_moduloBusquedaPorEjercicioPorModuloPorMovimiento,id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento,id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceBusquedaPorEjercicioPorModuloPorMovimiento(id_moduloBusquedaPorEjercicioPorModuloPorMovimiento,id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento,id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceBusquedaPorEjercicioPorModuloPorMovimiento(id_moduloBusquedaPorEjercicioPorModuloPorMovimiento,id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento,id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencials("BusquedaPorEjercicioPorModuloPorMovimiento",secuencialLogic.getSecuencials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencials("BusquedaPorEjercicioPorModuloPorMovimiento",secuencials);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialLogic.setSecuencials(new ArrayList<Secuencial>());
						secuencialLogic.getSecuencials().addAll(secuencialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencials=new ArrayList<Secuencial>();
							secuencials.addAll(secuencialsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialLogic.getSecuencialsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialLogic.getSecuencials()==null||secuencialLogic.getSecuencials().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencials==null|| secuencials.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialsAux=new ArrayList<Secuencial>();
						secuencialsAux.addAll(secuencialLogic.getSecuencials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialsAux=new ArrayList<Secuencial>();
							secuencialsAux.addAll(secuencials);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialLogic.getSecuencialsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencials("FK_IdEmpresa",secuencialLogic.getSecuencials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencials("FK_IdEmpresa",secuencials);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialLogic.setSecuencials(new ArrayList<Secuencial>());
						secuencialLogic.getSecuencials().addAll(secuencialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencials=new ArrayList<Secuencial>();
							secuencials.addAll(secuencialsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					secuencialLogic.getSecuencialsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=secuencialLogic.getSecuencials()==null||secuencialLogic.getSecuencials().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=secuencials==null|| secuencials.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialsAux=new ArrayList<Secuencial>();
						secuencialsAux.addAll(secuencialLogic.getSecuencials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialsAux=new ArrayList<Secuencial>();
							secuencialsAux.addAll(secuencials);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							secuencialLogic.getSecuencialsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SecuencialConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSecuencials("FK_IdSucursal",secuencialLogic.getSecuencials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSecuencials("FK_IdSucursal",secuencials);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialLogic.setSecuencials(new ArrayList<Secuencial>());
						secuencialLogic.getSecuencials().addAll(secuencialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencials=new ArrayList<Secuencial>();
							secuencials.addAll(secuencialsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSecuencial();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSecuencial();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=secuencialLogic.getSecuencials().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=secuencials.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=secuencialLogic.getSecuencials().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=secuencials.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Secuencial secuencial) {
		Boolean permite=true;
		
		if(this.secuencial.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SecuencialConstantesFunciones.getOrderByListaSecuencial();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SecuencialConstantesFunciones.getOrderByListaSecuencial();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Secuencial secuencial:secuencialLogic.getSecuencials()) {
				if(secuencial.getsType().equals(Constantes2.S_TOTALES)) {
					secuencialTotales=secuencial;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Secuencial secuencial:this.secuencials) {
				if(secuencial.getsType().equals(Constantes2.S_TOTALES)) {
					secuencialTotales=secuencial;
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
			this.secuencialAux=new Secuencial();
			this.secuencialAux.setsType(Constantes2.S_TOTALES);
			this.secuencialAux.setIsNew(false);
			this.secuencialAux.setIsChanged(false);
			this.secuencialAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SecuencialConstantesFunciones.TotalizarValoresFilaSecuencial(this.secuencialLogic.getSecuencials(),this.secuencialAux);
				
				this.secuencialLogic.getSecuencials().add(this.secuencialAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SecuencialConstantesFunciones.TotalizarValoresFilaSecuencial(this.secuencials,this.secuencialAux);
				
				this.secuencials.add(this.secuencialAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		secuencialTotales=new Secuencial();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.secuencialLogic.getSecuencials().remove(secuencialTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.secuencials.remove(secuencialTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		secuencialTotales=new Secuencial();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Secuencial secuencial:secuencialLogic.getSecuencials()) {
				if(secuencial.getsType().equals(Constantes2.S_TOTALES)) {
					secuencialTotales=secuencial;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SecuencialConstantesFunciones.TotalizarValoresFilaSecuencial(this.secuencialLogic.getSecuencials(),secuencialTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Secuencial secuencial:this.secuencials) {
				if(secuencial.getsType().equals(Constantes2.S_TOTALES)) {
					secuencialTotales=secuencial;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SecuencialConstantesFunciones.TotalizarValoresFilaSecuencial(this.secuencials,secuencialTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSecuencialsBusquedaPorEjercicioPorModuloPorMovimiento()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorEjercicioPorModuloPorMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialsFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialsFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialsFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialsFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialsFK_IdTipoDocumento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDocumento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialsFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSecuencialsFK_IdTipoMovimientoModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimientoModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSecuencialsBusquedaPorEjercicioPorModuloPorMovimiento(String sFinalQuery,Long id_modulo,Long id_ejercicio,Long id_tipo_movimiento_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.getSecuencialsBusquedaPorEjercicioPorModuloPorMovimiento(sFinalQuery,this.pagination,id_modulo,id_ejercicio,id_tipo_movimiento_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialsFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.getSecuencialsFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.getSecuencialsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.getSecuencialsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialsFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.getSecuencialsFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialsFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.getSecuencialsFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialsFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.getSecuencialsFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.getSecuencialsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialsFK_IdTipoDocumento(String sFinalQuery,Long id_tipo_documento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.getSecuencialsFK_IdTipoDocumento(sFinalQuery,this.pagination,id_tipo_documento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialsFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.getSecuencialsFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSecuencialsFK_IdTipoMovimientoModulo(String sFinalQuery,Long id_tipo_movimiento_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLogic.getSecuencialsFK_IdTipoMovimientoModulo(sFinalQuery,this.pagination,id_tipo_movimiento_modulo);
				
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
	
	public void inicializarPermisosSecuencial() {
		this.isPermisoTodoSecuencial=false;
		this.isPermisoNuevoSecuencial=false;
		this.isPermisoActualizarSecuencial=false;
		this.isPermisoActualizarOriginalSecuencial=false;
		this.isPermisoEliminarSecuencial=false;
		this.isPermisoGuardarCambiosSecuencial=false;
		this.isPermisoConsultaSecuencial=false;
		this.isPermisoBusquedaSecuencial=false;
		this.isPermisoReporteSecuencial=false;		
		this.isPermisoOrdenSecuencial=false;		
		this.isPermisoPaginacionMedioSecuencial=false;		
		this.isPermisoPaginacionAltoSecuencial=false;
		this.isPermisoPaginacionTodoSecuencial=false;
		this.isPermisoCopiarSecuencial=false;		
		this.isPermisoVerFormSecuencial=false;		
		this.isPermisoDuplicarSecuencial=false;		
		this.isPermisoOrdenSecuencial=false;		
	}
	
	public void setPermisosUsuarioSecuencial(Boolean isPermiso) {
		this.isPermisoTodoSecuencial=isPermiso;
		this.isPermisoNuevoSecuencial=isPermiso;
		this.isPermisoActualizarSecuencial=isPermiso;
		this.isPermisoActualizarOriginalSecuencial=isPermiso;
		this.isPermisoEliminarSecuencial=isPermiso;
		this.isPermisoGuardarCambiosSecuencial=isPermiso;
		this.isPermisoConsultaSecuencial=isPermiso;
		this.isPermisoBusquedaSecuencial=isPermiso;
		this.isPermisoReporteSecuencial=isPermiso;
		this.isPermisoOrdenSecuencial=isPermiso;		
		this.isPermisoPaginacionMedioSecuencial=isPermiso;		
		this.isPermisoPaginacionAltoSecuencial=isPermiso;		
		this.isPermisoPaginacionTodoSecuencial=isPermiso;		
		this.isPermisoCopiarSecuencial=isPermiso;		
		this.isPermisoVerFormSecuencial=isPermiso;		
		this.isPermisoDuplicarSecuencial=isPermiso;
		this.isPermisoOrdenSecuencial=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSecuencial(Boolean isPermiso) {
		//this.isPermisoTodoSecuencial=isPermiso;
		this.isPermisoNuevoSecuencial=isPermiso;
		this.isPermisoActualizarSecuencial=isPermiso;
		this.isPermisoActualizarOriginalSecuencial=isPermiso;
		this.isPermisoEliminarSecuencial=isPermiso;
		this.isPermisoGuardarCambiosSecuencial=isPermiso;
		//this.isPermisoConsultaSecuencial=isPermiso;
		//this.isPermisoBusquedaSecuencial=isPermiso;
		//this.isPermisoReporteSecuencial=isPermiso;
		//this.isPermisoOrdenSecuencial=isPermiso;		
		//this.isPermisoPaginacionMedioSecuencial=isPermiso;		
		//this.isPermisoPaginacionAltoSecuencial=isPermiso;		
		//this.isPermisoPaginacionTodoSecuencial=isPermiso;		
		//this.isPermisoCopiarSecuencial=isPermiso;		
		//this.isPermisoDuplicarSecuencial=isPermiso;
		//this.isPermisoOrdenSecuencial=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSecuencialClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SecuencialJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSecuencial(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSecuencialClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSecuencialClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSecuencialClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSecuencialClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSecuencial() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SecuencialJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.secuencialSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SecuencialConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSecuencial=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSecuencial=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSecuencial=this.isPermisoActualizarSecuencial;
			this.isPermisoEliminarSecuencial=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSecuencial=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSecuencial=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSecuencial=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSecuencial=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSecuencial=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSecuencial=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSecuencial=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSecuencial=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSecuencial=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSecuencial=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSecuencial=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSecuencial=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSecuencial=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.secuencialSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSecuencial.setToolTipText(this.jTableDatosSecuencial.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSecuencial(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSecuencial(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SecuencialJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SecuencialJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSecuencial() throws Exception {
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
	public void inicializarCombosForeignKeySecuencialListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.tipomovimientomodulosForeignKey=new ArrayList();
				this.tipodocumentosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySecuencialListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SecuencialJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySecuencialListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoMovimientoModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoMovimientoModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.tipomovimientomodulosForeignKey==null||this.tipomovimientomodulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoMovimientoModuloConstantesFunciones.getArrayColumnasGlobalesTipoMovimientoModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoMovimientoModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoMovimientoModulosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeySecuencialListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SecuencialParameterReturnGeneral secuencialReturnGeneral=new SecuencialParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.secuencialConstantesFunciones.cargarid_empresaSecuencial)
					 || (this.esRecargarFks && this.secuencialConstantesFunciones.cargarid_empresaSecuencial)) {

					if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+secuencialSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.secuencialConstantesFunciones.cargarid_sucursalSecuencial)
					 || (this.esRecargarFks && this.secuencialConstantesFunciones.cargarid_sucursalSecuencial)) {

					if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+secuencialSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.secuencialConstantesFunciones.cargarid_ejercicioSecuencial)
					 || (this.esRecargarFks && this.secuencialConstantesFunciones.cargarid_ejercicioSecuencial)) {

					if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+secuencialSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(cargarCombosDependencia && ((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.secuencialConstantesFunciones.cargarid_periodoSecuencial)
					 || (this.esRecargarFks && this.secuencialConstantesFunciones.cargarid_periodoSecuencial)) {

					if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+secuencialSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.secuencialConstantesFunciones.cargarid_anioSecuencial)
					 || (this.esRecargarFks && this.secuencialConstantesFunciones.cargarid_anioSecuencial)) {

					if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+secuencialSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.secuencialConstantesFunciones.cargarid_mesSecuencial)
					 || (this.esRecargarFks && this.secuencialConstantesFunciones.cargarid_mesSecuencial)) {

					if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+secuencialSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.secuencialConstantesFunciones.cargarid_moduloSecuencial)
					 || (this.esRecargarFks && this.secuencialConstantesFunciones.cargarid_moduloSecuencial)) {

					if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+secuencialSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTipoMovimientoModulo="";

				if(cargarCombosDependencia && ((this.tipomovimientomodulosForeignKey==null||this.tipomovimientomodulosForeignKey.size()<=0) && this.secuencialConstantesFunciones.cargarid_tipo_movimiento_moduloSecuencial)
					 || (this.esRecargarFks && this.secuencialConstantesFunciones.cargarid_tipo_movimiento_moduloSecuencial)) {

					if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimientoModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMovimientoModuloConstantesFunciones.getArrayColumnasGlobalesTipoMovimientoModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMovimientoModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMovimientoModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMovimientoModulo, "");
						finalQueryGlobalTipoMovimientoModulo+=TipoMovimientoModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMovimientoModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMovimientoModulo=" WHERE " + ConstantesSql.ID + "="+secuencialSessionBean.getlidTipoMovimientoModuloActual();
					}
				} else {
					finalQueryGlobalTipoMovimientoModulo="NONE";
				}


				String finalQueryGlobalTipoDocumento="";

				if(cargarCombosDependencia && ((this.tipodocumentosForeignKey==null||this.tipodocumentosForeignKey.size()<=0) && this.secuencialConstantesFunciones.cargarid_tipo_documentoSecuencial)
					 || (this.esRecargarFks && this.secuencialConstantesFunciones.cargarid_tipo_documentoSecuencial)) {

					if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoDocumentoConstantesFunciones.getArrayColumnasGlobalesTipoDocumento(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoDocumento=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoDocumento=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoDocumento, "");
						finalQueryGlobalTipoDocumento+=TipoDocumentoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoDocumentosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoDocumento=" WHERE " + ConstantesSql.ID + "="+secuencialSessionBean.getlidTipoDocumentoActual();
					}
				} else {
					finalQueryGlobalTipoDocumento="NONE";
				}


				String finalQueryGlobalTipoMovimiento="";

				if(((this.tipomovimientosForeignKey==null||this.tipomovimientosForeignKey.size()<=0) && this.secuencialConstantesFunciones.cargarid_tipo_movimientoSecuencial)
					 || (this.esRecargarFks && this.secuencialConstantesFunciones.cargarid_tipo_movimientoSecuencial)) {

					if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoMovimientoConstantesFunciones.getArrayColumnasGlobalesTipoMovimiento(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoMovimiento=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoMovimientoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoMovimiento=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoMovimiento, "");
						finalQueryGlobalTipoMovimiento+=TipoMovimientoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoMovimientosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoMovimiento=" WHERE " + ConstantesSql.ID + "="+secuencialSessionBean.getlidTipoMovimientoActual();
					}
				} else {
					finalQueryGlobalTipoMovimiento="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				secuencialReturnGeneral=secuencialLogic.cargarCombosLoteForeignKeySecuencial(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalAnio,finalQueryGlobalMes,finalQueryGlobalModulo,finalQueryGlobalTipoMovimientoModulo,finalQueryGlobalTipoDocumento,finalQueryGlobalTipoMovimiento);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=secuencialReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=secuencialReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=secuencialReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=secuencialReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=secuencialReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=secuencialReturnGeneral.getmessForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=secuencialReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTipoMovimientoModulo.equals("NONE")) {
				this.tipomovimientomodulosForeignKey=secuencialReturnGeneral.gettipomovimientomodulosForeignKey();
			}

			if(!finalQueryGlobalTipoDocumento.equals("NONE")) {
				this.tipodocumentosForeignKey=secuencialReturnGeneral.gettipodocumentosForeignKey();
			}

			if(!finalQueryGlobalTipoMovimiento.equals("NONE")) {
				this.tipomovimientosForeignKey=secuencialReturnGeneral.gettipomovimientosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySecuencial()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTipoMovimientoModulo();
			this.addItemDefectoCombosForeignKeyTipoDocumento();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.secuencialSessionBean==null) {
				this.secuencialSessionBean=new SecuencialSessionBean();
			}

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
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

	public void addItemDefectoCombosForeignKeyTipoMovimientoModulo()throws Exception {
		try {

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimientoModulo()) {
				TipoMovimientoModulo tipomovimientomodulo=new TipoMovimientoModulo();
				TipoMovimientoModuloConstantesFunciones.setTipoMovimientoModuloDescripcion(tipomovimientomodulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipomovimientomodulo.setId(null);

				if(!TipoMovimientoModuloConstantesFunciones.ExisteEnLista(this.tipomovimientomodulosForeignKey,tipomovimientomodulo,true)) {

					this.tipomovimientomodulosForeignKey.add(0,tipomovimientomodulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoDocumento()throws Exception {
		try {

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
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

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.secuencialSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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
	
	public void initActionsCombosTodosForeignKeySecuencial()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyEjercicio("Todos");
			this.initActionsCombosForeignKeyModulo("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySecuencial(String sFormularioTipoBusqueda)throws Exception {
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
			this.sFinalQueryComboTipoMovimientoModulo=sFinalQueryCombo;

			this.tipomovimientomodulosForeignKey=new ArrayList<TipoMovimientoModulo>();
			this.cargarCombosForeignKeyTipoMovimientoModulo(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
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
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.addItemListener(new ComboBoxItemListener(this,"id_ejercicioSecuencial"));
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.addFocusListener(new ComboBoxFocusListener(this,"id_ejercicioSecuencial"));
					}
				} else {
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.addActionListener(new ComboBoxActionListener(this,"id_ejercicioSecuencial"));
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.addFocusListener(new ComboBoxFocusListener(this,"id_ejercicioSecuencial"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial"));

						this.jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial"));

					} else {
						this.jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial"));

						this.jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial"));

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
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.addItemListener(new ComboBoxItemListener(this,"id_moduloSecuencial"));
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.addFocusListener(new ComboBoxFocusListener(this,"id_moduloSecuencial"));
					}
				} else {
					if(this.jInternalFrameDetalleFormSecuencial!=null) {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.addActionListener(new ComboBoxActionListener(this,"id_moduloSecuencial"));
						this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.addFocusListener(new ComboBoxFocusListener(this,"id_moduloSecuencial"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial"));

						this.jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial"));

					} else {
						this.jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial"));

						this.jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeySecuencial()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySecuencial();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySecuencial(Secuencial secuencial)throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(secuencial.getid_ejercicio(),false,"Formulario");
			this.setActualPeriodoForeignKey(secuencial.getid_periodo(),false,"Formulario");
			this.setActualModuloForeignKey(secuencial.getid_modulo(),false,"Formulario");
			this.setActualTipoMovimientoModuloForeignKey(secuencial.getid_tipo_movimiento_modulo(),false,"Formulario");
			this.setActualTipoDocumentoForeignKey(secuencial.getid_tipo_documento(),false,"Formulario");
			this.setActualTipoMovimientoForeignKey(secuencial.getid_tipo_movimiento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySecuencial(Secuencial secuencial,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySecuencial()throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(this.secuencialConstantesFunciones.getid_ejercicio(),false,"Formulario");
			this.setActualPeriodoForeignKey(this.secuencialConstantesFunciones.getid_periodo(),false,"Formulario");
			this.setActualModuloForeignKey(this.secuencialConstantesFunciones.getid_modulo(),false,"Formulario");
			this.setActualTipoMovimientoModuloForeignKey(this.secuencialConstantesFunciones.getid_tipo_movimiento_modulo(),false,"Formulario");
			this.setActualTipoDocumentoForeignKey(this.secuencialConstantesFunciones.getid_tipo_documento(),false,"Formulario");
			this.setActualTipoMovimientoForeignKey(this.secuencialConstantesFunciones.getid_tipo_movimiento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySecuencial()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySecuencial()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySecuencial()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSecuencial()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySecuencial()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientoModulosForeignKey("Todos");
			this.cargarCombosFrameTipoDocumentosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySecuencial(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientoModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySecuencial()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial!=null && this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial!=null && this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial!=null && this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial!=null && this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial!=null && this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial!=null && this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial!=null && this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.getItemCount()>0) {
				this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	





	public void recargarFormSecuencialEjercicio(JComboBox<?> jComboBoxGenericoEjercicio,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormSecuencialid_periodo(jComboBoxGenericoEjercicio,sFormularioTipoBusqueda,"Ejercicio",false);
	}







	public void recargarFormSecuencialModulo(JComboBox<?> jComboBoxGenericoModulo,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormSecuencialid_tipo_movimiento_modulo(jComboBoxGenericoModulo,sFormularioTipoBusqueda,"Modulo",false);
		this.recargarFormSecuencialid_tipo_documento(jComboBoxGenericoModulo,sFormularioTipoBusqueda,"Modulo",false);
	}






	
	



	public void recargarFormSecuencialid_periodo(JComboBox<?> jComboBoxGenericoPeriodo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Ejercicio")){
				this.setActualParaGuardarEjercicioForeignKey(this.secuencial,jComboBoxGenericoPeriodo);
			}

			if(this.secuencial.getid_ejercicio()!=null && this.secuencial.getid_ejercicio()!=0L) {
				sFinalQuery+="  WHERE  id_ejercicio="+this.secuencial.getid_ejercicio();
			} else {
				sFinalQuery+="  WHERE  id_ejercicio=-1";
			}



			//BUCLE RECURSIVO
			this.setActualPeriodoForeignKey(this.secuencial.getid_ejercicio(),true,sFormularioTipoBusqueda);

			this.cargarCombosPeriodosForeignKeyLista(sFinalQuery);

			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormSecuencialid_tipo_movimiento_modulo(JComboBox<?> jComboBoxGenericoTipoMovimientoModulo,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Modulo")){
				this.setActualParaGuardarModuloForeignKey(this.secuencial,jComboBoxGenericoTipoMovimientoModulo);
			}

			if(this.secuencial.getid_modulo()!=null && this.secuencial.getid_modulo()!=0L) {
				sFinalQuery+="  WHERE  id_modulo="+this.secuencial.getid_modulo();
			} else {
				sFinalQuery+="  WHERE  id_modulo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualTipoMovimientoModuloForeignKey(this.secuencial.getid_modulo(),true,sFormularioTipoBusqueda);

			this.cargarCombosTipoMovimientoModulosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameTipoMovimientoModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormSecuencialid_tipo_documento(JComboBox<?> jComboBoxGenericoTipoDocumento,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Modulo")){
				this.setActualParaGuardarModuloForeignKey(this.secuencial,jComboBoxGenericoTipoDocumento);
			}

			if(this.secuencial.getid_modulo()!=null && this.secuencial.getid_modulo()!=0L) {
				sFinalQuery+="  WHERE  id_modulo="+this.secuencial.getid_modulo();
			} else {
				sFinalQuery+="  WHERE  id_modulo=-1";
			}



			//BUCLE RECURSIVO
			this.setActualTipoDocumentoForeignKey(this.secuencial.getid_modulo(),true,sFormularioTipoBusqueda);

			this.cargarCombosTipoDocumentosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public SecuencialBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SecuencialBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SecuencialBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.secuencialSessionBean=new SecuencialSessionBean(); 
		this.secuencialConstantesFunciones=new SecuencialConstantesFunciones(); 
		this.secuencialBean=new Secuencial();//(this.secuencialConstantesFunciones); 		
		this.secuencialReturnGeneral=new SecuencialParameterReturnGeneral(); 
		
		this.secuencialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.secuencialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SecuencialBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SecuencialBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SecuencialBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSecuencial(true);
			
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
			
			this.secuencialConstantesFunciones=new SecuencialConstantesFunciones(); 
			this.secuencialBean=new Secuencial();//this.secuencialConstantesFunciones); 			
			this.secuencialReturnGeneral=new SecuencialParameterReturnGeneral(); 
		
			SecuencialBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Secuencial Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.secuencial=new Secuencial();
			this.secuencials = new ArrayList<Secuencial>();
			this.secuencialsAux = new ArrayList<Secuencial>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic=new SecuencialLogic();
				this.secuencialLogic.getNewConnexionToDeep("");
			}
			
			//this.secuencialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.secuencialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSecuencial);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSecuencial!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSecuencial);	
					}
					
					if(this.jInternalFrameImportacionSecuencial!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSecuencial);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySecuencial!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySecuencial);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSecuencial!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSecuencial);
				this.jInternalFrameDetalleFormSecuencial.setVisible(false);
				this.jInternalFrameDetalleFormSecuencial.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSecuencial!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSecuencial);
					this.jInternalFrameReporteDinamicoSecuencial.setVisible(false);
					this.jInternalFrameReporteDinamicoSecuencial.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSecuencial!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSecuencial);
					this.jInternalFrameImportacionSecuencial.setVisible(false);
					this.jInternalFrameImportacionSecuencial.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySecuencial!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySecuencial);
					this.jInternalFrameOrderBySecuencial.setVisible(false);
					this.jInternalFrameOrderBySecuencial.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSecuencialActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SecuencialConstantesFunciones.INUMEROPAGINACION;
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
			
			this.secuencialReturnGeneral=new SecuencialParameterReturnGeneral();
			
			this.secuencialParameterGeneral=new SecuencialParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.secuencialLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SecuencialJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.secuencialSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SecuencialConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.secuencialSessionBean.getEsGuardarRelacionado(),this.secuencialSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SecuencialConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.secuencialSessionBean.getEsGuardarRelacionado(),this.secuencialSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSecuencial=false;
			this.isVisibilidadCeldaDuplicarSecuencial=true;
			this.isVisibilidadCeldaCopiarSecuencial=true;
			this.isVisibilidadCeldaVerFormSecuencial=true;
			this.isVisibilidadCeldaOrdenSecuencial=true;
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=false;
			this.isVisibilidadCeldaModificarSecuencial=false;
			this.isVisibilidadCeldaActualizarSecuencial=false;
			this.isVisibilidadCeldaEliminarSecuencial=false;
			this.isVisibilidadCeldaCancelarSecuencial=false;
			this.isVisibilidadCeldaGuardarSecuencial=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencial=false;
			
			
			this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoDocumento=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			this.isVisibilidadFK_IdTipoMovimientoModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSecuencial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSecuencial();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSecuencial(false);
			
			this.setPermisosUsuarioSecuencial();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.secuencialSessionBean.getEsGuardarRelacionado() 
				|| (this.secuencialSessionBean.getEsGuardarRelacionado() && this.secuencialSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSecuencialClasesRelacionadas();
			}
			
			if(this.secuencialSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSecuencialClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SecuencialJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSecuencial();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSecuencial();
			}
			
			if(!this.isPermisoBusquedaSecuencial) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSecuencial.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSecuencial,this.isPermisoPaginacionMedioSecuencial,this.isPermisoPaginacionTodoSecuencial);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SecuencialConstantesFunciones.getTiposSeleccionarSecuencial());
				
				this.tiposColumnasSelect=SecuencialConstantesFunciones.getTiposSeleccionarSecuencial(true);
				
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
			//if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSecuencial();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioSecuencial(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioSecuencial(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSecuencial() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			this.moduloLogic=new ModuloLogic();
			this.tipomovimientomoduloLogic=new TipoMovimientoModuloLogic();
			this.tipodocumentoLogic=new TipoDocumentoLogic();
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
				secuencialImplementable= (SecuencialImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SecuencialConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				secuencialImplementableHome= (SecuencialImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SecuencialConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.secuencials= new ArrayList<Secuencial>();
			this.secuencialsEliminados= new ArrayList<Secuencial>();
						
			this.isEsNuevoSecuencial=false;
			this.esParaAccionDesdeFormularioSecuencial=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.tipomovimientomodulosForeignKey=new ArrayList<TipoMovimientoModulo>() ;
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySecuencial(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSecuencial();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SecuencialBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SecuencialConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSecuencial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSecuencial(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSecuencial!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSecuencial();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSecuencial();
			}
			
			SecuencialBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSecuencial.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSecuencial.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSecuencial.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSecuencial(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Secuencial: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSecuencial() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSecuencial")) {
				iIndex=this.jInternalFrameDetalleFormSecuencial.jTabbedPaneRelacionesSecuencial.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSecuencial.jTabbedPaneRelacionesSecuencial.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSecuencial();	
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
	
	public void cargarCombosForeignKeySecuencial(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySecuencial(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySecuencial(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySecuencialListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySecuencial();
		
		this.cargarCombosFrameForeignKeySecuencial();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySecuencial();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySecuencial();
		}
	}
	
	

	public void cargarCombosForeignKeyEjercicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyEjercicio("Todos");
				}

			this.recargarComboTablaEjercicio(this.ejerciciosForeignKey);

		} catch(Exception e) {
			throw e;
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

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyEjercicio("Todos");
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
					this.initActionsCombosForeignKeyEjercicio("Todos");
				}

			this.recargarComboTablaMes(this.messForeignKey);

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
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaModulo(this.modulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoMovimientoModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoMovimientoModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoMovimientoModulo();
				this.cargarCombosFrameTipoMovimientoModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyModulo("Todos");
				}

			this.recargarComboTablaTipoMovimientoModulo(this.tipomovimientomodulosForeignKey);

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
	
	public void jButtonNuevoSecuencialActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.secuencialSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
			
			if(jTableDatosSecuencial.getRowCount()>=1) {
				jTableDatosSecuencial.removeRowSelectionInterval(0, jTableDatosSecuencial.getRowCount()-1);						
			}
			
			this.isEsNuevoSecuencial=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSecuencial(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSecuencial(true);			
			//this.secuencial=new Secuencial();
			//this.secuencial.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSecuencial(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSecuencial() ;
			
			if(SecuencialJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSecuencial(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.secuencial);	
			this.actualizarInformacion("INFO_PADRE",false,this.secuencial);				
			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
			if(this.secuencialSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Secuencial: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSecuencialActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSecuencial.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSecuencial.getSelectedRows().length;			
			}
			
			secuencialsSeleccionados=this.getSecuencialsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSecuencial--;			
				//Secuencial secuencialAux= new Secuencial();			
				//secuencialAux.setId(this.iIdNuevoSecuencial);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Secuencial secuencialOrigen=new Secuencial();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Secuencial secuencialOrigen : secuencialsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							secuencialOrigen =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							secuencialOrigen =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSecuencial();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.secuencial.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSecuencial(secuencialOrigen,this.secuencial,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.secuencialLogic.getSecuencials().add(this.secuencialAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.secuencials.add(this.secuencialAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSecuencial(false);
				
				this.jTableDatosSecuencial.setRowSelectionInterval(this.getIndiceNuevoSecuencial(), this.getIndiceNuevoSecuencial());
				
				int iLastRow =  this.jTableDatosSecuencial.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSecuencial.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSecuencial.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSecuencial(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSecuencialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();									
		
			Secuencial secuencialOrigen=new Secuencial();
			Secuencial secuencialDestino=new Secuencial();
				
			secuencialsSeleccionados=this.getSecuencialsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSecuencial.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || secuencialsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSecuencial.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialOrigen =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						secuencialOrigen =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						secuencialDestino =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						secuencialDestino =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				secuencialOrigen =secuencialsSeleccionados.get(0);
				secuencialDestino =secuencialsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSecuencial(secuencialOrigen,secuencialDestino,true,false);
				
				secuencialDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(secuencialDestino,secuencialLogic.getSecuencials());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(secuencialDestino,secuencials);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSecuencial(false);
				
				//this.jTableDatosSecuencial.setRowSelectionInterval(this.getIndiceNuevoSecuencial(), this.getIndiceNuevoSecuencial());
				
				int iLastRow =  this.jTableDatosSecuencial.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSecuencial.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSecuencial.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSecuencial(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSecuencialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSecuencial.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSecuencialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSecuencial.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSecuencial.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSecuencial.setVisible(!isVisible);
			this.jPanelPaginacionSecuencial.setVisible(!isVisible);
			this.jPanelAccionesSecuencial.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSecuencialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSecuencial();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSecuencialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSecuencial();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSecuencialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSecuencial();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySecuencialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySecuencial();
			
			this.abrirFrameOrderBySecuencial();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySecuencialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySecuencial();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSecuencial(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSecuencial);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSecuencial.isMaximum()) {
					this.jInternalFrameDetalleFormSecuencial.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSecuencial.setSize(this.jInternalFrameDetalleFormSecuencial.iWidthFormulario,this.jInternalFrameDetalleFormSecuencial.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSecuencial.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSecuencial.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSecuencial.isMaximum()) {
						this.jInternalFrameDetalleFormSecuencial.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSecuencial.jContentPaneDetalleSecuencial.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSecuencial.jTabbedPaneRelacionesSecuencial.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSecuencial.jContentPaneDetalleSecuencial.getWidth(),SecuencialConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSecuencial.jTabbedPaneRelacionesSecuencial.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSecuencial.jContentPaneDetalleSecuencial.getWidth(),SecuencialConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSecuencial.jTabbedPaneRelacionesSecuencial.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSecuencial.jContentPaneDetalleSecuencial.getWidth(),SecuencialConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSecuencial.setVisible(true);
	        this.jInternalFrameDetalleFormSecuencial.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySecuencial() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySecuencial==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySecuencial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySecuencial,false,this);
				} else {
					this.jInternalFrameOrderBySecuencial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySecuencial,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySecuencial);
				this.jInternalFrameOrderBySecuencial.setVisible(false);
				this.jInternalFrameOrderBySecuencial.setSelected(false);
				
				this.jInternalFrameOrderBySecuencial.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySecuencial"));
				
				this.inicializarActualizarBindingTablaOrderBySecuencial();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSecuencial() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSecuencial==null) {
				
				this.jInternalFrameImportacionSecuencial=new ImportacionJInternalFrame(SecuencialConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSecuencial);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSecuencial);
				this.jInternalFrameImportacionSecuencial.setVisible(false);
				this.jInternalFrameImportacionSecuencial.setSelected(false);


				this.jInternalFrameImportacionSecuencial.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSecuencial"));
				this.jInternalFrameImportacionSecuencial.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSecuencial"));
				this.jInternalFrameImportacionSecuencial.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSecuencial"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSecuencial() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSecuencial==null) {
				this.jInternalFrameReporteDinamicoSecuencial=new ReporteDinamicoJInternalFrame(SecuencialConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSecuencial);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSecuencial);
				this.jInternalFrameReporteDinamicoSecuencial.setVisible(false);
				this.jInternalFrameReporteDinamicoSecuencial.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSecuencial.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSecuencial"));
				this.jInternalFrameReporteDinamicoSecuencial.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSecuencial"));
				this.jInternalFrameReporteDinamicoSecuencial.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSecuencial"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSecuencial();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSecuencial() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSecuencial);
			
	       	this.jInternalFrameDetalleFormSecuencial.setVisible(false);
	        this.jInternalFrameDetalleFormSecuencial.setSelected(false);
			
			//this.jInternalFrameDetalleFormSecuencial.dispose();
			//this.jInternalFrameDetalleFormSecuencial=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSecuencial() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSecuencial.setVisible(true);
	        this.jInternalFrameReporteDinamicoSecuencial.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSecuencial() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSecuencial.setVisible(true);
	        this.jInternalFrameImportacionSecuencial.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySecuencial() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySecuencial.setVisible(true);
	        this.jInternalFrameOrderBySecuencial.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySecuencial() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySecuencial.setVisible(false);
	        this.jInternalFrameOrderBySecuencial.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSecuencial() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSecuencial.setVisible(false);
	        this.jInternalFrameReporteDinamicoSecuencial.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSecuencial() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSecuencial.setVisible(false);
	        this.jInternalFrameImportacionSecuencial.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSecuencialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSecuencial(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSecuencial(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSecuencial(true);
			//this.isEsNuevoSecuencial=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSecuencial("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSecuencial(false) ;
			
			if(secuencialSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SecuencialJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSecuencial(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSecuencial(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSecuencialActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSecuencial(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSecuencial(true);
			//this.isEsNuevoSecuencial=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.secuencial.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSecuencial("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSecuencial(false) ;
			
			if(SecuencialJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSecuencial(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSecuencial(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEjercicio(List<Ejercicio> ejerciciosForeignKey)throws Exception{
		TableColumn tableColumnEjercicio=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDEJERCICIO));
		TableCellEditor tableCellEditorEjercicio =tableColumnEjercicio.getCellEditor();

		EjercicioTableCell ejercicioTableCellFk=(EjercicioTableCell)tableCellEditorEjercicio;

		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.setejerciciosForeignKey(ejerciciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSecuencial.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ejercicioTableCellFk.setRowActual(intSelectedRow);
			//ejercicioTableCellFk.setejerciciosForeignKeyActual(ejerciciosForeignKey);
		//}


		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.RecargarEjerciciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPeriodo(List<Periodo> periodosForeignKey)throws Exception{
		TableColumn tableColumnPeriodo=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDPERIODO));
		TableCellEditor tableCellEditorPeriodo =tableColumnPeriodo.getCellEditor();

		PeriodoTableCell periodoTableCellFk=(PeriodoTableCell)tableCellEditorPeriodo;

		if(periodoTableCellFk!=null) {
			periodoTableCellFk.setperiodosForeignKey(periodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSecuencial.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periodoTableCellFk.setRowActual(intSelectedRow);
			//periodoTableCellFk.setperiodosForeignKeyActual(periodosForeignKey);
		//}


		if(periodoTableCellFk!=null) {
			periodoTableCellFk.RecargarPeriodosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSecuencial.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSecuencial.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaModulo(List<Modulo> modulosForeignKey)throws Exception{
		TableColumn tableColumnModulo=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSecuencial.getSelectedRow();

		//if(intSelectedRow<=0) {
			//moduloTableCellFk.setRowActual(intSelectedRow);
			//moduloTableCellFk.setmodulosForeignKeyActual(modulosForeignKey);
		//}


		if(moduloTableCellFk!=null) {
			moduloTableCellFk.RecargarModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMovimientoModulo(List<TipoMovimientoModulo> tipomovimientomodulosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimientoModulo=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO));
		TableCellEditor tableCellEditorTipoMovimientoModulo =tableColumnTipoMovimientoModulo.getCellEditor();

		TipoMovimientoModuloTableCell tipomovimientomoduloTableCellFk=(TipoMovimientoModuloTableCell)tableCellEditorTipoMovimientoModulo;

		if(tipomovimientomoduloTableCellFk!=null) {
			tipomovimientomoduloTableCellFk.settipomovimientomodulosForeignKey(tipomovimientomodulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSecuencial.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientomoduloTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientomoduloTableCellFk.settipomovimientomodulosForeignKeyActual(tipomovimientomodulosForeignKey);
		//}


		if(tipomovimientomoduloTableCellFk!=null) {
			tipomovimientomoduloTableCellFk.RecargarTipoMovimientoModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoDocumento(List<TipoDocumento> tipodocumentosForeignKey)throws Exception{
		TableColumn tableColumnTipoDocumento=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO));
		TableCellEditor tableCellEditorTipoDocumento =tableColumnTipoDocumento.getCellEditor();

		TipoDocumentoTableCell tipodocumentoTableCellFk=(TipoDocumentoTableCell)tableCellEditorTipoDocumento;

		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.settipodocumentosForeignKey(tipodocumentosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSecuencial.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodocumentoTableCellFk.setRowActual(intSelectedRow);
			//tipodocumentoTableCellFk.settipodocumentosForeignKeyActual(tipodocumentosForeignKey);
		//}


		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.RecargarTipoDocumentosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSecuencial.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSecuencialActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSecuencial(false);
			
			//if(!this.isEsNuevoSecuencial) {								
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SecuencialJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				
			}
			
			if(this.permiteMantenimiento(this.secuencial)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.secuencialSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSecuencial=true;
					this.inicializarActualizarBindingTablaSecuencial(false);
					this.isEsNuevoSecuencial=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSecuencial=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSecuencial=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSecuencial(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSecuencial(false);
				
				this.habilitarDeshabilitarControlesSecuencial(false);
			
												
				
				if(SecuencialJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSecuencial();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSecuencialActionPerformed(evt,secuencialSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSecuencial(this.secuencial,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSecuencial.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,secuencialSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.secuencial.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Secuencial.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Secuencial.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSecuencialActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				this.secuencial.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				this.secuencial.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.secuencial)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.secuencialSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SecuencialModel) this.jTableDatosSecuencial.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSecuencial=true;
				this.inicializarActualizarBindingTablaSecuencial(false);
				this.isEsNuevoSecuencial=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSecuencial(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSecuencial(false);
				
				this.habilitarDeshabilitarControlesSecuencial(false);
				
				
				
				if(SecuencialJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSecuencial();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSecuencialActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSecuencial.getRowCount()>=1) {
				jTableDatosSecuencial.removeRowSelectionInterval(0, jTableDatosSecuencial.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSecuencial(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSecuencial(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSecuencial(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSecuencial(false) ;
			
			this.isEsNuevoSecuencial=false;
			
			if(SecuencialJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSecuencial();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSecuencialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSecuencial(false);
				
				//SI ES MANUAL
				if(SecuencialJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSecuencial();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSecuencialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSecuencial--;			
			//Secuencial secuencialAux= new Secuencial();			
			//secuencialAux.setId(this.iIdNuevoSecuencial);
			
			if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSecuencial();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
			
			this.secuencial.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.secuencialLogic.getSecuencials().add(this.secuencialAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.secuencials.add(this.secuencialAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSecuencial(false);
			
			this.jTableDatosSecuencial.setRowSelectionInterval(this.getIndiceNuevoSecuencial(), this.getIndiceNuevoSecuencial());
			
			int iLastRow =  this.jTableDatosSecuencial.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSecuencial.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSecuencial.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSecuencial(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSecuencialActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSecuencial(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSecuencial(false);
			
			//SI ES MANUAL
			if(SecuencialJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSecuencial();
			}
			
			//this.abrirFrameTreeSecuencial();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSecuencialActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE SecuencialES ?", "MANTENIMIENTO DE Secuencial", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSecuencial.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSecuencial();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.secuencialReturnGeneral=secuencialLogic.procesarImportacionSecuencialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.secuencialParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSecuencialReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSecuencialActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSecuencial.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSecuencial.setFileImportacion(this.jInternalFrameImportacionSecuencial.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSecuencial.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSecuencial.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSecuencial.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSecuencial.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSecuencialActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();		

		secuencialsSeleccionados=this.getSecuencialsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SecuencialBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SecuencialBaseDesign.jrxml";
			
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
			
			this.generarReporteSecuencials("Todos",secuencialsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSecuencial.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SecuencialConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMovimientoModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMovimientoModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMovimientoModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMovimientoModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROASIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAsiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAsiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAsiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAsiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROINGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROEGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroEgreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroEgreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroEgreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroEgreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMERODIARIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDiario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroRetencionIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroRetencionIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroRetencionIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroRetencionIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroRetencionFuente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroRetencionFuente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroRetencionFuente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroRetencionFuente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAsientoFormato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAsientoFormato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAsientoFormato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAsientoFormato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroIngresoFormato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroIngresoFormato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroIngresoFormato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroIngresoFormato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroEgresoFormato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroEgresoFormato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroEgresoFormato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroEgresoFormato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDiarioFormato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDiarioFormato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDiarioFormato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDiarioFormato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroRetencionFuenteFormato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroRetencionFuenteFormato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroRetencionFuenteFormato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroRetencionFuenteFormato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroRetencionIvaFormato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroRetencionIvaFormato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroRetencionIvaFormato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroRetencionIvaFormato_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSecuencial.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SecuencialConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SecuencialConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case SecuencialConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case SecuencialConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case SecuencialConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case SecuencialConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case SecuencialConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO:
					sNombreCampoCategoria="id_tipo_movimiento_modulo";
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					sNombreCampoCategoria="id_tipo_documento";
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoria="id_tipo_movimiento";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROASIENTO:
					sNombreCampoCategoria="numero_asiento";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROINGRESO:
					sNombreCampoCategoria="numero_ingreso";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROEGRESO:
					sNombreCampoCategoria="numero_egreso";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERODIARIO:
					sNombreCampoCategoria="numero_diario";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA:
					sNombreCampoCategoria="numero_retencion_iva";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE:
					sNombreCampoCategoria="numero_retencion_fuente";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO:
					sNombreCampoCategoria="numero_asiento_formato";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO:
					sNombreCampoCategoria="numero_ingreso_formato";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO:
					sNombreCampoCategoria="numero_egreso_formato";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO:
					sNombreCampoCategoria="numero_diario_formato";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO:
					sNombreCampoCategoria="numero_retencion_fuente_formato";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO:
					sNombreCampoCategoria="numero_retencion_iva_formato";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SecuencialConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SecuencialConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case SecuencialConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case SecuencialConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case SecuencialConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case SecuencialConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case SecuencialConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO:
					sNombreCampoCategoriaValor="id_tipo_movimiento_modulo";
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					sNombreCampoCategoriaValor="id_tipo_documento";
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="id_tipo_movimiento";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROASIENTO:
					sNombreCampoCategoriaValor="numero_asiento";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROINGRESO:
					sNombreCampoCategoriaValor="numero_ingreso";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROEGRESO:
					sNombreCampoCategoriaValor="numero_egreso";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERODIARIO:
					sNombreCampoCategoriaValor="numero_diario";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA:
					sNombreCampoCategoriaValor="numero_retencion_iva";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE:
					sNombreCampoCategoriaValor="numero_retencion_fuente";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO:
					sNombreCampoCategoriaValor="numero_asiento_formato";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO:
					sNombreCampoCategoriaValor="numero_ingreso_formato";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO:
					sNombreCampoCategoriaValor="numero_egreso_formato";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO:
					sNombreCampoCategoriaValor="numero_diario_formato";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO:
					sNombreCampoCategoriaValor="numero_retencion_fuente_formato";
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO:
					sNombreCampoCategoriaValor="numero_retencion_iva_formato";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSecuencial.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SecuencialConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SecuencialConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case SecuencialConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case SecuencialConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case SecuencialConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case SecuencialConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case SecuencialConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_movimiento_modulo");
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_documento");
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_movimiento");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROASIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Asiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_asiento");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_ingreso");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROEGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Egreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_egreso");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERODIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Diario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_diario");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Ret Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_retencion_iva");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Ret Fuente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_retencion_fuente");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Asiento.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_asiento_formato");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Ingreso.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_ingreso_formato");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Egreso.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_egreso_formato");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Diario.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_diario_formato");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Ret Fuente.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_retencion_fuente_formato");
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Ret Iva.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_retencion_iva_formato");
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
	
	public void jButtonGenerarExcelReporteDinamicoSecuencialActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();		
		
		secuencialsSeleccionados=this.getSecuencialsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencial";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Secuencials");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSecuencial.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SecuencialConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.gettipomovimientomodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.gettipodocumento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROASIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROASIENTO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_asiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROINGRESO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_ingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROEGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROEGRESO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_egreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERODIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERODIARIO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_diario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_retencion_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_retencion_fuente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_asiento_formato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_ingreso_formato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_egreso_formato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_diario_formato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_retencion_fuente_formato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO);
					iRow++;

					for(Secuencial secuencial:secuencialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(secuencial.getnumero_retencion_iva_formato());
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
			//	this.getFilaCabeceraExportarExcelSecuencial(row);				
			//	iRow++;
			//}				
			
			//for(Secuencial secuencialAux:secuencialsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSecuencial(secuencialAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial",JOptionPane.INFORMATION_MESSAGE);
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
				this.secuencialLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSecuencial(false);
			
			//SI ES MANUAL
			if(SecuencialJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSecuencial();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSecuencialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSecuencial(false);
			
			//SI ES MANUAL
			if(SecuencialJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSecuencial();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSecuencialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSecuencial(false);
			
			//SI ES MANUAL
			if(SecuencialJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSecuencial();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSecuencial() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSecuencial.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSecuencial.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSecuencial.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSecuencial.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSecuencial.setMinimumSize(dimensionMinimum);
		this.jTableDatosSecuencial.setMaximumSize(dimensionMaximum);
		this.jTableDatosSecuencial.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSecuencial(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSecuencial(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSecuencial(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSecuencial(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSecuencial(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSecuencial(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSecuencial(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSecuencial(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SecuencialJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SecuencialJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSecuencial() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSecuencial();
		
		this.inicializarActualizarBindingBotonesManualSecuencial(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSecuencial();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSecuencial() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSecuencial(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSecuencial(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSecuencial.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSecuencial.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSecuencial.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSecuencial!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSecuencial.jCheckBoxPostAccionNuevoSecuencial.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSecuencial.jCheckBoxPostAccionSinCerrarSecuencial.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSecuencial.jCheckBoxPostAccionSinMensajeSecuencial.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSecuencial.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSecuencial.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSecuencial.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSecuencial!=null) {
				this.jInternalFrameDetalleFormSecuencial.jCheckBoxPostAccionNuevoSecuencial.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSecuencial.jCheckBoxPostAccionSinCerrarSecuencial.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSecuencial.jCheckBoxPostAccionSinMensajeSecuencial.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSecuencial.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSecuencial.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSecuencial!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSecuencial.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSecuencial!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSecuencial.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSecuencial.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSecuencial.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSecuencial.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSecuencial!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSecuencial.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSecuencial.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSecuencial.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSecuencial(Boolean esInicializar) throws Exception {
		try	{	
			if(SecuencialJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSecuencial(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSecuencial() throws Exception {
		try	{
			if(SecuencialJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSecuencial();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSecuencial() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSecuencial() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSecuencial.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSecuencial.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSecuencial.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSecuencial.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSecuencial.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSecuencial.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSecuencial.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSecuencial.addItem(reporte);
			}
			
			
			if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSecuencial.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSecuencial.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSecuencial.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSecuencial.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSecuencial.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSecuencial.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSecuencial.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSecuencial.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSecuencial.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSecuencial();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSecuencial() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSecuencial!=null) {
				this.jInternalFrameReporteDinamicoSecuencial.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSecuencial.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSecuencial!=null) {
				this.jInternalFrameReporteDinamicoSecuencial.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSecuencial.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSecuencial!=null) {
				
				if(this.jInternalFrameReporteDinamicoSecuencial.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSecuencial.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSecuencial.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSecuencial.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSecuencial.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSecuencial.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSecuencial()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.getSelectedItem()!=null){this.id_moduloBusquedaPorEjercicioPorModuloPorMovimiento=((Modulo)this.jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.getSelectedItem()).getId();}
		if(this.jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.getSelectedItem()!=null){this.id_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento=((Ejercicio)this.jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.getSelectedItem()!=null){this.id_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento=((TipoMovimientoModulo)this.jComboBoxid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSecuencial(Boolean esInicializar) throws Exception {				
		if(SecuencialJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSecuencial();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSecuencial() throws Exception {
		this.inicializarActualizarBindingTablaSecuencial(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySecuencial() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSecuencialOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencialOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSecuencial(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=secuencialLogic.getSecuencials().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=secuencials.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SecuencialJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSecuencial.setModel(new SecuencialModel(this.secuencialLogic.getSecuencials(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSecuencial.setModel(new SecuencialModel(this.secuencials,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySecuencial!=null && this.jInternalFrameOrderBySecuencial.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySecuencial();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SecuencialConstantesFunciones.SCLASSWEBTITULO,secuencialConstantesFunciones.resaltarSeleccionarSecuencial,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SecuencialConstantesFunciones.SCLASSWEBTITULO,secuencialConstantesFunciones.resaltarSeleccionarSecuencial,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_ID));

		if(this.secuencialConstantesFunciones.mostraridSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.secuencialConstantesFunciones.resaltaridSecuencial,this.secuencialConstantesFunciones.activaridSecuencial,this,true,"idSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltaridSecuencial,this.secuencialConstantesFunciones.activaridSecuencial,this,true,"idSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDEMPRESA));

		if(this.secuencialConstantesFunciones.mostrarid_empresaSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.secuencialConstantesFunciones.resaltarid_empresaSecuencial,this,this.secuencialConstantesFunciones.activarid_empresaSecuencial));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.secuencialConstantesFunciones.resaltarid_empresaSecuencial,this,this.secuencialConstantesFunciones.activarid_empresaSecuencial,false,"id_empresaSecuencial","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.secuencialConstantesFunciones.mostrarid_sucursalSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.secuencialConstantesFunciones.resaltarid_sucursalSecuencial,this,this.secuencialConstantesFunciones.activarid_sucursalSecuencial));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.secuencialConstantesFunciones.resaltarid_sucursalSecuencial,this,this.secuencialConstantesFunciones.activarid_sucursalSecuencial,false,"id_sucursalSecuencial","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.secuencialConstantesFunciones.mostrarid_ejercicioSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.secuencialConstantesFunciones.resaltarid_ejercicioSecuencial,this,this.secuencialConstantesFunciones.activarid_ejercicioSecuencial));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.secuencialConstantesFunciones.resaltarid_ejercicioSecuencial,this,this.secuencialConstantesFunciones.activarid_ejercicioSecuencial,true,"id_ejercicioSecuencial","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDPERIODO));

		if(this.secuencialConstantesFunciones.mostrarid_periodoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.secuencialConstantesFunciones.resaltarid_periodoSecuencial,this,this.secuencialConstantesFunciones.activarid_periodoSecuencial));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.secuencialConstantesFunciones.resaltarid_periodoSecuencial,this,this.secuencialConstantesFunciones.activarid_periodoSecuencial,true,"id_periodoSecuencial","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDANIO));

		if(this.secuencialConstantesFunciones.mostrarid_anioSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.secuencialConstantesFunciones.resaltarid_anioSecuencial,this,this.secuencialConstantesFunciones.activarid_anioSecuencial));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.secuencialConstantesFunciones.resaltarid_anioSecuencial,this,this.secuencialConstantesFunciones.activarid_anioSecuencial,true,"id_anioSecuencial","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDMES));

		if(this.secuencialConstantesFunciones.mostrarid_mesSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.secuencialConstantesFunciones.resaltarid_mesSecuencial,this,this.secuencialConstantesFunciones.activarid_mesSecuencial));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.secuencialConstantesFunciones.resaltarid_mesSecuencial,this,this.secuencialConstantesFunciones.activarid_mesSecuencial,true,"id_mesSecuencial","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDMODULO));

		if(this.secuencialConstantesFunciones.mostrarid_moduloSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.secuencialConstantesFunciones.resaltarid_moduloSecuencial,this,this.secuencialConstantesFunciones.activarid_moduloSecuencial));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.secuencialConstantesFunciones.resaltarid_moduloSecuencial,this,this.secuencialConstantesFunciones.activarid_moduloSecuencial,true,"id_moduloSecuencial","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO));

		if(this.secuencialConstantesFunciones.mostrarid_tipo_documentoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDocumentoTableCell(this.tipodocumentosForeignKey,this.secuencialConstantesFunciones.resaltarid_tipo_documentoSecuencial,this,this.secuencialConstantesFunciones.activarid_tipo_documentoSecuencial));
			tableColumn.setCellEditor(new TipoDocumentoTableCell(this.tipodocumentosForeignKey,this.secuencialConstantesFunciones.resaltarid_tipo_documentoSecuencial,this,this.secuencialConstantesFunciones.activarid_tipo_documentoSecuencial,true,"id_tipo_documentoSecuencial","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));

		if(this.secuencialConstantesFunciones.mostrarid_tipo_movimientoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.secuencialConstantesFunciones.resaltarid_tipo_movimientoSecuencial,this,this.secuencialConstantesFunciones.activarid_tipo_movimientoSecuencial));
			tableColumn.setCellEditor(new TipoMovimientoTableCell(this.tipomovimientosForeignKey,this.secuencialConstantesFunciones.resaltarid_tipo_movimientoSecuencial,this,this.secuencialConstantesFunciones.activarid_tipo_movimientoSecuencial,true,"id_tipo_movimientoSecuencial","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMEROASIENTO));

		if(this.secuencialConstantesFunciones.mostrarnumero_asientoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMEROASIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.secuencialConstantesFunciones.resaltarnumero_asientoSecuencial,this.secuencialConstantesFunciones.activarnumero_asientoSecuencial,this,true,"numero_asientoSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_asientoSecuencial,this.secuencialConstantesFunciones.activarnumero_asientoSecuencial,this,true,"numero_asientoSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMEROINGRESO));

		if(this.secuencialConstantesFunciones.mostrarnumero_ingresoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMEROINGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.secuencialConstantesFunciones.resaltarnumero_ingresoSecuencial,this.secuencialConstantesFunciones.activarnumero_ingresoSecuencial,this,true,"numero_ingresoSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_ingresoSecuencial,this.secuencialConstantesFunciones.activarnumero_ingresoSecuencial,this,true,"numero_ingresoSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMEROEGRESO));

		if(this.secuencialConstantesFunciones.mostrarnumero_egresoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMEROEGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.secuencialConstantesFunciones.resaltarnumero_egresoSecuencial,this.secuencialConstantesFunciones.activarnumero_egresoSecuencial,this,true,"numero_egresoSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_egresoSecuencial,this.secuencialConstantesFunciones.activarnumero_egresoSecuencial,this,true,"numero_egresoSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMERODIARIO));

		if(this.secuencialConstantesFunciones.mostrarnumero_diarioSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMERODIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.secuencialConstantesFunciones.resaltarnumero_diarioSecuencial,this.secuencialConstantesFunciones.activarnumero_diarioSecuencial,this,true,"numero_diarioSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_diarioSecuencial,this.secuencialConstantesFunciones.activarnumero_diarioSecuencial,this,true,"numero_diarioSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA));

		if(this.secuencialConstantesFunciones.mostrarnumero_retencion_ivaSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.secuencialConstantesFunciones.resaltarnumero_retencion_ivaSecuencial,this.secuencialConstantesFunciones.activarnumero_retencion_ivaSecuencial,this,true,"numero_retencion_ivaSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_retencion_ivaSecuencial,this.secuencialConstantesFunciones.activarnumero_retencion_ivaSecuencial,this,true,"numero_retencion_ivaSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE));

		if(this.secuencialConstantesFunciones.mostrarnumero_retencion_fuenteSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.secuencialConstantesFunciones.resaltarnumero_retencion_fuenteSecuencial,this.secuencialConstantesFunciones.activarnumero_retencion_fuenteSecuencial,this,true,"numero_retencion_fuenteSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_retencion_fuenteSecuencial,this.secuencialConstantesFunciones.activarnumero_retencion_fuenteSecuencial,this,true,"numero_retencion_fuenteSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO));

		if(this.secuencialConstantesFunciones.mostrarnumero_asiento_formatoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.secuencialConstantesFunciones.resaltarnumero_asiento_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_asiento_formatoSecuencial,this,true,"numero_asiento_formatoSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_asiento_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_asiento_formatoSecuencial,this,true,"numero_asiento_formatoSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO));

		if(this.secuencialConstantesFunciones.mostrarnumero_ingreso_formatoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.secuencialConstantesFunciones.resaltarnumero_ingreso_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_ingreso_formatoSecuencial,this,true,"numero_ingreso_formatoSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_ingreso_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_ingreso_formatoSecuencial,this,true,"numero_ingreso_formatoSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO));

		if(this.secuencialConstantesFunciones.mostrarnumero_egreso_formatoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.secuencialConstantesFunciones.resaltarnumero_egreso_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_egreso_formatoSecuencial,this,true,"numero_egreso_formatoSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_egreso_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_egreso_formatoSecuencial,this,true,"numero_egreso_formatoSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO));

		if(this.secuencialConstantesFunciones.mostrarnumero_diario_formatoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.secuencialConstantesFunciones.resaltarnumero_diario_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_diario_formatoSecuencial,this,true,"numero_diario_formatoSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_diario_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_diario_formatoSecuencial,this,true,"numero_diario_formatoSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO));

		if(this.secuencialConstantesFunciones.mostrarnumero_retencion_fuente_formatoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.secuencialConstantesFunciones.resaltarnumero_retencion_fuente_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_retencion_fuente_formatoSecuencial,this,true,"numero_retencion_fuente_formatoSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_retencion_fuente_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_retencion_fuente_formatoSecuencial,this,true,"numero_retencion_fuente_formatoSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO));

		if(this.secuencialConstantesFunciones.mostrarnumero_retencion_iva_formatoSecuencial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.secuencialConstantesFunciones.resaltarnumero_retencion_iva_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_retencion_iva_formatoSecuencial,this,true,"numero_retencion_iva_formatoSecuencial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.secuencialConstantesFunciones.resaltarnumero_retencion_iva_formatoSecuencial,this.secuencialConstantesFunciones.activarnumero_retencion_iva_formatoSecuencial,this,true,"numero_retencion_iva_formatoSecuencial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SecuencialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.secuencialSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.secuencialSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.secuencialSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSecuencial.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.secuencialSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.secuencialSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSecuencial.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSecuencial && this.isPermisoGuardarCambiosSecuencial) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.secuencialSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.secuencialSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSecuencial.addColumn(tableColumn);
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
			
			this.jTableDatosSecuencial.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSecuencial && this.isPermisoGuardarCambiosSecuencial) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSecuencial && this.isPermisoGuardarCambiosSecuencial) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSecuencial.moveColumn(this.jTableDatosSecuencial.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSecuencial.moveColumn(this.jTableDatosSecuencial.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSecuencial.moveColumn(this.jTableDatosSecuencial.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSecuencial.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSecuencial.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSecuencial,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SecuencialJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSecuencial.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSecuencial.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SecuencialJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SecuencialJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSecuencial.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSecuencial.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSecuencial.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=secuencialLogic.getSecuencials().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=secuencials.size()-1;
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
		//this.jTableDatosSecuencial.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSecuencial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSecuencial();
			
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
				
				//this.isEsNuevoSecuencial=false;
					
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
				if(this.secuencialSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSecuencial==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSecuencial.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSecuencial.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.secuencial.getsType().equals("DUPLICADO")
				   || this.secuencial.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSecuencial=true;
				
				} else {
					this.isEsNuevoSecuencial=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.secuencialSessionBean.getEsGuardarRelacionado()) {
					if(this.secuencial.getId()>=0 && !this.secuencial.getIsNew()) {						
						this.isEsNuevoSecuencial=false;
						
					} else {
						this.isEsNuevoSecuencial=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSecuencial(esRelaciones);						
				
				this.seleccionarSecuencial(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.secuencial.getId()<0) {
					this.isEsNuevoSecuencial=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSecuencial(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSecuencial(evt,rowIndex);
				}	
				
				if(this.secuencialSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Secuencial: " + this.dDif); 
					}
				}								
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSecuencial(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.secuencial)) {
					if(this.secuencial.getId()>0) {
						this.secuencial.setIsDeleted(true);
						
						this.secuencialsEliminados.add(this.secuencial);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.secuencialLogic.getSecuencials().remove(this.secuencial);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.secuencials.remove(this.secuencial);				
					}
					
					
					((SecuencialModel) this.jTableDatosSecuencial.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSecuencial(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSecuencial(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSecuencial) {
			
			if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSecuencial.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSecuencial.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SecuencialJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSecuencial(this.secuencial);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.secuencialConstantesFunciones.cargarid_empresaSecuencial || this.secuencialConstantesFunciones.event_dependid_empresaSecuencial) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.secuencial.getid_empresa());
									//this.inicializarActualizarBindingSecuencial(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(secuencial.getEmpresa()!=null) {
							this.empresasForeignKey.add(secuencial.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.secuencial.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.secuencialConstantesFunciones.cargarid_sucursalSecuencial || this.secuencialConstantesFunciones.event_dependid_sucursalSecuencial) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.secuencial.getid_sucursal());
									//this.inicializarActualizarBindingSecuencial(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(secuencial.getSucursal()!=null) {
							this.sucursalsForeignKey.add(secuencial.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.secuencial.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.secuencialConstantesFunciones.cargarid_ejercicioSecuencial || this.secuencialConstantesFunciones.event_dependid_ejercicioSecuencial) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.secuencial.getid_ejercicio());
									//this.inicializarActualizarBindingSecuencial(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(secuencial.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(secuencial.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.secuencial.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.secuencialConstantesFunciones.cargarid_periodoSecuencial || this.secuencialConstantesFunciones.event_dependid_periodoSecuencial) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.secuencial.getid_periodo());
									//this.inicializarActualizarBindingSecuencial(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(secuencial.getPeriodo()!=null) {
							this.periodosForeignKey.add(secuencial.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.secuencial.getid_periodo(),false,"Formulario");

					//Anio
					if(!this.secuencialConstantesFunciones.cargarid_anioSecuencial || this.secuencialConstantesFunciones.event_dependid_anioSecuencial) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.secuencial.getid_anio());
									//this.inicializarActualizarBindingSecuencial(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(secuencial.getAnio()!=null) {
							this.aniosForeignKey.add(secuencial.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.secuencial.getid_anio(),false,"Formulario");

					//Mes
					if(!this.secuencialConstantesFunciones.cargarid_mesSecuencial || this.secuencialConstantesFunciones.event_dependid_mesSecuencial) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.secuencial.getid_mes());
									//this.inicializarActualizarBindingSecuencial(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(secuencial.getMes()!=null) {
							this.messForeignKey.add(secuencial.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.secuencial.getid_mes(),false,"Formulario");

					//Modulo
					if(!this.secuencialConstantesFunciones.cargarid_moduloSecuencial || this.secuencialConstantesFunciones.event_dependid_moduloSecuencial) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.secuencial.getid_modulo());
									//this.inicializarActualizarBindingSecuencial(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(secuencial.getModulo()!=null) {
							this.modulosForeignKey.add(secuencial.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.secuencial.getid_modulo(),false,"Formulario");

					//TipoMovimientoModulo
					if(!this.secuencialConstantesFunciones.cargarid_tipo_movimiento_moduloSecuencial || this.secuencialConstantesFunciones.event_dependid_tipo_movimiento_moduloSecuencial) {
						//this.cargarCombosTipoMovimientoModulosForeignKeyLista(" where id="+this.secuencial.getid_tipo_movimiento_modulo());
									//this.inicializarActualizarBindingSecuencial(false,false);
						this.tipomovimientomodulosForeignKey=new ArrayList<TipoMovimientoModulo>();

						if(secuencial.getTipoMovimientoModulo()!=null) {
							this.tipomovimientomodulosForeignKey.add(secuencial.getTipoMovimientoModulo());
						}

						this.addItemDefectoCombosForeignKeyTipoMovimientoModulo();
						this.cargarCombosFrameTipoMovimientoModulosForeignKey("Todos");
					}
					this.setActualTipoMovimientoModuloForeignKey(this.secuencial.getid_tipo_movimiento_modulo(),false,"Formulario");

					//TipoDocumento
					if(!this.secuencialConstantesFunciones.cargarid_tipo_documentoSecuencial || this.secuencialConstantesFunciones.event_dependid_tipo_documentoSecuencial) {
						//this.cargarCombosTipoDocumentosForeignKeyLista(" where id="+this.secuencial.getid_tipo_documento());
									//this.inicializarActualizarBindingSecuencial(false,false);
						this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>();

						if(secuencial.getTipoDocumento()!=null) {
							this.tipodocumentosForeignKey.add(secuencial.getTipoDocumento());
						}

						this.addItemDefectoCombosForeignKeyTipoDocumento();
						this.cargarCombosFrameTipoDocumentosForeignKey("Todos");
					}
					this.setActualTipoDocumentoForeignKey(this.secuencial.getid_tipo_documento(),false,"Formulario");

					//TipoMovimiento
					if(!this.secuencialConstantesFunciones.cargarid_tipo_movimientoSecuencial || this.secuencialConstantesFunciones.event_dependid_tipo_movimientoSecuencial) {
						//this.cargarCombosTipoMovimientosForeignKeyLista(" where id="+this.secuencial.getid_tipo_movimiento());
									//this.inicializarActualizarBindingSecuencial(false,false);
						this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>();

						if(secuencial.getTipoMovimiento()!=null) {
							this.tipomovimientosForeignKey.add(secuencial.getTipoMovimiento());
						}

						this.addItemDefectoCombosForeignKeyTipoMovimiento();
						this.cargarCombosFrameTipoMovimientosForeignKey("Todos");
					}
					this.setActualTipoMovimientoForeignKey(this.secuencial.getid_tipo_movimiento(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSecuencial("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSecuencial(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSecuencial() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSecuencial(Secuencial secuencial) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSecuencial(secuencial,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSecuencial(Secuencial secuencial,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSecuencial(secuencial);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySecuencial(secuencial,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySecuencial(secuencial);
	}
	
	public void setVariablesObjetoActualToFormularioSecuencial(Secuencial secuencial) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSecuencial.jLabelidSecuencial.setText(secuencial.getId().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asientoSecuencial.setText(secuencial.getnumero_asiento().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingresoSecuencial.setText(secuencial.getnumero_ingreso().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egresoSecuencial.setText(secuencial.getnumero_egreso().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diarioSecuencial.setText(secuencial.getnumero_diario().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_ivaSecuencial.setText(secuencial.getnumero_retencion_iva().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuenteSecuencial.setText(secuencial.getnumero_retencion_fuente().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asiento_formatoSecuencial.setText(secuencial.getnumero_asiento_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingreso_formatoSecuencial.setText(secuencial.getnumero_ingreso_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egreso_formatoSecuencial.setText(secuencial.getnumero_egreso_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diario_formatoSecuencial.setText(secuencial.getnumero_diario_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuente_formatoSecuencial.setText(secuencial.getnumero_retencion_fuente_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_iva_formatoSecuencial.setText(secuencial.getnumero_retencion_iva_formato());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Secuencial secuencialLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,secuencialLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Secuencial secuencialLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				secuencialLocal=this.secuencial;
			} else {
				secuencialLocal=this.secuencialAnterior;
			}
		}
		
		if(this.permiteMantenimiento(secuencialLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSecuencial(secuencialLocal,true);
					
					if(secuencialSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(secuencialLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.secuencialSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(secuencialLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSecuencial(Secuencial secuencial,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSecuencial(secuencial,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(secuencial);
	}
	
	public void setVariablesFormularioToObjetoActualSecuencial(Secuencial secuencial,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSecuencial(secuencial,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSecuencial(Secuencial secuencial,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSecuencial.jLabelidSecuencial.getText()==null || this.jInternalFrameDetalleFormSecuencial.jLabelidSecuencial.getText()=="" || this.jInternalFrameDetalleFormSecuencial.jLabelidSecuencial.getText()=="Id") {
				this.jInternalFrameDetalleFormSecuencial.jLabelidSecuencial.setText("0");
			}

			if(conColumnasBase) {secuencial.setId(Long.parseLong(this.jInternalFrameDetalleFormSecuencial.jLabelidSecuencial.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelIdSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_asiento(Long.parseLong(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asientoSecuencial.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMEROASIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_asientoSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_ingreso(Long.parseLong(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingresoSecuencial.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMEROINGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_ingresoSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_egreso(Long.parseLong(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egresoSecuencial.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMEROEGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_egresoSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_diario(Long.parseLong(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diarioSecuencial.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMERODIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_diarioSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_retencion_iva(Long.parseLong(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_ivaSecuencial.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_ivaSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_retencion_fuente(Long.parseLong(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuenteSecuencial.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_fuenteSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_asiento_formato(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asiento_formatoSecuencial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_asiento_formatoSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_ingreso_formato(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingreso_formatoSecuencial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_ingreso_formatoSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_egreso_formato(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egreso_formatoSecuencial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_egreso_formatoSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_diario_formato(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diario_formatoSecuencial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_diario_formatoSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_retencion_fuente_formato(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuente_formatoSecuencial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_fuente_formatoSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			secuencial.setnumero_retencion_iva_formato(this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_iva_formatoSecuencial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSecuencial.jLabelnumero_retencion_iva_formatoSecuencial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSecuencial(Secuencial secuencialBean,Secuencial secuencial,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSecuencial(Secuencial secuencialOrigen,Secuencial secuencial,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && secuencialOrigen.getId()!=null && !secuencialOrigen.getId().equals(0L))) {secuencial.setId(secuencialOrigen.getId());}}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_asiento()!=null && !secuencialOrigen.getnumero_asiento().equals(0L))) {secuencial.setnumero_asiento(secuencialOrigen.getnumero_asiento());}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_ingreso()!=null && !secuencialOrigen.getnumero_ingreso().equals(0L))) {secuencial.setnumero_ingreso(secuencialOrigen.getnumero_ingreso());}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_egreso()!=null && !secuencialOrigen.getnumero_egreso().equals(0L))) {secuencial.setnumero_egreso(secuencialOrigen.getnumero_egreso());}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_diario()!=null && !secuencialOrigen.getnumero_diario().equals(0L))) {secuencial.setnumero_diario(secuencialOrigen.getnumero_diario());}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_retencion_iva()!=null && !secuencialOrigen.getnumero_retencion_iva().equals(0L))) {secuencial.setnumero_retencion_iva(secuencialOrigen.getnumero_retencion_iva());}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_retencion_fuente()!=null && !secuencialOrigen.getnumero_retencion_fuente().equals(0L))) {secuencial.setnumero_retencion_fuente(secuencialOrigen.getnumero_retencion_fuente());}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_asiento_formato()!=null && !secuencialOrigen.getnumero_asiento_formato().equals(""))) {secuencial.setnumero_asiento_formato(secuencialOrigen.getnumero_asiento_formato());}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_ingreso_formato()!=null && !secuencialOrigen.getnumero_ingreso_formato().equals(""))) {secuencial.setnumero_ingreso_formato(secuencialOrigen.getnumero_ingreso_formato());}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_egreso_formato()!=null && !secuencialOrigen.getnumero_egreso_formato().equals(""))) {secuencial.setnumero_egreso_formato(secuencialOrigen.getnumero_egreso_formato());}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_diario_formato()!=null && !secuencialOrigen.getnumero_diario_formato().equals(""))) {secuencial.setnumero_diario_formato(secuencialOrigen.getnumero_diario_formato());}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_retencion_fuente_formato()!=null && !secuencialOrigen.getnumero_retencion_fuente_formato().equals(""))) {secuencial.setnumero_retencion_fuente_formato(secuencialOrigen.getnumero_retencion_fuente_formato());}
			if(conDefault || (!conDefault && secuencialOrigen.getnumero_retencion_iva_formato()!=null && !secuencialOrigen.getnumero_retencion_iva_formato().equals(""))) {secuencial.setnumero_retencion_iva_formato(secuencialOrigen.getnumero_retencion_iva_formato());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSecuencial(Secuencial secuencial) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSecuencial.jLabelidSecuencial.setText(secuencial.getId().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asientoSecuencial.setText(secuencial.getnumero_asiento().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingresoSecuencial.setText(secuencial.getnumero_ingreso().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egresoSecuencial.setText(secuencial.getnumero_egreso().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diarioSecuencial.setText(secuencial.getnumero_diario().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_ivaSecuencial.setText(secuencial.getnumero_retencion_iva().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuenteSecuencial.setText(secuencial.getnumero_retencion_fuente().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asiento_formatoSecuencial.setText(secuencial.getnumero_asiento_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingreso_formatoSecuencial.setText(secuencial.getnumero_ingreso_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egreso_formatoSecuencial.setText(secuencial.getnumero_egreso_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diario_formatoSecuencial.setText(secuencial.getnumero_diario_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuente_formatoSecuencial.setText(secuencial.getnumero_retencion_fuente_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_iva_formatoSecuencial.setText(secuencial.getnumero_retencion_iva_formato());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSecuencial(SecuencialBean secuencialBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSecuencial.jLabelidSecuencial.setText(secuencialBean.getId().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asientoSecuencial.setText(secuencialBean.getnumero_asiento().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingresoSecuencial.setText(secuencialBean.getnumero_ingreso().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egresoSecuencial.setText(secuencialBean.getnumero_egreso().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diarioSecuencial.setText(secuencialBean.getnumero_diario().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_ivaSecuencial.setText(secuencialBean.getnumero_retencion_iva().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuenteSecuencial.setText(secuencialBean.getnumero_retencion_fuente().toString());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asiento_formatoSecuencial.setText(secuencialBean.getnumero_asiento_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingreso_formatoSecuencial.setText(secuencialBean.getnumero_ingreso_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egreso_formatoSecuencial.setText(secuencialBean.getnumero_egreso_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diario_formatoSecuencial.setText(secuencialBean.getnumero_diario_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuente_formatoSecuencial.setText(secuencialBean.getnumero_retencion_fuente_formato());
			this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_iva_formatoSecuencial.setText(secuencialBean.getnumero_retencion_iva_formato());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSecuencial(SecuencialParameterReturnGeneral secuencialReturnGeneral,SecuencialBean secuencialBean,Boolean conDefault) throws Exception { 
		try {
			Secuencial secuencialLocal=new Secuencial();
			
			secuencialLocal=secuencialReturnGeneral.getSecuencial();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && secuencialLocal.getId()!=null && !secuencialLocal.getId().equals(0L))) {secuencialBean.setId(secuencialLocal.getId());}}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_asiento()!=null && !secuencialLocal.getnumero_asiento().equals(0L))) {secuencialBean.setnumero_asiento(secuencialLocal.getnumero_asiento());}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_ingreso()!=null && !secuencialLocal.getnumero_ingreso().equals(0L))) {secuencialBean.setnumero_ingreso(secuencialLocal.getnumero_ingreso());}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_egreso()!=null && !secuencialLocal.getnumero_egreso().equals(0L))) {secuencialBean.setnumero_egreso(secuencialLocal.getnumero_egreso());}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_diario()!=null && !secuencialLocal.getnumero_diario().equals(0L))) {secuencialBean.setnumero_diario(secuencialLocal.getnumero_diario());}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_retencion_iva()!=null && !secuencialLocal.getnumero_retencion_iva().equals(0L))) {secuencialBean.setnumero_retencion_iva(secuencialLocal.getnumero_retencion_iva());}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_retencion_fuente()!=null && !secuencialLocal.getnumero_retencion_fuente().equals(0L))) {secuencialBean.setnumero_retencion_fuente(secuencialLocal.getnumero_retencion_fuente());}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_asiento_formato()!=null && !secuencialLocal.getnumero_asiento_formato().equals(""))) {secuencialBean.setnumero_asiento_formato(secuencialLocal.getnumero_asiento_formato());}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_ingreso_formato()!=null && !secuencialLocal.getnumero_ingreso_formato().equals(""))) {secuencialBean.setnumero_ingreso_formato(secuencialLocal.getnumero_ingreso_formato());}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_egreso_formato()!=null && !secuencialLocal.getnumero_egreso_formato().equals(""))) {secuencialBean.setnumero_egreso_formato(secuencialLocal.getnumero_egreso_formato());}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_diario_formato()!=null && !secuencialLocal.getnumero_diario_formato().equals(""))) {secuencialBean.setnumero_diario_formato(secuencialLocal.getnumero_diario_formato());}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_retencion_fuente_formato()!=null && !secuencialLocal.getnumero_retencion_fuente_formato().equals(""))) {secuencialBean.setnumero_retencion_fuente_formato(secuencialLocal.getnumero_retencion_fuente_formato());}
			if(conDefault || (!conDefault && secuencialLocal.getnumero_retencion_iva_formato()!=null && !secuencialLocal.getnumero_retencion_iva_formato().equals(""))) {secuencialBean.setnumero_retencion_iva_formato(secuencialLocal.getnumero_retencion_iva_formato());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSecuencialGenerico(Long idSecuencialSeleccionado,JComboBox jComboBoxSecuencial,List<Secuencial> secuencialsLocal)throws Exception {
		try {
			Secuencial  secuencialTemp=null;

			for(Secuencial secuencialAux:secuencialsLocal) {
				if(secuencialAux.getId()!=null && secuencialAux.getId().equals(idSecuencialSeleccionado)) {
					secuencialTemp=secuencialAux;
					break;
				}
			}

			jComboBoxSecuencial.setSelectedItem(secuencialTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSecuencialGenerico(JComboBox jComboBoxSecuencial,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSecuencial.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSecuencial.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSecuencial.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSecuencial.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSecuencial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSecuencial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			secuencial=(Secuencial) secuencialLogic.getSecuencials().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			secuencial =(Secuencial) secuencials.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!secuencial.getIsNew() && !secuencial.getIsChanged() && !secuencial.getIsDeleted()) {
				sDescripcion=secuencial.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=secuencial.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!secuencial.getIsNew() && !secuencial.getIsChanged() && !secuencial.getIsDeleted()) {
				sDescripcion=secuencial.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=secuencial.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!secuencial.getIsNew() && !secuencial.getIsChanged() && !secuencial.getIsDeleted()) {
				sDescripcion=secuencial.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=secuencial.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!secuencial.getIsNew() && !secuencial.getIsChanged() && !secuencial.getIsDeleted()) {
				sDescripcion=secuencial.getperiodo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=secuencial.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!secuencial.getIsNew() && !secuencial.getIsChanged() && !secuencial.getIsDeleted()) {
				sDescripcion=secuencial.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=secuencial.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!secuencial.getIsNew() && !secuencial.getIsChanged() && !secuencial.getIsDeleted()) {
				sDescripcion=secuencial.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=secuencial.getmes_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!secuencial.getIsNew() && !secuencial.getIsChanged() && !secuencial.getIsDeleted()) {
				sDescripcion=secuencial.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=secuencial.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimientoModulo")) {
			//sDescripcion=this.getActualTipoMovimientoModuloForeignKeyDescripcion((Long)value);
			if(!secuencial.getIsNew() && !secuencial.getIsChanged() && !secuencial.getIsDeleted()) {
				sDescripcion=secuencial.gettipomovimientomodulo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=secuencial.gettipomovimientomodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoDocumento")) {
			//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
			if(!secuencial.getIsNew() && !secuencial.getIsChanged() && !secuencial.getIsDeleted()) {
				sDescripcion=secuencial.gettipodocumento_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=secuencial.gettipodocumento_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!secuencial.getIsNew() && !secuencial.getIsChanged() && !secuencial.getIsDeleted()) {
				sDescripcion=secuencial.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=secuencial.gettipomovimiento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Secuencial secuencialRow=new Secuencial();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			secuencialRow=(Secuencial) secuencialLogic.getSecuencials().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			secuencialRow=(Secuencial) secuencials.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSecuencial(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSecuencial.setVisible((this.isVisibilidadCeldaNuevoSecuencial && this.isPermisoNuevoSecuencial));			
			this.jButtonDuplicarSecuencial.setVisible((this.isVisibilidadCeldaDuplicarSecuencial && this.isPermisoDuplicarSecuencial));			
			this.jButtonCopiarSecuencial.setVisible((this.isVisibilidadCeldaCopiarSecuencial && this.isPermisoCopiarSecuencial));
			this.jButtonVerFormSecuencial.setVisible((this.isVisibilidadCeldaVerFormSecuencial && this.isPermisoVerFormSecuencial));
			
			this.jButtonAbrirOrderBySecuencial.setVisible((this.isVisibilidadCeldaOrdenSecuencial && this.isPermisoOrdenSecuencial));			
			
			this.jButtonNuevoRelacionesSecuencial.setVisible((this.isVisibilidadCeldaNuevoRelacionesSecuencial && this.isPermisoNuevoSecuencial));			
			this.jButtonNuevoGuardarCambiosSecuencial.setVisible((this.isVisibilidadCeldaNuevoSecuencial && this.isPermisoNuevoSecuencial && this.isPermisoGuardarCambiosSecuencial));
			
			if(this.jInternalFrameDetalleFormSecuencial!=null) {
			this.jInternalFrameDetalleFormSecuencial.jButtonModificarSecuencial.setVisible((this.isVisibilidadCeldaModificarSecuencial && this.isPermisoActualizarSecuencial));	
			this.jInternalFrameDetalleFormSecuencial.jButtonActualizarSecuencial.setVisible((this.isVisibilidadCeldaActualizarSecuencial && this.isPermisoActualizarSecuencial));	
			this.jInternalFrameDetalleFormSecuencial.jButtonEliminarSecuencial.setVisible((this.isVisibilidadCeldaEliminarSecuencial && this.isPermisoEliminarSecuencial));
			this.jInternalFrameDetalleFormSecuencial.jButtonCancelarSecuencial.setVisible(this.isVisibilidadCeldaCancelarSecuencial);							
			this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosSecuencial.setVisible((this.isVisibilidadCeldaGuardarSecuencial && this.isPermisoGuardarCambiosSecuencial));			
			
			}
						
			this.jButtonGuardarCambiosTablaSecuencial.setVisible((this.isVisibilidadCeldaGuardarCambiosSecuencial && this.isPermisoGuardarCambiosSecuencial));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSecuencial.setVisible((this.isVisibilidadCeldaNuevoSecuencial && this.isPermisoNuevoSecuencial));						
			this.jButtonDuplicarToolBarSecuencial.setVisible((this.isVisibilidadCeldaDuplicarSecuencial && this.isPermisoDuplicarSecuencial));						
			this.jButtonCopiarToolBarSecuencial.setVisible((this.isVisibilidadCeldaCopiarSecuencial && this.isPermisoCopiarSecuencial));			
			this.jButtonVerFormToolBarSecuencial.setVisible((this.isVisibilidadCeldaVerFormSecuencial && this.isPermisoVerFormSecuencial));			
			this.jButtonAbrirOrderByToolBarSecuencial.setVisible((this.isVisibilidadCeldaOrdenSecuencial && this.isPermisoOrdenSecuencial));
			this.jButtonNuevoRelacionesToolBarSecuencial.setVisible((this.isVisibilidadCeldaNuevoRelacionesSecuencial && this.isPermisoNuevoSecuencial));			
			this.jButtonNuevoGuardarCambiosToolBarSecuencial.setVisible((this.isVisibilidadCeldaNuevoSecuencial && this.isPermisoNuevoSecuencial && this.isPermisoGuardarCambiosSecuencial));			
			
			if(this.jInternalFrameDetalleFormSecuencial!=null) {
			this.jInternalFrameDetalleFormSecuencial.jButtonModificarToolBarSecuencial.setVisible((this.isVisibilidadCeldaModificarSecuencial && this.isPermisoActualizarSecuencial));	
			this.jInternalFrameDetalleFormSecuencial.jButtonActualizarToolBarSecuencial.setVisible((this.isVisibilidadCeldaActualizarSecuencial  && this.isPermisoActualizarSecuencial));	
			this.jInternalFrameDetalleFormSecuencial.jButtonEliminarToolBarSecuencial.setVisible((this.isVisibilidadCeldaEliminarSecuencial && this.isPermisoEliminarSecuencial));
			this.jInternalFrameDetalleFormSecuencial.jButtonCancelarToolBarSecuencial.setVisible(this.isVisibilidadCeldaCancelarSecuencial);				
			this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosToolBarSecuencial.setVisible((this.isVisibilidadCeldaGuardarSecuencial && this.isPermisoGuardarCambiosSecuencial));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSecuencial.setVisible((this.isVisibilidadCeldaGuardarCambiosSecuencial && this.isPermisoGuardarCambiosSecuencial));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSecuencial.setVisible((this.isVisibilidadCeldaNuevoSecuencial && this.isPermisoNuevoSecuencial));			
			this.jMenuItemDuplicarSecuencial.setVisible((this.isVisibilidadCeldaDuplicarSecuencial && this.isPermisoDuplicarSecuencial));			
			this.jMenuItemCopiarSecuencial.setVisible((this.isVisibilidadCeldaCopiarSecuencial && this.isPermisoCopiarSecuencial));			
			this.jMenuItemVerFormSecuencial.setVisible((this.isVisibilidadCeldaVerFormSecuencial && this.isPermisoVerFormSecuencial));			
			this.jMenuItemAbrirOrderBySecuencial.setVisible((this.isVisibilidadCeldaOrdenSecuencial && this.isPermisoOrdenSecuencial));			
			//this.jMenuItemMostrarOcultarSecuencial.setVisible((this.isVisibilidadCeldaOrdenSecuencial && this.isPermisoOrdenSecuencial));
			this.jMenuItemDetalleAbrirOrderBySecuencial.setVisible((this.isVisibilidadCeldaOrdenSecuencial && this.isPermisoOrdenSecuencial));			
			//this.jMenuItemDetalleMostrarOcultarSecuencial.setVisible((this.isVisibilidadCeldaOrdenSecuencial && this.isPermisoOrdenSecuencial));			
			this.jMenuItemNuevoRelacionesSecuencial.setVisible((this.isVisibilidadCeldaNuevoRelacionesSecuencial && this.isPermisoNuevoSecuencial));			
			this.jMenuItemNuevoGuardarCambiosSecuencial.setVisible((this.isVisibilidadCeldaNuevoSecuencial && this.isPermisoNuevoSecuencial && this.isPermisoGuardarCambiosSecuencial));									
			
			if(this.jInternalFrameDetalleFormSecuencial!=null) {
			this.jInternalFrameDetalleFormSecuencial.jMenuItemModificarSecuencial.setVisible((this.isVisibilidadCeldaModificarSecuencial && this.isPermisoActualizarSecuencial));	
			this.jInternalFrameDetalleFormSecuencial.jMenuItemActualizarSecuencial.setVisible((this.isVisibilidadCeldaActualizarSecuencial && this.isPermisoActualizarSecuencial));	
			this.jInternalFrameDetalleFormSecuencial.jMenuItemEliminarSecuencial.setVisible((this.isVisibilidadCeldaEliminarSecuencial && this.isPermisoEliminarSecuencial));
			this.jInternalFrameDetalleFormSecuencial.jMenuItemCancelarSecuencial.setVisible(this.isVisibilidadCeldaCancelarSecuencial);				
			}
			
			this.jMenuItemGuardarCambiosSecuencial.setVisible((this.isVisibilidadCeldaGuardarSecuencial && this.isPermisoGuardarCambiosSecuencial));						
			this.jMenuItemGuardarCambiosTablaSecuencial.setVisible((this.isVisibilidadCeldaGuardarCambiosSecuencial && this.isPermisoGuardarCambiosSecuencial));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSecuencial=this.jButtonNuevoSecuencial.isVisible();
			this.isVisibilidadCeldaDuplicarSecuencial=this.jButtonDuplicarSecuencial.isVisible();
			this.isVisibilidadCeldaCopiarSecuencial=this.jButtonCopiarSecuencial.isVisible();
			this.isVisibilidadCeldaVerFormSecuencial=this.jButtonVerFormSecuencial.isVisible();
			
			this.isVisibilidadCeldaOrdenSecuencial=this.jButtonAbrirOrderBySecuencial.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=this.jButtonNuevoRelacionesSecuencial.isVisible();
			this.isVisibilidadCeldaModificarSecuencial=this.jButtonModificarSecuencial.isVisible();
			
			if(this.jInternalFrameDetalleFormSecuencial!=null) {
			this.isVisibilidadCeldaActualizarSecuencial=this.jInternalFrameDetalleFormSecuencial.jButtonActualizarSecuencial.isVisible();
			this.isVisibilidadCeldaEliminarSecuencial=this.jInternalFrameDetalleFormSecuencial.jButtonEliminarSecuencial.isVisible();
			this.isVisibilidadCeldaCancelarSecuencial=this.jInternalFrameDetalleFormSecuencial.jButtonCancelarSecuencial.isVisible();
			this.isVisibilidadCeldaGuardarSecuencial=this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosSecuencial.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSecuencial=this.jButtonGuardarCambiosTablaSecuencial.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSecuencial=this.jButtonNuevoToolBarSecuencial.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=this.jButtonNuevoRelacionesToolBarSecuencial.isVisible();
			
			if(this.jInternalFrameDetalleFormSecuencial!=null) {
			this.isVisibilidadCeldaModificarSecuencial=this.jInternalFrameDetalleFormSecuencial.jButtonModificarToolBarSecuencial.isVisible();
			this.isVisibilidadCeldaActualizarSecuencial=this.jInternalFrameDetalleFormSecuencial.jButtonActualizarToolBarSecuencial.isVisible();
			this.isVisibilidadCeldaEliminarSecuencial=this.jInternalFrameDetalleFormSecuencial.jButtonEliminarToolBarSecuencial.isVisible();
			this.isVisibilidadCeldaCancelarSecuencial=this.jInternalFrameDetalleFormSecuencial.jButtonCancelarToolBarSecuencial.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSecuencial=this.jButtonGuardarCambiosToolBarSecuencial.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSecuencial=this.jButtonGuardarCambiosTablaToolBarSecuencial.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSecuencial=this.jMenuItemNuevoSecuencial.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=this.jMenuItemNuevoRelacionesSecuencial.isVisible();
			
			if(this.jInternalFrameDetalleFormSecuencial!=null) {
			this.isVisibilidadCeldaModificarSecuencial=this.jInternalFrameDetalleFormSecuencial.jMenuItemModificarSecuencial.isVisible();
			this.isVisibilidadCeldaActualizarSecuencial=this.jInternalFrameDetalleFormSecuencial.jMenuItemActualizarSecuencial.isVisible();
			this.isVisibilidadCeldaEliminarSecuencial=this.jInternalFrameDetalleFormSecuencial.jMenuItemEliminarSecuencial.isVisible();
			this.isVisibilidadCeldaCancelarSecuencial=this.jInternalFrameDetalleFormSecuencial.jMenuItemCancelarSecuencial.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSecuencial=this.jMenuItemGuardarCambiosSecuencial.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSecuencial=this.jMenuItemGuardarCambiosTablaSecuencial.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSecuencial(Boolean esInicializar) {
		if(SecuencialJInternalFrame.ISBINDING_MANUAL) {			
			if(this.secuencialSessionBean.getConGuardarRelaciones()) {
				//if(this.secuencialSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSecuencial();
			}
			
			this.inicializarActualizarBindingBotonesManualSecuencial(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSecuencial() {
		this.jButtonNuevoSecuencial.setVisible(this.isPermisoNuevoSecuencial);			
		this.jButtonDuplicarSecuencial.setVisible(this.isPermisoDuplicarSecuencial);			
		this.jButtonCopiarSecuencial.setVisible(this.isPermisoCopiarSecuencial);			
		this.jButtonVerFormSecuencial.setVisible(this.isPermisoVerFormSecuencial);			
		
		this.jButtonAbrirOrderBySecuencial.setVisible(this.isPermisoOrdenSecuencial);					
		
		this.jButtonNuevoRelacionesSecuencial.setVisible(this.isPermisoNuevoSecuencial);			
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jButtonModificarSecuencial.setVisible(this.isPermisoActualizarSecuencial);	
			this.jInternalFrameDetalleFormSecuencial.jButtonActualizarSecuencial.setVisible(this.isPermisoActualizarSecuencial);	
			this.jInternalFrameDetalleFormSecuencial.jButtonEliminarSecuencial.setVisible(this.isPermisoEliminarSecuencial);
			this.jInternalFrameDetalleFormSecuencial.jButtonCancelarSecuencial.setVisible(this.isVisibilidadCeldaCancelarSecuencial);						
			this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosSecuencial.setVisible(this.isPermisoGuardarCambiosSecuencial);							
		}
		
		this.jButtonGuardarCambiosTablaSecuencial.setVisible(this.isPermisoActualizarSecuencial);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSecuencial() {
		this.jInternalFrameDetalleFormSecuencial.jButtonModificarSecuencial.setVisible(this.isPermisoActualizarSecuencial);	
		this.jInternalFrameDetalleFormSecuencial.jButtonActualizarSecuencial.setVisible(this.isPermisoActualizarSecuencial);	
		this.jInternalFrameDetalleFormSecuencial.jButtonEliminarSecuencial.setVisible(this.isPermisoEliminarSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jButtonCancelarSecuencial.setVisible(this.isVisibilidadCeldaCancelarSecuencial);							
		this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosSecuencial.setVisible((this.isVisibilidadCeldaGuardarSecuencial && this.isPermisoGuardarCambiosSecuencial));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSecuencial() {
		if(SecuencialJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSecuencial();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSecuencial() {
	}
	
	public void jTableDatosSecuencialListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSecuencial(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.secuencial.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSecuencialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSecuencial(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.secuencialLogic.getConnexion());

				if(this.secuencial.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.secuencial.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencial=(TitledBorder)this.jScrollPanelDatosSecuencial.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSecuencial.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.secuencial.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalSecuencialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebSecuencial(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.secuencialLogic.getConnexion());

				if(this.secuencial.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.secuencial.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencial=(TitledBorder)this.jScrollPanelDatosSecuencial.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderSecuencial.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.secuencial.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioSecuencialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebSecuencial(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.secuencialLogic.getConnexion());

				if(this.secuencial.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.secuencial.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencial=(TitledBorder)this.jScrollPanelDatosSecuencial.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderSecuencial.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.secuencial.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoSecuencialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebSecuencial(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.secuencialLogic.getConnexion());

				if(this.secuencial.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.secuencial.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencial=(TitledBorder)this.jScrollPanelDatosSecuencial.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderSecuencial.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.secuencial.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioSecuencialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebSecuencial(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.secuencialLogic.getConnexion());

				if(this.secuencial.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.secuencial.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencial=(TitledBorder)this.jScrollPanelDatosSecuencial.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderSecuencial.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.secuencial.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesSecuencialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebSecuencial(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.secuencialLogic.getConnexion());

				if(this.secuencial.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.secuencial.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencial=(TitledBorder)this.jScrollPanelDatosSecuencial.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderSecuencial.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.secuencial.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloSecuencialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebSecuencial(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.secuencialLogic.getConnexion());

				if(this.secuencial.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.secuencial.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencial=(TitledBorder)this.jScrollPanelDatosSecuencial.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderSecuencial.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.secuencial.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimiento_moduloSecuencialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimientomodulo=true;

			idTienePermisotipomovimientomodulo=this.tienePermisosUsuarioEnPaginaWebSecuencial(TipoMovimientoModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimientomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);

				this.tipomovimientomoduloBeanSwingJInternalFrame=new TipoMovimientoModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientomoduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientomoduloBeanSwingJInternalFrame.getTipoMovimientoModuloLogic().setConnexion(this.secuencialLogic.getConnexion());

				if(this.secuencial.getid_tipo_movimiento_modulo()!=null) {
					this.tipomovimientomoduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientomoduloBeanSwingJInternalFrame.setIdActual(this.secuencial.getid_tipo_movimiento_modulo());
					this.tipomovimientomoduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientomoduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientomoduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimientoModulo();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientomoduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencial=(TitledBorder)this.jScrollPanelDatosSecuencial.getBorder();
				TitledBorder titledBordertipomovimientomodulo=(TitledBorder)this.tipomovimientomoduloBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimientoModulo.getBorder();

				titledBordertipomovimientomodulo.setTitle(titledBorderSecuencial.getTitle() + " -> Tipo Movimiento Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimiento_moduloSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getid_tipo_movimiento_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento_modulo = "+this.secuencial.getid_tipo_movimiento_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_documentoSecuencialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodocumento=true;

			idTienePermisotipodocumento=this.tienePermisosUsuarioEnPaginaWebSecuencial(TipoDocumentoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodocumento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);

				this.tipodocumentoBeanSwingJInternalFrame=new TipoDocumentoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodocumentoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodocumentoBeanSwingJInternalFrame.getTipoDocumentoLogic().setConnexion(this.secuencialLogic.getConnexion());

				if(this.secuencial.getid_tipo_documento()!=null) {
					this.tipodocumentoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodocumentoBeanSwingJInternalFrame.setIdActual(this.secuencial.getid_tipo_documento());
					this.tipodocumentoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumento();
				}

				JInternalFrameBase jinternalFrame =this.tipodocumentoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencial=(TitledBorder)this.jScrollPanelDatosSecuencial.getBorder();
				TitledBorder titledBordertipodocumento=(TitledBorder)this.tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.getBorder();

				titledBordertipodocumento.setTitle(titledBorderSecuencial.getTitle() + " -> Tipo Documento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_documentoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getid_tipo_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_documento = "+this.secuencial.getid_tipo_documento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoSecuencialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebSecuencial(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSecuencial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSecuencial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.secuencialLogic.getConnexion());

				if(this.secuencial.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.secuencial.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSecuencial=(TitledBorder)this.jScrollPanelDatosSecuencial.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderSecuencial.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.secuencial.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_asientoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_asiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_asiento = "+this.secuencial.getnumero_asiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_ingresoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_ingreso = "+this.secuencial.getnumero_ingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_egresoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_egreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_egreso = "+this.secuencial.getnumero_egreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_diarioSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_diario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_diario = "+this.secuencial.getnumero_diario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_retencion_ivaSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_retencion_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_retencion_iva = "+this.secuencial.getnumero_retencion_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_retencion_fuenteSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_retencion_fuente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_retencion_fuente = "+this.secuencial.getnumero_retencion_fuente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_asiento_formatoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_asiento_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_asiento_formato like '%"+this.secuencial.getnumero_asiento_formato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_ingreso_formatoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_ingreso_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_ingreso_formato like '%"+this.secuencial.getnumero_ingreso_formato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_egreso_formatoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_egreso_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_egreso_formato like '%"+this.secuencial.getnumero_egreso_formato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_diario_formatoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_diario_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_diario_formato like '%"+this.secuencial.getnumero_diario_formato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_retencion_fuente_formatoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_retencion_fuente_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_retencion_fuente_formato like '%"+this.secuencial.getnumero_retencion_fuente_formato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_retencion_iva_formatoSecuencialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.getsecuencial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.secuencial==null) {
						this.secuencial = new Secuencial();
					}

					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);
				}

				if(this.secuencial.getnumero_retencion_iva_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_retencion_iva_formato like '%"+this.secuencial.getnumero_retencion_iva_formato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSecuencial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorEjercicioPorModuloPorMovimientoSecuencialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencial(false,false);

			this.getSecuencialsBusquedaPorEjercicioPorModuloPorMovimiento();

			this.inicializarActualizarBindingSecuencial(false);

			//if(SecuencialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioSecuencialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencial(false,false);

			this.getSecuencialsFK_IdAnio();

			this.inicializarActualizarBindingSecuencial(false);

			//if(SecuencialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioSecuencialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencial(false,false);

			this.getSecuencialsFK_IdEjercicio();

			this.inicializarActualizarBindingSecuencial(false);

			//if(SecuencialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSecuencialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencial(false,false);

			this.getSecuencialsFK_IdEmpresa();

			this.inicializarActualizarBindingSecuencial(false);

			//if(SecuencialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesSecuencialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencial(false,false);

			this.getSecuencialsFK_IdMes();

			this.inicializarActualizarBindingSecuencial(false);

			//if(SecuencialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloSecuencialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencial(false,false);

			this.getSecuencialsFK_IdModulo();

			this.inicializarActualizarBindingSecuencial(false);

			//if(SecuencialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoSecuencialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencial(false,false);

			this.getSecuencialsFK_IdPeriodo();

			this.inicializarActualizarBindingSecuencial(false);

			//if(SecuencialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalSecuencialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencial(false,false);

			this.getSecuencialsFK_IdSucursal();

			this.inicializarActualizarBindingSecuencial(false);

			//if(SecuencialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDocumentoSecuencialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencial(false,false);

			this.getSecuencialsFK_IdTipoDocumento();

			this.inicializarActualizarBindingSecuencial(false);

			//if(SecuencialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoSecuencialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencial(false,false);

			this.getSecuencialsFK_IdTipoMovimiento();

			this.inicializarActualizarBindingSecuencial(false);

			//if(SecuencialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoModuloSecuencialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSecuencial(false,false);

			this.getSecuencialsFK_IdTipoMovimientoModulo();

			this.inicializarActualizarBindingSecuencial(false);

			//if(SecuencialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSecuencial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.secuencialLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSecuencial() {
		if(this.jInternalFrameDetalleFormSecuencial!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) {
			this.jInternalFrameDetalleFormSecuencial.setVisible(false);	    			
			this.jInternalFrameDetalleFormSecuencial.dispose();
			this.jInternalFrameDetalleFormSecuencial=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSecuencial!=null) {
			this.jInternalFrameReporteDinamicoSecuencial.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSecuencial.dispose();
			this.jInternalFrameReporteDinamicoSecuencial=null;
		}
		
		if(this.jInternalFrameImportacionSecuencial!=null) {
			this.jInternalFrameImportacionSecuencial.setVisible(false);	    			
			this.jInternalFrameImportacionSecuencial.dispose();
			this.jInternalFrameImportacionSecuencial=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSecuencial();
			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
			
			if(sTipo.equals("NuevoSecuencial")) {
				jButtonNuevoSecuencialActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSecuencial")) {
				jButtonDuplicarSecuencialActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSecuencial")) {
				jButtonCopiarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("VerFormSecuencial")) {
				jButtonVerFormSecuencialActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSecuencial")) {
				jButtonNuevoSecuencialActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSecuencial")) {
				jButtonDuplicarSecuencialActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSecuencial")) {
				jButtonNuevoSecuencialActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSecuencial")) {
				jButtonDuplicarSecuencialActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSecuencial")) {
				jButtonNuevoSecuencialActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSecuencial")) {
				jButtonNuevoSecuencialActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSecuencial")) {
				jButtonNuevoSecuencialActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSecuencial")) {
				jButtonModificarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSecuencial")) {
				jButtonModificarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSecuencial")) {
				jButtonModificarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSecuencial")) {
				jButtonActualizarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSecuencial")) {
				jButtonActualizarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSecuencial")) {
				jButtonActualizarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("EliminarSecuencial")) {
				jButtonEliminarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSecuencial")) {
				jButtonEliminarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSecuencial")) {
				jButtonEliminarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("CancelarSecuencial")) {
				jButtonCancelarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSecuencial")) {
				jButtonCancelarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSecuencial")) {
				jButtonCancelarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("CerrarSecuencial")) {
				jButtonCerrarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSecuencial")) {
				jButtonCerrarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSecuencial")) {
				jButtonCerrarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSecuencial")) {
				jButtonMostrarOcultarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSecuencial")) {
				jButtonCancelarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSecuencial")) {
				jButtonGuardarCambiosSecuencialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSecuencial")) {
				jButtonGuardarCambiosSecuencialActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSecuencial")) {
				jButtonCopiarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSecuencial")) {
				jButtonVerFormSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSecuencial")) {
				jButtonGuardarCambiosSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSecuencial")) {
				jButtonCopiarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSecuencial")) {
				jButtonVerFormSecuencialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSecuencial")) {
				jButtonGuardarCambiosSecuencialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSecuencial")) {
				jButtonGuardarCambiosSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSecuencial")) {
				jButtonGuardarCambiosSecuencialActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSecuencial")) {
				jButtonRecargarInformacionSecuencialActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSecuencial")) {
				jButtonRecargarInformacionSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSecuencial")) {
				jButtonRecargarInformacionSecuencialActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSecuencial")) {
				jButtonAnterioresSecuencialActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSecuencial")) {
				jButtonAnterioresSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSecuencial")) {
				jButtonAnterioresSecuencialActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSecuencial")) {
				jButtonSiguientesSecuencialActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSecuencial")) {
				jButtonSiguientesSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSecuencial")) {
				jButtonSiguientesSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySecuencial") || sTipo.equals("MenuItemDetalleAbrirOrderBySecuencial")) {
				jButtonAbrirOrderBySecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSecuencial") || sTipo.equals("MenuItemDetalleMostrarOcultarSecuencial")) {
				jButtonMostrarOcultarSecuencialActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSecuencial")) {
				jButtonNuevoGuardarCambiosSecuencialActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSecuencial")) {
				jButtonNuevoGuardarCambiosSecuencialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSecuencial")) {
				jButtonNuevoGuardarCambiosSecuencialActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSecuencial")) {
				jButtonCerrarReporteDinamicoSecuencialActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSecuencial")) {
				jButtonGenerarReporteDinamicoSecuencialActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSecuencial")) {
				
				jButtonGenerarExcelReporteDinamicoSecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSecuencial")) {
				jButtonCerrarImportacionSecuencialActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSecuencial")) {
				
				jButtonGenerarImportacionSecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSecuencial")) {
				
				jButtonAbrirImportacionSecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSecuencial")) {
				jComboBoxTiposAccionesSecuencialActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSecuencial")) {
				jComboBoxTiposRelacionesSecuencialActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSecuencial")) {
				jComboBoxTiposAccionesSecuencialActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSecuencial")) {
				
				jComboBoxTiposSeleccionarSecuencialActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSecuencial")) {
				jTextFieldValorCampoGeneralSecuencialActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySecuencial")) {
				jButtonAbrirOrderBySecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSecuencial")) {
				jButtonAbrirOrderBySecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySecuencial")) {
				jButtonCerrarOrderBySecuencialActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSecuencialBusqueda")) {
				this.jButtonidSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSecuencialUpdate")) {
				this.jButtonid_empresaSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSecuencialBusqueda")) {
				this.jButtonid_empresaSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSecuencialUpdate")) {
				this.jButtonid_sucursalSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSecuencialBusqueda")) {
				this.jButtonid_sucursalSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioSecuencialUpdate")) {
				this.jButtonid_ejercicioSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioSecuencialBusqueda")) {
				this.jButtonid_ejercicioSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoSecuencialUpdate")) {
				this.jButtonid_periodoSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoSecuencialBusqueda")) {
				this.jButtonid_periodoSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioSecuencialUpdate")) {
				this.jButtonid_anioSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioSecuencialBusqueda")) {
				this.jButtonid_anioSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesSecuencialUpdate")) {
				this.jButtonid_mesSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesSecuencialBusqueda")) {
				this.jButtonid_mesSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloSecuencialUpdate")) {
				this.jButtonid_moduloSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloSecuencialBusqueda")) {
				this.jButtonid_moduloSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimiento_moduloSecuencialUpdate")) {
				this.jButtonid_tipo_movimiento_moduloSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimiento_moduloSecuencialBusqueda")) {
				this.jButtonid_tipo_movimiento_moduloSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoSecuencialUpdate")) {
				this.jButtonid_tipo_documentoSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoSecuencialBusqueda")) {
				this.jButtonid_tipo_documentoSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoSecuencialUpdate")) {
				this.jButtonid_tipo_movimientoSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoSecuencialBusqueda")) {
				this.jButtonid_tipo_movimientoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_asientoSecuencialBusqueda")) {
				this.jButtonnumero_asientoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_ingresoSecuencialBusqueda")) {
				this.jButtonnumero_ingresoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_egresoSecuencialBusqueda")) {
				this.jButtonnumero_egresoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diarioSecuencialBusqueda")) {
				this.jButtonnumero_diarioSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencion_ivaSecuencialBusqueda")) {
				this.jButtonnumero_retencion_ivaSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencion_fuenteSecuencialBusqueda")) {
				this.jButtonnumero_retencion_fuenteSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_asiento_formatoSecuencialBusqueda")) {
				this.jButtonnumero_asiento_formatoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_ingreso_formatoSecuencialBusqueda")) {
				this.jButtonnumero_ingreso_formatoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_egreso_formatoSecuencialBusqueda")) {
				this.jButtonnumero_egreso_formatoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diario_formatoSecuencialBusqueda")) {
				this.jButtonnumero_diario_formatoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencion_fuente_formatoSecuencialBusqueda")) {
				this.jButtonnumero_retencion_fuente_formatoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencion_iva_formatoSecuencialBusqueda")) {
				this.jButtonnumero_retencion_iva_formatoSecuencialBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorEjercicioPorModuloPorMovimientoSecuencial")) {
				this.jButtonBusquedaPorEjercicioPorModuloPorMovimientoSecuencialActionPerformed(evt);
			}
			
			;
			
			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSecuencial();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				


				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Secuencial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Secuencial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Secuencial secuencialLocal=null;
			
			if(!this.getEsControlTabla()) {
				secuencialLocal=this.secuencial;
			} else {
				secuencialLocal=this.secuencialAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
							
				
				


				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Secuencial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Secuencial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialAnterior =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialAnterior =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
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
			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
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
			
			


			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
								
						
				


				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Secuencial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Secuencial.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
								
				
				


				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Secuencial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Secuencial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialAnterior =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialAnterior =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialAnterior =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialAnterior =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
			
			this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
							
				
				


				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Secuencial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Secuencial.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialAnterior =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.secuencialAnterior =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
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
			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
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
			
			


			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
			
			this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
								
				
				


				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Secuencial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Secuencial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialAnterior =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialAnterior =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
			
			this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSecuencial")) {
					jCheckBoxSeleccionarTodosSecuencialItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSecuencial")) {
					jCheckBoxSeleccionadosSecuencialItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSecuencial")) {
					
				}
				
				


				
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Secuencial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Secuencial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
												
				
				


				
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Secuencial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Secuencial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.secuencialAnterior =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.secuencialAnterior =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
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
			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
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
			
			


			if(sTipo.equals("id_ejercicioSecuencial")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial;
				}

				if(this.secuencialSessionBean.getConGuardarRelaciones()) {
					//classes=SecuencialConstantesFunciones.getClassesRelationshipsOfSecuencial(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormSecuencial(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
				//recargarFormSecuencialEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
			}
			 else if(sTipo.equals("id_moduloSecuencial")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial;
				}

				if(this.secuencialSessionBean.getConGuardarRelaciones()) {
					//classes=SecuencialConstantesFunciones.getClassesRelationshipsOfSecuencial(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormSecuencial(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
				//recargarFormSecuencialModulo(jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
			}
			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSecuencialActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_ejercicioSecuencial")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial;
				}

				if(this.secuencialSessionBean.getConGuardarRelaciones()) {
					//classes=SecuencialConstantesFunciones.getClassesRelationshipsOfSecuencial(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormSecuencial(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
				//recargarFormSecuencialEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
			}
			 else if(sTipo.equals("id_moduloSecuencial")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial;
				}

				if(this.secuencialSessionBean.getConGuardarRelaciones()) {
					//classes=SecuencialConstantesFunciones.getClassesRelationshipsOfSecuencial(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormSecuencial(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
				//recargarFormSecuencialModulo(jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
			}
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Secuencial.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Secuencial.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.secuencial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.secuencial);
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
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
				
				


			if(sTipo.equals("id_ejercicioSecuencial")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial;
				}

				if(this.secuencialSessionBean.getConGuardarRelaciones()) {
					//classes=SecuencialConstantesFunciones.getClassesRelationshipsOfSecuencial(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxGenerico,"Formulario");

				this.recargarFormSecuencial(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial")) {
				this.procesarActionsCombosForeignKeyEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
				//recargarFormSecuencialEjercicio(jComboBoxid_ejercicioBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
			}
			 else if(sTipo.equals("id_moduloSecuencial")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial;
				}

				if(this.secuencialSessionBean.getConGuardarRelaciones()) {
					//classes=SecuencialConstantesFunciones.getClassesRelationshipsOfSecuencial(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyModulo(jComboBoxGenerico,"Formulario");

				this.recargarFormSecuencial(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial")) {
				this.procesarActionsCombosForeignKeyModulo(jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
				//recargarFormSecuencialModulo(jComboBoxid_moduloBusquedaPorEjercicioPorModuloPorMovimientoSecuencial,"BusquedaPorEjercicioPorModuloPorMovimiento");
			}
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Secuencial.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Secuencial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSecuencialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.secuencialAnterior =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.secuencialAnterior =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSecuencial")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSecuencialListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSecuencial.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.secuencial =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.secuencial =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.secuencial);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSecuencial")) {
				
				}
				
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSecuencial")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSecuencial.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSecuencial")) {
			
			}
			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSecuencial();
			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
			if(sTipo.equals("NuevoSecuencial")) {
				jButtonNuevoSecuencialActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSecuencial")) {
				jButtonDuplicarSecuencialActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSecuencial")) {
				jButtonCopiarSecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSecuencial")) {
				jButtonVerFormSecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSecuencial")) {
				jButtonNuevoSecuencialActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSecuencial")) {
				jButtonModificarSecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSecuencial")) {
				jButtonActualizarSecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSecuencial")) {
				jButtonEliminarSecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSecuencial")) {
				jButtonGuardarCambiosSecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSecuencial")) {
				jButtonCancelarSecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSecuencial")) {
				jButtonCerrarSecuencialActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSecuencial")) {
				jButtonGuardarCambiosSecuencialActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSecuencial")) {
				jButtonNuevoGuardarCambiosSecuencialActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySecuencial")) {
				jButtonAbrirOrderBySecuencialActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSecuencial")) {
				jButtonRecargarInformacionSecuencialActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSecuencial")) {
				jButtonAnterioresSecuencialActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSecuencial")) {
				jButtonSiguientesSecuencialActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSecuencialBusqueda")) {
				this.jButtonidSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSecuencialUpdate")) {
				this.jButtonid_empresaSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSecuencialBusqueda")) {
				this.jButtonid_empresaSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalSecuencialUpdate")) {
				this.jButtonid_sucursalSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalSecuencialBusqueda")) {
				this.jButtonid_sucursalSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioSecuencialUpdate")) {
				this.jButtonid_ejercicioSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioSecuencialBusqueda")) {
				this.jButtonid_ejercicioSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoSecuencialUpdate")) {
				this.jButtonid_periodoSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoSecuencialBusqueda")) {
				this.jButtonid_periodoSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioSecuencialUpdate")) {
				this.jButtonid_anioSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioSecuencialBusqueda")) {
				this.jButtonid_anioSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesSecuencialUpdate")) {
				this.jButtonid_mesSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesSecuencialBusqueda")) {
				this.jButtonid_mesSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloSecuencialUpdate")) {
				this.jButtonid_moduloSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloSecuencialBusqueda")) {
				this.jButtonid_moduloSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimiento_moduloSecuencialUpdate")) {
				this.jButtonid_tipo_movimiento_moduloSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimiento_moduloSecuencialBusqueda")) {
				this.jButtonid_tipo_movimiento_moduloSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoSecuencialUpdate")) {
				this.jButtonid_tipo_documentoSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoSecuencialBusqueda")) {
				this.jButtonid_tipo_documentoSecuencialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoSecuencialUpdate")) {
				this.jButtonid_tipo_movimientoSecuencialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoSecuencialBusqueda")) {
				this.jButtonid_tipo_movimientoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_asientoSecuencialBusqueda")) {
				this.jButtonnumero_asientoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_ingresoSecuencialBusqueda")) {
				this.jButtonnumero_ingresoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_egresoSecuencialBusqueda")) {
				this.jButtonnumero_egresoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diarioSecuencialBusqueda")) {
				this.jButtonnumero_diarioSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencion_ivaSecuencialBusqueda")) {
				this.jButtonnumero_retencion_ivaSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencion_fuenteSecuencialBusqueda")) {
				this.jButtonnumero_retencion_fuenteSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_asiento_formatoSecuencialBusqueda")) {
				this.jButtonnumero_asiento_formatoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_ingreso_formatoSecuencialBusqueda")) {
				this.jButtonnumero_ingreso_formatoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_egreso_formatoSecuencialBusqueda")) {
				this.jButtonnumero_egreso_formatoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diario_formatoSecuencialBusqueda")) {
				this.jButtonnumero_diario_formatoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencion_fuente_formatoSecuencialBusqueda")) {
				this.jButtonnumero_retencion_fuente_formatoSecuencialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencion_iva_formatoSecuencialBusqueda")) {
				this.jButtonnumero_retencion_iva_formatoSecuencialBusquedaActionPerformed(evt);
			}
			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSecuencial();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSecuencial")) {
				closingInternalFrameSecuencial();
				
			} else if(sTipo.equals("jButtonCancelarSecuencial")) {
				JInternalFrameBase jInternalFrameDetalleFormSecuencial = (JInternalFrameBase)evt.getSource();
	            	
	            SecuencialBeanSwingJInternalFrame jInternalFrameParent=(SecuencialBeanSwingJInternalFrame)jInternalFrameDetalleFormSecuencial.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSecuencialActionPerformed(null);
			}
			
			SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.secuencial,new Object(),this.secuencialParameterGeneral,this.secuencialReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSecuencial(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSecuencial(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSecuencial(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.secuencial)) {
			if(!esControlTabla) {
				if(SecuencialJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);			
				}
				
				if(this.secuencialSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSecuencial(this.secuencial,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.secuencialReturnGeneral=secuencialLogic.procesarEventosSecuencialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.secuencialLogic.getSecuencials(),this.secuencial,this.secuencialParameterGeneral,this.isEsNuevoSecuencial,classes);//this.secuencialLogic.getSecuencial()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSecuencial(this.secuencialReturnGeneral,this.secuencialBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.secuencialSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSecuencial(classes,this.secuencialReturnGeneral,this.secuencialBean,false);
					}
						
					if(this.secuencialReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySecuencial(this.secuencialReturnGeneral.getSecuencial());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSecuencial(this.secuencialReturnGeneral.getSecuencial());	
					}
						
					if(this.secuencialReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSecuencial(this.secuencialReturnGeneral.getSecuencial(),classes);//this.secuencialBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSecuencial(this.secuencial,classes);//this.secuencialBean);									
				}
			
				if(SecuencialJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSecuencial(this.secuencial,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSecuencial(this.secuencial);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.secuencialAnterior!=null) {
						this.secuencial=this.secuencialAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.secuencialReturnGeneral=secuencialLogic.procesarEventosSecuencialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.secuencialLogic.getSecuencials(),this.secuencial,this.secuencialParameterGeneral,this.isEsNuevoSecuencial,classes);//this.secuencialLogic.getSecuencial()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.secuencialSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.secuencialSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.secuencialReturnGeneral.getSecuencial(),secuencialLogic.getSecuencials());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.secuencialReturnGeneral.getSecuencial(),this.secuencials);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSecuencial.repaint();
				
				//((AbstractTableModel) this.jTableDatosSecuencial.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSecuencial();
			}
		}
	}
	
	public void actualizarVisualTableDatosSecuencial() throws Exception {
		
		SecuencialModel secuencialModel=(SecuencialModel)this.jTableDatosSecuencial.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			secuencialModel.secuencials=this.secuencialLogic.getSecuencials();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			secuencialModel.secuencials=this.secuencials;
		}
		
		
		((SecuencialModel) this.jTableDatosSecuencial.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSecuencial() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsecuencialAnterior(),this.secuencialLogic.getSecuencials());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsecuencialAnterior(),this.secuencials);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSecuencial();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSecuencial(Secuencial secuencial,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
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
										
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.secuencial,new Object(),generalEntityParameterGeneral,this.secuencialReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.secuencialSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SecuencialConstantesFunciones.getClassesRelationshipsOfSecuencial(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SecuencialConstantesFunciones.getClassesRelationshipsFromStringsOfSecuencial(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSecuencial(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SecuencialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.secuencial,new Object(),generalEntityParameterGeneral,this.secuencialReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSecuencial(SecuencialBean secuencialBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSecuencial(ArrayList<Classe> classes,SecuencialReturnGeneral secuencialReturnGeneral,SecuencialBean secuencialBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSecuencial(Secuencial secuencial,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.secuencial)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSecuencial = new SecuencialDetalleFormJInternalFrame(jDesktopPane,this.secuencialSessionBean.getConGuardarRelaciones(),this.secuencialSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSecuencial);
		this.jInternalFrameDetalleFormSecuencial.setVisible(false);
		this.jInternalFrameDetalleFormSecuencial.setSelected(false);						
		
		this.jInternalFrameDetalleFormSecuencial.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSecuencial.secuencialLogic=this.secuencialLogic;
		
		this.cargarCombosFrameForeignKeySecuencial("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSecuencial();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSecuencial();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySecuencial("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySecuencial();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSecuencial.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSecuencial"));
		
		this.jInternalFrameDetalleFormSecuencial.jButtonModificarSecuencial.addActionListener(new ButtonActionListener(this,"ModificarSecuencial"));

		
		this.jInternalFrameDetalleFormSecuencial.jButtonModificarToolBarSecuencial.addActionListener(new ButtonActionListener(this,"ModificarToolBarSecuencial"));
					
		this.jInternalFrameDetalleFormSecuencial.jMenuItemModificarSecuencial.addActionListener(new ButtonActionListener(this,"MenuItemModificarSecuencial"));		
		
		
		
		this.jInternalFrameDetalleFormSecuencial.jButtonActualizarSecuencial.addActionListener (new ButtonActionListener(this,"ActualizarSecuencial"));
		
		
		this.jInternalFrameDetalleFormSecuencial.jButtonActualizarToolBarSecuencial.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSecuencial"));
						
		this.jInternalFrameDetalleFormSecuencial.jMenuItemActualizarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSecuencial"));		
		
		
		
		this.jInternalFrameDetalleFormSecuencial.jButtonEliminarSecuencial.addActionListener (new ButtonActionListener(this,"EliminarSecuencial"));
		
		
		this.jInternalFrameDetalleFormSecuencial.jButtonEliminarToolBarSecuencial.addActionListener (new ButtonActionListener(this,"EliminarToolBarSecuencial"));
								
		this.jInternalFrameDetalleFormSecuencial.jMenuItemEliminarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSecuencial"));		
		
		
		
		this.jInternalFrameDetalleFormSecuencial.jButtonCancelarSecuencial.addActionListener (new ButtonActionListener(this,"CancelarSecuencial"));
		
		
		this.jInternalFrameDetalleFormSecuencial.jButtonCancelarToolBarSecuencial.addActionListener (new ButtonActionListener(this,"CancelarToolBarSecuencial"));
					
		this.jInternalFrameDetalleFormSecuencial.jMenuItemCancelarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSecuencial"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSecuencial.jMenuItemDetalleCerrarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSecuencial"));		
		
		
		
		this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosToolBarSecuencial.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSecuencial"));
		
		
		
		this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosToolBarSecuencial.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSecuencial"));
		
		
		
		this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSecuencial"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonidSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"idSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_empresaSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_empresaSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_sucursalSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_sucursalSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_ejercicioSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_ejercicioSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_periodoSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_periodoSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_periodoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_anioSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_anioSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_anioSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_anioSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_mesSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_mesSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_mesSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_mesSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_moduloSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_moduloSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_moduloSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimiento_moduloSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimiento_moduloSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_documentoSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_documentoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimientoSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimientoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_asientoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_asientoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_ingresoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingresoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_egresoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_egresoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_diarioSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_diarioSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_ivaSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_ivaSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_fuenteSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_fuenteSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_asiento_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_asiento_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_ingreso_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingreso_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_egreso_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_egreso_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_diario_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_diario_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_fuente_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_iva_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_iva_formatoSecuencialBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSecuencial.jTabbedPaneRelacionesSecuencial.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSecuencial"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSecuencial"));
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSecuencial"));
		}
		
		this.jTableDatosSecuencial.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSecuencial"));
		
		this.jTableDatosSecuencial.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSecuencial"));
		
		this.jButtonNuevoSecuencial.addActionListener(new ButtonActionListener(this,"NuevoSecuencial"));
		
		this.jButtonDuplicarSecuencial.addActionListener(new ButtonActionListener(this,"DuplicarSecuencial"));
		
		this.jButtonCopiarSecuencial.addActionListener(new ButtonActionListener(this,"CopiarSecuencial"));
		
		this.jButtonVerFormSecuencial.addActionListener(new ButtonActionListener(this,"VerFormSecuencial"));
		
		
		this.jButtonNuevoToolBarSecuencial.addActionListener(new ButtonActionListener(this,"NuevoToolBarSecuencial"));
			
		this.jButtonDuplicarToolBarSecuencial.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSecuencial"));
			
		this.jMenuItemNuevoSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSecuencial"));
			
		this.jMenuItemDuplicarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSecuencial"));		
		
		
		this.jButtonNuevoRelacionesSecuencial.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSecuencial"));
		
		
		this.jButtonNuevoRelacionesToolBarSecuencial.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSecuencial"));
			
		this.jMenuItemNuevoRelacionesSecuencial.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSecuencial"));		
		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jButtonModificarSecuencial.addActionListener(new ButtonActionListener(this,"ModificarSecuencial"));
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jButtonModificarToolBarSecuencial.addActionListener(new ButtonActionListener(this,"ModificarToolBarSecuencial"));
			
			this.jInternalFrameDetalleFormSecuencial.jMenuItemModificarSecuencial.addActionListener(new ButtonActionListener(this,"MenuItemModificarSecuencial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSecuencial.jButtonActualizarSecuencial.addActionListener (new ButtonActionListener(this,"ActualizarSecuencial"));
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jButtonActualizarToolBarSecuencial.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSecuencial"));
				
			this.jInternalFrameDetalleFormSecuencial.jMenuItemActualizarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSecuencial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jButtonEliminarSecuencial.addActionListener (new ButtonActionListener(this,"EliminarSecuencial"));
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jButtonEliminarToolBarSecuencial.addActionListener (new ButtonActionListener(this,"EliminarToolBarSecuencial"));
						
			this.jInternalFrameDetalleFormSecuencial.jMenuItemEliminarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSecuencial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jButtonCancelarSecuencial.addActionListener (new ButtonActionListener(this,"CancelarSecuencial"));
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jButtonCancelarToolBarSecuencial.addActionListener (new ButtonActionListener(this,"CancelarToolBarSecuencial"));
			
			this.jInternalFrameDetalleFormSecuencial.jMenuItemCancelarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSecuencial"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSecuencial.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSecuencial"));		
		
		
		this.jButtonCerrarSecuencial.addActionListener (new ButtonActionListener(this,"CerrarSecuencial"));
		
		
		this.jButtonCerrarToolBarSecuencial.addActionListener (new ButtonActionListener(this,"CerrarToolBarSecuencial"));
			
		this.jMenuItemCerrarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSecuencial"));
			
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jMenuItemDetalleCerrarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSecuencial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosSecuencial.addActionListener (new ButtonActionListener(this,"GuardarCambiosSecuencial"));
		}
		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosToolBarSecuencial.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSecuencial"));
		}
		
		this.jButtonCopiarToolBarSecuencial.addActionListener (new ButtonActionListener(this,"CopiarToolBarSecuencial"));
			
		this.jButtonVerFormToolBarSecuencial.addActionListener (new ButtonActionListener(this,"VerFormToolBarSecuencial"));
		
		this.jMenuItemGuardarCambiosSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSecuencial"));
			
		this.jMenuItemCopiarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSecuencial"));		
		
		this.jMenuItemVerFormSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSecuencial"));		
		
		
		this.jButtonGuardarCambiosTablaSecuencial.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSecuencial"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSecuencial.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSecuencial"));
			
		this.jMenuItemGuardarCambiosTablaSecuencial.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSecuencial"));		
		
		
		
		this.jButtonRecargarInformacionSecuencial.addActionListener (new ButtonActionListener(this,"RecargarInformacionSecuencial"));
					
		this.jButtonRecargarInformacionToolBarSecuencial.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSecuencial"));
		
		this.jMenuItemRecargarInformacionSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSecuencial"));		
		
		
		
		this.jButtonAnterioresSecuencial.addActionListener (new ButtonActionListener(this,"AnterioresSecuencial"));
		
		
		this.jButtonAnterioresToolBarSecuencial.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSecuencial"));
		
		this.jMenuItemAnterioresSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSecuencial"));		
		
		
		this.jButtonSiguientesSecuencial.addActionListener (new ButtonActionListener(this,"SiguientesSecuencial"));
		
		
		this.jButtonSiguientesToolBarSecuencial.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSecuencial"));
			
		this.jMenuItemSiguientesSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSecuencial"));
			
		this.jMenuItemAbrirOrderBySecuencial.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySecuencial"));
			
		this.jMenuItemMostrarOcultarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSecuencial"));
			
		this.jMenuItemDetalleAbrirOrderBySecuencial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySecuencial"));
			
		this.jMenuItemDetalleMostarOcultarSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSecuencial"));		
		
		
		this.jButtonNuevoGuardarCambiosSecuencial.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSecuencial"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSecuencial.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSecuencial"));
			
		this.jMenuItemNuevoGuardarCambiosSecuencial.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSecuencial"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSecuencial.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSecuencial"));

		this.jCheckBoxSeleccionadosSecuencial.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSecuencial"));
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSecuencial"));
		}
		
		
		this.jComboBoxTiposRelacionesSecuencial.addActionListener (new ButtonActionListener(this,"TiposRelacionesSecuencial"));
			
		this.jComboBoxTiposAccionesSecuencial.addActionListener (new ButtonActionListener(this,"TiposAccionesSecuencial"));
					
		this.jComboBoxTiposSeleccionarSecuencial.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSecuencial"));
			
		this.jTextFieldValorCampoGeneralSecuencial.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSecuencial"));		
		
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonidSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"idSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_empresaSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_empresaSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_sucursalSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_sucursalSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_ejercicioSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_ejercicioSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_periodoSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_periodoSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_periodoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_anioSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_anioSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_anioSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_anioSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_mesSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_mesSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_mesSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_mesSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_moduloSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_moduloSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_moduloSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimiento_moduloSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimiento_moduloSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_documentoSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_documentoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimientoSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimientoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_asientoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_asientoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_ingresoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingresoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_egresoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_egresoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_diarioSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_diarioSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_ivaSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_ivaSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_fuenteSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_fuenteSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_asiento_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_asiento_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_ingreso_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingreso_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_egreso_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_egreso_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_diario_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_diario_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_fuente_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_iva_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_iva_formatoSecuencialBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addActionListener(new ButtonActionListener(this,"BusquedaPorEjercicioPorModuloPorMovimientoSecuencial"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSecuencial!=null) {
				this.jInternalFrameReporteDinamicoSecuencial.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSecuencial"));
				this.jInternalFrameReporteDinamicoSecuencial.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSecuencial"));
				this.jInternalFrameReporteDinamicoSecuencial.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSecuencial"));
			}
			
			//this.jButtonCerrarReporteDinamicoSecuencial.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSecuencial"));				
			//this.jButtonGenerarReporteDinamicoSecuencial.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSecuencial"));
			//this.jButtonGenerarExcelReporteDinamicoSecuencial.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSecuencial"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSecuencial!=null) {
				this.jInternalFrameImportacionSecuencial.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSecuencial"));
				this.jInternalFrameImportacionSecuencial.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSecuencial"));
				this.jInternalFrameImportacionSecuencial.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSecuencial"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySecuencial.addActionListener (new ButtonActionListener(this,"AbrirOrderBySecuencial"));
			
			this.jButtonAbrirOrderByToolBarSecuencial.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSecuencial"));			
			
			if(this.jInternalFrameOrderBySecuencial!=null) {
				this.jInternalFrameOrderBySecuencial.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySecuencial"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSecuencial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSecuencial.jTabbedPaneRelacionesSecuencial.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSecuencial"));
		
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
            		closingInternalFrameSecuencial();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSecuencial.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSecuencial = (JInternalFrameBase)event.getSource();
	            	
	            SecuencialBeanSwingJInternalFrame jInternalFrameParent=(SecuencialBeanSwingJInternalFrame)jInternalFrameDetalleFormSecuencial.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSecuencialActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSecuencial.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSecuencialListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSecuencial.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSecuencial.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSecuencial";
		inputMap = this.jButtonNuevoSecuencial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSecuencial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSecuencialActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSecuencialActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSecuencial";
		inputMap = this.jButtonNuevoRelacionesSecuencial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSecuencial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSecuencialActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSecuencial";
		inputMap = this.jButtonModificarSecuencial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSecuencial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSecuencialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSecuencial";
		inputMap = this.jButtonActualizarSecuencial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSecuencial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSecuencialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSecuencial";
		inputMap = this.jButtonEliminarSecuencial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSecuencial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSecuencialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSecuencial";
		inputMap = this.jButtonCancelarSecuencial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSecuencial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSecuencialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSecuencial";
		inputMap = this.jButtonCerrarSecuencial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSecuencial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSecuencialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSecuencial";
		inputMap = this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosSecuencial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSecuencial.jButtonGuardarCambiosSecuencial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSecuencialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSecuencial.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSecuencialItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSecuencial.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSecuencialActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSecuencial.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSecuencialActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSecuencial.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSecuencialActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonidSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"idSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_empresaSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_empresaSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_sucursalSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_sucursalSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_ejercicioSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_ejercicioSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_periodoSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_periodoSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_periodoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_anioSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_anioSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_anioSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_anioSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_mesSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_mesSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_mesSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_mesSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_moduloSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_moduloSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_moduloSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimiento_moduloSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimiento_moduloSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimiento_moduloSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_documentoSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_documentoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoSecuencialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimientoSecuencialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoSecuencialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonid_tipo_movimientoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_asientoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_asientoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_ingresoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingresoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_egresoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_egresoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_diarioSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_diarioSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_ivaSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_ivaSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_fuenteSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_fuenteSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_asiento_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_asiento_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_ingreso_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_ingreso_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_egreso_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_egreso_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_diario_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_diario_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_fuente_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_fuente_formatoSecuencialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSecuencial.jButtonnumero_retencion_iva_formatoSecuencialBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencion_iva_formatoSecuencialBusqueda"));
		
		
		this.jButtonBusquedaPorEjercicioPorModuloPorMovimientoSecuencial.addActionListener(new ButtonActionListener(this,"BusquedaPorEjercicioPorModuloPorMovimientoSecuencial"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSecuencial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSecuencialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSecuencialActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSecuencial.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSecuencial(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Secuencial secuencialAux:this.secuencialLogic.getSecuencials()) {
					secuencialAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Secuencial secuencialAux:secuencials) {
					secuencialAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSecuencialItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSecuencial(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Secuencial secuencialAux:this.secuencialLogic.getSecuencials()) {
						secuencialAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Secuencial secuencialAux:secuencials) {
						secuencialAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Secuencial secuencialAux:this.secuencialLogic.getSecuencials()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Secuencial secuencialAux:secuencials) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSecuencial(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSecuencial.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSecuencial.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSecuencialItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSecuencial(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSecuencial.getSelectedRows();
			
			Secuencial secuencialLocal=new Secuencial();
			
			//this.seleccionarTodosSecuencial(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					secuencialLocal =(Secuencial) this.secuencialLogic.getSecuencials().toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					secuencialLocal =(Secuencial) this.secuencials.toArray()[this.jTableDatosSecuencial.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				secuencialLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Secuencial secuencialAux:this.secuencialLogic.getSecuencials()) {
						secuencialAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Secuencial secuencialAux:secuencials) {
						secuencialAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSecuencial(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSecuencial.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSecuencial.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSecuencial,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSecuencialItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSecuencialParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSecuencialActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSecuencial(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSecuencial.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Secuencial secuencialAux:this.secuencialLogic.getSecuencials()) {
				
						if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROASIENTO)) {
							existe=true;
							secuencialAux.setnumero_asiento(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROINGRESO)) {
							existe=true;
							secuencialAux.setnumero_ingreso(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROEGRESO)) {
							existe=true;
							secuencialAux.setnumero_egreso(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERODIARIO)) {
							existe=true;
							secuencialAux.setnumero_diario(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA)) {
							existe=true;
							secuencialAux.setnumero_retencion_iva(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE)) {
							existe=true;
							secuencialAux.setnumero_retencion_fuente(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO)) {
							existe=true;
							secuencialAux.setnumero_asiento_formato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO)) {
							existe=true;
							secuencialAux.setnumero_ingreso_formato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO)) {
							existe=true;
							secuencialAux.setnumero_egreso_formato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO)) {
							existe=true;
							secuencialAux.setnumero_diario_formato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO)) {
							existe=true;
							secuencialAux.setnumero_retencion_fuente_formato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO)) {
							existe=true;
							secuencialAux.setnumero_retencion_iva_formato(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Secuencial secuencialAux:secuencials) {
					
						if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROASIENTO)) {
							existe=true;
							secuencialAux.setnumero_asiento(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROINGRESO)) {
							existe=true;
							secuencialAux.setnumero_ingreso(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROEGRESO)) {
							existe=true;
							secuencialAux.setnumero_egreso(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERODIARIO)) {
							existe=true;
							secuencialAux.setnumero_diario(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA)) {
							existe=true;
							secuencialAux.setnumero_retencion_iva(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE)) {
							existe=true;
							secuencialAux.setnumero_retencion_fuente(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO)) {
							existe=true;
							secuencialAux.setnumero_asiento_formato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO)) {
							existe=true;
							secuencialAux.setnumero_ingreso_formato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO)) {
							existe=true;
							secuencialAux.setnumero_egreso_formato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO)) {
							existe=true;
							secuencialAux.setnumero_diario_formato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO)) {
							existe=true;
							secuencialAux.setnumero_retencion_fuente_formato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO)) {
							existe=true;
							secuencialAux.setnumero_retencion_iva_formato(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSecuencial(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSecuencialActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSecuencial(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSecuencial=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSecuencial.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSecuencial) {				
					conSplash=true;//false;										
					
					//this.startProcessSecuencial(conSplash);
				
					this.generarReporteSecuencialsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSecuencial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSecuencialsSeleccionados();
				//this.jComboBoxTiposAccionesSecuencial.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSecuencialsSeleccionados(false);
				//this.jComboBoxTiposAccionesSecuencial.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSecuencialsSeleccionados(true);
				//this.jComboBoxTiposAccionesSecuencial.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSecuencial();
				
				this.exportarSecuencialsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSecuencial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSecuencials();
				//this.importarSecuencials();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSecuencial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSecuencial();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSecuencialsSeleccionados();
				//this.jComboBoxTiposAccionesSecuencial.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Secuencial", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSecuencial();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSecuencial)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySecuencial(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Secuencial",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSecuencial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.setSelectedIndex(0);					
				}	
			} 			
			else if(SecuencialBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSecuencial) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSecuencial(conSplash);
					
						//this.actualizarParametrosGeneralSecuencial();
						
						this.generarReporteProcesoAccionSecuencialsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSecuencial.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SecuencialBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO SecuencialES SELECCIONADOS?", "MANTENIMIENTO DE Secuencial", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSecuencial();
				
						this.actualizarParametrosGeneralSecuencial();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.secuencialReturnGeneral=secuencialLogic.procesarAccionSecuencialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.secuencialLogic.getSecuencials(),this.secuencialParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSecuencialReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSecuencial.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSecuencial();
					
					SecuencialBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSecuencialReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSecuencial.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSecuencial.jComboBoxTiposAccionesFormularioSecuencial.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSecuencial(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSecuencialActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSecuencial();
			
			if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();		
			Secuencial secuencial=new Secuencial();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSecuencial(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSecuencial.getSelectedItem();
			
			
			
			
			secuencialsSeleccionados=this.getSecuencialsSeleccionados(true);
			//this.sTipoAccion;
			
			if(secuencialsSeleccionados.size()==1) {
				for(Secuencial secuencialAux:secuencialsSeleccionados) {
					secuencial=secuencialAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSecuencial();
			
      		//this.finishProcessSecuencial(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSecuencialReturnGeneral() throws Exception {
		if(this.secuencialReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.secuencialReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.secuencialReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.secuencialReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.secuencialReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.secuencialReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSecuencial(false);
		}
		
		if(this.secuencialReturnGeneral.getConRetornoLista() || this.secuencialReturnGeneral.getConRetornoObjeto()) {
			if(this.secuencialReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.secuencialLogic.setSecuencials(this.secuencialReturnGeneral.getSecuencials());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.secuencialReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.secuencialLogic.setSecuencial(this.secuencialReturnGeneral.getSecuencial());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSecuencial(false);
		}
	}
	
	public void actualizarParametrosGeneralSecuencial() throws Exception {
		
		
	}
	
	public ArrayList<Secuencial> getSecuencialsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSecuencial) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Secuencial secuencialAux:secuencialLogic.getSecuencials()) {
					if(secuencialAux.getIsSelected()) {
						secuencialsSeleccionados.add(secuencialAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Secuencial secuencialAux:this.secuencials) {
					if(secuencialAux.getIsSelected()) {
						secuencialsSeleccionados.add(secuencialAux);				
					}
				}
			}
			
			if(secuencialsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						secuencialsSeleccionados.addAll(this.secuencialLogic.getSecuencials());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						secuencialsSeleccionados.addAll(this.secuencials);				
					}
				}
			}
		} else {
			secuencialsSeleccionados.add(this.secuencial);
		}
		
		return secuencialsSeleccionados;
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
	
	public void generarReporteSecuencialsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSecuencialsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSecuencialsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSecuencialsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSecuencialsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Secuencial",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSecuencialsSeleccionados() throws Exception {
		ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();		
		
		secuencialsSeleccionados=this.getSecuencialsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSecuencials("Todos",secuencialsSeleccionados);
		
	}	
	
	public void generarReporteNormalSecuencialsSeleccionados() throws Exception {
		ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();		
		
		secuencialsSeleccionados=this.getSecuencialsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSecuencials("Todos",secuencialsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSecuencialsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();
		
		secuencialsSeleccionados=this.getSecuencialsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSecuencials("Todos",secuencialsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSecuencialsSeleccionados() throws Exception {
		ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSecuencial();
		
		
		secuencialsSeleccionados=this.getSecuencialsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSecuencial();
		
		
		//this.generarReporteSecuencials("Todos",secuencialsSeleccionados ,secuencialImplementable,secuencialImplementableHome);
	}
	
	public void mostrarImportacionSecuencials() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSecuencial();
		
		this.abrirFrameImportacionSecuencial();		
		
			
		//this.generarReporteSecuencials("Todos",secuencialsSeleccionados ,secuencialImplementable,secuencialImplementableHome);
	}
	
	public void importarSecuencials() throws Exception {		
	
	}
	
	public void exportarSecuencialsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSecuencialsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSecuencialsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSecuencialsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Secuencial",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSecuencialsSeleccionados() throws Exception {
		ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();		
		
		secuencialsSeleccionados=this.getSecuencialsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencial."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSecuencial(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Secuencial secuencialAux:secuencialsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSecuencial(secuencialAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//secuencialAux.setsDetalleGeneralEntityReporte(secuencialAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSecuencial(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMEROASIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMEROINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMEROEGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMERODIARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSecuencial(Secuencial secuencial,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=secuencial.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.gettipomovimientomodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.gettipodocumento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_asiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_ingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_egreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_diario().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_retencion_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_retencion_fuente().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_asiento_formato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_ingreso_formato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_egreso_formato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_diario_formato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_retencion_fuente_formato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=secuencial.getnumero_retencion_iva_formato();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSecuencialsSeleccionados() throws Exception {
		ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();		
		
		secuencialsSeleccionados=this.getSecuencialsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencial.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Secuencials");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSecuencial(row);				
				iRow++;
			}				
			
			for(Secuencial secuencialAux:secuencialsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSecuencial(secuencialAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSecuencialsSeleccionados() throws Exception {
		ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();		
		
		secuencialsSeleccionados=this.getSecuencialsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"secuencial.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("secuencials");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("secuencial");
			//elementRoot.appendChild(element);
		
			for(Secuencial secuencialAux:secuencialsSeleccionados) {
				element = document.createElement("secuencial");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSecuencial(secuencialAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.secuencialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Secuencial",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSecuencial(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROASIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROEGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERODIARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSecuencial(Secuencial secuencial,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.gettipomovimientomodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.gettipodocumento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_asiento());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_ingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_egreso());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_diario());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_retencion_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_retencion_fuente());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_asiento_formato());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_ingreso_formato());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_egreso_formato());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_diario_formato());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_retencion_fuente_formato());
		cell = row.createCell(iColumn++);cell.setCellValue(secuencial.getnumero_retencion_iva_formato());				
	}
	
	public void setFilaDatosExportarXmlSecuencial(Secuencial secuencial,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SecuencialConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(secuencial.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SecuencialConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(secuencial.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SecuencialConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(secuencial.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(SecuencialConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(secuencial.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(SecuencialConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(secuencial.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(SecuencialConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(secuencial.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementanio_descripcion = document.createElement(SecuencialConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(secuencial.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(SecuencialConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(secuencial.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementmodulo_descripcion = document.createElement(SecuencialConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(secuencial.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtipomovimientomodulo_descripcion = document.createElement(SecuencialConstantesFunciones.IDTIPOMOVIMIENTOMODULO);
		elementtipomovimientomodulo_descripcion.appendChild(document.createTextNode(secuencial.gettipomovimientomodulo_descripcion()));
		element.appendChild(elementtipomovimientomodulo_descripcion);

		Element elementtipodocumento_descripcion = document.createElement(SecuencialConstantesFunciones.IDTIPODOCUMENTO);
		elementtipodocumento_descripcion.appendChild(document.createTextNode(secuencial.gettipodocumento_descripcion()));
		element.appendChild(elementtipodocumento_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(SecuencialConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(secuencial.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementnumero_asiento = document.createElement(SecuencialConstantesFunciones.NUMEROASIENTO);
		elementnumero_asiento.appendChild(document.createTextNode(secuencial.getnumero_asiento().toString().trim()));
		element.appendChild(elementnumero_asiento);

		Element elementnumero_ingreso = document.createElement(SecuencialConstantesFunciones.NUMEROINGRESO);
		elementnumero_ingreso.appendChild(document.createTextNode(secuencial.getnumero_ingreso().toString().trim()));
		element.appendChild(elementnumero_ingreso);

		Element elementnumero_egreso = document.createElement(SecuencialConstantesFunciones.NUMEROEGRESO);
		elementnumero_egreso.appendChild(document.createTextNode(secuencial.getnumero_egreso().toString().trim()));
		element.appendChild(elementnumero_egreso);

		Element elementnumero_diario = document.createElement(SecuencialConstantesFunciones.NUMERODIARIO);
		elementnumero_diario.appendChild(document.createTextNode(secuencial.getnumero_diario().toString().trim()));
		element.appendChild(elementnumero_diario);

		Element elementnumero_retencion_iva = document.createElement(SecuencialConstantesFunciones.NUMERORETENCIONIVA);
		elementnumero_retencion_iva.appendChild(document.createTextNode(secuencial.getnumero_retencion_iva().toString().trim()));
		element.appendChild(elementnumero_retencion_iva);

		Element elementnumero_retencion_fuente = document.createElement(SecuencialConstantesFunciones.NUMERORETENCIONFUENTE);
		elementnumero_retencion_fuente.appendChild(document.createTextNode(secuencial.getnumero_retencion_fuente().toString().trim()));
		element.appendChild(elementnumero_retencion_fuente);

		Element elementnumero_asiento_formato = document.createElement(SecuencialConstantesFunciones.NUMEROASIENTOFORMATO);
		elementnumero_asiento_formato.appendChild(document.createTextNode(secuencial.getnumero_asiento_formato().trim()));
		element.appendChild(elementnumero_asiento_formato);

		Element elementnumero_ingreso_formato = document.createElement(SecuencialConstantesFunciones.NUMEROINGRESOFORMATO);
		elementnumero_ingreso_formato.appendChild(document.createTextNode(secuencial.getnumero_ingreso_formato().trim()));
		element.appendChild(elementnumero_ingreso_formato);

		Element elementnumero_egreso_formato = document.createElement(SecuencialConstantesFunciones.NUMEROEGRESOFORMATO);
		elementnumero_egreso_formato.appendChild(document.createTextNode(secuencial.getnumero_egreso_formato().trim()));
		element.appendChild(elementnumero_egreso_formato);

		Element elementnumero_diario_formato = document.createElement(SecuencialConstantesFunciones.NUMERODIARIOFORMATO);
		elementnumero_diario_formato.appendChild(document.createTextNode(secuencial.getnumero_diario_formato().trim()));
		element.appendChild(elementnumero_diario_formato);

		Element elementnumero_retencion_fuente_formato = document.createElement(SecuencialConstantesFunciones.NUMERORETENCIONFUENTEFORMATO);
		elementnumero_retencion_fuente_formato.appendChild(document.createTextNode(secuencial.getnumero_retencion_fuente_formato().trim()));
		element.appendChild(elementnumero_retencion_fuente_formato);

		Element elementnumero_retencion_iva_formato = document.createElement(SecuencialConstantesFunciones.NUMERORETENCIONIVAFORMATO);
		elementnumero_retencion_iva_formato.appendChild(document.createTextNode(secuencial.getnumero_retencion_iva_formato().trim()));
		element.appendChild(elementnumero_retencion_iva_formato);
	}
	
	public void generarReporteGroupGenericoSecuencialsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Secuencial> secuencialsSeleccionados=new ArrayList<Secuencial>();
		
		secuencialsSeleccionados=this.getSecuencialsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSecuencial(secuencialsSeleccionados);
		
		this.generarReporteSecuencials("Todos",secuencialsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSecuencial(ArrayList<Secuencial> secuencialsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Secuencial secuencialAux:secuencialsSeleccionados) {
				secuencialAux.setsDetalleGeneralEntityReporte(secuencialAux.toString());
			
				if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.gettipomovimientomodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_IDTIPODOCUMENTO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.gettipodocumento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROASIENTO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_asiento().toString());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROINGRESO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_ingreso().toString());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROEGRESO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_egreso().toString());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERODIARIO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_diario().toString());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVA)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_retencion_iva().toString());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTE)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_retencion_fuente().toString());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROASIENTOFORMATO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_asiento_formato());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROINGRESOFORMATO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_ingreso_formato());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMEROEGRESOFORMATO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_egreso_formato());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERODIARIOFORMATO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_diario_formato());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONFUENTEFORMATO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_retencion_fuente_formato());
				}
				 else if(sTipoSeleccionar.equals(SecuencialConstantesFunciones.LABEL_NUMERORETENCIONIVAFORMATO)) {
					existe=true;
					secuencialAux.setsDescripcionGeneralEntityReporte1(secuencialAux.getnumero_retencion_iva_formato());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SecuencialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSecuencial(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSecuencial=true;
				this.isVisibilidadCeldaNuevoRelacionesSecuencial=true;
				this.isVisibilidadCeldaGuardarCambiosSecuencial=true;
			}
			
			this.isVisibilidadCeldaModificarSecuencial=false;
			this.isVisibilidadCeldaActualizarSecuencial=false;
			this.isVisibilidadCeldaEliminarSecuencial=false;
			this.isVisibilidadCeldaCancelarSecuencial=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencial=true;
				} else {
					this.isVisibilidadCeldaGuardarSecuencial=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSecuencial=false;
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencial=false;
			this.isVisibilidadCeldaModificarSecuencial=false;
			this.isVisibilidadCeldaActualizarSecuencial=true;
			this.isVisibilidadCeldaEliminarSecuencial=false;
			this.isVisibilidadCeldaCancelarSecuencial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencial=true;
				} else {
					this.isVisibilidadCeldaGuardarSecuencial=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSecuencial=false;
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencial=false;
			this.isVisibilidadCeldaModificarSecuencial=false;
			this.isVisibilidadCeldaActualizarSecuencial=true;
			this.isVisibilidadCeldaEliminarSecuencial=true;
			this.isVisibilidadCeldaCancelarSecuencial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencial=true;
				} else {
					this.isVisibilidadCeldaGuardarSecuencial=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSecuencial=false;
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencial=false;
			this.isVisibilidadCeldaModificarSecuencial=false;
			this.isVisibilidadCeldaActualizarSecuencial=true;
			this.isVisibilidadCeldaEliminarSecuencial=false;
			this.isVisibilidadCeldaCancelarSecuencial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencial=false;
				} else {
					this.isVisibilidadCeldaGuardarSecuencial=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSecuencial=true;
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=true;
			this.isVisibilidadCeldaGuardarCambiosSecuencial=true;
			this.isVisibilidadCeldaModificarSecuencial=false;
			this.isVisibilidadCeldaActualizarSecuencial=false;
			this.isVisibilidadCeldaEliminarSecuencial=false;
			this.isVisibilidadCeldaCancelarSecuencial=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencial=true;
				} else {
					this.isVisibilidadCeldaGuardarSecuencial=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSecuencial=false;
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencial=false;
			this.isVisibilidadCeldaActualizarSecuencial=false;
			this.isVisibilidadCeldaEliminarSecuencial=false;
			this.isVisibilidadCeldaCancelarSecuencial=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencial=false;
				} else {
					this.isVisibilidadCeldaGuardarSecuencial=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSecuencial=false;
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencial=false;
			this.isVisibilidadCeldaModificarSecuencial=true;
			this.isVisibilidadCeldaActualizarSecuencial=false;
			this.isVisibilidadCeldaEliminarSecuencial=false;
			this.isVisibilidadCeldaCancelarSecuencial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSecuencial=false;
				} else {
					this.isVisibilidadCeldaGuardarSecuencial=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SecuencialJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSecuencial=true;
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=true;
			this.isVisibilidadCeldaGuardarCambiosSecuencial=true;
		} else {
			this.actualizarEstadoPanelsSecuencial(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSecuencial=false;
			//this.isVisibilidadCeldaVerFormSecuencial=false;
			this.isVisibilidadCeldaDuplicarSecuencial=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!secuencialSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=false;
		} else {
			this.isVisibilidadCeldaNuevoSecuencial=false;
			this.isVisibilidadCeldaGuardarCambiosSecuencial=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(secuencialSessionBean.getEsGuardarRelacionado()) {
			if(!secuencialSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSecuencial=false;												
			}
			
			this.jButtonCerrarSecuencial.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSecuencial=false;
		}
		
		if(!this.permiteMantenimiento(this.secuencial)) {
			this.isVisibilidadCeldaActualizarSecuencial=false;
			this.isVisibilidadCeldaEliminarSecuencial=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSecuencial() {
	}
	
	public void actualizarEstadoPanelsSecuencial(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSecuencial!=null) {
				this.jScrollPanelDatosEdicionSecuencial.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencial!=null) {
				this.jTabbedPaneBusquedasSecuencial.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSecuencial!=null) {
				this.jScrollPanelDatosSecuencial.setVisible(true);
			}
			
			if(this.jPanelPaginacionSecuencial!=null) {
				this.jPanelPaginacionSecuencial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSecuencial!=null) {
				this.jPanelParametrosReportesSecuencial.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSecuencial!=null) {
				this.jScrollPanelDatosEdicionSecuencial.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencial!=null) {
				this.jTabbedPaneBusquedasSecuencial.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSecuencial!=null) {
				this.jScrollPanelDatosSecuencial.setVisible(false);
			}
			
			if(this.jPanelPaginacionSecuencial!=null) {
				this.jPanelPaginacionSecuencial.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSecuencial!=null) {
				this.jPanelParametrosReportesSecuencial.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSecuencial!=null) {
				this.jScrollPanelDatosEdicionSecuencial.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencial!=null) {
				this.jTabbedPaneBusquedasSecuencial.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSecuencial!=null) {
				this.jScrollPanelDatosSecuencial.setVisible(false);
			}
			
			if(this.jPanelPaginacionSecuencial!=null) {
				this.jPanelPaginacionSecuencial.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSecuencial!=null) {
				this.jPanelParametrosReportesSecuencial.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSecuencial!=null) {
				this.jScrollPanelDatosEdicionSecuencial.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencial!=null) {
				this.jTabbedPaneBusquedasSecuencial.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSecuencial!=null) {
				this.jScrollPanelDatosSecuencial.setVisible(false);
			}
			
			if(this.jPanelPaginacionSecuencial!=null) {
				this.jPanelPaginacionSecuencial.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSecuencial!=null) {
				this.jPanelParametrosReportesSecuencial.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSecuencial!=null) {
				this.jScrollPanelDatosEdicionSecuencial.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencial!=null) {
				this.jTabbedPaneBusquedasSecuencial.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSecuencial!=null) {
				this.jScrollPanelDatosSecuencial.setVisible(true);
			}
			
			if(this.jPanelPaginacionSecuencial!=null) {
				this.jPanelPaginacionSecuencial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSecuencial!=null) {
				this.jPanelParametrosReportesSecuencial.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSecuencial!=null) {
				this.jScrollPanelDatosEdicionSecuencial.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencial!=null) {
				this.jTabbedPaneBusquedasSecuencial.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSecuencial!=null) {
				this.jScrollPanelDatosSecuencial.setVisible(true);
			}
			
			if(this.jPanelPaginacionSecuencial!=null) {
				this.jPanelPaginacionSecuencial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSecuencial!=null) {
				this.jPanelParametrosReportesSecuencial.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSecuencial!=null) {
				this.jScrollPanelDatosEdicionSecuencial.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencial!=null) {
				this.jTabbedPaneBusquedasSecuencial.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSecuencial!=null) {
				this.jScrollPanelDatosSecuencial.setVisible(true);
			}
			
			if(this.jPanelPaginacionSecuencial!=null) {
				this.jPanelPaginacionSecuencial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSecuencial!=null) {
				this.jPanelParametrosReportesSecuencial.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.secuencialSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSecuencial!=null) {
					this.jTabbedPaneBusquedasSecuencial.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSecuencial!=null) {
				this.jPanelParametrosReportesSecuencial.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.secuencialSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSecuencial!=null) {
				this.jTabbedPaneBusquedasSecuencial.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSecuencial!=null) {
				this.jPanelParametrosReportesSecuencial.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento) {this.jTabbedPaneBusquedasSecuencial.remove(jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento) {this.jTabbedPaneBusquedasSecuencial.remove(jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=isParaEjercicio;
			if(!this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento) {this.jTabbedPaneBusquedasSecuencial.remove(jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=isParaPeriodoNegation;
			if(!this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento) {this.jTabbedPaneBusquedasSecuencial.remove(jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=isParaAnioNegation;
			if(!this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento) {this.jTabbedPaneBusquedasSecuencial.remove(jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=isParaMesNegation;
			if(!this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento) {this.jTabbedPaneBusquedasSecuencial.remove(jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=isParaModulo;
			if(!this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento) {this.jTabbedPaneBusquedasSecuencial.remove(jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimientoModulo(Boolean isParaTipoMovimientoModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoModuloNegation=!isParaTipoMovimientoModulo;

			this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=isParaTipoMovimientoModulo;
			if(!this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento) {this.jTabbedPaneBusquedasSecuencial.remove(jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDocumento(Boolean isParaTipoDocumento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDocumentoNegation=!isParaTipoDocumento;

			this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=isParaTipoDocumentoNegation;
			if(!this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento) {this.jTabbedPaneBusquedasSecuencial.remove(jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento=isParaTipoMovimientoNegation;
			if(!this.isVisibilidadBusquedaPorEjercicioPorModuloPorMovimiento) {this.jTabbedPaneBusquedasSecuencial.remove(jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SecuencialSessionBean secuencialSessionBean=new SecuencialSessionBean();
		
		if(this.secuencialSessionBean==null) {
			this.secuencialSessionBean=new SecuencialSessionBean();
		}
		
		this.secuencialSessionBean.setsUltimaBusquedaSecuencial(this.getsAccionBusqueda());
		this.secuencialSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.secuencialSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorEjercicioPorModuloPorMovimiento")) {
			secuencialSessionBean.setid_modulo(this.getid_moduloBusquedaPorEjercicioPorModuloPorMovimiento());	
			secuencialSessionBean.setid_ejercicio(this.getid_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento());	
			secuencialSessionBean.setid_tipo_movimiento_modulo(this.getid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			secuencialSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			secuencialSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SecuencialSessionBean secuencialSessionBean=new SecuencialSessionBean();
		
		if(this.secuencialSessionBean==null) {
			this.secuencialSessionBean=new SecuencialSessionBean();
		}
		
		if(this.secuencialSessionBean.getsUltimaBusquedaSecuencial()!=null&&!this.secuencialSessionBean.getsUltimaBusquedaSecuencial().equals("")) {
			this.setsAccionBusqueda(secuencialSessionBean.getsUltimaBusquedaSecuencial());
			this.setiNumeroPaginacion(secuencialSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(secuencialSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorEjercicioPorModuloPorMovimiento")) {
				this.setid_moduloBusquedaPorEjercicioPorModuloPorMovimiento(secuencialSessionBean.getid_modulo());
				secuencialSessionBean.setid_modulo(-1L);
				this.setid_ejercicioBusquedaPorEjercicioPorModuloPorMovimiento(secuencialSessionBean.getid_ejercicio());
				secuencialSessionBean.setid_ejercicio(-1L);
				this.setid_tipo_movimiento_moduloBusquedaPorEjercicioPorModuloPorMovimiento(secuencialSessionBean.getid_tipo_movimiento_modulo());
				secuencialSessionBean.setid_tipo_movimiento_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(secuencialSessionBean.getid_empresa());
				secuencialSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(secuencialSessionBean.getid_sucursal());
				secuencialSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.secuencialSessionBean.setsUltimaBusquedaSecuencial("");
		this.secuencialSessionBean.setiNumeroPaginacion(SecuencialConstantesFunciones.INUMEROPAGINACION);
		this.secuencialSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSecuencial(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSecuencial() {
		this.updateBorderResaltarBusquedasFormularioSecuencial();
		this.updateVisibilidadBusquedasFormularioSecuencial();
		this.updateHabilitarBusquedasFormularioSecuencial();
	}
	
	public void updateBorderResaltarBusquedasFormularioSecuencial() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSecuencial.getComponents().length>0) {
	

		if(this.secuencialConstantesFunciones.resaltarBusquedaPorEjercicioPorModuloPorMovimientoSecuencial!=null) {
			index= this.jTabbedPaneBusquedasSecuencial.indexOfComponent(this.jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencial.getComponent(index);
				jPanel.setBorder(this.secuencialConstantesFunciones.resaltarBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSecuencial() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSecuencial.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSecuencial.indexOfComponent(this.jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencial.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.secuencialConstantesFunciones.mostrarBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);
			if(!this.secuencialConstantesFunciones.mostrarBusquedaPorEjercicioPorModuloPorMovimientoSecuencial && index>-1) {
				this.jTabbedPaneBusquedasSecuencial.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSecuencial() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSecuencial.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSecuencial.indexOfComponent(this.jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencial.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.secuencialConstantesFunciones.activarBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);
				this.jTabbedPaneBusquedasSecuencial.setEnabledAt(index,this.secuencialConstantesFunciones.activarBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSecuencial(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorEjercicioPorModuloPorMovimiento")) {
			index= this.jTabbedPaneBusquedasSecuencial.indexOfComponent(this.jPanelBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);

			this.jTabbedPaneBusquedasSecuencial.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSecuencial.getComponent(index);

			this.secuencialConstantesFunciones.setResaltarBusquedaPorEjercicioPorModuloPorMovimientoSecuencial(resaltar);

			jPanel.setBorder(this.secuencialConstantesFunciones.resaltarBusquedaPorEjercicioPorModuloPorMovimientoSecuencial);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSecuencial.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSecuencial() throws Exception {

		if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSecuencial();
		this.updateVisibilidadResaltarControlesFormularioSecuencial();
		this.updateHabilitarResaltarControlesFormularioSecuencial();
		
	}
	
	public void updateBorderResaltarControlesFormularioSecuencial() throws Exception {
		if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.secuencialConstantesFunciones.resaltaridSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jLabelidSecuencial.setBorder(this.secuencialConstantesFunciones.resaltaridSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarid_empresaSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarid_empresaSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarid_sucursalSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarid_sucursalSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarid_ejercicioSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarid_ejercicioSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarid_periodoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarid_periodoSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarid_anioSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarid_anioSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarid_mesSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarid_mesSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarid_moduloSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarid_moduloSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarid_tipo_movimiento_moduloSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarid_tipo_movimiento_moduloSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarid_tipo_documentoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarid_tipo_documentoSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarid_tipo_movimientoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarid_tipo_movimientoSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_asientoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asientoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_asientoSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_ingresoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingresoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_ingresoSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_egresoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egresoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_egresoSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_diarioSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diarioSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_diarioSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_retencion_ivaSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_ivaSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_retencion_ivaSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_retencion_fuenteSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuenteSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_retencion_fuenteSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_asiento_formatoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asiento_formatoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_asiento_formatoSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_ingreso_formatoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingreso_formatoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_ingreso_formatoSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_egreso_formatoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egreso_formatoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_egreso_formatoSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_diario_formatoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diario_formatoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_diario_formatoSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_retencion_fuente_formatoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuente_formatoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_retencion_fuente_formatoSecuencial);}
		if(this.secuencialConstantesFunciones.resaltarnumero_retencion_iva_formatoSecuencial!=null && this.jInternalFrameDetalleFormSecuencial!=null) {this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_iva_formatoSecuencial.setBorder(this.secuencialConstantesFunciones.resaltarnumero_retencion_iva_formatoSecuencial);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSecuencial() throws Exception {		
		if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) {
	
		//this.jInternalFrameDetalleFormSecuencial.jLabelidSecuencial.setVisible(this.secuencialConstantesFunciones.mostraridSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelidSecuencial.setVisible(this.secuencialConstantesFunciones.mostraridSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_empresaSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelid_empresaSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_empresaSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_sucursalSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelid_sucursalSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_sucursalSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_ejercicioSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelid_ejercicioSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_ejercicioSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_periodoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelid_periodoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_periodoSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_anioSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelid_anioSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_anioSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_mesSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelid_mesSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_mesSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_moduloSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelid_moduloSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_moduloSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_tipo_movimiento_moduloSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelid_tipo_movimiento_moduloSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_tipo_movimiento_moduloSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_tipo_documentoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelid_tipo_documentoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_tipo_documentoSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_tipo_movimientoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelid_tipo_movimientoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarid_tipo_movimientoSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asientoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_asientoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_asientoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_asientoSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingresoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_ingresoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_ingresoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_ingresoSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egresoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_egresoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_egresoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_egresoSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diarioSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_diarioSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_diarioSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_diarioSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_ivaSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_retencion_ivaSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_retencion_ivaSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_retencion_ivaSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuenteSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_retencion_fuenteSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_retencion_fuenteSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_retencion_fuenteSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asiento_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_asiento_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_asiento_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_asiento_formatoSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingreso_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_ingreso_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_ingreso_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_ingreso_formatoSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egreso_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_egreso_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_egreso_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_egreso_formatoSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diario_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_diario_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_diario_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_diario_formatoSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuente_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_retencion_fuente_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_retencion_fuente_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_retencion_fuente_formatoSecuencial);
		//this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_iva_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_retencion_iva_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jPanelnumero_retencion_iva_formatoSecuencial.setVisible(this.secuencialConstantesFunciones.mostrarnumero_retencion_iva_formatoSecuencial);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSecuencial() throws Exception {
		if(this.jInternalFrameDetalleFormSecuencial==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSecuencial!=null) {
	
		this.jInternalFrameDetalleFormSecuencial.jLabelidSecuencial.setEnabled(this.secuencialConstantesFunciones.activaridSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_empresaSecuencial.setEnabled(this.secuencialConstantesFunciones.activarid_empresaSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_sucursalSecuencial.setEnabled(this.secuencialConstantesFunciones.activarid_sucursalSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_ejercicioSecuencial.setEnabled(this.secuencialConstantesFunciones.activarid_ejercicioSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_periodoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarid_periodoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_anioSecuencial.setEnabled(this.secuencialConstantesFunciones.activarid_anioSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_mesSecuencial.setEnabled(this.secuencialConstantesFunciones.activarid_mesSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_moduloSecuencial.setEnabled(this.secuencialConstantesFunciones.activarid_moduloSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimiento_moduloSecuencial.setEnabled(this.secuencialConstantesFunciones.activarid_tipo_movimiento_moduloSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_documentoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarid_tipo_documentoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jComboBoxid_tipo_movimientoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarid_tipo_movimientoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asientoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_asientoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingresoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_ingresoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egresoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_egresoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diarioSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_diarioSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_ivaSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_retencion_ivaSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuenteSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_retencion_fuenteSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_asiento_formatoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_asiento_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_ingreso_formatoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_ingreso_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_egreso_formatoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_egreso_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_diario_formatoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_diario_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_fuente_formatoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_retencion_fuente_formatoSecuencial);
		this.jInternalFrameDetalleFormSecuencial.jTextFieldnumero_retencion_iva_formatoSecuencial.setEnabled(this.secuencialConstantesFunciones.activarnumero_retencion_iva_formatoSecuencial);
		}
	}
	
		
}