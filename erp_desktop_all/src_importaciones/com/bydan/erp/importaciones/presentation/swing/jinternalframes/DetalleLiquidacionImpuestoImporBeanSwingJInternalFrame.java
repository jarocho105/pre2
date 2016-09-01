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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;




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

import com.bydan.erp.importaciones.util.DetalleLiquidacionImpuestoImporConstantesFunciones;
import com.bydan.erp.importaciones.util.DetalleLiquidacionImpuestoImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.DetalleLiquidacionImpuestoImporParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.DetalleLiquidacionImpuestoImporBean;
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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

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
public class DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame extends DetalleLiquidacionImpuestoImporJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporValidator = new ClassValidator<DetalleLiquidacionImpuestoImpor>(DetalleLiquidacionImpuestoImpor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor;	
	public DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux;
	public DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporTotales;
	public Long idDetalleLiquidacionImpuestoImporActual;
	public Long iIdNuevoDetalleLiquidacionImpuestoImpor=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboLiquidacionImpuestoImpor="";

	public List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsForeignKey;

	public List<LiquidacionImpuestoImpor> getliquidacionimpuestoimporsForeignKey() {
		return liquidacionimpuestoimporsForeignKey;
	}

	public void setliquidacionimpuestoimporsForeignKey(List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsForeignKey) {
		this.liquidacionimpuestoimporsForeignKey = liquidacionimpuestoimporsForeignKey;
	}

	//OBJETO FK ACTUAL
	public LiquidacionImpuestoImpor liquidacionimpuestoimporForeignKey;

	public LiquidacionImpuestoImpor getliquidacionimpuestoimporForeignKey() {
		return liquidacionimpuestoimporForeignKey;
	}

	public void setliquidacionimpuestoimporForeignKey(LiquidacionImpuestoImpor liquidacionimpuestoimporForeignKey) {
		this.liquidacionimpuestoimporForeignKey = liquidacionimpuestoimporForeignKey;
	}

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
	
	public Boolean isPermisoTodoDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoNuevoDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoActualizarDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoActualizarOriginalDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoEliminarDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoConsultaDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoBusquedaDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoReporteDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoPaginacionAltoDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoCopiarDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoVerFormDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoDuplicarDetalleLiquidacionImpuestoImpor;
	public Boolean isPermisoOrdenDetalleLiquidacionImpuestoImpor;
	
	
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
	
	public DetalleLiquidacionImpuestoImporParameterReturnGeneral detalleliquidacionimpuestoimporReturnGeneral;
	public DetalleLiquidacionImpuestoImporParameterReturnGeneral detalleliquidacionimpuestoimporParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleLiquidacionImpuestoImpor=false;
	public Boolean esParaAccionDesdeFormularioDetalleLiquidacionImpuestoImpor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleLiquidacionImpuestoImporSessionBeanAdditional detalleliquidacionimpuestoimporSessionBeanAdditional=null;
	
	public DetalleLiquidacionImpuestoImporSessionBeanAdditional getDetalleLiquidacionImpuestoImporSessionBeanAdditional() {
		return this.detalleliquidacionimpuestoimporSessionBeanAdditional;
	}
	
	public void setDetalleLiquidacionImpuestoImporSessionBeanAdditional(DetalleLiquidacionImpuestoImporSessionBeanAdditional detalleliquidacionimpuestoimporSessionBeanAdditional) {
		try {
			this.detalleliquidacionimpuestoimporSessionBeanAdditional=detalleliquidacionimpuestoimporSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional detalleliquidacionimpuestoimporBeanSwingJInternalFrameAdditional=null;
	//public class DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame
	
	public DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional getDetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional() {
		return this.detalleliquidacionimpuestoimporBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional(DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional detalleliquidacionimpuestoimporBeanSwingJInternalFrameAdditional) {
		try {
			this.detalleliquidacionimpuestoimporBeanSwingJInternalFrameAdditional=detalleliquidacionimpuestoimporBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleLiquidacionImpuestoImporLogic detalleliquidacionimpuestoimporLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporBean;
	public DetalleLiquidacionImpuestoImporConstantesFunciones detalleliquidacionimpuestoimporConstantesFunciones;
	//public DetalleLiquidacionImpuestoImporParameterReturnGeneral detalleliquidacionimpuestoimporReturnGeneral;
	
	//FK
	
	public LiquidacionImpuestoImporLogic liquidacionimpuestoimporLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimpors;	
	//public List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsEliminados;
	//public List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor=true;
	public Boolean isVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor=true;
	public Boolean isVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor=true;
	public Boolean isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoDetalleLiquidacionImpuestoImpor() {
		return this.iIdNuevoDetalleLiquidacionImpuestoImpor;
	}

	public void setiIdNuevoDetalleLiquidacionImpuestoImpor(Long iIdNuevoDetalleLiquidacionImpuestoImpor) {
		this.iIdNuevoDetalleLiquidacionImpuestoImpor = iIdNuevoDetalleLiquidacionImpuestoImpor;
	}
	
	public Long getidDetalleLiquidacionImpuestoImporActual() {
		return this.idDetalleLiquidacionImpuestoImporActual;
	}

	public void setidDetalleLiquidacionImpuestoImporActual(Long idDetalleLiquidacionImpuestoImporActual) {
		this.idDetalleLiquidacionImpuestoImporActual = idDetalleLiquidacionImpuestoImporActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleLiquidacionImpuestoImpor getdetalleliquidacionimpuestoimpor() {
		return this.detalleliquidacionimpuestoimpor;
	}

	public void setdetalleliquidacionimpuestoimpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor) {
		this.detalleliquidacionimpuestoimpor = detalleliquidacionimpuestoimpor;
	}
	
	public DetalleLiquidacionImpuestoImpor getdetalleliquidacionimpuestoimporAux() {
		return this.detalleliquidacionimpuestoimporAux;
	}

	public void setdetalleliquidacionimpuestoimporAux(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux) {
		this.detalleliquidacionimpuestoimporAux = detalleliquidacionimpuestoimporAux;
	}				
	
	public DetalleLiquidacionImpuestoImpor getdetalleliquidacionimpuestoimporAnterior() {
		return this.detalleliquidacionimpuestoimporAnterior;
	}

	public void setdetalleliquidacionimpuestoimporAnterior(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAnterior) {
		this.detalleliquidacionimpuestoimporAnterior = detalleliquidacionimpuestoimporAnterior;
	}	
	
	public DetalleLiquidacionImpuestoImpor getdetalleliquidacionimpuestoimporTotales() {
		return this.detalleliquidacionimpuestoimporTotales;
	}

	public void setdetalleliquidacionimpuestoimporTotales(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporTotales) {
		this.detalleliquidacionimpuestoimporTotales = detalleliquidacionimpuestoimporTotales;
	}	
	
	public DetalleLiquidacionImpuestoImpor getdetalleliquidacionimpuestoimporBean() {
		return this.detalleliquidacionimpuestoimporBean;
	}

	public void setdetalleliquidacionimpuestoimporBean(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporBean) {
		this.detalleliquidacionimpuestoimporBean = detalleliquidacionimpuestoimporBean;
	}	
	
	public DetalleLiquidacionImpuestoImporParameterReturnGeneral getdetalleliquidacionimpuestoimporReturnGeneral() {
		return this.detalleliquidacionimpuestoimporReturnGeneral;
	}

	public void setdetalleliquidacionimpuestoimporReturnGeneral(DetalleLiquidacionImpuestoImporParameterReturnGeneral detalleliquidacionimpuestoimporReturnGeneral) {
		this.detalleliquidacionimpuestoimporReturnGeneral = detalleliquidacionimpuestoimporReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor=-1L;

	public Long getid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor() {
		return this.id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor;
	}

	public void setid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor(Long id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor) {
		this.id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor = id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor;
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
	
	
	public DetalleLiquidacionImpuestoImporLogic getDetalleLiquidacionImpuestoImporLogic()	{		
		return detalleliquidacionimpuestoimporLogic;
	}

	public void setDetalleLiquidacionImpuestoImporLogic(DetalleLiquidacionImpuestoImporLogic detalleliquidacionimpuestoimporLogic) {
		this.detalleliquidacionimpuestoimporLogic = detalleliquidacionimpuestoimporLogic;
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
	
	public Boolean getIsEsNuevoDetalleLiquidacionImpuestoImpor() {
		return isEsNuevoDetalleLiquidacionImpuestoImpor;
	}

	public void setIsEsNuevoDetalleLiquidacionImpuestoImpor(Boolean isEsNuevoDetalleLiquidacionImpuestoImpor) {
		this.isEsNuevoDetalleLiquidacionImpuestoImpor = isEsNuevoDetalleLiquidacionImpuestoImpor;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleLiquidacionImpuestoImpor() {
		return esParaAccionDesdeFormularioDetalleLiquidacionImpuestoImpor;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleLiquidacionImpuestoImpor(Boolean esParaAccionDesdeFormularioDetalleLiquidacionImpuestoImpor) {
		this.esParaAccionDesdeFormularioDetalleLiquidacionImpuestoImpor = esParaAccionDesdeFormularioDetalleLiquidacionImpuestoImpor;
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
	
	
	public void cargarCombosLiquidacionImpuestoImporsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.liquidacionimpuestoimporsForeignKey=new ArrayList<LiquidacionImpuestoImpor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LiquidacionImpuestoImporLogic liquidacionimpuestoimporLogic=new LiquidacionImpuestoImporLogic();

			liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporDataAccess().setIsForForeingKeyData(true);

			if(this.detalleliquidacionimpuestoimporSessionBean==null) {
				this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
			}

			if(!this.detalleliquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionLiquidacionImpuestoImpor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporDataAccess().setIsForForeingKeyData(true);

					liquidacionimpuestoimporLogic.getTodosLiquidacionImpuestoImporsWithConnection(sFinalQuery,new Pagination());

					this.liquidacionimpuestoimporsForeignKey=liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLiquidacionImpuestoImpor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimpuestoimporLogic.getEntityWithConnection(detalleliquidacionimpuestoimporSessionBean.getlidLiquidacionImpuestoImporActual());
					this.liquidacionimpuestoimporsForeignKey.add(liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpor());
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

			if(this.detalleliquidacionimpuestoimporSessionBean==null) {
				this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
			}

			if(!this.detalleliquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalleliquidacionimpuestoimporSessionBean.getlidEmpresaActual());
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

			if(this.detalleliquidacionimpuestoimporSessionBean==null) {
				this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
			}

			if(!this.detalleliquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detalleliquidacionimpuestoimporSessionBean.getlidSucursalActual());
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

	
	
	public void setActualLiquidacionImpuestoImporForeignKey(Long idLiquidacionImpuestoImporSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			LiquidacionImpuestoImpor  liquidacionimpuestoimporTemp=null;

			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimporsForeignKey) {
				if(liquidacionimpuestoimporAux.getId()!=null && liquidacionimpuestoimporAux.getId().equals(idLiquidacionImpuestoImporSeleccionado)) {
					liquidacionimpuestoimporTemp=liquidacionimpuestoimporAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(liquidacionimpuestoimporTemp!=null) {

					if(this.detalleliquidacionimpuestoimpor!=null) {
						this.detalleliquidacionimpuestoimpor.setLiquidacionImpuestoImpor(liquidacionimpuestoimporTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setSelectedItem(liquidacionimpuestoimporTemp);
					}
				} else {
					//jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setSelectedItem(liquidacionimpuestoimporTemp);
					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLiquidacionImpuestoImpor") || sFormularioTipoBusqueda.equals("Todos")){
					if(liquidacionimpuestoimporTemp!=null && jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor!=null) {
						jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setSelectedItem(liquidacionimpuestoimporTemp);
					} else {
						if(jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor!=null) {
							//jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setSelectedItem(liquidacionimpuestoimporTemp);
							if(jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.getItemCount()>0) {
								jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);
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

	public String getActualLiquidacionImpuestoImporForeignKeyDescripcion(Long idLiquidacionImpuestoImporSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			LiquidacionImpuestoImpor  liquidacionimpuestoimporTemp=null;

			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimporsForeignKey) {
				if(liquidacionimpuestoimporAux.getId()!=null && liquidacionimpuestoimporAux.getId().equals(idLiquidacionImpuestoImporSeleccionado)) {
					liquidacionimpuestoimporTemp=liquidacionimpuestoimporAux;
					break;
				}
			}


			sDescripcion=LiquidacionImpuestoImporConstantesFunciones.getLiquidacionImpuestoImporDescripcion(liquidacionimpuestoimporTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLiquidacionImpuestoImporForeignKeyGenerico(Long idLiquidacionImpuestoImporSeleccionado,JComboBox jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			LiquidacionImpuestoImpor  liquidacionimpuestoimporTemp=null;

			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimporsForeignKey) {
				if(liquidacionimpuestoimporAux.getId()!=null && liquidacionimpuestoimporAux.getId().equals(idLiquidacionImpuestoImporSeleccionado)) {
					liquidacionimpuestoimporTemp=liquidacionimpuestoimporAux;
					break;
				}
			}

			if(liquidacionimpuestoimporTemp!=null) {
				jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporGenerico.setSelectedItem(liquidacionimpuestoimporTemp);
			} else {
				if(jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporGenerico!=null && jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporGenerico.getItemCount()>0) {
					jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporGenerico.setSelectedIndex(0);
				}
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

					if(this.detalleliquidacionimpuestoimpor!=null) {
						this.detalleliquidacionimpuestoimpor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleLiquidacionImpuestoImporGenerico)throws Exception
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
				jComboBoxid_empresaDetalleLiquidacionImpuestoImporGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleLiquidacionImpuestoImporGenerico!=null && jComboBoxid_empresaDetalleLiquidacionImpuestoImporGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleLiquidacionImpuestoImporGenerico.setSelectedIndex(0);
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

					if(this.detalleliquidacionimpuestoimpor!=null) {
						this.detalleliquidacionimpuestoimpor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleLiquidacionImpuestoImporGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleLiquidacionImpuestoImporGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleLiquidacionImpuestoImporGenerico!=null && jComboBoxid_sucursalDetalleLiquidacionImpuestoImporGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleLiquidacionImpuestoImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLiquidacionImpuestoImporForeignKey(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,JComboBox jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			LiquidacionImpuestoImpor  liquidacionimpuestoimporAux=new LiquidacionImpuestoImpor();

			if(jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporGenerico==null) {
				liquidacionimpuestoimporAux=(LiquidacionImpuestoImpor)this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.getSelectedItem();
			} else {
				liquidacionimpuestoimporAux=(LiquidacionImpuestoImpor)jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporGenerico.getSelectedItem();
			}

			if(liquidacionimpuestoimporAux!=null && liquidacionimpuestoimporAux.getId()!=null) {
				detalleliquidacionimpuestoimpor.setid_liquidacion_impuesto_impor(liquidacionimpuestoimporAux.getId());
				detalleliquidacionimpuestoimpor.setliquidacionimpuestoimpor_descripcion(DetalleLiquidacionImpuestoImporConstantesFunciones.getLiquidacionImpuestoImporDescripcion(liquidacionimpuestoimporAux));
				detalleliquidacionimpuestoimpor.setLiquidacionImpuestoImpor(liquidacionimpuestoimporAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,JComboBox jComboBoxid_empresaDetalleLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleLiquidacionImpuestoImporGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleLiquidacionImpuestoImporGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalleliquidacionimpuestoimpor.setid_empresa(empresaAux.getId());
				detalleliquidacionimpuestoimpor.setempresa_descripcion(DetalleLiquidacionImpuestoImporConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalleliquidacionimpuestoimpor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,JComboBox jComboBoxid_sucursalDetalleLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleLiquidacionImpuestoImporGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleLiquidacionImpuestoImporGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detalleliquidacionimpuestoimpor.setid_sucursal(sucursalAux.getId());
				detalleliquidacionimpuestoimpor.setsucursal_descripcion(DetalleLiquidacionImpuestoImporConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detalleliquidacionimpuestoimpor.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLiquidacionImpuestoImporsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLiquidacionImpuestoImpor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { 
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.removeAllItems();

							for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:this.liquidacionimpuestoimporsForeignKey) {
								this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.addItem(liquidacionimpuestoimpor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { 
					}

					if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLiquidacionImpuestoImpor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.removeAllItems();

							for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:this.liquidacionimpuestoimporsForeignKey) {
								this.jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.addItem(liquidacionimpuestoimpor);
							}
						}

						if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { 
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { 
					}

					if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { 
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { 
					}

					if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameLiquidacionImpuestoImporForeignKey(LiquidacionImpuestoImpor liquidacionimpuestoimpor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setSelectedItem(liquidacionimpuestoimpor);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setSelectedItem(liquidacionimpuestoimpor);
						} else {
							this.jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesDetalleLiquidacionImpuestoImpor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleLiquidacionImpuestoImporConstantesFunciones.refrescarForeignKeysDescripcionesDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleLiquidacionImpuestoImporConstantesFunciones.refrescarForeignKeysDescripcionesDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(LiquidacionImpuestoImpor.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(this.detalleliquidacionimpuestoimpors);
			detalleliquidacionimpuestoimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleLiquidacionImpuestoImporParameterReturnGeneral getDetalleLiquidacionImpuestoImporParameterGeneral() {
		return this.detalleliquidacionimpuestoimporParameterGeneral;
	}
	
	public void setDetalleLiquidacionImpuestoImporParameterGeneral(DetalleLiquidacionImpuestoImporParameterReturnGeneral detalleliquidacionimpuestoimporParameterGeneral) {
		this.detalleliquidacionimpuestoimporParameterGeneral = detalleliquidacionimpuestoimporParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleLiquidacionImpuestoImpor() {
		return isPermisoTodoDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoTodoDetalleLiquidacionImpuestoImpor(Boolean isPermisoTodoDetalleLiquidacionImpuestoImpor) {
		this.isPermisoTodoDetalleLiquidacionImpuestoImpor = isPermisoTodoDetalleLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoNuevoDetalleLiquidacionImpuestoImpor() {
		return isPermisoNuevoDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoNuevoDetalleLiquidacionImpuestoImpor(Boolean isPermisoNuevoDetalleLiquidacionImpuestoImpor) {
		this.isPermisoNuevoDetalleLiquidacionImpuestoImpor = isPermisoNuevoDetalleLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoActualizarDetalleLiquidacionImpuestoImpor() {
		return isPermisoActualizarDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoActualizarDetalleLiquidacionImpuestoImpor(Boolean isPermisoActualizarDetalleLiquidacionImpuestoImpor) {
		this.isPermisoActualizarDetalleLiquidacionImpuestoImpor = isPermisoActualizarDetalleLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoEliminarDetalleLiquidacionImpuestoImpor() {
		return isPermisoEliminarDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoEliminarDetalleLiquidacionImpuestoImpor(Boolean isPermisoEliminarDetalleLiquidacionImpuestoImpor) {
		this.isPermisoEliminarDetalleLiquidacionImpuestoImpor = isPermisoEliminarDetalleLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor() {
		return isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor(Boolean isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor) {
		this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor = isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoConsultaDetalleLiquidacionImpuestoImpor() {
		return isPermisoConsultaDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoConsultaDetalleLiquidacionImpuestoImpor(Boolean isPermisoConsultaDetalleLiquidacionImpuestoImpor) {
		this.isPermisoConsultaDetalleLiquidacionImpuestoImpor = isPermisoConsultaDetalleLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoBusquedaDetalleLiquidacionImpuestoImpor() {
		return isPermisoBusquedaDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoBusquedaDetalleLiquidacionImpuestoImpor(Boolean isPermisoBusquedaDetalleLiquidacionImpuestoImpor) {
		this.isPermisoBusquedaDetalleLiquidacionImpuestoImpor = isPermisoBusquedaDetalleLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoReporteDetalleLiquidacionImpuestoImpor() {
		return isPermisoReporteDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoReporteDetalleLiquidacionImpuestoImpor(Boolean isPermisoReporteDetalleLiquidacionImpuestoImpor) {
		this.isPermisoReporteDetalleLiquidacionImpuestoImpor = isPermisoReporteDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor() {
		return isPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor(Boolean isPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor) {
		this.isPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor = isPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor() {
		return isPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor(Boolean isPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor) {
		this.isPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor = isPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleLiquidacionImpuestoImpor() {
		return isPermisoPaginacionAltoDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoPaginacionAltoDetalleLiquidacionImpuestoImpor(Boolean isPermisoPaginacionAltoDetalleLiquidacionImpuestoImpor) {
		this.isPermisoPaginacionAltoDetalleLiquidacionImpuestoImpor = isPermisoPaginacionAltoDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoCopiarDetalleLiquidacionImpuestoImpor() {
		return isPermisoCopiarDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoCopiarDetalleLiquidacionImpuestoImpor(Boolean isPermisoCopiarDetalleLiquidacionImpuestoImpor) {
		this.isPermisoCopiarDetalleLiquidacionImpuestoImpor = isPermisoCopiarDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoVerFormDetalleLiquidacionImpuestoImpor() {
		return isPermisoVerFormDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoVerFormDetalleLiquidacionImpuestoImpor(Boolean isPermisoVerFormDetalleLiquidacionImpuestoImpor) {
		this.isPermisoVerFormDetalleLiquidacionImpuestoImpor = isPermisoVerFormDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoDuplicarDetalleLiquidacionImpuestoImpor() {
		return isPermisoDuplicarDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoDuplicarDetalleLiquidacionImpuestoImpor(Boolean isPermisoDuplicarDetalleLiquidacionImpuestoImpor) {
		this.isPermisoDuplicarDetalleLiquidacionImpuestoImpor = isPermisoDuplicarDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoOrdenDetalleLiquidacionImpuestoImpor() {
		return isPermisoOrdenDetalleLiquidacionImpuestoImpor;
	}

	public void setIsPermisoOrdenDetalleLiquidacionImpuestoImpor(Boolean isPermisoOrdenDetalleLiquidacionImpuestoImpor) {
		this.isPermisoOrdenDetalleLiquidacionImpuestoImpor = isPermisoOrdenDetalleLiquidacionImpuestoImpor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor = isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor;
	}
		
	public DetalleLiquidacionImpuestoImporSessionBean getdetalleliquidacionimpuestoimporSessionBean() {
		return this.detalleliquidacionimpuestoimporSessionBean;
	}
	
	public void setdetalleliquidacionimpuestoimporSessionBean(DetalleLiquidacionImpuestoImporSessionBean detalleliquidacionimpuestoimporSessionBean) {
		this.detalleliquidacionimpuestoimporSessionBean=detalleliquidacionimpuestoimporSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdLiquidacionImpuestoImpor() {
		return this.isVisibilidadFK_IdLiquidacionImpuestoImpor;
	}

	public void setisVisibilidadFK_IdLiquidacionImpuestoImpor(Boolean isVisibilidadFK_IdLiquidacionImpuestoImpor) {
		this.isVisibilidadFK_IdLiquidacionImpuestoImpor=isVisibilidadFK_IdLiquidacionImpuestoImpor;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor)throws Exception {
		try {
			
				this.setActualParaGuardarLiquidacionImpuestoImporForeignKey(detalleliquidacionimpuestoimpor,null);
				this.setActualParaGuardarEmpresaForeignKey(detalleliquidacionimpuestoimpor,null);
				this.setActualParaGuardarSucursalForeignKey(detalleliquidacionimpuestoimpor,null);
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
	
	public void bugActualizarReferenciaActual(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimpor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalleliquidacionimpuestoimporAux.setId(detalleliquidacionimpuestoimpor.getId());
		detalleliquidacionimpuestoimporAux.setVersionRow(detalleliquidacionimpuestoimpor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleLiquidacionImpuestoImpor();
		
			int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalleliquidacionimpuestoimporValidator.getInvalidValues(this.detalleliquidacionimpuestoimpor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalleliquidacionimpuestoimporLogic.setDatosCliente(datosCliente);
			detalleliquidacionimpuestoimporLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalleliquidacionimpuestoimporAux=new  DetalleLiquidacionImpuestoImpor();
				
				detalleliquidacionimpuestoimporAux.setIsNew(true);
				detalleliquidacionimpuestoimporAux.setIsChanged(true);
				
				detalleliquidacionimpuestoimporAux.setDetalleLiquidacionImpuestoImporOriginal(this.detalleliquidacionimpuestoimpor);
				
				detalleliquidacionimpuestoimporAux.setId(this.detalleliquidacionimpuestoimpor.getId());	
				detalleliquidacionimpuestoimporAux.setVersionRow(this.detalleliquidacionimpuestoimpor.getVersionRow());	
				detalleliquidacionimpuestoimporAux.setid_liquidacion_impuesto_impor(this.detalleliquidacionimpuestoimpor.getid_liquidacion_impuesto_impor());	
				detalleliquidacionimpuestoimporAux.setid_empresa(this.detalleliquidacionimpuestoimpor.getid_empresa());	
				detalleliquidacionimpuestoimporAux.setid_sucursal(this.detalleliquidacionimpuestoimpor.getid_sucursal());	
				detalleliquidacionimpuestoimporAux.setcantidad(this.detalleliquidacionimpuestoimpor.getcantidad());	
				detalleliquidacionimpuestoimporAux.setvalor(this.detalleliquidacionimpuestoimpor.getvalor());	
				detalleliquidacionimpuestoimporAux.setfob(this.detalleliquidacionimpuestoimpor.getfob());	
				detalleliquidacionimpuestoimporAux.setporcentaje_iva(this.detalleliquidacionimpuestoimpor.getporcentaje_iva());	
				detalleliquidacionimpuestoimporAux.setporcentaje_arancel(this.detalleliquidacionimpuestoimpor.getporcentaje_arancel());	
				detalleliquidacionimpuestoimporAux.setporcentaje_aplicar(this.detalleliquidacionimpuestoimpor.getporcentaje_aplicar());	
				detalleliquidacionimpuestoimporAux.setflete(this.detalleliquidacionimpuestoimpor.getflete());	
				detalleliquidacionimpuestoimporAux.setseguro(this.detalleliquidacionimpuestoimpor.getseguro());	
				detalleliquidacionimpuestoimporAux.setbase_imponible(this.detalleliquidacionimpuestoimpor.getbase_imponible());	
				detalleliquidacionimpuestoimporAux.setvalor_arancel(this.detalleliquidacionimpuestoimpor.getvalor_arancel());	
				detalleliquidacionimpuestoimporAux.setvalor_fodi(this.detalleliquidacionimpuestoimpor.getvalor_fodi());	
				detalleliquidacionimpuestoimporAux.setvalor_iva(this.detalleliquidacionimpuestoimpor.getvalor_iva());	
				detalleliquidacionimpuestoimporAux.setnumero_comprobante(this.detalleliquidacionimpuestoimpor.getnumero_comprobante());	
				detalleliquidacionimpuestoimporAux.setporcentaje_fodi(this.detalleliquidacionimpuestoimpor.getporcentaje_fodi());	
				detalleliquidacionimpuestoimporAux.setvalor_imponible(this.detalleliquidacionimpuestoimpor.getvalor_imponible());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimpuestoimporLogic.saveDetalleLiquidacionImpuestoImpors();//WithConnection
						//detalleliquidacionimpuestoimporLogic.getSetVersionRowDetalleLiquidacionImpuestoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleliquidacionimpuestoimpor,detalleliquidacionimpuestoimporAux);
					
					this.refrescarForeignKeysDescripcionesDetalleLiquidacionImpuestoImpor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleliquidacionimpuestoimporLogic.saveDetalleLiquidacionImpuestoImporRelaciones(detalleliquidacionimpuestoimporAux);//WithConnection
								//detalleliquidacionimpuestoimporLogic.getSetVersionRowDetalleLiquidacionImpuestoImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleliquidacionimpuestoimpor,detalleliquidacionimpuestoimporAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimpors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleliquidacionimpuestoimpor,detalleliquidacionimpuestoimporAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalleliquidacionimpuestoimporAux=new  DetalleLiquidacionImpuestoImpor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() 
					|| (this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() && this.detalleliquidacionimpuestoimpor.getId()>=0)) {
						
					detalleliquidacionimpuestoimporAux.setIsNew(false);
				}
				
				detalleliquidacionimpuestoimporAux.setIsDeleted(false);
			
				detalleliquidacionimpuestoimporAux.setId(this.detalleliquidacionimpuestoimpor.getId());	
				detalleliquidacionimpuestoimporAux.setVersionRow(this.detalleliquidacionimpuestoimpor.getVersionRow());	
				detalleliquidacionimpuestoimporAux.setid_liquidacion_impuesto_impor(this.detalleliquidacionimpuestoimpor.getid_liquidacion_impuesto_impor());	
				detalleliquidacionimpuestoimporAux.setid_empresa(this.detalleliquidacionimpuestoimpor.getid_empresa());	
				detalleliquidacionimpuestoimporAux.setid_sucursal(this.detalleliquidacionimpuestoimpor.getid_sucursal());	
				detalleliquidacionimpuestoimporAux.setcantidad(this.detalleliquidacionimpuestoimpor.getcantidad());	
				detalleliquidacionimpuestoimporAux.setvalor(this.detalleliquidacionimpuestoimpor.getvalor());	
				detalleliquidacionimpuestoimporAux.setfob(this.detalleliquidacionimpuestoimpor.getfob());	
				detalleliquidacionimpuestoimporAux.setporcentaje_iva(this.detalleliquidacionimpuestoimpor.getporcentaje_iva());	
				detalleliquidacionimpuestoimporAux.setporcentaje_arancel(this.detalleliquidacionimpuestoimpor.getporcentaje_arancel());	
				detalleliquidacionimpuestoimporAux.setporcentaje_aplicar(this.detalleliquidacionimpuestoimpor.getporcentaje_aplicar());	
				detalleliquidacionimpuestoimporAux.setflete(this.detalleliquidacionimpuestoimpor.getflete());	
				detalleliquidacionimpuestoimporAux.setseguro(this.detalleliquidacionimpuestoimpor.getseguro());	
				detalleliquidacionimpuestoimporAux.setbase_imponible(this.detalleliquidacionimpuestoimpor.getbase_imponible());	
				detalleliquidacionimpuestoimporAux.setvalor_arancel(this.detalleliquidacionimpuestoimpor.getvalor_arancel());	
				detalleliquidacionimpuestoimporAux.setvalor_fodi(this.detalleliquidacionimpuestoimpor.getvalor_fodi());	
				detalleliquidacionimpuestoimporAux.setvalor_iva(this.detalleliquidacionimpuestoimpor.getvalor_iva());	
				detalleliquidacionimpuestoimporAux.setnumero_comprobante(this.detalleliquidacionimpuestoimpor.getnumero_comprobante());	
				detalleliquidacionimpuestoimporAux.setporcentaje_fodi(this.detalleliquidacionimpuestoimpor.getporcentaje_fodi());	
				detalleliquidacionimpuestoimporAux.setvalor_imponible(this.detalleliquidacionimpuestoimpor.getvalor_imponible());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimpuestoimporLogic.saveDetalleLiquidacionImpuestoImpors();//WithConnection
						//detalleliquidacionimpuestoimporLogic.getSetVersionRowDetalleLiquidacionImpuestoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleliquidacionimpuestoimpor,detalleliquidacionimpuestoimporAux);
					
					this.refrescarForeignKeysDescripcionesDetalleLiquidacionImpuestoImpor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleliquidacionimpuestoimporLogic.saveDetalleLiquidacionImpuestoImporRelaciones(detalleliquidacionimpuestoimporAux);//WithConnection
								//detalleliquidacionimpuestoimporLogic.getSetVersionRowDetalleLiquidacionImpuestoImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleliquidacionimpuestoimpor,detalleliquidacionimpuestoimporAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimpors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleliquidacionimpuestoimpor,detalleliquidacionimpuestoimporAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalleliquidacionimpuestoimporAux=new  DetalleLiquidacionImpuestoImpor();
				
				detalleliquidacionimpuestoimporAux.setIsNew(false);
				detalleliquidacionimpuestoimporAux.setIsChanged(false);
				
				detalleliquidacionimpuestoimporAux.setIsDeleted(true);
				
				detalleliquidacionimpuestoimporAux.setId(this.detalleliquidacionimpuestoimpor.getId());	
				detalleliquidacionimpuestoimporAux.setVersionRow(this.detalleliquidacionimpuestoimpor.getVersionRow());	
				detalleliquidacionimpuestoimporAux.setid_liquidacion_impuesto_impor(this.detalleliquidacionimpuestoimpor.getid_liquidacion_impuesto_impor());	
				detalleliquidacionimpuestoimporAux.setid_empresa(this.detalleliquidacionimpuestoimpor.getid_empresa());	
				detalleliquidacionimpuestoimporAux.setid_sucursal(this.detalleliquidacionimpuestoimpor.getid_sucursal());	
				detalleliquidacionimpuestoimporAux.setcantidad(this.detalleliquidacionimpuestoimpor.getcantidad());	
				detalleliquidacionimpuestoimporAux.setvalor(this.detalleliquidacionimpuestoimpor.getvalor());	
				detalleliquidacionimpuestoimporAux.setfob(this.detalleliquidacionimpuestoimpor.getfob());	
				detalleliquidacionimpuestoimporAux.setporcentaje_iva(this.detalleliquidacionimpuestoimpor.getporcentaje_iva());	
				detalleliquidacionimpuestoimporAux.setporcentaje_arancel(this.detalleliquidacionimpuestoimpor.getporcentaje_arancel());	
				detalleliquidacionimpuestoimporAux.setporcentaje_aplicar(this.detalleliquidacionimpuestoimpor.getporcentaje_aplicar());	
				detalleliquidacionimpuestoimporAux.setflete(this.detalleliquidacionimpuestoimpor.getflete());	
				detalleliquidacionimpuestoimporAux.setseguro(this.detalleliquidacionimpuestoimpor.getseguro());	
				detalleliquidacionimpuestoimporAux.setbase_imponible(this.detalleliquidacionimpuestoimpor.getbase_imponible());	
				detalleliquidacionimpuestoimporAux.setvalor_arancel(this.detalleliquidacionimpuestoimpor.getvalor_arancel());	
				detalleliquidacionimpuestoimporAux.setvalor_fodi(this.detalleliquidacionimpuestoimpor.getvalor_fodi());	
				detalleliquidacionimpuestoimporAux.setvalor_iva(this.detalleliquidacionimpuestoimpor.getvalor_iva());	
				detalleliquidacionimpuestoimporAux.setnumero_comprobante(this.detalleliquidacionimpuestoimpor.getnumero_comprobante());	
				detalleliquidacionimpuestoimporAux.setporcentaje_fodi(this.detalleliquidacionimpuestoimpor.getporcentaje_fodi());	
				detalleliquidacionimpuestoimporAux.setvalor_imponible(this.detalleliquidacionimpuestoimpor.getvalor_imponible());	
				
				if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalleliquidacionimpuestoimporAux.getId()>=0) {	
						this.detalleliquidacionimpuestoimporsEliminados.add(detalleliquidacionimpuestoimporAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimpors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimpuestoimporLogic.saveDetalleLiquidacionImpuestoImpors();//WithConnection
						//detalleliquidacionimpuestoimporLogic.getSetVersionRowDetalleLiquidacionImpuestoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleliquidacionimpuestoimporLogic.saveDetalleLiquidacionImpuestoImporRelaciones(detalleliquidacionimpuestoimporAux);//WithConnection
								//detalleliquidacionimpuestoimporLogic.getSetVersionRowDetalleLiquidacionImpuestoImpors();//WithConnection
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
							if(this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalleliquidacionimpuestoimporAux,detalleliquidacionimpuestoimpors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().addAll(this.detalleliquidacionimpuestoimporsEliminados);
					
					detalleliquidacionimpuestoimporLogic.saveDetalleLiquidacionImpuestoImpors();//WithConnection
					//detalleliquidacionimpuestoimporLogic.getSetVersionRowDetalleLiquidacionImpuestoImpors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleLiquidacionImpuestoImpor();
				
				this.detalleliquidacionimpuestoimporsEliminados= new ArrayList<DetalleLiquidacionImpuestoImpor>();		
			}
			
			if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Liquidacion Impuesto Impor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalleliquidacionimpuestoimpor=detalleliquidacionimpuestoimporAux;
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
      		//this.finishProcessDetalleLiquidacionImpuestoImpor();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporLocal) throws Exception {
		
		if(this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporLocal) throws Exception {	
		if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(LiquidacionImpuestoImporDetalleFormJInternalFrame.class)) {
				LiquidacionImpuestoImporBeanSwingJInternalFrame liquidacionimpuestoimporBeanSwingJInternalFrameLocal=(LiquidacionImpuestoImporBeanSwingJInternalFrame) ((LiquidacionImpuestoImporDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				liquidacionimpuestoimporBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLiquidacionImpuestoImpor(liquidacionimpuestoimporBeanSwingJInternalFrameLocal.getliquidacionimpuestoimpor(),true);
				liquidacionimpuestoimporBeanSwingJInternalFrameLocal.actualizarLista(liquidacionimpuestoimporBeanSwingJInternalFrameLocal.liquidacionimpuestoimpor,this.liquidacionimpuestoimporsForeignKey);

				liquidacionimpuestoimporBeanSwingJInternalFrameLocal.actualizarRelaciones(liquidacionimpuestoimporBeanSwingJInternalFrameLocal.liquidacionimpuestoimpor);

				detalleliquidacionimpuestoimporLocal.setLiquidacionImpuestoImpor(liquidacionimpuestoimporBeanSwingJInternalFrameLocal.liquidacionimpuestoimpor);

				this.addItemDefectoCombosForeignKeyLiquidacionImpuestoImpor();
				this.cargarCombosFrameLiquidacionImpuestoImporsForeignKey("Formulario");
				this.setActualLiquidacionImpuestoImporForeignKey(liquidacionimpuestoimporBeanSwingJInternalFrameLocal.liquidacionimpuestoimpor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalleliquidacionimpuestoimporLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detalleliquidacionimpuestoimporLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleLiquidacionImpuestoImporActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalleliquidacionimpuestoimporValidator.getInvalidValues(this.detalleliquidacionimpuestoimpor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimpors) throws Exception {
		try	{		
			DetalleLiquidacionImpuestoImporConstantesFunciones.actualizarLista(detalleliquidacionimpuestoimpor,detalleliquidacionimpuestoimpors,this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimpors) throws Exception {
		try	{			
			DetalleLiquidacionImpuestoImporConstantesFunciones.actualizarSelectedLista(detalleliquidacionimpuestoimpor,detalleliquidacionimpuestoimpors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalleliquidacionimpuestoimporsLocal=this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalleliquidacionimpuestoimporsLocal=this.detalleliquidacionimpuestoimpors;
			}
			//ARCHITECTURE
		
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporLocal:detalleliquidacionimpuestoimporsLocal) {
				if(this.permiteMantenimiento(detalleliquidacionimpuestoimporLocal) && detalleliquidacionimpuestoimporLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleLiquidacionImpuestoImporLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.IDLIQUIDACIONIMPUESTOIMPOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelid_empresaDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelid_sucursalDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelcantidadDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalorDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.FOB)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelfobDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.PORCENTAJEIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.PORCENTAJEARANCEL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.PORCENTAJEAPLICAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.FLETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelfleteDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.SEGURO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelseguroDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.BASEIMPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelbase_imponibleDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.VALORARANCEL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_arancelDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.VALORFODI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_fodiDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.VALORIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_ivaDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.PORCENTAJEFODI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImpuestoImporConstantesFunciones.VALORIMPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelid_empresaDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelid_sucursalDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelcantidadDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalorDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelfobDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelfleteDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelseguroDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelbase_imponibleDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_arancelDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_fodiDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_ivaDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor,"");
		
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
		this.iIdNuevoDetalleLiquidacionImpuestoImpor--;	
		
		
		this.detalleliquidacionimpuestoimporAux=new DetalleLiquidacionImpuestoImpor();
		
		this.detalleliquidacionimpuestoimporAux.setId(this.iIdNuevoDetalleLiquidacionImpuestoImpor);
		this.detalleliquidacionimpuestoimporAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().add(this.detalleliquidacionimpuestoimporAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalleliquidacionimpuestoimpors.add(this.detalleliquidacionimpuestoimporAux);
		}
		//ARCHITECTURE
		
		this.detalleliquidacionimpuestoimpor=this.detalleliquidacionimpuestoimporAux;
		
		if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
		}
				
		//this.setDefaultControlesDetalleLiquidacionImpuestoImpor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleLiquidacionImpuestoImpor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleLiquidacionImpuestoImpor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleLiquidacionImpuestoImpor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporBean,this.detalleliquidacionimpuestoimpor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
			classes=DetalleLiquidacionImpuestoImporConstantesFunciones.getClassesRelationshipsOfDetalleLiquidacionImpuestoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalleliquidacionimpuestoimporReturnGeneral=detalleliquidacionimpuestoimporLogic.procesarEventosDetalleLiquidacionImpuestoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors(),this.detalleliquidacionimpuestoimpor,this.detalleliquidacionimpuestoimporParameterGeneral,this.isEsNuevoDetalleLiquidacionImpuestoImpor,classes);//this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporReturnGeneral,this.detalleliquidacionimpuestoimporBean,false);
		
		if(this.detalleliquidacionimpuestoimporReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporReturnGeneral.getDetalleLiquidacionImpuestoImpor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporReturnGeneral.getDetalleLiquidacionImpuestoImpor());
		}
		
		if(this.detalleliquidacionimpuestoimporReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporReturnGeneral.getDetalleLiquidacionImpuestoImpor(),classes);//this.detalleliquidacionimpuestoimporBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleLiquidacionImpuestoImpor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleLiquidacionImpuestoImpor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.RecargarFormDetalleLiquidacionImpuestoImpor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
						
			if(detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleLiquidacionImpuestoImpor();
			}
			
			this.actualizarVisualTableDatosDetalleLiquidacionImpuestoImpor();
			
			this.jTableDatosDetalleLiquidacionImpuestoImpor.setRowSelectionInterval(this.getIndiceNuevoDetalleLiquidacionImpuestoImpor(), this.getIndiceNuevoDetalleLiquidacionImpuestoImpor());
			
			this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
						
			this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleLiquidacionImpuestoImpor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarcantidadDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalorDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalorDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfobDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarfobDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_ivaDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_arancelDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_aplicarDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfleteDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarfleteDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldseguroDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarseguroDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarbase_imponibleDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_arancelDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_fodiDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_ivaDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarnumero_comprobanteDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_fodiDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_imponibleDetalleLiquidacionImpuestoImpor);	
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor);//
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_empresaDetalleLiquidacionImpuestoImpor);//
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_sucursalDetalleLiquidacionImpuestoImpor);
	};
	
	public void setDefaultControlesDetalleLiquidacionImpuestoImpor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleLiquidacionImpuestoImpor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalleliquidacionimpuestoimporSessionBean.setConGuardarRelaciones(true);			
			this.detalleliquidacionimpuestoimporSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.setVisible(true);
			
					
		} else {
			//this.detalleliquidacionimpuestoimporSessionBean.setConGuardarRelaciones(false);			
			this.detalleliquidacionimpuestoimporSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleLiquidacionImpuestoImpor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
				if(detalleliquidacionimpuestoimporAux.getId().equals(this.iIdNuevoDetalleLiquidacionImpuestoImpor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimpors) {
				if(detalleliquidacionimpuestoimporAux.getId().equals(this.iIdNuevoDetalleLiquidacionImpuestoImpor)) {
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
	
	public int getIndiceActualDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
				if(detalleliquidacionimpuestoimporAux.getId().equals(detalleliquidacionimpuestoimpor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimpors) {
				if(detalleliquidacionimpuestoimporAux.getId().equals(detalleliquidacionimpuestoimpor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
				if(detalleliquidacionimpuestoimporAux.getDetalleLiquidacionImpuestoImporOriginal().getId().equals(detalleliquidacionimpuestoimporOriginal.getId())) {
					existe=true;
					detalleliquidacionimpuestoimporOriginal.setId(detalleliquidacionimpuestoimporAux.getId());
					detalleliquidacionimpuestoimporOriginal.setVersionRow(detalleliquidacionimpuestoimporAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimpors) {
				if(detalleliquidacionimpuestoimporAux.getDetalleLiquidacionImpuestoImporOriginal().getId().equals(detalleliquidacionimpuestoimporOriginal.getId())) {
					existe=true;
					detalleliquidacionimpuestoimporOriginal.setId(detalleliquidacionimpuestoimporAux.getId());
					detalleliquidacionimpuestoimporOriginal.setVersionRow(detalleliquidacionimpuestoimporAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleLiquidacionImpuestoImpor(Boolean esParaCancelar) throws Exception {
		detalleliquidacionimpuestoimporsAux=new ArrayList<DetalleLiquidacionImpuestoImpor>();
		detalleliquidacionimpuestoimporAux=new DetalleLiquidacionImpuestoImpor();
		
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
					if(detalleliquidacionimpuestoimporAux.getId()<0) {
						detalleliquidacionimpuestoimporsAux.add(detalleliquidacionimpuestoimporAux);
					}		
				}
				this.iIdNuevoDetalleLiquidacionImpuestoImpor=0L;
				this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().removeAll(detalleliquidacionimpuestoimporsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimpors) {
					if(detalleliquidacionimpuestoimporAux.getId()<0) {
						detalleliquidacionimpuestoimporsAux.add(detalleliquidacionimpuestoimporAux);
					}		
				}
				this.iIdNuevoDetalleLiquidacionImpuestoImpor=0L;
				this.detalleliquidacionimpuestoimpors.removeAll(detalleliquidacionimpuestoimporsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleLiquidacionImpuestoImpor 
					&& this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size()>0
					) {
					detalleliquidacionimpuestoimporAux=this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().get(this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size() - 1);
				
					if(detalleliquidacionimpuestoimporAux.getId()<0) {
						this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().remove(detalleliquidacionimpuestoimporAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleLiquidacionImpuestoImpor && this.detalleliquidacionimpuestoimpors.size()>0) {
					detalleliquidacionimpuestoimporAux=this.detalleliquidacionimpuestoimpors.get(this.detalleliquidacionimpuestoimpors.size() - 1);
				
					if(detalleliquidacionimpuestoimporAux.getId()<0) {
						this.detalleliquidacionimpuestoimpors.remove(detalleliquidacionimpuestoimporAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleLiquidacionImpuestoImpor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalleliquidacionimpuestoimpor.getId()<0) {
				this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().remove(this.detalleliquidacionimpuestoimpor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalleliquidacionimpuestoimpor.getId()<0) {
				this.detalleliquidacionimpuestoimpors.remove(this.detalleliquidacionimpuestoimpor);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleLiquidacionImpuestoImpor(List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsAux) throws Exception {
		DetalleLiquidacionImpuestoImporConstantesFunciones.setEstadosInicialesDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporsAux);
	}
	
	public void setEstadosInicialesDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux) throws Exception {
		DetalleLiquidacionImpuestoImporConstantesFunciones.setEstadosInicialesDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleLiquidacionImpuestoImporActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleLiquidacionImpuestoImporActual()) {
				if(!this.isEsNuevoDetalleLiquidacionImpuestoImpor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleLiquidacionImpuestoImpor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleLiquidacionImpuestoImporActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Liquidacion Impuesto Impor ?", "MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor) throws Exception {
		DetalleLiquidacionImpuestoImporConstantesFunciones.seleccionarAsignar(this.detalleliquidacionimpuestoimpor,detalleliquidacionimpuestoimpor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleLiquidacionImpuestoImpor=this.isPermisoActualizarOriginalDetalleLiquidacionImpuestoImpor;
			
			
			this.seleccionarAsignar(detalleliquidacionimpuestoimpor);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleLiquidacionImpuestoImporConstantesFunciones.quitarEspaciosDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalleliquidacionimpuestoimporSessionBean.setsFuncionBusquedaRapida(this.detalleliquidacionimpuestoimporSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleLiquidacionImpuestoImpor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleLiquidacionImpuestoImpor(esParaCancelar);				
				this.cancelarNuevoDetalleLiquidacionImpuestoImpor(esParaCancelar);								
			}
			
			this.detalleliquidacionimpuestoimpor=new DetalleLiquidacionImpuestoImpor();
			
			this.inicializarDetalleLiquidacionImpuestoImpor();
			
			this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleLiquidacionImpuestoImpor() throws Exception {
		try {
			DetalleLiquidacionImpuestoImporConstantesFunciones.inicializarDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleLiquidacionImpuestoImpors(String sAccionBusqueda,List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleLiquidacionImpuestoImpor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleLiquidacionImpuestoImporMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleLiquidacionImpuestoImporMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleLiquidacionImpuestoImpor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Liquidacion Impuesto Impores");		
		parameters.put("busquedapor", DetalleLiquidacionImpuestoImporConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleLiquidacionImpuestoImpor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleLiquidacionImpuestoImporConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleLiquidacionImpuestoImporConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleLiquidacionImpuestoImpor=new JRBeanArrayDataSource(DetalleLiquidacionImpuestoImporJInternalFrame.TraerDetalleLiquidacionImpuestoImporBeans(detalleliquidacionimpuestoimporsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleLiquidacionImpuestoImpor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleLiquidacionImpuestoImporConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleLiquidacionImpuestoImporBean.TraerDetalleLiquidacionImpuestoImporBeans(detalleliquidacionimpuestoimporsParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimpuestoimporsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimpuestoimporsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImporActionPerformed(null);
					//this.generarExcelReporteDetalleLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimpuestoimporsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimpuestoimporsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimpuestoimporsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimpuestoimporsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleLiquidacionImpuestoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpuestoimpor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleLiquidacionImpuestoImpors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleLiquidacionImpuestoImpor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor : detalleliquidacionimpuestoimporsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleLiquidacionImpuestoImporConstantesFunciones.generarExcelReporteDataDetalleLiquidacionImpuestoImpor("NORMAL",row,workbook,detalleliquidacionimpuestoimpor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleLiquidacionImpuestoImpor(String sTipo,Row row,Workbook workbook) {
		
		DetalleLiquidacionImpuestoImporConstantesFunciones.generarExcelReporteHeaderDetalleLiquidacionImpuestoImpor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleLiquidacionImpuestoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpuestoimpor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleLiquidacionImpuestoImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor : detalleliquidacionimpuestoimporsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleLiquidacionImpuestoImporDescripcion(detalleliquidacionimpuestoimpor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getliquidacionimpuestoimpor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getfob());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_arancel());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_aplicar());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getflete());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getseguro());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getbase_imponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_arancel());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_fodi());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_fodi());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_imponible());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleLiquidacionImpuestoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsRespaldo=null;
		
		classes=DetalleLiquidacionImpuestoImporConstantesFunciones.getClassesRelationshipsOfDetalleLiquidacionImpuestoImpor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalleliquidacionimpuestoimporLogic.setDatosCliente(this.datosCliente);
		this.detalleliquidacionimpuestoimporLogic.setDatosDeep(this.datosDeep);
		this.detalleliquidacionimpuestoimporLogic.setIsConDeep(true);
		
		detalleliquidacionimpuestoimporsRespaldo=this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors();
		
		this.detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(detalleliquidacionimpuestoimporsParaReportes);	
		this.detalleliquidacionimpuestoimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalleliquidacionimpuestoimporsParaReportes=this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors();
		this.detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(detalleliquidacionimpuestoimporsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpuestoimpor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleLiquidacionImpuestoImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleLiquidacionImpuestoImpor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor : detalleliquidacionimpuestoimporsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleLiquidacionImpuestoImpor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleLiquidacionImpuestoImporConstantesFunciones.generarExcelReporteDataDetalleLiquidacionImpuestoImpor("NORMAL",row,workbook,detalleliquidacionimpuestoimpor,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleLiquidacionImpuestoImporDescripcion(detalleliquidacionimpuestoimpor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleLiquidacionImpuestoImpor() throws Exception {		
		this.startProcessDetalleLiquidacionImpuestoImpor(true);
	}
	
	public void startProcessDetalleLiquidacionImpuestoImpor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor ,this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor, this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor,this.jPanelPaginacionDetalleLiquidacionImpuestoImpor, this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor, this.jPanelAccionesDetalleLiquidacionImpuestoImpor,this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor,this.jmenuBarDetalleLiquidacionImpuestoImpor,this.jmenuBarDetalleDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleDetalleLiquidacionImpuestoImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor=this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor; 
		
		final JPanel jPanelParametrosReportesDetalleLiquidacionImpuestoImpor=this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor;
		//final JScrollPane jScrollPanelDatosDetalleLiquidacionImpuestoImpor=this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor;
		final JTable jTableDatosDetalleLiquidacionImpuestoImpor=this.jTableDatosDetalleLiquidacionImpuestoImpor;		
		final JPanel jPanelPaginacionDetalleLiquidacionImpuestoImpor=this.jPanelPaginacionDetalleLiquidacionImpuestoImpor;
		//final JScrollPane jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor=this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor;
		final JPanel jPanelAccionesDetalleLiquidacionImpuestoImpor=this.jPanelAccionesDetalleLiquidacionImpuestoImpor;
		
		JPanel jPanelCamposAuxiliarDetalleLiquidacionImpuestoImpor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpuestoImpor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			jPanelCamposAuxiliarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelCamposDetalleLiquidacionImpuestoImpor;
			jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor;
		}
		
		final JPanel jPanelCamposDetalleLiquidacionImpuestoImpor=jPanelCamposAuxiliarDetalleLiquidacionImpuestoImpor;
		final JPanel jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor=jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpuestoImpor;
		
		
		final JMenuBar jmenuBarDetalleLiquidacionImpuestoImpor=this.jmenuBarDetalleLiquidacionImpuestoImpor;
		final JToolBar jTtoolBarDetalleLiquidacionImpuestoImpor=this.jTtoolBarDetalleLiquidacionImpuestoImpor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			jmenuBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jmenuBarDetalleDetalleLiquidacionImpuestoImpor;
			jTtoolBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTtoolBarDetalleDetalleLiquidacionImpuestoImpor;
		}
		
		final JMenuBar jmenuBarDetalleDetalleLiquidacionImpuestoImpor=jmenuBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor;
		final JToolBar jTtoolBarDetalleDetalleLiquidacionImpuestoImpor=jTtoolBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleLiquidacionImpuestoImpor;
			processRunnable.jTableDatos=jTableDatosDetalleLiquidacionImpuestoImpor;
			processRunnable.jPanelCampos=jPanelCamposDetalleLiquidacionImpuestoImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleLiquidacionImpuestoImpor;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleLiquidacionImpuestoImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleLiquidacionImpuestoImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleLiquidacionImpuestoImpor;
			processRunnable.jTtoolBar=jTtoolBarDetalleLiquidacionImpuestoImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleLiquidacionImpuestoImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor ,jPanelParametrosReportesDetalleLiquidacionImpuestoImpor,jTableDatosDetalleLiquidacionImpuestoImpor, /*jScrollPanelDatosDetalleLiquidacionImpuestoImpor,*/jPanelCamposDetalleLiquidacionImpuestoImpor,jPanelPaginacionDetalleLiquidacionImpuestoImpor, /*jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor,*/ jPanelAccionesDetalleLiquidacionImpuestoImpor,jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor,jmenuBarDetalleLiquidacionImpuestoImpor,jmenuBarDetalleDetalleLiquidacionImpuestoImpor,jTtoolBarDetalleLiquidacionImpuestoImpor,jTtoolBarDetalleDetalleLiquidacionImpuestoImpor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor ,jPanelParametrosReportesDetalleLiquidacionImpuestoImpor, jScrollPanelDatosDetalleLiquidacionImpuestoImpor,jPanelPaginacionDetalleLiquidacionImpuestoImpor, jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor, jPanelAccionesDetalleLiquidacionImpuestoImpor,jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor,jmenuBarDetalleLiquidacionImpuestoImpor,jmenuBarDetalleDetalleLiquidacionImpuestoImpor,jTtoolBarDetalleLiquidacionImpuestoImpor,jTtoolBarDetalleDetalleLiquidacionImpuestoImpor);
						
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
	
	public void finishProcessDetalleLiquidacionImpuestoImpor() {// throws Exception 
		this.finishProcessDetalleLiquidacionImpuestoImpor(true);
	}
	
	public void finishProcessDetalleLiquidacionImpuestoImpor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor ,this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor, this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor,this.jPanelPaginacionDetalleLiquidacionImpuestoImpor, this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor, this.jPanelAccionesDetalleLiquidacionImpuestoImpor,this.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor,this.jmenuBarDetalleLiquidacionImpuestoImpor,this.jmenuBarDetalleDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarDetalleDetalleLiquidacionImpuestoImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor=this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor; 
		
		final JPanel jPanelParametrosReportesDetalleLiquidacionImpuestoImpor=this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor;
		//final JScrollPane jScrollPanelDatosDetalleLiquidacionImpuestoImpor=this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor;
		final JTable jTableDatosDetalleLiquidacionImpuestoImpor=this.jTableDatosDetalleLiquidacionImpuestoImpor;		
		final JPanel jPanelPaginacionDetalleLiquidacionImpuestoImpor=this.jPanelPaginacionDetalleLiquidacionImpuestoImpor;
		//final JScrollPane jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor=this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor;
		final JPanel jPanelAccionesDetalleLiquidacionImpuestoImpor=this.jPanelAccionesDetalleLiquidacionImpuestoImpor;
		
		JPanel jPanelCamposAuxiliarDetalleLiquidacionImpuestoImpor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpuestoImpor=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			jPanelCamposAuxiliarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelCamposDetalleLiquidacionImpuestoImpor;
			jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor;
		}
		
		final JPanel jPanelCamposDetalleLiquidacionImpuestoImpor=jPanelCamposAuxiliarDetalleLiquidacionImpuestoImpor;
		final JPanel jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor=jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpuestoImpor;
		
		
		final JMenuBar jmenuBarDetalleLiquidacionImpuestoImpor=this.jmenuBarDetalleLiquidacionImpuestoImpor;		
		final JToolBar jTtoolBarDetalleLiquidacionImpuestoImpor=this.jTtoolBarDetalleLiquidacionImpuestoImpor;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			jmenuBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jmenuBarDetalleDetalleLiquidacionImpuestoImpor;
			jTtoolBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTtoolBarDetalleDetalleLiquidacionImpuestoImpor;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleLiquidacionImpuestoImpor=jmenuBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor;
		final JToolBar jTtoolBarDetalleDetalleLiquidacionImpuestoImpor=jTtoolBarDetalleAuxiliarDetalleLiquidacionImpuestoImpor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleLiquidacionImpuestoImpor;
			processRunnable.jTableDatos=jTableDatosDetalleLiquidacionImpuestoImpor;
			processRunnable.jPanelCampos=jPanelCamposDetalleLiquidacionImpuestoImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleLiquidacionImpuestoImpor;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleLiquidacionImpuestoImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleLiquidacionImpuestoImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleLiquidacionImpuestoImpor;
			processRunnable.jTtoolBar=jTtoolBarDetalleLiquidacionImpuestoImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleLiquidacionImpuestoImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor ,jPanelParametrosReportesDetalleLiquidacionImpuestoImpor, jTableDatosDetalleLiquidacionImpuestoImpor,/*jScrollPanelDatosDetalleLiquidacionImpuestoImpor,*/jPanelCamposDetalleLiquidacionImpuestoImpor,jPanelPaginacionDetalleLiquidacionImpuestoImpor, /*jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor,*/ jPanelAccionesDetalleLiquidacionImpuestoImpor,jPanelAccionesFormularioDetalleLiquidacionImpuestoImpor,jmenuBarDetalleLiquidacionImpuestoImpor,jmenuBarDetalleDetalleLiquidacionImpuestoImpor,jTtoolBarDetalleLiquidacionImpuestoImpor,jTtoolBarDetalleDetalleLiquidacionImpuestoImpor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleLiquidacionImpuestoImpor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleLiquidacionImpuestoImpor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleLiquidacionImpuestoImpor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleLiquidacionImpuestoImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleLiquidacionImpuestoImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleLiquidacionImpuestoImpor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleLiquidacionImpuestoImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleLiquidacionImpuestoImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleLiquidacionImpuestoImpor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalleliquidacionimpuestoimporConstantesFunciones.getsFinalQueryDetalleLiquidacionImpuestoImpor();
		String  finalQueryPaginacionTodos=this.detalleliquidacionimpuestoimporConstantesFunciones.getsFinalQueryDetalleLiquidacionImpuestoImpor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleLiquidacionImpuestoImporConstantesFunciones.getArrayColumnasGlobalesNoDetalleLiquidacionImpuestoImpor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleLiquidacionImpuestoImporConstantesFunciones.getArrayColumnasGlobalesDetalleLiquidacionImpuestoImpor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleLiquidacionImpuestoImporConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalleliquidacionimpuestoimporsEliminados= new ArrayList<DetalleLiquidacionImpuestoImpor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleLiquidacionImpuestoImpor();
		
				///*DetalleLiquidacionImpuestoImporSessionBean*/this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
			
			if(this.detalleliquidacionimpuestoimporSessionBean==null) {
				this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
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
					this.iNumeroPaginacion=DetalleLiquidacionImpuestoImporConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleLiquidacionImpuestoImporConstantesFunciones.getClassesForeignKeysOfDetalleLiquidacionImpuestoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalleliquidacionimpuestoimpor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalleliquidacionimpuestoimporsAux= new ArrayList<DetalleLiquidacionImpuestoImpor>();
			
				
			detalleliquidacionimpuestoimporLogic.setDatosCliente(this.datosCliente);
			detalleliquidacionimpuestoimporLogic.setDatosDeep(this.datosDeep);
			detalleliquidacionimpuestoimporLogic.setIsConDeep(true);
			
			
			detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImporDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalleliquidacionimpuestoimporLogic.getTodosDetalleLiquidacionImpuestoImpors(finalQueryGlobal,pagination);
					
					//detalleliquidacionimpuestoimporLogic.getTodosDetalleLiquidacionImpuestoImporsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()==null|| detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleliquidacionimpuestoimporsAux= new ArrayList<DetalleLiquidacionImpuestoImpor>();
							detalleliquidacionimpuestoimporsAux.addAll(detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpuestoimporsAux= new ArrayList<DetalleLiquidacionImpuestoImpor>();
							detalleliquidacionimpuestoimporsAux.addAll(detalleliquidacionimpuestoimpors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleliquidacionimpuestoimporLogic.getTodosDetalleLiquidacionImpuestoImpors(finalQueryGlobal+"",this.pagination);												
							
							//detalleliquidacionimpuestoimporLogic.getTodosDetalleLiquidacionImpuestoImporsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleLiquidacionImpuestoImpors("Todos",detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(new ArrayList<DetalleLiquidacionImpuestoImpor>());					
							detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().addAll(detalleliquidacionimpuestoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpuestoimpors=new ArrayList<DetalleLiquidacionImpuestoImpor>();
							detalleliquidacionimpuestoimpors.addAll(detalleliquidacionimpuestoimporsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleLiquidacionImpuestoImpor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleLiquidacionImpuestoImpor=this.idActual;
				
				} else if(this.idDetalleLiquidacionImpuestoImporActual!=null && this.idDetalleLiquidacionImpuestoImporActual!=0L) {
					idDetalleLiquidacionImpuestoImpor=idDetalleLiquidacionImpuestoImporActual;
				}
				
					
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndicePorId(idDetalleLiquidacionImpuestoImpor);
				
				this.detalleliquidacionimpuestoimpors=new ArrayList<DetalleLiquidacionImpuestoImpor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalleliquidacionimpuestoimporLogic.getEntity(idDetalleLiquidacionImpuestoImpor);
					
					//detalleliquidacionimpuestoimporLogic.getEntityWithConnection(idDetalleLiquidacionImpuestoImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(new ArrayList<DetalleLiquidacionImpuestoImpor>());
					detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().add(detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpuestoimpors=new ArrayList<DetalleLiquidacionImpuestoImpor>();
					this.detalleliquidacionimpuestoimpors.add(detalleliquidacionimpuestoimpor);
				}
				
				if(detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImporsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()==null||detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleliquidacionimpuestoimpors==null|| detalleliquidacionimpuestoimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimpuestoimporsAux=new ArrayList<DetalleLiquidacionImpuestoImpor>();
						detalleliquidacionimpuestoimporsAux.addAll(detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpuestoimporsAux=new ArrayList<DetalleLiquidacionImpuestoImpor>();
							detalleliquidacionimpuestoimporsAux.addAll(detalleliquidacionimpuestoimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImporsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleLiquidacionImpuestoImpors("FK_IdEmpresa",detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleLiquidacionImpuestoImpors("FK_IdEmpresa",detalleliquidacionimpuestoimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(new ArrayList<DetalleLiquidacionImpuestoImpor>());
						detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().addAll(detalleliquidacionimpuestoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpuestoimpors=new ArrayList<DetalleLiquidacionImpuestoImpor>();
							detalleliquidacionimpuestoimpors.addAll(detalleliquidacionimpuestoimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLiquidacionImpuestoImpor")) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdLiquidacionImpuestoImpor(id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImporsFK_IdLiquidacionImpuestoImpor(finalQueryGlobal,pagination,id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdLiquidacionImpuestoImpor(id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdLiquidacionImpuestoImpor(id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()==null||detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleliquidacionimpuestoimpors==null|| detalleliquidacionimpuestoimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimpuestoimporsAux=new ArrayList<DetalleLiquidacionImpuestoImpor>();
						detalleliquidacionimpuestoimporsAux.addAll(detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpuestoimporsAux=new ArrayList<DetalleLiquidacionImpuestoImpor>();
							detalleliquidacionimpuestoimporsAux.addAll(detalleliquidacionimpuestoimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImporsFK_IdLiquidacionImpuestoImpor(finalQueryGlobal,pagination,id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdLiquidacionImpuestoImpor(id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdLiquidacionImpuestoImpor(id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleLiquidacionImpuestoImpors("FK_IdLiquidacionImpuestoImpor",detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleLiquidacionImpuestoImpors("FK_IdLiquidacionImpuestoImpor",detalleliquidacionimpuestoimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(new ArrayList<DetalleLiquidacionImpuestoImpor>());
						detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().addAll(detalleliquidacionimpuestoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpuestoimpors=new ArrayList<DetalleLiquidacionImpuestoImpor>();
							detalleliquidacionimpuestoimpors.addAll(detalleliquidacionimpuestoimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImporsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()==null||detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleliquidacionimpuestoimpors==null|| detalleliquidacionimpuestoimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimpuestoimporsAux=new ArrayList<DetalleLiquidacionImpuestoImpor>();
						detalleliquidacionimpuestoimporsAux.addAll(detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpuestoimporsAux=new ArrayList<DetalleLiquidacionImpuestoImpor>();
							detalleliquidacionimpuestoimporsAux.addAll(detalleliquidacionimpuestoimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImporsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleLiquidacionImpuestoImpors("FK_IdSucursal",detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleLiquidacionImpuestoImpors("FK_IdSucursal",detalleliquidacionimpuestoimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(new ArrayList<DetalleLiquidacionImpuestoImpor>());
						detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().addAll(detalleliquidacionimpuestoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpuestoimpors=new ArrayList<DetalleLiquidacionImpuestoImpor>();
							detalleliquidacionimpuestoimpors.addAll(detalleliquidacionimpuestoimporsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleLiquidacionImpuestoImpor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleLiquidacionImpuestoImpor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleliquidacionimpuestoimpors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleliquidacionimpuestoimpors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor) {
		Boolean permite=true;
		
		if(this.detalleliquidacionimpuestoimpor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleLiquidacionImpuestoImporConstantesFunciones.getOrderByListaDetalleLiquidacionImpuestoImpor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleLiquidacionImpuestoImporConstantesFunciones.getOrderByListaDetalleLiquidacionImpuestoImpor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
				if(detalleliquidacionimpuestoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleliquidacionimpuestoimporTotales=detalleliquidacionimpuestoimpor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:this.detalleliquidacionimpuestoimpors) {
				if(detalleliquidacionimpuestoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleliquidacionimpuestoimporTotales=detalleliquidacionimpuestoimpor;
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
			this.detalleliquidacionimpuestoimporAux=new DetalleLiquidacionImpuestoImpor();
			this.detalleliquidacionimpuestoimporAux.setsType(Constantes2.S_TOTALES);
			this.detalleliquidacionimpuestoimporAux.setIsNew(false);
			this.detalleliquidacionimpuestoimporAux.setIsChanged(false);
			this.detalleliquidacionimpuestoimporAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleLiquidacionImpuestoImporConstantesFunciones.TotalizarValoresFilaDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors(),this.detalleliquidacionimpuestoimporAux);
				
				this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().add(this.detalleliquidacionimpuestoimporAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleLiquidacionImpuestoImporConstantesFunciones.TotalizarValoresFilaDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpors,this.detalleliquidacionimpuestoimporAux);
				
				this.detalleliquidacionimpuestoimpors.add(this.detalleliquidacionimpuestoimporAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalleliquidacionimpuestoimporTotales=new DetalleLiquidacionImpuestoImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().remove(detalleliquidacionimpuestoimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleliquidacionimpuestoimpors.remove(detalleliquidacionimpuestoimporTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalleliquidacionimpuestoimporTotales=new DetalleLiquidacionImpuestoImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
				if(detalleliquidacionimpuestoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleliquidacionimpuestoimporTotales=detalleliquidacionimpuestoimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleLiquidacionImpuestoImporConstantesFunciones.TotalizarValoresFilaDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors(),detalleliquidacionimpuestoimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:this.detalleliquidacionimpuestoimpors) {
				if(detalleliquidacionimpuestoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleliquidacionimpuestoimporTotales=detalleliquidacionimpuestoimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleLiquidacionImpuestoImporConstantesFunciones.TotalizarValoresFilaDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpors,detalleliquidacionimpuestoimporTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleLiquidacionImpuestoImporsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleLiquidacionImpuestoImporsFK_IdLiquidacionImpuestoImpor()throws Exception {
		try {
			sAccionBusqueda="FK_IdLiquidacionImpuestoImpor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleLiquidacionImpuestoImporsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleLiquidacionImpuestoImporsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImporsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleLiquidacionImpuestoImporsFK_IdLiquidacionImpuestoImpor(String sFinalQuery,Long id_liquidacion_impuesto_impor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImporsFK_IdLiquidacionImpuestoImpor(sFinalQuery,this.pagination,id_liquidacion_impuesto_impor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleLiquidacionImpuestoImporsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImporsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosDetalleLiquidacionImpuestoImpor() {
		this.isPermisoTodoDetalleLiquidacionImpuestoImpor=false;
		this.isPermisoNuevoDetalleLiquidacionImpuestoImpor=false;
		this.isPermisoActualizarDetalleLiquidacionImpuestoImpor=false;
		this.isPermisoActualizarOriginalDetalleLiquidacionImpuestoImpor=false;
		this.isPermisoEliminarDetalleLiquidacionImpuestoImpor=false;
		this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor=false;
		this.isPermisoConsultaDetalleLiquidacionImpuestoImpor=false;
		this.isPermisoBusquedaDetalleLiquidacionImpuestoImpor=false;
		this.isPermisoReporteDetalleLiquidacionImpuestoImpor=false;		
		this.isPermisoOrdenDetalleLiquidacionImpuestoImpor=false;		
		this.isPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor=false;		
		this.isPermisoPaginacionAltoDetalleLiquidacionImpuestoImpor=false;
		this.isPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor=false;
		this.isPermisoCopiarDetalleLiquidacionImpuestoImpor=false;		
		this.isPermisoVerFormDetalleLiquidacionImpuestoImpor=false;		
		this.isPermisoDuplicarDetalleLiquidacionImpuestoImpor=false;		
		this.isPermisoOrdenDetalleLiquidacionImpuestoImpor=false;		
	}
	
	public void setPermisosUsuarioDetalleLiquidacionImpuestoImpor(Boolean isPermiso) {
		this.isPermisoTodoDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoNuevoDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoActualizarDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoActualizarOriginalDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoEliminarDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoConsultaDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoBusquedaDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoReporteDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoOrdenDetalleLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoPaginacionAltoDetalleLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoCopiarDetalleLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoVerFormDetalleLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoDuplicarDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoOrdenDetalleLiquidacionImpuestoImpor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleLiquidacionImpuestoImpor(Boolean isPermiso) {
		//this.isPermisoTodoDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoNuevoDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoActualizarDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoActualizarOriginalDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoEliminarDetalleLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor=isPermiso;
		//this.isPermisoConsultaDetalleLiquidacionImpuestoImpor=isPermiso;
		//this.isPermisoBusquedaDetalleLiquidacionImpuestoImpor=isPermiso;
		//this.isPermisoReporteDetalleLiquidacionImpuestoImpor=isPermiso;
		//this.isPermisoOrdenDetalleLiquidacionImpuestoImpor=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleLiquidacionImpuestoImpor=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor=isPermiso;		
		//this.isPermisoCopiarDetalleLiquidacionImpuestoImpor=isPermiso;		
		//this.isPermisoDuplicarDetalleLiquidacionImpuestoImpor=isPermiso;
		//this.isPermisoOrdenDetalleLiquidacionImpuestoImpor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleLiquidacionImpuestoImporClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleLiquidacionImpuestoImpor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleLiquidacionImpuestoImporClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleLiquidacionImpuestoImporClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleLiquidacionImpuestoImporClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleLiquidacionImpuestoImporClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleLiquidacionImpuestoImpor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleLiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleLiquidacionImpuestoImpor=this.isPermisoActualizarDetalleLiquidacionImpuestoImpor;
			this.isPermisoEliminarDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleLiquidacionImpuestoImpor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleLiquidacionImpuestoImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleLiquidacionImpuestoImpor.setToolTipText(this.jTableDatosDetalleLiquidacionImpuestoImpor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleLiquidacionImpuestoImpor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleLiquidacionImpuestoImpor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleLiquidacionImpuestoImpor() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleLiquidacionImpuestoImporListas()throws Exception {
		try	{						
			
				this.liquidacionimpuestoimporsForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleLiquidacionImpuestoImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleLiquidacionImpuestoImporJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleLiquidacionImpuestoImporListas(false);
			} else {
			
				this.cargarCombosForeignKeyLiquidacionImpuestoImporListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyLiquidacionImpuestoImporListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.liquidacionimpuestoimporsForeignKey==null||this.liquidacionimpuestoimporsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LiquidacionImpuestoImporConstantesFunciones.getArrayColumnasGlobalesLiquidacionImpuestoImpor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LiquidacionImpuestoImporConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LiquidacionImpuestoImporConstantesFunciones.SFINALQUERY;

				this.cargarCombosLiquidacionImpuestoImporsForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyDetalleLiquidacionImpuestoImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleLiquidacionImpuestoImporParameterReturnGeneral detalleliquidacionimpuestoimporReturnGeneral=new DetalleLiquidacionImpuestoImporParameterReturnGeneral();
						
			


				String finalQueryGlobalLiquidacionImpuestoImpor="";

				if(((this.liquidacionimpuestoimporsForeignKey==null||this.liquidacionimpuestoimporsForeignKey.size()<=0) && this.detalleliquidacionimpuestoimporConstantesFunciones.cargarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor)
					 || (this.esRecargarFks && this.detalleliquidacionimpuestoimporConstantesFunciones.cargarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor)) {

					if(!this.detalleliquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionLiquidacionImpuestoImpor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LiquidacionImpuestoImporConstantesFunciones.getArrayColumnasGlobalesLiquidacionImpuestoImpor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLiquidacionImpuestoImpor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LiquidacionImpuestoImporConstantesFunciones.TABLENAME);

						finalQueryGlobalLiquidacionImpuestoImpor=Funciones.GetFinalQueryAppend(finalQueryGlobalLiquidacionImpuestoImpor, "");
						finalQueryGlobalLiquidacionImpuestoImpor+=LiquidacionImpuestoImporConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLiquidacionImpuestoImporsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLiquidacionImpuestoImpor=" WHERE " + ConstantesSql.ID + "="+detalleliquidacionimpuestoimporSessionBean.getlidLiquidacionImpuestoImporActual();
					}
				} else {
					finalQueryGlobalLiquidacionImpuestoImpor="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalleliquidacionimpuestoimporConstantesFunciones.cargarid_empresaDetalleLiquidacionImpuestoImpor)
					 || (this.esRecargarFks && this.detalleliquidacionimpuestoimporConstantesFunciones.cargarid_empresaDetalleLiquidacionImpuestoImpor)) {

					if(!this.detalleliquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalleliquidacionimpuestoimporSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detalleliquidacionimpuestoimporConstantesFunciones.cargarid_sucursalDetalleLiquidacionImpuestoImpor)
					 || (this.esRecargarFks && this.detalleliquidacionimpuestoimporConstantesFunciones.cargarid_sucursalDetalleLiquidacionImpuestoImpor)) {

					if(!this.detalleliquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detalleliquidacionimpuestoimporSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalleliquidacionimpuestoimporReturnGeneral=detalleliquidacionimpuestoimporLogic.cargarCombosLoteForeignKeyDetalleLiquidacionImpuestoImpor(finalQueryGlobalLiquidacionImpuestoImpor,finalQueryGlobalEmpresa,finalQueryGlobalSucursal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalLiquidacionImpuestoImpor.equals("NONE")) {
				this.liquidacionimpuestoimporsForeignKey=detalleliquidacionimpuestoimporReturnGeneral.getliquidacionimpuestoimporsForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalleliquidacionimpuestoimporReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detalleliquidacionimpuestoimporReturnGeneral.getsucursalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleLiquidacionImpuestoImpor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyLiquidacionImpuestoImpor();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyLiquidacionImpuestoImpor()throws Exception {
		try {
			if(this.detalleliquidacionimpuestoimporSessionBean==null) {
				this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
			}

			if(!this.detalleliquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionLiquidacionImpuestoImpor()) {
				LiquidacionImpuestoImpor liquidacionimpuestoimpor=new LiquidacionImpuestoImpor();
				LiquidacionImpuestoImporConstantesFunciones.setLiquidacionImpuestoImporDescripcion(liquidacionimpuestoimpor,Constantes.SMENSAJE_ESCOJA_OPCION);
				liquidacionimpuestoimpor.setId(null);

				if(!LiquidacionImpuestoImporConstantesFunciones.ExisteEnLista(this.liquidacionimpuestoimporsForeignKey,liquidacionimpuestoimpor,true)) {

					this.liquidacionimpuestoimporsForeignKey.add(0,liquidacionimpuestoimpor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.detalleliquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detalleliquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyDetalleLiquidacionImpuestoImpor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleLiquidacionImpuestoImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleLiquidacionImpuestoImpor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleLiquidacionImpuestoImpor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor)throws Exception {	
		try {
			
			this.setActualLiquidacionImpuestoImporForeignKey(detalleliquidacionimpuestoimpor.getid_liquidacion_impuesto_impor(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleLiquidacionImpuestoImpor()throws Exception {	
		try {
			
			this.setActualLiquidacionImpuestoImporForeignKey(this.detalleliquidacionimpuestoimporConstantesFunciones.getid_liquidacion_impuesto_impor(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleLiquidacionImpuestoImpor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleLiquidacionImpuestoImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleLiquidacionImpuestoImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleLiquidacionImpuestoImpor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleLiquidacionImpuestoImpor()throws Exception {
		try {
			

			this.cargarCombosFrameLiquidacionImpuestoImporsForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleLiquidacionImpuestoImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameLiquidacionImpuestoImporsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleLiquidacionImpuestoImpor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean(); 
		this.detalleliquidacionimpuestoimporConstantesFunciones=new DetalleLiquidacionImpuestoImporConstantesFunciones(); 
		this.detalleliquidacionimpuestoimporBean=new DetalleLiquidacionImpuestoImpor();//(this.detalleliquidacionimpuestoimporConstantesFunciones); 		
		this.detalleliquidacionimpuestoimporReturnGeneral=new DetalleLiquidacionImpuestoImporParameterReturnGeneral(); 
		
		this.detalleliquidacionimpuestoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleliquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleLiquidacionImpuestoImpor(true);
			
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
			
			this.detalleliquidacionimpuestoimporConstantesFunciones=new DetalleLiquidacionImpuestoImporConstantesFunciones(); 
			this.detalleliquidacionimpuestoimporBean=new DetalleLiquidacionImpuestoImpor();//this.detalleliquidacionimpuestoimporConstantesFunciones); 			
			this.detalleliquidacionimpuestoimporReturnGeneral=new DetalleLiquidacionImpuestoImporParameterReturnGeneral(); 
		
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Liquidacion Impuesto Impor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detalleliquidacionimpuestoimpor=new DetalleLiquidacionImpuestoImpor();
			this.detalleliquidacionimpuestoimpors = new ArrayList<DetalleLiquidacionImpuestoImpor>();
			this.detalleliquidacionimpuestoimporsAux = new ArrayList<DetalleLiquidacionImpuestoImpor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic=new DetalleLiquidacionImpuestoImporLogic();
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			//this.detalleliquidacionimpuestoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalleliquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor);	
					}
					
					if(this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor);
				this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setVisible(false);
				this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor);
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor);
					this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setVisible(false);
					this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor);
					this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setVisible(false);
					this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleLiquidacionImpuestoImporActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleLiquidacionImpuestoImporConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalleliquidacionimpuestoimporReturnGeneral=new DetalleLiquidacionImpuestoImporParameterReturnGeneral();
			
			this.detalleliquidacionimpuestoimporParameterGeneral=new DetalleLiquidacionImpuestoImporParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalleliquidacionimpuestoimporLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleLiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleLiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLiquidacionImpuestoImpor=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleLiquidacionImpuestoImpor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleLiquidacionImpuestoImpor(false);
			
			this.setPermisosUsuarioDetalleLiquidacionImpuestoImpor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() 
				|| (this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() && this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleLiquidacionImpuestoImporClasesRelacionadas();
			}
			
			if(this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleLiquidacionImpuestoImporClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleLiquidacionImpuestoImpor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleLiquidacionImpuestoImpor();
			}
			
			if(!this.isPermisoBusquedaDetalleLiquidacionImpuestoImpor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor,this.isPermisoPaginacionMedioDetalleLiquidacionImpuestoImpor,this.isPermisoPaginacionTodoDetalleLiquidacionImpuestoImpor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleLiquidacionImpuestoImporConstantesFunciones.getTiposSeleccionarDetalleLiquidacionImpuestoImpor());
				
				this.tiposColumnasSelect=DetalleLiquidacionImpuestoImporConstantesFunciones.getTiposSeleccionarDetalleLiquidacionImpuestoImpor(true);
				
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
			//if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleLiquidacionImpuestoImpor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleLiquidacionImpuestoImpor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleLiquidacionImpuestoImpor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleLiquidacionImpuestoImpor() ;
			
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
			
			this.liquidacionimpuestoimporLogic=new LiquidacionImpuestoImporLogic();
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
				detalleliquidacionimpuestoimporImplementable= (DetalleLiquidacionImpuestoImporImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleLiquidacionImpuestoImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalleliquidacionimpuestoimporImplementableHome= (DetalleLiquidacionImpuestoImporImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleLiquidacionImpuestoImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalleliquidacionimpuestoimpors= new ArrayList<DetalleLiquidacionImpuestoImpor>();
			this.detalleliquidacionimpuestoimporsEliminados= new ArrayList<DetalleLiquidacionImpuestoImpor>();
						
			this.isEsNuevoDetalleLiquidacionImpuestoImpor=false;
			this.esParaAccionDesdeFormularioDetalleLiquidacionImpuestoImpor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.liquidacionimpuestoimporsForeignKey=new ArrayList<LiquidacionImpuestoImpor>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleLiquidacionImpuestoImpor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleLiquidacionImpuestoImpor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleLiquidacionImpuestoImporConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleLiquidacionImpuestoImpor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleLiquidacionImpuestoImpor();
			}
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleLiquidacionImpuestoImpor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleLiquidacionImpuestoImpor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleLiquidacionImpuestoImpor() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleLiquidacionImpuestoImpor")) {
				iIndex=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleLiquidacionImpuestoImpor();	
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
	
	public void cargarCombosForeignKeyDetalleLiquidacionImpuestoImpor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleLiquidacionImpuestoImpor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleLiquidacionImpuestoImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleLiquidacionImpuestoImporListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleLiquidacionImpuestoImpor();
		
		this.cargarCombosFrameForeignKeyDetalleLiquidacionImpuestoImpor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleLiquidacionImpuestoImpor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleLiquidacionImpuestoImpor();
		}
	}
	
	

	public void cargarCombosForeignKeyLiquidacionImpuestoImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLiquidacionImpuestoImporListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLiquidacionImpuestoImpor();
				this.cargarCombosFrameLiquidacionImpuestoImporsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLiquidacionImpuestoImpor(this.liquidacionimpuestoimporsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
			
			if(jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount()>=1) {
				jTableDatosDetalleLiquidacionImpuestoImpor.removeRowSelectionInterval(0, jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleLiquidacionImpuestoImpor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleLiquidacionImpuestoImpor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleLiquidacionImpuestoImpor(true);			
			//this.detalleliquidacionimpuestoimpor=new DetalleLiquidacionImpuestoImpor();
			//this.detalleliquidacionimpuestoimpor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleLiquidacionImpuestoImpor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpuestoImpor() ;
			
			if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleLiquidacionImpuestoImpor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalleliquidacionimpuestoimpor);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);				
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
			if(this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleLiquidacionImpuestoImpor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRows().length;			
			}
			
			detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleLiquidacionImpuestoImpor--;			
				//DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux= new DetalleLiquidacionImpuestoImpor();			
				//detalleliquidacionimpuestoimporAux.setId(this.iIdNuevoDetalleLiquidacionImpuestoImpor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporOrigen=new DetalleLiquidacionImpuestoImpor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporOrigen : detalleliquidacionimpuestoimporsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalleliquidacionimpuestoimporOrigen =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpuestoimporOrigen =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleLiquidacionImpuestoImpor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalleliquidacionimpuestoimpor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporOrigen,this.detalleliquidacionimpuestoimpor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().add(this.detalleliquidacionimpuestoimporAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpors.add(this.detalleliquidacionimpuestoimporAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
				
				this.jTableDatosDetalleLiquidacionImpuestoImpor.setRowSelectionInterval(this.getIndiceNuevoDetalleLiquidacionImpuestoImpor(), this.getIndiceNuevoDetalleLiquidacionImpuestoImpor());
				
				int iLastRow =  this.jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleLiquidacionImpuestoImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleLiquidacionImpuestoImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();									
		
			DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporOrigen=new DetalleLiquidacionImpuestoImpor();
			DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporDestino=new DetalleLiquidacionImpuestoImpor();
				
			detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalleliquidacionimpuestoimporsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimpuestoimporOrigen =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleliquidacionimpuestoimporOrigen =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimpuestoimporDestino =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleliquidacionimpuestoimporDestino =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalleliquidacionimpuestoimporOrigen =detalleliquidacionimpuestoimporsSeleccionados.get(0);
				detalleliquidacionimpuestoimporDestino =detalleliquidacionimpuestoimporsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporOrigen,detalleliquidacionimpuestoimporDestino,true,false);
				
				detalleliquidacionimpuestoimporDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleliquidacionimpuestoimporDestino,detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleliquidacionimpuestoimporDestino,detalleliquidacionimpuestoimpors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
				
				//this.jTableDatosDetalleLiquidacionImpuestoImpor.setRowSelectionInterval(this.getIndiceNuevoDetalleLiquidacionImpuestoImpor(), this.getIndiceNuevoDetalleLiquidacionImpuestoImpor());
				
				int iLastRow =  this.jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleLiquidacionImpuestoImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleLiquidacionImpuestoImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setVisible(!isVisible);
			this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.setVisible(!isVisible);
			this.jPanelAccionesDetalleLiquidacionImpuestoImpor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleLiquidacionImpuestoImpor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleLiquidacionImpuestoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleLiquidacionImpuestoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleLiquidacionImpuestoImpor();
			
			this.abrirFrameOrderByDetalleLiquidacionImpuestoImpor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleLiquidacionImpuestoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleLiquidacionImpuestoImpor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setSize(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.iWidthFormulario,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jContentPaneDetalleDetalleLiquidacionImpuestoImpor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jContentPaneDetalleDetalleLiquidacionImpuestoImpor.getWidth(),DetalleLiquidacionImpuestoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jContentPaneDetalleDetalleLiquidacionImpuestoImpor.getWidth(),DetalleLiquidacionImpuestoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jContentPaneDetalleDetalleLiquidacionImpuestoImpor.getWidth(),DetalleLiquidacionImpuestoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleLiquidacionImpuestoImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor,false,this);
				} else {
					this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor);
				this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setVisible(false);
				this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setSelected(false);
				
				this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleLiquidacionImpuestoImpor"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleLiquidacionImpuestoImpor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleLiquidacionImpuestoImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor==null) {
				
				this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor=new ImportacionJInternalFrame(DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor);
				this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setVisible(false);
				this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setSelected(false);


				this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleLiquidacionImpuestoImpor"));
				this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleLiquidacionImpuestoImpor"));
				this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleLiquidacionImpuestoImpor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleLiquidacionImpuestoImpor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor==null) {
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor=new ReporteDinamicoJInternalFrame(DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor);
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleLiquidacionImpuestoImpor"));
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleLiquidacionImpuestoImpor"));
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleLiquidacionImpuestoImpor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleLiquidacionImpuestoImpor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor);
			
	       	this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.dispose();
			//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleLiquidacionImpuestoImpor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleLiquidacionImpuestoImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setVisible(true);
	        this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleLiquidacionImpuestoImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setVisible(true);
	        this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleLiquidacionImpuestoImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setVisible(false);
	        this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleLiquidacionImpuestoImpor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleLiquidacionImpuestoImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setVisible(false);
	        this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleLiquidacionImpuestoImpor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleLiquidacionImpuestoImpor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleLiquidacionImpuestoImpor(true);
			//this.isEsNuevoDetalleLiquidacionImpuestoImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleLiquidacionImpuestoImpor(false) ;
			
			if(detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleLiquidacionImpuestoImpor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpuestoImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleLiquidacionImpuestoImpor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleLiquidacionImpuestoImpor(true);
			//this.isEsNuevoDetalleLiquidacionImpuestoImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalleliquidacionimpuestoimpor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleLiquidacionImpuestoImpor(false) ;
			
			if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleLiquidacionImpuestoImpor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpuestoImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaLiquidacionImpuestoImpor(List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsForeignKey)throws Exception{
		TableColumn tableColumnLiquidacionImpuestoImpor=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR));
		TableCellEditor tableCellEditorLiquidacionImpuestoImpor =tableColumnLiquidacionImpuestoImpor.getCellEditor();

		LiquidacionImpuestoImporTableCell liquidacionimpuestoimporTableCellFk=(LiquidacionImpuestoImporTableCell)tableCellEditorLiquidacionImpuestoImpor;

		if(liquidacionimpuestoimporTableCellFk!=null) {
			liquidacionimpuestoimporTableCellFk.setliquidacionimpuestoimporsForeignKey(liquidacionimpuestoimporsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//liquidacionimpuestoimporTableCellFk.setRowActual(intSelectedRow);
			//liquidacionimpuestoimporTableCellFk.setliquidacionimpuestoimporsForeignKeyActual(liquidacionimpuestoimporsForeignKey);
		//}


		if(liquidacionimpuestoimporTableCellFk!=null) {
			liquidacionimpuestoimporTableCellFk.RecargarLiquidacionImpuestoImporsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	
	public void jButtonActualizarDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleLiquidacionImpuestoImpor(false);
			
			//if(!this.isEsNuevoDetalleLiquidacionImpuestoImpor) {								
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				
			}
			
			if(this.permiteMantenimiento(this.detalleliquidacionimpuestoimpor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleLiquidacionImpuestoImpor=true;
					this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
					this.isEsNuevoDetalleLiquidacionImpuestoImpor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleLiquidacionImpuestoImpor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleLiquidacionImpuestoImpor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleLiquidacionImpuestoImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpuestoImpor(false);
				
				this.habilitarDeshabilitarControlesDetalleLiquidacionImpuestoImpor(false);
			
												
				
				if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleLiquidacionImpuestoImpor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleLiquidacionImpuestoImpor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalleliquidacionimpuestoimpor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpuestoImpor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpuestoImpor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				this.detalleliquidacionimpuestoimpor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				this.detalleliquidacionimpuestoimpor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalleliquidacionimpuestoimpor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleLiquidacionImpuestoImporModel) this.jTableDatosDetalleLiquidacionImpuestoImpor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleLiquidacionImpuestoImpor=true;
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
				this.isEsNuevoDetalleLiquidacionImpuestoImpor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleLiquidacionImpuestoImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpuestoImpor(false);
				
				this.habilitarDeshabilitarControlesDetalleLiquidacionImpuestoImpor(false);
				
				
				
				if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleLiquidacionImpuestoImpor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount()>=1) {
				jTableDatosDetalleLiquidacionImpuestoImpor.removeRowSelectionInterval(0, jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleLiquidacionImpuestoImpor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleLiquidacionImpuestoImpor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpuestoImpor(false) ;
			
			this.isEsNuevoDetalleLiquidacionImpuestoImpor=false;
			
			if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleLiquidacionImpuestoImpor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				
				//SI ES MANUAL
				if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleLiquidacionImpuestoImpor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleLiquidacionImpuestoImpor--;			
			//DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux= new DetalleLiquidacionImpuestoImpor();			
			//detalleliquidacionimpuestoimporAux.setId(this.iIdNuevoDetalleLiquidacionImpuestoImpor);
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleLiquidacionImpuestoImpor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
			
			this.detalleliquidacionimpuestoimpor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().add(this.detalleliquidacionimpuestoimporAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalleliquidacionimpuestoimpors.add(this.detalleliquidacionimpuestoimporAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
			
			this.jTableDatosDetalleLiquidacionImpuestoImpor.setRowSelectionInterval(this.getIndiceNuevoDetalleLiquidacionImpuestoImpor(), this.getIndiceNuevoDetalleLiquidacionImpuestoImpor());
			
			int iLastRow =  this.jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleLiquidacionImpuestoImpor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleLiquidacionImpuestoImpor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
			
			//SI ES MANUAL
			if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleLiquidacionImpuestoImpor();
			}
			
			//this.abrirFrameTreeDetalleLiquidacionImpuestoImpor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Liquidacion Impuesto ImporES ?", "MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleLiquidacionImpuestoImpor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalleliquidacionimpuestoimporReturnGeneral=detalleliquidacionimpuestoimporLogic.procesarImportacionDetalleLiquidacionImpuestoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalleliquidacionimpuestoimporParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleLiquidacionImpuestoImporReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setFileImportacion(this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleLiquidacionImpuestoImpor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();		

		detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleLiquidacionImpuestoImporBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleLiquidacionImpuestoImporBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleLiquidacionImpuestoImpors("Todos",detalleliquidacionimpuestoimporsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LiquidacionImpuestoImpor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LiquidacionImpuestoImpor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LiquidacionImpuestoImpor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LiquidacionImpuestoImpor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_b_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_b_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_b_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_b_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeArancel_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeArancel_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeArancel_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeArancel_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeAplicar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeAplicar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeAplicar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeAplicar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_guro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_guro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_guro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_guro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_seImponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_seImponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_seImponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_seImponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorArancel_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorArancel_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorArancel_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorArancel_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorFodi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorFodi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorFodi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorFodi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeFodi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeFodi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeFodi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeFodi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorImponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorImponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorImponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorImponible_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR:
					sNombreCampoCategoria="id_liquidacion_impuesto_impor";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB:
					sNombreCampoCategoria="fob";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA:
					sNombreCampoCategoria="porcentaje_iva";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL:
					sNombreCampoCategoria="porcentaje_arancel";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR:
					sNombreCampoCategoria="porcentaje_aplicar";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoria="flete";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO:
					sNombreCampoCategoria="seguro";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoria="base_imponible";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL:
					sNombreCampoCategoria="valor_arancel";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI:
					sNombreCampoCategoria="valor_fodi";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA:
					sNombreCampoCategoria="valor_iva";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI:
					sNombreCampoCategoria="porcentaje_fodi";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE:
					sNombreCampoCategoria="valor_imponible";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR:
					sNombreCampoCategoriaValor="id_liquidacion_impuesto_impor";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB:
					sNombreCampoCategoriaValor="fob";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA:
					sNombreCampoCategoriaValor="porcentaje_iva";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL:
					sNombreCampoCategoriaValor="porcentaje_arancel";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR:
					sNombreCampoCategoriaValor="porcentaje_aplicar";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoriaValor="flete";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO:
					sNombreCampoCategoriaValor="seguro";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoriaValor="base_imponible";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL:
					sNombreCampoCategoriaValor="valor_arancel";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI:
					sNombreCampoCategoriaValor="valor_fodi";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA:
					sNombreCampoCategoriaValor="valor_iva";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI:
					sNombreCampoCategoriaValor="porcentaje_fodi";
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE:
					sNombreCampoCategoriaValor="valor_imponible";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Liquacion Impuesto Impor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_liquidacion_impuesto_impor");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fob",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fob");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_iva");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Arancel",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_arancel");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Aplicar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_aplicar");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Flete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"flete");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Seguro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"seguro");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Base Imponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"base_imponible");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Arancel",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_arancel");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Fodi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_fodi");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_iva");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Fodi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_fodi");
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Imponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_imponible");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();		
		
		detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpuestoimpor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleLiquidacionImpuestoImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getliquidacionimpuestoimpor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getfob());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_arancel());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_aplicar());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getflete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getseguro());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getbase_imponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_arancel());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_fodi());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_fodi());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE);
					iRow++;

					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor:detalleliquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_imponible());
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
			//	this.getFilaCabeceraExportarExcelDetalleLiquidacionImpuestoImpor(row);				
			//	iRow++;
			//}				
			
			//for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimporsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
			
			//SI ES MANUAL
			if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleLiquidacionImpuestoImpor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
			
			//SI ES MANUAL
			if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleLiquidacionImpuestoImpor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
			
			//SI ES MANUAL
			if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleLiquidacionImpuestoImpor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleLiquidacionImpuestoImpor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleLiquidacionImpuestoImpor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleLiquidacionImpuestoImpor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleLiquidacionImpuestoImpor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleLiquidacionImpuestoImpor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleLiquidacionImpuestoImpor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleLiquidacionImpuestoImpor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleLiquidacionImpuestoImpor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleLiquidacionImpuestoImpor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleLiquidacionImpuestoImpor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor();
		
		this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpuestoImpor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleLiquidacionImpuestoImpor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleLiquidacionImpuestoImpor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleLiquidacionImpuestoImpor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleLiquidacionImpuestoImpor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jCheckBoxPostAccionNuevoDetalleLiquidacionImpuestoImpor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpuestoImpor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpuestoImpor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleLiquidacionImpuestoImpor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jCheckBoxPostAccionNuevoDetalleLiquidacionImpuestoImpor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpuestoImpor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpuestoImpor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleLiquidacionImpuestoImpor(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleLiquidacionImpuestoImpor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleLiquidacionImpuestoImpor() throws Exception {
		try	{
			if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleLiquidacionImpuestoImpor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleLiquidacionImpuestoImpor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleLiquidacionImpuestoImpor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			
			if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleLiquidacionImpuestoImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleLiquidacionImpuestoImpor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleLiquidacionImpuestoImpor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleLiquidacionImpuestoImporConstantesFunciones.getTiposSeleccionarDetalleLiquidacionImpuestoImpor(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleLiquidacionImpuestoImporConstantesFunciones.getTiposSeleccionarDetalleLiquidacionImpuestoImpor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleLiquidacionImpuestoImporConstantesFunciones.getTiposSeleccionarDetalleLiquidacionImpuestoImpor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleLiquidacionImpuestoImpor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.getSelectedItem()!=null){this.id_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor=((LiquidacionImpuestoImpor)this.jComboBoxid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleLiquidacionImpuestoImpor(Boolean esInicializar) throws Exception {				
		if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleLiquidacionImpuestoImpor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor() throws Exception {
		this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleLiquidacionImpuestoImpor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImporOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImporOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalleliquidacionimpuestoimpors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleLiquidacionImpuestoImpor.setModel(new DetalleLiquidacionImpuestoImporModel(this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleLiquidacionImpuestoImpor.setModel(new DetalleLiquidacionImpuestoImporModel(this.detalleliquidacionimpuestoimpors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleLiquidacionImpuestoImpor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,detalleliquidacionimpuestoimporConstantesFunciones.resaltarSeleccionarDetalleLiquidacionImpuestoImpor,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,detalleliquidacionimpuestoimporConstantesFunciones.resaltarSeleccionarDetalleLiquidacionImpuestoImpor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_ID));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostraridDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltaridDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activaridDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"idDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltaridDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activaridDetalleLiquidacionImpuestoImpor,this,true,"idDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LiquidacionImpuestoImporTableCell(this.liquidacionimpuestoimporsForeignKey,this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor,this,this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor,iSizeTabla));
			tableColumn.setCellEditor(new LiquidacionImpuestoImporTableCell(this.liquidacionimpuestoimporsForeignKey,this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor,this,this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor,true,"id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarid_empresaDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_empresaDetalleLiquidacionImpuestoImpor,this,this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_empresaDetalleLiquidacionImpuestoImpor,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_empresaDetalleLiquidacionImpuestoImpor,this,this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_empresaDetalleLiquidacionImpuestoImpor,false,"id_empresaDetalleLiquidacionImpuestoImpor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarid_sucursalDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_sucursalDetalleLiquidacionImpuestoImpor,this,this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_sucursalDetalleLiquidacionImpuestoImpor,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_sucursalDetalleLiquidacionImpuestoImpor,this,this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_sucursalDetalleLiquidacionImpuestoImpor,false,"id_sucursalDetalleLiquidacionImpuestoImpor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarcantidadDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarcantidadDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarcantidadDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"cantidadDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarcantidadDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarcantidadDetalleLiquidacionImpuestoImpor,this,true,"cantidadDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalorDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalorDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalorDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"valorDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalorDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalorDetalleLiquidacionImpuestoImpor,this,true,"valorDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarfobDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarfobDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarfobDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"fobDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarfobDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarfobDetalleLiquidacionImpuestoImpor,this,true,"fobDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_ivaDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_ivaDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_ivaDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"porcentaje_ivaDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_ivaDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_ivaDetalleLiquidacionImpuestoImpor,this,true,"porcentaje_ivaDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_arancelDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_arancelDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_arancelDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"porcentaje_arancelDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_arancelDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_arancelDetalleLiquidacionImpuestoImpor,this,true,"porcentaje_arancelDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_aplicarDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_aplicarDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_aplicarDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"porcentaje_aplicarDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_aplicarDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_aplicarDetalleLiquidacionImpuestoImpor,this,true,"porcentaje_aplicarDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarfleteDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarfleteDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarfleteDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"fleteDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarfleteDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarfleteDetalleLiquidacionImpuestoImpor,this,true,"fleteDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarseguroDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarseguroDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarseguroDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"seguroDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarseguroDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarseguroDetalleLiquidacionImpuestoImpor,this,true,"seguroDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarbase_imponibleDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarbase_imponibleDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarbase_imponibleDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"base_imponibleDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarbase_imponibleDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarbase_imponibleDetalleLiquidacionImpuestoImpor,this,true,"base_imponibleDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_arancelDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_arancelDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_arancelDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"valor_arancelDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_arancelDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_arancelDetalleLiquidacionImpuestoImpor,this,true,"valor_arancelDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_fodiDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_fodiDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_fodiDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"valor_fodiDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_fodiDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_fodiDetalleLiquidacionImpuestoImpor,this,true,"valor_fodiDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_ivaDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_ivaDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_ivaDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"valor_ivaDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_ivaDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_ivaDetalleLiquidacionImpuestoImpor,this,true,"valor_ivaDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarnumero_comprobanteDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarnumero_comprobanteDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarnumero_comprobanteDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"numero_comprobanteDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarnumero_comprobanteDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarnumero_comprobanteDetalleLiquidacionImpuestoImpor,this,true,"numero_comprobanteDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_fodiDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_fodiDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_fodiDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"porcentaje_fodiDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_fodiDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_fodiDetalleLiquidacionImpuestoImpor,this,true,"porcentaje_fodiDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE));

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_imponibleDetalleLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_imponibleDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_imponibleDetalleLiquidacionImpuestoImpor,iSizeTabla,this,true,"valor_imponibleDetalleLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_imponibleDetalleLiquidacionImpuestoImpor,this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_imponibleDetalleLiquidacionImpuestoImpor,this,true,"valor_imponibleDetalleLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleLiquidacionImpuestoImpor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleLiquidacionImpuestoImpor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleLiquidacionImpuestoImpor.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleLiquidacionImpuestoImpor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleLiquidacionImpuestoImpor.moveColumn(this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleLiquidacionImpuestoImpor.moveColumn(this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleLiquidacionImpuestoImpor.moveColumn(this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleLiquidacionImpuestoImpor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleLiquidacionImpuestoImpor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleLiquidacionImpuestoImpor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleLiquidacionImpuestoImpor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalleliquidacionimpuestoimpors.size()-1;
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
		//this.jTableDatosDetalleLiquidacionImpuestoImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleLiquidacionImpuestoImpor();
			
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
				
				//this.isEsNuevoDetalleLiquidacionImpuestoImpor=false;
					
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
				if(this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalleliquidacionimpuestoimpor.getsType().equals("DUPLICADO")
				   || this.detalleliquidacionimpuestoimpor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleLiquidacionImpuestoImpor=true;
				
				} else {
					this.isEsNuevoDetalleLiquidacionImpuestoImpor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					if(this.detalleliquidacionimpuestoimpor.getId()>=0 && !this.detalleliquidacionimpuestoimpor.getIsNew()) {						
						this.isEsNuevoDetalleLiquidacionImpuestoImpor=false;
						
					} else {
						this.isEsNuevoDetalleLiquidacionImpuestoImpor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleLiquidacionImpuestoImpor(esRelaciones);						
				
				this.seleccionarDetalleLiquidacionImpuestoImpor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalleliquidacionimpuestoimpor.getId()<0) {
					this.isEsNuevoDetalleLiquidacionImpuestoImpor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleLiquidacionImpuestoImpor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleLiquidacionImpuestoImpor(evt,rowIndex);
				}	
				
				if(this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleLiquidacionImpuestoImpor: " + this.dDif); 
					}
				}								
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleLiquidacionImpuestoImpor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalleliquidacionimpuestoimpor)) {
					if(this.detalleliquidacionimpuestoimpor.getId()>0) {
						this.detalleliquidacionimpuestoimpor.setIsDeleted(true);
						
						this.detalleliquidacionimpuestoimporsEliminados.add(this.detalleliquidacionimpuestoimpor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().remove(this.detalleliquidacionimpuestoimpor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpors.remove(this.detalleliquidacionimpuestoimpor);				
					}
					
					
					((DetalleLiquidacionImpuestoImporModel) this.jTableDatosDetalleLiquidacionImpuestoImpor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleLiquidacionImpuestoImpor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleLiquidacionImpuestoImpor) {
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}
				
				//ARCHITECTURE
				try {
					

					//LiquidacionImpuestoImpor
					if(!this.detalleliquidacionimpuestoimporConstantesFunciones.cargarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor || this.detalleliquidacionimpuestoimporConstantesFunciones.event_dependid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor) {
						//this.cargarCombosLiquidacionImpuestoImporsForeignKeyLista(" where id="+this.detalleliquidacionimpuestoimpor.getid_liquidacion_impuesto_impor());
									//this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
						this.liquidacionimpuestoimporsForeignKey=new ArrayList<LiquidacionImpuestoImpor>();

						if(detalleliquidacionimpuestoimpor.getLiquidacionImpuestoImpor()!=null) {
							this.liquidacionimpuestoimporsForeignKey.add(detalleliquidacionimpuestoimpor.getLiquidacionImpuestoImpor());
						}

						this.addItemDefectoCombosForeignKeyLiquidacionImpuestoImpor();
						this.cargarCombosFrameLiquidacionImpuestoImporsForeignKey("Todos");
					}
					this.setActualLiquidacionImpuestoImporForeignKey(this.detalleliquidacionimpuestoimpor.getid_liquidacion_impuesto_impor(),false,"Formulario");

					//Empresa
					if(!this.detalleliquidacionimpuestoimporConstantesFunciones.cargarid_empresaDetalleLiquidacionImpuestoImpor || this.detalleliquidacionimpuestoimporConstantesFunciones.event_dependid_empresaDetalleLiquidacionImpuestoImpor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalleliquidacionimpuestoimpor.getid_empresa());
									//this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalleliquidacionimpuestoimpor.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalleliquidacionimpuestoimpor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalleliquidacionimpuestoimpor.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detalleliquidacionimpuestoimporConstantesFunciones.cargarid_sucursalDetalleLiquidacionImpuestoImpor || this.detalleliquidacionimpuestoimporConstantesFunciones.event_dependid_sucursalDetalleLiquidacionImpuestoImpor) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detalleliquidacionimpuestoimpor.getid_sucursal());
									//this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detalleliquidacionimpuestoimpor.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detalleliquidacionimpuestoimpor.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detalleliquidacionimpuestoimpor.getid_sucursal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleLiquidacionImpuestoImpor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpuestoImpor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimpor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimpor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimpor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimpor);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelidDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getId().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalorDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfobDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getfob().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getporcentaje_iva().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getporcentaje_arancel().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getporcentaje_aplicar().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfleteDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getflete().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldseguroDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getseguro().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getbase_imponible().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getvalor_arancel().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getvalor_fodi().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getvalor_iva().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getnumero_comprobante().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getporcentaje_fodi().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getvalor_imponible().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalleliquidacionimpuestoimporLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalleliquidacionimpuestoimporLocal=this.detalleliquidacionimpuestoimpor;
			} else {
				detalleliquidacionimpuestoimporLocal=this.detalleliquidacionimpuestoimporAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalleliquidacionimpuestoimporLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporLocal,true);
					
					if(detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalleliquidacionimpuestoimporLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalleliquidacionimpuestoimporLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimpor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimpor);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimpor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelidDetalleLiquidacionImpuestoImpor.getText()==null || this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelidDetalleLiquidacionImpuestoImpor.getText()=="" || this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelidDetalleLiquidacionImpuestoImpor.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelidDetalleLiquidacionImpuestoImpor.setText("0");
			}

			if(conColumnasBase) {detalleliquidacionimpuestoimpor.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelidDetalleLiquidacionImpuestoImpor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelIdDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldcantidadDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelcantidadDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalorDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalorDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setfob(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfobDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelfobDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setporcentaje_iva(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_ivaDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setporcentaje_arancel(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_arancelDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setporcentaje_aplicar(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_aplicarDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setflete(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfleteDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelfleteDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setseguro(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldseguroDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelseguroDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setbase_imponible(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelbase_imponibleDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setvalor_arancel(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_arancelDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setvalor_fodi(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_fodiDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setvalor_iva(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_ivaDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setnumero_comprobante(Integer.parseInt(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelnumero_comprobanteDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setporcentaje_fodi(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelporcentaje_fodiDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpuestoimpor.setvalor_imponible(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelvalor_imponibleDetalleLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporBean,DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporBean.getid_liquidacion_impuesto_impor()!=null && !detalleliquidacionimpuestoimporBean.getid_liquidacion_impuesto_impor().equals(-1L))) {detalleliquidacionimpuestoimpor.setid_liquidacion_impuesto_impor(detalleliquidacionimpuestoimporBean.getid_liquidacion_impuesto_impor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporOrigen,DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getId()!=null && !detalleliquidacionimpuestoimporOrigen.getId().equals(0L))) {detalleliquidacionimpuestoimpor.setId(detalleliquidacionimpuestoimporOrigen.getId());}}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getid_liquidacion_impuesto_impor()!=null && !detalleliquidacionimpuestoimporOrigen.getid_liquidacion_impuesto_impor().equals(-1L))) {detalleliquidacionimpuestoimpor.setid_liquidacion_impuesto_impor(detalleliquidacionimpuestoimporOrigen.getid_liquidacion_impuesto_impor());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getcantidad()!=null && !detalleliquidacionimpuestoimporOrigen.getcantidad().equals(0))) {detalleliquidacionimpuestoimpor.setcantidad(detalleliquidacionimpuestoimporOrigen.getcantidad());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getvalor()!=null && !detalleliquidacionimpuestoimporOrigen.getvalor().equals(0.0))) {detalleliquidacionimpuestoimpor.setvalor(detalleliquidacionimpuestoimporOrigen.getvalor());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getfob()!=null && !detalleliquidacionimpuestoimporOrigen.getfob().equals(0.0))) {detalleliquidacionimpuestoimpor.setfob(detalleliquidacionimpuestoimporOrigen.getfob());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getporcentaje_iva()!=null && !detalleliquidacionimpuestoimporOrigen.getporcentaje_iva().equals(0.0))) {detalleliquidacionimpuestoimpor.setporcentaje_iva(detalleliquidacionimpuestoimporOrigen.getporcentaje_iva());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getporcentaje_arancel()!=null && !detalleliquidacionimpuestoimporOrigen.getporcentaje_arancel().equals(0.0))) {detalleliquidacionimpuestoimpor.setporcentaje_arancel(detalleliquidacionimpuestoimporOrigen.getporcentaje_arancel());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getporcentaje_aplicar()!=null && !detalleliquidacionimpuestoimporOrigen.getporcentaje_aplicar().equals(0.0))) {detalleliquidacionimpuestoimpor.setporcentaje_aplicar(detalleliquidacionimpuestoimporOrigen.getporcentaje_aplicar());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getflete()!=null && !detalleliquidacionimpuestoimporOrigen.getflete().equals(0.0))) {detalleliquidacionimpuestoimpor.setflete(detalleliquidacionimpuestoimporOrigen.getflete());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getseguro()!=null && !detalleliquidacionimpuestoimporOrigen.getseguro().equals(0.0))) {detalleliquidacionimpuestoimpor.setseguro(detalleliquidacionimpuestoimporOrigen.getseguro());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getbase_imponible()!=null && !detalleliquidacionimpuestoimporOrigen.getbase_imponible().equals(0.0))) {detalleliquidacionimpuestoimpor.setbase_imponible(detalleliquidacionimpuestoimporOrigen.getbase_imponible());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getvalor_arancel()!=null && !detalleliquidacionimpuestoimporOrigen.getvalor_arancel().equals(0.0))) {detalleliquidacionimpuestoimpor.setvalor_arancel(detalleliquidacionimpuestoimporOrigen.getvalor_arancel());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getvalor_fodi()!=null && !detalleliquidacionimpuestoimporOrigen.getvalor_fodi().equals(0.0))) {detalleliquidacionimpuestoimpor.setvalor_fodi(detalleliquidacionimpuestoimporOrigen.getvalor_fodi());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getvalor_iva()!=null && !detalleliquidacionimpuestoimporOrigen.getvalor_iva().equals(0.0))) {detalleliquidacionimpuestoimpor.setvalor_iva(detalleliquidacionimpuestoimporOrigen.getvalor_iva());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getnumero_comprobante()!=null && !detalleliquidacionimpuestoimporOrigen.getnumero_comprobante().equals(0))) {detalleliquidacionimpuestoimpor.setnumero_comprobante(detalleliquidacionimpuestoimporOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getporcentaje_fodi()!=null && !detalleliquidacionimpuestoimporOrigen.getporcentaje_fodi().equals(0.0))) {detalleliquidacionimpuestoimpor.setporcentaje_fodi(detalleliquidacionimpuestoimporOrigen.getporcentaje_fodi());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporOrigen.getvalor_imponible()!=null && !detalleliquidacionimpuestoimporOrigen.getvalor_imponible().equals(0.0))) {detalleliquidacionimpuestoimpor.setvalor_imponible(detalleliquidacionimpuestoimporOrigen.getvalor_imponible());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelidDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getId().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalorDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfobDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getfob().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getporcentaje_iva().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getporcentaje_arancel().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getporcentaje_aplicar().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfleteDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getflete().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldseguroDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getseguro().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getbase_imponible().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getvalor_arancel().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getvalor_fodi().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getvalor_iva().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getnumero_comprobante().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getporcentaje_fodi().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimpor.getvalor_imponible().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImporBean detalleliquidacionimpuestoimporBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelidDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getcantidad().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalorDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfobDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getfob().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getporcentaje_iva().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getporcentaje_arancel().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getporcentaje_aplicar().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfleteDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getflete().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldseguroDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getseguro().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getbase_imponible().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getvalor_arancel().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getvalor_fodi().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getvalor_iva().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getnumero_comprobante().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getporcentaje_fodi().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setText(detalleliquidacionimpuestoimporBean.getvalor_imponible().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImporParameterReturnGeneral detalleliquidacionimpuestoimporReturnGeneral,DetalleLiquidacionImpuestoImporBean detalleliquidacionimpuestoimporBean,Boolean conDefault) throws Exception { 
		try {
			DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporLocal=new DetalleLiquidacionImpuestoImpor();
			
			detalleliquidacionimpuestoimporLocal=detalleliquidacionimpuestoimporReturnGeneral.getDetalleLiquidacionImpuestoImpor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getId()!=null && !detalleliquidacionimpuestoimporLocal.getId().equals(0L))) {detalleliquidacionimpuestoimporBean.setId(detalleliquidacionimpuestoimporLocal.getId());}}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getid_liquidacion_impuesto_impor()!=null && !detalleliquidacionimpuestoimporLocal.getid_liquidacion_impuesto_impor().equals(-1L))) {detalleliquidacionimpuestoimporBean.setid_liquidacion_impuesto_impor(detalleliquidacionimpuestoimporLocal.getid_liquidacion_impuesto_impor());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getcantidad()!=null && !detalleliquidacionimpuestoimporLocal.getcantidad().equals(0))) {detalleliquidacionimpuestoimporBean.setcantidad(detalleliquidacionimpuestoimporLocal.getcantidad());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getvalor()!=null && !detalleliquidacionimpuestoimporLocal.getvalor().equals(0.0))) {detalleliquidacionimpuestoimporBean.setvalor(detalleliquidacionimpuestoimporLocal.getvalor());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getfob()!=null && !detalleliquidacionimpuestoimporLocal.getfob().equals(0.0))) {detalleliquidacionimpuestoimporBean.setfob(detalleliquidacionimpuestoimporLocal.getfob());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getporcentaje_iva()!=null && !detalleliquidacionimpuestoimporLocal.getporcentaje_iva().equals(0.0))) {detalleliquidacionimpuestoimporBean.setporcentaje_iva(detalleliquidacionimpuestoimporLocal.getporcentaje_iva());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getporcentaje_arancel()!=null && !detalleliquidacionimpuestoimporLocal.getporcentaje_arancel().equals(0.0))) {detalleliquidacionimpuestoimporBean.setporcentaje_arancel(detalleliquidacionimpuestoimporLocal.getporcentaje_arancel());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getporcentaje_aplicar()!=null && !detalleliquidacionimpuestoimporLocal.getporcentaje_aplicar().equals(0.0))) {detalleliquidacionimpuestoimporBean.setporcentaje_aplicar(detalleliquidacionimpuestoimporLocal.getporcentaje_aplicar());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getflete()!=null && !detalleliquidacionimpuestoimporLocal.getflete().equals(0.0))) {detalleliquidacionimpuestoimporBean.setflete(detalleliquidacionimpuestoimporLocal.getflete());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getseguro()!=null && !detalleliquidacionimpuestoimporLocal.getseguro().equals(0.0))) {detalleliquidacionimpuestoimporBean.setseguro(detalleliquidacionimpuestoimporLocal.getseguro());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getbase_imponible()!=null && !detalleliquidacionimpuestoimporLocal.getbase_imponible().equals(0.0))) {detalleliquidacionimpuestoimporBean.setbase_imponible(detalleliquidacionimpuestoimporLocal.getbase_imponible());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getvalor_arancel()!=null && !detalleliquidacionimpuestoimporLocal.getvalor_arancel().equals(0.0))) {detalleliquidacionimpuestoimporBean.setvalor_arancel(detalleliquidacionimpuestoimporLocal.getvalor_arancel());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getvalor_fodi()!=null && !detalleliquidacionimpuestoimporLocal.getvalor_fodi().equals(0.0))) {detalleliquidacionimpuestoimporBean.setvalor_fodi(detalleliquidacionimpuestoimporLocal.getvalor_fodi());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getvalor_iva()!=null && !detalleliquidacionimpuestoimporLocal.getvalor_iva().equals(0.0))) {detalleliquidacionimpuestoimporBean.setvalor_iva(detalleliquidacionimpuestoimporLocal.getvalor_iva());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getnumero_comprobante()!=null && !detalleliquidacionimpuestoimporLocal.getnumero_comprobante().equals(0))) {detalleliquidacionimpuestoimporBean.setnumero_comprobante(detalleliquidacionimpuestoimporLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getporcentaje_fodi()!=null && !detalleliquidacionimpuestoimporLocal.getporcentaje_fodi().equals(0.0))) {detalleliquidacionimpuestoimporBean.setporcentaje_fodi(detalleliquidacionimpuestoimporLocal.getporcentaje_fodi());}
			if(conDefault || (!conDefault && detalleliquidacionimpuestoimporLocal.getvalor_imponible()!=null && !detalleliquidacionimpuestoimporLocal.getvalor_imponible().equals(0.0))) {detalleliquidacionimpuestoimporBean.setvalor_imponible(detalleliquidacionimpuestoimporLocal.getvalor_imponible());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleLiquidacionImpuestoImporGenerico(Long idDetalleLiquidacionImpuestoImporSeleccionado,JComboBox jComboBoxDetalleLiquidacionImpuestoImpor,List<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsLocal)throws Exception {
		try {
			DetalleLiquidacionImpuestoImpor  detalleliquidacionimpuestoimporTemp=null;

			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimporsLocal) {
				if(detalleliquidacionimpuestoimporAux.getId()!=null && detalleliquidacionimpuestoimporAux.getId().equals(idDetalleLiquidacionImpuestoImporSeleccionado)) {
					detalleliquidacionimpuestoimporTemp=detalleliquidacionimpuestoimporAux;
					break;
				}
			}

			jComboBoxDetalleLiquidacionImpuestoImpor.setSelectedItem(detalleliquidacionimpuestoimporTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleLiquidacionImpuestoImporGenerico(JComboBox jComboBoxDetalleLiquidacionImpuestoImpor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleLiquidacionImpuestoImpor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleLiquidacionImpuestoImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleLiquidacionImpuestoImpor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleLiquidacionImpuestoImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleliquidacionimpuestoimpor=(DetalleLiquidacionImpuestoImpor) detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) detalleliquidacionimpuestoimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("LiquidacionImpuestoImpor")) {
			//sDescripcion=this.getActualLiquidacionImpuestoImporForeignKeyDescripcion((Long)value);
			if(!detalleliquidacionimpuestoimpor.getIsNew() && !detalleliquidacionimpuestoimpor.getIsChanged() && !detalleliquidacionimpuestoimpor.getIsDeleted()) {
				sDescripcion=detalleliquidacionimpuestoimpor.getliquidacionimpuestoimpor_descripcion();
			} else {
				//sDescripcion=this.getActualLiquidacionImpuestoImporForeignKeyDescripcion((Long)value);
				sDescripcion=detalleliquidacionimpuestoimpor.getliquidacionimpuestoimpor_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalleliquidacionimpuestoimpor.getIsNew() && !detalleliquidacionimpuestoimpor.getIsChanged() && !detalleliquidacionimpuestoimpor.getIsDeleted()) {
				sDescripcion=detalleliquidacionimpuestoimpor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleliquidacionimpuestoimpor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detalleliquidacionimpuestoimpor.getIsNew() && !detalleliquidacionimpuestoimpor.getIsChanged() && !detalleliquidacionimpuestoimpor.getIsDeleted()) {
				sDescripcion=detalleliquidacionimpuestoimpor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detalleliquidacionimpuestoimpor.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporRow=new DetalleLiquidacionImpuestoImpor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleliquidacionimpuestoimporRow=(DetalleLiquidacionImpuestoImpor) detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleliquidacionimpuestoimporRow=(DetalleLiquidacionImpuestoImpor) detalleliquidacionimpuestoimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleLiquidacionImpuestoImpor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor && this.isPermisoNuevoDetalleLiquidacionImpuestoImpor));			
			this.jButtonDuplicarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor && this.isPermisoDuplicarDetalleLiquidacionImpuestoImpor));			
			this.jButtonCopiarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor && this.isPermisoCopiarDetalleLiquidacionImpuestoImpor));
			this.jButtonVerFormDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor && this.isPermisoVerFormDetalleLiquidacionImpuestoImpor));
			
			this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor && this.isPermisoOrdenDetalleLiquidacionImpuestoImpor));			
			
			this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor && this.isPermisoNuevoDetalleLiquidacionImpuestoImpor));			
			this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor && this.isPermisoNuevoDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor));
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonModificarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor && this.isPermisoActualizarDetalleLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonActualizarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor && this.isPermisoActualizarDetalleLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonEliminarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor && this.isPermisoEliminarDetalleLiquidacionImpuestoImpor));
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonCancelarDetalleLiquidacionImpuestoImpor.setVisible(this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor);							
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor && this.isPermisoNuevoDetalleLiquidacionImpuestoImpor));						
			this.jButtonDuplicarToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor && this.isPermisoDuplicarDetalleLiquidacionImpuestoImpor));						
			this.jButtonCopiarToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor && this.isPermisoCopiarDetalleLiquidacionImpuestoImpor));			
			this.jButtonVerFormToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor && this.isPermisoVerFormDetalleLiquidacionImpuestoImpor));			
			this.jButtonAbrirOrderByToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor && this.isPermisoOrdenDetalleLiquidacionImpuestoImpor));
			this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor && this.isPermisoNuevoDetalleLiquidacionImpuestoImpor));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor && this.isPermisoNuevoDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor));			
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonModificarToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor && this.isPermisoActualizarDetalleLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonActualizarToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor  && this.isPermisoActualizarDetalleLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonEliminarToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor && this.isPermisoEliminarDetalleLiquidacionImpuestoImpor));
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonCancelarToolBarDetalleLiquidacionImpuestoImpor.setVisible(this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor);				
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor && this.isPermisoNuevoDetalleLiquidacionImpuestoImpor));			
			this.jMenuItemDuplicarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor && this.isPermisoDuplicarDetalleLiquidacionImpuestoImpor));			
			this.jMenuItemCopiarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor && this.isPermisoCopiarDetalleLiquidacionImpuestoImpor));			
			this.jMenuItemVerFormDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor && this.isPermisoVerFormDetalleLiquidacionImpuestoImpor));			
			this.jMenuItemAbrirOrderByDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor && this.isPermisoOrdenDetalleLiquidacionImpuestoImpor));			
			//this.jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor && this.isPermisoOrdenDetalleLiquidacionImpuestoImpor));
			this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor && this.isPermisoOrdenDetalleLiquidacionImpuestoImpor));			
			//this.jMenuItemDetalleMostrarOcultarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor && this.isPermisoOrdenDetalleLiquidacionImpuestoImpor));			
			this.jMenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor && this.isPermisoNuevoDetalleLiquidacionImpuestoImpor));			
			this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor && this.isPermisoNuevoDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor));									
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemModificarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor && this.isPermisoActualizarDetalleLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemActualizarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor && this.isPermisoActualizarDetalleLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemEliminarDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor && this.isPermisoEliminarDetalleLiquidacionImpuestoImpor));
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemCancelarDetalleLiquidacionImpuestoImpor.setVisible(this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor);				
			}
			
			this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor));						
			this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=this.jButtonNuevoDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor=this.jButtonDuplicarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor=this.jButtonCopiarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor=this.jButtonVerFormDetalleLiquidacionImpuestoImpor.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleLiquidacionImpuestoImpor=this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor=this.jButtonModificarDetalleLiquidacionImpuestoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonActualizarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonEliminarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonCancelarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=this.jButtonNuevoToolBarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpuestoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonModificarToolBarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonActualizarToolBarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonEliminarToolBarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonCancelarToolBarDetalleLiquidacionImpuestoImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=this.jButtonGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpuestoImpor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=this.jMenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemModificarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemActualizarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemEliminarDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemCancelarDetalleLiquidacionImpuestoImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleLiquidacionImpuestoImpor(Boolean esInicializar) {
		if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
				//if(this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleLiquidacionImpuestoImpor();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpuestoImpor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleLiquidacionImpuestoImpor() {
		this.jButtonNuevoDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoNuevoDetalleLiquidacionImpuestoImpor);			
		this.jButtonDuplicarDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoDuplicarDetalleLiquidacionImpuestoImpor);			
		this.jButtonCopiarDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoCopiarDetalleLiquidacionImpuestoImpor);			
		this.jButtonVerFormDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoVerFormDetalleLiquidacionImpuestoImpor);			
		
		this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoOrdenDetalleLiquidacionImpuestoImpor);					
		
		this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoNuevoDetalleLiquidacionImpuestoImpor);			
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonModificarDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoActualizarDetalleLiquidacionImpuestoImpor);	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonActualizarDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoActualizarDetalleLiquidacionImpuestoImpor);	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonEliminarDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoEliminarDetalleLiquidacionImpuestoImpor);
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonCancelarDetalleLiquidacionImpuestoImpor.setVisible(this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor);						
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoActualizarDetalleLiquidacionImpuestoImpor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleLiquidacionImpuestoImpor() {
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonModificarDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoActualizarDetalleLiquidacionImpuestoImpor);	
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonActualizarDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoActualizarDetalleLiquidacionImpuestoImpor);	
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonEliminarDetalleLiquidacionImpuestoImpor.setVisible(this.isPermisoEliminarDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonCancelarDetalleLiquidacionImpuestoImpor.setVisible(this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor);							
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpuestoImpor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleLiquidacionImpuestoImpor() {
		if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleLiquidacionImpuestoImpor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleLiquidacionImpuestoImpor() {
	}
	
	public void jTableDatosDetalleLiquidacionImpuestoImporListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleLiquidacionImpuestoImpor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalleliquidacionimpuestoimpor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoliquidacionimpuestoimpor=true;

			idTienePermisoliquidacionimpuestoimpor=this.tienePermisosUsuarioEnPaginaWebDetalleLiquidacionImpuestoImpor(LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			if(idTienePermisoliquidacionimpuestoimpor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleLiquidacionImpuestoImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);

				this.liquidacionimpuestoimporBeanSwingJInternalFrame=new LiquidacionImpuestoImporBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.liquidacionimpuestoimporBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.liquidacionimpuestoimporBeanSwingJInternalFrame.getLiquidacionImpuestoImporLogic().setConnexion(this.detalleliquidacionimpuestoimporLogic.getConnexion());

				if(this.detalleliquidacionimpuestoimpor.getid_liquidacion_impuesto_impor()!=null) {
					this.liquidacionimpuestoimporBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.liquidacionimpuestoimporBeanSwingJInternalFrame.setIdActual(this.detalleliquidacionimpuestoimpor.getid_liquidacion_impuesto_impor());
					this.liquidacionimpuestoimporBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.liquidacionimpuestoimporBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.liquidacionimpuestoimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaLiquidacionImpuestoImpor();
				}

				JInternalFrameBase jinternalFrame =this.liquidacionimpuestoimporBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleLiquidacionImpuestoImpor=(TitledBorder)this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.getBorder();
				TitledBorder titledBorderliquidacionimpuestoimpor=(TitledBorder)this.liquidacionimpuestoimporBeanSwingJInternalFrame.jScrollPanelDatosLiquidacionImpuestoImpor.getBorder();

				titledBorderliquidacionimpuestoimpor.setTitle(titledBorderDetalleLiquidacionImpuestoImpor.getTitle() + " -> Liquidacion Impuesto Impor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getid_liquidacion_impuesto_impor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_liquidacion_impuesto_impor = "+this.detalleliquidacionimpuestoimpor.getid_liquidacion_impuesto_impor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleLiquidacionImpuestoImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleLiquidacionImpuestoImpor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleLiquidacionImpuestoImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalleliquidacionimpuestoimporLogic.getConnexion());

				if(this.detalleliquidacionimpuestoimpor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalleliquidacionimpuestoimpor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleLiquidacionImpuestoImpor=(TitledBorder)this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleLiquidacionImpuestoImpor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalleliquidacionimpuestoimpor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleLiquidacionImpuestoImpor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleLiquidacionImpuestoImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detalleliquidacionimpuestoimporLogic.getConnexion());

				if(this.detalleliquidacionimpuestoimpor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detalleliquidacionimpuestoimpor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleLiquidacionImpuestoImpor=(TitledBorder)this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleLiquidacionImpuestoImpor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detalleliquidacionimpuestoimpor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.detalleliquidacionimpuestoimpor.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.detalleliquidacionimpuestoimpor.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfobDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getfob()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fob = "+this.detalleliquidacionimpuestoimpor.getfob().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getporcentaje_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_iva = "+this.detalleliquidacionimpuestoimpor.getporcentaje_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getporcentaje_arancel()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_arancel = "+this.detalleliquidacionimpuestoimpor.getporcentaje_arancel().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getporcentaje_aplicar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_aplicar = "+this.detalleliquidacionimpuestoimpor.getporcentaje_aplicar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfleteDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getflete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where flete = "+this.detalleliquidacionimpuestoimpor.getflete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonseguroDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getseguro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where seguro = "+this.detalleliquidacionimpuestoimpor.getseguro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getbase_imponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where base_imponible = "+this.detalleliquidacionimpuestoimpor.getbase_imponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getvalor_arancel()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_arancel = "+this.detalleliquidacionimpuestoimpor.getvalor_arancel().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getvalor_fodi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_fodi = "+this.detalleliquidacionimpuestoimpor.getvalor_fodi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getvalor_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_iva = "+this.detalleliquidacionimpuestoimpor.getvalor_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante = "+this.detalleliquidacionimpuestoimpor.getnumero_comprobante().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getporcentaje_fodi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_fodi = "+this.detalleliquidacionimpuestoimpor.getporcentaje_fodi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.getdetalleliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpuestoimpor==null) {
						this.detalleliquidacionimpuestoimpor = new DetalleLiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);
				}

				if(this.detalleliquidacionimpuestoimpor.getvalor_imponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_imponible = "+this.detalleliquidacionimpuestoimpor.getvalor_imponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);

			this.getDetalleLiquidacionImpuestoImporsFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);

			//if(DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);

			this.getDetalleLiquidacionImpuestoImporsFK_IdLiquidacionImpuestoImpor();

			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);

			//if(DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);

			this.getDetalleLiquidacionImpuestoImporsFK_IdSucursal();

			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);

			//if(DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleLiquidacionImpuestoImpor() {
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.dispose();
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.dispose();
			this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor=null;
		}
		
		if(this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.dispose();
			this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleLiquidacionImpuestoImpor();
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleLiquidacionImpuestoImpor")) {
				jButtonDuplicarDetalleLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleLiquidacionImpuestoImpor")) {
				jButtonCopiarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleLiquidacionImpuestoImpor")) {
				jButtonVerFormDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonDuplicarDetalleLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleLiquidacionImpuestoImpor")) {
				jButtonDuplicarDetalleLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleLiquidacionImpuestoImpor")) {
				jButtonModificarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonModificarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleLiquidacionImpuestoImpor")) {
				jButtonModificarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleLiquidacionImpuestoImpor")) {
				jButtonActualizarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonActualizarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleLiquidacionImpuestoImpor")) {
				jButtonActualizarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleLiquidacionImpuestoImpor")) {
				jButtonEliminarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonEliminarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleLiquidacionImpuestoImpor")) {
				jButtonEliminarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleLiquidacionImpuestoImpor")) {
				jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleLiquidacionImpuestoImpor")) {
				jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleLiquidacionImpuestoImpor")) {
				jButtonCerrarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonCerrarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleLiquidacionImpuestoImpor")) {
				jButtonCerrarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonMostrarOcultarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor")) {
				jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonCopiarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonVerFormDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleLiquidacionImpuestoImpor")) {
				jButtonCopiarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleLiquidacionImpuestoImpor")) {
				jButtonVerFormDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleLiquidacionImpuestoImpor")) {
				jButtonRecargarInformacionDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonRecargarInformacionDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleLiquidacionImpuestoImpor")) {
				jButtonRecargarInformacionDetalleLiquidacionImpuestoImporActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleLiquidacionImpuestoImpor")) {
				jButtonAnterioresDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonAnterioresDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleLiquidacionImpuestoImpor")) {
				jButtonAnterioresDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleLiquidacionImpuestoImpor")) {
				jButtonSiguientesDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonSiguientesDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleLiquidacionImpuestoImpor")) {
				jButtonSiguientesDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleLiquidacionImpuestoImpor") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleLiquidacionImpuestoImpor")) {
				jButtonAbrirOrderByDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleLiquidacionImpuestoImpor")) {
				jButtonMostrarOcultarDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleLiquidacionImpuestoImpor")) {
				jButtonCerrarReporteDinamicoDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleLiquidacionImpuestoImpor")) {
				jButtonGenerarReporteDinamicoDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleLiquidacionImpuestoImpor")) {
				jButtonCerrarImportacionDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleLiquidacionImpuestoImpor")) {
				
				jButtonGenerarImportacionDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleLiquidacionImpuestoImpor")) {
				
				jButtonAbrirImportacionDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleLiquidacionImpuestoImpor")) {
				jComboBoxTiposAccionesDetalleLiquidacionImpuestoImporActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleLiquidacionImpuestoImpor")) {
				jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImporActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleLiquidacionImpuestoImpor")) {
				jComboBoxTiposAccionesDetalleLiquidacionImpuestoImporActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleLiquidacionImpuestoImpor")) {
				
				jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImporActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleLiquidacionImpuestoImpor")) {
				jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImporActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleLiquidacionImpuestoImpor")) {
				jButtonAbrirOrderByDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleLiquidacionImpuestoImpor")) {
				jButtonAbrirOrderByDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleLiquidacionImpuestoImpor")) {
				jButtonCerrarOrderByDetalleLiquidacionImpuestoImporActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonidDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_empresaDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtoncantidadDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonvalorDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fobDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfobDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfleteDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("seguroDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonseguroDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_arancelDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_fodiDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_ivaDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_imponibleDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor")) {
				this.jButtonFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImporActionPerformed(evt);
			}
			
			;
			
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleLiquidacionImpuestoImpor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				


				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalleliquidacionimpuestoimporLocal=this.detalleliquidacionimpuestoimpor;
			} else {
				detalleliquidacionimpuestoimporLocal=this.detalleliquidacionimpuestoimporAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
							
				
				


				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
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
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
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
			
			


			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
								
						
				


				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpuestoImpor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
								
				
				


				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
							
				
				


				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
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
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
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
			
			


			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
								
				
				


				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleLiquidacionImpuestoImpor")) {
					jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImporItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleLiquidacionImpuestoImpor")) {
					jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImporItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleLiquidacionImpuestoImpor")) {
					
				}
				
				


				
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
												
				
				


				
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
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
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
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
			
			


			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpuestoImpor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpuestoImpor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpuestoimpor);
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
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
				
				


				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpuestoImpor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImpuestoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimpuestoimporAnterior =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleLiquidacionImpuestoImpor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleLiquidacionImpuestoImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalleliquidacionimpuestoimpor =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalleliquidacionimpuestoimpor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleLiquidacionImpuestoImpor")) {
				
				}
				
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleLiquidacionImpuestoImpor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleLiquidacionImpuestoImpor")) {
			
			}
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleLiquidacionImpuestoImpor();
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleLiquidacionImpuestoImpor")) {
				jButtonDuplicarDetalleLiquidacionImpuestoImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleLiquidacionImpuestoImpor")) {
				jButtonCopiarDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleLiquidacionImpuestoImpor")) {
				jButtonVerFormDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleLiquidacionImpuestoImpor")) {
				jButtonModificarDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleLiquidacionImpuestoImpor")) {
				jButtonActualizarDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleLiquidacionImpuestoImpor")) {
				jButtonEliminarDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleLiquidacionImpuestoImpor")) {
				jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleLiquidacionImpuestoImpor")) {
				jButtonCerrarDetalleLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleLiquidacionImpuestoImpor")) {
				jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleLiquidacionImpuestoImpor")) {
				jButtonAbrirOrderByDetalleLiquidacionImpuestoImporActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleLiquidacionImpuestoImpor")) {
				jButtonRecargarInformacionDetalleLiquidacionImpuestoImporActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleLiquidacionImpuestoImpor")) {
				jButtonAnterioresDetalleLiquidacionImpuestoImporActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleLiquidacionImpuestoImpor")) {
				jButtonSiguientesDetalleLiquidacionImpuestoImporActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonidDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_empresaDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtoncantidadDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonvalorDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fobDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfobDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfleteDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("seguroDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonseguroDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_arancelDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_fodiDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_ivaDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_imponibleDetalleLiquidacionImpuestoImporBusqueda")) {
				this.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleLiquidacionImpuestoImpor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleLiquidacionImpuestoImpor")) {
				closingInternalFrameDetalleLiquidacionImpuestoImpor();
				
			} else if(sTipo.equals("jButtonCancelarDetalleLiquidacionImpuestoImpor")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame jInternalFrameParent=(DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(null);
			}
			
			DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),this.detalleliquidacionimpuestoimporParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleLiquidacionImpuestoImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleLiquidacionImpuestoImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleLiquidacionImpuestoImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalleliquidacionimpuestoimpor)) {
			if(!esControlTabla) {
				if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);			
				}
				
				if(this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleliquidacionimpuestoimporReturnGeneral=detalleliquidacionimpuestoimporLogic.procesarEventosDetalleLiquidacionImpuestoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors(),this.detalleliquidacionimpuestoimpor,this.detalleliquidacionimpuestoimporParameterGeneral,this.isEsNuevoDetalleLiquidacionImpuestoImpor,classes);//this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporReturnGeneral,this.detalleliquidacionimpuestoimporBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleLiquidacionImpuestoImpor(classes,this.detalleliquidacionimpuestoimporReturnGeneral,this.detalleliquidacionimpuestoimporBean,false);
					}
						
					if(this.detalleliquidacionimpuestoimporReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporReturnGeneral.getDetalleLiquidacionImpuestoImpor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporReturnGeneral.getDetalleLiquidacionImpuestoImpor());	
					}
						
					if(this.detalleliquidacionimpuestoimporReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporReturnGeneral.getDetalleLiquidacionImpuestoImpor(),classes);//this.detalleliquidacionimpuestoimporBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,classes);//this.detalleliquidacionimpuestoimporBean);									
				}
			
				if(DetalleLiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimpor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalleliquidacionimpuestoimporAnterior!=null) {
						this.detalleliquidacionimpuestoimpor=this.detalleliquidacionimpuestoimporAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleliquidacionimpuestoimporReturnGeneral=detalleliquidacionimpuestoimporLogic.procesarEventosDetalleLiquidacionImpuestoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors(),this.detalleliquidacionimpuestoimpor,this.detalleliquidacionimpuestoimporParameterGeneral,this.isEsNuevoDetalleLiquidacionImpuestoImpor,classes);//this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleliquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalleliquidacionimpuestoimporReturnGeneral.getDetalleLiquidacionImpuestoImpor(),detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalleliquidacionimpuestoimporReturnGeneral.getDetalleLiquidacionImpuestoImpor(),this.detalleliquidacionimpuestoimpors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleLiquidacionImpuestoImpor.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleLiquidacionImpuestoImpor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleLiquidacionImpuestoImpor();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleLiquidacionImpuestoImpor() throws Exception {
		
		DetalleLiquidacionImpuestoImporModel detalleliquidacionimpuestoimporModel=(DetalleLiquidacionImpuestoImporModel)this.jTableDatosDetalleLiquidacionImpuestoImpor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleliquidacionimpuestoimporModel.detalleliquidacionimpuestoimpors=this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalleliquidacionimpuestoimporModel.detalleliquidacionimpuestoimpors=this.detalleliquidacionimpuestoimpors;
		}
		
		
		((DetalleLiquidacionImpuestoImporModel) this.jTableDatosDetalleLiquidacionImpuestoImpor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleLiquidacionImpuestoImpor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalleliquidacionimpuestoimporAnterior(),this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalleliquidacionimpuestoimporAnterior(),this.detalleliquidacionimpuestoimpors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleLiquidacionImpuestoImpor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
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
										
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),generalEntityParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleLiquidacionImpuestoImporConstantesFunciones.getClassesRelationshipsOfDetalleLiquidacionImpuestoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleLiquidacionImpuestoImporConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleLiquidacionImpuestoImpor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleLiquidacionImpuestoImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleliquidacionimpuestoimpor,new Object(),generalEntityParameterGeneral,this.detalleliquidacionimpuestoimporReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImporBean detalleliquidacionimpuestoimporBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleLiquidacionImpuestoImpor(ArrayList<Classe> classes,DetalleLiquidacionImpuestoImporReturnGeneral detalleliquidacionimpuestoimporReturnGeneral,DetalleLiquidacionImpuestoImporBean detalleliquidacionimpuestoimporBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalleliquidacionimpuestoimpor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor = new DetalleLiquidacionImpuestoImporDetalleFormJInternalFrame(jDesktopPane,this.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones(),this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setVisible(false);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporLogic=this.detalleliquidacionimpuestoimporLogic;
		
		this.cargarCombosFrameForeignKeyDetalleLiquidacionImpuestoImpor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleLiquidacionImpuestoImpor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleLiquidacionImpuestoImpor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleLiquidacionImpuestoImpor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleLiquidacionImpuestoImpor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleLiquidacionImpuestoImpor"));
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonModificarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ModificarDetalleLiquidacionImpuestoImpor"));

		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonModificarToolBarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleLiquidacionImpuestoImpor"));
					
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemModificarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleLiquidacionImpuestoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonActualizarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"ActualizarDetalleLiquidacionImpuestoImpor"));
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonActualizarToolBarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleLiquidacionImpuestoImpor"));
						
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemActualizarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleLiquidacionImpuestoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonEliminarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"EliminarDetalleLiquidacionImpuestoImpor"));
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonEliminarToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleLiquidacionImpuestoImpor"));
								
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemEliminarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleLiquidacionImpuestoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonCancelarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CancelarDetalleLiquidacionImpuestoImpor"));
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonCancelarToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleLiquidacionImpuestoImpor"));
					
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemCancelarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleLiquidacionImpuestoImpor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleLiquidacionImpuestoImpor"));
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleLiquidacionImpuestoImpor"));
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleLiquidacionImpuestoImpor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonidDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonfobDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fobDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fleteDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"seguroDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_arancelDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_fodiDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_ivaDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_imponibleDetalleLiquidacionImpuestoImporBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleLiquidacionImpuestoImpor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleLiquidacionImpuestoImpor"));
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleLiquidacionImpuestoImpor"));
		}
		
		this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleLiquidacionImpuestoImpor"));
		
		this.jTableDatosDetalleLiquidacionImpuestoImpor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleLiquidacionImpuestoImpor"));
		
		this.jButtonNuevoDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"NuevoDetalleLiquidacionImpuestoImpor"));
		
		this.jButtonDuplicarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"DuplicarDetalleLiquidacionImpuestoImpor"));
		
		this.jButtonCopiarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"CopiarDetalleLiquidacionImpuestoImpor"));
		
		this.jButtonVerFormDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"VerFormDetalleLiquidacionImpuestoImpor"));
		
		
		this.jButtonNuevoToolBarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleLiquidacionImpuestoImpor"));
			
		this.jButtonDuplicarToolBarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemDuplicarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleLiquidacionImpuestoImpor"));		
		
		
		this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleLiquidacionImpuestoImpor"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonModificarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ModificarDetalleLiquidacionImpuestoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonModificarToolBarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleLiquidacionImpuestoImpor"));
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemModificarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleLiquidacionImpuestoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonActualizarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"ActualizarDetalleLiquidacionImpuestoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonActualizarToolBarDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleLiquidacionImpuestoImpor"));
				
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemActualizarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleLiquidacionImpuestoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonEliminarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"EliminarDetalleLiquidacionImpuestoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonEliminarToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleLiquidacionImpuestoImpor"));
						
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemEliminarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleLiquidacionImpuestoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonCancelarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CancelarDetalleLiquidacionImpuestoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonCancelarToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleLiquidacionImpuestoImpor"));
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemCancelarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleLiquidacionImpuestoImpor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleLiquidacionImpuestoImpor"));		
		
		
		this.jButtonCerrarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CerrarDetalleLiquidacionImpuestoImpor"));
		
		
		this.jButtonCerrarToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemCerrarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleLiquidacionImpuestoImpor"));
			
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jMenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleLiquidacionImpuestoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleLiquidacionImpuestoImpor"));
		}
		
		this.jButtonCopiarToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleLiquidacionImpuestoImpor"));
			
		this.jButtonVerFormToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleLiquidacionImpuestoImpor"));
		
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemCopiarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleLiquidacionImpuestoImpor"));		
		
		this.jMenuItemVerFormDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleLiquidacionImpuestoImpor"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleLiquidacionImpuestoImpor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleLiquidacionImpuestoImpor"));		
		
		
		
		this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleLiquidacionImpuestoImpor"));
					
		this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleLiquidacionImpuestoImpor"));
		
		this.jMenuItemRecargarInformacionDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleLiquidacionImpuestoImpor"));		
		
		
		
		this.jButtonAnterioresDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"AnterioresDetalleLiquidacionImpuestoImpor"));
		
		
		this.jButtonAnterioresToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleLiquidacionImpuestoImpor"));
		
		this.jMenuItemAnterioresDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleLiquidacionImpuestoImpor"));		
		
		
		this.jButtonSiguientesDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"SiguientesDetalleLiquidacionImpuestoImpor"));
		
		
		this.jButtonSiguientesToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemSiguientesDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemAbrirOrderByDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleLiquidacionImpuestoImpor"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleLiquidacionImpuestoImpor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleLiquidacionImpuestoImpor"));

		this.jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleLiquidacionImpuestoImpor"));
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleLiquidacionImpuestoImpor"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleLiquidacionImpuestoImpor"));
			
		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleLiquidacionImpuestoImpor"));
					
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleLiquidacionImpuestoImpor"));
			
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleLiquidacionImpuestoImpor"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonidDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonfobDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fobDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fleteDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"seguroDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_arancelDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_fodiDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_ivaDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_imponibleDetalleLiquidacionImpuestoImporBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"FK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleLiquidacionImpuestoImpor"));
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleLiquidacionImpuestoImpor"));
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpuestoImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleLiquidacionImpuestoImpor"));				
			//this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleLiquidacionImpuestoImpor"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleLiquidacionImpuestoImpor"));
				this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleLiquidacionImpuestoImpor"));
				this.jInternalFrameImportacionDetalleLiquidacionImpuestoImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleLiquidacionImpuestoImpor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleLiquidacionImpuestoImpor"));
			
			this.jButtonAbrirOrderByToolBarDetalleLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleLiquidacionImpuestoImpor"));			
			
			if(this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameOrderByDetalleLiquidacionImpuestoImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleLiquidacionImpuestoImpor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTabbedPaneRelacionesDetalleLiquidacionImpuestoImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleLiquidacionImpuestoImpor"));
		
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
            		closingInternalFrameDetalleLiquidacionImpuestoImpor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor = (JInternalFrameBase)event.getSource();
	            	
	            DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame jInternalFrameParent=(DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleLiquidacionImpuestoImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleLiquidacionImpuestoImpor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoDetalleLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleLiquidacionImpuestoImporActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonModificarDetalleLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonActualizarDetalleLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonEliminarDetalleLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonCancelarDetalleLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleLiquidacionImpuestoImpor";
		inputMap = this.jButtonCerrarDetalleLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleLiquidacionImpuestoImpor";
		inputMap = this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonGuardarCambiosDetalleLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImpor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImporItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleLiquidacionImpuestoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonidDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_empresaDetalleLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_empresaDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_sucursalDetalleLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonid_sucursalDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtoncantidadDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"cantidadDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalorDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonfobDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fobDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_ivaDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_arancelDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_aplicarDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonfleteDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fleteDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonseguroDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"seguroDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonbase_imponibleDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_arancelDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_arancelDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_fodiDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_fodiDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_ivaDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_ivaDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonnumero_comprobanteDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonporcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_fodiDetalleLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jButtonvalor_imponibleDetalleLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"valor_imponibleDetalleLiquidacionImpuestoImporBusqueda"));
		
		
		this.jButtonFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"FK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImporActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleLiquidacionImpuestoImpor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleLiquidacionImpuestoImpor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
					detalleliquidacionimpuestoimporAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimpors) {
					detalleliquidacionimpuestoimporAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleLiquidacionImpuestoImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
						detalleliquidacionimpuestoimporAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimpors) {
						detalleliquidacionimpuestoimporAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimpors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleLiquidacionImpuestoImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleLiquidacionImpuestoImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleLiquidacionImpuestoImpor.getSelectedRows();
			
			DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporLocal=new DetalleLiquidacionImpuestoImpor();
			
			//this.seleccionarTodosDetalleLiquidacionImpuestoImpor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimpuestoimporLocal =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalleliquidacionimpuestoimporLocal =(DetalleLiquidacionImpuestoImpor) this.detalleliquidacionimpuestoimpors.toArray()[this.jTableDatosDetalleLiquidacionImpuestoImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalleliquidacionimpuestoimporLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
						detalleliquidacionimpuestoimporAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimpors) {
						detalleliquidacionimpuestoimporAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleLiquidacionImpuestoImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleLiquidacionImpuestoImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpuestoImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleLiquidacionImpuestoImporItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleLiquidacionImpuestoImporParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImporActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleLiquidacionImpuestoImpor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
				
						if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setfob(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setporcentaje_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setporcentaje_arancel(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setporcentaje_aplicar(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setseguro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setvalor_arancel(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setvalor_fodi(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setvalor_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setnumero_comprobante(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setporcentaje_fodi(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setvalor_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimpors) {
					
						if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setfob(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setporcentaje_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setporcentaje_arancel(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setporcentaje_aplicar(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setseguro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setvalor_arancel(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setvalor_fodi(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setvalor_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setnumero_comprobante(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setporcentaje_fodi(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE)) {
							existe=true;
							detalleliquidacionimpuestoimporAux.setvalor_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleLiquidacionImpuestoImporActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleLiquidacionImpuestoImpor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleLiquidacionImpuestoImpor) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleLiquidacionImpuestoImpor(conSplash);
				
					this.generarReporteDetalleLiquidacionImpuestoImporsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleLiquidacionImpuestoImporsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleLiquidacionImpuestoImporsSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleLiquidacionImpuestoImporsSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleLiquidacionImpuestoImpor();
				
				this.exportarDetalleLiquidacionImpuestoImporsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleLiquidacionImpuestoImpors();
				//this.importarDetalleLiquidacionImpuestoImpors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleLiquidacionImpuestoImpor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleLiquidacionImpuestoImporsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleLiquidacionImpuestoImpor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleLiquidacionImpuestoImpor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleLiquidacionImpuestoImpor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleLiquidacionImpuestoImpor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleLiquidacionImpuestoImpor(conSplash);
					
						//this.actualizarParametrosGeneralDetalleLiquidacionImpuestoImpor();
						
						this.generarReporteProcesoAccionDetalleLiquidacionImpuestoImporsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Liquidacion Impuesto ImporES SELECCIONADOS?", "MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleLiquidacionImpuestoImpor();
				
						this.actualizarParametrosGeneralDetalleLiquidacionImpuestoImpor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalleliquidacionimpuestoimporReturnGeneral=detalleliquidacionimpuestoimporLogic.procesarAccionDetalleLiquidacionImpuestoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors(),this.detalleliquidacionimpuestoimporParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleLiquidacionImpuestoImporReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleLiquidacionImpuestoImpor();
					
					DetalleLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleLiquidacionImpuestoImporReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpuestoImpor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleLiquidacionImpuestoImpor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImporActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleLiquidacionImpuestoImpor();
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();		
			DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor=new DetalleLiquidacionImpuestoImpor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleLiquidacionImpuestoImpor.getSelectedItem();
			
			
			
			
			detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalleliquidacionimpuestoimporsSeleccionados.size()==1) {
				for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimporsSeleccionados) {
					detalleliquidacionimpuestoimpor=detalleliquidacionimpuestoimporAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleLiquidacionImpuestoImpor();
			
      		//this.finishProcessDetalleLiquidacionImpuestoImpor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleLiquidacionImpuestoImporReturnGeneral() throws Exception {
		if(this.detalleliquidacionimpuestoimporReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalleliquidacionimpuestoimporReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalleliquidacionimpuestoimporReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalleliquidacionimpuestoimporReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalleliquidacionimpuestoimporReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalleliquidacionimpuestoimporReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
		}
		
		if(this.detalleliquidacionimpuestoimporReturnGeneral.getConRetornoLista() || this.detalleliquidacionimpuestoimporReturnGeneral.getConRetornoObjeto()) {
			if(this.detalleliquidacionimpuestoimporReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(this.detalleliquidacionimpuestoimporReturnGeneral.getDetalleLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalleliquidacionimpuestoimporReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpor(this.detalleliquidacionimpuestoimporReturnGeneral.getDetalleLiquidacionImpuestoImpor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleLiquidacionImpuestoImpor(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleLiquidacionImpuestoImpor() throws Exception {
		
		
	}
	
	public ArrayList<DetalleLiquidacionImpuestoImpor> getDetalleLiquidacionImpuestoImporsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleLiquidacionImpuestoImpor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors()) {
					if(detalleliquidacionimpuestoimporAux.getIsSelected()) {
						detalleliquidacionimpuestoimporsSeleccionados.add(detalleliquidacionimpuestoimporAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:this.detalleliquidacionimpuestoimpors) {
					if(detalleliquidacionimpuestoimporAux.getIsSelected()) {
						detalleliquidacionimpuestoimporsSeleccionados.add(detalleliquidacionimpuestoimporAux);				
					}
				}
			}
			
			if(detalleliquidacionimpuestoimporsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalleliquidacionimpuestoimporsSeleccionados.addAll(this.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalleliquidacionimpuestoimporsSeleccionados.addAll(this.detalleliquidacionimpuestoimpors);				
					}
				}
			}
		} else {
			detalleliquidacionimpuestoimporsSeleccionados.add(this.detalleliquidacionimpuestoimpor);
		}
		
		return detalleliquidacionimpuestoimporsSeleccionados;
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
	
	public void generarReporteDetalleLiquidacionImpuestoImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleLiquidacionImpuestoImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleLiquidacionImpuestoImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleLiquidacionImpuestoImporsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleLiquidacionImpuestoImporsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Liquidacion Impuesto Impor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();		
		
		detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleLiquidacionImpuestoImpors("Todos",detalleliquidacionimpuestoimporsSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();		
		
		detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleLiquidacionImpuestoImpors("Todos",detalleliquidacionimpuestoimporsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleLiquidacionImpuestoImporsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();
		
		detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleLiquidacionImpuestoImpors("Todos",detalleliquidacionimpuestoimporsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleLiquidacionImpuestoImpor();
		
		
		detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleLiquidacionImpuestoImpor();
		
		
		//this.generarReporteDetalleLiquidacionImpuestoImpors("Todos",detalleliquidacionimpuestoimporsSeleccionados ,detalleliquidacionimpuestoimporImplementable,detalleliquidacionimpuestoimporImplementableHome);
	}
	
	public void mostrarImportacionDetalleLiquidacionImpuestoImpors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleLiquidacionImpuestoImpor();
		
		this.abrirFrameImportacionDetalleLiquidacionImpuestoImpor();		
		
			
		//this.generarReporteDetalleLiquidacionImpuestoImpors("Todos",detalleliquidacionimpuestoimporsSeleccionados ,detalleliquidacionimpuestoimporImplementable,detalleliquidacionimpuestoimporImplementableHome);
	}
	
	public void importarDetalleLiquidacionImpuestoImpors() throws Exception {		
	
	}
	
	public void exportarDetalleLiquidacionImpuestoImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleLiquidacionImpuestoImporsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleLiquidacionImpuestoImporsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleLiquidacionImpuestoImporsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Liquidacion Impuesto Impor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();		
		
		detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpuestoimpor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleLiquidacionImpuestoImpor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimporsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalleliquidacionimpuestoimporAux.setsDetalleGeneralEntityReporte(detalleliquidacionimpuestoimporAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleLiquidacionImpuestoImpor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalleliquidacionimpuestoimpor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getliquidacionimpuestoimpor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getfob().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getporcentaje_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getporcentaje_arancel().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getporcentaje_aplicar().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getflete().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getseguro().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getbase_imponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getvalor_arancel().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getvalor_fodi().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getvalor_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getnumero_comprobante().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getporcentaje_fodi().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpuestoimpor.getvalor_imponible().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();		
		
		detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpuestoimpor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleLiquidacionImpuestoImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleLiquidacionImpuestoImpor(row);				
				iRow++;
			}				
			
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimporsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();		
		
		detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpuestoimpor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalleliquidacionimpuestoimpors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalleliquidacionimpuestoimpor");
			//elementRoot.appendChild(element);
		
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimporsSeleccionados) {
				element = document.createElement("detalleliquidacionimpuestoimpor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleLiquidacionImpuestoImpor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FOB);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEARANCEL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEAPLICAR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_BASEIMPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORARANCEL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORFODI);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_VALORIMPONIBLE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getliquidacionimpuestoimpor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getfob());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_arancel());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_aplicar());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getflete());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getseguro());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getbase_imponible());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_arancel());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_fodi());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getporcentaje_fodi());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpuestoimpor.getvalor_imponible());				
	}
	
	public void setFilaDatosExportarXmlDetalleLiquidacionImpuestoImpor(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementliquidacionimpuestoimpor_descripcion = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.IDLIQUIDACIONIMPUESTOIMPOR);
		elementliquidacionimpuestoimpor_descripcion.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getliquidacionimpuestoimpor_descripcion()));
		element.appendChild(elementliquidacionimpuestoimpor_descripcion);

		Element elementempresa_descripcion = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcantidad = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementvalor = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementfob = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.FOB);
		elementfob.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getfob().toString().trim()));
		element.appendChild(elementfob);

		Element elementporcentaje_iva = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.PORCENTAJEIVA);
		elementporcentaje_iva.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getporcentaje_iva().toString().trim()));
		element.appendChild(elementporcentaje_iva);

		Element elementporcentaje_arancel = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.PORCENTAJEARANCEL);
		elementporcentaje_arancel.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getporcentaje_arancel().toString().trim()));
		element.appendChild(elementporcentaje_arancel);

		Element elementporcentaje_aplicar = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.PORCENTAJEAPLICAR);
		elementporcentaje_aplicar.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getporcentaje_aplicar().toString().trim()));
		element.appendChild(elementporcentaje_aplicar);

		Element elementflete = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.FLETE);
		elementflete.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getflete().toString().trim()));
		element.appendChild(elementflete);

		Element elementseguro = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.SEGURO);
		elementseguro.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getseguro().toString().trim()));
		element.appendChild(elementseguro);

		Element elementbase_imponible = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.BASEIMPONIBLE);
		elementbase_imponible.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getbase_imponible().toString().trim()));
		element.appendChild(elementbase_imponible);

		Element elementvalor_arancel = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.VALORARANCEL);
		elementvalor_arancel.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getvalor_arancel().toString().trim()));
		element.appendChild(elementvalor_arancel);

		Element elementvalor_fodi = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.VALORFODI);
		elementvalor_fodi.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getvalor_fodi().toString().trim()));
		element.appendChild(elementvalor_fodi);

		Element elementvalor_iva = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.VALORIVA);
		elementvalor_iva.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getvalor_iva().toString().trim()));
		element.appendChild(elementvalor_iva);

		Element elementnumero_comprobante = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getnumero_comprobante().toString().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementporcentaje_fodi = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.PORCENTAJEFODI);
		elementporcentaje_fodi.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getporcentaje_fodi().toString().trim()));
		element.appendChild(elementporcentaje_fodi);

		Element elementvalor_imponible = document.createElement(DetalleLiquidacionImpuestoImporConstantesFunciones.VALORIMPONIBLE);
		elementvalor_imponible.appendChild(document.createTextNode(detalleliquidacionimpuestoimpor.getvalor_imponible().toString().trim()));
		element.appendChild(elementvalor_imponible);
	}
	
	public void generarReporteGroupGenericoDetalleLiquidacionImpuestoImporsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados=new ArrayList<DetalleLiquidacionImpuestoImpor>();
		
		detalleliquidacionimpuestoimporsSeleccionados=this.getDetalleLiquidacionImpuestoImporsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporsSeleccionados);
		
		this.generarReporteDetalleLiquidacionImpuestoImpors("Todos",detalleliquidacionimpuestoimporsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleLiquidacionImpuestoImpor(ArrayList<DetalleLiquidacionImpuestoImpor> detalleliquidacionimpuestoimporsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimporAux:detalleliquidacionimpuestoimporsSeleccionados) {
				detalleliquidacionimpuestoimporAux.setsDetalleGeneralEntityReporte(detalleliquidacionimpuestoimporAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPUESTOIMPOR)) {
					existe=true;
					detalleliquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimpuestoimporAux.getliquidacionimpuestoimpor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalleliquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimpuestoimporAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detalleliquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimpuestoimporAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					detalleliquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimpuestoimporAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(DetalleLiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					detalleliquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimpuestoimporAux.getnumero_comprobante().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleLiquidacionImpuestoImpor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpuestoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpuestoImpor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleLiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=true;
		} else {
			this.actualizarEstadoPanelsDetalleLiquidacionImpuestoImpor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleLiquidacionImpuestoImpor=false;
			//this.isVisibilidadCeldaVerFormDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpuestoImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpuestoImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			if(!detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=false;												
			}
			
			this.jButtonCerrarDetalleLiquidacionImpuestoImpor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpuestoImpor=false;
		}
		
		if(!this.permiteMantenimiento(this.detalleliquidacionimpuestoimpor)) {
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpuestoImpor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleLiquidacionImpuestoImpor() {
	}
	
	public void actualizarEstadoPanelsDetalleLiquidacionImpuestoImpor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor!=null) {
					this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpuestoImpor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaLiquidacionImpuestoImpor(Boolean isParaLiquidacionImpuestoImpor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLiquidacionImpuestoImporNegation=!isParaLiquidacionImpuestoImpor;

			this.isVisibilidadFK_IdLiquidacionImpuestoImpor=isParaLiquidacionImpuestoImpor;
			if(!this.isVisibilidadFK_IdLiquidacionImpuestoImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.remove(jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdLiquidacionImpuestoImpor=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdLiquidacionImpuestoImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.remove(jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdLiquidacionImpuestoImpor=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdLiquidacionImpuestoImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.remove(jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleLiquidacionImpuestoImporSessionBean detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
		
		if(this.detalleliquidacionimpuestoimporSessionBean==null) {
			this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
		}
		
		this.detalleliquidacionimpuestoimporSessionBean.setsUltimaBusquedaDetalleLiquidacionImpuestoImpor(this.getsAccionBusqueda());
		this.detalleliquidacionimpuestoimporSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalleliquidacionimpuestoimporSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalleliquidacionimpuestoimporSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLiquidacionImpuestoImpor")) {
			detalleliquidacionimpuestoimporSessionBean.setid_liquidacion_impuesto_impor(this.getid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detalleliquidacionimpuestoimporSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleLiquidacionImpuestoImporSessionBean detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
		
		if(this.detalleliquidacionimpuestoimporSessionBean==null) {
			this.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
		}
		
		if(this.detalleliquidacionimpuestoimporSessionBean.getsUltimaBusquedaDetalleLiquidacionImpuestoImpor()!=null&&!this.detalleliquidacionimpuestoimporSessionBean.getsUltimaBusquedaDetalleLiquidacionImpuestoImpor().equals("")) {
			this.setsAccionBusqueda(detalleliquidacionimpuestoimporSessionBean.getsUltimaBusquedaDetalleLiquidacionImpuestoImpor());
			this.setiNumeroPaginacion(detalleliquidacionimpuestoimporSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalleliquidacionimpuestoimporSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalleliquidacionimpuestoimporSessionBean.getid_empresa());
				detalleliquidacionimpuestoimporSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLiquidacionImpuestoImpor")) {
				this.setid_liquidacion_impuesto_imporFK_IdLiquidacionImpuestoImpor(detalleliquidacionimpuestoimporSessionBean.getid_liquidacion_impuesto_impor());
				detalleliquidacionimpuestoimporSessionBean.setid_liquidacion_impuesto_impor(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detalleliquidacionimpuestoimporSessionBean.getid_sucursal());
				detalleliquidacionimpuestoimporSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.detalleliquidacionimpuestoimporSessionBean.setsUltimaBusquedaDetalleLiquidacionImpuestoImpor("");
		this.detalleliquidacionimpuestoimporSessionBean.setiNumeroPaginacion(DetalleLiquidacionImpuestoImporConstantesFunciones.INUMEROPAGINACION);
		this.detalleliquidacionimpuestoimporSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleLiquidacionImpuestoImpor() {
		this.updateBorderResaltarBusquedasFormularioDetalleLiquidacionImpuestoImpor();
		this.updateVisibilidadBusquedasFormularioDetalleLiquidacionImpuestoImpor();
		this.updateHabilitarBusquedasFormularioDetalleLiquidacionImpuestoImpor();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleLiquidacionImpuestoImpor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.getComponents().length>0) {
	

		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor!=null) {
			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.getComponent(index);
				jPanel.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleLiquidacionImpuestoImpor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);
			if(!this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor && index>-1) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleLiquidacionImpuestoImpor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);
				this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setEnabledAt(index,this.detalleliquidacionimpuestoimporConstantesFunciones.activarFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleLiquidacionImpuestoImpor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdLiquidacionImpuestoImpor")) {
			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);

			this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpuestoImpor.getComponent(index);

			this.detalleliquidacionimpuestoimporConstantesFunciones.setResaltarFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor(resaltar);

			jPanel.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarFK_IdLiquidacionImpuestoImporDetalleLiquidacionImpuestoImpor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleLiquidacionImpuestoImpor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleLiquidacionImpuestoImpor() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleLiquidacionImpuestoImpor();
		this.updateVisibilidadResaltarControlesFormularioDetalleLiquidacionImpuestoImpor();
		this.updateHabilitarResaltarControlesFormularioDetalleLiquidacionImpuestoImpor();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleLiquidacionImpuestoImpor() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltaridDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelidDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltaridDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_empresaDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_empresaDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_sucursalDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarid_sucursalDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarcantidadDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarcantidadDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalorDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalorDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalorDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarfobDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfobDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarfobDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_ivaDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_ivaDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_arancelDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_arancelDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_aplicarDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_aplicarDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarfleteDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfleteDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarfleteDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarseguroDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldseguroDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarseguroDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarbase_imponibleDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarbase_imponibleDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_arancelDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_arancelDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_fodiDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_fodiDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_ivaDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_ivaDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarnumero_comprobanteDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarnumero_comprobanteDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_fodiDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_fodiDetalleLiquidacionImpuestoImpor);}
		if(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_imponibleDetalleLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setBorder(this.detalleliquidacionimpuestoimporConstantesFunciones.resaltarvalor_imponibleDetalleLiquidacionImpuestoImpor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleLiquidacionImpuestoImpor() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
	
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelidDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostraridDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelidDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostraridDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarid_empresaDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelid_empresaDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarid_empresaDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarid_sucursalDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelid_sucursalDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarid_sucursalDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarcantidadDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelcantidadDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarcantidadDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalorDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalorDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelvalorDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalorDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfobDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarfobDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelfobDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarfobDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_ivaDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelporcentaje_ivaDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_ivaDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_arancelDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelporcentaje_arancelDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_arancelDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_aplicarDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_aplicarDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfleteDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarfleteDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelfleteDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarfleteDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldseguroDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarseguroDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelseguroDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarseguroDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarbase_imponibleDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelbase_imponibleDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarbase_imponibleDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_arancelDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelvalor_arancelDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_arancelDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_fodiDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelvalor_fodiDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_fodiDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_ivaDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelvalor_ivaDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_ivaDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarnumero_comprobanteDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelnumero_comprobanteDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarnumero_comprobanteDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_fodiDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelporcentaje_fodiDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_fodiDetalleLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_imponibleDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jPanelvalor_imponibleDetalleLiquidacionImpuestoImpor.setVisible(this.detalleliquidacionimpuestoimporConstantesFunciones.mostrarvalor_imponibleDetalleLiquidacionImpuestoImpor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleLiquidacionImpuestoImpor() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor!=null) {
	
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jLabelidDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activaridDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_liquidacion_impuesto_imporDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_empresaDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_empresaDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jComboBoxid_sucursalDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarid_sucursalDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldcantidadDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarcantidadDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalorDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalorDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfobDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarfobDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_ivaDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_arancelDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_arancelDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_aplicarDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_aplicarDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldfleteDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarfleteDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldseguroDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarseguroDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldbase_imponibleDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarbase_imponibleDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_arancelDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_arancelDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_fodiDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_fodiDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_ivaDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_ivaDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarnumero_comprobanteDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarporcentaje_fodiDetalleLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpuestoImpor.jTextFieldvalor_imponibleDetalleLiquidacionImpuestoImpor.setEnabled(this.detalleliquidacionimpuestoimporConstantesFunciones.activarvalor_imponibleDetalleLiquidacionImpuestoImpor);
		}
	}
	
		
}