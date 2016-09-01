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

import com.bydan.erp.importaciones.util.DetalleLiquidacionImporConstantesFunciones;
import com.bydan.erp.importaciones.util.DetalleLiquidacionImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.DetalleLiquidacionImporParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.DetalleLiquidacionImporBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetalleLiquidacionImporBeanSwingJInternalFrame extends DetalleLiquidacionImporJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleLiquidacionImporBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleLiquidacionImpor> detalleliquidacionimporValidator = new ClassValidator<DetalleLiquidacionImpor>(DetalleLiquidacionImpor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleLiquidacionImpor detalleliquidacionimpor;	
	public DetalleLiquidacionImpor detalleliquidacionimporAux;
	public DetalleLiquidacionImpor detalleliquidacionimporAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleLiquidacionImpor detalleliquidacionimporTotales;
	public Long idDetalleLiquidacionImporActual;
	public Long iIdNuevoDetalleLiquidacionImpor=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboLiquidacionImpor="";

	public List<LiquidacionImpor> liquidacionimporsForeignKey;

	public List<LiquidacionImpor> getliquidacionimporsForeignKey() {
		return liquidacionimporsForeignKey;
	}

	public void setliquidacionimporsForeignKey(List<LiquidacionImpor> liquidacionimporsForeignKey) {
		this.liquidacionimporsForeignKey = liquidacionimporsForeignKey;
	}

	//OBJETO FK ACTUAL
	public LiquidacionImpor liquidacionimporForeignKey;

	public LiquidacionImpor getliquidacionimporForeignKey() {
		return liquidacionimporForeignKey;
	}

	public void setliquidacionimporForeignKey(LiquidacionImpor liquidacionimporForeignKey) {
		this.liquidacionimporForeignKey = liquidacionimporForeignKey;
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

	public String sFinalQueryComboCentroCosto="";

	public List<CentroCosto> centrocostosForeignKey;

	public List<CentroCosto> getcentrocostosForeignKey() {
		return centrocostosForeignKey;
	}

	public void setcentrocostosForeignKey(List<CentroCosto> centrocostosForeignKey) {
		this.centrocostosForeignKey = centrocostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CentroCosto centrocostoForeignKey;

	public CentroCosto getcentrocostoForeignKey() {
		return centrocostoForeignKey;
	}

	public void setcentrocostoForeignKey(CentroCosto centrocostoForeignKey) {
		this.centrocostoForeignKey = centrocostoForeignKey;
	}

	public String sFinalQueryComboCostoGastoImpor="";

	public List<CostoGastoImpor> costogastoimporsForeignKey;

	public List<CostoGastoImpor> getcostogastoimporsForeignKey() {
		return costogastoimporsForeignKey;
	}

	public void setcostogastoimporsForeignKey(List<CostoGastoImpor> costogastoimporsForeignKey) {
		this.costogastoimporsForeignKey = costogastoimporsForeignKey;
	}

	//OBJETO FK ACTUAL
	public CostoGastoImpor costogastoimporForeignKey;

	public CostoGastoImpor getcostogastoimporForeignKey() {
		return costogastoimporForeignKey;
	}

	public void setcostogastoimporForeignKey(CostoGastoImpor costogastoimporForeignKey) {
		this.costogastoimporForeignKey = costogastoimporForeignKey;
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
	
	public Boolean isPermisoTodoDetalleLiquidacionImpor;
	public Boolean isPermisoNuevoDetalleLiquidacionImpor;
	public Boolean isPermisoActualizarDetalleLiquidacionImpor;
	public Boolean isPermisoActualizarOriginalDetalleLiquidacionImpor;
	public Boolean isPermisoEliminarDetalleLiquidacionImpor;
	public Boolean isPermisoGuardarCambiosDetalleLiquidacionImpor;
	public Boolean isPermisoConsultaDetalleLiquidacionImpor;
	public Boolean isPermisoBusquedaDetalleLiquidacionImpor;
	public Boolean isPermisoReporteDetalleLiquidacionImpor;
	public Boolean isPermisoPaginacionMedioDetalleLiquidacionImpor;
	public Boolean isPermisoPaginacionAltoDetalleLiquidacionImpor;
	public Boolean isPermisoPaginacionTodoDetalleLiquidacionImpor;
	public Boolean isPermisoCopiarDetalleLiquidacionImpor;
	public Boolean isPermisoVerFormDetalleLiquidacionImpor;
	public Boolean isPermisoDuplicarDetalleLiquidacionImpor;
	public Boolean isPermisoOrdenDetalleLiquidacionImpor;
	
	
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
	
	public DetalleLiquidacionImporParameterReturnGeneral detalleliquidacionimporReturnGeneral;
	public DetalleLiquidacionImporParameterReturnGeneral detalleliquidacionimporParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleLiquidacionImpor=false;
	public Boolean esParaAccionDesdeFormularioDetalleLiquidacionImpor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleLiquidacionImporSessionBeanAdditional detalleliquidacionimporSessionBeanAdditional=null;
	
	public DetalleLiquidacionImporSessionBeanAdditional getDetalleLiquidacionImporSessionBeanAdditional() {
		return this.detalleliquidacionimporSessionBeanAdditional;
	}
	
	public void setDetalleLiquidacionImporSessionBeanAdditional(DetalleLiquidacionImporSessionBeanAdditional detalleliquidacionimporSessionBeanAdditional) {
		try {
			this.detalleliquidacionimporSessionBeanAdditional=detalleliquidacionimporSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleLiquidacionImporBeanSwingJInternalFrameAdditional detalleliquidacionimporBeanSwingJInternalFrameAdditional=null;
	//public class DetalleLiquidacionImporBeanSwingJInternalFrame
	
	public DetalleLiquidacionImporBeanSwingJInternalFrameAdditional getDetalleLiquidacionImporBeanSwingJInternalFrameAdditional() {
		return this.detalleliquidacionimporBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleLiquidacionImporBeanSwingJInternalFrameAdditional(DetalleLiquidacionImporBeanSwingJInternalFrameAdditional detalleliquidacionimporBeanSwingJInternalFrameAdditional) {
		try {
			this.detalleliquidacionimporBeanSwingJInternalFrameAdditional=detalleliquidacionimporBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleLiquidacionImporLogic detalleliquidacionimporLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleLiquidacionImpor detalleliquidacionimporBean;
	public DetalleLiquidacionImporConstantesFunciones detalleliquidacionimporConstantesFunciones;
	//public DetalleLiquidacionImporParameterReturnGeneral detalleliquidacionimporReturnGeneral;
	
	//FK
	
	public LiquidacionImporLogic liquidacionimporLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public UsuarioLogic usuarioLogic;
	public CentroCostoLogic centrocostoLogic;
	public CostoGastoImporLogic costogastoimporLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleLiquidacionImpor> detalleliquidacionimpors;	
	//public List<DetalleLiquidacionImpor> detalleliquidacionimporsEliminados;
	//public List<DetalleLiquidacionImpor> detalleliquidacionimporsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleLiquidacionImpor=true;
	public Boolean isVisibilidadCeldaCopiarDetalleLiquidacionImpor=true;
	public Boolean isVisibilidadCeldaVerFormDetalleLiquidacionImpor=true;
	public Boolean isVisibilidadCeldaOrdenDetalleLiquidacionImpor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaModificarDetalleLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaActualizarDetalleLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaEliminarDetalleLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaCancelarDetalleLiquidacionImpor=false;
	public Boolean isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=false;	
	
	
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdCostoGastoImpor=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLiquidacionImpor=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUsuario=false;
	
	public Long getiIdNuevoDetalleLiquidacionImpor() {
		return this.iIdNuevoDetalleLiquidacionImpor;
	}

	public void setiIdNuevoDetalleLiquidacionImpor(Long iIdNuevoDetalleLiquidacionImpor) {
		this.iIdNuevoDetalleLiquidacionImpor = iIdNuevoDetalleLiquidacionImpor;
	}
	
	public Long getidDetalleLiquidacionImporActual() {
		return this.idDetalleLiquidacionImporActual;
	}

	public void setidDetalleLiquidacionImporActual(Long idDetalleLiquidacionImporActual) {
		this.idDetalleLiquidacionImporActual = idDetalleLiquidacionImporActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleLiquidacionImpor getdetalleliquidacionimpor() {
		return this.detalleliquidacionimpor;
	}

	public void setdetalleliquidacionimpor(DetalleLiquidacionImpor detalleliquidacionimpor) {
		this.detalleliquidacionimpor = detalleliquidacionimpor;
	}
	
	public DetalleLiquidacionImpor getdetalleliquidacionimporAux() {
		return this.detalleliquidacionimporAux;
	}

	public void setdetalleliquidacionimporAux(DetalleLiquidacionImpor detalleliquidacionimporAux) {
		this.detalleliquidacionimporAux = detalleliquidacionimporAux;
	}				
	
	public DetalleLiquidacionImpor getdetalleliquidacionimporAnterior() {
		return this.detalleliquidacionimporAnterior;
	}

	public void setdetalleliquidacionimporAnterior(DetalleLiquidacionImpor detalleliquidacionimporAnterior) {
		this.detalleliquidacionimporAnterior = detalleliquidacionimporAnterior;
	}	
	
	public DetalleLiquidacionImpor getdetalleliquidacionimporTotales() {
		return this.detalleliquidacionimporTotales;
	}

	public void setdetalleliquidacionimporTotales(DetalleLiquidacionImpor detalleliquidacionimporTotales) {
		this.detalleliquidacionimporTotales = detalleliquidacionimporTotales;
	}	
	
	public DetalleLiquidacionImpor getdetalleliquidacionimporBean() {
		return this.detalleliquidacionimporBean;
	}

	public void setdetalleliquidacionimporBean(DetalleLiquidacionImpor detalleliquidacionimporBean) {
		this.detalleliquidacionimporBean = detalleliquidacionimporBean;
	}	
	
	public DetalleLiquidacionImporParameterReturnGeneral getdetalleliquidacionimporReturnGeneral() {
		return this.detalleliquidacionimporReturnGeneral;
	}

	public void setdetalleliquidacionimporReturnGeneral(DetalleLiquidacionImporParameterReturnGeneral detalleliquidacionimporReturnGeneral) {
		this.detalleliquidacionimporReturnGeneral = detalleliquidacionimporReturnGeneral;
	}	
	
	
	public Long id_centro_costoFK_IdCentroCosto=null;

	public Long getid_centro_costoFK_IdCentroCosto() {
		return this.id_centro_costoFK_IdCentroCosto;
	}

	public void setid_centro_costoFK_IdCentroCosto(Long id_centro_costoFK_IdCentroCosto) {
		this.id_centro_costoFK_IdCentroCosto = id_centro_costoFK_IdCentroCosto;
	}

	public Long id_costo_gasto_imporFK_IdCostoGastoImpor=-1L;

	public Long getid_costo_gasto_imporFK_IdCostoGastoImpor() {
		return this.id_costo_gasto_imporFK_IdCostoGastoImpor;
	}

	public void setid_costo_gasto_imporFK_IdCostoGastoImpor(Long id_costo_gasto_imporFK_IdCostoGastoImpor) {
		this.id_costo_gasto_imporFK_IdCostoGastoImpor = id_costo_gasto_imporFK_IdCostoGastoImpor;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_liquidacion_imporFK_IdLiquidacionImpor=-1L;

	public Long getid_liquidacion_imporFK_IdLiquidacionImpor() {
		return this.id_liquidacion_imporFK_IdLiquidacionImpor;
	}

	public void setid_liquidacion_imporFK_IdLiquidacionImpor(Long id_liquidacion_imporFK_IdLiquidacionImpor) {
		this.id_liquidacion_imporFK_IdLiquidacionImpor = id_liquidacion_imporFK_IdLiquidacionImpor;
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
	
	
	public DetalleLiquidacionImporLogic getDetalleLiquidacionImporLogic()	{		
		return detalleliquidacionimporLogic;
	}

	public void setDetalleLiquidacionImporLogic(DetalleLiquidacionImporLogic detalleliquidacionimporLogic) {
		this.detalleliquidacionimporLogic = detalleliquidacionimporLogic;
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
	
	public Boolean getIsEsNuevoDetalleLiquidacionImpor() {
		return isEsNuevoDetalleLiquidacionImpor;
	}

	public void setIsEsNuevoDetalleLiquidacionImpor(Boolean isEsNuevoDetalleLiquidacionImpor) {
		this.isEsNuevoDetalleLiquidacionImpor = isEsNuevoDetalleLiquidacionImpor;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleLiquidacionImpor() {
		return esParaAccionDesdeFormularioDetalleLiquidacionImpor;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleLiquidacionImpor(Boolean esParaAccionDesdeFormularioDetalleLiquidacionImpor) {
		this.esParaAccionDesdeFormularioDetalleLiquidacionImpor = esParaAccionDesdeFormularioDetalleLiquidacionImpor;
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
	
	
	public void cargarCombosLiquidacionImporsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.liquidacionimporsForeignKey=new ArrayList<LiquidacionImpor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LiquidacionImporLogic liquidacionimporLogic=new LiquidacionImporLogic();

			liquidacionimporLogic.getLiquidacionImporDataAccess().setIsForForeingKeyData(true);

			if(this.detalleliquidacionimporSessionBean==null) {
				this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
			}

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionLiquidacionImpor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimporLogic.getLiquidacionImporDataAccess().setIsForForeingKeyData(true);

					liquidacionimporLogic.getTodosLiquidacionImporsWithConnection(sFinalQuery,new Pagination());

					this.liquidacionimporsForeignKey=liquidacionimporLogic.getLiquidacionImpors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLiquidacionImpor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimporLogic.getEntityWithConnection(detalleliquidacionimporSessionBean.getlidLiquidacionImporActual());
					this.liquidacionimporsForeignKey.add(liquidacionimporLogic.getLiquidacionImpor());
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

			if(this.detalleliquidacionimporSessionBean==null) {
				this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
			}

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalleliquidacionimporSessionBean.getlidEmpresaActual());
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

			if(this.detalleliquidacionimporSessionBean==null) {
				this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
			}

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detalleliquidacionimporSessionBean.getlidSucursalActual());
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

			if(this.detalleliquidacionimporSessionBean==null) {
				this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
			}

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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
					usuarioLogic.getEntityWithConnection(detalleliquidacionimporSessionBean.getlidUsuarioActual());
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

	public void cargarCombosCentroCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centrocostosForeignKey=new ArrayList<CentroCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroCostoLogic centrocostoLogic=new CentroCostoLogic();

			//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

			if(this.detalleliquidacionimporSessionBean==null) {
				this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
			}

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

					centrocostoLogic.getTodosCentroCostosWithConnection(sFinalQuery,new Pagination());

					this.centrocostosForeignKey=centrocostoLogic.getCentroCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(detalleliquidacionimporSessionBean.getlidCentroCostoActual());
					this.centrocostosForeignKey.add(centrocostoLogic.getCentroCosto());
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

	public void cargarCombosCostoGastoImporsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.costogastoimporsForeignKey=new ArrayList<CostoGastoImpor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CostoGastoImporLogic costogastoimporLogic=new CostoGastoImporLogic();

			//costogastoimporLogic.getCostoGastoImporDataAccess().setIsForForeingKeyData(true);

			if(this.detalleliquidacionimporSessionBean==null) {
				this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
			}

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCostoGastoImpor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//costogastoimporLogic.getCostoGastoImporDataAccess().setIsForForeingKeyData(true);

					costogastoimporLogic.getTodosCostoGastoImporsWithConnection(sFinalQuery,new Pagination());

					this.costogastoimporsForeignKey=costogastoimporLogic.getCostoGastoImpors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCostoGastoImpor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					costogastoimporLogic.getEntityWithConnection(detalleliquidacionimporSessionBean.getlidCostoGastoImporActual());
					this.costogastoimporsForeignKey.add(costogastoimporLogic.getCostoGastoImpor());
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

	
	
	public void setActualLiquidacionImporForeignKey(Long idLiquidacionImporSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			LiquidacionImpor  liquidacionimporTemp=null;

			for(LiquidacionImpor liquidacionimporAux:liquidacionimporsForeignKey) {
				if(liquidacionimporAux.getId()!=null && liquidacionimporAux.getId().equals(idLiquidacionImporSeleccionado)) {
					liquidacionimporTemp=liquidacionimporAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(liquidacionimporTemp!=null) {

					if(this.detalleliquidacionimpor!=null) {
						this.detalleliquidacionimpor.setLiquidacionImpor(liquidacionimporTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setSelectedItem(liquidacionimporTemp);
					}
				} else {
					//jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setSelectedItem(liquidacionimporTemp);
					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLiquidacionImpor") || sFormularioTipoBusqueda.equals("Todos")){
					if(liquidacionimporTemp!=null && jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor!=null) {
						jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setSelectedItem(liquidacionimporTemp);
					} else {
						if(jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor!=null) {
							//jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setSelectedItem(liquidacionimporTemp);
							if(jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.getItemCount()>0) {
								jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setSelectedIndex(0);
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

	public String getActualLiquidacionImporForeignKeyDescripcion(Long idLiquidacionImporSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			LiquidacionImpor  liquidacionimporTemp=null;

			for(LiquidacionImpor liquidacionimporAux:liquidacionimporsForeignKey) {
				if(liquidacionimporAux.getId()!=null && liquidacionimporAux.getId().equals(idLiquidacionImporSeleccionado)) {
					liquidacionimporTemp=liquidacionimporAux;
					break;
				}
			}


			sDescripcion=LiquidacionImporConstantesFunciones.getLiquidacionImporDescripcion(liquidacionimporTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLiquidacionImporForeignKeyGenerico(Long idLiquidacionImporSeleccionado,JComboBox jComboBoxid_liquidacion_imporDetalleLiquidacionImporGenerico)throws Exception
	{
		try
		{
			LiquidacionImpor  liquidacionimporTemp=null;

			for(LiquidacionImpor liquidacionimporAux:liquidacionimporsForeignKey) {
				if(liquidacionimporAux.getId()!=null && liquidacionimporAux.getId().equals(idLiquidacionImporSeleccionado)) {
					liquidacionimporTemp=liquidacionimporAux;
					break;
				}
			}

			if(liquidacionimporTemp!=null) {
				jComboBoxid_liquidacion_imporDetalleLiquidacionImporGenerico.setSelectedItem(liquidacionimporTemp);
			} else {
				if(jComboBoxid_liquidacion_imporDetalleLiquidacionImporGenerico!=null && jComboBoxid_liquidacion_imporDetalleLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_liquidacion_imporDetalleLiquidacionImporGenerico.setSelectedIndex(0);
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

					if(this.detalleliquidacionimpor!=null) {
						this.detalleliquidacionimpor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleLiquidacionImpor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleLiquidacionImporGenerico)throws Exception
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
				jComboBoxid_empresaDetalleLiquidacionImporGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleLiquidacionImporGenerico!=null && jComboBoxid_empresaDetalleLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleLiquidacionImporGenerico.setSelectedIndex(0);
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

					if(this.detalleliquidacionimpor!=null) {
						this.detalleliquidacionimpor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleLiquidacionImpor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleLiquidacionImporGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleLiquidacionImporGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleLiquidacionImporGenerico!=null && jComboBoxid_sucursalDetalleLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleLiquidacionImporGenerico.setSelectedIndex(0);
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

					if(this.detalleliquidacionimpor!=null) {
						this.detalleliquidacionimpor.setUsuario(usuarioTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.setSelectedItem(usuarioTemp);
					}
				} else {
					//jComboBoxid_usuarioDetalleLiquidacionImpor.setSelectedItem(usuarioTemp);
					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.setSelectedIndex(0);
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
	public void setActualUsuarioForeignKeyGenerico(Long idUsuarioSeleccionado,JComboBox jComboBoxid_usuarioDetalleLiquidacionImporGenerico)throws Exception
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
				jComboBoxid_usuarioDetalleLiquidacionImporGenerico.setSelectedItem(usuarioTemp);
			} else {
				if(jComboBoxid_usuarioDetalleLiquidacionImporGenerico!=null && jComboBoxid_usuarioDetalleLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_usuarioDetalleLiquidacionImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCentroCostoForeignKey(Long idCentroCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(centrocostoTemp!=null) {

					if(this.detalleliquidacionimpor!=null) {
						this.detalleliquidacionimpor.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoDetalleLiquidacionImpor.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){
					if(centrocostoTemp!=null && jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor!=null) {
						jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setSelectedItem(centrocostoTemp);
					} else {
						if(jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor!=null) {
							//jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setSelectedItem(centrocostoTemp);
							if(jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.getItemCount()>0) {
								jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setSelectedIndex(0);
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

	public String getActualCentroCostoForeignKeyDescripcion(Long idCentroCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}


			sDescripcion=CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoDetalleLiquidacionImporGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(centrocostoTemp!=null) {
				jComboBoxid_centro_costoDetalleLiquidacionImporGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoDetalleLiquidacionImporGenerico!=null && jComboBoxid_centro_costoDetalleLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoDetalleLiquidacionImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCostoGastoImporForeignKey(Long idCostoGastoImporSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CostoGastoImpor  costogastoimporTemp=null;

			for(CostoGastoImpor costogastoimporAux:costogastoimporsForeignKey) {
				if(costogastoimporAux.getId()!=null && costogastoimporAux.getId().equals(idCostoGastoImporSeleccionado)) {
					costogastoimporTemp=costogastoimporAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(costogastoimporTemp!=null) {

					if(this.detalleliquidacionimpor!=null) {
						this.detalleliquidacionimpor.setCostoGastoImpor(costogastoimporTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setSelectedItem(costogastoimporTemp);
					}
				} else {
					//jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setSelectedItem(costogastoimporTemp);
					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCostoGastoImpor") || sFormularioTipoBusqueda.equals("Todos")){
					if(costogastoimporTemp!=null && jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor!=null) {
						jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setSelectedItem(costogastoimporTemp);
					} else {
						if(jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor!=null) {
							//jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setSelectedItem(costogastoimporTemp);
							if(jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.getItemCount()>0) {
								jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setSelectedIndex(0);
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

	public String getActualCostoGastoImporForeignKeyDescripcion(Long idCostoGastoImporSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CostoGastoImpor  costogastoimporTemp=null;

			for(CostoGastoImpor costogastoimporAux:costogastoimporsForeignKey) {
				if(costogastoimporAux.getId()!=null && costogastoimporAux.getId().equals(idCostoGastoImporSeleccionado)) {
					costogastoimporTemp=costogastoimporAux;
					break;
				}
			}


			sDescripcion=CostoGastoImporConstantesFunciones.getCostoGastoImporDescripcion(costogastoimporTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCostoGastoImporForeignKeyGenerico(Long idCostoGastoImporSeleccionado,JComboBox jComboBoxid_costo_gasto_imporDetalleLiquidacionImporGenerico)throws Exception
	{
		try
		{
			CostoGastoImpor  costogastoimporTemp=null;

			for(CostoGastoImpor costogastoimporAux:costogastoimporsForeignKey) {
				if(costogastoimporAux.getId()!=null && costogastoimporAux.getId().equals(idCostoGastoImporSeleccionado)) {
					costogastoimporTemp=costogastoimporAux;
					break;
				}
			}

			if(costogastoimporTemp!=null) {
				jComboBoxid_costo_gasto_imporDetalleLiquidacionImporGenerico.setSelectedItem(costogastoimporTemp);
			} else {
				if(jComboBoxid_costo_gasto_imporDetalleLiquidacionImporGenerico!=null && jComboBoxid_costo_gasto_imporDetalleLiquidacionImporGenerico.getItemCount()>0) {
					jComboBoxid_costo_gasto_imporDetalleLiquidacionImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLiquidacionImporForeignKey(DetalleLiquidacionImpor detalleliquidacionimpor,JComboBox jComboBoxid_liquidacion_imporDetalleLiquidacionImporGenerico)throws Exception
	{
		try
		{
			LiquidacionImpor  liquidacionimporAux=new LiquidacionImpor();

			if(jComboBoxid_liquidacion_imporDetalleLiquidacionImporGenerico==null) {
				liquidacionimporAux=(LiquidacionImpor)this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.getSelectedItem();
			} else {
				liquidacionimporAux=(LiquidacionImpor)jComboBoxid_liquidacion_imporDetalleLiquidacionImporGenerico.getSelectedItem();
			}

			if(liquidacionimporAux!=null && liquidacionimporAux.getId()!=null) {
				detalleliquidacionimpor.setid_liquidacion_impor(liquidacionimporAux.getId());
				detalleliquidacionimpor.setliquidacionimpor_descripcion(DetalleLiquidacionImporConstantesFunciones.getLiquidacionImporDescripcion(liquidacionimporAux));
				detalleliquidacionimpor.setLiquidacionImpor(liquidacionimporAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleLiquidacionImpor detalleliquidacionimpor,JComboBox jComboBoxid_empresaDetalleLiquidacionImporGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleLiquidacionImporGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleLiquidacionImporGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalleliquidacionimpor.setid_empresa(empresaAux.getId());
				detalleliquidacionimpor.setempresa_descripcion(DetalleLiquidacionImporConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalleliquidacionimpor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleLiquidacionImpor detalleliquidacionimpor,JComboBox jComboBoxid_sucursalDetalleLiquidacionImporGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleLiquidacionImporGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleLiquidacionImporGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detalleliquidacionimpor.setid_sucursal(sucursalAux.getId());
				detalleliquidacionimpor.setsucursal_descripcion(DetalleLiquidacionImporConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detalleliquidacionimpor.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUsuarioForeignKey(DetalleLiquidacionImpor detalleliquidacionimpor,JComboBox jComboBoxid_usuarioDetalleLiquidacionImporGenerico)throws Exception
	{
		try
		{
			Usuario  usuarioAux=new Usuario();

			if(jComboBoxid_usuarioDetalleLiquidacionImporGenerico==null) {
				usuarioAux=(Usuario)this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.getSelectedItem();
			} else {
				usuarioAux=(Usuario)jComboBoxid_usuarioDetalleLiquidacionImporGenerico.getSelectedItem();
			}

			if(usuarioAux!=null && usuarioAux.getId()!=null) {
				detalleliquidacionimpor.setid_usuario(usuarioAux.getId());
				detalleliquidacionimpor.setusuario_descripcion(DetalleLiquidacionImporConstantesFunciones.getUsuarioDescripcion(usuarioAux));
				detalleliquidacionimpor.setUsuario(usuarioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(DetalleLiquidacionImpor detalleliquidacionimpor,JComboBox jComboBoxid_centro_costoDetalleLiquidacionImporGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoDetalleLiquidacionImporGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoDetalleLiquidacionImporGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				detalleliquidacionimpor.setid_centro_costo(centrocostoAux.getId());
				detalleliquidacionimpor.setcentrocosto_descripcion(DetalleLiquidacionImporConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				detalleliquidacionimpor.setCentroCosto(centrocostoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCostoGastoImporForeignKey(DetalleLiquidacionImpor detalleliquidacionimpor,JComboBox jComboBoxid_costo_gasto_imporDetalleLiquidacionImporGenerico)throws Exception
	{
		try
		{
			CostoGastoImpor  costogastoimporAux=new CostoGastoImpor();

			if(jComboBoxid_costo_gasto_imporDetalleLiquidacionImporGenerico==null) {
				costogastoimporAux=(CostoGastoImpor)this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.getSelectedItem();
			} else {
				costogastoimporAux=(CostoGastoImpor)jComboBoxid_costo_gasto_imporDetalleLiquidacionImporGenerico.getSelectedItem();
			}

			if(costogastoimporAux!=null && costogastoimporAux.getId()!=null) {
				detalleliquidacionimpor.setid_costo_gasto_impor(costogastoimporAux.getId());
				detalleliquidacionimpor.setcostogastoimpor_descripcion(DetalleLiquidacionImporConstantesFunciones.getCostoGastoImporDescripcion(costogastoimporAux));
				detalleliquidacionimpor.setCostoGastoImpor(costogastoimporAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLiquidacionImporsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLiquidacionImpor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.removeAllItems();

							for(LiquidacionImpor liquidacionimpor:this.liquidacionimporsForeignKey) {
								this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.addItem(liquidacionimpor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
					}

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLiquidacionImpor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.removeAllItems();

							for(LiquidacionImpor liquidacionimpor:this.liquidacionimporsForeignKey) {
								this.jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.addItem(liquidacionimpor);
							}
						}

						if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
					}

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
					}

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.removeAllItems();

							for(Usuario usuario:this.usuariosForeignKey) {
								this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.addItem(usuario);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
					}

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCentroCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCentroCosto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
					}

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.addItem(centrocosto);
							}
						}

						if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCostoGastoImporsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCostoGastoImpor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.removeAllItems();

							for(CostoGastoImpor costogastoimpor:this.costogastoimporsForeignKey) {
								this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.addItem(costogastoimpor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { 
					}

					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCostoGastoImpor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.removeAllItems();

							for(CostoGastoImpor costogastoimpor:this.costogastoimporsForeignKey) {
								this.jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.addItem(costogastoimpor);
							}
						}

						if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameLiquidacionImporForeignKey(LiquidacionImpor liquidacionimpor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setSelectedItem(liquidacionimpor);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setSelectedItem(liquidacionimpor);
						} else {
							this.jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.setSelectedItem(usuario);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCentroCostoForeignKey(CentroCosto centrocosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setSelectedItem(centrocosto);
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCostoGastoImporForeignKey(CostoGastoImpor costogastoimpor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setSelectedItem(costogastoimpor);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setSelectedItem(costogastoimpor);
						} else {
							this.jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleLiquidacionImpor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleLiquidacionImporConstantesFunciones.refrescarForeignKeysDescripcionesDetalleLiquidacionImpor(this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleLiquidacionImporConstantesFunciones.refrescarForeignKeysDescripcionesDetalleLiquidacionImpor(this.detalleliquidacionimpors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(LiquidacionImpor.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Usuario.class));
		classes.add(new Classe(CentroCosto.class));
		classes.add(new Classe(CostoGastoImpor.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalleliquidacionimporLogic.setDetalleLiquidacionImpors(this.detalleliquidacionimpors);
			detalleliquidacionimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleLiquidacionImporParameterReturnGeneral getDetalleLiquidacionImporParameterGeneral() {
		return this.detalleliquidacionimporParameterGeneral;
	}
	
	public void setDetalleLiquidacionImporParameterGeneral(DetalleLiquidacionImporParameterReturnGeneral detalleliquidacionimporParameterGeneral) {
		this.detalleliquidacionimporParameterGeneral = detalleliquidacionimporParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleLiquidacionImpor() {
		return isPermisoTodoDetalleLiquidacionImpor;
	}

	public void setIsPermisoTodoDetalleLiquidacionImpor(Boolean isPermisoTodoDetalleLiquidacionImpor) {
		this.isPermisoTodoDetalleLiquidacionImpor = isPermisoTodoDetalleLiquidacionImpor;
	}

	public Boolean getIsPermisoNuevoDetalleLiquidacionImpor() {
		return isPermisoNuevoDetalleLiquidacionImpor;
	}

	public void setIsPermisoNuevoDetalleLiquidacionImpor(Boolean isPermisoNuevoDetalleLiquidacionImpor) {
		this.isPermisoNuevoDetalleLiquidacionImpor = isPermisoNuevoDetalleLiquidacionImpor;
	}

	public Boolean getIsPermisoActualizarDetalleLiquidacionImpor() {
		return isPermisoActualizarDetalleLiquidacionImpor;
	}

	public void setIsPermisoActualizarDetalleLiquidacionImpor(Boolean isPermisoActualizarDetalleLiquidacionImpor) {
		this.isPermisoActualizarDetalleLiquidacionImpor = isPermisoActualizarDetalleLiquidacionImpor;
	}

	public Boolean getIsPermisoEliminarDetalleLiquidacionImpor() {
		return isPermisoEliminarDetalleLiquidacionImpor;
	}

	public void setIsPermisoEliminarDetalleLiquidacionImpor(Boolean isPermisoEliminarDetalleLiquidacionImpor) {
		this.isPermisoEliminarDetalleLiquidacionImpor = isPermisoEliminarDetalleLiquidacionImpor;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleLiquidacionImpor() {
		return isPermisoGuardarCambiosDetalleLiquidacionImpor;
	}

	public void setIsPermisoGuardarCambiosDetalleLiquidacionImpor(Boolean isPermisoGuardarCambiosDetalleLiquidacionImpor) {
		this.isPermisoGuardarCambiosDetalleLiquidacionImpor = isPermisoGuardarCambiosDetalleLiquidacionImpor;
	}
	
	public Boolean getIsPermisoConsultaDetalleLiquidacionImpor() {
		return isPermisoConsultaDetalleLiquidacionImpor;
	}

	public void setIsPermisoConsultaDetalleLiquidacionImpor(Boolean isPermisoConsultaDetalleLiquidacionImpor) {
		this.isPermisoConsultaDetalleLiquidacionImpor = isPermisoConsultaDetalleLiquidacionImpor;
	}

	public Boolean getIsPermisoBusquedaDetalleLiquidacionImpor() {
		return isPermisoBusquedaDetalleLiquidacionImpor;
	}

	public void setIsPermisoBusquedaDetalleLiquidacionImpor(Boolean isPermisoBusquedaDetalleLiquidacionImpor) {
		this.isPermisoBusquedaDetalleLiquidacionImpor = isPermisoBusquedaDetalleLiquidacionImpor;
	}

	public Boolean getIsPermisoReporteDetalleLiquidacionImpor() {
		return isPermisoReporteDetalleLiquidacionImpor;
	}

	public void setIsPermisoReporteDetalleLiquidacionImpor(Boolean isPermisoReporteDetalleLiquidacionImpor) {
		this.isPermisoReporteDetalleLiquidacionImpor = isPermisoReporteDetalleLiquidacionImpor;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleLiquidacionImpor() {
		return isPermisoPaginacionMedioDetalleLiquidacionImpor;
	}

	public void setIsPermisoPaginacionMedioDetalleLiquidacionImpor(Boolean isPermisoPaginacionMedioDetalleLiquidacionImpor) {
		this.isPermisoPaginacionMedioDetalleLiquidacionImpor = isPermisoPaginacionMedioDetalleLiquidacionImpor;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleLiquidacionImpor() {
		return isPermisoPaginacionTodoDetalleLiquidacionImpor;
	}

	public void setIsPermisoPaginacionTodoDetalleLiquidacionImpor(Boolean isPermisoPaginacionTodoDetalleLiquidacionImpor) {
		this.isPermisoPaginacionTodoDetalleLiquidacionImpor = isPermisoPaginacionTodoDetalleLiquidacionImpor;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleLiquidacionImpor() {
		return isPermisoPaginacionAltoDetalleLiquidacionImpor;
	}

	public void setIsPermisoPaginacionAltoDetalleLiquidacionImpor(Boolean isPermisoPaginacionAltoDetalleLiquidacionImpor) {
		this.isPermisoPaginacionAltoDetalleLiquidacionImpor = isPermisoPaginacionAltoDetalleLiquidacionImpor;
	}
	
	public Boolean getIsPermisoCopiarDetalleLiquidacionImpor() {
		return isPermisoCopiarDetalleLiquidacionImpor;
	}

	public void setIsPermisoCopiarDetalleLiquidacionImpor(Boolean isPermisoCopiarDetalleLiquidacionImpor) {
		this.isPermisoCopiarDetalleLiquidacionImpor = isPermisoCopiarDetalleLiquidacionImpor;
	}
	
	public Boolean getIsPermisoVerFormDetalleLiquidacionImpor() {
		return isPermisoVerFormDetalleLiquidacionImpor;
	}

	public void setIsPermisoVerFormDetalleLiquidacionImpor(Boolean isPermisoVerFormDetalleLiquidacionImpor) {
		this.isPermisoVerFormDetalleLiquidacionImpor = isPermisoVerFormDetalleLiquidacionImpor;
	}
	
	public Boolean getIsPermisoDuplicarDetalleLiquidacionImpor() {
		return isPermisoDuplicarDetalleLiquidacionImpor;
	}

	public void setIsPermisoDuplicarDetalleLiquidacionImpor(Boolean isPermisoDuplicarDetalleLiquidacionImpor) {
		this.isPermisoDuplicarDetalleLiquidacionImpor = isPermisoDuplicarDetalleLiquidacionImpor;
	}
	
	public Boolean getIsPermisoOrdenDetalleLiquidacionImpor() {
		return isPermisoOrdenDetalleLiquidacionImpor;
	}

	public void setIsPermisoOrdenDetalleLiquidacionImpor(Boolean isPermisoOrdenDetalleLiquidacionImpor) {
		this.isPermisoOrdenDetalleLiquidacionImpor = isPermisoOrdenDetalleLiquidacionImpor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleLiquidacionImpor() {
		return isVisibilidadCeldaNuevoDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaNuevoDetalleLiquidacionImpor(Boolean isVisibilidadCeldaNuevoDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor = isVisibilidadCeldaNuevoDetalleLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleLiquidacionImpor() {
		return isVisibilidadCeldaDuplicarDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleLiquidacionImpor(Boolean isVisibilidadCeldaDuplicarDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpor = isVisibilidadCeldaDuplicarDetalleLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleLiquidacionImpor() {
		return isVisibilidadCeldaCopiarDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaCopiarDetalleLiquidacionImpor(Boolean isVisibilidadCeldaCopiarDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaCopiarDetalleLiquidacionImpor = isVisibilidadCeldaCopiarDetalleLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleLiquidacionImpor() {
		return isVisibilidadCeldaVerFormDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaVerFormDetalleLiquidacionImpor(Boolean isVisibilidadCeldaVerFormDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaVerFormDetalleLiquidacionImpor = isVisibilidadCeldaVerFormDetalleLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleLiquidacionImpor() {
		return isVisibilidadCeldaOrdenDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaOrdenDetalleLiquidacionImpor(Boolean isVisibilidadCeldaOrdenDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaOrdenDetalleLiquidacionImpor = isVisibilidadCeldaOrdenDetalleLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor() {
		return isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor(Boolean isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor = isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleLiquidacionImpor() {
		return isVisibilidadCeldaModificarDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaModificarDetalleLiquidacionImpor(Boolean isVisibilidadCeldaModificarDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaModificarDetalleLiquidacionImpor = isVisibilidadCeldaModificarDetalleLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleLiquidacionImpor() {
		return isVisibilidadCeldaActualizarDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaActualizarDetalleLiquidacionImpor(Boolean isVisibilidadCeldaActualizarDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor = isVisibilidadCeldaActualizarDetalleLiquidacionImpor;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleLiquidacionImpor() {
		return isVisibilidadCeldaEliminarDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaEliminarDetalleLiquidacionImpor(Boolean isVisibilidadCeldaEliminarDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor = isVisibilidadCeldaEliminarDetalleLiquidacionImpor;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleLiquidacionImpor() {
		return isVisibilidadCeldaCancelarDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaCancelarDetalleLiquidacionImpor(Boolean isVisibilidadCeldaCancelarDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor = isVisibilidadCeldaCancelarDetalleLiquidacionImpor;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleLiquidacionImpor() {
		return isVisibilidadCeldaGuardarDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaGuardarDetalleLiquidacionImpor(Boolean isVisibilidadCeldaGuardarDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor = isVisibilidadCeldaGuardarDetalleLiquidacionImpor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor() {
		return isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor(Boolean isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor) {
		this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor = isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor;
	}
		
	public DetalleLiquidacionImporSessionBean getdetalleliquidacionimporSessionBean() {
		return this.detalleliquidacionimporSessionBean;
	}
	
	public void setdetalleliquidacionimporSessionBean(DetalleLiquidacionImporSessionBean detalleliquidacionimporSessionBean) {
		this.detalleliquidacionimporSessionBean=detalleliquidacionimporSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCentroCosto() {
		return this.isVisibilidadFK_IdCentroCosto;
	}

	public void setisVisibilidadFK_IdCentroCosto(Boolean isVisibilidadFK_IdCentroCosto) {
		this.isVisibilidadFK_IdCentroCosto=isVisibilidadFK_IdCentroCosto;
	}

	public Boolean getisVisibilidadFK_IdCostoGastoImpor() {
		return this.isVisibilidadFK_IdCostoGastoImpor;
	}

	public void setisVisibilidadFK_IdCostoGastoImpor(Boolean isVisibilidadFK_IdCostoGastoImpor) {
		this.isVisibilidadFK_IdCostoGastoImpor=isVisibilidadFK_IdCostoGastoImpor;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdLiquidacionImpor() {
		return this.isVisibilidadFK_IdLiquidacionImpor;
	}

	public void setisVisibilidadFK_IdLiquidacionImpor(Boolean isVisibilidadFK_IdLiquidacionImpor) {
		this.isVisibilidadFK_IdLiquidacionImpor=isVisibilidadFK_IdLiquidacionImpor;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor)throws Exception {
		try {
			
				this.setActualParaGuardarLiquidacionImporForeignKey(detalleliquidacionimpor,null);
				this.setActualParaGuardarEmpresaForeignKey(detalleliquidacionimpor,null);
				this.setActualParaGuardarSucursalForeignKey(detalleliquidacionimpor,null);
				this.setActualParaGuardarUsuarioForeignKey(detalleliquidacionimpor,null);
				this.setActualParaGuardarCentroCostoForeignKey(detalleliquidacionimpor,null);
				this.setActualParaGuardarCostoGastoImporForeignKey(detalleliquidacionimpor,null);
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
	
	public void bugActualizarReferenciaActual(DetalleLiquidacionImpor detalleliquidacionimpor,DetalleLiquidacionImpor detalleliquidacionimporAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleLiquidacionImpor(detalleliquidacionimpor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalleliquidacionimporAux.setId(detalleliquidacionimpor.getId());
		detalleliquidacionimporAux.setVersionRow(detalleliquidacionimpor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleLiquidacionImpor();
		
			int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalleliquidacionimporValidator.getInvalidValues(this.detalleliquidacionimpor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalleliquidacionimporLogic.setDatosCliente(datosCliente);
			detalleliquidacionimporLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalleliquidacionimporAux=new  DetalleLiquidacionImpor();
				
				detalleliquidacionimporAux.setIsNew(true);
				detalleliquidacionimporAux.setIsChanged(true);
				
				detalleliquidacionimporAux.setDetalleLiquidacionImporOriginal(this.detalleliquidacionimpor);
				
				detalleliquidacionimporAux.setId(this.detalleliquidacionimpor.getId());	
				detalleliquidacionimporAux.setVersionRow(this.detalleliquidacionimpor.getVersionRow());	
				detalleliquidacionimporAux.setid_liquidacion_impor(this.detalleliquidacionimpor.getid_liquidacion_impor());	
				detalleliquidacionimporAux.setid_empresa(this.detalleliquidacionimpor.getid_empresa());	
				detalleliquidacionimporAux.setid_sucursal(this.detalleliquidacionimpor.getid_sucursal());	
				detalleliquidacionimporAux.setid_usuario(this.detalleliquidacionimpor.getid_usuario());	
				detalleliquidacionimporAux.setid_centro_costo(this.detalleliquidacionimpor.getid_centro_costo());	
				detalleliquidacionimporAux.setid_costo_gasto_impor(this.detalleliquidacionimpor.getid_costo_gasto_impor());	
				detalleliquidacionimporAux.setvalor(this.detalleliquidacionimpor.getvalor());	
				detalleliquidacionimporAux.setfecha(this.detalleliquidacionimpor.getfecha());	
				detalleliquidacionimporAux.setreferencia(this.detalleliquidacionimpor.getreferencia());	
				detalleliquidacionimporAux.setimpuesto(this.detalleliquidacionimpor.getimpuesto());	
				detalleliquidacionimporAux.setimpuesto2(this.detalleliquidacionimpor.getimpuesto2());	
				detalleliquidacionimporAux.setimpuesto3(this.detalleliquidacionimpor.getimpuesto3());	
				detalleliquidacionimporAux.setimpuesto4(this.detalleliquidacionimpor.getimpuesto4());	
				detalleliquidacionimporAux.setimpuesto5(this.detalleliquidacionimpor.getimpuesto5());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalleliquidacionimporAux,detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleliquidacionimporAux,detalleliquidacionimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporLogic.saveDetalleLiquidacionImpors();//WithConnection
						//detalleliquidacionimporLogic.getSetVersionRowDetalleLiquidacionImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleliquidacionimpor,detalleliquidacionimporAux);
					
					this.refrescarForeignKeysDescripcionesDetalleLiquidacionImpor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleliquidacionimporLogic.saveDetalleLiquidacionImporRelaciones(detalleliquidacionimporAux);//WithConnection
								//detalleliquidacionimporLogic.getSetVersionRowDetalleLiquidacionImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleliquidacionimpor,detalleliquidacionimporAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleliquidacionimporAux,detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleliquidacionimporAux,detalleliquidacionimpors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleliquidacionimpor,detalleliquidacionimporAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalleliquidacionimporAux=new  DetalleLiquidacionImpor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() 
					|| (this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() && this.detalleliquidacionimpor.getId()>=0)) {
						
					detalleliquidacionimporAux.setIsNew(false);
				}
				
				detalleliquidacionimporAux.setIsDeleted(false);
			
				detalleliquidacionimporAux.setId(this.detalleliquidacionimpor.getId());	
				detalleliquidacionimporAux.setVersionRow(this.detalleliquidacionimpor.getVersionRow());	
				detalleliquidacionimporAux.setid_liquidacion_impor(this.detalleliquidacionimpor.getid_liquidacion_impor());	
				detalleliquidacionimporAux.setid_empresa(this.detalleliquidacionimpor.getid_empresa());	
				detalleliquidacionimporAux.setid_sucursal(this.detalleliquidacionimpor.getid_sucursal());	
				detalleliquidacionimporAux.setid_usuario(this.detalleliquidacionimpor.getid_usuario());	
				detalleliquidacionimporAux.setid_centro_costo(this.detalleliquidacionimpor.getid_centro_costo());	
				detalleliquidacionimporAux.setid_costo_gasto_impor(this.detalleliquidacionimpor.getid_costo_gasto_impor());	
				detalleliquidacionimporAux.setvalor(this.detalleliquidacionimpor.getvalor());	
				detalleliquidacionimporAux.setfecha(this.detalleliquidacionimpor.getfecha());	
				detalleliquidacionimporAux.setreferencia(this.detalleliquidacionimpor.getreferencia());	
				detalleliquidacionimporAux.setimpuesto(this.detalleliquidacionimpor.getimpuesto());	
				detalleliquidacionimporAux.setimpuesto2(this.detalleliquidacionimpor.getimpuesto2());	
				detalleliquidacionimporAux.setimpuesto3(this.detalleliquidacionimpor.getimpuesto3());	
				detalleliquidacionimporAux.setimpuesto4(this.detalleliquidacionimpor.getimpuesto4());	
				detalleliquidacionimporAux.setimpuesto5(this.detalleliquidacionimpor.getimpuesto5());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleliquidacionimporAux,detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleliquidacionimporAux,detalleliquidacionimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporLogic.saveDetalleLiquidacionImpors();//WithConnection
						//detalleliquidacionimporLogic.getSetVersionRowDetalleLiquidacionImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleliquidacionimpor,detalleliquidacionimporAux);
					
					this.refrescarForeignKeysDescripcionesDetalleLiquidacionImpor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleliquidacionimporLogic.saveDetalleLiquidacionImporRelaciones(detalleliquidacionimporAux);//WithConnection
								//detalleliquidacionimporLogic.getSetVersionRowDetalleLiquidacionImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleliquidacionimpor,detalleliquidacionimporAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleliquidacionimporAux,detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleliquidacionimporAux,detalleliquidacionimpors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleliquidacionimpor,detalleliquidacionimporAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalleliquidacionimporAux=new  DetalleLiquidacionImpor();
				
				detalleliquidacionimporAux.setIsNew(false);
				detalleliquidacionimporAux.setIsChanged(false);
				
				detalleliquidacionimporAux.setIsDeleted(true);
				
				detalleliquidacionimporAux.setId(this.detalleliquidacionimpor.getId());	
				detalleliquidacionimporAux.setVersionRow(this.detalleliquidacionimpor.getVersionRow());	
				detalleliquidacionimporAux.setid_liquidacion_impor(this.detalleliquidacionimpor.getid_liquidacion_impor());	
				detalleliquidacionimporAux.setid_empresa(this.detalleliquidacionimpor.getid_empresa());	
				detalleliquidacionimporAux.setid_sucursal(this.detalleliquidacionimpor.getid_sucursal());	
				detalleliquidacionimporAux.setid_usuario(this.detalleliquidacionimpor.getid_usuario());	
				detalleliquidacionimporAux.setid_centro_costo(this.detalleliquidacionimpor.getid_centro_costo());	
				detalleliquidacionimporAux.setid_costo_gasto_impor(this.detalleliquidacionimpor.getid_costo_gasto_impor());	
				detalleliquidacionimporAux.setvalor(this.detalleliquidacionimpor.getvalor());	
				detalleliquidacionimporAux.setfecha(this.detalleliquidacionimpor.getfecha());	
				detalleliquidacionimporAux.setreferencia(this.detalleliquidacionimpor.getreferencia());	
				detalleliquidacionimporAux.setimpuesto(this.detalleliquidacionimpor.getimpuesto());	
				detalleliquidacionimporAux.setimpuesto2(this.detalleliquidacionimpor.getimpuesto2());	
				detalleliquidacionimporAux.setimpuesto3(this.detalleliquidacionimpor.getimpuesto3());	
				detalleliquidacionimporAux.setimpuesto4(this.detalleliquidacionimpor.getimpuesto4());	
				detalleliquidacionimporAux.setimpuesto5(this.detalleliquidacionimpor.getimpuesto5());	
				
				if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalleliquidacionimporAux.getId()>=0) {	
						this.detalleliquidacionimporsEliminados.add(detalleliquidacionimporAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalleliquidacionimporAux,detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleliquidacionimporAux,detalleliquidacionimpors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporLogic.saveDetalleLiquidacionImpors();//WithConnection
						//detalleliquidacionimporLogic.getSetVersionRowDetalleLiquidacionImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleliquidacionimporLogic.saveDetalleLiquidacionImporRelaciones(detalleliquidacionimporAux);//WithConnection
								//detalleliquidacionimporLogic.getSetVersionRowDetalleLiquidacionImpors();//WithConnection
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
							if(this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalleliquidacionimporAux,detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalleliquidacionimporAux,detalleliquidacionimpors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(this.detalleliquidacionimporsEliminados);
					
					detalleliquidacionimporLogic.saveDetalleLiquidacionImpors();//WithConnection
					//detalleliquidacionimporLogic.getSetVersionRowDetalleLiquidacionImpors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleLiquidacionImpor();
				
				this.detalleliquidacionimporsEliminados= new ArrayList<DetalleLiquidacionImpor>();		
			}
			
			if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Liquidacion Impor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalleliquidacionimpor=detalleliquidacionimporAux;
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
      		//this.finishProcessDetalleLiquidacionImpor();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleLiquidacionImpor detalleliquidacionimporLocal) throws Exception {
		
		if(this.detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleLiquidacionImpor detalleliquidacionimporLocal) throws Exception {	
		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(LiquidacionImporDetalleFormJInternalFrame.class)) {
				LiquidacionImporBeanSwingJInternalFrame liquidacionimporBeanSwingJInternalFrameLocal=(LiquidacionImporBeanSwingJInternalFrame) ((LiquidacionImporDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				liquidacionimporBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLiquidacionImpor(liquidacionimporBeanSwingJInternalFrameLocal.getliquidacionimpor(),true);
				liquidacionimporBeanSwingJInternalFrameLocal.actualizarLista(liquidacionimporBeanSwingJInternalFrameLocal.liquidacionimpor,this.liquidacionimporsForeignKey);

				liquidacionimporBeanSwingJInternalFrameLocal.actualizarRelaciones(liquidacionimporBeanSwingJInternalFrameLocal.liquidacionimpor);

				detalleliquidacionimporLocal.setLiquidacionImpor(liquidacionimporBeanSwingJInternalFrameLocal.liquidacionimpor);

				this.addItemDefectoCombosForeignKeyLiquidacionImpor();
				this.cargarCombosFrameLiquidacionImporsForeignKey("Formulario");
				this.setActualLiquidacionImporForeignKey(liquidacionimporBeanSwingJInternalFrameLocal.liquidacionimpor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalleliquidacionimporLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detalleliquidacionimporLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UsuarioDetalleFormJInternalFrame.class)) {
				UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrameLocal=(UsuarioBeanSwingJInternalFrame) ((UsuarioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				usuarioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUsuario(usuarioBeanSwingJInternalFrameLocal.getusuario(),true);
				usuarioBeanSwingJInternalFrameLocal.actualizarLista(usuarioBeanSwingJInternalFrameLocal.usuario,this.usuariosForeignKey);

				usuarioBeanSwingJInternalFrameLocal.actualizarRelaciones(usuarioBeanSwingJInternalFrameLocal.usuario);

				detalleliquidacionimporLocal.setUsuario(usuarioBeanSwingJInternalFrameLocal.usuario);

				this.addItemDefectoCombosForeignKeyUsuario();
				this.cargarCombosFrameUsuariosForeignKey("Formulario");
				this.setActualUsuarioForeignKey(usuarioBeanSwingJInternalFrameLocal.usuario.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				detalleliquidacionimporLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CostoGastoImporDetalleFormJInternalFrame.class)) {
				CostoGastoImporBeanSwingJInternalFrame costogastoimporBeanSwingJInternalFrameLocal=(CostoGastoImporBeanSwingJInternalFrame) ((CostoGastoImporDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				costogastoimporBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCostoGastoImpor(costogastoimporBeanSwingJInternalFrameLocal.getcostogastoimpor(),true);
				costogastoimporBeanSwingJInternalFrameLocal.actualizarLista(costogastoimporBeanSwingJInternalFrameLocal.costogastoimpor,this.costogastoimporsForeignKey);

				costogastoimporBeanSwingJInternalFrameLocal.actualizarRelaciones(costogastoimporBeanSwingJInternalFrameLocal.costogastoimpor);

				detalleliquidacionimporLocal.setCostoGastoImpor(costogastoimporBeanSwingJInternalFrameLocal.costogastoimpor);

				this.addItemDefectoCombosForeignKeyCostoGastoImpor();
				this.cargarCombosFrameCostoGastoImporsForeignKey("Formulario");
				this.setActualCostoGastoImporForeignKey(costogastoimporBeanSwingJInternalFrameLocal.costogastoimpor.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleLiquidacionImporActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalleliquidacionimporValidator.getInvalidValues(this.detalleliquidacionimpor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleLiquidacionImpor detalleliquidacionimpor,List<DetalleLiquidacionImpor> detalleliquidacionimpors) throws Exception {
		try	{		
			DetalleLiquidacionImporConstantesFunciones.actualizarLista(detalleliquidacionimpor,detalleliquidacionimpors,this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleLiquidacionImpor detalleliquidacionimpor,List<DetalleLiquidacionImpor> detalleliquidacionimpors) throws Exception {
		try	{			
			DetalleLiquidacionImporConstantesFunciones.actualizarSelectedLista(detalleliquidacionimpor,detalleliquidacionimpors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleLiquidacionImpor> detalleliquidacionimporsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalleliquidacionimporsLocal=this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalleliquidacionimporsLocal=this.detalleliquidacionimpors;
			}
			//ARCHITECTURE
		
			for(DetalleLiquidacionImpor detalleliquidacionimporLocal:detalleliquidacionimporsLocal) {
				if(this.permiteMantenimiento(detalleliquidacionimporLocal) && detalleliquidacionimporLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleLiquidacionImporConstantesFunciones.getDetalleLiquidacionImporLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.IDLIQUIDACIONIMPOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_liquidacion_imporDetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_empresaDetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_sucursalDetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.IDUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_usuarioDetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_centro_costoDetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.IDCOSTOGASTOIMPOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_costo_gasto_imporDetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelvalorDetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelfechaDetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.REFERENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelreferenciaDetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.IMPUESTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuestoDetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.IMPUESTO2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto2DetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.IMPUESTO3)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto3DetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.IMPUESTO4)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto4DetalleLiquidacionImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleLiquidacionImporConstantesFunciones.IMPUESTO5)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto5DetalleLiquidacionImpor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_liquidacion_imporDetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_empresaDetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_sucursalDetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_usuarioDetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_centro_costoDetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelid_costo_gasto_imporDetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelvalorDetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelfechaDetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelreferenciaDetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuestoDetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto2DetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto3DetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto4DetalleLiquidacionImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto5DetalleLiquidacionImpor,"");
		
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
		this.iIdNuevoDetalleLiquidacionImpor--;	
		
		
		this.detalleliquidacionimporAux=new DetalleLiquidacionImpor();
		
		this.detalleliquidacionimporAux.setId(this.iIdNuevoDetalleLiquidacionImpor);
		this.detalleliquidacionimporAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().add(this.detalleliquidacionimporAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalleliquidacionimpors.add(this.detalleliquidacionimporAux);
		}
		//ARCHITECTURE
		
		this.detalleliquidacionimpor=this.detalleliquidacionimporAux;
		
		if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleLiquidacionImpor(this.detalleliquidacionimpor);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleLiquidacionImpor(this.detalleliquidacionimpor);
		}
				
		//this.setDefaultControlesDetalleLiquidacionImpor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleLiquidacionImpor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleLiquidacionImpor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleLiquidacionImpor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimporBean,this.detalleliquidacionimpor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
			classes=DetalleLiquidacionImporConstantesFunciones.getClassesRelationshipsOfDetalleLiquidacionImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalleliquidacionimporReturnGeneral=detalleliquidacionimporLogic.procesarEventosDetalleLiquidacionImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors(),this.detalleliquidacionimpor,this.detalleliquidacionimporParameterGeneral,this.isEsNuevoDetalleLiquidacionImpor,classes);//this.detalleliquidacionimporLogic.getDetalleLiquidacionImpor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleLiquidacionImpor(this.detalleliquidacionimporReturnGeneral,this.detalleliquidacionimporBean,false);
		
		if(this.detalleliquidacionimporReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleLiquidacionImpor(this.detalleliquidacionimporReturnGeneral.getDetalleLiquidacionImpor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleLiquidacionImpor(this.detalleliquidacionimporReturnGeneral.getDetalleLiquidacionImpor());
		}
		
		if(this.detalleliquidacionimporReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleLiquidacionImpor(this.detalleliquidacionimporReturnGeneral.getDetalleLiquidacionImpor(),classes);//this.detalleliquidacionimporBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleLiquidacionImpor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleLiquidacionImpor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.RecargarFormDetalleLiquidacionImpor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
						
			if(detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleLiquidacionImpor();
			}
			
			this.actualizarVisualTableDatosDetalleLiquidacionImpor();
			
			this.jTableDatosDetalleLiquidacionImpor.setRowSelectionInterval(this.getIndiceNuevoDetalleLiquidacionImpor(), this.getIndiceNuevoDetalleLiquidacionImpor());
			
			this.seleccionarFilaTablaDetalleLiquidacionImporActual();
						
			this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleLiquidacionImpor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldvalorDetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarvalorDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jDateChooserfechaDetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarfechaDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldreferenciaDetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarreferenciaDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuestoDetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarimpuestoDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto2DetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarimpuesto2DetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto3DetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarimpuesto3DetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto4DetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarimpuesto4DetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto5DetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarimpuesto5DetalleLiquidacionImpor);	
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarid_liquidacion_imporDetalleLiquidacionImpor);//
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarid_empresaDetalleLiquidacionImpor);//
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarid_sucursalDetalleLiquidacionImpor);//
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarid_usuarioDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarid_centro_costoDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setEnabled(isHabilitar && this.detalleliquidacionimporConstantesFunciones.activarid_costo_gasto_imporDetalleLiquidacionImpor);
	};
	
	public void setDefaultControlesDetalleLiquidacionImpor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleLiquidacionImpor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalleliquidacionimporSessionBean.setConGuardarRelaciones(true);			
			this.detalleliquidacionimporSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTabbedPaneRelacionesDetalleLiquidacionImpor.setVisible(true);
			
					
		} else {
			//this.detalleliquidacionimporSessionBean.setConGuardarRelaciones(false);			
			this.detalleliquidacionimporSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTabbedPaneRelacionesDetalleLiquidacionImpor.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleLiquidacionImpor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
				if(detalleliquidacionimporAux.getId().equals(this.iIdNuevoDetalleLiquidacionImpor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimpors) {
				if(detalleliquidacionimporAux.getId().equals(this.iIdNuevoDetalleLiquidacionImpor)) {
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
	
	public int getIndiceActualDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
				if(detalleliquidacionimporAux.getId().equals(detalleliquidacionimpor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimpors) {
				if(detalleliquidacionimporAux.getId().equals(detalleliquidacionimpor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimporOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
				if(detalleliquidacionimporAux.getDetalleLiquidacionImporOriginal().getId().equals(detalleliquidacionimporOriginal.getId())) {
					existe=true;
					detalleliquidacionimporOriginal.setId(detalleliquidacionimporAux.getId());
					detalleliquidacionimporOriginal.setVersionRow(detalleliquidacionimporAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimpors) {
				if(detalleliquidacionimporAux.getDetalleLiquidacionImporOriginal().getId().equals(detalleliquidacionimporOriginal.getId())) {
					existe=true;
					detalleliquidacionimporOriginal.setId(detalleliquidacionimporAux.getId());
					detalleliquidacionimporOriginal.setVersionRow(detalleliquidacionimporAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleLiquidacionImpor(Boolean esParaCancelar) throws Exception {
		detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
		detalleliquidacionimporAux=new DetalleLiquidacionImpor();
		
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
					if(detalleliquidacionimporAux.getId()<0) {
						detalleliquidacionimporsAux.add(detalleliquidacionimporAux);
					}		
				}
				this.iIdNuevoDetalleLiquidacionImpor=0L;
				this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().removeAll(detalleliquidacionimporsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimpors) {
					if(detalleliquidacionimporAux.getId()<0) {
						detalleliquidacionimporsAux.add(detalleliquidacionimporAux);
					}		
				}
				this.iIdNuevoDetalleLiquidacionImpor=0L;
				this.detalleliquidacionimpors.removeAll(detalleliquidacionimporsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleLiquidacionImpor 
					&& this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size()>0
					) {
					detalleliquidacionimporAux=this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().get(this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size() - 1);
				
					if(detalleliquidacionimporAux.getId()<0) {
						this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().remove(detalleliquidacionimporAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleLiquidacionImpor && this.detalleliquidacionimpors.size()>0) {
					detalleliquidacionimporAux=this.detalleliquidacionimpors.get(this.detalleliquidacionimpors.size() - 1);
				
					if(detalleliquidacionimporAux.getId()<0) {
						this.detalleliquidacionimpors.remove(detalleliquidacionimporAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleLiquidacionImpor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalleliquidacionimpor.getId()<0) {
				this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().remove(this.detalleliquidacionimpor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalleliquidacionimpor.getId()<0) {
				this.detalleliquidacionimpors.remove(this.detalleliquidacionimpor);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleLiquidacionImpor(List<DetalleLiquidacionImpor> detalleliquidacionimporsAux) throws Exception {
		DetalleLiquidacionImporConstantesFunciones.setEstadosInicialesDetalleLiquidacionImpor(detalleliquidacionimporsAux);
	}
	
	public void setEstadosInicialesDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimporAux) throws Exception {
		DetalleLiquidacionImporConstantesFunciones.setEstadosInicialesDetalleLiquidacionImpor(detalleliquidacionimporAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleLiquidacionImporActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleLiquidacionImporActual()) {
				if(!this.isEsNuevoDetalleLiquidacionImpor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleLiquidacionImpor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleLiquidacionImporActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Liquidacion Impor ?", "MANTENIMIENTO DE Detalle Liquidacion Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleLiquidacionImpor detalleliquidacionimpor) throws Exception {
		DetalleLiquidacionImporConstantesFunciones.seleccionarAsignar(this.detalleliquidacionimpor,detalleliquidacionimpor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleLiquidacionImpor=this.isPermisoActualizarOriginalDetalleLiquidacionImpor;
			
			
			this.seleccionarAsignar(detalleliquidacionimpor);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleLiquidacionImporConstantesFunciones.quitarEspaciosDetalleLiquidacionImpor(this.detalleliquidacionimpor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalleliquidacionimporSessionBean.setsFuncionBusquedaRapida(this.detalleliquidacionimporSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleLiquidacionImpor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleLiquidacionImpor(esParaCancelar);				
				this.cancelarNuevoDetalleLiquidacionImpor(esParaCancelar);								
			}
			
			this.detalleliquidacionimpor=new DetalleLiquidacionImpor();
			
			this.inicializarDetalleLiquidacionImpor();
			
			this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleLiquidacionImpor() throws Exception {
		try {
			DetalleLiquidacionImporConstantesFunciones.inicializarDetalleLiquidacionImpor(this.detalleliquidacionimpor);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleLiquidacionImpors(String sAccionBusqueda,List<DetalleLiquidacionImpor> detalleliquidacionimporsParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleLiquidacionImpor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleLiquidacionImporMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleLiquidacionImporMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleLiquidacionImpor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Liquidacion Impores");		
		parameters.put("busquedapor", DetalleLiquidacionImporConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleLiquidacionImpor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleLiquidacionImporConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleLiquidacionImporConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleLiquidacionImpor=new JRBeanArrayDataSource(DetalleLiquidacionImporJInternalFrame.TraerDetalleLiquidacionImporBeans(detalleliquidacionimporsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleLiquidacionImpor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleLiquidacionImporConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleLiquidacionImporConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleLiquidacionImporBean.TraerDetalleLiquidacionImporBeans(detalleliquidacionimporsParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimporsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimporsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImporActionPerformed(null);
					//this.generarExcelReporteDetalleLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimporsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimporsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimporsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleLiquidacionImpors(sAccionBusqueda,sTipoArchivoReporte,detalleliquidacionimporsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleLiquidacionImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleLiquidacionImpor> detalleliquidacionimporsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleLiquidacionImpors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleLiquidacionImpor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleLiquidacionImpor detalleliquidacionimpor : detalleliquidacionimporsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleLiquidacionImporConstantesFunciones.generarExcelReporteDataDetalleLiquidacionImpor("NORMAL",row,workbook,detalleliquidacionimpor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleLiquidacionImpor(String sTipo,Row row,Workbook workbook) {
		
		DetalleLiquidacionImporConstantesFunciones.generarExcelReporteHeaderDetalleLiquidacionImpor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleLiquidacionImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleLiquidacionImpor> detalleliquidacionimporsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleLiquidacionImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleLiquidacionImpor detalleliquidacionimpor : detalleliquidacionimporsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.getDetalleLiquidacionImporDescripcion(detalleliquidacionimpor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getliquidacionimpor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getusuario_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getcentrocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getcostogastoimpor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getreferencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getimpuesto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getimpuesto2());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getimpuesto3());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getimpuesto4());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleliquidacionimpor.getimpuesto5());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleLiquidacionImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleLiquidacionImpor> detalleliquidacionimporsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleLiquidacionImpor> detalleliquidacionimporsRespaldo=null;
		
		classes=DetalleLiquidacionImporConstantesFunciones.getClassesRelationshipsOfDetalleLiquidacionImpor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalleliquidacionimporLogic.setDatosCliente(this.datosCliente);
		this.detalleliquidacionimporLogic.setDatosDeep(this.datosDeep);
		this.detalleliquidacionimporLogic.setIsConDeep(true);
		
		detalleliquidacionimporsRespaldo=this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors();
		
		this.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(detalleliquidacionimporsParaReportes);	
		this.detalleliquidacionimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalleliquidacionimporsParaReportes=this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors();
		this.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(detalleliquidacionimporsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleLiquidacionImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleLiquidacionImpor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleLiquidacionImpor detalleliquidacionimpor : detalleliquidacionimporsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleLiquidacionImpor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleLiquidacionImporConstantesFunciones.generarExcelReporteDataDetalleLiquidacionImpor("NORMAL",row,workbook,detalleliquidacionimpor,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.getDetalleLiquidacionImporDescripcion(detalleliquidacionimpor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleLiquidacionImpor() throws Exception {		
		this.startProcessDetalleLiquidacionImpor(true);
	}
	
	public void startProcessDetalleLiquidacionImpor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleLiquidacionImpor ,this.jPanelParametrosReportesDetalleLiquidacionImpor, this.jScrollPanelDatosDetalleLiquidacionImpor,this.jPanelPaginacionDetalleLiquidacionImpor, this.jScrollPanelDatosEdicionDetalleLiquidacionImpor, this.jPanelAccionesDetalleLiquidacionImpor,this.jPanelAccionesFormularioDetalleLiquidacionImpor,this.jmenuBarDetalleLiquidacionImpor,this.jmenuBarDetalleDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleDetalleLiquidacionImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleLiquidacionImpor=this.jTabbedPaneBusquedasDetalleLiquidacionImpor; 
		
		final JPanel jPanelParametrosReportesDetalleLiquidacionImpor=this.jPanelParametrosReportesDetalleLiquidacionImpor;
		//final JScrollPane jScrollPanelDatosDetalleLiquidacionImpor=this.jScrollPanelDatosDetalleLiquidacionImpor;
		final JTable jTableDatosDetalleLiquidacionImpor=this.jTableDatosDetalleLiquidacionImpor;		
		final JPanel jPanelPaginacionDetalleLiquidacionImpor=this.jPanelPaginacionDetalleLiquidacionImpor;
		//final JScrollPane jScrollPanelDatosEdicionDetalleLiquidacionImpor=this.jScrollPanelDatosEdicionDetalleLiquidacionImpor;
		final JPanel jPanelAccionesDetalleLiquidacionImpor=this.jPanelAccionesDetalleLiquidacionImpor;
		
		JPanel jPanelCamposAuxiliarDetalleLiquidacionImpor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			jPanelCamposAuxiliarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelCamposDetalleLiquidacionImpor;
			jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelAccionesFormularioDetalleLiquidacionImpor;
		}
		
		final JPanel jPanelCamposDetalleLiquidacionImpor=jPanelCamposAuxiliarDetalleLiquidacionImpor;
		final JPanel jPanelAccionesFormularioDetalleLiquidacionImpor=jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpor;
		
		
		final JMenuBar jmenuBarDetalleLiquidacionImpor=this.jmenuBarDetalleLiquidacionImpor;
		final JToolBar jTtoolBarDetalleLiquidacionImpor=this.jTtoolBarDetalleLiquidacionImpor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleLiquidacionImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleLiquidacionImpor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			jmenuBarDetalleAuxiliarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jmenuBarDetalleDetalleLiquidacionImpor;
			jTtoolBarDetalleAuxiliarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTtoolBarDetalleDetalleLiquidacionImpor;
		}
		
		final JMenuBar jmenuBarDetalleDetalleLiquidacionImpor=jmenuBarDetalleAuxiliarDetalleLiquidacionImpor;
		final JToolBar jTtoolBarDetalleDetalleLiquidacionImpor=jTtoolBarDetalleAuxiliarDetalleLiquidacionImpor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleLiquidacionImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleLiquidacionImpor;
			processRunnable.jTableDatos=jTableDatosDetalleLiquidacionImpor;
			processRunnable.jPanelCampos=jPanelCamposDetalleLiquidacionImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleLiquidacionImpor;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleLiquidacionImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleLiquidacionImpor;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleLiquidacionImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleLiquidacionImpor;
			processRunnable.jTtoolBar=jTtoolBarDetalleLiquidacionImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleLiquidacionImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleLiquidacionImpor ,jPanelParametrosReportesDetalleLiquidacionImpor,jTableDatosDetalleLiquidacionImpor, /*jScrollPanelDatosDetalleLiquidacionImpor,*/jPanelCamposDetalleLiquidacionImpor,jPanelPaginacionDetalleLiquidacionImpor, /*jScrollPanelDatosEdicionDetalleLiquidacionImpor,*/ jPanelAccionesDetalleLiquidacionImpor,jPanelAccionesFormularioDetalleLiquidacionImpor,jmenuBarDetalleLiquidacionImpor,jmenuBarDetalleDetalleLiquidacionImpor,jTtoolBarDetalleLiquidacionImpor,jTtoolBarDetalleDetalleLiquidacionImpor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleLiquidacionImpor ,jPanelParametrosReportesDetalleLiquidacionImpor, jScrollPanelDatosDetalleLiquidacionImpor,jPanelPaginacionDetalleLiquidacionImpor, jScrollPanelDatosEdicionDetalleLiquidacionImpor, jPanelAccionesDetalleLiquidacionImpor,jPanelAccionesFormularioDetalleLiquidacionImpor,jmenuBarDetalleLiquidacionImpor,jmenuBarDetalleDetalleLiquidacionImpor,jTtoolBarDetalleLiquidacionImpor,jTtoolBarDetalleDetalleLiquidacionImpor);
						
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
	
	public void finishProcessDetalleLiquidacionImpor() {// throws Exception 
		this.finishProcessDetalleLiquidacionImpor(true);
	}
	
	public void finishProcessDetalleLiquidacionImpor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleLiquidacionImpor ,this.jPanelParametrosReportesDetalleLiquidacionImpor, this.jScrollPanelDatosDetalleLiquidacionImpor,this.jPanelPaginacionDetalleLiquidacionImpor, this.jScrollPanelDatosEdicionDetalleLiquidacionImpor, this.jPanelAccionesDetalleLiquidacionImpor,this.jPanelAccionesFormularioDetalleLiquidacionImpor,this.jmenuBarDetalleLiquidacionImpor,this.jmenuBarDetalleDetalleLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleDetalleLiquidacionImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleLiquidacionImpor=this.jTabbedPaneBusquedasDetalleLiquidacionImpor; 
		
		final JPanel jPanelParametrosReportesDetalleLiquidacionImpor=this.jPanelParametrosReportesDetalleLiquidacionImpor;
		//final JScrollPane jScrollPanelDatosDetalleLiquidacionImpor=this.jScrollPanelDatosDetalleLiquidacionImpor;
		final JTable jTableDatosDetalleLiquidacionImpor=this.jTableDatosDetalleLiquidacionImpor;		
		final JPanel jPanelPaginacionDetalleLiquidacionImpor=this.jPanelPaginacionDetalleLiquidacionImpor;
		//final JScrollPane jScrollPanelDatosEdicionDetalleLiquidacionImpor=this.jScrollPanelDatosEdicionDetalleLiquidacionImpor;
		final JPanel jPanelAccionesDetalleLiquidacionImpor=this.jPanelAccionesDetalleLiquidacionImpor;
		
		JPanel jPanelCamposAuxiliarDetalleLiquidacionImpor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpor=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			jPanelCamposAuxiliarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelCamposDetalleLiquidacionImpor;
			jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelAccionesFormularioDetalleLiquidacionImpor;
		}
		
		final JPanel jPanelCamposDetalleLiquidacionImpor=jPanelCamposAuxiliarDetalleLiquidacionImpor;
		final JPanel jPanelAccionesFormularioDetalleLiquidacionImpor=jPanelAccionesFormularioAuxiliarDetalleLiquidacionImpor;
		
		
		final JMenuBar jmenuBarDetalleLiquidacionImpor=this.jmenuBarDetalleLiquidacionImpor;		
		final JToolBar jTtoolBarDetalleLiquidacionImpor=this.jTtoolBarDetalleLiquidacionImpor;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleLiquidacionImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleLiquidacionImpor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			jmenuBarDetalleAuxiliarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jmenuBarDetalleDetalleLiquidacionImpor;
			jTtoolBarDetalleAuxiliarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTtoolBarDetalleDetalleLiquidacionImpor;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleLiquidacionImpor=jmenuBarDetalleAuxiliarDetalleLiquidacionImpor;
		final JToolBar jTtoolBarDetalleDetalleLiquidacionImpor=jTtoolBarDetalleAuxiliarDetalleLiquidacionImpor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleLiquidacionImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleLiquidacionImpor;
			processRunnable.jTableDatos=jTableDatosDetalleLiquidacionImpor;
			processRunnable.jPanelCampos=jPanelCamposDetalleLiquidacionImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleLiquidacionImpor;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleLiquidacionImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleLiquidacionImpor;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleLiquidacionImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleLiquidacionImpor;
			processRunnable.jTtoolBar=jTtoolBarDetalleLiquidacionImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleLiquidacionImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleLiquidacionImpor ,jPanelParametrosReportesDetalleLiquidacionImpor, jTableDatosDetalleLiquidacionImpor,/*jScrollPanelDatosDetalleLiquidacionImpor,*/jPanelCamposDetalleLiquidacionImpor,jPanelPaginacionDetalleLiquidacionImpor, /*jScrollPanelDatosEdicionDetalleLiquidacionImpor,*/ jPanelAccionesDetalleLiquidacionImpor,jPanelAccionesFormularioDetalleLiquidacionImpor,jmenuBarDetalleLiquidacionImpor,jmenuBarDetalleDetalleLiquidacionImpor,jTtoolBarDetalleLiquidacionImpor,jTtoolBarDetalleDetalleLiquidacionImpor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleLiquidacionImpor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleLiquidacionImpor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleLiquidacionImpor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleLiquidacionImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleLiquidacionImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleLiquidacionImpor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleLiquidacionImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleLiquidacionImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleLiquidacionImpor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalleliquidacionimporConstantesFunciones.getsFinalQueryDetalleLiquidacionImpor();
		String  finalQueryPaginacionTodos=this.detalleliquidacionimporConstantesFunciones.getsFinalQueryDetalleLiquidacionImpor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleLiquidacionImporConstantesFunciones.getArrayColumnasGlobalesNoDetalleLiquidacionImpor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleLiquidacionImporConstantesFunciones.getArrayColumnasGlobalesDetalleLiquidacionImpor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleLiquidacionImporConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalleliquidacionimporsEliminados= new ArrayList<DetalleLiquidacionImpor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleLiquidacionImpor();
		
				///*DetalleLiquidacionImporSessionBean*/this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
			
			if(this.detalleliquidacionimporSessionBean==null) {
				this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
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
					this.iNumeroPaginacion=DetalleLiquidacionImporConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleLiquidacionImporConstantesFunciones.getClassesForeignKeysOfDetalleLiquidacionImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalleliquidacionimpor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalleliquidacionimporsAux= new ArrayList<DetalleLiquidacionImpor>();
			
				
			detalleliquidacionimporLogic.setDatosCliente(this.datosCliente);
			detalleliquidacionimporLogic.setDatosDeep(this.datosDeep);
			detalleliquidacionimporLogic.setIsConDeep(true);
			
			
			detalleliquidacionimporLogic.getDetalleLiquidacionImporDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalleliquidacionimporLogic.getTodosDetalleLiquidacionImpors(finalQueryGlobal,pagination);
					
					//detalleliquidacionimporLogic.getTodosDetalleLiquidacionImporsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalleliquidacionimporLogic.getDetalleLiquidacionImpors()==null|| detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleliquidacionimporsAux= new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimporsAux.addAll(detalleliquidacionimporLogic.getDetalleLiquidacionImpors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimporsAux= new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimporsAux.addAll(detalleliquidacionimpors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleliquidacionimporLogic.getTodosDetalleLiquidacionImpors(finalQueryGlobal+"",this.pagination);												
							
							//detalleliquidacionimporLogic.getTodosDetalleLiquidacionImporsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleLiquidacionImpors("Todos",detalleliquidacionimporLogic.getDetalleLiquidacionImpors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());					
							detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(detalleliquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpors=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimpors.addAll(detalleliquidacionimporsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleLiquidacionImpor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleLiquidacionImpor=this.idActual;
				
				} else if(this.idDetalleLiquidacionImporActual!=null && this.idDetalleLiquidacionImporActual!=0L) {
					idDetalleLiquidacionImpor=idDetalleLiquidacionImporActual;
				}
				
					
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndicePorId(idDetalleLiquidacionImpor);
				
				this.detalleliquidacionimpors=new ArrayList<DetalleLiquidacionImpor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalleliquidacionimporLogic.getEntity(idDetalleLiquidacionImpor);
					
					//detalleliquidacionimporLogic.getEntityWithConnection(idDetalleLiquidacionImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
					detalleliquidacionimporLogic.getDetalleLiquidacionImpors().add(detalleliquidacionimporLogic.getDetalleLiquidacionImpor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpors=new ArrayList<DetalleLiquidacionImpor>();
					this.detalleliquidacionimpors.add(detalleliquidacionimpor);
				}
				
				if(detalleliquidacionimporLogic.getDetalleLiquidacionImpor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCentroCosto")) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleliquidacionimporLogic.getDetalleLiquidacionImpors()==null||detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleliquidacionimpors==null|| detalleliquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
						detalleliquidacionimporsAux.addAll(detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimporsAux.addAll(detalleliquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleLiquidacionImpors("FK_IdCentroCosto",detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleLiquidacionImpors("FK_IdCentroCosto",detalleliquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
						detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(detalleliquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpors=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimpors.addAll(detalleliquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCostoGastoImpor")) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCostoGastoImpor(id_costo_gasto_imporFK_IdCostoGastoImpor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdCostoGastoImpor(finalQueryGlobal,pagination,id_costo_gasto_imporFK_IdCostoGastoImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCostoGastoImpor(id_costo_gasto_imporFK_IdCostoGastoImpor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCostoGastoImpor(id_costo_gasto_imporFK_IdCostoGastoImpor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleliquidacionimporLogic.getDetalleLiquidacionImpors()==null||detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleliquidacionimpors==null|| detalleliquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
						detalleliquidacionimporsAux.addAll(detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimporsAux.addAll(detalleliquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdCostoGastoImpor(finalQueryGlobal,pagination,id_costo_gasto_imporFK_IdCostoGastoImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCostoGastoImpor(id_costo_gasto_imporFK_IdCostoGastoImpor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdCostoGastoImpor(id_costo_gasto_imporFK_IdCostoGastoImpor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleLiquidacionImpors("FK_IdCostoGastoImpor",detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleLiquidacionImpors("FK_IdCostoGastoImpor",detalleliquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
						detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(detalleliquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpors=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimpors.addAll(detalleliquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleliquidacionimporLogic.getDetalleLiquidacionImpors()==null||detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleliquidacionimpors==null|| detalleliquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
						detalleliquidacionimporsAux.addAll(detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimporsAux.addAll(detalleliquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleLiquidacionImpors("FK_IdEmpresa",detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleLiquidacionImpors("FK_IdEmpresa",detalleliquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
						detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(detalleliquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpors=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimpors.addAll(detalleliquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLiquidacionImpor")) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdLiquidacionImpor(id_liquidacion_imporFK_IdLiquidacionImpor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdLiquidacionImpor(finalQueryGlobal,pagination,id_liquidacion_imporFK_IdLiquidacionImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdLiquidacionImpor(id_liquidacion_imporFK_IdLiquidacionImpor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdLiquidacionImpor(id_liquidacion_imporFK_IdLiquidacionImpor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleliquidacionimporLogic.getDetalleLiquidacionImpors()==null||detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleliquidacionimpors==null|| detalleliquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
						detalleliquidacionimporsAux.addAll(detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimporsAux.addAll(detalleliquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdLiquidacionImpor(finalQueryGlobal,pagination,id_liquidacion_imporFK_IdLiquidacionImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdLiquidacionImpor(id_liquidacion_imporFK_IdLiquidacionImpor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdLiquidacionImpor(id_liquidacion_imporFK_IdLiquidacionImpor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleLiquidacionImpors("FK_IdLiquidacionImpor",detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleLiquidacionImpors("FK_IdLiquidacionImpor",detalleliquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
						detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(detalleliquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpors=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimpors.addAll(detalleliquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleliquidacionimporLogic.getDetalleLiquidacionImpors()==null||detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleliquidacionimpors==null|| detalleliquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
						detalleliquidacionimporsAux.addAll(detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimporsAux.addAll(detalleliquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleLiquidacionImpors("FK_IdSucursal",detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleLiquidacionImpors("FK_IdSucursal",detalleliquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
						detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(detalleliquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpors=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimpors.addAll(detalleliquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUsuario")) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleliquidacionimporLogic.getDetalleLiquidacionImpors()==null||detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleliquidacionimpors==null|| detalleliquidacionimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
						detalleliquidacionimporsAux.addAll(detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimporsAux=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimporsAux.addAll(detalleliquidacionimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdUsuario(finalQueryGlobal,pagination,id_usuarioFK_IdUsuario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleLiquidacionImporConstantesFunciones.getDetalleIndiceFK_IdUsuario(id_usuarioFK_IdUsuario);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleLiquidacionImpors("FK_IdUsuario",detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleLiquidacionImpors("FK_IdUsuario",detalleliquidacionimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporLogic.setDetalleLiquidacionImpors(new ArrayList<DetalleLiquidacionImpor>());
						detalleliquidacionimporLogic.getDetalleLiquidacionImpors().addAll(detalleliquidacionimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimpors=new ArrayList<DetalleLiquidacionImpor>();
							detalleliquidacionimpors.addAll(detalleliquidacionimporsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleLiquidacionImpor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleLiquidacionImpor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleliquidacionimpors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleliquidacionimpors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleLiquidacionImpor detalleliquidacionimpor) {
		Boolean permite=true;
		
		if(this.detalleliquidacionimpor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleLiquidacionImporConstantesFunciones.getOrderByListaDetalleLiquidacionImpor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleLiquidacionImporConstantesFunciones.getOrderByListaDetalleLiquidacionImpor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
				if(detalleliquidacionimpor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleliquidacionimporTotales=detalleliquidacionimpor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleLiquidacionImpor detalleliquidacionimpor:this.detalleliquidacionimpors) {
				if(detalleliquidacionimpor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleliquidacionimporTotales=detalleliquidacionimpor;
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
			this.detalleliquidacionimporAux=new DetalleLiquidacionImpor();
			this.detalleliquidacionimporAux.setsType(Constantes2.S_TOTALES);
			this.detalleliquidacionimporAux.setIsNew(false);
			this.detalleliquidacionimporAux.setIsChanged(false);
			this.detalleliquidacionimporAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleLiquidacionImporConstantesFunciones.TotalizarValoresFilaDetalleLiquidacionImpor(this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors(),this.detalleliquidacionimporAux);
				
				this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().add(this.detalleliquidacionimporAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleLiquidacionImporConstantesFunciones.TotalizarValoresFilaDetalleLiquidacionImpor(this.detalleliquidacionimpors,this.detalleliquidacionimporAux);
				
				this.detalleliquidacionimpors.add(this.detalleliquidacionimporAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalleliquidacionimporTotales=new DetalleLiquidacionImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().remove(detalleliquidacionimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleliquidacionimpors.remove(detalleliquidacionimporTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalleliquidacionimporTotales=new DetalleLiquidacionImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
				if(detalleliquidacionimpor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleliquidacionimporTotales=detalleliquidacionimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleLiquidacionImporConstantesFunciones.TotalizarValoresFilaDetalleLiquidacionImpor(this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors(),detalleliquidacionimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleLiquidacionImpor detalleliquidacionimpor:this.detalleliquidacionimpors) {
				if(detalleliquidacionimpor.getsType().equals(Constantes2.S_TOTALES)) {
					detalleliquidacionimporTotales=detalleliquidacionimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleLiquidacionImporConstantesFunciones.TotalizarValoresFilaDetalleLiquidacionImpor(this.detalleliquidacionimpors,detalleliquidacionimporTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleLiquidacionImporsFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleLiquidacionImporsFK_IdCostoGastoImpor()throws Exception {
		try {
			sAccionBusqueda="FK_IdCostoGastoImpor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleLiquidacionImporsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleLiquidacionImporsFK_IdLiquidacionImpor()throws Exception {
		try {
			sAccionBusqueda="FK_IdLiquidacionImpor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleLiquidacionImporsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleLiquidacionImporsFK_IdUsuario()throws Exception {
		try {
			sAccionBusqueda="FK_IdUsuario";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleLiquidacionImporsFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleLiquidacionImporsFK_IdCostoGastoImpor(String sFinalQuery,Long id_costo_gasto_impor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdCostoGastoImpor(sFinalQuery,this.pagination,id_costo_gasto_impor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleLiquidacionImporsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleLiquidacionImporsFK_IdLiquidacionImpor(String sFinalQuery,Long id_liquidacion_impor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdLiquidacionImpor(sFinalQuery,this.pagination,id_liquidacion_impor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleLiquidacionImporsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleLiquidacionImporsFK_IdUsuario(String sFinalQuery,Long id_usuario)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimporLogic.getDetalleLiquidacionImporsFK_IdUsuario(sFinalQuery,this.pagination,id_usuario);
				
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
	
	public void inicializarPermisosDetalleLiquidacionImpor() {
		this.isPermisoTodoDetalleLiquidacionImpor=false;
		this.isPermisoNuevoDetalleLiquidacionImpor=false;
		this.isPermisoActualizarDetalleLiquidacionImpor=false;
		this.isPermisoActualizarOriginalDetalleLiquidacionImpor=false;
		this.isPermisoEliminarDetalleLiquidacionImpor=false;
		this.isPermisoGuardarCambiosDetalleLiquidacionImpor=false;
		this.isPermisoConsultaDetalleLiquidacionImpor=false;
		this.isPermisoBusquedaDetalleLiquidacionImpor=false;
		this.isPermisoReporteDetalleLiquidacionImpor=false;		
		this.isPermisoOrdenDetalleLiquidacionImpor=false;		
		this.isPermisoPaginacionMedioDetalleLiquidacionImpor=false;		
		this.isPermisoPaginacionAltoDetalleLiquidacionImpor=false;
		this.isPermisoPaginacionTodoDetalleLiquidacionImpor=false;
		this.isPermisoCopiarDetalleLiquidacionImpor=false;		
		this.isPermisoVerFormDetalleLiquidacionImpor=false;		
		this.isPermisoDuplicarDetalleLiquidacionImpor=false;		
		this.isPermisoOrdenDetalleLiquidacionImpor=false;		
	}
	
	public void setPermisosUsuarioDetalleLiquidacionImpor(Boolean isPermiso) {
		this.isPermisoTodoDetalleLiquidacionImpor=isPermiso;
		this.isPermisoNuevoDetalleLiquidacionImpor=isPermiso;
		this.isPermisoActualizarDetalleLiquidacionImpor=isPermiso;
		this.isPermisoActualizarOriginalDetalleLiquidacionImpor=isPermiso;
		this.isPermisoEliminarDetalleLiquidacionImpor=isPermiso;
		this.isPermisoGuardarCambiosDetalleLiquidacionImpor=isPermiso;
		this.isPermisoConsultaDetalleLiquidacionImpor=isPermiso;
		this.isPermisoBusquedaDetalleLiquidacionImpor=isPermiso;
		this.isPermisoReporteDetalleLiquidacionImpor=isPermiso;
		this.isPermisoOrdenDetalleLiquidacionImpor=isPermiso;		
		this.isPermisoPaginacionMedioDetalleLiquidacionImpor=isPermiso;		
		this.isPermisoPaginacionAltoDetalleLiquidacionImpor=isPermiso;		
		this.isPermisoPaginacionTodoDetalleLiquidacionImpor=isPermiso;		
		this.isPermisoCopiarDetalleLiquidacionImpor=isPermiso;		
		this.isPermisoVerFormDetalleLiquidacionImpor=isPermiso;		
		this.isPermisoDuplicarDetalleLiquidacionImpor=isPermiso;
		this.isPermisoOrdenDetalleLiquidacionImpor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleLiquidacionImpor(Boolean isPermiso) {
		//this.isPermisoTodoDetalleLiquidacionImpor=isPermiso;
		this.isPermisoNuevoDetalleLiquidacionImpor=isPermiso;
		this.isPermisoActualizarDetalleLiquidacionImpor=isPermiso;
		this.isPermisoActualizarOriginalDetalleLiquidacionImpor=isPermiso;
		this.isPermisoEliminarDetalleLiquidacionImpor=isPermiso;
		this.isPermisoGuardarCambiosDetalleLiquidacionImpor=isPermiso;
		//this.isPermisoConsultaDetalleLiquidacionImpor=isPermiso;
		//this.isPermisoBusquedaDetalleLiquidacionImpor=isPermiso;
		//this.isPermisoReporteDetalleLiquidacionImpor=isPermiso;
		//this.isPermisoOrdenDetalleLiquidacionImpor=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleLiquidacionImpor=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleLiquidacionImpor=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleLiquidacionImpor=isPermiso;		
		//this.isPermisoCopiarDetalleLiquidacionImpor=isPermiso;		
		//this.isPermisoDuplicarDetalleLiquidacionImpor=isPermiso;
		//this.isPermisoOrdenDetalleLiquidacionImpor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleLiquidacionImporClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleLiquidacionImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleLiquidacionImpor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleLiquidacionImporClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleLiquidacionImporClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleLiquidacionImporClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleLiquidacionImporClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleLiquidacionImpor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleLiquidacionImporJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleLiquidacionImporConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleLiquidacionImpor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleLiquidacionImpor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleLiquidacionImpor=this.isPermisoActualizarDetalleLiquidacionImpor;
			this.isPermisoEliminarDetalleLiquidacionImpor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleLiquidacionImpor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleLiquidacionImpor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleLiquidacionImpor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleLiquidacionImpor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleLiquidacionImpor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleLiquidacionImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleLiquidacionImpor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleLiquidacionImpor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleLiquidacionImpor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleLiquidacionImpor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleLiquidacionImpor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleLiquidacionImpor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleLiquidacionImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleLiquidacionImpor.setToolTipText(this.jTableDatosDetalleLiquidacionImpor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleLiquidacionImpor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleLiquidacionImpor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleLiquidacionImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleLiquidacionImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleLiquidacionImpor() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleLiquidacionImporListas()throws Exception {
		try	{						
			
				this.liquidacionimporsForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.usuariosForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
				this.costogastoimporsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleLiquidacionImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleLiquidacionImporJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleLiquidacionImporListas(false);
			} else {
			
				this.cargarCombosForeignKeyLiquidacionImporListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUsuarioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCostoGastoImporListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyLiquidacionImporListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.liquidacionimporsForeignKey==null||this.liquidacionimporsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LiquidacionImporConstantesFunciones.getArrayColumnasGlobalesLiquidacionImpor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LiquidacionImporConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LiquidacionImporConstantesFunciones.SFINALQUERY;

				this.cargarCombosLiquidacionImporsForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyCentroCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CentroCostoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCostoGastoImporListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.costogastoimporsForeignKey==null||this.costogastoimporsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CostoGastoImporConstantesFunciones.getArrayColumnasGlobalesCostoGastoImpor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CostoGastoImporConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CostoGastoImporConstantesFunciones.SFINALQUERY;

				this.cargarCombosCostoGastoImporsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleLiquidacionImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleLiquidacionImporParameterReturnGeneral detalleliquidacionimporReturnGeneral=new DetalleLiquidacionImporParameterReturnGeneral();
						
			


				String finalQueryGlobalLiquidacionImpor="";

				if(((this.liquidacionimporsForeignKey==null||this.liquidacionimporsForeignKey.size()<=0) && this.detalleliquidacionimporConstantesFunciones.cargarid_liquidacion_imporDetalleLiquidacionImpor)
					 || (this.esRecargarFks && this.detalleliquidacionimporConstantesFunciones.cargarid_liquidacion_imporDetalleLiquidacionImpor)) {

					if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionLiquidacionImpor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LiquidacionImporConstantesFunciones.getArrayColumnasGlobalesLiquidacionImpor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLiquidacionImpor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LiquidacionImporConstantesFunciones.TABLENAME);

						finalQueryGlobalLiquidacionImpor=Funciones.GetFinalQueryAppend(finalQueryGlobalLiquidacionImpor, "");
						finalQueryGlobalLiquidacionImpor+=LiquidacionImporConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLiquidacionImporsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLiquidacionImpor=" WHERE " + ConstantesSql.ID + "="+detalleliquidacionimporSessionBean.getlidLiquidacionImporActual();
					}
				} else {
					finalQueryGlobalLiquidacionImpor="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalleliquidacionimporConstantesFunciones.cargarid_empresaDetalleLiquidacionImpor)
					 || (this.esRecargarFks && this.detalleliquidacionimporConstantesFunciones.cargarid_empresaDetalleLiquidacionImpor)) {

					if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalleliquidacionimporSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detalleliquidacionimporConstantesFunciones.cargarid_sucursalDetalleLiquidacionImpor)
					 || (this.esRecargarFks && this.detalleliquidacionimporConstantesFunciones.cargarid_sucursalDetalleLiquidacionImpor)) {

					if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detalleliquidacionimporSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalUsuario="";

				if(((this.usuariosForeignKey==null||this.usuariosForeignKey.size()<=0) && this.detalleliquidacionimporConstantesFunciones.cargarid_usuarioDetalleLiquidacionImpor)
					 || (this.esRecargarFks && this.detalleliquidacionimporConstantesFunciones.cargarid_usuarioDetalleLiquidacionImpor)) {

					if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UsuarioConstantesFunciones.getArrayColumnasGlobalesUsuario(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUsuario=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UsuarioConstantesFunciones.TABLENAME);

						finalQueryGlobalUsuario=Funciones.GetFinalQueryAppend(finalQueryGlobalUsuario, "");
						finalQueryGlobalUsuario+=UsuarioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUsuariosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUsuario=" WHERE " + ConstantesSql.ID + "="+detalleliquidacionimporSessionBean.getlidUsuarioActual();
					}
				} else {
					finalQueryGlobalUsuario="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.detalleliquidacionimporConstantesFunciones.cargarid_centro_costoDetalleLiquidacionImpor)
					 || (this.esRecargarFks && this.detalleliquidacionimporConstantesFunciones.cargarid_centro_costoDetalleLiquidacionImpor)) {

					if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+detalleliquidacionimporSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}


				String finalQueryGlobalCostoGastoImpor="";

				if(((this.costogastoimporsForeignKey==null||this.costogastoimporsForeignKey.size()<=0) && this.detalleliquidacionimporConstantesFunciones.cargarid_costo_gasto_imporDetalleLiquidacionImpor)
					 || (this.esRecargarFks && this.detalleliquidacionimporConstantesFunciones.cargarid_costo_gasto_imporDetalleLiquidacionImpor)) {

					if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCostoGastoImpor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CostoGastoImporConstantesFunciones.getArrayColumnasGlobalesCostoGastoImpor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCostoGastoImpor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CostoGastoImporConstantesFunciones.TABLENAME);

						finalQueryGlobalCostoGastoImpor=Funciones.GetFinalQueryAppend(finalQueryGlobalCostoGastoImpor, "");
						finalQueryGlobalCostoGastoImpor+=CostoGastoImporConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCostoGastoImporsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCostoGastoImpor=" WHERE " + ConstantesSql.ID + "="+detalleliquidacionimporSessionBean.getlidCostoGastoImporActual();
					}
				} else {
					finalQueryGlobalCostoGastoImpor="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalleliquidacionimporReturnGeneral=detalleliquidacionimporLogic.cargarCombosLoteForeignKeyDetalleLiquidacionImpor(finalQueryGlobalLiquidacionImpor,finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalUsuario,finalQueryGlobalCentroCosto,finalQueryGlobalCostoGastoImpor);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalLiquidacionImpor.equals("NONE")) {
				this.liquidacionimporsForeignKey=detalleliquidacionimporReturnGeneral.getliquidacionimporsForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalleliquidacionimporReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detalleliquidacionimporReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalUsuario.equals("NONE")) {
				this.usuariosForeignKey=detalleliquidacionimporReturnGeneral.getusuariosForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=detalleliquidacionimporReturnGeneral.getcentrocostosForeignKey();
			}

			if(!finalQueryGlobalCostoGastoImpor.equals("NONE")) {
				this.costogastoimporsForeignKey=detalleliquidacionimporReturnGeneral.getcostogastoimporsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleLiquidacionImpor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyLiquidacionImpor();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyUsuario();
			this.addItemDefectoCombosForeignKeyCentroCosto();
			this.addItemDefectoCombosForeignKeyCostoGastoImpor();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyLiquidacionImpor()throws Exception {
		try {
			if(this.detalleliquidacionimporSessionBean==null) {
				this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
			}

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionLiquidacionImpor()) {
				LiquidacionImpor liquidacionimpor=new LiquidacionImpor();
				LiquidacionImporConstantesFunciones.setLiquidacionImporDescripcion(liquidacionimpor,Constantes.SMENSAJE_ESCOJA_OPCION);
				liquidacionimpor.setId(null);

				if(!LiquidacionImporConstantesFunciones.ExisteEnLista(this.liquidacionimporsForeignKey,liquidacionimpor,true)) {

					this.liquidacionimporsForeignKey.add(0,liquidacionimpor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionUsuario()) {
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

	public void addItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				CentroCosto centrocosto=new CentroCosto();
				CentroCostoConstantesFunciones.setCentroCostoDescripcion(centrocosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				centrocosto.setId(null);

				if(!CentroCostoConstantesFunciones.ExisteEnLista(this.centrocostosForeignKey,centrocosto,true)) {

					this.centrocostosForeignKey.add(0,centrocosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCostoGastoImpor()throws Exception {
		try {

			if(!this.detalleliquidacionimporSessionBean.getisBusquedaDesdeForeignKeySesionCostoGastoImpor()) {
				CostoGastoImpor costogastoimpor=new CostoGastoImpor();
				CostoGastoImporConstantesFunciones.setCostoGastoImporDescripcion(costogastoimpor,Constantes.SMENSAJE_ESCOJA_OPCION);
				costogastoimpor.setId(null);

				if(!CostoGastoImporConstantesFunciones.ExisteEnLista(this.costogastoimporsForeignKey,costogastoimpor,true)) {

					this.costogastoimporsForeignKey.add(0,costogastoimpor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleLiquidacionImpor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleLiquidacionImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleLiquidacionImpor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualUsuarioForeignKey(this.parametroGeneralUsuario.getid_usuario(),false,"Formulario");
			
			
				this.detalleliquidacionimpor.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleLiquidacionImpor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor)throws Exception {	
		try {
			
			this.setActualLiquidacionImporForeignKey(detalleliquidacionimpor.getid_liquidacion_impor(),false,"Formulario");
			this.setActualCentroCostoForeignKey(detalleliquidacionimpor.getid_centro_costo(),false,"Formulario");
			this.setActualCostoGastoImporForeignKey(detalleliquidacionimpor.getid_costo_gasto_impor(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleLiquidacionImpor()throws Exception {	
		try {
			
			this.setActualLiquidacionImporForeignKey(this.detalleliquidacionimporConstantesFunciones.getid_liquidacion_impor(),false,"Formulario");
			this.setActualCentroCostoForeignKey(this.detalleliquidacionimporConstantesFunciones.getid_centro_costo(),false,"Formulario");
			this.setActualCostoGastoImporForeignKey(this.detalleliquidacionimporConstantesFunciones.getid_costo_gasto_impor(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleLiquidacionImpor()throws Exception {	
		try {
			

				this.setActualUsuarioForeignKey(this.usuarioActual.getId(),false,"Formulario");
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleLiquidacionImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleLiquidacionImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleLiquidacionImpor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleLiquidacionImpor()throws Exception {
		try {
			

			this.cargarCombosFrameLiquidacionImporsForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameUsuariosForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");
			this.cargarCombosFrameCostoGastoImporsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleLiquidacionImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameLiquidacionImporsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUsuariosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCostoGastoImporsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleLiquidacionImpor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public DetalleLiquidacionImporBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleLiquidacionImporBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleLiquidacionImporBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean(); 
		this.detalleliquidacionimporConstantesFunciones=new DetalleLiquidacionImporConstantesFunciones(); 
		this.detalleliquidacionimporBean=new DetalleLiquidacionImpor();//(this.detalleliquidacionimporConstantesFunciones); 		
		this.detalleliquidacionimporReturnGeneral=new DetalleLiquidacionImporParameterReturnGeneral(); 
		
		this.detalleliquidacionimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleLiquidacionImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleLiquidacionImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleLiquidacionImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleLiquidacionImpor(true);
			
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
			
			this.detalleliquidacionimporConstantesFunciones=new DetalleLiquidacionImporConstantesFunciones(); 
			this.detalleliquidacionimporBean=new DetalleLiquidacionImpor();//this.detalleliquidacionimporConstantesFunciones); 			
			this.detalleliquidacionimporReturnGeneral=new DetalleLiquidacionImporParameterReturnGeneral(); 
		
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Liquidacion Impor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detalleliquidacionimpor=new DetalleLiquidacionImpor();
			this.detalleliquidacionimpors = new ArrayList<DetalleLiquidacionImpor>();
			this.detalleliquidacionimporsAux = new ArrayList<DetalleLiquidacionImpor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic=new DetalleLiquidacionImporLogic();
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			//this.detalleliquidacionimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleLiquidacionImpor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor);	
					}
					
					if(this.jInternalFrameImportacionDetalleLiquidacionImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleLiquidacionImpor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleLiquidacionImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleLiquidacionImpor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleLiquidacionImpor);
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setVisible(false);
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor);
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleLiquidacionImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleLiquidacionImpor);
					this.jInternalFrameImportacionDetalleLiquidacionImpor.setVisible(false);
					this.jInternalFrameImportacionDetalleLiquidacionImpor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleLiquidacionImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleLiquidacionImpor);
					this.jInternalFrameOrderByDetalleLiquidacionImpor.setVisible(false);
					this.jInternalFrameOrderByDetalleLiquidacionImpor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleLiquidacionImporActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleLiquidacionImporConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalleliquidacionimporReturnGeneral=new DetalleLiquidacionImporParameterReturnGeneral();
			
			this.detalleliquidacionimporParameterGeneral=new DetalleLiquidacionImporParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalleliquidacionimporLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleLiquidacionImporJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleLiquidacionImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado(),this.detalleliquidacionimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleLiquidacionImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado(),this.detalleliquidacionimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaCopiarDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaVerFormDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaOrdenDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=false;
			
			
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdCostoGastoImpor=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLiquidacionImpor=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUsuario=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleLiquidacionImpor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleLiquidacionImpor(false);
			
			this.setPermisosUsuarioDetalleLiquidacionImpor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() 
				|| (this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() && this.detalleliquidacionimporSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleLiquidacionImporClasesRelacionadas();
			}
			
			if(this.detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleLiquidacionImporClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleLiquidacionImpor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleLiquidacionImpor();
			}
			
			if(!this.isPermisoBusquedaDetalleLiquidacionImpor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleLiquidacionImpor,this.isPermisoPaginacionMedioDetalleLiquidacionImpor,this.isPermisoPaginacionTodoDetalleLiquidacionImpor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleLiquidacionImporConstantesFunciones.getTiposSeleccionarDetalleLiquidacionImpor());
				
				this.tiposColumnasSelect=DetalleLiquidacionImporConstantesFunciones.getTiposSeleccionarDetalleLiquidacionImpor(true);
				
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
			//if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleLiquidacionImpor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleLiquidacionImpor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleLiquidacionImpor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleLiquidacionImpor() ;
			
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
			
			this.liquidacionimporLogic=new LiquidacionImporLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.usuarioLogic=new UsuarioLogic();
			this.centrocostoLogic=new CentroCostoLogic();
			this.costogastoimporLogic=new CostoGastoImporLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalleliquidacionimporImplementable= (DetalleLiquidacionImporImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleLiquidacionImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalleliquidacionimporImplementableHome= (DetalleLiquidacionImporImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleLiquidacionImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalleliquidacionimpors= new ArrayList<DetalleLiquidacionImpor>();
			this.detalleliquidacionimporsEliminados= new ArrayList<DetalleLiquidacionImpor>();
						
			this.isEsNuevoDetalleLiquidacionImpor=false;
			this.esParaAccionDesdeFormularioDetalleLiquidacionImpor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.liquidacionimporsForeignKey=new ArrayList<LiquidacionImpor>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.usuariosForeignKey=new ArrayList<Usuario>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			this.costogastoimporsForeignKey=new ArrayList<CostoGastoImpor>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleLiquidacionImpor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleLiquidacionImpor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleLiquidacionImporConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleLiquidacionImpor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleLiquidacionImpor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleLiquidacionImpor();
			}
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleLiquidacionImpor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleLiquidacionImpor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleLiquidacionImpor() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleLiquidacionImpor")) {
				iIndex=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTabbedPaneRelacionesDetalleLiquidacionImpor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTabbedPaneRelacionesDetalleLiquidacionImpor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleLiquidacionImpor();	
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
	
	public void cargarCombosForeignKeyDetalleLiquidacionImpor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleLiquidacionImpor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleLiquidacionImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleLiquidacionImporListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleLiquidacionImpor();
		
		this.cargarCombosFrameForeignKeyDetalleLiquidacionImpor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleLiquidacionImpor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleLiquidacionImpor();
		}
	}
	
	

	public void cargarCombosForeignKeyLiquidacionImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLiquidacionImporListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLiquidacionImpor();
				this.cargarCombosFrameLiquidacionImporsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLiquidacionImpor(this.liquidacionimporsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCostoGastoImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCostoGastoImporListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCostoGastoImpor();
				this.cargarCombosFrameCostoGastoImporsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCostoGastoImpor(this.costogastoimporsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleLiquidacionImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
			
			if(jTableDatosDetalleLiquidacionImpor.getRowCount()>=1) {
				jTableDatosDetalleLiquidacionImpor.removeRowSelectionInterval(0, jTableDatosDetalleLiquidacionImpor.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleLiquidacionImpor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleLiquidacionImpor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleLiquidacionImpor(true);			
			//this.detalleliquidacionimpor=new DetalleLiquidacionImpor();
			//this.detalleliquidacionimpor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleLiquidacionImpor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpor() ;
			
			if(DetalleLiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleLiquidacionImpor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalleliquidacionimpor);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);				
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
			if(this.detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleLiquidacionImpor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleLiquidacionImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleLiquidacionImpor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleLiquidacionImpor.getSelectedRows().length;			
			}
			
			detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleLiquidacionImpor--;			
				//DetalleLiquidacionImpor detalleliquidacionimporAux= new DetalleLiquidacionImpor();			
				//detalleliquidacionimporAux.setId(this.iIdNuevoDetalleLiquidacionImpor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleLiquidacionImpor detalleliquidacionimporOrigen=new DetalleLiquidacionImpor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleLiquidacionImpor detalleliquidacionimporOrigen : detalleliquidacionimporsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalleliquidacionimporOrigen =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleliquidacionimporOrigen =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleLiquidacionImpor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalleliquidacionimpor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleLiquidacionImpor(detalleliquidacionimporOrigen,this.detalleliquidacionimpor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().add(this.detalleliquidacionimporAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpors.add(this.detalleliquidacionimporAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
				
				this.jTableDatosDetalleLiquidacionImpor.setRowSelectionInterval(this.getIndiceNuevoDetalleLiquidacionImpor(), this.getIndiceNuevoDetalleLiquidacionImpor());
				
				int iLastRow =  this.jTableDatosDetalleLiquidacionImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleLiquidacionImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleLiquidacionImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();									
		
			DetalleLiquidacionImpor detalleliquidacionimporOrigen=new DetalleLiquidacionImpor();
			DetalleLiquidacionImpor detalleliquidacionimporDestino=new DetalleLiquidacionImpor();
				
			detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleLiquidacionImpor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalleliquidacionimporsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleLiquidacionImpor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporOrigen =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleliquidacionimporOrigen =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleliquidacionimporDestino =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleliquidacionimporDestino =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalleliquidacionimporOrigen =detalleliquidacionimporsSeleccionados.get(0);
				detalleliquidacionimporDestino =detalleliquidacionimporsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleLiquidacionImpor(detalleliquidacionimporOrigen,detalleliquidacionimporDestino,true,false);
				
				detalleliquidacionimporDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleliquidacionimporDestino,detalleliquidacionimporLogic.getDetalleLiquidacionImpors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleliquidacionimporDestino,detalleliquidacionimpors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
				
				//this.jTableDatosDetalleLiquidacionImpor.setRowSelectionInterval(this.getIndiceNuevoDetalleLiquidacionImpor(), this.getIndiceNuevoDetalleLiquidacionImpor());
				
				int iLastRow =  this.jTableDatosDetalleLiquidacionImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleLiquidacionImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleLiquidacionImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleLiquidacionImpor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleLiquidacionImpor.setVisible(!isVisible);
			this.jPanelPaginacionDetalleLiquidacionImpor.setVisible(!isVisible);
			this.jPanelAccionesDetalleLiquidacionImpor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleLiquidacionImpor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleLiquidacionImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleLiquidacionImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleLiquidacionImpor();
			
			this.abrirFrameOrderByDetalleLiquidacionImpor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleLiquidacionImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleLiquidacionImpor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleLiquidacionImpor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setSize(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.iWidthFormulario,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleLiquidacionImpor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleLiquidacionImpor.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jContentPaneDetalleDetalleLiquidacionImpor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTabbedPaneRelacionesDetalleLiquidacionImpor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jContentPaneDetalleDetalleLiquidacionImpor.getWidth(),DetalleLiquidacionImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTabbedPaneRelacionesDetalleLiquidacionImpor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jContentPaneDetalleDetalleLiquidacionImpor.getWidth(),DetalleLiquidacionImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTabbedPaneRelacionesDetalleLiquidacionImpor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jContentPaneDetalleDetalleLiquidacionImpor.getWidth(),DetalleLiquidacionImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleLiquidacionImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleLiquidacionImpor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleLiquidacionImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleLiquidacionImpor,false,this);
				} else {
					this.jInternalFrameOrderByDetalleLiquidacionImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleLiquidacionImpor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleLiquidacionImpor);
				this.jInternalFrameOrderByDetalleLiquidacionImpor.setVisible(false);
				this.jInternalFrameOrderByDetalleLiquidacionImpor.setSelected(false);
				
				this.jInternalFrameOrderByDetalleLiquidacionImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleLiquidacionImpor"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleLiquidacionImpor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleLiquidacionImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleLiquidacionImpor==null) {
				
				this.jInternalFrameImportacionDetalleLiquidacionImpor=new ImportacionJInternalFrame(DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleLiquidacionImpor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleLiquidacionImpor);
				this.jInternalFrameImportacionDetalleLiquidacionImpor.setVisible(false);
				this.jInternalFrameImportacionDetalleLiquidacionImpor.setSelected(false);


				this.jInternalFrameImportacionDetalleLiquidacionImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleLiquidacionImpor"));
				this.jInternalFrameImportacionDetalleLiquidacionImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleLiquidacionImpor"));
				this.jInternalFrameImportacionDetalleLiquidacionImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleLiquidacionImpor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleLiquidacionImpor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor==null) {
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor=new ReporteDinamicoJInternalFrame(DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor);
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleLiquidacionImpor"));
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleLiquidacionImpor"));
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleLiquidacionImpor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleLiquidacionImpor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleLiquidacionImpor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleLiquidacionImpor);
			
	       	this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.dispose();
			//this.jInternalFrameDetalleFormDetalleLiquidacionImpor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleLiquidacionImpor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleLiquidacionImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleLiquidacionImpor.setVisible(true);
	        this.jInternalFrameImportacionDetalleLiquidacionImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleLiquidacionImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleLiquidacionImpor.setVisible(true);
	        this.jInternalFrameOrderByDetalleLiquidacionImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleLiquidacionImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleLiquidacionImpor.setVisible(false);
	        this.jInternalFrameOrderByDetalleLiquidacionImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleLiquidacionImpor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleLiquidacionImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleLiquidacionImpor.setVisible(false);
	        this.jInternalFrameImportacionDetalleLiquidacionImpor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCentroCosto(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
						CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.sTipoBusqueda="CentroCosto";
						}

						centrocostoBeanSwingJInternalFrame.getTodosCentroCostoArbol();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setCentroCostos(centrocostoBeanSwingJInternalFrame.centrocostosArbol);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.CargarTreeCentroCosto();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setVisible(true);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.jInternalFrameParent=this;
						TitledBorder titledBorderDetalleLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosDetalleLiquidacionImpor.getBorder();
						TitledBorder titledBorderCentroCosto=(TitledBorder)centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

						titledBorderCentroCosto.setTitle(titledBorderDetalleLiquidacionImpor.getTitle() + " -> Centro Costo");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centrocostoBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(centrocostoBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCentroCosto(CentroCostoBeanSwingJInternalFrame jInternalFrameTreeCentroCosto) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCentroCosto);
						jInternalFrameTreeCentroCosto.setVisible(false);
						jInternalFrameTreeCentroCosto.setSelected(false);
						//jInternalFrameTreeCentroCosto.dispose();
						//jInternalFrameTreeCentroCosto=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleLiquidacionImpor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleLiquidacionImpor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleLiquidacionImpor(true);
			//this.isEsNuevoDetalleLiquidacionImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleLiquidacionImpor(false) ;
			
			if(detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleLiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleLiquidacionImpor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleLiquidacionImporActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleLiquidacionImpor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleLiquidacionImpor(true);
			//this.isEsNuevoDetalleLiquidacionImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalleliquidacionimpor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleLiquidacionImpor(false) ;
			
			if(DetalleLiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleLiquidacionImpor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaLiquidacionImpor(List<LiquidacionImpor> liquidacionimporsForeignKey)throws Exception{
		TableColumn tableColumnLiquidacionImpor=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR));
		TableCellEditor tableCellEditorLiquidacionImpor =tableColumnLiquidacionImpor.getCellEditor();

		LiquidacionImporTableCell liquidacionimporTableCellFk=(LiquidacionImporTableCell)tableCellEditorLiquidacionImpor;

		if(liquidacionimporTableCellFk!=null) {
			liquidacionimporTableCellFk.setliquidacionimporsForeignKey(liquidacionimporsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//liquidacionimporTableCellFk.setRowActual(intSelectedRow);
			//liquidacionimporTableCellFk.setliquidacionimporsForeignKeyActual(liquidacionimporsForeignKey);
		//}


		if(liquidacionimporTableCellFk!=null) {
			liquidacionimporTableCellFk.RecargarLiquidacionImporsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
				
	
	public void recargarComboTablaCentroCosto(List<CentroCosto> centrocostosForeignKey)throws Exception{
		TableColumn tableColumnCentroCosto=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centrocostoTableCellFk.setRowActual(intSelectedRow);
			//centrocostoTableCellFk.setcentrocostosForeignKeyActual(centrocostosForeignKey);
		//}


		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.RecargarCentroCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCostoGastoImpor(List<CostoGastoImpor> costogastoimporsForeignKey)throws Exception{
		TableColumn tableColumnCostoGastoImpor=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR));
		TableCellEditor tableCellEditorCostoGastoImpor =tableColumnCostoGastoImpor.getCellEditor();

		CostoGastoImporTableCell costogastoimporTableCellFk=(CostoGastoImporTableCell)tableCellEditorCostoGastoImpor;

		if(costogastoimporTableCellFk!=null) {
			costogastoimporTableCellFk.setcostogastoimporsForeignKey(costogastoimporsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//costogastoimporTableCellFk.setRowActual(intSelectedRow);
			//costogastoimporTableCellFk.setcostogastoimporsForeignKeyActual(costogastoimporsForeignKey);
		//}


		if(costogastoimporTableCellFk!=null) {
			costogastoimporTableCellFk.RecargarCostoGastoImporsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleLiquidacionImpor(false);
			
			//if(!this.isEsNuevoDetalleLiquidacionImpor) {								
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				
			}
			
			if(this.permiteMantenimiento(this.detalleliquidacionimpor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleLiquidacionImpor=true;
					this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
					this.isEsNuevoDetalleLiquidacionImpor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleLiquidacionImpor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleLiquidacionImpor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleLiquidacionImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpor(false);
				
				this.habilitarDeshabilitarControlesDetalleLiquidacionImpor(false);
			
												
				
				if(DetalleLiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleLiquidacionImpor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,detalleliquidacionimporSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleLiquidacionImpor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalleliquidacionimporSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalleliquidacionimpor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				this.detalleliquidacionimpor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				this.detalleliquidacionimpor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalleliquidacionimpor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleLiquidacionImporModel) this.jTableDatosDetalleLiquidacionImpor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleLiquidacionImpor=true;
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
				this.isEsNuevoDetalleLiquidacionImpor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleLiquidacionImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpor(false);
				
				this.habilitarDeshabilitarControlesDetalleLiquidacionImpor(false);
				
				
				
				if(DetalleLiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleLiquidacionImpor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleLiquidacionImpor.getRowCount()>=1) {
				jTableDatosDetalleLiquidacionImpor.removeRowSelectionInterval(0, jTableDatosDetalleLiquidacionImpor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleLiquidacionImpor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleLiquidacionImpor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpor(false) ;
			
			this.isEsNuevoDetalleLiquidacionImpor=false;
			
			if(DetalleLiquidacionImporJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleLiquidacionImpor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				
				//SI ES MANUAL
				if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleLiquidacionImpor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleLiquidacionImpor--;			
			//DetalleLiquidacionImpor detalleliquidacionimporAux= new DetalleLiquidacionImpor();			
			//detalleliquidacionimporAux.setId(this.iIdNuevoDetalleLiquidacionImpor);
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleLiquidacionImpor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
			
			this.detalleliquidacionimpor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().add(this.detalleliquidacionimporAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalleliquidacionimpors.add(this.detalleliquidacionimporAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
			
			this.jTableDatosDetalleLiquidacionImpor.setRowSelectionInterval(this.getIndiceNuevoDetalleLiquidacionImpor(), this.getIndiceNuevoDetalleLiquidacionImpor());
			
			int iLastRow =  this.jTableDatosDetalleLiquidacionImpor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleLiquidacionImpor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleLiquidacionImpor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
			
			//SI ES MANUAL
			if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleLiquidacionImpor();
			}
			
			//this.abrirFrameTreeDetalleLiquidacionImpor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Liquidacion ImporES ?", "MANTENIMIENTO DE Detalle Liquidacion Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleLiquidacionImpor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleLiquidacionImpor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalleliquidacionimporReturnGeneral=detalleliquidacionimporLogic.procesarImportacionDetalleLiquidacionImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalleliquidacionimporParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleLiquidacionImporReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleLiquidacionImpor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleLiquidacionImpor.setFileImportacion(this.jInternalFrameImportacionDetalleLiquidacionImpor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleLiquidacionImpor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleLiquidacionImpor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleLiquidacionImpor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleLiquidacionImpor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();		

		detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleLiquidacionImporBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleLiquidacionImporBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleLiquidacionImpors("Todos",detalleliquidacionimporsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LiquidacionImpor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LiquidacionImpor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LiquidacionImpor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LiquidacionImpor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Usuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Usuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Usuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Usuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CostoGastoImpor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CostoGastoImpor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CostoGastoImpor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CostoGastoImpor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ferencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ferencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ferencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ferencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_puesto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_puesto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_puesto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_puesto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_puesto2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_puesto2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_puesto2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_puesto2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_puesto3_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_puesto3_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_puesto3_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_puesto3_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_puesto4_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_puesto4_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_puesto4_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_puesto4_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_puesto5_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_puesto5_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_puesto5_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_puesto5_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR:
					sNombreCampoCategoria="id_liquidacion_impor";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoria="id_usuario";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR:
					sNombreCampoCategoria="id_costo_gasto_impor";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA:
					sNombreCampoCategoria="referencia";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO:
					sNombreCampoCategoria="impuesto";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2:
					sNombreCampoCategoria="impuesto2";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3:
					sNombreCampoCategoria="impuesto3";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4:
					sNombreCampoCategoria="impuesto4";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5:
					sNombreCampoCategoria="impuesto5";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR:
					sNombreCampoCategoriaValor="id_liquidacion_impor";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO:
					sNombreCampoCategoriaValor="id_usuario";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR:
					sNombreCampoCategoriaValor="id_costo_gasto_impor";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA:
					sNombreCampoCategoriaValor="referencia";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO:
					sNombreCampoCategoriaValor="impuesto";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2:
					sNombreCampoCategoriaValor="impuesto2";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3:
					sNombreCampoCategoriaValor="impuesto3";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4:
					sNombreCampoCategoriaValor="impuesto4";
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5:
					sNombreCampoCategoriaValor="impuesto5";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Liquacion Impor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_liquidacion_impor");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_usuario");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Gasto Impor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_costo_gasto_impor");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Referencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"referencia");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Impuesto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"impuesto");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Impuesto2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"impuesto2");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Impuesto3",sNombreCampoCategoria,sNombreCampoCategoriaValor,"impuesto3");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Impuesto4",sNombreCampoCategoria,sNombreCampoCategoriaValor,"impuesto4");
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Impuesto5",sNombreCampoCategoria,sNombreCampoCategoriaValor,"impuesto5");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();		
		
		detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleLiquidacionImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getliquidacionimpor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getusuario_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getcentrocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getcostogastoimpor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getreferencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getimpuesto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getimpuesto2());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getimpuesto3());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getimpuesto4());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5);
					iRow++;

					for(DetalleLiquidacionImpor detalleliquidacionimpor:detalleliquidacionimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleliquidacionimpor.getimpuesto5());
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
			//	this.getFilaCabeceraExportarExcelDetalleLiquidacionImpor(row);				
			//	iRow++;
			//}				
			
			//for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimporsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleLiquidacionImpor(detalleliquidacionimporAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
			
			//SI ES MANUAL
			if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleLiquidacionImpor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
			
			//SI ES MANUAL
			if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleLiquidacionImpor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
			
			//SI ES MANUAL
			if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleLiquidacionImpor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleLiquidacionImpor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleLiquidacionImpor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleLiquidacionImpor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleLiquidacionImpor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleLiquidacionImpor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleLiquidacionImpor.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleLiquidacionImpor.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleLiquidacionImpor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleLiquidacionImpor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleLiquidacionImpor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleLiquidacionImpor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleLiquidacionImpor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleLiquidacionImpor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleLiquidacionImpor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleLiquidacionImpor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleLiquidacionImpor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleLiquidacionImpor();
		
		this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleLiquidacionImpor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleLiquidacionImpor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleLiquidacionImpor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleLiquidacionImpor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleLiquidacionImpor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleLiquidacionImpor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jCheckBoxPostAccionNuevoDetalleLiquidacionImpor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleLiquidacionImpor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleLiquidacionImpor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jCheckBoxPostAccionNuevoDetalleLiquidacionImpor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleLiquidacionImpor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleLiquidacionImpor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleLiquidacionImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleLiquidacionImpor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleLiquidacionImpor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleLiquidacionImpor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleLiquidacionImpor(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleLiquidacionImpor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleLiquidacionImpor() throws Exception {
		try	{
			if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleLiquidacionImpor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleLiquidacionImpor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleLiquidacionImpor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleLiquidacionImpor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleLiquidacionImpor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleLiquidacionImpor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleLiquidacionImpor.addItem(reporte);
			}
			
			
			if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleLiquidacionImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleLiquidacionImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleLiquidacionImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleLiquidacionImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleLiquidacionImpor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleLiquidacionImpor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor!=null) {
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor!=null) {
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleLiquidacionImporConstantesFunciones.getTiposSeleccionarDetalleLiquidacionImpor(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleLiquidacionImporConstantesFunciones.getTiposSeleccionarDetalleLiquidacionImpor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleLiquidacionImporConstantesFunciones.getTiposSeleccionarDetalleLiquidacionImpor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleLiquidacionImpor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.getSelectedItem()!=null){this.id_centro_costoFK_IdCentroCosto=((CentroCosto)this.jComboBoxid_centro_costoFK_IdCentroCostoDetalleLiquidacionImpor.getSelectedItem()).getId();}
		if(this.jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.getSelectedItem()!=null){this.id_costo_gasto_imporFK_IdCostoGastoImpor=((CostoGastoImpor)this.jComboBoxid_costo_gasto_imporFK_IdCostoGastoImporDetalleLiquidacionImpor.getSelectedItem()).getId();}
		if(this.jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.getSelectedItem()!=null){this.id_liquidacion_imporFK_IdLiquidacionImpor=((LiquidacionImpor)this.jComboBoxid_liquidacion_imporFK_IdLiquidacionImporDetalleLiquidacionImpor.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleLiquidacionImpor(Boolean esInicializar) throws Exception {				
		if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleLiquidacionImpor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleLiquidacionImpor() throws Exception {
		this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleLiquidacionImpor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleLiquidacionImporOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImporOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleLiquidacionImpor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalleliquidacionimpors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleLiquidacionImpor.setModel(new DetalleLiquidacionImporModel(this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleLiquidacionImpor.setModel(new DetalleLiquidacionImporModel(this.detalleliquidacionimpors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleLiquidacionImpor!=null && this.jInternalFrameOrderByDetalleLiquidacionImpor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleLiquidacionImpor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO,detalleliquidacionimporConstantesFunciones.resaltarSeleccionarDetalleLiquidacionImpor,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO,detalleliquidacionimporConstantesFunciones.resaltarSeleccionarDetalleLiquidacionImpor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_ID));

		if(this.detalleliquidacionimporConstantesFunciones.mostraridDetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimporConstantesFunciones.resaltaridDetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activaridDetalleLiquidacionImpor,iSizeTabla,this,true,"idDetalleLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimporConstantesFunciones.resaltaridDetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activaridDetalleLiquidacionImpor,this,true,"idDetalleLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarid_liquidacion_imporDetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LiquidacionImporTableCell(this.liquidacionimporsForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_liquidacion_imporDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_liquidacion_imporDetalleLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new LiquidacionImporTableCell(this.liquidacionimporsForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_liquidacion_imporDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_liquidacion_imporDetalleLiquidacionImpor,true,"id_liquidacion_imporDetalleLiquidacionImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarid_empresaDetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_empresaDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_empresaDetalleLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_empresaDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_empresaDetalleLiquidacionImpor,false,"id_empresaDetalleLiquidacionImpor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarid_sucursalDetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_sucursalDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_sucursalDetalleLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_sucursalDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_sucursalDetalleLiquidacionImpor,false,"id_sucursalDetalleLiquidacionImpor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarid_usuarioDetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new UsuarioTableCell(this.usuariosForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_usuarioDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_usuarioDetalleLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new UsuarioTableCell(this.usuariosForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_usuarioDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_usuarioDetalleLiquidacionImpor,false,"id_usuarioDetalleLiquidacionImpor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarid_centro_costoDetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_centro_costoDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_centro_costoDetalleLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_centro_costoDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_centro_costoDetalleLiquidacionImpor,true,"id_centro_costoDetalleLiquidacionImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarid_costo_gasto_imporDetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CostoGastoImporTableCell(this.costogastoimporsForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_costo_gasto_imporDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_costo_gasto_imporDetalleLiquidacionImpor,iSizeTabla));
			tableColumn.setCellEditor(new CostoGastoImporTableCell(this.costogastoimporsForeignKey,this.detalleliquidacionimporConstantesFunciones.resaltarid_costo_gasto_imporDetalleLiquidacionImpor,this,this.detalleliquidacionimporConstantesFunciones.activarid_costo_gasto_imporDetalleLiquidacionImpor,true,"id_costo_gasto_imporDetalleLiquidacionImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarvalorDetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarvalorDetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarvalorDetalleLiquidacionImpor,iSizeTabla,this,true,"valorDetalleLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarvalorDetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarvalorDetalleLiquidacionImpor,this,true,"valorDetalleLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarfechaDetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarfechaDetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarfechaDetalleLiquidacionImpor,iSizeTabla,this,true,"fechaDetalleLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarfechaDetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarfechaDetalleLiquidacionImpor,this,true,"fechaDetalleLiquidacionImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarreferenciaDetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarreferenciaDetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarreferenciaDetalleLiquidacionImpor,iSizeTabla,this,true,"referenciaDetalleLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarreferenciaDetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarreferenciaDetalleLiquidacionImpor,this,true,"referenciaDetalleLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarimpuestoDetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarimpuestoDetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarimpuestoDetalleLiquidacionImpor,iSizeTabla,this,true,"impuestoDetalleLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarimpuestoDetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarimpuestoDetalleLiquidacionImpor,this,true,"impuestoDetalleLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto2DetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto2DetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarimpuesto2DetalleLiquidacionImpor,iSizeTabla,this,true,"impuesto2DetalleLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto2DetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarimpuesto2DetalleLiquidacionImpor,this,true,"impuesto2DetalleLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto3DetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto3DetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarimpuesto3DetalleLiquidacionImpor,iSizeTabla,this,true,"impuesto3DetalleLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto3DetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarimpuesto3DetalleLiquidacionImpor,this,true,"impuesto3DetalleLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto4DetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto4DetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarimpuesto4DetalleLiquidacionImpor,iSizeTabla,this,true,"impuesto4DetalleLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto4DetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarimpuesto4DetalleLiquidacionImpor,this,true,"impuesto4DetalleLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5));

		if(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto5DetalleLiquidacionImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto5DetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarimpuesto5DetalleLiquidacionImpor,iSizeTabla,this,true,"impuesto5DetalleLiquidacionImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto5DetalleLiquidacionImpor,this.detalleliquidacionimporConstantesFunciones.activarimpuesto5DetalleLiquidacionImpor,this,true,"impuesto5DetalleLiquidacionImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleLiquidacionImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleLiquidacionImpor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleLiquidacionImpor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleLiquidacionImpor.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleLiquidacionImpor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleLiquidacionImpor.moveColumn(this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleLiquidacionImpor.moveColumn(this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleLiquidacionImpor.moveColumn(this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleLiquidacionImpor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleLiquidacionImpor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleLiquidacionImpor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleLiquidacionImpor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleLiquidacionImpor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleLiquidacionImpor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalleliquidacionimporLogic.getDetalleLiquidacionImpors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalleliquidacionimpors.size()-1;
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
		//this.jTableDatosDetalleLiquidacionImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleLiquidacionImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleLiquidacionImpor();
			
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
				
				//this.isEsNuevoDetalleLiquidacionImpor=false;
					
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
				if(this.detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleLiquidacionImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalleliquidacionimpor.getsType().equals("DUPLICADO")
				   || this.detalleliquidacionimpor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleLiquidacionImpor=true;
				
				} else {
					this.isEsNuevoDetalleLiquidacionImpor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
					if(this.detalleliquidacionimpor.getId()>=0 && !this.detalleliquidacionimpor.getIsNew()) {						
						this.isEsNuevoDetalleLiquidacionImpor=false;
						
					} else {
						this.isEsNuevoDetalleLiquidacionImpor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleLiquidacionImpor(esRelaciones);						
				
				this.seleccionarDetalleLiquidacionImpor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalleliquidacionimpor.getId()<0) {
					this.isEsNuevoDetalleLiquidacionImpor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleLiquidacionImpor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleLiquidacionImpor(evt,rowIndex);
				}	
				
				if(this.detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleLiquidacionImpor: " + this.dDif); 
					}
				}								
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleLiquidacionImpor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalleliquidacionimpor)) {
					if(this.detalleliquidacionimpor.getId()>0) {
						this.detalleliquidacionimpor.setIsDeleted(true);
						
						this.detalleliquidacionimporsEliminados.add(this.detalleliquidacionimpor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().remove(this.detalleliquidacionimpor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpors.remove(this.detalleliquidacionimpor);				
					}
					
					
					((DetalleLiquidacionImporModel) this.jTableDatosDetalleLiquidacionImpor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleLiquidacionImpor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleLiquidacionImpor) {
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleLiquidacionImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}
				
				//ARCHITECTURE
				try {
					

					//LiquidacionImpor
					if(!this.detalleliquidacionimporConstantesFunciones.cargarid_liquidacion_imporDetalleLiquidacionImpor || this.detalleliquidacionimporConstantesFunciones.event_dependid_liquidacion_imporDetalleLiquidacionImpor) {
						//this.cargarCombosLiquidacionImporsForeignKeyLista(" where id="+this.detalleliquidacionimpor.getid_liquidacion_impor());
									//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
						this.liquidacionimporsForeignKey=new ArrayList<LiquidacionImpor>();

						if(detalleliquidacionimpor.getLiquidacionImpor()!=null) {
							this.liquidacionimporsForeignKey.add(detalleliquidacionimpor.getLiquidacionImpor());
						}

						this.addItemDefectoCombosForeignKeyLiquidacionImpor();
						this.cargarCombosFrameLiquidacionImporsForeignKey("Todos");
					}
					this.setActualLiquidacionImporForeignKey(this.detalleliquidacionimpor.getid_liquidacion_impor(),false,"Formulario");

					//Empresa
					if(!this.detalleliquidacionimporConstantesFunciones.cargarid_empresaDetalleLiquidacionImpor || this.detalleliquidacionimporConstantesFunciones.event_dependid_empresaDetalleLiquidacionImpor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalleliquidacionimpor.getid_empresa());
									//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalleliquidacionimpor.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalleliquidacionimpor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalleliquidacionimpor.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detalleliquidacionimporConstantesFunciones.cargarid_sucursalDetalleLiquidacionImpor || this.detalleliquidacionimporConstantesFunciones.event_dependid_sucursalDetalleLiquidacionImpor) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detalleliquidacionimpor.getid_sucursal());
									//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detalleliquidacionimpor.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detalleliquidacionimpor.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detalleliquidacionimpor.getid_sucursal(),false,"Formulario");

					//Usuario
					if(!this.detalleliquidacionimporConstantesFunciones.cargarid_usuarioDetalleLiquidacionImpor || this.detalleliquidacionimporConstantesFunciones.event_dependid_usuarioDetalleLiquidacionImpor) {
						//this.cargarCombosUsuariosForeignKeyLista(" where id="+this.detalleliquidacionimpor.getid_usuario());
									//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
						this.usuariosForeignKey=new ArrayList<Usuario>();

						if(detalleliquidacionimpor.getUsuario()!=null) {
							this.usuariosForeignKey.add(detalleliquidacionimpor.getUsuario());
						}

						this.addItemDefectoCombosForeignKeyUsuario();
						this.cargarCombosFrameUsuariosForeignKey("Todos");
					}
					this.setActualUsuarioForeignKey(this.detalleliquidacionimpor.getid_usuario(),false,"Formulario");

					//CentroCosto
					if(!this.detalleliquidacionimporConstantesFunciones.cargarid_centro_costoDetalleLiquidacionImpor || this.detalleliquidacionimporConstantesFunciones.event_dependid_centro_costoDetalleLiquidacionImpor) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.detalleliquidacionimpor.getid_centro_costo());
									//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(detalleliquidacionimpor.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(detalleliquidacionimpor.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.detalleliquidacionimpor.getid_centro_costo(),false,"Formulario");

					//CostoGastoImpor
					if(!this.detalleliquidacionimporConstantesFunciones.cargarid_costo_gasto_imporDetalleLiquidacionImpor || this.detalleliquidacionimporConstantesFunciones.event_dependid_costo_gasto_imporDetalleLiquidacionImpor) {
						//this.cargarCombosCostoGastoImporsForeignKeyLista(" where id="+this.detalleliquidacionimpor.getid_costo_gasto_impor());
									//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
						this.costogastoimporsForeignKey=new ArrayList<CostoGastoImpor>();

						if(detalleliquidacionimpor.getCostoGastoImpor()!=null) {
							this.costogastoimporsForeignKey.add(detalleliquidacionimpor.getCostoGastoImpor());
						}

						this.addItemDefectoCombosForeignKeyCostoGastoImpor();
						this.cargarCombosFrameCostoGastoImporsForeignKey("Todos");
					}
					this.setActualCostoGastoImporForeignKey(this.detalleliquidacionimpor.getid_costo_gasto_impor(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleLiquidacionImpor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleLiquidacionImpor(detalleliquidacionimpor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleLiquidacionImpor(detalleliquidacionimpor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleLiquidacionImpor(detalleliquidacionimpor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleLiquidacionImpor(detalleliquidacionimpor);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelidDetalleLiquidacionImpor.setText(detalleliquidacionimpor.getId().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldvalorDetalleLiquidacionImpor.setText(detalleliquidacionimpor.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jDateChooserfechaDetalleLiquidacionImpor.setDate(detalleliquidacionimpor.getfecha());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldreferenciaDetalleLiquidacionImpor.setText(detalleliquidacionimpor.getreferencia());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuestoDetalleLiquidacionImpor.setText(detalleliquidacionimpor.getimpuesto().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto2DetalleLiquidacionImpor.setText(detalleliquidacionimpor.getimpuesto2().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto3DetalleLiquidacionImpor.setText(detalleliquidacionimpor.getimpuesto3().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto4DetalleLiquidacionImpor.setText(detalleliquidacionimpor.getimpuesto4().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto5DetalleLiquidacionImpor.setText(detalleliquidacionimpor.getimpuesto5().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleLiquidacionImpor detalleliquidacionimporLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalleliquidacionimporLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleLiquidacionImpor detalleliquidacionimporLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalleliquidacionimporLocal=this.detalleliquidacionimpor;
			} else {
				detalleliquidacionimporLocal=this.detalleliquidacionimporAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalleliquidacionimporLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleLiquidacionImpor(detalleliquidacionimporLocal,true);
					
					if(detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalleliquidacionimporLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalleliquidacionimporLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(detalleliquidacionimpor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(detalleliquidacionimpor);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(detalleliquidacionimpor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelidDetalleLiquidacionImpor.getText()==null || this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelidDetalleLiquidacionImpor.getText()=="" || this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelidDetalleLiquidacionImpor.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelidDetalleLiquidacionImpor.setText("0");
			}

			if(conColumnasBase) {detalleliquidacionimpor.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelidDetalleLiquidacionImpor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImporConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelIdDetalleLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpor.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldvalorDetalleLiquidacionImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelvalorDetalleLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpor.setfecha(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jDateChooserfechaDetalleLiquidacionImpor.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelfechaDetalleLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpor.setreferencia(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldreferenciaDetalleLiquidacionImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelreferenciaDetalleLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpor.setimpuesto(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuestoDetalleLiquidacionImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuestoDetalleLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpor.setimpuesto2(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto2DetalleLiquidacionImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto2DetalleLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpor.setimpuesto3(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto3DetalleLiquidacionImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto3DetalleLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpor.setimpuesto4(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto4DetalleLiquidacionImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto4DetalleLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleliquidacionimpor.setimpuesto5(Double.parseDouble(this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto5DetalleLiquidacionImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelimpuesto5DetalleLiquidacionImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimporBean,DetalleLiquidacionImpor detalleliquidacionimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalleliquidacionimporBean.getid_liquidacion_impor()!=null && !detalleliquidacionimporBean.getid_liquidacion_impor().equals(-1L))) {detalleliquidacionimpor.setid_liquidacion_impor(detalleliquidacionimporBean.getid_liquidacion_impor());}
			if(conDefault || (!conDefault && detalleliquidacionimporBean.getid_centro_costo()!=null && !detalleliquidacionimporBean.getid_centro_costo().equals(null))) {detalleliquidacionimpor.setid_centro_costo(detalleliquidacionimporBean.getid_centro_costo());}
			if(conDefault || (!conDefault && detalleliquidacionimporBean.getid_costo_gasto_impor()!=null && !detalleliquidacionimporBean.getid_costo_gasto_impor().equals(-1L))) {detalleliquidacionimpor.setid_costo_gasto_impor(detalleliquidacionimporBean.getid_costo_gasto_impor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimporOrigen,DetalleLiquidacionImpor detalleliquidacionimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getId()!=null && !detalleliquidacionimporOrigen.getId().equals(0L))) {detalleliquidacionimpor.setId(detalleliquidacionimporOrigen.getId());}}
			if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getid_liquidacion_impor()!=null && !detalleliquidacionimporOrigen.getid_liquidacion_impor().equals(-1L))) {detalleliquidacionimpor.setid_liquidacion_impor(detalleliquidacionimporOrigen.getid_liquidacion_impor());}
			if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getid_centro_costo()!=null && !detalleliquidacionimporOrigen.getid_centro_costo().equals(null))) {detalleliquidacionimpor.setid_centro_costo(detalleliquidacionimporOrigen.getid_centro_costo());}
			if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getid_costo_gasto_impor()!=null && !detalleliquidacionimporOrigen.getid_costo_gasto_impor().equals(-1L))) {detalleliquidacionimpor.setid_costo_gasto_impor(detalleliquidacionimporOrigen.getid_costo_gasto_impor());}
			if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getvalor()!=null && !detalleliquidacionimporOrigen.getvalor().equals(0.0))) {detalleliquidacionimpor.setvalor(detalleliquidacionimporOrigen.getvalor());}
			if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getfecha()!=null && !detalleliquidacionimporOrigen.getfecha().equals(new Date()))) {detalleliquidacionimpor.setfecha(detalleliquidacionimporOrigen.getfecha());}
			if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getreferencia()!=null && !detalleliquidacionimporOrigen.getreferencia().equals(""))) {detalleliquidacionimpor.setreferencia(detalleliquidacionimporOrigen.getreferencia());}
			if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getimpuesto()!=null && !detalleliquidacionimporOrigen.getimpuesto().equals(0.0))) {detalleliquidacionimpor.setimpuesto(detalleliquidacionimporOrigen.getimpuesto());}
			if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getimpuesto2()!=null && !detalleliquidacionimporOrigen.getimpuesto2().equals(0.0))) {detalleliquidacionimpor.setimpuesto2(detalleliquidacionimporOrigen.getimpuesto2());}
			if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getimpuesto3()!=null && !detalleliquidacionimporOrigen.getimpuesto3().equals(0.0))) {detalleliquidacionimpor.setimpuesto3(detalleliquidacionimporOrigen.getimpuesto3());}
			if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getimpuesto4()!=null && !detalleliquidacionimporOrigen.getimpuesto4().equals(0.0))) {detalleliquidacionimpor.setimpuesto4(detalleliquidacionimporOrigen.getimpuesto4());}
			if(conDefault || (!conDefault && detalleliquidacionimporOrigen.getimpuesto5()!=null && !detalleliquidacionimporOrigen.getimpuesto5().equals(0.0))) {detalleliquidacionimpor.setimpuesto5(detalleliquidacionimporOrigen.getimpuesto5());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelidDetalleLiquidacionImpor.setText(detalleliquidacionimpor.getId().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldvalorDetalleLiquidacionImpor.setText(detalleliquidacionimpor.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jDateChooserfechaDetalleLiquidacionImpor.setDate(detalleliquidacionimpor.getfecha());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldreferenciaDetalleLiquidacionImpor.setText(detalleliquidacionimpor.getreferencia());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuestoDetalleLiquidacionImpor.setText(detalleliquidacionimpor.getimpuesto().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto2DetalleLiquidacionImpor.setText(detalleliquidacionimpor.getimpuesto2().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto3DetalleLiquidacionImpor.setText(detalleliquidacionimpor.getimpuesto3().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto4DetalleLiquidacionImpor.setText(detalleliquidacionimpor.getimpuesto4().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto5DetalleLiquidacionImpor.setText(detalleliquidacionimpor.getimpuesto5().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleLiquidacionImpor(DetalleLiquidacionImporBean detalleliquidacionimporBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelidDetalleLiquidacionImpor.setText(detalleliquidacionimporBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldvalorDetalleLiquidacionImpor.setText(detalleliquidacionimporBean.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jDateChooserfechaDetalleLiquidacionImpor.setDate(detalleliquidacionimporBean.getfecha());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldreferenciaDetalleLiquidacionImpor.setText(detalleliquidacionimporBean.getreferencia());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuestoDetalleLiquidacionImpor.setText(detalleliquidacionimporBean.getimpuesto().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto2DetalleLiquidacionImpor.setText(detalleliquidacionimporBean.getimpuesto2().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto3DetalleLiquidacionImpor.setText(detalleliquidacionimporBean.getimpuesto3().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto4DetalleLiquidacionImpor.setText(detalleliquidacionimporBean.getimpuesto4().toString());
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto5DetalleLiquidacionImpor.setText(detalleliquidacionimporBean.getimpuesto5().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleLiquidacionImpor(DetalleLiquidacionImporParameterReturnGeneral detalleliquidacionimporReturnGeneral,DetalleLiquidacionImporBean detalleliquidacionimporBean,Boolean conDefault) throws Exception { 
		try {
			DetalleLiquidacionImpor detalleliquidacionimporLocal=new DetalleLiquidacionImpor();
			
			detalleliquidacionimporLocal=detalleliquidacionimporReturnGeneral.getDetalleLiquidacionImpor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleliquidacionimporLocal.getId()!=null && !detalleliquidacionimporLocal.getId().equals(0L))) {detalleliquidacionimporBean.setId(detalleliquidacionimporLocal.getId());}}
			if(conDefault || (!conDefault && detalleliquidacionimporLocal.getid_liquidacion_impor()!=null && !detalleliquidacionimporLocal.getid_liquidacion_impor().equals(-1L))) {detalleliquidacionimporBean.setid_liquidacion_impor(detalleliquidacionimporLocal.getid_liquidacion_impor());}
			if(conDefault || (!conDefault && detalleliquidacionimporLocal.getid_centro_costo()!=null && !detalleliquidacionimporLocal.getid_centro_costo().equals(null))) {detalleliquidacionimporBean.setid_centro_costo(detalleliquidacionimporLocal.getid_centro_costo());}
			if(conDefault || (!conDefault && detalleliquidacionimporLocal.getid_costo_gasto_impor()!=null && !detalleliquidacionimporLocal.getid_costo_gasto_impor().equals(-1L))) {detalleliquidacionimporBean.setid_costo_gasto_impor(detalleliquidacionimporLocal.getid_costo_gasto_impor());}
			if(conDefault || (!conDefault && detalleliquidacionimporLocal.getvalor()!=null && !detalleliquidacionimporLocal.getvalor().equals(0.0))) {detalleliquidacionimporBean.setvalor(detalleliquidacionimporLocal.getvalor());}
			if(conDefault || (!conDefault && detalleliquidacionimporLocal.getfecha()!=null && !detalleliquidacionimporLocal.getfecha().equals(new Date()))) {detalleliquidacionimporBean.setfecha(detalleliquidacionimporLocal.getfecha());}
			if(conDefault || (!conDefault && detalleliquidacionimporLocal.getreferencia()!=null && !detalleliquidacionimporLocal.getreferencia().equals(""))) {detalleliquidacionimporBean.setreferencia(detalleliquidacionimporLocal.getreferencia());}
			if(conDefault || (!conDefault && detalleliquidacionimporLocal.getimpuesto()!=null && !detalleliquidacionimporLocal.getimpuesto().equals(0.0))) {detalleliquidacionimporBean.setimpuesto(detalleliquidacionimporLocal.getimpuesto());}
			if(conDefault || (!conDefault && detalleliquidacionimporLocal.getimpuesto2()!=null && !detalleliquidacionimporLocal.getimpuesto2().equals(0.0))) {detalleliquidacionimporBean.setimpuesto2(detalleliquidacionimporLocal.getimpuesto2());}
			if(conDefault || (!conDefault && detalleliquidacionimporLocal.getimpuesto3()!=null && !detalleliquidacionimporLocal.getimpuesto3().equals(0.0))) {detalleliquidacionimporBean.setimpuesto3(detalleliquidacionimporLocal.getimpuesto3());}
			if(conDefault || (!conDefault && detalleliquidacionimporLocal.getimpuesto4()!=null && !detalleliquidacionimporLocal.getimpuesto4().equals(0.0))) {detalleliquidacionimporBean.setimpuesto4(detalleliquidacionimporLocal.getimpuesto4());}
			if(conDefault || (!conDefault && detalleliquidacionimporLocal.getimpuesto5()!=null && !detalleliquidacionimporLocal.getimpuesto5().equals(0.0))) {detalleliquidacionimporBean.setimpuesto5(detalleliquidacionimporLocal.getimpuesto5());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleLiquidacionImporGenerico(Long idDetalleLiquidacionImporSeleccionado,JComboBox jComboBoxDetalleLiquidacionImpor,List<DetalleLiquidacionImpor> detalleliquidacionimporsLocal)throws Exception {
		try {
			DetalleLiquidacionImpor  detalleliquidacionimporTemp=null;

			for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimporsLocal) {
				if(detalleliquidacionimporAux.getId()!=null && detalleliquidacionimporAux.getId().equals(idDetalleLiquidacionImporSeleccionado)) {
					detalleliquidacionimporTemp=detalleliquidacionimporAux;
					break;
				}
			}

			jComboBoxDetalleLiquidacionImpor.setSelectedItem(detalleliquidacionimporTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleLiquidacionImporGenerico(JComboBox jComboBoxDetalleLiquidacionImpor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleLiquidacionImpor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleLiquidacionImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleLiquidacionImpor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleLiquidacionImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleliquidacionimpor=(DetalleLiquidacionImpor) detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleliquidacionimpor =(DetalleLiquidacionImpor) detalleliquidacionimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("LiquidacionImpor")) {
			//sDescripcion=this.getActualLiquidacionImporForeignKeyDescripcion((Long)value);
			if(!detalleliquidacionimpor.getIsNew() && !detalleliquidacionimpor.getIsChanged() && !detalleliquidacionimpor.getIsDeleted()) {
				sDescripcion=detalleliquidacionimpor.getliquidacionimpor_descripcion();
			} else {
				//sDescripcion=this.getActualLiquidacionImporForeignKeyDescripcion((Long)value);
				sDescripcion=detalleliquidacionimpor.getliquidacionimpor_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalleliquidacionimpor.getIsNew() && !detalleliquidacionimpor.getIsChanged() && !detalleliquidacionimpor.getIsDeleted()) {
				sDescripcion=detalleliquidacionimpor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleliquidacionimpor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detalleliquidacionimpor.getIsNew() && !detalleliquidacionimpor.getIsChanged() && !detalleliquidacionimpor.getIsDeleted()) {
				sDescripcion=detalleliquidacionimpor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detalleliquidacionimpor.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Usuario")) {
			//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
			if(!detalleliquidacionimpor.getIsNew() && !detalleliquidacionimpor.getIsChanged() && !detalleliquidacionimpor.getIsDeleted()) {
				sDescripcion=detalleliquidacionimpor.getusuario_descripcion();
			} else {
				//sDescripcion=this.getActualUsuarioForeignKeyDescripcion((Long)value);
				sDescripcion=detalleliquidacionimpor.getusuario_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!detalleliquidacionimpor.getIsNew() && !detalleliquidacionimpor.getIsChanged() && !detalleliquidacionimpor.getIsDeleted()) {
				sDescripcion=detalleliquidacionimpor.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleliquidacionimpor.getcentrocosto_descripcion();
			}
		}

		if(sTipo.equals("CostoGastoImpor")) {
			//sDescripcion=this.getActualCostoGastoImporForeignKeyDescripcion((Long)value);
			if(!detalleliquidacionimpor.getIsNew() && !detalleliquidacionimpor.getIsChanged() && !detalleliquidacionimpor.getIsDeleted()) {
				sDescripcion=detalleliquidacionimpor.getcostogastoimpor_descripcion();
			} else {
				//sDescripcion=this.getActualCostoGastoImporForeignKeyDescripcion((Long)value);
				sDescripcion=detalleliquidacionimpor.getcostogastoimpor_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleLiquidacionImpor detalleliquidacionimporRow=new DetalleLiquidacionImpor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleliquidacionimporRow=(DetalleLiquidacionImpor) detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleliquidacionimporRow=(DetalleLiquidacionImpor) detalleliquidacionimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleLiquidacionImpor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor && this.isPermisoNuevoDetalleLiquidacionImpor));			
			this.jButtonDuplicarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpor && this.isPermisoDuplicarDetalleLiquidacionImpor));			
			this.jButtonCopiarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaCopiarDetalleLiquidacionImpor && this.isPermisoCopiarDetalleLiquidacionImpor));
			this.jButtonVerFormDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaVerFormDetalleLiquidacionImpor && this.isPermisoVerFormDetalleLiquidacionImpor));
			
			this.jButtonAbrirOrderByDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpor && this.isPermisoOrdenDetalleLiquidacionImpor));			
			
			this.jButtonNuevoRelacionesDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor && this.isPermisoNuevoDetalleLiquidacionImpor));			
			this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor && this.isPermisoNuevoDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor));
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonModificarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaModificarDetalleLiquidacionImpor && this.isPermisoActualizarDetalleLiquidacionImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonActualizarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor && this.isPermisoActualizarDetalleLiquidacionImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonEliminarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor && this.isPermisoEliminarDetalleLiquidacionImpor));
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonCancelarDetalleLiquidacionImpor.setVisible(this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor);							
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor && this.isPermisoNuevoDetalleLiquidacionImpor));						
			this.jButtonDuplicarToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpor && this.isPermisoDuplicarDetalleLiquidacionImpor));						
			this.jButtonCopiarToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaCopiarDetalleLiquidacionImpor && this.isPermisoCopiarDetalleLiquidacionImpor));			
			this.jButtonVerFormToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaVerFormDetalleLiquidacionImpor && this.isPermisoVerFormDetalleLiquidacionImpor));			
			this.jButtonAbrirOrderByToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpor && this.isPermisoOrdenDetalleLiquidacionImpor));
			this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor && this.isPermisoNuevoDetalleLiquidacionImpor));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor && this.isPermisoNuevoDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor));			
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonModificarToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaModificarDetalleLiquidacionImpor && this.isPermisoActualizarDetalleLiquidacionImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonActualizarToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor  && this.isPermisoActualizarDetalleLiquidacionImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonEliminarToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor && this.isPermisoEliminarDetalleLiquidacionImpor));
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonCancelarToolBarDetalleLiquidacionImpor.setVisible(this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor);				
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor && this.isPermisoNuevoDetalleLiquidacionImpor));			
			this.jMenuItemDuplicarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpor && this.isPermisoDuplicarDetalleLiquidacionImpor));			
			this.jMenuItemCopiarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaCopiarDetalleLiquidacionImpor && this.isPermisoCopiarDetalleLiquidacionImpor));			
			this.jMenuItemVerFormDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaVerFormDetalleLiquidacionImpor && this.isPermisoVerFormDetalleLiquidacionImpor));			
			this.jMenuItemAbrirOrderByDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpor && this.isPermisoOrdenDetalleLiquidacionImpor));			
			//this.jMenuItemMostrarOcultarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpor && this.isPermisoOrdenDetalleLiquidacionImpor));
			this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpor && this.isPermisoOrdenDetalleLiquidacionImpor));			
			//this.jMenuItemDetalleMostrarOcultarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaOrdenDetalleLiquidacionImpor && this.isPermisoOrdenDetalleLiquidacionImpor));			
			this.jMenuItemNuevoRelacionesDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor && this.isPermisoNuevoDetalleLiquidacionImpor));			
			this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor && this.isPermisoNuevoDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor));									
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemModificarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaModificarDetalleLiquidacionImpor && this.isPermisoActualizarDetalleLiquidacionImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemActualizarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor && this.isPermisoActualizarDetalleLiquidacionImpor));	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemEliminarDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor && this.isPermisoEliminarDetalleLiquidacionImpor));
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemCancelarDetalleLiquidacionImpor.setVisible(this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor);				
			}
			
			this.jMenuItemGuardarCambiosDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor));						
			this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=this.jButtonNuevoDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpor=this.jButtonDuplicarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaCopiarDetalleLiquidacionImpor=this.jButtonCopiarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaVerFormDetalleLiquidacionImpor=this.jButtonVerFormDetalleLiquidacionImpor.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleLiquidacionImpor=this.jButtonAbrirOrderByDetalleLiquidacionImpor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=this.jButtonNuevoRelacionesDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpor=this.jButtonModificarDetalleLiquidacionImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonActualizarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonEliminarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonCancelarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosDetalleLiquidacionImpor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=this.jButtonNuevoToolBarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonModificarToolBarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonActualizarToolBarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonEliminarToolBarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonCancelarToolBarDetalleLiquidacionImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=this.jButtonGuardarCambiosToolBarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=this.jMenuItemNuevoDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=this.jMenuItemNuevoRelacionesDetalleLiquidacionImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemModificarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemActualizarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemEliminarDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor=this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemCancelarDetalleLiquidacionImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=this.jMenuItemGuardarCambiosDetalleLiquidacionImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleLiquidacionImpor(Boolean esInicializar) {
		if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
				//if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleLiquidacionImpor();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleLiquidacionImpor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleLiquidacionImpor() {
		this.jButtonNuevoDetalleLiquidacionImpor.setVisible(this.isPermisoNuevoDetalleLiquidacionImpor);			
		this.jButtonDuplicarDetalleLiquidacionImpor.setVisible(this.isPermisoDuplicarDetalleLiquidacionImpor);			
		this.jButtonCopiarDetalleLiquidacionImpor.setVisible(this.isPermisoCopiarDetalleLiquidacionImpor);			
		this.jButtonVerFormDetalleLiquidacionImpor.setVisible(this.isPermisoVerFormDetalleLiquidacionImpor);			
		
		this.jButtonAbrirOrderByDetalleLiquidacionImpor.setVisible(this.isPermisoOrdenDetalleLiquidacionImpor);					
		
		this.jButtonNuevoRelacionesDetalleLiquidacionImpor.setVisible(this.isPermisoNuevoDetalleLiquidacionImpor);			
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonModificarDetalleLiquidacionImpor.setVisible(this.isPermisoActualizarDetalleLiquidacionImpor);	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonActualizarDetalleLiquidacionImpor.setVisible(this.isPermisoActualizarDetalleLiquidacionImpor);	
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonEliminarDetalleLiquidacionImpor.setVisible(this.isPermisoEliminarDetalleLiquidacionImpor);
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonCancelarDetalleLiquidacionImpor.setVisible(this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor);						
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosDetalleLiquidacionImpor.setVisible(this.isPermisoGuardarCambiosDetalleLiquidacionImpor);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.setVisible(this.isPermisoActualizarDetalleLiquidacionImpor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleLiquidacionImpor() {
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonModificarDetalleLiquidacionImpor.setVisible(this.isPermisoActualizarDetalleLiquidacionImpor);	
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonActualizarDetalleLiquidacionImpor.setVisible(this.isPermisoActualizarDetalleLiquidacionImpor);	
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonEliminarDetalleLiquidacionImpor.setVisible(this.isPermisoEliminarDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonCancelarDetalleLiquidacionImpor.setVisible(this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor);							
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosDetalleLiquidacionImpor.setVisible((this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor && this.isPermisoGuardarCambiosDetalleLiquidacionImpor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleLiquidacionImpor() {
		if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleLiquidacionImpor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleLiquidacionImpor() {
	}
	
	public void jTableDatosDetalleLiquidacionImporListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleLiquidacionImpor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalleliquidacionimpor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_liquidacion_imporDetalleLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoliquidacionimpor=true;

			idTienePermisoliquidacionimpor=this.tienePermisosUsuarioEnPaginaWebDetalleLiquidacionImpor(LiquidacionImporConstantesFunciones.CLASSNAME);

			if(idTienePermisoliquidacionimpor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);

				this.liquidacionimporBeanSwingJInternalFrame=new LiquidacionImporBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.liquidacionimporBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.liquidacionimporBeanSwingJInternalFrame.getLiquidacionImporLogic().setConnexion(this.detalleliquidacionimporLogic.getConnexion());

				if(this.detalleliquidacionimpor.getid_liquidacion_impor()!=null) {
					this.liquidacionimporBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.liquidacionimporBeanSwingJInternalFrame.setIdActual(this.detalleliquidacionimpor.getid_liquidacion_impor());
					this.liquidacionimporBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.liquidacionimporBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.liquidacionimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaLiquidacionImpor();
				}

				JInternalFrameBase jinternalFrame =this.liquidacionimporBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosDetalleLiquidacionImpor.getBorder();
				TitledBorder titledBorderliquidacionimpor=(TitledBorder)this.liquidacionimporBeanSwingJInternalFrame.jScrollPanelDatosLiquidacionImpor.getBorder();

				titledBorderliquidacionimpor.setTitle(titledBorderDetalleLiquidacionImpor.getTitle() + " -> Liquidacion Impor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_liquidacion_imporDetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getid_liquidacion_impor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_liquidacion_impor = "+this.detalleliquidacionimpor.getid_liquidacion_impor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleLiquidacionImpor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalleliquidacionimporLogic.getConnexion());

				if(this.detalleliquidacionimpor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalleliquidacionimpor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosDetalleLiquidacionImpor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleLiquidacionImpor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalleliquidacionimpor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleLiquidacionImpor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detalleliquidacionimporLogic.getConnexion());

				if(this.detalleliquidacionimpor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detalleliquidacionimpor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosDetalleLiquidacionImpor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleLiquidacionImpor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detalleliquidacionimpor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_usuarioDetalleLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisousuario=true;

			idTienePermisousuario=this.tienePermisosUsuarioEnPaginaWebDetalleLiquidacionImpor(UsuarioConstantesFunciones.CLASSNAME);

			if(idTienePermisousuario) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);

				this.usuarioBeanSwingJInternalFrame=new UsuarioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.usuarioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.usuarioBeanSwingJInternalFrame.getUsuarioLogic().setConnexion(this.detalleliquidacionimporLogic.getConnexion());

				if(this.detalleliquidacionimpor.getid_usuario()!=null) {
					this.usuarioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.usuarioBeanSwingJInternalFrame.setIdActual(this.detalleliquidacionimpor.getid_usuario());
					this.usuarioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.usuarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaUsuario();
				}

				JInternalFrameBase jinternalFrame =this.usuarioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosDetalleLiquidacionImpor.getBorder();
				TitledBorder titledBorderusuario=(TitledBorder)this.usuarioBeanSwingJInternalFrame.jScrollPanelDatosUsuario.getBorder();

				titledBorderusuario.setTitle(titledBorderDetalleLiquidacionImpor.getTitle() + " -> Usuario");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_usuarioDetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getid_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_usuario = "+this.detalleliquidacionimpor.getid_usuario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoDetalleLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebDetalleLiquidacionImpor(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.detalleliquidacionimporLogic.getConnexion());

				if(this.detalleliquidacionimpor.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.detalleliquidacionimpor.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosDetalleLiquidacionImpor.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderDetalleLiquidacionImpor.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoDetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.detalleliquidacionimpor.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocostogastoimpor=true;

			idTienePermisocostogastoimpor=this.tienePermisosUsuarioEnPaginaWebDetalleLiquidacionImpor(CostoGastoImporConstantesFunciones.CLASSNAME);

			if(idTienePermisocostogastoimpor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleLiquidacionImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleLiquidacionImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);

				this.costogastoimporBeanSwingJInternalFrame=new CostoGastoImporBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.costogastoimporBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.costogastoimporBeanSwingJInternalFrame.getCostoGastoImporLogic().setConnexion(this.detalleliquidacionimporLogic.getConnexion());

				if(this.detalleliquidacionimpor.getid_costo_gasto_impor()!=null) {
					this.costogastoimporBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.costogastoimporBeanSwingJInternalFrame.setIdActual(this.detalleliquidacionimpor.getid_costo_gasto_impor());
					this.costogastoimporBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.costogastoimporBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.costogastoimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaCostoGastoImpor();
				}

				JInternalFrameBase jinternalFrame =this.costogastoimporBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleLiquidacionImpor=(TitledBorder)this.jScrollPanelDatosDetalleLiquidacionImpor.getBorder();
				TitledBorder titledBordercostogastoimpor=(TitledBorder)this.costogastoimporBeanSwingJInternalFrame.jScrollPanelDatosCostoGastoImpor.getBorder();

				titledBordercostogastoimpor.setTitle(titledBorderDetalleLiquidacionImpor.getTitle() + " -> Costo Gasto Impor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_costo_gasto_imporDetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getid_costo_gasto_impor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_costo_gasto_impor = "+this.detalleliquidacionimpor.getid_costo_gasto_impor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorDetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.detalleliquidacionimpor.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaDetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.detalleliquidacionimpor.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonreferenciaDetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getreferencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where referencia like '%"+this.detalleliquidacionimpor.getreferencia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonimpuestoDetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getimpuesto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where impuesto = "+this.detalleliquidacionimpor.getimpuesto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonimpuesto2DetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getimpuesto2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where impuesto2 = "+this.detalleliquidacionimpor.getimpuesto2().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonimpuesto3DetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getimpuesto3()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where impuesto3 = "+this.detalleliquidacionimpor.getimpuesto3().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonimpuesto4DetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getimpuesto4()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where impuesto4 = "+this.detalleliquidacionimpor.getimpuesto4().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonimpuesto5DetalleLiquidacionImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.getdetalleliquidacionimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleliquidacionimpor==null) {
						this.detalleliquidacionimpor = new DetalleLiquidacionImpor();
					}

					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);
				}

				if(this.detalleliquidacionimpor.getimpuesto5()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where impuesto5 = "+this.detalleliquidacionimpor.getimpuesto5().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCentroCostoDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);

			this.getDetalleLiquidacionImporsFK_IdCentroCosto();

			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);

			//if(DetalleLiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCostoGastoImporDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);

			this.getDetalleLiquidacionImporsFK_IdCostoGastoImpor();

			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);

			//if(DetalleLiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);

			this.getDetalleLiquidacionImporsFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);

			//if(DetalleLiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLiquidacionImporDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);

			this.getDetalleLiquidacionImporsFK_IdLiquidacionImpor();

			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);

			//if(DetalleLiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);

			this.getDetalleLiquidacionImporsFK_IdSucursal();

			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);

			//if(DetalleLiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUsuarioDetalleLiquidacionImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);

			this.getDetalleLiquidacionImporsFK_IdUsuario();

			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);

			//if(DetalleLiquidacionImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleliquidacionimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleLiquidacionImpor() {
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.dispose();
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor!=null) {
			this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.dispose();
			this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor=null;
		}
		
		if(this.jInternalFrameImportacionDetalleLiquidacionImpor!=null) {
			this.jInternalFrameImportacionDetalleLiquidacionImpor.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleLiquidacionImpor.dispose();
			this.jInternalFrameImportacionDetalleLiquidacionImpor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleLiquidacionImpor();
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleLiquidacionImpor")) {
				jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleLiquidacionImpor")) {
				jButtonDuplicarDetalleLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleLiquidacionImpor")) {
				jButtonCopiarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleLiquidacionImpor")) {
				jButtonVerFormDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleLiquidacionImpor")) {
				jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleLiquidacionImpor")) {
				jButtonDuplicarDetalleLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleLiquidacionImpor")) {
				jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleLiquidacionImpor")) {
				jButtonDuplicarDetalleLiquidacionImporActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleLiquidacionImpor")) {
				jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleLiquidacionImpor")) {
				jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleLiquidacionImpor")) {
				jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleLiquidacionImpor")) {
				jButtonModificarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleLiquidacionImpor")) {
				jButtonModificarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleLiquidacionImpor")) {
				jButtonModificarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleLiquidacionImpor")) {
				jButtonActualizarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleLiquidacionImpor")) {
				jButtonActualizarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleLiquidacionImpor")) {
				jButtonActualizarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleLiquidacionImpor")) {
				jButtonEliminarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleLiquidacionImpor")) {
				jButtonEliminarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleLiquidacionImpor")) {
				jButtonEliminarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleLiquidacionImpor")) {
				jButtonCancelarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleLiquidacionImpor")) {
				jButtonCancelarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleLiquidacionImpor")) {
				jButtonCancelarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleLiquidacionImpor")) {
				jButtonCerrarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleLiquidacionImpor")) {
				jButtonCerrarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleLiquidacionImpor")) {
				jButtonCerrarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleLiquidacionImpor")) {
				jButtonMostrarOcultarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleLiquidacionImpor")) {
				jButtonCancelarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleLiquidacionImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleLiquidacionImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleLiquidacionImpor")) {
				jButtonCopiarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleLiquidacionImpor")) {
				jButtonVerFormDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleLiquidacionImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleLiquidacionImpor")) {
				jButtonCopiarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleLiquidacionImpor")) {
				jButtonVerFormDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleLiquidacionImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleLiquidacionImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleLiquidacionImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleLiquidacionImpor")) {
				jButtonRecargarInformacionDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleLiquidacionImpor")) {
				jButtonRecargarInformacionDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleLiquidacionImpor")) {
				jButtonRecargarInformacionDetalleLiquidacionImporActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleLiquidacionImpor")) {
				jButtonAnterioresDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleLiquidacionImpor")) {
				jButtonAnterioresDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleLiquidacionImpor")) {
				jButtonAnterioresDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleLiquidacionImpor")) {
				jButtonSiguientesDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleLiquidacionImpor")) {
				jButtonSiguientesDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleLiquidacionImpor")) {
				jButtonSiguientesDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleLiquidacionImpor") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleLiquidacionImpor")) {
				jButtonAbrirOrderByDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleLiquidacionImpor") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleLiquidacionImpor")) {
				jButtonMostrarOcultarDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleLiquidacionImpor")) {
				jButtonNuevoGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleLiquidacionImpor")) {
				jButtonNuevoGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleLiquidacionImpor")) {
				jButtonNuevoGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleLiquidacionImpor")) {
				jButtonCerrarReporteDinamicoDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleLiquidacionImpor")) {
				jButtonGenerarReporteDinamicoDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleLiquidacionImpor")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleLiquidacionImpor")) {
				jButtonCerrarImportacionDetalleLiquidacionImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleLiquidacionImpor")) {
				
				jButtonGenerarImportacionDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleLiquidacionImpor")) {
				
				jButtonAbrirImportacionDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleLiquidacionImpor")) {
				jComboBoxTiposAccionesDetalleLiquidacionImporActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleLiquidacionImpor")) {
				jComboBoxTiposRelacionesDetalleLiquidacionImporActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleLiquidacionImpor")) {
				jComboBoxTiposAccionesDetalleLiquidacionImporActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleLiquidacionImpor")) {
				
				jComboBoxTiposSeleccionarDetalleLiquidacionImporActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleLiquidacionImpor")) {
				jTextFieldValorCampoGeneralDetalleLiquidacionImporActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleLiquidacionImpor")) {
				jButtonAbrirOrderByDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleLiquidacionImpor")) {
				jButtonAbrirOrderByDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleLiquidacionImpor")) {
				jButtonCerrarOrderByDetalleLiquidacionImporActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleLiquidacionImporBusqueda")) {
				this.jButtonidDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_liquidacion_imporDetalleLiquidacionImporUpdate")) {
				this.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_liquidacion_imporDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_liquidacion_imporDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleLiquidacionImporUpdate")) {
				this.jButtonid_empresaDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_empresaDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleLiquidacionImporUpdate")) {
				this.jButtonid_sucursalDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_sucursalDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDetalleLiquidacionImporUpdate")) {
				this.jButtonid_usuarioDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_usuarioDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoDetalleLiquidacionImporUpdate")) {
				this.jButtonid_centro_costoDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_centro_costoDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_costo_gasto_imporDetalleLiquidacionImporUpdate")) {
				this.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_costo_gasto_imporDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleLiquidacionImporBusqueda")) {
				this.jButtonvalorDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDetalleLiquidacionImporBusqueda")) {
				this.jButtonfechaDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("referenciaDetalleLiquidacionImporBusqueda")) {
				this.jButtonreferenciaDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuestoDetalleLiquidacionImporBusqueda")) {
				this.jButtonimpuestoDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuesto2DetalleLiquidacionImporBusqueda")) {
				this.jButtonimpuesto2DetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuesto3DetalleLiquidacionImporBusqueda")) {
				this.jButtonimpuesto3DetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuesto4DetalleLiquidacionImporBusqueda")) {
				this.jButtonimpuesto4DetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuesto5DetalleLiquidacionImporBusqueda")) {
				this.jButtonimpuesto5DetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCentroCostoDetalleLiquidacionImpor")) {
				this.jButtonFK_IdCentroCostoDetalleLiquidacionImporActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCostoGastoImporDetalleLiquidacionImpor")) {
				this.jButtonFK_IdCostoGastoImporDetalleLiquidacionImporActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdLiquidacionImporDetalleLiquidacionImpor")) {
				this.jButtonFK_IdLiquidacionImporDetalleLiquidacionImporActionPerformed(evt);
			}
			
			;
			
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleLiquidacionImpor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				


				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleLiquidacionImpor detalleliquidacionimporLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalleliquidacionimporLocal=this.detalleliquidacionimpor;
			} else {
				detalleliquidacionimporLocal=this.detalleliquidacionimporAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
							
				
				


				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
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
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
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
			
			


			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
								
						
				


				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
								
				
				


				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
							
				
				


				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
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
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
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
			
			


			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImporActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
								
				
				


				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleLiquidacionImpor")) {
					jCheckBoxSeleccionarTodosDetalleLiquidacionImporItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleLiquidacionImpor")) {
					jCheckBoxSeleccionadosDetalleLiquidacionImporItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleLiquidacionImpor")) {
					
				}
				
				


				
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
												
				
				


				
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImporActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
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
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
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
			
			


			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleLiquidacionImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleliquidacionimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleliquidacionimpor);
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
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
				
				


				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleLiquidacionImpor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleLiquidacionImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleLiquidacionImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleliquidacionimporAnterior =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleLiquidacionImpor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleLiquidacionImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleLiquidacionImpor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalleliquidacionimpor =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalleliquidacionimpor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleLiquidacionImpor")) {
				
				}
				
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleLiquidacionImpor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleLiquidacionImpor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleLiquidacionImpor")) {
			
			}
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleLiquidacionImpor();
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleLiquidacionImpor")) {
				jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleLiquidacionImpor")) {
				jButtonDuplicarDetalleLiquidacionImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleLiquidacionImpor")) {
				jButtonCopiarDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleLiquidacionImpor")) {
				jButtonVerFormDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleLiquidacionImpor")) {
				jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleLiquidacionImpor")) {
				jButtonModificarDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleLiquidacionImpor")) {
				jButtonActualizarDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleLiquidacionImpor")) {
				jButtonEliminarDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleLiquidacionImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleLiquidacionImpor")) {
				jButtonCancelarDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleLiquidacionImpor")) {
				jButtonCerrarDetalleLiquidacionImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleLiquidacionImpor")) {
				jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleLiquidacionImpor")) {
				jButtonNuevoGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleLiquidacionImpor")) {
				jButtonAbrirOrderByDetalleLiquidacionImporActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleLiquidacionImpor")) {
				jButtonRecargarInformacionDetalleLiquidacionImporActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleLiquidacionImpor")) {
				jButtonAnterioresDetalleLiquidacionImporActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleLiquidacionImpor")) {
				jButtonSiguientesDetalleLiquidacionImporActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleLiquidacionImporBusqueda")) {
				this.jButtonidDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_liquidacion_imporDetalleLiquidacionImporUpdate")) {
				this.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_liquidacion_imporDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_liquidacion_imporDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleLiquidacionImporUpdate")) {
				this.jButtonid_empresaDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_empresaDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleLiquidacionImporUpdate")) {
				this.jButtonid_sucursalDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_sucursalDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_usuarioDetalleLiquidacionImporUpdate")) {
				this.jButtonid_usuarioDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_usuarioDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_usuarioDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoDetalleLiquidacionImporUpdate")) {
				this.jButtonid_centro_costoDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_centro_costoDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_costo_gasto_imporDetalleLiquidacionImporUpdate")) {
				this.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_costo_gasto_imporDetalleLiquidacionImporBusqueda")) {
				this.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleLiquidacionImporBusqueda")) {
				this.jButtonvalorDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaDetalleLiquidacionImporBusqueda")) {
				this.jButtonfechaDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("referenciaDetalleLiquidacionImporBusqueda")) {
				this.jButtonreferenciaDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuestoDetalleLiquidacionImporBusqueda")) {
				this.jButtonimpuestoDetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuesto2DetalleLiquidacionImporBusqueda")) {
				this.jButtonimpuesto2DetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuesto3DetalleLiquidacionImporBusqueda")) {
				this.jButtonimpuesto3DetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuesto4DetalleLiquidacionImporBusqueda")) {
				this.jButtonimpuesto4DetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuesto5DetalleLiquidacionImporBusqueda")) {
				this.jButtonimpuesto5DetalleLiquidacionImporBusquedaActionPerformed(evt);
			}
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleLiquidacionImpor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleLiquidacionImpor")) {
				closingInternalFrameDetalleLiquidacionImpor();
				
			} else if(sTipo.equals("jButtonCancelarDetalleLiquidacionImpor")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleLiquidacionImpor = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleLiquidacionImporBeanSwingJInternalFrame jInternalFrameParent=(DetalleLiquidacionImporBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleLiquidacionImpor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleLiquidacionImporActionPerformed(null);
			}
			
			DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleliquidacionimpor,new Object(),this.detalleliquidacionimporParameterGeneral,this.detalleliquidacionimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleLiquidacionImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleLiquidacionImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleLiquidacionImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalleliquidacionimpor)) {
			if(!esControlTabla) {
				if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);			
				}
				
				if(this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleliquidacionimporReturnGeneral=detalleliquidacionimporLogic.procesarEventosDetalleLiquidacionImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors(),this.detalleliquidacionimpor,this.detalleliquidacionimporParameterGeneral,this.isEsNuevoDetalleLiquidacionImpor,classes);//this.detalleliquidacionimporLogic.getDetalleLiquidacionImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleLiquidacionImpor(this.detalleliquidacionimporReturnGeneral,this.detalleliquidacionimporBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleLiquidacionImpor(classes,this.detalleliquidacionimporReturnGeneral,this.detalleliquidacionimporBean,false);
					}
						
					if(this.detalleliquidacionimporReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleLiquidacionImpor(this.detalleliquidacionimporReturnGeneral.getDetalleLiquidacionImpor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleLiquidacionImpor(this.detalleliquidacionimporReturnGeneral.getDetalleLiquidacionImpor());	
					}
						
					if(this.detalleliquidacionimporReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleLiquidacionImpor(this.detalleliquidacionimporReturnGeneral.getDetalleLiquidacionImpor(),classes);//this.detalleliquidacionimporBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleLiquidacionImpor(this.detalleliquidacionimpor,classes);//this.detalleliquidacionimporBean);									
				}
			
				if(DetalleLiquidacionImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleLiquidacionImpor(this.detalleliquidacionimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleLiquidacionImpor(this.detalleliquidacionimpor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalleliquidacionimporAnterior!=null) {
						this.detalleliquidacionimpor=this.detalleliquidacionimporAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleliquidacionimporReturnGeneral=detalleliquidacionimporLogic.procesarEventosDetalleLiquidacionImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors(),this.detalleliquidacionimpor,this.detalleliquidacionimporParameterGeneral,this.isEsNuevoDetalleLiquidacionImpor,classes);//this.detalleliquidacionimporLogic.getDetalleLiquidacionImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalleliquidacionimporReturnGeneral.getDetalleLiquidacionImpor(),detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalleliquidacionimporReturnGeneral.getDetalleLiquidacionImpor(),this.detalleliquidacionimpors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleLiquidacionImpor.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleLiquidacionImpor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleLiquidacionImpor();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleLiquidacionImpor() throws Exception {
		
		DetalleLiquidacionImporModel detalleliquidacionimporModel=(DetalleLiquidacionImporModel)this.jTableDatosDetalleLiquidacionImpor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleliquidacionimporModel.detalleliquidacionimpors=this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalleliquidacionimporModel.detalleliquidacionimpors=this.detalleliquidacionimpors;
		}
		
		
		((DetalleLiquidacionImporModel) this.jTableDatosDetalleLiquidacionImpor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleLiquidacionImpor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalleliquidacionimporAnterior(),this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalleliquidacionimporAnterior(),this.detalleliquidacionimpors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleLiquidacionImpor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
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
										
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleliquidacionimpor,new Object(),generalEntityParameterGeneral,this.detalleliquidacionimporReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleLiquidacionImporConstantesFunciones.getClassesRelationshipsOfDetalleLiquidacionImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleLiquidacionImporConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleLiquidacionImpor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleLiquidacionImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleliquidacionimpor,new Object(),generalEntityParameterGeneral,this.detalleliquidacionimporReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleLiquidacionImpor(DetalleLiquidacionImporBean detalleliquidacionimporBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleLiquidacionImpor(ArrayList<Classe> classes,DetalleLiquidacionImporReturnGeneral detalleliquidacionimporReturnGeneral,DetalleLiquidacionImporBean detalleliquidacionimporBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalleliquidacionimpor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor = new DetalleLiquidacionImporDetalleFormJInternalFrame(jDesktopPane,this.detalleliquidacionimporSessionBean.getConGuardarRelaciones(),this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setVisible(false);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.detalleliquidacionimporLogic=this.detalleliquidacionimporLogic;
		
		this.cargarCombosFrameForeignKeyDetalleLiquidacionImpor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleLiquidacionImpor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleLiquidacionImpor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleLiquidacionImpor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleLiquidacionImpor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleLiquidacionImpor"));
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonModificarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ModificarDetalleLiquidacionImpor"));

		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonModificarToolBarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleLiquidacionImpor"));
					
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemModificarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleLiquidacionImpor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonActualizarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"ActualizarDetalleLiquidacionImpor"));
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonActualizarToolBarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleLiquidacionImpor"));
						
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemActualizarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleLiquidacionImpor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonEliminarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"EliminarDetalleLiquidacionImpor"));
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonEliminarToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleLiquidacionImpor"));
								
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemEliminarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleLiquidacionImpor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonCancelarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CancelarDetalleLiquidacionImpor"));
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonCancelarToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleLiquidacionImpor"));
					
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemCancelarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleLiquidacionImpor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemDetalleCerrarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleLiquidacionImpor"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleLiquidacionImpor"));
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleLiquidacionImpor"));
		
		
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleLiquidacionImpor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonidDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_liquidacion_imporDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_liquidacion_imporDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_empresaDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_empresaDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_sucursalDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_sucursalDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_usuarioDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_usuarioDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_centro_costoDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_centro_costoDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_costo_gasto_imporDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_costo_gasto_imporDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonvalorDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonfechaDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fechaDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonreferenciaDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"referenciaDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuestoDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuestoDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto2DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto2DetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto3DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto3DetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto4DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto4DetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto5DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto5DetalleLiquidacionImporBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTabbedPaneRelacionesDetalleLiquidacionImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleLiquidacionImpor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleLiquidacionImpor"));
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleLiquidacionImpor"));
		}
		
		this.jTableDatosDetalleLiquidacionImpor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleLiquidacionImpor"));
		
		this.jTableDatosDetalleLiquidacionImpor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleLiquidacionImpor"));
		
		this.jButtonNuevoDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"NuevoDetalleLiquidacionImpor"));
		
		this.jButtonDuplicarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"DuplicarDetalleLiquidacionImpor"));
		
		this.jButtonCopiarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"CopiarDetalleLiquidacionImpor"));
		
		this.jButtonVerFormDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"VerFormDetalleLiquidacionImpor"));
		
		
		this.jButtonNuevoToolBarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleLiquidacionImpor"));
			
		this.jButtonDuplicarToolBarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleLiquidacionImpor"));
			
		this.jMenuItemNuevoDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleLiquidacionImpor"));
			
		this.jMenuItemDuplicarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleLiquidacionImpor"));		
		
		
		this.jButtonNuevoRelacionesDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleLiquidacionImpor"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleLiquidacionImpor"));
			
		this.jMenuItemNuevoRelacionesDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleLiquidacionImpor"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonModificarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ModificarDetalleLiquidacionImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonModificarToolBarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleLiquidacionImpor"));
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemModificarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleLiquidacionImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonActualizarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"ActualizarDetalleLiquidacionImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonActualizarToolBarDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleLiquidacionImpor"));
				
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemActualizarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleLiquidacionImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonEliminarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"EliminarDetalleLiquidacionImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonEliminarToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleLiquidacionImpor"));
						
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemEliminarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleLiquidacionImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonCancelarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CancelarDetalleLiquidacionImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonCancelarToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleLiquidacionImpor"));
			
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemCancelarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleLiquidacionImpor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleLiquidacionImpor"));		
		
		
		this.jButtonCerrarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CerrarDetalleLiquidacionImpor"));
		
		
		this.jButtonCerrarToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleLiquidacionImpor"));
			
		this.jMenuItemCerrarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleLiquidacionImpor"));
			
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jMenuItemDetalleCerrarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleLiquidacionImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleLiquidacionImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleLiquidacionImpor"));
		}
		
		this.jButtonCopiarToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleLiquidacionImpor"));
			
		this.jButtonVerFormToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleLiquidacionImpor"));
		
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleLiquidacionImpor"));
			
		this.jMenuItemCopiarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleLiquidacionImpor"));		
		
		this.jMenuItemVerFormDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleLiquidacionImpor"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleLiquidacionImpor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleLiquidacionImpor"));
			
		this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleLiquidacionImpor"));		
		
		
		
		this.jButtonRecargarInformacionDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleLiquidacionImpor"));
					
		this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleLiquidacionImpor"));
		
		this.jMenuItemRecargarInformacionDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleLiquidacionImpor"));		
		
		
		
		this.jButtonAnterioresDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"AnterioresDetalleLiquidacionImpor"));
		
		
		this.jButtonAnterioresToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleLiquidacionImpor"));
		
		this.jMenuItemAnterioresDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleLiquidacionImpor"));		
		
		
		this.jButtonSiguientesDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"SiguientesDetalleLiquidacionImpor"));
		
		
		this.jButtonSiguientesToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleLiquidacionImpor"));
			
		this.jMenuItemSiguientesDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleLiquidacionImpor"));
			
		this.jMenuItemAbrirOrderByDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleLiquidacionImpor"));
			
		this.jMenuItemMostrarOcultarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleLiquidacionImpor"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleLiquidacionImpor"));
			
		this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleLiquidacionImpor"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleLiquidacionImpor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleLiquidacionImpor"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleLiquidacionImpor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleLiquidacionImpor"));

		this.jCheckBoxSeleccionadosDetalleLiquidacionImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleLiquidacionImpor"));
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleLiquidacionImpor"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleLiquidacionImpor"));
			
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleLiquidacionImpor"));
					
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleLiquidacionImpor"));
			
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleLiquidacionImpor"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonidDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_liquidacion_imporDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_liquidacion_imporDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_empresaDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_empresaDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_sucursalDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_sucursalDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_usuarioDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_usuarioDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_centro_costoDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_centro_costoDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_costo_gasto_imporDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_costo_gasto_imporDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonvalorDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonfechaDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fechaDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonreferenciaDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"referenciaDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuestoDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuestoDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto2DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto2DetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto3DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto3DetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto4DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto4DetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto5DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto5DetalleLiquidacionImporBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCentroCostoDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoDetalleLiquidacionImpor"));

			this.jButtonFK_IdCostoGastoImporDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdCostoGastoImporDetalleLiquidacionImpor"));

			this.jButtonFK_IdLiquidacionImporDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdLiquidacionImporDetalleLiquidacionImpor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor!=null) {
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleLiquidacionImpor"));
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleLiquidacionImpor"));
				this.jInternalFrameReporteDinamicoDetalleLiquidacionImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleLiquidacionImpor"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleLiquidacionImpor"));				
			//this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleLiquidacionImpor"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleLiquidacionImpor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleLiquidacionImpor!=null) {
				this.jInternalFrameImportacionDetalleLiquidacionImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleLiquidacionImpor"));
				this.jInternalFrameImportacionDetalleLiquidacionImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleLiquidacionImpor"));
				this.jInternalFrameImportacionDetalleLiquidacionImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleLiquidacionImpor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleLiquidacionImpor"));
			
			this.jButtonAbrirOrderByToolBarDetalleLiquidacionImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleLiquidacionImpor"));			
			
			if(this.jInternalFrameOrderByDetalleLiquidacionImpor!=null) {
				this.jInternalFrameOrderByDetalleLiquidacionImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleLiquidacionImpor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTabbedPaneRelacionesDetalleLiquidacionImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleLiquidacionImpor"));
		
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
            		closingInternalFrameDetalleLiquidacionImpor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleLiquidacionImpor = (JInternalFrameBase)event.getSource();
	            	
	            DetalleLiquidacionImporBeanSwingJInternalFrame jInternalFrameParent=(DetalleLiquidacionImporBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleLiquidacionImpor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleLiquidacionImporActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleLiquidacionImpor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleLiquidacionImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleLiquidacionImpor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleLiquidacionImpor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleLiquidacionImpor";
		inputMap = this.jButtonNuevoDetalleLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleLiquidacionImpor";
		inputMap = this.jButtonNuevoRelacionesDetalleLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleLiquidacionImporActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleLiquidacionImpor";
		inputMap = this.jButtonModificarDetalleLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleLiquidacionImpor";
		inputMap = this.jButtonActualizarDetalleLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleLiquidacionImpor";
		inputMap = this.jButtonEliminarDetalleLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleLiquidacionImpor";
		inputMap = this.jButtonCancelarDetalleLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleLiquidacionImpor";
		inputMap = this.jButtonCerrarDetalleLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleLiquidacionImpor";
		inputMap = this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosDetalleLiquidacionImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonGuardarCambiosDetalleLiquidacionImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleLiquidacionImpor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleLiquidacionImporItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleLiquidacionImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleLiquidacionImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleLiquidacionImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleLiquidacionImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleLiquidacionImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonidDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_liquidacion_imporDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_liquidacion_imporDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_empresaDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_empresaDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_sucursalDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_sucursalDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_usuarioDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_usuarioDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_usuarioDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_centro_costoDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_centro_costoDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoDetalleLiquidacionImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate.addActionListener(new ButtonActionListener(this,"id_costo_gasto_imporDetalleLiquidacionImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"id_costo_gasto_imporDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonvalorDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonfechaDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"fechaDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonreferenciaDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"referenciaDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuestoDetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuestoDetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto2DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto2DetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto3DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto3DetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto4DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto4DetalleLiquidacionImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jButtonimpuesto5DetalleLiquidacionImporBusqueda.addActionListener(new ButtonActionListener(this,"impuesto5DetalleLiquidacionImporBusqueda"));
		
		
		this.jButtonFK_IdCentroCostoDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoDetalleLiquidacionImpor"));

		this.jButtonFK_IdCostoGastoImporDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdCostoGastoImporDetalleLiquidacionImpor"));

		this.jButtonFK_IdLiquidacionImporDetalleLiquidacionImpor.addActionListener(new ButtonActionListener(this,"FK_IdLiquidacionImporDetalleLiquidacionImpor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleLiquidacionImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleLiquidacionImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleLiquidacionImporActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleLiquidacionImpor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleLiquidacionImpor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
					detalleliquidacionimporAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimpors) {
					detalleliquidacionimporAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleLiquidacionImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
						detalleliquidacionimporAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimpors) {
						detalleliquidacionimporAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimpors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleLiquidacionImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleLiquidacionImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleLiquidacionImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleLiquidacionImpor.getSelectedRows();
			
			DetalleLiquidacionImpor detalleliquidacionimporLocal=new DetalleLiquidacionImpor();
			
			//this.seleccionarTodosDetalleLiquidacionImpor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleliquidacionimporLocal =(DetalleLiquidacionImpor) this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors().toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalleliquidacionimporLocal =(DetalleLiquidacionImpor) this.detalleliquidacionimpors.toArray()[this.jTableDatosDetalleLiquidacionImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalleliquidacionimporLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
						detalleliquidacionimporAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimpors) {
						detalleliquidacionimporAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleLiquidacionImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleLiquidacionImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleLiquidacionImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleLiquidacionImporItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleLiquidacionImporParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleLiquidacionImporActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleLiquidacionImpor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
				
						if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detalleliquidacionimporAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							detalleliquidacionimporAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA)) {
							existe=true;
							detalleliquidacionimporAux.setreferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO)) {
							existe=true;
							detalleliquidacionimporAux.setimpuesto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2)) {
							existe=true;
							detalleliquidacionimporAux.setimpuesto2(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3)) {
							existe=true;
							detalleliquidacionimporAux.setimpuesto3(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4)) {
							existe=true;
							detalleliquidacionimporAux.setimpuesto4(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5)) {
							existe=true;
							detalleliquidacionimporAux.setimpuesto5(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimpors) {
					
						if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detalleliquidacionimporAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							detalleliquidacionimporAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA)) {
							existe=true;
							detalleliquidacionimporAux.setreferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO)) {
							existe=true;
							detalleliquidacionimporAux.setimpuesto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2)) {
							existe=true;
							detalleliquidacionimporAux.setimpuesto2(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3)) {
							existe=true;
							detalleliquidacionimporAux.setimpuesto3(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4)) {
							existe=true;
							detalleliquidacionimporAux.setimpuesto4(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5)) {
							existe=true;
							detalleliquidacionimporAux.setimpuesto5(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleLiquidacionImporActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleLiquidacionImpor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleLiquidacionImpor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleLiquidacionImpor) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleLiquidacionImpor(conSplash);
				
					this.generarReporteDetalleLiquidacionImporsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleLiquidacionImporsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleLiquidacionImporsSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleLiquidacionImporsSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleLiquidacionImpor();
				
				this.exportarDetalleLiquidacionImporsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleLiquidacionImpors();
				//this.importarDetalleLiquidacionImpors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleLiquidacionImpor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleLiquidacionImporsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Liquidacion Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleLiquidacionImpor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleLiquidacionImpor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleLiquidacionImpor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleLiquidacionImporBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleLiquidacionImpor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleLiquidacionImpor(conSplash);
					
						//this.actualizarParametrosGeneralDetalleLiquidacionImpor();
						
						this.generarReporteProcesoAccionDetalleLiquidacionImporsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Liquidacion ImporES SELECCIONADOS?", "MANTENIMIENTO DE Detalle Liquidacion Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleLiquidacionImpor();
				
						this.actualizarParametrosGeneralDetalleLiquidacionImpor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalleliquidacionimporReturnGeneral=detalleliquidacionimporLogic.procesarAccionDetalleLiquidacionImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors(),this.detalleliquidacionimporParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleLiquidacionImporReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleLiquidacionImpor();
					
					DetalleLiquidacionImporBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleLiquidacionImporReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleLiquidacionImpor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleLiquidacionImporActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleLiquidacionImpor();
			
			if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();		
			DetalleLiquidacionImpor detalleliquidacionimpor=new DetalleLiquidacionImpor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleLiquidacionImpor.getSelectedItem();
			
			
			
			
			detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalleliquidacionimporsSeleccionados.size()==1) {
				for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimporsSeleccionados) {
					detalleliquidacionimpor=detalleliquidacionimporAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleLiquidacionImpor();
			
      		//this.finishProcessDetalleLiquidacionImpor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleLiquidacionImporReturnGeneral() throws Exception {
		if(this.detalleliquidacionimporReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalleliquidacionimporReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalleliquidacionimporReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalleliquidacionimporReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalleliquidacionimporReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalleliquidacionimporReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
		}
		
		if(this.detalleliquidacionimporReturnGeneral.getConRetornoLista() || this.detalleliquidacionimporReturnGeneral.getConRetornoObjeto()) {
			if(this.detalleliquidacionimporReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleliquidacionimporLogic.setDetalleLiquidacionImpors(this.detalleliquidacionimporReturnGeneral.getDetalleLiquidacionImpors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalleliquidacionimporReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleliquidacionimporLogic.setDetalleLiquidacionImpor(this.detalleliquidacionimporReturnGeneral.getDetalleLiquidacionImpor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleLiquidacionImpor(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleLiquidacionImpor() throws Exception {
		
		
	}
	
	public ArrayList<DetalleLiquidacionImpor> getDetalleLiquidacionImporsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleLiquidacionImpor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimporLogic.getDetalleLiquidacionImpors()) {
					if(detalleliquidacionimporAux.getIsSelected()) {
						detalleliquidacionimporsSeleccionados.add(detalleliquidacionimporAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleLiquidacionImpor detalleliquidacionimporAux:this.detalleliquidacionimpors) {
					if(detalleliquidacionimporAux.getIsSelected()) {
						detalleliquidacionimporsSeleccionados.add(detalleliquidacionimporAux);				
					}
				}
			}
			
			if(detalleliquidacionimporsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalleliquidacionimporsSeleccionados.addAll(this.detalleliquidacionimporLogic.getDetalleLiquidacionImpors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalleliquidacionimporsSeleccionados.addAll(this.detalleliquidacionimpors);				
					}
				}
			}
		} else {
			detalleliquidacionimporsSeleccionados.add(this.detalleliquidacionimpor);
		}
		
		return detalleliquidacionimporsSeleccionados;
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
	
	public void generarReporteDetalleLiquidacionImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleLiquidacionImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleLiquidacionImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleLiquidacionImporsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleLiquidacionImporsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Liquidacion Impor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();		
		
		detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleLiquidacionImpors("Todos",detalleliquidacionimporsSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();		
		
		detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleLiquidacionImpors("Todos",detalleliquidacionimporsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleLiquidacionImporsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();
		
		detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleLiquidacionImpors("Todos",detalleliquidacionimporsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleLiquidacionImpor();
		
		
		detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleLiquidacionImpor();
		
		
		//this.generarReporteDetalleLiquidacionImpors("Todos",detalleliquidacionimporsSeleccionados ,detalleliquidacionimporImplementable,detalleliquidacionimporImplementableHome);
	}
	
	public void mostrarImportacionDetalleLiquidacionImpors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleLiquidacionImpor();
		
		this.abrirFrameImportacionDetalleLiquidacionImpor();		
		
			
		//this.generarReporteDetalleLiquidacionImpors("Todos",detalleliquidacionimporsSeleccionados ,detalleliquidacionimporImplementable,detalleliquidacionimporImplementableHome);
	}
	
	public void importarDetalleLiquidacionImpors() throws Exception {		
	
	}
	
	public void exportarDetalleLiquidacionImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleLiquidacionImporsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleLiquidacionImporsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleLiquidacionImporsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Liquidacion Impor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();		
		
		detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleLiquidacionImpor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimporsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleLiquidacionImpor(detalleliquidacionimporAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalleliquidacionimporAux.setsDetalleGeneralEntityReporte(detalleliquidacionimporAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleLiquidacionImpor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalleliquidacionimpor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getliquidacionimpor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getusuario_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getcentrocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getcostogastoimpor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getreferencia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getimpuesto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getimpuesto2().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getimpuesto3().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getimpuesto4().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleliquidacionimpor.getimpuesto5().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();		
		
		detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleLiquidacionImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleLiquidacionImpor(row);				
				iRow++;
			}				
			
			for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimporsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleLiquidacionImpor(detalleliquidacionimporAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleLiquidacionImporsSeleccionados() throws Exception {
		ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();		
		
		detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleliquidacionimpor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalleliquidacionimpors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalleliquidacionimpor");
			//elementRoot.appendChild(element);
		
			for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimporsSeleccionados) {
				element = document.createElement("detalleliquidacionimpor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleLiquidacionImpor(detalleliquidacionimporAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Liquidacion Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleLiquidacionImpor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getliquidacionimpor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getusuario_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getcentrocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getcostogastoimpor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getreferencia());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getimpuesto());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getimpuesto2());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getimpuesto3());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getimpuesto4());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleliquidacionimpor.getimpuesto5());				
	}
	
	public void setFilaDatosExportarXmlDetalleLiquidacionImpor(DetalleLiquidacionImpor detalleliquidacionimpor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleLiquidacionImporConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalleliquidacionimpor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleLiquidacionImporConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalleliquidacionimpor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementliquidacionimpor_descripcion = document.createElement(DetalleLiquidacionImporConstantesFunciones.IDLIQUIDACIONIMPOR);
		elementliquidacionimpor_descripcion.appendChild(document.createTextNode(detalleliquidacionimpor.getliquidacionimpor_descripcion()));
		element.appendChild(elementliquidacionimpor_descripcion);

		Element elementempresa_descripcion = document.createElement(DetalleLiquidacionImporConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalleliquidacionimpor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleLiquidacionImporConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detalleliquidacionimpor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementusuario_descripcion = document.createElement(DetalleLiquidacionImporConstantesFunciones.IDUSUARIO);
		elementusuario_descripcion.appendChild(document.createTextNode(detalleliquidacionimpor.getusuario_descripcion()));
		element.appendChild(elementusuario_descripcion);

		Element elementcentrocosto_descripcion = document.createElement(DetalleLiquidacionImporConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(detalleliquidacionimpor.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);

		Element elementcostogastoimpor_descripcion = document.createElement(DetalleLiquidacionImporConstantesFunciones.IDCOSTOGASTOIMPOR);
		elementcostogastoimpor_descripcion.appendChild(document.createTextNode(detalleliquidacionimpor.getcostogastoimpor_descripcion()));
		element.appendChild(elementcostogastoimpor_descripcion);

		Element elementvalor = document.createElement(DetalleLiquidacionImporConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(detalleliquidacionimpor.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementfecha = document.createElement(DetalleLiquidacionImporConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(detalleliquidacionimpor.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementreferencia = document.createElement(DetalleLiquidacionImporConstantesFunciones.REFERENCIA);
		elementreferencia.appendChild(document.createTextNode(detalleliquidacionimpor.getreferencia().trim()));
		element.appendChild(elementreferencia);

		Element elementimpuesto = document.createElement(DetalleLiquidacionImporConstantesFunciones.IMPUESTO);
		elementimpuesto.appendChild(document.createTextNode(detalleliquidacionimpor.getimpuesto().toString().trim()));
		element.appendChild(elementimpuesto);

		Element elementimpuesto2 = document.createElement(DetalleLiquidacionImporConstantesFunciones.IMPUESTO2);
		elementimpuesto2.appendChild(document.createTextNode(detalleliquidacionimpor.getimpuesto2().toString().trim()));
		element.appendChild(elementimpuesto2);

		Element elementimpuesto3 = document.createElement(DetalleLiquidacionImporConstantesFunciones.IMPUESTO3);
		elementimpuesto3.appendChild(document.createTextNode(detalleliquidacionimpor.getimpuesto3().toString().trim()));
		element.appendChild(elementimpuesto3);

		Element elementimpuesto4 = document.createElement(DetalleLiquidacionImporConstantesFunciones.IMPUESTO4);
		elementimpuesto4.appendChild(document.createTextNode(detalleliquidacionimpor.getimpuesto4().toString().trim()));
		element.appendChild(elementimpuesto4);

		Element elementimpuesto5 = document.createElement(DetalleLiquidacionImporConstantesFunciones.IMPUESTO5);
		elementimpuesto5.appendChild(document.createTextNode(detalleliquidacionimpor.getimpuesto5().toString().trim()));
		element.appendChild(elementimpuesto5);
	}
	
	public void generarReporteGroupGenericoDetalleLiquidacionImporsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados=new ArrayList<DetalleLiquidacionImpor>();
		
		detalleliquidacionimporsSeleccionados=this.getDetalleLiquidacionImporsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleLiquidacionImpor(detalleliquidacionimporsSeleccionados);
		
		this.generarReporteDetalleLiquidacionImpors("Todos",detalleliquidacionimporsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleLiquidacionImpor(ArrayList<DetalleLiquidacionImpor> detalleliquidacionimporsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleLiquidacionImpor detalleliquidacionimporAux:detalleliquidacionimporsSeleccionados) {
				detalleliquidacionimporAux.setsDetalleGeneralEntityReporte(detalleliquidacionimporAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR)) {
					existe=true;
					detalleliquidacionimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimporAux.getliquidacionimpor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalleliquidacionimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimporAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detalleliquidacionimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimporAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO)) {
					existe=true;
					detalleliquidacionimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimporAux.getusuario_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					detalleliquidacionimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimporAux.getcentrocosto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR)) {
					existe=true;
					detalleliquidacionimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimporAux.getcostogastoimpor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					detalleliquidacionimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(detalleliquidacionimporAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA)) {
					existe=true;
					detalleliquidacionimporAux.setsDescripcionGeneralEntityReporte1(detalleliquidacionimporAux.getreferencia());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleLiquidacionImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleLiquidacionImpor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaModificarDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaCancelarDetalleLiquidacionImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleLiquidacionImpor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleLiquidacionImporJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=true;
		} else {
			this.actualizarEstadoPanelsDetalleLiquidacionImpor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleLiquidacionImpor=false;
			//this.isVisibilidadCeldaVerFormDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaDuplicarDetalleLiquidacionImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleLiquidacionImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
			if(!detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=false;												
			}
			
			this.jButtonCerrarDetalleLiquidacionImpor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleLiquidacionImpor=false;
		}
		
		if(!this.permiteMantenimiento(this.detalleliquidacionimpor)) {
			this.isVisibilidadCeldaActualizarDetalleLiquidacionImpor=false;
			this.isVisibilidadCeldaEliminarDetalleLiquidacionImpor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleLiquidacionImpor() {
	}
	
	public void actualizarEstadoPanelsDetalleLiquidacionImpor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleLiquidacionImpor!=null) {
				this.jScrollPanelDatosDetalleLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleLiquidacionImpor!=null) {
				this.jPanelPaginacionDetalleLiquidacionImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor!=null) {
					this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor!=null) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleLiquidacionImpor!=null) {
				this.jPanelParametrosReportesDetalleLiquidacionImpor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaLiquidacionImpor(Boolean isParaLiquidacionImpor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLiquidacionImporNegation=!isParaLiquidacionImpor;

			this.isVisibilidadFK_IdCentroCosto=isParaLiquidacionImporNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCentroCostoDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdCostoGastoImpor=isParaLiquidacionImporNegation;
			if(!this.isVisibilidadFK_IdCostoGastoImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdLiquidacionImpor=isParaLiquidacionImpor;
			if(!this.isVisibilidadFK_IdLiquidacionImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCentroCosto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCentroCostoDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdCostoGastoImpor=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCostoGastoImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdLiquidacionImpor=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdLiquidacionImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCentroCosto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCentroCostoDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdCostoGastoImpor=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCostoGastoImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdLiquidacionImpor=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdLiquidacionImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaUsuario(Boolean isParaUsuario){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUsuarioNegation=!isParaUsuario;

			this.isVisibilidadFK_IdCentroCosto=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCentroCostoDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdCostoGastoImpor=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdCostoGastoImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdLiquidacionImpor=isParaUsuarioNegation;
			if(!this.isVisibilidadFK_IdLiquidacionImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadFK_IdCentroCosto=isParaCentroCosto;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCentroCostoDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdCostoGastoImpor=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdCostoGastoImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdLiquidacionImpor=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdLiquidacionImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaCostoGastoImpor(Boolean isParaCostoGastoImpor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCostoGastoImporNegation=!isParaCostoGastoImpor;

			this.isVisibilidadFK_IdCentroCosto=isParaCostoGastoImporNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCentroCostoDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdCostoGastoImpor=isParaCostoGastoImpor;
			if(!this.isVisibilidadFK_IdCostoGastoImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor);}

			this.isVisibilidadFK_IdLiquidacionImpor=isParaCostoGastoImporNegation;
			if(!this.isVisibilidadFK_IdLiquidacionImpor) {this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleLiquidacionImporSessionBean detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
		
		if(this.detalleliquidacionimporSessionBean==null) {
			this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
		}
		
		this.detalleliquidacionimporSessionBean.setsUltimaBusquedaDetalleLiquidacionImpor(this.getsAccionBusqueda());
		this.detalleliquidacionimporSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalleliquidacionimporSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
			detalleliquidacionimporSessionBean.setid_centro_costo(this.getid_centro_costoFK_IdCentroCosto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCostoGastoImpor")) {
			detalleliquidacionimporSessionBean.setid_costo_gasto_impor(this.getid_costo_gasto_imporFK_IdCostoGastoImpor());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalleliquidacionimporSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLiquidacionImpor")) {
			detalleliquidacionimporSessionBean.setid_liquidacion_impor(this.getid_liquidacion_imporFK_IdLiquidacionImpor());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detalleliquidacionimporSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
			detalleliquidacionimporSessionBean.setid_usuario(this.getid_usuarioFK_IdUsuario());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleLiquidacionImporSessionBean detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
		
		if(this.detalleliquidacionimporSessionBean==null) {
			this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
		}
		
		if(this.detalleliquidacionimporSessionBean.getsUltimaBusquedaDetalleLiquidacionImpor()!=null&&!this.detalleliquidacionimporSessionBean.getsUltimaBusquedaDetalleLiquidacionImpor().equals("")) {
			this.setsAccionBusqueda(detalleliquidacionimporSessionBean.getsUltimaBusquedaDetalleLiquidacionImpor());
			this.setiNumeroPaginacion(detalleliquidacionimporSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalleliquidacionimporSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
				this.setid_centro_costoFK_IdCentroCosto(detalleliquidacionimporSessionBean.getid_centro_costo());
				detalleliquidacionimporSessionBean.setid_centro_costo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCostoGastoImpor")) {
				this.setid_costo_gasto_imporFK_IdCostoGastoImpor(detalleliquidacionimporSessionBean.getid_costo_gasto_impor());
				detalleliquidacionimporSessionBean.setid_costo_gasto_impor(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalleliquidacionimporSessionBean.getid_empresa());
				detalleliquidacionimporSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLiquidacionImpor")) {
				this.setid_liquidacion_imporFK_IdLiquidacionImpor(detalleliquidacionimporSessionBean.getid_liquidacion_impor());
				detalleliquidacionimporSessionBean.setid_liquidacion_impor(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detalleliquidacionimporSessionBean.getid_sucursal());
				detalleliquidacionimporSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUsuario")) {
				this.setid_usuarioFK_IdUsuario(detalleliquidacionimporSessionBean.getid_usuario());
				detalleliquidacionimporSessionBean.setid_usuario(-1L);
			}
		}
		
		this.detalleliquidacionimporSessionBean.setsUltimaBusquedaDetalleLiquidacionImpor("");
		this.detalleliquidacionimporSessionBean.setiNumeroPaginacion(DetalleLiquidacionImporConstantesFunciones.INUMEROPAGINACION);
		this.detalleliquidacionimporSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleLiquidacionImpor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleLiquidacionImpor() {
		this.updateBorderResaltarBusquedasFormularioDetalleLiquidacionImpor();
		this.updateVisibilidadBusquedasFormularioDetalleLiquidacionImpor();
		this.updateHabilitarBusquedasFormularioDetalleLiquidacionImpor();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleLiquidacionImpor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponents().length>0) {
	

		if(this.detalleliquidacionimporConstantesFunciones.resaltarFK_IdCentroCostoDetalleLiquidacionImpor!=null) {
			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCentroCostoDetalleLiquidacionImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);
				jPanel.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarFK_IdCentroCostoDetalleLiquidacionImpor);
			}
		}

		if(this.detalleliquidacionimporConstantesFunciones.resaltarFK_IdCostoGastoImporDetalleLiquidacionImpor!=null) {
			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);
				jPanel.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarFK_IdCostoGastoImporDetalleLiquidacionImpor);
			}
		}

		if(this.detalleliquidacionimporConstantesFunciones.resaltarFK_IdLiquidacionImporDetalleLiquidacionImpor!=null) {
			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);
				jPanel.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarFK_IdLiquidacionImporDetalleLiquidacionImpor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleLiquidacionImpor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCentroCostoDetalleLiquidacionImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarFK_IdCentroCostoDetalleLiquidacionImpor);
			if(!this.detalleliquidacionimporConstantesFunciones.mostrarFK_IdCentroCostoDetalleLiquidacionImpor && index>-1) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarFK_IdCostoGastoImporDetalleLiquidacionImpor);
			if(!this.detalleliquidacionimporConstantesFunciones.mostrarFK_IdCostoGastoImporDetalleLiquidacionImpor && index>-1) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarFK_IdLiquidacionImporDetalleLiquidacionImpor);
			if(!this.detalleliquidacionimporConstantesFunciones.mostrarFK_IdLiquidacionImporDetalleLiquidacionImpor && index>-1) {
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleLiquidacionImpor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCentroCostoDetalleLiquidacionImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarFK_IdCentroCostoDetalleLiquidacionImpor);
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setEnabledAt(index,this.detalleliquidacionimporConstantesFunciones.activarFK_IdCentroCostoDetalleLiquidacionImpor);
			}

			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarFK_IdCostoGastoImporDetalleLiquidacionImpor);
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setEnabledAt(index,this.detalleliquidacionimporConstantesFunciones.activarFK_IdCostoGastoImporDetalleLiquidacionImpor);
			}

			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarFK_IdLiquidacionImporDetalleLiquidacionImpor);
				this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setEnabledAt(index,this.detalleliquidacionimporConstantesFunciones.activarFK_IdLiquidacionImporDetalleLiquidacionImpor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleLiquidacionImpor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCentroCosto")) {
			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCentroCostoDetalleLiquidacionImpor);

			this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);

			this.detalleliquidacionimporConstantesFunciones.setResaltarFK_IdCentroCostoDetalleLiquidacionImpor(resaltar);

			jPanel.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarFK_IdCentroCostoDetalleLiquidacionImpor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCostoGastoImpor")) {
			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdCostoGastoImporDetalleLiquidacionImpor);

			this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);

			this.detalleliquidacionimporConstantesFunciones.setResaltarFK_IdCostoGastoImporDetalleLiquidacionImpor(resaltar);

			jPanel.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarFK_IdCostoGastoImporDetalleLiquidacionImpor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdLiquidacionImpor")) {
			index= this.jTabbedPaneBusquedasDetalleLiquidacionImpor.indexOfComponent(this.jPanelFK_IdLiquidacionImporDetalleLiquidacionImpor);

			this.jTabbedPaneBusquedasDetalleLiquidacionImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleLiquidacionImpor.getComponent(index);

			this.detalleliquidacionimporConstantesFunciones.setResaltarFK_IdLiquidacionImporDetalleLiquidacionImpor(resaltar);

			jPanel.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarFK_IdLiquidacionImporDetalleLiquidacionImpor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleLiquidacionImpor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleLiquidacionImpor() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleLiquidacionImpor();
		this.updateVisibilidadResaltarControlesFormularioDetalleLiquidacionImpor();
		this.updateHabilitarResaltarControlesFormularioDetalleLiquidacionImpor();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleLiquidacionImpor() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalleliquidacionimporConstantesFunciones.resaltaridDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelidDetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltaridDetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarid_liquidacion_imporDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarid_liquidacion_imporDetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarid_empresaDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarid_empresaDetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarid_sucursalDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarid_sucursalDetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarid_usuarioDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarid_usuarioDetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarid_centro_costoDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarid_centro_costoDetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarid_costo_gasto_imporDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarid_costo_gasto_imporDetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarvalorDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldvalorDetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarvalorDetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarfechaDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jDateChooserfechaDetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarfechaDetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarreferenciaDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldreferenciaDetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarreferenciaDetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarimpuestoDetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuestoDetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarimpuestoDetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto2DetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto2DetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto2DetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto3DetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto3DetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto3DetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto4DetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto4DetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto4DetalleLiquidacionImpor);}
		if(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto5DetalleLiquidacionImpor!=null && this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto5DetalleLiquidacionImpor.setBorder(this.detalleliquidacionimporConstantesFunciones.resaltarimpuesto5DetalleLiquidacionImpor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleLiquidacionImpor() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
	
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelidDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostraridDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelidDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostraridDetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_liquidacion_imporDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelid_liquidacion_imporDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_liquidacion_imporDetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_empresaDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelid_empresaDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_empresaDetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_sucursalDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelid_sucursalDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_sucursalDetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_usuarioDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelid_usuarioDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_usuarioDetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_centro_costoDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelid_centro_costoDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_centro_costoDetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_costo_gasto_imporDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelid_costo_gasto_imporDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarid_costo_gasto_imporDetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldvalorDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarvalorDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelvalorDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarvalorDetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jDateChooserfechaDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarfechaDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelfechaDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarfechaDetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldreferenciaDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarreferenciaDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelreferenciaDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarreferenciaDetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuestoDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarimpuestoDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelimpuestoDetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarimpuestoDetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto2DetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto2DetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelimpuesto2DetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto2DetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto3DetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto3DetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelimpuesto3DetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto3DetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto4DetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto4DetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelimpuesto4DetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto4DetalleLiquidacionImpor);
		//this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto5DetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto5DetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jPanelimpuesto5DetalleLiquidacionImpor.setVisible(this.detalleliquidacionimporConstantesFunciones.mostrarimpuesto5DetalleLiquidacionImpor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleLiquidacionImpor() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleLiquidacionImpor!=null) {
	
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jLabelidDetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activaridDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarid_liquidacion_imporDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_empresaDetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarid_empresaDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_sucursalDetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarid_sucursalDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_usuarioDetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarid_usuarioDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_centro_costoDetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarid_centro_costoDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarid_costo_gasto_imporDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldvalorDetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarvalorDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jDateChooserfechaDetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarfechaDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldreferenciaDetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarreferenciaDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuestoDetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarimpuestoDetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto2DetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarimpuesto2DetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto3DetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarimpuesto3DetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto4DetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarimpuesto4DetalleLiquidacionImpor);
		this.jInternalFrameDetalleFormDetalleLiquidacionImpor.jTextFieldimpuesto5DetalleLiquidacionImpor.setEnabled(this.detalleliquidacionimporConstantesFunciones.activarimpuesto5DetalleLiquidacionImpor);
		}
	}
	
		
}