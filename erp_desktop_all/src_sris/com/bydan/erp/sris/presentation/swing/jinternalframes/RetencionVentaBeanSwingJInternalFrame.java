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
package com.bydan.erp.sris.presentation.swing.jinternalframes;




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

import com.bydan.erp.sris.util.RetencionVentaConstantesFunciones;
import com.bydan.erp.sris.util.RetencionVentaParameterReturnGeneral;
//import com.bydan.erp.sris.util.RetencionVentaParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.RetencionVentaBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.sris.resources.reportes.AuxiliarReportes;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

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
public class RetencionVentaBeanSwingJInternalFrame extends RetencionVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RetencionVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RetencionVenta> retencionventaValidator = new ClassValidator<RetencionVenta>(RetencionVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RetencionVenta retencionventa;	
	public RetencionVenta retencionventaAux;
	public RetencionVenta retencionventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RetencionVenta retencionventaTotales;
	public Long idRetencionVentaActual;
	public Long iIdNuevoRetencionVenta=0L;
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

	public String sFinalQueryComboPeriodoDeclara="";

	public List<PeriodoDeclara> periododeclarasForeignKey;

	public List<PeriodoDeclara> getperiododeclarasForeignKey() {
		return periododeclarasForeignKey;
	}

	public void setperiododeclarasForeignKey(List<PeriodoDeclara> periododeclarasForeignKey) {
		this.periododeclarasForeignKey = periododeclarasForeignKey;
	}

	//OBJETO FK ACTUAL
	public PeriodoDeclara periododeclaraForeignKey;

	public PeriodoDeclara getperiododeclaraForeignKey() {
		return periododeclaraForeignKey;
	}

	public void setperiododeclaraForeignKey(PeriodoDeclara periododeclaraForeignKey) {
		this.periododeclaraForeignKey = periododeclaraForeignKey;
	}

	public String sFinalQueryComboTipoRetencion="";

	public List<TipoRetencion> tiporetencionsForeignKey;

	public List<TipoRetencion> gettiporetencionsForeignKey() {
		return tiporetencionsForeignKey;
	}

	public void settiporetencionsForeignKey(List<TipoRetencion> tiporetencionsForeignKey) {
		this.tiporetencionsForeignKey = tiporetencionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRetencion tiporetencionForeignKey;

	public TipoRetencion gettiporetencionForeignKey() {
		return tiporetencionForeignKey;
	}

	public void settiporetencionForeignKey(TipoRetencion tiporetencionForeignKey) {
		this.tiporetencionForeignKey = tiporetencionForeignKey;
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
	
	public Boolean isPermisoTodoRetencionVenta;
	public Boolean isPermisoNuevoRetencionVenta;
	public Boolean isPermisoActualizarRetencionVenta;
	public Boolean isPermisoActualizarOriginalRetencionVenta;
	public Boolean isPermisoEliminarRetencionVenta;
	public Boolean isPermisoGuardarCambiosRetencionVenta;
	public Boolean isPermisoConsultaRetencionVenta;
	public Boolean isPermisoBusquedaRetencionVenta;
	public Boolean isPermisoReporteRetencionVenta;
	public Boolean isPermisoPaginacionMedioRetencionVenta;
	public Boolean isPermisoPaginacionAltoRetencionVenta;
	public Boolean isPermisoPaginacionTodoRetencionVenta;
	public Boolean isPermisoCopiarRetencionVenta;
	public Boolean isPermisoVerFormRetencionVenta;
	public Boolean isPermisoDuplicarRetencionVenta;
	public Boolean isPermisoOrdenRetencionVenta;
	
	
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
	
	public RetencionVentaParameterReturnGeneral retencionventaReturnGeneral;
	public RetencionVentaParameterReturnGeneral retencionventaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRetencionVenta=false;
	public Boolean esParaAccionDesdeFormularioRetencionVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RetencionVentaSessionBeanAdditional retencionventaSessionBeanAdditional=null;
	
	public RetencionVentaSessionBeanAdditional getRetencionVentaSessionBeanAdditional() {
		return this.retencionventaSessionBeanAdditional;
	}
	
	public void setRetencionVentaSessionBeanAdditional(RetencionVentaSessionBeanAdditional retencionventaSessionBeanAdditional) {
		try {
			this.retencionventaSessionBeanAdditional=retencionventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RetencionVentaBeanSwingJInternalFrameAdditional retencionventaBeanSwingJInternalFrameAdditional=null;
	//public class RetencionVentaBeanSwingJInternalFrame
	
	public RetencionVentaBeanSwingJInternalFrameAdditional getRetencionVentaBeanSwingJInternalFrameAdditional() {
		return this.retencionventaBeanSwingJInternalFrameAdditional;
	}
	
	public void setRetencionVentaBeanSwingJInternalFrameAdditional(RetencionVentaBeanSwingJInternalFrameAdditional retencionventaBeanSwingJInternalFrameAdditional) {
		try {
			this.retencionventaBeanSwingJInternalFrameAdditional=retencionventaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RetencionVentaLogic retencionventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RetencionVenta retencionventaBean;
	public RetencionVentaConstantesFunciones retencionventaConstantesFunciones;
	//public RetencionVentaParameterReturnGeneral retencionventaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public PeriodoDeclaraLogic periododeclaraLogic;
	public TipoRetencionLogic tiporetencionLogic;
	
	//PARAMETROS
	
	
	//public List<RetencionVenta> retencionventas;	
	//public List<RetencionVenta> retencionventasEliminados;
	//public List<RetencionVenta> retencionventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRetencionVenta=false;
	public Boolean isVisibilidadCeldaDuplicarRetencionVenta=true;
	public Boolean isVisibilidadCeldaCopiarRetencionVenta=true;
	public Boolean isVisibilidadCeldaVerFormRetencionVenta=true;
	public Boolean isVisibilidadCeldaOrdenRetencionVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRetencionVenta=false;
	public Boolean isVisibilidadCeldaModificarRetencionVenta=false;
	public Boolean isVisibilidadCeldaActualizarRetencionVenta=false;
	public Boolean isVisibilidadCeldaEliminarRetencionVenta=false;
	public Boolean isVisibilidadCeldaCancelarRetencionVenta=false;
	public Boolean isVisibilidadCeldaGuardarRetencionVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRetencionVenta=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPeriodoDeclara=false;
	public Boolean isVisibilidadFK_IdTipoRetencion=false;
	
	public Long getiIdNuevoRetencionVenta() {
		return this.iIdNuevoRetencionVenta;
	}

	public void setiIdNuevoRetencionVenta(Long iIdNuevoRetencionVenta) {
		this.iIdNuevoRetencionVenta = iIdNuevoRetencionVenta;
	}
	
	public Long getidRetencionVentaActual() {
		return this.idRetencionVentaActual;
	}

	public void setidRetencionVentaActual(Long idRetencionVentaActual) {
		this.idRetencionVentaActual = idRetencionVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RetencionVenta getretencionventa() {
		return this.retencionventa;
	}

	public void setretencionventa(RetencionVenta retencionventa) {
		this.retencionventa = retencionventa;
	}
	
	public RetencionVenta getretencionventaAux() {
		return this.retencionventaAux;
	}

	public void setretencionventaAux(RetencionVenta retencionventaAux) {
		this.retencionventaAux = retencionventaAux;
	}				
	
	public RetencionVenta getretencionventaAnterior() {
		return this.retencionventaAnterior;
	}

	public void setretencionventaAnterior(RetencionVenta retencionventaAnterior) {
		this.retencionventaAnterior = retencionventaAnterior;
	}	
	
	public RetencionVenta getretencionventaTotales() {
		return this.retencionventaTotales;
	}

	public void setretencionventaTotales(RetencionVenta retencionventaTotales) {
		this.retencionventaTotales = retencionventaTotales;
	}	
	
	public RetencionVenta getretencionventaBean() {
		return this.retencionventaBean;
	}

	public void setretencionventaBean(RetencionVenta retencionventaBean) {
		this.retencionventaBean = retencionventaBean;
	}	
	
	public RetencionVentaParameterReturnGeneral getretencionventaReturnGeneral() {
		return this.retencionventaReturnGeneral;
	}

	public void setretencionventaReturnGeneral(RetencionVentaParameterReturnGeneral retencionventaReturnGeneral) {
		this.retencionventaReturnGeneral = retencionventaReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_periodo_declaraFK_IdPeriodoDeclara=-1L;

	public Long getid_periodo_declaraFK_IdPeriodoDeclara() {
		return this.id_periodo_declaraFK_IdPeriodoDeclara;
	}

	public void setid_periodo_declaraFK_IdPeriodoDeclara(Long id_periodo_declaraFK_IdPeriodoDeclara) {
		this.id_periodo_declaraFK_IdPeriodoDeclara = id_periodo_declaraFK_IdPeriodoDeclara;
	}

	public Long id_tipo_retencionFK_IdTipoRetencion=-1L;

	public Long getid_tipo_retencionFK_IdTipoRetencion() {
		return this.id_tipo_retencionFK_IdTipoRetencion;
	}

	public void setid_tipo_retencionFK_IdTipoRetencion(Long id_tipo_retencionFK_IdTipoRetencion) {
		this.id_tipo_retencionFK_IdTipoRetencion = id_tipo_retencionFK_IdTipoRetencion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RetencionVentaLogic getRetencionVentaLogic()	{		
		return retencionventaLogic;
	}

	public void setRetencionVentaLogic(RetencionVentaLogic retencionventaLogic) {
		this.retencionventaLogic = retencionventaLogic;
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
	
	public Boolean getIsEsNuevoRetencionVenta() {
		return isEsNuevoRetencionVenta;
	}

	public void setIsEsNuevoRetencionVenta(Boolean isEsNuevoRetencionVenta) {
		this.isEsNuevoRetencionVenta = isEsNuevoRetencionVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioRetencionVenta() {
		return esParaAccionDesdeFormularioRetencionVenta;
	}
	
	public void setEsParaAccionDesdeFormularioRetencionVenta(Boolean esParaAccionDesdeFormularioRetencionVenta) {
		this.esParaAccionDesdeFormularioRetencionVenta = esParaAccionDesdeFormularioRetencionVenta;
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

			if(this.retencionventaSessionBean==null) {
				this.retencionventaSessionBean=new RetencionVentaSessionBean();
			}

			if(!this.retencionventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(retencionventaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosPeriodoDeclarasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoDeclaraLogic periododeclaraLogic=new PeriodoDeclaraLogic();

			//periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

			if(this.retencionventaSessionBean==null) {
				this.retencionventaSessionBean=new RetencionVentaSessionBean();
			}

			if(!this.retencionventaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periododeclaraLogic.getPeriodoDeclaraDataAccess().setIsForForeingKeyData(true);

					periododeclaraLogic.getTodosPeriodoDeclarasWithConnection(sFinalQuery,new Pagination());

					this.periododeclarasForeignKey=periododeclaraLogic.getPeriodoDeclaras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodoDeclara(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periododeclaraLogic.getEntityWithConnection(retencionventaSessionBean.getlidPeriodoDeclaraActual());
					this.periododeclarasForeignKey.add(periododeclaraLogic.getPeriodoDeclara());
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

	public void cargarCombosTipoRetencionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRetencionLogic tiporetencionLogic=new TipoRetencionLogic();

			//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

			if(this.retencionventaSessionBean==null) {
				this.retencionventaSessionBean=new RetencionVentaSessionBean();
			}

			if(!this.retencionventaSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

					tiporetencionLogic.getTodosTipoRetencionsWithConnection(sFinalQuery,new Pagination());

					this.tiporetencionsForeignKey=tiporetencionLogic.getTipoRetencions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRetencion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getEntityWithConnection(retencionventaSessionBean.getlidTipoRetencionActual());
					this.tiporetencionsForeignKey.add(tiporetencionLogic.getTipoRetencion());
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

					if(this.retencionventa!=null) {
						this.retencionventa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
						this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRetencionVenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
						if(this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRetencionVentaGenerico)throws Exception
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
				jComboBoxid_empresaRetencionVentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRetencionVentaGenerico!=null && jComboBoxid_empresaRetencionVentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaRetencionVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoDeclaraForeignKey(Long idPeriodoDeclaraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periododeclaraTemp!=null) {

					if(this.retencionventa!=null) {
						this.retencionventa.setPeriodoDeclara(periododeclaraTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
						this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.setSelectedItem(periododeclaraTemp);
					}
				} else {
					//jComboBoxid_periodo_declaraRetencionVenta.setSelectedItem(periododeclaraTemp);
					if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
						if(this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPeriodoDeclara") || sFormularioTipoBusqueda.equals("Todos")){
					if(periododeclaraTemp!=null && jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta!=null) {
						jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setSelectedItem(periododeclaraTemp);
					} else {
						if(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta!=null) {
							//jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setSelectedItem(periododeclaraTemp);
							if(jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.getItemCount()>0) {
								jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setSelectedIndex(0);
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

	public String getActualPeriodoDeclaraForeignKeyDescripcion(Long idPeriodoDeclaraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}


			sDescripcion=PeriodoDeclaraConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclaraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoDeclaraForeignKeyGenerico(Long idPeriodoDeclaraSeleccionado,JComboBox jComboBoxid_periodo_declaraRetencionVentaGenerico)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraTemp=null;

			for(PeriodoDeclara periododeclaraAux:periododeclarasForeignKey) {
				if(periododeclaraAux.getId()!=null && periododeclaraAux.getId().equals(idPeriodoDeclaraSeleccionado)) {
					periododeclaraTemp=periododeclaraAux;
					break;
				}
			}

			if(periododeclaraTemp!=null) {
				jComboBoxid_periodo_declaraRetencionVentaGenerico.setSelectedItem(periododeclaraTemp);
			} else {
				if(jComboBoxid_periodo_declaraRetencionVentaGenerico!=null && jComboBoxid_periodo_declaraRetencionVentaGenerico.getItemCount()>0) {
					jComboBoxid_periodo_declaraRetencionVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRetencionForeignKey(Long idTipoRetencionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporetencionTemp!=null) {

					if(this.retencionventa!=null) {
						this.retencionventa.setTipoRetencion(tiporetencionTemp);
					}

					if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
						this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.setSelectedItem(tiporetencionTemp);
					}
				} else {
					//jComboBoxid_tipo_retencionRetencionVenta.setSelectedItem(tiporetencionTemp);
					if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
						if(this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoRetencion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporetencionTemp!=null && jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta!=null) {
						jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setSelectedItem(tiporetencionTemp);
					} else {
						if(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta!=null) {
							//jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setSelectedItem(tiporetencionTemp);
							if(jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.getItemCount()>0) {
								jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setSelectedIndex(0);
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

	public String getActualTipoRetencionForeignKeyDescripcion(Long idTipoRetencionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}


			sDescripcion=TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRetencionForeignKeyGenerico(Long idTipoRetencionSeleccionado,JComboBox jComboBoxid_tipo_retencionRetencionVentaGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}

			if(tiporetencionTemp!=null) {
				jComboBoxid_tipo_retencionRetencionVentaGenerico.setSelectedItem(tiporetencionTemp);
			} else {
				if(jComboBoxid_tipo_retencionRetencionVentaGenerico!=null && jComboBoxid_tipo_retencionRetencionVentaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_retencionRetencionVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RetencionVenta retencionventa,JComboBox jComboBoxid_empresaRetencionVentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRetencionVentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRetencionVentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				retencionventa.setid_empresa(empresaAux.getId());
				retencionventa.setempresa_descripcion(RetencionVentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				retencionventa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoDeclaraForeignKey(RetencionVenta retencionventa,JComboBox jComboBoxid_periodo_declaraRetencionVentaGenerico)throws Exception
	{
		try
		{
			PeriodoDeclara  periododeclaraAux=new PeriodoDeclara();

			if(jComboBoxid_periodo_declaraRetencionVentaGenerico==null) {
				periododeclaraAux=(PeriodoDeclara)this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.getSelectedItem();
			} else {
				periododeclaraAux=(PeriodoDeclara)jComboBoxid_periodo_declaraRetencionVentaGenerico.getSelectedItem();
			}

			if(periododeclaraAux!=null && periododeclaraAux.getId()!=null) {
				retencionventa.setid_periodo_declara(periododeclaraAux.getId());
				retencionventa.setperiododeclara_descripcion(RetencionVentaConstantesFunciones.getPeriodoDeclaraDescripcion(periododeclaraAux));
				retencionventa.setPeriodoDeclara(periododeclaraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRetencionForeignKey(RetencionVenta retencionventa,JComboBox jComboBoxid_tipo_retencionRetencionVentaGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionAux=new TipoRetencion();

			if(jComboBoxid_tipo_retencionRetencionVentaGenerico==null) {
				tiporetencionAux=(TipoRetencion)this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.getSelectedItem();
			} else {
				tiporetencionAux=(TipoRetencion)jComboBoxid_tipo_retencionRetencionVentaGenerico.getSelectedItem();
			}

			if(tiporetencionAux!=null && tiporetencionAux.getId()!=null) {
				retencionventa.setid_tipo_retencion(tiporetencionAux.getId());
				retencionventa.settiporetencion_descripcion(RetencionVentaConstantesFunciones.getTipoRetencionDescripcion(tiporetencionAux));
				retencionventa.setTipoRetencion(tiporetencionAux);			}
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

					if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionVenta!=null) { 
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionVenta!=null) { 
					}

					if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodoDeclarasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodoDeclara=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionVenta!=null) { 
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.addItem(periododeclara);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionVenta!=null) { 
					}

					if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPeriodoDeclara") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.removeAllItems();

							for(PeriodoDeclara periododeclara:this.periododeclarasForeignKey) {
								this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.addItem(periododeclara);
							}
						}

						if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRetencionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRetencion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRetencionVenta!=null) { 
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.addItem(tiporetencion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRetencionVenta!=null) { 
					}

					if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoRetencion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.addItem(tiporetencion);
							}
						}

						if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoDeclaraForeignKey(PeriodoDeclara periododeclara,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.setSelectedItem(periododeclara);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setSelectedItem(periododeclara);
						} else {
							this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoRetencionForeignKey(TipoRetencion tiporetencion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.setSelectedItem(tiporetencion);
						}
					} else {
						if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setSelectedItem(tiporetencion);
						} else {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRetencionVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RetencionVentaConstantesFunciones.refrescarForeignKeysDescripcionesRetencionVenta(this.retencionventaLogic.getRetencionVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RetencionVentaConstantesFunciones.refrescarForeignKeysDescripcionesRetencionVenta(this.retencionventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(PeriodoDeclara.class));
		classes.add(new Classe(TipoRetencion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//retencionventaLogic.setRetencionVentas(this.retencionventas);
			retencionventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RetencionVentaParameterReturnGeneral getRetencionVentaParameterGeneral() {
		return this.retencionventaParameterGeneral;
	}
	
	public void setRetencionVentaParameterGeneral(RetencionVentaParameterReturnGeneral retencionventaParameterGeneral) {
		this.retencionventaParameterGeneral = retencionventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRetencionVenta() {
		return isPermisoTodoRetencionVenta;
	}

	public void setIsPermisoTodoRetencionVenta(Boolean isPermisoTodoRetencionVenta) {
		this.isPermisoTodoRetencionVenta = isPermisoTodoRetencionVenta;
	}

	public Boolean getIsPermisoNuevoRetencionVenta() {
		return isPermisoNuevoRetencionVenta;
	}

	public void setIsPermisoNuevoRetencionVenta(Boolean isPermisoNuevoRetencionVenta) {
		this.isPermisoNuevoRetencionVenta = isPermisoNuevoRetencionVenta;
	}

	public Boolean getIsPermisoActualizarRetencionVenta() {
		return isPermisoActualizarRetencionVenta;
	}

	public void setIsPermisoActualizarRetencionVenta(Boolean isPermisoActualizarRetencionVenta) {
		this.isPermisoActualizarRetencionVenta = isPermisoActualizarRetencionVenta;
	}

	public Boolean getIsPermisoEliminarRetencionVenta() {
		return isPermisoEliminarRetencionVenta;
	}

	public void setIsPermisoEliminarRetencionVenta(Boolean isPermisoEliminarRetencionVenta) {
		this.isPermisoEliminarRetencionVenta = isPermisoEliminarRetencionVenta;
	}

	public Boolean getIsPermisoGuardarCambiosRetencionVenta() {
		return isPermisoGuardarCambiosRetencionVenta;
	}

	public void setIsPermisoGuardarCambiosRetencionVenta(Boolean isPermisoGuardarCambiosRetencionVenta) {
		this.isPermisoGuardarCambiosRetencionVenta = isPermisoGuardarCambiosRetencionVenta;
	}
	
	public Boolean getIsPermisoConsultaRetencionVenta() {
		return isPermisoConsultaRetencionVenta;
	}

	public void setIsPermisoConsultaRetencionVenta(Boolean isPermisoConsultaRetencionVenta) {
		this.isPermisoConsultaRetencionVenta = isPermisoConsultaRetencionVenta;
	}

	public Boolean getIsPermisoBusquedaRetencionVenta() {
		return isPermisoBusquedaRetencionVenta;
	}

	public void setIsPermisoBusquedaRetencionVenta(Boolean isPermisoBusquedaRetencionVenta) {
		this.isPermisoBusquedaRetencionVenta = isPermisoBusquedaRetencionVenta;
	}

	public Boolean getIsPermisoReporteRetencionVenta() {
		return isPermisoReporteRetencionVenta;
	}

	public void setIsPermisoReporteRetencionVenta(Boolean isPermisoReporteRetencionVenta) {
		this.isPermisoReporteRetencionVenta = isPermisoReporteRetencionVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioRetencionVenta() {
		return isPermisoPaginacionMedioRetencionVenta;
	}

	public void setIsPermisoPaginacionMedioRetencionVenta(Boolean isPermisoPaginacionMedioRetencionVenta) {
		this.isPermisoPaginacionMedioRetencionVenta = isPermisoPaginacionMedioRetencionVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoRetencionVenta() {
		return isPermisoPaginacionTodoRetencionVenta;
	}

	public void setIsPermisoPaginacionTodoRetencionVenta(Boolean isPermisoPaginacionTodoRetencionVenta) {
		this.isPermisoPaginacionTodoRetencionVenta = isPermisoPaginacionTodoRetencionVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoRetencionVenta() {
		return isPermisoPaginacionAltoRetencionVenta;
	}

	public void setIsPermisoPaginacionAltoRetencionVenta(Boolean isPermisoPaginacionAltoRetencionVenta) {
		this.isPermisoPaginacionAltoRetencionVenta = isPermisoPaginacionAltoRetencionVenta;
	}
	
	public Boolean getIsPermisoCopiarRetencionVenta() {
		return isPermisoCopiarRetencionVenta;
	}

	public void setIsPermisoCopiarRetencionVenta(Boolean isPermisoCopiarRetencionVenta) {
		this.isPermisoCopiarRetencionVenta = isPermisoCopiarRetencionVenta;
	}
	
	public Boolean getIsPermisoVerFormRetencionVenta() {
		return isPermisoVerFormRetencionVenta;
	}

	public void setIsPermisoVerFormRetencionVenta(Boolean isPermisoVerFormRetencionVenta) {
		this.isPermisoVerFormRetencionVenta = isPermisoVerFormRetencionVenta;
	}
	
	public Boolean getIsPermisoDuplicarRetencionVenta() {
		return isPermisoDuplicarRetencionVenta;
	}

	public void setIsPermisoDuplicarRetencionVenta(Boolean isPermisoDuplicarRetencionVenta) {
		this.isPermisoDuplicarRetencionVenta = isPermisoDuplicarRetencionVenta;
	}
	
	public Boolean getIsPermisoOrdenRetencionVenta() {
		return isPermisoOrdenRetencionVenta;
	}

	public void setIsPermisoOrdenRetencionVenta(Boolean isPermisoOrdenRetencionVenta) {
		this.isPermisoOrdenRetencionVenta = isPermisoOrdenRetencionVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRetencionVenta() {
		return isVisibilidadCeldaNuevoRetencionVenta;
	}

	public void setIsVisibilidadCeldaNuevoRetencionVenta(Boolean isVisibilidadCeldaNuevoRetencionVenta) {
		this.isVisibilidadCeldaNuevoRetencionVenta = isVisibilidadCeldaNuevoRetencionVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRetencionVenta() {
		return isVisibilidadCeldaDuplicarRetencionVenta;
	}

	public void setIsVisibilidadCeldaDuplicarRetencionVenta(Boolean isVisibilidadCeldaDuplicarRetencionVenta) {
		this.isVisibilidadCeldaDuplicarRetencionVenta = isVisibilidadCeldaDuplicarRetencionVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRetencionVenta() {
		return isVisibilidadCeldaCopiarRetencionVenta;
	}

	public void setIsVisibilidadCeldaCopiarRetencionVenta(Boolean isVisibilidadCeldaCopiarRetencionVenta) {
		this.isVisibilidadCeldaCopiarRetencionVenta = isVisibilidadCeldaCopiarRetencionVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRetencionVenta() {
		return isVisibilidadCeldaVerFormRetencionVenta;
	}

	public void setIsVisibilidadCeldaVerFormRetencionVenta(Boolean isVisibilidadCeldaVerFormRetencionVenta) {
		this.isVisibilidadCeldaVerFormRetencionVenta = isVisibilidadCeldaVerFormRetencionVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRetencionVenta() {
		return isVisibilidadCeldaOrdenRetencionVenta;
	}

	public void setIsVisibilidadCeldaOrdenRetencionVenta(Boolean isVisibilidadCeldaOrdenRetencionVenta) {
		this.isVisibilidadCeldaOrdenRetencionVenta = isVisibilidadCeldaOrdenRetencionVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRetencionVenta() {
		return isVisibilidadCeldaNuevoRelacionesRetencionVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRetencionVenta(Boolean isVisibilidadCeldaNuevoRelacionesRetencionVenta) {
		this.isVisibilidadCeldaNuevoRelacionesRetencionVenta = isVisibilidadCeldaNuevoRelacionesRetencionVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRetencionVenta() {
		return isVisibilidadCeldaModificarRetencionVenta;
	}

	public void setIsVisibilidadCeldaModificarRetencionVenta(Boolean isVisibilidadCeldaModificarRetencionVenta) {
		this.isVisibilidadCeldaModificarRetencionVenta = isVisibilidadCeldaModificarRetencionVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRetencionVenta() {
		return isVisibilidadCeldaActualizarRetencionVenta;
	}

	public void setIsVisibilidadCeldaActualizarRetencionVenta(Boolean isVisibilidadCeldaActualizarRetencionVenta) {
		this.isVisibilidadCeldaActualizarRetencionVenta = isVisibilidadCeldaActualizarRetencionVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarRetencionVenta() {
		return isVisibilidadCeldaEliminarRetencionVenta;
	}

	public void setIsVisibilidadCeldaEliminarRetencionVenta(Boolean isVisibilidadCeldaEliminarRetencionVenta) {
		this.isVisibilidadCeldaEliminarRetencionVenta = isVisibilidadCeldaEliminarRetencionVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarRetencionVenta() {
		return isVisibilidadCeldaCancelarRetencionVenta;
	}

	public void setIsVisibilidadCeldaCancelarRetencionVenta(Boolean isVisibilidadCeldaCancelarRetencionVenta) {
		this.isVisibilidadCeldaCancelarRetencionVenta = isVisibilidadCeldaCancelarRetencionVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarRetencionVenta() {
		return isVisibilidadCeldaGuardarRetencionVenta;
	}

	public void setIsVisibilidadCeldaGuardarRetencionVenta(Boolean isVisibilidadCeldaGuardarRetencionVenta) {
		this.isVisibilidadCeldaGuardarRetencionVenta = isVisibilidadCeldaGuardarRetencionVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRetencionVenta() {
		return isVisibilidadCeldaGuardarCambiosRetencionVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRetencionVenta(Boolean isVisibilidadCeldaGuardarCambiosRetencionVenta) {
		this.isVisibilidadCeldaGuardarCambiosRetencionVenta = isVisibilidadCeldaGuardarCambiosRetencionVenta;
	}
		
	public RetencionVentaSessionBean getretencionventaSessionBean() {
		return this.retencionventaSessionBean;
	}
	
	public void setretencionventaSessionBean(RetencionVentaSessionBean retencionventaSessionBean) {
		this.retencionventaSessionBean=retencionventaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPeriodoDeclara() {
		return this.isVisibilidadFK_IdPeriodoDeclara;
	}

	public void setisVisibilidadFK_IdPeriodoDeclara(Boolean isVisibilidadFK_IdPeriodoDeclara) {
		this.isVisibilidadFK_IdPeriodoDeclara=isVisibilidadFK_IdPeriodoDeclara;
	}

	public Boolean getisVisibilidadFK_IdTipoRetencion() {
		return this.isVisibilidadFK_IdTipoRetencion;
	}

	public void setisVisibilidadFK_IdTipoRetencion(Boolean isVisibilidadFK_IdTipoRetencion) {
		this.isVisibilidadFK_IdTipoRetencion=isVisibilidadFK_IdTipoRetencion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(RetencionVenta retencionventa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(retencionventa,null);
				this.setActualParaGuardarPeriodoDeclaraForeignKey(retencionventa,null);
				this.setActualParaGuardarTipoRetencionForeignKey(retencionventa,null);
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
	
	public void bugActualizarReferenciaActual(RetencionVenta retencionventa,RetencionVenta retencionventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRetencionVenta(retencionventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		retencionventaAux.setId(retencionventa.getId());
		retencionventaAux.setVersionRow(retencionventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRetencionVenta();
		
			int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RetencionVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = retencionventaValidator.getInvalidValues(this.retencionventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			retencionventaLogic.setDatosCliente(datosCliente);
			retencionventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				retencionventaAux=new  RetencionVenta();
				
				retencionventaAux.setIsNew(true);
				retencionventaAux.setIsChanged(true);
				
				retencionventaAux.setRetencionVentaOriginal(this.retencionventa);
				
				retencionventaAux.setId(this.retencionventa.getId());	
				retencionventaAux.setVersionRow(this.retencionventa.getVersionRow());	
				retencionventaAux.setid_empresa(this.retencionventa.getid_empresa());	
				retencionventaAux.setid_periodo_declara(this.retencionventa.getid_periodo_declara());	
				retencionventaAux.setid_tipo_retencion(this.retencionventa.getid_tipo_retencion());	
				retencionventaAux.setruc(this.retencionventa.getruc());	
				retencionventaAux.setnumero_retencion(this.retencionventa.getnumero_retencion());	
				retencionventaAux.setbase_imponible(this.retencionventa.getbase_imponible());	
				retencionventaAux.setporcentaje(this.retencionventa.getporcentaje());	
				retencionventaAux.setvalor(this.retencionventa.getvalor());	
				retencionventaAux.setes_debito(this.retencionventa.getes_debito());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.retencionventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.retencionventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(retencionventaAux,retencionventaLogic.getRetencionVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(retencionventaAux,retencionventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.retencionventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.retencionventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionventaLogic.saveRetencionVentas();//WithConnection
						//retencionventaLogic.getSetVersionRowRetencionVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.retencionventa,retencionventaAux);
					
					this.refrescarForeignKeysDescripcionesRetencionVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.retencionventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								retencionventaLogic.saveRetencionVentaRelaciones(retencionventaAux);//WithConnection
								//retencionventaLogic.getSetVersionRowRetencionVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.retencionventa,retencionventaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.retencionventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.retencionventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(retencionventaAux,retencionventaLogic.getRetencionVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(retencionventaAux,retencionventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.retencionventa,retencionventaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				retencionventaAux=new  RetencionVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.retencionventaSessionBean.getEsGuardarRelacionado() 
					|| (this.retencionventaSessionBean.getEsGuardarRelacionado() && this.retencionventa.getId()>=0)) {
						
					retencionventaAux.setIsNew(false);
				}
				
				retencionventaAux.setIsDeleted(false);
			
				retencionventaAux.setId(this.retencionventa.getId());	
				retencionventaAux.setVersionRow(this.retencionventa.getVersionRow());	
				retencionventaAux.setid_empresa(this.retencionventa.getid_empresa());	
				retencionventaAux.setid_periodo_declara(this.retencionventa.getid_periodo_declara());	
				retencionventaAux.setid_tipo_retencion(this.retencionventa.getid_tipo_retencion());	
				retencionventaAux.setruc(this.retencionventa.getruc());	
				retencionventaAux.setnumero_retencion(this.retencionventa.getnumero_retencion());	
				retencionventaAux.setbase_imponible(this.retencionventa.getbase_imponible());	
				retencionventaAux.setporcentaje(this.retencionventa.getporcentaje());	
				retencionventaAux.setvalor(this.retencionventa.getvalor());	
				retencionventaAux.setes_debito(this.retencionventa.getes_debito());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(retencionventaAux,retencionventaLogic.getRetencionVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(retencionventaAux,retencionventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.retencionventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.retencionventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionventaLogic.saveRetencionVentas();//WithConnection
						//retencionventaLogic.getSetVersionRowRetencionVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.retencionventa,retencionventaAux);
					
					this.refrescarForeignKeysDescripcionesRetencionVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.retencionventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								retencionventaLogic.saveRetencionVentaRelaciones(retencionventaAux);//WithConnection
								//retencionventaLogic.getSetVersionRowRetencionVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.retencionventa,retencionventaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.retencionventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.retencionventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(retencionventaAux,retencionventaLogic.getRetencionVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(retencionventaAux,retencionventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.retencionventa,retencionventaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				retencionventaAux=new  RetencionVenta();
				
				retencionventaAux.setIsNew(false);
				retencionventaAux.setIsChanged(false);
				
				retencionventaAux.setIsDeleted(true);
				
				retencionventaAux.setId(this.retencionventa.getId());	
				retencionventaAux.setVersionRow(this.retencionventa.getVersionRow());	
				retencionventaAux.setid_empresa(this.retencionventa.getid_empresa());	
				retencionventaAux.setid_periodo_declara(this.retencionventa.getid_periodo_declara());	
				retencionventaAux.setid_tipo_retencion(this.retencionventa.getid_tipo_retencion());	
				retencionventaAux.setruc(this.retencionventa.getruc());	
				retencionventaAux.setnumero_retencion(this.retencionventa.getnumero_retencion());	
				retencionventaAux.setbase_imponible(this.retencionventa.getbase_imponible());	
				retencionventaAux.setporcentaje(this.retencionventa.getporcentaje());	
				retencionventaAux.setvalor(this.retencionventa.getvalor());	
				retencionventaAux.setes_debito(this.retencionventa.getes_debito());	
				
				if(this.retencionventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.retencionventaAux.getId()>=0) {	
						this.retencionventasEliminados.add(retencionventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(retencionventaAux,retencionventaLogic.getRetencionVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(retencionventaAux,retencionventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.retencionventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.retencionventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionventaLogic.saveRetencionVentas();//WithConnection
						//retencionventaLogic.getSetVersionRowRetencionVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.retencionventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								retencionventaLogic.saveRetencionVentaRelaciones(retencionventaAux);//WithConnection
								//retencionventaLogic.getSetVersionRowRetencionVentas();//WithConnection
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
							if(this.retencionventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.retencionventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(retencionventaAux,retencionventaLogic.getRetencionVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(retencionventaAux,retencionventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.getRetencionVentas().addAll(this.retencionventasEliminados);
					
					retencionventaLogic.saveRetencionVentas();//WithConnection
					//retencionventaLogic.getSetVersionRowRetencionVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRetencionVenta();
				
				this.retencionventasEliminados= new ArrayList<RetencionVenta>();		
			}
			
			if(this.retencionventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Retencion Venta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Retencion Venta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.retencionventa=retencionventaAux;
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
      		//this.finishProcessRetencionVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(RetencionVenta retencionventaLocal) throws Exception {
		
		if(this.retencionventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RetencionVenta retencionventaLocal) throws Exception {	
		if(this.retencionventaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				retencionventaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDeclaraDetalleFormJInternalFrame.class)) {
				PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrameLocal=(PeriodoDeclaraBeanSwingJInternalFrame) ((PeriodoDeclaraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periododeclaraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.getperiododeclara(),true);
				periododeclaraBeanSwingJInternalFrameLocal.actualizarLista(periododeclaraBeanSwingJInternalFrameLocal.periododeclara,this.periododeclarasForeignKey);

				periododeclaraBeanSwingJInternalFrameLocal.actualizarRelaciones(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				retencionventaLocal.setPeriodoDeclara(periododeclaraBeanSwingJInternalFrameLocal.periododeclara);

				this.addItemDefectoCombosForeignKeyPeriodoDeclara();
				this.cargarCombosFramePeriodoDeclarasForeignKey("Formulario");
				this.setActualPeriodoDeclaraForeignKey(periododeclaraBeanSwingJInternalFrameLocal.periododeclara.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRetencionDetalleFormJInternalFrame.class)) {
				TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrameLocal=(TipoRetencionBeanSwingJInternalFrame) ((TipoRetencionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporetencionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.gettiporetencion(),true);
				tiporetencionBeanSwingJInternalFrameLocal.actualizarLista(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion,this.tiporetencionsForeignKey);

				tiporetencionBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				retencionventaLocal.setTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				this.addItemDefectoCombosForeignKeyTipoRetencion();
				this.cargarCombosFrameTipoRetencionsForeignKey("Formulario");
				this.setActualTipoRetencionForeignKey(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRetencionVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = retencionventaValidator.getInvalidValues(this.retencionventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RetencionVenta retencionventa,List<RetencionVenta> retencionventas) throws Exception {
		try	{		
			RetencionVentaConstantesFunciones.actualizarLista(retencionventa,retencionventas,this.retencionventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RetencionVenta retencionventa,List<RetencionVenta> retencionventas) throws Exception {
		try	{			
			RetencionVentaConstantesFunciones.actualizarSelectedLista(retencionventa,retencionventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RetencionVenta> retencionventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				retencionventasLocal=this.retencionventaLogic.getRetencionVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				retencionventasLocal=this.retencionventas;
			}
			//ARCHITECTURE
		
			for(RetencionVenta retencionventaLocal:retencionventasLocal) {
				if(this.permiteMantenimiento(retencionventaLocal) && retencionventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RetencionVentaConstantesFunciones.getRetencionVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RetencionVentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelid_empresaRetencionVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionVentaConstantesFunciones.IDPERIODODECLARA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelid_periodo_declaraRetencionVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionVentaConstantesFunciones.IDTIPORETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelid_tipo_retencionRetencionVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionVentaConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelrucRetencionVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionVentaConstantesFunciones.NUMERORETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelnumero_retencionRetencionVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionVentaConstantesFunciones.BASEIMPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelbase_imponibleRetencionVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionVentaConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelporcentajeRetencionVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionVentaConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelvalorRetencionVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RetencionVentaConstantesFunciones.ESDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabeles_debitoRetencionVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionVenta.jLabelid_empresaRetencionVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionVenta.jLabelid_periodo_declaraRetencionVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionVenta.jLabelid_tipo_retencionRetencionVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionVenta.jLabelrucRetencionVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionVenta.jLabelnumero_retencionRetencionVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionVenta.jLabelbase_imponibleRetencionVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionVenta.jLabelporcentajeRetencionVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionVenta.jLabelvalorRetencionVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRetencionVenta.jLabeles_debitoRetencionVenta,"");
		
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
		this.iIdNuevoRetencionVenta--;	
		
		
		this.retencionventaAux=new RetencionVenta();
		
		this.retencionventaAux.setId(this.iIdNuevoRetencionVenta);
		this.retencionventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.retencionventaLogic.getRetencionVentas().add(this.retencionventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.retencionventas.add(this.retencionventaAux);
		}
		//ARCHITECTURE
		
		this.retencionventa=this.retencionventaAux;
		
		if(RetencionVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRetencionVenta(this.retencionventa);
			this.setVariablesObjetoActualToFormularioForeignKeyRetencionVenta(this.retencionventa);
		}
				
		//this.setDefaultControlesRetencionVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRetencionVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRetencionVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRetencionVenta(this.retencionventaBean,this.retencionventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RetencionVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.retencionventaSessionBean.getConGuardarRelaciones()) {
			classes=RetencionVentaConstantesFunciones.getClassesRelationshipsOfRetencionVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.retencionventaReturnGeneral=retencionventaLogic.procesarEventosRetencionVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.retencionventaLogic.getRetencionVentas(),this.retencionventa,this.retencionventaParameterGeneral,this.isEsNuevoRetencionVenta,classes);//this.retencionventaLogic.getRetencionVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRetencionVenta(this.retencionventaReturnGeneral,this.retencionventaBean,false);
		
		if(this.retencionventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRetencionVenta(this.retencionventaReturnGeneral.getRetencionVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRetencionVenta(this.retencionventaReturnGeneral.getRetencionVenta());
		}
		
		if(this.retencionventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRetencionVenta(this.retencionventaReturnGeneral.getRetencionVenta(),classes);//this.retencionventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRetencionVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRetencionVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RetencionVentaBeanSwingJInternalFrameAdditional.RecargarFormRetencionVenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRetencionVenta(false);
						
			if(retencionventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionVenta();
			}
			
			this.actualizarVisualTableDatosRetencionVenta();
			
			this.jTableDatosRetencionVenta.setRowSelectionInterval(this.getIndiceNuevoRetencionVenta(), this.getIndiceNuevoRetencionVenta());
			
			this.seleccionarFilaTablaRetencionVentaActual();
						
			this.actualizarEstadoCeldasBotonesRetencionVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRetencionVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRetencionVenta.jTextFieldrucRetencionVenta.setEnabled(isHabilitar && this.retencionventaConstantesFunciones.activarrucRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jTextFieldnumero_retencionRetencionVenta.setEnabled(isHabilitar && this.retencionventaConstantesFunciones.activarnumero_retencionRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jTextFieldbase_imponibleRetencionVenta.setEnabled(isHabilitar && this.retencionventaConstantesFunciones.activarbase_imponibleRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jTextFieldporcentajeRetencionVenta.setEnabled(isHabilitar && this.retencionventaConstantesFunciones.activarporcentajeRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jTextFieldvalorRetencionVenta.setEnabled(isHabilitar && this.retencionventaConstantesFunciones.activarvalorRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxes_debitoRetencionVenta.setEnabled(isHabilitar && this.retencionventaConstantesFunciones.activares_debitoRetencionVenta);	
		//
		this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.setEnabled(isHabilitar && this.retencionventaConstantesFunciones.activarid_empresaRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.setEnabled(isHabilitar && this.retencionventaConstantesFunciones.activarid_periodo_declaraRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.setEnabled(isHabilitar && this.retencionventaConstantesFunciones.activarid_tipo_retencionRetencionVenta);
	};
	
	public void setDefaultControlesRetencionVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRetencionVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.retencionventaSessionBean.setConGuardarRelaciones(true);			
			this.retencionventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRetencionVenta.jTabbedPaneRelacionesRetencionVenta.setVisible(true);
			
					
		} else {
			//this.retencionventaSessionBean.setConGuardarRelaciones(false);			
			this.retencionventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRetencionVenta.jTabbedPaneRelacionesRetencionVenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRetencionVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionVenta retencionventaAux:this.retencionventaLogic.getRetencionVentas()) {
				if(retencionventaAux.getId().equals(this.iIdNuevoRetencionVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionVenta retencionventaAux:this.retencionventas) {
				if(retencionventaAux.getId().equals(this.iIdNuevoRetencionVenta)) {
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
	
	public int getIndiceActualRetencionVenta(RetencionVenta retencionventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionVenta retencionventaAux:this.retencionventaLogic.getRetencionVentas()) {
				if(retencionventaAux.getId().equals(retencionventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionVenta retencionventaAux:this.retencionventas) {
				if(retencionventaAux.getId().equals(retencionventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRetencionVenta(RetencionVenta retencionventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionVenta retencionventaAux:this.retencionventaLogic.getRetencionVentas()) {
				if(retencionventaAux.getRetencionVentaOriginal().getId().equals(retencionventaOriginal.getId())) {
					existe=true;
					retencionventaOriginal.setId(retencionventaAux.getId());
					retencionventaOriginal.setVersionRow(retencionventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionVenta retencionventaAux:this.retencionventas) {
				if(retencionventaAux.getRetencionVentaOriginal().getId().equals(retencionventaOriginal.getId())) {
					existe=true;
					retencionventaOriginal.setId(retencionventaAux.getId());
					retencionventaOriginal.setVersionRow(retencionventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRetencionVenta(Boolean esParaCancelar) throws Exception {
		retencionventasAux=new ArrayList<RetencionVenta>();
		retencionventaAux=new RetencionVenta();
		
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RetencionVenta retencionventaAux:this.retencionventaLogic.getRetencionVentas()) {
					if(retencionventaAux.getId()<0) {
						retencionventasAux.add(retencionventaAux);
					}		
				}
				this.iIdNuevoRetencionVenta=0L;
				this.retencionventaLogic.getRetencionVentas().removeAll(retencionventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionVenta retencionventaAux:this.retencionventas) {
					if(retencionventaAux.getId()<0) {
						retencionventasAux.add(retencionventaAux);
					}		
				}
				this.iIdNuevoRetencionVenta=0L;
				this.retencionventas.removeAll(retencionventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRetencionVenta 
					&& this.retencionventaLogic.getRetencionVentas().size()>0
					) {
					retencionventaAux=this.retencionventaLogic.getRetencionVentas().get(this.retencionventaLogic.getRetencionVentas().size() - 1);
				
					if(retencionventaAux.getId()<0) {
						this.retencionventaLogic.getRetencionVentas().remove(retencionventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRetencionVenta && this.retencionventas.size()>0) {
					retencionventaAux=this.retencionventas.get(this.retencionventas.size() - 1);
				
					if(retencionventaAux.getId()<0) {
						this.retencionventas.remove(retencionventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRetencionVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(retencionventa.getId()<0) {
				this.retencionventaLogic.getRetencionVentas().remove(this.retencionventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(retencionventa.getId()<0) {
				this.retencionventas.remove(this.retencionventa);
			}
		}			
	}
	
	public void setEstadosInicialesRetencionVenta(List<RetencionVenta> retencionventasAux) throws Exception {
		RetencionVentaConstantesFunciones.setEstadosInicialesRetencionVenta(retencionventasAux);
	}
	
	public void setEstadosInicialesRetencionVenta(RetencionVenta retencionventaAux) throws Exception {
		RetencionVentaConstantesFunciones.setEstadosInicialesRetencionVenta(retencionventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRetencionVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRetencionVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRetencionVentaActual()) {
				if(!this.isEsNuevoRetencionVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRetencionVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRetencionVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRetencionVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Retencion Venta ?", "MANTENIMIENTO DE Retencion Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRetencionVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RetencionVenta retencionventa) throws Exception {
		RetencionVentaConstantesFunciones.seleccionarAsignar(this.retencionventa,retencionventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRetencionVenta=this.isPermisoActualizarOriginalRetencionVenta;
			
			
			this.seleccionarAsignar(retencionventa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RetencionVentaConstantesFunciones.quitarEspaciosRetencionVenta(this.retencionventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRetencionVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.retencionventaSessionBean.setsFuncionBusquedaRapida(this.retencionventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRetencionVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRetencionVenta(esParaCancelar);				
				this.cancelarNuevoRetencionVenta(esParaCancelar);								
			}
			
			this.retencionventa=new RetencionVenta();
			
			this.inicializarRetencionVenta();
			
			this.actualizarEstadoCeldasBotonesRetencionVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRetencionVenta() throws Exception {
		try {
			RetencionVentaConstantesFunciones.inicializarRetencionVenta(this.retencionventa);
			
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
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.retencionventaLogic.getRetencionVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRetencionVentas(String sAccionBusqueda,List<RetencionVenta> retencionventasParaReportes) throws Exception {
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
					sPathReporteFinal="RetencionVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RetencionVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RetencionVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RetencionVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Retencion Ventas");		
		parameters.put("busquedapor", RetencionVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRetencionVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RetencionVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RetencionVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRetencionVenta=new JRBeanArrayDataSource(RetencionVentaJInternalFrame.TraerRetencionVentaBeans(retencionventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRetencionVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RetencionVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RetencionVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RetencionVentaBean.TraerRetencionVentaBeans(retencionventasParaReportes).toArray()));
							
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
				this.generarExcelReporteRetencionVentas(sAccionBusqueda,sTipoArchivoReporte,retencionventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRetencionVentas(sAccionBusqueda,sTipoArchivoReporte,retencionventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRetencionVentaActionPerformed(null);
					//this.generarExcelReporteRetencionVentas(sAccionBusqueda,sTipoArchivoReporte,retencionventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRetencionVentas(sAccionBusqueda,sTipoArchivoReporte,retencionventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRetencionVentas(sAccionBusqueda,sTipoArchivoReporte,retencionventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRetencionVentas(sAccionBusqueda,sTipoArchivoReporte,retencionventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRetencionVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionVenta> retencionventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRetencionVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RetencionVenta retencionventa : retencionventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RetencionVentaConstantesFunciones.generarExcelReporteDataRetencionVenta("NORMAL",row,workbook,retencionventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRetencionVenta(String sTipo,Row row,Workbook workbook) {
		
		RetencionVentaConstantesFunciones.generarExcelReporteHeaderRetencionVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRetencionVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionVenta> retencionventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RetencionVenta retencionventa : retencionventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RetencionVentaConstantesFunciones.getRetencionVentaDescripcion(retencionventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionVentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionventa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionventa.getperiododeclara_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionventa.gettiporetencion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionVentaConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionventa.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionventa.getnumero_retencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionventa.getbase_imponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionVentaConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionventa.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionVentaConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(retencionventa.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RetencionVentaConstantesFunciones.LABEL_ESDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_ESDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(retencionventa.getes_debito()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRetencionVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<RetencionVenta> retencionventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RetencionVenta> retencionventasRespaldo=null;
		
		classes=RetencionVentaConstantesFunciones.getClassesRelationshipsOfRetencionVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.retencionventaLogic.setDatosCliente(this.datosCliente);
		this.retencionventaLogic.setDatosDeep(this.datosDeep);
		this.retencionventaLogic.setIsConDeep(true);
		
		retencionventasRespaldo=this.retencionventaLogic.getRetencionVentas();
		
		this.retencionventaLogic.setRetencionVentas(retencionventasParaReportes);	
		this.retencionventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		retencionventasParaReportes=this.retencionventaLogic.getRetencionVentas();
		this.retencionventaLogic.setRetencionVentas(retencionventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RetencionVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRetencionVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RetencionVenta retencionventa : retencionventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRetencionVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RetencionVentaConstantesFunciones.generarExcelReporteDataRetencionVenta("NORMAL",row,workbook,retencionventa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RetencionVentaConstantesFunciones.getRetencionVentaDescripcion(retencionventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRetencionVenta() throws Exception {		
		this.startProcessRetencionVenta(true);
	}
	
	public void startProcessRetencionVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRetencionVenta ,this.jPanelParametrosReportesRetencionVenta, this.jScrollPanelDatosRetencionVenta,this.jPanelPaginacionRetencionVenta, this.jScrollPanelDatosEdicionRetencionVenta, this.jPanelAccionesRetencionVenta,this.jPanelAccionesFormularioRetencionVenta,this.jmenuBarRetencionVenta,this.jmenuBarDetalleRetencionVenta,this.jTtoolBarRetencionVenta,this.jTtoolBarDetalleRetencionVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasRetencionVenta=this.jTabbedPaneBusquedasRetencionVenta; 
		
		final JPanel jPanelParametrosReportesRetencionVenta=this.jPanelParametrosReportesRetencionVenta;
		//final JScrollPane jScrollPanelDatosRetencionVenta=this.jScrollPanelDatosRetencionVenta;
		final JTable jTableDatosRetencionVenta=this.jTableDatosRetencionVenta;		
		final JPanel jPanelPaginacionRetencionVenta=this.jPanelPaginacionRetencionVenta;
		//final JScrollPane jScrollPanelDatosEdicionRetencionVenta=this.jScrollPanelDatosEdicionRetencionVenta;
		final JPanel jPanelAccionesRetencionVenta=this.jPanelAccionesRetencionVenta;
		
		JPanel jPanelCamposAuxiliarRetencionVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRetencionVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			jPanelCamposAuxiliarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jPanelCamposRetencionVenta;
			jPanelAccionesFormularioAuxiliarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jPanelAccionesFormularioRetencionVenta;
		}
		
		final JPanel jPanelCamposRetencionVenta=jPanelCamposAuxiliarRetencionVenta;
		final JPanel jPanelAccionesFormularioRetencionVenta=jPanelAccionesFormularioAuxiliarRetencionVenta;
		
		
		final JMenuBar jmenuBarRetencionVenta=this.jmenuBarRetencionVenta;
		final JToolBar jTtoolBarRetencionVenta=this.jTtoolBarRetencionVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRetencionVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRetencionVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			jmenuBarDetalleAuxiliarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jmenuBarDetalleRetencionVenta;
			jTtoolBarDetalleAuxiliarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jTtoolBarDetalleRetencionVenta;
		}
		
		final JMenuBar jmenuBarDetalleRetencionVenta=jmenuBarDetalleAuxiliarRetencionVenta;
		final JToolBar jTtoolBarDetalleRetencionVenta=jTtoolBarDetalleAuxiliarRetencionVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRetencionVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRetencionVenta;
			processRunnable.jTableDatos=jTableDatosRetencionVenta;
			processRunnable.jPanelCampos=jPanelCamposRetencionVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionRetencionVenta;
			processRunnable.jPanelAcciones=jPanelAccionesRetencionVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRetencionVenta;
			
			
			processRunnable.jmenuBar=jmenuBarRetencionVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRetencionVenta;
			processRunnable.jTtoolBar=jTtoolBarRetencionVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRetencionVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRetencionVenta ,jPanelParametrosReportesRetencionVenta,jTableDatosRetencionVenta, /*jScrollPanelDatosRetencionVenta,*/jPanelCamposRetencionVenta,jPanelPaginacionRetencionVenta, /*jScrollPanelDatosEdicionRetencionVenta,*/ jPanelAccionesRetencionVenta,jPanelAccionesFormularioRetencionVenta,jmenuBarRetencionVenta,jmenuBarDetalleRetencionVenta,jTtoolBarRetencionVenta,jTtoolBarDetalleRetencionVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRetencionVenta ,jPanelParametrosReportesRetencionVenta, jScrollPanelDatosRetencionVenta,jPanelPaginacionRetencionVenta, jScrollPanelDatosEdicionRetencionVenta, jPanelAccionesRetencionVenta,jPanelAccionesFormularioRetencionVenta,jmenuBarRetencionVenta,jmenuBarDetalleRetencionVenta,jTtoolBarRetencionVenta,jTtoolBarDetalleRetencionVenta);
						
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
	
	public void finishProcessRetencionVenta() {// throws Exception 
		this.finishProcessRetencionVenta(true);
	}
	
	public void finishProcessRetencionVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRetencionVenta ,this.jPanelParametrosReportesRetencionVenta, this.jScrollPanelDatosRetencionVenta,this.jPanelPaginacionRetencionVenta, this.jScrollPanelDatosEdicionRetencionVenta, this.jPanelAccionesRetencionVenta,this.jPanelAccionesFormularioRetencionVenta,this.jmenuBarRetencionVenta,this.jmenuBarDetalleRetencionVenta,this.jTtoolBarRetencionVenta,this.jTtoolBarDetalleRetencionVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasRetencionVenta=this.jTabbedPaneBusquedasRetencionVenta; 
		
		final JPanel jPanelParametrosReportesRetencionVenta=this.jPanelParametrosReportesRetencionVenta;
		//final JScrollPane jScrollPanelDatosRetencionVenta=this.jScrollPanelDatosRetencionVenta;
		final JTable jTableDatosRetencionVenta=this.jTableDatosRetencionVenta;		
		final JPanel jPanelPaginacionRetencionVenta=this.jPanelPaginacionRetencionVenta;
		//final JScrollPane jScrollPanelDatosEdicionRetencionVenta=this.jScrollPanelDatosEdicionRetencionVenta;
		final JPanel jPanelAccionesRetencionVenta=this.jPanelAccionesRetencionVenta;
		
		JPanel jPanelCamposAuxiliarRetencionVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRetencionVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			jPanelCamposAuxiliarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jPanelCamposRetencionVenta;
			jPanelAccionesFormularioAuxiliarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jPanelAccionesFormularioRetencionVenta;
		}
		
		final JPanel jPanelCamposRetencionVenta=jPanelCamposAuxiliarRetencionVenta;
		final JPanel jPanelAccionesFormularioRetencionVenta=jPanelAccionesFormularioAuxiliarRetencionVenta;
		
		
		final JMenuBar jmenuBarRetencionVenta=this.jmenuBarRetencionVenta;		
		final JToolBar jTtoolBarRetencionVenta=this.jTtoolBarRetencionVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarRetencionVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRetencionVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			jmenuBarDetalleAuxiliarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jmenuBarDetalleRetencionVenta;
			jTtoolBarDetalleAuxiliarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jTtoolBarDetalleRetencionVenta;		
		}
		
		final JMenuBar jmenuBarDetalleRetencionVenta=jmenuBarDetalleAuxiliarRetencionVenta;
		final JToolBar jTtoolBarDetalleRetencionVenta=jTtoolBarDetalleAuxiliarRetencionVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRetencionVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRetencionVenta;
			processRunnable.jTableDatos=jTableDatosRetencionVenta;
			processRunnable.jPanelCampos=jPanelCamposRetencionVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionRetencionVenta;
			processRunnable.jPanelAcciones=jPanelAccionesRetencionVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRetencionVenta;
			
			
			processRunnable.jmenuBar=jmenuBarRetencionVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRetencionVenta;
			processRunnable.jTtoolBar=jTtoolBarRetencionVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRetencionVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRetencionVenta ,jPanelParametrosReportesRetencionVenta, jTableDatosRetencionVenta,/*jScrollPanelDatosRetencionVenta,*/jPanelCamposRetencionVenta,jPanelPaginacionRetencionVenta, /*jScrollPanelDatosEdicionRetencionVenta,*/ jPanelAccionesRetencionVenta,jPanelAccionesFormularioRetencionVenta,jmenuBarRetencionVenta,jmenuBarDetalleRetencionVenta,jTtoolBarRetencionVenta,jTtoolBarDetalleRetencionVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRetencionVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRetencionVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRetencionVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRetencionVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRetencionVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRetencionVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRetencionVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRetencionVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRetencionVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.retencionventaConstantesFunciones.getsFinalQueryRetencionVenta();
		String  finalQueryPaginacionTodos=this.retencionventaConstantesFunciones.getsFinalQueryRetencionVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RetencionVentaConstantesFunciones.getArrayColumnasGlobalesNoRetencionVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RetencionVentaConstantesFunciones.getArrayColumnasGlobalesRetencionVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RetencionVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.retencionventasEliminados= new ArrayList<RetencionVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRetencionVenta();
		
				///*RetencionVentaSessionBean*/this.retencionventaSessionBean=new RetencionVentaSessionBean();
			
			if(this.retencionventaSessionBean==null) {
				this.retencionventaSessionBean=new RetencionVentaSessionBean();
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
					this.iNumeroPaginacion=RetencionVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RetencionVentaConstantesFunciones.getClassesForeignKeysOfRetencionVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/retencionventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			retencionventasAux= new ArrayList<RetencionVenta>();
			
				
			retencionventaLogic.setDatosCliente(this.datosCliente);
			retencionventaLogic.setDatosDeep(this.datosDeep);
			retencionventaLogic.setIsConDeep(true);
			
			
			retencionventaLogic.getRetencionVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					retencionventaLogic.getTodosRetencionVentas(finalQueryGlobal,pagination);
					
					//retencionventaLogic.getTodosRetencionVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(retencionventaLogic.getRetencionVentas()==null|| retencionventaLogic.getRetencionVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							retencionventasAux= new ArrayList<RetencionVenta>();
							retencionventasAux.addAll(retencionventaLogic.getRetencionVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionventasAux= new ArrayList<RetencionVenta>();
							retencionventasAux.addAll(retencionventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							retencionventaLogic.getTodosRetencionVentas(finalQueryGlobal+"",this.pagination);												
							
							//retencionventaLogic.getTodosRetencionVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRetencionVentas("Todos",retencionventaLogic.getRetencionVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							retencionventaLogic.setRetencionVentas(new ArrayList<RetencionVenta>());					
							retencionventaLogic.getRetencionVentas().addAll(retencionventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionventas=new ArrayList<RetencionVenta>();
							retencionventas.addAll(retencionventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRetencionVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRetencionVenta=this.idActual;
				
				} else if(this.idRetencionVentaActual!=null && this.idRetencionVentaActual!=0L) {
					idRetencionVenta=idRetencionVentaActual;
				}
				
					
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndicePorId(idRetencionVenta);
				
				this.retencionventas=new ArrayList<RetencionVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					retencionventaLogic.getEntity(idRetencionVenta);
					
					//retencionventaLogic.getEntityWithConnection(idRetencionVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencionventaLogic.setRetencionVentas(new ArrayList<RetencionVenta>());
					retencionventaLogic.getRetencionVentas().add(retencionventaLogic.getRetencionVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionventas=new ArrayList<RetencionVenta>();
					this.retencionventas.add(retencionventa);
				}
				
				if(retencionventaLogic.getRetencionVenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencionventaLogic.getRetencionVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencionventaLogic.getRetencionVentas()==null||retencionventaLogic.getRetencionVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencionventas==null|| retencionventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionventasAux=new ArrayList<RetencionVenta>();
						retencionventasAux.addAll(retencionventaLogic.getRetencionVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionventasAux=new ArrayList<RetencionVenta>();
							retencionventasAux.addAll(retencionventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencionventaLogic.getRetencionVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionVentas("FK_IdEmpresa",retencionventaLogic.getRetencionVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionVentas("FK_IdEmpresa",retencionventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionventaLogic.setRetencionVentas(new ArrayList<RetencionVenta>());
						retencionventaLogic.getRetencionVentas().addAll(retencionventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionventas=new ArrayList<RetencionVenta>();
							retencionventas.addAll(retencionventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodoDeclara")) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencionventaLogic.getRetencionVentasFK_IdPeriodoDeclara(finalQueryGlobal,pagination,id_periodo_declaraFK_IdPeriodoDeclara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencionventaLogic.getRetencionVentas()==null||retencionventaLogic.getRetencionVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencionventas==null|| retencionventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionventasAux=new ArrayList<RetencionVenta>();
						retencionventasAux.addAll(retencionventaLogic.getRetencionVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionventasAux=new ArrayList<RetencionVenta>();
							retencionventasAux.addAll(retencionventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencionventaLogic.getRetencionVentasFK_IdPeriodoDeclara(finalQueryGlobal,pagination,id_periodo_declaraFK_IdPeriodoDeclara);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdPeriodoDeclara(id_periodo_declaraFK_IdPeriodoDeclara);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionVentas("FK_IdPeriodoDeclara",retencionventaLogic.getRetencionVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionVentas("FK_IdPeriodoDeclara",retencionventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionventaLogic.setRetencionVentas(new ArrayList<RetencionVenta>());
						retencionventaLogic.getRetencionVentas().addAll(retencionventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionventas=new ArrayList<RetencionVenta>();
							retencionventas.addAll(retencionventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoRetencion")) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					retencionventaLogic.getRetencionVentasFK_IdTipoRetencion(finalQueryGlobal,pagination,id_tipo_retencionFK_IdTipoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=retencionventaLogic.getRetencionVentas()==null||retencionventaLogic.getRetencionVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=retencionventas==null|| retencionventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionventasAux=new ArrayList<RetencionVenta>();
						retencionventasAux.addAll(retencionventaLogic.getRetencionVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionventasAux=new ArrayList<RetencionVenta>();
							retencionventasAux.addAll(retencionventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							retencionventaLogic.getRetencionVentasFK_IdTipoRetencion(finalQueryGlobal,pagination,id_tipo_retencionFK_IdTipoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RetencionVentaConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRetencionVentas("FK_IdTipoRetencion",retencionventaLogic.getRetencionVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRetencionVentas("FK_IdTipoRetencion",retencionventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionventaLogic.setRetencionVentas(new ArrayList<RetencionVenta>());
						retencionventaLogic.getRetencionVentas().addAll(retencionventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionventas=new ArrayList<RetencionVenta>();
							retencionventas.addAll(retencionventasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRetencionVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRetencionVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=retencionventaLogic.getRetencionVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencionventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=retencionventaLogic.getRetencionVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=retencionventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RetencionVenta retencionventa) {
		Boolean permite=true;
		
		if(this.retencionventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RetencionVentaConstantesFunciones.getOrderByListaRetencionVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RetencionVentaConstantesFunciones.getOrderByListaRetencionVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionVenta retencionventa:retencionventaLogic.getRetencionVentas()) {
				if(retencionventa.getsType().equals(Constantes2.S_TOTALES)) {
					retencionventaTotales=retencionventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionVenta retencionventa:this.retencionventas) {
				if(retencionventa.getsType().equals(Constantes2.S_TOTALES)) {
					retencionventaTotales=retencionventa;
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
			this.retencionventaAux=new RetencionVenta();
			this.retencionventaAux.setsType(Constantes2.S_TOTALES);
			this.retencionventaAux.setIsNew(false);
			this.retencionventaAux.setIsChanged(false);
			this.retencionventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RetencionVentaConstantesFunciones.TotalizarValoresFilaRetencionVenta(this.retencionventaLogic.getRetencionVentas(),this.retencionventaAux);
				
				this.retencionventaLogic.getRetencionVentas().add(this.retencionventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RetencionVentaConstantesFunciones.TotalizarValoresFilaRetencionVenta(this.retencionventas,this.retencionventaAux);
				
				this.retencionventas.add(this.retencionventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		retencionventaTotales=new RetencionVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.retencionventaLogic.getRetencionVentas().remove(retencionventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.retencionventas.remove(retencionventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		retencionventaTotales=new RetencionVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RetencionVenta retencionventa:retencionventaLogic.getRetencionVentas()) {
				if(retencionventa.getsType().equals(Constantes2.S_TOTALES)) {
					retencionventaTotales=retencionventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RetencionVentaConstantesFunciones.TotalizarValoresFilaRetencionVenta(this.retencionventaLogic.getRetencionVentas(),retencionventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RetencionVenta retencionventa:this.retencionventas) {
				if(retencionventa.getsType().equals(Constantes2.S_TOTALES)) {
					retencionventaTotales=retencionventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RetencionVentaConstantesFunciones.TotalizarValoresFilaRetencionVenta(this.retencionventas,retencionventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRetencionVentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionVentasFK_IdPeriodoDeclara()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodoDeclara";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRetencionVentasFK_IdTipoRetencion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRetencion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRetencionVentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencionventaLogic.getRetencionVentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionVentasFK_IdPeriodoDeclara(String sFinalQuery,Long id_periodo_declara)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencionventaLogic.getRetencionVentasFK_IdPeriodoDeclara(sFinalQuery,this.pagination,id_periodo_declara);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRetencionVentasFK_IdTipoRetencion(String sFinalQuery,Long id_tipo_retencion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencionventaLogic.getRetencionVentasFK_IdTipoRetencion(sFinalQuery,this.pagination,id_tipo_retencion);
				
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
	
	public void inicializarPermisosRetencionVenta() {
		this.isPermisoTodoRetencionVenta=false;
		this.isPermisoNuevoRetencionVenta=false;
		this.isPermisoActualizarRetencionVenta=false;
		this.isPermisoActualizarOriginalRetencionVenta=false;
		this.isPermisoEliminarRetencionVenta=false;
		this.isPermisoGuardarCambiosRetencionVenta=false;
		this.isPermisoConsultaRetencionVenta=false;
		this.isPermisoBusquedaRetencionVenta=false;
		this.isPermisoReporteRetencionVenta=false;		
		this.isPermisoOrdenRetencionVenta=false;		
		this.isPermisoPaginacionMedioRetencionVenta=false;		
		this.isPermisoPaginacionAltoRetencionVenta=false;
		this.isPermisoPaginacionTodoRetencionVenta=false;
		this.isPermisoCopiarRetencionVenta=false;		
		this.isPermisoVerFormRetencionVenta=false;		
		this.isPermisoDuplicarRetencionVenta=false;		
		this.isPermisoOrdenRetencionVenta=false;		
	}
	
	public void setPermisosUsuarioRetencionVenta(Boolean isPermiso) {
		this.isPermisoTodoRetencionVenta=isPermiso;
		this.isPermisoNuevoRetencionVenta=isPermiso;
		this.isPermisoActualizarRetencionVenta=isPermiso;
		this.isPermisoActualizarOriginalRetencionVenta=isPermiso;
		this.isPermisoEliminarRetencionVenta=isPermiso;
		this.isPermisoGuardarCambiosRetencionVenta=isPermiso;
		this.isPermisoConsultaRetencionVenta=isPermiso;
		this.isPermisoBusquedaRetencionVenta=isPermiso;
		this.isPermisoReporteRetencionVenta=isPermiso;
		this.isPermisoOrdenRetencionVenta=isPermiso;		
		this.isPermisoPaginacionMedioRetencionVenta=isPermiso;		
		this.isPermisoPaginacionAltoRetencionVenta=isPermiso;		
		this.isPermisoPaginacionTodoRetencionVenta=isPermiso;		
		this.isPermisoCopiarRetencionVenta=isPermiso;		
		this.isPermisoVerFormRetencionVenta=isPermiso;		
		this.isPermisoDuplicarRetencionVenta=isPermiso;
		this.isPermisoOrdenRetencionVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRetencionVenta(Boolean isPermiso) {
		//this.isPermisoTodoRetencionVenta=isPermiso;
		this.isPermisoNuevoRetencionVenta=isPermiso;
		this.isPermisoActualizarRetencionVenta=isPermiso;
		this.isPermisoActualizarOriginalRetencionVenta=isPermiso;
		this.isPermisoEliminarRetencionVenta=isPermiso;
		this.isPermisoGuardarCambiosRetencionVenta=isPermiso;
		//this.isPermisoConsultaRetencionVenta=isPermiso;
		//this.isPermisoBusquedaRetencionVenta=isPermiso;
		//this.isPermisoReporteRetencionVenta=isPermiso;
		//this.isPermisoOrdenRetencionVenta=isPermiso;		
		//this.isPermisoPaginacionMedioRetencionVenta=isPermiso;		
		//this.isPermisoPaginacionAltoRetencionVenta=isPermiso;		
		//this.isPermisoPaginacionTodoRetencionVenta=isPermiso;		
		//this.isPermisoCopiarRetencionVenta=isPermiso;		
		//this.isPermisoDuplicarRetencionVenta=isPermiso;
		//this.isPermisoOrdenRetencionVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRetencionVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RetencionVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRetencionVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRetencionVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRetencionVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRetencionVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRetencionVentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRetencionVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RetencionVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.retencionventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RetencionVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRetencionVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRetencionVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRetencionVenta=this.isPermisoActualizarRetencionVenta;
			this.isPermisoEliminarRetencionVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRetencionVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRetencionVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRetencionVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRetencionVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRetencionVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRetencionVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRetencionVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRetencionVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRetencionVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRetencionVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRetencionVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRetencionVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRetencionVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.retencionventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRetencionVenta.setToolTipText(this.jTableDatosRetencionVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRetencionVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRetencionVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RetencionVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RetencionVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRetencionVenta() throws Exception {
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
	public void inicializarCombosForeignKeyRetencionVentaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.periododeclarasForeignKey=new ArrayList();
				this.tiporetencionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRetencionVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RetencionVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRetencionVentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRetencionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPeriodoDeclaraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periododeclarasForeignKey==null||this.periododeclarasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoDeclaraConstantesFunciones.getArrayColumnasGlobalesPeriodoDeclara(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoDeclaraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoDeclaraConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodoDeclarasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporetencionsForeignKey==null||this.tiporetencionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRetencionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRetencionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyRetencionVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RetencionVentaParameterReturnGeneral retencionventaReturnGeneral=new RetencionVentaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.retencionventaConstantesFunciones.cargarid_empresaRetencionVenta)
					 || (this.esRecargarFks && this.retencionventaConstantesFunciones.cargarid_empresaRetencionVenta)) {

					if(!this.retencionventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+retencionventaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalPeriodoDeclara="";

				if(((this.periododeclarasForeignKey==null||this.periododeclarasForeignKey.size()<=0) && this.retencionventaConstantesFunciones.cargarid_periodo_declaraRetencionVenta)
					 || (this.esRecargarFks && this.retencionventaConstantesFunciones.cargarid_periodo_declaraRetencionVenta)) {

					if(!this.retencionventaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoDeclaraConstantesFunciones.getArrayColumnasGlobalesPeriodoDeclara(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodoDeclara=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoDeclaraConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodoDeclara=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodoDeclara, "");
						finalQueryGlobalPeriodoDeclara+=PeriodoDeclaraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodoDeclarasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodoDeclara=" WHERE " + ConstantesSql.ID + "="+retencionventaSessionBean.getlidPeriodoDeclaraActual();
					}
				} else {
					finalQueryGlobalPeriodoDeclara="NONE";
				}


				String finalQueryGlobalTipoRetencion="";

				if(((this.tiporetencionsForeignKey==null||this.tiporetencionsForeignKey.size()<=0) && this.retencionventaConstantesFunciones.cargarid_tipo_retencionRetencionVenta)
					 || (this.esRecargarFks && this.retencionventaConstantesFunciones.cargarid_tipo_retencionRetencionVenta)) {

					if(!this.retencionventaSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoRetencion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoRetencion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoRetencion, "");
						finalQueryGlobalTipoRetencion+=TipoRetencionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoRetencionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoRetencion=" WHERE " + ConstantesSql.ID + "="+retencionventaSessionBean.getlidTipoRetencionActual();
					}
				} else {
					finalQueryGlobalTipoRetencion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				retencionventaReturnGeneral=retencionventaLogic.cargarCombosLoteForeignKeyRetencionVenta(finalQueryGlobalEmpresa,finalQueryGlobalPeriodoDeclara,finalQueryGlobalTipoRetencion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=retencionventaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalPeriodoDeclara.equals("NONE")) {
				this.periododeclarasForeignKey=retencionventaReturnGeneral.getperiododeclarasForeignKey();
			}

			if(!finalQueryGlobalTipoRetencion.equals("NONE")) {
				this.tiporetencionsForeignKey=retencionventaReturnGeneral.gettiporetencionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRetencionVenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyPeriodoDeclara();
			this.addItemDefectoCombosForeignKeyTipoRetencion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.retencionventaSessionBean==null) {
				this.retencionventaSessionBean=new RetencionVentaSessionBean();
			}

			if(!this.retencionventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyPeriodoDeclara()throws Exception {
		try {

			if(!this.retencionventaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodoDeclara()) {
				PeriodoDeclara periododeclara=new PeriodoDeclara();
				PeriodoDeclaraConstantesFunciones.setPeriodoDeclaraDescripcion(periododeclara,Constantes.SMENSAJE_ESCOJA_OPCION);
				periododeclara.setId(null);

				if(!PeriodoDeclaraConstantesFunciones.ExisteEnLista(this.periododeclarasForeignKey,periododeclara,true)) {

					this.periododeclarasForeignKey.add(0,periododeclara);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoRetencion()throws Exception {
		try {

			if(!this.retencionventaSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
				TipoRetencion tiporetencion=new TipoRetencion();
				TipoRetencionConstantesFunciones.setTipoRetencionDescripcion(tiporetencion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporetencion.setId(null);

				if(!TipoRetencionConstantesFunciones.ExisteEnLista(this.tiporetencionsForeignKey,tiporetencion,true)) {

					this.tiporetencionsForeignKey.add(0,tiporetencion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRetencionVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRetencionVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRetencionVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRetencionVenta(RetencionVenta retencionventa)throws Exception {	
		try {
			
			this.setActualPeriodoDeclaraForeignKey(retencionventa.getid_periodo_declara(),false,"Formulario");
			this.setActualTipoRetencionForeignKey(retencionventa.getid_tipo_retencion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRetencionVenta(RetencionVenta retencionventa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRetencionVenta()throws Exception {	
		try {
			
			this.setActualPeriodoDeclaraForeignKey(this.retencionventaConstantesFunciones.getid_periodo_declara(),false,"Formulario");
			this.setActualTipoRetencionForeignKey(this.retencionventaConstantesFunciones.getid_tipo_retencion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRetencionVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRetencionVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRetencionVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRetencionVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRetencionVenta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFramePeriodoDeclarasForeignKey("Todos");
			this.cargarCombosFrameTipoRetencionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRetencionVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodoDeclarasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRetencionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRetencionVenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public RetencionVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RetencionVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RetencionVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.retencionventaSessionBean=new RetencionVentaSessionBean(); 
		this.retencionventaConstantesFunciones=new RetencionVentaConstantesFunciones(); 
		this.retencionventaBean=new RetencionVenta();//(this.retencionventaConstantesFunciones); 		
		this.retencionventaReturnGeneral=new RetencionVentaParameterReturnGeneral(); 
		
		this.retencionventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.retencionventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RetencionVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RetencionVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RetencionVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRetencionVenta(true);
			
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
			
			this.retencionventaConstantesFunciones=new RetencionVentaConstantesFunciones(); 
			this.retencionventaBean=new RetencionVenta();//this.retencionventaConstantesFunciones); 			
			this.retencionventaReturnGeneral=new RetencionVentaParameterReturnGeneral(); 
		
			RetencionVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Retencion Venta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.retencionventa=new RetencionVenta();
			this.retencionventas = new ArrayList<RetencionVenta>();
			this.retencionventasAux = new ArrayList<RetencionVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic=new RetencionVentaLogic();
				this.retencionventaLogic.getNewConnexionToDeep("");
			}
			
			//this.retencionventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.retencionventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRetencionVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRetencionVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRetencionVenta);	
					}
					
					if(this.jInternalFrameImportacionRetencionVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRetencionVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRetencionVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRetencionVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRetencionVenta);
				this.jInternalFrameDetalleFormRetencionVenta.setVisible(false);
				this.jInternalFrameDetalleFormRetencionVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRetencionVenta);
					this.jInternalFrameReporteDinamicoRetencionVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoRetencionVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRetencionVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRetencionVenta);
					this.jInternalFrameImportacionRetencionVenta.setVisible(false);
					this.jInternalFrameImportacionRetencionVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRetencionVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRetencionVenta);
					this.jInternalFrameOrderByRetencionVenta.setVisible(false);
					this.jInternalFrameOrderByRetencionVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRetencionVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RetencionVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.retencionventaReturnGeneral=new RetencionVentaParameterReturnGeneral();
			
			this.retencionventaParameterGeneral=new RetencionVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.retencionventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RetencionVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.retencionventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RetencionVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.retencionventaSessionBean.getEsGuardarRelacionado(),this.retencionventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RetencionVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.retencionventaSessionBean.getEsGuardarRelacionado(),this.retencionventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRetencionVenta=false;
			this.isVisibilidadCeldaDuplicarRetencionVenta=true;
			this.isVisibilidadCeldaCopiarRetencionVenta=true;
			this.isVisibilidadCeldaVerFormRetencionVenta=true;
			this.isVisibilidadCeldaOrdenRetencionVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=false;
			this.isVisibilidadCeldaModificarRetencionVenta=false;
			this.isVisibilidadCeldaActualizarRetencionVenta=false;
			this.isVisibilidadCeldaEliminarRetencionVenta=false;
			this.isVisibilidadCeldaCancelarRetencionVenta=false;
			this.isVisibilidadCeldaGuardarRetencionVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPeriodoDeclara=true;
			this.isVisibilidadFK_IdTipoRetencion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRetencionVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRetencionVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRetencionVenta(false);
			
			this.setPermisosUsuarioRetencionVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencionventaSessionBean.getEsGuardarRelacionado() 
				|| (this.retencionventaSessionBean.getEsGuardarRelacionado() && this.retencionventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRetencionVentaClasesRelacionadas();
			}
			
			if(this.retencionventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRetencionVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRetencionVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRetencionVenta();
			}
			
			if(!this.isPermisoBusquedaRetencionVenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRetencionVenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRetencionVenta,this.isPermisoPaginacionMedioRetencionVenta,this.isPermisoPaginacionTodoRetencionVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RetencionVentaConstantesFunciones.getTiposSeleccionarRetencionVenta());
				
				this.tiposColumnasSelect=RetencionVentaConstantesFunciones.getTiposSeleccionarRetencionVenta(true);
				
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
			//if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRetencionVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioRetencionVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioRetencionVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionVenta() ;
			
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
			this.periododeclaraLogic=new PeriodoDeclaraLogic();
			this.tiporetencionLogic=new TipoRetencionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				retencionventaImplementable= (RetencionVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RetencionVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				retencionventaImplementableHome= (RetencionVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RetencionVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.retencionventas= new ArrayList<RetencionVenta>();
			this.retencionventasEliminados= new ArrayList<RetencionVenta>();
						
			this.isEsNuevoRetencionVenta=false;
			this.esParaAccionDesdeFormularioRetencionVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>() ;
			this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRetencionVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRetencionVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RetencionVentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RetencionVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRetencionVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRetencionVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRetencionVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRetencionVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRetencionVenta();
			}
			
			RetencionVentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRetencionVenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRetencionVenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRetencionVenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRetencionVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RetencionVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRetencionVenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRetencionVenta")) {
				iIndex=this.jInternalFrameDetalleFormRetencionVenta.jTabbedPaneRelacionesRetencionVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRetencionVenta.jTabbedPaneRelacionesRetencionVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRetencionVenta();	
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
	
	public void cargarCombosForeignKeyRetencionVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRetencionVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRetencionVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRetencionVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRetencionVenta();
		
		this.cargarCombosFrameForeignKeyRetencionVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRetencionVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRetencionVenta();
		}
	}
	
	

	public void cargarCombosForeignKeyPeriodoDeclara(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPeriodoDeclaraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPeriodoDeclara();
				this.cargarCombosFramePeriodoDeclarasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPeriodoDeclara(this.periododeclarasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRetencion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRetencionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRetencion();
				this.cargarCombosFrameTipoRetencionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRetencion(this.tiporetencionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRetencionVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.retencionventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
			
			if(jTableDatosRetencionVenta.getRowCount()>=1) {
				jTableDatosRetencionVenta.removeRowSelectionInterval(0, jTableDatosRetencionVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoRetencionVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRetencionVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRetencionVenta(true);			
			//this.retencionventa=new RetencionVenta();
			//this.retencionventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionVenta() ;
			
			if(RetencionVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.retencionventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);				
			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
			if(this.retencionventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RetencionVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRetencionVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRetencionVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRetencionVenta.getSelectedRows().length;			
			}
			
			retencionventasSeleccionados=this.getRetencionVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRetencionVenta--;			
				//RetencionVenta retencionventaAux= new RetencionVenta();			
				//retencionventaAux.setId(this.iIdNuevoRetencionVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RetencionVenta retencionventaOrigen=new RetencionVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RetencionVenta retencionventaOrigen : retencionventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							retencionventaOrigen =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							retencionventaOrigen =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRetencionVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.retencionventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRetencionVenta(retencionventaOrigen,this.retencionventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.retencionventaLogic.getRetencionVentas().add(this.retencionventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.retencionventas.add(this.retencionventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRetencionVenta(false);
				
				this.jTableDatosRetencionVenta.setRowSelectionInterval(this.getIndiceNuevoRetencionVenta(), this.getIndiceNuevoRetencionVenta());
				
				int iLastRow =  this.jTableDatosRetencionVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRetencionVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRetencionVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRetencionVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();									
		
			RetencionVenta retencionventaOrigen=new RetencionVenta();
			RetencionVenta retencionventaDestino=new RetencionVenta();
				
			retencionventasSeleccionados=this.getRetencionVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRetencionVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || retencionventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRetencionVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionventaOrigen =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						retencionventaOrigen =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						retencionventaDestino =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						retencionventaDestino =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				retencionventaOrigen =retencionventasSeleccionados.get(0);
				retencionventaDestino =retencionventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRetencionVenta(retencionventaOrigen,retencionventaDestino,true,false);
				
				retencionventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(retencionventaDestino,retencionventaLogic.getRetencionVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(retencionventaDestino,retencionventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRetencionVenta(false);
				
				//this.jTableDatosRetencionVenta.setRowSelectionInterval(this.getIndiceNuevoRetencionVenta(), this.getIndiceNuevoRetencionVenta());
				
				int iLastRow =  this.jTableDatosRetencionVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRetencionVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRetencionVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRetencionVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRetencionVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRetencionVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRetencionVenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRetencionVenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRetencionVenta.setVisible(!isVisible);
			this.jPanelPaginacionRetencionVenta.setVisible(!isVisible);
			this.jPanelAccionesRetencionVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRetencionVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRetencionVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRetencionVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRetencionVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRetencionVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRetencionVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRetencionVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRetencionVenta();
			
			this.abrirFrameOrderByRetencionVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRetencionVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRetencionVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRetencionVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRetencionVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRetencionVenta.isMaximum()) {
					this.jInternalFrameDetalleFormRetencionVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRetencionVenta.setSize(this.jInternalFrameDetalleFormRetencionVenta.iWidthFormulario,this.jInternalFrameDetalleFormRetencionVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRetencionVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRetencionVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRetencionVenta.isMaximum()) {
						this.jInternalFrameDetalleFormRetencionVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRetencionVenta.jContentPaneDetalleRetencionVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRetencionVenta.jTabbedPaneRelacionesRetencionVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRetencionVenta.jContentPaneDetalleRetencionVenta.getWidth(),RetencionVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRetencionVenta.jTabbedPaneRelacionesRetencionVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRetencionVenta.jContentPaneDetalleRetencionVenta.getWidth(),RetencionVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRetencionVenta.jTabbedPaneRelacionesRetencionVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRetencionVenta.jContentPaneDetalleRetencionVenta.getWidth(),RetencionVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRetencionVenta.setVisible(true);
	        this.jInternalFrameDetalleFormRetencionVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRetencionVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRetencionVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRetencionVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionVenta,false,this);
				} else {
					this.jInternalFrameOrderByRetencionVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRetencionVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRetencionVenta);
				this.jInternalFrameOrderByRetencionVenta.setVisible(false);
				this.jInternalFrameOrderByRetencionVenta.setSelected(false);
				
				this.jInternalFrameOrderByRetencionVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRetencionVenta"));
				
				this.inicializarActualizarBindingTablaOrderByRetencionVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRetencionVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRetencionVenta==null) {
				
				this.jInternalFrameImportacionRetencionVenta=new ImportacionJInternalFrame(RetencionVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRetencionVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRetencionVenta);
				this.jInternalFrameImportacionRetencionVenta.setVisible(false);
				this.jInternalFrameImportacionRetencionVenta.setSelected(false);


				this.jInternalFrameImportacionRetencionVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRetencionVenta"));
				this.jInternalFrameImportacionRetencionVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRetencionVenta"));
				this.jInternalFrameImportacionRetencionVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRetencionVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRetencionVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRetencionVenta==null) {
				this.jInternalFrameReporteDinamicoRetencionVenta=new ReporteDinamicoJInternalFrame(RetencionVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRetencionVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRetencionVenta);
				this.jInternalFrameReporteDinamicoRetencionVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoRetencionVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRetencionVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionVenta"));
				this.jInternalFrameReporteDinamicoRetencionVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionVenta"));
				this.jInternalFrameReporteDinamicoRetencionVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRetencionVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRetencionVenta);
			
	       	this.jInternalFrameDetalleFormRetencionVenta.setVisible(false);
	        this.jInternalFrameDetalleFormRetencionVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormRetencionVenta.dispose();
			//this.jInternalFrameDetalleFormRetencionVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRetencionVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRetencionVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoRetencionVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRetencionVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRetencionVenta.setVisible(true);
	        this.jInternalFrameImportacionRetencionVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRetencionVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRetencionVenta.setVisible(true);
	        this.jInternalFrameOrderByRetencionVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRetencionVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRetencionVenta.setVisible(false);
	        this.jInternalFrameOrderByRetencionVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRetencionVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRetencionVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoRetencionVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRetencionVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRetencionVenta.setVisible(false);
	        this.jInternalFrameImportacionRetencionVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRetencionVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRetencionVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRetencionVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRetencionVenta(true);
			//this.isEsNuevoRetencionVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRetencionVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionVenta(false) ;
			
			if(retencionventaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RetencionVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRetencionVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRetencionVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRetencionVenta(true);
			//this.isEsNuevoRetencionVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.retencionventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRetencionVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRetencionVenta(false) ;
			
			if(RetencionVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRetencionVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaPeriodoDeclara(List<PeriodoDeclara> periododeclarasForeignKey)throws Exception{
		TableColumn tableColumnPeriodoDeclara=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA));
		TableCellEditor tableCellEditorPeriodoDeclara =tableColumnPeriodoDeclara.getCellEditor();

		PeriodoDeclaraTableCell periododeclaraTableCellFk=(PeriodoDeclaraTableCell)tableCellEditorPeriodoDeclara;

		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.setperiododeclarasForeignKey(periododeclarasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRetencionVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periododeclaraTableCellFk.setRowActual(intSelectedRow);
			//periododeclaraTableCellFk.setperiododeclarasForeignKeyActual(periododeclarasForeignKey);
		//}


		if(periododeclaraTableCellFk!=null) {
			periododeclaraTableCellFk.RecargarPeriodoDeclarasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoRetencion(List<TipoRetencion> tiporetencionsForeignKey)throws Exception{
		TableColumn tableColumnTipoRetencion=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION));
		TableCellEditor tableCellEditorTipoRetencion =tableColumnTipoRetencion.getCellEditor();

		TipoRetencionTableCell tiporetencionTableCellFk=(TipoRetencionTableCell)tableCellEditorTipoRetencion;

		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.settiporetencionsForeignKey(tiporetencionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRetencionVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporetencionTableCellFk.setRowActual(intSelectedRow);
			//tiporetencionTableCellFk.settiporetencionsForeignKeyActual(tiporetencionsForeignKey);
		//}


		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.RecargarTipoRetencionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRetencionVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRetencionVenta(false);
			
			//if(!this.isEsNuevoRetencionVenta) {								
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RetencionVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				
			}
			
			if(this.permiteMantenimiento(this.retencionventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRetencionVenta=true;
					this.inicializarActualizarBindingTablaRetencionVenta(false);
					this.isEsNuevoRetencionVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRetencionVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRetencionVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRetencionVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionVenta(false);
				
				this.habilitarDeshabilitarControlesRetencionVenta(false);
			
												
				
				if(RetencionVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRetencionVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRetencionVentaActionPerformed(evt,retencionventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRetencionVenta(this.retencionventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRetencionVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,retencionventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.retencionventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RetencionVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRetencionVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				this.retencionventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				this.retencionventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.retencionventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RetencionVentaModel) this.jTableDatosRetencionVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRetencionVenta=true;
				this.inicializarActualizarBindingTablaRetencionVenta(false);
				this.isEsNuevoRetencionVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRetencionVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionVenta(false);
				
				this.habilitarDeshabilitarControlesRetencionVenta(false);
				
				
				
				if(RetencionVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRetencionVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRetencionVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRetencionVenta.getRowCount()>=1) {
				jTableDatosRetencionVenta.removeRowSelectionInterval(0, jTableDatosRetencionVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRetencionVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRetencionVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRetencionVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRetencionVenta(false) ;
			
			this.isEsNuevoRetencionVenta=false;
			
			if(RetencionVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRetencionVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRetencionVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRetencionVenta(false);
				
				//SI ES MANUAL
				if(RetencionVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRetencionVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRetencionVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRetencionVenta--;			
			//RetencionVenta retencionventaAux= new RetencionVenta();			
			//retencionventaAux.setId(this.iIdNuevoRetencionVenta);
			
			if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRetencionVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
			
			this.retencionventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.retencionventaLogic.getRetencionVentas().add(this.retencionventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.retencionventas.add(this.retencionventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRetencionVenta(false);
			
			this.jTableDatosRetencionVenta.setRowSelectionInterval(this.getIndiceNuevoRetencionVenta(), this.getIndiceNuevoRetencionVenta());
			
			int iLastRow =  this.jTableDatosRetencionVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRetencionVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRetencionVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRetencionVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRetencionVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRetencionVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionVenta(false);
			
			//SI ES MANUAL
			if(RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionVenta();
			}
			
			//this.abrirFrameTreeRetencionVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRetencionVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Retencion VentaS ?", "MANTENIMIENTO DE Retencion Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRetencionVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRetencionVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.retencionventaReturnGeneral=retencionventaLogic.procesarImportacionRetencionVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.retencionventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRetencionVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRetencionVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRetencionVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRetencionVenta.setFileImportacion(this.jInternalFrameImportacionRetencionVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRetencionVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRetencionVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRetencionVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRetencionVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRetencionVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();		

		retencionventasSeleccionados=this.getRetencionVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RetencionVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RetencionVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteRetencionVentas("Todos",retencionventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion Venta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RetencionVentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PeriodoDeclara_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PeriodoDeclara_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PeriodoDeclara_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PeriodoDeclara_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionVentaConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_seImponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_seImponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_seImponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_seImponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionVentaConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionVentaConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RetencionVentaConstantesFunciones.LABEL_ESDEBITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Debito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Debito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Debito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Debito_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRetencionVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RetencionVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA:
					sNombreCampoCategoria="id_periodo_declara";
					break;

				case RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION:
					sNombreCampoCategoria="id_tipo_retencion";
					break;

				case RetencionVentaConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION:
					sNombreCampoCategoria="numero_retencion";
					break;

				case RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoria="base_imponible";
					break;

				case RetencionVentaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case RetencionVentaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case RetencionVentaConstantesFunciones.LABEL_ESDEBITO:
					sNombreCampoCategoria="es_debito";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RetencionVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA:
					sNombreCampoCategoriaValor="id_periodo_declara";
					break;

				case RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION:
					sNombreCampoCategoriaValor="id_tipo_retencion";
					break;

				case RetencionVentaConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION:
					sNombreCampoCategoriaValor="numero_retencion";
					break;

				case RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE:
					sNombreCampoCategoriaValor="base_imponible";
					break;

				case RetencionVentaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case RetencionVentaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case RetencionVentaConstantesFunciones.LABEL_ESDEBITO:
					sNombreCampoCategoriaValor="es_debito";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RetencionVentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo Declara",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo_declara");
					break;

				case RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_retencion");
					break;

				case RetencionVentaConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nro Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_retencion");
					break;

				case RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Base Imponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"base_imponible");
					break;

				case RetencionVentaConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case RetencionVentaConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case RetencionVentaConstantesFunciones.LABEL_ESDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_debito");
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
	
	public void jButtonGenerarExcelReporteDinamicoRetencionVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();		
		
		retencionventasSeleccionados=this.getRetencionVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RetencionVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RetencionVentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RetencionVenta retencionventa:retencionventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionventa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA);
					iRow++;

					for(RetencionVenta retencionventa:retencionventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionventa.getperiododeclara_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION);
					iRow++;

					for(RetencionVenta retencionventa:retencionventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionventa.gettiporetencion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionVentaConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_RUC);
					iRow++;

					for(RetencionVenta retencionventa:retencionventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionventa.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION);
					iRow++;

					for(RetencionVenta retencionventa:retencionventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionventa.getnumero_retencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE);
					iRow++;

					for(RetencionVenta retencionventa:retencionventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionventa.getbase_imponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionVentaConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(RetencionVenta retencionventa:retencionventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionventa.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionVentaConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(RetencionVenta retencionventa:retencionventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionventa.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RetencionVentaConstantesFunciones.LABEL_ESDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_ESDEBITO);
					iRow++;

					for(RetencionVenta retencionventa:retencionventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(retencionventa.getes_debito());
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
			//	this.getFilaCabeceraExportarExcelRetencionVenta(row);				
			//	iRow++;
			//}				
			
			//for(RetencionVenta retencionventaAux:retencionventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRetencionVenta(retencionventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion Venta",JOptionPane.INFORMATION_MESSAGE);
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
				this.retencionventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionVenta(false);
			
			//SI ES MANUAL
			if(RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRetencionVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRetencionVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionVenta(false);
			
			//SI ES MANUAL
			if(RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRetencionVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRetencionVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRetencionVenta(false);
			
			//SI ES MANUAL
			if(RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRetencionVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRetencionVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRetencionVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRetencionVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRetencionVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRetencionVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRetencionVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosRetencionVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosRetencionVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRetencionVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRetencionVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRetencionVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRetencionVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRetencionVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRetencionVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRetencionVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RetencionVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRetencionVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRetencionVenta();
		
		this.inicializarActualizarBindingBotonesManualRetencionVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRetencionVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRetencionVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRetencionVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRetencionVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRetencionVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxPostAccionNuevoRetencionVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxPostAccionSinCerrarRetencionVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxPostAccionSinMensajeRetencionVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRetencionVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRetencionVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRetencionVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
				this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxPostAccionNuevoRetencionVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxPostAccionSinCerrarRetencionVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxPostAccionSinMensajeRetencionVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRetencionVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRetencionVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRetencionVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRetencionVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRetencionVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRetencionVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRetencionVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRetencionVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRetencionVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRetencionVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRetencionVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRetencionVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRetencionVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRetencionVenta() throws Exception {
		try	{
			if(RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRetencionVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRetencionVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRetencionVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRetencionVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRetencionVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRetencionVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRetencionVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRetencionVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRetencionVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRetencionVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRetencionVenta.addItem(reporte);
			}
			
			
			if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRetencionVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRetencionVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRetencionVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRetencionVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRetencionVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRetencionVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRetencionVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRetencionVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRetencionVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRetencionVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRetencionVenta!=null) {
				this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRetencionVenta!=null) {
				this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRetencionVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRetencionVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRetencionVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RetencionVentaConstantesFunciones.getTiposSeleccionarRetencionVenta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RetencionVentaConstantesFunciones.getTiposSeleccionarRetencionVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RetencionVentaConstantesFunciones.getTiposSeleccionarRetencionVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRetencionVenta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRetencionVenta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRetencionVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.getSelectedItem()!=null){this.id_periodo_declaraFK_IdPeriodoDeclara=((PeriodoDeclara)this.jComboBoxid_periodo_declaraFK_IdPeriodoDeclaraRetencionVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.getSelectedItem()!=null){this.id_tipo_retencionFK_IdTipoRetencion=((TipoRetencion)this.jComboBoxid_tipo_retencionFK_IdTipoRetencionRetencionVenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRetencionVenta(Boolean esInicializar) throws Exception {				
		if(RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRetencionVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRetencionVenta() throws Exception {
		this.inicializarActualizarBindingTablaRetencionVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRetencionVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRetencionVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRetencionVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=retencionventaLogic.getRetencionVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=retencionventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RetencionVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRetencionVenta.setModel(new RetencionVentaModel(this.retencionventaLogic.getRetencionVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRetencionVenta.setModel(new RetencionVentaModel(this.retencionventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRetencionVenta!=null && this.jInternalFrameOrderByRetencionVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRetencionVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO,retencionventaConstantesFunciones.resaltarSeleccionarRetencionVenta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RetencionVentaConstantesFunciones.SCLASSWEBTITULO,retencionventaConstantesFunciones.resaltarSeleccionarRetencionVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_ID));

		if(this.retencionventaConstantesFunciones.mostraridRetencionVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionventaConstantesFunciones.resaltaridRetencionVenta,this.retencionventaConstantesFunciones.activaridRetencionVenta,iSizeTabla,this,true,"idRetencionVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionventaConstantesFunciones.resaltaridRetencionVenta,this.retencionventaConstantesFunciones.activaridRetencionVenta,this,true,"idRetencionVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.retencionventaConstantesFunciones.mostrarid_empresaRetencionVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionVentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.retencionventaConstantesFunciones.resaltarid_empresaRetencionVenta,this,this.retencionventaConstantesFunciones.activarid_empresaRetencionVenta,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.retencionventaConstantesFunciones.resaltarid_empresaRetencionVenta,this,this.retencionventaConstantesFunciones.activarid_empresaRetencionVenta,false,"id_empresaRetencionVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA));

		if(this.retencionventaConstantesFunciones.mostrarid_periodo_declaraRetencionVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PeriodoDeclaraTableCell(this.periododeclarasForeignKey,this.retencionventaConstantesFunciones.resaltarid_periodo_declaraRetencionVenta,this,this.retencionventaConstantesFunciones.activarid_periodo_declaraRetencionVenta,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoDeclaraTableCell(this.periododeclarasForeignKey,this.retencionventaConstantesFunciones.resaltarid_periodo_declaraRetencionVenta,this,this.retencionventaConstantesFunciones.activarid_periodo_declaraRetencionVenta,true,"id_periodo_declaraRetencionVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION));

		if(this.retencionventaConstantesFunciones.mostrarid_tipo_retencionRetencionVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRetencionTableCell(this.tiporetencionsForeignKey,this.retencionventaConstantesFunciones.resaltarid_tipo_retencionRetencionVenta,this,this.retencionventaConstantesFunciones.activarid_tipo_retencionRetencionVenta,iSizeTabla));
			tableColumn.setCellEditor(new TipoRetencionTableCell(this.tiporetencionsForeignKey,this.retencionventaConstantesFunciones.resaltarid_tipo_retencionRetencionVenta,this,this.retencionventaConstantesFunciones.activarid_tipo_retencionRetencionVenta,true,"id_tipo_retencionRetencionVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_RUC));

		if(this.retencionventaConstantesFunciones.mostrarrucRetencionVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionVentaConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionventaConstantesFunciones.resaltarrucRetencionVenta,this.retencionventaConstantesFunciones.activarrucRetencionVenta,iSizeTabla,this,true,"rucRetencionVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionventaConstantesFunciones.resaltarrucRetencionVenta,this.retencionventaConstantesFunciones.activarrucRetencionVenta,this,true,"rucRetencionVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION));

		if(this.retencionventaConstantesFunciones.mostrarnumero_retencionRetencionVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.retencionventaConstantesFunciones.resaltarnumero_retencionRetencionVenta,this.retencionventaConstantesFunciones.activarnumero_retencionRetencionVenta,iSizeTabla,this,true,"numero_retencionRetencionVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionventaConstantesFunciones.resaltarnumero_retencionRetencionVenta,this.retencionventaConstantesFunciones.activarnumero_retencionRetencionVenta,this,true,"numero_retencionRetencionVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE));

		if(this.retencionventaConstantesFunciones.mostrarbase_imponibleRetencionVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionventaConstantesFunciones.resaltarbase_imponibleRetencionVenta,this.retencionventaConstantesFunciones.activarbase_imponibleRetencionVenta,iSizeTabla,this,true,"base_imponibleRetencionVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionventaConstantesFunciones.resaltarbase_imponibleRetencionVenta,this.retencionventaConstantesFunciones.activarbase_imponibleRetencionVenta,this,true,"base_imponibleRetencionVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_PORCENTAJE));

		if(this.retencionventaConstantesFunciones.mostrarporcentajeRetencionVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionVentaConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionventaConstantesFunciones.resaltarporcentajeRetencionVenta,this.retencionventaConstantesFunciones.activarporcentajeRetencionVenta,iSizeTabla,this,true,"porcentajeRetencionVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionventaConstantesFunciones.resaltarporcentajeRetencionVenta,this.retencionventaConstantesFunciones.activarporcentajeRetencionVenta,this,true,"porcentajeRetencionVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_VALOR));

		if(this.retencionventaConstantesFunciones.mostrarvalorRetencionVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionVentaConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.retencionventaConstantesFunciones.resaltarvalorRetencionVenta,this.retencionventaConstantesFunciones.activarvalorRetencionVenta,iSizeTabla,this,true,"valorRetencionVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.retencionventaConstantesFunciones.resaltarvalorRetencionVenta,this.retencionventaConstantesFunciones.activarvalorRetencionVenta,this,true,"valorRetencionVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,RetencionVentaConstantesFunciones.LABEL_ESDEBITO));

		if(this.retencionventaConstantesFunciones.mostrares_debitoRetencionVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RetencionVentaConstantesFunciones.LABEL_ESDEBITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.retencionventaConstantesFunciones.resaltares_debitoRetencionVenta,this.retencionventaConstantesFunciones.activares_debitoRetencionVenta,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.retencionventaConstantesFunciones.resaltares_debitoRetencionVenta,this.retencionventaConstantesFunciones.activares_debitoRetencionVenta,this,true,"es_debitoRetencionVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RetencionVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.retencionventaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.retencionventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.retencionventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRetencionVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.retencionventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.retencionventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRetencionVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.retencionventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.retencionventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRetencionVenta.addColumn(tableColumn);
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
			
			this.jTableDatosRetencionVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRetencionVenta.moveColumn(this.jTableDatosRetencionVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRetencionVenta.moveColumn(this.jTableDatosRetencionVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRetencionVenta.moveColumn(this.jTableDatosRetencionVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRetencionVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRetencionVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRetencionVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRetencionVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRetencionVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RetencionVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRetencionVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRetencionVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRetencionVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=retencionventaLogic.getRetencionVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=retencionventas.size()-1;
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
		//this.jTableDatosRetencionVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRetencionVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRetencionVenta();
			
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
				
				//this.isEsNuevoRetencionVenta=false;
					
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
				if(this.retencionventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRetencionVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRetencionVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRetencionVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.retencionventa.getsType().equals("DUPLICADO")
				   || this.retencionventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRetencionVenta=true;
				
				} else {
					this.isEsNuevoRetencionVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.retencionventaSessionBean.getEsGuardarRelacionado()) {
					if(this.retencionventa.getId()>=0 && !this.retencionventa.getIsNew()) {						
						this.isEsNuevoRetencionVenta=false;
						
					} else {
						this.isEsNuevoRetencionVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRetencionVenta(esRelaciones);						
				
				this.seleccionarRetencionVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.retencionventa.getId()<0) {
					this.isEsNuevoRetencionVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRetencionVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRetencionVenta(evt,rowIndex);
				}	
				
				if(this.retencionventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RetencionVenta: " + this.dDif); 
					}
				}								
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRetencionVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.retencionventa)) {
					if(this.retencionventa.getId()>0) {
						this.retencionventa.setIsDeleted(true);
						
						this.retencionventasEliminados.add(this.retencionventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.retencionventaLogic.getRetencionVentas().remove(this.retencionventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.retencionventas.remove(this.retencionventa);				
					}
					
					
					((RetencionVentaModel) this.jTableDatosRetencionVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRetencionVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRetencionVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRetencionVenta) {
			
			if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRetencionVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRetencionVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RetencionVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRetencionVenta(this.retencionventa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.retencionventaConstantesFunciones.cargarid_empresaRetencionVenta || this.retencionventaConstantesFunciones.event_dependid_empresaRetencionVenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.retencionventa.getid_empresa());
									//this.inicializarActualizarBindingRetencionVenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(retencionventa.getEmpresa()!=null) {
							this.empresasForeignKey.add(retencionventa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.retencionventa.getid_empresa(),false,"Formulario");

					//PeriodoDeclara
					if(!this.retencionventaConstantesFunciones.cargarid_periodo_declaraRetencionVenta || this.retencionventaConstantesFunciones.event_dependid_periodo_declaraRetencionVenta) {
						//this.cargarCombosPeriodoDeclarasForeignKeyLista(" where id="+this.retencionventa.getid_periodo_declara());
									//this.inicializarActualizarBindingRetencionVenta(false,false);
						this.periododeclarasForeignKey=new ArrayList<PeriodoDeclara>();

						if(retencionventa.getPeriodoDeclara()!=null) {
							this.periododeclarasForeignKey.add(retencionventa.getPeriodoDeclara());
						}

						this.addItemDefectoCombosForeignKeyPeriodoDeclara();
						this.cargarCombosFramePeriodoDeclarasForeignKey("Todos");
					}
					this.setActualPeriodoDeclaraForeignKey(this.retencionventa.getid_periodo_declara(),false,"Formulario");

					//TipoRetencion
					if(!this.retencionventaConstantesFunciones.cargarid_tipo_retencionRetencionVenta || this.retencionventaConstantesFunciones.event_dependid_tipo_retencionRetencionVenta) {
						//this.cargarCombosTipoRetencionsForeignKeyLista(" where id="+this.retencionventa.getid_tipo_retencion());
									//this.inicializarActualizarBindingRetencionVenta(false,false);
						this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>();

						if(retencionventa.getTipoRetencion()!=null) {
							this.tiporetencionsForeignKey.add(retencionventa.getTipoRetencion());
						}

						this.addItemDefectoCombosForeignKeyTipoRetencion();
						this.cargarCombosFrameTipoRetencionsForeignKey("Todos");
					}
					this.setActualTipoRetencionForeignKey(this.retencionventa.getid_tipo_retencion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRetencionVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRetencionVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRetencionVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRetencionVenta(RetencionVenta retencionventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRetencionVenta(retencionventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRetencionVenta(RetencionVenta retencionventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRetencionVenta(retencionventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRetencionVenta(retencionventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRetencionVenta(retencionventa);
	}
	
	public void setVariablesObjetoActualToFormularioRetencionVenta(RetencionVenta retencionventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRetencionVenta.jLabelidRetencionVenta.setText(retencionventa.getId().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldrucRetencionVenta.setText(retencionventa.getruc());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldnumero_retencionRetencionVenta.setText(retencionventa.getnumero_retencion());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldbase_imponibleRetencionVenta.setText(retencionventa.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldporcentajeRetencionVenta.setText(retencionventa.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldvalorRetencionVenta.setText(retencionventa.getvalor().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxes_debitoRetencionVenta.setSelected(retencionventa.getes_debito());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RetencionVenta retencionventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,retencionventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RetencionVenta retencionventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				retencionventaLocal=this.retencionventa;
			} else {
				retencionventaLocal=this.retencionventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(retencionventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRetencionVenta(retencionventaLocal,true);
					
					if(retencionventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(retencionventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.retencionventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(retencionventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRetencionVenta(RetencionVenta retencionventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRetencionVenta(retencionventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(retencionventa);
	}
	
	public void setVariablesFormularioToObjetoActualRetencionVenta(RetencionVenta retencionventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRetencionVenta(retencionventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRetencionVenta(RetencionVenta retencionventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRetencionVenta.jLabelidRetencionVenta.getText()==null || this.jInternalFrameDetalleFormRetencionVenta.jLabelidRetencionVenta.getText()=="" || this.jInternalFrameDetalleFormRetencionVenta.jLabelidRetencionVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormRetencionVenta.jLabelidRetencionVenta.setText("0");
			}

			if(conColumnasBase) {retencionventa.setId(Long.parseLong(this.jInternalFrameDetalleFormRetencionVenta.jLabelidRetencionVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelIdRetencionVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionventa.setruc(this.jInternalFrameDetalleFormRetencionVenta.jTextFieldrucRetencionVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionVentaConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelrucRetencionVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionventa.setnumero_retencion(this.jInternalFrameDetalleFormRetencionVenta.jTextFieldnumero_retencionRetencionVenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelnumero_retencionRetencionVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionventa.setbase_imponible(Double.parseDouble(this.jInternalFrameDetalleFormRetencionVenta.jTextFieldbase_imponibleRetencionVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelbase_imponibleRetencionVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionventa.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormRetencionVenta.jTextFieldporcentajeRetencionVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionVentaConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelporcentajeRetencionVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionventa.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormRetencionVenta.jTextFieldvalorRetencionVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionVentaConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabelvalorRetencionVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			retencionventa.setes_debito(this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxes_debitoRetencionVenta.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RetencionVentaConstantesFunciones.LABEL_ESDEBITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRetencionVenta.jLabeles_debitoRetencionVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRetencionVenta(RetencionVenta retencionventaBean,RetencionVenta retencionventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && retencionventaBean.getid_periodo_declara()!=null && !retencionventaBean.getid_periodo_declara().equals(-1L))) {retencionventa.setid_periodo_declara(retencionventaBean.getid_periodo_declara());}
			if(conDefault || (!conDefault && retencionventaBean.getid_tipo_retencion()!=null && !retencionventaBean.getid_tipo_retencion().equals(-1L))) {retencionventa.setid_tipo_retencion(retencionventaBean.getid_tipo_retencion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRetencionVenta(RetencionVenta retencionventaOrigen,RetencionVenta retencionventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && retencionventaOrigen.getId()!=null && !retencionventaOrigen.getId().equals(0L))) {retencionventa.setId(retencionventaOrigen.getId());}}
			if(conDefault || (!conDefault && retencionventaOrigen.getid_periodo_declara()!=null && !retencionventaOrigen.getid_periodo_declara().equals(-1L))) {retencionventa.setid_periodo_declara(retencionventaOrigen.getid_periodo_declara());}
			if(conDefault || (!conDefault && retencionventaOrigen.getid_tipo_retencion()!=null && !retencionventaOrigen.getid_tipo_retencion().equals(-1L))) {retencionventa.setid_tipo_retencion(retencionventaOrigen.getid_tipo_retencion());}
			if(conDefault || (!conDefault && retencionventaOrigen.getruc()!=null && !retencionventaOrigen.getruc().equals(""))) {retencionventa.setruc(retencionventaOrigen.getruc());}
			if(conDefault || (!conDefault && retencionventaOrigen.getnumero_retencion()!=null && !retencionventaOrigen.getnumero_retencion().equals(""))) {retencionventa.setnumero_retencion(retencionventaOrigen.getnumero_retencion());}
			if(conDefault || (!conDefault && retencionventaOrigen.getbase_imponible()!=null && !retencionventaOrigen.getbase_imponible().equals(0.0))) {retencionventa.setbase_imponible(retencionventaOrigen.getbase_imponible());}
			if(conDefault || (!conDefault && retencionventaOrigen.getporcentaje()!=null && !retencionventaOrigen.getporcentaje().equals(0.0))) {retencionventa.setporcentaje(retencionventaOrigen.getporcentaje());}
			if(conDefault || (!conDefault && retencionventaOrigen.getvalor()!=null && !retencionventaOrigen.getvalor().equals(0.0))) {retencionventa.setvalor(retencionventaOrigen.getvalor());}
			if(conDefault || (!conDefault && retencionventaOrigen.getes_debito()!=null && !retencionventaOrigen.getes_debito().equals(false))) {retencionventa.setes_debito(retencionventaOrigen.getes_debito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRetencionVenta(RetencionVenta retencionventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRetencionVenta.jLabelidRetencionVenta.setText(retencionventa.getId().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldrucRetencionVenta.setText(retencionventa.getruc());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldnumero_retencionRetencionVenta.setText(retencionventa.getnumero_retencion());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldbase_imponibleRetencionVenta.setText(retencionventa.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldporcentajeRetencionVenta.setText(retencionventa.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldvalorRetencionVenta.setText(retencionventa.getvalor().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxes_debitoRetencionVenta.setSelected(retencionventa.getes_debito());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRetencionVenta(RetencionVentaBean retencionventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRetencionVenta.jLabelidRetencionVenta.setText(retencionventaBean.getId().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldrucRetencionVenta.setText(retencionventaBean.getruc());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldnumero_retencionRetencionVenta.setText(retencionventaBean.getnumero_retencion());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldbase_imponibleRetencionVenta.setText(retencionventaBean.getbase_imponible().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldporcentajeRetencionVenta.setText(retencionventaBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jTextFieldvalorRetencionVenta.setText(retencionventaBean.getvalor().toString());
			this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxes_debitoRetencionVenta.setSelected(retencionventaBean.getes_debito());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRetencionVenta(RetencionVentaParameterReturnGeneral retencionventaReturnGeneral,RetencionVentaBean retencionventaBean,Boolean conDefault) throws Exception { 
		try {
			RetencionVenta retencionventaLocal=new RetencionVenta();
			
			retencionventaLocal=retencionventaReturnGeneral.getRetencionVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && retencionventaLocal.getId()!=null && !retencionventaLocal.getId().equals(0L))) {retencionventaBean.setId(retencionventaLocal.getId());}}
			if(conDefault || (!conDefault && retencionventaLocal.getid_periodo_declara()!=null && !retencionventaLocal.getid_periodo_declara().equals(-1L))) {retencionventaBean.setid_periodo_declara(retencionventaLocal.getid_periodo_declara());}
			if(conDefault || (!conDefault && retencionventaLocal.getid_tipo_retencion()!=null && !retencionventaLocal.getid_tipo_retencion().equals(-1L))) {retencionventaBean.setid_tipo_retencion(retencionventaLocal.getid_tipo_retencion());}
			if(conDefault || (!conDefault && retencionventaLocal.getruc()!=null && !retencionventaLocal.getruc().equals(""))) {retencionventaBean.setruc(retencionventaLocal.getruc());}
			if(conDefault || (!conDefault && retencionventaLocal.getnumero_retencion()!=null && !retencionventaLocal.getnumero_retencion().equals(""))) {retencionventaBean.setnumero_retencion(retencionventaLocal.getnumero_retencion());}
			if(conDefault || (!conDefault && retencionventaLocal.getbase_imponible()!=null && !retencionventaLocal.getbase_imponible().equals(0.0))) {retencionventaBean.setbase_imponible(retencionventaLocal.getbase_imponible());}
			if(conDefault || (!conDefault && retencionventaLocal.getporcentaje()!=null && !retencionventaLocal.getporcentaje().equals(0.0))) {retencionventaBean.setporcentaje(retencionventaLocal.getporcentaje());}
			if(conDefault || (!conDefault && retencionventaLocal.getvalor()!=null && !retencionventaLocal.getvalor().equals(0.0))) {retencionventaBean.setvalor(retencionventaLocal.getvalor());}
			if(conDefault || (!conDefault && retencionventaLocal.getes_debito()!=null && !retencionventaLocal.getes_debito().equals(false))) {retencionventaBean.setes_debito(retencionventaLocal.getes_debito());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRetencionVentaGenerico(Long idRetencionVentaSeleccionado,JComboBox jComboBoxRetencionVenta,List<RetencionVenta> retencionventasLocal)throws Exception {
		try {
			RetencionVenta  retencionventaTemp=null;

			for(RetencionVenta retencionventaAux:retencionventasLocal) {
				if(retencionventaAux.getId()!=null && retencionventaAux.getId().equals(idRetencionVentaSeleccionado)) {
					retencionventaTemp=retencionventaAux;
					break;
				}
			}

			jComboBoxRetencionVenta.setSelectedItem(retencionventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRetencionVentaGenerico(JComboBox jComboBoxRetencionVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRetencionVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRetencionVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRetencionVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRetencionVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRetencionVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRetencionVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencionventa=(RetencionVenta) retencionventaLogic.getRetencionVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			retencionventa =(RetencionVenta) retencionventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!retencionventa.getIsNew() && !retencionventa.getIsChanged() && !retencionventa.getIsDeleted()) {
				sDescripcion=retencionventa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=retencionventa.getempresa_descripcion();
			}
		}

		if(sTipo.equals("PeriodoDeclara")) {
			//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
			if(!retencionventa.getIsNew() && !retencionventa.getIsChanged() && !retencionventa.getIsDeleted()) {
				sDescripcion=retencionventa.getperiododeclara_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoDeclaraForeignKeyDescripcion((Long)value);
				sDescripcion=retencionventa.getperiododeclara_descripcion();
			}
		}

		if(sTipo.equals("TipoRetencion")) {
			//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
			if(!retencionventa.getIsNew() && !retencionventa.getIsChanged() && !retencionventa.getIsDeleted()) {
				sDescripcion=retencionventa.gettiporetencion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
				sDescripcion=retencionventa.gettiporetencion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RetencionVenta retencionventaRow=new RetencionVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencionventaRow=(RetencionVenta) retencionventaLogic.getRetencionVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			retencionventaRow=(RetencionVenta) retencionventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRetencionVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRetencionVenta.setVisible((this.isVisibilidadCeldaNuevoRetencionVenta && this.isPermisoNuevoRetencionVenta));			
			this.jButtonDuplicarRetencionVenta.setVisible((this.isVisibilidadCeldaDuplicarRetencionVenta && this.isPermisoDuplicarRetencionVenta));			
			this.jButtonCopiarRetencionVenta.setVisible((this.isVisibilidadCeldaCopiarRetencionVenta && this.isPermisoCopiarRetencionVenta));
			this.jButtonVerFormRetencionVenta.setVisible((this.isVisibilidadCeldaVerFormRetencionVenta && this.isPermisoVerFormRetencionVenta));
			
			this.jButtonAbrirOrderByRetencionVenta.setVisible((this.isVisibilidadCeldaOrdenRetencionVenta && this.isPermisoOrdenRetencionVenta));			
			
			this.jButtonNuevoRelacionesRetencionVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionVenta && this.isPermisoNuevoRetencionVenta));			
			this.jButtonNuevoGuardarCambiosRetencionVenta.setVisible((this.isVisibilidadCeldaNuevoRetencionVenta && this.isPermisoNuevoRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta));
			
			if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonModificarRetencionVenta.setVisible((this.isVisibilidadCeldaModificarRetencionVenta && this.isPermisoActualizarRetencionVenta));	
			this.jInternalFrameDetalleFormRetencionVenta.jButtonActualizarRetencionVenta.setVisible((this.isVisibilidadCeldaActualizarRetencionVenta && this.isPermisoActualizarRetencionVenta));	
			this.jInternalFrameDetalleFormRetencionVenta.jButtonEliminarRetencionVenta.setVisible((this.isVisibilidadCeldaEliminarRetencionVenta && this.isPermisoEliminarRetencionVenta));
			this.jInternalFrameDetalleFormRetencionVenta.jButtonCancelarRetencionVenta.setVisible(this.isVisibilidadCeldaCancelarRetencionVenta);							
			this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosRetencionVenta.setVisible((this.isVisibilidadCeldaGuardarRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaRetencionVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaNuevoRetencionVenta && this.isPermisoNuevoRetencionVenta));						
			this.jButtonDuplicarToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaDuplicarRetencionVenta && this.isPermisoDuplicarRetencionVenta));						
			this.jButtonCopiarToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaCopiarRetencionVenta && this.isPermisoCopiarRetencionVenta));			
			this.jButtonVerFormToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaVerFormRetencionVenta && this.isPermisoVerFormRetencionVenta));			
			this.jButtonAbrirOrderByToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaOrdenRetencionVenta && this.isPermisoOrdenRetencionVenta));
			this.jButtonNuevoRelacionesToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionVenta && this.isPermisoNuevoRetencionVenta));			
			this.jButtonNuevoGuardarCambiosToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaNuevoRetencionVenta && this.isPermisoNuevoRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta));			
			
			if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonModificarToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaModificarRetencionVenta && this.isPermisoActualizarRetencionVenta));	
			this.jInternalFrameDetalleFormRetencionVenta.jButtonActualizarToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaActualizarRetencionVenta  && this.isPermisoActualizarRetencionVenta));	
			this.jInternalFrameDetalleFormRetencionVenta.jButtonEliminarToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaEliminarRetencionVenta && this.isPermisoEliminarRetencionVenta));
			this.jInternalFrameDetalleFormRetencionVenta.jButtonCancelarToolBarRetencionVenta.setVisible(this.isVisibilidadCeldaCancelarRetencionVenta);				
			this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaGuardarRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRetencionVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRetencionVenta.setVisible((this.isVisibilidadCeldaNuevoRetencionVenta && this.isPermisoNuevoRetencionVenta));			
			this.jMenuItemDuplicarRetencionVenta.setVisible((this.isVisibilidadCeldaDuplicarRetencionVenta && this.isPermisoDuplicarRetencionVenta));			
			this.jMenuItemCopiarRetencionVenta.setVisible((this.isVisibilidadCeldaCopiarRetencionVenta && this.isPermisoCopiarRetencionVenta));			
			this.jMenuItemVerFormRetencionVenta.setVisible((this.isVisibilidadCeldaVerFormRetencionVenta && this.isPermisoVerFormRetencionVenta));			
			this.jMenuItemAbrirOrderByRetencionVenta.setVisible((this.isVisibilidadCeldaOrdenRetencionVenta && this.isPermisoOrdenRetencionVenta));			
			//this.jMenuItemMostrarOcultarRetencionVenta.setVisible((this.isVisibilidadCeldaOrdenRetencionVenta && this.isPermisoOrdenRetencionVenta));
			this.jMenuItemDetalleAbrirOrderByRetencionVenta.setVisible((this.isVisibilidadCeldaOrdenRetencionVenta && this.isPermisoOrdenRetencionVenta));			
			//this.jMenuItemDetalleMostrarOcultarRetencionVenta.setVisible((this.isVisibilidadCeldaOrdenRetencionVenta && this.isPermisoOrdenRetencionVenta));			
			this.jMenuItemNuevoRelacionesRetencionVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesRetencionVenta && this.isPermisoNuevoRetencionVenta));			
			this.jMenuItemNuevoGuardarCambiosRetencionVenta.setVisible((this.isVisibilidadCeldaNuevoRetencionVenta && this.isPermisoNuevoRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta));									
			
			if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			this.jInternalFrameDetalleFormRetencionVenta.jMenuItemModificarRetencionVenta.setVisible((this.isVisibilidadCeldaModificarRetencionVenta && this.isPermisoActualizarRetencionVenta));	
			this.jInternalFrameDetalleFormRetencionVenta.jMenuItemActualizarRetencionVenta.setVisible((this.isVisibilidadCeldaActualizarRetencionVenta && this.isPermisoActualizarRetencionVenta));	
			this.jInternalFrameDetalleFormRetencionVenta.jMenuItemEliminarRetencionVenta.setVisible((this.isVisibilidadCeldaEliminarRetencionVenta && this.isPermisoEliminarRetencionVenta));
			this.jInternalFrameDetalleFormRetencionVenta.jMenuItemCancelarRetencionVenta.setVisible(this.isVisibilidadCeldaCancelarRetencionVenta);				
			}
			
			this.jMenuItemGuardarCambiosRetencionVenta.setVisible((this.isVisibilidadCeldaGuardarRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta));						
			this.jMenuItemGuardarCambiosTablaRetencionVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRetencionVenta=this.jButtonNuevoRetencionVenta.isVisible();
			this.isVisibilidadCeldaDuplicarRetencionVenta=this.jButtonDuplicarRetencionVenta.isVisible();
			this.isVisibilidadCeldaCopiarRetencionVenta=this.jButtonCopiarRetencionVenta.isVisible();
			this.isVisibilidadCeldaVerFormRetencionVenta=this.jButtonVerFormRetencionVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenRetencionVenta=this.jButtonAbrirOrderByRetencionVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=this.jButtonNuevoRelacionesRetencionVenta.isVisible();
			this.isVisibilidadCeldaModificarRetencionVenta=this.jButtonModificarRetencionVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			this.isVisibilidadCeldaActualizarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jButtonActualizarRetencionVenta.isVisible();
			this.isVisibilidadCeldaEliminarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jButtonEliminarRetencionVenta.isVisible();
			this.isVisibilidadCeldaCancelarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jButtonCancelarRetencionVenta.isVisible();
			this.isVisibilidadCeldaGuardarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosRetencionVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=this.jButtonGuardarCambiosTablaRetencionVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRetencionVenta=this.jButtonNuevoToolBarRetencionVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=this.jButtonNuevoRelacionesToolBarRetencionVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			this.isVisibilidadCeldaModificarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jButtonModificarToolBarRetencionVenta.isVisible();
			this.isVisibilidadCeldaActualizarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jButtonActualizarToolBarRetencionVenta.isVisible();
			this.isVisibilidadCeldaEliminarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jButtonEliminarToolBarRetencionVenta.isVisible();
			this.isVisibilidadCeldaCancelarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jButtonCancelarToolBarRetencionVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRetencionVenta=this.jButtonGuardarCambiosToolBarRetencionVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=this.jButtonGuardarCambiosTablaToolBarRetencionVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRetencionVenta=this.jMenuItemNuevoRetencionVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=this.jMenuItemNuevoRelacionesRetencionVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			this.isVisibilidadCeldaModificarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jMenuItemModificarRetencionVenta.isVisible();
			this.isVisibilidadCeldaActualizarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jMenuItemActualizarRetencionVenta.isVisible();
			this.isVisibilidadCeldaEliminarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jMenuItemEliminarRetencionVenta.isVisible();
			this.isVisibilidadCeldaCancelarRetencionVenta=this.jInternalFrameDetalleFormRetencionVenta.jMenuItemCancelarRetencionVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRetencionVenta=this.jMenuItemGuardarCambiosRetencionVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=this.jMenuItemGuardarCambiosTablaRetencionVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRetencionVenta(Boolean esInicializar) {
		if(RetencionVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.retencionventaSessionBean.getConGuardarRelaciones()) {
				//if(this.retencionventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRetencionVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualRetencionVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRetencionVenta() {
		this.jButtonNuevoRetencionVenta.setVisible(this.isPermisoNuevoRetencionVenta);			
		this.jButtonDuplicarRetencionVenta.setVisible(this.isPermisoDuplicarRetencionVenta);			
		this.jButtonCopiarRetencionVenta.setVisible(this.isPermisoCopiarRetencionVenta);			
		this.jButtonVerFormRetencionVenta.setVisible(this.isPermisoVerFormRetencionVenta);			
		
		this.jButtonAbrirOrderByRetencionVenta.setVisible(this.isPermisoOrdenRetencionVenta);					
		
		this.jButtonNuevoRelacionesRetencionVenta.setVisible(this.isPermisoNuevoRetencionVenta);			
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonModificarRetencionVenta.setVisible(this.isPermisoActualizarRetencionVenta);	
			this.jInternalFrameDetalleFormRetencionVenta.jButtonActualizarRetencionVenta.setVisible(this.isPermisoActualizarRetencionVenta);	
			this.jInternalFrameDetalleFormRetencionVenta.jButtonEliminarRetencionVenta.setVisible(this.isPermisoEliminarRetencionVenta);
			this.jInternalFrameDetalleFormRetencionVenta.jButtonCancelarRetencionVenta.setVisible(this.isVisibilidadCeldaCancelarRetencionVenta);						
			this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosRetencionVenta.setVisible(this.isPermisoGuardarCambiosRetencionVenta);							
		}
		
		this.jButtonGuardarCambiosTablaRetencionVenta.setVisible(this.isPermisoActualizarRetencionVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRetencionVenta() {
		this.jInternalFrameDetalleFormRetencionVenta.jButtonModificarRetencionVenta.setVisible(this.isPermisoActualizarRetencionVenta);	
		this.jInternalFrameDetalleFormRetencionVenta.jButtonActualizarRetencionVenta.setVisible(this.isPermisoActualizarRetencionVenta);	
		this.jInternalFrameDetalleFormRetencionVenta.jButtonEliminarRetencionVenta.setVisible(this.isPermisoEliminarRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jButtonCancelarRetencionVenta.setVisible(this.isVisibilidadCeldaCancelarRetencionVenta);							
		this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosRetencionVenta.setVisible((this.isVisibilidadCeldaGuardarRetencionVenta && this.isPermisoGuardarCambiosRetencionVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRetencionVenta() {
		if(RetencionVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRetencionVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRetencionVenta() {
	}
	
	public void jTableDatosRetencionVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRetencionVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRetencionVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionventa==null) {
						this.retencionventa = new RetencionVenta();
					}

					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				}

				if(this.retencionventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.retencionventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRetencionVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRetencionVenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.retencionventaLogic.getConnexion());

				if(this.retencionventa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.retencionventa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionVenta=(TitledBorder)this.jScrollPanelDatosRetencionVenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRetencionVenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRetencionVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionventa==null) {
						this.retencionventa = new RetencionVenta();
					}

					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				}

				if(this.retencionventa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.retencionventa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodo_declaraRetencionVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiododeclara=true;

			idTienePermisoperiododeclara=this.tienePermisosUsuarioEnPaginaWebRetencionVenta(PeriodoDeclaraConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiododeclara) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);

				this.periododeclaraBeanSwingJInternalFrame=new PeriodoDeclaraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periododeclaraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periododeclaraBeanSwingJInternalFrame.getPeriodoDeclaraLogic().setConnexion(this.retencionventaLogic.getConnexion());

				if(this.retencionventa.getid_periodo_declara()!=null) {
					this.periododeclaraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periododeclaraBeanSwingJInternalFrame.setIdActual(this.retencionventa.getid_periodo_declara());
					this.periododeclaraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periododeclaraBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodoDeclara();
				}

				JInternalFrameBase jinternalFrame =this.periododeclaraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionVenta=(TitledBorder)this.jScrollPanelDatosRetencionVenta.getBorder();
				TitledBorder titledBorderperiododeclara=(TitledBorder)this.periododeclaraBeanSwingJInternalFrame.jScrollPanelDatosPeriodoDeclara.getBorder();

				titledBorderperiododeclara.setTitle(titledBorderRetencionVenta.getTitle() + " -> Periodo Declara");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodo_declaraRetencionVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionventa==null) {
						this.retencionventa = new RetencionVenta();
					}

					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				}

				if(this.retencionventa.getid_periodo_declara()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo_declara = "+this.retencionventa.getid_periodo_declara().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_retencionRetencionVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporetencion=true;

			idTienePermisotiporetencion=this.tienePermisosUsuarioEnPaginaWebRetencionVenta(TipoRetencionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporetencion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRetencionVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRetencionVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);

				this.tiporetencionBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporetencionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporetencionBeanSwingJInternalFrame.getTipoRetencionLogic().setConnexion(this.retencionventaLogic.getConnexion());

				if(this.retencionventa.getid_tipo_retencion()!=null) {
					this.tiporetencionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporetencionBeanSwingJInternalFrame.setIdActual(this.retencionventa.getid_tipo_retencion());
					this.tiporetencionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRetencion();
				}

				JInternalFrameBase jinternalFrame =this.tiporetencionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRetencionVenta=(TitledBorder)this.jScrollPanelDatosRetencionVenta.getBorder();
				TitledBorder titledBordertiporetencion=(TitledBorder)this.tiporetencionBeanSwingJInternalFrame.jScrollPanelDatosTipoRetencion.getBorder();

				titledBordertiporetencion.setTitle(titledBorderRetencionVenta.getTitle() + " -> Tipo Retencion ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_retencionRetencionVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionventa==null) {
						this.retencionventa = new RetencionVenta();
					}

					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				}

				if(this.retencionventa.getid_tipo_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_retencion = "+this.retencionventa.getid_tipo_retencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucRetencionVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionventa==null) {
						this.retencionventa = new RetencionVenta();
					}

					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				}

				if(this.retencionventa.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.retencionventa.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_retencionRetencionVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionventa==null) {
						this.retencionventa = new RetencionVenta();
					}

					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				}

				if(this.retencionventa.getnumero_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_retencion like '%"+this.retencionventa.getnumero_retencion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbase_imponibleRetencionVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionventa==null) {
						this.retencionventa = new RetencionVenta();
					}

					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				}

				if(this.retencionventa.getbase_imponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where base_imponible = "+this.retencionventa.getbase_imponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeRetencionVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionventa==null) {
						this.retencionventa = new RetencionVenta();
					}

					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				}

				if(this.retencionventa.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.retencionventa.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorRetencionVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionventa==null) {
						this.retencionventa = new RetencionVenta();
					}

					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				}

				if(this.retencionventa.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.retencionventa.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_debitoRetencionVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.getretencionventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.retencionventa==null) {
						this.retencionventa = new RetencionVenta();
					}

					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);
				}

				if(this.retencionventa.getes_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_debito = "+this.retencionventa.getes_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRetencionVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaRetencionVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionVenta(false,false);

			this.getRetencionVentasFK_IdEmpresa();

			this.inicializarActualizarBindingRetencionVenta(false);

			//if(RetencionVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoDeclaraRetencionVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionVenta(false,false);

			this.getRetencionVentasFK_IdPeriodoDeclara();

			this.inicializarActualizarBindingRetencionVenta(false);

			//if(RetencionVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRetencionRetencionVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRetencionVenta(false,false);

			this.getRetencionVentasFK_IdTipoRetencion();

			this.inicializarActualizarBindingRetencionVenta(false);

			//if(RetencionVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRetencionVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.retencionventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRetencionVenta() {
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
			this.jInternalFrameDetalleFormRetencionVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormRetencionVenta.dispose();
			this.jInternalFrameDetalleFormRetencionVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRetencionVenta!=null) {
			this.jInternalFrameReporteDinamicoRetencionVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRetencionVenta.dispose();
			this.jInternalFrameReporteDinamicoRetencionVenta=null;
		}
		
		if(this.jInternalFrameImportacionRetencionVenta!=null) {
			this.jInternalFrameImportacionRetencionVenta.setVisible(false);	    			
			this.jInternalFrameImportacionRetencionVenta.dispose();
			this.jInternalFrameImportacionRetencionVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRetencionVenta();
			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoRetencionVenta")) {
				jButtonNuevoRetencionVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRetencionVenta")) {
				jButtonDuplicarRetencionVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRetencionVenta")) {
				jButtonCopiarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormRetencionVenta")) {
				jButtonVerFormRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRetencionVenta")) {
				jButtonNuevoRetencionVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRetencionVenta")) {
				jButtonDuplicarRetencionVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRetencionVenta")) {
				jButtonNuevoRetencionVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRetencionVenta")) {
				jButtonDuplicarRetencionVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRetencionVenta")) {
				jButtonNuevoRetencionVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRetencionVenta")) {
				jButtonNuevoRetencionVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRetencionVenta")) {
				jButtonNuevoRetencionVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRetencionVenta")) {
				jButtonModificarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRetencionVenta")) {
				jButtonModificarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRetencionVenta")) {
				jButtonModificarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRetencionVenta")) {
				jButtonActualizarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRetencionVenta")) {
				jButtonActualizarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRetencionVenta")) {
				jButtonActualizarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarRetencionVenta")) {
				jButtonEliminarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRetencionVenta")) {
				jButtonEliminarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRetencionVenta")) {
				jButtonEliminarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarRetencionVenta")) {
				jButtonCancelarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRetencionVenta")) {
				jButtonCancelarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRetencionVenta")) {
				jButtonCancelarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarRetencionVenta")) {
				jButtonCerrarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRetencionVenta")) {
				jButtonCerrarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRetencionVenta")) {
				jButtonCerrarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRetencionVenta")) {
				jButtonMostrarOcultarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRetencionVenta")) {
				jButtonCancelarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRetencionVenta")) {
				jButtonGuardarCambiosRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRetencionVenta")) {
				jButtonGuardarCambiosRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRetencionVenta")) {
				jButtonCopiarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRetencionVenta")) {
				jButtonVerFormRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRetencionVenta")) {
				jButtonGuardarCambiosRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRetencionVenta")) {
				jButtonCopiarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRetencionVenta")) {
				jButtonVerFormRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRetencionVenta")) {
				jButtonGuardarCambiosRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRetencionVenta")) {
				jButtonGuardarCambiosRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRetencionVenta")) {
				jButtonGuardarCambiosRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRetencionVenta")) {
				jButtonRecargarInformacionRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRetencionVenta")) {
				jButtonRecargarInformacionRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRetencionVenta")) {
				jButtonRecargarInformacionRetencionVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRetencionVenta")) {
				jButtonAnterioresRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRetencionVenta")) {
				jButtonAnterioresRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRetencionVenta")) {
				jButtonAnterioresRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRetencionVenta")) {
				jButtonSiguientesRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRetencionVenta")) {
				jButtonSiguientesRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRetencionVenta")) {
				jButtonSiguientesRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRetencionVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByRetencionVenta")) {
				jButtonAbrirOrderByRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRetencionVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarRetencionVenta")) {
				jButtonMostrarOcultarRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRetencionVenta")) {
				jButtonNuevoGuardarCambiosRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRetencionVenta")) {
				jButtonNuevoGuardarCambiosRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRetencionVenta")) {
				jButtonNuevoGuardarCambiosRetencionVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRetencionVenta")) {
				jButtonCerrarReporteDinamicoRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRetencionVenta")) {
				jButtonGenerarReporteDinamicoRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRetencionVenta")) {
				
				jButtonGenerarExcelReporteDinamicoRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRetencionVenta")) {
				jButtonCerrarImportacionRetencionVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRetencionVenta")) {
				
				jButtonGenerarImportacionRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRetencionVenta")) {
				
				jButtonAbrirImportacionRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRetencionVenta")) {
				jComboBoxTiposAccionesRetencionVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRetencionVenta")) {
				jComboBoxTiposRelacionesRetencionVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRetencionVenta")) {
				jComboBoxTiposAccionesRetencionVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRetencionVenta")) {
				
				jComboBoxTiposSeleccionarRetencionVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRetencionVenta")) {
				jTextFieldValorCampoGeneralRetencionVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRetencionVenta")) {
				jButtonAbrirOrderByRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRetencionVenta")) {
				jButtonAbrirOrderByRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRetencionVenta")) {
				jButtonCerrarOrderByRetencionVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRetencionVentaBusqueda")) {
				this.jButtonidRetencionVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRetencionVentaUpdate")) {
				this.jButtonid_empresaRetencionVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRetencionVentaBusqueda")) {
				this.jButtonid_empresaRetencionVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraRetencionVentaUpdate")) {
				this.jButtonid_periodo_declaraRetencionVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraRetencionVentaBusqueda")) {
				this.jButtonid_periodo_declaraRetencionVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionVentaUpdate")) {
				this.jButtonid_tipo_retencionRetencionVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionVentaBusqueda")) {
				this.jButtonid_tipo_retencionRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucRetencionVentaBusqueda")) {
				this.jButtonrucRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencionRetencionVentaBusqueda")) {
				this.jButtonnumero_retencionRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleRetencionVentaBusqueda")) {
				this.jButtonbase_imponibleRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeRetencionVentaBusqueda")) {
				this.jButtonporcentajeRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRetencionVentaBusqueda")) {
				this.jButtonvalorRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoRetencionVentaBusqueda")) {
				this.jButtones_debitoRetencionVentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPeriodoDeclaraRetencionVenta")) {
				this.jButtonFK_IdPeriodoDeclaraRetencionVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoRetencionRetencionVenta")) {
				this.jButtonFK_IdTipoRetencionRetencionVentaActionPerformed(evt);
			}
			
			;
			
			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRetencionVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				


				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RetencionVenta retencionventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				retencionventaLocal=this.retencionventa;
			} else {
				retencionventaLocal=this.retencionventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
							
				
				


				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaAnterior =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionventaAnterior =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
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
			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
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
			
			


			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
								
						
				


				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
								
				
				


				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaAnterior =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionventaAnterior =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaAnterior =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionventaAnterior =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
							
				
				


				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventaAnterior =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.retencionventaAnterior =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
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
			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
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
			
			


			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
								
				
				


				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaAnterior =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionventaAnterior =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRetencionVenta")) {
					jCheckBoxSeleccionarTodosRetencionVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRetencionVenta")) {
					jCheckBoxSeleccionadosRetencionVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRetencionVenta")) {
					
				}
				
				


				
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
												
				
				


				
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.retencionventaAnterior =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.retencionventaAnterior =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
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
			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
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
			
			


			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRetencionVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.retencionventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.retencionventa);
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
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
				
				


				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RetencionVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RetencionVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRetencionVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.retencionventaAnterior =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.retencionventaAnterior =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRetencionVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRetencionVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRetencionVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.retencionventa =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.retencionventa =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.retencionventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRetencionVenta")) {
				
				}
				
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRetencionVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRetencionVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRetencionVenta")) {
			
			}
			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRetencionVenta();
			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
			if(sTipo.equals("NuevoRetencionVenta")) {
				jButtonNuevoRetencionVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRetencionVenta")) {
				jButtonDuplicarRetencionVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRetencionVenta")) {
				jButtonCopiarRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRetencionVenta")) {
				jButtonVerFormRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRetencionVenta")) {
				jButtonNuevoRetencionVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRetencionVenta")) {
				jButtonModificarRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRetencionVenta")) {
				jButtonActualizarRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRetencionVenta")) {
				jButtonEliminarRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRetencionVenta")) {
				jButtonGuardarCambiosRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRetencionVenta")) {
				jButtonCancelarRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRetencionVenta")) {
				jButtonCerrarRetencionVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRetencionVenta")) {
				jButtonGuardarCambiosRetencionVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRetencionVenta")) {
				jButtonNuevoGuardarCambiosRetencionVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRetencionVenta")) {
				jButtonAbrirOrderByRetencionVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRetencionVenta")) {
				jButtonRecargarInformacionRetencionVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRetencionVenta")) {
				jButtonAnterioresRetencionVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRetencionVenta")) {
				jButtonSiguientesRetencionVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRetencionVentaBusqueda")) {
				this.jButtonidRetencionVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRetencionVentaUpdate")) {
				this.jButtonid_empresaRetencionVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRetencionVentaBusqueda")) {
				this.jButtonid_empresaRetencionVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodo_declaraRetencionVentaUpdate")) {
				this.jButtonid_periodo_declaraRetencionVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodo_declaraRetencionVentaBusqueda")) {
				this.jButtonid_periodo_declaraRetencionVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionVentaUpdate")) {
				this.jButtonid_tipo_retencionRetencionVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionRetencionVentaBusqueda")) {
				this.jButtonid_tipo_retencionRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucRetencionVentaBusqueda")) {
				this.jButtonrucRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_retencionRetencionVentaBusqueda")) {
				this.jButtonnumero_retencionRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_imponibleRetencionVentaBusqueda")) {
				this.jButtonbase_imponibleRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeRetencionVentaBusqueda")) {
				this.jButtonporcentajeRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRetencionVentaBusqueda")) {
				this.jButtonvalorRetencionVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoRetencionVentaBusqueda")) {
				this.jButtones_debitoRetencionVentaBusquedaActionPerformed(evt);
			}
			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRetencionVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRetencionVenta")) {
				closingInternalFrameRetencionVenta();
				
			} else if(sTipo.equals("jButtonCancelarRetencionVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormRetencionVenta = (JInternalFrameBase)evt.getSource();
	            	
	            RetencionVentaBeanSwingJInternalFrame jInternalFrameParent=(RetencionVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormRetencionVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRetencionVentaActionPerformed(null);
			}
			
			RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.retencionventa,new Object(),this.retencionventaParameterGeneral,this.retencionventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRetencionVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRetencionVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRetencionVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.retencionventa)) {
			if(!esControlTabla) {
				if(RetencionVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);			
				}
				
				if(this.retencionventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRetencionVenta(this.retencionventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.retencionventaReturnGeneral=retencionventaLogic.procesarEventosRetencionVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencionventaLogic.getRetencionVentas(),this.retencionventa,this.retencionventaParameterGeneral,this.isEsNuevoRetencionVenta,classes);//this.retencionventaLogic.getRetencionVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRetencionVenta(this.retencionventaReturnGeneral,this.retencionventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.retencionventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRetencionVenta(classes,this.retencionventaReturnGeneral,this.retencionventaBean,false);
					}
						
					if(this.retencionventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRetencionVenta(this.retencionventaReturnGeneral.getRetencionVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRetencionVenta(this.retencionventaReturnGeneral.getRetencionVenta());	
					}
						
					if(this.retencionventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRetencionVenta(this.retencionventaReturnGeneral.getRetencionVenta(),classes);//this.retencionventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRetencionVenta(this.retencionventa,classes);//this.retencionventaBean);									
				}
			
				if(RetencionVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRetencionVenta(this.retencionventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRetencionVenta(this.retencionventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.retencionventaAnterior!=null) {
						this.retencionventa=this.retencionventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.retencionventaReturnGeneral=retencionventaLogic.procesarEventosRetencionVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencionventaLogic.getRetencionVentas(),this.retencionventa,this.retencionventaParameterGeneral,this.isEsNuevoRetencionVenta,classes);//this.retencionventaLogic.getRetencionVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.retencionventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.retencionventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.retencionventaReturnGeneral.getRetencionVenta(),retencionventaLogic.getRetencionVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.retencionventaReturnGeneral.getRetencionVenta(),this.retencionventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRetencionVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosRetencionVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRetencionVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosRetencionVenta() throws Exception {
		
		RetencionVentaModel retencionventaModel=(RetencionVentaModel)this.jTableDatosRetencionVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			retencionventaModel.retencionventas=this.retencionventaLogic.getRetencionVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			retencionventaModel.retencionventas=this.retencionventas;
		}
		
		
		((RetencionVentaModel) this.jTableDatosRetencionVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRetencionVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getretencionventaAnterior(),this.retencionventaLogic.getRetencionVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getretencionventaAnterior(),this.retencionventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRetencionVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRetencionVenta(RetencionVenta retencionventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
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
										
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencionventa,new Object(),generalEntityParameterGeneral,this.retencionventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.retencionventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RetencionVentaConstantesFunciones.getClassesRelationshipsOfRetencionVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RetencionVentaConstantesFunciones.getClassesRelationshipsFromStringsOfRetencionVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRetencionVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RetencionVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.retencionventa,new Object(),generalEntityParameterGeneral,this.retencionventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRetencionVenta(RetencionVentaBean retencionventaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRetencionVenta(ArrayList<Classe> classes,RetencionVentaReturnGeneral retencionventaReturnGeneral,RetencionVentaBean retencionventaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRetencionVenta(RetencionVenta retencionventa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.retencionventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRetencionVenta = new RetencionVentaDetalleFormJInternalFrame(jDesktopPane,this.retencionventaSessionBean.getConGuardarRelaciones(),this.retencionventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.setVisible(false);
		this.jInternalFrameDetalleFormRetencionVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormRetencionVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRetencionVenta.retencionventaLogic=this.retencionventaLogic;
		
		this.cargarCombosFrameForeignKeyRetencionVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRetencionVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRetencionVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRetencionVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRetencionVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRetencionVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRetencionVenta"));
		
		this.jInternalFrameDetalleFormRetencionVenta.jButtonModificarRetencionVenta.addActionListener(new ButtonActionListener(this,"ModificarRetencionVenta"));

		
		this.jInternalFrameDetalleFormRetencionVenta.jButtonModificarToolBarRetencionVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarRetencionVenta"));
					
		this.jInternalFrameDetalleFormRetencionVenta.jMenuItemModificarRetencionVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarRetencionVenta"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionVenta.jButtonActualizarRetencionVenta.addActionListener (new ButtonActionListener(this,"ActualizarRetencionVenta"));
		
		
		this.jInternalFrameDetalleFormRetencionVenta.jButtonActualizarToolBarRetencionVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRetencionVenta"));
						
		this.jInternalFrameDetalleFormRetencionVenta.jMenuItemActualizarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRetencionVenta"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionVenta.jButtonEliminarRetencionVenta.addActionListener (new ButtonActionListener(this,"EliminarRetencionVenta"));
		
		
		this.jInternalFrameDetalleFormRetencionVenta.jButtonEliminarToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarRetencionVenta"));
								
		this.jInternalFrameDetalleFormRetencionVenta.jMenuItemEliminarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRetencionVenta"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionVenta.jButtonCancelarRetencionVenta.addActionListener (new ButtonActionListener(this,"CancelarRetencionVenta"));
		
		
		this.jInternalFrameDetalleFormRetencionVenta.jButtonCancelarToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarRetencionVenta"));
					
		this.jInternalFrameDetalleFormRetencionVenta.jMenuItemCancelarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRetencionVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRetencionVenta.jMenuItemDetalleCerrarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRetencionVenta"));		
		
		
		
		this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionVenta"));
		
		
		
		this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionVenta"));
		
		
		
		this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRetencionVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonidRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_empresaRetencionVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_empresaRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_periodo_declaraRetencionVentaUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraRetencionVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_periodo_declaraRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraRetencionVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_tipo_retencionRetencionVentaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_tipo_retencionRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonrucRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"rucRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonnumero_retencionRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonbase_imponibleRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonporcentajeRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonvalorRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"valorRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtones_debitoRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoRetencionVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRetencionVenta.jTabbedPaneRelacionesRetencionVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRetencionVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRetencionVenta"));
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRetencionVenta"));
		}
		
		this.jTableDatosRetencionVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRetencionVenta"));
		
		this.jTableDatosRetencionVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRetencionVenta"));
		
		this.jButtonNuevoRetencionVenta.addActionListener(new ButtonActionListener(this,"NuevoRetencionVenta"));
		
		this.jButtonDuplicarRetencionVenta.addActionListener(new ButtonActionListener(this,"DuplicarRetencionVenta"));
		
		this.jButtonCopiarRetencionVenta.addActionListener(new ButtonActionListener(this,"CopiarRetencionVenta"));
		
		this.jButtonVerFormRetencionVenta.addActionListener(new ButtonActionListener(this,"VerFormRetencionVenta"));
		
		
		this.jButtonNuevoToolBarRetencionVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarRetencionVenta"));
			
		this.jButtonDuplicarToolBarRetencionVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRetencionVenta"));
			
		this.jMenuItemNuevoRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRetencionVenta"));
			
		this.jMenuItemDuplicarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRetencionVenta"));		
		
		
		this.jButtonNuevoRelacionesRetencionVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRetencionVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarRetencionVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRetencionVenta"));
			
		this.jMenuItemNuevoRelacionesRetencionVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRetencionVenta"));		
		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonModificarRetencionVenta.addActionListener(new ButtonActionListener(this,"ModificarRetencionVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonModificarToolBarRetencionVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarRetencionVenta"));
			
			this.jInternalFrameDetalleFormRetencionVenta.jMenuItemModificarRetencionVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarRetencionVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRetencionVenta.jButtonActualizarRetencionVenta.addActionListener (new ButtonActionListener(this,"ActualizarRetencionVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonActualizarToolBarRetencionVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRetencionVenta"));
				
			this.jInternalFrameDetalleFormRetencionVenta.jMenuItemActualizarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRetencionVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonEliminarRetencionVenta.addActionListener (new ButtonActionListener(this,"EliminarRetencionVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonEliminarToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarRetencionVenta"));
						
			this.jInternalFrameDetalleFormRetencionVenta.jMenuItemEliminarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRetencionVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonCancelarRetencionVenta.addActionListener (new ButtonActionListener(this,"CancelarRetencionVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonCancelarToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarRetencionVenta"));
			
			this.jInternalFrameDetalleFormRetencionVenta.jMenuItemCancelarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRetencionVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRetencionVenta"));		
		
		
		this.jButtonCerrarRetencionVenta.addActionListener (new ButtonActionListener(this,"CerrarRetencionVenta"));
		
		
		this.jButtonCerrarToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarRetencionVenta"));
			
		this.jMenuItemCerrarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRetencionVenta"));
			
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jMenuItemDetalleCerrarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRetencionVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosRetencionVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosRetencionVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRetencionVenta"));
		}
		
		this.jButtonCopiarToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarRetencionVenta"));
			
		this.jButtonVerFormToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarRetencionVenta"));
		
		this.jMenuItemGuardarCambiosRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRetencionVenta"));
			
		this.jMenuItemCopiarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRetencionVenta"));		
		
		this.jMenuItemVerFormRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRetencionVenta"));		
		
		
		this.jButtonGuardarCambiosTablaRetencionVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRetencionVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRetencionVenta"));
			
		this.jMenuItemGuardarCambiosTablaRetencionVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRetencionVenta"));		
		
		
		
		this.jButtonRecargarInformacionRetencionVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionRetencionVenta"));
					
		this.jButtonRecargarInformacionToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRetencionVenta"));
		
		this.jMenuItemRecargarInformacionRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRetencionVenta"));		
		
		
		
		this.jButtonAnterioresRetencionVenta.addActionListener (new ButtonActionListener(this,"AnterioresRetencionVenta"));
		
		
		this.jButtonAnterioresToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRetencionVenta"));
		
		this.jMenuItemAnterioresRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRetencionVenta"));		
		
		
		this.jButtonSiguientesRetencionVenta.addActionListener (new ButtonActionListener(this,"SiguientesRetencionVenta"));
		
		
		this.jButtonSiguientesToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRetencionVenta"));
			
		this.jMenuItemSiguientesRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRetencionVenta"));
			
		this.jMenuItemAbrirOrderByRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRetencionVenta"));
			
		this.jMenuItemMostrarOcultarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRetencionVenta"));
			
		this.jMenuItemDetalleAbrirOrderByRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRetencionVenta"));
			
		this.jMenuItemDetalleMostarOcultarRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRetencionVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosRetencionVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRetencionVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRetencionVenta"));
			
		this.jMenuItemNuevoGuardarCambiosRetencionVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRetencionVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRetencionVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRetencionVenta"));

		this.jCheckBoxSeleccionadosRetencionVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRetencionVenta"));
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRetencionVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesRetencionVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesRetencionVenta"));
			
		this.jComboBoxTiposAccionesRetencionVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesRetencionVenta"));
					
		this.jComboBoxTiposSeleccionarRetencionVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRetencionVenta"));
			
		this.jTextFieldValorCampoGeneralRetencionVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRetencionVenta"));		
		
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonidRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_empresaRetencionVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_empresaRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_periodo_declaraRetencionVentaUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraRetencionVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_periodo_declaraRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraRetencionVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_tipo_retencionRetencionVentaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_tipo_retencionRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonrucRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"rucRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonnumero_retencionRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonbase_imponibleRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonporcentajeRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonvalorRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"valorRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtones_debitoRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoRetencionVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPeriodoDeclaraRetencionVenta.addActionListener(new ButtonActionListener(this,"FK_IdPeriodoDeclaraRetencionVenta"));

			this.jButtonFK_IdTipoRetencionRetencionVenta.addActionListener(new ButtonActionListener(this,"FK_IdTipoRetencionRetencionVenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRetencionVenta!=null) {
				this.jInternalFrameReporteDinamicoRetencionVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionVenta"));
				this.jInternalFrameReporteDinamicoRetencionVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionVenta"));
				this.jInternalFrameReporteDinamicoRetencionVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoRetencionVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRetencionVenta"));				
			//this.jButtonGenerarReporteDinamicoRetencionVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRetencionVenta"));
			//this.jButtonGenerarExcelReporteDinamicoRetencionVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRetencionVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRetencionVenta!=null) {
				this.jInternalFrameImportacionRetencionVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRetencionVenta"));
				this.jInternalFrameImportacionRetencionVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRetencionVenta"));
				this.jInternalFrameImportacionRetencionVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRetencionVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRetencionVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByRetencionVenta"));
			
			this.jButtonAbrirOrderByToolBarRetencionVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRetencionVenta"));			
			
			if(this.jInternalFrameOrderByRetencionVenta!=null) {
				this.jInternalFrameOrderByRetencionVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRetencionVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRetencionVenta.jTabbedPaneRelacionesRetencionVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRetencionVenta"));
		
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
            		closingInternalFrameRetencionVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRetencionVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRetencionVenta = (JInternalFrameBase)event.getSource();
	            	
	            RetencionVentaBeanSwingJInternalFrame jInternalFrameParent=(RetencionVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormRetencionVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRetencionVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRetencionVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRetencionVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRetencionVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRetencionVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRetencionVenta";
		inputMap = this.jButtonNuevoRetencionVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRetencionVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRetencionVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRetencionVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRetencionVenta";
		inputMap = this.jButtonNuevoRelacionesRetencionVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRetencionVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRetencionVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRetencionVenta";
		inputMap = this.jButtonModificarRetencionVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRetencionVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRetencionVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRetencionVenta";
		inputMap = this.jButtonActualizarRetencionVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRetencionVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRetencionVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRetencionVenta";
		inputMap = this.jButtonEliminarRetencionVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRetencionVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRetencionVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRetencionVenta";
		inputMap = this.jButtonCancelarRetencionVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRetencionVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRetencionVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRetencionVenta";
		inputMap = this.jButtonCerrarRetencionVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRetencionVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRetencionVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRetencionVenta";
		inputMap = this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosRetencionVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRetencionVenta.jButtonGuardarCambiosRetencionVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRetencionVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRetencionVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRetencionVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRetencionVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRetencionVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRetencionVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRetencionVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRetencionVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRetencionVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonidRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"idRetencionVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_empresaRetencionVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRetencionVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_empresaRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRetencionVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_periodo_declaraRetencionVentaUpdate.addActionListener(new ButtonActionListener(this,"id_periodo_declaraRetencionVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_periodo_declaraRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodo_declaraRetencionVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_tipo_retencionRetencionVentaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonid_tipo_retencionRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonrucRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"rucRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonnumero_retencionRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"numero_retencionRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonbase_imponibleRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"base_imponibleRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonporcentajeRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtonvalorRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"valorRetencionVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRetencionVenta.jButtones_debitoRetencionVentaBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoRetencionVentaBusqueda"));
		
		
		this.jButtonFK_IdPeriodoDeclaraRetencionVenta.addActionListener(new ButtonActionListener(this,"FK_IdPeriodoDeclaraRetencionVenta"));

		this.jButtonFK_IdTipoRetencionRetencionVenta.addActionListener(new ButtonActionListener(this,"FK_IdTipoRetencionRetencionVenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRetencionVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRetencionVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRetencionVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRetencionVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRetencionVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RetencionVenta retencionventaAux:this.retencionventaLogic.getRetencionVentas()) {
					retencionventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionVenta retencionventaAux:retencionventas) {
					retencionventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRetencionVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRetencionVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RetencionVenta retencionventaAux:this.retencionventaLogic.getRetencionVentas()) {
						retencionventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionVenta retencionventaAux:retencionventas) {
						retencionventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RetencionVenta retencionventaAux:this.retencionventaLogic.getRetencionVentas()) {
					
						if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							retencionventaAux.setes_debito(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionVenta retencionventaAux:retencionventas) {
						
						if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							retencionventaAux.setes_debito(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRetencionVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRetencionVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRetencionVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRetencionVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRetencionVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRetencionVenta.getSelectedRows();
			
			RetencionVenta retencionventaLocal=new RetencionVenta();
			
			//this.seleccionarTodosRetencionVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					retencionventaLocal =(RetencionVenta) this.retencionventaLogic.getRetencionVentas().toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					retencionventaLocal =(RetencionVenta) this.retencionventas.toArray()[this.jTableDatosRetencionVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				retencionventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RetencionVenta retencionventaAux:this.retencionventaLogic.getRetencionVentas()) {
						retencionventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RetencionVenta retencionventaAux:retencionventas) {
						retencionventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRetencionVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRetencionVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRetencionVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRetencionVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRetencionVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRetencionVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRetencionVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRetencionVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRetencionVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RetencionVenta retencionventaAux:this.retencionventaLogic.getRetencionVentas()) {
				
						if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_RUC)) {
							existe=true;
							retencionventaAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION)) {
							existe=true;
							retencionventaAux.setnumero_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							retencionventaAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							retencionventaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							retencionventaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionVenta retencionventaAux:retencionventas) {
					
						if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_RUC)) {
							existe=true;
							retencionventaAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION)) {
							existe=true;
							retencionventaAux.setnumero_retencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE)) {
							existe=true;
							retencionventaAux.setbase_imponible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							retencionventaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							retencionventaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRetencionVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRetencionVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRetencionVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRetencionVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRetencionVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRetencionVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessRetencionVenta(conSplash);
				
					this.generarReporteRetencionVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRetencionVentasSeleccionados();
				//this.jComboBoxTiposAccionesRetencionVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRetencionVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesRetencionVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRetencionVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesRetencionVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRetencionVenta();
				
				this.exportarRetencionVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRetencionVentas();
				//this.importarRetencionVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRetencionVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRetencionVentasSeleccionados();
				//this.jComboBoxTiposAccionesRetencionVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Retencion Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRetencionVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRetencionVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRetencionVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Retencion Venta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRetencionVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.setSelectedIndex(0);					
				}	
			} 			
			else if(RetencionVentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRetencionVenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRetencionVenta(conSplash);
					
						//this.actualizarParametrosGeneralRetencionVenta();
						
						this.generarReporteProcesoAccionRetencionVentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRetencionVenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RetencionVentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Retencion VentaS SELECCIONADOS?", "MANTENIMIENTO DE Retencion Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRetencionVenta();
				
						this.actualizarParametrosGeneralRetencionVenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.retencionventaReturnGeneral=retencionventaLogic.procesarAccionRetencionVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.retencionventaLogic.getRetencionVentas(),this.retencionventaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRetencionVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRetencionVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRetencionVenta();
					
					RetencionVentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRetencionVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRetencionVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRetencionVenta.jComboBoxTiposAccionesFormularioRetencionVenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRetencionVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRetencionVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRetencionVenta();
			
			if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();		
			RetencionVenta retencionventa=new RetencionVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRetencionVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRetencionVenta.getSelectedItem();
			
			
			
			
			retencionventasSeleccionados=this.getRetencionVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(retencionventasSeleccionados.size()==1) {
				for(RetencionVenta retencionventaAux:retencionventasSeleccionados) {
					retencionventa=retencionventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRetencionVenta();
			
      		//this.finishProcessRetencionVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRetencionVentaReturnGeneral() throws Exception {
		if(this.retencionventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.retencionventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.retencionventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.retencionventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.retencionventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.retencionventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRetencionVenta(false);
		}
		
		if(this.retencionventaReturnGeneral.getConRetornoLista() || this.retencionventaReturnGeneral.getConRetornoObjeto()) {
			if(this.retencionventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.retencionventaLogic.setRetencionVentas(this.retencionventaReturnGeneral.getRetencionVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.retencionventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.retencionventaLogic.setRetencionVenta(this.retencionventaReturnGeneral.getRetencionVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRetencionVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralRetencionVenta() throws Exception {
		
		
	}
	
	public ArrayList<RetencionVenta> getRetencionVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRetencionVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RetencionVenta retencionventaAux:retencionventaLogic.getRetencionVentas()) {
					if(retencionventaAux.getIsSelected()) {
						retencionventasSeleccionados.add(retencionventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RetencionVenta retencionventaAux:this.retencionventas) {
					if(retencionventaAux.getIsSelected()) {
						retencionventasSeleccionados.add(retencionventaAux);				
					}
				}
			}
			
			if(retencionventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						retencionventasSeleccionados.addAll(this.retencionventaLogic.getRetencionVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						retencionventasSeleccionados.addAll(this.retencionventas);				
					}
				}
			}
		} else {
			retencionventasSeleccionados.add(this.retencionventa);
		}
		
		return retencionventasSeleccionados;
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
	
	public void generarReporteRetencionVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRetencionVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRetencionVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRetencionVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRetencionVentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Retencion Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRetencionVentasSeleccionados() throws Exception {
		ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();		
		
		retencionventasSeleccionados=this.getRetencionVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRetencionVentas("Todos",retencionventasSeleccionados);
		
	}	
	
	public void generarReporteNormalRetencionVentasSeleccionados() throws Exception {
		ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();		
		
		retencionventasSeleccionados=this.getRetencionVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRetencionVentas("Todos",retencionventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRetencionVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();
		
		retencionventasSeleccionados=this.getRetencionVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRetencionVentas("Todos",retencionventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRetencionVentasSeleccionados() throws Exception {
		ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRetencionVenta();
		
		
		retencionventasSeleccionados=this.getRetencionVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRetencionVenta();
		
		
		//this.generarReporteRetencionVentas("Todos",retencionventasSeleccionados ,retencionventaImplementable,retencionventaImplementableHome);
	}
	
	public void mostrarImportacionRetencionVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRetencionVenta();
		
		this.abrirFrameImportacionRetencionVenta();		
		
			
		//this.generarReporteRetencionVentas("Todos",retencionventasSeleccionados ,retencionventaImplementable,retencionventaImplementableHome);
	}
	
	public void importarRetencionVentas() throws Exception {		
	
	}
	
	public void exportarRetencionVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRetencionVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRetencionVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRetencionVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Retencion Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRetencionVentasSeleccionados() throws Exception {
		ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();		
		
		retencionventasSeleccionados=this.getRetencionVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRetencionVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RetencionVenta retencionventaAux:retencionventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRetencionVenta(retencionventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//retencionventaAux.setsDetalleGeneralEntityReporte(retencionventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRetencionVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RetencionVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionVentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionVentaConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionVentaConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionVentaConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RetencionVentaConstantesFunciones.LABEL_ESDEBITO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRetencionVenta(RetencionVenta retencionventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=retencionventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionventa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionventa.getperiododeclara_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionventa.gettiporetencion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionventa.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionventa.getnumero_retencion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionventa.getbase_imponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionventa.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionventa.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=retencionventa.getes_debito().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRetencionVentasSeleccionados() throws Exception {
		ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();		
		
		retencionventasSeleccionados=this.getRetencionVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RetencionVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRetencionVenta(row);				
				iRow++;
			}				
			
			for(RetencionVenta retencionventaAux:retencionventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRetencionVenta(retencionventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRetencionVentasSeleccionados() throws Exception {
		ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();		
		
		retencionventasSeleccionados=this.getRetencionVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"retencionventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("retencionventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("retencionventa");
			//elementRoot.appendChild(element);
		
			for(RetencionVenta retencionventaAux:retencionventasSeleccionados) {
				element = document.createElement("retencionventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRetencionVenta(retencionventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Retencion Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRetencionVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_BASEIMPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(RetencionVentaConstantesFunciones.LABEL_ESDEBITO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRetencionVenta(RetencionVenta retencionventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(retencionventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionventa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionventa.getperiododeclara_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionventa.gettiporetencion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionventa.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionventa.getnumero_retencion());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionventa.getbase_imponible());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionventa.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionventa.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(retencionventa.getes_debito());				
	}
	
	public void setFilaDatosExportarXmlRetencionVenta(RetencionVenta retencionventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RetencionVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(retencionventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RetencionVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(retencionventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RetencionVentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(retencionventa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementperiododeclara_descripcion = document.createElement(RetencionVentaConstantesFunciones.IDPERIODODECLARA);
		elementperiododeclara_descripcion.appendChild(document.createTextNode(retencionventa.getperiododeclara_descripcion()));
		element.appendChild(elementperiododeclara_descripcion);

		Element elementtiporetencion_descripcion = document.createElement(RetencionVentaConstantesFunciones.IDTIPORETENCION);
		elementtiporetencion_descripcion.appendChild(document.createTextNode(retencionventa.gettiporetencion_descripcion()));
		element.appendChild(elementtiporetencion_descripcion);

		Element elementruc = document.createElement(RetencionVentaConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(retencionventa.getruc().trim()));
		element.appendChild(elementruc);

		Element elementnumero_retencion = document.createElement(RetencionVentaConstantesFunciones.NUMERORETENCION);
		elementnumero_retencion.appendChild(document.createTextNode(retencionventa.getnumero_retencion().trim()));
		element.appendChild(elementnumero_retencion);

		Element elementbase_imponible = document.createElement(RetencionVentaConstantesFunciones.BASEIMPONIBLE);
		elementbase_imponible.appendChild(document.createTextNode(retencionventa.getbase_imponible().toString().trim()));
		element.appendChild(elementbase_imponible);

		Element elementporcentaje = document.createElement(RetencionVentaConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(retencionventa.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor = document.createElement(RetencionVentaConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(retencionventa.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementes_debito = document.createElement(RetencionVentaConstantesFunciones.ESDEBITO);
		elementes_debito.appendChild(document.createTextNode(retencionventa.getes_debito().toString().trim()));
		element.appendChild(elementes_debito);
	}
	
	public void generarReporteGroupGenericoRetencionVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RetencionVenta> retencionventasSeleccionados=new ArrayList<RetencionVenta>();
		
		retencionventasSeleccionados=this.getRetencionVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRetencionVenta(retencionventasSeleccionados);
		
		this.generarReporteRetencionVentas("Todos",retencionventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRetencionVenta(ArrayList<RetencionVenta> retencionventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RetencionVenta retencionventaAux:retencionventasSeleccionados) {
				retencionventaAux.setsDetalleGeneralEntityReporte(retencionventaAux.toString());
			
				if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					retencionventaAux.setsDescripcionGeneralEntityReporte1(retencionventaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_IDPERIODODECLARA)) {
					existe=true;
					retencionventaAux.setsDescripcionGeneralEntityReporte1(retencionventaAux.getperiododeclara_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_IDTIPORETENCION)) {
					existe=true;
					retencionventaAux.setsDescripcionGeneralEntityReporte1(retencionventaAux.gettiporetencion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_RUC)) {
					existe=true;
					retencionventaAux.setsDescripcionGeneralEntityReporte1(retencionventaAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_NUMERORETENCION)) {
					existe=true;
					retencionventaAux.setsDescripcionGeneralEntityReporte1(retencionventaAux.getnumero_retencion());
				}
				 else if(sTipoSeleccionar.equals(RetencionVentaConstantesFunciones.LABEL_ESDEBITO)) {
					existe=true;
					retencionventaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(retencionventaAux.getes_debito()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RetencionVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRetencionVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRetencionVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=true;
				this.isVisibilidadCeldaGuardarCambiosRetencionVenta=true;
			}
			
			this.isVisibilidadCeldaModificarRetencionVenta=false;
			this.isVisibilidadCeldaActualizarRetencionVenta=false;
			this.isVisibilidadCeldaEliminarRetencionVenta=false;
			this.isVisibilidadCeldaCancelarRetencionVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRetencionVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=false;
			this.isVisibilidadCeldaModificarRetencionVenta=false;
			this.isVisibilidadCeldaActualizarRetencionVenta=true;
			this.isVisibilidadCeldaEliminarRetencionVenta=false;
			this.isVisibilidadCeldaCancelarRetencionVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRetencionVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=false;
			this.isVisibilidadCeldaModificarRetencionVenta=false;
			this.isVisibilidadCeldaActualizarRetencionVenta=true;
			this.isVisibilidadCeldaEliminarRetencionVenta=true;
			this.isVisibilidadCeldaCancelarRetencionVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRetencionVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=false;
			this.isVisibilidadCeldaModificarRetencionVenta=false;
			this.isVisibilidadCeldaActualizarRetencionVenta=true;
			this.isVisibilidadCeldaEliminarRetencionVenta=false;
			this.isVisibilidadCeldaCancelarRetencionVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRetencionVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=true;
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=true;
			this.isVisibilidadCeldaModificarRetencionVenta=false;
			this.isVisibilidadCeldaActualizarRetencionVenta=false;
			this.isVisibilidadCeldaEliminarRetencionVenta=false;
			this.isVisibilidadCeldaCancelarRetencionVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarRetencionVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRetencionVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=false;
			this.isVisibilidadCeldaActualizarRetencionVenta=false;
			this.isVisibilidadCeldaEliminarRetencionVenta=false;
			this.isVisibilidadCeldaCancelarRetencionVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRetencionVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=false;
			this.isVisibilidadCeldaModificarRetencionVenta=true;
			this.isVisibilidadCeldaActualizarRetencionVenta=false;
			this.isVisibilidadCeldaEliminarRetencionVenta=false;
			this.isVisibilidadCeldaCancelarRetencionVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRetencionVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarRetencionVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RetencionVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRetencionVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=true;
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=true;
		} else {
			this.actualizarEstadoPanelsRetencionVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRetencionVenta=false;
			//this.isVisibilidadCeldaVerFormRetencionVenta=false;
			this.isVisibilidadCeldaDuplicarRetencionVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!retencionventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoRetencionVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRetencionVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(retencionventaSessionBean.getEsGuardarRelacionado()) {
			if(!retencionventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=false;												
			}
			
			this.jButtonCerrarRetencionVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRetencionVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.retencionventa)) {
			this.isVisibilidadCeldaActualizarRetencionVenta=false;
			this.isVisibilidadCeldaEliminarRetencionVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRetencionVenta() {
	}
	
	public void actualizarEstadoPanelsRetencionVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRetencionVenta!=null) {
				this.jScrollPanelDatosEdicionRetencionVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionVenta!=null) {
				this.jTabbedPaneBusquedasRetencionVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionVenta!=null) {
				this.jScrollPanelDatosRetencionVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionVenta!=null) {
				this.jPanelPaginacionRetencionVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionVenta!=null) {
				this.jPanelParametrosReportesRetencionVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRetencionVenta!=null) {
				this.jScrollPanelDatosEdicionRetencionVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionVenta!=null) {
				this.jTabbedPaneBusquedasRetencionVenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRetencionVenta!=null) {
				this.jScrollPanelDatosRetencionVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionVenta!=null) {
				this.jPanelPaginacionRetencionVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionVenta!=null) {
				this.jPanelParametrosReportesRetencionVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRetencionVenta!=null) {
				this.jScrollPanelDatosEdicionRetencionVenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionVenta!=null) {
				this.jTabbedPaneBusquedasRetencionVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRetencionVenta!=null) {
				this.jScrollPanelDatosRetencionVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionVenta!=null) {
				this.jPanelPaginacionRetencionVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionVenta!=null) {
				this.jPanelParametrosReportesRetencionVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRetencionVenta!=null) {
				this.jScrollPanelDatosEdicionRetencionVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionVenta!=null) {
				this.jTabbedPaneBusquedasRetencionVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRetencionVenta!=null) {
				this.jScrollPanelDatosRetencionVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionRetencionVenta!=null) {
				this.jPanelPaginacionRetencionVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRetencionVenta!=null) {
				this.jPanelParametrosReportesRetencionVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRetencionVenta!=null) {
				this.jScrollPanelDatosEdicionRetencionVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionVenta!=null) {
				this.jTabbedPaneBusquedasRetencionVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionVenta!=null) {
				this.jScrollPanelDatosRetencionVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionVenta!=null) {
				this.jPanelPaginacionRetencionVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionVenta!=null) {
				this.jPanelParametrosReportesRetencionVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRetencionVenta!=null) {
				this.jScrollPanelDatosEdicionRetencionVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionVenta!=null) {
				this.jTabbedPaneBusquedasRetencionVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionVenta!=null) {
				this.jScrollPanelDatosRetencionVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionVenta!=null) {
				this.jPanelPaginacionRetencionVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionVenta!=null) {
				this.jPanelParametrosReportesRetencionVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRetencionVenta!=null) {
				this.jScrollPanelDatosEdicionRetencionVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionVenta!=null) {
				this.jTabbedPaneBusquedasRetencionVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRetencionVenta!=null) {
				this.jScrollPanelDatosRetencionVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRetencionVenta!=null) {
				this.jPanelPaginacionRetencionVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRetencionVenta!=null) {
				this.jPanelParametrosReportesRetencionVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.retencionventaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRetencionVenta!=null) {
					this.jTabbedPaneBusquedasRetencionVenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRetencionVenta!=null) {
				this.jPanelParametrosReportesRetencionVenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.retencionventaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRetencionVenta!=null) {
				this.jTabbedPaneBusquedasRetencionVenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRetencionVenta!=null) {
				this.jPanelParametrosReportesRetencionVenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdPeriodoDeclara=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasRetencionVenta.remove(jPanelFK_IdPeriodoDeclaraRetencionVenta);}

			this.isVisibilidadFK_IdTipoRetencion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionVenta.remove(jPanelFK_IdTipoRetencionRetencionVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodoDeclara(Boolean isParaPeriodoDeclara){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoDeclaraNegation=!isParaPeriodoDeclara;

			this.isVisibilidadFK_IdPeriodoDeclara=isParaPeriodoDeclara;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasRetencionVenta.remove(jPanelFK_IdPeriodoDeclaraRetencionVenta);}

			this.isVisibilidadFK_IdTipoRetencion=isParaPeriodoDeclaraNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionVenta.remove(jPanelFK_IdTipoRetencionRetencionVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRetencion(Boolean isParaTipoRetencion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRetencionNegation=!isParaTipoRetencion;

			this.isVisibilidadFK_IdPeriodoDeclara=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdPeriodoDeclara) {this.jTabbedPaneBusquedasRetencionVenta.remove(jPanelFK_IdPeriodoDeclaraRetencionVenta);}

			this.isVisibilidadFK_IdTipoRetencion=isParaTipoRetencion;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasRetencionVenta.remove(jPanelFK_IdTipoRetencionRetencionVenta);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RetencionVentaSessionBean retencionventaSessionBean=new RetencionVentaSessionBean();
		
		if(this.retencionventaSessionBean==null) {
			this.retencionventaSessionBean=new RetencionVentaSessionBean();
		}
		
		this.retencionventaSessionBean.setsUltimaBusquedaRetencionVenta(this.getsAccionBusqueda());
		this.retencionventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.retencionventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			retencionventaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodoDeclara")) {
			retencionventaSessionBean.setid_periodo_declara(this.getid_periodo_declaraFK_IdPeriodoDeclara());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoRetencion")) {
			retencionventaSessionBean.setid_tipo_retencion(this.getid_tipo_retencionFK_IdTipoRetencion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RetencionVentaSessionBean retencionventaSessionBean=new RetencionVentaSessionBean();
		
		if(this.retencionventaSessionBean==null) {
			this.retencionventaSessionBean=new RetencionVentaSessionBean();
		}
		
		if(this.retencionventaSessionBean.getsUltimaBusquedaRetencionVenta()!=null&&!this.retencionventaSessionBean.getsUltimaBusquedaRetencionVenta().equals("")) {
			this.setsAccionBusqueda(retencionventaSessionBean.getsUltimaBusquedaRetencionVenta());
			this.setiNumeroPaginacion(retencionventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(retencionventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(retencionventaSessionBean.getid_empresa());
				retencionventaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodoDeclara")) {
				this.setid_periodo_declaraFK_IdPeriodoDeclara(retencionventaSessionBean.getid_periodo_declara());
				retencionventaSessionBean.setid_periodo_declara(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoRetencion")) {
				this.setid_tipo_retencionFK_IdTipoRetencion(retencionventaSessionBean.getid_tipo_retencion());
				retencionventaSessionBean.setid_tipo_retencion(-1L);
			}
		}
		
		this.retencionventaSessionBean.setsUltimaBusquedaRetencionVenta("");
		this.retencionventaSessionBean.setiNumeroPaginacion(RetencionVentaConstantesFunciones.INUMEROPAGINACION);
		this.retencionventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRetencionVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRetencionVenta() {
		this.updateBorderResaltarBusquedasFormularioRetencionVenta();
		this.updateVisibilidadBusquedasFormularioRetencionVenta();
		this.updateHabilitarBusquedasFormularioRetencionVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioRetencionVenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRetencionVenta.getComponents().length>0) {
	

		if(this.retencionventaConstantesFunciones.resaltarFK_IdPeriodoDeclaraRetencionVenta!=null) {
			index= this.jTabbedPaneBusquedasRetencionVenta.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraRetencionVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionVenta.getComponent(index);
				jPanel.setBorder(this.retencionventaConstantesFunciones.resaltarFK_IdPeriodoDeclaraRetencionVenta);
			}
		}

		if(this.retencionventaConstantesFunciones.resaltarFK_IdTipoRetencionRetencionVenta!=null) {
			index= this.jTabbedPaneBusquedasRetencionVenta.indexOfComponent(this.jPanelFK_IdTipoRetencionRetencionVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionVenta.getComponent(index);
				jPanel.setBorder(this.retencionventaConstantesFunciones.resaltarFK_IdTipoRetencionRetencionVenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRetencionVenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRetencionVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRetencionVenta.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraRetencionVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.retencionventaConstantesFunciones.mostrarFK_IdPeriodoDeclaraRetencionVenta);
			if(!this.retencionventaConstantesFunciones.mostrarFK_IdPeriodoDeclaraRetencionVenta && index>-1) {
				this.jTabbedPaneBusquedasRetencionVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasRetencionVenta.indexOfComponent(this.jPanelFK_IdTipoRetencionRetencionVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.retencionventaConstantesFunciones.mostrarFK_IdTipoRetencionRetencionVenta);
			if(!this.retencionventaConstantesFunciones.mostrarFK_IdTipoRetencionRetencionVenta && index>-1) {
				this.jTabbedPaneBusquedasRetencionVenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRetencionVenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRetencionVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRetencionVenta.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraRetencionVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.retencionventaConstantesFunciones.activarFK_IdPeriodoDeclaraRetencionVenta);
				this.jTabbedPaneBusquedasRetencionVenta.setEnabledAt(index,this.retencionventaConstantesFunciones.activarFK_IdPeriodoDeclaraRetencionVenta);
			}

			index= this.jTabbedPaneBusquedasRetencionVenta.indexOfComponent(this.jPanelFK_IdTipoRetencionRetencionVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.retencionventaConstantesFunciones.activarFK_IdTipoRetencionRetencionVenta);
				this.jTabbedPaneBusquedasRetencionVenta.setEnabledAt(index,this.retencionventaConstantesFunciones.activarFK_IdTipoRetencionRetencionVenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRetencionVenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPeriodoDeclara")) {
			index= this.jTabbedPaneBusquedasRetencionVenta.indexOfComponent(this.jPanelFK_IdPeriodoDeclaraRetencionVenta);

			this.jTabbedPaneBusquedasRetencionVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionVenta.getComponent(index);

			this.retencionventaConstantesFunciones.setResaltarFK_IdPeriodoDeclaraRetencionVenta(resaltar);

			jPanel.setBorder(this.retencionventaConstantesFunciones.resaltarFK_IdPeriodoDeclaraRetencionVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoRetencion")) {
			index= this.jTabbedPaneBusquedasRetencionVenta.indexOfComponent(this.jPanelFK_IdTipoRetencionRetencionVenta);

			this.jTabbedPaneBusquedasRetencionVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRetencionVenta.getComponent(index);

			this.retencionventaConstantesFunciones.setResaltarFK_IdTipoRetencionRetencionVenta(resaltar);

			jPanel.setBorder(this.retencionventaConstantesFunciones.resaltarFK_IdTipoRetencionRetencionVenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRetencionVenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRetencionVenta() throws Exception {

		if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRetencionVenta();
		this.updateVisibilidadResaltarControlesFormularioRetencionVenta();
		this.updateHabilitarResaltarControlesFormularioRetencionVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioRetencionVenta() throws Exception {
		if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.retencionventaConstantesFunciones.resaltaridRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta!=null) {this.jInternalFrameDetalleFormRetencionVenta.jLabelidRetencionVenta.setBorder(this.retencionventaConstantesFunciones.resaltaridRetencionVenta);}
		if(this.retencionventaConstantesFunciones.resaltarid_empresaRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta!=null) {this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.setBorder(this.retencionventaConstantesFunciones.resaltarid_empresaRetencionVenta);}
		if(this.retencionventaConstantesFunciones.resaltarid_periodo_declaraRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta!=null) {this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.setBorder(this.retencionventaConstantesFunciones.resaltarid_periodo_declaraRetencionVenta);}
		if(this.retencionventaConstantesFunciones.resaltarid_tipo_retencionRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta!=null) {this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.setBorder(this.retencionventaConstantesFunciones.resaltarid_tipo_retencionRetencionVenta);}
		if(this.retencionventaConstantesFunciones.resaltarrucRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta!=null) {this.jInternalFrameDetalleFormRetencionVenta.jTextFieldrucRetencionVenta.setBorder(this.retencionventaConstantesFunciones.resaltarrucRetencionVenta);}
		if(this.retencionventaConstantesFunciones.resaltarnumero_retencionRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta!=null) {this.jInternalFrameDetalleFormRetencionVenta.jTextFieldnumero_retencionRetencionVenta.setBorder(this.retencionventaConstantesFunciones.resaltarnumero_retencionRetencionVenta);}
		if(this.retencionventaConstantesFunciones.resaltarbase_imponibleRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta!=null) {this.jInternalFrameDetalleFormRetencionVenta.jTextFieldbase_imponibleRetencionVenta.setBorder(this.retencionventaConstantesFunciones.resaltarbase_imponibleRetencionVenta);}
		if(this.retencionventaConstantesFunciones.resaltarporcentajeRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta!=null) {this.jInternalFrameDetalleFormRetencionVenta.jTextFieldporcentajeRetencionVenta.setBorder(this.retencionventaConstantesFunciones.resaltarporcentajeRetencionVenta);}
		if(this.retencionventaConstantesFunciones.resaltarvalorRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta!=null) {this.jInternalFrameDetalleFormRetencionVenta.jTextFieldvalorRetencionVenta.setBorder(this.retencionventaConstantesFunciones.resaltarvalorRetencionVenta);}
		if(this.retencionventaConstantesFunciones.resaltares_debitoRetencionVenta!=null && this.jInternalFrameDetalleFormRetencionVenta!=null) {this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxes_debitoRetencionVenta.setBorderPainted(true);this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxes_debitoRetencionVenta.setBorder(this.retencionventaConstantesFunciones.resaltares_debitoRetencionVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRetencionVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
	
		//this.jInternalFrameDetalleFormRetencionVenta.jLabelidRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostraridRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jPanelidRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostraridRetencionVenta);
		//this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarid_empresaRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jPanelid_empresaRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarid_empresaRetencionVenta);
		//this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarid_periodo_declaraRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jPanelid_periodo_declaraRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarid_periodo_declaraRetencionVenta);
		//this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarid_tipo_retencionRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jPanelid_tipo_retencionRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarid_tipo_retencionRetencionVenta);
		//this.jInternalFrameDetalleFormRetencionVenta.jTextFieldrucRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarrucRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jPanelrucRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarrucRetencionVenta);
		//this.jInternalFrameDetalleFormRetencionVenta.jTextFieldnumero_retencionRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarnumero_retencionRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jPanelnumero_retencionRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarnumero_retencionRetencionVenta);
		//this.jInternalFrameDetalleFormRetencionVenta.jTextFieldbase_imponibleRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarbase_imponibleRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jPanelbase_imponibleRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarbase_imponibleRetencionVenta);
		//this.jInternalFrameDetalleFormRetencionVenta.jTextFieldporcentajeRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarporcentajeRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jPanelporcentajeRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarporcentajeRetencionVenta);
		//this.jInternalFrameDetalleFormRetencionVenta.jTextFieldvalorRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarvalorRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jPanelvalorRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrarvalorRetencionVenta);
		//this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxes_debitoRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrares_debitoRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jPaneles_debitoRetencionVenta.setVisible(this.retencionventaConstantesFunciones.mostrares_debitoRetencionVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRetencionVenta() throws Exception {
		if(this.jInternalFrameDetalleFormRetencionVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRetencionVenta!=null) {
	
		this.jInternalFrameDetalleFormRetencionVenta.jLabelidRetencionVenta.setEnabled(this.retencionventaConstantesFunciones.activaridRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_empresaRetencionVenta.setEnabled(this.retencionventaConstantesFunciones.activarid_empresaRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_periodo_declaraRetencionVenta.setEnabled(this.retencionventaConstantesFunciones.activarid_periodo_declaraRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jComboBoxid_tipo_retencionRetencionVenta.setEnabled(this.retencionventaConstantesFunciones.activarid_tipo_retencionRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jTextFieldrucRetencionVenta.setEnabled(this.retencionventaConstantesFunciones.activarrucRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jTextFieldnumero_retencionRetencionVenta.setEnabled(this.retencionventaConstantesFunciones.activarnumero_retencionRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jTextFieldbase_imponibleRetencionVenta.setEnabled(this.retencionventaConstantesFunciones.activarbase_imponibleRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jTextFieldporcentajeRetencionVenta.setEnabled(this.retencionventaConstantesFunciones.activarporcentajeRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jTextFieldvalorRetencionVenta.setEnabled(this.retencionventaConstantesFunciones.activarvalorRetencionVenta);
		this.jInternalFrameDetalleFormRetencionVenta.jCheckBoxes_debitoRetencionVenta.setEnabled(this.retencionventaConstantesFunciones.activares_debitoRetencionVenta);
		}
	}
	
		
}