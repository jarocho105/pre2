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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.TipoCuentaBancoGeneralConstantesFunciones;
import com.bydan.erp.tesoreria.util.TipoCuentaBancoGeneralParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TipoCuentaBancoGeneralParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TipoCuentaBancoGeneralBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
public class TipoCuentaBancoGeneralBeanSwingJInternalFrame extends TipoCuentaBancoGeneralJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCuentaBancoGeneralBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCuentaBancoGeneral> tipocuentabancogeneralValidator = new ClassValidator<TipoCuentaBancoGeneral>(TipoCuentaBancoGeneral.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCuentaBancoGeneral tipocuentabancogeneral;	
	public TipoCuentaBancoGeneral tipocuentabancogeneralAux;
	public TipoCuentaBancoGeneral tipocuentabancogeneralAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCuentaBancoGeneral tipocuentabancogeneralTotales;
	public Long idTipoCuentaBancoGeneralActual;
	public Long iIdNuevoTipoCuentaBancoGeneral=0L;
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

	public String sFinalQueryComboBanco="";

	public List<Banco> bancosForeignKey;

	public List<Banco> getbancosForeignKey() {
		return bancosForeignKey;
	}

	public void setbancosForeignKey(List<Banco> bancosForeignKey) {
		this.bancosForeignKey = bancosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Banco bancoForeignKey;

	public Banco getbancoForeignKey() {
		return bancoForeignKey;
	}

	public void setbancoForeignKey(Banco bancoForeignKey) {
		this.bancoForeignKey = bancoForeignKey;
	}

	public String sFinalQueryComboTipoCuentaBanco="";

	public List<TipoCuentaBanco> tipocuentabancosForeignKey;

	public List<TipoCuentaBanco> gettipocuentabancosForeignKey() {
		return tipocuentabancosForeignKey;
	}

	public void settipocuentabancosForeignKey(List<TipoCuentaBanco> tipocuentabancosForeignKey) {
		this.tipocuentabancosForeignKey = tipocuentabancosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCuentaBanco tipocuentabancoForeignKey;

	public TipoCuentaBanco gettipocuentabancoForeignKey() {
		return tipocuentabancoForeignKey;
	}

	public void settipocuentabancoForeignKey(TipoCuentaBanco tipocuentabancoForeignKey) {
		this.tipocuentabancoForeignKey = tipocuentabancoForeignKey;
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
	
	public Boolean isPermisoTodoTipoCuentaBancoGeneral;
	public Boolean isPermisoNuevoTipoCuentaBancoGeneral;
	public Boolean isPermisoActualizarTipoCuentaBancoGeneral;
	public Boolean isPermisoActualizarOriginalTipoCuentaBancoGeneral;
	public Boolean isPermisoEliminarTipoCuentaBancoGeneral;
	public Boolean isPermisoGuardarCambiosTipoCuentaBancoGeneral;
	public Boolean isPermisoConsultaTipoCuentaBancoGeneral;
	public Boolean isPermisoBusquedaTipoCuentaBancoGeneral;
	public Boolean isPermisoReporteTipoCuentaBancoGeneral;
	public Boolean isPermisoPaginacionMedioTipoCuentaBancoGeneral;
	public Boolean isPermisoPaginacionAltoTipoCuentaBancoGeneral;
	public Boolean isPermisoPaginacionTodoTipoCuentaBancoGeneral;
	public Boolean isPermisoCopiarTipoCuentaBancoGeneral;
	public Boolean isPermisoVerFormTipoCuentaBancoGeneral;
	public Boolean isPermisoDuplicarTipoCuentaBancoGeneral;
	public Boolean isPermisoOrdenTipoCuentaBancoGeneral;
	
	
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
	
	public TipoCuentaBancoGeneralParameterReturnGeneral tipocuentabancogeneralReturnGeneral;
	public TipoCuentaBancoGeneralParameterReturnGeneral tipocuentabancogeneralParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCuentaBancoGeneral=false;
	public Boolean esParaAccionDesdeFormularioTipoCuentaBancoGeneral=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoCuentaBancoGeneralSessionBeanAdditional tipocuentabancogeneralSessionBeanAdditional=null;
	
	public TipoCuentaBancoGeneralSessionBeanAdditional getTipoCuentaBancoGeneralSessionBeanAdditional() {
		return this.tipocuentabancogeneralSessionBeanAdditional;
	}
	
	public void setTipoCuentaBancoGeneralSessionBeanAdditional(TipoCuentaBancoGeneralSessionBeanAdditional tipocuentabancogeneralSessionBeanAdditional) {
		try {
			this.tipocuentabancogeneralSessionBeanAdditional=tipocuentabancogeneralSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional tipocuentabancogeneralBeanSwingJInternalFrameAdditional=null;
	//public class TipoCuentaBancoGeneralBeanSwingJInternalFrame
	
	public TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional getTipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional() {
		return this.tipocuentabancogeneralBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional(TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional tipocuentabancogeneralBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocuentabancogeneralBeanSwingJInternalFrameAdditional=tipocuentabancogeneralBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCuentaBancoGeneralLogic tipocuentabancogeneralLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCuentaBancoGeneral tipocuentabancogeneralBean;
	public TipoCuentaBancoGeneralConstantesFunciones tipocuentabancogeneralConstantesFunciones;
	//public TipoCuentaBancoGeneralParameterReturnGeneral tipocuentabancogeneralReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public BancoLogic bancoLogic;
	public TipoCuentaBancoLogic tipocuentabancoLogic;
	
	//PARAMETROS
	
	
	//public List<TipoCuentaBancoGeneral> tipocuentabancogenerals;	
	//public List<TipoCuentaBancoGeneral> tipocuentabancogeneralsEliminados;
	//public List<TipoCuentaBancoGeneral> tipocuentabancogeneralsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCuentaBancoGeneral=true;
	public Boolean isVisibilidadCeldaCopiarTipoCuentaBancoGeneral=true;
	public Boolean isVisibilidadCeldaVerFormTipoCuentaBancoGeneral=true;
	public Boolean isVisibilidadCeldaOrdenTipoCuentaBancoGeneral=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=false;
	public Boolean isVisibilidadCeldaModificarTipoCuentaBancoGeneral=false;
	public Boolean isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=false;
	public Boolean isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=false;
	public Boolean isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=false;
	public Boolean isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=false;	
	
	
	public Boolean isVisibilidadFK_IdBanco=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoCuentaBanco=false;
	
	public Long getiIdNuevoTipoCuentaBancoGeneral() {
		return this.iIdNuevoTipoCuentaBancoGeneral;
	}

	public void setiIdNuevoTipoCuentaBancoGeneral(Long iIdNuevoTipoCuentaBancoGeneral) {
		this.iIdNuevoTipoCuentaBancoGeneral = iIdNuevoTipoCuentaBancoGeneral;
	}
	
	public Long getidTipoCuentaBancoGeneralActual() {
		return this.idTipoCuentaBancoGeneralActual;
	}

	public void setidTipoCuentaBancoGeneralActual(Long idTipoCuentaBancoGeneralActual) {
		this.idTipoCuentaBancoGeneralActual = idTipoCuentaBancoGeneralActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCuentaBancoGeneral gettipocuentabancogeneral() {
		return this.tipocuentabancogeneral;
	}

	public void settipocuentabancogeneral(TipoCuentaBancoGeneral tipocuentabancogeneral) {
		this.tipocuentabancogeneral = tipocuentabancogeneral;
	}
	
	public TipoCuentaBancoGeneral gettipocuentabancogeneralAux() {
		return this.tipocuentabancogeneralAux;
	}

	public void settipocuentabancogeneralAux(TipoCuentaBancoGeneral tipocuentabancogeneralAux) {
		this.tipocuentabancogeneralAux = tipocuentabancogeneralAux;
	}				
	
	public TipoCuentaBancoGeneral gettipocuentabancogeneralAnterior() {
		return this.tipocuentabancogeneralAnterior;
	}

	public void settipocuentabancogeneralAnterior(TipoCuentaBancoGeneral tipocuentabancogeneralAnterior) {
		this.tipocuentabancogeneralAnterior = tipocuentabancogeneralAnterior;
	}	
	
	public TipoCuentaBancoGeneral gettipocuentabancogeneralTotales() {
		return this.tipocuentabancogeneralTotales;
	}

	public void settipocuentabancogeneralTotales(TipoCuentaBancoGeneral tipocuentabancogeneralTotales) {
		this.tipocuentabancogeneralTotales = tipocuentabancogeneralTotales;
	}	
	
	public TipoCuentaBancoGeneral gettipocuentabancogeneralBean() {
		return this.tipocuentabancogeneralBean;
	}

	public void settipocuentabancogeneralBean(TipoCuentaBancoGeneral tipocuentabancogeneralBean) {
		this.tipocuentabancogeneralBean = tipocuentabancogeneralBean;
	}	
	
	public TipoCuentaBancoGeneralParameterReturnGeneral gettipocuentabancogeneralReturnGeneral() {
		return this.tipocuentabancogeneralReturnGeneral;
	}

	public void settipocuentabancogeneralReturnGeneral(TipoCuentaBancoGeneralParameterReturnGeneral tipocuentabancogeneralReturnGeneral) {
		this.tipocuentabancogeneralReturnGeneral = tipocuentabancogeneralReturnGeneral;
	}	
	
	
	public Long id_bancoFK_IdBanco=-1L;

	public Long getid_bancoFK_IdBanco() {
		return this.id_bancoFK_IdBanco;
	}

	public void setid_bancoFK_IdBanco(Long id_bancoFK_IdBanco) {
		this.id_bancoFK_IdBanco = id_bancoFK_IdBanco;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_cuenta_bancoFK_IdTipoCuentaBanco=-1L;

	public Long getid_tipo_cuenta_bancoFK_IdTipoCuentaBanco() {
		return this.id_tipo_cuenta_bancoFK_IdTipoCuentaBanco;
	}

	public void setid_tipo_cuenta_bancoFK_IdTipoCuentaBanco(Long id_tipo_cuenta_bancoFK_IdTipoCuentaBanco) {
		this.id_tipo_cuenta_bancoFK_IdTipoCuentaBanco = id_tipo_cuenta_bancoFK_IdTipoCuentaBanco;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCuentaBancoGeneralLogic getTipoCuentaBancoGeneralLogic()	{		
		return tipocuentabancogeneralLogic;
	}

	public void setTipoCuentaBancoGeneralLogic(TipoCuentaBancoGeneralLogic tipocuentabancogeneralLogic) {
		this.tipocuentabancogeneralLogic = tipocuentabancogeneralLogic;
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
	
	public Boolean getIsEsNuevoTipoCuentaBancoGeneral() {
		return isEsNuevoTipoCuentaBancoGeneral;
	}

	public void setIsEsNuevoTipoCuentaBancoGeneral(Boolean isEsNuevoTipoCuentaBancoGeneral) {
		this.isEsNuevoTipoCuentaBancoGeneral = isEsNuevoTipoCuentaBancoGeneral;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCuentaBancoGeneral() {
		return esParaAccionDesdeFormularioTipoCuentaBancoGeneral;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCuentaBancoGeneral(Boolean esParaAccionDesdeFormularioTipoCuentaBancoGeneral) {
		this.esParaAccionDesdeFormularioTipoCuentaBancoGeneral = esParaAccionDesdeFormularioTipoCuentaBancoGeneral;
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

			if(this.tipocuentabancogeneralSessionBean==null) {
				this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
			}

			if(!this.tipocuentabancogeneralSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocuentabancogeneralSessionBean.getlidEmpresaActual());
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

	public void cargarCombosBancosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bancosForeignKey=new ArrayList<Banco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BancoLogic bancoLogic=new BancoLogic();

			//bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

			if(this.tipocuentabancogeneralSessionBean==null) {
				this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
			}

			if(!this.tipocuentabancogeneralSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

					bancoLogic.getTodosBancosWithConnection(sFinalQuery,new Pagination());

					this.bancosForeignKey=bancoLogic.getBancos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBanco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getEntityWithConnection(tipocuentabancogeneralSessionBean.getlidBancoActual());
					this.bancosForeignKey.add(bancoLogic.getBanco());
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

	public void cargarCombosTipoCuentaBancosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocuentabancosForeignKey=new ArrayList<TipoCuentaBanco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCuentaBancoLogic tipocuentabancoLogic=new TipoCuentaBancoLogic();

			//tipocuentabancoLogic.getTipoCuentaBancoDataAccess().setIsForForeingKeyData(true);

			if(this.tipocuentabancogeneralSessionBean==null) {
				this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
			}

			if(!this.tipocuentabancogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipocuentabancoLogic.getTipoCuentaBancoDataAccess().setIsForForeingKeyData(true);

					tipocuentabancoLogic.getTodosTipoCuentaBancosWithConnection(sFinalQuery,new Pagination());

					this.tipocuentabancosForeignKey=tipocuentabancoLogic.getTipoCuentaBancos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCuentaBanco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancoLogic.getEntityWithConnection(tipocuentabancogeneralSessionBean.getlidTipoCuentaBancoActual());
					this.tipocuentabancosForeignKey.add(tipocuentabancoLogic.getTipoCuentaBanco());
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

					if(this.tipocuentabancogeneral!=null) {
						this.tipocuentabancogeneral.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
						this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoCuentaBancoGeneral.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoCuentaBancoGeneralGenerico)throws Exception
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
				jComboBoxid_empresaTipoCuentaBancoGeneralGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoCuentaBancoGeneralGenerico!=null && jComboBoxid_empresaTipoCuentaBancoGeneralGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoCuentaBancoGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBancoForeignKey(Long idBancoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bancoTemp!=null) {

					if(this.tipocuentabancogeneral!=null) {
						this.tipocuentabancogeneral.setBanco(bancoTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
						this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.setSelectedItem(bancoTemp);
					}
				} else {
					//jComboBoxid_bancoTipoCuentaBancoGeneral.setSelectedItem(bancoTemp);
					if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBanco") || sFormularioTipoBusqueda.equals("Todos")){
					if(bancoTemp!=null && jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral!=null) {
						jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.setSelectedItem(bancoTemp);
					} else {
						if(jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral!=null) {
							//jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.setSelectedItem(bancoTemp);
							if(jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.getItemCount()>0) {
								jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.setSelectedIndex(0);
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

	public String getActualBancoForeignKeyDescripcion(Long idBancoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}


			sDescripcion=BancoConstantesFunciones.getBancoDescripcion(bancoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBancoForeignKeyGenerico(Long idBancoSeleccionado,JComboBox jComboBoxid_bancoTipoCuentaBancoGeneralGenerico)throws Exception
	{
		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}

			if(bancoTemp!=null) {
				jComboBoxid_bancoTipoCuentaBancoGeneralGenerico.setSelectedItem(bancoTemp);
			} else {
				if(jComboBoxid_bancoTipoCuentaBancoGeneralGenerico!=null && jComboBoxid_bancoTipoCuentaBancoGeneralGenerico.getItemCount()>0) {
					jComboBoxid_bancoTipoCuentaBancoGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCuentaBancoForeignKey(Long idTipoCuentaBancoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCuentaBanco  tipocuentabancoTemp=null;

			for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosForeignKey) {
				if(tipocuentabancoAux.getId()!=null && tipocuentabancoAux.getId().equals(idTipoCuentaBancoSeleccionado)) {
					tipocuentabancoTemp=tipocuentabancoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocuentabancoTemp!=null) {

					if(this.tipocuentabancogeneral!=null) {
						this.tipocuentabancogeneral.setTipoCuentaBanco(tipocuentabancoTemp);
					}

					if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
						this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setSelectedItem(tipocuentabancoTemp);
					}
				} else {
					//jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setSelectedItem(tipocuentabancoTemp);
					if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoCuentaBanco") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocuentabancoTemp!=null && jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral!=null) {
						jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setSelectedItem(tipocuentabancoTemp);
					} else {
						if(jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral!=null) {
							//jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setSelectedItem(tipocuentabancoTemp);
							if(jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.getItemCount()>0) {
								jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setSelectedIndex(0);
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

	public String getActualTipoCuentaBancoForeignKeyDescripcion(Long idTipoCuentaBancoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCuentaBanco  tipocuentabancoTemp=null;

			for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosForeignKey) {
				if(tipocuentabancoAux.getId()!=null && tipocuentabancoAux.getId().equals(idTipoCuentaBancoSeleccionado)) {
					tipocuentabancoTemp=tipocuentabancoAux;
					break;
				}
			}


			sDescripcion=TipoCuentaBancoConstantesFunciones.getTipoCuentaBancoDescripcion(tipocuentabancoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCuentaBancoForeignKeyGenerico(Long idTipoCuentaBancoSeleccionado,JComboBox jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneralGenerico)throws Exception
	{
		try
		{
			TipoCuentaBanco  tipocuentabancoTemp=null;

			for(TipoCuentaBanco tipocuentabancoAux:tipocuentabancosForeignKey) {
				if(tipocuentabancoAux.getId()!=null && tipocuentabancoAux.getId().equals(idTipoCuentaBancoSeleccionado)) {
					tipocuentabancoTemp=tipocuentabancoAux;
					break;
				}
			}

			if(tipocuentabancoTemp!=null) {
				jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneralGenerico.setSelectedItem(tipocuentabancoTemp);
			} else {
				if(jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneralGenerico!=null && jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneralGenerico.getItemCount()>0) {
					jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoCuentaBancoGeneral tipocuentabancogeneral,JComboBox jComboBoxid_empresaTipoCuentaBancoGeneralGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoCuentaBancoGeneralGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoCuentaBancoGeneralGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocuentabancogeneral.setid_empresa(empresaAux.getId());
				tipocuentabancogeneral.setempresa_descripcion(TipoCuentaBancoGeneralConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocuentabancogeneral.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBancoForeignKey(TipoCuentaBancoGeneral tipocuentabancogeneral,JComboBox jComboBoxid_bancoTipoCuentaBancoGeneralGenerico)throws Exception
	{
		try
		{
			Banco  bancoAux=new Banco();

			if(jComboBoxid_bancoTipoCuentaBancoGeneralGenerico==null) {
				bancoAux=(Banco)this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.getSelectedItem();
			} else {
				bancoAux=(Banco)jComboBoxid_bancoTipoCuentaBancoGeneralGenerico.getSelectedItem();
			}

			if(bancoAux!=null && bancoAux.getId()!=null) {
				tipocuentabancogeneral.setid_banco(bancoAux.getId());
				tipocuentabancogeneral.setbanco_descripcion(TipoCuentaBancoGeneralConstantesFunciones.getBancoDescripcion(bancoAux));
				tipocuentabancogeneral.setBanco(bancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCuentaBancoForeignKey(TipoCuentaBancoGeneral tipocuentabancogeneral,JComboBox jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneralGenerico)throws Exception
	{
		try
		{
			TipoCuentaBanco  tipocuentabancoAux=new TipoCuentaBanco();

			if(jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneralGenerico==null) {
				tipocuentabancoAux=(TipoCuentaBanco)this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.getSelectedItem();
			} else {
				tipocuentabancoAux=(TipoCuentaBanco)jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneralGenerico.getSelectedItem();
			}

			if(tipocuentabancoAux!=null && tipocuentabancoAux.getId()!=null) {
				tipocuentabancogeneral.setid_tipo_cuenta_banco(tipocuentabancoAux.getId());
				tipocuentabancogeneral.settipocuentabanco_descripcion(TipoCuentaBancoGeneralConstantesFunciones.getTipoCuentaBancoDescripcion(tipocuentabancoAux));
				tipocuentabancogeneral.setTipoCuentaBanco(tipocuentabancoAux);			}
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

					if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { 
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { 
					}

					if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBancosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBanco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { 
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.addItem(banco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { 
					}

					if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBanco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.addItem(banco);
							}
						}

						if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCuentaBancosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCuentaBanco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { 
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.removeAllItems();

							for(TipoCuentaBanco tipocuentabanco:this.tipocuentabancosForeignKey) {
								this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.addItem(tipocuentabanco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { 
					}

					if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoCuentaBanco") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.removeAllItems();

							for(TipoCuentaBanco tipocuentabanco:this.tipocuentabancosForeignKey) {
								this.jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.addItem(tipocuentabanco);
							}
						}

						if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBancoForeignKey(Banco banco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.setSelectedItem(banco);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.setSelectedItem(banco);
						} else {
							this.jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoCuentaBancoForeignKey(TipoCuentaBanco tipocuentabanco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setSelectedItem(tipocuentabanco);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setSelectedItem(tipocuentabanco);
						} else {
							this.jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoCuentaBancoGeneral() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCuentaBancoGeneralConstantesFunciones.refrescarForeignKeysDescripcionesTipoCuentaBancoGeneral(this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCuentaBancoGeneralConstantesFunciones.refrescarForeignKeysDescripcionesTipoCuentaBancoGeneral(this.tipocuentabancogenerals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Banco.class));
		classes.add(new Classe(TipoCuentaBanco.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(this.tipocuentabancogenerals);
			tipocuentabancogeneralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCuentaBancoGeneralParameterReturnGeneral getTipoCuentaBancoGeneralParameterGeneral() {
		return this.tipocuentabancogeneralParameterGeneral;
	}
	
	public void setTipoCuentaBancoGeneralParameterGeneral(TipoCuentaBancoGeneralParameterReturnGeneral tipocuentabancogeneralParameterGeneral) {
		this.tipocuentabancogeneralParameterGeneral = tipocuentabancogeneralParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCuentaBancoGeneral() {
		return isPermisoTodoTipoCuentaBancoGeneral;
	}

	public void setIsPermisoTodoTipoCuentaBancoGeneral(Boolean isPermisoTodoTipoCuentaBancoGeneral) {
		this.isPermisoTodoTipoCuentaBancoGeneral = isPermisoTodoTipoCuentaBancoGeneral;
	}

	public Boolean getIsPermisoNuevoTipoCuentaBancoGeneral() {
		return isPermisoNuevoTipoCuentaBancoGeneral;
	}

	public void setIsPermisoNuevoTipoCuentaBancoGeneral(Boolean isPermisoNuevoTipoCuentaBancoGeneral) {
		this.isPermisoNuevoTipoCuentaBancoGeneral = isPermisoNuevoTipoCuentaBancoGeneral;
	}

	public Boolean getIsPermisoActualizarTipoCuentaBancoGeneral() {
		return isPermisoActualizarTipoCuentaBancoGeneral;
	}

	public void setIsPermisoActualizarTipoCuentaBancoGeneral(Boolean isPermisoActualizarTipoCuentaBancoGeneral) {
		this.isPermisoActualizarTipoCuentaBancoGeneral = isPermisoActualizarTipoCuentaBancoGeneral;
	}

	public Boolean getIsPermisoEliminarTipoCuentaBancoGeneral() {
		return isPermisoEliminarTipoCuentaBancoGeneral;
	}

	public void setIsPermisoEliminarTipoCuentaBancoGeneral(Boolean isPermisoEliminarTipoCuentaBancoGeneral) {
		this.isPermisoEliminarTipoCuentaBancoGeneral = isPermisoEliminarTipoCuentaBancoGeneral;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCuentaBancoGeneral() {
		return isPermisoGuardarCambiosTipoCuentaBancoGeneral;
	}

	public void setIsPermisoGuardarCambiosTipoCuentaBancoGeneral(Boolean isPermisoGuardarCambiosTipoCuentaBancoGeneral) {
		this.isPermisoGuardarCambiosTipoCuentaBancoGeneral = isPermisoGuardarCambiosTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsPermisoConsultaTipoCuentaBancoGeneral() {
		return isPermisoConsultaTipoCuentaBancoGeneral;
	}

	public void setIsPermisoConsultaTipoCuentaBancoGeneral(Boolean isPermisoConsultaTipoCuentaBancoGeneral) {
		this.isPermisoConsultaTipoCuentaBancoGeneral = isPermisoConsultaTipoCuentaBancoGeneral;
	}

	public Boolean getIsPermisoBusquedaTipoCuentaBancoGeneral() {
		return isPermisoBusquedaTipoCuentaBancoGeneral;
	}

	public void setIsPermisoBusquedaTipoCuentaBancoGeneral(Boolean isPermisoBusquedaTipoCuentaBancoGeneral) {
		this.isPermisoBusquedaTipoCuentaBancoGeneral = isPermisoBusquedaTipoCuentaBancoGeneral;
	}

	public Boolean getIsPermisoReporteTipoCuentaBancoGeneral() {
		return isPermisoReporteTipoCuentaBancoGeneral;
	}

	public void setIsPermisoReporteTipoCuentaBancoGeneral(Boolean isPermisoReporteTipoCuentaBancoGeneral) {
		this.isPermisoReporteTipoCuentaBancoGeneral = isPermisoReporteTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCuentaBancoGeneral() {
		return isPermisoPaginacionMedioTipoCuentaBancoGeneral;
	}

	public void setIsPermisoPaginacionMedioTipoCuentaBancoGeneral(Boolean isPermisoPaginacionMedioTipoCuentaBancoGeneral) {
		this.isPermisoPaginacionMedioTipoCuentaBancoGeneral = isPermisoPaginacionMedioTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCuentaBancoGeneral() {
		return isPermisoPaginacionTodoTipoCuentaBancoGeneral;
	}

	public void setIsPermisoPaginacionTodoTipoCuentaBancoGeneral(Boolean isPermisoPaginacionTodoTipoCuentaBancoGeneral) {
		this.isPermisoPaginacionTodoTipoCuentaBancoGeneral = isPermisoPaginacionTodoTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCuentaBancoGeneral() {
		return isPermisoPaginacionAltoTipoCuentaBancoGeneral;
	}

	public void setIsPermisoPaginacionAltoTipoCuentaBancoGeneral(Boolean isPermisoPaginacionAltoTipoCuentaBancoGeneral) {
		this.isPermisoPaginacionAltoTipoCuentaBancoGeneral = isPermisoPaginacionAltoTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsPermisoCopiarTipoCuentaBancoGeneral() {
		return isPermisoCopiarTipoCuentaBancoGeneral;
	}

	public void setIsPermisoCopiarTipoCuentaBancoGeneral(Boolean isPermisoCopiarTipoCuentaBancoGeneral) {
		this.isPermisoCopiarTipoCuentaBancoGeneral = isPermisoCopiarTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsPermisoVerFormTipoCuentaBancoGeneral() {
		return isPermisoVerFormTipoCuentaBancoGeneral;
	}

	public void setIsPermisoVerFormTipoCuentaBancoGeneral(Boolean isPermisoVerFormTipoCuentaBancoGeneral) {
		this.isPermisoVerFormTipoCuentaBancoGeneral = isPermisoVerFormTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsPermisoDuplicarTipoCuentaBancoGeneral() {
		return isPermisoDuplicarTipoCuentaBancoGeneral;
	}

	public void setIsPermisoDuplicarTipoCuentaBancoGeneral(Boolean isPermisoDuplicarTipoCuentaBancoGeneral) {
		this.isPermisoDuplicarTipoCuentaBancoGeneral = isPermisoDuplicarTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsPermisoOrdenTipoCuentaBancoGeneral() {
		return isPermisoOrdenTipoCuentaBancoGeneral;
	}

	public void setIsPermisoOrdenTipoCuentaBancoGeneral(Boolean isPermisoOrdenTipoCuentaBancoGeneral) {
		this.isPermisoOrdenTipoCuentaBancoGeneral = isPermisoOrdenTipoCuentaBancoGeneral;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaNuevoTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaNuevoTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaNuevoTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral = isVisibilidadCeldaNuevoTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaDuplicarTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaDuplicarTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaDuplicarTipoCuentaBancoGeneral = isVisibilidadCeldaDuplicarTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaCopiarTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaCopiarTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaCopiarTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaCopiarTipoCuentaBancoGeneral = isVisibilidadCeldaCopiarTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaVerFormTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaVerFormTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaVerFormTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaVerFormTipoCuentaBancoGeneral = isVisibilidadCeldaVerFormTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaOrdenTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaOrdenTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaOrdenTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaOrdenTipoCuentaBancoGeneral = isVisibilidadCeldaOrdenTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral = isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaModificarTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaModificarTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaModificarTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral = isVisibilidadCeldaModificarTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaActualizarTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaActualizarTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaActualizarTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral = isVisibilidadCeldaActualizarTipoCuentaBancoGeneral;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaEliminarTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaEliminarTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaEliminarTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral = isVisibilidadCeldaEliminarTipoCuentaBancoGeneral;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaCancelarTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaCancelarTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaCancelarTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral = isVisibilidadCeldaCancelarTipoCuentaBancoGeneral;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaGuardarTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaGuardarTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaGuardarTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral = isVisibilidadCeldaGuardarTipoCuentaBancoGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral() {
		return isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral(Boolean isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral) {
		this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral = isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral;
	}
		
	public TipoCuentaBancoGeneralSessionBean gettipocuentabancogeneralSessionBean() {
		return this.tipocuentabancogeneralSessionBean;
	}
	
	public void settipocuentabancogeneralSessionBean(TipoCuentaBancoGeneralSessionBean tipocuentabancogeneralSessionBean) {
		this.tipocuentabancogeneralSessionBean=tipocuentabancogeneralSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBanco() {
		return this.isVisibilidadFK_IdBanco;
	}

	public void setisVisibilidadFK_IdBanco(Boolean isVisibilidadFK_IdBanco) {
		this.isVisibilidadFK_IdBanco=isVisibilidadFK_IdBanco;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoCuentaBanco() {
		return this.isVisibilidadFK_IdTipoCuentaBanco;
	}

	public void setisVisibilidadFK_IdTipoCuentaBanco(Boolean isVisibilidadFK_IdTipoCuentaBanco) {
		this.isVisibilidadFK_IdTipoCuentaBanco=isVisibilidadFK_IdTipoCuentaBanco;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocuentabancogeneral,null);
				this.setActualParaGuardarBancoForeignKey(tipocuentabancogeneral,null);
				this.setActualParaGuardarTipoCuentaBancoForeignKey(tipocuentabancogeneral,null);
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
	
	public void bugActualizarReferenciaActual(TipoCuentaBancoGeneral tipocuentabancogeneral,TipoCuentaBancoGeneral tipocuentabancogeneralAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCuentaBancoGeneral(tipocuentabancogeneral);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocuentabancogeneralAux.setId(tipocuentabancogeneral.getId());
		tipocuentabancogeneralAux.setVersionRow(tipocuentabancogeneral.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCuentaBancoGeneral();
		
			int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocuentabancogeneralValidator.getInvalidValues(this.tipocuentabancogeneral);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocuentabancogeneralLogic.setDatosCliente(datosCliente);
			tipocuentabancogeneralLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocuentabancogeneralAux=new  TipoCuentaBancoGeneral();
				
				tipocuentabancogeneralAux.setIsNew(true);
				tipocuentabancogeneralAux.setIsChanged(true);
				
				tipocuentabancogeneralAux.setTipoCuentaBancoGeneralOriginal(this.tipocuentabancogeneral);
				
				tipocuentabancogeneralAux.setId(this.tipocuentabancogeneral.getId());	
				tipocuentabancogeneralAux.setVersionRow(this.tipocuentabancogeneral.getVersionRow());	
				tipocuentabancogeneralAux.setid_empresa(this.tipocuentabancogeneral.getid_empresa());	
				tipocuentabancogeneralAux.setid_banco(this.tipocuentabancogeneral.getid_banco());	
				tipocuentabancogeneralAux.setid_tipo_cuenta_banco(this.tipocuentabancogeneral.getid_tipo_cuenta_banco());	
				tipocuentabancogeneralAux.setcodigo(this.tipocuentabancogeneral.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocuentabancogeneralAux,tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancogeneralAux,tipocuentabancogenerals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancogeneralLogic.saveTipoCuentaBancoGenerals();//WithConnection
						//tipocuentabancogeneralLogic.getSetVersionRowTipoCuentaBancoGenerals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocuentabancogeneral,tipocuentabancogeneralAux);
					
					this.refrescarForeignKeysDescripcionesTipoCuentaBancoGeneral();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuentabancogeneralLogic.saveTipoCuentaBancoGeneralRelaciones(tipocuentabancogeneralAux);//WithConnection
								//tipocuentabancogeneralLogic.getSetVersionRowTipoCuentaBancoGenerals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocuentabancogeneral,tipocuentabancogeneralAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocuentabancogeneralAux,tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocuentabancogeneralAux,tipocuentabancogenerals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocuentabancogeneral,tipocuentabancogeneralAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocuentabancogeneralAux=new  TipoCuentaBancoGeneral();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() && this.tipocuentabancogeneral.getId()>=0)) {
						
					tipocuentabancogeneralAux.setIsNew(false);
				}
				
				tipocuentabancogeneralAux.setIsDeleted(false);
			
				tipocuentabancogeneralAux.setId(this.tipocuentabancogeneral.getId());	
				tipocuentabancogeneralAux.setVersionRow(this.tipocuentabancogeneral.getVersionRow());	
				tipocuentabancogeneralAux.setid_empresa(this.tipocuentabancogeneral.getid_empresa());	
				tipocuentabancogeneralAux.setid_banco(this.tipocuentabancogeneral.getid_banco());	
				tipocuentabancogeneralAux.setid_tipo_cuenta_banco(this.tipocuentabancogeneral.getid_tipo_cuenta_banco());	
				tipocuentabancogeneralAux.setcodigo(this.tipocuentabancogeneral.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocuentabancogeneralAux,tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancogeneralAux,tipocuentabancogenerals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancogeneralLogic.saveTipoCuentaBancoGenerals();//WithConnection
						//tipocuentabancogeneralLogic.getSetVersionRowTipoCuentaBancoGenerals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocuentabancogeneral,tipocuentabancogeneralAux);
					
					this.refrescarForeignKeysDescripcionesTipoCuentaBancoGeneral();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuentabancogeneralLogic.saveTipoCuentaBancoGeneralRelaciones(tipocuentabancogeneralAux);//WithConnection
								//tipocuentabancogeneralLogic.getSetVersionRowTipoCuentaBancoGenerals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocuentabancogeneral,tipocuentabancogeneralAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocuentabancogeneralAux,tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocuentabancogeneralAux,tipocuentabancogenerals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocuentabancogeneral,tipocuentabancogeneralAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocuentabancogeneralAux=new  TipoCuentaBancoGeneral();
				
				tipocuentabancogeneralAux.setIsNew(false);
				tipocuentabancogeneralAux.setIsChanged(false);
				
				tipocuentabancogeneralAux.setIsDeleted(true);
				
				tipocuentabancogeneralAux.setId(this.tipocuentabancogeneral.getId());	
				tipocuentabancogeneralAux.setVersionRow(this.tipocuentabancogeneral.getVersionRow());	
				tipocuentabancogeneralAux.setid_empresa(this.tipocuentabancogeneral.getid_empresa());	
				tipocuentabancogeneralAux.setid_banco(this.tipocuentabancogeneral.getid_banco());	
				tipocuentabancogeneralAux.setid_tipo_cuenta_banco(this.tipocuentabancogeneral.getid_tipo_cuenta_banco());	
				tipocuentabancogeneralAux.setcodigo(this.tipocuentabancogeneral.getcodigo());	
				
				if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocuentabancogeneralAux.getId()>=0) {	
						this.tipocuentabancogeneralsEliminados.add(tipocuentabancogeneralAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocuentabancogeneralAux,tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancogeneralAux,tipocuentabancogenerals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancogeneralLogic.saveTipoCuentaBancoGenerals();//WithConnection
						//tipocuentabancogeneralLogic.getSetVersionRowTipoCuentaBancoGenerals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocuentabancogeneralLogic.saveTipoCuentaBancoGeneralRelaciones(tipocuentabancogeneralAux);//WithConnection
								//tipocuentabancogeneralLogic.getSetVersionRowTipoCuentaBancoGenerals();//WithConnection
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
							if(this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocuentabancogeneralAux,tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocuentabancogeneralAux,tipocuentabancogenerals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().addAll(this.tipocuentabancogeneralsEliminados);
					
					tipocuentabancogeneralLogic.saveTipoCuentaBancoGenerals();//WithConnection
					//tipocuentabancogeneralLogic.getSetVersionRowTipoCuentaBancoGenerals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoCuentaBancoGeneral();
				
				this.tipocuentabancogeneralsEliminados= new ArrayList<TipoCuentaBancoGeneral>();		
			}
			
			if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Cuenta Banco General GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuenta Banco General",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocuentabancogeneral=tipocuentabancogeneralAux;
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
      		//this.finishProcessTipoCuentaBancoGeneral();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCuentaBancoGeneral tipocuentabancogeneralLocal) throws Exception {
		
		if(this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCuentaBancoGeneral tipocuentabancogeneralLocal) throws Exception {	
		if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocuentabancogeneralLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BancoDetalleFormJInternalFrame.class)) {
				BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrameLocal=(BancoBeanSwingJInternalFrame) ((BancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBanco(bancoBeanSwingJInternalFrameLocal.getbanco(),true);
				bancoBeanSwingJInternalFrameLocal.actualizarLista(bancoBeanSwingJInternalFrameLocal.banco,this.bancosForeignKey);

				bancoBeanSwingJInternalFrameLocal.actualizarRelaciones(bancoBeanSwingJInternalFrameLocal.banco);

				tipocuentabancogeneralLocal.setBanco(bancoBeanSwingJInternalFrameLocal.banco);

				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey("Formulario");
				this.setActualBancoForeignKey(bancoBeanSwingJInternalFrameLocal.banco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCuentaBancoDetalleFormJInternalFrame.class)) {
				TipoCuentaBancoBeanSwingJInternalFrame tipocuentabancoBeanSwingJInternalFrameLocal=(TipoCuentaBancoBeanSwingJInternalFrame) ((TipoCuentaBancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocuentabancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCuentaBanco(tipocuentabancoBeanSwingJInternalFrameLocal.gettipocuentabanco(),true);
				tipocuentabancoBeanSwingJInternalFrameLocal.actualizarLista(tipocuentabancoBeanSwingJInternalFrameLocal.tipocuentabanco,this.tipocuentabancosForeignKey);

				tipocuentabancoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocuentabancoBeanSwingJInternalFrameLocal.tipocuentabanco);

				tipocuentabancogeneralLocal.setTipoCuentaBanco(tipocuentabancoBeanSwingJInternalFrameLocal.tipocuentabanco);

				this.addItemDefectoCombosForeignKeyTipoCuentaBanco();
				this.cargarCombosFrameTipoCuentaBancosForeignKey("Formulario");
				this.setActualTipoCuentaBancoForeignKey(tipocuentabancoBeanSwingJInternalFrameLocal.tipocuentabanco.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoCuentaBancoGeneralActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocuentabancogeneralValidator.getInvalidValues(this.tipocuentabancogeneral);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCuentaBancoGeneral tipocuentabancogeneral,List<TipoCuentaBancoGeneral> tipocuentabancogenerals) throws Exception {
		try	{		
			TipoCuentaBancoGeneralConstantesFunciones.actualizarLista(tipocuentabancogeneral,tipocuentabancogenerals,this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCuentaBancoGeneral tipocuentabancogeneral,List<TipoCuentaBancoGeneral> tipocuentabancogenerals) throws Exception {
		try	{			
			TipoCuentaBancoGeneralConstantesFunciones.actualizarSelectedLista(tipocuentabancogeneral,tipocuentabancogenerals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCuentaBancoGeneral> tipocuentabancogeneralsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocuentabancogeneralsLocal=this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocuentabancogeneralsLocal=this.tipocuentabancogenerals;
			}
			//ARCHITECTURE
		
			for(TipoCuentaBancoGeneral tipocuentabancogeneralLocal:tipocuentabancogeneralsLocal) {
				if(this.permiteMantenimiento(tipocuentabancogeneralLocal) && tipocuentabancogeneralLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCuentaBancoGeneralConstantesFunciones.getTipoCuentaBancoGeneralLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCuentaBancoGeneralConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelid_empresaTipoCuentaBancoGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCuentaBancoGeneralConstantesFunciones.IDBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelid_bancoTipoCuentaBancoGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCuentaBancoGeneralConstantesFunciones.IDTIPOCUENTABANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelid_tipo_cuenta_bancoTipoCuentaBancoGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCuentaBancoGeneralConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelcodigoTipoCuentaBancoGeneral,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelid_empresaTipoCuentaBancoGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelid_bancoTipoCuentaBancoGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelid_tipo_cuenta_bancoTipoCuentaBancoGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelcodigoTipoCuentaBancoGeneral,"");
		
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
		this.iIdNuevoTipoCuentaBancoGeneral--;	
		
		
		this.tipocuentabancogeneralAux=new TipoCuentaBancoGeneral();
		
		this.tipocuentabancogeneralAux.setId(this.iIdNuevoTipoCuentaBancoGeneral);
		this.tipocuentabancogeneralAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().add(this.tipocuentabancogeneralAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocuentabancogenerals.add(this.tipocuentabancogeneralAux);
		}
		//ARCHITECTURE
		
		this.tipocuentabancogeneral=this.tipocuentabancogeneralAux;
		
		if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
		}
				
		//this.setDefaultControlesTipoCuentaBancoGeneral();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCuentaBancoGeneral();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCuentaBancoGeneral();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaBancoGeneral();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneralBean,this.tipocuentabancogeneral,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
			classes=TipoCuentaBancoGeneralConstantesFunciones.getClassesRelationshipsOfTipoCuentaBancoGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocuentabancogeneralReturnGeneral=tipocuentabancogeneralLogic.procesarEventosTipoCuentaBancoGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals(),this.tipocuentabancogeneral,this.tipocuentabancogeneralParameterGeneral,this.isEsNuevoTipoCuentaBancoGeneral,classes);//this.tipocuentabancogeneralLogic.getTipoCuentaBancoGeneral()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCuentaBancoGeneral(this.tipocuentabancogeneralReturnGeneral,this.tipocuentabancogeneralBean,false);
		
		if(this.tipocuentabancogeneralReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBancoGeneral(this.tipocuentabancogeneralReturnGeneral.getTipoCuentaBancoGeneral());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCuentaBancoGeneral(this.tipocuentabancogeneralReturnGeneral.getTipoCuentaBancoGeneral());
		}
		
		if(this.tipocuentabancogeneralReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaBancoGeneral(this.tipocuentabancogeneralReturnGeneral.getTipoCuentaBancoGeneral(),classes);//this.tipocuentabancogeneralBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCuentaBancoGeneral();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCuentaBancoGeneral();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.RecargarFormTipoCuentaBancoGeneral(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
						
			if(tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaBancoGeneral();
			}
			
			this.actualizarVisualTableDatosTipoCuentaBancoGeneral();
			
			this.jTableDatosTipoCuentaBancoGeneral.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBancoGeneral(), this.getIndiceNuevoTipoCuentaBancoGeneral());
			
			this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
						
			this.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCuentaBancoGeneral(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTextFieldcodigoTipoCuentaBancoGeneral.setEnabled(isHabilitar && this.tipocuentabancogeneralConstantesFunciones.activarcodigoTipoCuentaBancoGeneral);	
		//
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.setEnabled(isHabilitar && this.tipocuentabancogeneralConstantesFunciones.activarid_empresaTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.setEnabled(isHabilitar && this.tipocuentabancogeneralConstantesFunciones.activarid_bancoTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setEnabled(isHabilitar && this.tipocuentabancogeneralConstantesFunciones.activarid_tipo_cuenta_bancoTipoCuentaBancoGeneral);
	};
	
	public void setDefaultControlesTipoCuentaBancoGeneral() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCuentaBancoGeneral(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocuentabancogeneralSessionBean.setConGuardarRelaciones(true);			
			this.tipocuentabancogeneralSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTabbedPaneRelacionesTipoCuentaBancoGeneral.setVisible(true);
			
					
		} else {
			//this.tipocuentabancogeneralSessionBean.setConGuardarRelaciones(false);			
			this.tipocuentabancogeneralSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTabbedPaneRelacionesTipoCuentaBancoGeneral.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoCuentaBancoGeneral() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
				if(tipocuentabancogeneralAux.getId().equals(this.iIdNuevoTipoCuentaBancoGeneral)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogenerals) {
				if(tipocuentabancogeneralAux.getId().equals(this.iIdNuevoTipoCuentaBancoGeneral)) {
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
	
	public int getIndiceActualTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
				if(tipocuentabancogeneralAux.getId().equals(tipocuentabancogeneral.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogenerals) {
				if(tipocuentabancogeneralAux.getId().equals(tipocuentabancogeneral.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneralOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
				if(tipocuentabancogeneralAux.getTipoCuentaBancoGeneralOriginal().getId().equals(tipocuentabancogeneralOriginal.getId())) {
					existe=true;
					tipocuentabancogeneralOriginal.setId(tipocuentabancogeneralAux.getId());
					tipocuentabancogeneralOriginal.setVersionRow(tipocuentabancogeneralAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogenerals) {
				if(tipocuentabancogeneralAux.getTipoCuentaBancoGeneralOriginal().getId().equals(tipocuentabancogeneralOriginal.getId())) {
					existe=true;
					tipocuentabancogeneralOriginal.setId(tipocuentabancogeneralAux.getId());
					tipocuentabancogeneralOriginal.setVersionRow(tipocuentabancogeneralAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCuentaBancoGeneral(Boolean esParaCancelar) throws Exception {
		tipocuentabancogeneralsAux=new ArrayList<TipoCuentaBancoGeneral>();
		tipocuentabancogeneralAux=new TipoCuentaBancoGeneral();
		
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
					if(tipocuentabancogeneralAux.getId()<0) {
						tipocuentabancogeneralsAux.add(tipocuentabancogeneralAux);
					}		
				}
				this.iIdNuevoTipoCuentaBancoGeneral=0L;
				this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().removeAll(tipocuentabancogeneralsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogenerals) {
					if(tipocuentabancogeneralAux.getId()<0) {
						tipocuentabancogeneralsAux.add(tipocuentabancogeneralAux);
					}		
				}
				this.iIdNuevoTipoCuentaBancoGeneral=0L;
				this.tipocuentabancogenerals.removeAll(tipocuentabancogeneralsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCuentaBancoGeneral 
					&& this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size()>0
					) {
					tipocuentabancogeneralAux=this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().get(this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size() - 1);
				
					if(tipocuentabancogeneralAux.getId()<0) {
						this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().remove(tipocuentabancogeneralAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCuentaBancoGeneral && this.tipocuentabancogenerals.size()>0) {
					tipocuentabancogeneralAux=this.tipocuentabancogenerals.get(this.tipocuentabancogenerals.size() - 1);
				
					if(tipocuentabancogeneralAux.getId()<0) {
						this.tipocuentabancogenerals.remove(tipocuentabancogeneralAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCuentaBancoGeneral(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocuentabancogeneral.getId()<0) {
				this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().remove(this.tipocuentabancogeneral);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocuentabancogeneral.getId()<0) {
				this.tipocuentabancogenerals.remove(this.tipocuentabancogeneral);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCuentaBancoGeneral(List<TipoCuentaBancoGeneral> tipocuentabancogeneralsAux) throws Exception {
		TipoCuentaBancoGeneralConstantesFunciones.setEstadosInicialesTipoCuentaBancoGeneral(tipocuentabancogeneralsAux);
	}
	
	public void setEstadosInicialesTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneralAux) throws Exception {
		TipoCuentaBancoGeneralConstantesFunciones.setEstadosInicialesTipoCuentaBancoGeneral(tipocuentabancogeneralAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCuentaBancoGeneralActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCuentaBancoGeneralActual()) {
				if(!this.isEsNuevoTipoCuentaBancoGeneral) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCuentaBancoGeneral=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCuentaBancoGeneralActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Cuenta Banco General ?", "MANTENIMIENTO DE Tipo Cuenta Banco General", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCuentaBancoGeneral tipocuentabancogeneral) throws Exception {
		TipoCuentaBancoGeneralConstantesFunciones.seleccionarAsignar(this.tipocuentabancogeneral,tipocuentabancogeneral);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCuentaBancoGeneral=this.isPermisoActualizarOriginalTipoCuentaBancoGeneral;
			
			
			this.seleccionarAsignar(tipocuentabancogeneral);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCuentaBancoGeneralConstantesFunciones.quitarEspaciosTipoCuentaBancoGeneral(this.tipocuentabancogeneral,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocuentabancogeneralSessionBean.setsFuncionBusquedaRapida(this.tipocuentabancogeneralSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCuentaBancoGeneral) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCuentaBancoGeneral(esParaCancelar);				
				this.cancelarNuevoTipoCuentaBancoGeneral(esParaCancelar);								
			}
			
			this.tipocuentabancogeneral=new TipoCuentaBancoGeneral();
			
			this.inicializarTipoCuentaBancoGeneral();
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCuentaBancoGeneral() throws Exception {
		try {
			TipoCuentaBancoGeneralConstantesFunciones.inicializarTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCuentaBancoGenerals(String sAccionBusqueda,List<TipoCuentaBancoGeneral> tipocuentabancogeneralsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCuentaBancoGeneral"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCuentaBancoGeneralMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCuentaBancoGeneralMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCuentaBancoGeneral"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Cuenta Banco Generales");		
		parameters.put("busquedapor", TipoCuentaBancoGeneralConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCuentaBancoGeneral=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCuentaBancoGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCuentaBancoGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCuentaBancoGeneral=new JRBeanArrayDataSource(TipoCuentaBancoGeneralJInternalFrame.TraerTipoCuentaBancoGeneralBeans(tipocuentabancogeneralsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCuentaBancoGeneral);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCuentaBancoGeneralConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCuentaBancoGeneralBean.TraerTipoCuentaBancoGeneralBeans(tipocuentabancogeneralsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCuentaBancoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancogeneralsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCuentaBancoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancogeneralsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneralActionPerformed(null);
					//this.generarExcelReporteTipoCuentaBancoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancogeneralsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCuentaBancoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancogeneralsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCuentaBancoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancogeneralsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCuentaBancoGenerals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancogeneralsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCuentaBancoGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaBancoGeneral> tipocuentabancogeneralsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancogeneral";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaBancoGenerals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCuentaBancoGeneral("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCuentaBancoGeneral tipocuentabancogeneral : tipocuentabancogeneralsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCuentaBancoGeneralConstantesFunciones.generarExcelReporteDataTipoCuentaBancoGeneral("NORMAL",row,workbook,tipocuentabancogeneral,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCuentaBancoGeneral(String sTipo,Row row,Workbook workbook) {
		
		TipoCuentaBancoGeneralConstantesFunciones.generarExcelReporteHeaderTipoCuentaBancoGeneral(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCuentaBancoGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaBancoGeneral> tipocuentabancogeneralsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancogeneral_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaBancoGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCuentaBancoGeneral tipocuentabancogeneral : tipocuentabancogeneralsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.getTipoCuentaBancoGeneralDescripcion(tipocuentabancogeneral));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuentabancogeneral.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuentabancogeneral.getbanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuentabancogeneral.gettipocuentabanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuentabancogeneral.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCuentaBancoGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaBancoGeneral> tipocuentabancogeneralsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCuentaBancoGeneral> tipocuentabancogeneralsRespaldo=null;
		
		classes=TipoCuentaBancoGeneralConstantesFunciones.getClassesRelationshipsOfTipoCuentaBancoGeneral(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocuentabancogeneralLogic.setDatosCliente(this.datosCliente);
		this.tipocuentabancogeneralLogic.setDatosDeep(this.datosDeep);
		this.tipocuentabancogeneralLogic.setIsConDeep(true);
		
		tipocuentabancogeneralsRespaldo=this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals();
		
		this.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(tipocuentabancogeneralsParaReportes);	
		this.tipocuentabancogeneralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocuentabancogeneralsParaReportes=this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals();
		this.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(tipocuentabancogeneralsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancogeneral_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaBancoGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCuentaBancoGeneral("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCuentaBancoGeneral tipocuentabancogeneral : tipocuentabancogeneralsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCuentaBancoGeneral("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCuentaBancoGeneralConstantesFunciones.generarExcelReporteDataTipoCuentaBancoGeneral("NORMAL",row,workbook,tipocuentabancogeneral,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.getTipoCuentaBancoGeneralDescripcion(tipocuentabancogeneral));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCuentaBancoGeneral() throws Exception {		
		this.startProcessTipoCuentaBancoGeneral(true);
	}
	
	public void startProcessTipoCuentaBancoGeneral(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoCuentaBancoGeneral ,this.jPanelParametrosReportesTipoCuentaBancoGeneral, this.jScrollPanelDatosTipoCuentaBancoGeneral,this.jPanelPaginacionTipoCuentaBancoGeneral, this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral, this.jPanelAccionesTipoCuentaBancoGeneral,this.jPanelAccionesFormularioTipoCuentaBancoGeneral,this.jmenuBarTipoCuentaBancoGeneral,this.jmenuBarDetalleTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,this.jTtoolBarDetalleTipoCuentaBancoGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCuentaBancoGeneral=this.jTabbedPaneBusquedasTipoCuentaBancoGeneral; 
		
		final JPanel jPanelParametrosReportesTipoCuentaBancoGeneral=this.jPanelParametrosReportesTipoCuentaBancoGeneral;
		//final JScrollPane jScrollPanelDatosTipoCuentaBancoGeneral=this.jScrollPanelDatosTipoCuentaBancoGeneral;
		final JTable jTableDatosTipoCuentaBancoGeneral=this.jTableDatosTipoCuentaBancoGeneral;		
		final JPanel jPanelPaginacionTipoCuentaBancoGeneral=this.jPanelPaginacionTipoCuentaBancoGeneral;
		//final JScrollPane jScrollPanelDatosEdicionTipoCuentaBancoGeneral=this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral;
		final JPanel jPanelAccionesTipoCuentaBancoGeneral=this.jPanelAccionesTipoCuentaBancoGeneral;
		
		JPanel jPanelCamposAuxiliarTipoCuentaBancoGeneral=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCuentaBancoGeneral=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			jPanelCamposAuxiliarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jPanelCamposTipoCuentaBancoGeneral;
			jPanelAccionesFormularioAuxiliarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jPanelAccionesFormularioTipoCuentaBancoGeneral;
		}
		
		final JPanel jPanelCamposTipoCuentaBancoGeneral=jPanelCamposAuxiliarTipoCuentaBancoGeneral;
		final JPanel jPanelAccionesFormularioTipoCuentaBancoGeneral=jPanelAccionesFormularioAuxiliarTipoCuentaBancoGeneral;
		
		
		final JMenuBar jmenuBarTipoCuentaBancoGeneral=this.jmenuBarTipoCuentaBancoGeneral;
		final JToolBar jTtoolBarTipoCuentaBancoGeneral=this.jTtoolBarTipoCuentaBancoGeneral;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCuentaBancoGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCuentaBancoGeneral=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			jmenuBarDetalleAuxiliarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jmenuBarDetalleTipoCuentaBancoGeneral;
			jTtoolBarDetalleAuxiliarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTtoolBarDetalleTipoCuentaBancoGeneral;
		}
		
		final JMenuBar jmenuBarDetalleTipoCuentaBancoGeneral=jmenuBarDetalleAuxiliarTipoCuentaBancoGeneral;
		final JToolBar jTtoolBarDetalleTipoCuentaBancoGeneral=jTtoolBarDetalleAuxiliarTipoCuentaBancoGeneral;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCuentaBancoGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCuentaBancoGeneral;
			processRunnable.jTableDatos=jTableDatosTipoCuentaBancoGeneral;
			processRunnable.jPanelCampos=jPanelCamposTipoCuentaBancoGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCuentaBancoGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCuentaBancoGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCuentaBancoGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCuentaBancoGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCuentaBancoGeneral;
			processRunnable.jTtoolBar=jTtoolBarTipoCuentaBancoGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCuentaBancoGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCuentaBancoGeneral ,jPanelParametrosReportesTipoCuentaBancoGeneral,jTableDatosTipoCuentaBancoGeneral, /*jScrollPanelDatosTipoCuentaBancoGeneral,*/jPanelCamposTipoCuentaBancoGeneral,jPanelPaginacionTipoCuentaBancoGeneral, /*jScrollPanelDatosEdicionTipoCuentaBancoGeneral,*/ jPanelAccionesTipoCuentaBancoGeneral,jPanelAccionesFormularioTipoCuentaBancoGeneral,jmenuBarTipoCuentaBancoGeneral,jmenuBarDetalleTipoCuentaBancoGeneral,jTtoolBarTipoCuentaBancoGeneral,jTtoolBarDetalleTipoCuentaBancoGeneral);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCuentaBancoGeneral ,jPanelParametrosReportesTipoCuentaBancoGeneral, jScrollPanelDatosTipoCuentaBancoGeneral,jPanelPaginacionTipoCuentaBancoGeneral, jScrollPanelDatosEdicionTipoCuentaBancoGeneral, jPanelAccionesTipoCuentaBancoGeneral,jPanelAccionesFormularioTipoCuentaBancoGeneral,jmenuBarTipoCuentaBancoGeneral,jmenuBarDetalleTipoCuentaBancoGeneral,jTtoolBarTipoCuentaBancoGeneral,jTtoolBarDetalleTipoCuentaBancoGeneral);
						
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
	
	public void finishProcessTipoCuentaBancoGeneral() {// throws Exception 
		this.finishProcessTipoCuentaBancoGeneral(true);
	}
	
	public void finishProcessTipoCuentaBancoGeneral(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoCuentaBancoGeneral ,this.jPanelParametrosReportesTipoCuentaBancoGeneral, this.jScrollPanelDatosTipoCuentaBancoGeneral,this.jPanelPaginacionTipoCuentaBancoGeneral, this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral, this.jPanelAccionesTipoCuentaBancoGeneral,this.jPanelAccionesFormularioTipoCuentaBancoGeneral,this.jmenuBarTipoCuentaBancoGeneral,this.jmenuBarDetalleTipoCuentaBancoGeneral,this.jTtoolBarTipoCuentaBancoGeneral,this.jTtoolBarDetalleTipoCuentaBancoGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCuentaBancoGeneral=this.jTabbedPaneBusquedasTipoCuentaBancoGeneral; 
		
		final JPanel jPanelParametrosReportesTipoCuentaBancoGeneral=this.jPanelParametrosReportesTipoCuentaBancoGeneral;
		//final JScrollPane jScrollPanelDatosTipoCuentaBancoGeneral=this.jScrollPanelDatosTipoCuentaBancoGeneral;
		final JTable jTableDatosTipoCuentaBancoGeneral=this.jTableDatosTipoCuentaBancoGeneral;		
		final JPanel jPanelPaginacionTipoCuentaBancoGeneral=this.jPanelPaginacionTipoCuentaBancoGeneral;
		//final JScrollPane jScrollPanelDatosEdicionTipoCuentaBancoGeneral=this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral;
		final JPanel jPanelAccionesTipoCuentaBancoGeneral=this.jPanelAccionesTipoCuentaBancoGeneral;
		
		JPanel jPanelCamposAuxiliarTipoCuentaBancoGeneral=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCuentaBancoGeneral=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			jPanelCamposAuxiliarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jPanelCamposTipoCuentaBancoGeneral;
			jPanelAccionesFormularioAuxiliarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jPanelAccionesFormularioTipoCuentaBancoGeneral;
		}
		
		final JPanel jPanelCamposTipoCuentaBancoGeneral=jPanelCamposAuxiliarTipoCuentaBancoGeneral;
		final JPanel jPanelAccionesFormularioTipoCuentaBancoGeneral=jPanelAccionesFormularioAuxiliarTipoCuentaBancoGeneral;
		
		
		final JMenuBar jmenuBarTipoCuentaBancoGeneral=this.jmenuBarTipoCuentaBancoGeneral;		
		final JToolBar jTtoolBarTipoCuentaBancoGeneral=this.jTtoolBarTipoCuentaBancoGeneral;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCuentaBancoGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCuentaBancoGeneral=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			jmenuBarDetalleAuxiliarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jmenuBarDetalleTipoCuentaBancoGeneral;
			jTtoolBarDetalleAuxiliarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTtoolBarDetalleTipoCuentaBancoGeneral;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCuentaBancoGeneral=jmenuBarDetalleAuxiliarTipoCuentaBancoGeneral;
		final JToolBar jTtoolBarDetalleTipoCuentaBancoGeneral=jTtoolBarDetalleAuxiliarTipoCuentaBancoGeneral;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCuentaBancoGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCuentaBancoGeneral;
			processRunnable.jTableDatos=jTableDatosTipoCuentaBancoGeneral;
			processRunnable.jPanelCampos=jPanelCamposTipoCuentaBancoGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCuentaBancoGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCuentaBancoGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCuentaBancoGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCuentaBancoGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCuentaBancoGeneral;
			processRunnable.jTtoolBar=jTtoolBarTipoCuentaBancoGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCuentaBancoGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCuentaBancoGeneral ,jPanelParametrosReportesTipoCuentaBancoGeneral, jTableDatosTipoCuentaBancoGeneral,/*jScrollPanelDatosTipoCuentaBancoGeneral,*/jPanelCamposTipoCuentaBancoGeneral,jPanelPaginacionTipoCuentaBancoGeneral, /*jScrollPanelDatosEdicionTipoCuentaBancoGeneral,*/ jPanelAccionesTipoCuentaBancoGeneral,jPanelAccionesFormularioTipoCuentaBancoGeneral,jmenuBarTipoCuentaBancoGeneral,jmenuBarDetalleTipoCuentaBancoGeneral,jTtoolBarTipoCuentaBancoGeneral,jTtoolBarDetalleTipoCuentaBancoGeneral));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCuentaBancoGeneral(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCuentaBancoGeneral(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCuentaBancoGeneral(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCuentaBancoGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCuentaBancoGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCuentaBancoGeneral,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCuentaBancoGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCuentaBancoGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCuentaBancoGeneral,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocuentabancogeneralConstantesFunciones.getsFinalQueryTipoCuentaBancoGeneral();
		String  finalQueryPaginacionTodos=this.tipocuentabancogeneralConstantesFunciones.getsFinalQueryTipoCuentaBancoGeneral();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCuentaBancoGeneralConstantesFunciones.getArrayColumnasGlobalesNoTipoCuentaBancoGeneral(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCuentaBancoGeneralConstantesFunciones.getArrayColumnasGlobalesTipoCuentaBancoGeneral(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCuentaBancoGeneralConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocuentabancogeneralsEliminados= new ArrayList<TipoCuentaBancoGeneral>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCuentaBancoGeneral();
		
				///*TipoCuentaBancoGeneralSessionBean*/this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
			
			if(this.tipocuentabancogeneralSessionBean==null) {
				this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
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
					this.iNumeroPaginacion=TipoCuentaBancoGeneralConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCuentaBancoGeneralConstantesFunciones.getClassesForeignKeysOfTipoCuentaBancoGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocuentabancogeneral."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocuentabancogeneralsAux= new ArrayList<TipoCuentaBancoGeneral>();
			
				
			tipocuentabancogeneralLogic.setDatosCliente(this.datosCliente);
			tipocuentabancogeneralLogic.setDatosDeep(this.datosDeep);
			tipocuentabancogeneralLogic.setIsConDeep(true);
			
			
			tipocuentabancogeneralLogic.getTipoCuentaBancoGeneralDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocuentabancogeneralLogic.getTodosTipoCuentaBancoGenerals(finalQueryGlobal,pagination);
					
					//tipocuentabancogeneralLogic.getTodosTipoCuentaBancoGeneralsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()==null|| tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentabancogeneralsAux= new ArrayList<TipoCuentaBancoGeneral>();
							tipocuentabancogeneralsAux.addAll(tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancogeneralsAux= new ArrayList<TipoCuentaBancoGeneral>();
							tipocuentabancogeneralsAux.addAll(tipocuentabancogenerals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentabancogeneralLogic.getTodosTipoCuentaBancoGenerals(finalQueryGlobal+"",this.pagination);												
							
							//tipocuentabancogeneralLogic.getTodosTipoCuentaBancoGeneralsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCuentaBancoGenerals("Todos",tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(new ArrayList<TipoCuentaBancoGeneral>());					
							tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().addAll(tipocuentabancogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancogenerals=new ArrayList<TipoCuentaBancoGeneral>();
							tipocuentabancogenerals.addAll(tipocuentabancogeneralsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCuentaBancoGeneral=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCuentaBancoGeneral=this.idActual;
				
				} else if(this.idTipoCuentaBancoGeneralActual!=null && this.idTipoCuentaBancoGeneralActual!=0L) {
					idTipoCuentaBancoGeneral=idTipoCuentaBancoGeneralActual;
				}
				
					
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndicePorId(idTipoCuentaBancoGeneral);
				
				this.tipocuentabancogenerals=new ArrayList<TipoCuentaBancoGeneral>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocuentabancogeneralLogic.getEntity(idTipoCuentaBancoGeneral);
					
					//tipocuentabancogeneralLogic.getEntityWithConnection(idTipoCuentaBancoGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(new ArrayList<TipoCuentaBancoGeneral>());
					tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().add(tipocuentabancogeneralLogic.getTipoCuentaBancoGeneral());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentabancogenerals=new ArrayList<TipoCuentaBancoGeneral>();
					this.tipocuentabancogenerals.add(tipocuentabancogeneral);
				}
				
				if(tipocuentabancogeneralLogic.getTipoCuentaBancoGeneral()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBanco")) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocuentabancogeneralLogic.getTipoCuentaBancoGeneralsFK_IdBanco(finalQueryGlobal,pagination,id_bancoFK_IdBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()==null||tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocuentabancogenerals==null|| tipocuentabancogenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancogeneralsAux=new ArrayList<TipoCuentaBancoGeneral>();
						tipocuentabancogeneralsAux.addAll(tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancogeneralsAux=new ArrayList<TipoCuentaBancoGeneral>();
							tipocuentabancogeneralsAux.addAll(tipocuentabancogenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocuentabancogeneralLogic.getTipoCuentaBancoGeneralsFK_IdBanco(finalQueryGlobal,pagination,id_bancoFK_IdBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdBanco(id_bancoFK_IdBanco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCuentaBancoGenerals("FK_IdBanco",tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCuentaBancoGenerals("FK_IdBanco",tipocuentabancogenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(new ArrayList<TipoCuentaBancoGeneral>());
						tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().addAll(tipocuentabancogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancogenerals=new ArrayList<TipoCuentaBancoGeneral>();
							tipocuentabancogenerals.addAll(tipocuentabancogeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocuentabancogeneralLogic.getTipoCuentaBancoGeneralsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()==null||tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocuentabancogenerals==null|| tipocuentabancogenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancogeneralsAux=new ArrayList<TipoCuentaBancoGeneral>();
						tipocuentabancogeneralsAux.addAll(tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancogeneralsAux=new ArrayList<TipoCuentaBancoGeneral>();
							tipocuentabancogeneralsAux.addAll(tipocuentabancogenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocuentabancogeneralLogic.getTipoCuentaBancoGeneralsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCuentaBancoGenerals("FK_IdEmpresa",tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCuentaBancoGenerals("FK_IdEmpresa",tipocuentabancogenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(new ArrayList<TipoCuentaBancoGeneral>());
						tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().addAll(tipocuentabancogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancogenerals=new ArrayList<TipoCuentaBancoGeneral>();
							tipocuentabancogenerals.addAll(tipocuentabancogeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoCuentaBanco")) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBanco(id_tipo_cuenta_bancoFK_IdTipoCuentaBanco);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocuentabancogeneralLogic.getTipoCuentaBancoGeneralsFK_IdTipoCuentaBanco(finalQueryGlobal,pagination,id_tipo_cuenta_bancoFK_IdTipoCuentaBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBanco(id_tipo_cuenta_bancoFK_IdTipoCuentaBanco);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBanco(id_tipo_cuenta_bancoFK_IdTipoCuentaBanco);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()==null||tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocuentabancogenerals==null|| tipocuentabancogenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancogeneralsAux=new ArrayList<TipoCuentaBancoGeneral>();
						tipocuentabancogeneralsAux.addAll(tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancogeneralsAux=new ArrayList<TipoCuentaBancoGeneral>();
							tipocuentabancogeneralsAux.addAll(tipocuentabancogenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocuentabancogeneralLogic.getTipoCuentaBancoGeneralsFK_IdTipoCuentaBanco(finalQueryGlobal,pagination,id_tipo_cuenta_bancoFK_IdTipoCuentaBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBanco(id_tipo_cuenta_bancoFK_IdTipoCuentaBanco);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoCuentaBancoGeneralConstantesFunciones.getDetalleIndiceFK_IdTipoCuentaBanco(id_tipo_cuenta_bancoFK_IdTipoCuentaBanco);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoCuentaBancoGenerals("FK_IdTipoCuentaBanco",tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoCuentaBancoGenerals("FK_IdTipoCuentaBanco",tipocuentabancogenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(new ArrayList<TipoCuentaBancoGeneral>());
						tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().addAll(tipocuentabancogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancogenerals=new ArrayList<TipoCuentaBancoGeneral>();
							tipocuentabancogenerals.addAll(tipocuentabancogeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCuentaBancoGeneral();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCuentaBancoGeneral();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentabancogenerals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentabancogenerals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCuentaBancoGeneral tipocuentabancogeneral) {
		Boolean permite=true;
		
		if(this.tipocuentabancogeneral.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCuentaBancoGeneralConstantesFunciones.getOrderByListaTipoCuentaBancoGeneral();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCuentaBancoGeneralConstantesFunciones.getOrderByListaTipoCuentaBancoGeneral();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBancoGeneral tipocuentabancogeneral:tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
				if(tipocuentabancogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancogeneralTotales=tipocuentabancogeneral;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBancoGeneral tipocuentabancogeneral:this.tipocuentabancogenerals) {
				if(tipocuentabancogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancogeneralTotales=tipocuentabancogeneral;
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
			this.tipocuentabancogeneralAux=new TipoCuentaBancoGeneral();
			this.tipocuentabancogeneralAux.setsType(Constantes2.S_TOTALES);
			this.tipocuentabancogeneralAux.setIsNew(false);
			this.tipocuentabancogeneralAux.setIsChanged(false);
			this.tipocuentabancogeneralAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCuentaBancoGeneralConstantesFunciones.TotalizarValoresFilaTipoCuentaBancoGeneral(this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals(),this.tipocuentabancogeneralAux);
				
				this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().add(this.tipocuentabancogeneralAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCuentaBancoGeneralConstantesFunciones.TotalizarValoresFilaTipoCuentaBancoGeneral(this.tipocuentabancogenerals,this.tipocuentabancogeneralAux);
				
				this.tipocuentabancogenerals.add(this.tipocuentabancogeneralAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocuentabancogeneralTotales=new TipoCuentaBancoGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().remove(tipocuentabancogeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocuentabancogenerals.remove(tipocuentabancogeneralTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocuentabancogeneralTotales=new TipoCuentaBancoGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBancoGeneral tipocuentabancogeneral:tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
				if(tipocuentabancogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancogeneralTotales=tipocuentabancogeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCuentaBancoGeneralConstantesFunciones.TotalizarValoresFilaTipoCuentaBancoGeneral(this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals(),tipocuentabancogeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBancoGeneral tipocuentabancogeneral:this.tipocuentabancogenerals) {
				if(tipocuentabancogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancogeneralTotales=tipocuentabancogeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCuentaBancoGeneralConstantesFunciones.TotalizarValoresFilaTipoCuentaBancoGeneral(this.tipocuentabancogenerals,tipocuentabancogeneralTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoCuentaBancoGeneralsFK_IdBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoCuentaBancoGeneralsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoCuentaBancoGeneralsFK_IdTipoCuentaBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoCuentaBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoCuentaBancoGeneralsFK_IdBanco(String sFinalQuery,Long id_banco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancogeneralLogic.getTipoCuentaBancoGeneralsFK_IdBanco(sFinalQuery,this.pagination,id_banco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoCuentaBancoGeneralsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancogeneralLogic.getTipoCuentaBancoGeneralsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoCuentaBancoGeneralsFK_IdTipoCuentaBanco(String sFinalQuery,Long id_tipo_cuenta_banco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancogeneralLogic.getTipoCuentaBancoGeneralsFK_IdTipoCuentaBanco(sFinalQuery,this.pagination,id_tipo_cuenta_banco);
				
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
	
	public void inicializarPermisosTipoCuentaBancoGeneral() {
		this.isPermisoTodoTipoCuentaBancoGeneral=false;
		this.isPermisoNuevoTipoCuentaBancoGeneral=false;
		this.isPermisoActualizarTipoCuentaBancoGeneral=false;
		this.isPermisoActualizarOriginalTipoCuentaBancoGeneral=false;
		this.isPermisoEliminarTipoCuentaBancoGeneral=false;
		this.isPermisoGuardarCambiosTipoCuentaBancoGeneral=false;
		this.isPermisoConsultaTipoCuentaBancoGeneral=false;
		this.isPermisoBusquedaTipoCuentaBancoGeneral=false;
		this.isPermisoReporteTipoCuentaBancoGeneral=false;		
		this.isPermisoOrdenTipoCuentaBancoGeneral=false;		
		this.isPermisoPaginacionMedioTipoCuentaBancoGeneral=false;		
		this.isPermisoPaginacionAltoTipoCuentaBancoGeneral=false;
		this.isPermisoPaginacionTodoTipoCuentaBancoGeneral=false;
		this.isPermisoCopiarTipoCuentaBancoGeneral=false;		
		this.isPermisoVerFormTipoCuentaBancoGeneral=false;		
		this.isPermisoDuplicarTipoCuentaBancoGeneral=false;		
		this.isPermisoOrdenTipoCuentaBancoGeneral=false;		
	}
	
	public void setPermisosUsuarioTipoCuentaBancoGeneral(Boolean isPermiso) {
		this.isPermisoTodoTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoNuevoTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoActualizarTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoActualizarOriginalTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoEliminarTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoGuardarCambiosTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoConsultaTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoBusquedaTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoReporteTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoOrdenTipoCuentaBancoGeneral=isPermiso;		
		this.isPermisoPaginacionMedioTipoCuentaBancoGeneral=isPermiso;		
		this.isPermisoPaginacionAltoTipoCuentaBancoGeneral=isPermiso;		
		this.isPermisoPaginacionTodoTipoCuentaBancoGeneral=isPermiso;		
		this.isPermisoCopiarTipoCuentaBancoGeneral=isPermiso;		
		this.isPermisoVerFormTipoCuentaBancoGeneral=isPermiso;		
		this.isPermisoDuplicarTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoOrdenTipoCuentaBancoGeneral=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCuentaBancoGeneral(Boolean isPermiso) {
		//this.isPermisoTodoTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoNuevoTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoActualizarTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoActualizarOriginalTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoEliminarTipoCuentaBancoGeneral=isPermiso;
		this.isPermisoGuardarCambiosTipoCuentaBancoGeneral=isPermiso;
		//this.isPermisoConsultaTipoCuentaBancoGeneral=isPermiso;
		//this.isPermisoBusquedaTipoCuentaBancoGeneral=isPermiso;
		//this.isPermisoReporteTipoCuentaBancoGeneral=isPermiso;
		//this.isPermisoOrdenTipoCuentaBancoGeneral=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCuentaBancoGeneral=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCuentaBancoGeneral=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCuentaBancoGeneral=isPermiso;		
		//this.isPermisoCopiarTipoCuentaBancoGeneral=isPermiso;		
		//this.isPermisoDuplicarTipoCuentaBancoGeneral=isPermiso;
		//this.isPermisoOrdenTipoCuentaBancoGeneral=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCuentaBancoGeneralClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoCuentaBancoGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCuentaBancoGeneral(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCuentaBancoGeneralClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCuentaBancoGeneralClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCuentaBancoGeneralClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCuentaBancoGeneralClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoCuentaBancoGeneral() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCuentaBancoGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCuentaBancoGeneralConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCuentaBancoGeneral=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCuentaBancoGeneral=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCuentaBancoGeneral=this.isPermisoActualizarTipoCuentaBancoGeneral;
			this.isPermisoEliminarTipoCuentaBancoGeneral=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCuentaBancoGeneral=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCuentaBancoGeneral=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCuentaBancoGeneral=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCuentaBancoGeneral=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCuentaBancoGeneral=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCuentaBancoGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCuentaBancoGeneral=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCuentaBancoGeneral=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCuentaBancoGeneral=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCuentaBancoGeneral=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCuentaBancoGeneral=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCuentaBancoGeneral=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCuentaBancoGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCuentaBancoGeneral.setToolTipText(this.jTableDatosTipoCuentaBancoGeneral.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCuentaBancoGeneral(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCuentaBancoGeneral(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCuentaBancoGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCuentaBancoGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCuentaBancoGeneral() throws Exception {
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
	public void inicializarCombosForeignKeyTipoCuentaBancoGeneralListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.bancosForeignKey=new ArrayList();
				this.tipocuentabancosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCuentaBancoGeneralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCuentaBancoGeneralJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCuentaBancoGeneralListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCuentaBancoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyBancoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bancosForeignKey==null||this.bancosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BancoConstantesFunciones.SFINALQUERY;

				this.cargarCombosBancosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCuentaBancoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocuentabancosForeignKey==null||this.tipocuentabancosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCuentaBancoConstantesFunciones.getArrayColumnasGlobalesTipoCuentaBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuentaBancoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCuentaBancoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCuentaBancosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoCuentaBancoGeneralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoCuentaBancoGeneralParameterReturnGeneral tipocuentabancogeneralReturnGeneral=new TipoCuentaBancoGeneralParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocuentabancogeneralConstantesFunciones.cargarid_empresaTipoCuentaBancoGeneral)
					 || (this.esRecargarFks && this.tipocuentabancogeneralConstantesFunciones.cargarid_empresaTipoCuentaBancoGeneral)) {

					if(!this.tipocuentabancogeneralSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocuentabancogeneralSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalBanco="";

				if(((this.bancosForeignKey==null||this.bancosForeignKey.size()<=0) && this.tipocuentabancogeneralConstantesFunciones.cargarid_bancoTipoCuentaBancoGeneral)
					 || (this.esRecargarFks && this.tipocuentabancogeneralConstantesFunciones.cargarid_bancoTipoCuentaBancoGeneral)) {

					if(!this.tipocuentabancogeneralSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBanco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);

						finalQueryGlobalBanco=Funciones.GetFinalQueryAppend(finalQueryGlobalBanco, "");
						finalQueryGlobalBanco+=BancoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBancosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBanco=" WHERE " + ConstantesSql.ID + "="+tipocuentabancogeneralSessionBean.getlidBancoActual();
					}
				} else {
					finalQueryGlobalBanco="NONE";
				}


				String finalQueryGlobalTipoCuentaBanco="";

				if(((this.tipocuentabancosForeignKey==null||this.tipocuentabancosForeignKey.size()<=0) && this.tipocuentabancogeneralConstantesFunciones.cargarid_tipo_cuenta_bancoTipoCuentaBancoGeneral)
					 || (this.esRecargarFks && this.tipocuentabancogeneralConstantesFunciones.cargarid_tipo_cuenta_bancoTipoCuentaBancoGeneral)) {

					if(!this.tipocuentabancogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBanco()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCuentaBancoConstantesFunciones.getArrayColumnasGlobalesTipoCuentaBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCuentaBanco=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCuentaBancoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCuentaBanco=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCuentaBanco, "");
						finalQueryGlobalTipoCuentaBanco+=TipoCuentaBancoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCuentaBancosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCuentaBanco=" WHERE " + ConstantesSql.ID + "="+tipocuentabancogeneralSessionBean.getlidTipoCuentaBancoActual();
					}
				} else {
					finalQueryGlobalTipoCuentaBanco="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocuentabancogeneralReturnGeneral=tipocuentabancogeneralLogic.cargarCombosLoteForeignKeyTipoCuentaBancoGeneral(finalQueryGlobalEmpresa,finalQueryGlobalBanco,finalQueryGlobalTipoCuentaBanco);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocuentabancogeneralReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalBanco.equals("NONE")) {
				this.bancosForeignKey=tipocuentabancogeneralReturnGeneral.getbancosForeignKey();
			}

			if(!finalQueryGlobalTipoCuentaBanco.equals("NONE")) {
				this.tipocuentabancosForeignKey=tipocuentabancogeneralReturnGeneral.gettipocuentabancosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCuentaBancoGeneral()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyBanco();
			this.addItemDefectoCombosForeignKeyTipoCuentaBanco();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocuentabancogeneralSessionBean==null) {
				this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
			}

			if(!this.tipocuentabancogeneralSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyBanco()throws Exception {
		try {

			if(!this.tipocuentabancogeneralSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
				Banco banco=new Banco();
				BancoConstantesFunciones.setBancoDescripcion(banco,Constantes.SMENSAJE_ESCOJA_OPCION);
				banco.setId(null);

				if(!BancoConstantesFunciones.ExisteEnLista(this.bancosForeignKey,banco,true)) {

					this.bancosForeignKey.add(0,banco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoCuentaBanco()throws Exception {
		try {

			if(!this.tipocuentabancogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoCuentaBanco()) {
				TipoCuentaBanco tipocuentabanco=new TipoCuentaBanco();
				TipoCuentaBancoConstantesFunciones.setTipoCuentaBancoDescripcion(tipocuentabanco,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocuentabanco.setId(null);

				if(!TipoCuentaBancoConstantesFunciones.ExisteEnLista(this.tipocuentabancosForeignKey,tipocuentabanco,true)) {

					this.tipocuentabancosForeignKey.add(0,tipocuentabanco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoCuentaBancoGeneral()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCuentaBancoGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCuentaBancoGeneral()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaBancoGeneral();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral)throws Exception {	
		try {
			
			this.setActualBancoForeignKey(tipocuentabancogeneral.getid_banco(),false,"Formulario");
			this.setActualTipoCuentaBancoForeignKey(tipocuentabancogeneral.getid_tipo_cuenta_banco(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCuentaBancoGeneral()throws Exception {	
		try {
			
			this.setActualBancoForeignKey(this.tipocuentabancogeneralConstantesFunciones.getid_banco(),false,"Formulario");
			this.setActualTipoCuentaBancoForeignKey(this.tipocuentabancogeneralConstantesFunciones.getid_tipo_cuenta_banco(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaBancoGeneral()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCuentaBancoGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCuentaBancoGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCuentaBancoGeneral()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCuentaBancoGeneral()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameBancosForeignKey("Todos");
			this.cargarCombosFrameTipoCuentaBancosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCuentaBancoGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCuentaBancosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCuentaBancoGeneral()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public TipoCuentaBancoGeneralBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCuentaBancoGeneralBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCuentaBancoGeneralBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean(); 
		this.tipocuentabancogeneralConstantesFunciones=new TipoCuentaBancoGeneralConstantesFunciones(); 
		this.tipocuentabancogeneralBean=new TipoCuentaBancoGeneral();//(this.tipocuentabancogeneralConstantesFunciones); 		
		this.tipocuentabancogeneralReturnGeneral=new TipoCuentaBancoGeneralParameterReturnGeneral(); 
		
		this.tipocuentabancogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCuentaBancoGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCuentaBancoGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCuentaBancoGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCuentaBancoGeneral(true);
			
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
			
			this.tipocuentabancogeneralConstantesFunciones=new TipoCuentaBancoGeneralConstantesFunciones(); 
			this.tipocuentabancogeneralBean=new TipoCuentaBancoGeneral();//this.tipocuentabancogeneralConstantesFunciones); 			
			this.tipocuentabancogeneralReturnGeneral=new TipoCuentaBancoGeneralParameterReturnGeneral(); 
		
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuenta Banco General Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocuentabancogeneral=new TipoCuentaBancoGeneral();
			this.tipocuentabancogenerals = new ArrayList<TipoCuentaBancoGeneral>();
			this.tipocuentabancogeneralsAux = new ArrayList<TipoCuentaBancoGeneral>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic=new TipoCuentaBancoGeneralLogic();
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocuentabancogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocuentabancogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral);	
					}
					
					if(this.jInternalFrameImportacionTipoCuentaBancoGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCuentaBancoGeneral);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCuentaBancoGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCuentaBancoGeneral);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral);
				this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setVisible(false);
				this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral);
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCuentaBancoGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCuentaBancoGeneral);
					this.jInternalFrameImportacionTipoCuentaBancoGeneral.setVisible(false);
					this.jInternalFrameImportacionTipoCuentaBancoGeneral.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCuentaBancoGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCuentaBancoGeneral);
					this.jInternalFrameOrderByTipoCuentaBancoGeneral.setVisible(false);
					this.jInternalFrameOrderByTipoCuentaBancoGeneral.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCuentaBancoGeneralActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCuentaBancoGeneralConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocuentabancogeneralReturnGeneral=new TipoCuentaBancoGeneralParameterReturnGeneral();
			
			this.tipocuentabancogeneralParameterGeneral=new TipoCuentaBancoGeneralParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocuentabancogeneralLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCuentaBancoGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCuentaBancoGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado(),this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCuentaBancoGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado(),this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaDuplicarTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaCopiarTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaVerFormTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaOrdenTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=false;
			
			
			this.isVisibilidadFK_IdBanco=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoCuentaBanco=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCuentaBancoGeneral();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCuentaBancoGeneral(false);
			
			this.setPermisosUsuarioTipoCuentaBancoGeneral();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado() && this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCuentaBancoGeneralClasesRelacionadas();
			}
			
			if(this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCuentaBancoGeneralClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCuentaBancoGeneral();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCuentaBancoGeneral();
			}
			
			if(!this.isPermisoBusquedaTipoCuentaBancoGeneral) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCuentaBancoGeneral,this.isPermisoPaginacionMedioTipoCuentaBancoGeneral,this.isPermisoPaginacionTodoTipoCuentaBancoGeneral);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCuentaBancoGeneralConstantesFunciones.getTiposSeleccionarTipoCuentaBancoGeneral());
				
				this.tiposColumnasSelect=TipoCuentaBancoGeneralConstantesFunciones.getTiposSeleccionarTipoCuentaBancoGeneral(true);
				
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
			//if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCuentaBancoGeneral();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoCuentaBancoGeneral(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoCuentaBancoGeneral(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBancoGeneral() ;
			
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
			this.bancoLogic=new BancoLogic();
			this.tipocuentabancoLogic=new TipoCuentaBancoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipocuentabancogeneralImplementable= (TipoCuentaBancoGeneralImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCuentaBancoGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocuentabancogeneralImplementableHome= (TipoCuentaBancoGeneralImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCuentaBancoGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocuentabancogenerals= new ArrayList<TipoCuentaBancoGeneral>();
			this.tipocuentabancogeneralsEliminados= new ArrayList<TipoCuentaBancoGeneral>();
						
			this.isEsNuevoTipoCuentaBancoGeneral=false;
			this.esParaAccionDesdeFormularioTipoCuentaBancoGeneral=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.bancosForeignKey=new ArrayList<Banco>() ;
			this.tipocuentabancosForeignKey=new ArrayList<TipoCuentaBanco>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCuentaBancoGeneral(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCuentaBancoGeneral();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCuentaBancoGeneralConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCuentaBancoGeneral();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCuentaBancoGeneral();
			}
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCuentaBancoGeneral(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCuentaBancoGeneral: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCuentaBancoGeneral() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCuentaBancoGeneral")) {
				iIndex=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTabbedPaneRelacionesTipoCuentaBancoGeneral.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTabbedPaneRelacionesTipoCuentaBancoGeneral.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCuentaBancoGeneral();	
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
	
	public void cargarCombosForeignKeyTipoCuentaBancoGeneral(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCuentaBancoGeneral(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCuentaBancoGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCuentaBancoGeneralListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCuentaBancoGeneral();
		
		this.cargarCombosFrameForeignKeyTipoCuentaBancoGeneral();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCuentaBancoGeneral();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCuentaBancoGeneral();
		}
	}
	
	

	public void cargarCombosForeignKeyBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBanco(this.bancosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCuentaBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCuentaBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCuentaBanco();
				this.cargarCombosFrameTipoCuentaBancosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCuentaBanco(this.tipocuentabancosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoCuentaBancoGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
			
			if(jTableDatosTipoCuentaBancoGeneral.getRowCount()>=1) {
				jTableDatosTipoCuentaBancoGeneral.removeRowSelectionInterval(0, jTableDatosTipoCuentaBancoGeneral.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCuentaBancoGeneral=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCuentaBancoGeneral(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCuentaBancoGeneral(true);			
			//this.tipocuentabancogeneral=new TipoCuentaBancoGeneral();
			//this.tipocuentabancogeneral.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaBancoGeneral(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGeneral() ;
			
			if(TipoCuentaBancoGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaBancoGeneral(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocuentabancogeneral);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);				
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
			if(this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCuentaBancoGeneral: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCuentaBancoGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCuentaBancoGeneral.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCuentaBancoGeneral.getSelectedRows().length;			
			}
			
			tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCuentaBancoGeneral--;			
				//TipoCuentaBancoGeneral tipocuentabancogeneralAux= new TipoCuentaBancoGeneral();			
				//tipocuentabancogeneralAux.setId(this.iIdNuevoTipoCuentaBancoGeneral);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCuentaBancoGeneral tipocuentabancogeneralOrigen=new TipoCuentaBancoGeneral();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCuentaBancoGeneral tipocuentabancogeneralOrigen : tipocuentabancogeneralsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocuentabancogeneralOrigen =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancogeneralOrigen =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCuentaBancoGeneral();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocuentabancogeneral.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCuentaBancoGeneral(tipocuentabancogeneralOrigen,this.tipocuentabancogeneral,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().add(this.tipocuentabancogeneralAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocuentabancogenerals.add(this.tipocuentabancogeneralAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
				
				this.jTableDatosTipoCuentaBancoGeneral.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBancoGeneral(), this.getIndiceNuevoTipoCuentaBancoGeneral());
				
				int iLastRow =  this.jTableDatosTipoCuentaBancoGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCuentaBancoGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCuentaBancoGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();									
		
			TipoCuentaBancoGeneral tipocuentabancogeneralOrigen=new TipoCuentaBancoGeneral();
			TipoCuentaBancoGeneral tipocuentabancogeneralDestino=new TipoCuentaBancoGeneral();
				
			tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCuentaBancoGeneral.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocuentabancogeneralsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCuentaBancoGeneral.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancogeneralOrigen =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocuentabancogeneralOrigen =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancogeneralDestino =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocuentabancogeneralDestino =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocuentabancogeneralOrigen =tipocuentabancogeneralsSeleccionados.get(0);
				tipocuentabancogeneralDestino =tipocuentabancogeneralsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCuentaBancoGeneral(tipocuentabancogeneralOrigen,tipocuentabancogeneralDestino,true,false);
				
				tipocuentabancogeneralDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocuentabancogeneralDestino,tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancogeneralDestino,tipocuentabancogenerals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
				
				//this.jTableDatosTipoCuentaBancoGeneral.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBancoGeneral(), this.getIndiceNuevoTipoCuentaBancoGeneral());
				
				int iLastRow =  this.jTableDatosTipoCuentaBancoGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCuentaBancoGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCuentaBancoGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCuentaBancoGeneral.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoCuentaBancoGeneral.setVisible(!isVisible);
			this.jPanelPaginacionTipoCuentaBancoGeneral.setVisible(!isVisible);
			this.jPanelAccionesTipoCuentaBancoGeneral.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCuentaBancoGeneral();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCuentaBancoGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCuentaBancoGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCuentaBancoGeneral();
			
			this.abrirFrameOrderByTipoCuentaBancoGeneral();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCuentaBancoGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCuentaBancoGeneral(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCuentaBancoGeneral);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setSize(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.iWidthFormulario,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jContentPaneDetalleTipoCuentaBancoGeneral.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTabbedPaneRelacionesTipoCuentaBancoGeneral.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jContentPaneDetalleTipoCuentaBancoGeneral.getWidth(),TipoCuentaBancoGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTabbedPaneRelacionesTipoCuentaBancoGeneral.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jContentPaneDetalleTipoCuentaBancoGeneral.getWidth(),TipoCuentaBancoGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTabbedPaneRelacionesTipoCuentaBancoGeneral.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jContentPaneDetalleTipoCuentaBancoGeneral.getWidth(),TipoCuentaBancoGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCuentaBancoGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCuentaBancoGeneral==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCuentaBancoGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBancoGeneral,false,this);
				} else {
					this.jInternalFrameOrderByTipoCuentaBancoGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBancoGeneral,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCuentaBancoGeneral);
				this.jInternalFrameOrderByTipoCuentaBancoGeneral.setVisible(false);
				this.jInternalFrameOrderByTipoCuentaBancoGeneral.setSelected(false);
				
				this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCuentaBancoGeneral"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCuentaBancoGeneral();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCuentaBancoGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCuentaBancoGeneral==null) {
				
				this.jInternalFrameImportacionTipoCuentaBancoGeneral=new ImportacionJInternalFrame(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCuentaBancoGeneral);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCuentaBancoGeneral);
				this.jInternalFrameImportacionTipoCuentaBancoGeneral.setVisible(false);
				this.jInternalFrameImportacionTipoCuentaBancoGeneral.setSelected(false);


				this.jInternalFrameImportacionTipoCuentaBancoGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCuentaBancoGeneral"));
				this.jInternalFrameImportacionTipoCuentaBancoGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCuentaBancoGeneral"));
				this.jInternalFrameImportacionTipoCuentaBancoGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCuentaBancoGeneral"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCuentaBancoGeneral() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral==null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral=new ReporteDinamicoJInternalFrame(TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral);
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaBancoGeneral"));
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaBancoGeneral"));
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaBancoGeneral"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaBancoGeneral();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoCuentaBancoGeneral() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCuentaBancoGeneral);
			
	       	this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.dispose();
			//this.jInternalFrameDetalleFormTipoCuentaBancoGeneral=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCuentaBancoGeneral() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCuentaBancoGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCuentaBancoGeneral.setVisible(true);
	        this.jInternalFrameImportacionTipoCuentaBancoGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCuentaBancoGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.setVisible(true);
	        this.jInternalFrameOrderByTipoCuentaBancoGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCuentaBancoGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCuentaBancoGeneral.setVisible(false);
	        this.jInternalFrameOrderByTipoCuentaBancoGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCuentaBancoGeneral() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCuentaBancoGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCuentaBancoGeneral.setVisible(false);
	        this.jInternalFrameImportacionTipoCuentaBancoGeneral.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCuentaBancoGeneral(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCuentaBancoGeneral(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCuentaBancoGeneral(true);
			//this.isEsNuevoTipoCuentaBancoGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaBancoGeneral(false) ;
			
			if(tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoCuentaBancoGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaBancoGeneral(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCuentaBancoGeneralActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCuentaBancoGeneral(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCuentaBancoGeneral(true);
			//this.isEsNuevoTipoCuentaBancoGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocuentabancogeneral.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCuentaBancoGeneral(false) ;
			
			if(TipoCuentaBancoGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaBancoGeneral(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaBanco(List<Banco> bancosForeignKey)throws Exception{
		TableColumn tableColumnBanco=this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGeneral,TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO));
		TableCellEditor tableCellEditorBanco =tableColumnBanco.getCellEditor();

		BancoTableCell bancoTableCellFk=(BancoTableCell)tableCellEditorBanco;

		if(bancoTableCellFk!=null) {
			bancoTableCellFk.setbancosForeignKey(bancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bancoTableCellFk.setRowActual(intSelectedRow);
			//bancoTableCellFk.setbancosForeignKeyActual(bancosForeignKey);
		//}


		if(bancoTableCellFk!=null) {
			bancoTableCellFk.RecargarBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoCuentaBanco(List<TipoCuentaBanco> tipocuentabancosForeignKey)throws Exception{
		TableColumn tableColumnTipoCuentaBanco=this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGeneral,TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO));
		TableCellEditor tableCellEditorTipoCuentaBanco =tableColumnTipoCuentaBanco.getCellEditor();

		TipoCuentaBancoTableCell tipocuentabancoTableCellFk=(TipoCuentaBancoTableCell)tableCellEditorTipoCuentaBanco;

		if(tipocuentabancoTableCellFk!=null) {
			tipocuentabancoTableCellFk.settipocuentabancosForeignKey(tipocuentabancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocuentabancoTableCellFk.setRowActual(intSelectedRow);
			//tipocuentabancoTableCellFk.settipocuentabancosForeignKeyActual(tipocuentabancosForeignKey);
		//}


		if(tipocuentabancoTableCellFk!=null) {
			tipocuentabancoTableCellFk.RecargarTipoCuentaBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCuentaBancoGeneral(false);
			
			//if(!this.isEsNuevoTipoCuentaBancoGeneral) {								
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
				
			}
			
			if(this.permiteMantenimiento(this.tipocuentabancogeneral)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCuentaBancoGeneral=true;
					this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
					this.isEsNuevoTipoCuentaBancoGeneral=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCuentaBancoGeneral=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCuentaBancoGeneral=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCuentaBancoGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGeneral(false);
				
				this.habilitarDeshabilitarControlesTipoCuentaBancoGeneral(false);
			
												
				
				if(TipoCuentaBancoGeneralJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCuentaBancoGeneral();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,tipocuentabancogeneralSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCuentaBancoGeneral.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocuentabancogeneralSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocuentabancogeneral.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGeneral.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGeneral.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				this.tipocuentabancogeneral.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				this.tipocuentabancogeneral.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocuentabancogeneral)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCuentaBancoGeneralModel) this.jTableDatosTipoCuentaBancoGeneral.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCuentaBancoGeneral=true;
				this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
				this.isEsNuevoTipoCuentaBancoGeneral=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCuentaBancoGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGeneral(false);
				
				this.habilitarDeshabilitarControlesTipoCuentaBancoGeneral(false);
				
				
				
				if(TipoCuentaBancoGeneralJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCuentaBancoGeneral();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCuentaBancoGeneral.getRowCount()>=1) {
				jTableDatosTipoCuentaBancoGeneral.removeRowSelectionInterval(0, jTableDatosTipoCuentaBancoGeneral.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCuentaBancoGeneral(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaBancoGeneral(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGeneral(false) ;
			
			this.isEsNuevoTipoCuentaBancoGeneral=false;
			
			if(TipoCuentaBancoGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCuentaBancoGeneral();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
				
				//SI ES MANUAL
				if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCuentaBancoGeneral();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCuentaBancoGeneral--;			
			//TipoCuentaBancoGeneral tipocuentabancogeneralAux= new TipoCuentaBancoGeneral();			
			//tipocuentabancogeneralAux.setId(this.iIdNuevoTipoCuentaBancoGeneral);
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCuentaBancoGeneral();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
			
			this.tipocuentabancogeneral.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().add(this.tipocuentabancogeneralAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocuentabancogenerals.add(this.tipocuentabancogeneralAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
			
			this.jTableDatosTipoCuentaBancoGeneral.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBancoGeneral(), this.getIndiceNuevoTipoCuentaBancoGeneral());
			
			int iLastRow =  this.jTableDatosTipoCuentaBancoGeneral.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCuentaBancoGeneral.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCuentaBancoGeneral.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaBancoGeneral();
			}
			
			//this.abrirFrameTreeTipoCuentaBancoGeneral();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Cuenta Banco GeneralES ?", "MANTENIMIENTO DE Tipo Cuenta Banco General", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCuentaBancoGeneral.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCuentaBancoGeneral();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocuentabancogeneralReturnGeneral=tipocuentabancogeneralLogic.procesarImportacionTipoCuentaBancoGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocuentabancogeneralParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCuentaBancoGeneralReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCuentaBancoGeneral.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCuentaBancoGeneral.setFileImportacion(this.jInternalFrameImportacionTipoCuentaBancoGeneral.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCuentaBancoGeneral.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCuentaBancoGeneral.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCuentaBancoGeneral.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCuentaBancoGeneral.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();		

		tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCuentaBancoGeneralBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCuentaBancoGeneralBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCuentaBancoGenerals("Todos",tipocuentabancogeneralsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco General",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Banco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Banco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Banco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Banco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCuentaBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCuentaBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCuentaBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCuentaBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoria="id_banco";
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO:
					sNombreCampoCategoria="id_tipo_cuenta_banco";
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoriaValor="id_banco";
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO:
					sNombreCampoCategoriaValor="id_tipo_cuenta_banco";
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_banco");
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Cuenta Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_cuenta_banco");
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();		
		
		tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancogeneral";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCuentaBancoGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoCuentaBancoGeneral tipocuentabancogeneral:tipocuentabancogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuentabancogeneral.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO);
					iRow++;

					for(TipoCuentaBancoGeneral tipocuentabancogeneral:tipocuentabancogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuentabancogeneral.getbanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO);
					iRow++;

					for(TipoCuentaBancoGeneral tipocuentabancogeneral:tipocuentabancogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuentabancogeneral.gettipocuentabanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCuentaBancoGeneral tipocuentabancogeneral:tipocuentabancogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuentabancogeneral.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelTipoCuentaBancoGeneral(row);				
			//	iRow++;
			//}				
			
			//for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogeneralsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCuentaBancoGeneral(tipocuentabancogeneralAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco General",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaBancoGeneral();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCuentaBancoGeneral();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCuentaBancoGeneral();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCuentaBancoGeneral() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCuentaBancoGeneral.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCuentaBancoGeneral.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCuentaBancoGeneral.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCuentaBancoGeneral.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCuentaBancoGeneral.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCuentaBancoGeneral.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCuentaBancoGeneral.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCuentaBancoGeneral(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCuentaBancoGeneral(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCuentaBancoGeneral(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCuentaBancoGeneral(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCuentaBancoGeneral(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBancoGeneral(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCuentaBancoGeneral(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCuentaBancoGeneral() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral();
		
		this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGeneral(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCuentaBancoGeneral();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBancoGeneral() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaBancoGeneral(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaBancoGeneral(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCuentaBancoGeneral.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jCheckBoxPostAccionNuevoTipoCuentaBancoGeneral.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGeneral.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGeneral.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCuentaBancoGeneral.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jCheckBoxPostAccionNuevoTipoCuentaBancoGeneral.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGeneral.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGeneral.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCuentaBancoGeneral.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCuentaBancoGeneral.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCuentaBancoGeneral(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaBancoGeneral(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBancoGeneral() throws Exception {
		try	{
			if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCuentaBancoGeneral();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCuentaBancoGeneral() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCuentaBancoGeneral() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCuentaBancoGeneral.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCuentaBancoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCuentaBancoGeneral.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCuentaBancoGeneral.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral.addItem(reporte);
			}
			
			
			if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCuentaBancoGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaBancoGeneral();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaBancoGeneral() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCuentaBancoGeneral()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.getSelectedItem()!=null){this.id_bancoFK_IdBanco=((Banco)this.jComboBoxid_bancoFK_IdBancoTipoCuentaBancoGeneral.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.getSelectedItem()!=null){this.id_tipo_cuenta_bancoFK_IdTipoCuentaBanco=((TipoCuentaBanco)this.jComboBoxid_tipo_cuenta_bancoFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCuentaBancoGeneral(Boolean esInicializar) throws Exception {				
		if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCuentaBancoGeneral();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCuentaBancoGeneral() throws Exception {
		this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCuentaBancoGeneral() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCuentaBancoGeneralOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGeneralOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCuentaBancoGeneralPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGeneralPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCuentaBancoGeneral(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocuentabancogenerals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCuentaBancoGeneral.setModel(new TipoCuentaBancoGeneralModel(this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCuentaBancoGeneral.setModel(new TipoCuentaBancoGeneralModel(this.tipocuentabancogenerals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCuentaBancoGeneral!=null && this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCuentaBancoGeneral();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGeneral,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGeneralPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO,tipocuentabancogeneralConstantesFunciones.resaltarSeleccionarTipoCuentaBancoGeneral,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCuentaBancoGeneralConstantesFunciones.SCLASSWEBTITULO,tipocuentabancogeneralConstantesFunciones.resaltarSeleccionarTipoCuentaBancoGeneral,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGeneral,TipoCuentaBancoGeneralConstantesFunciones.LABEL_ID));

		if(this.tipocuentabancogeneralConstantesFunciones.mostraridTipoCuentaBancoGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoGeneralConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocuentabancogeneralConstantesFunciones.resaltaridTipoCuentaBancoGeneral,this.tipocuentabancogeneralConstantesFunciones.activaridTipoCuentaBancoGeneral,this,true,"idTipoCuentaBancoGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuentabancogeneralConstantesFunciones.resaltaridTipoCuentaBancoGeneral,this.tipocuentabancogeneralConstantesFunciones.activaridTipoCuentaBancoGeneral,this,true,"idTipoCuentaBancoGeneral","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGeneral,TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocuentabancogeneralConstantesFunciones.mostrarid_empresaTipoCuentaBancoGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocuentabancogeneralConstantesFunciones.resaltarid_empresaTipoCuentaBancoGeneral,this,this.tipocuentabancogeneralConstantesFunciones.activarid_empresaTipoCuentaBancoGeneral));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocuentabancogeneralConstantesFunciones.resaltarid_empresaTipoCuentaBancoGeneral,this,this.tipocuentabancogeneralConstantesFunciones.activarid_empresaTipoCuentaBancoGeneral,false,"id_empresaTipoCuentaBancoGeneral","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGeneral,TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO));

		if(this.tipocuentabancogeneralConstantesFunciones.mostrarid_bancoTipoCuentaBancoGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BancoTableCell(this.bancosForeignKey,this.tipocuentabancogeneralConstantesFunciones.resaltarid_bancoTipoCuentaBancoGeneral,this,this.tipocuentabancogeneralConstantesFunciones.activarid_bancoTipoCuentaBancoGeneral));
			tableColumn.setCellEditor(new BancoTableCell(this.bancosForeignKey,this.tipocuentabancogeneralConstantesFunciones.resaltarid_bancoTipoCuentaBancoGeneral,this,this.tipocuentabancogeneralConstantesFunciones.activarid_bancoTipoCuentaBancoGeneral,true,"id_bancoTipoCuentaBancoGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGeneral,TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO));

		if(this.tipocuentabancogeneralConstantesFunciones.mostrarid_tipo_cuenta_bancoTipoCuentaBancoGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCuentaBancoTableCell(this.tipocuentabancosForeignKey,this.tipocuentabancogeneralConstantesFunciones.resaltarid_tipo_cuenta_bancoTipoCuentaBancoGeneral,this,this.tipocuentabancogeneralConstantesFunciones.activarid_tipo_cuenta_bancoTipoCuentaBancoGeneral));
			tableColumn.setCellEditor(new TipoCuentaBancoTableCell(this.tipocuentabancosForeignKey,this.tipocuentabancogeneralConstantesFunciones.resaltarid_tipo_cuenta_bancoTipoCuentaBancoGeneral,this,this.tipocuentabancogeneralConstantesFunciones.activarid_tipo_cuenta_bancoTipoCuentaBancoGeneral,true,"id_tipo_cuenta_bancoTipoCuentaBancoGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGeneral,TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO));

		if(this.tipocuentabancogeneralConstantesFunciones.mostrarcodigoTipoCuentaBancoGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocuentabancogeneralConstantesFunciones.resaltarcodigoTipoCuentaBancoGeneral,this.tipocuentabancogeneralConstantesFunciones.activarcodigoTipoCuentaBancoGeneral,this,true,"codigoTipoCuentaBancoGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuentabancogeneralConstantesFunciones.resaltarcodigoTipoCuentaBancoGeneral,this.tipocuentabancogeneralConstantesFunciones.activarcodigoTipoCuentaBancoGeneral,this,true,"codigoTipoCuentaBancoGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCuentaBancoGeneral.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCuentaBancoGeneral.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCuentaBancoGeneral.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCuentaBancoGeneral.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCuentaBancoGeneral.moveColumn(this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCuentaBancoGeneral.moveColumn(this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCuentaBancoGeneral.moveColumn(this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCuentaBancoGeneral.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCuentaBancoGeneral.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCuentaBancoGeneral,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCuentaBancoGeneral.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCuentaBancoGeneral.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCuentaBancoGeneral.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocuentabancogenerals.size()-1;
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
		//this.jTableDatosTipoCuentaBancoGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCuentaBancoGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCuentaBancoGeneral();
			
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
				
				//this.isEsNuevoTipoCuentaBancoGeneral=false;
					
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
				if(this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCuentaBancoGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocuentabancogeneral.getsType().equals("DUPLICADO")
				   || this.tipocuentabancogeneral.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCuentaBancoGeneral=true;
				
				} else {
					this.isEsNuevoTipoCuentaBancoGeneral=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocuentabancogeneral.getId()>=0 && !this.tipocuentabancogeneral.getIsNew()) {						
						this.isEsNuevoTipoCuentaBancoGeneral=false;
						
					} else {
						this.isEsNuevoTipoCuentaBancoGeneral=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCuentaBancoGeneral(esRelaciones);						
				
				this.seleccionarTipoCuentaBancoGeneral(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocuentabancogeneral.getId()<0) {
					this.isEsNuevoTipoCuentaBancoGeneral=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCuentaBancoGeneral(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCuentaBancoGeneral(evt,rowIndex);
				}	
				
				if(this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCuentaBancoGeneral: " + this.dDif); 
					}
				}								
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCuentaBancoGeneral(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocuentabancogeneral)) {
					if(this.tipocuentabancogeneral.getId()>0) {
						this.tipocuentabancogeneral.setIsDeleted(true);
						
						this.tipocuentabancogeneralsEliminados.add(this.tipocuentabancogeneral);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().remove(this.tipocuentabancogeneral);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocuentabancogenerals.remove(this.tipocuentabancogeneral);				
					}
					
					
					((TipoCuentaBancoGeneralModel) this.jTableDatosTipoCuentaBancoGeneral.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCuentaBancoGeneral(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCuentaBancoGeneral) {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCuentaBancoGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocuentabancogeneralConstantesFunciones.cargarid_empresaTipoCuentaBancoGeneral || this.tipocuentabancogeneralConstantesFunciones.event_dependid_empresaTipoCuentaBancoGeneral) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocuentabancogeneral.getid_empresa());
									//this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocuentabancogeneral.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocuentabancogeneral.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocuentabancogeneral.getid_empresa(),false,"Formulario");

					//Banco
					if(!this.tipocuentabancogeneralConstantesFunciones.cargarid_bancoTipoCuentaBancoGeneral || this.tipocuentabancogeneralConstantesFunciones.event_dependid_bancoTipoCuentaBancoGeneral) {
						//this.cargarCombosBancosForeignKeyLista(" where id="+this.tipocuentabancogeneral.getid_banco());
									//this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
						this.bancosForeignKey=new ArrayList<Banco>();

						if(tipocuentabancogeneral.getBanco()!=null) {
							this.bancosForeignKey.add(tipocuentabancogeneral.getBanco());
						}

						this.addItemDefectoCombosForeignKeyBanco();
						this.cargarCombosFrameBancosForeignKey("Todos");
					}
					this.setActualBancoForeignKey(this.tipocuentabancogeneral.getid_banco(),false,"Formulario");

					//TipoCuentaBanco
					if(!this.tipocuentabancogeneralConstantesFunciones.cargarid_tipo_cuenta_bancoTipoCuentaBancoGeneral || this.tipocuentabancogeneralConstantesFunciones.event_dependid_tipo_cuenta_bancoTipoCuentaBancoGeneral) {
						//this.cargarCombosTipoCuentaBancosForeignKeyLista(" where id="+this.tipocuentabancogeneral.getid_tipo_cuenta_banco());
									//this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
						this.tipocuentabancosForeignKey=new ArrayList<TipoCuentaBanco>();

						if(tipocuentabancogeneral.getTipoCuentaBanco()!=null) {
							this.tipocuentabancosForeignKey.add(tipocuentabancogeneral.getTipoCuentaBanco());
						}

						this.addItemDefectoCombosForeignKeyTipoCuentaBanco();
						this.cargarCombosFrameTipoCuentaBancosForeignKey("Todos");
					}
					this.setActualTipoCuentaBancoForeignKey(this.tipocuentabancogeneral.getid_tipo_cuenta_banco(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCuentaBancoGeneral(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGeneral() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCuentaBancoGeneral(tipocuentabancogeneral,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCuentaBancoGeneral(tipocuentabancogeneral);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCuentaBancoGeneral(tipocuentabancogeneral,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBancoGeneral(tipocuentabancogeneral);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelidTipoCuentaBancoGeneral.setText(tipocuentabancogeneral.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTextFieldcodigoTipoCuentaBancoGeneral.setText(tipocuentabancogeneral.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCuentaBancoGeneral tipocuentabancogeneralLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocuentabancogeneralLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCuentaBancoGeneral tipocuentabancogeneralLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocuentabancogeneralLocal=this.tipocuentabancogeneral;
			} else {
				tipocuentabancogeneralLocal=this.tipocuentabancogeneralAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocuentabancogeneralLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCuentaBancoGeneral(tipocuentabancogeneralLocal,true);
					
					if(tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocuentabancogeneralLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocuentabancogeneralLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(tipocuentabancogeneral,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(tipocuentabancogeneral);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(tipocuentabancogeneral,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelidTipoCuentaBancoGeneral.getText()==null || this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelidTipoCuentaBancoGeneral.getText()=="" || this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelidTipoCuentaBancoGeneral.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelidTipoCuentaBancoGeneral.setText("0");
			}

			if(conColumnasBase) {tipocuentabancogeneral.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelidTipoCuentaBancoGeneral.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuentaBancoGeneralConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelIdTipoCuentaBancoGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocuentabancogeneral.setcodigo(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTextFieldcodigoTipoCuentaBancoGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelcodigoTipoCuentaBancoGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneralBean,TipoCuentaBancoGeneral tipocuentabancogeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipocuentabancogeneralBean.getid_banco()!=null && !tipocuentabancogeneralBean.getid_banco().equals(-1L))) {tipocuentabancogeneral.setid_banco(tipocuentabancogeneralBean.getid_banco());}
			if(conDefault || (!conDefault && tipocuentabancogeneralBean.getid_tipo_cuenta_banco()!=null && !tipocuentabancogeneralBean.getid_tipo_cuenta_banco().equals(-1L))) {tipocuentabancogeneral.setid_tipo_cuenta_banco(tipocuentabancogeneralBean.getid_tipo_cuenta_banco());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneralOrigen,TipoCuentaBancoGeneral tipocuentabancogeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocuentabancogeneralOrigen.getId()!=null && !tipocuentabancogeneralOrigen.getId().equals(0L))) {tipocuentabancogeneral.setId(tipocuentabancogeneralOrigen.getId());}}
			if(conDefault || (!conDefault && tipocuentabancogeneralOrigen.getid_banco()!=null && !tipocuentabancogeneralOrigen.getid_banco().equals(-1L))) {tipocuentabancogeneral.setid_banco(tipocuentabancogeneralOrigen.getid_banco());}
			if(conDefault || (!conDefault && tipocuentabancogeneralOrigen.getid_tipo_cuenta_banco()!=null && !tipocuentabancogeneralOrigen.getid_tipo_cuenta_banco().equals(-1L))) {tipocuentabancogeneral.setid_tipo_cuenta_banco(tipocuentabancogeneralOrigen.getid_tipo_cuenta_banco());}
			if(conDefault || (!conDefault && tipocuentabancogeneralOrigen.getcodigo()!=null && !tipocuentabancogeneralOrigen.getcodigo().equals(""))) {tipocuentabancogeneral.setcodigo(tipocuentabancogeneralOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelidTipoCuentaBancoGeneral.setText(tipocuentabancogeneral.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTextFieldcodigoTipoCuentaBancoGeneral.setText(tipocuentabancogeneral.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCuentaBancoGeneral(TipoCuentaBancoGeneralBean tipocuentabancogeneralBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelidTipoCuentaBancoGeneral.setText(tipocuentabancogeneralBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTextFieldcodigoTipoCuentaBancoGeneral.setText(tipocuentabancogeneralBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCuentaBancoGeneral(TipoCuentaBancoGeneralParameterReturnGeneral tipocuentabancogeneralReturnGeneral,TipoCuentaBancoGeneralBean tipocuentabancogeneralBean,Boolean conDefault) throws Exception { 
		try {
			TipoCuentaBancoGeneral tipocuentabancogeneralLocal=new TipoCuentaBancoGeneral();
			
			tipocuentabancogeneralLocal=tipocuentabancogeneralReturnGeneral.getTipoCuentaBancoGeneral();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocuentabancogeneralLocal.getId()!=null && !tipocuentabancogeneralLocal.getId().equals(0L))) {tipocuentabancogeneralBean.setId(tipocuentabancogeneralLocal.getId());}}
			if(conDefault || (!conDefault && tipocuentabancogeneralLocal.getid_banco()!=null && !tipocuentabancogeneralLocal.getid_banco().equals(-1L))) {tipocuentabancogeneralBean.setid_banco(tipocuentabancogeneralLocal.getid_banco());}
			if(conDefault || (!conDefault && tipocuentabancogeneralLocal.getid_tipo_cuenta_banco()!=null && !tipocuentabancogeneralLocal.getid_tipo_cuenta_banco().equals(-1L))) {tipocuentabancogeneralBean.setid_tipo_cuenta_banco(tipocuentabancogeneralLocal.getid_tipo_cuenta_banco());}
			if(conDefault || (!conDefault && tipocuentabancogeneralLocal.getcodigo()!=null && !tipocuentabancogeneralLocal.getcodigo().equals(""))) {tipocuentabancogeneralBean.setcodigo(tipocuentabancogeneralLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCuentaBancoGeneralGenerico(Long idTipoCuentaBancoGeneralSeleccionado,JComboBox jComboBoxTipoCuentaBancoGeneral,List<TipoCuentaBancoGeneral> tipocuentabancogeneralsLocal)throws Exception {
		try {
			TipoCuentaBancoGeneral  tipocuentabancogeneralTemp=null;

			for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogeneralsLocal) {
				if(tipocuentabancogeneralAux.getId()!=null && tipocuentabancogeneralAux.getId().equals(idTipoCuentaBancoGeneralSeleccionado)) {
					tipocuentabancogeneralTemp=tipocuentabancogeneralAux;
					break;
				}
			}

			jComboBoxTipoCuentaBancoGeneral.setSelectedItem(tipocuentabancogeneralTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCuentaBancoGeneralGenerico(JComboBox jComboBoxTipoCuentaBancoGeneral,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCuentaBancoGeneral.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCuentaBancoGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCuentaBancoGeneral.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCuentaBancoGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCuentaBancoGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCuentaBancoGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentabancogeneral=(TipoCuentaBancoGeneral) tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocuentabancogeneral =(TipoCuentaBancoGeneral) tipocuentabancogenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocuentabancogeneral.getIsNew() && !tipocuentabancogeneral.getIsChanged() && !tipocuentabancogeneral.getIsDeleted()) {
				sDescripcion=tipocuentabancogeneral.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocuentabancogeneral.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Banco")) {
			//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
			if(!tipocuentabancogeneral.getIsNew() && !tipocuentabancogeneral.getIsChanged() && !tipocuentabancogeneral.getIsDeleted()) {
				sDescripcion=tipocuentabancogeneral.getbanco_descripcion();
			} else {
				//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
				sDescripcion=tipocuentabancogeneral.getbanco_descripcion();
			}
		}

		if(sTipo.equals("TipoCuentaBanco")) {
			//sDescripcion=this.getActualTipoCuentaBancoForeignKeyDescripcion((Long)value);
			if(!tipocuentabancogeneral.getIsNew() && !tipocuentabancogeneral.getIsChanged() && !tipocuentabancogeneral.getIsDeleted()) {
				sDescripcion=tipocuentabancogeneral.gettipocuentabanco_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCuentaBancoForeignKeyDescripcion((Long)value);
				sDescripcion=tipocuentabancogeneral.gettipocuentabanco_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCuentaBancoGeneral tipocuentabancogeneralRow=new TipoCuentaBancoGeneral();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentabancogeneralRow=(TipoCuentaBancoGeneral) tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocuentabancogeneralRow=(TipoCuentaBancoGeneral) tipocuentabancogenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCuentaBancoGeneral(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral && this.isPermisoNuevoTipoCuentaBancoGeneral));			
			this.jButtonDuplicarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaBancoGeneral && this.isPermisoDuplicarTipoCuentaBancoGeneral));			
			this.jButtonCopiarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaBancoGeneral && this.isPermisoCopiarTipoCuentaBancoGeneral));
			this.jButtonVerFormTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaBancoGeneral && this.isPermisoVerFormTipoCuentaBancoGeneral));
			
			this.jButtonAbrirOrderByTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGeneral && this.isPermisoOrdenTipoCuentaBancoGeneral));			
			
			this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral && this.isPermisoNuevoTipoCuentaBancoGeneral));			
			this.jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral && this.isPermisoNuevoTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral));
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonModificarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral && this.isPermisoActualizarTipoCuentaBancoGeneral));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonActualizarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral && this.isPermisoActualizarTipoCuentaBancoGeneral));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonEliminarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral && this.isPermisoEliminarTipoCuentaBancoGeneral));
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonCancelarTipoCuentaBancoGeneral.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral);							
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral && this.isPermisoNuevoTipoCuentaBancoGeneral));						
			this.jButtonDuplicarToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaBancoGeneral && this.isPermisoDuplicarTipoCuentaBancoGeneral));						
			this.jButtonCopiarToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaBancoGeneral && this.isPermisoCopiarTipoCuentaBancoGeneral));			
			this.jButtonVerFormToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaBancoGeneral && this.isPermisoVerFormTipoCuentaBancoGeneral));			
			this.jButtonAbrirOrderByToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGeneral && this.isPermisoOrdenTipoCuentaBancoGeneral));
			this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral && this.isPermisoNuevoTipoCuentaBancoGeneral));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral && this.isPermisoNuevoTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral));			
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonModificarToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral && this.isPermisoActualizarTipoCuentaBancoGeneral));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonActualizarToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral  && this.isPermisoActualizarTipoCuentaBancoGeneral));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonEliminarToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral && this.isPermisoEliminarTipoCuentaBancoGeneral));
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonCancelarToolBarTipoCuentaBancoGeneral.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral);				
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral && this.isPermisoNuevoTipoCuentaBancoGeneral));			
			this.jMenuItemDuplicarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaBancoGeneral && this.isPermisoDuplicarTipoCuentaBancoGeneral));			
			this.jMenuItemCopiarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaBancoGeneral && this.isPermisoCopiarTipoCuentaBancoGeneral));			
			this.jMenuItemVerFormTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaBancoGeneral && this.isPermisoVerFormTipoCuentaBancoGeneral));			
			this.jMenuItemAbrirOrderByTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGeneral && this.isPermisoOrdenTipoCuentaBancoGeneral));			
			//this.jMenuItemMostrarOcultarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGeneral && this.isPermisoOrdenTipoCuentaBancoGeneral));
			this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGeneral && this.isPermisoOrdenTipoCuentaBancoGeneral));			
			//this.jMenuItemDetalleMostrarOcultarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGeneral && this.isPermisoOrdenTipoCuentaBancoGeneral));			
			this.jMenuItemNuevoRelacionesTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral && this.isPermisoNuevoTipoCuentaBancoGeneral));			
			this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral && this.isPermisoNuevoTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral));									
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemModificarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral && this.isPermisoActualizarTipoCuentaBancoGeneral));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemActualizarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral && this.isPermisoActualizarTipoCuentaBancoGeneral));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemEliminarTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral && this.isPermisoEliminarTipoCuentaBancoGeneral));
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemCancelarTipoCuentaBancoGeneral.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral);				
			}
			
			this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral));						
			this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=this.jButtonNuevoTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCuentaBancoGeneral=this.jButtonDuplicarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaCopiarTipoCuentaBancoGeneral=this.jButtonCopiarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaVerFormTipoCuentaBancoGeneral=this.jButtonVerFormTipoCuentaBancoGeneral.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCuentaBancoGeneral=this.jButtonAbrirOrderByTipoCuentaBancoGeneral.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral=this.jButtonModificarTipoCuentaBancoGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonActualizarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonEliminarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonCancelarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosTipoCuentaBancoGeneral.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=this.jButtonNuevoToolBarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonModificarToolBarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonActualizarToolBarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonEliminarToolBarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonCancelarToolBarTipoCuentaBancoGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=this.jButtonGuardarCambiosToolBarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGeneral.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=this.jMenuItemNuevoTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=this.jMenuItemNuevoRelacionesTipoCuentaBancoGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemModificarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemActualizarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemEliminarTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemCancelarTipoCuentaBancoGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGeneral.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCuentaBancoGeneral(Boolean esInicializar) {
		if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCuentaBancoGeneral();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGeneral(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCuentaBancoGeneral() {
		this.jButtonNuevoTipoCuentaBancoGeneral.setVisible(this.isPermisoNuevoTipoCuentaBancoGeneral);			
		this.jButtonDuplicarTipoCuentaBancoGeneral.setVisible(this.isPermisoDuplicarTipoCuentaBancoGeneral);			
		this.jButtonCopiarTipoCuentaBancoGeneral.setVisible(this.isPermisoCopiarTipoCuentaBancoGeneral);			
		this.jButtonVerFormTipoCuentaBancoGeneral.setVisible(this.isPermisoVerFormTipoCuentaBancoGeneral);			
		
		this.jButtonAbrirOrderByTipoCuentaBancoGeneral.setVisible(this.isPermisoOrdenTipoCuentaBancoGeneral);					
		
		this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.setVisible(this.isPermisoNuevoTipoCuentaBancoGeneral);			
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonModificarTipoCuentaBancoGeneral.setVisible(this.isPermisoActualizarTipoCuentaBancoGeneral);	
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonActualizarTipoCuentaBancoGeneral.setVisible(this.isPermisoActualizarTipoCuentaBancoGeneral);	
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonEliminarTipoCuentaBancoGeneral.setVisible(this.isPermisoEliminarTipoCuentaBancoGeneral);
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonCancelarTipoCuentaBancoGeneral.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral);						
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosTipoCuentaBancoGeneral.setVisible(this.isPermisoGuardarCambiosTipoCuentaBancoGeneral);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.setVisible(this.isPermisoActualizarTipoCuentaBancoGeneral);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCuentaBancoGeneral() {
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonModificarTipoCuentaBancoGeneral.setVisible(this.isPermisoActualizarTipoCuentaBancoGeneral);	
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonActualizarTipoCuentaBancoGeneral.setVisible(this.isPermisoActualizarTipoCuentaBancoGeneral);	
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonEliminarTipoCuentaBancoGeneral.setVisible(this.isPermisoEliminarTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonCancelarTipoCuentaBancoGeneral.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral);							
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosTipoCuentaBancoGeneral.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral && this.isPermisoGuardarCambiosTipoCuentaBancoGeneral));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCuentaBancoGeneral() {
		if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCuentaBancoGeneral();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCuentaBancoGeneral() {
	}
	
	public void jTableDatosTipoCuentaBancoGeneralListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCuentaBancoGeneral(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCuentaBancoGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.gettipocuentabancogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabancogeneral==null) {
						this.tipocuentabancogeneral = new TipoCuentaBancoGeneral();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
				}

				if(this.tipocuentabancogeneral.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocuentabancogeneral.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoCuentaBancoGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoCuentaBancoGeneral(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCuentaBancoGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCuentaBancoGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.gettipocuentabancogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocuentabancogeneralLogic.getConnexion());

				if(this.tipocuentabancogeneral.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocuentabancogeneral.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCuentaBancoGeneral=(TitledBorder)this.jScrollPanelDatosTipoCuentaBancoGeneral.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoCuentaBancoGeneral.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoCuentaBancoGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.gettipocuentabancogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabancogeneral==null) {
						this.tipocuentabancogeneral = new TipoCuentaBancoGeneral();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
				}

				if(this.tipocuentabancogeneral.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocuentabancogeneral.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bancoTipoCuentaBancoGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobanco=true;

			idTienePermisobanco=this.tienePermisosUsuarioEnPaginaWebTipoCuentaBancoGeneral(BancoConstantesFunciones.CLASSNAME);

			if(idTienePermisobanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCuentaBancoGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCuentaBancoGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.gettipocuentabancogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);

				this.bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bancoBeanSwingJInternalFrame.getBancoLogic().setConnexion(this.tipocuentabancogeneralLogic.getConnexion());

				if(this.tipocuentabancogeneral.getid_banco()!=null) {
					this.bancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bancoBeanSwingJInternalFrame.setIdActual(this.tipocuentabancogeneral.getid_banco());
					this.bancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBanco();
				}

				JInternalFrameBase jinternalFrame =this.bancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCuentaBancoGeneral=(TitledBorder)this.jScrollPanelDatosTipoCuentaBancoGeneral.getBorder();
				TitledBorder titledBorderbanco=(TitledBorder)this.bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.getBorder();

				titledBorderbanco.setTitle(titledBorderTipoCuentaBancoGeneral.getTitle() + " -> Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bancoTipoCuentaBancoGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.gettipocuentabancogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabancogeneral==null) {
						this.tipocuentabancogeneral = new TipoCuentaBancoGeneral();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
				}

				if(this.tipocuentabancogeneral.getid_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_banco = "+this.tipocuentabancogeneral.getid_banco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocuentabanco=true;

			idTienePermisotipocuentabanco=this.tienePermisosUsuarioEnPaginaWebTipoCuentaBancoGeneral(TipoCuentaBancoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocuentabanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoCuentaBancoGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoCuentaBancoGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.gettipocuentabancogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);

				this.tipocuentabancoBeanSwingJInternalFrame=new TipoCuentaBancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocuentabancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocuentabancoBeanSwingJInternalFrame.getTipoCuentaBancoLogic().setConnexion(this.tipocuentabancogeneralLogic.getConnexion());

				if(this.tipocuentabancogeneral.getid_tipo_cuenta_banco()!=null) {
					this.tipocuentabancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocuentabancoBeanSwingJInternalFrame.setIdActual(this.tipocuentabancogeneral.getid_tipo_cuenta_banco());
					this.tipocuentabancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocuentabancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocuentabancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCuentaBanco();
				}

				JInternalFrameBase jinternalFrame =this.tipocuentabancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoCuentaBancoGeneral=(TitledBorder)this.jScrollPanelDatosTipoCuentaBancoGeneral.getBorder();
				TitledBorder titledBordertipocuentabanco=(TitledBorder)this.tipocuentabancoBeanSwingJInternalFrame.jScrollPanelDatosTipoCuentaBanco.getBorder();

				titledBordertipocuentabanco.setTitle(titledBorderTipoCuentaBancoGeneral.getTitle() + " -> Tipo Cuenta Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.gettipocuentabancogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabancogeneral==null) {
						this.tipocuentabancogeneral = new TipoCuentaBancoGeneral();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
				}

				if(this.tipocuentabancogeneral.getid_tipo_cuenta_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_cuenta_banco = "+this.tipocuentabancogeneral.getid_tipo_cuenta_banco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCuentaBancoGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.gettipocuentabancogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabancogeneral==null) {
						this.tipocuentabancogeneral = new TipoCuentaBancoGeneral();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);
				}

				if(this.tipocuentabancogeneral.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocuentabancogeneral.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBancoTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);

			this.getTipoCuentaBancoGeneralsFK_IdBanco();

			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);

			//if(TipoCuentaBancoGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);

			this.getTipoCuentaBancoGeneralsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);

			//if(TipoCuentaBancoGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoCuentaBancoTipoCuentaBancoGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);

			this.getTipoCuentaBancoGeneralsFK_IdTipoCuentaBanco();

			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);

			//if(TipoCuentaBancoGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoCuentaBancoGeneral() {
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral!=null) {
			this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.dispose();
			this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral=null;
		}
		
		if(this.jInternalFrameImportacionTipoCuentaBancoGeneral!=null) {
			this.jInternalFrameImportacionTipoCuentaBancoGeneral.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCuentaBancoGeneral.dispose();
			this.jInternalFrameImportacionTipoCuentaBancoGeneral=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCuentaBancoGeneral();
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCuentaBancoGeneral")) {
				jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCuentaBancoGeneral")) {
				jButtonDuplicarTipoCuentaBancoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCuentaBancoGeneral")) {
				jButtonCopiarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCuentaBancoGeneral")) {
				jButtonVerFormTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCuentaBancoGeneral")) {
				jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCuentaBancoGeneral")) {
				jButtonDuplicarTipoCuentaBancoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCuentaBancoGeneral")) {
				jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCuentaBancoGeneral")) {
				jButtonDuplicarTipoCuentaBancoGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCuentaBancoGeneral")) {
				jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCuentaBancoGeneral")) {
				jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCuentaBancoGeneral")) {
				jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCuentaBancoGeneral")) {
				jButtonModificarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCuentaBancoGeneral")) {
				jButtonModificarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCuentaBancoGeneral")) {
				jButtonModificarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCuentaBancoGeneral")) {
				jButtonActualizarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCuentaBancoGeneral")) {
				jButtonActualizarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCuentaBancoGeneral")) {
				jButtonActualizarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCuentaBancoGeneral")) {
				jButtonEliminarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCuentaBancoGeneral")) {
				jButtonEliminarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCuentaBancoGeneral")) {
				jButtonEliminarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCuentaBancoGeneral")) {
				jButtonCancelarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCuentaBancoGeneral")) {
				jButtonCancelarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCuentaBancoGeneral")) {
				jButtonCancelarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCuentaBancoGeneral")) {
				jButtonCerrarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCuentaBancoGeneral")) {
				jButtonCerrarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCuentaBancoGeneral")) {
				jButtonCerrarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCuentaBancoGeneral")) {
				jButtonMostrarOcultarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCuentaBancoGeneral")) {
				jButtonCancelarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCuentaBancoGeneral")) {
				jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCuentaBancoGeneral")) {
				jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCuentaBancoGeneral")) {
				jButtonCopiarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCuentaBancoGeneral")) {
				jButtonVerFormTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCuentaBancoGeneral")) {
				jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCuentaBancoGeneral")) {
				jButtonCopiarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCuentaBancoGeneral")) {
				jButtonVerFormTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCuentaBancoGeneral")) {
				jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCuentaBancoGeneral")) {
				jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCuentaBancoGeneral")) {
				jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCuentaBancoGeneral")) {
				jButtonRecargarInformacionTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCuentaBancoGeneral")) {
				jButtonRecargarInformacionTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCuentaBancoGeneral")) {
				jButtonRecargarInformacionTipoCuentaBancoGeneralActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCuentaBancoGeneral")) {
				jButtonAnterioresTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCuentaBancoGeneral")) {
				jButtonAnterioresTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCuentaBancoGeneral")) {
				jButtonAnterioresTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCuentaBancoGeneral")) {
				jButtonSiguientesTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCuentaBancoGeneral")) {
				jButtonSiguientesTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCuentaBancoGeneral")) {
				jButtonSiguientesTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCuentaBancoGeneral") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCuentaBancoGeneral")) {
				jButtonAbrirOrderByTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCuentaBancoGeneral") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCuentaBancoGeneral")) {
				jButtonMostrarOcultarTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCuentaBancoGeneral")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCuentaBancoGeneral")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCuentaBancoGeneral")) {
				jButtonCerrarReporteDinamicoTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCuentaBancoGeneral")) {
				jButtonGenerarReporteDinamicoTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCuentaBancoGeneral")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCuentaBancoGeneral")) {
				jButtonCerrarImportacionTipoCuentaBancoGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCuentaBancoGeneral")) {
				
				jButtonGenerarImportacionTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCuentaBancoGeneral")) {
				
				jButtonAbrirImportacionTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCuentaBancoGeneral")) {
				jComboBoxTiposAccionesTipoCuentaBancoGeneralActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCuentaBancoGeneral")) {
				jComboBoxTiposRelacionesTipoCuentaBancoGeneralActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCuentaBancoGeneral")) {
				jComboBoxTiposAccionesTipoCuentaBancoGeneralActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCuentaBancoGeneral")) {
				
				jComboBoxTiposSeleccionarTipoCuentaBancoGeneralActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCuentaBancoGeneral")) {
				jTextFieldValorCampoGeneralTipoCuentaBancoGeneralActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCuentaBancoGeneral")) {
				jButtonAbrirOrderByTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCuentaBancoGeneral")) {
				jButtonAbrirOrderByTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCuentaBancoGeneral")) {
				jButtonCerrarOrderByTipoCuentaBancoGeneralActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCuentaBancoGeneralBusqueda")) {
				this.jButtonidTipoCuentaBancoGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCuentaBancoGeneralUpdate")) {
				this.jButtonid_empresaTipoCuentaBancoGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCuentaBancoGeneralBusqueda")) {
				this.jButtonid_empresaTipoCuentaBancoGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoTipoCuentaBancoGeneralUpdate")) {
				this.jButtonid_bancoTipoCuentaBancoGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoTipoCuentaBancoGeneralBusqueda")) {
				this.jButtonid_bancoTipoCuentaBancoGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate")) {
				this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda")) {
				this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCuentaBancoGeneralBusqueda")) {
				this.jButtoncodigoTipoCuentaBancoGeneralBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdBancoTipoCuentaBancoGeneral")) {
				this.jButtonFK_IdBancoTipoCuentaBancoGeneralActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoCuentaBancoTipoCuentaBancoGeneral")) {
				this.jButtonFK_IdTipoCuentaBancoTipoCuentaBancoGeneralActionPerformed(evt);
			}
			
			;
			
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCuentaBancoGeneral();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				


				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCuentaBancoGeneral tipocuentabancogeneralLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocuentabancogeneralLocal=this.tipocuentabancogeneral;
			} else {
				tipocuentabancogeneralLocal=this.tipocuentabancogeneralAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
							
				
				


				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
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
			
			


			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
								
						
				


				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGeneral.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
								
				
				


				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
							
				
				


				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGeneral.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
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
			
			


			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
								
				
				


				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCuentaBancoGeneral")) {
					jCheckBoxSeleccionarTodosTipoCuentaBancoGeneralItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCuentaBancoGeneral")) {
					jCheckBoxSeleccionadosTipoCuentaBancoGeneralItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCuentaBancoGeneral")) {
					
				}
				
				


				
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
												
				
				


				
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
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
			
			


			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGeneral.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGeneral.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancogeneral);
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
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
				
				


				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGeneral.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancogeneralAnterior =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCuentaBancoGeneral")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCuentaBancoGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGeneral.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocuentabancogeneral =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocuentabancogeneral);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCuentaBancoGeneral")) {
				
				}
				
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCuentaBancoGeneral")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCuentaBancoGeneral.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCuentaBancoGeneral")) {
			
			}
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCuentaBancoGeneral();
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCuentaBancoGeneral")) {
				jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCuentaBancoGeneral")) {
				jButtonDuplicarTipoCuentaBancoGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCuentaBancoGeneral")) {
				jButtonCopiarTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCuentaBancoGeneral")) {
				jButtonVerFormTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCuentaBancoGeneral")) {
				jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCuentaBancoGeneral")) {
				jButtonModificarTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCuentaBancoGeneral")) {
				jButtonActualizarTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCuentaBancoGeneral")) {
				jButtonEliminarTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCuentaBancoGeneral")) {
				jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCuentaBancoGeneral")) {
				jButtonCancelarTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCuentaBancoGeneral")) {
				jButtonCerrarTipoCuentaBancoGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCuentaBancoGeneral")) {
				jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCuentaBancoGeneral")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCuentaBancoGeneral")) {
				jButtonAbrirOrderByTipoCuentaBancoGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCuentaBancoGeneral")) {
				jButtonRecargarInformacionTipoCuentaBancoGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCuentaBancoGeneral")) {
				jButtonAnterioresTipoCuentaBancoGeneralActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCuentaBancoGeneral")) {
				jButtonSiguientesTipoCuentaBancoGeneralActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCuentaBancoGeneralBusqueda")) {
				this.jButtonidTipoCuentaBancoGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoCuentaBancoGeneralUpdate")) {
				this.jButtonid_empresaTipoCuentaBancoGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoCuentaBancoGeneralBusqueda")) {
				this.jButtonid_empresaTipoCuentaBancoGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoTipoCuentaBancoGeneralUpdate")) {
				this.jButtonid_bancoTipoCuentaBancoGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoTipoCuentaBancoGeneralBusqueda")) {
				this.jButtonid_bancoTipoCuentaBancoGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate")) {
				this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda")) {
				this.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCuentaBancoGeneralBusqueda")) {
				this.jButtoncodigoTipoCuentaBancoGeneralBusquedaActionPerformed(evt);
			}
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCuentaBancoGeneral();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCuentaBancoGeneral")) {
				closingInternalFrameTipoCuentaBancoGeneral();
				
			} else if(sTipo.equals("jButtonCancelarTipoCuentaBancoGeneral")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCuentaBancoGeneral = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCuentaBancoGeneralBeanSwingJInternalFrame jInternalFrameParent=(TipoCuentaBancoGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCuentaBancoGeneral.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCuentaBancoGeneralActionPerformed(null);
			}
			
			TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocuentabancogeneral,new Object(),this.tipocuentabancogeneralParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCuentaBancoGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCuentaBancoGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCuentaBancoGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocuentabancogeneral)) {
			if(!esControlTabla) {
				if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);			
				}
				
				if(this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocuentabancogeneralReturnGeneral=tipocuentabancogeneralLogic.procesarEventosTipoCuentaBancoGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals(),this.tipocuentabancogeneral,this.tipocuentabancogeneralParameterGeneral,this.isEsNuevoTipoCuentaBancoGeneral,classes);//this.tipocuentabancogeneralLogic.getTipoCuentaBancoGeneral()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCuentaBancoGeneral(this.tipocuentabancogeneralReturnGeneral,this.tipocuentabancogeneralBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCuentaBancoGeneral(classes,this.tipocuentabancogeneralReturnGeneral,this.tipocuentabancogeneralBean,false);
					}
						
					if(this.tipocuentabancogeneralReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBancoGeneral(this.tipocuentabancogeneralReturnGeneral.getTipoCuentaBancoGeneral());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCuentaBancoGeneral(this.tipocuentabancogeneralReturnGeneral.getTipoCuentaBancoGeneral());	
					}
						
					if(this.tipocuentabancogeneralReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaBancoGeneral(this.tipocuentabancogeneralReturnGeneral.getTipoCuentaBancoGeneral(),classes);//this.tipocuentabancogeneralBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaBancoGeneral(this.tipocuentabancogeneral,classes);//this.tipocuentabancogeneralBean);									
				}
			
				if(TipoCuentaBancoGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGeneral(this.tipocuentabancogeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGeneral(this.tipocuentabancogeneral);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocuentabancogeneralAnterior!=null) {
						this.tipocuentabancogeneral=this.tipocuentabancogeneralAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocuentabancogeneralReturnGeneral=tipocuentabancogeneralLogic.procesarEventosTipoCuentaBancoGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals(),this.tipocuentabancogeneral,this.tipocuentabancogeneralParameterGeneral,this.isEsNuevoTipoCuentaBancoGeneral,classes);//this.tipocuentabancogeneralLogic.getTipoCuentaBancoGeneral()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocuentabancogeneralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocuentabancogeneralReturnGeneral.getTipoCuentaBancoGeneral(),tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocuentabancogeneralReturnGeneral.getTipoCuentaBancoGeneral(),this.tipocuentabancogenerals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCuentaBancoGeneral.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCuentaBancoGeneral.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCuentaBancoGeneral();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCuentaBancoGeneral() throws Exception {
		
		TipoCuentaBancoGeneralModel tipocuentabancogeneralModel=(TipoCuentaBancoGeneralModel)this.jTableDatosTipoCuentaBancoGeneral.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentabancogeneralModel.tipocuentabancogenerals=this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocuentabancogeneralModel.tipocuentabancogenerals=this.tipocuentabancogenerals;
		}
		
		
		((TipoCuentaBancoGeneralModel) this.jTableDatosTipoCuentaBancoGeneral.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCuentaBancoGeneral() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocuentabancogeneralAnterior(),this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocuentabancogeneralAnterior(),this.tipocuentabancogenerals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCuentaBancoGeneral();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
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
										
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabancogeneral,new Object(),generalEntityParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCuentaBancoGeneralConstantesFunciones.getClassesRelationshipsOfTipoCuentaBancoGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCuentaBancoGeneralConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCuentaBancoGeneral(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCuentaBancoGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabancogeneral,new Object(),generalEntityParameterGeneral,this.tipocuentabancogeneralReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCuentaBancoGeneral(TipoCuentaBancoGeneralBean tipocuentabancogeneralBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCuentaBancoGeneral(ArrayList<Classe> classes,TipoCuentaBancoGeneralReturnGeneral tipocuentabancogeneralReturnGeneral,TipoCuentaBancoGeneralBean tipocuentabancogeneralBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocuentabancogeneral)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral = new TipoCuentaBancoGeneralDetalleFormJInternalFrame(jDesktopPane,this.tipocuentabancogeneralSessionBean.getConGuardarRelaciones(),this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setVisible(false);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.tipocuentabancogeneralLogic=this.tipocuentabancogeneralLogic;
		
		this.cargarCombosFrameForeignKeyTipoCuentaBancoGeneral("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCuentaBancoGeneral();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCuentaBancoGeneral();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCuentaBancoGeneral("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCuentaBancoGeneral();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCuentaBancoGeneral"));
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonModificarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"ModificarTipoCuentaBancoGeneral"));

		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonModificarToolBarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCuentaBancoGeneral"));
					
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemModificarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCuentaBancoGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonActualizarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"ActualizarTipoCuentaBancoGeneral"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonActualizarToolBarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCuentaBancoGeneral"));
						
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemActualizarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCuentaBancoGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonEliminarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"EliminarTipoCuentaBancoGeneral"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonEliminarToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCuentaBancoGeneral"));
								
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemEliminarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCuentaBancoGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonCancelarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"CancelarTipoCuentaBancoGeneral"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonCancelarToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCuentaBancoGeneral"));
					
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemCancelarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCuentaBancoGeneral"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemDetalleCerrarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCuentaBancoGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaBancoGeneral"));
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaBancoGeneral"));
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCuentaBancoGeneral"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonidTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaBancoGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_empresaTipoCuentaBancoGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_empresaTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_bancoTipoCuentaBancoGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_bancoTipoCuentaBancoGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_bancoTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoTipoCuentaBancoGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtoncodigoTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuentaBancoGeneralBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTabbedPaneRelacionesTipoCuentaBancoGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCuentaBancoGeneral"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCuentaBancoGeneral"));
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCuentaBancoGeneral"));
		}
		
		this.jTableDatosTipoCuentaBancoGeneral.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCuentaBancoGeneral"));
		
		this.jTableDatosTipoCuentaBancoGeneral.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCuentaBancoGeneral"));
		
		this.jButtonNuevoTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"NuevoTipoCuentaBancoGeneral"));
		
		this.jButtonDuplicarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"DuplicarTipoCuentaBancoGeneral"));
		
		this.jButtonCopiarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"CopiarTipoCuentaBancoGeneral"));
		
		this.jButtonVerFormTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"VerFormTipoCuentaBancoGeneral"));
		
		
		this.jButtonNuevoToolBarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCuentaBancoGeneral"));
			
		this.jButtonDuplicarToolBarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCuentaBancoGeneral"));
			
		this.jMenuItemNuevoTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCuentaBancoGeneral"));
			
		this.jMenuItemDuplicarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCuentaBancoGeneral"));		
		
		
		this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCuentaBancoGeneral"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCuentaBancoGeneral"));
			
		this.jMenuItemNuevoRelacionesTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCuentaBancoGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonModificarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"ModificarTipoCuentaBancoGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonModificarToolBarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCuentaBancoGeneral"));
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemModificarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCuentaBancoGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonActualizarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"ActualizarTipoCuentaBancoGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonActualizarToolBarTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCuentaBancoGeneral"));
				
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemActualizarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCuentaBancoGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonEliminarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"EliminarTipoCuentaBancoGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonEliminarToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCuentaBancoGeneral"));
						
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemEliminarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCuentaBancoGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonCancelarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"CancelarTipoCuentaBancoGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonCancelarToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCuentaBancoGeneral"));
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemCancelarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCuentaBancoGeneral"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCuentaBancoGeneral"));		
		
		
		this.jButtonCerrarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"CerrarTipoCuentaBancoGeneral"));
		
		
		this.jButtonCerrarToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCuentaBancoGeneral"));
			
		this.jMenuItemCerrarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCuentaBancoGeneral"));
			
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jMenuItemDetalleCerrarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCuentaBancoGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCuentaBancoGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaBancoGeneral"));
		}
		
		this.jButtonCopiarToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCuentaBancoGeneral"));
			
		this.jButtonVerFormToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCuentaBancoGeneral"));
		
		this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCuentaBancoGeneral"));
			
		this.jMenuItemCopiarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCuentaBancoGeneral"));		
		
		this.jMenuItemVerFormTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCuentaBancoGeneral"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCuentaBancoGeneral"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCuentaBancoGeneral"));
			
		this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCuentaBancoGeneral"));		
		
		
		
		this.jButtonRecargarInformacionTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCuentaBancoGeneral"));
					
		this.jButtonRecargarInformacionToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCuentaBancoGeneral"));
		
		this.jMenuItemRecargarInformacionTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCuentaBancoGeneral"));		
		
		
		
		this.jButtonAnterioresTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"AnterioresTipoCuentaBancoGeneral"));
		
		
		this.jButtonAnterioresToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCuentaBancoGeneral"));
		
		this.jMenuItemAnterioresTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCuentaBancoGeneral"));		
		
		
		this.jButtonSiguientesTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"SiguientesTipoCuentaBancoGeneral"));
		
		
		this.jButtonSiguientesToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCuentaBancoGeneral"));
			
		this.jMenuItemSiguientesTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCuentaBancoGeneral"));
			
		this.jMenuItemAbrirOrderByTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCuentaBancoGeneral"));
			
		this.jMenuItemMostrarOcultarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCuentaBancoGeneral"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCuentaBancoGeneral"));
			
		this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCuentaBancoGeneral"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCuentaBancoGeneral"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCuentaBancoGeneral"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCuentaBancoGeneral"));

		this.jCheckBoxSeleccionadosTipoCuentaBancoGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCuentaBancoGeneral"));
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCuentaBancoGeneral"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCuentaBancoGeneral"));
			
		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCuentaBancoGeneral"));
					
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCuentaBancoGeneral"));
			
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCuentaBancoGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonidTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaBancoGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_empresaTipoCuentaBancoGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_empresaTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_bancoTipoCuentaBancoGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_bancoTipoCuentaBancoGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_bancoTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoTipoCuentaBancoGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtoncodigoTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuentaBancoGeneralBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBancoTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"FK_IdBancoTipoCuentaBancoGeneral"));

			this.jButtonFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuentaBancoTipoCuentaBancoGeneral"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaBancoGeneral"));
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaBancoGeneral"));
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaBancoGeneral"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaBancoGeneral"));				
			//this.jButtonGenerarReporteDinamicoTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaBancoGeneral"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaBancoGeneral"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCuentaBancoGeneral!=null) {
				this.jInternalFrameImportacionTipoCuentaBancoGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCuentaBancoGeneral"));
				this.jInternalFrameImportacionTipoCuentaBancoGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCuentaBancoGeneral"));
				this.jInternalFrameImportacionTipoCuentaBancoGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCuentaBancoGeneral"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCuentaBancoGeneral"));
			
			this.jButtonAbrirOrderByToolBarTipoCuentaBancoGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCuentaBancoGeneral"));			
			
			if(this.jInternalFrameOrderByTipoCuentaBancoGeneral!=null) {
				this.jInternalFrameOrderByTipoCuentaBancoGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCuentaBancoGeneral"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTabbedPaneRelacionesTipoCuentaBancoGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCuentaBancoGeneral"));
		
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
            		closingInternalFrameTipoCuentaBancoGeneral();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCuentaBancoGeneral = (JInternalFrameBase)event.getSource();
	            	
	            TipoCuentaBancoGeneralBeanSwingJInternalFrame jInternalFrameParent=(TipoCuentaBancoGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCuentaBancoGeneral.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCuentaBancoGeneralActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCuentaBancoGeneral.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCuentaBancoGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCuentaBancoGeneral.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCuentaBancoGeneral.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCuentaBancoGeneral";
		inputMap = this.jButtonNuevoTipoCuentaBancoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCuentaBancoGeneral";
		inputMap = this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCuentaBancoGeneralActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCuentaBancoGeneral";
		inputMap = this.jButtonModificarTipoCuentaBancoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCuentaBancoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCuentaBancoGeneral";
		inputMap = this.jButtonActualizarTipoCuentaBancoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCuentaBancoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCuentaBancoGeneral";
		inputMap = this.jButtonEliminarTipoCuentaBancoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCuentaBancoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCuentaBancoGeneral";
		inputMap = this.jButtonCancelarTipoCuentaBancoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCuentaBancoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCuentaBancoGeneral";
		inputMap = this.jButtonCerrarTipoCuentaBancoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCuentaBancoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCuentaBancoGeneral";
		inputMap = this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosTipoCuentaBancoGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonGuardarCambiosTipoCuentaBancoGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGeneral.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCuentaBancoGeneralItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCuentaBancoGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCuentaBancoGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCuentaBancoGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonidTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaBancoGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_empresaTipoCuentaBancoGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_empresaTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoCuentaBancoGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_bancoTipoCuentaBancoGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_bancoTipoCuentaBancoGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_bancoTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoTipoCuentaBancoGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_bancoTipoCuentaBancoGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtonid_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_cuenta_bancoTipoCuentaBancoGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jButtoncodigoTipoCuentaBancoGeneralBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuentaBancoGeneralBusqueda"));
		
		
		this.jButtonFK_IdBancoTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"FK_IdBancoTipoCuentaBancoGeneral"));

		this.jButtonFK_IdTipoCuentaBancoTipoCuentaBancoGeneral.addActionListener(new ButtonActionListener(this,"FK_IdTipoCuentaBancoTipoCuentaBancoGeneral"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCuentaBancoGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCuentaBancoGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCuentaBancoGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCuentaBancoGeneral.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCuentaBancoGeneral(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
					tipocuentabancogeneralAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogenerals) {
					tipocuentabancogeneralAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCuentaBancoGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
						tipocuentabancogeneralAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogenerals) {
						tipocuentabancogeneralAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogenerals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCuentaBancoGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCuentaBancoGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCuentaBancoGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCuentaBancoGeneral.getSelectedRows();
			
			TipoCuentaBancoGeneral tipocuentabancogeneralLocal=new TipoCuentaBancoGeneral();
			
			//this.seleccionarTodosTipoCuentaBancoGeneral(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancogeneralLocal =(TipoCuentaBancoGeneral) this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals().toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocuentabancogeneralLocal =(TipoCuentaBancoGeneral) this.tipocuentabancogenerals.toArray()[this.jTableDatosTipoCuentaBancoGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocuentabancogeneralLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
						tipocuentabancogeneralAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogenerals) {
						tipocuentabancogeneralAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCuentaBancoGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCuentaBancoGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCuentaBancoGeneralItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCuentaBancoGeneralParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCuentaBancoGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCuentaBancoGeneral.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
				
						if(sTipoSeleccionar.equals(TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocuentabancogeneralAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogenerals) {
					
						if(sTipoSeleccionar.equals(TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocuentabancogeneralAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCuentaBancoGeneralActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCuentaBancoGeneral=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCuentaBancoGeneral) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCuentaBancoGeneral(conSplash);
				
					this.generarReporteTipoCuentaBancoGeneralsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCuentaBancoGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCuentaBancoGeneralsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCuentaBancoGeneralsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCuentaBancoGeneral();
				
				this.exportarTipoCuentaBancoGeneralsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCuentaBancoGenerals();
				//this.importarTipoCuentaBancoGenerals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCuentaBancoGeneral();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCuentaBancoGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Cuenta Banco General", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCuentaBancoGeneral();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCuentaBancoGeneral)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCuentaBancoGeneral(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuenta Banco General",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoCuentaBancoGeneralBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoCuentaBancoGeneral) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoCuentaBancoGeneral(conSplash);
					
						//this.actualizarParametrosGeneralTipoCuentaBancoGeneral();
						
						this.generarReporteProcesoAccionTipoCuentaBancoGeneralsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Cuenta Banco GeneralES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Cuenta Banco General", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoCuentaBancoGeneral();
				
						this.actualizarParametrosGeneralTipoCuentaBancoGeneral();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocuentabancogeneralReturnGeneral=tipocuentabancogeneralLogic.procesarAccionTipoCuentaBancoGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals(),this.tipocuentabancogeneralParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoCuentaBancoGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCuentaBancoGeneral();
					
					TipoCuentaBancoGeneralBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoCuentaBancoGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoCuentaBancoGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxTiposAccionesFormularioTipoCuentaBancoGeneral.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCuentaBancoGeneral(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCuentaBancoGeneralActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCuentaBancoGeneral();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();		
			TipoCuentaBancoGeneral tipocuentabancogeneral=new TipoCuentaBancoGeneral();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCuentaBancoGeneral.getSelectedItem();
			
			
			
			
			tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocuentabancogeneralsSeleccionados.size()==1) {
				for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogeneralsSeleccionados) {
					tipocuentabancogeneral=tipocuentabancogeneralAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCuentaBancoGeneral();
			
      		//this.finishProcessTipoCuentaBancoGeneral(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCuentaBancoGeneralReturnGeneral() throws Exception {
		if(this.tipocuentabancogeneralReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocuentabancogeneralReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocuentabancogeneralReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocuentabancogeneralReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocuentabancogeneralReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocuentabancogeneralReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
		}
		
		if(this.tipocuentabancogeneralReturnGeneral.getConRetornoLista() || this.tipocuentabancogeneralReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocuentabancogeneralReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocuentabancogeneralLogic.setTipoCuentaBancoGenerals(this.tipocuentabancogeneralReturnGeneral.getTipoCuentaBancoGenerals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocuentabancogeneralReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocuentabancogeneralLogic.setTipoCuentaBancoGeneral(this.tipocuentabancogeneralReturnGeneral.getTipoCuentaBancoGeneral());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCuentaBancoGeneral(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCuentaBancoGeneral() throws Exception {
		
		
	}
	
	public ArrayList<TipoCuentaBancoGeneral> getTipoCuentaBancoGeneralsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCuentaBancoGeneral) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals()) {
					if(tipocuentabancogeneralAux.getIsSelected()) {
						tipocuentabancogeneralsSeleccionados.add(tipocuentabancogeneralAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:this.tipocuentabancogenerals) {
					if(tipocuentabancogeneralAux.getIsSelected()) {
						tipocuentabancogeneralsSeleccionados.add(tipocuentabancogeneralAux);				
					}
				}
			}
			
			if(tipocuentabancogeneralsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocuentabancogeneralsSeleccionados.addAll(this.tipocuentabancogeneralLogic.getTipoCuentaBancoGenerals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocuentabancogeneralsSeleccionados.addAll(this.tipocuentabancogenerals);				
					}
				}
			}
		} else {
			tipocuentabancogeneralsSeleccionados.add(this.tipocuentabancogeneral);
		}
		
		return tipocuentabancogeneralsSeleccionados;
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
	
	public void generarReporteTipoCuentaBancoGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCuentaBancoGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCuentaBancoGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCuentaBancoGeneralsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCuentaBancoGeneralsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Cuenta Banco General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCuentaBancoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();		
		
		tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCuentaBancoGenerals("Todos",tipocuentabancogeneralsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCuentaBancoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();		
		
		tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCuentaBancoGenerals("Todos",tipocuentabancogeneralsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCuentaBancoGeneralsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();
		
		tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCuentaBancoGenerals("Todos",tipocuentabancogeneralsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCuentaBancoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCuentaBancoGeneral();
		
		
		tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCuentaBancoGeneral();
		
		
		//this.generarReporteTipoCuentaBancoGenerals("Todos",tipocuentabancogeneralsSeleccionados ,tipocuentabancogeneralImplementable,tipocuentabancogeneralImplementableHome);
	}
	
	public void mostrarImportacionTipoCuentaBancoGenerals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCuentaBancoGeneral();
		
		this.abrirFrameImportacionTipoCuentaBancoGeneral();		
		
			
		//this.generarReporteTipoCuentaBancoGenerals("Todos",tipocuentabancogeneralsSeleccionados ,tipocuentabancogeneralImplementable,tipocuentabancogeneralImplementableHome);
	}
	
	public void importarTipoCuentaBancoGenerals() throws Exception {		
	
	}
	
	public void exportarTipoCuentaBancoGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCuentaBancoGeneralsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCuentaBancoGeneralsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCuentaBancoGeneralsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Cuenta Banco General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCuentaBancoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();		
		
		tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancogeneral."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCuentaBancoGeneral(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogeneralsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCuentaBancoGeneral(tipocuentabancogeneralAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocuentabancogeneralAux.setsDetalleGeneralEntityReporte(tipocuentabancogeneralAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCuentaBancoGeneral(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCuentaBancoGeneralConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoGeneralConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocuentabancogeneral.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabancogeneral.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabancogeneral.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabancogeneral.getbanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabancogeneral.gettipocuentabanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabancogeneral.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCuentaBancoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();		
		
		tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancogeneral.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCuentaBancoGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCuentaBancoGeneral(row);				
				iRow++;
			}				
			
			for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogeneralsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCuentaBancoGeneral(tipocuentabancogeneralAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCuentaBancoGeneralsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();		
		
		tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancogeneral.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocuentabancogenerals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocuentabancogeneral");
			//elementRoot.appendChild(element);
		
			for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogeneralsSeleccionados) {
				element = document.createElement("tipocuentabancogeneral");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCuentaBancoGeneral(tipocuentabancogeneralAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCuentaBancoGeneral(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabancogeneral.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabancogeneral.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabancogeneral.getbanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabancogeneral.gettipocuentabanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabancogeneral.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlTipoCuentaBancoGeneral(TipoCuentaBancoGeneral tipocuentabancogeneral,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCuentaBancoGeneralConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocuentabancogeneral.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCuentaBancoGeneralConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocuentabancogeneral.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoCuentaBancoGeneralConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocuentabancogeneral.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementbanco_descripcion = document.createElement(TipoCuentaBancoGeneralConstantesFunciones.IDBANCO);
		elementbanco_descripcion.appendChild(document.createTextNode(tipocuentabancogeneral.getbanco_descripcion()));
		element.appendChild(elementbanco_descripcion);

		Element elementtipocuentabanco_descripcion = document.createElement(TipoCuentaBancoGeneralConstantesFunciones.IDTIPOCUENTABANCO);
		elementtipocuentabanco_descripcion.appendChild(document.createTextNode(tipocuentabancogeneral.gettipocuentabanco_descripcion()));
		element.appendChild(elementtipocuentabanco_descripcion);

		Element elementcodigo = document.createElement(TipoCuentaBancoGeneralConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocuentabancogeneral.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoTipoCuentaBancoGeneralsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados=new ArrayList<TipoCuentaBancoGeneral>();
		
		tipocuentabancogeneralsSeleccionados=this.getTipoCuentaBancoGeneralsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCuentaBancoGeneral(tipocuentabancogeneralsSeleccionados);
		
		this.generarReporteTipoCuentaBancoGenerals("Todos",tipocuentabancogeneralsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCuentaBancoGeneral(ArrayList<TipoCuentaBancoGeneral> tipocuentabancogeneralsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCuentaBancoGeneral tipocuentabancogeneralAux:tipocuentabancogeneralsSeleccionados) {
				tipocuentabancogeneralAux.setsDetalleGeneralEntityReporte(tipocuentabancogeneralAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocuentabancogeneralAux.setsDescripcionGeneralEntityReporte1(tipocuentabancogeneralAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDBANCO)) {
					existe=true;
					tipocuentabancogeneralAux.setsDescripcionGeneralEntityReporte1(tipocuentabancogeneralAux.getbanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCuentaBancoGeneralConstantesFunciones.LABEL_IDTIPOCUENTABANCO)) {
					existe=true;
					tipocuentabancogeneralAux.setsDescripcionGeneralEntityReporte1(tipocuentabancogeneralAux.gettipocuentabanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoCuentaBancoGeneralConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocuentabancogeneralAux.setsDescripcionGeneralEntityReporte1(tipocuentabancogeneralAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCuentaBancoGeneral(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGeneral=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCuentaBancoGeneralJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=true;
		} else {
			this.actualizarEstadoPanelsTipoCuentaBancoGeneral(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCuentaBancoGeneral=false;
			//this.isVisibilidadCeldaVerFormTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaDuplicarTipoCuentaBancoGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
			if(!tipocuentabancogeneralSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=false;												
			}
			
			this.jButtonCerrarTipoCuentaBancoGeneral.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGeneral=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocuentabancogeneral)) {
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGeneral=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGeneral=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCuentaBancoGeneral() {
	}
	
	public void actualizarEstadoPanelsTipoCuentaBancoGeneral(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGeneral!=null) {
				this.jPanelPaginacionTipoCuentaBancoGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGeneral!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGeneral.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGeneral!=null) {
				this.jPanelPaginacionTipoCuentaBancoGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGeneral!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGeneral.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGeneral!=null) {
				this.jPanelPaginacionTipoCuentaBancoGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGeneral!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGeneral.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGeneral!=null) {
				this.jPanelPaginacionTipoCuentaBancoGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGeneral!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGeneral.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGeneral!=null) {
				this.jPanelPaginacionTipoCuentaBancoGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGeneral!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGeneral.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGeneral!=null) {
				this.jPanelPaginacionTipoCuentaBancoGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGeneral!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGeneral.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGeneral!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGeneral!=null) {
				this.jPanelPaginacionTipoCuentaBancoGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGeneral!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGeneral.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral!=null) {
					this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGeneral!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGeneral.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocuentabancogeneralSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral!=null) {
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGeneral!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGeneral.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBanco=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.remove(jPanelFK_IdBancoTipoCuentaBancoGeneral);}

			this.isVisibilidadFK_IdTipoCuentaBanco=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaBanco) {this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.remove(jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaBanco(Boolean isParaBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBancoNegation=!isParaBanco;

			this.isVisibilidadFK_IdBanco=isParaBanco;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.remove(jPanelFK_IdBancoTipoCuentaBancoGeneral);}

			this.isVisibilidadFK_IdTipoCuentaBanco=isParaBancoNegation;
			if(!this.isVisibilidadFK_IdTipoCuentaBanco) {this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.remove(jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCuentaBanco(Boolean isParaTipoCuentaBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCuentaBancoNegation=!isParaTipoCuentaBanco;

			this.isVisibilidadFK_IdBanco=isParaTipoCuentaBancoNegation;
			if(!this.isVisibilidadFK_IdBanco) {this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.remove(jPanelFK_IdBancoTipoCuentaBancoGeneral);}

			this.isVisibilidadFK_IdTipoCuentaBanco=isParaTipoCuentaBanco;
			if(!this.isVisibilidadFK_IdTipoCuentaBanco) {this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.remove(jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCuentaBancoGeneralSessionBean tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
		
		if(this.tipocuentabancogeneralSessionBean==null) {
			this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
		}
		
		this.tipocuentabancogeneralSessionBean.setsUltimaBusquedaTipoCuentaBancoGeneral(this.getsAccionBusqueda());
		this.tipocuentabancogeneralSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocuentabancogeneralSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBanco")) {
			tipocuentabancogeneralSessionBean.setid_banco(this.getid_bancoFK_IdBanco());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocuentabancogeneralSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoCuentaBanco")) {
			tipocuentabancogeneralSessionBean.setid_tipo_cuenta_banco(this.getid_tipo_cuenta_bancoFK_IdTipoCuentaBanco());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCuentaBancoGeneralSessionBean tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
		
		if(this.tipocuentabancogeneralSessionBean==null) {
			this.tipocuentabancogeneralSessionBean=new TipoCuentaBancoGeneralSessionBean();
		}
		
		if(this.tipocuentabancogeneralSessionBean.getsUltimaBusquedaTipoCuentaBancoGeneral()!=null&&!this.tipocuentabancogeneralSessionBean.getsUltimaBusquedaTipoCuentaBancoGeneral().equals("")) {
			this.setsAccionBusqueda(tipocuentabancogeneralSessionBean.getsUltimaBusquedaTipoCuentaBancoGeneral());
			this.setiNumeroPaginacion(tipocuentabancogeneralSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocuentabancogeneralSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBanco")) {
				this.setid_bancoFK_IdBanco(tipocuentabancogeneralSessionBean.getid_banco());
				tipocuentabancogeneralSessionBean.setid_banco(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocuentabancogeneralSessionBean.getid_empresa());
				tipocuentabancogeneralSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoCuentaBanco")) {
				this.setid_tipo_cuenta_bancoFK_IdTipoCuentaBanco(tipocuentabancogeneralSessionBean.getid_tipo_cuenta_banco());
				tipocuentabancogeneralSessionBean.setid_tipo_cuenta_banco(-1L);
			}
		}
		
		this.tipocuentabancogeneralSessionBean.setsUltimaBusquedaTipoCuentaBancoGeneral("");
		this.tipocuentabancogeneralSessionBean.setiNumeroPaginacion(TipoCuentaBancoGeneralConstantesFunciones.INUMEROPAGINACION);
		this.tipocuentabancogeneralSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCuentaBancoGeneral(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCuentaBancoGeneral() {
		this.updateBorderResaltarBusquedasFormularioTipoCuentaBancoGeneral();
		this.updateVisibilidadBusquedasFormularioTipoCuentaBancoGeneral();
		this.updateHabilitarBusquedasFormularioTipoCuentaBancoGeneral();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCuentaBancoGeneral() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getComponents().length>0) {
	

		if(this.tipocuentabancogeneralConstantesFunciones.resaltarFK_IdBancoTipoCuentaBancoGeneral!=null) {
			index= this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.indexOfComponent(this.jPanelFK_IdBancoTipoCuentaBancoGeneral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getComponent(index);
				jPanel.setBorder(this.tipocuentabancogeneralConstantesFunciones.resaltarFK_IdBancoTipoCuentaBancoGeneral);
			}
		}

		if(this.tipocuentabancogeneralConstantesFunciones.resaltarFK_IdTipoCuentaBancoTipoCuentaBancoGeneral!=null) {
			index= this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getComponent(index);
				jPanel.setBorder(this.tipocuentabancogeneralConstantesFunciones.resaltarFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCuentaBancoGeneral() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.indexOfComponent(this.jPanelFK_IdBancoTipoCuentaBancoGeneral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostrarFK_IdBancoTipoCuentaBancoGeneral);
			if(!this.tipocuentabancogeneralConstantesFunciones.mostrarFK_IdBancoTipoCuentaBancoGeneral && index>-1) {
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostrarFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);
			if(!this.tipocuentabancogeneralConstantesFunciones.mostrarFK_IdTipoCuentaBancoTipoCuentaBancoGeneral && index>-1) {
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoCuentaBancoGeneral() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.indexOfComponent(this.jPanelFK_IdBancoTipoCuentaBancoGeneral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocuentabancogeneralConstantesFunciones.activarFK_IdBancoTipoCuentaBancoGeneral);
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setEnabledAt(index,this.tipocuentabancogeneralConstantesFunciones.activarFK_IdBancoTipoCuentaBancoGeneral);
			}

			index= this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipocuentabancogeneralConstantesFunciones.activarFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);
				this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setEnabledAt(index,this.tipocuentabancogeneralConstantesFunciones.activarFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoCuentaBancoGeneral(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBanco")) {
			index= this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.indexOfComponent(this.jPanelFK_IdBancoTipoCuentaBancoGeneral);

			this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getComponent(index);

			this.tipocuentabancogeneralConstantesFunciones.setResaltarFK_IdBancoTipoCuentaBancoGeneral(resaltar);

			jPanel.setBorder(this.tipocuentabancogeneralConstantesFunciones.resaltarFK_IdBancoTipoCuentaBancoGeneral);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoCuentaBanco")) {
			index= this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.indexOfComponent(this.jPanelFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);

			this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoCuentaBancoGeneral.getComponent(index);

			this.tipocuentabancogeneralConstantesFunciones.setResaltarFK_IdTipoCuentaBancoTipoCuentaBancoGeneral(resaltar);

			jPanel.setBorder(this.tipocuentabancogeneralConstantesFunciones.resaltarFK_IdTipoCuentaBancoTipoCuentaBancoGeneral);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoCuentaBancoGeneral.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoCuentaBancoGeneral() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCuentaBancoGeneral();
		this.updateVisibilidadResaltarControlesFormularioTipoCuentaBancoGeneral();
		this.updateHabilitarResaltarControlesFormularioTipoCuentaBancoGeneral();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCuentaBancoGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocuentabancogeneralConstantesFunciones.resaltaridTipoCuentaBancoGeneral!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelidTipoCuentaBancoGeneral.setBorder(this.tipocuentabancogeneralConstantesFunciones.resaltaridTipoCuentaBancoGeneral);}
		if(this.tipocuentabancogeneralConstantesFunciones.resaltarid_empresaTipoCuentaBancoGeneral!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.setBorder(this.tipocuentabancogeneralConstantesFunciones.resaltarid_empresaTipoCuentaBancoGeneral);}
		if(this.tipocuentabancogeneralConstantesFunciones.resaltarid_bancoTipoCuentaBancoGeneral!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.setBorder(this.tipocuentabancogeneralConstantesFunciones.resaltarid_bancoTipoCuentaBancoGeneral);}
		if(this.tipocuentabancogeneralConstantesFunciones.resaltarid_tipo_cuenta_bancoTipoCuentaBancoGeneral!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setBorder(this.tipocuentabancogeneralConstantesFunciones.resaltarid_tipo_cuenta_bancoTipoCuentaBancoGeneral);}
		if(this.tipocuentabancogeneralConstantesFunciones.resaltarcodigoTipoCuentaBancoGeneral!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTextFieldcodigoTipoCuentaBancoGeneral.setBorder(this.tipocuentabancogeneralConstantesFunciones.resaltarcodigoTipoCuentaBancoGeneral);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCuentaBancoGeneral() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
	
		//this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelidTipoCuentaBancoGeneral.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostraridTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jPanelidTipoCuentaBancoGeneral.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostraridTipoCuentaBancoGeneral);
		//this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostrarid_empresaTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jPanelid_empresaTipoCuentaBancoGeneral.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostrarid_empresaTipoCuentaBancoGeneral);
		//this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostrarid_bancoTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jPanelid_bancoTipoCuentaBancoGeneral.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostrarid_bancoTipoCuentaBancoGeneral);
		//this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostrarid_tipo_cuenta_bancoTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jPanelid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostrarid_tipo_cuenta_bancoTipoCuentaBancoGeneral);
		//this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTextFieldcodigoTipoCuentaBancoGeneral.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostrarcodigoTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jPanelcodigoTipoCuentaBancoGeneral.setVisible(this.tipocuentabancogeneralConstantesFunciones.mostrarcodigoTipoCuentaBancoGeneral);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCuentaBancoGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGeneral!=null) {
	
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jLabelidTipoCuentaBancoGeneral.setEnabled(this.tipocuentabancogeneralConstantesFunciones.activaridTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_empresaTipoCuentaBancoGeneral.setEnabled(this.tipocuentabancogeneralConstantesFunciones.activarid_empresaTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_bancoTipoCuentaBancoGeneral.setEnabled(this.tipocuentabancogeneralConstantesFunciones.activarid_bancoTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jComboBoxid_tipo_cuenta_bancoTipoCuentaBancoGeneral.setEnabled(this.tipocuentabancogeneralConstantesFunciones.activarid_tipo_cuenta_bancoTipoCuentaBancoGeneral);
		this.jInternalFrameDetalleFormTipoCuentaBancoGeneral.jTextFieldcodigoTipoCuentaBancoGeneral.setEnabled(this.tipocuentabancogeneralConstantesFunciones.activarcodigoTipoCuentaBancoGeneral);
		}
	}
	
		
}