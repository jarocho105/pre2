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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.TipoPago_NMConstantesFunciones;
import com.bydan.erp.nomina.util.TipoPago_NMParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoPago_NMParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoPago_NMBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoPago_NMBeanSwingJInternalFrame extends TipoPago_NMJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoPago_NMBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoPago_NM> tipopago_nmValidator = new ClassValidator<TipoPago_NM>(TipoPago_NM.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoPago_NM tipopago_nm;	
	public TipoPago_NM tipopago_nmAux;
	public TipoPago_NM tipopago_nmAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoPago_NM tipopago_nmTotales;
	public Long idTipoPago_NMActual;
	public Long iIdNuevoTipoPago_NM=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosEstructura=false;

	public Boolean getIsTienePermisosEstructura() {
		return isTienePermisosEstructura;
	}

	public void setIsTienePermisosEstructura(Boolean isTienePermisosEstructura) {
		this.isTienePermisosEstructura= isTienePermisosEstructura;
	}


	public Boolean isTienePermisosCargo=false;

	public Boolean getIsTienePermisosCargo() {
		return isTienePermisosCargo;
	}

	public void setIsTienePermisosCargo(Boolean isTienePermisosCargo) {
		this.isTienePermisosCargo= isTienePermisosCargo;
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
	
	public Boolean isPermisoTodoTipoPago_NM;
	public Boolean isPermisoNuevoTipoPago_NM;
	public Boolean isPermisoActualizarTipoPago_NM;
	public Boolean isPermisoActualizarOriginalTipoPago_NM;
	public Boolean isPermisoEliminarTipoPago_NM;
	public Boolean isPermisoGuardarCambiosTipoPago_NM;
	public Boolean isPermisoConsultaTipoPago_NM;
	public Boolean isPermisoBusquedaTipoPago_NM;
	public Boolean isPermisoReporteTipoPago_NM;
	public Boolean isPermisoPaginacionMedioTipoPago_NM;
	public Boolean isPermisoPaginacionAltoTipoPago_NM;
	public Boolean isPermisoPaginacionTodoTipoPago_NM;
	public Boolean isPermisoCopiarTipoPago_NM;
	public Boolean isPermisoVerFormTipoPago_NM;
	public Boolean isPermisoDuplicarTipoPago_NM;
	public Boolean isPermisoOrdenTipoPago_NM;
	
	
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
	
	public TipoPago_NMParameterReturnGeneral tipopago_nmReturnGeneral;
	public TipoPago_NMParameterReturnGeneral tipopago_nmParameterGeneral;
	
	

	public EstructuraLogic estructuraLogic=null;

	public EstructuraLogic getEstructuraLogic() {
		return estructuraLogic;
	}

	public void setEstructuraLogic(EstructuraLogic estructuraLogic) {
		this.estructuraLogic = estructuraLogic;
	}


	public CargoLogic cargoLogic=null;

	public CargoLogic getCargoLogic() {
		return cargoLogic;
	}

	public void setCargoLogic(CargoLogic cargoLogic) {
		this.cargoLogic = cargoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoPago_NM=false;
	public Boolean esParaAccionDesdeFormularioTipoPago_NM=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoPago_NMSessionBeanAdditional tipopago_nmSessionBeanAdditional=null;
	
	public TipoPago_NMSessionBeanAdditional getTipoPago_NMSessionBeanAdditional() {
		return this.tipopago_nmSessionBeanAdditional;
	}
	
	public void setTipoPago_NMSessionBeanAdditional(TipoPago_NMSessionBeanAdditional tipopago_nmSessionBeanAdditional) {
		try {
			this.tipopago_nmSessionBeanAdditional=tipopago_nmSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoPago_NMBeanSwingJInternalFrameAdditional tipopago_nmBeanSwingJInternalFrameAdditional=null;
	//public class TipoPago_NMBeanSwingJInternalFrame
	
	public TipoPago_NMBeanSwingJInternalFrameAdditional getTipoPago_NMBeanSwingJInternalFrameAdditional() {
		return this.tipopago_nmBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoPago_NMBeanSwingJInternalFrameAdditional(TipoPago_NMBeanSwingJInternalFrameAdditional tipopago_nmBeanSwingJInternalFrameAdditional) {
		try {
			this.tipopago_nmBeanSwingJInternalFrameAdditional=tipopago_nmBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoPago_NMLogic tipopago_nmLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoPago_NM tipopago_nmBean;
	public TipoPago_NMConstantesFunciones tipopago_nmConstantesFunciones;
	//public TipoPago_NMParameterReturnGeneral tipopago_nmReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoPago_NM> tipopago_nms;	
	//public List<TipoPago_NM> tipopago_nmsEliminados;
	//public List<TipoPago_NM> tipopago_nmsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoPago_NM=false;
	public Boolean isVisibilidadCeldaDuplicarTipoPago_NM=true;
	public Boolean isVisibilidadCeldaCopiarTipoPago_NM=true;
	public Boolean isVisibilidadCeldaVerFormTipoPago_NM=true;
	public Boolean isVisibilidadCeldaOrdenTipoPago_NM=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoPago_NM=false;
	public Boolean isVisibilidadCeldaModificarTipoPago_NM=false;
	public Boolean isVisibilidadCeldaActualizarTipoPago_NM=false;
	public Boolean isVisibilidadCeldaEliminarTipoPago_NM=false;
	public Boolean isVisibilidadCeldaCancelarTipoPago_NM=false;
	public Boolean isVisibilidadCeldaGuardarTipoPago_NM=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoPago_NM=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoPago_NM() {
		return this.iIdNuevoTipoPago_NM;
	}

	public void setiIdNuevoTipoPago_NM(Long iIdNuevoTipoPago_NM) {
		this.iIdNuevoTipoPago_NM = iIdNuevoTipoPago_NM;
	}
	
	public Long getidTipoPago_NMActual() {
		return this.idTipoPago_NMActual;
	}

	public void setidTipoPago_NMActual(Long idTipoPago_NMActual) {
		this.idTipoPago_NMActual = idTipoPago_NMActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoPago_NM gettipopago_nm() {
		return this.tipopago_nm;
	}

	public void settipopago_nm(TipoPago_NM tipopago_nm) {
		this.tipopago_nm = tipopago_nm;
	}
	
	public TipoPago_NM gettipopago_nmAux() {
		return this.tipopago_nmAux;
	}

	public void settipopago_nmAux(TipoPago_NM tipopago_nmAux) {
		this.tipopago_nmAux = tipopago_nmAux;
	}				
	
	public TipoPago_NM gettipopago_nmAnterior() {
		return this.tipopago_nmAnterior;
	}

	public void settipopago_nmAnterior(TipoPago_NM tipopago_nmAnterior) {
		this.tipopago_nmAnterior = tipopago_nmAnterior;
	}	
	
	public TipoPago_NM gettipopago_nmTotales() {
		return this.tipopago_nmTotales;
	}

	public void settipopago_nmTotales(TipoPago_NM tipopago_nmTotales) {
		this.tipopago_nmTotales = tipopago_nmTotales;
	}	
	
	public TipoPago_NM gettipopago_nmBean() {
		return this.tipopago_nmBean;
	}

	public void settipopago_nmBean(TipoPago_NM tipopago_nmBean) {
		this.tipopago_nmBean = tipopago_nmBean;
	}	
	
	public TipoPago_NMParameterReturnGeneral gettipopago_nmReturnGeneral() {
		return this.tipopago_nmReturnGeneral;
	}

	public void settipopago_nmReturnGeneral(TipoPago_NMParameterReturnGeneral tipopago_nmReturnGeneral) {
		this.tipopago_nmReturnGeneral = tipopago_nmReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoPago_NMLogic getTipoPago_NMLogic()	{		
		return tipopago_nmLogic;
	}

	public void setTipoPago_NMLogic(TipoPago_NMLogic tipopago_nmLogic) {
		this.tipopago_nmLogic = tipopago_nmLogic;
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
	
	public Boolean getIsEsNuevoTipoPago_NM() {
		return isEsNuevoTipoPago_NM;
	}

	public void setIsEsNuevoTipoPago_NM(Boolean isEsNuevoTipoPago_NM) {
		this.isEsNuevoTipoPago_NM = isEsNuevoTipoPago_NM;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoPago_NM() {
		return esParaAccionDesdeFormularioTipoPago_NM;
	}
	
	public void setEsParaAccionDesdeFormularioTipoPago_NM(Boolean esParaAccionDesdeFormularioTipoPago_NM) {
		this.esParaAccionDesdeFormularioTipoPago_NM = esParaAccionDesdeFormularioTipoPago_NM;
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

			if(this.tipopago_nmSessionBean==null) {
				this.tipopago_nmSessionBean=new TipoPago_NMSessionBean();
			}

			if(!this.tipopago_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipopago_nmSessionBean.getlidEmpresaActual());
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

					if(this.tipopago_nm!=null) {
						this.tipopago_nm.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
						this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoPago_NM.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
						if(this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoPago_NMGenerico)throws Exception
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
				jComboBoxid_empresaTipoPago_NMGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoPago_NMGenerico!=null && jComboBoxid_empresaTipoPago_NMGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoPago_NMGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoPago_NM tipopago_nm,JComboBox jComboBoxid_empresaTipoPago_NMGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoPago_NMGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoPago_NMGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipopago_nm.setid_empresa(empresaAux.getId());
				tipopago_nm.setempresa_descripcion(TipoPago_NMConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipopago_nm.setEmpresa(empresaAux);			}
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

					if(!TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { 
							this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { 
					}

					if(!TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
							this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
							this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoPago_NM() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoPago_NMConstantesFunciones.refrescarForeignKeysDescripcionesTipoPago_NM(this.tipopago_nmLogic.getTipoPago_NMs());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoPago_NMConstantesFunciones.refrescarForeignKeysDescripcionesTipoPago_NM(this.tipopago_nms);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipopago_nmLogic.setTipoPago_NMs(this.tipopago_nms);
			tipopago_nmLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoPago_NMParameterReturnGeneral getTipoPago_NMParameterGeneral() {
		return this.tipopago_nmParameterGeneral;
	}
	
	public void setTipoPago_NMParameterGeneral(TipoPago_NMParameterReturnGeneral tipopago_nmParameterGeneral) {
		this.tipopago_nmParameterGeneral = tipopago_nmParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoPago_NM() {
		return isPermisoTodoTipoPago_NM;
	}

	public void setIsPermisoTodoTipoPago_NM(Boolean isPermisoTodoTipoPago_NM) {
		this.isPermisoTodoTipoPago_NM = isPermisoTodoTipoPago_NM;
	}

	public Boolean getIsPermisoNuevoTipoPago_NM() {
		return isPermisoNuevoTipoPago_NM;
	}

	public void setIsPermisoNuevoTipoPago_NM(Boolean isPermisoNuevoTipoPago_NM) {
		this.isPermisoNuevoTipoPago_NM = isPermisoNuevoTipoPago_NM;
	}

	public Boolean getIsPermisoActualizarTipoPago_NM() {
		return isPermisoActualizarTipoPago_NM;
	}

	public void setIsPermisoActualizarTipoPago_NM(Boolean isPermisoActualizarTipoPago_NM) {
		this.isPermisoActualizarTipoPago_NM = isPermisoActualizarTipoPago_NM;
	}

	public Boolean getIsPermisoEliminarTipoPago_NM() {
		return isPermisoEliminarTipoPago_NM;
	}

	public void setIsPermisoEliminarTipoPago_NM(Boolean isPermisoEliminarTipoPago_NM) {
		this.isPermisoEliminarTipoPago_NM = isPermisoEliminarTipoPago_NM;
	}

	public Boolean getIsPermisoGuardarCambiosTipoPago_NM() {
		return isPermisoGuardarCambiosTipoPago_NM;
	}

	public void setIsPermisoGuardarCambiosTipoPago_NM(Boolean isPermisoGuardarCambiosTipoPago_NM) {
		this.isPermisoGuardarCambiosTipoPago_NM = isPermisoGuardarCambiosTipoPago_NM;
	}
	
	public Boolean getIsPermisoConsultaTipoPago_NM() {
		return isPermisoConsultaTipoPago_NM;
	}

	public void setIsPermisoConsultaTipoPago_NM(Boolean isPermisoConsultaTipoPago_NM) {
		this.isPermisoConsultaTipoPago_NM = isPermisoConsultaTipoPago_NM;
	}

	public Boolean getIsPermisoBusquedaTipoPago_NM() {
		return isPermisoBusquedaTipoPago_NM;
	}

	public void setIsPermisoBusquedaTipoPago_NM(Boolean isPermisoBusquedaTipoPago_NM) {
		this.isPermisoBusquedaTipoPago_NM = isPermisoBusquedaTipoPago_NM;
	}

	public Boolean getIsPermisoReporteTipoPago_NM() {
		return isPermisoReporteTipoPago_NM;
	}

	public void setIsPermisoReporteTipoPago_NM(Boolean isPermisoReporteTipoPago_NM) {
		this.isPermisoReporteTipoPago_NM = isPermisoReporteTipoPago_NM;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoPago_NM() {
		return isPermisoPaginacionMedioTipoPago_NM;
	}

	public void setIsPermisoPaginacionMedioTipoPago_NM(Boolean isPermisoPaginacionMedioTipoPago_NM) {
		this.isPermisoPaginacionMedioTipoPago_NM = isPermisoPaginacionMedioTipoPago_NM;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoPago_NM() {
		return isPermisoPaginacionTodoTipoPago_NM;
	}

	public void setIsPermisoPaginacionTodoTipoPago_NM(Boolean isPermisoPaginacionTodoTipoPago_NM) {
		this.isPermisoPaginacionTodoTipoPago_NM = isPermisoPaginacionTodoTipoPago_NM;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoPago_NM() {
		return isPermisoPaginacionAltoTipoPago_NM;
	}

	public void setIsPermisoPaginacionAltoTipoPago_NM(Boolean isPermisoPaginacionAltoTipoPago_NM) {
		this.isPermisoPaginacionAltoTipoPago_NM = isPermisoPaginacionAltoTipoPago_NM;
	}
	
	public Boolean getIsPermisoCopiarTipoPago_NM() {
		return isPermisoCopiarTipoPago_NM;
	}

	public void setIsPermisoCopiarTipoPago_NM(Boolean isPermisoCopiarTipoPago_NM) {
		this.isPermisoCopiarTipoPago_NM = isPermisoCopiarTipoPago_NM;
	}
	
	public Boolean getIsPermisoVerFormTipoPago_NM() {
		return isPermisoVerFormTipoPago_NM;
	}

	public void setIsPermisoVerFormTipoPago_NM(Boolean isPermisoVerFormTipoPago_NM) {
		this.isPermisoVerFormTipoPago_NM = isPermisoVerFormTipoPago_NM;
	}
	
	public Boolean getIsPermisoDuplicarTipoPago_NM() {
		return isPermisoDuplicarTipoPago_NM;
	}

	public void setIsPermisoDuplicarTipoPago_NM(Boolean isPermisoDuplicarTipoPago_NM) {
		this.isPermisoDuplicarTipoPago_NM = isPermisoDuplicarTipoPago_NM;
	}
	
	public Boolean getIsPermisoOrdenTipoPago_NM() {
		return isPermisoOrdenTipoPago_NM;
	}

	public void setIsPermisoOrdenTipoPago_NM(Boolean isPermisoOrdenTipoPago_NM) {
		this.isPermisoOrdenTipoPago_NM = isPermisoOrdenTipoPago_NM;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoPago_NM() {
		return isVisibilidadCeldaNuevoTipoPago_NM;
	}

	public void setIsVisibilidadCeldaNuevoTipoPago_NM(Boolean isVisibilidadCeldaNuevoTipoPago_NM) {
		this.isVisibilidadCeldaNuevoTipoPago_NM = isVisibilidadCeldaNuevoTipoPago_NM;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoPago_NM() {
		return isVisibilidadCeldaDuplicarTipoPago_NM;
	}

	public void setIsVisibilidadCeldaDuplicarTipoPago_NM(Boolean isVisibilidadCeldaDuplicarTipoPago_NM) {
		this.isVisibilidadCeldaDuplicarTipoPago_NM = isVisibilidadCeldaDuplicarTipoPago_NM;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoPago_NM() {
		return isVisibilidadCeldaCopiarTipoPago_NM;
	}

	public void setIsVisibilidadCeldaCopiarTipoPago_NM(Boolean isVisibilidadCeldaCopiarTipoPago_NM) {
		this.isVisibilidadCeldaCopiarTipoPago_NM = isVisibilidadCeldaCopiarTipoPago_NM;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoPago_NM() {
		return isVisibilidadCeldaVerFormTipoPago_NM;
	}

	public void setIsVisibilidadCeldaVerFormTipoPago_NM(Boolean isVisibilidadCeldaVerFormTipoPago_NM) {
		this.isVisibilidadCeldaVerFormTipoPago_NM = isVisibilidadCeldaVerFormTipoPago_NM;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoPago_NM() {
		return isVisibilidadCeldaOrdenTipoPago_NM;
	}

	public void setIsVisibilidadCeldaOrdenTipoPago_NM(Boolean isVisibilidadCeldaOrdenTipoPago_NM) {
		this.isVisibilidadCeldaOrdenTipoPago_NM = isVisibilidadCeldaOrdenTipoPago_NM;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoPago_NM() {
		return isVisibilidadCeldaNuevoRelacionesTipoPago_NM;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoPago_NM(Boolean isVisibilidadCeldaNuevoRelacionesTipoPago_NM) {
		this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM = isVisibilidadCeldaNuevoRelacionesTipoPago_NM;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoPago_NM() {
		return isVisibilidadCeldaModificarTipoPago_NM;
	}

	public void setIsVisibilidadCeldaModificarTipoPago_NM(Boolean isVisibilidadCeldaModificarTipoPago_NM) {
		this.isVisibilidadCeldaModificarTipoPago_NM = isVisibilidadCeldaModificarTipoPago_NM;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoPago_NM() {
		return isVisibilidadCeldaActualizarTipoPago_NM;
	}

	public void setIsVisibilidadCeldaActualizarTipoPago_NM(Boolean isVisibilidadCeldaActualizarTipoPago_NM) {
		this.isVisibilidadCeldaActualizarTipoPago_NM = isVisibilidadCeldaActualizarTipoPago_NM;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoPago_NM() {
		return isVisibilidadCeldaEliminarTipoPago_NM;
	}

	public void setIsVisibilidadCeldaEliminarTipoPago_NM(Boolean isVisibilidadCeldaEliminarTipoPago_NM) {
		this.isVisibilidadCeldaEliminarTipoPago_NM = isVisibilidadCeldaEliminarTipoPago_NM;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoPago_NM() {
		return isVisibilidadCeldaCancelarTipoPago_NM;
	}

	public void setIsVisibilidadCeldaCancelarTipoPago_NM(Boolean isVisibilidadCeldaCancelarTipoPago_NM) {
		this.isVisibilidadCeldaCancelarTipoPago_NM = isVisibilidadCeldaCancelarTipoPago_NM;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoPago_NM() {
		return isVisibilidadCeldaGuardarTipoPago_NM;
	}

	public void setIsVisibilidadCeldaGuardarTipoPago_NM(Boolean isVisibilidadCeldaGuardarTipoPago_NM) {
		this.isVisibilidadCeldaGuardarTipoPago_NM = isVisibilidadCeldaGuardarTipoPago_NM;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoPago_NM() {
		return isVisibilidadCeldaGuardarCambiosTipoPago_NM;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoPago_NM(Boolean isVisibilidadCeldaGuardarCambiosTipoPago_NM) {
		this.isVisibilidadCeldaGuardarCambiosTipoPago_NM = isVisibilidadCeldaGuardarCambiosTipoPago_NM;
	}
		
	public TipoPago_NMSessionBean gettipopago_nmSessionBean() {
		return this.tipopago_nmSessionBean;
	}
	
	public void settipopago_nmSessionBean(TipoPago_NMSessionBean tipopago_nmSessionBean) {
		this.tipopago_nmSessionBean=tipopago_nmSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(TipoPago_NM tipopago_nm)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipopago_nm,null);
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
	
	public void bugActualizarReferenciaActual(TipoPago_NM tipopago_nm,TipoPago_NM tipopago_nmAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoPago_NM(tipopago_nm);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipopago_nmAux.setId(tipopago_nm.getId());
		tipopago_nmAux.setVersionRow(tipopago_nm.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoPago_NM();
		
			int intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoPago_NM(this.tipopago_nm,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipopago_nmValidator.getInvalidValues(this.tipopago_nm);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipopago_nmLogic.setDatosCliente(datosCliente);
			tipopago_nmLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipopago_nmAux=new  TipoPago_NM();
				
				tipopago_nmAux.setIsNew(true);
				tipopago_nmAux.setIsChanged(true);
				
				tipopago_nmAux.setTipoPago_NMOriginal(this.tipopago_nm);
				
				tipopago_nmAux.setId(this.tipopago_nm.getId());	
				tipopago_nmAux.setVersionRow(this.tipopago_nm.getVersionRow());	
				tipopago_nmAux.setid_empresa(this.tipopago_nm.getid_empresa());	
				tipopago_nmAux.setcodigo(this.tipopago_nm.getcodigo());	
				tipopago_nmAux.setnombre(this.tipopago_nm.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipopago_nmSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipopago_nmAux,tipopago_nmLogic.getTipoPago_NMs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopago_nmAux,tipopago_nms);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopago_nmSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopago_nmLogic.saveTipoPago_NMs();//WithConnection
						//tipopago_nmLogic.getSetVersionRowTipoPago_NMs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipopago_nm,tipopago_nmAux);
					
					this.refrescarForeignKeysDescripcionesTipoPago_NM();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras().addAll(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuras.addAll(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipopago_nmLogic.saveTipoPago_NMRelaciones(tipopago_nmAux,this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras(),this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//tipopago_nmLogic.getSetVersionRowTipoPago_NMs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipopago_nm,tipopago_nmAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.setEstructuras(new ArrayList<Estructura>());
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuras= new ArrayList<Estructura>();
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.quitarFilaTotales();}
							tipopago_nmAux.setEstructuras(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras());

							if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipopago_nmAux.setCargos(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipopago_nmSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipopago_nmAux,tipopago_nmLogic.getTipoPago_NMs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipopago_nmAux,tipopago_nms);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipopago_nm,tipopago_nmAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipopago_nmAux=new  TipoPago_NM();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado() 
					|| (this.tipopago_nmSessionBean.getEsGuardarRelacionado() && this.tipopago_nm.getId()>=0)) {
						
					tipopago_nmAux.setIsNew(false);
				}
				
				tipopago_nmAux.setIsDeleted(false);
			
				tipopago_nmAux.setId(this.tipopago_nm.getId());	
				tipopago_nmAux.setVersionRow(this.tipopago_nm.getVersionRow());	
				tipopago_nmAux.setid_empresa(this.tipopago_nm.getid_empresa());	
				tipopago_nmAux.setcodigo(this.tipopago_nm.getcodigo());	
				tipopago_nmAux.setnombre(this.tipopago_nm.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipopago_nmAux,tipopago_nmLogic.getTipoPago_NMs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopago_nmAux,tipopago_nms);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopago_nmSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopago_nmLogic.saveTipoPago_NMs();//WithConnection
						//tipopago_nmLogic.getSetVersionRowTipoPago_NMs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipopago_nm,tipopago_nmAux);
					
					this.refrescarForeignKeysDescripcionesTipoPago_NM();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras().addAll(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuras.addAll(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipopago_nmLogic.saveTipoPago_NMRelaciones(tipopago_nmAux,this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras(),this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//tipopago_nmLogic.getSetVersionRowTipoPago_NMs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipopago_nm,tipopago_nmAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.setEstructuras(new ArrayList<Estructura>());
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuras= new ArrayList<Estructura>();
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.quitarFilaTotales();}
							tipopago_nmAux.setEstructuras(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras());

							if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipopago_nmAux.setCargos(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipopago_nmSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipopago_nmAux,tipopago_nmLogic.getTipoPago_NMs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipopago_nmAux,tipopago_nms);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipopago_nm,tipopago_nmAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipopago_nmAux=new  TipoPago_NM();
				
				tipopago_nmAux.setIsNew(false);
				tipopago_nmAux.setIsChanged(false);
				
				tipopago_nmAux.setIsDeleted(true);
				
				tipopago_nmAux.setId(this.tipopago_nm.getId());	
				tipopago_nmAux.setVersionRow(this.tipopago_nm.getVersionRow());	
				tipopago_nmAux.setid_empresa(this.tipopago_nm.getid_empresa());	
				tipopago_nmAux.setcodigo(this.tipopago_nm.getcodigo());	
				tipopago_nmAux.setnombre(this.tipopago_nm.getnombre());	
				
				if(this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipopago_nmAux.getId()>=0) {	
						this.tipopago_nmsEliminados.add(tipopago_nmAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipopago_nmAux,tipopago_nmLogic.getTipoPago_NMs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopago_nmAux,tipopago_nms);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipopago_nmSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopago_nmLogic.saveTipoPago_NMs();//WithConnection
						//tipopago_nmLogic.getSetVersionRowTipoPago_NMs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras().addAll(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuras.addAll(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipopago_nmLogic.saveTipoPago_NMRelaciones(tipopago_nmAux,this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras(),this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//tipopago_nmLogic.getSetVersionRowTipoPago_NMs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.setEstructuras(new ArrayList<Estructura>());
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuras= new ArrayList<Estructura>();
							this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.quitarFilaTotales();}
							tipopago_nmAux.setEstructuras(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras());

							if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipopago_nmAux.setCargos(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipopago_nmSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipopago_nmAux,tipopago_nmLogic.getTipoPago_NMs());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipopago_nmAux,tipopago_nms);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.getTipoPago_NMs().addAll(this.tipopago_nmsEliminados);
					
					tipopago_nmLogic.saveTipoPago_NMs();//WithConnection
					//tipopago_nmLogic.getSetVersionRowTipoPago_NMs();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoPago_NM();
				
				this.tipopago_nmsEliminados= new ArrayList<TipoPago_NM>();		
			}
			
			if(this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Pago_ N M GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Pago_ N M",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipopago_nm=tipopago_nmAux;
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
      		//this.finishProcessTipoPago_NM();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoPago_NM tipopago_nmLocal) throws Exception {
		
		if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipopago_nmLocal.setEstructuras(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras());
				tipopago_nmLocal.setCargos(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
			
			} else {
			
				tipopago_nmLocal.setEstructuras(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuras);
				tipopago_nmLocal.setCargos(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoPago_NM tipopago_nmLocal) throws Exception {	
		if(this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipopago_nmLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoPago_NMActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipopago_nmValidator.getInvalidValues(this.tipopago_nm);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoPago_NM tipopago_nm,List<TipoPago_NM> tipopago_nms) throws Exception {
		try	{		
			TipoPago_NMConstantesFunciones.actualizarLista(tipopago_nm,tipopago_nms,this.tipopago_nmSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoPago_NM tipopago_nm,List<TipoPago_NM> tipopago_nms) throws Exception {
		try	{			
			TipoPago_NMConstantesFunciones.actualizarSelectedLista(tipopago_nm,tipopago_nms);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoPago_NM> tipopago_nmsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipopago_nmsLocal=this.tipopago_nmLogic.getTipoPago_NMs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipopago_nmsLocal=this.tipopago_nms;
			}
			//ARCHITECTURE
		
			for(TipoPago_NM tipopago_nmLocal:tipopago_nmsLocal) {
				if(this.permiteMantenimiento(tipopago_nmLocal) && tipopago_nmLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoPago_NMConstantesFunciones.getTipoPago_NMLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoPago_NMConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago_NM.jLabelid_empresaTipoPago_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPago_NMConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago_NM.jLabelcodigoTipoPago_NM,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPago_NMConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago_NM.jLabelnombreTipoPago_NM,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPago_NM.jLabelid_empresaTipoPago_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPago_NM.jLabelcodigoTipoPago_NM,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPago_NM.jLabelnombreTipoPago_NM,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Estructura")) {
			if(this.tipopago_nm==null) {
				this.tipopago_nm= new TipoPago_NM();
			}

			if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoPago_NM
				this.setVariablesFormularioToObjetoActualTipoPago_NM(this.tipopago_nm,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);

				this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.getestructura().setTipoPago_NM(this.tipopago_nm);
			}

			return;
		}
		 else  if(sTipo.equals("Cargo")) {
			if(this.tipopago_nm==null) {
				this.tipopago_nm= new TipoPago_NM();
			}

			if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoPago_NM
				this.setVariablesFormularioToObjetoActualTipoPago_NM(this.tipopago_nm,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);

				this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.getcargo().setTipoPago_NM(this.tipopago_nm);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoPago_NM--;	
		
		
		this.tipopago_nmAux=new TipoPago_NM();
		
		this.tipopago_nmAux.setId(this.iIdNuevoTipoPago_NM);
		this.tipopago_nmAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipopago_nmLogic.getTipoPago_NMs().add(this.tipopago_nmAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipopago_nms.add(this.tipopago_nmAux);
		}
		//ARCHITECTURE
		
		this.tipopago_nm=this.tipopago_nmAux;
		
		if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoPago_NM(this.tipopago_nm);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPago_NM(this.tipopago_nm);
		}
				
		//this.setDefaultControlesTipoPago_NM();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoPago_NM();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoPago_NM();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPago_NM();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPago_NM(this.tipopago_nmBean,this.tipopago_nm,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoPago_NMConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
			classes=TipoPago_NMConstantesFunciones.getClassesRelationshipsOfTipoPago_NM(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipopago_nmReturnGeneral=tipopago_nmLogic.procesarEventosTipoPago_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopago_nmLogic.getTipoPago_NMs(),this.tipopago_nm,this.tipopago_nmParameterGeneral,this.isEsNuevoTipoPago_NM,classes);//this.tipopago_nmLogic.getTipoPago_NM()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoPago_NM(this.tipopago_nmReturnGeneral,this.tipopago_nmBean,false);
		
		if(this.tipopago_nmReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPago_NM(this.tipopago_nmReturnGeneral.getTipoPago_NM());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoPago_NM(this.tipopago_nmReturnGeneral.getTipoPago_NM());
		}
		
		if(this.tipopago_nmReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoPago_NM(this.tipopago_nmReturnGeneral.getTipoPago_NM(),classes);//this.tipopago_nmBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoPago_NM(this.tipopago_nm,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoPago_NM();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoPago_NM();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.RecargarFormTipoPago_NM(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoPago_NM(false);
						
			if(tipopago_nmSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraSessionBean.getEsGuardarRelacionado() && EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEstructuraActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado() && CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPago_NM();
			}
			
			this.actualizarVisualTableDatosTipoPago_NM();
			
			this.jTableDatosTipoPago_NM.setRowSelectionInterval(this.getIndiceNuevoTipoPago_NM(), this.getIndiceNuevoTipoPago_NM());
			
			this.seleccionarFilaTablaTipoPago_NMActual();
						
			this.actualizarEstadoCeldasBotonesTipoPago_NM("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoPago_NM(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoPago_NM.jTextFieldcodigoTipoPago_NM.setEnabled(isHabilitar && this.tipopago_nmConstantesFunciones.activarcodigoTipoPago_NM);
		this.jInternalFrameDetalleFormTipoPago_NM.jTextAreanombreTipoPago_NM.setEnabled(isHabilitar && this.tipopago_nmConstantesFunciones.activarnombreTipoPago_NM);	
		//
		this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.setEnabled(isHabilitar && this.tipopago_nmConstantesFunciones.activarid_empresaTipoPago_NM);
	};
	
	public void setDefaultControlesTipoPago_NM() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoPago_NM(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipopago_nmSessionBean.setConGuardarRelaciones(true);			
			this.tipopago_nmSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoPago_NM.jTabbedPaneRelacionesTipoPago_NM.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipopago_nmSessionBean.setConGuardarRelaciones(false);			
			this.tipopago_nmSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoPago_NM.jTabbedPaneRelacionesTipoPago_NM.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoPago_NM() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPago_NM tipopago_nmAux:this.tipopago_nmLogic.getTipoPago_NMs()) {
				if(tipopago_nmAux.getId().equals(this.iIdNuevoTipoPago_NM)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPago_NM tipopago_nmAux:this.tipopago_nms) {
				if(tipopago_nmAux.getId().equals(this.iIdNuevoTipoPago_NM)) {
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
	
	public int getIndiceActualTipoPago_NM(TipoPago_NM tipopago_nm,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPago_NM tipopago_nmAux:this.tipopago_nmLogic.getTipoPago_NMs()) {
				if(tipopago_nmAux.getId().equals(tipopago_nm.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPago_NM tipopago_nmAux:this.tipopago_nms) {
				if(tipopago_nmAux.getId().equals(tipopago_nm.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoPago_NM(TipoPago_NM tipopago_nmOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPago_NM tipopago_nmAux:this.tipopago_nmLogic.getTipoPago_NMs()) {
				if(tipopago_nmAux.getTipoPago_NMOriginal().getId().equals(tipopago_nmOriginal.getId())) {
					existe=true;
					tipopago_nmOriginal.setId(tipopago_nmAux.getId());
					tipopago_nmOriginal.setVersionRow(tipopago_nmAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPago_NM tipopago_nmAux:this.tipopago_nms) {
				if(tipopago_nmAux.getTipoPago_NMOriginal().getId().equals(tipopago_nmOriginal.getId())) {
					existe=true;
					tipopago_nmOriginal.setId(tipopago_nmAux.getId());
					tipopago_nmOriginal.setVersionRow(tipopago_nmAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoPago_NM(Boolean esParaCancelar) throws Exception {
		tipopago_nmsAux=new ArrayList<TipoPago_NM>();
		tipopago_nmAux=new TipoPago_NM();
		
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPago_NM tipopago_nmAux:this.tipopago_nmLogic.getTipoPago_NMs()) {
					if(tipopago_nmAux.getId()<0) {
						tipopago_nmsAux.add(tipopago_nmAux);
					}		
				}
				this.iIdNuevoTipoPago_NM=0L;
				this.tipopago_nmLogic.getTipoPago_NMs().removeAll(tipopago_nmsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPago_NM tipopago_nmAux:this.tipopago_nms) {
					if(tipopago_nmAux.getId()<0) {
						tipopago_nmsAux.add(tipopago_nmAux);
					}		
				}
				this.iIdNuevoTipoPago_NM=0L;
				this.tipopago_nms.removeAll(tipopago_nmsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoPago_NM 
					&& this.tipopago_nmLogic.getTipoPago_NMs().size()>0
					) {
					tipopago_nmAux=this.tipopago_nmLogic.getTipoPago_NMs().get(this.tipopago_nmLogic.getTipoPago_NMs().size() - 1);
				
					if(tipopago_nmAux.getId()<0) {
						this.tipopago_nmLogic.getTipoPago_NMs().remove(tipopago_nmAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoPago_NM && this.tipopago_nms.size()>0) {
					tipopago_nmAux=this.tipopago_nms.get(this.tipopago_nms.size() - 1);
				
					if(tipopago_nmAux.getId()<0) {
						this.tipopago_nms.remove(tipopago_nmAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoPago_NM(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipopago_nm.getId()<0) {
				this.tipopago_nmLogic.getTipoPago_NMs().remove(this.tipopago_nm);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipopago_nm.getId()<0) {
				this.tipopago_nms.remove(this.tipopago_nm);
			}
		}			
	}
	
	public void setEstadosInicialesTipoPago_NM(List<TipoPago_NM> tipopago_nmsAux) throws Exception {
		TipoPago_NMConstantesFunciones.setEstadosInicialesTipoPago_NM(tipopago_nmsAux);
	}
	
	public void setEstadosInicialesTipoPago_NM(TipoPago_NM tipopago_nmAux) throws Exception {
		TipoPago_NMConstantesFunciones.setEstadosInicialesTipoPago_NM(tipopago_nmAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoPago_NMActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoPago_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoPago_NMActual()) {
				if(!this.isEsNuevoTipoPago_NM) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoPago_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoPago_NM=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoPago_NMActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Pago_ N M ?", "MANTENIMIENTO DE Tipo Pago_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoPago_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoPago_NM tipopago_nm) throws Exception {
		TipoPago_NMConstantesFunciones.seleccionarAsignar(this.tipopago_nm,tipopago_nm);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoPago_NM=this.isPermisoActualizarOriginalTipoPago_NM;
			
			
			this.seleccionarAsignar(tipopago_nm);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPago_NMConstantesFunciones.quitarEspaciosTipoPago_NM(this.tipopago_nm,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoPago_NM("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipopago_nmSessionBean.setsFuncionBusquedaRapida(this.tipopago_nmSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoPago_NM) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoPago_NM(esParaCancelar);				
				this.cancelarNuevoTipoPago_NM(esParaCancelar);								
			}
			
			this.tipopago_nm=new TipoPago_NM();
			
			this.inicializarTipoPago_NM();
			
			this.actualizarEstadoCeldasBotonesTipoPago_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoPago_NM() throws Exception {
		try {
			TipoPago_NMConstantesFunciones.inicializarTipoPago_NM(this.tipopago_nm);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipopago_nmLogic.getTipoPago_NMs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoPago_NMs(String sAccionBusqueda,List<TipoPago_NM> tipopago_nmsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoPago_NM"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoPago_NMMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoPago_NMMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoPago_NM"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Pago_ N Mes");		
		parameters.put("busquedapor", TipoPago_NMConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Estructura.class));
			classes.add(new Classe(Cargo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoPago_NMLogic tipopago_nmLogicAuxiliar=new TipoPago_NMLogic();
					tipopago_nmLogicAuxiliar.setDatosCliente(tipopago_nmLogic.getDatosCliente());				
					tipopago_nmLogicAuxiliar.setTipoPago_NMs(tipopago_nmsParaReportes);
					
					tipopago_nmLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoPago_NMWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipopago_nmsParaReportes=tipopago_nmLogicAuxiliar.getTipoPago_NMs();
					
					//tipopago_nmLogic.getNewConnexionToDeep();
					
					//for (TipoPago_NM tipopago_nm:tipopago_nmsParaReportes) {
					//	tipopago_nmLogic.deepLoad(tipopago_nm, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipopago_nmLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipopago_nmLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEstructura = AuxiliarReportes.class.getResourceAsStream("EstructuraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_estructura", reportFileEstructura);

			InputStream reportFileCargo = AuxiliarReportes.class.getResourceAsStream("CargoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cargo", reportFileCargo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoPago_NM=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoPago_NMConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoPago_NMConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoPago_NM=new JRBeanArrayDataSource(TipoPago_NMJInternalFrame.TraerTipoPago_NMBeans(tipopago_nmsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoPago_NM);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoPago_NMConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoPago_NMConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoPago_NMBean.TraerTipoPago_NMBeans(tipopago_nmsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoPago_NMs(sAccionBusqueda,sTipoArchivoReporte,tipopago_nmsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoPago_NMs(sAccionBusqueda,sTipoArchivoReporte,tipopago_nmsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoPago_NMActionPerformed(null);
					//this.generarExcelReporteTipoPago_NMs(sAccionBusqueda,sTipoArchivoReporte,tipopago_nmsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoPago_NMs(sAccionBusqueda,sTipoArchivoReporte,tipopago_nmsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoPago_NMs(sAccionBusqueda,sTipoArchivoReporte,tipopago_nmsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoPago_NMs(sAccionBusqueda,sTipoArchivoReporte,tipopago_nmsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoPago_NMs(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPago_NM> tipopago_nmsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago_nm";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPago_NMs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPago_NM("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoPago_NM tipopago_nm : tipopago_nmsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoPago_NMConstantesFunciones.generarExcelReporteDataTipoPago_NM("NORMAL",row,workbook,tipopago_nm,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago_ N M",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoPago_NM(String sTipo,Row row,Workbook workbook) {
		
		TipoPago_NMConstantesFunciones.generarExcelReporteHeaderTipoPago_NM(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoPago_NMs(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPago_NM> tipopago_nmsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago_nm_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPago_NMs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoPago_NM tipopago_nm : tipopago_nmsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoPago_NMConstantesFunciones.getTipoPago_NMDescripcion(tipopago_nm));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipopago_nm.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPago_NMConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPago_NMConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipopago_nm.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPago_NMConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPago_NMConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipopago_nm.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago_ N M",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoPago_NMs(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPago_NM> tipopago_nmsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoPago_NM> tipopago_nmsRespaldo=null;
		
		classes=TipoPago_NMConstantesFunciones.getClassesRelationshipsOfTipoPago_NM(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipopago_nmLogic.setDatosCliente(this.datosCliente);
		this.tipopago_nmLogic.setDatosDeep(this.datosDeep);
		this.tipopago_nmLogic.setIsConDeep(true);
		
		tipopago_nmsRespaldo=this.tipopago_nmLogic.getTipoPago_NMs();
		
		this.tipopago_nmLogic.setTipoPago_NMs(tipopago_nmsParaReportes);	
		this.tipopago_nmLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipopago_nmsParaReportes=this.tipopago_nmLogic.getTipoPago_NMs();
		this.tipopago_nmLogic.setTipoPago_NMs(tipopago_nmsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago_nm_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPago_NMs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPago_NM("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoPago_NM tipopago_nm : tipopago_nmsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoPago_NM("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoPago_NMConstantesFunciones.generarExcelReporteDataTipoPago_NM("NORMAL",row,workbook,tipopago_nm,cellStyleDataAux);
		
			
			


				//Estructura
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EstructuraConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipopago_nm.getEstructuras()!=null && tipopago_nm.getEstructuras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EstructuraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EstructuraConstantesFunciones.generarExcelReporteHeaderEstructura("RELACIONADO",row,workbook);
				}

				if(tipopago_nm.getEstructuras()!=null) {
					i2=0;
					for(Estructura estructura : tipopago_nm.getEstructuras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EstructuraConstantesFunciones.generarExcelReporteDataEstructura("RELACIONADO",row,workbook,estructura,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Cargo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CargoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipopago_nm.getCargos()!=null && tipopago_nm.getCargos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CargoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CargoConstantesFunciones.generarExcelReporteHeaderCargo("RELACIONADO",row,workbook);
				}

				if(tipopago_nm.getCargos()!=null) {
					i2=0;
					for(Cargo cargo : tipopago_nm.getCargos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CargoConstantesFunciones.generarExcelReporteDataCargo("RELACIONADO",row,workbook,cargo,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoPago_NMConstantesFunciones.getTipoPago_NMDescripcion(tipopago_nm));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago_ N M",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPago_NM.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPago_NM.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoPago_NM() throws Exception {		
		this.startProcessTipoPago_NM(true);
	}
	
	public void startProcessTipoPago_NM(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoPago_NM ,this.jPanelParametrosReportesTipoPago_NM, this.jScrollPanelDatosTipoPago_NM,this.jPanelPaginacionTipoPago_NM, this.jScrollPanelDatosEdicionTipoPago_NM, this.jPanelAccionesTipoPago_NM,this.jPanelAccionesFormularioTipoPago_NM,this.jmenuBarTipoPago_NM,this.jmenuBarDetalleTipoPago_NM,this.jTtoolBarTipoPago_NM,this.jTtoolBarDetalleTipoPago_NM);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPago_NM=this.jTabbedPaneBusquedasTipoPago_NM; 
		
		final JPanel jPanelParametrosReportesTipoPago_NM=this.jPanelParametrosReportesTipoPago_NM;
		//final JScrollPane jScrollPanelDatosTipoPago_NM=this.jScrollPanelDatosTipoPago_NM;
		final JTable jTableDatosTipoPago_NM=this.jTableDatosTipoPago_NM;		
		final JPanel jPanelPaginacionTipoPago_NM=this.jPanelPaginacionTipoPago_NM;
		//final JScrollPane jScrollPanelDatosEdicionTipoPago_NM=this.jScrollPanelDatosEdicionTipoPago_NM;
		final JPanel jPanelAccionesTipoPago_NM=this.jPanelAccionesTipoPago_NM;
		
		JPanel jPanelCamposAuxiliarTipoPago_NM=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoPago_NM=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			jPanelCamposAuxiliarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jPanelCamposTipoPago_NM;
			jPanelAccionesFormularioAuxiliarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jPanelAccionesFormularioTipoPago_NM;
		}
		
		final JPanel jPanelCamposTipoPago_NM=jPanelCamposAuxiliarTipoPago_NM;
		final JPanel jPanelAccionesFormularioTipoPago_NM=jPanelAccionesFormularioAuxiliarTipoPago_NM;
		
		
		final JMenuBar jmenuBarTipoPago_NM=this.jmenuBarTipoPago_NM;
		final JToolBar jTtoolBarTipoPago_NM=this.jTtoolBarTipoPago_NM;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoPago_NM=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPago_NM=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			jmenuBarDetalleAuxiliarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jmenuBarDetalleTipoPago_NM;
			jTtoolBarDetalleAuxiliarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jTtoolBarDetalleTipoPago_NM;
		}
		
		final JMenuBar jmenuBarDetalleTipoPago_NM=jmenuBarDetalleAuxiliarTipoPago_NM;
		final JToolBar jTtoolBarDetalleTipoPago_NM=jTtoolBarDetalleAuxiliarTipoPago_NM;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPago_NM;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPago_NM;
			processRunnable.jTableDatos=jTableDatosTipoPago_NM;
			processRunnable.jPanelCampos=jPanelCamposTipoPago_NM;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPago_NM;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPago_NM;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPago_NM;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPago_NM;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPago_NM;
			processRunnable.jTtoolBar=jTtoolBarTipoPago_NM;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPago_NM;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPago_NM ,jPanelParametrosReportesTipoPago_NM,jTableDatosTipoPago_NM, /*jScrollPanelDatosTipoPago_NM,*/jPanelCamposTipoPago_NM,jPanelPaginacionTipoPago_NM, /*jScrollPanelDatosEdicionTipoPago_NM,*/ jPanelAccionesTipoPago_NM,jPanelAccionesFormularioTipoPago_NM,jmenuBarTipoPago_NM,jmenuBarDetalleTipoPago_NM,jTtoolBarTipoPago_NM,jTtoolBarDetalleTipoPago_NM);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPago_NM ,jPanelParametrosReportesTipoPago_NM, jScrollPanelDatosTipoPago_NM,jPanelPaginacionTipoPago_NM, jScrollPanelDatosEdicionTipoPago_NM, jPanelAccionesTipoPago_NM,jPanelAccionesFormularioTipoPago_NM,jmenuBarTipoPago_NM,jmenuBarDetalleTipoPago_NM,jTtoolBarTipoPago_NM,jTtoolBarDetalleTipoPago_NM);
						
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
	
	public void finishProcessTipoPago_NM() {// throws Exception 
		this.finishProcessTipoPago_NM(true);
	}
	
	public void finishProcessTipoPago_NM(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoPago_NM ,this.jPanelParametrosReportesTipoPago_NM, this.jScrollPanelDatosTipoPago_NM,this.jPanelPaginacionTipoPago_NM, this.jScrollPanelDatosEdicionTipoPago_NM, this.jPanelAccionesTipoPago_NM,this.jPanelAccionesFormularioTipoPago_NM,this.jmenuBarTipoPago_NM,this.jmenuBarDetalleTipoPago_NM,this.jTtoolBarTipoPago_NM,this.jTtoolBarDetalleTipoPago_NM);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPago_NM=this.jTabbedPaneBusquedasTipoPago_NM; 
		
		final JPanel jPanelParametrosReportesTipoPago_NM=this.jPanelParametrosReportesTipoPago_NM;
		//final JScrollPane jScrollPanelDatosTipoPago_NM=this.jScrollPanelDatosTipoPago_NM;
		final JTable jTableDatosTipoPago_NM=this.jTableDatosTipoPago_NM;		
		final JPanel jPanelPaginacionTipoPago_NM=this.jPanelPaginacionTipoPago_NM;
		//final JScrollPane jScrollPanelDatosEdicionTipoPago_NM=this.jScrollPanelDatosEdicionTipoPago_NM;
		final JPanel jPanelAccionesTipoPago_NM=this.jPanelAccionesTipoPago_NM;
		
		JPanel jPanelCamposAuxiliarTipoPago_NM=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoPago_NM=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			jPanelCamposAuxiliarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jPanelCamposTipoPago_NM;
			jPanelAccionesFormularioAuxiliarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jPanelAccionesFormularioTipoPago_NM;
		}
		
		final JPanel jPanelCamposTipoPago_NM=jPanelCamposAuxiliarTipoPago_NM;
		final JPanel jPanelAccionesFormularioTipoPago_NM=jPanelAccionesFormularioAuxiliarTipoPago_NM;
		
		
		final JMenuBar jmenuBarTipoPago_NM=this.jmenuBarTipoPago_NM;		
		final JToolBar jTtoolBarTipoPago_NM=this.jTtoolBarTipoPago_NM;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoPago_NM=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPago_NM=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			jmenuBarDetalleAuxiliarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jmenuBarDetalleTipoPago_NM;
			jTtoolBarDetalleAuxiliarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jTtoolBarDetalleTipoPago_NM;		
		}
		
		final JMenuBar jmenuBarDetalleTipoPago_NM=jmenuBarDetalleAuxiliarTipoPago_NM;
		final JToolBar jTtoolBarDetalleTipoPago_NM=jTtoolBarDetalleAuxiliarTipoPago_NM;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPago_NM;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPago_NM;
			processRunnable.jTableDatos=jTableDatosTipoPago_NM;
			processRunnable.jPanelCampos=jPanelCamposTipoPago_NM;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPago_NM;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPago_NM;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPago_NM;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPago_NM;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPago_NM;
			processRunnable.jTtoolBar=jTtoolBarTipoPago_NM;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPago_NM;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoPago_NM ,jPanelParametrosReportesTipoPago_NM, jTableDatosTipoPago_NM,/*jScrollPanelDatosTipoPago_NM,*/jPanelCamposTipoPago_NM,jPanelPaginacionTipoPago_NM, /*jScrollPanelDatosEdicionTipoPago_NM,*/ jPanelAccionesTipoPago_NM,jPanelAccionesFormularioTipoPago_NM,jmenuBarTipoPago_NM,jmenuBarDetalleTipoPago_NM,jTtoolBarTipoPago_NM,jTtoolBarDetalleTipoPago_NM));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoPago_NM(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoPago_NM(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoPago_NM(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoPago_NM(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoPago_NM,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoPago_NM,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoPago_NM(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoPago_NM,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoPago_NM,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipopago_nmConstantesFunciones.getsFinalQueryTipoPago_NM();
		String  finalQueryPaginacionTodos=this.tipopago_nmConstantesFunciones.getsFinalQueryTipoPago_NM();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoPago_NMConstantesFunciones.getArrayColumnasGlobalesNoTipoPago_NM(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoPago_NMConstantesFunciones.getArrayColumnasGlobalesTipoPago_NM(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoPago_NMConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipopago_nmsEliminados= new ArrayList<TipoPago_NM>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoPago_NM();
		
				///*TipoPago_NMSessionBean*/this.tipopago_nmSessionBean=new TipoPago_NMSessionBean();
			
			if(this.tipopago_nmSessionBean==null) {
				this.tipopago_nmSessionBean=new TipoPago_NMSessionBean();
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
					this.iNumeroPaginacion=TipoPago_NMConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoPago_NMConstantesFunciones.getClassesForeignKeysOfTipoPago_NM(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipopago_nm."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipopago_nmsAux= new ArrayList<TipoPago_NM>();
			
				
			tipopago_nmLogic.setDatosCliente(this.datosCliente);
			tipopago_nmLogic.setDatosDeep(this.datosDeep);
			tipopago_nmLogic.setIsConDeep(true);
			
			
			tipopago_nmLogic.getTipoPago_NMDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipopago_nmLogic.getTodosTipoPago_NMs(finalQueryGlobal,pagination);
					
					//tipopago_nmLogic.getTodosTipoPago_NMsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipopago_nmLogic.getTipoPago_NMs()==null|| tipopago_nmLogic.getTipoPago_NMs().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopago_nmsAux= new ArrayList<TipoPago_NM>();
							tipopago_nmsAux.addAll(tipopago_nmLogic.getTipoPago_NMs());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopago_nmsAux= new ArrayList<TipoPago_NM>();
							tipopago_nmsAux.addAll(tipopago_nms);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopago_nmLogic.getTodosTipoPago_NMs(finalQueryGlobal+"",this.pagination);												
							
							//tipopago_nmLogic.getTodosTipoPago_NMsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoPago_NMs("Todos",tipopago_nmLogic.getTipoPago_NMs() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipopago_nmLogic.setTipoPago_NMs(new ArrayList<TipoPago_NM>());					
							tipopago_nmLogic.getTipoPago_NMs().addAll(tipopago_nmsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopago_nms=new ArrayList<TipoPago_NM>();
							tipopago_nms.addAll(tipopago_nmsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoPago_NM=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoPago_NM=this.idActual;
				
				} else if(this.idTipoPago_NMActual!=null && this.idTipoPago_NMActual!=0L) {
					idTipoPago_NM=idTipoPago_NMActual;
				}
				
					
				this.sDetalleReporte=TipoPago_NMConstantesFunciones.getDetalleIndicePorId(idTipoPago_NM);
				
				this.tipopago_nms=new ArrayList<TipoPago_NM>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipopago_nmLogic.getEntity(idTipoPago_NM);
					
					//tipopago_nmLogic.getEntityWithConnection(idTipoPago_NM);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopago_nmLogic.setTipoPago_NMs(new ArrayList<TipoPago_NM>());
					tipopago_nmLogic.getTipoPago_NMs().add(tipopago_nmLogic.getTipoPago_NM());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipopago_nms=new ArrayList<TipoPago_NM>();
					this.tipopago_nms.add(tipopago_nm);
				}
				
				if(tipopago_nmLogic.getTipoPago_NM()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoPago_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipopago_nmLogic.getTipoPago_NMsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPago_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPago_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipopago_nmLogic.getTipoPago_NMs()==null||tipopago_nmLogic.getTipoPago_NMs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipopago_nms==null|| tipopago_nms.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopago_nmsAux=new ArrayList<TipoPago_NM>();
						tipopago_nmsAux.addAll(tipopago_nmLogic.getTipoPago_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopago_nmsAux=new ArrayList<TipoPago_NM>();
							tipopago_nmsAux.addAll(tipopago_nms);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipopago_nmLogic.getTipoPago_NMsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPago_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPago_NMConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoPago_NMs("FK_IdEmpresa",tipopago_nmLogic.getTipoPago_NMs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoPago_NMs("FK_IdEmpresa",tipopago_nms);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopago_nmLogic.setTipoPago_NMs(new ArrayList<TipoPago_NM>());
						tipopago_nmLogic.getTipoPago_NMs().addAll(tipopago_nmsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopago_nms=new ArrayList<TipoPago_NM>();
							tipopago_nms.addAll(tipopago_nmsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoPago_NM();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoPago_NM();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipopago_nmLogic.getTipoPago_NMs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopago_nms.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipopago_nmLogic.getTipoPago_NMs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipopago_nms.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoPago_NM tipopago_nm) {
		Boolean permite=true;
		
		if(this.tipopago_nm.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoPago_NMConstantesFunciones.getOrderByListaTipoPago_NM();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoPago_NMConstantesFunciones.getOrderByListaTipoPago_NM();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPago_NM tipopago_nm:tipopago_nmLogic.getTipoPago_NMs()) {
				if(tipopago_nm.getsType().equals(Constantes2.S_TOTALES)) {
					tipopago_nmTotales=tipopago_nm;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPago_NM tipopago_nm:this.tipopago_nms) {
				if(tipopago_nm.getsType().equals(Constantes2.S_TOTALES)) {
					tipopago_nmTotales=tipopago_nm;
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
			this.tipopago_nmAux=new TipoPago_NM();
			this.tipopago_nmAux.setsType(Constantes2.S_TOTALES);
			this.tipopago_nmAux.setIsNew(false);
			this.tipopago_nmAux.setIsChanged(false);
			this.tipopago_nmAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoPago_NMConstantesFunciones.TotalizarValoresFilaTipoPago_NM(this.tipopago_nmLogic.getTipoPago_NMs(),this.tipopago_nmAux);
				
				this.tipopago_nmLogic.getTipoPago_NMs().add(this.tipopago_nmAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoPago_NMConstantesFunciones.TotalizarValoresFilaTipoPago_NM(this.tipopago_nms,this.tipopago_nmAux);
				
				this.tipopago_nms.add(this.tipopago_nmAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipopago_nmTotales=new TipoPago_NM();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipopago_nmLogic.getTipoPago_NMs().remove(tipopago_nmTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipopago_nms.remove(tipopago_nmTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipopago_nmTotales=new TipoPago_NM();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPago_NM tipopago_nm:tipopago_nmLogic.getTipoPago_NMs()) {
				if(tipopago_nm.getsType().equals(Constantes2.S_TOTALES)) {
					tipopago_nmTotales=tipopago_nm;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPago_NMConstantesFunciones.TotalizarValoresFilaTipoPago_NM(this.tipopago_nmLogic.getTipoPago_NMs(),tipopago_nmTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPago_NM tipopago_nm:this.tipopago_nms) {
				if(tipopago_nm.getsType().equals(Constantes2.S_TOTALES)) {
					tipopago_nmTotales=tipopago_nm;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPago_NMConstantesFunciones.TotalizarValoresFilaTipoPago_NM(this.tipopago_nms,tipopago_nmTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoPago_NMsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoPago_NMsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopago_nmLogic.getTipoPago_NMsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoPago_NM() {
		this.isPermisoTodoTipoPago_NM=false;
		this.isPermisoNuevoTipoPago_NM=false;
		this.isPermisoActualizarTipoPago_NM=false;
		this.isPermisoActualizarOriginalTipoPago_NM=false;
		this.isPermisoEliminarTipoPago_NM=false;
		this.isPermisoGuardarCambiosTipoPago_NM=false;
		this.isPermisoConsultaTipoPago_NM=false;
		this.isPermisoBusquedaTipoPago_NM=false;
		this.isPermisoReporteTipoPago_NM=false;		
		this.isPermisoOrdenTipoPago_NM=false;		
		this.isPermisoPaginacionMedioTipoPago_NM=false;		
		this.isPermisoPaginacionAltoTipoPago_NM=false;
		this.isPermisoPaginacionTodoTipoPago_NM=false;
		this.isPermisoCopiarTipoPago_NM=false;		
		this.isPermisoVerFormTipoPago_NM=false;		
		this.isPermisoDuplicarTipoPago_NM=false;		
		this.isPermisoOrdenTipoPago_NM=false;		
	}
	
	public void setPermisosUsuarioTipoPago_NM(Boolean isPermiso) {
		this.isPermisoTodoTipoPago_NM=isPermiso;
		this.isPermisoNuevoTipoPago_NM=isPermiso;
		this.isPermisoActualizarTipoPago_NM=isPermiso;
		this.isPermisoActualizarOriginalTipoPago_NM=isPermiso;
		this.isPermisoEliminarTipoPago_NM=isPermiso;
		this.isPermisoGuardarCambiosTipoPago_NM=isPermiso;
		this.isPermisoConsultaTipoPago_NM=isPermiso;
		this.isPermisoBusquedaTipoPago_NM=isPermiso;
		this.isPermisoReporteTipoPago_NM=isPermiso;
		this.isPermisoOrdenTipoPago_NM=isPermiso;		
		this.isPermisoPaginacionMedioTipoPago_NM=isPermiso;		
		this.isPermisoPaginacionAltoTipoPago_NM=isPermiso;		
		this.isPermisoPaginacionTodoTipoPago_NM=isPermiso;		
		this.isPermisoCopiarTipoPago_NM=isPermiso;		
		this.isPermisoVerFormTipoPago_NM=isPermiso;		
		this.isPermisoDuplicarTipoPago_NM=isPermiso;
		this.isPermisoOrdenTipoPago_NM=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoPago_NM(Boolean isPermiso) {
		//this.isPermisoTodoTipoPago_NM=isPermiso;
		this.isPermisoNuevoTipoPago_NM=isPermiso;
		this.isPermisoActualizarTipoPago_NM=isPermiso;
		this.isPermisoActualizarOriginalTipoPago_NM=isPermiso;
		this.isPermisoEliminarTipoPago_NM=isPermiso;
		this.isPermisoGuardarCambiosTipoPago_NM=isPermiso;
		//this.isPermisoConsultaTipoPago_NM=isPermiso;
		//this.isPermisoBusquedaTipoPago_NM=isPermiso;
		//this.isPermisoReporteTipoPago_NM=isPermiso;
		//this.isPermisoOrdenTipoPago_NM=isPermiso;		
		//this.isPermisoPaginacionMedioTipoPago_NM=isPermiso;		
		//this.isPermisoPaginacionAltoTipoPago_NM=isPermiso;		
		//this.isPermisoPaginacionTodoTipoPago_NM=isPermiso;		
		//this.isPermisoCopiarTipoPago_NM=isPermiso;		
		//this.isPermisoDuplicarTipoPago_NM=isPermiso;
		//this.isPermisoOrdenTipoPago_NM=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoPago_NMClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EstructuraConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CargoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoPago_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEstructura=false;
		this.isTienePermisosEstructura=this.verificarGetPermisosUsuarioOpcionTipoPago_NMClaseRelacionada(this.opcionsRelacionadas,EstructuraConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCargo=false;
		this.isTienePermisosCargo=this.verificarGetPermisosUsuarioOpcionTipoPago_NMClaseRelacionada(this.opcionsRelacionadas,CargoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoPago_NM(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoPago_NMClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEstructura=conPermiso;
		this.isTienePermisosCargo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoPago_NMClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoPago_NMClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoPago_NMClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEstructura && this.jInternalFrameDetalleFormTipoPago_NM!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPago_NM.jTabbedPaneRelacionesTipoPago_NM.remove(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCargo && this.jInternalFrameDetalleFormTipoPago_NM!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPago_NM.jTabbedPaneRelacionesTipoPago_NM.remove(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoPago_NM() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoPago_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoPago_NMConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoPago_NM=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoPago_NM=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoPago_NM=this.isPermisoActualizarTipoPago_NM;
			this.isPermisoEliminarTipoPago_NM=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoPago_NM=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoPago_NM=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoPago_NM=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoPago_NM=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoPago_NM=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPago_NM=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoPago_NM=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoPago_NM=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoPago_NM=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoPago_NM=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoPago_NM=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoPago_NM=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPago_NM=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoPago_NM.setToolTipText(this.jTableDatosTipoPago_NM.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoPago_NM(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoPago_NM(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoPago_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoPago_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoPago_NM() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEstructura && this.tipopago_nmConstantesFunciones.mostrarEstructuraTipoPago_NM && !TipoPago_NMConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Estructura");
			reporte.setsDescripcion("Estructura");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCargo && this.tipopago_nmConstantesFunciones.mostrarCargoTipoPago_NM && !TipoPago_NMConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cargo");
			reporte.setsDescripcion("Cargo");
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
	public void inicializarCombosForeignKeyTipoPago_NMListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoPago_NMListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoPago_NMJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoPago_NMListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoPago_NMListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoPago_NMParameterReturnGeneral tipopago_nmReturnGeneral=new TipoPago_NMParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipopago_nmConstantesFunciones.cargarid_empresaTipoPago_NM)
					 || (this.esRecargarFks && this.tipopago_nmConstantesFunciones.cargarid_empresaTipoPago_NM)) {

					if(!this.tipopago_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipopago_nmSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipopago_nmReturnGeneral=tipopago_nmLogic.cargarCombosLoteForeignKeyTipoPago_NM(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipopago_nmReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoPago_NM()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipopago_nmSessionBean==null) {
				this.tipopago_nmSessionBean=new TipoPago_NMSessionBean();
			}

			if(!this.tipopago_nmSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoPago_NM()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoPago_NM(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoPago_NM()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPago_NM();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoPago_NM(TipoPago_NM tipopago_nm)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoPago_NM(TipoPago_NM tipopago_nm,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoPago_NM()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPago_NM()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoPago_NM()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoPago_NM()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoPago_NM()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoPago_NM()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoPago_NM(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoPago_NM()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM!=null && this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoPago_NMBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoPago_NMBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoPago_NMBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipopago_nmSessionBean=new TipoPago_NMSessionBean(); 
		this.tipopago_nmConstantesFunciones=new TipoPago_NMConstantesFunciones(); 
		this.tipopago_nmBean=new TipoPago_NM();//(this.tipopago_nmConstantesFunciones); 		
		this.tipopago_nmReturnGeneral=new TipoPago_NMParameterReturnGeneral(); 
		
		this.tipopago_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopago_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoPago_NMBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoPago_NMBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoPago_NMBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoPago_NM(true);
			
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
			
			this.tipopago_nmConstantesFunciones=new TipoPago_NMConstantesFunciones(); 
			this.tipopago_nmBean=new TipoPago_NM();//this.tipopago_nmConstantesFunciones); 			
			this.tipopago_nmReturnGeneral=new TipoPago_NMParameterReturnGeneral(); 
		
			TipoPago_NMBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Pago_ N M Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipopago_nm=new TipoPago_NM();
			this.tipopago_nms = new ArrayList<TipoPago_NM>();
			this.tipopago_nmsAux = new ArrayList<TipoPago_NM>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic=new TipoPago_NMLogic();
				this.tipopago_nmLogic.getNewConnexionToDeep("");
			}
			
			//this.tipopago_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipopago_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoPago_NM);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoPago_NM!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPago_NM);	
					}
					
					if(this.jInternalFrameImportacionTipoPago_NM!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPago_NM);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoPago_NM!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoPago_NM);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPago_NM);
				this.jInternalFrameDetalleFormTipoPago_NM.setVisible(false);
				this.jInternalFrameDetalleFormTipoPago_NM.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoPago_NM!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPago_NM);
					this.jInternalFrameReporteDinamicoTipoPago_NM.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoPago_NM.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoPago_NM!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoPago_NM);
					this.jInternalFrameImportacionTipoPago_NM.setVisible(false);
					this.jInternalFrameImportacionTipoPago_NM.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoPago_NM!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoPago_NM);
					this.jInternalFrameOrderByTipoPago_NM.setVisible(false);
					this.jInternalFrameOrderByTipoPago_NM.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoPago_NMActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoPago_NMConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipopago_nmReturnGeneral=new TipoPago_NMParameterReturnGeneral();
			
			this.tipopago_nmParameterGeneral=new TipoPago_NMParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipopago_nmLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoPago_NMJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EstructuraConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CargoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPago_NMConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipopago_nmSessionBean.getEsGuardarRelacionado(),this.tipopago_nmSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPago_NMConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipopago_nmSessionBean.getEsGuardarRelacionado(),this.tipopago_nmSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoPago_NM=false;
			this.isVisibilidadCeldaDuplicarTipoPago_NM=true;
			this.isVisibilidadCeldaCopiarTipoPago_NM=true;
			this.isVisibilidadCeldaVerFormTipoPago_NM=true;
			this.isVisibilidadCeldaOrdenTipoPago_NM=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=false;
			this.isVisibilidadCeldaModificarTipoPago_NM=false;
			this.isVisibilidadCeldaActualizarTipoPago_NM=false;
			this.isVisibilidadCeldaEliminarTipoPago_NM=false;
			this.isVisibilidadCeldaCancelarTipoPago_NM=false;
			this.isVisibilidadCeldaGuardarTipoPago_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoPago_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoPago_NM();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoPago_NM(false);
			
			this.setPermisosUsuarioTipoPago_NM();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado() 
				|| (this.tipopago_nmSessionBean.getEsGuardarRelacionado() && this.tipopago_nmSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoPago_NMClasesRelacionadas();
			}
			
			if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoPago_NMClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoPago_NM();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoPago_NM();
			}
			
			if(!this.isPermisoBusquedaTipoPago_NM) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoPago_NM.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoPago_NM,this.isPermisoPaginacionMedioTipoPago_NM,this.isPermisoPaginacionTodoTipoPago_NM);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoPago_NMConstantesFunciones.getTiposSeleccionarTipoPago_NM());
				
				this.tiposColumnasSelect=TipoPago_NMConstantesFunciones.getTiposSeleccionarTipoPago_NM(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoPago_NM();				
				//this.tiposRelacionesSelect=TipoPago_NMConstantesFunciones.getTiposRelacionesTipoPago_NM(true);
				
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
			//if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoPago_NM();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoPago_NM(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoPago_NM(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPago_NM() ;
			
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
			
			
			this.estructuraLogic=new EstructuraLogic();
			this.cargoLogic=new CargoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipopago_nmImplementable= (TipoPago_NMImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPago_NMConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipopago_nmImplementableHome= (TipoPago_NMImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPago_NMConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipopago_nms= new ArrayList<TipoPago_NM>();
			this.tipopago_nmsEliminados= new ArrayList<TipoPago_NM>();
						
			this.isEsNuevoTipoPago_NM=false;
			this.esParaAccionDesdeFormularioTipoPago_NM=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoPago_NM(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoPago_NM();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoPago_NMBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoPago_NMConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoPago_NM("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoPago_NM(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoPago_NM();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoPago_NM();
			}
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoPago_NM.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoPago_NM.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoPago_NM.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoPago_NM(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoPago_NM: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoPago_NM() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EstructuraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EstructuraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CargoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CargoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoPago_NM")) {
				iIndex=this.jInternalFrameDetalleFormTipoPago_NM.jTabbedPaneRelacionesTipoPago_NM.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoPago_NM.jTabbedPaneRelacionesTipoPago_NM.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();	
				
				

				if(sTitle.equals("Cargos")) {
					if(!CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoPago_NM();

						this.cargarParteTabPanelRelacionadaCargo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Estructuras")) {
					if(!EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoPago_NM();

						this.cargarParteTabPanelRelacionadaEstructura(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoPago_NM();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCargo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoPago_NM.cargarSessionConBeanSwingJInternalFrameCargo(false,true,iIndex);
		this.jButtonCargoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCargo();

		//this.jTabbedPaneRelacionesTipoPago_NM.updateUI();
		//this.jTabbedPaneRelacionesTipoPago_NM.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoPago_NM.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEstructura(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoPago_NM.cargarSessionConBeanSwingJInternalFrameEstructura(false,true,iIndex);
		this.jButtonEstructuraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEstructura();

		//this.jTabbedPaneRelacionesTipoPago_NM.updateUI();
		//this.jTabbedPaneRelacionesTipoPago_NM.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoPago_NM.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Estructura")) {
				int row=this.jTableDatosTipoPago_NM.getSelectedRow();
				jButtonEstructuraActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Cargo")) {
				int row=this.jTableDatosTipoPago_NM.getSelectedRow();
				jButtonCargoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Estructura")) {

					if(this.isTienePermisosEstructura && this.tipopago_nmConstantesFunciones.mostrarEstructuraTipoPago_NM && !TipoPago_NMConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Estructuras"+"("+EstructuraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Estructuras");

						if(tipopago_nmConstantesFunciones.resaltarEstructuraTipoPago_NM!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipopago_nmConstantesFunciones.resaltarEstructuraTipoPago_NM);
						}

						jmenuItem.setEnabled(this.tipopago_nmConstantesFunciones.activarEstructuraTipoPago_NM);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Estructura"));

						

						this.jInternalFrameDetalleFormTipoPago_NM.jmenuDetalleTipoPago_NM.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cargo")) {

					if(this.isTienePermisosCargo && this.tipopago_nmConstantesFunciones.mostrarCargoTipoPago_NM && !TipoPago_NMConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cargos"+"("+CargoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cargos");

						if(tipopago_nmConstantesFunciones.resaltarCargoTipoPago_NM!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipopago_nmConstantesFunciones.resaltarCargoTipoPago_NM);
						}

						jmenuItem.setEnabled(this.tipopago_nmConstantesFunciones.activarCargoTipoPago_NM);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cargo"));

						

						this.jInternalFrameDetalleFormTipoPago_NM.jmenuDetalleTipoPago_NM.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoPago_NM(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoPago_NM(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoPago_NM(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoPago_NMListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoPago_NM();
		
		this.cargarCombosFrameForeignKeyTipoPago_NM();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoPago_NM();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoPago_NM();
		}
	}
	
	
	
	public void jButtonNuevoTipoPago_NMActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
			
			if(jTableDatosTipoPago_NM.getRowCount()>=1) {
				jTableDatosTipoPago_NM.removeRowSelectionInterval(0, jTableDatosTipoPago_NM.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoPago_NM=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoPago_NM(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoPago_NM(true);			
			//this.tipopago_nm=new TipoPago_NM();
			//this.tipopago_nm.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPago_NM(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPago_NM() ;
			
			if(TipoPago_NMJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPago_NM(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipopago_nm);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);				
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
			if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoPago_NM: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoPago_NMActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoPago_NM.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoPago_NM.getSelectedRows().length;			
			}
			
			tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoPago_NM--;			
				//TipoPago_NM tipopago_nmAux= new TipoPago_NM();			
				//tipopago_nmAux.setId(this.iIdNuevoTipoPago_NM);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoPago_NM tipopago_nmOrigen=new TipoPago_NM();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoPago_NM tipopago_nmOrigen : tipopago_nmsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipopago_nmOrigen =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipopago_nmOrigen =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoPago_NM();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipopago_nm.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoPago_NM(tipopago_nmOrigen,this.tipopago_nm,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipopago_nmLogic.getTipoPago_NMs().add(this.tipopago_nmAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipopago_nms.add(this.tipopago_nmAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoPago_NM(false);
				
				this.jTableDatosTipoPago_NM.setRowSelectionInterval(this.getIndiceNuevoTipoPago_NM(), this.getIndiceNuevoTipoPago_NM());
				
				int iLastRow =  this.jTableDatosTipoPago_NM.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPago_NM.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPago_NM.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPago_NM(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();									
		
			TipoPago_NM tipopago_nmOrigen=new TipoPago_NM();
			TipoPago_NM tipopago_nmDestino=new TipoPago_NM();
				
			tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoPago_NM.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipopago_nmsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoPago_NM.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopago_nmOrigen =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipopago_nmOrigen =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipopago_nmDestino =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipopago_nmDestino =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipopago_nmOrigen =tipopago_nmsSeleccionados.get(0);
				tipopago_nmDestino =tipopago_nmsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoPago_NM(tipopago_nmOrigen,tipopago_nmDestino,true,false);
				
				tipopago_nmDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipopago_nmDestino,tipopago_nmLogic.getTipoPago_NMs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipopago_nmDestino,tipopago_nms);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoPago_NM(false);
				
				//this.jTableDatosTipoPago_NM.setRowSelectionInterval(this.getIndiceNuevoTipoPago_NM(), this.getIndiceNuevoTipoPago_NM());
				
				int iLastRow =  this.jTableDatosTipoPago_NM.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPago_NM.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPago_NM.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPago_NM(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoPago_NM.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoPago_NM.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoPago_NM.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoPago_NM.setVisible(!isVisible);
			this.jPanelPaginacionTipoPago_NM.setVisible(!isVisible);
			this.jPanelAccionesTipoPago_NM.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoPago_NM();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoPago_NM();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoPago_NM();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoPago_NM();
			
			this.abrirFrameOrderByTipoPago_NM();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoPago_NM();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoPago_NM(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPago_NM);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoPago_NM.isMaximum()) {
					this.jInternalFrameDetalleFormTipoPago_NM.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoPago_NM.setSize(this.jInternalFrameDetalleFormTipoPago_NM.iWidthFormulario,this.jInternalFrameDetalleFormTipoPago_NM.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoPago_NM.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoPago_NM.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoPago_NM.isMaximum()) {
						this.jInternalFrameDetalleFormTipoPago_NM.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoPago_NM.jContentPaneDetalleTipoPago_NM.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoPago_NM.jTabbedPaneRelacionesTipoPago_NM.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoPago_NM.jContentPaneDetalleTipoPago_NM.getWidth(),TipoPago_NMConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPago_NM.jTabbedPaneRelacionesTipoPago_NM.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoPago_NM.jContentPaneDetalleTipoPago_NM.getWidth(),TipoPago_NMConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPago_NM.jTabbedPaneRelacionesTipoPago_NM.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoPago_NM.jContentPaneDetalleTipoPago_NM.getWidth(),TipoPago_NMConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCargo();
					}

					if(EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEstructura();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoPago_NM.setVisible(true);
	        this.jInternalFrameDetalleFormTipoPago_NM.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoPago_NM() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoPago_NM==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoPago_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPago_NM,false,this);
				} else {
					this.jInternalFrameOrderByTipoPago_NM=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPago_NM,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoPago_NM);
				this.jInternalFrameOrderByTipoPago_NM.setVisible(false);
				this.jInternalFrameOrderByTipoPago_NM.setSelected(false);
				
				this.jInternalFrameOrderByTipoPago_NM.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPago_NM"));
				
				this.inicializarActualizarBindingTablaOrderByTipoPago_NM();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoPago_NM() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoPago_NM==null) {
				
				this.jInternalFrameImportacionTipoPago_NM=new ImportacionJInternalFrame(TipoPago_NMConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPago_NM);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoPago_NM);
				this.jInternalFrameImportacionTipoPago_NM.setVisible(false);
				this.jInternalFrameImportacionTipoPago_NM.setSelected(false);


				this.jInternalFrameImportacionTipoPago_NM.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPago_NM"));
				this.jInternalFrameImportacionTipoPago_NM.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPago_NM"));
				this.jInternalFrameImportacionTipoPago_NM.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPago_NM"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoPago_NM() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoPago_NM==null) {
				this.jInternalFrameReporteDinamicoTipoPago_NM=new ReporteDinamicoJInternalFrame(TipoPago_NMConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPago_NM);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPago_NM);
				this.jInternalFrameReporteDinamicoTipoPago_NM.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoPago_NM.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoPago_NM.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPago_NM"));
				this.jInternalFrameReporteDinamicoTipoPago_NM.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPago_NM"));
				this.jInternalFrameReporteDinamicoTipoPago_NM.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPago_NM"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPago_NM();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCargo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoPago_NM.jContentPaneDetalleTipoPago_NM.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEstructura() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoPago_NM.jContentPaneDetalleTipoPago_NM.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoPago_NM() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPago_NM);
			
	       	this.jInternalFrameDetalleFormTipoPago_NM.setVisible(false);
	        this.jInternalFrameDetalleFormTipoPago_NM.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoPago_NM.dispose();
			//this.jInternalFrameDetalleFormTipoPago_NM=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoPago_NM() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoPago_NM.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoPago_NM.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoPago_NM() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoPago_NM.setVisible(true);
	        this.jInternalFrameImportacionTipoPago_NM.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoPago_NM() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoPago_NM.setVisible(true);
	        this.jInternalFrameOrderByTipoPago_NM.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoPago_NM() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoPago_NM.setVisible(false);
	        this.jInternalFrameOrderByTipoPago_NM.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoPago_NM() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoPago_NM.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoPago_NM.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoPago_NM() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoPago_NM.setVisible(false);
	        this.jInternalFrameImportacionTipoPago_NM.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoPago_NM(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoPago_NM(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoPago_NM(true);
			//this.isEsNuevoTipoPago_NM=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoPago_NM("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPago_NM(false) ;
			
			if(tipopago_nmSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraSessionBean.getEsGuardarRelacionado() && EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEstructuraActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado() && CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoPago_NMJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPago_NM(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPago_NM(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoPago_NMActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoPago_NM(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoPago_NM(true);
			//this.isEsNuevoTipoPago_NM=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipopago_nm.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoPago_NM("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoPago_NM(false) ;
			
			if(TipoPago_NMJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPago_NM(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPago_NM(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoPago_NM(false);
			
			//if(!this.isEsNuevoTipoPago_NM) {								
				int intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoPago_NM(this.tipopago_nm,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
				
			}
			
			if(this.permiteMantenimiento(this.tipopago_nm)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoPago_NM=true;
					this.inicializarActualizarBindingTablaTipoPago_NM(false);
					this.isEsNuevoTipoPago_NM=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoPago_NM=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoPago_NM=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPago_NM(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPago_NM(false);
				
				this.habilitarDeshabilitarControlesTipoPago_NM(false);
			
												
				
				if(TipoPago_NMJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoPago_NM();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoPago_NMActionPerformed(evt,tipopago_nmSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoPago_NM(this.tipopago_nm,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoPago_NM.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipopago_nmSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipopago_nm.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoPago_NM.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago_NM.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				this.tipopago_nm.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				this.tipopago_nm.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipopago_nm)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoPago_NMModel) this.jTableDatosTipoPago_NM.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoPago_NM=true;
				this.inicializarActualizarBindingTablaTipoPago_NM(false);
				this.isEsNuevoTipoPago_NM=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPago_NM(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPago_NM(false);
				
				this.habilitarDeshabilitarControlesTipoPago_NM(false);
				
				
				
				if(TipoPago_NMJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoPago_NM();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoPago_NM.getRowCount()>=1) {
				jTableDatosTipoPago_NM.removeRowSelectionInterval(0, jTableDatosTipoPago_NM.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoPago_NM(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoPago_NM(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPago_NM(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPago_NM(false) ;
			
			this.isEsNuevoTipoPago_NM=false;
			
			if(TipoPago_NMJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoPago_NM();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoPago_NM(false);
				
				//SI ES MANUAL
				if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoPago_NM();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoPago_NM--;			
			//TipoPago_NM tipopago_nmAux= new TipoPago_NM();			
			//tipopago_nmAux.setId(this.iIdNuevoTipoPago_NM);
			
			if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoPago_NM();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
			
			this.tipopago_nm.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipopago_nmLogic.getTipoPago_NMs().add(this.tipopago_nmAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipopago_nms.add(this.tipopago_nmAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoPago_NM(false);
			
			this.jTableDatosTipoPago_NM.setRowSelectionInterval(this.getIndiceNuevoTipoPago_NM(), this.getIndiceNuevoTipoPago_NM());
			
			int iLastRow =  this.jTableDatosTipoPago_NM.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoPago_NM.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoPago_NM.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoPago_NM(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoPago_NM(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPago_NM(false);
			
			//SI ES MANUAL
			if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPago_NM();
			}
			
			//this.abrirFrameTreeTipoPago_NM();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Pago_ N MES ?", "MANTENIMIENTO DE Tipo Pago_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoPago_NM.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoPago_NM();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipopago_nmReturnGeneral=tipopago_nmLogic.procesarImportacionTipoPago_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipopago_nmParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoPago_NMReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoPago_NM.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoPago_NM.setFileImportacion(this.jInternalFrameImportacionTipoPago_NM.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoPago_NM.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoPago_NM.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoPago_NM.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoPago_NM.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();		

		tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoPago_NMBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoPago_NMBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoPago_NMs("Todos",tipopago_nmsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPago_NM.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPago_NMConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPago_NMConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoPago_NM.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoPago_NMConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoPago_NMConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoPago_NMConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoPago_NMConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoPago_NM.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoPago_NMConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoPago_NMConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();		
		
		tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago_nm";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoPago_NMs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoPago_NM.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoPago_NM tipopago_nm:tipopago_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipopago_nm.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPago_NMConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPago_NMConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoPago_NM tipopago_nm:tipopago_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipopago_nm.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPago_NMConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPago_NMConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoPago_NM tipopago_nm:tipopago_nmsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipopago_nm.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoPago_NM(row);				
			//	iRow++;
			//}				
			
			//for(TipoPago_NM tipopago_nmAux:tipopago_nmsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoPago_NM(tipopago_nmAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago_ N M",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipopago_nmLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPago_NM(false);
			
			//SI ES MANUAL
			if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPago_NM();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPago_NM(false);
			
			//SI ES MANUAL
			if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPago_NM();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPago_NM(false);
			
			//SI ES MANUAL
			if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPago_NM();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoPago_NM() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoPago_NM.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoPago_NM.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoPago_NM.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoPago_NM.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoPago_NM.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoPago_NM.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoPago_NM.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoPago_NM(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoPago_NM(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoPago_NM(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoPago_NM(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoPago_NM(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoPago_NM(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPago_NM(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoPago_NM(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoPago_NMJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoPago_NM() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoPago_NM();
		
		this.inicializarActualizarBindingBotonesManualTipoPago_NM(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPago_NM();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPago_NM() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPago_NM(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPago_NM(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoPago_NM.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoPago_NM.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoPago_NM.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoPago_NM.jCheckBoxPostAccionNuevoTipoPago_NM.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoPago_NM.jCheckBoxPostAccionSinCerrarTipoPago_NM.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoPago_NM.jCheckBoxPostAccionSinMensajeTipoPago_NM.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoPago_NM.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoPago_NM.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoPago_NM.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
				this.jInternalFrameDetalleFormTipoPago_NM.jCheckBoxPostAccionNuevoTipoPago_NM.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoPago_NM.jCheckBoxPostAccionSinCerrarTipoPago_NM.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoPago_NM.jCheckBoxPostAccionSinMensajeTipoPago_NM.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoPago_NM.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoPago_NM.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoPago_NM.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoPago_NM!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoPago_NM.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoPago_NM.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoPago_NM.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoPago_NM.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoPago_NM!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPago_NM.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoPago_NM.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoPago_NM.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoPago_NM(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPago_NM(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoPago_NM() throws Exception {
		try	{
			if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPago_NM();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPago_NM() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPago_NM() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoPago_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoPago_NM.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoPago_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoPago_NM.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoPago_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoPago_NM.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoPago_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoPago_NM.addItem(reporte);
			}
			
			
			if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoPago_NM.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoPago_NM.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoPago_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoPago_NM.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoPago_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoPago_NM.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoPago_NM.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoPago_NM.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoPago_NM.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPago_NM();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPago_NM() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPago_NM!=null) {
				this.jInternalFrameReporteDinamicoTipoPago_NM.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPago_NM.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPago_NM!=null) {
				this.jInternalFrameReporteDinamicoTipoPago_NM.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPago_NM.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoPago_NM!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoPago_NM.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPago_NM.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPago_NM.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoPago_NM.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPago_NM.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPago_NM.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoPago_NM()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoPago_NM(Boolean esInicializar) throws Exception {				
		if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPago_NM();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoPago_NM() throws Exception {
		this.inicializarActualizarBindingTablaTipoPago_NM(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoPago_NM() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoPago_NMPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoPago_NMPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoPago_NMOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPago_NMOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoPago_NMPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoPago_NMPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoPago_NM(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipopago_nmLogic.getTipoPago_NMs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipopago_nms.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoPago_NM.setModel(new TipoPago_NMModel(this.tipopago_nmLogic.getTipoPago_NMs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoPago_NM.setModel(new TipoPago_NMModel(this.tipopago_nms,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoPago_NM!=null && this.jInternalFrameOrderByTipoPago_NM.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoPago_NM();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoPago_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPago_NM,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoPago_NMPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO,tipopago_nmConstantesFunciones.resaltarSeleccionarTipoPago_NM,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO,tipopago_nmConstantesFunciones.resaltarSeleccionarTipoPago_NM,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoPago_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPago_NM,TipoPago_NMConstantesFunciones.LABEL_ID));

		if(this.tipopago_nmConstantesFunciones.mostraridTipoPago_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPago_NMConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipopago_nmConstantesFunciones.resaltaridTipoPago_NM,this.tipopago_nmConstantesFunciones.activaridTipoPago_NM,this,true,"idTipoPago_NM","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopago_nmConstantesFunciones.resaltaridTipoPago_NM,this.tipopago_nmConstantesFunciones.activaridTipoPago_NM,this,true,"idTipoPago_NM","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPago_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPago_NM,TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipopago_nmConstantesFunciones.mostrarid_empresaTipoPago_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipopago_nmConstantesFunciones.resaltarid_empresaTipoPago_NM,this,this.tipopago_nmConstantesFunciones.activarid_empresaTipoPago_NM));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipopago_nmConstantesFunciones.resaltarid_empresaTipoPago_NM,this,this.tipopago_nmConstantesFunciones.activarid_empresaTipoPago_NM,false,"id_empresaTipoPago_NM","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPago_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPago_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPago_NM,TipoPago_NMConstantesFunciones.LABEL_CODIGO));

		if(this.tipopago_nmConstantesFunciones.mostrarcodigoTipoPago_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPago_NMConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipopago_nmConstantesFunciones.resaltarcodigoTipoPago_NM,this.tipopago_nmConstantesFunciones.activarcodigoTipoPago_NM,this,true,"codigoTipoPago_NM","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopago_nmConstantesFunciones.resaltarcodigoTipoPago_NM,this.tipopago_nmConstantesFunciones.activarcodigoTipoPago_NM,this,true,"codigoTipoPago_NM","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPago_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPago_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPago_NM,TipoPago_NMConstantesFunciones.LABEL_NOMBRE));

		if(this.tipopago_nmConstantesFunciones.mostrarnombreTipoPago_NM && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPago_NMConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipopago_nmConstantesFunciones.resaltarnombreTipoPago_NM,this.tipopago_nmConstantesFunciones.activarnombreTipoPago_NM,this,true,"nombreTipoPago_NM","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipopago_nmConstantesFunciones.resaltarnombreTipoPago_NM,this.tipopago_nmConstantesFunciones.activarnombreTipoPago_NM,this,true,"nombreTipoPago_NM","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPago_NMPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEstructura && this.tipopago_nmConstantesFunciones.mostrarEstructuraTipoPago_NM && !TipoPago_NMConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Estructuras");
				tableColumn.setHeaderValue("Estructuras");
				tableColumn.setCellRenderer(new EstructuraTableCell(tipopago_nmConstantesFunciones.resaltarEstructuraTipoPago_NM,this,this.tipopago_nmConstantesFunciones.activarEstructuraTipoPago_NM));
				tableColumn.setCellEditor(new EstructuraTableCell(tipopago_nmConstantesFunciones.resaltarEstructuraTipoPago_NM,this,this.tipopago_nmConstantesFunciones.activarEstructuraTipoPago_NM));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoPago_NM.addColumn(tableColumn);
			}

			if(this.isTienePermisosCargo && this.tipopago_nmConstantesFunciones.mostrarCargoTipoPago_NM && !TipoPago_NMConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cargos");
				tableColumn.setHeaderValue("Cargos");
				tableColumn.setCellRenderer(new CargoTableCell(tipopago_nmConstantesFunciones.resaltarCargoTipoPago_NM,this,this.tipopago_nmConstantesFunciones.activarCargoTipoPago_NM));
				tableColumn.setCellEditor(new CargoTableCell(tipopago_nmConstantesFunciones.resaltarCargoTipoPago_NM,this,this.tipopago_nmConstantesFunciones.activarCargoTipoPago_NM));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoPago_NM.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipopago_nmSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipopago_nmSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPago_NM.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipopago_nmSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipopago_nmSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPago_NM.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipopago_nmSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipopago_nmSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoPago_NM.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoPago_NM.addColumn(tableColumn);
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
			
			this.jTableDatosTipoPago_NM.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipopago_nmSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoPago_NM.moveColumn(this.jTableDatosTipoPago_NM.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoPago_NM.moveColumn(this.jTableDatosTipoPago_NM.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipopago_nmSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoPago_NM.moveColumn(this.jTableDatosTipoPago_NM.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoPago_NM.moveColumn(this.jTableDatosTipoPago_NM.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoPago_NM.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoPago_NM.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoPago_NM,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoPago_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoPago_NM.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoPago_NM.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoPago_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoPago_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoPago_NM.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoPago_NM.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoPago_NM.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipopago_nmLogic.getTipoPago_NMs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipopago_nms.size()-1;
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
		//this.jTableDatosTipoPago_NM.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoPago_NM.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoPago_NM();
			
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
				
				//this.isEsNuevoTipoPago_NM=false;
					
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
				if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoPago_NM==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPago_NM.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPago_NM.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipopago_nm.getsType().equals("DUPLICADO")
				   || this.tipopago_nm.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoPago_NM=true;
				
				} else {
					this.isEsNuevoTipoPago_NM=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
					if(this.tipopago_nm.getId()>=0 && !this.tipopago_nm.getIsNew()) {						
						this.isEsNuevoTipoPago_NM=false;
						
					} else {
						this.isEsNuevoTipoPago_NM=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoPago_NM(esRelaciones);						
				
				this.seleccionarTipoPago_NM(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipopago_nm.getId()<0) {
					this.isEsNuevoTipoPago_NM=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoPago_NM(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoPago_NM(evt,rowIndex);
				}	
				
				if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoPago_NM: " + this.dDif); 
					}
				}								
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoPago_NM(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipopago_nm)) {
					if(this.tipopago_nm.getId()>0) {
						this.tipopago_nm.setIsDeleted(true);
						
						this.tipopago_nmsEliminados.add(this.tipopago_nm);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipopago_nmLogic.getTipoPago_NMs().remove(this.tipopago_nm);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipopago_nms.remove(this.tipopago_nm);				
					}
					
					
					((TipoPago_NMModel) this.jTableDatosTipoPago_NM.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPago_NM(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoPago_NM(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoPago_NM) {
			
			if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPago_NM.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPago_NM.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoPago_NM(this.tipopago_nm);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipopago_nmConstantesFunciones.cargarid_empresaTipoPago_NM || this.tipopago_nmConstantesFunciones.event_dependid_empresaTipoPago_NM) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipopago_nm.getid_empresa());
									//this.inicializarActualizarBindingTipoPago_NM(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipopago_nm.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipopago_nm.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipopago_nm.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoPago_NM("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoPago_NM(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPago_NM() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPago_NM(TipoPago_NM tipopago_nm) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoPago_NM(tipopago_nm,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPago_NM(TipoPago_NM tipopago_nm,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoPago_NM(tipopago_nm);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoPago_NM(tipopago_nm,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoPago_NM(tipopago_nm);
	}
	
	public void setVariablesObjetoActualToFormularioTipoPago_NM(TipoPago_NM tipopago_nm) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoPago_NM.jLabelidTipoPago_NM.setText(tipopago_nm.getId().toString());
			this.jInternalFrameDetalleFormTipoPago_NM.jTextFieldcodigoTipoPago_NM.setText(tipopago_nm.getcodigo());
			this.jInternalFrameDetalleFormTipoPago_NM.jTextAreanombreTipoPago_NM.setText(tipopago_nm.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoPago_NM tipopago_nmLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipopago_nmLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoPago_NM tipopago_nmLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipopago_nmLocal=this.tipopago_nm;
			} else {
				tipopago_nmLocal=this.tipopago_nmAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipopago_nmLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoPago_NM(tipopago_nmLocal,true);
					
					if(tipopago_nmSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipopago_nmLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipopago_nmLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoPago_NM(TipoPago_NM tipopago_nm,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPago_NM(tipopago_nm,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(tipopago_nm);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPago_NM(TipoPago_NM tipopago_nm,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPago_NM(tipopago_nm,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPago_NM(TipoPago_NM tipopago_nm,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoPago_NM.jLabelidTipoPago_NM.getText()==null || this.jInternalFrameDetalleFormTipoPago_NM.jLabelidTipoPago_NM.getText()=="" || this.jInternalFrameDetalleFormTipoPago_NM.jLabelidTipoPago_NM.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoPago_NM.jLabelidTipoPago_NM.setText("0");
			}

			if(conColumnasBase) {tipopago_nm.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoPago_NM.jLabelidTipoPago_NM.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPago_NMConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago_NM.jLabelIdTipoPago_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipopago_nm.setcodigo(this.jInternalFrameDetalleFormTipoPago_NM.jTextFieldcodigoTipoPago_NM.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPago_NMConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago_NM.jLabelcodigoTipoPago_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipopago_nm.setnombre(this.jInternalFrameDetalleFormTipoPago_NM.jTextAreanombreTipoPago_NM.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPago_NMConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPago_NM.jLabelnombreTipoPago_NM,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPago_NM(TipoPago_NM tipopago_nmBean,TipoPago_NM tipopago_nm,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoPago_NM(TipoPago_NM tipopago_nmOrigen,TipoPago_NM tipopago_nm,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipopago_nmOrigen.getId()!=null && !tipopago_nmOrigen.getId().equals(0L))) {tipopago_nm.setId(tipopago_nmOrigen.getId());}}
			if(conDefault || (!conDefault && tipopago_nmOrigen.getcodigo()!=null && !tipopago_nmOrigen.getcodigo().equals(""))) {tipopago_nm.setcodigo(tipopago_nmOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipopago_nmOrigen.getnombre()!=null && !tipopago_nmOrigen.getnombre().equals(""))) {tipopago_nm.setnombre(tipopago_nmOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPago_NM(TipoPago_NM tipopago_nm) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPago_NM.jLabelidTipoPago_NM.setText(tipopago_nm.getId().toString());
			this.jInternalFrameDetalleFormTipoPago_NM.jTextFieldcodigoTipoPago_NM.setText(tipopago_nm.getcodigo());
			this.jInternalFrameDetalleFormTipoPago_NM.jTextAreanombreTipoPago_NM.setText(tipopago_nm.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPago_NM(TipoPago_NMBean tipopago_nmBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPago_NM.jLabelidTipoPago_NM.setText(tipopago_nmBean.getId().toString());
			this.jInternalFrameDetalleFormTipoPago_NM.jTextFieldcodigoTipoPago_NM.setText(tipopago_nmBean.getcodigo());
			this.jInternalFrameDetalleFormTipoPago_NM.jTextAreanombreTipoPago_NM.setText(tipopago_nmBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoPago_NM(TipoPago_NMParameterReturnGeneral tipopago_nmReturnGeneral,TipoPago_NMBean tipopago_nmBean,Boolean conDefault) throws Exception { 
		try {
			TipoPago_NM tipopago_nmLocal=new TipoPago_NM();
			
			tipopago_nmLocal=tipopago_nmReturnGeneral.getTipoPago_NM();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipopago_nmLocal.getId()!=null && !tipopago_nmLocal.getId().equals(0L))) {tipopago_nmBean.setId(tipopago_nmLocal.getId());}}
			if(conDefault || (!conDefault && tipopago_nmLocal.getcodigo()!=null && !tipopago_nmLocal.getcodigo().equals(""))) {tipopago_nmBean.setcodigo(tipopago_nmLocal.getcodigo());}
			if(conDefault || (!conDefault && tipopago_nmLocal.getnombre()!=null && !tipopago_nmLocal.getnombre().equals(""))) {tipopago_nmBean.setnombre(tipopago_nmLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoPago_NMGenerico(Long idTipoPago_NMSeleccionado,JComboBox jComboBoxTipoPago_NM,List<TipoPago_NM> tipopago_nmsLocal)throws Exception {
		try {
			TipoPago_NM  tipopago_nmTemp=null;

			for(TipoPago_NM tipopago_nmAux:tipopago_nmsLocal) {
				if(tipopago_nmAux.getId()!=null && tipopago_nmAux.getId().equals(idTipoPago_NMSeleccionado)) {
					tipopago_nmTemp=tipopago_nmAux;
					break;
				}
			}

			jComboBoxTipoPago_NM.setSelectedItem(tipopago_nmTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoPago_NMGenerico(JComboBox jComboBoxTipoPago_NM,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoPago_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPago_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoPago_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPago_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPago_NM.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoPago_NM.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPago_NM.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoPago_NM.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoPago_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoPago_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Estructura")) {
			jButtonEstructuraActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Cargo")) {
			jButtonCargoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopago_nm=(TipoPago_NM) tipopago_nmLogic.getTipoPago_NMs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipopago_nm =(TipoPago_NM) tipopago_nms.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipopago_nm.getIsNew() && !tipopago_nm.getIsChanged() && !tipopago_nm.getIsDeleted()) {
				sDescripcion=tipopago_nm.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipopago_nm.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoPago_NM tipopago_nmRow=new TipoPago_NM();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopago_nmRow=(TipoPago_NM) tipopago_nmLogic.getTipoPago_NMs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipopago_nmRow=(TipoPago_NM) tipopago_nms.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEstructuraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoPago_NM tipopago_nm) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoPago_NM==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago_nm = (TipoPago_NM)this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipopago_nm = (TipoPago_NM)this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipopago_nm!=null) {
						this.tipopago_nm = tipopago_nm;
					} else {
						this.tipopago_nm = new TipoPago_NM();
					}
				}

				if(this.isTienePermisosEstructura && this.permiteMantenimiento(this.tipopago_nm)) {
					EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFramePopup=new EstructuraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						estructuraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFramePopup;
					} else {
						estructuraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame;
					}

					List<TipoPago_NM> tipopago_nms=new ArrayList<TipoPago_NM>();
					tipopago_nms.add(this.tipopago_nm);
					if(!esRelacionado) {
						//estructuraBeanSwingJInternalFrame.estructuraSessionBean.setConGuardarRelaciones(false);
						//estructuraBeanSwingJInternalFrame.estructuraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					estructuraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoPago_NM.cargarEstructuraBeanSwingJInternalFrame(tipopago_nms,this.tipopago_nm,estructuraBeanSwingJInternalFrame,/*conInicializar,*/estructuraBeanSwingJInternalFrame.estructuraSessionBean.getConGuardarRelaciones(),estructuraBeanSwingJInternalFrame.estructuraSessionBean.getEsGuardarRelacionado());
					estructuraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						estructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEstructura("no_relacionado");

						estructuraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EstructuraConstantesFunciones.ITAMANIOFILATABLA + (EstructuraConstantesFunciones.ITAMANIOFILATABLA/2));

						estructuraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoPago_NM=(TitledBorder)this.jScrollPanelDatosTipoPago_NM.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderTipoPago_NM.getTitle() + " -> Estructura");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}

						estructuraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

						estructuraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Estructura",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCargoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoPago_NM tipopago_nm) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoPago_NM==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago_nm = (TipoPago_NM)this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipopago_nm = (TipoPago_NM)this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipopago_nm!=null) {
						this.tipopago_nm = tipopago_nm;
					} else {
						this.tipopago_nm = new TipoPago_NM();
					}
				}

				if(this.isTienePermisosCargo && this.permiteMantenimiento(this.tipopago_nm)) {
					CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFramePopup=new CargoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cargoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFramePopup;
					} else {
						cargoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame;
					}

					List<TipoPago_NM> tipopago_nms=new ArrayList<TipoPago_NM>();
					tipopago_nms.add(this.tipopago_nm);
					if(!esRelacionado) {
						//cargoBeanSwingJInternalFrame.cargoSessionBean.setConGuardarRelaciones(false);
						//cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cargoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoPago_NM.cargarCargoBeanSwingJInternalFrame(tipopago_nms,this.tipopago_nm,cargoBeanSwingJInternalFrame,/*conInicializar,*/cargoBeanSwingJInternalFrame.cargoSessionBean.getConGuardarRelaciones(),cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado());
					cargoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("no_relacionado");

						cargoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CargoConstantesFunciones.ITAMANIOFILATABLA + (CargoConstantesFunciones.ITAMANIOFILATABLA/2));

						cargoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoPago_NM=(TitledBorder)this.jScrollPanelDatosTipoPago_NM.getBorder();
						TitledBorder titledBorderCargo=(TitledBorder)cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getBorder();

						titledBorderCargo.setTitle(titledBorderTipoPago_NM.getTitle() + " -> Cargo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cargoBeanSwingJInternalFrame);
						}

						cargoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cargoBeanSwingJInternalFrame);

						cargoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cargo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoPago_NM(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoPago_NM.setVisible((this.isVisibilidadCeldaNuevoTipoPago_NM && this.isPermisoNuevoTipoPago_NM));			
			this.jButtonDuplicarTipoPago_NM.setVisible((this.isVisibilidadCeldaDuplicarTipoPago_NM && this.isPermisoDuplicarTipoPago_NM));			
			this.jButtonCopiarTipoPago_NM.setVisible((this.isVisibilidadCeldaCopiarTipoPago_NM && this.isPermisoCopiarTipoPago_NM));
			this.jButtonVerFormTipoPago_NM.setVisible((this.isVisibilidadCeldaVerFormTipoPago_NM && this.isPermisoVerFormTipoPago_NM));
			
			this.jButtonAbrirOrderByTipoPago_NM.setVisible((this.isVisibilidadCeldaOrdenTipoPago_NM && this.isPermisoOrdenTipoPago_NM));			
			
			this.jButtonNuevoRelacionesTipoPago_NM.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM && this.isPermisoNuevoTipoPago_NM));			
			this.jButtonNuevoGuardarCambiosTipoPago_NM.setVisible((this.isVisibilidadCeldaNuevoTipoPago_NM && this.isPermisoNuevoTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM));
			
			if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonModificarTipoPago_NM.setVisible((this.isVisibilidadCeldaModificarTipoPago_NM && this.isPermisoActualizarTipoPago_NM));	
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonActualizarTipoPago_NM.setVisible((this.isVisibilidadCeldaActualizarTipoPago_NM && this.isPermisoActualizarTipoPago_NM));	
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonEliminarTipoPago_NM.setVisible((this.isVisibilidadCeldaEliminarTipoPago_NM && this.isPermisoEliminarTipoPago_NM));
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonCancelarTipoPago_NM.setVisible(this.isVisibilidadCeldaCancelarTipoPago_NM);							
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosTipoPago_NM.setVisible((this.isVisibilidadCeldaGuardarTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoPago_NM.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaNuevoTipoPago_NM && this.isPermisoNuevoTipoPago_NM));						
			this.jButtonDuplicarToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaDuplicarTipoPago_NM && this.isPermisoDuplicarTipoPago_NM));						
			this.jButtonCopiarToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaCopiarTipoPago_NM && this.isPermisoCopiarTipoPago_NM));			
			this.jButtonVerFormToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaVerFormTipoPago_NM && this.isPermisoVerFormTipoPago_NM));			
			this.jButtonAbrirOrderByToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaOrdenTipoPago_NM && this.isPermisoOrdenTipoPago_NM));
			this.jButtonNuevoRelacionesToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM && this.isPermisoNuevoTipoPago_NM));			
			this.jButtonNuevoGuardarCambiosToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaNuevoTipoPago_NM && this.isPermisoNuevoTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM));			
			
			if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonModificarToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaModificarTipoPago_NM && this.isPermisoActualizarTipoPago_NM));	
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonActualizarToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaActualizarTipoPago_NM  && this.isPermisoActualizarTipoPago_NM));	
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonEliminarToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaEliminarTipoPago_NM && this.isPermisoEliminarTipoPago_NM));
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonCancelarToolBarTipoPago_NM.setVisible(this.isVisibilidadCeldaCancelarTipoPago_NM);				
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaGuardarTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoPago_NM.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoPago_NM.setVisible((this.isVisibilidadCeldaNuevoTipoPago_NM && this.isPermisoNuevoTipoPago_NM));			
			this.jMenuItemDuplicarTipoPago_NM.setVisible((this.isVisibilidadCeldaDuplicarTipoPago_NM && this.isPermisoDuplicarTipoPago_NM));			
			this.jMenuItemCopiarTipoPago_NM.setVisible((this.isVisibilidadCeldaCopiarTipoPago_NM && this.isPermisoCopiarTipoPago_NM));			
			this.jMenuItemVerFormTipoPago_NM.setVisible((this.isVisibilidadCeldaVerFormTipoPago_NM && this.isPermisoVerFormTipoPago_NM));			
			this.jMenuItemAbrirOrderByTipoPago_NM.setVisible((this.isVisibilidadCeldaOrdenTipoPago_NM && this.isPermisoOrdenTipoPago_NM));			
			//this.jMenuItemMostrarOcultarTipoPago_NM.setVisible((this.isVisibilidadCeldaOrdenTipoPago_NM && this.isPermisoOrdenTipoPago_NM));
			this.jMenuItemDetalleAbrirOrderByTipoPago_NM.setVisible((this.isVisibilidadCeldaOrdenTipoPago_NM && this.isPermisoOrdenTipoPago_NM));			
			//this.jMenuItemDetalleMostrarOcultarTipoPago_NM.setVisible((this.isVisibilidadCeldaOrdenTipoPago_NM && this.isPermisoOrdenTipoPago_NM));			
			this.jMenuItemNuevoRelacionesTipoPago_NM.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM && this.isPermisoNuevoTipoPago_NM));			
			this.jMenuItemNuevoGuardarCambiosTipoPago_NM.setVisible((this.isVisibilidadCeldaNuevoTipoPago_NM && this.isPermisoNuevoTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM));									
			
			if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemModificarTipoPago_NM.setVisible((this.isVisibilidadCeldaModificarTipoPago_NM && this.isPermisoActualizarTipoPago_NM));	
			this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemActualizarTipoPago_NM.setVisible((this.isVisibilidadCeldaActualizarTipoPago_NM && this.isPermisoActualizarTipoPago_NM));	
			this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemEliminarTipoPago_NM.setVisible((this.isVisibilidadCeldaEliminarTipoPago_NM && this.isPermisoEliminarTipoPago_NM));
			this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemCancelarTipoPago_NM.setVisible(this.isVisibilidadCeldaCancelarTipoPago_NM);				
			}
			
			this.jMenuItemGuardarCambiosTipoPago_NM.setVisible((this.isVisibilidadCeldaGuardarTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM));						
			this.jMenuItemGuardarCambiosTablaTipoPago_NM.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoPago_NM=this.jButtonNuevoTipoPago_NM.isVisible();
			this.isVisibilidadCeldaDuplicarTipoPago_NM=this.jButtonDuplicarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaCopiarTipoPago_NM=this.jButtonCopiarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaVerFormTipoPago_NM=this.jButtonVerFormTipoPago_NM.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoPago_NM=this.jButtonAbrirOrderByTipoPago_NM.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=this.jButtonNuevoRelacionesTipoPago_NM.isVisible();
			this.isVisibilidadCeldaModificarTipoPago_NM=this.jButtonModificarTipoPago_NM.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			this.isVisibilidadCeldaActualizarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jButtonActualizarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaEliminarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jButtonEliminarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaCancelarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jButtonCancelarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaGuardarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosTipoPago_NM.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=this.jButtonGuardarCambiosTablaTipoPago_NM.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoPago_NM=this.jButtonNuevoToolBarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=this.jButtonNuevoRelacionesToolBarTipoPago_NM.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			this.isVisibilidadCeldaModificarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jButtonModificarToolBarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaActualizarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jButtonActualizarToolBarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaEliminarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jButtonEliminarToolBarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaCancelarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jButtonCancelarToolBarTipoPago_NM.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPago_NM=this.jButtonGuardarCambiosToolBarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=this.jButtonGuardarCambiosTablaToolBarTipoPago_NM.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoPago_NM=this.jMenuItemNuevoTipoPago_NM.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=this.jMenuItemNuevoRelacionesTipoPago_NM.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			this.isVisibilidadCeldaModificarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemModificarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaActualizarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemActualizarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaEliminarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemEliminarTipoPago_NM.isVisible();
			this.isVisibilidadCeldaCancelarTipoPago_NM=this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemCancelarTipoPago_NM.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPago_NM=this.jMenuItemGuardarCambiosTipoPago_NM.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=this.jMenuItemGuardarCambiosTablaTipoPago_NM.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoPago_NM(Boolean esInicializar) {
		if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
				//if(this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPago_NM();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoPago_NM(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoPago_NM() {
		this.jButtonNuevoTipoPago_NM.setVisible(this.isPermisoNuevoTipoPago_NM);			
		this.jButtonDuplicarTipoPago_NM.setVisible(this.isPermisoDuplicarTipoPago_NM);			
		this.jButtonCopiarTipoPago_NM.setVisible(this.isPermisoCopiarTipoPago_NM);			
		this.jButtonVerFormTipoPago_NM.setVisible(this.isPermisoVerFormTipoPago_NM);			
		
		this.jButtonAbrirOrderByTipoPago_NM.setVisible(this.isPermisoOrdenTipoPago_NM);					
		
		this.jButtonNuevoRelacionesTipoPago_NM.setVisible(this.isPermisoNuevoTipoPago_NM);			
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonModificarTipoPago_NM.setVisible(this.isPermisoActualizarTipoPago_NM);	
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonActualizarTipoPago_NM.setVisible(this.isPermisoActualizarTipoPago_NM);	
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonEliminarTipoPago_NM.setVisible(this.isPermisoEliminarTipoPago_NM);
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonCancelarTipoPago_NM.setVisible(this.isVisibilidadCeldaCancelarTipoPago_NM);						
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosTipoPago_NM.setVisible(this.isPermisoGuardarCambiosTipoPago_NM);							
		}
		
		this.jButtonGuardarCambiosTablaTipoPago_NM.setVisible(this.isPermisoActualizarTipoPago_NM);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPago_NM() {
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonModificarTipoPago_NM.setVisible(this.isPermisoActualizarTipoPago_NM);	
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonActualizarTipoPago_NM.setVisible(this.isPermisoActualizarTipoPago_NM);	
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonEliminarTipoPago_NM.setVisible(this.isPermisoEliminarTipoPago_NM);
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonCancelarTipoPago_NM.setVisible(this.isVisibilidadCeldaCancelarTipoPago_NM);							
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosTipoPago_NM.setVisible((this.isVisibilidadCeldaGuardarTipoPago_NM && this.isPermisoGuardarCambiosTipoPago_NM));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoPago_NM() {
		if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoPago_NM();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoPago_NM() {
	}
	
	public void jTableDatosTipoPago_NMListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoPago_NM(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoPago_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPago_NM(this.gettipopago_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopago_nm==null) {
						this.tipopago_nm = new TipoPago_NM();
					}

					this.setVariablesFormularioToObjetoActualTipoPago_NM(this.tipopago_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
				}

				if(this.tipopago_nm.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipopago_nm.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPago_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoPago_NMUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoPago_NM(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoPago_NM.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoPago_NM.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoPago_NM(this.gettipopago_nm(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipopago_nmLogic.getConnexion());

				if(this.tipopago_nm.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipopago_nm.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoPago_NM=(TitledBorder)this.jScrollPanelDatosTipoPago_NM.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoPago_NM.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoPago_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPago_NM(this.gettipopago_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopago_nm==null) {
						this.tipopago_nm = new TipoPago_NM();
					}

					this.setVariablesFormularioToObjetoActualTipoPago_NM(this.tipopago_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
				}

				if(this.tipopago_nm.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipopago_nm.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPago_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoPago_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPago_NM(this.gettipopago_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopago_nm==null) {
						this.tipopago_nm = new TipoPago_NM();
					}

					this.setVariablesFormularioToObjetoActualTipoPago_NM(this.tipopago_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
				}

				if(this.tipopago_nm.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipopago_nm.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPago_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoPago_NMBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPago_NM(this.gettipopago_nm(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipopago_nm==null) {
						this.tipopago_nm = new TipoPago_NM();
					}

					this.setVariablesFormularioToObjetoActualTipoPago_NM(this.tipopago_nm,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);
				}

				if(this.tipopago_nm.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipopago_nm.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPago_NM(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoPago_NMActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoPago_NM(false,false);

			this.getTipoPago_NMsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoPago_NM(false);

			//if(TipoPago_NMBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoPago_NM(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipopago_nmLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoPago_NM() {
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
		

		if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
			this.jInternalFrameDetalleFormTipoPago_NM.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoPago_NM.dispose();
			this.jInternalFrameDetalleFormTipoPago_NM=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoPago_NM!=null) {
			this.jInternalFrameReporteDinamicoTipoPago_NM.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoPago_NM.dispose();
			this.jInternalFrameReporteDinamicoTipoPago_NM=null;
		}
		
		if(this.jInternalFrameImportacionTipoPago_NM!=null) {
			this.jInternalFrameImportacionTipoPago_NM.setVisible(false);	    			
			this.jInternalFrameImportacionTipoPago_NM.dispose();
			this.jInternalFrameImportacionTipoPago_NM=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoPago_NM();
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoPago_NM")) {
				jButtonNuevoTipoPago_NMActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoPago_NM")) {
				jButtonDuplicarTipoPago_NMActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoPago_NM")) {
				jButtonCopiarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoPago_NM")) {
				jButtonVerFormTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoPago_NM")) {
				jButtonNuevoTipoPago_NMActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoPago_NM")) {
				jButtonDuplicarTipoPago_NMActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoPago_NM")) {
				jButtonNuevoTipoPago_NMActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoPago_NM")) {
				jButtonDuplicarTipoPago_NMActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoPago_NM")) {
				jButtonNuevoTipoPago_NMActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoPago_NM")) {
				jButtonNuevoTipoPago_NMActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoPago_NM")) {
				jButtonNuevoTipoPago_NMActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoPago_NM")) {
				jButtonModificarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoPago_NM")) {
				jButtonModificarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoPago_NM")) {
				jButtonModificarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoPago_NM")) {
				jButtonActualizarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoPago_NM")) {
				jButtonActualizarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoPago_NM")) {
				jButtonActualizarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoPago_NM")) {
				jButtonEliminarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoPago_NM")) {
				jButtonEliminarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoPago_NM")) {
				jButtonEliminarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoPago_NM")) {
				jButtonCancelarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoPago_NM")) {
				jButtonCancelarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoPago_NM")) {
				jButtonCancelarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoPago_NM")) {
				jButtonCerrarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoPago_NM")) {
				jButtonCerrarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoPago_NM")) {
				jButtonCerrarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoPago_NM")) {
				jButtonMostrarOcultarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoPago_NM")) {
				jButtonCancelarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoPago_NM")) {
				jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoPago_NM")) {
				jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoPago_NM")) {
				jButtonCopiarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoPago_NM")) {
				jButtonVerFormTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoPago_NM")) {
				jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoPago_NM")) {
				jButtonCopiarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoPago_NM")) {
				jButtonVerFormTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoPago_NM")) {
				jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoPago_NM")) {
				jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoPago_NM")) {
				jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoPago_NM")) {
				jButtonRecargarInformacionTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoPago_NM")) {
				jButtonRecargarInformacionTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoPago_NM")) {
				jButtonRecargarInformacionTipoPago_NMActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoPago_NM")) {
				jButtonAnterioresTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoPago_NM")) {
				jButtonAnterioresTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoPago_NM")) {
				jButtonAnterioresTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoPago_NM")) {
				jButtonSiguientesTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoPago_NM")) {
				jButtonSiguientesTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoPago_NM")) {
				jButtonSiguientesTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoPago_NM") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoPago_NM")) {
				jButtonAbrirOrderByTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoPago_NM") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoPago_NM")) {
				jButtonMostrarOcultarTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPago_NM")) {
				jButtonNuevoGuardarCambiosTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoPago_NM")) {
				jButtonNuevoGuardarCambiosTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoPago_NM")) {
				jButtonNuevoGuardarCambiosTipoPago_NMActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoPago_NM")) {
				jButtonCerrarReporteDinamicoTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoPago_NM")) {
				jButtonGenerarReporteDinamicoTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoPago_NM")) {
				
				jButtonGenerarExcelReporteDinamicoTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoPago_NM")) {
				jButtonCerrarImportacionTipoPago_NMActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoPago_NM")) {
				
				jButtonGenerarImportacionTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoPago_NM")) {
				
				jButtonAbrirImportacionTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoPago_NM")) {
				jComboBoxTiposAccionesTipoPago_NMActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoPago_NM")) {
				jComboBoxTiposRelacionesTipoPago_NMActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoPago_NM")) {
				jComboBoxTiposAccionesTipoPago_NMActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoPago_NM")) {
				
				jComboBoxTiposSeleccionarTipoPago_NMActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoPago_NM")) {
				jTextFieldValorCampoGeneralTipoPago_NMActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoPago_NM")) {
				jButtonAbrirOrderByTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoPago_NM")) {
				jButtonAbrirOrderByTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoPago_NM")) {
				jButtonCerrarOrderByTipoPago_NMActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPago_NMBusqueda")) {
				this.jButtonidTipoPago_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoPago_NMUpdate")) {
				this.jButtonid_empresaTipoPago_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoPago_NMBusqueda")) {
				this.jButtonid_empresaTipoPago_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPago_NMBusqueda")) {
				this.jButtoncodigoTipoPago_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPago_NMBusqueda")) {
				this.jButtonnombreTipoPago_NMBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoPago_NM();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPago_NMActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				


				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoPago_NM tipopago_nmLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipopago_nmLocal=this.tipopago_nm;
			} else {
				tipopago_nmLocal=this.tipopago_nmAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
							
				
				


				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPago_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
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
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
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
			
			


			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPago_NMActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
								
						
				


				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago_NM.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
								
				
				


				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPago_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPago_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPago_NMActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
							
				
				


				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago_NM.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPago_NMActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
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
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
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
			
			


			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPago_NMActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
								
				
				


				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPago_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPago_NMActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPago_NMActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoPago_NM")) {
					jCheckBoxSeleccionarTodosTipoPago_NMItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoPago_NM")) {
					jCheckBoxSeleccionadosTipoPago_NMItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoPago_NM")) {
					
				}
				
				


				
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
												
				
				


				
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago_NM.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPago_NMActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPago_NMActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
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
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
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
			
			


			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPago_NMActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago_NM.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago_NM.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipopago_nm);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipopago_nm);
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
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
				
				


				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPago_NM.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPago_NM.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPago_NMActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipopago_nmAnterior =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoPago_NM")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoPago_NMListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoPago_NM.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipopago_nm =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipopago_nm =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipopago_nm);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoPago_NM")) {
				
				}
				
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoPago_NM")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoPago_NM.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoPago_NM")) {
			
			}
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoPago_NM();
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
			if(sTipo.equals("NuevoTipoPago_NM")) {
				jButtonNuevoTipoPago_NMActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoPago_NM")) {
				jButtonDuplicarTipoPago_NMActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoPago_NM")) {
				jButtonCopiarTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoPago_NM")) {
				jButtonVerFormTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoPago_NM")) {
				jButtonNuevoTipoPago_NMActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoPago_NM")) {
				jButtonModificarTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoPago_NM")) {
				jButtonActualizarTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoPago_NM")) {
				jButtonEliminarTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoPago_NM")) {
				jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoPago_NM")) {
				jButtonCancelarTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoPago_NM")) {
				jButtonCerrarTipoPago_NMActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoPago_NM")) {
				jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPago_NM")) {
				jButtonNuevoGuardarCambiosTipoPago_NMActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoPago_NM")) {
				jButtonAbrirOrderByTipoPago_NMActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoPago_NM")) {
				jButtonRecargarInformacionTipoPago_NMActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoPago_NM")) {
				jButtonAnterioresTipoPago_NMActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoPago_NM")) {
				jButtonSiguientesTipoPago_NMActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPago_NMBusqueda")) {
				this.jButtonidTipoPago_NMBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoPago_NMUpdate")) {
				this.jButtonid_empresaTipoPago_NMUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoPago_NMBusqueda")) {
				this.jButtonid_empresaTipoPago_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPago_NMBusqueda")) {
				this.jButtoncodigoTipoPago_NMBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPago_NMBusqueda")) {
				this.jButtonnombreTipoPago_NMBusquedaActionPerformed(evt);
			}
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoPago_NM();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoPago_NM")) {
				closingInternalFrameTipoPago_NM();
				
			} else if(sTipo.equals("jButtonCancelarTipoPago_NM")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoPago_NM = (JInternalFrameBase)evt.getSource();
	            	
	            TipoPago_NMBeanSwingJInternalFrame jInternalFrameParent=(TipoPago_NMBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPago_NM.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoPago_NMActionPerformed(null);
			}
			
			TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipopago_nm,new Object(),this.tipopago_nmParameterGeneral,this.tipopago_nmReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoPago_NM(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoPago_NM(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoPago_NM(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipopago_nm)) {
			if(!esControlTabla) {
				if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoPago_NM(this.tipopago_nm,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);			
				}
				
				if(this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoPago_NM(this.tipopago_nm,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipopago_nmReturnGeneral=tipopago_nmLogic.procesarEventosTipoPago_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopago_nmLogic.getTipoPago_NMs(),this.tipopago_nm,this.tipopago_nmParameterGeneral,this.isEsNuevoTipoPago_NM,classes);//this.tipopago_nmLogic.getTipoPago_NM()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoPago_NM(this.tipopago_nmReturnGeneral,this.tipopago_nmBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoPago_NM(classes,this.tipopago_nmReturnGeneral,this.tipopago_nmBean,false);
					}
						
					if(this.tipopago_nmReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoPago_NM(this.tipopago_nmReturnGeneral.getTipoPago_NM());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoPago_NM(this.tipopago_nmReturnGeneral.getTipoPago_NM());	
					}
						
					if(this.tipopago_nmReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoPago_NM(this.tipopago_nmReturnGeneral.getTipoPago_NM(),classes);//this.tipopago_nmBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoPago_NM(this.tipopago_nm,classes);//this.tipopago_nmBean);									
				}
			
				if(TipoPago_NMJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoPago_NM(this.tipopago_nm,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPago_NM(this.tipopago_nm);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipopago_nmAnterior!=null) {
						this.tipopago_nm=this.tipopago_nmAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipopago_nmReturnGeneral=tipopago_nmLogic.procesarEventosTipoPago_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopago_nmLogic.getTipoPago_NMs(),this.tipopago_nm,this.tipopago_nmParameterGeneral,this.isEsNuevoTipoPago_NM,classes);//this.tipopago_nmLogic.getTipoPago_NM()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipopago_nmSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipopago_nmReturnGeneral.getTipoPago_NM(),tipopago_nmLogic.getTipoPago_NMs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipopago_nmReturnGeneral.getTipoPago_NM(),this.tipopago_nms);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoPago_NM.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoPago_NM.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoPago_NM();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoPago_NM() throws Exception {
		
		TipoPago_NMModel tipopago_nmModel=(TipoPago_NMModel)this.jTableDatosTipoPago_NM.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipopago_nmModel.tipopago_nms=this.tipopago_nmLogic.getTipoPago_NMs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipopago_nmModel.tipopago_nms=this.tipopago_nms;
		}
		
		
		((TipoPago_NMModel) this.jTableDatosTipoPago_NM.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoPago_NM() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipopago_nmAnterior(),this.tipopago_nmLogic.getTipoPago_NMs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipopago_nmAnterior(),this.tipopago_nms);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoPago_NM();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoPago_NM(TipoPago_NM tipopago_nm,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Estructura.class)) {
					this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.setEstructuras(tipopago_nm.getEstructuras());
					this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(tipopago_nm.getCargos());
					this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
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
										
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopago_nm,new Object(),generalEntityParameterGeneral,this.tipopago_nmReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoPago_NMConstantesFunciones.getClassesRelationshipsOfTipoPago_NM(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoPago_NMConstantesFunciones.getClassesRelationshipsFromStringsOfTipoPago_NM(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoPago_NM(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoPago_NMBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipopago_nm,new Object(),generalEntityParameterGeneral,this.tipopago_nmReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoPago_NM(TipoPago_NMBean tipopago_nmBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Estructura.class)) {
					this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.setEstructuras(tipopago_nm.getEstructuras());
					this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(tipopago_nm.getCargos());
					this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoPago_NM(ArrayList<Classe> classes,TipoPago_NMReturnGeneral tipopago_nmReturnGeneral,TipoPago_NMBean tipopago_nmBean,Boolean conDefault) throws Exception {
		
			this.tipopago_nmBean.setEstructuras(tipopago_nmReturnGeneral.getTipoPago_NM().getEstructuras());
			this.tipopago_nmBean.setCargos(tipopago_nmReturnGeneral.getTipoPago_NM().getCargos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoPago_NM(TipoPago_NM tipopago_nm,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Estructura.class)) {
					tipopago_nm.setEstructuras(this.jInternalFrameDetalleFormTipoPago_NM.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					tipopago_nm.setCargos(this.jInternalFrameDetalleFormTipoPago_NM.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipopago_nm)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoPago_NM = new TipoPago_NMDetalleFormJInternalFrame(jDesktopPane,this.tipopago_nmSessionBean.getConGuardarRelaciones(),this.tipopago_nmSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPago_NM);
		this.jInternalFrameDetalleFormTipoPago_NM.setVisible(false);
		this.jInternalFrameDetalleFormTipoPago_NM.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoPago_NM.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoPago_NM.tipopago_nmLogic=this.tipopago_nmLogic;
		
		this.cargarCombosFrameForeignKeyTipoPago_NM("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPago_NM();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPago_NM();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoPago_NM("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoPago_NM();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoPago_NM.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPago_NM"));
		
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonModificarTipoPago_NM.addActionListener(new ButtonActionListener(this,"ModificarTipoPago_NM"));

		
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonModificarToolBarTipoPago_NM.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPago_NM"));
					
		this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemModificarTipoPago_NM.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPago_NM"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonActualizarTipoPago_NM.addActionListener (new ButtonActionListener(this,"ActualizarTipoPago_NM"));
		
		
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonActualizarToolBarTipoPago_NM.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPago_NM"));
						
		this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemActualizarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPago_NM"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonEliminarTipoPago_NM.addActionListener (new ButtonActionListener(this,"EliminarTipoPago_NM"));
		
		
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonEliminarToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPago_NM"));
								
		this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemEliminarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPago_NM"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonCancelarTipoPago_NM.addActionListener (new ButtonActionListener(this,"CancelarTipoPago_NM"));
		
		
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonCancelarToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPago_NM"));
					
		this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemCancelarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPago_NM"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemDetalleCerrarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPago_NM"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPago_NM"));
		
		
		
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPago_NM"));
		
		
		
		this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPago_NM"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonidTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPago_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonid_empresaTipoPago_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPago_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonid_empresaTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPago_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtoncodigoTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPago_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonnombreTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPago_NMBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoPago_NM.jTabbedPaneRelacionesTipoPago_NM.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPago_NM"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoPago_NM"));
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPago_NM"));
		}
		
		this.jTableDatosTipoPago_NM.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoPago_NM"));
		
		this.jTableDatosTipoPago_NM.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoPago_NM"));
		
		this.jButtonNuevoTipoPago_NM.addActionListener(new ButtonActionListener(this,"NuevoTipoPago_NM"));
		
		this.jButtonDuplicarTipoPago_NM.addActionListener(new ButtonActionListener(this,"DuplicarTipoPago_NM"));
		
		this.jButtonCopiarTipoPago_NM.addActionListener(new ButtonActionListener(this,"CopiarTipoPago_NM"));
		
		this.jButtonVerFormTipoPago_NM.addActionListener(new ButtonActionListener(this,"VerFormTipoPago_NM"));
		
		
		this.jButtonNuevoToolBarTipoPago_NM.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoPago_NM"));
			
		this.jButtonDuplicarToolBarTipoPago_NM.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoPago_NM"));
			
		this.jMenuItemNuevoTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoPago_NM"));
			
		this.jMenuItemDuplicarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoPago_NM"));		
		
		
		this.jButtonNuevoRelacionesTipoPago_NM.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoPago_NM"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoPago_NM.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoPago_NM"));
			
		this.jMenuItemNuevoRelacionesTipoPago_NM.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoPago_NM"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonModificarTipoPago_NM.addActionListener(new ButtonActionListener(this,"ModificarTipoPago_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonModificarToolBarTipoPago_NM.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPago_NM"));
			
			this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemModificarTipoPago_NM.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPago_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonActualizarTipoPago_NM.addActionListener (new ButtonActionListener(this,"ActualizarTipoPago_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonActualizarToolBarTipoPago_NM.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPago_NM"));
				
			this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemActualizarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPago_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonEliminarTipoPago_NM.addActionListener (new ButtonActionListener(this,"EliminarTipoPago_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonEliminarToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPago_NM"));
						
			this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemEliminarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPago_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonCancelarTipoPago_NM.addActionListener (new ButtonActionListener(this,"CancelarTipoPago_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonCancelarToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPago_NM"));
			
			this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemCancelarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPago_NM"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoPago_NM"));		
		
		
		this.jButtonCerrarTipoPago_NM.addActionListener (new ButtonActionListener(this,"CerrarTipoPago_NM"));
		
		
		this.jButtonCerrarToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoPago_NM"));
			
		this.jMenuItemCerrarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoPago_NM"));
			
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jMenuItemDetalleCerrarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPago_NM"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosTipoPago_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoPago_NM"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPago_NM"));
		}
		
		this.jButtonCopiarToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoPago_NM"));
			
		this.jButtonVerFormToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoPago_NM"));
		
		this.jMenuItemGuardarCambiosTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoPago_NM"));
			
		this.jMenuItemCopiarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoPago_NM"));		
		
		this.jMenuItemVerFormTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoPago_NM"));		
		
		
		this.jButtonGuardarCambiosTablaTipoPago_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPago_NM"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoPago_NM"));
			
		this.jMenuItemGuardarCambiosTablaTipoPago_NM.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPago_NM"));		
		
		
		
		this.jButtonRecargarInformacionTipoPago_NM.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoPago_NM"));
					
		this.jButtonRecargarInformacionToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoPago_NM"));
		
		this.jMenuItemRecargarInformacionTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoPago_NM"));		
		
		
		
		this.jButtonAnterioresTipoPago_NM.addActionListener (new ButtonActionListener(this,"AnterioresTipoPago_NM"));
		
		
		this.jButtonAnterioresToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoPago_NM"));
		
		this.jMenuItemAnterioresTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoPago_NM"));		
		
		
		this.jButtonSiguientesTipoPago_NM.addActionListener (new ButtonActionListener(this,"SiguientesTipoPago_NM"));
		
		
		this.jButtonSiguientesToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoPago_NM"));
			
		this.jMenuItemSiguientesTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoPago_NM"));
			
		this.jMenuItemAbrirOrderByTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoPago_NM"));
			
		this.jMenuItemMostrarOcultarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoPago_NM"));
			
		this.jMenuItemDetalleAbrirOrderByTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoPago_NM"));
			
		this.jMenuItemDetalleMostarOcultarTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoPago_NM"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoPago_NM.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoPago_NM"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoPago_NM"));
			
		this.jMenuItemNuevoGuardarCambiosTipoPago_NM.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoPago_NM"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoPago_NM.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoPago_NM"));

		this.jCheckBoxSeleccionadosTipoPago_NM.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoPago_NM"));
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPago_NM"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoPago_NM.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoPago_NM"));
			
		this.jComboBoxTiposAccionesTipoPago_NM.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoPago_NM"));
					
		this.jComboBoxTiposSeleccionarTipoPago_NM.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoPago_NM"));
			
		this.jTextFieldValorCampoGeneralTipoPago_NM.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoPago_NM"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonidTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPago_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonid_empresaTipoPago_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPago_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonid_empresaTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPago_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtoncodigoTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPago_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonnombreTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPago_NMBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoPago_NM!=null) {
				this.jInternalFrameReporteDinamicoTipoPago_NM.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPago_NM"));
				this.jInternalFrameReporteDinamicoTipoPago_NM.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPago_NM"));
				this.jInternalFrameReporteDinamicoTipoPago_NM.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPago_NM"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoPago_NM.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPago_NM"));				
			//this.jButtonGenerarReporteDinamicoTipoPago_NM.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPago_NM"));
			//this.jButtonGenerarExcelReporteDinamicoTipoPago_NM.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPago_NM"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoPago_NM!=null) {
				this.jInternalFrameImportacionTipoPago_NM.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPago_NM"));
				this.jInternalFrameImportacionTipoPago_NM.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPago_NM"));
				this.jInternalFrameImportacionTipoPago_NM.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPago_NM"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoPago_NM.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoPago_NM"));
			
			this.jButtonAbrirOrderByToolBarTipoPago_NM.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoPago_NM"));			
			
			if(this.jInternalFrameOrderByTipoPago_NM!=null) {
				this.jInternalFrameOrderByTipoPago_NM.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPago_NM"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPago_NM.jTabbedPaneRelacionesTipoPago_NM.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPago_NM"));
		
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
            		closingInternalFrameTipoPago_NM();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoPago_NM.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoPago_NM = (JInternalFrameBase)event.getSource();
	            	
	            TipoPago_NMBeanSwingJInternalFrame jInternalFrameParent=(TipoPago_NMBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPago_NM.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoPago_NMActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoPago_NM.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoPago_NMListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoPago_NM.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoPago_NM.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPago_NMActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPago_NMActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPago_NMActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoPago_NM";
		inputMap = this.jButtonNuevoTipoPago_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoPago_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPago_NMActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPago_NMActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPago_NMActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPago_NMActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoPago_NM";
		inputMap = this.jButtonNuevoRelacionesTipoPago_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoPago_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPago_NMActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoPago_NM";
		inputMap = this.jButtonModificarTipoPago_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoPago_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoPago_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoPago_NM";
		inputMap = this.jButtonActualizarTipoPago_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoPago_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoPago_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoPago_NM";
		inputMap = this.jButtonEliminarTipoPago_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoPago_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoPago_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoPago_NM";
		inputMap = this.jButtonCancelarTipoPago_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoPago_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoPago_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoPago_NM";
		inputMap = this.jButtonCerrarTipoPago_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoPago_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoPago_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoPago_NM";
		inputMap = this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosTipoPago_NM.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonGuardarCambiosTipoPago_NM.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoPago_NMActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoPago_NM.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoPago_NMItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoPago_NM.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoPago_NMActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoPago_NM.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoPago_NMActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoPago_NM.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoPago_NMActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonidTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPago_NMBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonid_empresaTipoPago_NMUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPago_NMUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonid_empresaTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPago_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtoncodigoTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPago_NMBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPago_NM.jButtonnombreTipoPago_NMBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPago_NMBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoPago_NM.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoPago_NMActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoPago_NMActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoPago_NM.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoPago_NM(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoPago_NM tipopago_nmAux:this.tipopago_nmLogic.getTipoPago_NMs()) {
					tipopago_nmAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPago_NM tipopago_nmAux:tipopago_nms) {
					tipopago_nmAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoPago_NMItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPago_NM(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPago_NM tipopago_nmAux:this.tipopago_nmLogic.getTipoPago_NMs()) {
						tipopago_nmAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPago_NM tipopago_nmAux:tipopago_nms) {
						tipopago_nmAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoPago_NM tipopago_nmAux:this.tipopago_nmLogic.getTipoPago_NMs()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPago_NM tipopago_nmAux:tipopago_nms) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPago_NM(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPago_NM.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPago_NM.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPago_NM,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoPago_NMItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPago_NM(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoPago_NM.getSelectedRows();
			
			TipoPago_NM tipopago_nmLocal=new TipoPago_NM();
			
			//this.seleccionarTodosTipoPago_NM(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopago_nmLocal =(TipoPago_NM) this.tipopago_nmLogic.getTipoPago_NMs().toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipopago_nmLocal =(TipoPago_NM) this.tipopago_nms.toArray()[this.jTableDatosTipoPago_NM.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipopago_nmLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPago_NM tipopago_nmAux:this.tipopago_nmLogic.getTipoPago_NMs()) {
						tipopago_nmAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPago_NM tipopago_nmAux:tipopago_nms) {
						tipopago_nmAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoPago_NM(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPago_NM.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPago_NM.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPago_NM,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoPago_NMItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoPago_NMParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoPago_NMActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoPago_NM(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoPago_NM.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPago_NM tipopago_nmAux:this.tipopago_nmLogic.getTipoPago_NMs()) {
				
						if(sTipoSeleccionar.equals(TipoPago_NMConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipopago_nmAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPago_NMConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipopago_nmAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPago_NM tipopago_nmAux:tipopago_nms) {
					
						if(sTipoSeleccionar.equals(TipoPago_NMConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipopago_nmAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPago_NMConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipopago_nmAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPago_NM(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoPago_NMActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoPago_NM(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoPago_NM=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoPago_NM.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoPago_NM) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoPago_NM(conSplash);
				
					this.generarReporteTipoPago_NMsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPago_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoPago_NMsSeleccionados();
				//this.jComboBoxTiposAccionesTipoPago_NM.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPago_NMsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoPago_NM.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPago_NMsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoPago_NM.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPago_NM();
				
				this.exportarTipoPago_NMsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPago_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoPago_NMs();
				//this.importarTipoPago_NMs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPago_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPago_NM();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoPago_NMsSeleccionados();
				//this.jComboBoxTiposAccionesTipoPago_NM.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Pago_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoPago_NM();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoPago_NM)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoPago_NM(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Pago_ N M",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPago_NM.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoPago_NMBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoPago_NM) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoPago_NM(conSplash);
					
						//this.actualizarParametrosGeneralTipoPago_NM();
						
						this.generarReporteProcesoAccionTipoPago_NMsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoPago_NM.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoPago_NMBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Pago_ N MES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Pago_ N M", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoPago_NM();
				
						this.actualizarParametrosGeneralTipoPago_NM();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipopago_nmReturnGeneral=tipopago_nmLogic.procesarAccionTipoPago_NMsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipopago_nmLogic.getTipoPago_NMs(),this.tipopago_nmParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoPago_NMReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoPago_NM.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoPago_NM();
					
					TipoPago_NMBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoPago_NMReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoPago_NM.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxTiposAccionesFormularioTipoPago_NM.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoPago_NM(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoPago_NMActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoPago_NM();
			
			if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();		
			TipoPago_NM tipopago_nm=new TipoPago_NM();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoPago_NM(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoPago_NM.getSelectedItem();
			
			
			
			
			tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipopago_nmsSeleccionados.size()==1) {
				for(TipoPago_NM tipopago_nmAux:tipopago_nmsSeleccionados) {
					tipopago_nm=tipopago_nmAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Estructura")) {
					jButtonEstructuraActionPerformed(null,rowIndex,true,false,tipopago_nm);
				}
				else if(this.sTipoRelacion.equals("Cargo")) {
					jButtonCargoActionPerformed(null,rowIndex,true,false,tipopago_nm);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoPago_NM();
			
      		//this.finishProcessTipoPago_NM(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoPago_NMReturnGeneral() throws Exception {
		if(this.tipopago_nmReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipopago_nmReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipopago_nmReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipopago_nmReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipopago_nmReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipopago_nmReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoPago_NM(false);
		}
		
		if(this.tipopago_nmReturnGeneral.getConRetornoLista() || this.tipopago_nmReturnGeneral.getConRetornoObjeto()) {
			if(this.tipopago_nmReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipopago_nmLogic.setTipoPago_NMs(this.tipopago_nmReturnGeneral.getTipoPago_NMs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipopago_nmReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipopago_nmLogic.setTipoPago_NM(this.tipopago_nmReturnGeneral.getTipoPago_NM());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoPago_NM(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoPago_NM() throws Exception {
		
		
	}
	
	public ArrayList<TipoPago_NM> getTipoPago_NMsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoPago_NM) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoPago_NM tipopago_nmAux:tipopago_nmLogic.getTipoPago_NMs()) {
					if(tipopago_nmAux.getIsSelected()) {
						tipopago_nmsSeleccionados.add(tipopago_nmAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPago_NM tipopago_nmAux:this.tipopago_nms) {
					if(tipopago_nmAux.getIsSelected()) {
						tipopago_nmsSeleccionados.add(tipopago_nmAux);				
					}
				}
			}
			
			if(tipopago_nmsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipopago_nmsSeleccionados.addAll(this.tipopago_nmLogic.getTipoPago_NMs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipopago_nmsSeleccionados.addAll(this.tipopago_nms);				
					}
				}
			}
		} else {
			tipopago_nmsSeleccionados.add(this.tipopago_nm);
		}
		
		return tipopago_nmsSeleccionados;
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
	
	public void generarReporteTipoPago_NMsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoPago_NMsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoPago_NMsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPago_NMsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPago_NMsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoPago_NMsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Pago_ N M",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoPago_NMsSeleccionados() throws Exception {
		ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();		
		
		tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoPago_NMs("Todos",tipopago_nmsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoPago_NMsSeleccionados() throws Exception {
		ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();		
		
		tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoPago_NMs("Todos",tipopago_nmsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoPago_NMsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();
		
		tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoPago_NMs("Todos",tipopago_nmsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoPago_NMsSeleccionados() throws Exception {
		ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoPago_NM();
		
		
		tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoPago_NM();
		
		
		//this.generarReporteTipoPago_NMs("Todos",tipopago_nmsSeleccionados ,tipopago_nmImplementable,tipopago_nmImplementableHome);
	}
	
	public void mostrarImportacionTipoPago_NMs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoPago_NM();
		
		this.abrirFrameImportacionTipoPago_NM();		
		
			
		//this.generarReporteTipoPago_NMs("Todos",tipopago_nmsSeleccionados ,tipopago_nmImplementable,tipopago_nmImplementableHome);
	}
	
	public void importarTipoPago_NMs() throws Exception {		
	
	}
	
	public void exportarTipoPago_NMsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoPago_NMsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoPago_NMsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoPago_NMsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Pago_ N M",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoPago_NMsSeleccionados() throws Exception {
		ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();		
		
		tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago_nm."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoPago_NM(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoPago_NM tipopago_nmAux:tipopago_nmsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoPago_NM(tipopago_nmAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipopago_nmAux.setsDetalleGeneralEntityReporte(tipopago_nmAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoPago_NM(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoPago_NMConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPago_NMConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPago_NMConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPago_NMConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoPago_NM(TipoPago_NM tipopago_nm,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipopago_nm.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopago_nm.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopago_nm.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopago_nm.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipopago_nm.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoPago_NMsSeleccionados() throws Exception {
		ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();		
		
		tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago_nm.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoPago_NMs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoPago_NM(row);				
				iRow++;
			}				
			
			for(TipoPago_NM tipopago_nmAux:tipopago_nmsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoPago_NM(tipopago_nmAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoPago_NMsSeleccionados() throws Exception {
		ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();		
		
		tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipopago_nm.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipopago_nms");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipopago_nm");
			//elementRoot.appendChild(element);
		
			for(TipoPago_NM tipopago_nmAux:tipopago_nmsSeleccionados) {
				element = document.createElement("tipopago_nm");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoPago_NM(tipopago_nmAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Pago_ N M",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoPago_NM(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPago_NMConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPago_NMConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPago_NMConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPago_NMConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoPago_NM(TipoPago_NM tipopago_nm,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipopago_nm.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipopago_nm.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipopago_nm.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipopago_nm.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoPago_NM(TipoPago_NM tipopago_nm,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoPago_NMConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipopago_nm.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoPago_NMConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipopago_nm.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoPago_NMConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipopago_nm.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoPago_NMConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipopago_nm.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoPago_NMConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipopago_nm.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoPago_NMsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoPago_NM> tipopago_nmsSeleccionados=new ArrayList<TipoPago_NM>();
		
		tipopago_nmsSeleccionados=this.getTipoPago_NMsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoPago_NM(tipopago_nmsSeleccionados);
		
		this.generarReporteTipoPago_NMs("Todos",tipopago_nmsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoPago_NM(ArrayList<TipoPago_NM> tipopago_nmsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoPago_NM tipopago_nmAux:tipopago_nmsSeleccionados) {
				tipopago_nmAux.setsDetalleGeneralEntityReporte(tipopago_nmAux.toString());
			
				if(sTipoSeleccionar.equals(TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipopago_nmAux.setsDescripcionGeneralEntityReporte1(tipopago_nmAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoPago_NMConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipopago_nmAux.setsDescripcionGeneralEntityReporte1(tipopago_nmAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoPago_NMConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipopago_nmAux.setsDescripcionGeneralEntityReporte1(tipopago_nmAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPago_NMConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoPago_NM(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoPago_NM=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=true;
				this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=true;
			}
			
			this.isVisibilidadCeldaModificarTipoPago_NM=false;
			this.isVisibilidadCeldaActualizarTipoPago_NM=false;
			this.isVisibilidadCeldaEliminarTipoPago_NM=false;
			this.isVisibilidadCeldaCancelarTipoPago_NM=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago_NM=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoPago_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=false;
			this.isVisibilidadCeldaModificarTipoPago_NM=false;
			this.isVisibilidadCeldaActualizarTipoPago_NM=true;
			this.isVisibilidadCeldaEliminarTipoPago_NM=false;
			this.isVisibilidadCeldaCancelarTipoPago_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago_NM=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoPago_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=false;
			this.isVisibilidadCeldaModificarTipoPago_NM=false;
			this.isVisibilidadCeldaActualizarTipoPago_NM=true;
			this.isVisibilidadCeldaEliminarTipoPago_NM=true;
			this.isVisibilidadCeldaCancelarTipoPago_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago_NM=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoPago_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=false;
			this.isVisibilidadCeldaModificarTipoPago_NM=false;
			this.isVisibilidadCeldaActualizarTipoPago_NM=true;
			this.isVisibilidadCeldaEliminarTipoPago_NM=false;
			this.isVisibilidadCeldaCancelarTipoPago_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago_NM=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago_NM=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoPago_NM=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=true;
			this.isVisibilidadCeldaModificarTipoPago_NM=false;
			this.isVisibilidadCeldaActualizarTipoPago_NM=false;
			this.isVisibilidadCeldaEliminarTipoPago_NM=false;
			this.isVisibilidadCeldaCancelarTipoPago_NM=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago_NM=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago_NM=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoPago_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=false;
			this.isVisibilidadCeldaActualizarTipoPago_NM=false;
			this.isVisibilidadCeldaEliminarTipoPago_NM=false;
			this.isVisibilidadCeldaCancelarTipoPago_NM=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago_NM=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago_NM=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoPago_NM=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=false;
			this.isVisibilidadCeldaModificarTipoPago_NM=true;
			this.isVisibilidadCeldaActualizarTipoPago_NM=false;
			this.isVisibilidadCeldaEliminarTipoPago_NM=false;
			this.isVisibilidadCeldaCancelarTipoPago_NM=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPago_NM=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPago_NM=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoPago_NMJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoPago_NM=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=true;
		} else {
			this.actualizarEstadoPanelsTipoPago_NM(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoPago_NM=false;
			//this.isVisibilidadCeldaVerFormTipoPago_NM=false;
			this.isVisibilidadCeldaDuplicarTipoPago_NM=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipopago_nmSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoPago_NM=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipopago_nmSessionBean.getEsGuardarRelacionado()) {
			if(!tipopago_nmSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=false;												
			}
			
			this.jButtonCerrarTipoPago_NM.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPago_NM=false;
		}
		
		if(!this.permiteMantenimiento(this.tipopago_nm)) {
			this.isVisibilidadCeldaActualizarTipoPago_NM=false;
			this.isVisibilidadCeldaEliminarTipoPago_NM=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPago_NM() {
		this.isVisibilidadCeldaNuevoTipoPago_NM=false;
		this.isVisibilidadCeldaGuardarCambiosTipoPago_NM=false;
	}
	
	public void actualizarEstadoPanelsTipoPago_NM(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoPago_NM!=null) {
				this.jScrollPanelDatosEdicionTipoPago_NM.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago_NM!=null) {
				this.jTabbedPaneBusquedasTipoPago_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago_NM!=null) {
				this.jScrollPanelDatosTipoPago_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPago_NM!=null) {
				this.jPanelPaginacionTipoPago_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPago_NM!=null) {
				this.jPanelParametrosReportesTipoPago_NM.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoPago_NM!=null) {
				this.jScrollPanelDatosEdicionTipoPago_NM.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago_NM!=null) {
				this.jTabbedPaneBusquedasTipoPago_NM.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoPago_NM!=null) {
				this.jScrollPanelDatosTipoPago_NM.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPago_NM!=null) {
				this.jPanelPaginacionTipoPago_NM.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPago_NM!=null) {
				this.jPanelParametrosReportesTipoPago_NM.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoPago_NM!=null) {
				this.jScrollPanelDatosEdicionTipoPago_NM.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago_NM!=null) {
				this.jTabbedPaneBusquedasTipoPago_NM.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago_NM!=null) {
				this.jScrollPanelDatosTipoPago_NM.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPago_NM!=null) {
				this.jPanelPaginacionTipoPago_NM.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPago_NM!=null) {
				this.jPanelParametrosReportesTipoPago_NM.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoPago_NM!=null) {
				this.jScrollPanelDatosEdicionTipoPago_NM.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago_NM!=null) {
				this.jTabbedPaneBusquedasTipoPago_NM.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago_NM!=null) {
				this.jScrollPanelDatosTipoPago_NM.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPago_NM!=null) {
				this.jPanelPaginacionTipoPago_NM.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPago_NM!=null) {
				this.jPanelParametrosReportesTipoPago_NM.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoPago_NM!=null) {
				this.jScrollPanelDatosEdicionTipoPago_NM.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago_NM!=null) {
				this.jTabbedPaneBusquedasTipoPago_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago_NM!=null) {
				this.jScrollPanelDatosTipoPago_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPago_NM!=null) {
				this.jPanelPaginacionTipoPago_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPago_NM!=null) {
				this.jPanelParametrosReportesTipoPago_NM.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoPago_NM!=null) {
				this.jScrollPanelDatosEdicionTipoPago_NM.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago_NM!=null) {
				this.jTabbedPaneBusquedasTipoPago_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago_NM!=null) {
				this.jScrollPanelDatosTipoPago_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPago_NM!=null) {
				this.jPanelPaginacionTipoPago_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPago_NM!=null) {
				this.jPanelParametrosReportesTipoPago_NM.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoPago_NM!=null) {
				this.jScrollPanelDatosEdicionTipoPago_NM.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago_NM!=null) {
				this.jTabbedPaneBusquedasTipoPago_NM.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPago_NM!=null) {
				this.jScrollPanelDatosTipoPago_NM.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPago_NM!=null) {
				this.jPanelPaginacionTipoPago_NM.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPago_NM!=null) {
				this.jPanelParametrosReportesTipoPago_NM.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoPago_NM!=null) {
					this.jTabbedPaneBusquedasTipoPago_NM.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoPago_NM!=null) {
				this.jPanelParametrosReportesTipoPago_NM.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPago_NM!=null) {
				this.jTabbedPaneBusquedasTipoPago_NM.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoPago_NM!=null) {
				this.jPanelParametrosReportesTipoPago_NM.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoPago_NMParaEstructuras() throws Exception {
		Boolean isPaginaPopupEstructura=false;

		try {

			if(this.tipopago_nmSessionBean==null) {
				this.tipopago_nmSessionBean=new TipoPago_NMSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoPago_NM.estructuraSessionBean==null) {
				this.jInternalFrameDetalleFormTipoPago_NM.estructuraSessionBean=new EstructuraSessionBean();
			}

			this.jInternalFrameDetalleFormTipoPago_NM.estructuraSessionBean.setsPathNavegacionActual(tipopago_nmSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EstructuraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoPago_NM.estructuraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEstructura=this.jInternalFrameDetalleFormTipoPago_NM.estructuraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoPago_NM.estructuraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEstructura(true);
			this.jInternalFrameDetalleFormTipoPago_NM.estructuraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEstructura(TipoPago_NMConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoPago_NM.estructuraSessionBean.setisBusquedaDesdeForeignKeySesionTipoPago_NM(true);
			this.jInternalFrameDetalleFormTipoPago_NM.estructuraSessionBean.setlidTipoPago_NMActual(this.idTipoPago_NMActual);

			tipopago_nmSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NM(true);
			tipopago_nmSessionBean.setlIdTipoPago_NMActualForeignKey(this.idTipoPago_NMActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoPago_NMParaCargos() throws Exception {
		Boolean isPaginaPopupCargo=false;

		try {

			if(this.tipopago_nmSessionBean==null) {
				this.tipopago_nmSessionBean=new TipoPago_NMSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoPago_NM.cargoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoPago_NM.cargoSessionBean=new CargoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoPago_NM.cargoSessionBean.setsPathNavegacionActual(tipopago_nmSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CargoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoPago_NM.cargoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCargo=this.jInternalFrameDetalleFormTipoPago_NM.cargoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoPago_NM.cargoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCargo(true);
			this.jInternalFrameDetalleFormTipoPago_NM.cargoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargo(TipoPago_NMConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoPago_NM.cargoSessionBean.setisBusquedaDesdeForeignKeySesionTipoPago_NM(true);
			this.jInternalFrameDetalleFormTipoPago_NM.cargoSessionBean.setlidTipoPago_NMActual(this.idTipoPago_NMActual);

			tipopago_nmSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoPago_NM(true);
			tipopago_nmSessionBean.setlIdTipoPago_NMActualForeignKey(this.idTipoPago_NMActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoPago_NMSessionBean tipopago_nmSessionBean=new TipoPago_NMSessionBean();
		
		if(this.tipopago_nmSessionBean==null) {
			this.tipopago_nmSessionBean=new TipoPago_NMSessionBean();
		}
		
		this.tipopago_nmSessionBean.setsUltimaBusquedaTipoPago_NM(this.getsAccionBusqueda());
		this.tipopago_nmSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipopago_nmSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipopago_nmSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoPago_NMSessionBean tipopago_nmSessionBean=new TipoPago_NMSessionBean();
		
		if(this.tipopago_nmSessionBean==null) {
			this.tipopago_nmSessionBean=new TipoPago_NMSessionBean();
		}
		
		if(this.tipopago_nmSessionBean.getsUltimaBusquedaTipoPago_NM()!=null&&!this.tipopago_nmSessionBean.getsUltimaBusquedaTipoPago_NM().equals("")) {
			this.setsAccionBusqueda(tipopago_nmSessionBean.getsUltimaBusquedaTipoPago_NM());
			this.setiNumeroPaginacion(tipopago_nmSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipopago_nmSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipopago_nmSessionBean.getid_empresa());
				tipopago_nmSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipopago_nmSessionBean.setsUltimaBusquedaTipoPago_NM("");
		this.tipopago_nmSessionBean.setiNumeroPaginacion(TipoPago_NMConstantesFunciones.INUMEROPAGINACION);
		this.tipopago_nmSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoPago_NM(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoPago_NM() {
		this.updateBorderResaltarBusquedasFormularioTipoPago_NM();
		this.updateVisibilidadBusquedasFormularioTipoPago_NM();
		this.updateHabilitarBusquedasFormularioTipoPago_NM();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoPago_NM() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoPago_NM.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoPago_NM() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoPago_NM.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoPago_NM() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoPago_NM.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoPago_NM(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoPago_NM.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoPago_NM() throws Exception {

		if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoPago_NM();
		this.updateVisibilidadResaltarControlesFormularioTipoPago_NM();
		this.updateHabilitarResaltarControlesFormularioTipoPago_NM();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoPago_NM() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipopago_nmConstantesFunciones.resaltaridTipoPago_NM!=null && this.jInternalFrameDetalleFormTipoPago_NM!=null) {this.jInternalFrameDetalleFormTipoPago_NM.jLabelidTipoPago_NM.setBorder(this.tipopago_nmConstantesFunciones.resaltaridTipoPago_NM);}
		if(this.tipopago_nmConstantesFunciones.resaltarid_empresaTipoPago_NM!=null && this.jInternalFrameDetalleFormTipoPago_NM!=null) {this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.setBorder(this.tipopago_nmConstantesFunciones.resaltarid_empresaTipoPago_NM);}
		if(this.tipopago_nmConstantesFunciones.resaltarcodigoTipoPago_NM!=null && this.jInternalFrameDetalleFormTipoPago_NM!=null) {this.jInternalFrameDetalleFormTipoPago_NM.jTextFieldcodigoTipoPago_NM.setBorder(this.tipopago_nmConstantesFunciones.resaltarcodigoTipoPago_NM);}
		if(this.tipopago_nmConstantesFunciones.resaltarnombreTipoPago_NM!=null && this.jInternalFrameDetalleFormTipoPago_NM!=null) {this.jInternalFrameDetalleFormTipoPago_NM.jTextAreanombreTipoPago_NM.setBorder(this.tipopago_nmConstantesFunciones.resaltarnombreTipoPago_NM);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoPago_NM() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
	
		//this.jInternalFrameDetalleFormTipoPago_NM.jLabelidTipoPago_NM.setVisible(this.tipopago_nmConstantesFunciones.mostraridTipoPago_NM);
		this.jInternalFrameDetalleFormTipoPago_NM.jPanelidTipoPago_NM.setVisible(this.tipopago_nmConstantesFunciones.mostraridTipoPago_NM);
		//this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.setVisible(this.tipopago_nmConstantesFunciones.mostrarid_empresaTipoPago_NM);
		this.jInternalFrameDetalleFormTipoPago_NM.jPanelid_empresaTipoPago_NM.setVisible(this.tipopago_nmConstantesFunciones.mostrarid_empresaTipoPago_NM);
		//this.jInternalFrameDetalleFormTipoPago_NM.jTextFieldcodigoTipoPago_NM.setVisible(this.tipopago_nmConstantesFunciones.mostrarcodigoTipoPago_NM);
		this.jInternalFrameDetalleFormTipoPago_NM.jPanelcodigoTipoPago_NM.setVisible(this.tipopago_nmConstantesFunciones.mostrarcodigoTipoPago_NM);
		//this.jInternalFrameDetalleFormTipoPago_NM.jTextAreanombreTipoPago_NM.setVisible(this.tipopago_nmConstantesFunciones.mostrarnombreTipoPago_NM);
		this.jInternalFrameDetalleFormTipoPago_NM.jPanelnombreTipoPago_NM.setVisible(this.tipopago_nmConstantesFunciones.mostrarnombreTipoPago_NM);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoPago_NM() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPago_NM==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPago_NM!=null) {
	
		this.jInternalFrameDetalleFormTipoPago_NM.jLabelidTipoPago_NM.setEnabled(this.tipopago_nmConstantesFunciones.activaridTipoPago_NM);
		this.jInternalFrameDetalleFormTipoPago_NM.jComboBoxid_empresaTipoPago_NM.setEnabled(this.tipopago_nmConstantesFunciones.activarid_empresaTipoPago_NM);
		this.jInternalFrameDetalleFormTipoPago_NM.jTextFieldcodigoTipoPago_NM.setEnabled(this.tipopago_nmConstantesFunciones.activarcodigoTipoPago_NM);
		this.jInternalFrameDetalleFormTipoPago_NM.jTextAreanombreTipoPago_NM.setEnabled(this.tipopago_nmConstantesFunciones.activarnombreTipoPago_NM);
		}
	}
	
		
}